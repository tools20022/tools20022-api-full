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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer, for example, a registrar, transfer agent or custodian
 * bank sends the AccountDetailsConfirmation message to the account owner, for
 * example, an investor to confirm the opening of an investment fund account,
 * execution of an AccountModificationInstruction or to return information
 * requested in a GetAccountDetails message.<br>
 * <b>Usage</b><br>
 * The AccountDetailsConfirmation message is used to confirm the opening of an
 * account, modification of an account or the provision of information requested
 * in a previously sent GetAccountDetails message. The message contains detailed
 * information relevant to the opened account.<br>
 * When the AccountDetailsConfirmation is used to confirm execution of an
 * AccountModificationInstruction message, it contains the modified subsets of
 * account details that were specified in the AccountModificationInstruction.<br>
 * When the AccountDetailsConfirmation is used to reply to a GetAccountDetails
 * message, it returns the selected subsets of account details that were
 * specified in the GetAccountDetails message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmMessageIdentification
 * AccountDetailsConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmOrderReference
 * AccountDetailsConfirmationV03.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmRelatedReference
 * AccountDetailsConfirmationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmConfirmationDetails
 * AccountDetailsConfirmationV03.mmConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmInvestmentAccount
 * AccountDetailsConfirmationV03.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmAccountParties
 * AccountDetailsConfirmationV03.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmIntermediaries
 * AccountDetailsConfirmationV03.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmPlacement
 * AccountDetailsConfirmationV03.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmNewIssueAllocation
 * AccountDetailsConfirmationV03.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmSavingsInvestmentPlan
 * AccountDetailsConfirmationV03.mmSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmWithdrawalInvestmentPlan
 * AccountDetailsConfirmationV03.mmWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmCashSettlement
 * AccountDetailsConfirmationV03.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmServiceLevelAgreement
 * AccountDetailsConfirmationV03.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmExtension
 * AccountDetailsConfirmationV03.mmExtension}</li>
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
 * xmlTag} = "AcctDtlsConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementArchive
 * AccountManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.002.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountRule#for_acmt_AccountDetailsConfirmationV03
 * ConstraintInvestmentAccountRule.for_acmt_AccountDetailsConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUnitRule#for_acmt_AccountDetailsConfirmationV03
 * ConstraintUnitRule.for_acmt_AccountDetailsConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule1#for_acmt_AccountDetailsConfirmationV03
 * ConstraintDividendPercentageRule1.for_acmt_AccountDetailsConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule2#for_acmt_AccountDetailsConfirmationV03
 * ConstraintDividendPercentageRule2.for_acmt_AccountDetailsConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule3#for_acmt_AccountDetailsConfirmationV03
 * ConstraintDividendPercentageRule3.for_acmt_AccountDetailsConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule4#for_acmt_AccountDetailsConfirmationV03
 * ConstraintDividendPercentageRule4.for_acmt_AccountDetailsConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule5#for_acmt_AccountDetailsConfirmationV03
 * ConstraintDividendPercentageRule5.for_acmt_AccountDetailsConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule6#for_acmt_AccountDetailsConfirmationV03
 * ConstraintDividendPercentageRule6.for_acmt_AccountDetailsConfirmationV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountDetailsConfirmationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer, for example, a registrar, transfer agent or custodian bank sends the AccountDetailsConfirmation message to the account owner, for example, an investor to confirm the opening of an investment fund account, execution of an AccountModificationInstruction or to return information requested in a GetAccountDetails message.\r\nUsage\r\nThe AccountDetailsConfirmation message is used to confirm the opening of an account, modification of an account or the provision of information requested in a previously sent GetAccountDetails message. The message contains detailed information relevant to the opened account.\r\nWhen the AccountDetailsConfirmation is used to confirm execution of an AccountModificationInstruction message, it contains the modified subsets of account details that were specified in the AccountModificationInstruction.\r\nWhen the AccountDetailsConfirmation is used to reply to a GetAccountDetails message, it returns the selected subsets of account details that were specified in the GetAccountDetails message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04
 * AccountDetailsConfirmationV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02
 * AccountDetailsConfirmationV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountDetailsConfirmationV03", propOrder = {"messageIdentification", "orderReference", "relatedReference", "confirmationDetails", "investmentAccount", "accountParties", "intermediaries", "placement", "newIssueAllocation",
		"savingsInvestmentPlan", "withdrawalInvestmentPlan", "cashSettlement", "serviceLevelAgreement", "extension"})
