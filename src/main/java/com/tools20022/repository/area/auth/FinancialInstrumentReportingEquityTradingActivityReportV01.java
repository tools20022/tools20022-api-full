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
import com.tools20022.repository.msg.TransparencyDataReport13;
import com.tools20022.repository.msgset.FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The FinancialInstrumentReportingEquityTradingActivityReport message is sent
 * by the trading venue to the national competent authority to report on equity
 * specific trading activity data, used for the transparency calculations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.040.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityReportV01#mmReportHeader
 * FinancialInstrumentReportingEquityTradingActivityReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityReportV01#mmEquityTransparencyData
 * FinancialInstrumentReportingEquityTradingActivityReportV01.
 * mmEquityTransparencyData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityReportV01#mmSupplementaryData
 * FinancialInstrumentReportingEquityTradingActivityReportV01.
 * mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting 
 * FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting
 * }</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FinInstrmRptgEqtyTradgActvtyRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentReportingEquityTradingActivityReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The FinancialInstrumentReportingEquityTradingActivityReport message is sent by the trading venue to the national competent authority to report on equity specific trading activity data, used for the transparency calculations."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentReportingEquityTradingActivityReportV01", propOrder = {"reportHeader", "equityTransparencyData", "supplementaryData"})
public class FinancialInstrumentReportingEquityTradingActivityReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptHdr", required = true)
	protected SecuritiesMarketReportHeader1 reportHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1
	 * SecuritiesMarketReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Header information related to the global report, common to all reference data."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInstrumentReportingEquityTradingActivityReportV01, SecuritiesMarketReportHeader1> mmReportHeader = new MMMessageBuildingBlock<FinancialInstrumentReportingEquityTradingActivityReportV01, SecuritiesMarketReportHeader1>() {
		{
			xmlTag = "RptHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportHeader";
			definition = "Header information related to the global report, common to all reference data.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesMarketReportHeader1.mmObject();
		}

		@Override
		public SecuritiesMarketReportHeader1 getValue(FinancialInstrumentReportingEquityTradingActivityReportV01 obj) {
			return obj.getReportHeader();
		}

		@Override
		public void setValue(FinancialInstrumentReportingEquityTradingActivityReportV01 obj, SecuritiesMarketReportHeader1 value) {
			obj.setReportHeader(value);
		}
	};
	@XmlElement(name = "EqtyTrnsprncyData", required = true)
	protected List<TransparencyDataReport13> equityTransparencyData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13
	 * TransparencyDataReport13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EqtyTrnsprncyData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityTransparencyData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details the transparency data reported by a trading venue."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInstrumentReportingEquityTradingActivityReportV01, List<TransparencyDataReport13>> mmEquityTransparencyData = new MMMessageBuildingBlock<FinancialInstrumentReportingEquityTradingActivityReportV01, List<TransparencyDataReport13>>() {
		{
			xmlTag = "EqtyTrnsprncyData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityTransparencyData";
			definition = "Details the transparency data reported by a trading venue.";
			minOccurs = 1;
			complexType_lazy = () -> TransparencyDataReport13.mmObject();
		}

		@Override
		public List<TransparencyDataReport13> getValue(FinancialInstrumentReportingEquityTradingActivityReportV01 obj) {
			return obj.getEquityTransparencyData();
		}

		@Override
		public void setValue(FinancialInstrumentReportingEquityTradingActivityReportV01 obj, List<TransparencyDataReport13> value) {
			obj.setEquityTransparencyData(value);
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInstrumentReportingEquityTradingActivityReportV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<FinancialInstrumentReportingEquityTradingActivityReportV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(FinancialInstrumentReportingEquityTradingActivityReportV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(FinancialInstrumentReportingEquityTradingActivityReportV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentReportingEquityTradingActivityReportV01";
				definition = "The FinancialInstrumentReportingEquityTradingActivityReport message is sent by the trading venue to the national competent authority to report on equity specific trading activity data, used for the transparency calculations.";
				messageSet_lazy = () -> Arrays.asList(FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting.mmObject());
				rootElement = "Document";
				xmlTag = "FinInstrmRptgEqtyTradgActvtyRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityReportV01.mmReportHeader,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityReportV01.mmEquityTransparencyData,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "040";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInstrumentReportingEquityTradingActivityReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesMarketReportHeader1 getReportHeader() {
		return reportHeader;
	}

	public FinancialInstrumentReportingEquityTradingActivityReportV01 setReportHeader(SecuritiesMarketReportHeader1 reportHeader) {
		this.reportHeader = Objects.requireNonNull(reportHeader);
		return this;
	}

	public List<TransparencyDataReport13> getEquityTransparencyData() {
		return equityTransparencyData == null ? equityTransparencyData = new ArrayList<>() : equityTransparencyData;
	}

	public FinancialInstrumentReportingEquityTradingActivityReportV01 setEquityTransparencyData(List<TransparencyDataReport13> equityTransparencyData) {
		this.equityTransparencyData = Objects.requireNonNull(equityTransparencyData);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public FinancialInstrumentReportingEquityTradingActivityReportV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.040.001.01")
	static public class Document {
		@XmlElement(name = "FinInstrmRptgEqtyTradgActvtyRpt", required = true)
		public FinancialInstrumentReportingEquityTradingActivityReportV01 messageBody;
	}
}