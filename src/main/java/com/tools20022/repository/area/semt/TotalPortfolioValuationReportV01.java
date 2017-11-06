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

package com.tools20022.repository.area.semt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.SecuritiesManagementLatestVersion;
import com.tools20022.repository.choice.PortfolioBalance1;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.TotalPortfolioValuationReportISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * An account servicer sends a TotalPortfolioValuationReport to an account owner
 * to provide detailed valuation information for a portfolio.<br>
 * <b>Usage</b><br>
 * The TotalPortfolioValuationReport will be sent by the account servicer to the
 * account owner on an agreed basis. The report may also be requested using a
 * SecuritiesStatementQuery.<br>
 * The TotalPortfolioValuationReport is used to report on a portfolio without
 * Investment Funds; or to report on a portfolio when an investment fund is
 * regarded as a portfolio containing, only one or multiple investment funds<br>
 * The TotalPortfolioValuationReport may also be used to:<br>
 * - re-send a message previously sent (the CopyDuplicate value is DUPL),<br>
 * - provide a third party with a copy of a message for information (the
 * CopyDuplicate value is COPY),<br>
 * - re-send to a third party a copy of a message for information (the
 * CopyDuplicate value is CODU).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementLatestVersion
 * SecuritiesManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TotalPortfolioValuationReportISOLatestversion
 * TotalPortfolioValuationReportISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "TtlPrtflValtnRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmPagination
 * TotalPortfolioValuationReportV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmReportGeneralDetails
 * TotalPortfolioValuationReportV01.mmReportGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmAccountDetails
 * TotalPortfolioValuationReportV01.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmTotalPortfolioValuation
 * TotalPortfolioValuationReportV01.mmTotalPortfolioValuation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmBalance
 * TotalPortfolioValuationReportV01.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmSupplementaryData
 * TotalPortfolioValuationReportV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.024.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TotalPortfolioValuationReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends a TotalPortfolioValuationReport to an account owner to provide detailed valuation information for a portfolio.\r\nUsage\r\nThe TotalPortfolioValuationReport will be sent by the account servicer to the account owner on an agreed basis. The report may also be requested using a SecuritiesStatementQuery.\r\nThe TotalPortfolioValuationReport is used to report on a portfolio without Investment Funds; or to report on a portfolio when an investment fund is regarded as a portfolio containing, only one or multiple investment funds\r\nThe TotalPortfolioValuationReport may also be used to:\r\n- re-send a message previously sent (the CopyDuplicate value is DUPL),\r\n- provide a third party with a copy of a message for information (the CopyDuplicate value is COPY),\r\n- re-send to a third party a copy of a message for information (the CopyDuplicate value is CODU)."
 * </li>
 * </ul>
 */
public class TotalPortfolioValuationReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Pagination pagination;
	/**
	 * Page number of the message (within the report) and continuation indicator
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
	 * "Page number of the message (within the report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "Pgntn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message (within the report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}
	};
	protected Report4 reportGeneralDetails;
	/**
	 * General information related to the total portfolio valuation report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Report4 Report4}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptGnlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportGeneralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information related to the total portfolio valuation report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportGeneralDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptGnlDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportGeneralDetails";
			definition = "General information related to the total portfolio valuation report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Report4.mmObject();
		}
	};
	protected SecuritiesAccount21 accountDetails;
	/**
	 * Details of the account. The account may represent an investment portfolio
	 * or a fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21
	 * SecuritiesAccount21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the account. The account may represent an investment portfolio or a fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Details of the account. The account may represent an investment portfolio or a fund.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount21.mmObject();
		}
	};
	protected TotalPortfolioValuation1 totalPortfolioValuation;
	/**
	 * Valuation information of the portfolio. In some markets a fund of funds
	 * or an investment fund is regarded as a portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlPrtflValtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalPortfolioValuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation information of the portfolio. In some markets a fund of funds or an investment fund is regarded as a portfolio."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTotalPortfolioValuation = new MMMessageBuildingBlock() {
		{
			xmlTag = "TtlPrtflValtn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPortfolioValuation";
			definition = "Valuation information of the portfolio. In some markets a fund of funds or an investment fund is regarded as a portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TotalPortfolioValuation1.mmObject();
		}
	};
	protected PortfolioBalance1 balance;
	/**
	 * Balance breakdown information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PortfolioBalance1
	 * PortfolioBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance breakdown information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBalance = new MMMessageBuildingBlock() {
		{
			xmlTag = "Bal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Balance breakdown information.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PortfolioBalance1.mmObject();
		}
	};
	protected SupplementaryData1 supplementaryData;
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block. ";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TotalPortfolioValuationReportV01";
				definition = "Scope\r\nAn account servicer sends a TotalPortfolioValuationReport to an account owner to provide detailed valuation information for a portfolio.\r\nUsage\r\nThe TotalPortfolioValuationReport will be sent by the account servicer to the account owner on an agreed basis. The report may also be requested using a SecuritiesStatementQuery.\r\nThe TotalPortfolioValuationReport is used to report on a portfolio without Investment Funds; or to report on a portfolio when an investment fund is regarded as a portfolio containing, only one or multiple investment funds\r\nThe TotalPortfolioValuationReport may also be used to:\r\n- re-send a message previously sent (the CopyDuplicate value is DUPL),\r\n- provide a third party with a copy of a message for information (the CopyDuplicate value is COPY),\r\n- re-send to a third party a copy of a message for information (the CopyDuplicate value is CODU).";
				messageSet_lazy = () -> Arrays.asList(TotalPortfolioValuationReportISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "TtlPrtflValtnRpt";
				businessArea_lazy = () -> SecuritiesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01.mmPagination, com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01.mmReportGeneralDetails,
						com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01.mmAccountDetails, com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01.mmTotalPortfolioValuation,
						com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01.mmBalance, com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "024";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public Report4 getReportGeneralDetails() {
		return reportGeneralDetails;
	}

	public void setReportGeneralDetails(Report4 reportGeneralDetails) {
		this.reportGeneralDetails = reportGeneralDetails;
	}

	public SecuritiesAccount21 getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(SecuritiesAccount21 accountDetails) {
		this.accountDetails = accountDetails;
	}

	public TotalPortfolioValuation1 getTotalPortfolioValuation() {
		return totalPortfolioValuation;
	}

	public void setTotalPortfolioValuation(TotalPortfolioValuation1 totalPortfolioValuation) {
		this.totalPortfolioValuation = totalPortfolioValuation;
	}

	public PortfolioBalance1 getBalance() {
		return balance;
	}

	public void setBalance(PortfolioBalance1 balance) {
		this.balance = balance;
	}

	public SupplementaryData1 getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(SupplementaryData1 supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}