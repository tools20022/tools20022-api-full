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
import com.tools20022.repository.msg.SecuritiesMarketReportHeader1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TransparencyDataReport14;
import com.tools20022.repository.msgset.FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * The FinancialInstrumentReportingNonEquityTradingActivityResult message is
 * sent by the trading venue to the national competent authority to report on
 * computed results data of non-equity specific trading activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting 
 * FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting
 * }</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FinInstrmRptgNonEqtyTradgActvtyRslt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityResultV01#mmReportHeader
 * FinancialInstrumentReportingNonEquityTradingActivityResultV01.mmReportHeader}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityResultV01#mmNonEquityTransparencyData
 * FinancialInstrumentReportingNonEquityTradingActivityResultV01.
 * mmNonEquityTransparencyData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityResultV01#mmSupplementaryData
 * FinancialInstrumentReportingNonEquityTradingActivityResultV01.
 * mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.045.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentReportingNonEquityTradingActivityResultV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The FinancialInstrumentReportingNonEquityTradingActivityResult message is sent by the trading venue to the national competent authority to report on computed results data of non-equity specific trading activity."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrumentReportingNonEquityTradingActivityResultV01", propOrder = {"reportHeader", "nonEquityTransparencyData", "supplementaryData"})
public class FinancialInstrumentReportingNonEquityTradingActivityResultV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesMarketReportHeader1 reportHeader;
	/**
	 * Header information related to the global report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1
	 * SecuritiesMarketReportHeader1}</li>
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
	 * definition} = "Header information related to the global report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportHeader";
			definition = "Header information related to the global report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesMarketReportHeader1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FinancialInstrumentReportingNonEquityTradingActivityResultV01.class.getMethod("getReportHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<TransparencyDataReport14> nonEquityTransparencyData;
	/**
	 * Details the transparency data reported by a trading venue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14
	 * TransparencyDataReport14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonEqtyTrnsprncyData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEquityTransparencyData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details the transparency data reported by a trading venue."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNonEquityTransparencyData = new MMMessageBuildingBlock() {
		{
			xmlTag = "NonEqtyTrnsprncyData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEquityTransparencyData";
			definition = "Details the transparency data reported by a trading venue.";
			minOccurs = 1;
			complexType_lazy = () -> TransparencyDataReport14.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FinancialInstrumentReportingNonEquityTradingActivityResultV01.class.getMethod("getNonEquityTransparencyData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FinancialInstrumentReportingNonEquityTradingActivityResultV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentReportingNonEquityTradingActivityResultV01";
				definition = "The FinancialInstrumentReportingNonEquityTradingActivityResult message is sent by the trading venue to the national competent authority to report on computed results data of non-equity specific trading activity.";
				messageSet_lazy = () -> Arrays.asList(FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting.mmObject());
				rootElement = "Document";
				xmlTag = "FinInstrmRptgNonEqtyTradgActvtyRslt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityResultV01.mmReportHeader,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityResultV01.mmNonEquityTransparencyData,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityResultV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "045";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInstrumentReportingNonEquityTradingActivityResultV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RptHdr", required = true)
	public SecuritiesMarketReportHeader1 getReportHeader() {
		return reportHeader;
	}

	public void setReportHeader(SecuritiesMarketReportHeader1 reportHeader) {
		this.reportHeader = reportHeader;
	}

	@XmlElement(name = "NonEqtyTrnsprncyData", required = true)
	public List<TransparencyDataReport14> getNonEquityTransparencyData() {
		return nonEquityTransparencyData;
	}

	public void setNonEquityTransparencyData(List<TransparencyDataReport14> nonEquityTransparencyData) {
		this.nonEquityTransparencyData = nonEquityTransparencyData;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.045.01.01")
	static public class Document {
		@XmlElement(name = "FinInstrmRptgNonEqtyTradgActvtyRslt", required = true)
		public FinancialInstrumentReportingNonEquityTradingActivityResultV01 messageBody;
	}
}