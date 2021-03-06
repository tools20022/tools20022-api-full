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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.msg.CapitalRequirement1;
import com.tools20022.repository.msg.HypotheticalCapitalMeasure1;
import com.tools20022.repository.msg.IncomeStatement1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CentralCounterPartyCCPDataReporting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The CCPIncomeStatementAndCapitalAdequacyReport is sent from the central
 * counterparty to the national competent authority. It is used to inform the
 * national competent authority about the financial performance and regulatory
 * capital holdings of the central counterpary.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.059.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01#mmIncomeStatement
 * CCPIncomeStatementAndCapitalAdequacyReportV01.mmIncomeStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01#mmCapitalRequirements
 * CCPIncomeStatementAndCapitalAdequacyReportV01.mmCapitalRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01#mmTotalCapital
 * CCPIncomeStatementAndCapitalAdequacyReportV01.mmTotalCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01#mmLiquidFinancialResources
 * CCPIncomeStatementAndCapitalAdequacyReportV01.mmLiquidFinancialResources}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01#mmHypotheticalCapitalMeasure
 * CCPIncomeStatementAndCapitalAdequacyReportV01.mmHypotheticalCapitalMeasure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01#mmSupplementaryData
 * CCPIncomeStatementAndCapitalAdequacyReportV01.mmSupplementaryData}</li>
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
 * xmlTag} = "CCPIncmStmtAndCptlAdqcyRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CCPIncomeStatementAndCapitalAdequacyReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The CCPIncomeStatementAndCapitalAdequacyReport is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority about the financial performance and regulatory capital holdings of the central counterpary."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=prefix, prefix=DRAFT2</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CCPIncomeStatementAndCapitalAdequacyReportV01", propOrder = {"incomeStatement", "capitalRequirements", "totalCapital", "liquidFinancialResources", "hypotheticalCapitalMeasure", "supplementaryData"})
