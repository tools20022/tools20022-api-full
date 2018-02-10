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
import com.tools20022.repository.msg.LiquidityStressScenarioDefinition1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CentralCounterPartyCCPDataReporting;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The CCPLiquidityStressTestingDefinitionReport is sent from the central
 * counterparty to the national competent authority. It is used to inform the
 * national competent authority about how the central counterparty defines
 * liquidity stress scenarios used to stress the liquidity resources and
 * requirements of the CCP.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPLiquidityStressTestingDefinitionReportV01#mmLiquidityStressScenarioDefinition
 * CCPLiquidityStressTestingDefinitionReportV01.
 * mmLiquidityStressScenarioDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPLiquidityStressTestingDefinitionReportV01#mmSupplementaryData
 * CCPLiquidityStressTestingDefinitionReportV01.mmSupplementaryData}</li>
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
 * xmlTag} = "CCPLqdtyStrssTstgDefRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.062.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=prefix, prefix=DRAFT4</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CCPLiquidityStressTestingDefinitionReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The CCPLiquidityStressTestingDefinitionReport is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority about how the central counterparty defines liquidity stress scenarios used to stress the liquidity resources and requirements of the CCP."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CCPLiquidityStressTestingDefinitionReportV01", propOrder = {"liquidityStressScenarioDefinition", "supplementaryData"})
public class CCPLiquidityStressTestingDefinitionReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LqdtyStrssScnroDef", required = true)
	protected List<LiquidityStressScenarioDefinition1> liquidityStressScenarioDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityStressScenarioDefinition1
	 * LiquidityStressScenarioDefinition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LqdtyStrssScnroDef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityStressScenarioDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scenario used to stress the liquidity needs of the CCP."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmLiquidityStressScenarioDefinition = new MMMessageBuildingBlock() {
		{
			xmlTag = "LqdtyStrssScnroDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityStressScenarioDefinition";
			definition = "Scenario used to stress the liquidity needs of the CCP.";
			minOccurs = 1;
			complexType_lazy = () -> LiquidityStressScenarioDefinition1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CCPLiquidityStressTestingDefinitionReportV01.class.getMethod("getLiquidityStressScenarioDefinition", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CCPLiquidityStressTestingDefinitionReportV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "prefix", new String[]{"prefix", "DRAFT4"}));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CCPLiquidityStressTestingDefinitionReportV01";
				definition = "The CCPLiquidityStressTestingDefinitionReport is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority about how the central counterparty defines liquidity stress scenarios used to stress the liquidity resources and requirements of the CCP.";
				messageSet_lazy = () -> Arrays.asList(CentralCounterPartyCCPDataReporting.mmObject());
				rootElement = "Document";
				xmlTag = "CCPLqdtyStrssTstgDefRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.CCPLiquidityStressTestingDefinitionReportV01.mmLiquidityStressScenarioDefinition,
						com.tools20022.repository.area.auth.CCPLiquidityStressTestingDefinitionReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "062";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CCPLiquidityStressTestingDefinitionReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<LiquidityStressScenarioDefinition1> getLiquidityStressScenarioDefinition() {
		return liquidityStressScenarioDefinition == null ? liquidityStressScenarioDefinition = new ArrayList<>() : liquidityStressScenarioDefinition;
	}

	public CCPLiquidityStressTestingDefinitionReportV01 setLiquidityStressScenarioDefinition(List<LiquidityStressScenarioDefinition1> liquidityStressScenarioDefinition) {
		this.liquidityStressScenarioDefinition = Objects.requireNonNull(liquidityStressScenarioDefinition);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CCPLiquidityStressTestingDefinitionReportV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.062.001.01")
	static public class Document {
		@XmlElement(name = "CCPLqdtyStrssTstgDefRpt", required = true)
		public CCPLiquidityStressTestingDefinitionReportV01 messageBody;
	}
}