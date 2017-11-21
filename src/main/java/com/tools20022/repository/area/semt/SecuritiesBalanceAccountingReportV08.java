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
import com.tools20022.repository.area.SecuritiesManagementPreviousVersion;
import com.tools20022.repository.choice.PartyIdentification36Choice;
import com.tools20022.repository.choice.PartyIdentification49Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import com.tools20022.repository.msgset.SettlementAndReconciliationISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * Scope An account servicer sends a SecuritiesBalanceAccountingReport to an
 * account owner to provide, at a moment in time, valuations of the portfolio
 * together with details of each financial instrument holding. The account
 * servicer/owner relationship may be: - an accounting agent acting on behalf of
 * an account owner, or - a transfer agent acting on behalf of a fund manager or
 * an account owner's designated agent.
 * 
 * Usage The message should be sent at a frequency agreed bi-laterally between
 * the account servicer and the account owner. The message can be sent either
 * audited or un-audited and may be provided on a trade date, contractual or
 * settlement date basis. This message can only be used to list the holdings of
 * a single (master) account. However, it is possible to break down these
 * holdings into one or several sub-accounts. Therefore, the message can be used
 * to either specify holdings at - the main account level, or, - the sub-account
 * level. This message can be used to report where the financial instruments are
 * safe-kept, physically or notionally. If a security is held in more than one
 * safekeeping place, this can also be indicated. The
 * SecuritiesBalanceAccountingReport message should not be used for trading
 * purposes. There may be one or more intermediary parties, for example, an
 * intermediary or a concentrator between the account owner and account
 * servicer. The message may also be used to: - re-send a message previously
 * sent, - provide a third party with a copy of a message for information, -
 * re-send to a third party a copy of a message for information using the
 * relevant elements in the Business Application Header.
 * 
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementPreviousVersion
 * SecuritiesManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISOPreviousversion
 * SettlementAndReconciliationISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesBalAcctgRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmPagination
 * SecuritiesBalanceAccountingReportV08.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmStatementGeneralDetails
 * SecuritiesBalanceAccountingReportV08.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmAccountOwner
 * SecuritiesBalanceAccountingReportV08.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmAccountServicer
 * SecuritiesBalanceAccountingReportV08.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmSafekeepingAccount
 * SecuritiesBalanceAccountingReportV08.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmIntermediaryInformation
 * SecuritiesBalanceAccountingReportV08.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmBalanceForAccount
 * SecuritiesBalanceAccountingReportV08.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmSubAccountDetails
 * SecuritiesBalanceAccountingReportV08.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV08.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmAlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV08.mmAlternateReportingCurrencyTotalAmounts
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.003.001.08}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesBalanceAccountingReportV08"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account servicer sends a SecuritiesBalanceAccountingReport to an account owner to provide, at a moment in time, valuations of the portfolio together with details of each financial instrument holding.\nThe account servicer/owner relationship may be:\n- an accounting agent acting on behalf of an account owner, or\n- a transfer agent acting on behalf of a fund manager or an account owner's designated agent.\n\nUsage\nThe message should be sent at a frequency agreed bi-laterally between the account servicer and the account owner.\nThe message can be sent either audited or un-audited and may be provided on a trade date, contractual or settlement date basis. \nThis message can only be used to list the holdings of a single (master) account. However, it is possible to break down these holdings into one or several sub-accounts. Therefore, the message can be used to either specify holdings at\n- the main account level, or, \n- the sub-account level.\nThis message can be used to report where the financial instruments are safe-kept, physically or notionally. If a security is held in more than one safekeeping place, this can also be indicated. \nThe SecuritiesBalanceAccountingReport message should not be used for trading purposes.\nThere may be one or more intermediary parties, for example, an intermediary or a concentrator between the account owner and account servicer.\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09
 * SecuritiesBalanceAccountingReportV09}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07
 * SecuritiesBalanceAccountingReportV07}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesBalanceAccountingReportV08", propOrder = {"pagination", "statementGeneralDetails", "accountOwner", "accountServicer", "safekeepingAccount", "intermediaryInformation", "balanceForAccount", "subAccountDetails",
		"accountBaseCurrencyTotalAmounts", "alternateReportingCurrencyTotalAmounts"})
