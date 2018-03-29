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
import com.tools20022.repository.datatype.Max3000Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DataSetIdentification6;
import com.tools20022.repository.msg.NetworkParameters5;
import com.tools20022.repository.msg.ProcessRetry2;
import com.tools20022.repository.msg.TMSAction5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information for the MTM to build or include delegated actions in the
 * management plan of the POI.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmPeriodicAction
 * MaintenanceDelegateAction2.mmPeriodicAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmTMRemoteAccess
 * MaintenanceDelegateAction2.mmTMRemoteAccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmTMSProtocol
 * MaintenanceDelegateAction2.mmTMSProtocol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmTMSProtocolVersion
 * MaintenanceDelegateAction2.mmTMSProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmDataSetIdentification
 * MaintenanceDelegateAction2.mmDataSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmReTry
 * MaintenanceDelegateAction2.mmReTry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmAdditionalInformation
 * MaintenanceDelegateAction2.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmAction
 * MaintenanceDelegateAction2.mmAction}</li>
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
 * "MaintenanceDelegateAction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information for the MTM to build or include delegated actions in the management plan of the POI."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3
 * MaintenanceDelegateAction3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1
 * MaintenanceDelegateAction1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MaintenanceDelegateAction2", propOrder = {"periodicAction", "tMRemoteAccess", "tMSProtocol", "tMSProtocolVersion", "dataSetIdentification", "reTry", "additionalInformation", "action"})
