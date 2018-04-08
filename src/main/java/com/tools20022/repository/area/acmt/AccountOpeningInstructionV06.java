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
import com.tools20022.repository.area.AccountManagementPreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account owner, for example, an investor or its designated agent sends the
 * AccountOpeningInstruction message to the account servicer, for example, a
 * registrar, transfer agent, custodian or securities depository to instruct the
 * opening of an account or the opening of an account and the establishment of
 * an investment plan.<br>
 * <b>Usage</b><br>
 * The AccountOpeningInstruction is used to open an account directly or
 * indirectly with the account servicer or an intermediary.<br>
 * In some markets, for example, Australia, and for some products in the United
 * Kingdom, a first order (also known as a deposit instruction) is placed at the
 * same time as the account opening. To cater for this scenario, an order
 * message can be linked (via references in the message) to the
 * AccountOpeningInstruction message when needed.<br>
 * Execution of the AccountOpeningInstruction is confirmed via an
 * AccountDetailsConfirmation message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmMessageIdentification
 * AccountOpeningInstructionV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmOrderReference
 * AccountOpeningInstructionV06.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmPreviousReference
 * AccountOpeningInstructionV06.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmInstructionDetails
 * AccountOpeningInstructionV06.mmInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmInvestmentAccount
 * AccountOpeningInstructionV06.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmAccountParties
 * AccountOpeningInstructionV06.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmIntermediaries
 * AccountOpeningInstructionV06.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmPlacement
 * AccountOpeningInstructionV06.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmNewIssueAllocation
 * AccountOpeningInstructionV06.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmSavingsInvestmentPlan
 * AccountOpeningInstructionV06.mmSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmWithdrawalInvestmentPlan
 * AccountOpeningInstructionV06.mmWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmCashSettlement
 * AccountOpeningInstructionV06.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmServiceLevelAgreement
 * AccountOpeningInstructionV06.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmAdditionalInformation
 * AccountOpeningInstructionV06.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmMarketPracticeVersion
 * AccountOpeningInstructionV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmExtension
 * AccountOpeningInstructionV06.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctOpngInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementPreviousVersion
 * AccountManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.001.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule#for_acmt_AccountOpeningInstructionV06
 * ConstraintInvestmentAccountIdentificationRule.
 * for_acmt_AccountOpeningInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUnitRule#for_acmt_AccountOpeningInstructionV06
 * ConstraintUnitRule.for_acmt_AccountOpeningInstructionV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountOpeningInstructionV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner, for example, an investor or its designated agent sends the AccountOpeningInstruction message to the account servicer, for example, a registrar, transfer agent, custodian or securities depository to instruct the opening of an account or the opening of an account and the establishment of an investment plan.\r\nUsage\r\nThe AccountOpeningInstruction is used to open an account directly or indirectly with the account servicer or an intermediary.\r\nIn some markets, for example, Australia, and for some products in the United Kingdom, a first order (also known as a deposit instruction) is placed at the same time as the account opening. To cater for this scenario, an order message can be linked (via references in the message) to the AccountOpeningInstruction message when needed.\r\nExecution of the AccountOpeningInstruction is confirmed via an AccountDetailsConfirmation message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07
 * AccountOpeningInstructionV07}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05
 * AccountOpeningInstructionV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountOpeningInstructionV06", propOrder = {"messageIdentification", "orderReference", "previousReference", "instructionDetails", "investmentAccount", "accountParties", "intermediaries", "placement", "newIssueAllocation",
		"savingsInvestmentPlan", "withdrawalInvestmentPlan", "cashSettlement", "serviceLevelAgreement", "additionalInformation", "marketPracticeVersion", "extension"})