public class SecuritiesBalanceAccountingReportV08 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Pagination pagination;
	/**
	 * Page number of the message (within a statement) and continuation
	 * indicator to indicate that the statement is to continue or that the
	 * message is the last page of the statement.
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
	 * "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmPagination
	 * SecuritiesBalanceAccountingReportV09.mmPagination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmPagination
	 * SecuritiesBalanceAccountingReportV07.mmPagination}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV09.mmPagination);
			previousVersion_lazy = () -> SecuritiesBalanceAccountingReportV07.mmPagination;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceAccountingReportV08.class.getMethod("getPagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Statement20 statementGeneralDetails;
	/**
	 * Provides general information on the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Statement20
	 * Statement20}</li>
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmStatementGeneralDetails
	 * SecuritiesBalanceAccountingReportV09.mmStatementGeneralDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmStatementGeneralDetails
	 * SecuritiesBalanceAccountingReportV07.mmStatementGeneralDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatementGeneralDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StmtGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementGeneralDetails";
			definition = "Provides general information on the report.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV09.mmStatementGeneralDetails);
			previousVersion_lazy = () -> SecuritiesBalanceAccountingReportV07.mmStatementGeneralDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Statement20.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceAccountingReportV08.class.getMethod("getStatementGeneralDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification36Choice accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
	 * PartyIdentification36Choice}</li>
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmAccountOwner
	 * SecuritiesBalanceAccountingReportV09.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmAccountOwner
	 * SecuritiesBalanceAccountingReportV07.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountOwner = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV09.mmAccountOwner);
			previousVersion_lazy = () -> SecuritiesBalanceAccountingReportV07.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification36Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceAccountingReportV08.class.getMethod("getAccountOwner", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification49Choice accountServicer;
	/**
	 * Party that manages the account on behalf of the account owner, that is
	 * manages the registration and booking of entries on the account,
	 * calculates balances on the account and provides information about the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification49Choice
	 * PartyIdentification49Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmAccountServicer
	 * SecuritiesBalanceAccountingReportV09.mmAccountServicer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmAccountServicer
	 * SecuritiesBalanceAccountingReportV07.mmAccountServicer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountServicer = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV09.mmAccountServicer);
			previousVersion_lazy = () -> SecuritiesBalanceAccountingReportV07.mmAccountServicer;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification49Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceAccountingReportV08.class.getMethod("getAccountServicer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesAccount11 safekeepingAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount11
	 * SecuritiesAccount11}</li>
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmSafekeepingAccount
	 * SecuritiesBalanceAccountingReportV09.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmSafekeepingAccount
	 * SecuritiesBalanceAccountingReportV07.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSafekeepingAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV09.mmSafekeepingAccount);
			previousVersion_lazy = () -> SecuritiesBalanceAccountingReportV07.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount11.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceAccountingReportV08.class.getMethod("getSafekeepingAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Intermediary23> intermediaryInformation;
	/**
	 * Information about the party that provides services relating to financial
	 * products to investors, for example, advice on products and placement of
	 * orders for the investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary23
	 * Intermediary23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the party that provides services relating to financial products to investors, for example, advice on products and placement of orders for the investment fund."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmIntermediaryInformation
	 * SecuritiesBalanceAccountingReportV09.mmIntermediaryInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmIntermediaryInformation
	 * SecuritiesBalanceAccountingReportV07.mmIntermediaryInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIntermediaryInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "IntrmyInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryInformation";
			definition = "Information about the party that provides services relating to financial products to investors, for example, advice on products and placement of orders for the investment fund.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV09.mmIntermediaryInformation);
			previousVersion_lazy = () -> SecuritiesBalanceAccountingReportV07.mmIntermediaryInformation;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> Intermediary23.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceAccountingReportV08.class.getMethod("getIntermediaryInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<AggregateBalanceInformation26> balanceForAccount;
	/**
	 * Net position of a segregated holding, in a single security, within the
	 * overall position held in a securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26
	 * AggregateBalanceInformation26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalForAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmBalanceForAccount
	 * SecuritiesBalanceAccountingReportV09.mmBalanceForAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmBalanceForAccount
	 * SecuritiesBalanceAccountingReportV07.mmBalanceForAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBalanceForAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "BalForAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccount";
			definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV09.mmBalanceForAccount);
			previousVersion_lazy = () -> SecuritiesBalanceAccountingReportV07.mmBalanceForAccount;
			minOccurs = 0;
			complexType_lazy = () -> AggregateBalanceInformation26.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceAccountingReportV08.class.getMethod("getBalanceForAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SubAccountIdentification38> subAccountDetails;
	/**
	 * Sub-account of the safekeeping or investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification38
	 * SubAccountIdentification38}</li>
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
	 * definition} = "Sub-account of the safekeeping or investment account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmSubAccountDetails
	 * SecuritiesBalanceAccountingReportV09.mmSubAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmSubAccountDetails
	 * SecuritiesBalanceAccountingReportV07.mmSubAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Sub-account of the safekeeping or investment account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV09.mmSubAccountDetails);
			previousVersion_lazy = () -> SecuritiesBalanceAccountingReportV07.mmSubAccountDetails;
			minOccurs = 0;
			complexType_lazy = () -> SubAccountIdentification38.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceAccountingReportV08.class.getMethod("getSubAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TotalValueInPageAndStatement2 accountBaseCurrencyTotalAmounts;
	/**
	 * Total valuation amounts provided in the base currency of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement2
	 * TotalValueInPageAndStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctBaseCcyTtlAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBaseCurrencyTotalAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total valuation amounts provided in the base currency of the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmAccountBaseCurrencyTotalAmounts
	 * SecuritiesBalanceAccountingReportV09.mmAccountBaseCurrencyTotalAmounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmAccountBaseCurrencyTotalAmounts
	 * SecuritiesBalanceAccountingReportV07.mmAccountBaseCurrencyTotalAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountBaseCurrencyTotalAmounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctBaseCcyTtlAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBaseCurrencyTotalAmounts";
			definition = "Total valuation amounts provided in the base currency of the account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV09.mmAccountBaseCurrencyTotalAmounts);
			previousVersion_lazy = () -> SecuritiesBalanceAccountingReportV07.mmAccountBaseCurrencyTotalAmounts;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TotalValueInPageAndStatement2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceAccountingReportV08.class.getMethod("getAccountBaseCurrencyTotalAmounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TotalValueInPageAndStatement2 alternateReportingCurrencyTotalAmounts;
	/**
	 * Total valuation amounts provided in another currency than the base
	 * currency of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement2
	 * TotalValueInPageAndStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrnRptgCcyTtlAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternateReportingCurrencyTotalAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total valuation amounts provided in another currency than the base currency of the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmAlternateReportingCurrencyTotalAmounts
	 * SecuritiesBalanceAccountingReportV09.
	 * mmAlternateReportingCurrencyTotalAmounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmAlternateReportingCurrencyTotalAmounts
	 * SecuritiesBalanceAccountingReportV07.
	 * mmAlternateReportingCurrencyTotalAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAlternateReportingCurrencyTotalAmounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "AltrnRptgCcyTtlAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternateReportingCurrencyTotalAmounts";
			definition = "Total valuation amounts provided in another currency than the base currency of the account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV09.mmAlternateReportingCurrencyTotalAmounts);
			previousVersion_lazy = () -> SecuritiesBalanceAccountingReportV07.mmAlternateReportingCurrencyTotalAmounts;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TotalValueInPageAndStatement2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceAccountingReportV08.class.getMethod("getAlternateReportingCurrencyTotalAmounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceAccountingReportV08";
				definition = "Scope\nAn account servicer sends a SecuritiesBalanceAccountingReport to an account owner to provide, at a moment in time, valuations of the portfolio together with details of each financial instrument holding.\nThe account servicer/owner relationship may be:\n- an accounting agent acting on behalf of an account owner, or\n- a transfer agent acting on behalf of a fund manager or an account owner's designated agent.\n\nUsage\nThe message should be sent at a frequency agreed bi-laterally between the account servicer and the account owner.\nThe message can be sent either audited or un-audited and may be provided on a trade date, contractual or settlement date basis. \nThis message can only be used to list the holdings of a single (master) account. However, it is possible to break down these holdings into one or several sub-accounts. Therefore, the message can be used to either specify holdings at\n- the main account level, or, \n- the sub-account level.\nThis message can be used to report where the financial instruments are safe-kept, physically or notionally. If a security is held in more than one safekeeping place, this can also be indicated. \nThe SecuritiesBalanceAccountingReport message should not be used for trading purposes.\nThere may be one or more intermediary parties, for example, an intermediary or a concentrator between the account owner and account servicer.\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV09.mmObject());
				previousVersion_lazy = () -> SecuritiesBalanceAccountingReportV07.mmObject();
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesBalAcctgRpt";
				businessArea_lazy = () -> SecuritiesManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08.mmPagination,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08.mmStatementGeneralDetails, com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08.mmAccountOwner,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08.mmAccountServicer, com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08.mmSafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08.mmIntermediaryInformation, com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08.mmBalanceForAccount,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08.mmSubAccountDetails, com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08.mmAccountBaseCurrencyTotalAmounts,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08.mmAlternateReportingCurrencyTotalAmounts);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "003";
						version = "08";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesBalanceAccountingReportV08.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Pgntn", required = true)
	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	@XmlElement(name = "StmtGnlDtls", required = true)
	public Statement20 getStatementGeneralDetails() {
		return statementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement20 statementGeneralDetails) {
		this.statementGeneralDetails = statementGeneralDetails;
	}

	@XmlElement(name = "AcctOwnr")
	public PartyIdentification36Choice getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(PartyIdentification36Choice accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "AcctSvcr")
	public PartyIdentification49Choice getAccountServicer() {
		return accountServicer;
	}

	public void setAccountServicer(PartyIdentification49Choice accountServicer) {
		this.accountServicer = accountServicer;
	}

	@XmlElement(name = "SfkpgAcct", required = true)
	public SecuritiesAccount11 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount11 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}

	@XmlElement(name = "IntrmyInf")
	public List<Intermediary23> getIntermediaryInformation() {
		return intermediaryInformation;
	}

	public void setIntermediaryInformation(List<Intermediary23> intermediaryInformation) {
		this.intermediaryInformation = intermediaryInformation;
	}

	@XmlElement(name = "BalForAcct")
	public List<AggregateBalanceInformation26> getBalanceForAccount() {
		return balanceForAccount;
	}

	public void setBalanceForAccount(List<AggregateBalanceInformation26> balanceForAccount) {
		this.balanceForAccount = balanceForAccount;
	}

	@XmlElement(name = "SubAcctDtls")
	public List<SubAccountIdentification38> getSubAccountDetails() {
		return subAccountDetails;
	}

	public void setSubAccountDetails(List<SubAccountIdentification38> subAccountDetails) {
		this.subAccountDetails = subAccountDetails;
	}

	@XmlElement(name = "AcctBaseCcyTtlAmts")
	public TotalValueInPageAndStatement2 getAccountBaseCurrencyTotalAmounts() {
		return accountBaseCurrencyTotalAmounts;
	}

	public void setAccountBaseCurrencyTotalAmounts(TotalValueInPageAndStatement2 accountBaseCurrencyTotalAmounts) {
		this.accountBaseCurrencyTotalAmounts = accountBaseCurrencyTotalAmounts;
	}

	@XmlElement(name = "AltrnRptgCcyTtlAmts")
	public TotalValueInPageAndStatement2 getAlternateReportingCurrencyTotalAmounts() {
		return alternateReportingCurrencyTotalAmounts;
	}

	public void setAlternateReportingCurrencyTotalAmounts(TotalValueInPageAndStatement2 alternateReportingCurrencyTotalAmounts) {
		this.alternateReportingCurrencyTotalAmounts = alternateReportingCurrencyTotalAmounts;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:semt.003.08.08")
	static public class Document {
		@XmlElement(name = "SctiesBalAcctgRpt", required = true)
		public SecuritiesBalanceAccountingReportV08 messageBody;
	}
}