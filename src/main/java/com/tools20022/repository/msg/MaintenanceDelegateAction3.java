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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmPeriodicAction
 * MaintenanceDelegateAction3.mmPeriodicAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmTMRemoteAccess
 * MaintenanceDelegateAction3.mmTMRemoteAccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmTMSProtocol
 * MaintenanceDelegateAction3.mmTMSProtocol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmTMSProtocolVersion
 * MaintenanceDelegateAction3.mmTMSProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmDataSetIdentification
 * MaintenanceDelegateAction3.mmDataSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmReTry
 * MaintenanceDelegateAction3.mmReTry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmAdditionalInformation
 * MaintenanceDelegateAction3.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3#mmAction
 * MaintenanceDelegateAction3.mmAction}</li>
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
 * "MaintenanceDelegateAction3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information for the MTM to build or include delegated actions in the management plan of the POI."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2
 * MaintenanceDelegateAction2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MaintenanceDelegateAction3", propOrder = {"periodicAction", "TMRemoteAccess", "TMSProtocol", "TMSProtocolVersion", "dataSetIdentification", "reTry", "additionalInformation", "action"})
public class MaintenanceDelegateAction3 {

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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3
	 * MaintenanceDelegateAction3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmPeriodicAction
	 * MaintenanceDelegateAction2.mmPeriodicAction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPeriodicAction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction3.mmObject();
			isDerived = false;
			xmlTag = "PrdcActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodicAction";
			definition = "Flag to indicate that the delegated actions have to be included in a periodic sequence of actions.";
			previousVersion_lazy = () -> MaintenanceDelegateAction2.mmPeriodicAction;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected NetworkParameters5 tMRemoteAccess;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3
	 * MaintenanceDelegateAction3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmTMRemoteAccess
	 * MaintenanceDelegateAction2.mmTMRemoteAccess}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTMRemoteAccess = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction3.mmObject();
			isDerived = false;
			xmlTag = "TMRmotAccs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMRemoteAccess";
			definition = "Network address and parameters of the terminal manager host which will performs the delegated actions.";
			previousVersion_lazy = () -> MaintenanceDelegateAction2.mmTMRemoteAccess;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetworkParameters5.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3
	 * MaintenanceDelegateAction3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmTMSProtocol
	 * MaintenanceDelegateAction2.mmTMSProtocol}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTMSProtocol = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction3.mmObject();
			isDerived = false;
			xmlTag = "TMSPrtcol";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocol";
			definition = "TMS protocol to use to perform the maintenance action.";
			previousVersion_lazy = () -> MaintenanceDelegateAction2.mmTMSProtocol;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3
	 * MaintenanceDelegateAction3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmTMSProtocolVersion
	 * MaintenanceDelegateAction2.mmTMSProtocolVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTMSProtocolVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction3.mmObject();
			isDerived = false;
			xmlTag = "TMSPrtcolVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolVersion";
			definition = "Version of the TMS protocol to use to perform the maintenance action.";
			previousVersion_lazy = () -> MaintenanceDelegateAction2.mmTMSProtocolVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DataSetIdentification6 dataSetIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3
	 * MaintenanceDelegateAction3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmDataSetIdentification
	 * MaintenanceDelegateAction2.mmDataSetIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSetIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction3.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Data set  on which the delegated action has to be performed.";
			previousVersion_lazy = () -> MaintenanceDelegateAction2.mmDataSetIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DataSetIdentification6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3
	 * MaintenanceDelegateAction3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmReTry
	 * MaintenanceDelegateAction2.mmReTry}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReTry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction3.mmObject();
			isDerived = false;
			xmlTag = "ReTry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTry";
			definition = "Definition of retry process when activation of the action fails.";
			previousVersion_lazy = () -> MaintenanceDelegateAction2.mmReTry;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3
	 * MaintenanceDelegateAction3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmAdditionalInformation
	 * MaintenanceDelegateAction2.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction3.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information to include in the maintenance action.";
			previousVersion_lazy = () -> MaintenanceDelegateAction2.mmAdditionalInformation;
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TMSAction6> action;
	/**
	 * Sequence of action to include in the next MTM management plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TMSAction6 TMSAction6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3
	 * MaintenanceDelegateAction3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction2#mmAction
	 * MaintenanceDelegateAction2.mmAction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegateAction3.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Sequence of action to include in the next MTM management plan.";
			previousVersion_lazy = () -> MaintenanceDelegateAction2.mmAction;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TMSAction6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MaintenanceDelegateAction3.mmPeriodicAction, MaintenanceDelegateAction3.mmTMRemoteAccess, MaintenanceDelegateAction3.mmTMSProtocol, MaintenanceDelegateAction3.mmTMSProtocolVersion,
						MaintenanceDelegateAction3.mmDataSetIdentification, MaintenanceDelegateAction3.mmReTry, MaintenanceDelegateAction3.mmAdditionalInformation, MaintenanceDelegateAction3.mmAction);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegateAction3";
				definition = "Information for the MTM to build or include delegated actions in the management plan of the POI.";
				previousVersion_lazy = () -> MaintenanceDelegateAction2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrdcActn")
	public TrueFalseIndicator getPeriodicAction() {
		return periodicAction;
	}

	public void setPeriodicAction(TrueFalseIndicator periodicAction) {
		this.periodicAction = periodicAction;
	}

	@XmlElement(name = "TMRmotAccs")
	public NetworkParameters5 getTMRemoteAccess() {
		return tMRemoteAccess;
	}

	public void setTMRemoteAccess(com.tools20022.repository.msg.NetworkParameters5 tMRemoteAccess) {
		this.tMRemoteAccess = tMRemoteAccess;
	}

	@XmlElement(name = "TMSPrtcol")
	public Max35Text getTMSProtocol() {
		return tMSProtocol;
	}

	public void setTMSProtocol(Max35Text tMSProtocol) {
		this.tMSProtocol = tMSProtocol;
	}

	@XmlElement(name = "TMSPrtcolVrsn")
	public Max35Text getTMSProtocolVersion() {
		return tMSProtocolVersion;
	}

	public void setTMSProtocolVersion(Max35Text tMSProtocolVersion) {
		this.tMSProtocolVersion = tMSProtocolVersion;
	}

	@XmlElement(name = "DataSetId")
	public DataSetIdentification6 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public void setDataSetIdentification(com.tools20022.repository.msg.DataSetIdentification6 dataSetIdentification) {
		this.dataSetIdentification = dataSetIdentification;
	}

	@XmlElement(name = "ReTry")
	public ProcessRetry2 getReTry() {
		return reTry;
	}

	public void setReTry(com.tools20022.repository.msg.ProcessRetry2 reTry) {
		this.reTry = reTry;
	}

	@XmlElement(name = "AddtlInf")
	public List<Max3000Binary> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<Max3000Binary> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@XmlElement(name = "Actn")
	public List<TMSAction6> getAction() {
		return action;
	}

	public void setAction(List<com.tools20022.repository.msg.TMSAction6> action) {
		this.action = action;
	}
}