public class AccountDetailsConfirmationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmMessageIdentification
	 * AccountDetailsConfirmationV04.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV03, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<AccountDetailsConfirmationV03, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the message.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(AccountDetailsConfirmationV03 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV03 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "OrdrRef")
	protected InvestmentFundOrder4 orderReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder4
	 * InvestmentFundOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a related order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmOrderReference
	 * AccountDetailsConfirmationV04.mmOrderReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV03, Optional<InvestmentFundOrder4>> mmOrderReference = new MMMessageBuildingBlock<AccountDetailsConfirmationV03, Optional<InvestmentFundOrder4>>() {
		{
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Identifies a related order.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmOrderReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundOrder4.mmObject();
		}

		@Override
		public Optional<InvestmentFundOrder4> getValue(AccountDetailsConfirmationV03 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV03 obj, Optional<InvestmentFundOrder4> value) {
			obj.setOrderReference(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference3 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmRelatedReference
	 * AccountDetailsConfirmationV04.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV03, Optional<AdditionalReference3>> mmRelatedReference = new MMMessageBuildingBlock<AccountDetailsConfirmationV03, Optional<AdditionalReference3>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmRelatedReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(AccountDetailsConfirmationV03 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV03 obj, Optional<AdditionalReference3> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "ConfDtls", required = true)
	protected AccountManagementConfirmation1 confirmationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation1
	 * AccountManagementConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide detailed information about the request or instruction which triggered this confirmation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmConfirmationDetails
	 * AccountDetailsConfirmationV04.mmConfirmationDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV03, AccountManagementConfirmation1> mmConfirmationDetails = new MMMessageBuildingBlock<AccountDetailsConfirmationV03, AccountManagementConfirmation1>() {
		{
			xmlTag = "ConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDetails";
			definition = "Provide detailed information about the request or instruction which triggered this confirmation.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmConfirmationDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountManagementConfirmation1.mmObject();
		}

		@Override
		public AccountManagementConfirmation1 getValue(AccountDetailsConfirmationV03 obj) {
			return obj.getConfirmationDetails();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV03 obj, AccountManagementConfirmation1 value) {
			obj.setConfirmationDetails(value);
		}
	};
	@XmlElement(name = "InvstmtAcct")
	protected InvestmentAccount35 investmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to a selected investment account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmInvestmentAccount
	 * AccountDetailsConfirmationV04.mmInvestmentAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV03, Optional<InvestmentAccount35>> mmInvestmentAccount = new MMMessageBuildingBlock<AccountDetailsConfirmationV03, Optional<InvestmentAccount35>>() {
		{
			xmlTag = "InvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Confirmation of the information related to a selected investment account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmInvestmentAccount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccount35.mmObject();
		}

		@Override
		public Optional<InvestmentAccount35> getValue(AccountDetailsConfirmationV03 obj) {
			return obj.getInvestmentAccount();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV03 obj, Optional<InvestmentAccount35> value) {
			obj.setInvestmentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctPties")
	protected AccountParties6 accountParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AccountParties6
	 * AccountParties6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of information related to parties who are related to a selected investment account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmAccountParties
	 * AccountDetailsConfirmationV04.mmAccountParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV03, Optional<AccountParties6>> mmAccountParties = new MMMessageBuildingBlock<AccountDetailsConfirmationV03, Optional<AccountParties6>>() {
		{
			xmlTag = "AcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountParties";
			definition = "Confirmation of information related to parties who are related to a selected investment account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmAccountParties);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountParties6.mmObject();
		}

		@Override
		public Optional<AccountParties6> getValue(AccountDetailsConfirmationV03 obj) {
			return obj.getAccountParties();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV03 obj, Optional<AccountParties6> value) {
			obj.setAccountParties(value.orElse(null));
		}
	};
	@XmlElement(name = "Intrmies")
	protected List<Intermediary12> intermediaries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary12
	 * Intermediary12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmies"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediaries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of information related to intermediaries who are related to a selected investment account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmIntermediaries
	 * AccountDetailsConfirmationV04.mmIntermediaries}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV03, List<Intermediary12>> mmIntermediaries = new MMMessageBuildingBlock<AccountDetailsConfirmationV03, List<Intermediary12>>() {
		{
			xmlTag = "Intrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediaries";
			definition = "Confirmation of information related to intermediaries who are related to a selected investment account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmIntermediaries);
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> Intermediary12.mmObject();
		}

		@Override
		public List<Intermediary12> getValue(AccountDetailsConfirmationV03 obj) {
			return obj.getIntermediaries();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV03 obj, List<Intermediary12> value) {
			obj.setIntermediaries(value);
		}
	};
	@XmlElement(name = "Plcmnt")
	protected ReferredAgent1 placement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReferredAgent1
	 * ReferredAgent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Plcmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Placement agent for the hedge fund industry."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmPlacement
	 * AccountDetailsConfirmationV04.mmPlacement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV03, Optional<ReferredAgent1>> mmPlacement = new MMMessageBuildingBlock<AccountDetailsConfirmationV03, Optional<ReferredAgent1>>() {
		{
			xmlTag = "Plcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			definition = "Placement agent for the hedge fund industry.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmPlacement);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ReferredAgent1.mmObject();
		}

		@Override
		public Optional<ReferredAgent1> getValue(AccountDetailsConfirmationV03 obj) {
			return obj.getPlacement();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV03 obj, Optional<ReferredAgent1> value) {
			obj.setPlacement(value.orElse(null));
		}
	};
	@XmlElement(name = "NewIsseAllcn")
	protected NewIssueAllocation1 newIssueAllocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1
	 * NewIssueAllocation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewIsseAllcn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssueAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmNewIssueAllocation
	 * AccountDetailsConfirmationV04.mmNewIssueAllocation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV03, Optional<NewIssueAllocation1>> mmNewIssueAllocation = new MMMessageBuildingBlock<AccountDetailsConfirmationV03, Optional<NewIssueAllocation1>>() {
		{
			xmlTag = "NewIsseAllcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssueAllocation";
			definition = "Eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmNewIssueAllocation);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NewIssueAllocation1.mmObject();
		}

		@Override
		public Optional<NewIssueAllocation1> getValue(AccountDetailsConfirmationV03 obj) {
			return obj.getNewIssueAllocation();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV03 obj, Optional<NewIssueAllocation1> value) {
			obj.setNewIssueAllocation(value.orElse(null));
		}
	};
	@XmlElement(name = "SvgsInvstmtPlan")
	protected List<InvestmentPlan6> savingsInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InvestmentPlan6
	 * InvestmentPlan6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvgsInvstmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SavingsInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to a savings plan that is related to a selected investment account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmSavingsInvestmentPlan
	 * AccountDetailsConfirmationV04.mmSavingsInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV03, List<InvestmentPlan6>> mmSavingsInvestmentPlan = new MMMessageBuildingBlock<AccountDetailsConfirmationV03, List<InvestmentPlan6>>() {
		{
			xmlTag = "SvgsInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsInvestmentPlan";
			definition = "Confirmation of the information related to a savings plan that is related to a selected investment account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmSavingsInvestmentPlan);
			maxOccurs = 50;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan6.mmObject();
		}

		@Override
		public List<InvestmentPlan6> getValue(AccountDetailsConfirmationV03 obj) {
			return obj.getSavingsInvestmentPlan();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV03 obj, List<InvestmentPlan6> value) {
			obj.setSavingsInvestmentPlan(value);
		}
	};
	@XmlElement(name = "WdrwlInvstmtPlan")
	protected List<InvestmentPlan6> withdrawalInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InvestmentPlan6
	 * InvestmentPlan6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WdrwlInvstmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to a withdrawal plan that is related to a selected investment account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmWithdrawalInvestmentPlan
	 * AccountDetailsConfirmationV04.mmWithdrawalInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV03, List<InvestmentPlan6>> mmWithdrawalInvestmentPlan = new MMMessageBuildingBlock<AccountDetailsConfirmationV03, List<InvestmentPlan6>>() {
		{
			xmlTag = "WdrwlInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalInvestmentPlan";
			definition = "Confirmation of the information related to a withdrawal plan that is related to a selected investment account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmWithdrawalInvestmentPlan);
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan6.mmObject();
		}

		@Override
		public List<InvestmentPlan6> getValue(AccountDetailsConfirmationV03 obj) {
			return obj.getWithdrawalInvestmentPlan();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV03 obj, List<InvestmentPlan6> value) {
			obj.setWithdrawalInvestmentPlan(value);
		}
	};
	@XmlElement(name = "CshSttlm")
	protected List<InvestmentFundCashSettlementInformation5> cashSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5
	 * InvestmentFundCashSettlementInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the cash settlement standing instruction associated to the investment fund transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmCashSettlement
	 * AccountDetailsConfirmationV04.mmCashSettlement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV03, List<InvestmentFundCashSettlementInformation5>> mmCashSettlement = new MMMessageBuildingBlock<AccountDetailsConfirmationV03, List<InvestmentFundCashSettlementInformation5>>() {
		{
			xmlTag = "CshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "Confirmation of the cash settlement standing instruction associated to the investment fund transaction.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmCashSettlement);
			maxOccurs = 8;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundCashSettlementInformation5.mmObject();
		}

		@Override
		public List<InvestmentFundCashSettlementInformation5> getValue(AccountDetailsConfirmationV03 obj) {
			return obj.getCashSettlement();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV03 obj, List<InvestmentFundCashSettlementInformation5> value) {
			obj.setCashSettlement(value);
		}
	};
	@XmlElement(name = "SvcLvlAgrmt")
	protected List<DocumentToSend1> serviceLevelAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.DocumentToSend1
	 * DocumentToSend1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcLvlAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevelAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies documents to be provided for the account opening."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmServiceLevelAgreement
	 * AccountDetailsConfirmationV04.mmServiceLevelAgreement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV03, List<DocumentToSend1>> mmServiceLevelAgreement = new MMMessageBuildingBlock<AccountDetailsConfirmationV03, List<DocumentToSend1>>() {
		{
			xmlTag = "SvcLvlAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelAgreement";
			definition = "Identifies documents to be provided for the account opening.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmServiceLevelAgreement);
			maxOccurs = 30;
			minOccurs = 0;
			complexType_lazy = () -> DocumentToSend1.mmObject();
		}

		@Override
		public List<DocumentToSend1> getValue(AccountDetailsConfirmationV03 obj) {
			return obj.getServiceLevelAgreement();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV03 obj, List<DocumentToSend1> value) {
			obj.setServiceLevelAgreement(value);
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmExtension
	 * AccountDetailsConfirmationV04.mmExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV03, List<Extension1>> mmExtension = new MMMessageBuildingBlock<AccountDetailsConfirmationV03, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmExtension);
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(AccountDetailsConfirmationV03 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV03 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountRule.for_acmt_AccountDetailsConfirmationV03,
						com.tools20022.repository.constraints.ConstraintUnitRule.for_acmt_AccountDetailsConfirmationV03, com.tools20022.repository.constraints.ConstraintDividendPercentageRule1.for_acmt_AccountDetailsConfirmationV03,
						com.tools20022.repository.constraints.ConstraintDividendPercentageRule2.for_acmt_AccountDetailsConfirmationV03,
						com.tools20022.repository.constraints.ConstraintDividendPercentageRule3.for_acmt_AccountDetailsConfirmationV03,
						com.tools20022.repository.constraints.ConstraintDividendPercentageRule4.for_acmt_AccountDetailsConfirmationV03,
						com.tools20022.repository.constraints.ConstraintDividendPercentageRule5.for_acmt_AccountDetailsConfirmationV03,
						com.tools20022.repository.constraints.ConstraintDividendPercentageRule6.for_acmt_AccountDetailsConfirmationV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountDetailsConfirmationV03";
				definition = "Scope\r\nAn account servicer, for example, a registrar, transfer agent or custodian bank sends the AccountDetailsConfirmation message to the account owner, for example, an investor to confirm the opening of an investment fund account, execution of an AccountModificationInstruction or to return information requested in a GetAccountDetails message.\r\nUsage\r\nThe AccountDetailsConfirmation message is used to confirm the opening of an account, modification of an account or the provision of information requested in a previously sent GetAccountDetails message. The message contains detailed information relevant to the opened account.\r\nWhen the AccountDetailsConfirmation is used to confirm execution of an AccountModificationInstruction message, it contains the modified subsets of account details that were specified in the AccountModificationInstruction.\r\nWhen the AccountDetailsConfirmation is used to reply to a GetAccountDetails message, it returns the selected subsets of account details that were specified in the GetAccountDetails message.";
				nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV04.mmObject());
				previousVersion_lazy = () -> AccountDetailsConfirmationV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AcctDtlsConf";
				businessArea_lazy = () -> AccountManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmMessageIdentification, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmOrderReference,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmRelatedReference, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmConfirmationDetails,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmInvestmentAccount, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmAccountParties,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmIntermediaries, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmPlacement,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmNewIssueAllocation, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmSavingsInvestmentPlan,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmWithdrawalInvestmentPlan, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmCashSettlement,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmServiceLevelAgreement, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "002";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountDetailsConfirmationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountDetailsConfirmationV03 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<InvestmentFundOrder4> getOrderReference() {
		return orderReference == null ? Optional.empty() : Optional.of(orderReference);
	}

	public AccountDetailsConfirmationV03 setOrderReference(InvestmentFundOrder4 orderReference) {
		this.orderReference = orderReference;
		return this;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public AccountDetailsConfirmationV03 setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public AccountManagementConfirmation1 getConfirmationDetails() {
		return confirmationDetails;
	}

	public AccountDetailsConfirmationV03 setConfirmationDetails(AccountManagementConfirmation1 confirmationDetails) {
		this.confirmationDetails = Objects.requireNonNull(confirmationDetails);
		return this;
	}

	public Optional<InvestmentAccount35> getInvestmentAccount() {
		return investmentAccount == null ? Optional.empty() : Optional.of(investmentAccount);
	}

	public AccountDetailsConfirmationV03 setInvestmentAccount(InvestmentAccount35 investmentAccount) {
		this.investmentAccount = investmentAccount;
		return this;
	}

	public Optional<AccountParties6> getAccountParties() {
		return accountParties == null ? Optional.empty() : Optional.of(accountParties);
	}

	public AccountDetailsConfirmationV03 setAccountParties(AccountParties6 accountParties) {
		this.accountParties = accountParties;
		return this;
	}

	public List<Intermediary12> getIntermediaries() {
		return intermediaries == null ? intermediaries = new ArrayList<>() : intermediaries;
	}

	public AccountDetailsConfirmationV03 setIntermediaries(List<Intermediary12> intermediaries) {
		this.intermediaries = Objects.requireNonNull(intermediaries);
		return this;
	}

	public Optional<ReferredAgent1> getPlacement() {
		return placement == null ? Optional.empty() : Optional.of(placement);
	}

	public AccountDetailsConfirmationV03 setPlacement(ReferredAgent1 placement) {
		this.placement = placement;
		return this;
	}

	public Optional<NewIssueAllocation1> getNewIssueAllocation() {
		return newIssueAllocation == null ? Optional.empty() : Optional.of(newIssueAllocation);
	}

	public AccountDetailsConfirmationV03 setNewIssueAllocation(NewIssueAllocation1 newIssueAllocation) {
		this.newIssueAllocation = newIssueAllocation;
		return this;
	}

	public List<InvestmentPlan6> getSavingsInvestmentPlan() {
		return savingsInvestmentPlan == null ? savingsInvestmentPlan = new ArrayList<>() : savingsInvestmentPlan;
	}

	public AccountDetailsConfirmationV03 setSavingsInvestmentPlan(List<InvestmentPlan6> savingsInvestmentPlan) {
		this.savingsInvestmentPlan = Objects.requireNonNull(savingsInvestmentPlan);
		return this;
	}

	public List<InvestmentPlan6> getWithdrawalInvestmentPlan() {
		return withdrawalInvestmentPlan == null ? withdrawalInvestmentPlan = new ArrayList<>() : withdrawalInvestmentPlan;
	}

	public AccountDetailsConfirmationV03 setWithdrawalInvestmentPlan(List<InvestmentPlan6> withdrawalInvestmentPlan) {
		this.withdrawalInvestmentPlan = Objects.requireNonNull(withdrawalInvestmentPlan);
		return this;
	}

	public List<InvestmentFundCashSettlementInformation5> getCashSettlement() {
		return cashSettlement == null ? cashSettlement = new ArrayList<>() : cashSettlement;
	}

	public AccountDetailsConfirmationV03 setCashSettlement(List<InvestmentFundCashSettlementInformation5> cashSettlement) {
		this.cashSettlement = Objects.requireNonNull(cashSettlement);
		return this;
	}

	public List<DocumentToSend1> getServiceLevelAgreement() {
		return serviceLevelAgreement == null ? serviceLevelAgreement = new ArrayList<>() : serviceLevelAgreement;
	}

	public AccountDetailsConfirmationV03 setServiceLevelAgreement(List<DocumentToSend1> serviceLevelAgreement) {
		this.serviceLevelAgreement = Objects.requireNonNull(serviceLevelAgreement);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public AccountDetailsConfirmationV03 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.002.001.03")
	static public class Document {
		@XmlElement(name = "AcctDtlsConf", required = true)
		public AccountDetailsConfirmationV03 messageBody;
	}
}