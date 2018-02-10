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
import com.tools20022.repository.choice.AccountSelection1Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account owner, for example, an investor or its designated agent, sends the
 * AccountModificationInstruction message to the account servicer, for example,
 * a registrar, transfer agent, custodian bank or securities depository to
 * modify, that is, create, update or delete specific details of an existing
 * account.<br>
 * <b>Usage</b><br>
 * The AccountModificationInstruction message is used to modify the details of
 * an existing account.<br>
 * The AccountModificationInstruction message has three specific uses:<br>
 * - to maintain/update any of the existing account details, for example, to
 * update the address of the beneficiary or modify the preference to income from
 * distribution to capitalisation, or,<br>
 * - to add/create specific details to the existing account when these details
 * were not yet recorded at the time of account creation, for example, to add a
 * second address or to establish new cash settlement standing instructions, or,<br>
 * - to delete specific account details, for example, delete cash standing
 * instructions.<br>
 * This message cannot be used to delete an entire account, as institution
 * specific and regulatory rules pertaining to account deletion are diverse.<br>
 * The usage of this message may be subject to service level agreement (SLA)
 * between the counterparties.<br>
 * Execution of the AccountModificationInstruction is confirmed via an
 * AccountDetailsConfirmation message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmMessageIdentification
 * AccountModificationInstructionV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmPreviousReference
 * AccountModificationInstructionV06.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmInstructionDetails
 * AccountModificationInstructionV06.mmInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmInvestmentAccountSelection
 * AccountModificationInstructionV06.mmInvestmentAccountSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedInvestmentAccount
 * AccountModificationInstructionV06.mmModifiedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedAccountParties
 * AccountModificationInstructionV06.mmModifiedAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedIntermediaries
 * AccountModificationInstructionV06.mmModifiedIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedPlacement
 * AccountModificationInstructionV06.mmModifiedPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedIssueAllocation
 * AccountModificationInstructionV06.mmModifiedIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedSavingsInvestmentPlan
 * AccountModificationInstructionV06.mmModifiedSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedWithdrawalInvestmentPlan
 * AccountModificationInstructionV06.mmModifiedWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedCashSettlement
 * AccountModificationInstructionV06.mmModifiedCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedServiceLevelAgreement
 * AccountModificationInstructionV06.mmModifiedServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedAdditionalInformation
 * AccountModificationInstructionV06.mmModifiedAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmMarketPracticeVersion
 * AccountModificationInstructionV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmExtension
 * AccountModificationInstructionV06.mmExtension}</li>
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
 * xmlTag} = "AcctModInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementPreviousVersion
 * AccountManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.003.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUnit1Rule#forAccountModificationInstructionV06
 * ConstraintUnit1Rule.forAccountModificationInstructionV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountModificationInstructionV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner, for example, an investor or its designated agent, sends the AccountModificationInstruction message to the account servicer, for example, a registrar, transfer agent, custodian bank or securities depository to modify, that is, create, update or delete specific details of an existing account.\r\nUsage\r\nThe AccountModificationInstruction message is used to modify the details of an existing account.\r\nThe AccountModificationInstruction message has three specific uses:\r\n- to maintain/update any of the existing account details, for example, to update the address of the beneficiary or modify the preference to income from distribution to capitalisation, or,\r\n- to add/create specific details to the existing account when these details were not yet recorded at the time of account creation, for example, to add a second address or to establish new cash settlement standing instructions, or,\r\n- to delete specific account details, for example, delete cash standing instructions.\r\nThis message cannot be used to delete an entire account, as institution specific and regulatory rules pertaining to account deletion are diverse.\r\nThe usage of this message may be subject to service level agreement (SLA) between the counterparties.\r\nExecution of the AccountModificationInstruction is confirmed via an AccountDetailsConfirmation message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07
 * AccountModificationInstructionV07}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05
 * AccountModificationInstructionV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountModificationInstructionV06", propOrder = {"messageIdentification", "previousReference", "instructionDetails", "investmentAccountSelection", "modifiedInvestmentAccount", "modifiedAccountParties",
		"modifiedIntermediaries", "modifiedPlacement", "modifiedIssueAllocation", "modifiedSavingsInvestmentPlan", "modifiedWithdrawalInvestmentPlan", "modifiedCashSettlement", "modifiedServiceLevelAgreement",
		"modifiedAdditionalInformation", "marketPracticeVersion", "extension"})
