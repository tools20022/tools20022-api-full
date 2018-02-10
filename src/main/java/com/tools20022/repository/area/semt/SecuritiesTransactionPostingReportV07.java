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
import com.tools20022.repository.area.SecuritiesManagementLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion;
import com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#mmPagination
 * SecuritiesTransactionPostingReportV07.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#mmStatementGeneralDetails
 * SecuritiesTransactionPostingReportV07.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#mmAccountOwner
 * SecuritiesTransactionPostingReportV07.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#mmSafekeepingAccount
 * SecuritiesTransactionPostingReportV07.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#mmFinancialInstrumentDetails
 * SecuritiesTransactionPostingReportV07.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#mmSubAccountDetails
 * SecuritiesTransactionPostingReportV07.mmSubAccountDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion
 * SettlementAndReconciliationISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017
 * SettlementandReconciliationMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesTxPstngRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementLatestVersion
 * SecuritiesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.017.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentDetailsReportingRule#forSecuritiesTransactionPostingReportV07
 * ConstraintFinancialInstrumentDetailsReportingRule.
 * forSecuritiesTransactionPostingReportV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSubAccountDetailsFinancialInstrumentPresenceRule#forSecuritiesTransactionPostingReportV07
 * ConstraintSubAccountDetailsFinancialInstrumentPresenceRule.
 * forSecuritiesTransactionPostingReportV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentDetailsOrSubAccountDetailsRule#forSecuritiesTransactionPostingReportV07
 * ConstraintFinancialInstrumentDetailsOrSubAccountDetailsRule.
 * forSecuritiesTransactionPostingReportV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPostingReportV07
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * forSecuritiesTransactionPostingReportV07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionPostingReportV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends a SecuritiesTransactionPostingReport to an account owner to provide the details of increases and decreases of holdings which occurred during a specified period, for all or selected securities in the specified safekeeping account or sub-safekeeping account which the account servicer holds for the account owner. \r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or \r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThis message may be used as a trade date based or a settlement date based statement.\r\nThe message may also be used to: \r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06
 * SecuritiesTransactionPostingReportV06}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTransactionPostingReportV07", propOrder = {"pagination", "statementGeneralDetails", "accountOwner", "safekeepingAccount", "financialInstrumentDetails", "subAccountDetails"})
public class SecuritiesTransactionPostingReportV07 {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#mmPagination
	 * SecuritiesTransactionPostingReportV06.mmPagination}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement.";
			previousVersion_lazy = () -> SecuritiesTransactionPostingReportV06.mmPagination;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTransactionPostingReportV07.class.getMethod("getPagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#mmStatementGeneralDetails
	 * SecuritiesTransactionPostingReportV06.mmStatementGeneralDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatementGeneralDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StmtGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementGeneralDetails";
			definition = "Provides general information on the report.";
			previousVersion_lazy = () -> SecuritiesTransactionPostingReportV06.mmStatementGeneralDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Statement44.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTransactionPostingReportV07.class.getMethod("getStatementGeneralDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#mmAccountOwner
	 * SecuritiesTransactionPostingReportV06.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountOwner = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			previousVersion_lazy = () -> SecuritiesTransactionPostingReportV06.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification98.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTransactionPostingReportV07.class.getMethod("getAccountOwner", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#mmSafekeepingAccount
	 * SecuritiesTransactionPostingReportV06.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSafekeepingAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			previousVersion_lazy = () -> SecuritiesTransactionPostingReportV06.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount24.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTransactionPostingReportV07.class.getMethod("getSafekeepingAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "FinInstrmDtls")
	protected List<FinancialInstrumentDetails25> financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25
	 * FinancialInstrumentDetails25}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#mmFinancialInstrumentDetails
	 * SecuritiesTransactionPostingReportV06.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Reporting per financial instrument.";
			previousVersion_lazy = () -> SecuritiesTransactionPostingReportV06.mmFinancialInstrumentDetails;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentDetails25.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTransactionPostingReportV07.class.getMethod("getFinancialInstrumentDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SubAcctDtls")
	protected List<SubAccountIdentification49> subAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification49
	 * SubAccountIdentification49}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#mmSubAccountDetails
	 * SecuritiesTransactionPostingReportV06.mmSubAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Details at sub-account level.";
			previousVersion_lazy = () -> SecuritiesTransactionPostingReportV06.mmSubAccountDetails;
			minOccurs = 0;
			complexType_lazy = () -> SubAccountIdentification49.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTransactionPostingReportV07.class.getMethod("getSubAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentDetailsReportingRule.forSecuritiesTransactionPostingReportV07,
						com.tools20022.repository.constraints.ConstraintSubAccountDetailsFinancialInstrumentPresenceRule.forSecuritiesTransactionPostingReportV07,
						com.tools20022.repository.constraints.ConstraintFinancialInstrumentDetailsOrSubAccountDetailsRule.forSecuritiesTransactionPostingReportV07,
						com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPostingReportV07);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionPostingReportV07";
				definition = "Scope\r\nAn account servicer sends a SecuritiesTransactionPostingReport to an account owner to provide the details of increases and decreases of holdings which occurred during a specified period, for all or selected securities in the specified safekeeping account or sub-safekeeping account which the account servicer holds for the account owner. \r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or \r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThis message may be used as a trade date based or a settlement date based statement.\r\nThe message may also be used to: \r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header.";
				previousVersion_lazy = () -> SecuritiesTransactionPostingReportV06.mmObject();
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISOLatestversion.mmObject(), SettlementandReconciliationMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesTxPstngRpt";
				businessArea_lazy = () -> SecuritiesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07.mmPagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07.mmStatementGeneralDetails, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07.mmAccountOwner,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07.mmSafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07.mmFinancialInstrumentDetails,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07.mmSubAccountDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "017";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTransactionPostingReportV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Pagination getPagination() {
		return pagination;
	}

	public SecuritiesTransactionPostingReportV07 setPagination(Pagination pagination) {
		this.pagination = Objects.requireNonNull(pagination);
		return this;
	}

	public Statement44 getStatementGeneralDetails() {
		return statementGeneralDetails;
	}

	public SecuritiesTransactionPostingReportV07 setStatementGeneralDetails(Statement44 statementGeneralDetails) {
		this.statementGeneralDetails = Objects.requireNonNull(statementGeneralDetails);
		return this;
	}

	public Optional<PartyIdentification98> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public SecuritiesTransactionPostingReportV07 setAccountOwner(PartyIdentification98 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public SecuritiesAccount24 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public SecuritiesTransactionPostingReportV07 setSafekeepingAccount(SecuritiesAccount24 safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public List<FinancialInstrumentDetails25> getFinancialInstrumentDetails() {
		return financialInstrumentDetails == null ? financialInstrumentDetails = new ArrayList<>() : financialInstrumentDetails;
	}

	public SecuritiesTransactionPostingReportV07 setFinancialInstrumentDetails(List<FinancialInstrumentDetails25> financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public List<SubAccountIdentification49> getSubAccountDetails() {
		return subAccountDetails == null ? subAccountDetails = new ArrayList<>() : subAccountDetails;
	}

	public SecuritiesTransactionPostingReportV07 setSubAccountDetails(List<SubAccountIdentification49> subAccountDetails) {
		this.subAccountDetails = Objects.requireNonNull(subAccountDetails);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.017.001.07")
	static public class Document {
		@XmlElement(name = "SctiesTxPstngRpt", required = true)
		public SecuritiesTransactionPostingReportV07 messageBody;
	}
}