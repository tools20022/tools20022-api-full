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

package com.tools20022.repository.area.secl;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesClearingLatestVersion;
import com.tools20022.repository.choice.PartyIdentification35Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CentralCounterPartyCCPSecuritiesClearingISOLatestversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The MarginReport message is sent by the central counterparty (CCP) to a
 * clearing member to report on:<br>
 * - the exposure resulting from the trade positions<br>
 * - the value of the collateral held by the CCP (market value of this
 * collateral) and<br>
 * - the resulting difference representing the risk encountered by the CCP.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * There are four possibilities to report the above information. Indeed, the
 * margin report may be structured as follows:<br>
 * - per clearing member: the report will only show the information for the
 * clearing member, or<br>
 * - per clearing member and per financial instrument: the report will show the
 * information for the clearing member, structured by security identification,
 * or<br>
 * - per clearing member and per non clearing member: the report will show the
 * information for the clearing member (that is for global clearing member only)
 * structured by non clearing member(s), or<br>
 * - per clearing member and per non clearing member and per security
 * identification: the report will show the information for the clearing member
 * (global clearing member only) structured by non clearing member(s) and by
 * security identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code secl.005.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesClearingLatestVersion
 * SecuritiesClearingLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.MarginReportV02#mmReportParameters
 * MarginReportV02.mmReportParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.MarginReportV02#mmPagination
 * MarginReportV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.MarginReportV02#mmClearingMember
 * MarginReportV02.mmClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.MarginReportV02#mmReportSummary
 * MarginReportV02.mmReportSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.MarginReportV02#mmReportDetails
 * MarginReportV02.mmReportDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.MarginReportV02#mmSupplementaryData
 * MarginReportV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CentralCounterPartyCCPSecuritiesClearingISOLatestversion
 * CentralCounterPartyCCPSecuritiesClearingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MrgnRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MarginReport message is sent by the central counterparty (CCP) to a clearing member to report on:\r\n- the exposure resulting from the trade positions\r\n- the value of the collateral held by the CCP (market value of this collateral) and\r\n- the resulting difference representing the risk encountered by the CCP.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThere are four possibilities to report the above information. Indeed, the margin report may be structured as follows:\r\n- per clearing member: the report will only show the information for the clearing member, or\r\n- per clearing member and per financial instrument: the report will show the information for the clearing member, structured by security identification, or\r\n- per clearing member and per non clearing member: the report will show the information for the clearing member (that is for global clearing member only) structured by non clearing member(s), or\r\n- per clearing member and per non clearing member and per security identification: the report will show the information for the clearing member (global clearing member only) structured by non clearing member(s) and by security identification."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarginReportV02", propOrder = {"reportParameters", "pagination", "clearingMember", "reportSummary", "reportDetails", "supplementaryData"})
