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
import com.tools20022.repository.area.catm.ManagementPlanReplacementV04;
import com.tools20022.repository.entity.SystemIdentification;
import com.tools20022.repository.entity.TerminalManagementAction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification71;
import com.tools20022.repository.msg.TerminalManagementDataSet15;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.ManagementPlan4#mmPOIIdentification
 * ManagementPlan4.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ManagementPlan4#mmTerminalManagerIdentification
 * ManagementPlan4.mmTerminalManagerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan4#mmDataSet
 * ManagementPlan4.mmDataSet}</li>
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
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV04#mmManagementPlan
 * ManagementPlanReplacementV04.mmManagementPlan}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ManagementPlan4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Sequence of terminal management actions to be performed by a point of interaction (POI)."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan5
 * ManagementPlan5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ManagementPlan3
 * ManagementPlan3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ManagementPlan4", propOrder = {"pOIIdentification", "terminalManagerIdentification", "dataSet"})
public class ManagementPlan4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "POIId")
	protected GenericIdentification71 pOIIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentification
	 * SystemIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan4
	 * ManagementPlan4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the point of interaction (POI) for terminal management."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan5#mmPOIIdentification
	 * ManagementPlan5.mmPOIIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan3#mmPOIIdentification
	 * ManagementPlan3.mmPOIIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ManagementPlan4, Optional<GenericIdentification71>> mmPOIIdentification = new MMMessageAssociationEnd<ManagementPlan4, Optional<GenericIdentification71>>() {
		{
			businessElementTrace_lazy = () -> SystemIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ManagementPlan4.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the point of interaction (POI) for terminal management.";
			nextVersions_lazy = () -> Arrays.asList(ManagementPlan5.mmPOIIdentification);
			previousVersion_lazy = () -> ManagementPlan3.mmPOIIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification71.mmObject();
		}

		@Override
		public Optional<GenericIdentification71> getValue(ManagementPlan4 obj) {
			return obj.getPOIIdentification();
		}

		@Override
		public void setValue(ManagementPlan4 obj, Optional<GenericIdentification71> value) {
			obj.setPOIIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TermnlMgrId", required = true)
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentification
	 * SystemIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan4
	 * ManagementPlan4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermnlMgrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManagerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the terminal management system (TMS) sending the management plan."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan5#mmTerminalManagerIdentification
	 * ManagementPlan5.mmTerminalManagerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan3#mmTerminalManagerIdentification
	 * ManagementPlan3.mmTerminalManagerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ManagementPlan4, GenericIdentification71> mmTerminalManagerIdentification = new MMMessageAssociationEnd<ManagementPlan4, GenericIdentification71>() {
		{
			businessElementTrace_lazy = () -> SystemIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ManagementPlan4.mmObject();
			isDerived = false;
			xmlTag = "TermnlMgrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalManagerIdentification";
			definition = "Identification of the terminal management system (TMS) sending the management plan.";
			nextVersions_lazy = () -> Arrays.asList(ManagementPlan5.mmTerminalManagerIdentification);
			previousVersion_lazy = () -> ManagementPlan3.mmTerminalManagerIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification71.mmObject();
		}

		@Override
		public GenericIdentification71 getValue(ManagementPlan4 obj) {
			return obj.getTerminalManagerIdentification();
		}

		@Override
		public void setValue(ManagementPlan4 obj, GenericIdentification71 value) {
			obj.setTerminalManagerIdentification(value);
		}
	};
	@XmlElement(name = "DataSet", required = true)
	protected TerminalManagementDataSet15 dataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet15
	 * TerminalManagementDataSet15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan4
	 * ManagementPlan4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSet"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data set related to the sequence of actions to be performed by a point of interaction (POI)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlan5#mmDataSet
	 * ManagementPlan5.mmDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan3#mmDataSet
	 * ManagementPlan3.mmDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ManagementPlan4, TerminalManagementDataSet15> mmDataSet = new MMMessageAssociationEnd<ManagementPlan4, TerminalManagementDataSet15>() {
		{
			businessComponentTrace_lazy = () -> TerminalManagementAction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ManagementPlan4.mmObject();
			isDerived = false;
			xmlTag = "DataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSet";
			definition = "Data set related to the sequence of actions to be performed by a point of interaction (POI).";
			nextVersions_lazy = () -> Arrays.asList(ManagementPlan5.mmDataSet);
			previousVersion_lazy = () -> ManagementPlan3.mmDataSet;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TerminalManagementDataSet15.mmObject();
		}

		@Override
		public TerminalManagementDataSet15 getValue(ManagementPlan4 obj) {
			return obj.getDataSet();
		}

		@Override
		public void setValue(ManagementPlan4 obj, TerminalManagementDataSet15 value) {
			obj.setDataSet(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ManagementPlan4.mmPOIIdentification, com.tools20022.repository.msg.ManagementPlan4.mmTerminalManagerIdentification,
						com.tools20022.repository.msg.ManagementPlan4.mmDataSet);
				messageBuildingBlock_lazy = () -> Arrays.asList(ManagementPlanReplacementV04.mmManagementPlan);
				trace_lazy = () -> TerminalManagementAction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ManagementPlan4";
				definition = "Sequence of terminal management actions to be performed by a point of interaction (POI).";
				nextVersions_lazy = () -> Arrays.asList(ManagementPlan5.mmObject());
				previousVersion_lazy = () -> ManagementPlan3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<GenericIdentification71> getPOIIdentification() {
		return pOIIdentification == null ? Optional.empty() : Optional.of(pOIIdentification);
	}

	public ManagementPlan4 setPOIIdentification(GenericIdentification71 pOIIdentification) {
		this.pOIIdentification = pOIIdentification;
		return this;
	}

	public GenericIdentification71 getTerminalManagerIdentification() {
		return terminalManagerIdentification;
	}

	public ManagementPlan4 setTerminalManagerIdentification(GenericIdentification71 terminalManagerIdentification) {
		this.terminalManagerIdentification = Objects.requireNonNull(terminalManagerIdentification);
		return this;
	}

	public TerminalManagementDataSet15 getDataSet() {
		return dataSet;
	}

	public ManagementPlan4 setDataSet(TerminalManagementDataSet15 dataSet) {
		this.dataSet = Objects.requireNonNull(dataSet);
		return this;
	}
}