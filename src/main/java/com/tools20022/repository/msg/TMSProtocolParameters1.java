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
import com.tools20022.repository.codeset.DataSetCategory5Code;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmTerminalManagerIdentification
 * TMSProtocolParameters1.mmTerminalManagerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmMaintenanceService
 * TMSProtocolParameters1.mmMaintenanceService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmVersion
 * TMSProtocolParameters1.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmApplicationIdentification
 * TMSProtocolParameters1.mmApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmHostAddress
 * TMSProtocolParameters1.mmHostAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmHostKey
 * TMSProtocolParameters1.mmHostKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmPOIIdentification
 * TMSProtocolParameters1.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmInitiatingPartyIdentification
 * TMSProtocolParameters1.mmInitiatingPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmRecipientPartyIdentification
 * TMSProtocolParameters1.mmRecipientPartyIdentification}</li>
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
 * "TMSProtocolParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Configuration parameters of the TMS protocol between a POI and a terminal manager."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TMSProtocolParameters2
 * TMSProtocolParameters2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TMSProtocolParameters1", propOrder = {"terminalManagerIdentification", "maintenanceService", "version", "applicationIdentification", "hostAddress", "hostKey", "pOIIdentification", "initiatingPartyIdentification",
		"recipientPartyIdentification"})
