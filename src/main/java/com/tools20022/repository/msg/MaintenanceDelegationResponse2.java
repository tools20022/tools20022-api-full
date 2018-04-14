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
import com.tools20022.repository.area.catm.MaintenanceDelegationResponseV02;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification72;
import com.tools20022.repository.msg.MaintenanceDelegation4;
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
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse2#mmTMIdentification
 * MaintenanceDelegationResponse2.mmTMIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse2#mmMasterTMIdentification
 * MaintenanceDelegationResponse2.mmMasterTMIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse2#mmDelegationResponse
 * MaintenanceDelegationResponse2.mmDelegationResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV02#mmMaintenanceDelegationResponse
 * MaintenanceDelegationResponseV02.mmMaintenanceDelegationResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MaintenanceDelegationResponse2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the request of maintenance delegations."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse3
 * MaintenanceDelegationResponse3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse1
 * MaintenanceDelegationResponse1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MaintenanceDelegationResponse2", propOrder = {"tMIdentification", "masterTMIdentification", "delegationResponse"})
public class MaintenanceDelegationResponse2 {

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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse2
	 * MaintenanceDelegationResponse2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse3#mmTMIdentification
	 * MaintenanceDelegationResponse3.mmTMIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse1#mmTMIdentification
	 * MaintenanceDelegationResponse1.mmTMIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegationResponse2, GenericIdentification72> mmTMIdentification = new MMMessageAssociationEnd<MaintenanceDelegationResponse2, GenericIdentification72>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegationResponse2.mmObject();
			isDerived = false;
			xmlTag = "TMId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMIdentification";
			definition = "Terminal manager identification.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationResponse3.mmTMIdentification);
			previousVersion_lazy = () -> MaintenanceDelegationResponse1.mmTMIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification72.mmObject();
		}

		@Override
		public GenericIdentification72 getValue(MaintenanceDelegationResponse2 obj) {
			return obj.getTMIdentification();
		}

		@Override
		public void setValue(MaintenanceDelegationResponse2 obj, GenericIdentification72 value) {
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse2
	 * MaintenanceDelegationResponse2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse3#mmMasterTMIdentification
	 * MaintenanceDelegationResponse3.mmMasterTMIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse1#mmMasterTMIdentification
	 * MaintenanceDelegationResponse1.mmMasterTMIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegationResponse2, Optional<GenericIdentification72>> mmMasterTMIdentification = new MMMessageAssociationEnd<MaintenanceDelegationResponse2, Optional<GenericIdentification72>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegationResponse2.mmObject();
			isDerived = false;
			xmlTag = "MstrTMId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterTMIdentification";
			definition = "Master terminal manager identification.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationResponse3.mmMasterTMIdentification);
			previousVersion_lazy = () -> MaintenanceDelegationResponse1.mmMasterTMIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification72.mmObject();
		}

		@Override
		public Optional<GenericIdentification72> getValue(MaintenanceDelegationResponse2 obj) {
			return obj.getMasterTMIdentification();
		}

		@Override
		public void setValue(MaintenanceDelegationResponse2 obj, Optional<GenericIdentification72> value) {
			obj.setMasterTMIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DlgtnRspn", required = true)
	protected List<MaintenanceDelegation4> delegationResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4
	 * MaintenanceDelegation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse2
	 * MaintenanceDelegationResponse2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse3#mmDelegationResponse
	 * MaintenanceDelegationResponse3.mmDelegationResponse}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse1#mmDelegationResponse
	 * MaintenanceDelegationResponse1.mmDelegationResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegationResponse2, List<MaintenanceDelegation4>> mmDelegationResponse = new MMMessageAssociationEnd<MaintenanceDelegationResponse2, List<MaintenanceDelegation4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegationResponse2.mmObject();
			isDerived = false;
			xmlTag = "DlgtnRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationResponse";
			definition = "Information on the delegation of a maintenance action.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationResponse3.mmDelegationResponse);
			previousVersion_lazy = () -> MaintenanceDelegationResponse1.mmDelegationResponse;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MaintenanceDelegation4.mmObject();
		}

		@Override
		public List<MaintenanceDelegation4> getValue(MaintenanceDelegationResponse2 obj) {
			return obj.getDelegationResponse();
		}

		@Override
		public void setValue(MaintenanceDelegationResponse2 obj, List<MaintenanceDelegation4> value) {
			obj.setDelegationResponse(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegationResponse2.mmTMIdentification, com.tools20022.repository.msg.MaintenanceDelegationResponse2.mmMasterTMIdentification,
						com.tools20022.repository.msg.MaintenanceDelegationResponse2.mmDelegationResponse);
				messageBuildingBlock_lazy = () -> Arrays.asList(MaintenanceDelegationResponseV02.mmMaintenanceDelegationResponse);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegationResponse2";
				definition = "Information related to the request of maintenance delegations.";
				nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationResponse3.mmObject());
				previousVersion_lazy = () -> MaintenanceDelegationResponse1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification72 getTMIdentification() {
		return tMIdentification;
	}

	public MaintenanceDelegationResponse2 setTMIdentification(GenericIdentification72 tMIdentification) {
		this.tMIdentification = Objects.requireNonNull(tMIdentification);
		return this;
	}

	public Optional<GenericIdentification72> getMasterTMIdentification() {
		return masterTMIdentification == null ? Optional.empty() : Optional.of(masterTMIdentification);
	}

	public MaintenanceDelegationResponse2 setMasterTMIdentification(GenericIdentification72 masterTMIdentification) {
		this.masterTMIdentification = masterTMIdentification;
		return this;
	}

	public List<MaintenanceDelegation4> getDelegationResponse() {
		return delegationResponse == null ? delegationResponse = new ArrayList<>() : delegationResponse;
	}

	public MaintenanceDelegationResponse2 setDelegationResponse(List<MaintenanceDelegation4> delegationResponse) {
		this.delegationResponse = Objects.requireNonNull(delegationResponse);
		return this;
	}
}