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
import com.tools20022.repository.area.AccountManagementLatestVersion;
import com.tools20022.repository.choice.AccountSelection2Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * The AccountModificationInstruction message is sent by an account owner, for
 * example, an investor or its designated agent to the account servicer, for
 * example, a registrar, transfer agent, custodian bank or securities depository
 * to modify, that is, create, update or delete specific details of an existing
 * account.<br>
 * <b>Usage</b><br>
 * The AccountModificationInstruction message is used to modify the details of
 * an existing account.<br>
 * The AccountModificationInstruction message can be used to:<br>
 * - maintain/update any of the existing account details, for example, to update
 * the address of the beneficiary or modify the preference to income from
 * distribution to capitalisation, or,<br>
 * - add/create specific details to the existing account when these details were
 * not yet recorded at the time of account creation, for example, to add a
 * second address or to establish new cash settlement standing instructions, or,<br>
 * - delete specific account details, for example, delete cash standing
 * instructions, or,<br>
 * - instruct a change to the status of the account, for example, instruct the
 * closure of the account.<br>
 * The usage of this message may be subject to service level agreement (SLA)
 * between the counterparties.<br>
 * Execution of the AccountModificationInstruction is confirmed via an
 * AccountDetailsConfirmation message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.003.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
 * AccountManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOLatestversion
 * InvestmentFundsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctModInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmMessageIdentification
 * AccountModificationInstructionV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmPreviousReference
 * AccountModificationInstructionV07.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmInstructionDetails
 * AccountModificationInstructionV07.mmInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmInvestmentAccountSelection
 * AccountModificationInstructionV07.mmInvestmentAccountSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedInvestmentAccount
 * AccountModificationInstructionV07.mmModifiedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedAccountParties
 * AccountModificationInstructionV07.mmModifiedAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedIntermediaries
 * AccountModificationInstructionV07.mmModifiedIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedPlacement
 * AccountModificationInstructionV07.mmModifiedPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedIssueAllocation
 * AccountModificationInstructionV07.mmModifiedIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedSavingsInvestmentPlan
 * AccountModificationInstructionV07.mmModifiedSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedWithdrawalInvestmentPlan
 * AccountModificationInstructionV07.mmModifiedWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedCashSettlement
 * AccountModificationInstructionV07.mmModifiedCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedServiceLevelAgreement
 * AccountModificationInstructionV07.mmModifiedServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedAdditionalInformation
 * AccountModificationInstructionV07.mmModifiedAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmMarketPracticeVersion
 * AccountModificationInstructionV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmExtension
 * AccountModificationInstructionV07.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountModificationInstructionV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AccountModificationInstruction message is sent by an account owner, for example, an investor or its designated agent to the account servicer, for example, a registrar, transfer agent, custodian bank or securities depository to modify, that is, create, update or delete specific details of an existing account.\r\nUsage\r\nThe AccountModificationInstruction message is used to modify the details of an existing account.\r\nThe AccountModificationInstruction message can be used to:\r\n- maintain/update any of the existing account details, for example, to update the address of the beneficiary or modify the preference to income from distribution to capitalisation, or,\r\n- add/create specific details to the existing account when these details were not yet recorded at the time of account creation, for example, to add a second address or to establish new cash settlement standing instructions, or,\r\n- delete specific account details, for example, delete cash standing instructions, or,\r\n- instruct a change to the status of the account, for example, instruct the closure of the account.\r\nThe usage of this message may be subject to service level agreement (SLA) between the counterparties.\r\nExecution of the AccountModificationInstruction is confirmed via an AccountDetailsConfirmation message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06
 * AccountModificationInstructionV06}</li>
 * </ul>
 */
