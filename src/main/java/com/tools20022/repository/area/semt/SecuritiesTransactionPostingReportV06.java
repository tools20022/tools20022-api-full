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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesManagementArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends a SecuritiesTransactionPostingReport to an account
 * owner to provide the details of increases and decreases of holdings which
 * occurred during a specified period, for all or selected securities in the
 * specified safekeeping account or sub-safekeeping account which the account
 * servicer holds for the account owner. <br>
 * The account servicer/owner relationship may be:<br>
 * - a central securities depository or another settlement market infrastructure
 * acting on behalf of their participants<br>
 * - an agent (sub-custodian) acting on behalf of their global custodian
 * customer, or <br>
 * - a custodian acting on behalf of an investment management institution or a
 * broker/dealer.<br>
 * <br>
 * <b>Usage</b><br>
 * This message may be used as a trade date based or a settlement date based
 * statement.<br>
 * The message may also be used to: <br>
 * - re-send a message previously sent,<br>
 * - provide a third party with a copy of a message for information,<br>
 * - re-send to a third party a copy of a message for information<br>
 * using the relevant elements in the Business Application Header.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#mmPagination
 * SecuritiesTransactionPostingReportV06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#mmStatementGeneralDetails
 * SecuritiesTransactionPostingReportV06.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#mmAccountOwner
 * SecuritiesTransactionPostingReportV06.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#mmSafekeepingAccount
 * SecuritiesTransactionPostingReportV06.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#mmFinancialInstrumentDetails
 * SecuritiesTransactionPostingReportV06.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#mmSubAccountDetails
 * SecuritiesTransactionPostingReportV06.mmSubAccountDetails}</li>
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
 * xmlTag} = "SctiesTxPstngRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementArchive
 * SecuritiesManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.017.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentDetailsReportingRule#for_semt_SecuritiesTransactionPostingReportV06
 * ConstraintFinancialInstrumentDetailsReportingRule.
 * for_semt_SecuritiesTransactionPostingReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSubAccountDetailsFinancialInstrumentPresenceRule#for_semt_SecuritiesTransactionPostingReportV06
 * ConstraintSubAccountDetailsFinancialInstrumentPresenceRule.
 * for_semt_SecuritiesTransactionPostingReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentDetailsOrSubAccountDetailsRule#for_semt_SecuritiesTransactionPostingReportV06
 * ConstraintFinancialInstrumentDetailsOrSubAccountDetailsRule.
 * for_semt_SecuritiesTransactionPostingReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPostingReportV06
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * for_semt_SecuritiesTransactionPostingReportV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionPostingReportV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends a SecuritiesTransactionPostingReport to an account owner to provide the details of increases and decreases of holdings which occurred during a specified period, for all or selected securities in the specified safekeeping account or sub-safekeeping account which the account servicer holds for the account owner. \r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or \r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThis message may be used as a trade date based or a settlement date based statement.\r\nThe message may also be used to: \r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07
 * SecuritiesTransactionPostingReportV07}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05
 * SecuritiesTransactionPostingReportV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTransactionPostingReportV06", propOrder = {"pagination", "statementGeneralDetails", "accountOwner", "safekeepingAccount", "financialInstrumentDetails", "subAccountDetails"})
