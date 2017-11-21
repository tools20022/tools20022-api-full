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
import com.tools20022.repository.choice.PartyIdentification36Choice;
import com.tools20022.repository.choice.PartyIdentification49Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends a SecuritiesBalanceCustodyReport to an account
 * owner to provide, at a moment in time, the quantity and identification of the
 * financial instruments that the account servicer holds for the account owner<br>
 * The account servicer/owner relationship may be:<br>
 * - a central securities depository or another settlement market infrastructure
 * acting on behalf of their participants, or<br>
 * - an agent (sub-custodian) acting on behalf of their global custodian
 * customer, or<br>
 * - a custodian acting on behalf of an investment management institution or a
 * broker/dealer, or<br>
 * - a transfer agent acting on behalf of a fund manager or an account owner's
 * designated agent.<br>
 * <b>Usage</b><br>
 * The message can also include availability and the location of holdings to
 * facilitate trading and minimise settlement issues. The message reports all
 * information per financial instrument, that is, when a financial instrument is
 * held at multiple places of safekeeping, the total holdings for all locations
 * can be provided.<br>
 * The message should be sent at a frequency agreed bi-laterally between the
 * account servicer and the account owner. The message may be provided on a
 * trade date, contractual or settlement date basis.<br>
 * There may be one or more intermediary parties, for example, an intermediary
 * or a concentrator between the account owner and account servicer.<br>
 * The message may also be used to:<br>
 * - re-send a message previously sent,<br>
 * - provide a third party with a copy of a message for information,<br>
 * - re-send to a third party a copy of a message for information.<br>
 * using the relevant elements in the Business Application Header. ISO 15022 -
 * 20022 Coexistence This ISO 20022 message is reversed engineered from ISO
 * 15022. Both standards will coexist for a certain number of years. Until this
 * coexistence period ends, the usage of certain data types is restricted to
 * ensure interoperability between ISO 15022 and 20022 users. Compliance to
 * these rules is mandatory in a coexistence environment. The coexistence
 * restrictions are described in a Textual Rule linked to the Message Items they
 * concern. These coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementArchive
 * SecuritiesManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesBalCtdyRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#mmPagination
 * SecuritiesBalanceCustodyReportV05.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#mmStatementGeneralDetails
 * SecuritiesBalanceCustodyReportV05.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#mmAccountOwner
 * SecuritiesBalanceCustodyReportV05.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#mmAccountServicer
 * SecuritiesBalanceCustodyReportV05.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#mmSafekeepingAccount
 * SecuritiesBalanceCustodyReportV05.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#mmIntermediaryInformation
 * SecuritiesBalanceCustodyReportV05.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#mmBalanceForAccount
 * SecuritiesBalanceCustodyReportV05.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#mmSubAccountDetails
 * SecuritiesBalanceCustodyReportV05.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV05.mmAccountBaseCurrencyTotalAmounts}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.002.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesBalanceCustodyReportV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends a SecuritiesBalanceCustodyReport to an account owner to provide, at a moment in time, the quantity and identification of the financial instruments that the account servicer holds for the account owner\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants, or\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer, or\r\n- a transfer agent acting on behalf of a fund manager or an account owner's designated agent.\r\nUsage\r\nThe message can also include availability and the location of holdings to facilitate trading and minimise settlement issues. The message reports all information per financial instrument, that is, when a financial instrument is held at multiple places of safekeeping, the total holdings for all locations can be provided.\r\nThe message should be sent at a frequency agreed bi-laterally between the account servicer and the account owner. The message may be provided on a trade date, contractual or settlement date basis.\r\nThere may be one or more intermediary parties, for example, an intermediary or a concentrator between the account owner and account servicer.\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information.\r\nusing the relevant elements in the Business Application Header.\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV06
 * SecuritiesBalanceCustodyReportV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV04
 * SecuritiesBalanceCustodyReportV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesBalanceCustodyReportV05", propOrder = {"pagination", "statementGeneralDetails", "accountOwner", "accountServicer", "safekeepingAccount", "intermediaryInformation", "balanceForAccount", "subAccountDetails",
		"accountBaseCurrencyTotalAmounts"})
