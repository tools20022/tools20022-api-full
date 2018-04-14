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
import com.tools20022.repository.area.catm.MaintenanceDelegationResponseV03;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification72;
import com.tools20022.repository.msg.MaintenanceDelegation6;
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
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse3#mmTMIdentification
 * MaintenanceDelegationResponse3.mmTMIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse3#mmMasterTMIdentification
 * MaintenanceDelegationResponse3.mmMasterTMIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse3#mmDelegationResponse
 * MaintenanceDelegationResponse3.mmDelegationResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV03#mmMaintenanceDelegationResponse
 * MaintenanceDelegationResponseV03.mmMaintenanceDelegationResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MaintenanceDelegationResponse3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the request of maintenance delegations."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse2
 * MaintenanceDelegationResponse2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MaintenanceDelegationResponse3", propOrder = {"tMIdentification", "masterTMIdentification", "delegationResponse"})
public class MaintenanceDelegationResponse3 {

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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse3
	 * MaintenanceDelegationResponse3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terminal manager identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse2#mmTMIdentification
	 * MaintenanceDelegationResponse2.mmTMIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegationResponse3, GenericIdentification72> mmTMIdentification = new MMMessageAssociationEnd<MaintenanceDelegationResponse3, GenericIdentification72>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegationResponse3.mmObject();
			isDerived = false;
			xmlTag = "TMId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMIdentification";
			definition = "Terminal manager identification.";
			previousVersion_lazy = () -> MaintenanceDelegationResponse2.mmTMIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification72.mmObject();
		}

		@Override
		public GenericIdentification72 getValue(MaintenanceDelegationResponse3 obj) {
			return obj.getTMIdentification();
		}

		@Override
		public void setValue(MaintenanceDelegationResponse3 obj, GenericIdentification72 value) {
			obj.setTMIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse3
	 * MaintenanceDelegationResponse3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrTMId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterTMIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Master terminal manager identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse2#mmMasterTMIdentification
	 * MaintenanceDelegationResponse2.mmMasterTMIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegationResponse3, Optional<GenericIdentification72>> mmMasterTMIdentification = new MMMessageAssociationEnd<MaintenanceDelegationResponse3, Optional<GenericIdentification72>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegationResponse3.mmObject();
			isDerived = false;
			xmlTag = "MstrTMId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterTMIdentification";
			definition = "Master terminal manager identification.";
			previousVersion_lazy = () -> MaintenanceDelegationResponse2.mmMasterTMIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification72.mmObject();
		}

		@Override
		public Optional<GenericIdentification72> getValue(MaintenanceDelegationResponse3 obj) {
			return obj.getMasterTMIdentification();
		}

		@Override
		public void setValue(MaintenanceDelegationResponse3 obj, Optional<GenericIdentification72> value) {
			obj.setMasterTMIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DlgtnRspn", required = true)
	protected List<MaintenanceDelegation6> delegationResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6
	 * MaintenanceDelegation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse3
	 * MaintenanceDelegationResponse3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the delegation of a maintenance action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse2#mmDelegationResponse
	 * MaintenanceDelegationResponse2.mmDelegationResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegationResponse3, List<MaintenanceDelegation6>> mmDelegationResponse = new MMMessageAssociationEnd<MaintenanceDelegationResponse3, List<MaintenanceDelegation6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegationResponse3.mmObject();
			isDerived = false;
			xmlTag = "DlgtnRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationResponse";
			definition = "Information on the delegation of a maintenance action.";
			previousVersion_lazy = () -> MaintenanceDelegationResponse2.mmDelegationResponse;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MaintenanceDelegation6.mmObject();
		}

		@Override
		public List<MaintenanceDelegation6> getValue(MaintenanceDelegationResponse3 obj) {
			return obj.getDelegationResponse();
		}

		@Override
		public void setValue(MaintenanceDelegationResponse3 obj, List<MaintenanceDelegation6> value) {
			obj.setDelegationResponse(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegationResponse3.mmTMIdentification, com.tools20022.repository.msg.MaintenanceDelegationResponse3.mmMasterTMIdentification,
						com.tools20022.repository.msg.MaintenanceDelegationResponse3.mmDelegationResponse);
				messageBuildingBlock_lazy = () -> Arrays.asList(MaintenanceDelegationResponseV03.mmMaintenanceDelegationResponse);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegationResponse3";
				definition = "Information related to the request of maintenance delegations.";
				previousVersion_lazy = () -> MaintenanceDelegationResponse2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification72 getTMIdentification() {
		return tMIdentification;
	}

	public MaintenanceDelegationResponse3 setTMIdentification(GenericIdentification72 tMIdentification) {
		this.tMIdentification = Objects.requireNonNull(tMIdentification);
		return this;
	}

	public Optional<GenericIdentification72> getMasterTMIdentification() {
		return masterTMIdentification == null ? Optional.empty() : Optional.of(masterTMIdentification);
	}

	public MaintenanceDelegationResponse3 setMasterTMIdentification(GenericIdentification72 masterTMIdentification) {
		this.masterTMIdentification = masterTMIdentification;
		return this;
	}

	public List<MaintenanceDelegation6> getDelegationResponse() {
		return delegationResponse == null ? delegationResponse = new ArrayList<>() : delegationResponse;
	}

	public MaintenanceDelegationResponse3 setDelegationResponse(List<MaintenanceDelegation6> delegationResponse) {
		this.delegationResponse = Objects.requireNonNull(delegationResponse);
		return this;
	}
}