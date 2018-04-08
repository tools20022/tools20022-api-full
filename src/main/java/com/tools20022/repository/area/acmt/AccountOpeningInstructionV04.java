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
 * An account owner, for example, an investor or its designated agent sends the
 * AccountOpeningInstruction message to the account servicer, for example, a
 * registrar, transfer agent or custodian to instruct the opening of an account
 * or the opening of an account and establishing an investment plan.<br>
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
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmMessageIdentification
 * AccountOpeningInstructionV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmOrderReference
 * AccountOpeningInstructionV04.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmPreviousReference
 * AccountOpeningInstructionV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmInstructionDetails
 * AccountOpeningInstructionV04.mmInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmInvestmentAccount
 * AccountOpeningInstructionV04.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmAccountParties
 * AccountOpeningInstructionV04.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmIntermediaries
 * AccountOpeningInstructionV04.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmPlacement
 * AccountOpeningInstructionV04.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmNewIssueAllocation
 * AccountOpeningInstructionV04.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmSavingsInvestmentPlan
 * AccountOpeningInstructionV04.mmSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmWithdrawalInvestmentPlan
 * AccountOpeningInstructionV04.mmWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmCashSettlement
 * AccountOpeningInstructionV04.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmServiceLevelAgreement
 * AccountOpeningInstructionV04.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmMarketPracticeVersion
 * AccountOpeningInstructionV04.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmExtension
 * AccountOpeningInstructionV04.mmExtension}</li>
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
 * xmlTag} = "AcctOpngInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementArchive
 * AccountManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.001.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule#for_acmt_AccountOpeningInstructionV04
 * ConstraintInvestmentAccountIdentificationRule.
 * for_acmt_AccountOpeningInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUnit1Rule#for_acmt_AccountOpeningInstructionV04
 * ConstraintUnit1Rule.for_acmt_AccountOpeningInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage1Rule#for_acmt_AccountOpeningInstructionV04
 * ConstraintDividendPercentage1Rule.for_acmt_AccountOpeningInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage2Rule#for_acmt_AccountOpeningInstructionV04
 * ConstraintDividendPercentage2Rule.for_acmt_AccountOpeningInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage3Rule#for_acmt_AccountOpeningInstructionV04
 * ConstraintDividendPercentage3Rule.for_acmt_AccountOpeningInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule#for_acmt_AccountOpeningInstructionV04
 * ConstraintDividendPercentage4Rule.for_acmt_AccountOpeningInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage5Rule#for_acmt_AccountOpeningInstructionV04
 * ConstraintDividendPercentage5Rule.for_acmt_AccountOpeningInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule#for_acmt_AccountOpeningInstructionV04
 * ConstraintDividendPercentage6Rule.for_acmt_AccountOpeningInstructionV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountOpeningInstructionV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner, for example, an investor or its designated agent sends the AccountOpeningInstruction message to the account servicer, for example, a registrar, transfer agent or custodian to instruct the opening of an account or the opening of an account and establishing an investment plan.\r\nUsage\r\nThe AccountOpeningInstruction is used to open an account directly or indirectly with the account servicer or an intermediary.\r\nIn some markets, for example, Australia, and for some products in the United Kingdom, a first order (also known as a deposit instruction) is placed at the same time as the account opening. To cater for this scenario, an order message can be linked (via references in the message) to the AccountOpeningInstruction message when needed.\r\nExecution of the AccountOpeningInstruction is confirmed via an AccountDetailsConfirmation message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05
 * AccountOpeningInstructionV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03
 * AccountOpeningInstructionV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountOpeningInstructionV04", propOrder = {"messageIdentification", "orderReference", "previousReference", "instructionDetails", "investmentAccount", "accountParties", "intermediaries", "placement", "newIssueAllocation",
		"savingsInvestmentPlan", "withdrawalInvestmentPlan", "cashSettlement", "serviceLevelAgreement", "marketPracticeVersion", "extension"})
