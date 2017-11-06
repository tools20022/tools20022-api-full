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
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.PostTradeMatchingISOLatestversion;
import com.tools20022.repository.msgset.PostTradeMatchingISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * Sent by an executing party or an instructing party to the custodian or an
 * affirming party to notify that all the necessary SecuritiesTradeConfirmation
 * message or any other notification of the process have been sent.<br>
 * It may also be sent through Central Matching Utility (CMU).<br>
 * The instructing party is typically the investment manager or an intermediary
 * system/vendor communicating on behalf of the investment manager.<br>
 * The executing party is typically the broker/dealer or an intermediary
 * system/vendor communicating on behalf of the broker/dealer.<br>
 * The custodian or an affirming party is typically the custodian, trustee,
 * financial institution, intermediary system/vendor communicating on behalf of
 * them, or their agent.<br>
 * The ISO 20022 Business Application Header must be used<br>
 * <b>Usage</b><br>
 * Initiator: Executing Party, CMU or Instructing Party<br>
 * Respondent: Custodian or an affirming party does not need to respond.
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
 * {@linkplain com.tools20022.repository.msgset.PostTradeMatchingISOPreviousversion
 * PostTradeMatchingISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeMatchingISOLatestversion
 * PostTradeMatchingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesEndOfPrcRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01#mmPagination
 * SecuritiesEndOfProcessReportV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01#mmReportGeneralDetails
 * SecuritiesEndOfProcessReportV01.mmReportGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01#mmConfirmationParties
 * SecuritiesEndOfProcessReportV01.mmConfirmationParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01#mmInvestor
 * SecuritiesEndOfProcessReportV01.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01#mmSupplementaryData
 * SecuritiesEndOfProcessReportV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.023.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesEndOfProcessReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nSent by an executing party or an instructing party to the custodian or an affirming party to notify that all the necessary SecuritiesTradeConfirmation message or any other notification of the process have been sent.\r\nIt may also be sent through Central Matching Utility (CMU).\r\nThe instructing party is typically the investment manager or an intermediary system/vendor communicating on behalf of the investment manager.\r\nThe executing party is typically the broker/dealer or an intermediary system/vendor communicating on behalf of the broker/dealer.\r\nThe custodian or an affirming party is typically the custodian, trustee, financial institution, intermediary system/vendor communicating on behalf of them, or their agent.\r\nThe ISO 20022 Business Application Header must be used\r\nUsage\r\nInitiator: Executing Party, CMU or Instructing Party\r\nRespondent: Custodian or an affirming party does not need to respond."
 * </li>
 * </ul>
 */
public class SecuritiesEndOfProcessReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected List<Pagination> pagination;
	/**
	 * Number used to sequence pages when it is not possible for data to be
	 * conveyed in a single message and the data has to be split across several
	 * pages (messages).
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
	 * "Number used to sequence pages when it is not possible for data to be conveyed in a single message and the data has to be split across several pages (messages)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "Pgntn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Number used to sequence pages when it is not possible for data to be conveyed in a single message and the data has to be split across several pages (messages).";
			minOccurs = 0;
			complexType_lazy = () -> Pagination.mmObject();
		}
	};
	protected Report3 reportGeneralDetails;
	/**
	 * Notifies the type of report transmitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Report3 Report3}
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
	 * definition} = "Notifies the type of report transmitted."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportGeneralDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptGnlDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportGeneralDetails";
			definition = "Notifies the type of report transmitted.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Report3.mmObject();
		}
	};
	protected List<ConfirmationParties2> confirmationParties;
	/**
	 * Parties involved in the confirmation of the details of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parties involved in the confirmation of the details of a trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmConfirmationParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "ConfPties";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationParties";
			definition = "Parties involved in the confirmation of the details of a trade.";
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationParties2.mmObject();
		}
	};
	protected List<PartyIdentificationAndAccount79> investor;
	/**
	 * Party that identifies the underlying investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79
	 * PartyIdentificationAndAccount79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that identifies the underlying investor."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInvestor = new MMMessageBuildingBlock() {
		{
			xmlTag = "Invstr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party that identifies the underlying investor.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentificationAndAccount79.mmObject();
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesEndOfProcessReportV01";
				definition = "Scope\r\nSent by an executing party or an instructing party to the custodian or an affirming party to notify that all the necessary SecuritiesTradeConfirmation message or any other notification of the process have been sent.\r\nIt may also be sent through Central Matching Utility (CMU).\r\nThe instructing party is typically the investment manager or an intermediary system/vendor communicating on behalf of the investment manager.\r\nThe executing party is typically the broker/dealer or an intermediary system/vendor communicating on behalf of the broker/dealer.\r\nThe custodian or an affirming party is typically the custodian, trustee, financial institution, intermediary system/vendor communicating on behalf of them, or their agent.\r\nThe ISO 20022 Business Application Header must be used\r\nUsage\r\nInitiator: Executing Party, CMU or Instructing Party\r\nRespondent: Custodian or an affirming party does not need to respond.";
				messageSet_lazy = () -> Arrays.asList(PostTradeMatchingISOPreviousversion.mmObject(), PostTradeMatchingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesEndOfPrcRpt";
				businessArea_lazy = () -> SecuritiesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01.mmPagination, com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01.mmReportGeneralDetails,
						com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01.mmConfirmationParties, com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01.mmInvestor,
						com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "023";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public List<Pagination> getPagination() {
		return pagination;
	}

	public void setPagination(List<Pagination> pagination) {
		this.pagination = pagination;
	}

	public Report3 getReportGeneralDetails() {
		return reportGeneralDetails;
	}

	public void setReportGeneralDetails(Report3 reportGeneralDetails) {
		this.reportGeneralDetails = reportGeneralDetails;
	}

	public List<ConfirmationParties2> getConfirmationParties() {
		return confirmationParties;
	}

	public void setConfirmationParties(List<ConfirmationParties2> confirmationParties) {
		this.confirmationParties = confirmationParties;
	}

	public List<PartyIdentificationAndAccount79> getInvestor() {
		return investor;
	}

	public void setInvestor(List<PartyIdentificationAndAccount79> investor) {
		this.investor = investor;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}