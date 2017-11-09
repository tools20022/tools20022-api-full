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
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.choice.ForeignExchangeSwap3Choice;
import com.tools20022.repository.msg.MoneyMarketReportHeader1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.MoneyMarketStatisticalReportingISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * The MoneyMarketSecuredMarketStatisticalReport message is sent by the
 * reporting agents to the relevant competent authority, to report all daily
 * Foreign Exchange Swaps (FX Swaps) transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.014.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.MoneyMarketStatisticalReportingISOLatestversion
 * MoneyMarketStatisticalReportingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MnyMktFXSwpsSttstclRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02#mmReportHeader
 * MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02#mmForeignExchangeSwapsReport
 * MoneyMarketForeignExchangeSwapsStatisticalReportV02.
 * mmForeignExchangeSwapsReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02#mmSupplementaryData
 * MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MoneyMarketForeignExchangeSwapsStatisticalReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The MoneyMarketSecuredMarketStatisticalReport message is sent by the reporting agents  to the relevant competent authority, to report all daily Foreign Exchange Swaps (FX Swaps) transactions."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV01
 * MoneyMarketForeignExchangeSwapsStatisticalReportV01}</li>
 * </ul>
 */
public class MoneyMarketForeignExchangeSwapsStatisticalReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MoneyMarketReportHeader1 reportHeader;
	/**
	 * Provides the elements specific to the report.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV01#mmReportHeader
	 * MoneyMarketForeignExchangeSwapsStatisticalReportV01.mmReportHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportHeader";
			definition = "Provides the elements specific to the report.";
			previousVersion_lazy = () -> MoneyMarketForeignExchangeSwapsStatisticalReportV01.mmReportHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MoneyMarketReportHeader1.mmObject();
		}
	};
	protected ForeignExchangeSwap3Choice foreignExchangeSwapsReport;
	/**
	 * Provides the reason why no activity is reported or the required list of
	 * transactions for the foreign exchange swaps segment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ForeignExchangeSwap3Choice
	 * ForeignExchangeSwap3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXSwpsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeSwapsReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the reason why no activity is reported or the required list of transactions for the foreign exchange swaps segment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV01#mmForeignExchangeSwapsReport
	 * MoneyMarketForeignExchangeSwapsStatisticalReportV01.
	 * mmForeignExchangeSwapsReport}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmForeignExchangeSwapsReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "FXSwpsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeSwapsReport";
			definition = "Provides the reason why no activity is reported or the required list of transactions for the foreign exchange swaps segment.";
			previousVersion_lazy = () -> MoneyMarketForeignExchangeSwapsStatisticalReportV01.mmForeignExchangeSwapsReport;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ForeignExchangeSwap3Choice.mmObject();
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV01#mmSupplementaryData
	 * MoneyMarketForeignExchangeSwapsStatisticalReportV01.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			previousVersion_lazy = () -> MoneyMarketForeignExchangeSwapsStatisticalReportV01.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MoneyMarketForeignExchangeSwapsStatisticalReportV02";
				definition = "The MoneyMarketSecuredMarketStatisticalReport message is sent by the reporting agents  to the relevant competent authority, to report all daily Foreign Exchange Swaps (FX Swaps) transactions.";
				previousVersion_lazy = () -> MoneyMarketForeignExchangeSwapsStatisticalReportV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(MoneyMarketStatisticalReportingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "MnyMktFXSwpsSttstclRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmReportHeader, MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmForeignExchangeSwapsReport,
						MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "014";
						version = "02";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public MoneyMarketReportHeader1 getReportHeader() {
		return reportHeader;
	}

	public void setReportHeader(MoneyMarketReportHeader1 reportHeader) {
		this.reportHeader = reportHeader;
	}

	public ForeignExchangeSwap3Choice getForeignExchangeSwapsReport() {
		return foreignExchangeSwapsReport;
	}

	public void setForeignExchangeSwapsReport(ForeignExchangeSwap3Choice foreignExchangeSwapsReport) {
		this.foreignExchangeSwapsReport = foreignExchangeSwapsReport;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}