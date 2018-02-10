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
import com.tools20022.repository.area.catm.ManagementPlanReplacementV01;
import com.tools20022.repository.entity.SystemIdentification;
import com.tools20022.repository.entity.TerminalManagementAction;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Sequence of terminal management actions to be performed by a point of
 * interaction (POI).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ManagementPlan1#mmPOIIdentification
 * ManagementPlan1.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ManagementPlan1#mmTerminalManagerIdentification
 * ManagementPlan1.mmTerminalManagerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan1#mmDataSet
 * ManagementPlan1.mmDataSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
 * TerminalManagementAction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV01#mmManagementPlan
 * ManagementPlanReplacementV01.mmManagementPlan}</li>
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
 * "ManagementPlan1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Sequence of terminal management actions to be performed by a point of interaction (POI)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan2
 * ManagementPlan2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ManagementPlan1", propOrder = {"pOIIdentification", "terminalManagerIdentification", "dataSet"})
public class ManagementPlan1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "POIId")
	protected GenericIdentification35 pOIIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification35
	 * GenericIdentification35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentification
	 * SystemIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan1
	 * ManagementPlan1}</li>
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
	 * definition} =
	 * "Identification of the point of interaction for terminal management."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOIIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SystemIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ManagementPlan1.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the point of interaction for terminal management.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification35.mmObject();
		}
	};
	@XmlElement(name = "TermnlMgrId", required = true)
	protected GenericIdentification35 terminalManagerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification35
	 * GenericIdentification35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentification
	 * SystemIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan1
	 * ManagementPlan1}</li>
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
	 * "Identification of the terminal management system (TMS) sending the management plan."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminalManagerIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SystemIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ManagementPlan1.mmObject();
			isDerived = false;
			xmlTag = "TermnlMgrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalManagerIdentification";
			definition = "Identification of the terminal management system (TMS) sending the management plan.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification35.mmObject();
		}
	};
	@XmlElement(name = "DataSet", required = true)
	protected List<com.tools20022.repository.msg.TerminalManagementDataSet2> dataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet2
	 * TerminalManagementDataSet2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan1
	 * ManagementPlan1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data set related to the sequence of actions to be performed by a point of interaction (POI)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSet = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TerminalManagementAction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ManagementPlan1.mmObject();
			isDerived = false;
			xmlTag = "DataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSet";
			definition = "Data set related to the sequence of actions to be performed by a point of interaction (POI).";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ManagementPlan1.mmPOIIdentification, com.tools20022.repository.msg.ManagementPlan1.mmTerminalManagerIdentification,
						com.tools20022.repository.msg.ManagementPlan1.mmDataSet);
				messageBuildingBlock_lazy = () -> Arrays.asList(ManagementPlanReplacementV01.mmManagementPlan);
				trace_lazy = () -> TerminalManagementAction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ManagementPlan1";
				definition = "Sequence of terminal management actions to be performed by a point of interaction (POI).";
				nextVersions_lazy = () -> Arrays.asList(ManagementPlan2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<GenericIdentification35> getPOIIdentification() {
		return pOIIdentification == null ? Optional.empty() : Optional.of(pOIIdentification);
	}

	public ManagementPlan1 setPOIIdentification(com.tools20022.repository.msg.GenericIdentification35 pOIIdentification) {
		this.pOIIdentification = pOIIdentification;
		return this;
	}

	public GenericIdentification35 getTerminalManagerIdentification() {
		return terminalManagerIdentification;
	}

	public ManagementPlan1 setTerminalManagerIdentification(com.tools20022.repository.msg.GenericIdentification35 terminalManagerIdentification) {
		this.terminalManagerIdentification = Objects.requireNonNull(terminalManagerIdentification);
		return this;
	}

	public List<TerminalManagementDataSet2> getDataSet() {
		return dataSet == null ? dataSet = new ArrayList<>() : dataSet;
	}

	public ManagementPlan1 setDataSet(List<com.tools20022.repository.msg.TerminalManagementDataSet2> dataSet) {
		this.dataSet = Objects.requireNonNull(dataSet);
		return this;
	}
}