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

package com.tools20022.repository.area.auth;

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.msg.ScenarioDefinition1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CentralCounterPartyCCPDataReporting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The CCPPortfolioStressTestingDefinitionReport is sent from the central
 * counterparty to the national competent authority. It is used to inform the
 * national competent authority about how the central counterparty defines
 * stress scenarios used to stress clearing member portfolios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPPortfolioStressTestingDefinitionReportV01#mmScenarioDefinition
 * CCPPortfolioStressTestingDefinitionReportV01.mmScenarioDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPPortfolioStressTestingDefinitionReportV01#mmSupplementaryData
 * CCPPortfolioStressTestingDefinitionReportV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CentralCounterPartyCCPDataReporting
 * CentralCounterPartyCCPDataReporting}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CCPPrtflStrssTstgDefRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.057.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=prefix, prefix=DRAFT3</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CCPPortfolioStressTestingDefinitionReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The CCPPortfolioStressTestingDefinitionReport is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority about how the central counterparty defines stress scenarios used to stress clearing member portfolios."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CCPPortfolioStressTestingDefinitionReportV01", propOrder = {"scenarioDefinition", "supplementaryData"})
public class CCPPortfolioStressTestingDefinitionReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ScnroDef", required = true)
	protected List<ScenarioDefinition1> scenarioDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ScenarioDefinition1
	 * ScenarioDefinition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScnroDef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScenarioDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains high level data on a stress scenario being applied to portfolios in order to calculate stress losses."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CCPPortfolioStressTestingDefinitionReportV01, List<ScenarioDefinition1>> mmScenarioDefinition = new MMMessageBuildingBlock<CCPPortfolioStressTestingDefinitionReportV01, List<ScenarioDefinition1>>() {
		{
			xmlTag = "ScnroDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScenarioDefinition";
			definition = "Contains high level data on a stress scenario being applied to portfolios in order to calculate stress losses.";
			minOccurs = 1;
			complexType_lazy = () -> ScenarioDefinition1.mmObject();
		}

		@Override
		public List<ScenarioDefinition1> getValue(CCPPortfolioStressTestingDefinitionReportV01 obj) {
			return obj.getScenarioDefinition();
		}

		@Override
		public void setValue(CCPPortfolioStressTestingDefinitionReportV01 obj, List<ScenarioDefinition1> value) {
			obj.setScenarioDefinition(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CCPPortfolioStressTestingDefinitionReportV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CCPPortfolioStressTestingDefinitionReportV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CCPPortfolioStressTestingDefinitionReportV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CCPPortfolioStressTestingDefinitionReportV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "prefix", new String[]{"prefix", "DRAFT3"}));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CCPPortfolioStressTestingDefinitionReportV01";
				definition = "The CCPPortfolioStressTestingDefinitionReport is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority about how the central counterparty defines stress scenarios used to stress clearing member portfolios.";
				messageSet_lazy = () -> Arrays.asList(CentralCounterPartyCCPDataReporting.mmObject());
				rootElement = "Document";
				xmlTag = "CCPPrtflStrssTstgDefRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.CCPPortfolioStressTestingDefinitionReportV01.mmScenarioDefinition,
						com.tools20022.repository.area.auth.CCPPortfolioStressTestingDefinitionReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "057";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CCPPortfolioStressTestingDefinitionReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<ScenarioDefinition1> getScenarioDefinition() {
		return scenarioDefinition == null ? scenarioDefinition = new ArrayList<>() : scenarioDefinition;
	}

	public CCPPortfolioStressTestingDefinitionReportV01 setScenarioDefinition(List<ScenarioDefinition1> scenarioDefinition) {
		this.scenarioDefinition = Objects.requireNonNull(scenarioDefinition);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CCPPortfolioStressTestingDefinitionReportV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.057.001.01")
	static public class Document {
		@XmlElement(name = "CCPPrtflStrssTstgDefRpt", required = true)
		public CCPPortfolioStressTestingDefinitionReportV01 messageBody;
	}
}