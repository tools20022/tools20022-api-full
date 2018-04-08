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
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISOPreviousversion
 * SettlementAndReconciliationISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesBalAcctgRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementPreviousVersion
 * SecuritiesManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.003.001.08}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#for_semt_SecuritiesBalanceAccountingReportV08
 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
 * for_semt_SecuritiesBalanceAccountingReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule#for_semt_SecuritiesBalanceAccountingReportV08
 * ConstraintBalanceForAccountReportingRule.
 * for_semt_SecuritiesBalanceAccountingReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesBalanceAccountingReportV08
 * ConstraintCoexistenceCharacterSetXRule.
 * for_semt_SecuritiesBalanceAccountingReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_semt_SecuritiesBalanceAccountingReportV08
 * ConstraintCoexistenceIdentificationRule.
 * for_semt_SecuritiesBalanceAccountingReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesBalanceAccountingReportV08
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * for_semt_SecuritiesBalanceAccountingReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSubAccountDetailsBalanceForAccountPresenceRule#for_semt_SecuritiesBalanceAccountingReportV08
 * ConstraintSubAccountDetailsBalanceForAccountPresenceRule.
 * for_semt_SecuritiesBalanceAccountingReportV08}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesBalanceAccountingReportV08"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account servicer sends a SecuritiesBalanceAccountingReport to an account owner to provide, at a moment in time, valuations of the portfolio together with details of each financial instrument holding.\nThe account servicer/owner relationship may be:\n- an accounting agent acting on behalf of an account owner, or\n- a transfer agent acting on behalf of a fund manager or an account owner's designated agent.\n\nUsage\nThe message should be sent at a frequency agreed bi-laterally between the account servicer and the account owner.\nThe message can be sent either audited or un-audited and may be provided on a trade date, contractual or settlement date basis. \nThis message can only be used to list the holdings of a single (master) account. However, it is possible to break down these holdings into one or several sub-accounts. Therefore, the message can be used to either specify holdings at\n- the main account level, or, \n- the sub-account level.\nThis message can be used to report where the financial instruments are safe-kept, physically or notionally. If a security is held in more than one safekeeping place, this can also be indicated. \nThe SecuritiesBalanceAccountingReport message should not be used for trading purposes.\nThere may be one or more intermediary parties, for example, an intermediary or a concentrator between the account owner and account servicer.\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesBalanceAccountingReportV08", propOrder = {"pagination", "statementGeneralDetails", "accountOwner", "accountServicer", "safekeepingAccount", "intermediaryInformation", "balanceForAccount", "subAccountDetails",
		"accountBaseCurrencyTotalAmounts", "alternateReportingCurrencyTotalAmounts"})