public class MarginReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptParams", required = true)
	protected ReportParameters3 reportParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters3
	 * ReportParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides parameters of the margin report such as the creation date and time, the report currency or the calculation date and time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginReportV02, ReportParameters3> mmReportParameters = new MMMessageBuildingBlock<MarginReportV02, ReportParameters3>() {
		{
			xmlTag = "RptParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportParameters";
			definition = "Provides parameters of the margin report such as the creation date and time, the report currency or the calculation date and time.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportParameters3.mmObject();
		}

		@Override
		public ReportParameters3 getValue(MarginReportV02 obj) {
			return obj.getReportParameters();
		}

		@Override
		public void setValue(MarginReportV02 obj, ReportParameters3 value) {
			obj.setReportParameters(value);
		}
	};
	@XmlElement(name = "Pgntn", required = true)
	protected Pagination pagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message (within a report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginReportV02, Pagination> mmPagination = new MMMessageBuildingBlock<MarginReportV02, Pagination>() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message (within a report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Pagination getValue(MarginReportV02 obj) {
			return obj.getPagination();
		}

		@Override
		public void setValue(MarginReportV02 obj, Pagination value) {
			obj.setPagination(value);
		}
	};
	@XmlElement(name = "ClrMmb", required = true)
	protected PartyIdentification35Choice clearingMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
	 * PartyIdentification35Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrMmb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the identification of the account owner, that is the clearing member (individual clearing member or general clearing member)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginReportV02, PartyIdentification35Choice> mmClearingMember = new MMMessageBuildingBlock<MarginReportV02, PartyIdentification35Choice>() {
		{
			xmlTag = "ClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMember";
			definition = "Provides the identification of the account owner, that is the clearing member (individual clearing member or general clearing member).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}

		@Override
		public PartyIdentification35Choice getValue(MarginReportV02 obj) {
			return obj.getClearingMember();
		}

		@Override
		public void setValue(MarginReportV02 obj, PartyIdentification35Choice value) {
			obj.setClearingMember(value);
		}
	};
	@XmlElement(name = "RptSummry")
	protected MarginCalculation1 reportSummary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation1
	 * MarginCalculation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptSummry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the valuation of the collateral on deposit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginReportV02, Optional<MarginCalculation1>> mmReportSummary = new MMMessageBuildingBlock<MarginReportV02, Optional<MarginCalculation1>>() {
		{
			xmlTag = "RptSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportSummary";
			definition = "Provides details on the valuation of the collateral on deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginCalculation1.mmObject();
		}

		@Override
		public Optional<MarginCalculation1> getValue(MarginReportV02 obj) {
			return obj.getReportSummary();
		}

		@Override
		public void setValue(MarginReportV02 obj, Optional<MarginCalculation1> value) {
			obj.setReportSummary(value.orElse(null));
		}
	};
	@XmlElement(name = "RptDtls", required = true)
	protected List<MarginReport2> reportDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MarginReport2
	 * MarginReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the margin report details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginReportV02, List<MarginReport2>> mmReportDetails = new MMMessageBuildingBlock<MarginReportV02, List<MarginReport2>>() {
		{
			xmlTag = "RptDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportDetails";
			definition = "Provides the margin report details.";
			minOccurs = 1;
			complexType_lazy = () -> MarginReport2.mmObject();
		}

		@Override
		public List<MarginReport2> getValue(MarginReportV02 obj) {
			return obj.getReportDetails();
		}

		@Override
		public void setValue(MarginReportV02 obj, List<MarginReport2> value) {
			obj.setReportDetails(value);
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
	 * "Additional information that can't be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginReportV02, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MarginReportV02, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can't be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MarginReportV02 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MarginReportV02 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginReportV02";
				definition = "Scope\r\nThe MarginReport message is sent by the central counterparty (CCP) to a clearing member to report on:\r\n- the exposure resulting from the trade positions\r\n- the value of the collateral held by the CCP (market value of this collateral) and\r\n- the resulting difference representing the risk encountered by the CCP.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThere are four possibilities to report the above information. Indeed, the margin report may be structured as follows:\r\n- per clearing member: the report will only show the information for the clearing member, or\r\n- per clearing member and per financial instrument: the report will show the information for the clearing member, structured by security identification, or\r\n- per clearing member and per non clearing member: the report will show the information for the clearing member (that is for global clearing member only) structured by non clearing member(s), or\r\n- per clearing member and per non clearing member and per security identification: the report will show the information for the clearing member (global clearing member only) structured by non clearing member(s) and by security identification.";
				messageSet_lazy = () -> Arrays.asList(CentralCounterPartyCCPSecuritiesClearingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "MrgnRpt";
				businessArea_lazy = () -> SecuritiesClearingLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.secl.MarginReportV02.mmReportParameters, com.tools20022.repository.area.secl.MarginReportV02.mmPagination,
						com.tools20022.repository.area.secl.MarginReportV02.mmClearingMember, com.tools20022.repository.area.secl.MarginReportV02.mmReportSummary, com.tools20022.repository.area.secl.MarginReportV02.mmReportDetails,
						com.tools20022.repository.area.secl.MarginReportV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "secl";
						messageFunctionality = "005";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MarginReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ReportParameters3 getReportParameters() {
		return reportParameters;
	}

	public MarginReportV02 setReportParameters(ReportParameters3 reportParameters) {
		this.reportParameters = Objects.requireNonNull(reportParameters);
		return this;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public MarginReportV02 setPagination(Pagination pagination) {
		this.pagination = Objects.requireNonNull(pagination);
		return this;
	}

	public PartyIdentification35Choice getClearingMember() {
		return clearingMember;
	}

	public MarginReportV02 setClearingMember(PartyIdentification35Choice clearingMember) {
		this.clearingMember = Objects.requireNonNull(clearingMember);
		return this;
	}

	public Optional<MarginCalculation1> getReportSummary() {
		return reportSummary == null ? Optional.empty() : Optional.of(reportSummary);
	}

	public MarginReportV02 setReportSummary(MarginCalculation1 reportSummary) {
		this.reportSummary = reportSummary;
		return this;
	}

	public List<MarginReport2> getReportDetails() {
		return reportDetails == null ? reportDetails = new ArrayList<>() : reportDetails;
	}

	public MarginReportV02 setReportDetails(List<MarginReport2> reportDetails) {
		this.reportDetails = Objects.requireNonNull(reportDetails);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MarginReportV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:secl.005.001.02")
	static public class Document {
		@XmlElement(name = "MrgnRpt", required = true)
		public MarginReportV02 messageBody;
	}
}