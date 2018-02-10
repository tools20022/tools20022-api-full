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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.catm.MaintenanceDelegationRequestV03;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the request of maintenance delegations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest3#mmTMIdentification
 * MaintenanceDelegationRequest3.mmTMIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest3#mmMasterTMIdentification
 * MaintenanceDelegationRequest3.mmMasterTMIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest3#mmRequestedDelegation
 * MaintenanceDelegationRequest3.mmRequestedDelegation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV03#mmMaintenanceDelegationRequest
 * MaintenanceDelegationRequestV03.mmMaintenanceDelegationRequest}</li>
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
 * "MaintenanceDelegationRequest3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the request of maintenance delegations."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest2
 * MaintenanceDelegationRequest2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MaintenanceDelegationRequest3", propOrder = {"tMIdentification", "masterTMIdentification", "requestedDelegation"})
public class MaintenanceDelegationRequest3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TMId", required = true)
	protected GenericIdentification72 tMIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification72
	 * GenericIdentification72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest3
	 * MaintenanceDelegationRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terminal manager identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest2#mmTMIdentification
	 * MaintenanceDelegationRequest2.mmTMIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTMIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegationRequest3.mmObject();
			isDerived = false;
			xmlTag = "TMId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMIdentification";
			definition = "Terminal manager identification.";
			previousVersion_lazy = () -> MaintenanceDelegationRequest2.mmTMIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification72.mmObject();
		}
	};
	@XmlElement(name = "MstrTMId")
	protected GenericIdentification72 masterTMIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification72
	 * GenericIdentification72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest3
	 * MaintenanceDelegationRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrTMId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterTMIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Master terminal manager identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest2#mmMasterTMIdentification
	 * MaintenanceDelegationRequest2.mmMasterTMIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMasterTMIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegationRequest3.mmObject();
			isDerived = false;
			xmlTag = "MstrTMId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterTMIdentification";
			definition = "Master terminal manager identification.";
			previousVersion_lazy = () -> MaintenanceDelegationRequest2.mmMasterTMIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification72.mmObject();
		}
	};
	@XmlElement(name = "ReqdDlgtn", required = true)
	protected List<com.tools20022.repository.msg.MaintenanceDelegation5> requestedDelegation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest3
	 * MaintenanceDelegationRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdDlgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedDelegation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the delegation of a maintenance action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest2#mmRequestedDelegation
	 * MaintenanceDelegationRequest2.mmRequestedDelegation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRequestedDelegation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegationRequest3.mmObject();
			isDerived = false;
			xmlTag = "ReqdDlgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedDelegation";
			definition = "Information on the delegation of a maintenance action.";
			previousVersion_lazy = () -> MaintenanceDelegationRequest2.mmRequestedDelegation;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegationRequest3.mmTMIdentification, com.tools20022.repository.msg.MaintenanceDelegationRequest3.mmMasterTMIdentification,
						com.tools20022.repository.msg.MaintenanceDelegationRequest3.mmRequestedDelegation);
				messageBuildingBlock_lazy = () -> Arrays.asList(MaintenanceDelegationRequestV03.mmMaintenanceDelegationRequest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegationRequest3";
				definition = "Information related to the request of maintenance delegations.";
				previousVersion_lazy = () -> MaintenanceDelegationRequest2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification72 getTMIdentification() {
		return tMIdentification;
	}

	public MaintenanceDelegationRequest3 setTMIdentification(com.tools20022.repository.msg.GenericIdentification72 tMIdentification) {
		this.tMIdentification = Objects.requireNonNull(tMIdentification);
		return this;
	}

	public Optional<GenericIdentification72> getMasterTMIdentification() {
		return masterTMIdentification == null ? Optional.empty() : Optional.of(masterTMIdentification);
	}

	public MaintenanceDelegationRequest3 setMasterTMIdentification(com.tools20022.repository.msg.GenericIdentification72 masterTMIdentification) {
		this.masterTMIdentification = masterTMIdentification;
		return this;
	}

	public List<MaintenanceDelegation5> getRequestedDelegation() {
		return requestedDelegation == null ? requestedDelegation = new ArrayList<>() : requestedDelegation;
	}

	public MaintenanceDelegationRequest3 setRequestedDelegation(List<com.tools20022.repository.msg.MaintenanceDelegation5> requestedDelegation) {
		this.requestedDelegation = Objects.requireNonNull(requestedDelegation);
		return this;
	}
}