public class MaintenanceDelegateAction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrdcActn")
	protected TrueFalseIndicator periodicAction;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2
	 * MaintenanceDelegateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrdcActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodicAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Flag to indicate that the delegated actions have to be included in a periodic sequence of actions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmPeriodicAction
	 * MaintenanceDelegateAction3.mmPeriodicAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmPeriodicAction
	 * MaintenanceDelegateAction1.mmPeriodicAction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegateAction2, Optional<TrueFalseIndicator>> mmPeriodicAction = new MMMessageAttribute<MaintenanceDelegateAction2, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "PrdcActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodicAction";
			definition = "Flag to indicate that the delegated actions have to be included in a periodic sequence of actions.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegateAction3.mmPeriodicAction);
			previousVersion_lazy = () -> MaintenanceDelegateAction1.mmPeriodicAction;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(MaintenanceDelegateAction2 obj) {
			return obj.getPeriodicAction();
		}

		@Override
		public void setValue(MaintenanceDelegateAction2 obj, Optional<TrueFalseIndicator> value) {
			obj.setPeriodicAction(value.orElse(null));
		}
	};
	@XmlElement(name = "TMRmotAccs")
	protected NetworkParameters5 tMRemoteAccess;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2
	 * MaintenanceDelegateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMRmotAccs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMRemoteAccess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Network address and parameters of the terminal manager host which will performs the delegated actions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmTMRemoteAccess
	 * MaintenanceDelegateAction3.mmTMRemoteAccess}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmTMRemoteAccess
	 * MaintenanceDelegateAction1.mmTMRemoteAccess}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegateAction2, Optional<NetworkParameters5>> mmTMRemoteAccess = new MMMessageAssociationEnd<MaintenanceDelegateAction2, Optional<NetworkParameters5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "TMRmotAccs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMRemoteAccess";
			definition = "Network address and parameters of the terminal manager host which will performs the delegated actions.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegateAction3.mmTMRemoteAccess);
			previousVersion_lazy = () -> MaintenanceDelegateAction1.mmTMRemoteAccess;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetworkParameters5.mmObject();
		}

		@Override
		public Optional<NetworkParameters5> getValue(MaintenanceDelegateAction2 obj) {
			return obj.getTMRemoteAccess();
		}

		@Override
		public void setValue(MaintenanceDelegateAction2 obj, Optional<NetworkParameters5> value) {
			obj.setTMRemoteAccess(value.orElse(null));
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2
	 * MaintenanceDelegateAction2}</li>
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
	 * definition} = "TMS protocol to use to perform the maintenance action."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmTMSProtocol
	 * MaintenanceDelegateAction3.mmTMSProtocol}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmTMSProtocol
	 * MaintenanceDelegateAction1.mmTMSProtocol}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegateAction2, Optional<Max35Text>> mmTMSProtocol = new MMMessageAttribute<MaintenanceDelegateAction2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "TMSPrtcol";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocol";
			definition = "TMS protocol to use to perform the maintenance action.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegateAction3.mmTMSProtocol);
			previousVersion_lazy = () -> MaintenanceDelegateAction1.mmTMSProtocol;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MaintenanceDelegateAction2 obj) {
			return obj.getTMSProtocol();
		}

		@Override
		public void setValue(MaintenanceDelegateAction2 obj, Optional<Max35Text> value) {
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2
	 * MaintenanceDelegateAction2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmTMSProtocolVersion
	 * MaintenanceDelegateAction3.mmTMSProtocolVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmTMSProtocolVersion
	 * MaintenanceDelegateAction1.mmTMSProtocolVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegateAction2, Optional<Max35Text>> mmTMSProtocolVersion = new MMMessageAttribute<MaintenanceDelegateAction2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "TMSPrtcolVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolVersion";
			definition = "Version of the TMS protocol to use to perform the maintenance action.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegateAction3.mmTMSProtocolVersion);
			previousVersion_lazy = () -> MaintenanceDelegateAction1.mmTMSProtocolVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MaintenanceDelegateAction2 obj) {
			return obj.getTMSProtocolVersion();
		}

		@Override
		public void setValue(MaintenanceDelegateAction2 obj, Optional<Max35Text> value) {
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2
	 * MaintenanceDelegateAction2}</li>
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
	 * definition} =
	 * "Data set on which the delegated action has to be performed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmDataSetIdentification
	 * MaintenanceDelegateAction3.mmDataSetIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmDataSetIdentification
	 * MaintenanceDelegateAction1.mmDataSetIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegateAction2, Optional<DataSetIdentification6>> mmDataSetIdentification = new MMMessageAssociationEnd<MaintenanceDelegateAction2, Optional<DataSetIdentification6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Data set on which the delegated action has to be performed.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegateAction3.mmDataSetIdentification);
			previousVersion_lazy = () -> MaintenanceDelegateAction1.mmDataSetIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DataSetIdentification6.mmObject();
		}

		@Override
		public Optional<DataSetIdentification6> getValue(MaintenanceDelegateAction2 obj) {
			return obj.getDataSetIdentification();
		}

		@Override
		public void setValue(MaintenanceDelegateAction2 obj, Optional<DataSetIdentification6> value) {
			obj.setDataSetIdentification(value.orElse(null));
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2
	 * MaintenanceDelegateAction2}</li>
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
	 * "Definition of retry process when activation of the action fails."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmReTry
	 * MaintenanceDelegateAction3.mmReTry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmReTry
	 * MaintenanceDelegateAction1.mmReTry}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegateAction2, Optional<ProcessRetry2>> mmReTry = new MMMessageAssociationEnd<MaintenanceDelegateAction2, Optional<ProcessRetry2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "ReTry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTry";
			definition = "Definition of retry process when activation of the action fails.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegateAction3.mmReTry);
			previousVersion_lazy = () -> MaintenanceDelegateAction1.mmReTry;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessRetry2.mmObject();
		}

		@Override
		public Optional<ProcessRetry2> getValue(MaintenanceDelegateAction2 obj) {
			return obj.getReTry();
		}

		@Override
		public void setValue(MaintenanceDelegateAction2 obj, Optional<ProcessRetry2> value) {
			obj.setReTry(value.orElse(null));
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2
	 * MaintenanceDelegateAction2}</li>
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
	 * definition} =
	 * "Additional information to include in the maintenance action."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmAdditionalInformation
	 * MaintenanceDelegateAction3.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmAdditionalInformation
	 * MaintenanceDelegateAction1.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegateAction2, List<Max3000Binary>> mmAdditionalInformation = new MMMessageAttribute<MaintenanceDelegateAction2, List<Max3000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information to include in the maintenance action.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegateAction3.mmAdditionalInformation);
			previousVersion_lazy = () -> MaintenanceDelegateAction1.mmAdditionalInformation;
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}

		@Override
		public List<Max3000Binary> getValue(MaintenanceDelegateAction2 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(MaintenanceDelegateAction2 obj, List<Max3000Binary> value) {
			obj.setAdditionalInformation(value);
		}
	};
	@XmlElement(name = "Actn")
	protected List<TMSAction5> action;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TMSAction5 TMSAction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2
	 * MaintenanceDelegateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Actn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Action"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequence of action to include in the next MTM management plan."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmAction
	 * MaintenanceDelegateAction3.mmAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmAction
	 * MaintenanceDelegateAction1.mmAction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegateAction2, List<TMSAction5>> mmAction = new MMMessageAssociationEnd<MaintenanceDelegateAction2, List<TMSAction5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Sequence of action to include in the next MTM management plan.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegateAction3.mmAction);
			previousVersion_lazy = () -> MaintenanceDelegateAction1.mmAction;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TMSAction5.mmObject();
		}

		@Override
		public List<TMSAction5> getValue(MaintenanceDelegateAction2 obj) {
			return obj.getAction();
		}

		@Override
		public void setValue(MaintenanceDelegateAction2 obj, List<TMSAction5> value) {
			obj.setAction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction2.mmPeriodicAction, com.tools20022.repository.msg.MaintenanceDelegateAction2.mmTMRemoteAccess,
						com.tools20022.repository.msg.MaintenanceDelegateAction2.mmTMSProtocol, com.tools20022.repository.msg.MaintenanceDelegateAction2.mmTMSProtocolVersion,
						com.tools20022.repository.msg.MaintenanceDelegateAction2.mmDataSetIdentification, com.tools20022.repository.msg.MaintenanceDelegateAction2.mmReTry,
						com.tools20022.repository.msg.MaintenanceDelegateAction2.mmAdditionalInformation, com.tools20022.repository.msg.MaintenanceDelegateAction2.mmAction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegateAction2";
				definition = "Information for the MTM to build or include delegated actions in the management plan of the POI.";
				nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegateAction3.mmObject());
				previousVersion_lazy = () -> MaintenanceDelegateAction1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getPeriodicAction() {
		return periodicAction == null ? Optional.empty() : Optional.of(periodicAction);
	}

	public MaintenanceDelegateAction2 setPeriodicAction(TrueFalseIndicator periodicAction) {
		this.periodicAction = periodicAction;
		return this;
	}

	public Optional<NetworkParameters5> getTMRemoteAccess() {
		return tMRemoteAccess == null ? Optional.empty() : Optional.of(tMRemoteAccess);
	}

	public MaintenanceDelegateAction2 setTMRemoteAccess(NetworkParameters5 tMRemoteAccess) {
		this.tMRemoteAccess = tMRemoteAccess;
		return this;
	}

	public Optional<Max35Text> getTMSProtocol() {
		return tMSProtocol == null ? Optional.empty() : Optional.of(tMSProtocol);
	}

	public MaintenanceDelegateAction2 setTMSProtocol(Max35Text tMSProtocol) {
		this.tMSProtocol = tMSProtocol;
		return this;
	}

	public Optional<Max35Text> getTMSProtocolVersion() {
		return tMSProtocolVersion == null ? Optional.empty() : Optional.of(tMSProtocolVersion);
	}

	public MaintenanceDelegateAction2 setTMSProtocolVersion(Max35Text tMSProtocolVersion) {
		this.tMSProtocolVersion = tMSProtocolVersion;
		return this;
	}

	public Optional<DataSetIdentification6> getDataSetIdentification() {
		return dataSetIdentification == null ? Optional.empty() : Optional.of(dataSetIdentification);
	}

	public MaintenanceDelegateAction2 setDataSetIdentification(DataSetIdentification6 dataSetIdentification) {
		this.dataSetIdentification = dataSetIdentification;
		return this;
	}

	public Optional<ProcessRetry2> getReTry() {
		return reTry == null ? Optional.empty() : Optional.of(reTry);
	}

	public MaintenanceDelegateAction2 setReTry(ProcessRetry2 reTry) {
		this.reTry = reTry;
		return this;
	}

	public List<Max3000Binary> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public MaintenanceDelegateAction2 setAdditionalInformation(List<Max3000Binary> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}

	public List<TMSAction5> getAction() {
		return action == null ? action = new ArrayList<>() : action;
	}

	public MaintenanceDelegateAction2 setAction(List<TMSAction5> action) {
		this.action = Objects.requireNonNull(action);
		return this;
	}
}