public class SecuritiesBalanceCustodyReportV05 {

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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceCustodyReportV05.class.getMethod("getPagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Statement33 statementGeneralDetails;
	/**
	 * Provides general information on the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Statement33
	 * Statement33}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatementGeneralDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StmtGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementGeneralDetails";
			definition = "Provides general information on the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Statement33.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceCustodyReportV05.class.getMethod("getStatementGeneralDetails", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountOwner = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification36Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceCustodyReportV05.class.getMethod("getAccountOwner", new Class[]{});
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
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountServicer = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.\n";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification49Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceCustodyReportV05.class.getMethod("getAccountServicer", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSafekeepingAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount11.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceCustodyReportV05.class.getMethod("getSafekeepingAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Intermediary21> intermediaryInformation;
	/**
	 * Information about the party that provides services relating to financial
	 * products to investors, for example, advice on products and placement of
	 * orders for the investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary21
	 * Intermediary21}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIntermediaryInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "IntrmyInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryInformation";
			definition = "Information about the party that provides services relating to financial products to investors, for example, advice on products and placement of orders for the investment fund.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> Intermediary21.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceCustodyReportV05.class.getMethod("getIntermediaryInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<AggregateBalanceInformation16> balanceForAccount;
	/**
	 * Net position of a segregated holding, in a single security, within the
	 * overall position held in a securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16
	 * AggregateBalanceInformation16}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBalanceForAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "BalForAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccount";
			definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			minOccurs = 0;
			complexType_lazy = () -> AggregateBalanceInformation16.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceCustodyReportV05.class.getMethod("getBalanceForAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SubAccountIdentification22> subAccountDetails;
	/**
	 * Sub-account of the safekeeping or investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification22
	 * SubAccountIdentification22}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Sub-account of the safekeeping or investment account.";
			minOccurs = 0;
			complexType_lazy = () -> SubAccountIdentification22.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceCustodyReportV05.class.getMethod("getSubAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TotalValueInPageAndStatement1 accountBaseCurrencyTotalAmounts;
	/**
	 * Total valuation amounts provided in the base currency of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1
	 * TotalValueInPageAndStatement1}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountBaseCurrencyTotalAmounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctBaseCcyTtlAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBaseCurrencyTotalAmounts";
			definition = "Total valuation amounts provided in the base currency of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TotalValueInPageAndStatement1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceCustodyReportV05.class.getMethod("getAccountBaseCurrencyTotalAmounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceCustodyReportV05";
				definition = "Scope\r\nAn account servicer sends a SecuritiesBalanceCustodyReport to an account owner to provide, at a moment in time, the quantity and identification of the financial instruments that the account servicer holds for the account owner\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants, or\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer, or\r\n- a transfer agent acting on behalf of a fund manager or an account owner's designated agent.\r\nUsage\r\nThe message can also include availability and the location of holdings to facilitate trading and minimise settlement issues. The message reports all information per financial instrument, that is, when a financial instrument is held at multiple places of safekeeping, the total holdings for all locations can be provided.\r\nThe message should be sent at a frequency agreed bi-laterally between the account servicer and the account owner. The message may be provided on a trade date, contractual or settlement date basis.\r\nThere may be one or more intermediary parties, for example, an intermediary or a concentrator between the account owner and account servicer.\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information.\r\nusing the relevant elements in the Business Application Header.\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesBalanceCustodyReportV06.mmObject());
				previousVersion_lazy = () -> SecuritiesBalanceCustodyReportV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesBalCtdyRpt";
				businessArea_lazy = () -> SecuritiesManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05.mmPagination,
						com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05.mmStatementGeneralDetails, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05.mmAccountOwner,
						com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05.mmAccountServicer, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05.mmSafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05.mmIntermediaryInformation, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05.mmBalanceForAccount,
						com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05.mmSubAccountDetails, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05.mmAccountBaseCurrencyTotalAmounts);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "002";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesBalanceCustodyReportV05.class;
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
	public Statement33 getStatementGeneralDetails() {
		return statementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement33 statementGeneralDetails) {
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
	public List<Intermediary21> getIntermediaryInformation() {
		return intermediaryInformation;
	}

	public void setIntermediaryInformation(List<Intermediary21> intermediaryInformation) {
		this.intermediaryInformation = intermediaryInformation;
	}

	@XmlElement(name = "BalForAcct")
	public List<AggregateBalanceInformation16> getBalanceForAccount() {
		return balanceForAccount;
	}

	public void setBalanceForAccount(List<AggregateBalanceInformation16> balanceForAccount) {
		this.balanceForAccount = balanceForAccount;
	}

	@XmlElement(name = "SubAcctDtls")
	public List<SubAccountIdentification22> getSubAccountDetails() {
		return subAccountDetails;
	}

	public void setSubAccountDetails(List<SubAccountIdentification22> subAccountDetails) {
		this.subAccountDetails = subAccountDetails;
	}

	@XmlElement(name = "AcctBaseCcyTtlAmts")
	public TotalValueInPageAndStatement1 getAccountBaseCurrencyTotalAmounts() {
		return accountBaseCurrencyTotalAmounts;
	}

	public void setAccountBaseCurrencyTotalAmounts(TotalValueInPageAndStatement1 accountBaseCurrencyTotalAmounts) {
		this.accountBaseCurrencyTotalAmounts = accountBaseCurrencyTotalAmounts;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:semt.002.05.05")
	static public class Document {
		@XmlElement(name = "SctiesBalCtdyRpt", required = true)
		public SecuritiesBalanceCustodyReportV05 messageBody;
	}
}