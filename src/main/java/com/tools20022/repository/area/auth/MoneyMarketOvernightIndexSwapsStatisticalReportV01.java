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

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AuthoritiesPreviousVersion;
import com.tools20022.repository.choice.OvernightIndexSwap3Choice;
import com.tools20022.repository.msg.MoneyMarketReportHeader1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.MoneyMarketStatisticalReportingISOPreviousversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The MoneyMarketOvernightIndexSwapsStatisticalReport message is sent by the
 * reporting agents to the relevant competent authority, to report the daily
 * overnight index swaps (OIS) transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV01#mmReportHeader
 * MoneyMarketOvernightIndexSwapsStatisticalReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV01#mmOvernightIndexSwapsReport
 * MoneyMarketOvernightIndexSwapsStatisticalReportV01.
 * mmOvernightIndexSwapsReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV01#mmSupplementaryData
 * MoneyMarketOvernightIndexSwapsStatisticalReportV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.MoneyMarketStatisticalReportingISOPreviousversion
 * MoneyMarketStatisticalReportingISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MnyMktOvrnghtIndxSwpsSttstclRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesPreviousVersion
 * AuthoritiesPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.015.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MoneyMarketOvernightIndexSwapsStatisticalReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The MoneyMarketOvernightIndexSwapsStatisticalReport message is sent by the reporting agents to the relevant competent authority, to report the daily overnight index swaps (OIS) transactions."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV02
 * MoneyMarketOvernightIndexSwapsStatisticalReportV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MoneyMarketOvernightIndexSwapsStatisticalReportV01", propOrder = {"reportHeader", "overnightIndexSwapsReport", "supplementaryData"})
public class MoneyMarketOvernightIndexSwapsStatisticalReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptHdr", required = true)
	protected MoneyMarketReportHeader1 reportHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketReportHeader1
	 * MoneyMarketReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the elements specific to the report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV02#mmReportHeader
	 * MoneyMarketOvernightIndexSwapsStatisticalReportV02.mmReportHeader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MoneyMarketOvernightIndexSwapsStatisticalReportV01, MoneyMarketReportHeader1> mmReportHeader = new MMMessageBuildingBlock<MoneyMarketOvernightIndexSwapsStatisticalReportV01, MoneyMarketReportHeader1>() {
		{
			xmlTag = "RptHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportHeader";
			definition = "Provides the elements specific to the report.";
			nextVersions_lazy = () -> Arrays.asList(MoneyMarketOvernightIndexSwapsStatisticalReportV02.mmReportHeader);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MoneyMarketReportHeader1.mmObject();
		}

		@Override
		public MoneyMarketReportHeader1 getValue(MoneyMarketOvernightIndexSwapsStatisticalReportV01 obj) {
			return obj.getReportHeader();
		}

		@Override
		public void setValue(MoneyMarketOvernightIndexSwapsStatisticalReportV01 obj, MoneyMarketReportHeader1 value) {
			obj.setReportHeader(value);
		}
	};
	@XmlElement(name = "OvrnghtIndxSwpsRpt", required = true)
	protected OvernightIndexSwap3Choice overnightIndexSwapsReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.OvernightIndexSwap3Choice
	 * OvernightIndexSwap3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OvrnghtIndxSwpsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OvernightIndexSwapsReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the reason why no activity is reported or the required list of transactions for the overnight index swaps segment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV02#mmOvernightIndexSwapsReport
	 * MoneyMarketOvernightIndexSwapsStatisticalReportV02.
	 * mmOvernightIndexSwapsReport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MoneyMarketOvernightIndexSwapsStatisticalReportV01, OvernightIndexSwap3Choice> mmOvernightIndexSwapsReport = new MMMessageBuildingBlock<MoneyMarketOvernightIndexSwapsStatisticalReportV01, OvernightIndexSwap3Choice>() {
		{
			xmlTag = "OvrnghtIndxSwpsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OvernightIndexSwapsReport";
			definition = "Provides the reason why no activity is reported or the required list of transactions for the overnight index swaps segment.";
			nextVersions_lazy = () -> Arrays.asList(MoneyMarketOvernightIndexSwapsStatisticalReportV02.mmOvernightIndexSwapsReport);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OvernightIndexSwap3Choice.mmObject();
		}

		@Override
		public OvernightIndexSwap3Choice getValue(MoneyMarketOvernightIndexSwapsStatisticalReportV01 obj) {
			return obj.getOvernightIndexSwapsReport();
		}

		@Override
		public void setValue(MoneyMarketOvernightIndexSwapsStatisticalReportV01 obj, OvernightIndexSwap3Choice value) {
			obj.setOvernightIndexSwapsReport(value);
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV02#mmSupplementaryData
	 * MoneyMarketOvernightIndexSwapsStatisticalReportV02.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MoneyMarketOvernightIndexSwapsStatisticalReportV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MoneyMarketOvernightIndexSwapsStatisticalReportV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(MoneyMarketOvernightIndexSwapsStatisticalReportV02.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MoneyMarketOvernightIndexSwapsStatisticalReportV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MoneyMarketOvernightIndexSwapsStatisticalReportV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MoneyMarketOvernightIndexSwapsStatisticalReportV01";
				definition = "The MoneyMarketOvernightIndexSwapsStatisticalReport message is sent by the reporting agents to the relevant competent authority, to report the daily overnight index swaps (OIS) transactions.";
				nextVersions_lazy = () -> Arrays.asList(MoneyMarketOvernightIndexSwapsStatisticalReportV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(MoneyMarketStatisticalReportingISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "MnyMktOvrnghtIndxSwpsSttstclRpt";
				businessArea_lazy = () -> AuthoritiesPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV01.mmReportHeader,
						com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV01.mmOvernightIndexSwapsReport,
						com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "015";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MoneyMarketOvernightIndexSwapsStatisticalReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MoneyMarketReportHeader1 getReportHeader() {
		return reportHeader;
	}

	public MoneyMarketOvernightIndexSwapsStatisticalReportV01 setReportHeader(MoneyMarketReportHeader1 reportHeader) {
		this.reportHeader = Objects.requireNonNull(reportHeader);
		return this;
	}

	public OvernightIndexSwap3Choice getOvernightIndexSwapsReport() {
		return overnightIndexSwapsReport;
	}

	public MoneyMarketOvernightIndexSwapsStatisticalReportV01 setOvernightIndexSwapsReport(OvernightIndexSwap3Choice overnightIndexSwapsReport) {
		this.overnightIndexSwapsReport = Objects.requireNonNull(overnightIndexSwapsReport);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MoneyMarketOvernightIndexSwapsStatisticalReportV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.015.001.01")
	static public class Document {
		@XmlElement(name = "MnyMktOvrnghtIndxSwpsSttstclRpt", required = true)
		public MoneyMarketOvernightIndexSwapsStatisticalReportV01 messageBody;
	}
}