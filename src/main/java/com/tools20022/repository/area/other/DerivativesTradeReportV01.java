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

package com.tools20022.repository.area.other;

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.OtherMessages;
import com.tools20022.repository.choice.TradeData3Choice;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TradeQueryHeader3;
import com.tools20022.repository.msgset.FinancialInstrumentsandTransactionsRegulatoryReportingTradeRepositoryReporting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The DerivativesTradeReport is sent by the trade repositories (TRs) to the
 * users as a response to a query to provide transaction data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.DerivativesTradeReportV01#mmReportHeader
 * DerivativesTradeReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.DerivativesTradeReportV01#mmTradeData
 * DerivativesTradeReportV01.mmTradeData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.DerivativesTradeReportV01#mmSupplementaryData
 * DerivativesTradeReportV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.FinancialInstrumentsandTransactionsRegulatoryReportingTradeRepositoryReporting 
 * FinancialInstrumentsandTransactionsRegulatoryReportingTradeRepositoryReporting
 * }</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "DerivsTradRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} = {@linkplain com.tools20022.repository.area.OtherMessages
 * OtherMessages}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.030.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=prefix, prefix=DRAFT10</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DerivativesTradeReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The DerivativesTradeReport is sent by the trade repositories (TRs) to the users as a response to a query to provide transaction data."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DerivativesTradeReportV01", propOrder = {"reportHeader", "tradeData", "supplementaryData"})
public class DerivativesTradeReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptHdr", required = true)
	protected TradeQueryHeader3 reportHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradeQueryHeader3
	 * TradeQueryHeader3}</li>
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
	 * definition} = "Header information related to metadata of report message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DerivativesTradeReportV01, TradeQueryHeader3> mmReportHeader = new MMMessageBuildingBlock<DerivativesTradeReportV01, TradeQueryHeader3>() {
		{
			xmlTag = "RptHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportHeader";
			definition = "Header information related to metadata of report message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeQueryHeader3.mmObject();
		}

		@Override
		public TradeQueryHeader3 getValue(DerivativesTradeReportV01 obj) {
			return obj.getReportHeader();
		}

		@Override
		public void setValue(DerivativesTradeReportV01 obj, TradeQueryHeader3 value) {
			obj.setReportHeader(value);
		}
	};
	@XmlElement(name = "TradData", required = true)
	protected TradeData3Choice tradeData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeData3Choice
	 * TradeData3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data concerning the reporting trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DerivativesTradeReportV01, TradeData3Choice> mmTradeData = new MMMessageBuildingBlock<DerivativesTradeReportV01, TradeData3Choice>() {
		{
			xmlTag = "TradData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeData";
			definition = "Data concerning the reporting trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeData3Choice.mmObject();
		}

		@Override
		public TradeData3Choice getValue(DerivativesTradeReportV01 obj) {
			return obj.getTradeData();
		}

		@Override
		public void setValue(DerivativesTradeReportV01 obj, TradeData3Choice value) {
			obj.setTradeData(value);
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DerivativesTradeReportV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<DerivativesTradeReportV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(DerivativesTradeReportV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(DerivativesTradeReportV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "prefix", new String[]{"prefix", "DRAFT10"}));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DerivativesTradeReportV01";
				definition = "The DerivativesTradeReport is sent by the trade repositories (TRs) to the users as a response to a query to provide transaction data.";
				messageSet_lazy = () -> Arrays.asList(FinancialInstrumentsandTransactionsRegulatoryReportingTradeRepositoryReporting.mmObject());
				rootElement = "Document";
				xmlTag = "DerivsTradRpt";
				businessArea_lazy = () -> OtherMessages.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.other.DerivativesTradeReportV01.mmReportHeader, com.tools20022.repository.area.other.DerivativesTradeReportV01.mmTradeData,
						com.tools20022.repository.area.other.DerivativesTradeReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "030";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return DerivativesTradeReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradeQueryHeader3 getReportHeader() {
		return reportHeader;
	}

	public DerivativesTradeReportV01 setReportHeader(TradeQueryHeader3 reportHeader) {
		this.reportHeader = Objects.requireNonNull(reportHeader);
		return this;
	}

	public TradeData3Choice getTradeData() {
		return tradeData;
	}

	public DerivativesTradeReportV01 setTradeData(TradeData3Choice tradeData) {
		this.tradeData = Objects.requireNonNull(tradeData);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public DerivativesTradeReportV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.030.001.01")
	static public class Document {
		@XmlElement(name = "DerivsTradRpt", required = true)
		public DerivativesTradeReportV01 messageBody;
	}
}