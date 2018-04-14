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
import com.tools20022.repository.msg.DefaultFundRequirement1;
import com.tools20022.repository.msg.EndOfDayRequirement2;
import com.tools20022.repository.msg.IntraDayRequirement1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CentralCounterPartyCCPDataReporting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The CCPMemberRequirementsReport is sent from the central counterparty to the
 * national competent authority. It is used to inform the national competent
 * authority about the collateral requirements that a central counterparty
 * obligates a clearing member post at the central counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.055.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01#mmIntraDayRequirementAmount
 * CCPMemberRequirementsReportV01.mmIntraDayRequirementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01#mmEndOfDayRequirement
 * CCPMemberRequirementsReportV01.mmEndOfDayRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01#mmDefaultFundRequirement
 * CCPMemberRequirementsReportV01.mmDefaultFundRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01#mmSupplementaryData
 * CCPMemberRequirementsReportV01.mmSupplementaryData}</li>
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
 * xmlTag} = "CCPMmbRqrmntsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CCPMemberRequirementsReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The CCPMemberRequirementsReport is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority about the collateral requirements that a central counterparty obligates a clearing member post at the central counterparty."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=prefix, prefix=DRAFT5</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CCPMemberRequirementsReportV01", propOrder = {"intraDayRequirementAmount", "endOfDayRequirement", "defaultFundRequirement", "supplementaryData"})
public class CCPMemberRequirementsReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IntraDayRqrmntAmt", required = true)
	protected List<IntraDayRequirement1> intraDayRequirementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IntraDayRequirement1
	 * IntraDayRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraDayRqrmntAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraDayRequirementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligations of a clearing member with respect to a central counterparty that are calculated based on intraday positions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CCPMemberRequirementsReportV01, List<IntraDayRequirement1>> mmIntraDayRequirementAmount = new MMMessageBuildingBlock<CCPMemberRequirementsReportV01, List<IntraDayRequirement1>>() {
		{
			xmlTag = "IntraDayRqrmntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraDayRequirementAmount";
			definition = "Obligations of a clearing member with respect to a central counterparty that are calculated based on intraday positions.";
			minOccurs = 1;
			complexType_lazy = () -> IntraDayRequirement1.mmObject();
		}

		@Override
		public List<IntraDayRequirement1> getValue(CCPMemberRequirementsReportV01 obj) {
			return obj.getIntraDayRequirementAmount();
		}

		@Override
		public void setValue(CCPMemberRequirementsReportV01 obj, List<IntraDayRequirement1> value) {
			obj.setIntraDayRequirementAmount(value);
		}
	};
	@XmlElement(name = "EndOfDayRqrmnt", required = true)
	protected List<EndOfDayRequirement2> endOfDayRequirement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement2
	 * EndOfDayRequirement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndOfDayRqrmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfDayRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligations of a clearing member with respect to a central counterparty that are calculated based on end of day positions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CCPMemberRequirementsReportV01, List<EndOfDayRequirement2>> mmEndOfDayRequirement = new MMMessageBuildingBlock<CCPMemberRequirementsReportV01, List<EndOfDayRequirement2>>() {
		{
			xmlTag = "EndOfDayRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfDayRequirement";
			definition = "Obligations of a clearing member with respect to a central counterparty that are calculated based on end of day positions.";
			minOccurs = 1;
			complexType_lazy = () -> EndOfDayRequirement2.mmObject();
		}

		@Override
		public List<EndOfDayRequirement2> getValue(CCPMemberRequirementsReportV01 obj) {
			return obj.getEndOfDayRequirement();
		}

		@Override
		public void setValue(CCPMemberRequirementsReportV01 obj, List<EndOfDayRequirement2> value) {
			obj.setEndOfDayRequirement(value);
		}
	};
	@XmlElement(name = "DfltFndRqrmnt", required = true)
	protected List<DefaultFundRequirement1> defaultFundRequirement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DefaultFundRequirement1
	 * DefaultFundRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltFndRqrmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requirement for a clearing member to post collateral at a central counterparty with respect to a default fund."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CCPMemberRequirementsReportV01, List<DefaultFundRequirement1>> mmDefaultFundRequirement = new MMMessageBuildingBlock<CCPMemberRequirementsReportV01, List<DefaultFundRequirement1>>() {
		{
			xmlTag = "DfltFndRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundRequirement";
			definition = "Requirement for a clearing member to post collateral at a central counterparty with respect to a default fund.";
			minOccurs = 1;
			complexType_lazy = () -> DefaultFundRequirement1.mmObject();
		}

		@Override
		public List<DefaultFundRequirement1> getValue(CCPMemberRequirementsReportV01 obj) {
			return obj.getDefaultFundRequirement();
		}

		@Override
		public void setValue(CCPMemberRequirementsReportV01 obj, List<DefaultFundRequirement1> value) {
			obj.setDefaultFundRequirement(value);
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
	public static final MMMessageBuildingBlock<CCPMemberRequirementsReportV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CCPMemberRequirementsReportV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CCPMemberRequirementsReportV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CCPMemberRequirementsReportV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "prefix", new String[]{"prefix", "DRAFT5"}));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CCPMemberRequirementsReportV01";
				definition = "The CCPMemberRequirementsReport is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority about the collateral requirements that a central counterparty obligates a clearing member post at the central counterparty.";
				messageSet_lazy = () -> Arrays.asList(CentralCounterPartyCCPDataReporting.mmObject());
				rootElement = "Document";
				xmlTag = "CCPMmbRqrmntsRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01.mmIntraDayRequirementAmount,
						com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01.mmEndOfDayRequirement, com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01.mmDefaultFundRequirement,
						com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "055";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CCPMemberRequirementsReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<IntraDayRequirement1> getIntraDayRequirementAmount() {
		return intraDayRequirementAmount == null ? intraDayRequirementAmount = new ArrayList<>() : intraDayRequirementAmount;
	}

	public CCPMemberRequirementsReportV01 setIntraDayRequirementAmount(List<IntraDayRequirement1> intraDayRequirementAmount) {
		this.intraDayRequirementAmount = Objects.requireNonNull(intraDayRequirementAmount);
		return this;
	}

	public List<EndOfDayRequirement2> getEndOfDayRequirement() {
		return endOfDayRequirement == null ? endOfDayRequirement = new ArrayList<>() : endOfDayRequirement;
	}

	public CCPMemberRequirementsReportV01 setEndOfDayRequirement(List<EndOfDayRequirement2> endOfDayRequirement) {
		this.endOfDayRequirement = Objects.requireNonNull(endOfDayRequirement);
		return this;
	}

	public List<DefaultFundRequirement1> getDefaultFundRequirement() {
		return defaultFundRequirement == null ? defaultFundRequirement = new ArrayList<>() : defaultFundRequirement;
	}

	public CCPMemberRequirementsReportV01 setDefaultFundRequirement(List<DefaultFundRequirement1> defaultFundRequirement) {
		this.defaultFundRequirement = Objects.requireNonNull(defaultFundRequirement);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CCPMemberRequirementsReportV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.055.001.01")
	static public class Document {
		@XmlElement(name = "CCPMmbRqrmntsRpt", required = true)
		public CCPMemberRequirementsReportV01 messageBody;
	}
}