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
import com.tools20022.repository.codeset.DataSetCategory9Code;
import com.tools20022.repository.codeset.TerminalManagementAction2Code;
import com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code;
import com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.TerminalManagementAction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Single terminal management action to be performed by the point of
 * interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#mmType
 * TMSAction6.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#mmRemoteAccess
 * TMSAction6.mmRemoteAccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction6#mmTerminalManagerIdentification
 * TMSAction6.mmTerminalManagerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#mmTMSProtocol
 * TMSAction6.mmTMSProtocol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction6#mmTMSProtocolVersion
 * TMSAction6.mmTMSProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction6#mmDataSetIdentification
 * TMSAction6.mmDataSetIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#mmComponentType
 * TMSAction6.mmComponentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction6#mmDelegationScopeIdentification
 * TMSAction6.mmDelegationScopeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction6#mmDelegationScopeDefinition
 * TMSAction6.mmDelegationScopeDefinition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#mmDelegationProof
 * TMSAction6.mmDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction6#mmProtectedDelegationProof
 * TMSAction6.mmProtectedDelegationProof}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#mmTrigger
 * TMSAction6.mmTrigger}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#mmAdditionalProcess
 * TMSAction6.mmAdditionalProcess}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#mmReTry
 * TMSAction6.mmReTry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#mmTimeCondition
 * TMSAction6.mmTimeCondition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#mmTMChallenge
 * TMSAction6.mmTMChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction6#mmKeyEnciphermentCertificate
 * TMSAction6.mmKeyEnciphermentCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction6#mmErrorAction
 * TMSAction6.mmErrorAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction6#mmAdditionalInformation
 * TMSAction6.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
 * TerminalManagementAction}</li>
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
 * "TMSAction6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Single terminal management action to be performed by the point of interaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction7 TMSAction7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TMSAction5
 * TMSAction5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TMSAction6", propOrder = {"type", "remoteAccess", "terminalManagerIdentification", "tMSProtocol", "tMSProtocolVersion", "dataSetIdentification", "componentType", "delegationScopeIdentification",
		"delegationScopeDefinition", "delegationProof", "protectedDelegationProof", "trigger", "additionalProcess", "reTry", "timeCondition", "tMChallenge", "keyEnciphermentCertificate", "errorAction", "additionalInformation"})