public class SecuritiesBalanceAccountingReportV08 {

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
	public static final MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, Pagination> mmPagination = new MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, Pagination>() {
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

		@Override
		public Pagination getValue(SecuritiesBalanceAccountingReportV08 obj) {
			return obj.getPagination();
		}

		@Override
		public void setValue(SecuritiesBalanceAccountingReportV08 obj, Pagination value) {
			obj.setPagination(value);
		}
	};
	@XmlElement(name = "StmtGnlDtls", required = true)
	protected Statement20 statementGeneralDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, Statement20> mmStatementGeneralDetails = new MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, Statement20>() {
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

		@Override
		public Statement20 getValue(SecuritiesBalanceAccountingReportV08 obj) {
			return obj.getStatementGeneralDetails();
		}

		@Override
		public void setValue(SecuritiesBalanceAccountingReportV08 obj, Statement20 value) {
			obj.setStatementGeneralDetails(value);
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification36Choice accountOwner;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, Optional<PartyIdentification36Choice>> mmAccountOwner = new MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, Optional<PartyIdentification36Choice>>() {
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

		@Override
		public Optional<PartyIdentification36Choice> getValue(SecuritiesBalanceAccountingReportV08 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(SecuritiesBalanceAccountingReportV08 obj, Optional<PartyIdentification36Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected PartyIdentification49Choice accountServicer;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, Optional<PartyIdentification49Choice>> mmAccountServicer = new MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, Optional<PartyIdentification49Choice>>() {
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

		@Override
		public Optional<PartyIdentification49Choice> getValue(SecuritiesBalanceAccountingReportV08 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(SecuritiesBalanceAccountingReportV08 obj, Optional<PartyIdentification49Choice> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct", required = true)
	protected SecuritiesAccount11 safekeepingAccount;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, SecuritiesAccount11> mmSafekeepingAccount = new MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, SecuritiesAccount11>() {
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

		@Override
		public SecuritiesAccount11 getValue(SecuritiesBalanceAccountingReportV08 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(SecuritiesBalanceAccountingReportV08 obj, SecuritiesAccount11 value) {
			obj.setSafekeepingAccount(value);
		}
	};
	@XmlElement(name = "IntrmyInf")
	protected List<Intermediary23> intermediaryInformation;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, List<Intermediary23>> mmIntermediaryInformation = new MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, List<Intermediary23>>() {
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

		@Override
		public List<Intermediary23> getValue(SecuritiesBalanceAccountingReportV08 obj) {
			return obj.getIntermediaryInformation();
		}

		@Override
		public void setValue(SecuritiesBalanceAccountingReportV08 obj, List<Intermediary23> value) {
			obj.setIntermediaryInformation(value);
		}
	};
	@XmlElement(name = "BalForAcct")
	protected List<AggregateBalanceInformation26> balanceForAccount;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, List<AggregateBalanceInformation26>> mmBalanceForAccount = new MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, List<AggregateBalanceInformation26>>() {
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

		@Override
		public List<AggregateBalanceInformation26> getValue(SecuritiesBalanceAccountingReportV08 obj) {
			return obj.getBalanceForAccount();
		}

		@Override
		public void setValue(SecuritiesBalanceAccountingReportV08 obj, List<AggregateBalanceInformation26> value) {
			obj.setBalanceForAccount(value);
		}
	};
	@XmlElement(name = "SubAcctDtls")
	protected List<SubAccountIdentification38> subAccountDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, List<SubAccountIdentification38>> mmSubAccountDetails = new MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, List<SubAccountIdentification38>>() {
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

		@Override
		public List<SubAccountIdentification38> getValue(SecuritiesBalanceAccountingReportV08 obj) {
			return obj.getSubAccountDetails();
		}

		@Override
		public void setValue(SecuritiesBalanceAccountingReportV08 obj, List<SubAccountIdentification38> value) {
			obj.setSubAccountDetails(value);
		}
	};
	@XmlElement(name = "AcctBaseCcyTtlAmts")
	protected TotalValueInPageAndStatement2 accountBaseCurrencyTotalAmounts;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, Optional<TotalValueInPageAndStatement2>> mmAccountBaseCurrencyTotalAmounts = new MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, Optional<TotalValueInPageAndStatement2>>() {
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

		@Override
		public Optional<TotalValueInPageAndStatement2> getValue(SecuritiesBalanceAccountingReportV08 obj) {
			return obj.getAccountBaseCurrencyTotalAmounts();
		}

		@Override
		public void setValue(SecuritiesBalanceAccountingReportV08 obj, Optional<TotalValueInPageAndStatement2> value) {
			obj.setAccountBaseCurrencyTotalAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "AltrnRptgCcyTtlAmts")
	protected TotalValueInPageAndStatement2 alternateReportingCurrencyTotalAmounts;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, Optional<TotalValueInPageAndStatement2>> mmAlternateReportingCurrencyTotalAmounts = new MMMessageBuildingBlock<SecuritiesBalanceAccountingReportV08, Optional<TotalValueInPageAndStatement2>>() {
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

		@Override
		public Optional<TotalValueInPageAndStatement2> getValue(SecuritiesBalanceAccountingReportV08 obj) {
			return obj.getAlternateReportingCurrencyTotalAmounts();
		}

		@Override
		public void setValue(SecuritiesBalanceAccountingReportV08 obj, Optional<TotalValueInPageAndStatement2> value) {
			obj.setAlternateReportingCurrencyTotalAmounts(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.for_semt_SecuritiesBalanceAccountingReportV08,
						com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule.for_semt_SecuritiesBalanceAccountingReportV08,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesBalanceAccountingReportV08,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_semt_SecuritiesBalanceAccountingReportV08,
						com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesBalanceAccountingReportV08,
						com.tools20022.repository.constraints.ConstraintSubAccountDetailsBalanceForAccountPresenceRule.for_semt_SecuritiesBalanceAccountingReportV08);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceAccountingReportV08";
				definition = "Scope\nAn account servicer sends a SecuritiesBalanceAccountingReport to an account owner to provide, at a moment in time, valuations of the portfolio together with details of each financial instrument holding.\nThe account servicer/owner relationship may be:\n- an accounting agent acting on behalf of an account owner, or\n- a transfer agent acting on behalf of a fund manager or an account owner's designated agent.\n\nUsage\nThe message should be sent at a frequency agreed bi-laterally between the account servicer and the account owner.\nThe message can be sent either audited or un-audited and may be provided on a trade date, contractual or settlement date basis. \nThis message can only be used to list the holdings of a single (master) account. However, it is possible to break down these holdings into one or several sub-accounts. Therefore, the message can be used to either specify holdings at\n- the main account level, or, \n- the sub-account level.\nThis message can be used to report where the financial instruments are safe-kept, physically or notionally. If a security is held in more than one safekeeping place, this can also be indicated. \nThe SecuritiesBalanceAccountingReport message should not be used for trading purposes.\nThere may be one or more intermediary parties, for example, an intermediary or a concentrator between the account owner and account servicer.\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
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

	public Pagination getPagination() {
		return pagination;
	}

	public SecuritiesBalanceAccountingReportV08 setPagination(Pagination pagination) {
		this.pagination = Objects.requireNonNull(pagination);
		return this;
	}

	public Statement20 getStatementGeneralDetails() {
		return statementGeneralDetails;
	}

	public SecuritiesBalanceAccountingReportV08 setStatementGeneralDetails(Statement20 statementGeneralDetails) {
		this.statementGeneralDetails = Objects.requireNonNull(statementGeneralDetails);
		return this;
	}

	public Optional<PartyIdentification36Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public SecuritiesBalanceAccountingReportV08 setAccountOwner(PartyIdentification36Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<PartyIdentification49Choice> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public SecuritiesBalanceAccountingReportV08 setAccountServicer(PartyIdentification49Choice accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public SecuritiesAccount11 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public SecuritiesBalanceAccountingReportV08 setSafekeepingAccount(SecuritiesAccount11 safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public List<Intermediary23> getIntermediaryInformation() {
		return intermediaryInformation == null ? intermediaryInformation = new ArrayList<>() : intermediaryInformation;
	}

	public SecuritiesBalanceAccountingReportV08 setIntermediaryInformation(List<Intermediary23> intermediaryInformation) {
		this.intermediaryInformation = Objects.requireNonNull(intermediaryInformation);
		return this;
	}

	public List<AggregateBalanceInformation26> getBalanceForAccount() {
		return balanceForAccount == null ? balanceForAccount = new ArrayList<>() : balanceForAccount;
	}

	public SecuritiesBalanceAccountingReportV08 setBalanceForAccount(List<AggregateBalanceInformation26> balanceForAccount) {
		this.balanceForAccount = Objects.requireNonNull(balanceForAccount);
		return this;
	}

	public List<SubAccountIdentification38> getSubAccountDetails() {
		return subAccountDetails == null ? subAccountDetails = new ArrayList<>() : subAccountDetails;
	}

	public SecuritiesBalanceAccountingReportV08 setSubAccountDetails(List<SubAccountIdentification38> subAccountDetails) {
		this.subAccountDetails = Objects.requireNonNull(subAccountDetails);
		return this;
	}

	public Optional<TotalValueInPageAndStatement2> getAccountBaseCurrencyTotalAmounts() {
		return accountBaseCurrencyTotalAmounts == null ? Optional.empty() : Optional.of(accountBaseCurrencyTotalAmounts);
	}

	public SecuritiesBalanceAccountingReportV08 setAccountBaseCurrencyTotalAmounts(TotalValueInPageAndStatement2 accountBaseCurrencyTotalAmounts) {
		this.accountBaseCurrencyTotalAmounts = accountBaseCurrencyTotalAmounts;
		return this;
	}

	public Optional<TotalValueInPageAndStatement2> getAlternateReportingCurrencyTotalAmounts() {
		return alternateReportingCurrencyTotalAmounts == null ? Optional.empty() : Optional.of(alternateReportingCurrencyTotalAmounts);
	}

	public SecuritiesBalanceAccountingReportV08 setAlternateReportingCurrencyTotalAmounts(TotalValueInPageAndStatement2 alternateReportingCurrencyTotalAmounts) {
		this.alternateReportingCurrencyTotalAmounts = alternateReportingCurrencyTotalAmounts;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.003.001.08")
	static public class Document {
		@XmlElement(name = "SctiesBalAcctgRpt", required = true)
		public SecuritiesBalanceAccountingReportV08 messageBody;
	}
}