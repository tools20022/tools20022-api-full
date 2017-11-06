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
import com.tools20022.repository.choice.NettingIdentification1Choice;
import com.tools20022.repository.entity.Netting;
import com.tools20022.repository.entity.SystemAvailability;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides the details for one to many netting cut off update requests to be
 * actioned by a central system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOff1#mmNettingIdentification
 * NettingCutOff1.mmNettingIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NettingCutOff1#mmNewCutOff
 * NettingCutOff1.mmNewCutOff}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Netting Netting}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.NettingCutOffReferenceDataUpdateRequestV01#mmNettingCutOffRequest
 * NettingCutOffReferenceDataUpdateRequestV01.mmNettingCutOffRequest}</li>
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
 * "NettingCutOff1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details for one to many netting cut off update requests to be actioned by a central system."
 * </li>
 * </ul>
 */
public class NettingCutOff1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected NettingIdentification1Choice nettingIdentification;
	/**
	 * Identifies the netting party or group.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NettingIdentification1Choice
	 * NettingIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOff1 NettingCutOff1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the netting party or group."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNettingIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> NettingCutOff1.mmObject();
			isDerived = false;
			xmlTag = "NetgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettingIdentification";
			definition = "Identifies the netting party or group.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NettingIdentification1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CutOff1> newCutOff;
	/**
	 * Specifies the information regarding the updated netting cut off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CutOff1 CutOff1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability
	 * SystemAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOff1 NettingCutOff1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the information regarding the updated netting cut off."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewCutOff = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SystemAvailability.mmObject();
			componentContext_lazy = () -> NettingCutOff1.mmObject();
			isDerived = false;
			xmlTag = "NewCutOff";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewCutOff";
			definition = "Specifies the information regarding the updated netting cut off.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CutOff1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NettingCutOff1.mmNettingIdentification, com.tools20022.repository.msg.NettingCutOff1.mmNewCutOff);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.reda.NettingCutOffReferenceDataUpdateRequestV01.mmNettingCutOffRequest);
				trace_lazy = () -> Netting.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NettingCutOff1";
				definition = "Provides the details for one to many netting cut off update requests to be actioned by a central system.";
			}
		});
		return mmObject_lazy.get();
	}

	public NettingIdentification1Choice getNettingIdentification() {
		return nettingIdentification;
	}

	public void setNettingIdentification(NettingIdentification1Choice nettingIdentification) {
		this.nettingIdentification = nettingIdentification;
	}

	public List<CutOff1> getNewCutOff() {
		return newCutOff;
	}

	public void setNewCutOff(List<com.tools20022.repository.msg.CutOff1> newCutOff) {
		this.newCutOff = newCutOff;
	}
}