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
import com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification71;
import com.tools20022.repository.msg.TerminalManagementDataSet14;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Acceptor configuration to be downloaded from the terminal management system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration4#mmPOIIdentification
 * AcceptorConfiguration4.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration4#mmTerminalManagerIdentification
 * AcceptorConfiguration4.mmTerminalManagerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration4#mmDataSet
 * AcceptorConfiguration4.mmDataSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
 * AcceptorConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04#mmAcceptorConfiguration
 * AcceptorConfigurationUpdateV04.mmAcceptorConfiguration}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorConfiguration4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Acceptor configuration to be downloaded from the terminal management system."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfiguration5
 * AcceptorConfiguration5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3
 * AcceptorConfiguration3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorConfiguration4", propOrder = {"pOIIdentification", "terminalManagerIdentification", "dataSet"})
public class AcceptorConfiguration4 {

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
	 * {@linkplain com.tools20022.repository.entity.System#mmSystemIdentification
	 * System.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration4
	 * AcceptorConfiguration4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the point of interaction for terminal management."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3#mmPOIIdentification
	 * AcceptorConfiguration3.mmPOIIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorConfiguration4, Optional<GenericIdentification71>> mmPOIIdentification = new MMMessageAssociationEnd<AcceptorConfiguration4, Optional<GenericIdentification71>>() {
		{
			businessElementTrace_lazy = () -> System.mmSystemIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the point of interaction for terminal management.";
			previousVersion_lazy = () -> AcceptorConfiguration3.mmPOIIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification71.mmObject();
		}

		@Override
		public Optional<GenericIdentification71> getValue(AcceptorConfiguration4 obj) {
			return obj.getPOIIdentification();
		}

		@Override
		public void setValue(AcceptorConfiguration4 obj, Optional<GenericIdentification71> value) {
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
	 * {@linkplain com.tools20022.repository.entity.System#mmSystemIdentification
	 * System.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration4
	 * AcceptorConfiguration4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermnlMgrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManagerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the terminal management system (TMS) sending the acceptor parameters."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration5#mmTerminalManagerIdentification
	 * AcceptorConfiguration5.mmTerminalManagerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3#mmTerminalManagerIdentification
	 * AcceptorConfiguration3.mmTerminalManagerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorConfiguration4, GenericIdentification71> mmTerminalManagerIdentification = new MMMessageAssociationEnd<AcceptorConfiguration4, GenericIdentification71>() {
		{
			businessElementTrace_lazy = () -> System.mmSystemIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "TermnlMgrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalManagerIdentification";
			definition = "Identification of the terminal management system (TMS) sending the acceptor parameters.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfiguration5.mmTerminalManagerIdentification);
			previousVersion_lazy = () -> AcceptorConfiguration3.mmTerminalManagerIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification71.mmObject();
		}

		@Override
		public GenericIdentification71 getValue(AcceptorConfiguration4 obj) {
			return obj.getTerminalManagerIdentification();
		}

		@Override
		public void setValue(AcceptorConfiguration4 obj, GenericIdentification71 value) {
			obj.setTerminalManagerIdentification(value);
		}
	};
	@XmlElement(name = "DataSet", required = true)
	protected List<TerminalManagementDataSet14> dataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet14
	 * TerminalManagementDataSet14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration4
	 * AcceptorConfiguration4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSet"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data set containing the acceptor parameters of a point of interaction (POI)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration5#mmDataSet
	 * AcceptorConfiguration5.mmDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3#mmDataSet
	 * AcceptorConfiguration3.mmDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorConfiguration4, List<TerminalManagementDataSet14>> mmDataSet = new MMMessageAssociationEnd<AcceptorConfiguration4, List<TerminalManagementDataSet14>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "DataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSet";
			definition = "Data set containing the acceptor parameters of a point of interaction (POI).";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfiguration5.mmDataSet);
			previousVersion_lazy = () -> AcceptorConfiguration3.mmDataSet;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TerminalManagementDataSet14.mmObject();
		}

		@Override
		public List<TerminalManagementDataSet14> getValue(AcceptorConfiguration4 obj) {
			return obj.getDataSet();
		}

		@Override
		public void setValue(AcceptorConfiguration4 obj, List<TerminalManagementDataSet14> value) {
			obj.setDataSet(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorConfiguration4.mmPOIIdentification, com.tools20022.repository.msg.AcceptorConfiguration4.mmTerminalManagerIdentification,
						com.tools20022.repository.msg.AcceptorConfiguration4.mmDataSet);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV04.mmAcceptorConfiguration);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfiguration4";
				definition = "Acceptor configuration to be downloaded from the terminal management system.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorConfiguration5.mmObject());
				previousVersion_lazy = () -> AcceptorConfiguration3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<GenericIdentification71> getPOIIdentification() {
		return pOIIdentification == null ? Optional.empty() : Optional.of(pOIIdentification);
	}

	public AcceptorConfiguration4 setPOIIdentification(GenericIdentification71 pOIIdentification) {
		this.pOIIdentification = pOIIdentification;
		return this;
	}

	public GenericIdentification71 getTerminalManagerIdentification() {
		return terminalManagerIdentification;
	}

	public AcceptorConfiguration4 setTerminalManagerIdentification(GenericIdentification71 terminalManagerIdentification) {
		this.terminalManagerIdentification = Objects.requireNonNull(terminalManagerIdentification);
		return this;
	}

	public List<TerminalManagementDataSet14> getDataSet() {
		return dataSet == null ? dataSet = new ArrayList<>() : dataSet;
	}

	public AcceptorConfiguration4 setDataSet(List<TerminalManagementDataSet14> dataSet) {
		this.dataSet = Objects.requireNonNull(dataSet);
		return this;
	}
}