public class AccountOpeningInstructionV04 {

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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmMessageIdentification
	 * AccountOpeningInstructionV05.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmMessageIdentification
	 * AccountOpeningInstructionV03.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<AccountOpeningInstructionV04, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the message.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmMessageIdentification);
			previousVersion_lazy = () -> AccountOpeningInstructionV03.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(AccountOpeningInstructionV04 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, MessageIdentification1 value) {
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmOrderReference
	 * AccountOpeningInstructionV05.mmOrderReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmOrderReference
	 * AccountOpeningInstructionV03.mmOrderReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, Optional<InvestmentFundOrder4>> mmOrderReference = new MMMessageBuildingBlock<AccountOpeningInstructionV04, Optional<InvestmentFundOrder4>>() {
		{
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Identifies a related order.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmOrderReference);
			previousVersion_lazy = () -> AccountOpeningInstructionV03.mmOrderReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundOrder4.mmObject();
		}

		@Override
		public Optional<InvestmentFundOrder4> getValue(AccountOpeningInstructionV04 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, Optional<InvestmentFundOrder4> value) {
			obj.setOrderReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsRef")
	protected AdditionalReference3 previousReference;
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmPreviousReference
	 * AccountOpeningInstructionV05.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmPreviousReference
	 * AccountOpeningInstructionV03.mmPreviousReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, Optional<AdditionalReference3>> mmPreviousReference = new MMMessageBuildingBlock<AccountOpeningInstructionV04, Optional<AdditionalReference3>>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmPreviousReference);
			previousVersion_lazy = () -> AccountOpeningInstructionV03.mmPreviousReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(AccountOpeningInstructionV04 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, Optional<AdditionalReference3> value) {
			obj.setPreviousReference(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrDtls", required = true)
	protected InvestmentAccountOpeningDetails instructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpeningDetails
	 * InvestmentAccountOpeningDetails}</li>
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
	 * definition} =
	 * "Provides detailed information about the opening instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmInstructionDetails
	 * AccountOpeningInstructionV05.mmInstructionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmInstructionDetails
	 * AccountOpeningInstructionV03.mmInstructionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, InvestmentAccountOpeningDetails> mmInstructionDetails = new MMMessageBuildingBlock<AccountOpeningInstructionV04, InvestmentAccountOpeningDetails>() {
		{
			xmlTag = "InstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionDetails";
			definition = "Provides detailed information about the opening instruction.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmInstructionDetails);
			previousVersion_lazy = () -> AccountOpeningInstructionV03.mmInstructionDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestmentAccountOpeningDetails.mmObject();
		}

		@Override
		public InvestmentAccountOpeningDetails getValue(AccountOpeningInstructionV04 obj) {
			return obj.getInstructionDetails();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, InvestmentAccountOpeningDetails value) {
			obj.setInstructionDetails(value);
		}
	};
	@XmlElement(name = "InvstmtAcct", required = true)
	protected InvestmentAccount37 investmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37
	 * InvestmentAccount37}</li>
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
	 * "Detailed information about the investment account to be opened."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmInvestmentAccount
	 * AccountOpeningInstructionV05.mmInvestmentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmInvestmentAccount
	 * AccountOpeningInstructionV03.mmInvestmentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, InvestmentAccount37> mmInvestmentAccount = new MMMessageBuildingBlock<AccountOpeningInstructionV04, InvestmentAccount37>() {
		{
			xmlTag = "InvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Detailed information about the investment account to be opened.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmInvestmentAccount);
			previousVersion_lazy = () -> AccountOpeningInstructionV03.mmInvestmentAccount;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestmentAccount37.mmObject();
		}

		@Override
		public InvestmentAccount37 getValue(AccountOpeningInstructionV04 obj) {
			return obj.getInvestmentAccount();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, InvestmentAccount37 value) {
			obj.setInvestmentAccount(value);
		}
	};
	@XmlElement(name = "AcctPties", required = true)
	protected AccountParties9 accountParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AccountParties9
	 * AccountParties9}</li>
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
	 * "Information related to parties who are related to an investment account, for example, primary account owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmAccountParties
	 * AccountOpeningInstructionV05.mmAccountParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmAccountParties
	 * AccountOpeningInstructionV03.mmAccountParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, AccountParties9> mmAccountParties = new MMMessageBuildingBlock<AccountOpeningInstructionV04, AccountParties9>() {
		{
			xmlTag = "AcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountParties";
			definition = "Information related to parties who are related to an investment account, for example, primary account owner.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmAccountParties);
			previousVersion_lazy = () -> AccountOpeningInstructionV03.mmAccountParties;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountParties9.mmObject();
		}

		@Override
		public AccountParties9 getValue(AccountOpeningInstructionV04 obj) {
			return obj.getAccountParties();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, AccountParties9 value) {
			obj.setAccountParties(value);
		}
	};
	@XmlElement(name = "Intrmies")
	protected List<Intermediary24> intermediaries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary24
	 * Intermediary24}</li>
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
	 * definition} = "Information related to an intermediary."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmIntermediaries
	 * AccountOpeningInstructionV05.mmIntermediaries}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmIntermediaries
	 * AccountOpeningInstructionV03.mmIntermediaries}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, List<Intermediary24>> mmIntermediaries = new MMMessageBuildingBlock<AccountOpeningInstructionV04, List<Intermediary24>>() {
		{
			xmlTag = "Intrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediaries";
			definition = "Information related to an intermediary.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmIntermediaries);
			previousVersion_lazy = () -> AccountOpeningInstructionV03.mmIntermediaries;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> Intermediary24.mmObject();
		}

		@Override
		public List<Intermediary24> getValue(AccountOpeningInstructionV04 obj) {
			return obj.getIntermediaries();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, List<Intermediary24> value) {
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmPlacement
	 * AccountOpeningInstructionV05.mmPlacement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmPlacement
	 * AccountOpeningInstructionV03.mmPlacement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, Optional<ReferredAgent1>> mmPlacement = new MMMessageBuildingBlock<AccountOpeningInstructionV04, Optional<ReferredAgent1>>() {
		{
			xmlTag = "Plcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			definition = "Placement agent for the hedge fund industry.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmPlacement);
			previousVersion_lazy = () -> AccountOpeningInstructionV03.mmPlacement;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ReferredAgent1.mmObject();
		}

		@Override
		public Optional<ReferredAgent1> getValue(AccountOpeningInstructionV04 obj) {
			return obj.getPlacement();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, Optional<ReferredAgent1> value) {
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmNewIssueAllocation
	 * AccountOpeningInstructionV05.mmNewIssueAllocation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmNewIssueAllocation
	 * AccountOpeningInstructionV03.mmNewIssueAllocation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, Optional<NewIssueAllocation1>> mmNewIssueAllocation = new MMMessageBuildingBlock<AccountOpeningInstructionV04, Optional<NewIssueAllocation1>>() {
		{
			xmlTag = "NewIsseAllcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssueAllocation";
			definition = "Eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmNewIssueAllocation);
			previousVersion_lazy = () -> AccountOpeningInstructionV03.mmNewIssueAllocation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NewIssueAllocation1.mmObject();
		}

		@Override
		public Optional<NewIssueAllocation1> getValue(AccountOpeningInstructionV04 obj) {
			return obj.getNewIssueAllocation();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, Optional<NewIssueAllocation1> value) {
			obj.setNewIssueAllocation(value.orElse(null));
		}
	};
	@XmlElement(name = "SvgsInvstmtPlan")
	protected List<InvestmentPlan9> savingsInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InvestmentPlan9
	 * InvestmentPlan9}</li>
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmSavingsInvestmentPlan
	 * AccountOpeningInstructionV05.mmSavingsInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmSavingsInvestmentPlan
	 * AccountOpeningInstructionV03.mmSavingsInvestmentPlan}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, List<InvestmentPlan9>> mmSavingsInvestmentPlan = new MMMessageBuildingBlock<AccountOpeningInstructionV04, List<InvestmentPlan9>>() {
		{
			xmlTag = "SvgsInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsInvestmentPlan";
			definition = "Plan that allows individuals to set aside a fixed amount of money at specified intervals, usually for a special purpose, for example, retirement.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmSavingsInvestmentPlan);
			previousVersion_lazy = () -> AccountOpeningInstructionV03.mmSavingsInvestmentPlan;
			maxOccurs = 50;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan9.mmObject();
		}

		@Override
		public List<InvestmentPlan9> getValue(AccountOpeningInstructionV04 obj) {
			return obj.getSavingsInvestmentPlan();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, List<InvestmentPlan9> value) {
			obj.setSavingsInvestmentPlan(value);
		}
	};
	@XmlElement(name = "WdrwlInvstmtPlan")
	protected List<InvestmentPlan9> withdrawalInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InvestmentPlan9
	 * InvestmentPlan9}</li>
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
	 * "Plan through which an investment fund investor's holdings are depleted through regular withdrawals at specified intervals."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmWithdrawalInvestmentPlan
	 * AccountOpeningInstructionV05.mmWithdrawalInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmWithdrawalInvestmentPlan
	 * AccountOpeningInstructionV03.mmWithdrawalInvestmentPlan}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, List<InvestmentPlan9>> mmWithdrawalInvestmentPlan = new MMMessageBuildingBlock<AccountOpeningInstructionV04, List<InvestmentPlan9>>() {
		{
			xmlTag = "WdrwlInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalInvestmentPlan";
			definition = "Plan through which an investment fund investor's holdings are depleted through regular withdrawals at specified intervals.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmWithdrawalInvestmentPlan);
			previousVersion_lazy = () -> AccountOpeningInstructionV03.mmWithdrawalInvestmentPlan;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan9.mmObject();
		}

		@Override
		public List<InvestmentPlan9> getValue(AccountOpeningInstructionV04 obj) {
			return obj.getWithdrawalInvestmentPlan();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, List<InvestmentPlan9> value) {
			obj.setWithdrawalInvestmentPlan(value);
		}
	};
	@XmlElement(name = "CshSttlm")
	protected List<InvestmentFundCashSettlementInformation7> cashSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7
	 * InvestmentFundCashSettlementInformation7}</li>
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
	 * "Cash settlement standing instruction associated to the investment fund transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmCashSettlement
	 * AccountOpeningInstructionV05.mmCashSettlement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmCashSettlement
	 * AccountOpeningInstructionV03.mmCashSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, List<InvestmentFundCashSettlementInformation7>> mmCashSettlement = new MMMessageBuildingBlock<AccountOpeningInstructionV04, List<InvestmentFundCashSettlementInformation7>>() {
		{
			xmlTag = "CshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "Cash settlement standing instruction associated to the investment fund transaction.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmCashSettlement);
			previousVersion_lazy = () -> AccountOpeningInstructionV03.mmCashSettlement;
			maxOccurs = 8;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundCashSettlementInformation7.mmObject();
		}

		@Override
		public List<InvestmentFundCashSettlementInformation7> getValue(AccountOpeningInstructionV04 obj) {
			return obj.getCashSettlement();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, List<InvestmentFundCashSettlementInformation7> value) {
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmServiceLevelAgreement
	 * AccountOpeningInstructionV05.mmServiceLevelAgreement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmServiceLevelAgreement
	 * AccountOpeningInstructionV03.mmServiceLevelAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, List<DocumentToSend1>> mmServiceLevelAgreement = new MMMessageBuildingBlock<AccountOpeningInstructionV04, List<DocumentToSend1>>() {
		{
			xmlTag = "SvcLvlAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelAgreement";
			definition = "Identifies documents to be provided for the account opening.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmServiceLevelAgreement);
			previousVersion_lazy = () -> AccountOpeningInstructionV03.mmServiceLevelAgreement;
			maxOccurs = 30;
			minOccurs = 0;
			complexType_lazy = () -> DocumentToSend1.mmObject();
		}

		@Override
		public List<DocumentToSend1> getValue(AccountOpeningInstructionV04 obj) {
			return obj.getServiceLevelAgreement();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, List<DocumentToSend1> value) {
			obj.setServiceLevelAgreement(value);
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmMarketPracticeVersion
	 * AccountOpeningInstructionV05.mmMarketPracticeVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, Optional<MarketPracticeVersion1>> mmMarketPracticeVersion = new MMMessageBuildingBlock<AccountOpeningInstructionV04, Optional<MarketPracticeVersion1>>() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmMarketPracticeVersion);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		@Override
		public Optional<MarketPracticeVersion1> getValue(AccountOpeningInstructionV04 obj) {
			return obj.getMarketPracticeVersion();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, Optional<MarketPracticeVersion1> value) {
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmExtension
	 * AccountOpeningInstructionV05.mmExtension}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmExtension
	 * AccountOpeningInstructionV03.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningInstructionV04, List<Extension1>> mmExtension = new MMMessageBuildingBlock<AccountOpeningInstructionV04, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmExtension);
			previousVersion_lazy = () -> AccountOpeningInstructionV03.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(AccountOpeningInstructionV04 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(AccountOpeningInstructionV04 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule.for_acmt_AccountOpeningInstructionV04,
						com.tools20022.repository.constraints.ConstraintUnit1Rule.for_acmt_AccountOpeningInstructionV04, com.tools20022.repository.constraints.ConstraintDividendPercentage1Rule.for_acmt_AccountOpeningInstructionV04,
						com.tools20022.repository.constraints.ConstraintDividendPercentage2Rule.for_acmt_AccountOpeningInstructionV04,
						com.tools20022.repository.constraints.ConstraintDividendPercentage3Rule.for_acmt_AccountOpeningInstructionV04,
						com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule.for_acmt_AccountOpeningInstructionV04,
						com.tools20022.repository.constraints.ConstraintDividendPercentage5Rule.for_acmt_AccountOpeningInstructionV04,
						com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule.for_acmt_AccountOpeningInstructionV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountOpeningInstructionV04";
				definition = "Scope\r\nAn account owner, for example, an investor or its designated agent sends the AccountOpeningInstruction message to the account servicer, for example, a registrar, transfer agent or custodian to instruct the opening of an account or the opening of an account and establishing an investment plan.\r\nUsage\r\nThe AccountOpeningInstruction is used to open an account directly or indirectly with the account servicer or an intermediary.\r\nIn some markets, for example, Australia, and for some products in the United Kingdom, a first order (also known as a deposit instruction) is placed at the same time as the account opening. To cater for this scenario, an order message can be linked (via references in the message) to the AccountOpeningInstruction message when needed.\r\nExecution of the AccountOpeningInstruction is confirmed via an AccountDetailsConfirmation message.";
				nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmObject());
				previousVersion_lazy = () -> AccountOpeningInstructionV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AcctOpngInstr";
				businessArea_lazy = () -> AccountManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmMessageIdentification, com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmOrderReference,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmPreviousReference, com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmInstructionDetails,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmInvestmentAccount, com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmAccountParties,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmIntermediaries, com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmPlacement,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmNewIssueAllocation, com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmSavingsInvestmentPlan,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmWithdrawalInvestmentPlan, com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmCashSettlement,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmServiceLevelAgreement, com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmMarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "001";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountOpeningInstructionV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountOpeningInstructionV04 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<InvestmentFundOrder4> getOrderReference() {
		return orderReference == null ? Optional.empty() : Optional.of(orderReference);
	}

	public AccountOpeningInstructionV04 setOrderReference(InvestmentFundOrder4 orderReference) {
		this.orderReference = orderReference;
		return this;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? Optional.empty() : Optional.of(previousReference);
	}

	public AccountOpeningInstructionV04 setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
		return this;
	}

	public InvestmentAccountOpeningDetails getInstructionDetails() {
		return instructionDetails;
	}

	public AccountOpeningInstructionV04 setInstructionDetails(InvestmentAccountOpeningDetails instructionDetails) {
		this.instructionDetails = Objects.requireNonNull(instructionDetails);
		return this;
	}

	public InvestmentAccount37 getInvestmentAccount() {
		return investmentAccount;
	}

	public AccountOpeningInstructionV04 setInvestmentAccount(InvestmentAccount37 investmentAccount) {
		this.investmentAccount = Objects.requireNonNull(investmentAccount);
		return this;
	}

	public AccountParties9 getAccountParties() {
		return accountParties;
	}

	public AccountOpeningInstructionV04 setAccountParties(AccountParties9 accountParties) {
		this.accountParties = Objects.requireNonNull(accountParties);
		return this;
	}

	public List<Intermediary24> getIntermediaries() {
		return intermediaries == null ? intermediaries = new ArrayList<>() : intermediaries;
	}

	public AccountOpeningInstructionV04 setIntermediaries(List<Intermediary24> intermediaries) {
		this.intermediaries = Objects.requireNonNull(intermediaries);
		return this;
	}

	public Optional<ReferredAgent1> getPlacement() {
		return placement == null ? Optional.empty() : Optional.of(placement);
	}

	public AccountOpeningInstructionV04 setPlacement(ReferredAgent1 placement) {
		this.placement = placement;
		return this;
	}

	public Optional<NewIssueAllocation1> getNewIssueAllocation() {
		return newIssueAllocation == null ? Optional.empty() : Optional.of(newIssueAllocation);
	}

	public AccountOpeningInstructionV04 setNewIssueAllocation(NewIssueAllocation1 newIssueAllocation) {
		this.newIssueAllocation = newIssueAllocation;
		return this;
	}

	public List<InvestmentPlan9> getSavingsInvestmentPlan() {
		return savingsInvestmentPlan == null ? savingsInvestmentPlan = new ArrayList<>() : savingsInvestmentPlan;
	}

	public AccountOpeningInstructionV04 setSavingsInvestmentPlan(List<InvestmentPlan9> savingsInvestmentPlan) {
		this.savingsInvestmentPlan = Objects.requireNonNull(savingsInvestmentPlan);
		return this;
	}

	public List<InvestmentPlan9> getWithdrawalInvestmentPlan() {
		return withdrawalInvestmentPlan == null ? withdrawalInvestmentPlan = new ArrayList<>() : withdrawalInvestmentPlan;
	}

	public AccountOpeningInstructionV04 setWithdrawalInvestmentPlan(List<InvestmentPlan9> withdrawalInvestmentPlan) {
		this.withdrawalInvestmentPlan = Objects.requireNonNull(withdrawalInvestmentPlan);
		return this;
	}

	public List<InvestmentFundCashSettlementInformation7> getCashSettlement() {
		return cashSettlement == null ? cashSettlement = new ArrayList<>() : cashSettlement;
	}

	public AccountOpeningInstructionV04 setCashSettlement(List<InvestmentFundCashSettlementInformation7> cashSettlement) {
		this.cashSettlement = Objects.requireNonNull(cashSettlement);
		return this;
	}

	public List<DocumentToSend1> getServiceLevelAgreement() {
		return serviceLevelAgreement == null ? serviceLevelAgreement = new ArrayList<>() : serviceLevelAgreement;
	}

	public AccountOpeningInstructionV04 setServiceLevelAgreement(List<DocumentToSend1> serviceLevelAgreement) {
		this.serviceLevelAgreement = Objects.requireNonNull(serviceLevelAgreement);
		return this;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return marketPracticeVersion == null ? Optional.empty() : Optional.of(marketPracticeVersion);
	}

	public AccountOpeningInstructionV04 setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public AccountOpeningInstructionV04 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.001.001.04")
	static public class Document {
		@XmlElement(name = "AcctOpngInstr", required = true)
		public AccountOpeningInstructionV04 messageBody;
	}
}