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
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmPeriodicAction
 * MaintenanceDelegateAction1.mmPeriodicAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmTMRemoteAccess
 * MaintenanceDelegateAction1.mmTMRemoteAccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmTMSProtocol
 * MaintenanceDelegateAction1.mmTMSProtocol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmTMSProtocolVersion
 * MaintenanceDelegateAction1.mmTMSProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmDataSetIdentification
 * MaintenanceDelegateAction1.mmDataSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmReTry
 * MaintenanceDelegateAction1.mmReTry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmAdditionalInformation
 * MaintenanceDelegateAction1.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1#mmAction
 * MaintenanceDelegateAction1.mmAction}</li>
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
 * "MaintenanceDelegateAction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information for the MTM to build or include delegated actions in the management plan of the POI."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2
 * MaintenanceDelegateAction2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class MaintenanceDelegateAction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TrueFalseIndicator periodicAction;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1
	 * MaintenanceDelegateAction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmPeriodicAction
	 * MaintenanceDelegateAction2.mmPeriodicAction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPeriodicAction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction1.mmObject();
			isDerived = false;
			xmlTag = "PrdcActn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodicAction";
			definition = "Flag to indicate that the delegated actions have to be included in a periodic sequence of actions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction2.mmPeriodicAction);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected NetworkParameters3 tMRemoteAccess;
	/**
	 * Network address and parameters of the terminal manager host which will
	 * performs the delegated actions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetworkParameters3
	 * NetworkParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1
	 * MaintenanceDelegateAction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmTMRemoteAccess
	 * MaintenanceDelegateAction2.mmTMRemoteAccess}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTMRemoteAccess = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction1.mmObject();
			isDerived = false;
			xmlTag = "TMRmotAccs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMRemoteAccess";
			definition = "Network address and parameters of the terminal manager host which will performs the delegated actions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction2.mmTMRemoteAccess);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetworkParameters3.mmObject();
		}
	};
	protected Max35Text tMSProtocol;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1
	 * MaintenanceDelegateAction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmTMSProtocol
	 * MaintenanceDelegateAction2.mmTMSProtocol}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTMSProtocol = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction1.mmObject();
			isDerived = false;
			xmlTag = "TMSPrtcol";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocol";
			definition = "TMS protocol to use to perform the maintenance action.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction2.mmTMSProtocol);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text tMSProtocolVersion;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1
	 * MaintenanceDelegateAction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmTMSProtocolVersion
	 * MaintenanceDelegateAction2.mmTMSProtocolVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTMSProtocolVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction1.mmObject();
			isDerived = false;
			xmlTag = "TMSPrtcolVrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolVersion";
			definition = "Version of the TMS protocol to use to perform the maintenance action.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction2.mmTMSProtocolVersion);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DataSetIdentification4 dataSetIdentification;
	/**
	 * Data set on which the delegated action has to be performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification4
	 * DataSetIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1
	 * MaintenanceDelegateAction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmDataSetIdentification
	 * MaintenanceDelegateAction2.mmDataSetIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSetIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction1.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Data set  on which the delegated action has to be performed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction2.mmDataSetIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DataSetIdentification4.mmObject();
		}
	};
	protected ProcessRetry2 reTry;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1
	 * MaintenanceDelegateAction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmReTry
	 * MaintenanceDelegateAction2.mmReTry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReTry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction1.mmObject();
			isDerived = false;
			xmlTag = "ReTry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTry";
			definition = "Definition of retry process when activation of the action fails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction2.mmReTry);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessRetry2.mmObject();
		}
	};
	protected List<Max3000Binary> additionalInformation;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1
	 * MaintenanceDelegateAction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmAdditionalInformation
	 * MaintenanceDelegateAction2.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information to include in the maintenance action.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction2.mmAdditionalInformation);
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TMSAction4> action;
	/**
	 * Sequence of action to include in the next MTM management plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TMSAction4 TMSAction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1
	 * MaintenanceDelegateAction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmAction
	 * MaintenanceDelegateAction2.mmAction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction1.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Sequence of action to include in the next MTM management plan.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction2.mmAction);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TMSAction4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegateAction1.mmPeriodicAction, com.tools20022.repository.msg.MaintenanceDelegateAction1.mmTMRemoteAccess,
						com.tools20022.repository.msg.MaintenanceDelegateAction1.mmTMSProtocol, com.tools20022.repository.msg.MaintenanceDelegateAction1.mmTMSProtocolVersion,
						com.tools20022.repository.msg.MaintenanceDelegateAction1.mmDataSetIdentification, com.tools20022.repository.msg.MaintenanceDelegateAction1.mmReTry,
						com.tools20022.repository.msg.MaintenanceDelegateAction1.mmAdditionalInformation, com.tools20022.repository.msg.MaintenanceDelegateAction1.mmAction);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegateAction1";
				definition = "Information for the MTM to build or include delegated actions in the management plan of the POI.";
				nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegateAction2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getPeriodicAction() {
		return periodicAction;
	}

	public void setPeriodicAction(TrueFalseIndicator periodicAction) {
		this.periodicAction = periodicAction;
	}

	public NetworkParameters3 getTMRemoteAccess() {
		return tMRemoteAccess;
	}

	public void setTMRemoteAccess(com.tools20022.repository.msg.NetworkParameters3 tMRemoteAccess) {
		this.tMRemoteAccess = tMRemoteAccess;
	}

	public Max35Text getTMSProtocol() {
		return tMSProtocol;
	}

	public void setTMSProtocol(Max35Text tMSProtocol) {
		this.tMSProtocol = tMSProtocol;
	}

	public Max35Text getTMSProtocolVersion() {
		return tMSProtocolVersion;
	}

	public void setTMSProtocolVersion(Max35Text tMSProtocolVersion) {
		this.tMSProtocolVersion = tMSProtocolVersion;
	}

	public DataSetIdentification4 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public void setDataSetIdentification(com.tools20022.repository.msg.DataSetIdentification4 dataSetIdentification) {
		this.dataSetIdentification = dataSetIdentification;
	}

	public ProcessRetry2 getReTry() {
		return reTry;
	}

	public void setReTry(com.tools20022.repository.msg.ProcessRetry2 reTry) {
		this.reTry = reTry;
	}

	public List<Max3000Binary> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<Max3000Binary> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public List<TMSAction4> getAction() {
		return action;
	}

	public void setAction(List<com.tools20022.repository.msg.TMSAction4> action) {
		this.action = action;
	}
}