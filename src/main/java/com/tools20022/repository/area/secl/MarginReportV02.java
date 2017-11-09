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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CentralCounterPartyCCPSecuritiesClearingISOLatestversion
 * CentralCounterPartyCCPSecuritiesClearingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MrgnRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MarginReport message is sent by the central counterparty (CCP) to a clearing member to report on:\r\n- the exposure resulting from the trade positions\r\n- the value of the collateral held by the CCP (market value of this collateral) and\r\n- the resulting difference representing the risk encountered by the CCP.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThere are four possibilities to report the above information. Indeed, the margin report may be structured as follows:\r\n- per clearing member: the report will only show the information for the clearing member, or\r\n- per clearing member and per financial instrument: the report will show the information for the clearing member, structured by security identification, or\r\n- per clearing member and per non clearing member: the report will show the information for the clearing member (that is for global clearing member only) structured by non clearing member(s), or\r\n- per clearing member and per non clearing member and per security identification: the report will show the information for the clearing member (global clearing member only) structured by non clearing member(s) and by security identification."
 * </li>
 * </ul>
 */
public class MarginReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected ReportParameters3 reportParameters;
	/**
	 * Provides parameters of the margin report such as the creation date and
	 * time, the report currency or the calculation date and time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters3
	 * ReportParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides parameters of the margin report such as the creation date and time, the report currency or the calculation date and time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportParameters";
			definition = "Provides parameters of the margin report such as the creation date and time, the report currency or the calculation date and time.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportParameters3.mmObject();
		}
	};
	protected Pagination pagination;
	/**
	 * Page number of the message (within a report) and continuation indicator
	 * to indicate that the report is to continue or that the message is the
	 * last page of the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message (within a report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message (within a report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}
	};
	protected PartyIdentification35Choice clearingMember;
	/**
	 * Provides the identification of the account owner, that is the clearing
	 * member (individual clearing member or general clearing member).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
	 * PartyIdentification35Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the identification of the account owner, that is the clearing member (individual clearing member or general clearing member)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmClearingMember = new MMMessageBuildingBlock() {
		{
			xmlTag = "ClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMember";
			definition = "Provides the identification of the account owner, that is the clearing member (individual clearing member or general clearing member).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}
	};
	protected MarginCalculation1 reportSummary;
	/**
	 * Provides details on the valuation of the collateral on deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation1
	 * MarginCalculation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptSummry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the valuation of the collateral on deposit."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportSummary = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportSummary";
			definition = "Provides details on the valuation of the collateral on deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginCalculation1.mmObject();
		}
	};
	protected List<MarginReport2> reportDetails;
	/**
	 * Provides the margin report details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MarginReport2
	 * MarginReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the margin report details."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportDetails";
			definition = "Provides the margin report details.";
			minOccurs = 1;
			complexType_lazy = () -> MarginReport2.mmObject();
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can't be captured in the structured fields
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
	 * "Additional information that can't be captured in the structured fields and/or any other specific block. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can't be captured in the structured fields and/or any other specific block. ";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
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
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginReportV02.mmReportParameters, MarginReportV02.mmPagination, MarginReportV02.mmClearingMember, MarginReportV02.mmReportSummary, MarginReportV02.mmReportDetails,
						MarginReportV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "secl";
						messageFunctionality = "005";
						version = "02";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public ReportParameters3 getReportParameters() {
		return reportParameters;
	}

	public void setReportParameters(ReportParameters3 reportParameters) {
		this.reportParameters = reportParameters;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public PartyIdentification35Choice getClearingMember() {
		return clearingMember;
	}

	public void setClearingMember(PartyIdentification35Choice clearingMember) {
		this.clearingMember = clearingMember;
	}

	public MarginCalculation1 getReportSummary() {
		return reportSummary;
	}

	public void setReportSummary(MarginCalculation1 reportSummary) {
		this.reportSummary = reportSummary;
	}

	public List<MarginReport2> getReportDetails() {
		return reportDetails;
	}

	public void setReportDetails(List<MarginReport2> reportDetails) {
		this.reportDetails = reportDetails;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}