public class TMSAction6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected TerminalManagementAction2Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code
	 * TerminalManagementAction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmType
	 * TerminalManagementAction.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Types of action to be performed by a point of interaction (POI)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction7#mmType
	 * TMSAction7.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmType
	 * TMSAction5.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction6, TerminalManagementAction2Code> mmType = new MMMessageAttribute<TMSAction6, TerminalManagementAction2Code>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Types of action to be performed by a point of interaction (POI).";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmType);
			previousVersion_lazy = () -> TMSAction5.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction2Code.mmObject();
		}

		@Override
		public TerminalManagementAction2Code getValue(TMSAction6 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(TMSAction6 obj, TerminalManagementAction2Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "RmotAccs")
	protected NetworkParameters5 remoteAccess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetworkParameters5
	 * NetworkParameters5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmotAccs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemoteAccess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Host access information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction7#mmRemoteAccess
	 * TMSAction7.mmRemoteAccess}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmRemoteAccess
	 * TMSAction5.mmRemoteAccess}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSAction6, Optional<NetworkParameters5>> mmRemoteAccess = new MMMessageAssociationEnd<TMSAction6, Optional<NetworkParameters5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "RmotAccs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemoteAccess";
			definition = "Host access information.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmRemoteAccess);
			previousVersion_lazy = () -> TMSAction5.mmRemoteAccess;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetworkParameters5.mmObject();
		}

		@Override
		public Optional<NetworkParameters5> getValue(TMSAction6 obj) {
			return obj.getRemoteAccess();
		}

		@Override
		public void setValue(TMSAction6 obj, Optional<NetworkParameters5> value) {
			obj.setRemoteAccess(value.orElse(null));
		}
	};
	@XmlElement(name = "TermnlMgrId")
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
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
	 * "Identification of the master terminal manager or the terminal manager with which the POI has to perform the action."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction7#mmTerminalManagerIdentification
	 * TMSAction7.mmTerminalManagerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmTerminalManagerIdentification
	 * TMSAction5.mmTerminalManagerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSAction6, Optional<GenericIdentification71>> mmTerminalManagerIdentification = new MMMessageAssociationEnd<TMSAction6, Optional<GenericIdentification71>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "TermnlMgrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalManagerIdentification";
			definition = "Identification of the master terminal manager or the terminal manager with which the POI has to perform the action.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmTerminalManagerIdentification);
			previousVersion_lazy = () -> TMSAction5.mmTerminalManagerIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification71.mmObject();
		}

		@Override
		public Optional<GenericIdentification71> getValue(TMSAction6 obj) {
			return obj.getTerminalManagerIdentification();
		}

		@Override
		public void setValue(TMSAction6 obj, Optional<GenericIdentification71> value) {
			obj.setTerminalManagerIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TMSPrtcol")
	protected Max35Text tMSProtocol;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMSPrtcol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TMS protocol to use for performing the maintenance action."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction7#mmTMSProtocol
	 * TMSAction7.mmTMSProtocol}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmTMSProtocol
	 * TMSAction5.mmTMSProtocol}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction6, Optional<Max35Text>> mmTMSProtocol = new MMMessageAttribute<TMSAction6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "TMSPrtcol";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocol";
			definition = "TMS protocol to use for performing the maintenance action.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmTMSProtocol);
			previousVersion_lazy = () -> TMSAction5.mmTMSProtocol;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TMSAction6 obj) {
			return obj.getTMSProtocol();
		}

		@Override
		public void setValue(TMSAction6 obj, Optional<Max35Text> value) {
			obj.setTMSProtocol(value.orElse(null));
		}
	};
	@XmlElement(name = "TMSPrtcolVrsn")
	protected Max35Text tMSProtocolVersion;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMSPrtcolVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocolVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Version of the TMS protocol to use to perform the maintenance action."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction7#mmTMSProtocolVersion
	 * TMSAction7.mmTMSProtocolVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmTMSProtocolVersion
	 * TMSAction5.mmTMSProtocolVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction6, Optional<Max35Text>> mmTMSProtocolVersion = new MMMessageAttribute<TMSAction6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "TMSPrtcolVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolVersion";
			definition = "Version of the TMS protocol to use to perform the maintenance action.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmTMSProtocolVersion);
			previousVersion_lazy = () -> TMSAction5.mmTMSProtocolVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TMSAction6 obj) {
			return obj.getTMSProtocolVersion();
		}

		@Override
		public void setValue(TMSAction6 obj, Optional<Max35Text> value) {
			obj.setTMSProtocolVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "DataSetId")
	protected DataSetIdentification6 dataSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification6
	 * DataSetIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set on which the action has to be performed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction7#mmDataSetIdentification
	 * TMSAction7.mmDataSetIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmDataSetIdentification
	 * TMSAction5.mmDataSetIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSAction6, Optional<DataSetIdentification6>> mmDataSetIdentification = new MMMessageAssociationEnd<TMSAction6, Optional<DataSetIdentification6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Data set on which the action has to be performed.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmDataSetIdentification);
			previousVersion_lazy = () -> TMSAction5.mmDataSetIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DataSetIdentification6.mmObject();
		}

		@Override
		public Optional<DataSetIdentification6> getValue(TMSAction6 obj) {
			return obj.getDataSetIdentification();
		}

		@Override
		public void setValue(TMSAction6 obj, Optional<DataSetIdentification6> value) {
			obj.setDataSetIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CmpntTp")
	protected List<DataSetCategory9Code> componentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpntTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComponentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of POI components to send in a status report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction7#mmComponentType
	 * TMSAction7.mmComponentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmComponentType
	 * TMSAction5.mmComponentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction6, List<DataSetCategory9Code>> mmComponentType = new MMMessageAttribute<TMSAction6, List<DataSetCategory9Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "CmpntTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComponentType";
			definition = "Type of POI components to send in a status report.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmComponentType);
			previousVersion_lazy = () -> TMSAction5.mmComponentType;
			minOccurs = 0;
			simpleType_lazy = () -> DataSetCategory9Code.mmObject();
		}

		@Override
		public List<DataSetCategory9Code> getValue(TMSAction6 obj) {
			return obj.getComponentType();
		}

		@Override
		public void setValue(TMSAction6 obj, List<DataSetCategory9Code> value) {
			obj.setComponentType(value);
		}
	};
	@XmlElement(name = "DlgtnScpId")
	protected Max35Text delegationScopeIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnScpId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationScopeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the delegation scope assigned by the MTM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction7#mmDelegationScopeIdentification
	 * TMSAction7.mmDelegationScopeIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmDelegationScopeIdentification
	 * TMSAction5.mmDelegationScopeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction6, Optional<Max35Text>> mmDelegationScopeIdentification = new MMMessageAttribute<TMSAction6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "DlgtnScpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationScopeIdentification";
			definition = "Identification of the delegation scope assigned by the MTM.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmDelegationScopeIdentification);
			previousVersion_lazy = () -> TMSAction5.mmDelegationScopeIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TMSAction6 obj) {
			return obj.getDelegationScopeIdentification();
		}

		@Override
		public void setValue(TMSAction6 obj, Optional<Max35Text> value) {
			obj.setDelegationScopeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DlgtnScpDef")
	protected Max3000Binary delegationScopeDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3000Binary
	 * Max3000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnScpDef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationScopeDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Definition of the delegation scope, for instance inside the payment application parameters the range of application profiles, the RID (Registered application provider Identification)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction7#mmDelegationScopeDefinition
	 * TMSAction7.mmDelegationScopeDefinition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmDelegationScopeDefinition
	 * TMSAction5.mmDelegationScopeDefinition}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction6, Optional<Max3000Binary>> mmDelegationScopeDefinition = new MMMessageAttribute<TMSAction6, Optional<Max3000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "DlgtnScpDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationScopeDefinition";
			definition = "Definition of the delegation scope, for instance inside the payment application parameters the range of application profiles, the RID (Registered application provider Identification).";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmDelegationScopeDefinition);
			previousVersion_lazy = () -> TMSAction5.mmDelegationScopeDefinition;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}

		@Override
		public Optional<Max3000Binary> getValue(TMSAction6 obj) {
			return obj.getDelegationScopeDefinition();
		}

		@Override
		public void setValue(TMSAction6 obj, Optional<Max3000Binary> value) {
			obj.setDelegationScopeDefinition(value.orElse(null));
		}
	};
	@XmlElement(name = "DlgtnProof")
	protected Max5000Binary delegationProof;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proof of delegation to be verified by the POI, when performing the delegated actions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction7#mmDelegationProof
	 * TMSAction7.mmDelegationProof}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmDelegationProof
	 * TMSAction5.mmDelegationProof}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction6, Optional<Max5000Binary>> mmDelegationProof = new MMMessageAttribute<TMSAction6, Optional<Max5000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "DlgtnProof";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationProof";
			definition = "Proof of delegation to be verified by the POI, when performing the delegated actions.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmDelegationProof);
			previousVersion_lazy = () -> TMSAction5.mmDelegationProof;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}

		@Override
		public Optional<Max5000Binary> getValue(TMSAction6 obj) {
			return obj.getDelegationProof();
		}

		@Override
		public void setValue(TMSAction6 obj, Optional<Max5000Binary> value) {
			obj.setDelegationProof(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctdDlgtnProof")
	protected ContentInformationType12 protectedDelegationProof;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdDlgtnProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedDelegationProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protected proof of delegation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction7#mmProtectedDelegationProof
	 * TMSAction7.mmProtectedDelegationProof}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmProtectedDelegationProof
	 * TMSAction5.mmProtectedDelegationProof}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSAction6, Optional<ContentInformationType12>> mmProtectedDelegationProof = new MMMessageAssociationEnd<TMSAction6, Optional<ContentInformationType12>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "PrtctdDlgtnProof";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedDelegationProof";
			definition = "Protected proof of delegation.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmProtectedDelegationProof);
			previousVersion_lazy = () -> TMSAction5.mmProtectedDelegationProof;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType12.mmObject();
		}

		@Override
		public Optional<ContentInformationType12> getValue(TMSAction6 obj) {
			return obj.getProtectedDelegationProof();
		}

		@Override
		public void setValue(TMSAction6 obj, Optional<ContentInformationType12> value) {
			obj.setProtectedDelegationProof(value.orElse(null));
		}
	};
	@XmlElement(name = "Trggr", required = true)
	protected TerminalManagementActionTrigger1Code trigger;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code
	 * TerminalManagementActionTrigger1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmTrigger
	 * TerminalManagementAction.mmTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trggr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event on which the action has to be activated by the point of interaction (POI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction7#mmTrigger
	 * TMSAction7.mmTrigger}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmTrigger
	 * TMSAction5.mmTrigger}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction6, TerminalManagementActionTrigger1Code> mmTrigger = new MMMessageAttribute<TMSAction6, TerminalManagementActionTrigger1Code>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmTrigger;
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "Trggr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trigger";
			definition = "Event on which the action has to be activated by the point of interaction (POI).";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmTrigger);
			previousVersion_lazy = () -> TMSAction5.mmTrigger;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionTrigger1Code.mmObject();
		}

		@Override
		public TerminalManagementActionTrigger1Code getValue(TMSAction6 obj) {
			return obj.getTrigger();
		}

		@Override
		public void setValue(TMSAction6 obj, TerminalManagementActionTrigger1Code value) {
			obj.setTrigger(value);
		}
	};
	@XmlElement(name = "AddtlPrc")
	protected List<TerminalManagementAdditionalProcess1Code> additionalProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code
	 * TerminalManagementAdditionalProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmAdditionalProcess
	 * TerminalManagementAction.mmAdditionalProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional process to perform before starting or after completing the action by the point of interaction (POI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction7#mmAdditionalProcess
	 * TMSAction7.mmAdditionalProcess}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmAdditionalProcess
	 * TMSAction5.mmAdditionalProcess}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction6, List<TerminalManagementAdditionalProcess1Code>> mmAdditionalProcess = new MMMessageAttribute<TMSAction6, List<TerminalManagementAdditionalProcess1Code>>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmAdditionalProcess;
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "AddtlPrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalProcess";
			definition = "Additional process to perform before starting or after completing the action by the point of interaction (POI).";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmAdditionalProcess);
			previousVersion_lazy = () -> TMSAction5.mmAdditionalProcess;
			minOccurs = 0;
			simpleType_lazy = () -> TerminalManagementAdditionalProcess1Code.mmObject();
		}

		@Override
		public List<TerminalManagementAdditionalProcess1Code> getValue(TMSAction6 obj) {
			return obj.getAdditionalProcess();
		}

		@Override
		public void setValue(TMSAction6 obj, List<TerminalManagementAdditionalProcess1Code> value) {
			obj.setAdditionalProcess(value);
		}
	};
	@XmlElement(name = "ReTry")
	protected ProcessRetry2 reTry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessRetry2
	 * ProcessRetry2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReTry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReTry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Definition of retry process if activation of the action fails."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction7#mmReTry
	 * TMSAction7.mmReTry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmReTry
	 * TMSAction5.mmReTry}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSAction6, Optional<ProcessRetry2>> mmReTry = new MMMessageAssociationEnd<TMSAction6, Optional<ProcessRetry2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "ReTry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTry";
			definition = "Definition of retry process if activation of the action fails.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmReTry);
			previousVersion_lazy = () -> TMSAction5.mmReTry;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessRetry2.mmObject();
		}

		@Override
		public Optional<ProcessRetry2> getValue(TMSAction6 obj) {
			return obj.getReTry();
		}

		@Override
		public void setValue(TMSAction6 obj, Optional<ProcessRetry2> value) {
			obj.setReTry(value.orElse(null));
		}
	};
	@XmlElement(name = "TmCond")
	protected ProcessTiming3 timeCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessTiming3
	 * ProcessTiming3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time the action has to be performed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction7#mmTimeCondition
	 * TMSAction7.mmTimeCondition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmTimeCondition
	 * TMSAction5.mmTimeCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSAction6, Optional<ProcessTiming3>> mmTimeCondition = new MMMessageAssociationEnd<TMSAction6, Optional<ProcessTiming3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "TmCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeCondition";
			definition = "Date and time the action has to be performed.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmTimeCondition);
			previousVersion_lazy = () -> TMSAction5.mmTimeCondition;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessTiming3.mmObject();
		}

		@Override
		public Optional<ProcessTiming3> getValue(TMSAction6 obj) {
			return obj.getTimeCondition();
		}

		@Override
		public void setValue(TMSAction6 obj, Optional<ProcessTiming3> value) {
			obj.setTimeCondition(value.orElse(null));
		}
	};
	@XmlElement(name = "TMChllng")
	protected Max140Binary tMChallenge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMChllng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal manager challenge for cryptographic key injection."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction7#mmTMChallenge
	 * TMSAction7.mmTMChallenge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmTMChallenge
	 * TMSAction5.mmTMChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction6, Optional<Max140Binary>> mmTMChallenge = new MMMessageAttribute<TMSAction6, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "TMChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMChallenge";
			definition = "Terminal manager challenge for cryptographic key injection.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmTMChallenge);
			previousVersion_lazy = () -> TMSAction5.mmTMChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(TMSAction6 obj) {
			return obj.getTMChallenge();
		}

		@Override
		public void setValue(TMSAction6 obj, Optional<Max140Binary> value) {
			obj.setTMChallenge(value.orElse(null));
		}
	};
	@XmlElement(name = "KeyNcphrmntCert")
	protected List<Max10KBinary> keyEnciphermentCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10KBinary Max10KBinary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyNcphrmntCert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyEnciphermentCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate chain for the encryption of temporary transport key of the key to inject."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction7#mmKeyEnciphermentCertificate
	 * TMSAction7.mmKeyEnciphermentCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmKeyEnciphermentCertificate
	 * TMSAction5.mmKeyEnciphermentCertificate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction6, List<Max10KBinary>> mmKeyEnciphermentCertificate = new MMMessageAttribute<TMSAction6, List<Max10KBinary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "KeyNcphrmntCert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyEnciphermentCertificate";
			definition = "Certificate chain for the encryption of temporary transport key of the key to inject.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmKeyEnciphermentCertificate);
			previousVersion_lazy = () -> TMSAction5.mmKeyEnciphermentCertificate;
			minOccurs = 0;
			simpleType_lazy = () -> Max10KBinary.mmObject();
		}

		@Override
		public List<Max10KBinary> getValue(TMSAction6 obj) {
			return obj.getKeyEnciphermentCertificate();
		}

		@Override
		public void setValue(TMSAction6 obj, List<Max10KBinary> value) {
			obj.setKeyEnciphermentCertificate(value);
		}
	};
	@XmlElement(name = "ErrActn")
	protected List<ErrorAction3> errorAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorAction3
	 * ErrorAction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ErrActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Action to perform in case of error on the related action in progress."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction7#mmErrorAction
	 * TMSAction7.mmErrorAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmErrorAction
	 * TMSAction5.mmErrorAction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSAction6, List<ErrorAction3>> mmErrorAction = new MMMessageAssociationEnd<TMSAction6, List<ErrorAction3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "ErrActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorAction";
			definition = "Action to perform in case of error on the related action in progress.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmErrorAction);
			previousVersion_lazy = () -> TMSAction5.mmErrorAction;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ErrorAction3.mmObject();
		}

		@Override
		public List<ErrorAction3> getValue(TMSAction6 obj) {
			return obj.getErrorAction();
		}

		@Override
		public void setValue(TMSAction6 obj, List<ErrorAction3> value) {
			obj.setErrorAction(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max3000Binary> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3000Binary
	 * Max3000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction6
	 * TMSAction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the maintenance action."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction7#mmAdditionalInformation
	 * TMSAction7.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmAdditionalInformation
	 * TMSAction5.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction6, List<Max3000Binary>> mmAdditionalInformation = new MMMessageAttribute<TMSAction6, List<Max3000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information about the maintenance action.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmAdditionalInformation);
			previousVersion_lazy = () -> TMSAction5.mmAdditionalInformation;
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}

		@Override
		public List<Max3000Binary> getValue(TMSAction6 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(TMSAction6 obj, List<Max3000Binary> value) {
			obj.setAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction6.mmType, com.tools20022.repository.msg.TMSAction6.mmRemoteAccess, com.tools20022.repository.msg.TMSAction6.mmTerminalManagerIdentification,
						com.tools20022.repository.msg.TMSAction6.mmTMSProtocol, com.tools20022.repository.msg.TMSAction6.mmTMSProtocolVersion, com.tools20022.repository.msg.TMSAction6.mmDataSetIdentification,
						com.tools20022.repository.msg.TMSAction6.mmComponentType, com.tools20022.repository.msg.TMSAction6.mmDelegationScopeIdentification, com.tools20022.repository.msg.TMSAction6.mmDelegationScopeDefinition,
						com.tools20022.repository.msg.TMSAction6.mmDelegationProof, com.tools20022.repository.msg.TMSAction6.mmProtectedDelegationProof, com.tools20022.repository.msg.TMSAction6.mmTrigger,
						com.tools20022.repository.msg.TMSAction6.mmAdditionalProcess, com.tools20022.repository.msg.TMSAction6.mmReTry, com.tools20022.repository.msg.TMSAction6.mmTimeCondition,
						com.tools20022.repository.msg.TMSAction6.mmTMChallenge, com.tools20022.repository.msg.TMSAction6.mmKeyEnciphermentCertificate, com.tools20022.repository.msg.TMSAction6.mmErrorAction,
						com.tools20022.repository.msg.TMSAction6.mmAdditionalInformation);
				trace_lazy = () -> TerminalManagementAction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TMSAction6";
				definition = "Single terminal management action to be performed by the point of interaction.";
				nextVersions_lazy = () -> Arrays.asList(TMSAction7.mmObject());
				previousVersion_lazy = () -> TMSAction5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction2Code getType() {
		return type;
	}

	public TMSAction6 setType(TerminalManagementAction2Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<NetworkParameters5> getRemoteAccess() {
		return remoteAccess == null ? Optional.empty() : Optional.of(remoteAccess);
	}

	public TMSAction6 setRemoteAccess(NetworkParameters5 remoteAccess) {
		this.remoteAccess = remoteAccess;
		return this;
	}

	public Optional<GenericIdentification71> getTerminalManagerIdentification() {
		return terminalManagerIdentification == null ? Optional.empty() : Optional.of(terminalManagerIdentification);
	}

	public TMSAction6 setTerminalManagerIdentification(GenericIdentification71 terminalManagerIdentification) {
		this.terminalManagerIdentification = terminalManagerIdentification;
		return this;
	}

	public Optional<Max35Text> getTMSProtocol() {
		return tMSProtocol == null ? Optional.empty() : Optional.of(tMSProtocol);
	}

	public TMSAction6 setTMSProtocol(Max35Text tMSProtocol) {
		this.tMSProtocol = tMSProtocol;
		return this;
	}

	public Optional<Max35Text> getTMSProtocolVersion() {
		return tMSProtocolVersion == null ? Optional.empty() : Optional.of(tMSProtocolVersion);
	}

	public TMSAction6 setTMSProtocolVersion(Max35Text tMSProtocolVersion) {
		this.tMSProtocolVersion = tMSProtocolVersion;
		return this;
	}

	public Optional<DataSetIdentification6> getDataSetIdentification() {
		return dataSetIdentification == null ? Optional.empty() : Optional.of(dataSetIdentification);
	}

	public TMSAction6 setDataSetIdentification(DataSetIdentification6 dataSetIdentification) {
		this.dataSetIdentification = dataSetIdentification;
		return this;
	}

	public List<DataSetCategory9Code> getComponentType() {
		return componentType == null ? componentType = new ArrayList<>() : componentType;
	}

	public TMSAction6 setComponentType(List<DataSetCategory9Code> componentType) {
		this.componentType = Objects.requireNonNull(componentType);
		return this;
	}

	public Optional<Max35Text> getDelegationScopeIdentification() {
		return delegationScopeIdentification == null ? Optional.empty() : Optional.of(delegationScopeIdentification);
	}

	public TMSAction6 setDelegationScopeIdentification(Max35Text delegationScopeIdentification) {
		this.delegationScopeIdentification = delegationScopeIdentification;
		return this;
	}

	public Optional<Max3000Binary> getDelegationScopeDefinition() {
		return delegationScopeDefinition == null ? Optional.empty() : Optional.of(delegationScopeDefinition);
	}

	public TMSAction6 setDelegationScopeDefinition(Max3000Binary delegationScopeDefinition) {
		this.delegationScopeDefinition = delegationScopeDefinition;
		return this;
	}

	public Optional<Max5000Binary> getDelegationProof() {
		return delegationProof == null ? Optional.empty() : Optional.of(delegationProof);
	}

	public TMSAction6 setDelegationProof(Max5000Binary delegationProof) {
		this.delegationProof = delegationProof;
		return this;
	}

	public Optional<ContentInformationType12> getProtectedDelegationProof() {
		return protectedDelegationProof == null ? Optional.empty() : Optional.of(protectedDelegationProof);
	}

	public TMSAction6 setProtectedDelegationProof(ContentInformationType12 protectedDelegationProof) {
		this.protectedDelegationProof = protectedDelegationProof;
		return this;
	}

	public TerminalManagementActionTrigger1Code getTrigger() {
		return trigger;
	}

	public TMSAction6 setTrigger(TerminalManagementActionTrigger1Code trigger) {
		this.trigger = Objects.requireNonNull(trigger);
		return this;
	}

	public List<TerminalManagementAdditionalProcess1Code> getAdditionalProcess() {
		return additionalProcess == null ? additionalProcess = new ArrayList<>() : additionalProcess;
	}

	public TMSAction6 setAdditionalProcess(List<TerminalManagementAdditionalProcess1Code> additionalProcess) {
		this.additionalProcess = Objects.requireNonNull(additionalProcess);
		return this;
	}

	public Optional<ProcessRetry2> getReTry() {
		return reTry == null ? Optional.empty() : Optional.of(reTry);
	}

	public TMSAction6 setReTry(ProcessRetry2 reTry) {
		this.reTry = reTry;
		return this;
	}

	public Optional<ProcessTiming3> getTimeCondition() {
		return timeCondition == null ? Optional.empty() : Optional.of(timeCondition);
	}

	public TMSAction6 setTimeCondition(ProcessTiming3 timeCondition) {
		this.timeCondition = timeCondition;
		return this;
	}

	public Optional<Max140Binary> getTMChallenge() {
		return tMChallenge == null ? Optional.empty() : Optional.of(tMChallenge);
	}

	public TMSAction6 setTMChallenge(Max140Binary tMChallenge) {
		this.tMChallenge = tMChallenge;
		return this;
	}

	public List<Max10KBinary> getKeyEnciphermentCertificate() {
		return keyEnciphermentCertificate == null ? keyEnciphermentCertificate = new ArrayList<>() : keyEnciphermentCertificate;
	}

	public TMSAction6 setKeyEnciphermentCertificate(List<Max10KBinary> keyEnciphermentCertificate) {
		this.keyEnciphermentCertificate = Objects.requireNonNull(keyEnciphermentCertificate);
		return this;
	}

	public List<ErrorAction3> getErrorAction() {
		return errorAction == null ? errorAction = new ArrayList<>() : errorAction;
	}

	public TMSAction6 setErrorAction(List<ErrorAction3> errorAction) {
		this.errorAction = Objects.requireNonNull(errorAction);
		return this;
	}

	public List<Max3000Binary> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public TMSAction6 setAdditionalInformation(List<Max3000Binary> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}