public class SecuritiesTransactionPostingReportV06 {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#mmPagination
	 * SecuritiesTransactionPostingReportV07.mmPagination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05#mmPagination
	 * SecuritiesTransactionPostingReportV05.mmPagination}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionPostingReportV06, Pagination> mmPagination = new MMMessageBuildingBlock<SecuritiesTransactionPostingReportV06, Pagination>() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionPostingReportV07.mmPagination);
			previousVersion_lazy = () -> SecuritiesTransactionPostingReportV05.mmPagination;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Pagination getValue(SecuritiesTransactionPostingReportV06 obj) {
			return obj.getPagination();
		}

		@Override
		public void setValue(SecuritiesTransactionPostingReportV06 obj, Pagination value) {
			obj.setPagination(value);
		}
	};
	@XmlElement(name = "StmtGnlDtls", required = true)
	protected Statement44 statementGeneralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Statement44
	 * Statement44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtGnlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementGeneralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides general information on the report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#mmStatementGeneralDetails
	 * SecuritiesTransactionPostingReportV07.mmStatementGeneralDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05#mmStatementGeneralDetails
	 * SecuritiesTransactionPostingReportV05.mmStatementGeneralDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionPostingReportV06, Statement44> mmStatementGeneralDetails = new MMMessageBuildingBlock<SecuritiesTransactionPostingReportV06, Statement44>() {
		{
			xmlTag = "StmtGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementGeneralDetails";
			definition = "Provides general information on the report.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionPostingReportV07.mmStatementGeneralDetails);
			previousVersion_lazy = () -> SecuritiesTransactionPostingReportV05.mmStatementGeneralDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Statement44.mmObject();
		}

		@Override
		public Statement44 getValue(SecuritiesTransactionPostingReportV06 obj) {
			return obj.getStatementGeneralDetails();
		}

		@Override
		public void setValue(SecuritiesTransactionPostingReportV06 obj, Statement44 value) {
			obj.setStatementGeneralDetails(value);
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification98 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification98
	 * PartyIdentification98}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#mmAccountOwner
	 * SecuritiesTransactionPostingReportV07.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05#mmAccountOwner
	 * SecuritiesTransactionPostingReportV05.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionPostingReportV06, Optional<PartyIdentification98>> mmAccountOwner = new MMMessageBuildingBlock<SecuritiesTransactionPostingReportV06, Optional<PartyIdentification98>>() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionPostingReportV07.mmAccountOwner);
			previousVersion_lazy = () -> SecuritiesTransactionPostingReportV05.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification98.mmObject();
		}

		@Override
		public Optional<PartyIdentification98> getValue(SecuritiesTransactionPostingReportV06 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(SecuritiesTransactionPostingReportV06 obj, Optional<PartyIdentification98> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct", required = true)
	protected SecuritiesAccount24 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount24
	 * SecuritiesAccount24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#mmSafekeepingAccount
	 * SecuritiesTransactionPostingReportV07.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05#mmSafekeepingAccount
	 * SecuritiesTransactionPostingReportV05.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionPostingReportV06, SecuritiesAccount24> mmSafekeepingAccount = new MMMessageBuildingBlock<SecuritiesTransactionPostingReportV06, SecuritiesAccount24>() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionPostingReportV07.mmSafekeepingAccount);
			previousVersion_lazy = () -> SecuritiesTransactionPostingReportV05.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount24.mmObject();
		}

		@Override
		public SecuritiesAccount24 getValue(SecuritiesTransactionPostingReportV06 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(SecuritiesTransactionPostingReportV06 obj, SecuritiesAccount24 value) {
			obj.setSafekeepingAccount(value);
		}
	};
	@XmlElement(name = "FinInstrmDtls")
	protected List<FinancialInstrumentDetails20> financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails20
	 * FinancialInstrumentDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reporting per financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#mmFinancialInstrumentDetails
	 * SecuritiesTransactionPostingReportV07.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05#mmFinancialInstrumentDetails
	 * SecuritiesTransactionPostingReportV05.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionPostingReportV06, List<FinancialInstrumentDetails20>> mmFinancialInstrumentDetails = new MMMessageBuildingBlock<SecuritiesTransactionPostingReportV06, List<FinancialInstrumentDetails20>>() {
		{
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Reporting per financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionPostingReportV07.mmFinancialInstrumentDetails);
			previousVersion_lazy = () -> SecuritiesTransactionPostingReportV05.mmFinancialInstrumentDetails;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentDetails20.mmObject();
		}

		@Override
		public List<FinancialInstrumentDetails20> getValue(SecuritiesTransactionPostingReportV06 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(SecuritiesTransactionPostingReportV06 obj, List<FinancialInstrumentDetails20> value) {
			obj.setFinancialInstrumentDetails(value);
		}
	};
	@XmlElement(name = "SubAcctDtls")
	protected List<SubAccountIdentification44> subAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification44
	 * SubAccountIdentification44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details at sub-account level."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#mmSubAccountDetails
	 * SecuritiesTransactionPostingReportV07.mmSubAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05#mmSubAccountDetails
	 * SecuritiesTransactionPostingReportV05.mmSubAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionPostingReportV06, List<SubAccountIdentification44>> mmSubAccountDetails = new MMMessageBuildingBlock<SecuritiesTransactionPostingReportV06, List<SubAccountIdentification44>>() {
		{
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Details at sub-account level.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionPostingReportV07.mmSubAccountDetails);
			previousVersion_lazy = () -> SecuritiesTransactionPostingReportV05.mmSubAccountDetails;
			minOccurs = 0;
			complexType_lazy = () -> SubAccountIdentification44.mmObject();
		}

		@Override
		public List<SubAccountIdentification44> getValue(SecuritiesTransactionPostingReportV06 obj) {
			return obj.getSubAccountDetails();
		}

		@Override
		public void setValue(SecuritiesTransactionPostingReportV06 obj, List<SubAccountIdentification44> value) {
			obj.setSubAccountDetails(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentDetailsReportingRule.for_semt_SecuritiesTransactionPostingReportV06,
						com.tools20022.repository.constraints.ConstraintSubAccountDetailsFinancialInstrumentPresenceRule.for_semt_SecuritiesTransactionPostingReportV06,
						com.tools20022.repository.constraints.ConstraintFinancialInstrumentDetailsOrSubAccountDetailsRule.for_semt_SecuritiesTransactionPostingReportV06,
						com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPostingReportV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionPostingReportV06";
				definition = "Scope\r\nAn account servicer sends a SecuritiesTransactionPostingReport to an account owner to provide the details of increases and decreases of holdings which occurred during a specified period, for all or selected securities in the specified safekeeping account or sub-safekeeping account which the account servicer holds for the account owner. \r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or \r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThis message may be used as a trade date based or a settlement date based statement.\r\nThe message may also be used to: \r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionPostingReportV07.mmObject());
				previousVersion_lazy = () -> SecuritiesTransactionPostingReportV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesTxPstngRpt";
				businessArea_lazy = () -> SecuritiesManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06.mmPagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06.mmStatementGeneralDetails, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06.mmAccountOwner,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06.mmSafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06.mmFinancialInstrumentDetails,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06.mmSubAccountDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "017";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTransactionPostingReportV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Pagination getPagination() {
		return pagination;
	}

	public SecuritiesTransactionPostingReportV06 setPagination(Pagination pagination) {
		this.pagination = Objects.requireNonNull(pagination);
		return this;
	}

	public Statement44 getStatementGeneralDetails() {
		return statementGeneralDetails;
	}

	public SecuritiesTransactionPostingReportV06 setStatementGeneralDetails(Statement44 statementGeneralDetails) {
		this.statementGeneralDetails = Objects.requireNonNull(statementGeneralDetails);
		return this;
	}

	public Optional<PartyIdentification98> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public SecuritiesTransactionPostingReportV06 setAccountOwner(PartyIdentification98 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public SecuritiesAccount24 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public SecuritiesTransactionPostingReportV06 setSafekeepingAccount(SecuritiesAccount24 safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public List<FinancialInstrumentDetails20> getFinancialInstrumentDetails() {
		return financialInstrumentDetails == null ? financialInstrumentDetails = new ArrayList<>() : financialInstrumentDetails;
	}

	public SecuritiesTransactionPostingReportV06 setFinancialInstrumentDetails(List<FinancialInstrumentDetails20> financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public List<SubAccountIdentification44> getSubAccountDetails() {
		return subAccountDetails == null ? subAccountDetails = new ArrayList<>() : subAccountDetails;
	}

	public SecuritiesTransactionPostingReportV06 setSubAccountDetails(List<SubAccountIdentification44> subAccountDetails) {
		this.subAccountDetails = Objects.requireNonNull(subAccountDetails);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.017.001.06")
	static public class Document {
		@XmlElement(name = "SctiesTxPstngRpt", required = true)
		public SecuritiesTransactionPostingReportV06 messageBody;
	}
}