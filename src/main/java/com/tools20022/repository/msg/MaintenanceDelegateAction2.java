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
import com.tools20022.repository.datatype.Max3000Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#PeriodicAction
 * MaintenanceDelegateAction2.PeriodicAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#TMRemoteAccess
 * MaintenanceDelegateAction2.TMRemoteAccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#TMSProtocol
 * MaintenanceDelegateAction2.TMSProtocol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#TMSProtocolVersion
 * MaintenanceDelegateAction2.TMSProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#DataSetIdentification
 * MaintenanceDelegateAction2.DataSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#ReTry
 * MaintenanceDelegateAction2.ReTry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#AdditionalInformation
 * MaintenanceDelegateAction2.AdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#Action
 * MaintenanceDelegateAction2.Action}</li>
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
public class MaintenanceDelegateAction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Flag to indicate that the delegated actions have to be included in a
	 * periodic sequence of actions.
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#PeriodicAction
	 * MaintenanceDelegateAction3.PeriodicAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#PeriodicAction
	 * MaintenanceDelegateAction1.PeriodicAction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PeriodicAction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "PrdcActn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodicAction";
			definition = "Flag to indicate that the delegated actions have to be included in a periodic sequence of actions.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction1.PeriodicAction;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction3.PeriodicAction);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Network address and parameters of the terminal manager host which will
	 * performs the delegated actions.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#TMRemoteAccess
	 * MaintenanceDelegateAction3.TMRemoteAccess}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#TMRemoteAccess
	 * MaintenanceDelegateAction1.TMRemoteAccess}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TMRemoteAccess = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "TMRmotAccs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMRemoteAccess";
			definition = "Network address and parameters of the terminal manager host which will performs the delegated actions.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction1.TMRemoteAccess;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction3.TMRemoteAccess);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> NetworkParameters5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * TMS protocol to use to perform the maintenance action.
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#TMSProtocol
	 * MaintenanceDelegateAction3.TMSProtocol}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#TMSProtocol
	 * MaintenanceDelegateAction1.TMSProtocol}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TMSProtocol = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "TMSPrtcol";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocol";
			definition = "TMS protocol to use to perform the maintenance action.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction1.TMSProtocol;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction3.TMSProtocol);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Version of the TMS protocol to use to perform the maintenance action.
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#TMSProtocolVersion
	 * MaintenanceDelegateAction3.TMSProtocolVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#TMSProtocolVersion
	 * MaintenanceDelegateAction1.TMSProtocolVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TMSProtocolVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "TMSPrtcolVrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolVersion";
			definition = "Version of the TMS protocol to use to perform the maintenance action.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction1.TMSProtocolVersion;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction3.TMSProtocolVersion);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Data set on which the delegated action has to be performed.
	 * <p>
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
	 * "Data set  on which the delegated action has to be performed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#DataSetIdentification
	 * MaintenanceDelegateAction3.DataSetIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#DataSetIdentification
	 * MaintenanceDelegateAction1.DataSetIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DataSetIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Data set  on which the delegated action has to be performed.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction1.DataSetIdentification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction3.DataSetIdentification);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DataSetIdentification6.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Definition of retry process when activation of the action fails.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#ReTry
	 * MaintenanceDelegateAction3.ReTry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#ReTry
	 * MaintenanceDelegateAction1.ReTry}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReTry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "ReTry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTry";
			definition = "Definition of retry process when activation of the action fails.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction1.ReTry;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction3.ReTry);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ProcessRetry2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Additional information to include in the maintenance action.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#AdditionalInformation
	 * MaintenanceDelegateAction3.AdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#AdditionalInformation
	 * MaintenanceDelegateAction1.AdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information to include in the maintenance action.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction1.AdditionalInformation;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction3.AdditionalInformation);
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}
	};
	/**
	 * Sequence of action to include in the next MTM management plan.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#Action
	 * MaintenanceDelegateAction3.Action}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#Action
	 * MaintenanceDelegateAction1.Action}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Action = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction2.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Sequence of action to include in the next MTM management plan.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction1.Action;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction3.Action);
			minOccurs = 0;
			type_lazy = () -> TMSAction5.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction2.PeriodicAction, com.tools20022.repository.msg.MaintenanceDelegateAction2.TMRemoteAccess,
						com.tools20022.repository.msg.MaintenanceDelegateAction2.TMSProtocol, com.tools20022.repository.msg.MaintenanceDelegateAction2.TMSProtocolVersion,
						com.tools20022.repository.msg.MaintenanceDelegateAction2.DataSetIdentification, com.tools20022.repository.msg.MaintenanceDelegateAction2.ReTry,
						com.tools20022.repository.msg.MaintenanceDelegateAction2.AdditionalInformation, com.tools20022.repository.msg.MaintenanceDelegateAction2.Action);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegateAction2";
				definition = "Information for the MTM to build or include delegated actions in the management plan of the POI.";
				previousVersion_lazy = () -> MaintenanceDelegateAction1.mmObject();
				nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegateAction3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}