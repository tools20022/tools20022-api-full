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
import com.tools20022.repository.area.catm.StatusReportV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification35;
import com.tools20022.repository.msg.TerminalManagementDataSet1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status of the acceptor system containing the identification of the POI, its
 * components and their installed versions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReport1#mmPOIIdentification
 * StatusReport1.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReport1#mmTerminalManagerIdentification
 * StatusReport1.mmTerminalManagerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReport1#mmDataSet
 * StatusReport1.mmDataSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.StatusReportV01#mmStatusReport
 * StatusReportV01.mmStatusReport}</li>
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
 * "StatusReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of the acceptor system containing the identification of the POI, its components and their installed versions."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReport2 StatusReport2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatusReport1", propOrder = {"pOIIdentification", "terminalManagerIdentification", "dataSet"})
public class StatusReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "POIId", required = true)
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReport1 StatusReport1}</li>
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
	public static final MMMessageAssociationEnd<StatusReport1, GenericIdentification35> mmPOIIdentification = new MMMessageAssociationEnd<StatusReport1, GenericIdentification35>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReport1.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the point of interaction for terminal management.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification35.mmObject();
		}

		@Override
		public GenericIdentification35 getValue(StatusReport1 obj) {
			return obj.getPOIIdentification();
		}

		@Override
		public void setValue(StatusReport1 obj, GenericIdentification35 value) {
			obj.setPOIIdentification(value);
		}
	};
	@XmlElement(name = "TermnlMgrId")
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReport1 StatusReport1}</li>
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
	 * "Identification of the terminal management system (TMS) to contact for the maintenance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusReport1, Optional<GenericIdentification35>> mmTerminalManagerIdentification = new MMMessageAssociationEnd<StatusReport1, Optional<GenericIdentification35>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReport1.mmObject();
			isDerived = false;
			xmlTag = "TermnlMgrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalManagerIdentification";
			definition = "Identification of the terminal management system (TMS) to contact for the maintenance.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification35.mmObject();
		}

		@Override
		public Optional<GenericIdentification35> getValue(StatusReport1 obj) {
			return obj.getTerminalManagerIdentification();
		}

		@Override
		public void setValue(StatusReport1 obj, Optional<GenericIdentification35> value) {
			obj.setTerminalManagerIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DataSet", required = true)
	protected List<TerminalManagementDataSet1> dataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet1
	 * TerminalManagementDataSet1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReport1 StatusReport1}</li>
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
	 * "Data related to a status report of a point of interaction (POI)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusReport1, List<TerminalManagementDataSet1>> mmDataSet = new MMMessageAssociationEnd<StatusReport1, List<TerminalManagementDataSet1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReport1.mmObject();
			isDerived = false;
			xmlTag = "DataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSet";
			definition = "Data related to a status report of a point of interaction (POI).";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TerminalManagementDataSet1.mmObject();
		}

		@Override
		public List<TerminalManagementDataSet1> getValue(StatusReport1 obj) {
			return obj.getDataSet();
		}

		@Override
		public void setValue(StatusReport1 obj, List<TerminalManagementDataSet1> value) {
			obj.setDataSet(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusReport1.mmPOIIdentification, com.tools20022.repository.msg.StatusReport1.mmTerminalManagerIdentification,
						com.tools20022.repository.msg.StatusReport1.mmDataSet);
				messageBuildingBlock_lazy = () -> Arrays.asList(StatusReportV01.mmStatusReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusReport1";
				definition = "Status of the acceptor system containing the identification of the POI, its components and their installed versions.";
				nextVersions_lazy = () -> Arrays.asList(StatusReport2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification35 getPOIIdentification() {
		return pOIIdentification;
	}

	public StatusReport1 setPOIIdentification(GenericIdentification35 pOIIdentification) {
		this.pOIIdentification = Objects.requireNonNull(pOIIdentification);
		return this;
	}

	public Optional<GenericIdentification35> getTerminalManagerIdentification() {
		return terminalManagerIdentification == null ? Optional.empty() : Optional.of(terminalManagerIdentification);
	}

	public StatusReport1 setTerminalManagerIdentification(GenericIdentification35 terminalManagerIdentification) {
		this.terminalManagerIdentification = terminalManagerIdentification;
		return this;
	}

	public List<TerminalManagementDataSet1> getDataSet() {
		return dataSet == null ? dataSet = new ArrayList<>() : dataSet;
	}

	public StatusReport1 setDataSet(List<TerminalManagementDataSet1> dataSet) {
		this.dataSet = Objects.requireNonNull(dataSet);
		return this;
	}
}