public class AccountOpeningInstructionV06 {

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
	 * definition} =
	 * "Reference that uniquely identifies the message from a business application standpoint."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmMessageIdentification
	 * AccountOpeningInstructionV07.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmMessageIdentification
	 * AccountOpeningInstructionV05.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<AccountOpeningInstructionV06, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmMessageIdentification);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(AccountOpeningInstructionV06 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, MessageIdentification1 value) {
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
	 * definition} = "Identifies a related order or settlement transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmOrderReference
	 * AccountOpeningInstructionV07.mmOrderReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmOrderReference
	 * AccountOpeningInstructionV05.mmOrderReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, Optional<InvestmentFundOrder4>> mmOrderReference = new MMMessageBuildingBlock<AccountOpeningInstructionV06, Optional<InvestmentFundOrder4>>() {
		{
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Identifies a related order or settlement transaction.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmOrderReference);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmOrderReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundOrder4.mmObject();
		}

		@Override
		public Optional<InvestmentFundOrder4> getValue(AccountOpeningInstructionV06 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, Optional<InvestmentFundOrder4> value) {
			obj.setOrderReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsRef")
	protected AdditionalReference6 previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmPreviousReference
	 * AccountOpeningInstructionV07.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmPreviousReference
	 * AccountOpeningInstructionV05.mmPreviousReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, Optional<AdditionalReference6>> mmPreviousReference = new MMMessageBuildingBlock<AccountOpeningInstructionV06, Optional<AdditionalReference6>>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmPreviousReference);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmPreviousReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		@Override
		public Optional<AdditionalReference6> getValue(AccountOpeningInstructionV06 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, Optional<AdditionalReference6> value) {
			obj.setPreviousReference(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrDtls", required = true)
	protected InvestmentAccountOpening2 instructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening2
	 * InvestmentAccountOpening2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the opening instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmInstructionDetails
	 * AccountOpeningInstructionV07.mmInstructionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmInstructionDetails
	 * AccountOpeningInstructionV05.mmInstructionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, InvestmentAccountOpening2> mmInstructionDetails = new MMMessageBuildingBlock<AccountOpeningInstructionV06, InvestmentAccountOpening2>() {
		{
			xmlTag = "InstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionDetails";
			definition = "Information about the opening instruction.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmInstructionDetails);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmInstructionDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestmentAccountOpening2.mmObject();
		}

		@Override
		public InvestmentAccountOpening2 getValue(AccountOpeningInstructionV06 obj) {
			return obj.getInstructionDetails();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, InvestmentAccountOpening2 value) {
			obj.setInstructionDetails(value);
		}
	};
	@XmlElement(name = "InvstmtAcct", required = true)
	protected InvestmentAccount49 investmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49
	 * InvestmentAccount49}</li>
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
	 * definition} = "Detailed information about the account to be opened."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmInvestmentAccount
	 * AccountOpeningInstructionV07.mmInvestmentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmInvestmentAccount
	 * AccountOpeningInstructionV05.mmInvestmentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, InvestmentAccount49> mmInvestmentAccount = new MMMessageBuildingBlock<AccountOpeningInstructionV06, InvestmentAccount49>() {
		{
			xmlTag = "InvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Detailed information about the account to be opened.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmInvestmentAccount);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmInvestmentAccount;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestmentAccount49.mmObject();
		}

		@Override
		public InvestmentAccount49 getValue(AccountOpeningInstructionV06 obj) {
			return obj.getInvestmentAccount();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, InvestmentAccount49 value) {
			obj.setInvestmentAccount(value);
		}
	};
	@XmlElement(name = "AcctPties", required = true)
	protected AccountParties13 accountParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
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
	 * "Information related to parties that are related to the account, for example, primary account owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmAccountParties
	 * AccountOpeningInstructionV07.mmAccountParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmAccountParties
	 * AccountOpeningInstructionV05.mmAccountParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, AccountParties13> mmAccountParties = new MMMessageBuildingBlock<AccountOpeningInstructionV06, AccountParties13>() {
		{
			xmlTag = "AcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountParties";
			definition = "Information related to parties that are related to the account, for example, primary account owner.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmAccountParties);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmAccountParties;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountParties13.mmObject();
		}

		@Override
		public AccountParties13 getValue(AccountOpeningInstructionV06 obj) {
			return obj.getAccountParties();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, AccountParties13 value) {
			obj.setAccountParties(value);
		}
	};
	@XmlElement(name = "Intrmies")
	protected List<Intermediary36> intermediaries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary36
	 * Intermediary36}</li>
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
	 * "Intermediary or other party related to the management of the account. In some markets, when this intermediary is a party acting on behalf of the investor for which it has opened an account at, for example, a central securities depository or international central securities depository, this party is known by the investor as the 'account controller'."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmIntermediaries
	 * AccountOpeningInstructionV07.mmIntermediaries}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmIntermediaries
	 * AccountOpeningInstructionV05.mmIntermediaries}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, List<Intermediary36>> mmIntermediaries = new MMMessageBuildingBlock<AccountOpeningInstructionV06, List<Intermediary36>>() {
		{
			xmlTag = "Intrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediaries";
			definition = "Intermediary or other party related to the management of the account. In some markets, when this intermediary is a party acting on behalf of the investor for which it has opened an account at, for example, a central securities depository or international central securities depository, this party is known by the investor as the 'account controller'.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmIntermediaries);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmIntermediaries;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> Intermediary36.mmObject();
		}

		@Override
		public List<Intermediary36> getValue(AccountOpeningInstructionV06 obj) {
			return obj.getIntermediaries();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, List<Intermediary36> value) {
			obj.setIntermediaries(value);
		}
	};
	@XmlElement(name = "Plcmnt")
	protected ReferredAgent2 placement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReferredAgent2
	 * ReferredAgent2}</li>
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
	 * definition} = "Referral information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmPlacement
	 * AccountOpeningInstructionV07.mmPlacement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmPlacement
	 * AccountOpeningInstructionV05.mmPlacement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, Optional<ReferredAgent2>> mmPlacement = new MMMessageBuildingBlock<AccountOpeningInstructionV06, Optional<ReferredAgent2>>() {
		{
			xmlTag = "Plcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			definition = "Referral information.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmPlacement);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmPlacement;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ReferredAgent2.mmObject();
		}

		@Override
		public Optional<ReferredAgent2> getValue(AccountOpeningInstructionV06 obj) {
			return obj.getPlacement();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, Optional<ReferredAgent2> value) {
			obj.setPlacement(value.orElse(null));
		}
	};
	@XmlElement(name = "NewIsseAllcn")
	protected NewIssueAllocation2 newIssueAllocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2
	 * NewIssueAllocation2}</li>
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmNewIssueAllocation
	 * AccountOpeningInstructionV07.mmNewIssueAllocation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmNewIssueAllocation
	 * AccountOpeningInstructionV05.mmNewIssueAllocation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, Optional<NewIssueAllocation2>> mmNewIssueAllocation = new MMMessageBuildingBlock<AccountOpeningInstructionV06, Optional<NewIssueAllocation2>>() {
		{
			xmlTag = "NewIsseAllcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssueAllocation";
			definition = "Eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmNewIssueAllocation);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmNewIssueAllocation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NewIssueAllocation2.mmObject();
		}

		@Override
		public Optional<NewIssueAllocation2> getValue(AccountOpeningInstructionV06 obj) {
			return obj.getNewIssueAllocation();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, Optional<NewIssueAllocation2> value) {
			obj.setNewIssueAllocation(value.orElse(null));
		}
	};
	@XmlElement(name = "SvgsInvstmtPlan")
	protected List<InvestmentPlan12> savingsInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
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
	 * "Plan that allows individuals to set aside a fixed amount of money at specified intervals, usually for a special purpose, for example, retirement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmSavingsInvestmentPlan
	 * AccountOpeningInstructionV07.mmSavingsInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmSavingsInvestmentPlan
	 * AccountOpeningInstructionV05.mmSavingsInvestmentPlan}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, List<InvestmentPlan12>> mmSavingsInvestmentPlan = new MMMessageBuildingBlock<AccountOpeningInstructionV06, List<InvestmentPlan12>>() {
		{
			xmlTag = "SvgsInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsInvestmentPlan";
			definition = "Plan that allows individuals to set aside a fixed amount of money at specified intervals, usually for a special purpose, for example, retirement.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmSavingsInvestmentPlan);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmSavingsInvestmentPlan;
			maxOccurs = 50;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan12.mmObject();
		}

		@Override
		public List<InvestmentPlan12> getValue(AccountOpeningInstructionV06 obj) {
			return obj.getSavingsInvestmentPlan();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, List<InvestmentPlan12> value) {
			obj.setSavingsInvestmentPlan(value);
		}
	};
	@XmlElement(name = "WdrwlInvstmtPlan")
	protected List<InvestmentPlan12> withdrawalInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
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
	 * "Plan through which holdings are depleted through regular withdrawals at specified intervals."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmWithdrawalInvestmentPlan
	 * AccountOpeningInstructionV07.mmWithdrawalInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmWithdrawalInvestmentPlan
	 * AccountOpeningInstructionV05.mmWithdrawalInvestmentPlan}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, List<InvestmentPlan12>> mmWithdrawalInvestmentPlan = new MMMessageBuildingBlock<AccountOpeningInstructionV06, List<InvestmentPlan12>>() {
		{
			xmlTag = "WdrwlInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalInvestmentPlan";
			definition = "Plan through which holdings are depleted through regular withdrawals at specified intervals.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmWithdrawalInvestmentPlan);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmWithdrawalInvestmentPlan;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan12.mmObject();
		}

		@Override
		public List<InvestmentPlan12> getValue(AccountOpeningInstructionV06 obj) {
			return obj.getWithdrawalInvestmentPlan();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, List<InvestmentPlan12> value) {
			obj.setWithdrawalInvestmentPlan(value);
		}
	};
	@XmlElement(name = "CshSttlm")
	protected List<CashSettlement1> cashSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashSettlement1
	 * CashSettlement1}</li>
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
	 * "Cash settlement standing instruction associated to transactions on the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmCashSettlement
	 * AccountOpeningInstructionV07.mmCashSettlement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmCashSettlement
	 * AccountOpeningInstructionV05.mmCashSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, List<CashSettlement1>> mmCashSettlement = new MMMessageBuildingBlock<AccountOpeningInstructionV06, List<CashSettlement1>>() {
		{
			xmlTag = "CshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "Cash settlement standing instruction associated to transactions on the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmCashSettlement);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmCashSettlement;
			maxOccurs = 8;
			minOccurs = 0;
			complexType_lazy = () -> CashSettlement1.mmObject();
		}

		@Override
		public List<CashSettlement1> getValue(AccountOpeningInstructionV06 obj) {
			return obj.getCashSettlement();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, List<CashSettlement1> value) {
			obj.setCashSettlement(value);
		}
	};
	@XmlElement(name = "SvcLvlAgrmt")
	protected List<DocumentToSend3> serviceLevelAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.DocumentToSend3
	 * DocumentToSend3}</li>
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmServiceLevelAgreement
	 * AccountOpeningInstructionV07.mmServiceLevelAgreement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmServiceLevelAgreement
	 * AccountOpeningInstructionV05.mmServiceLevelAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, List<DocumentToSend3>> mmServiceLevelAgreement = new MMMessageBuildingBlock<AccountOpeningInstructionV06, List<DocumentToSend3>>() {
		{
			xmlTag = "SvcLvlAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelAgreement";
			definition = "Identifies documents to be provided for the account opening.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmServiceLevelAgreement);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmServiceLevelAgreement;
			maxOccurs = 30;
			minOccurs = 0;
			complexType_lazy = () -> DocumentToSend3.mmObject();
		}

		@Override
		public List<DocumentToSend3> getValue(AccountOpeningInstructionV06 obj) {
			return obj.getServiceLevelAgreement();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, List<DocumentToSend3> value) {
			obj.setServiceLevelAgreement(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<AccountRestrictions1> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information concerning limitations and restrictions on the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmAdditionalInformation
	 * AccountOpeningInstructionV07.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, List<AccountRestrictions1>> mmAdditionalInformation = new MMMessageBuildingBlock<AccountOpeningInstructionV06, List<AccountRestrictions1>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information concerning limitations and restrictions on the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmAdditionalInformation);
			minOccurs = 0;
			complexType_lazy = () -> AccountRestrictions1.mmObject();
		}

		@Override
		public List<AccountRestrictions1> getValue(AccountOpeningInstructionV06 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, List<AccountRestrictions1> value) {
			obj.setAdditionalInformation(value);
		}
	};
	@XmlElement(name = "MktPrctcVrsn")
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmMarketPracticeVersion
	 * AccountOpeningInstructionV07.mmMarketPracticeVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmMarketPracticeVersion
	 * AccountOpeningInstructionV05.mmMarketPracticeVersion}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, Optional<MarketPracticeVersion1>> mmMarketPracticeVersion = new MMMessageBuildingBlock<AccountOpeningInstructionV06, Optional<MarketPracticeVersion1>>() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmMarketPracticeVersion);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmMarketPracticeVersion;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		@Override
		public Optional<MarketPracticeVersion1> getValue(AccountOpeningInstructionV06 obj) {
			return obj.getMarketPracticeVersion();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, Optional<MarketPracticeVersion1> value) {
			obj.setMarketPracticeVersion(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmExtension
	 * AccountOpeningInstructionV07.mmExtension}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmExtension
	 * AccountOpeningInstructionV05.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV06, List<Extension1>> mmExtension = new MMMessageBuildingBlock<AccountOpeningInstructionV06, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmExtension);
			previousVersion_lazy = () -> AccountOpeningInstructionV05.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(AccountOpeningInstructionV06 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(AccountOpeningInstructionV06 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule.for_acmt_AccountOpeningInstructionV06,
						com.tools20022.repository.constraints.ConstraintUnitRule.for_acmt_AccountOpeningInstructionV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountOpeningInstructionV06";
				definition = "Scope\r\nAn account owner, for example, an investor or its designated agent sends the AccountOpeningInstruction message to the account servicer, for example, a registrar, transfer agent, custodian or securities depository to instruct the opening of an account or the opening of an account and the establishment of an investment plan.\r\nUsage\r\nThe AccountOpeningInstruction is used to open an account directly or indirectly with the account servicer or an intermediary.\r\nIn some markets, for example, Australia, and for some products in the United Kingdom, a first order (also known as a deposit instruction) is placed at the same time as the account opening. To cater for this scenario, an order message can be linked (via references in the message) to the AccountOpeningInstruction message when needed.\r\nExecution of the AccountOpeningInstruction is confirmed via an AccountDetailsConfirmation message.";
				nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV07.mmObject());
				previousVersion_lazy = () -> AccountOpeningInstructionV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "AcctOpngInstr";
				businessArea_lazy = () -> AccountManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmMessageIdentification, com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmOrderReference,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmPreviousReference, com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmInstructionDetails,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmInvestmentAccount, com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmAccountParties,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmIntermediaries, com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmPlacement,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmNewIssueAllocation, com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmSavingsInvestmentPlan,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmWithdrawalInvestmentPlan, com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmCashSettlement,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmServiceLevelAgreement, com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmAdditionalInformation,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmMarketPracticeVersion, com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "001";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountOpeningInstructionV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountOpeningInstructionV06 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<InvestmentFundOrder4> getOrderReference() {
		return orderReference == null ? Optional.empty() : Optional.of(orderReference);
	}

	public AccountOpeningInstructionV06 setOrderReference(InvestmentFundOrder4 orderReference) {
		this.orderReference = orderReference;
		return this;
	}

	public Optional<AdditionalReference6> getPreviousReference() {
		return previousReference == null ? Optional.empty() : Optional.of(previousReference);
	}

	public AccountOpeningInstructionV06 setPreviousReference(AdditionalReference6 previousReference) {
		this.previousReference = previousReference;
		return this;
	}

	public InvestmentAccountOpening2 getInstructionDetails() {
		return instructionDetails;
	}

	public AccountOpeningInstructionV06 setInstructionDetails(InvestmentAccountOpening2 instructionDetails) {
		this.instructionDetails = Objects.requireNonNull(instructionDetails);
		return this;
	}

	public InvestmentAccount49 getInvestmentAccount() {
		return investmentAccount;
	}

	public AccountOpeningInstructionV06 setInvestmentAccount(InvestmentAccount49 investmentAccount) {
		this.investmentAccount = Objects.requireNonNull(investmentAccount);
		return this;
	}

	public AccountParties13 getAccountParties() {
		return accountParties;
	}

	public AccountOpeningInstructionV06 setAccountParties(AccountParties13 accountParties) {
		this.accountParties = Objects.requireNonNull(accountParties);
		return this;
	}

	public List<Intermediary36> getIntermediaries() {
		return intermediaries == null ? intermediaries = new ArrayList<>() : intermediaries;
	}

	public AccountOpeningInstructionV06 setIntermediaries(List<Intermediary36> intermediaries) {
		this.intermediaries = Objects.requireNonNull(intermediaries);
		return this;
	}

	public Optional<ReferredAgent2> getPlacement() {
		return placement == null ? Optional.empty() : Optional.of(placement);
	}

	public AccountOpeningInstructionV06 setPlacement(ReferredAgent2 placement) {
		this.placement = placement;
		return this;
	}

	public Optional<NewIssueAllocation2> getNewIssueAllocation() {
		return newIssueAllocation == null ? Optional.empty() : Optional.of(newIssueAllocation);
	}

	public AccountOpeningInstructionV06 setNewIssueAllocation(NewIssueAllocation2 newIssueAllocation) {
		this.newIssueAllocation = newIssueAllocation;
		return this;
	}

	public List<InvestmentPlan12> getSavingsInvestmentPlan() {
		return savingsInvestmentPlan == null ? savingsInvestmentPlan = new ArrayList<>() : savingsInvestmentPlan;
	}

	public AccountOpeningInstructionV06 setSavingsInvestmentPlan(List<InvestmentPlan12> savingsInvestmentPlan) {
		this.savingsInvestmentPlan = Objects.requireNonNull(savingsInvestmentPlan);
		return this;
	}

	public List<InvestmentPlan12> getWithdrawalInvestmentPlan() {
		return withdrawalInvestmentPlan == null ? withdrawalInvestmentPlan = new ArrayList<>() : withdrawalInvestmentPlan;
	}

	public AccountOpeningInstructionV06 setWithdrawalInvestmentPlan(List<InvestmentPlan12> withdrawalInvestmentPlan) {
		this.withdrawalInvestmentPlan = Objects.requireNonNull(withdrawalInvestmentPlan);
		return this;
	}

	public List<CashSettlement1> getCashSettlement() {
		return cashSettlement == null ? cashSettlement = new ArrayList<>() : cashSettlement;
	}

	public AccountOpeningInstructionV06 setCashSettlement(List<CashSettlement1> cashSettlement) {
		this.cashSettlement = Objects.requireNonNull(cashSettlement);
		return this;
	}

	public List<DocumentToSend3> getServiceLevelAgreement() {
		return serviceLevelAgreement == null ? serviceLevelAgreement = new ArrayList<>() : serviceLevelAgreement;
	}

	public AccountOpeningInstructionV06 setServiceLevelAgreement(List<DocumentToSend3> serviceLevelAgreement) {
		this.serviceLevelAgreement = Objects.requireNonNull(serviceLevelAgreement);
		return this;
	}

	public List<AccountRestrictions1> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public AccountOpeningInstructionV06 setAdditionalInformation(List<AccountRestrictions1> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return marketPracticeVersion == null ? Optional.empty() : Optional.of(marketPracticeVersion);
	}

	public AccountOpeningInstructionV06 setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public AccountOpeningInstructionV06 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.001.001.06")
	static public class Document {
		@XmlElement(name = "AcctOpngInstr", required = true)
		public AccountOpeningInstructionV06 messageBody;
	}
}