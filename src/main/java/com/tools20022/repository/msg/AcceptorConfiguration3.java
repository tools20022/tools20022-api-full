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
import com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3#mmPOIIdentification
 * AcceptorConfiguration3.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3#mmTerminalManagerIdentification
 * AcceptorConfiguration3.mmTerminalManagerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3#mmDataSet
 * AcceptorConfiguration3.mmDataSet}</li>
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
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03#mmAcceptorConfiguration
 * AcceptorConfigurationUpdateV03.mmAcceptorConfiguration}</li>
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
 * "AcceptorConfiguration3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Acceptor configuration to be downloaded from the terminal management system."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfiguration4
 * AcceptorConfiguration4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration2
 * AcceptorConfiguration2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AcceptorConfiguration3", propOrder = {"POIIdentification", "terminalManagerIdentification", "dataSet"})
public class AcceptorConfiguration3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification35 pOIIdentification;
	/**
	 * Identification of the point of interaction for terminal management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification35
	 * GenericIdentification35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.System#mmSystemIdentification
	 * System.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3
	 * AcceptorConfiguration3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration4#mmPOIIdentification
	 * AcceptorConfiguration4.mmPOIIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration2#mmPOIIdentification
	 * AcceptorConfiguration2.mmPOIIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOIIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> System.mmSystemIdentification;
			componentContext_lazy = () -> AcceptorConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the point of interaction for terminal management.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfiguration4.mmPOIIdentification);
			previousVersion_lazy = () -> AcceptorConfiguration2.mmPOIIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification35.mmObject();
		}
	};
	protected GenericIdentification35 terminalManagerIdentification;
	/**
	 * Identification of the terminal management system (TMS) sending the
	 * acceptor parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification35
	 * GenericIdentification35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.System#mmSystemIdentification
	 * System.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3
	 * AcceptorConfiguration3}</li>
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
	 * "Identification of the terminal management system (TMS) sending the acceptor parameters."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration4#mmTerminalManagerIdentification
	 * AcceptorConfiguration4.mmTerminalManagerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration2#mmTerminalManagerIdentification
	 * AcceptorConfiguration2.mmTerminalManagerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminalManagerIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> System.mmSystemIdentification;
			componentContext_lazy = () -> AcceptorConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "TermnlMgrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalManagerIdentification";
			definition = "Identification of the terminal management system (TMS) sending the acceptor parameters.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfiguration4.mmTerminalManagerIdentification);
			previousVersion_lazy = () -> AcceptorConfiguration2.mmTerminalManagerIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification35.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TerminalManagementDataSet11> dataSet;
	/**
	 * Data set containing the acceptor parameters of a point of interaction
	 * (POI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet11
	 * TerminalManagementDataSet11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3
	 * AcceptorConfiguration3}</li>
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
	 * "Data set containing the acceptor parameters of a point of interaction (POI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration4#mmDataSet
	 * AcceptorConfiguration4.mmDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration2#mmDataSet
	 * AcceptorConfiguration2.mmDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSet = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcceptorConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "DataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSet";
			definition = "Data set containing the acceptor parameters of a point of interaction (POI).";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfiguration4.mmDataSet);
			previousVersion_lazy = () -> AcceptorConfiguration2.mmDataSet;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet11.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AcceptorConfiguration3.mmPOIIdentification, AcceptorConfiguration3.mmTerminalManagerIdentification, AcceptorConfiguration3.mmDataSet);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV03.mmAcceptorConfiguration);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfiguration3";
				definition = "Acceptor configuration to be downloaded from the terminal management system.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorConfiguration4.mmObject());
				previousVersion_lazy = () -> AcceptorConfiguration2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "POIId")
	public GenericIdentification35 getPOIIdentification() {
		return pOIIdentification;
	}

	public void setPOIIdentification(com.tools20022.repository.msg.GenericIdentification35 pOIIdentification) {
		this.pOIIdentification = pOIIdentification;
	}

	@XmlElement(name = "TermnlMgrId", required = true)
	public GenericIdentification35 getTerminalManagerIdentification() {
		return terminalManagerIdentification;
	}

	public void setTerminalManagerIdentification(com.tools20022.repository.msg.GenericIdentification35 terminalManagerIdentification) {
		this.terminalManagerIdentification = terminalManagerIdentification;
	}

	@XmlElement(name = "DataSet", required = true)
	public List<TerminalManagementDataSet11> getDataSet() {
		return dataSet;
	}

	public void setDataSet(List<com.tools20022.repository.msg.TerminalManagementDataSet11> dataSet) {
		this.dataSet = dataSet;
	}
}