public class AccountModificationInstructionV06 {

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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmMessageIdentification
	 * AccountModificationInstructionV07.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmMessageIdentification
	 * AccountModificationInstructionV05.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmMessageIdentification);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmPreviousReference
	 * AccountModificationInstructionV07.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmPreviousReference
	 * AccountModificationInstructionV05.mmPreviousReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmPreviousReference);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmPreviousReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "InstrDtls")
	protected InvestmentAccountModification2 instructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification2
	 * InvestmentAccountModification2}</li>
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
	 * definition} = "Information about the modification instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmInstructionDetails
	 * AccountModificationInstructionV07.mmInstructionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmInstructionDetails
	 * AccountModificationInstructionV05.mmInstructionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionDetails";
			definition = "Information about the modification instruction.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmInstructionDetails);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmInstructionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccountModification2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getInstructionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "InvstmtAcctSelctn", required = true)
	protected AccountSelection1Choice investmentAccountSelection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountSelection1Choice
	 * AccountSelection1Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmInvestmentAccountSelection
	 * AccountModificationInstructionV07.mmInvestmentAccountSelection}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmInvestmentAccountSelection
	 * AccountModificationInstructionV05.mmInvestmentAccountSelection}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInvestmentAccountSelection = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvstmtAcctSelctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountSelection";
			definition = "Identifies the account for which the information is modified.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmInvestmentAccountSelection);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmInvestmentAccountSelection;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountSelection1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getInvestmentAccountSelection", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdInvstmtAcct")
	protected InvestmentAccount51 modifiedInvestmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51
	 * InvestmentAccount51}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedInvestmentAccount
	 * AccountModificationInstructionV07.mmModifiedInvestmentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmModifiedInvestmentAccount
	 * AccountModificationInstructionV05.mmModifiedInvestmentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedInvestmentAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdInvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedInvestmentAccount";
			definition = "Information related to general characteristics of the account to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmModifiedInvestmentAccount);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmModifiedInvestmentAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccount51.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getModifiedInvestmentAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdAcctPties")
	protected List<AccountParties14> modifiedAccountParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14
	 * AccountParties14}</li>
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
	 * "Information related to an account party to be inserted, updated or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedAccountParties
	 * AccountModificationInstructionV07.mmModifiedAccountParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmModifiedAccountParties
	 * AccountModificationInstructionV05.mmModifiedAccountParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedAccountParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdAcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedAccountParties";
			definition = "Information related to an account party to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmModifiedAccountParties);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmModifiedAccountParties;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> AccountParties14.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getModifiedAccountParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdIntrmies")
	protected List<ModificationScope26> modifiedIntermediaries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope26
	 * ModificationScope26}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedIntermediaries
	 * AccountModificationInstructionV07.mmModifiedIntermediaries}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmModifiedIntermediaries
	 * AccountModificationInstructionV05.mmModifiedIntermediaries}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedIntermediaries = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdIntrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedIntermediaries";
			definition = "Information related to intermediaries to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmModifiedIntermediaries);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmModifiedIntermediaries;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope26.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getModifiedIntermediaries", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdPlcmnt")
	protected ModificationScope33 modifiedPlacement;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedPlacement
	 * AccountModificationInstructionV07.mmModifiedPlacement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmModifiedPlacement
	 * AccountModificationInstructionV05.mmModifiedPlacement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedPlacement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdPlcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedPlacement";
			definition = "Information related to referral information to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmModifiedPlacement);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmModifiedPlacement;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope33.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getModifiedPlacement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdIsseAllcn")
	protected ModificationScope21 modifiedIssueAllocation;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedIssueAllocation
	 * AccountModificationInstructionV07.mmModifiedIssueAllocation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmModifiedIssueAllocation
	 * AccountModificationInstructionV05.mmModifiedIssueAllocation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedIssueAllocation = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdIsseAllcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedIssueAllocation";
			definition = "Eligibility conditions related to allocation of new issues to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmModifiedIssueAllocation);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmModifiedIssueAllocation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope21.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getModifiedIssueAllocation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdSvgsInvstmtPlan")
	protected List<ModificationScope28> modifiedSavingsInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope28
	 * ModificationScope28}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedSavingsInvestmentPlan
	 * AccountModificationInstructionV07.mmModifiedSavingsInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmModifiedSavingsInvestmentPlan
	 * AccountModificationInstructionV05.mmModifiedSavingsInvestmentPlan}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedSavingsInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdSvgsInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedSavingsInvestmentPlan";
			definition = "Information related to a savings plan to be either inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmModifiedSavingsInvestmentPlan);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmModifiedSavingsInvestmentPlan;
			maxOccurs = 50;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope28.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getModifiedSavingsInvestmentPlan", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdWdrwlInvstmtPlan")
	protected List<ModificationScope28> modifiedWithdrawalInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope28
	 * ModificationScope28}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedWithdrawalInvestmentPlan
	 * AccountModificationInstructionV07.mmModifiedWithdrawalInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmModifiedWithdrawalInvestmentPlan
	 * AccountModificationInstructionV05.mmModifiedWithdrawalInvestmentPlan}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedWithdrawalInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdWdrwlInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedWithdrawalInvestmentPlan";
			definition = "Information related to a withdrawal plan to be either inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmModifiedWithdrawalInvestmentPlan);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmModifiedWithdrawalInvestmentPlan;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope28.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getModifiedWithdrawalInvestmentPlan", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdCshSttlm")
	protected List<CashSettlement2> modifiedCashSettlement;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedCashSettlement
	 * AccountModificationInstructionV07.mmModifiedCashSettlement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmModifiedCashSettlement
	 * AccountModificationInstructionV05.mmModifiedCashSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedCashSettlement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdCshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedCashSettlement";
			definition = "Cash settlement standing instruction to be either inserted or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmModifiedCashSettlement);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmModifiedCashSettlement;
			maxOccurs = 8;
			minOccurs = 0;
			complexType_lazy = () -> CashSettlement2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getModifiedCashSettlement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdSvcLvlAgrmt")
	protected List<ModificationScope31> modifiedServiceLevelAgreement;
	/**
	 * 
	 <p>
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
	 * "Information related to documents to be added, deleted or updated.\n."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedServiceLevelAgreement
	 * AccountModificationInstructionV07.mmModifiedServiceLevelAgreement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmModifiedServiceLevelAgreement
	 * AccountModificationInstructionV05.mmModifiedServiceLevelAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedServiceLevelAgreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdSvcLvlAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedServiceLevelAgreement";
			definition = "Information related to documents to be added, deleted or updated.\n.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmModifiedServiceLevelAgreement);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmModifiedServiceLevelAgreement;
			maxOccurs = 30;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope31.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getModifiedServiceLevelAgreement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdAddtlInf")
	protected List<ModificationScope30> modifiedAdditionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope30
	 * ModificationScope30}</li>
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
	 * "Additional information concerning limitations and restrictions on the account to be inserted, updated or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedAdditionalInformation
	 * AccountModificationInstructionV07.mmModifiedAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedAdditionalInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedAdditionalInformation";
			definition = "Additional information concerning limitations and restrictions on the account to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmModifiedAdditionalInformation);
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope30.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getModifiedAdditionalInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmMarketPracticeVersion
	 * AccountModificationInstructionV07.mmMarketPracticeVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmMarketPracticeVersion
	 * AccountModificationInstructionV05.mmMarketPracticeVersion}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarketPracticeVersion = new MMMessageBuildingBlock() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmMarketPracticeVersion);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmMarketPracticeVersion;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getMarketPracticeVersion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmExtension
	 * AccountModificationInstructionV07.mmExtension}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmExtension
	 * AccountModificationInstructionV05.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmExtension);
			previousVersion_lazy = () -> AccountModificationInstructionV05.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV06.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUnit1Rule.forAccountModificationInstructionV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountModificationInstructionV06";
				definition = "Scope\r\nAn account owner, for example, an investor or its designated agent, sends the AccountModificationInstruction message to the account servicer, for example, a registrar, transfer agent, custodian bank or securities depository to modify, that is, create, update or delete specific details of an existing account.\r\nUsage\r\nThe AccountModificationInstruction message is used to modify the details of an existing account.\r\nThe AccountModificationInstruction message has three specific uses:\r\n- to maintain/update any of the existing account details, for example, to update the address of the beneficiary or modify the preference to income from distribution to capitalisation, or,\r\n- to add/create specific details to the existing account when these details were not yet recorded at the time of account creation, for example, to add a second address or to establish new cash settlement standing instructions, or,\r\n- to delete specific account details, for example, delete cash standing instructions.\r\nThis message cannot be used to delete an entire account, as institution specific and regulatory rules pertaining to account deletion are diverse.\r\nThe usage of this message may be subject to service level agreement (SLA) between the counterparties.\r\nExecution of the AccountModificationInstruction is confirmed via an AccountDetailsConfirmation message.";
				nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmObject());
				previousVersion_lazy = () -> AccountModificationInstructionV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "AcctModInstr";
				businessArea_lazy = () -> AccountManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmMessageIdentification,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmPreviousReference, com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmInstructionDetails,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmInvestmentAccountSelection, com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmModifiedInvestmentAccount,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmModifiedAccountParties, com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmModifiedIntermediaries,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmModifiedPlacement, com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmModifiedIssueAllocation,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmModifiedSavingsInvestmentPlan, com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmModifiedWithdrawalInvestmentPlan,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmModifiedCashSettlement, com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmModifiedServiceLevelAgreement,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmModifiedAdditionalInformation, com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmMarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "003";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountModificationInstructionV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountModificationInstructionV06 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference6> getPreviousReference() {
		return previousReference == null ? Optional.empty() : Optional.of(previousReference);
	}

	public AccountModificationInstructionV06 setPreviousReference(AdditionalReference6 previousReference) {
		this.previousReference = previousReference;
		return this;
	}

	public Optional<InvestmentAccountModification2> getInstructionDetails() {
		return instructionDetails == null ? Optional.empty() : Optional.of(instructionDetails);
	}

	public AccountModificationInstructionV06 setInstructionDetails(InvestmentAccountModification2 instructionDetails) {
		this.instructionDetails = instructionDetails;
		return this;
	}

	public AccountSelection1Choice getInvestmentAccountSelection() {
		return investmentAccountSelection;
	}

	public AccountModificationInstructionV06 setInvestmentAccountSelection(AccountSelection1Choice investmentAccountSelection) {
		this.investmentAccountSelection = Objects.requireNonNull(investmentAccountSelection);
		return this;
	}

	public Optional<InvestmentAccount51> getModifiedInvestmentAccount() {
		return modifiedInvestmentAccount == null ? Optional.empty() : Optional.of(modifiedInvestmentAccount);
	}

	public AccountModificationInstructionV06 setModifiedInvestmentAccount(InvestmentAccount51 modifiedInvestmentAccount) {
		this.modifiedInvestmentAccount = modifiedInvestmentAccount;
		return this;
	}

	public List<AccountParties14> getModifiedAccountParties() {
		return modifiedAccountParties == null ? modifiedAccountParties = new ArrayList<>() : modifiedAccountParties;
	}

	public AccountModificationInstructionV06 setModifiedAccountParties(List<AccountParties14> modifiedAccountParties) {
		this.modifiedAccountParties = Objects.requireNonNull(modifiedAccountParties);
		return this;
	}

	public List<ModificationScope26> getModifiedIntermediaries() {
		return modifiedIntermediaries == null ? modifiedIntermediaries = new ArrayList<>() : modifiedIntermediaries;
	}

	public AccountModificationInstructionV06 setModifiedIntermediaries(List<ModificationScope26> modifiedIntermediaries) {
		this.modifiedIntermediaries = Objects.requireNonNull(modifiedIntermediaries);
		return this;
	}

	public Optional<ModificationScope33> getModifiedPlacement() {
		return modifiedPlacement == null ? Optional.empty() : Optional.of(modifiedPlacement);
	}

	public AccountModificationInstructionV06 setModifiedPlacement(ModificationScope33 modifiedPlacement) {
		this.modifiedPlacement = modifiedPlacement;
		return this;
	}

	public Optional<ModificationScope21> getModifiedIssueAllocation() {
		return modifiedIssueAllocation == null ? Optional.empty() : Optional.of(modifiedIssueAllocation);
	}

	public AccountModificationInstructionV06 setModifiedIssueAllocation(ModificationScope21 modifiedIssueAllocation) {
		this.modifiedIssueAllocation = modifiedIssueAllocation;
		return this;
	}

	public List<ModificationScope28> getModifiedSavingsInvestmentPlan() {
		return modifiedSavingsInvestmentPlan == null ? modifiedSavingsInvestmentPlan = new ArrayList<>() : modifiedSavingsInvestmentPlan;
	}

	public AccountModificationInstructionV06 setModifiedSavingsInvestmentPlan(List<ModificationScope28> modifiedSavingsInvestmentPlan) {
		this.modifiedSavingsInvestmentPlan = Objects.requireNonNull(modifiedSavingsInvestmentPlan);
		return this;
	}

	public List<ModificationScope28> getModifiedWithdrawalInvestmentPlan() {
		return modifiedWithdrawalInvestmentPlan == null ? modifiedWithdrawalInvestmentPlan = new ArrayList<>() : modifiedWithdrawalInvestmentPlan;
	}

	public AccountModificationInstructionV06 setModifiedWithdrawalInvestmentPlan(List<ModificationScope28> modifiedWithdrawalInvestmentPlan) {
		this.modifiedWithdrawalInvestmentPlan = Objects.requireNonNull(modifiedWithdrawalInvestmentPlan);
		return this;
	}

	public List<CashSettlement2> getModifiedCashSettlement() {
		return modifiedCashSettlement == null ? modifiedCashSettlement = new ArrayList<>() : modifiedCashSettlement;
	}

	public AccountModificationInstructionV06 setModifiedCashSettlement(List<CashSettlement2> modifiedCashSettlement) {
		this.modifiedCashSettlement = Objects.requireNonNull(modifiedCashSettlement);
		return this;
	}

	public List<ModificationScope31> getModifiedServiceLevelAgreement() {
		return modifiedServiceLevelAgreement == null ? modifiedServiceLevelAgreement = new ArrayList<>() : modifiedServiceLevelAgreement;
	}

	public AccountModificationInstructionV06 setModifiedServiceLevelAgreement(List<ModificationScope31> modifiedServiceLevelAgreement) {
		this.modifiedServiceLevelAgreement = Objects.requireNonNull(modifiedServiceLevelAgreement);
		return this;
	}

	public List<ModificationScope30> getModifiedAdditionalInformation() {
		return modifiedAdditionalInformation == null ? modifiedAdditionalInformation = new ArrayList<>() : modifiedAdditionalInformation;
	}

	public AccountModificationInstructionV06 setModifiedAdditionalInformation(List<ModificationScope30> modifiedAdditionalInformation) {
		this.modifiedAdditionalInformation = Objects.requireNonNull(modifiedAdditionalInformation);
		return this;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return marketPracticeVersion == null ? Optional.empty() : Optional.of(marketPracticeVersion);
	}

	public AccountModificationInstructionV06 setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public AccountModificationInstructionV06 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.003.001.06")
	static public class Document {
		@XmlElement(name = "AcctModInstr", required = true)
		public AccountModificationInstructionV06 messageBody;
	}
}