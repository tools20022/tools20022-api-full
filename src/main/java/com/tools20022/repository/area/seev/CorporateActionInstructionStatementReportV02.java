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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsArchive;
import com.tools20022.repository.msg.AccountIdentification16;
import com.tools20022.repository.msg.Pagination;
import com.tools20022.repository.msg.Statement12;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends the CorporateActionInstructionStatementReport
 * message to an account owner or its designated agent to report balances at the
 * safekeeping account level for one or more corporate action events or at the
 * corporate action event level for one or more safekeeping accounts.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate),<br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy),<br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate).<br>
 * using the relevant elements in the business application header (BAH). ISO
 * 15022 - 20022 COEXISTENCE This ISO 20022 message is reversed engineered from
 * ISO 15022. Both standards will coexist for a certain number of years. Until
 * this coexistence period ends, the usage of certain data types is restricted
 * to ensure interoperability between ISO 15022 and 20022 users. Compliance to
 * these rules is mandatory in a coexistence environment. The coexistence
 * restrictions are described in a Textual Rule linked to the Message Items they
 * concern. These coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.042.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
 * SecuritiesEventsArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV02#mmPagination
 * CorporateActionInstructionStatementReportV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV02#mmStatementGeneralDetails
 * CorporateActionInstructionStatementReportV02.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV02#mmAccountAndStatementDetails
 * CorporateActionInstructionStatementReportV02.mmAccountAndStatementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV02#mmSupplementaryData
 * CorporateActionInstructionStatementReportV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnInstrStmtRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInstructionStatementReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionInstructionStatementReport message to an account owner or its designated agent to report balances at the safekeeping account level for one or more corporate action events or at the corporate action event level for one or more safekeeping accounts.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\r\nusing the relevant elements in the business application header (BAH).\nISO 15022 - 20022 COEXISTENCE\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMultipleAccountAndStatementDetailsRule#for_seev_CorporateActionInstructionStatementReportV02
 * ConstraintMultipleAccountAndStatementDetailsRule.
 * for_seev_CorporateActionInstructionStatementReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule#for_seev_CorporateActionInstructionStatementReportV02
 * ConstraintCorporateActionEventAndBalanceRule.
 * for_seev_CorporateActionInstructionStatementReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionInstructionStatementReportV02
 * ConstraintCoexistenceCharacterSetXRule.
 * for_seev_CorporateActionInstructionStatementReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_seev_CorporateActionInstructionStatementReportV02
 * ConstraintCoexistenceIdentificationRule.
 * for_seev_CorporateActionInstructionStatementReportV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV03
 * CorporateActionInstructionStatementReportV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01
 * CorporateActionInstructionStatementReportV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionInstructionStatementReportV02", propOrder = {"pagination", "statementGeneralDetails", "accountAndStatementDetails", "supplementaryData"})
public class CorporateActionInstructionStatementReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
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
	 * "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionStatementReportV02, Pagination> mmPagination = new MMMessageBuildingBlock<CorporateActionInstructionStatementReportV02, Pagination>() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Pagination getValue(CorporateActionInstructionStatementReportV02 obj) {
			return obj.getPagination();
		}

		@Override
		public void setValue(CorporateActionInstructionStatementReportV02 obj, Pagination value) {
			obj.setPagination(value);
		}
	};
	@XmlElement(name = "StmtGnlDtls", required = true)
	protected Statement12 statementGeneralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Statement12
	 * Statement12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtGnlDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementGeneralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General characteristics related to a statement which reports information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionStatementReportV02, Statement12> mmStatementGeneralDetails = new MMMessageBuildingBlock<CorporateActionInstructionStatementReportV02, Statement12>() {
		{
			xmlTag = "StmtGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementGeneralDetails";
			definition = "General characteristics related to a statement which reports information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Statement12.mmObject();
		}

		@Override
		public Statement12 getValue(CorporateActionInstructionStatementReportV02 obj) {
			return obj.getStatementGeneralDetails();
		}

		@Override
		public void setValue(CorporateActionInstructionStatementReportV02 obj, Statement12 value) {
			obj.setStatementGeneralDetails(value);
		}
	};
	@XmlElement(name = "AcctAndStmtDtls", required = true)
	protected List<AccountIdentification16> accountAndStatementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification16
	 * AccountIdentification16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctAndStmtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountAndStatementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account information and detailed account holdings information report for corporate action events."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionStatementReportV02, List<AccountIdentification16>> mmAccountAndStatementDetails = new MMMessageBuildingBlock<CorporateActionInstructionStatementReportV02, List<AccountIdentification16>>() {
		{
			xmlTag = "AcctAndStmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountAndStatementDetails";
			definition = "Account information and detailed account holdings information report for corporate action events.";
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification16.mmObject();
		}

		@Override
		public List<AccountIdentification16> getValue(CorporateActionInstructionStatementReportV02 obj) {
			return obj.getAccountAndStatementDetails();
		}

		@Override
		public void setValue(CorporateActionInstructionStatementReportV02 obj, List<AccountIdentification16> value) {
			obj.setAccountAndStatementDetails(value);
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
	public static final MMMessageBuildingBlock<CorporateActionInstructionStatementReportV02, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CorporateActionInstructionStatementReportV02, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionInstructionStatementReportV02 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionInstructionStatementReportV02 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMultipleAccountAndStatementDetailsRule.for_seev_CorporateActionInstructionStatementReportV02,
						com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule.for_seev_CorporateActionInstructionStatementReportV02,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionInstructionStatementReportV02,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_seev_CorporateActionInstructionStatementReportV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInstructionStatementReportV02";
				definition = "Scope\r\nAn account servicer sends the CorporateActionInstructionStatementReport message to an account owner or its designated agent to report balances at the safekeeping account level for one or more corporate action events or at the corporate action event level for one or more safekeeping accounts.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\r\nusing the relevant elements in the business application header (BAH).\nISO 15022 - 20022 COEXISTENCE\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructionStatementReportV03.mmObject());
				previousVersion_lazy = () -> CorporateActionInstructionStatementReportV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnInstrStmtRpt";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV02.mmPagination,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV02.mmStatementGeneralDetails,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV02.mmAccountAndStatementDetails, com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "042";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionInstructionStatementReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Pagination getPagination() {
		return pagination;
	}

	public CorporateActionInstructionStatementReportV02 setPagination(Pagination pagination) {
		this.pagination = Objects.requireNonNull(pagination);
		return this;
	}

	public Statement12 getStatementGeneralDetails() {
		return statementGeneralDetails;
	}

	public CorporateActionInstructionStatementReportV02 setStatementGeneralDetails(Statement12 statementGeneralDetails) {
		this.statementGeneralDetails = Objects.requireNonNull(statementGeneralDetails);
		return this;
	}

	public List<AccountIdentification16> getAccountAndStatementDetails() {
		return accountAndStatementDetails == null ? accountAndStatementDetails = new ArrayList<>() : accountAndStatementDetails;
	}

	public CorporateActionInstructionStatementReportV02 setAccountAndStatementDetails(List<AccountIdentification16> accountAndStatementDetails) {
		this.accountAndStatementDetails = Objects.requireNonNull(accountAndStatementDetails);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionInstructionStatementReportV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.042.001.02")
	static public class Document {
		@XmlElement(name = "CorpActnInstrStmtRpt", required = true)
		public CorporateActionInstructionStatementReportV02 messageBody;
	}
}