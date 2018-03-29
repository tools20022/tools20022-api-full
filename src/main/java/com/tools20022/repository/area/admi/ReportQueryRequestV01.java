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

package com.tools20022.repository.area.admi;

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AdministrationLatestVersion;
import com.tools20022.repository.msg.MessageHeader7;
import com.tools20022.repository.msg.ReportQueryCriteria2;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._T2S_Administration_Function_ForRegistration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The ReportQueryRequest message is exchanged between system member and system
 * transaction administrator. It aims at querying the latest available report
 * data of a specific report type. A report is stored and available for query
 * until the event occurs again report is replaced.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.ReportQueryRequestV01#mmMessageHeader
 * ReportQueryRequestV01.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.ReportQueryRequestV01#mmReportQueryCriteria
 * ReportQueryRequestV01.mmReportQueryCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.ReportQueryRequestV01#mmSupplementaryData
 * ReportQueryRequestV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset._T2S_Administration_Function_ForRegistration
 * _T2S_Administration_Function_ForRegistration}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RptQryReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AdministrationLatestVersion
 * AdministrationLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code admi.005.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=prefix, prefix=DRAFT5</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportQueryRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ReportQueryRequest message is exchanged between system member and system transaction administrator.\nIt aims at querying the latest available report data of a specific report type. A report is stored and available for query until the event occurs again report is replaced."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReportQueryRequestV01", propOrder = {"messageHeader", "reportQueryCriteria", "supplementaryData"})
public class ReportQueryRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgHdr", required = true)
	protected MessageHeader7 messageHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MessageHeader7
	 * MessageHeader7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements to identify the report query request message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReportQueryRequestV01, MessageHeader7> mmMessageHeader = new MMMessageBuildingBlock<ReportQueryRequestV01, MessageHeader7>() {
		{
			xmlTag = "MsgHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageHeader";
			definition = "Set of elements to identify the report query request message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageHeader7.mmObject();
		}

		@Override
		public MessageHeader7 getValue(ReportQueryRequestV01 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(ReportQueryRequestV01 obj, MessageHeader7 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "RptQryCrit")
	protected List<ReportQueryCriteria2> reportQueryCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ReportQueryCriteria2
	 * ReportQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptQryCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportQueryCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of the report query criteria."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReportQueryRequestV01, List<ReportQueryCriteria2>> mmReportQueryCriteria = new MMMessageBuildingBlock<ReportQueryRequestV01, List<ReportQueryCriteria2>>() {
		{
			xmlTag = "RptQryCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportQueryCriteria";
			definition = "Definition of the report query criteria.";
			minOccurs = 0;
			complexType_lazy = () -> ReportQueryCriteria2.mmObject();
		}

		@Override
		public List<ReportQueryCriteria2> getValue(ReportQueryRequestV01 obj) {
			return obj.getReportQueryCriteria();
		}

		@Override
		public void setValue(ReportQueryRequestV01 obj, List<ReportQueryCriteria2> value) {
			obj.setReportQueryCriteria(value);
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
	public static final MMMessageBuildingBlock<ReportQueryRequestV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ReportQueryRequestV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ReportQueryRequestV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ReportQueryRequestV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "prefix", new String[]{"prefix", "DRAFT5"}));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReportQueryRequestV01";
				definition = "The ReportQueryRequest message is exchanged between system member and system transaction administrator.\nIt aims at querying the latest available report data of a specific report type. A report is stored and available for query until the event occurs again report is replaced.";
				messageSet_lazy = () -> Arrays.asList(_T2S_Administration_Function_ForRegistration.mmObject());
				rootElement = "Document";
				xmlTag = "RptQryReq";
				businessArea_lazy = () -> AdministrationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.admi.ReportQueryRequestV01.mmMessageHeader, com.tools20022.repository.area.admi.ReportQueryRequestV01.mmReportQueryCriteria,
						com.tools20022.repository.area.admi.ReportQueryRequestV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "admi";
						messageFunctionality = "005";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReportQueryRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader7 getMessageHeader() {
		return messageHeader;
	}

	public ReportQueryRequestV01 setMessageHeader(MessageHeader7 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public List<ReportQueryCriteria2> getReportQueryCriteria() {
		return reportQueryCriteria == null ? reportQueryCriteria = new ArrayList<>() : reportQueryCriteria;
	}

	public ReportQueryRequestV01 setReportQueryCriteria(List<ReportQueryCriteria2> reportQueryCriteria) {
		this.reportQueryCriteria = Objects.requireNonNull(reportQueryCriteria);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ReportQueryRequestV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:admi.005.001.01")
	static public class Document {
		@XmlElement(name = "RptQryReq", required = true)
		public ReportQueryRequestV01 messageBody;
	}
}