public class CCPIncomeStatementAndCapitalAdequacyReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IncmStmt", required = true)
	protected IncomeStatement1 incomeStatement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IncomeStatement1
	 * IncomeStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmStmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeStatement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income statement of the CCP."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CCPIncomeStatementAndCapitalAdequacyReportV01, IncomeStatement1> mmIncomeStatement = new MMMessageBuildingBlock<CCPIncomeStatementAndCapitalAdequacyReportV01, IncomeStatement1>() {
		{
			xmlTag = "IncmStmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeStatement";
			definition = "Income statement of the CCP.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IncomeStatement1.mmObject();
		}

		@Override
		public IncomeStatement1 getValue(CCPIncomeStatementAndCapitalAdequacyReportV01 obj) {
			return obj.getIncomeStatement();
		}

		@Override
		public void setValue(CCPIncomeStatementAndCapitalAdequacyReportV01 obj, IncomeStatement1 value) {
			obj.setIncomeStatement(value);
		}
	};
	@XmlElement(name = "CptlRqrmnts", required = true)
	protected CapitalRequirement1 capitalRequirements;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CapitalRequirement1
	 * CapitalRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CptlRqrmnts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalRequirements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Report of the breakdown of the components for the capital requirement for central counterparty."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CCPIncomeStatementAndCapitalAdequacyReportV01, CapitalRequirement1> mmCapitalRequirements = new MMMessageBuildingBlock<CCPIncomeStatementAndCapitalAdequacyReportV01, CapitalRequirement1>() {
		{
			xmlTag = "CptlRqrmnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalRequirements";
			definition = "Report of the breakdown of the components for the capital requirement for central counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CapitalRequirement1.mmObject();
		}

		@Override
		public CapitalRequirement1 getValue(CCPIncomeStatementAndCapitalAdequacyReportV01 obj) {
			return obj.getCapitalRequirements();
		}

		@Override
		public void setValue(CCPIncomeStatementAndCapitalAdequacyReportV01 obj, CapitalRequirement1 value) {
			obj.setCapitalRequirements(value);
		}
	};
	@XmlElement(name = "TtlCptl", required = true)
	protected ActiveCurrencyAndAmount totalCapital;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlCptl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCapital"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the CCP's capital requirements for operational expenses; for winding down or restructuring its activities; for overall operational and legal risk; for uncovered credit, counterparty credit and market risks and business risks.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CCPIncomeStatementAndCapitalAdequacyReportV01, ActiveCurrencyAndAmount> mmTotalCapital = new MMMessageBuildingBlock<CCPIncomeStatementAndCapitalAdequacyReportV01, ActiveCurrencyAndAmount>() {
		{
			xmlTag = "TtlCptl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCapital";
			definition = "Sum of the CCP's capital requirements for operational expenses; for winding down or restructuring its activities; for overall operational and legal risk; for uncovered credit, counterparty credit and market risks and business risks.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CCPIncomeStatementAndCapitalAdequacyReportV01 obj) {
			return obj.getTotalCapital();
		}

		@Override
		public void setValue(CCPIncomeStatementAndCapitalAdequacyReportV01 obj, ActiveCurrencyAndAmount value) {
			obj.setTotalCapital(value);
		}
	};
	@XmlElement(name = "LqdFinRsrcs", required = true)
	protected ActiveCurrencyAndAmount liquidFinancialResources;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LqdFinRsrcs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidFinancialResources"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total capital resources invested in liquid financial resources.\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CCPIncomeStatementAndCapitalAdequacyReportV01, ActiveCurrencyAndAmount> mmLiquidFinancialResources = new MMMessageBuildingBlock<CCPIncomeStatementAndCapitalAdequacyReportV01, ActiveCurrencyAndAmount>() {
		{
			xmlTag = "LqdFinRsrcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidFinancialResources";
			definition = "Total capital resources invested in liquid financial resources.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CCPIncomeStatementAndCapitalAdequacyReportV01 obj) {
			return obj.getLiquidFinancialResources();
		}

		@Override
		public void setValue(CCPIncomeStatementAndCapitalAdequacyReportV01 obj, ActiveCurrencyAndAmount value) {
			obj.setLiquidFinancialResources(value);
		}
	};
	@XmlElement(name = "HpthtclCptlMeasr", required = true)
	protected List<HypotheticalCapitalMeasure1> hypotheticalCapitalMeasure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.HypotheticalCapitalMeasure1
	 * HypotheticalCapitalMeasure1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HpthtclCptlMeasr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HypotheticalCapitalMeasure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hypothetical capital requirement due to counterparty credit risk exposures to all clearing members.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CCPIncomeStatementAndCapitalAdequacyReportV01, List<HypotheticalCapitalMeasure1>> mmHypotheticalCapitalMeasure = new MMMessageBuildingBlock<CCPIncomeStatementAndCapitalAdequacyReportV01, List<HypotheticalCapitalMeasure1>>() {
		{
			xmlTag = "HpthtclCptlMeasr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HypotheticalCapitalMeasure";
			definition = "Hypothetical capital requirement due to counterparty credit risk exposures to all clearing members.\r\n";
			minOccurs = 1;
			complexType_lazy = () -> HypotheticalCapitalMeasure1.mmObject();
		}

		@Override
		public List<HypotheticalCapitalMeasure1> getValue(CCPIncomeStatementAndCapitalAdequacyReportV01 obj) {
			return obj.getHypotheticalCapitalMeasure();
		}

		@Override
		public void setValue(CCPIncomeStatementAndCapitalAdequacyReportV01 obj, List<HypotheticalCapitalMeasure1> value) {
			obj.setHypotheticalCapitalMeasure(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CCPIncomeStatementAndCapitalAdequacyReportV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CCPIncomeStatementAndCapitalAdequacyReportV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CCPIncomeStatementAndCapitalAdequacyReportV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CCPIncomeStatementAndCapitalAdequacyReportV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "prefix", new String[]{"prefix", "DRAFT2"}));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CCPIncomeStatementAndCapitalAdequacyReportV01";
				definition = "The CCPIncomeStatementAndCapitalAdequacyReport is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority about the financial performance and regulatory capital holdings of the central counterpary.";
				messageSet_lazy = () -> Arrays.asList(CentralCounterPartyCCPDataReporting.mmObject());
				rootElement = "Document";
				xmlTag = "CCPIncmStmtAndCptlAdqcyRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01.mmIncomeStatement,
						com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01.mmCapitalRequirements, com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01.mmTotalCapital,
						com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01.mmLiquidFinancialResources,
						com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01.mmHypotheticalCapitalMeasure, com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "059";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CCPIncomeStatementAndCapitalAdequacyReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public IncomeStatement1 getIncomeStatement() {
		return incomeStatement;
	}

	public CCPIncomeStatementAndCapitalAdequacyReportV01 setIncomeStatement(IncomeStatement1 incomeStatement) {
		this.incomeStatement = Objects.requireNonNull(incomeStatement);
		return this;
	}

	public CapitalRequirement1 getCapitalRequirements() {
		return capitalRequirements;
	}

	public CCPIncomeStatementAndCapitalAdequacyReportV01 setCapitalRequirements(CapitalRequirement1 capitalRequirements) {
		this.capitalRequirements = Objects.requireNonNull(capitalRequirements);
		return this;
	}

	public ActiveCurrencyAndAmount getTotalCapital() {
		return totalCapital;
	}

	public CCPIncomeStatementAndCapitalAdequacyReportV01 setTotalCapital(ActiveCurrencyAndAmount totalCapital) {
		this.totalCapital = Objects.requireNonNull(totalCapital);
		return this;
	}

	public ActiveCurrencyAndAmount getLiquidFinancialResources() {
		return liquidFinancialResources;
	}

	public CCPIncomeStatementAndCapitalAdequacyReportV01 setLiquidFinancialResources(ActiveCurrencyAndAmount liquidFinancialResources) {
		this.liquidFinancialResources = Objects.requireNonNull(liquidFinancialResources);
		return this;
	}

	public List<HypotheticalCapitalMeasure1> getHypotheticalCapitalMeasure() {
		return hypotheticalCapitalMeasure == null ? hypotheticalCapitalMeasure = new ArrayList<>() : hypotheticalCapitalMeasure;
	}

	public CCPIncomeStatementAndCapitalAdequacyReportV01 setHypotheticalCapitalMeasure(List<HypotheticalCapitalMeasure1> hypotheticalCapitalMeasure) {
		this.hypotheticalCapitalMeasure = Objects.requireNonNull(hypotheticalCapitalMeasure);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CCPIncomeStatementAndCapitalAdequacyReportV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.059.001.01")
	static public class Document {
		@XmlElement(name = "CCPIncmStmtAndCptlAdqcyRpt", required = true)
		public CCPIncomeStatementAndCapitalAdequacyReportV01 messageBody;
	}
}