public class TMSProtocolParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1
	 * TMSProtocolParameters1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmTerminalManagerIdentification
	 * TMSProtocolParameters2.mmTerminalManagerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminalManagerIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "TermnlMgrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalManagerIdentification";
			definition = "Identification of the master terminal manager or the terminal manager.";
			nextVersions_lazy = () -> Arrays.asList(TMSProtocolParameters2.mmTerminalManagerIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification71.mmObject();
		}
	};
	@XmlElement(name = "MntncSvc", required = true)
	protected List<DataSetCategory5Code> maintenanceService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1
	 * TMSProtocolParameters1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmMaintenanceService
	 * TMSProtocolParameters2.mmMaintenanceService}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaintenanceService = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "MntncSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintenanceService";
			definition = "Maintenance services provided by the terminal manager.";
			nextVersions_lazy = () -> Arrays.asList(TMSProtocolParameters2.mmMaintenanceService);
			minOccurs = 1;
			simpleType_lazy = () -> DataSetCategory5Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1
	 * TMSProtocolParameters1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmVersion
	 * TMSProtocolParameters2.mmVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the TMS protocol parameters.";
			nextVersions_lazy = () -> Arrays.asList(TMSProtocolParameters2.mmVersion);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1
	 * TMSProtocolParameters1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmApplicationIdentification
	 * TMSProtocolParameters2.mmApplicationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApplicationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "ApplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of applications which may be managed by the TM, partially or globally.";
			nextVersions_lazy = () -> Arrays.asList(TMSProtocolParameters2.mmApplicationIdentification);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "HstAdr")
	protected NetworkParameters3 hostAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetworkParameters3
	 * NetworkParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1
	 * TMSProtocolParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Addresses of the terminal manager host."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHostAddress = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "HstAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostAddress";
			definition = "Addresses of the terminal manager host.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetworkParameters3.mmObject();
		}
	};
	@XmlElement(name = "HstKey")
	protected List<com.tools20022.repository.msg.KEKIdentifier2> hostKey;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEKIdentifier2
	 * KEKIdentifier2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1
	 * TMSProtocolParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cryptographic key used to communicate with the terminal manager host."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHostKey = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "HstKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostKey";
			definition = "Cryptographic key used to communicate with the terminal manager host.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.KEKIdentifier2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1
	 * TMSProtocolParameters1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmPOIIdentification
	 * TMSProtocolParameters2.mmPOIIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOIIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "New identification of the POI for the terminal manager.";
			nextVersions_lazy = () -> Arrays.asList(TMSProtocolParameters2.mmPOIIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1
	 * TMSProtocolParameters1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmInitiatingPartyIdentification
	 * TMSProtocolParameters2.mmInitiatingPartyIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitiatingPartyIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "InitgPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingPartyIdentification";
			definition = "New identification of the initiating party to set in TMS messages with this terminal manager.";
			nextVersions_lazy = () -> Arrays.asList(TMSProtocolParameters2.mmInitiatingPartyIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1
	 * TMSProtocolParameters1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmRecipientPartyIdentification
	 * TMSProtocolParameters2.mmRecipientPartyIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecipientPartyIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "RcptPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientPartyIdentification";
			definition = "New identification of the recipient party to set in TMS messages with this terminal manager.";
			nextVersions_lazy = () -> Arrays.asList(TMSProtocolParameters2.mmRecipientPartyIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSProtocolParameters1.mmTerminalManagerIdentification, com.tools20022.repository.msg.TMSProtocolParameters1.mmMaintenanceService,
						com.tools20022.repository.msg.TMSProtocolParameters1.mmVersion, com.tools20022.repository.msg.TMSProtocolParameters1.mmApplicationIdentification, com.tools20022.repository.msg.TMSProtocolParameters1.mmHostAddress,
						com.tools20022.repository.msg.TMSProtocolParameters1.mmHostKey, com.tools20022.repository.msg.TMSProtocolParameters1.mmPOIIdentification,
						com.tools20022.repository.msg.TMSProtocolParameters1.mmInitiatingPartyIdentification, com.tools20022.repository.msg.TMSProtocolParameters1.mmRecipientPartyIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TMSProtocolParameters1";
				definition = "Configuration parameters of the TMS protocol between a POI and a terminal manager.";
				nextVersions_lazy = () -> Arrays.asList(TMSProtocolParameters2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification71 getTerminalManagerIdentification() {
		return terminalManagerIdentification;
	}

	public TMSProtocolParameters1 setTerminalManagerIdentification(com.tools20022.repository.msg.GenericIdentification71 terminalManagerIdentification) {
		this.terminalManagerIdentification = Objects.requireNonNull(terminalManagerIdentification);
		return this;
	}

	public List<DataSetCategory5Code> getMaintenanceService() {
		return maintenanceService == null ? maintenanceService = new ArrayList<>() : maintenanceService;
	}

	public TMSProtocolParameters1 setMaintenanceService(List<DataSetCategory5Code> maintenanceService) {
		this.maintenanceService = Objects.requireNonNull(maintenanceService);
		return this;
	}

	public Max256Text getVersion() {
		return version;
	}

	public TMSProtocolParameters1 setVersion(Max256Text version) {
		this.version = Objects.requireNonNull(version);
		return this;
	}

	public List<Max35Text> getApplicationIdentification() {
		return applicationIdentification == null ? applicationIdentification = new ArrayList<>() : applicationIdentification;
	}

	public TMSProtocolParameters1 setApplicationIdentification(List<Max35Text> applicationIdentification) {
		this.applicationIdentification = Objects.requireNonNull(applicationIdentification);
		return this;
	}

	public Optional<NetworkParameters3> getHostAddress() {
		return hostAddress == null ? Optional.empty() : Optional.of(hostAddress);
	}

	public TMSProtocolParameters1 setHostAddress(com.tools20022.repository.msg.NetworkParameters3 hostAddress) {
		this.hostAddress = hostAddress;
		return this;
	}

	public List<KEKIdentifier2> getHostKey() {
		return hostKey == null ? hostKey = new ArrayList<>() : hostKey;
	}

	public TMSProtocolParameters1 setHostKey(List<com.tools20022.repository.msg.KEKIdentifier2> hostKey) {
		this.hostKey = Objects.requireNonNull(hostKey);
		return this;
	}

	public Optional<Max35Text> getPOIIdentification() {
		return pOIIdentification == null ? Optional.empty() : Optional.of(pOIIdentification);
	}

	public TMSProtocolParameters1 setPOIIdentification(Max35Text pOIIdentification) {
		this.pOIIdentification = pOIIdentification;
		return this;
	}

	public Optional<Max35Text> getInitiatingPartyIdentification() {
		return initiatingPartyIdentification == null ? Optional.empty() : Optional.of(initiatingPartyIdentification);
	}

	public TMSProtocolParameters1 setInitiatingPartyIdentification(Max35Text initiatingPartyIdentification) {
		this.initiatingPartyIdentification = initiatingPartyIdentification;
		return this;
	}

	public Optional<Max35Text> getRecipientPartyIdentification() {
		return recipientPartyIdentification == null ? Optional.empty() : Optional.of(recipientPartyIdentification);
	}

	public TMSProtocolParameters1 setRecipientPartyIdentification(Max35Text recipientPartyIdentification) {
		this.recipientPartyIdentification = recipientPartyIdentification;
		return this;
	}
}