public class AccountModificationInstructionV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Reference that uniquely identifies the message from a business
	 * application standpoint.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmMessageIdentification
	 * AccountModificationInstructionV06.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint.";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	protected AdditionalReference6 previousReference;
	/**
	 * Reference to a linked message that was previously sent.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmPreviousReference
	 * AccountModificationInstructionV06.mmPreviousReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmPreviousReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}
	};
	protected InvestmentAccountModification3 instructionDetails;
	/**
	 * Information about the modification instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification3
	 * InvestmentAccountModification3}</li>
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
	 * definition} = "Information about the modification instruction. "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmInstructionDetails
	 * AccountModificationInstructionV06.mmInstructionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionDetails";
			definition = "Information about the modification instruction. ";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmInstructionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccountModification3.mmObject();
		}
	};
	protected AccountSelection2Choice investmentAccountSelection;
	/**
	 * Identifies the account for which the information is modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountSelection2Choice
	 * AccountSelection2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctSelctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountSelection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the account for which the information is modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmInvestmentAccountSelection
	 * AccountModificationInstructionV06.mmInvestmentAccountSelection}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInvestmentAccountSelection = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvstmtAcctSelctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountSelection";
			definition = "Identifies the account for which the information is modified.";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmInvestmentAccountSelection;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountSelection2Choice.mmObject();
		}
	};
	protected InvestmentAccount63 modifiedInvestmentAccount;
	/**
	 * Information related to general characteristics of the account to be
	 * inserted, updated or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdInvstmtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedInvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to general characteristics of the account to be inserted, updated or deleted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedInvestmentAccount
	 * AccountModificationInstructionV06.mmModifiedInvestmentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedInvestmentAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdInvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedInvestmentAccount";
			definition = "Information related to general characteristics of the account to be inserted, updated or deleted.";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmModifiedInvestmentAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccount63.mmObject();
		}
	};
	protected List<AccountParties16> modifiedAccountParties;
	/**
	 * Information related to an account party to be inserted, updated or
	 * deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdAcctPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedAccountParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to an account  party to be inserted, updated or deleted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedAccountParties
	 * AccountModificationInstructionV06.mmModifiedAccountParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedAccountParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdAcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedAccountParties";
			definition = "Information related to an account  party to be inserted, updated or deleted.";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmModifiedAccountParties;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> AccountParties16.mmObject();
		}
	};
	protected List<ModificationScope38> modifiedIntermediaries;
	/**
	 * Information related to intermediaries to be inserted, updated or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope38
	 * ModificationScope38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdIntrmies"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedIntermediaries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to intermediaries to be inserted, updated or deleted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedIntermediaries
	 * AccountModificationInstructionV06.mmModifiedIntermediaries}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedIntermediaries = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdIntrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedIntermediaries";
			definition = "Information related to intermediaries to be inserted, updated or deleted.";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmModifiedIntermediaries;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope38.mmObject();
		}
	};
	protected ModificationScope33 modifiedPlacement;
	/**
	 * Information related to referral information to be inserted, updated or
	 * deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope33
	 * ModificationScope33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdPlcmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedPlacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to referral information to be inserted, updated or deleted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedPlacement
	 * AccountModificationInstructionV06.mmModifiedPlacement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedPlacement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdPlcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedPlacement";
			definition = "Information related to referral information to be inserted, updated or deleted.";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmModifiedPlacement;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope33.mmObject();
		}
	};
	protected ModificationScope21 modifiedIssueAllocation;
	/**
	 * Eligibility conditions related to allocation of new issues to be
	 * inserted, updated or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope21
	 * ModificationScope21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdIsseAllcn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedIssueAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eligibility conditions related to allocation of new issues to be inserted, updated or deleted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedIssueAllocation
	 * AccountModificationInstructionV06.mmModifiedIssueAllocation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedIssueAllocation = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdIsseAllcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedIssueAllocation";
			definition = "Eligibility conditions related to allocation of new issues to be inserted, updated or deleted.";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmModifiedIssueAllocation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope21.mmObject();
		}
	};
	protected List<ModificationScope37> modifiedSavingsInvestmentPlan;
	/**
	 * Information related to a savings plan to be either inserted, updated or
	 * deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope37
	 * ModificationScope37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdSvgsInvstmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedSavingsInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to a savings plan to be either inserted, updated or deleted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedSavingsInvestmentPlan
	 * AccountModificationInstructionV06.mmModifiedSavingsInvestmentPlan}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedSavingsInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdSvgsInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedSavingsInvestmentPlan";
			definition = "Information related to a savings plan to be either inserted, updated or deleted.";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmModifiedSavingsInvestmentPlan;
			maxOccurs = 50;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope37.mmObject();
		}
	};
	protected List<ModificationScope37> modifiedWithdrawalInvestmentPlan;
	/**
	 * Information related to a withdrawal plan to be either inserted, updated
	 * or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope37
	 * ModificationScope37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdWdrwlInvstmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedWithdrawalInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to a withdrawal plan to be either inserted, updated or deleted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedWithdrawalInvestmentPlan
	 * AccountModificationInstructionV06.mmModifiedWithdrawalInvestmentPlan}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedWithdrawalInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdWdrwlInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedWithdrawalInvestmentPlan";
			definition = "Information related to a withdrawal plan to be either inserted, updated or deleted.";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmModifiedWithdrawalInvestmentPlan;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope37.mmObject();
		}
	};
	protected List<CashSettlement2> modifiedCashSettlement;
	/**
	 * Cash settlement standing instruction to be either inserted or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashSettlement2
	 * CashSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdCshSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedCashSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash settlement standing instruction to be either inserted or deleted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedCashSettlement
	 * AccountModificationInstructionV06.mmModifiedCashSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedCashSettlement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdCshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedCashSettlement";
			definition = "Cash settlement standing instruction to be either inserted or deleted.";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmModifiedCashSettlement;
			maxOccurs = 8;
			minOccurs = 0;
			complexType_lazy = () -> CashSettlement2.mmObject();
		}
	};
	protected List<ModificationScope31> modifiedServiceLevelAgreement;
	/**
	 * Information related to documents to be added, deleted or updated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope31
	 * ModificationScope31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdSvcLvlAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedServiceLevelAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to documents to be added, deleted or updated.\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedServiceLevelAgreement
	 * AccountModificationInstructionV06.mmModifiedServiceLevelAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedServiceLevelAgreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdSvcLvlAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedServiceLevelAgreement";
			definition = "Information related to documents to be added, deleted or updated.\n";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmModifiedServiceLevelAgreement;
			maxOccurs = 30;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope31.mmObject();
		}
	};
	protected List<ModificationScope35> modifiedAdditionalInformation;
	/**
	 * Information related to additional information to be added, deleted or
	 * updated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope35
	 * ModificationScope35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdAddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to additional information to be added, deleted or updated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedAdditionalInformation
	 * AccountModificationInstructionV06.mmModifiedAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedAdditionalInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedAdditionalInformation";
			definition = "Information related to additional information to be added, deleted or updated.";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmModifiedAdditionalInformation;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope35.mmObject();
		}
	};
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * Identifies the market practice to which the message conforms.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmMarketPracticeVersion
	 * AccountModificationInstructionV06.mmMarketPracticeVersion}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarketPracticeVersion = new MMMessageBuildingBlock() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmMarketPracticeVersion;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}
	};
	protected List<Extension1> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmExtension
	 * AccountModificationInstructionV06.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> AccountModificationInstructionV06.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountModificationInstructionV07";
				definition = "Scope\r\nThe AccountModificationInstruction message is sent by an account owner, for example, an investor or its designated agent to the account servicer, for example, a registrar, transfer agent, custodian bank or securities depository to modify, that is, create, update or delete specific details of an existing account.\r\nUsage\r\nThe AccountModificationInstruction message is used to modify the details of an existing account.\r\nThe AccountModificationInstruction message can be used to:\r\n- maintain/update any of the existing account details, for example, to update the address of the beneficiary or modify the preference to income from distribution to capitalisation, or,\r\n- add/create specific details to the existing account when these details were not yet recorded at the time of account creation, for example, to add a second address or to establish new cash settlement standing instructions, or,\r\n- delete specific account details, for example, delete cash standing instructions, or,\r\n- instruct a change to the status of the account, for example, instruct the closure of the account.\r\nThe usage of this message may be subject to service level agreement (SLA) between the counterparties.\r\nExecution of the AccountModificationInstruction is confirmed via an AccountDetailsConfirmation message.";
				previousVersion_lazy = () -> AccountModificationInstructionV06.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AcctModInstr";
				businessArea_lazy = () -> AccountManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmMessageIdentification, AccountModificationInstructionV07.mmPreviousReference, AccountModificationInstructionV07.mmInstructionDetails,
						AccountModificationInstructionV07.mmInvestmentAccountSelection, AccountModificationInstructionV07.mmModifiedInvestmentAccount, AccountModificationInstructionV07.mmModifiedAccountParties,
						AccountModificationInstructionV07.mmModifiedIntermediaries, AccountModificationInstructionV07.mmModifiedPlacement, AccountModificationInstructionV07.mmModifiedIssueAllocation,
						AccountModificationInstructionV07.mmModifiedSavingsInvestmentPlan, AccountModificationInstructionV07.mmModifiedWithdrawalInvestmentPlan, AccountModificationInstructionV07.mmModifiedCashSettlement,
						AccountModificationInstructionV07.mmModifiedServiceLevelAgreement, AccountModificationInstructionV07.mmModifiedAdditionalInformation, AccountModificationInstructionV07.mmMarketPracticeVersion,
						AccountModificationInstructionV07.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "003";
						version = "07";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	public AdditionalReference6 getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(AdditionalReference6 previousReference) {
		this.previousReference = previousReference;
	}

	public InvestmentAccountModification3 getInstructionDetails() {
		return instructionDetails;
	}

	public void setInstructionDetails(InvestmentAccountModification3 instructionDetails) {
		this.instructionDetails = instructionDetails;
	}

	public AccountSelection2Choice getInvestmentAccountSelection() {
		return investmentAccountSelection;
	}

	public void setInvestmentAccountSelection(AccountSelection2Choice investmentAccountSelection) {
		this.investmentAccountSelection = investmentAccountSelection;
	}

	public InvestmentAccount63 getModifiedInvestmentAccount() {
		return modifiedInvestmentAccount;
	}

	public void setModifiedInvestmentAccount(InvestmentAccount63 modifiedInvestmentAccount) {
		this.modifiedInvestmentAccount = modifiedInvestmentAccount;
	}

	public List<AccountParties16> getModifiedAccountParties() {
		return modifiedAccountParties;
	}

	public void setModifiedAccountParties(List<AccountParties16> modifiedAccountParties) {
		this.modifiedAccountParties = modifiedAccountParties;
	}

	public List<ModificationScope38> getModifiedIntermediaries() {
		return modifiedIntermediaries;
	}

	public void setModifiedIntermediaries(List<ModificationScope38> modifiedIntermediaries) {
		this.modifiedIntermediaries = modifiedIntermediaries;
	}

	public ModificationScope33 getModifiedPlacement() {
		return modifiedPlacement;
	}

	public void setModifiedPlacement(ModificationScope33 modifiedPlacement) {
		this.modifiedPlacement = modifiedPlacement;
	}

	public ModificationScope21 getModifiedIssueAllocation() {
		return modifiedIssueAllocation;
	}

	public void setModifiedIssueAllocation(ModificationScope21 modifiedIssueAllocation) {
		this.modifiedIssueAllocation = modifiedIssueAllocation;
	}

	public List<ModificationScope37> getModifiedSavingsInvestmentPlan() {
		return modifiedSavingsInvestmentPlan;
	}

	public void setModifiedSavingsInvestmentPlan(List<ModificationScope37> modifiedSavingsInvestmentPlan) {
		this.modifiedSavingsInvestmentPlan = modifiedSavingsInvestmentPlan;
	}

	public List<ModificationScope37> getModifiedWithdrawalInvestmentPlan() {
		return modifiedWithdrawalInvestmentPlan;
	}

	public void setModifiedWithdrawalInvestmentPlan(List<ModificationScope37> modifiedWithdrawalInvestmentPlan) {
		this.modifiedWithdrawalInvestmentPlan = modifiedWithdrawalInvestmentPlan;
	}

	public List<CashSettlement2> getModifiedCashSettlement() {
		return modifiedCashSettlement;
	}

	public void setModifiedCashSettlement(List<CashSettlement2> modifiedCashSettlement) {
		this.modifiedCashSettlement = modifiedCashSettlement;
	}

	public List<ModificationScope31> getModifiedServiceLevelAgreement() {
		return modifiedServiceLevelAgreement;
	}

	public void setModifiedServiceLevelAgreement(List<ModificationScope31> modifiedServiceLevelAgreement) {
		this.modifiedServiceLevelAgreement = modifiedServiceLevelAgreement;
	}

	public List<ModificationScope35> getModifiedAdditionalInformation() {
		return modifiedAdditionalInformation;
	}

	public void setModifiedAdditionalInformation(List<ModificationScope35> modifiedAdditionalInformation) {
		this.modifiedAdditionalInformation = modifiedAdditionalInformation;
	}

	public MarketPracticeVersion1 getMarketPracticeVersion() {
		return marketPracticeVersion;
	}

	public void setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
	}

	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}
}