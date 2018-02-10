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
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account owner, for example, an investor or its designated agent, sends the
 * AccountModificationInstruction message to the account servicer, for example,
 * a registrar, transfer agent or custodian bank to modify, that is, create,
 * update or delete specific details of an existing investment fund account.<br>
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
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmMessageIdentification
 * AccountModificationInstructionV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmPreviousReference
 * AccountModificationInstructionV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmInstructionDetails
 * AccountModificationInstructionV03.mmInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmInvestmentAccountSelection
 * AccountModificationInstructionV03.mmInvestmentAccountSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedInvestmentAccount
 * AccountModificationInstructionV03.mmModifiedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedAccountParties
 * AccountModificationInstructionV03.mmModifiedAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedIntermediaries
 * AccountModificationInstructionV03.mmModifiedIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedPlacement
 * AccountModificationInstructionV03.mmModifiedPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedIssueAllocation
 * AccountModificationInstructionV03.mmModifiedIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedSavingsInvestmentPlan
 * AccountModificationInstructionV03.mmModifiedSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedWithdrawalInvestmentPlan
 * AccountModificationInstructionV03.mmModifiedWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedCashSettlement
 * AccountModificationInstructionV03.mmModifiedCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedServiceLevelAgreement
 * AccountModificationInstructionV03.mmModifiedServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmExtension
 * AccountModificationInstructionV03.mmExtension}</li>
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
 * xmlTag} = "AcctModInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementArchive
 * AccountManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.003.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUnitRule#forAccountModificationInstructionV03
 * ConstraintUnitRule.forAccountModificationInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule1#forAccountModificationInstructionV03
 * ConstraintDividendPercentageRule1.forAccountModificationInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule2#forAccountModificationInstructionV03
 * ConstraintDividendPercentageRule2.forAccountModificationInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule3#forAccountModificationInstructionV03
 * ConstraintDividendPercentageRule3.forAccountModificationInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule4#forAccountModificationInstructionV03
 * ConstraintDividendPercentageRule4.forAccountModificationInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule5#forAccountModificationInstructionV03
 * ConstraintDividendPercentageRule5.forAccountModificationInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule6#forAccountModificationInstructionV03
 * ConstraintDividendPercentageRule6.forAccountModificationInstructionV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountModificationInstructionV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner, for example, an investor or its designated agent, sends the AccountModificationInstruction message to the account servicer, for example, a registrar, transfer agent or custodian bank to modify, that is, create, update or delete specific details of an existing investment fund account.\r\nUsage\r\nThe AccountModificationInstruction message is used to modify the details of an existing account.\r\nThe AccountModificationInstruction message has three specific uses:\r\n- to maintain/update any of the existing account details, for example, to update the address of the beneficiary or modify the preference to income from distribution to capitalisation, or,\r\n- to add/create specific details to the existing account when these details were not yet recorded at the time of account creation, for example, to add a second address or to establish new cash settlement standing instructions, or,\r\n- to delete specific account details, for example, delete cash standing instructions.\r\nThis message cannot be used to delete an entire account, as institution specific and regulatory rules pertaining to account deletion are diverse.\r\nThe usage of this message may be subject to service level agreement (SLA) between the counterparties.\r\nExecution of the AccountModificationInstruction is confirmed via an AccountDetailsConfirmation message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04
 * AccountModificationInstructionV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02
 * AccountModificationInstructionV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountModificationInstructionV03", propOrder = {"messageIdentification", "previousReference", "instructionDetails", "investmentAccountSelection", "modifiedInvestmentAccount", "modifiedAccountParties",
		"modifiedIntermediaries", "modifiedPlacement", "modifiedIssueAllocation", "modifiedSavingsInvestmentPlan", "modifiedWithdrawalInvestmentPlan", "modifiedCashSettlement", "modifiedServiceLevelAgreement", "extension"})
public class AccountModificationInstructionV03 {

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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmMessageIdentification
	 * AccountModificationInstructionV04.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the message.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV03.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmPreviousReference
	 * AccountModificationInstructionV04.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmPreviousReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV03.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "InstrDtls")
	protected InvestmentAccountModificationDetails instructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModificationDetails
	 * InvestmentAccountModificationDetails}</li>
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
	 * "Provide detailed information about the application modification instruction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmInstructionDetails
	 * AccountModificationInstructionV04.mmInstructionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionDetails";
			definition = "Provide detailed information about the application modification instruction.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmInstructionDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccountModificationDetails.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV03.class.getMethod("getInstructionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "InvstmtAcctSelctn", required = true)
	protected InvestmentAccountSelection2 investmentAccountSelection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2
	 * InvestmentAccountSelection2}</li>
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
	 * "Investment account selection information used to identify the account for which the information is modified."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmInvestmentAccountSelection
	 * AccountModificationInstructionV04.mmInvestmentAccountSelection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInvestmentAccountSelection = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvstmtAcctSelctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountSelection";
			definition = "Investment account selection information used to identify the account for which the information is modified.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmInvestmentAccountSelection);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestmentAccountSelection2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV03.class.getMethod("getInvestmentAccountSelection", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdInvstmtAcct")
	protected InvestmentAccount36 modifiedInvestmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36
	 * InvestmentAccount36}</li>
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
	 * "Information related to general characteristics of an investment account to be inserted, updated or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedInvestmentAccount
	 * AccountModificationInstructionV04.mmModifiedInvestmentAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedInvestmentAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdInvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedInvestmentAccount";
			definition = "Information related to general characteristics of an investment account to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmModifiedInvestmentAccount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccount36.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV03.class.getMethod("getModifiedInvestmentAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdAcctPties")
	protected List<AccountParties7> modifiedAccountParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
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
	 * "Information related to the account related parties (eg. account owner) to be inserted, updated or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedAccountParties
	 * AccountModificationInstructionV04.mmModifiedAccountParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedAccountParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdAcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedAccountParties";
			definition = "Information related to the account related parties (eg. account owner) to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmModifiedAccountParties);
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> AccountParties7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV03.class.getMethod("getModifiedAccountParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdIntrmies")
	protected List<ModificationScope7> modifiedIntermediaries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope7
	 * ModificationScope7}</li>
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedIntermediaries
	 * AccountModificationInstructionV04.mmModifiedIntermediaries}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedIntermediaries = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdIntrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedIntermediaries";
			definition = "Information related to intermediaries to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmModifiedIntermediaries);
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV03.class.getMethod("getModifiedIntermediaries", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdPlcmnt")
	protected ReferredAgent1 modifiedPlacement;
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
	 * "Information related to referred placement agent in the hedge fund industry to be inserted, updated or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedPlacement
	 * AccountModificationInstructionV04.mmModifiedPlacement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedPlacement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdPlcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedPlacement";
			definition = "Information related to referred placement agent in the hedge fund industry to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmModifiedPlacement);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ReferredAgent1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV03.class.getMethod("getModifiedPlacement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdIsseAllcn")
	protected ModificationScope9 modifiedIssueAllocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope9
	 * ModificationScope9}</li>
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
	 * "Eligibility conditions information related to new issues allocation to be inserted, updated or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedIssueAllocation
	 * AccountModificationInstructionV04.mmModifiedIssueAllocation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedIssueAllocation = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdIsseAllcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedIssueAllocation";
			definition = "Eligibility conditions information related to new issues allocation to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmModifiedIssueAllocation);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope9.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV03.class.getMethod("getModifiedIssueAllocation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdSvgsInvstmtPlan")
	protected List<ModificationScope16> modifiedSavingsInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope16
	 * ModificationScope16}</li>
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedSavingsInvestmentPlan
	 * AccountModificationInstructionV04.mmModifiedSavingsInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedSavingsInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdSvgsInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedSavingsInvestmentPlan";
			definition = "Information related to a savings plan to be either inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmModifiedSavingsInvestmentPlan);
			maxOccurs = 50;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope16.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV03.class.getMethod("getModifiedSavingsInvestmentPlan", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdWdrwlInvstmtPlan")
	protected List<ModificationScope16> modifiedWithdrawalInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope16
	 * ModificationScope16}</li>
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedWithdrawalInvestmentPlan
	 * AccountModificationInstructionV04.mmModifiedWithdrawalInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedWithdrawalInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdWdrwlInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedWithdrawalInvestmentPlan";
			definition = "Information related to a withdrawal plan to be either inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmModifiedWithdrawalInvestmentPlan);
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope16.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV03.class.getMethod("getModifiedWithdrawalInvestmentPlan", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdCshSttlm")
	protected List<InvestmentFundCashSettlementInformation6> modifiedCashSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6
	 * InvestmentFundCashSettlementInformation6}</li>
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
	 * "Cash settlement standing instruction associated to the investment fund transaction and to be either inserted or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedCashSettlement
	 * AccountModificationInstructionV04.mmModifiedCashSettlement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedCashSettlement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdCshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedCashSettlement";
			definition = "Cash settlement standing instruction associated to the investment fund transaction and to be either inserted or deleted.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmModifiedCashSettlement);
			maxOccurs = 8;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundCashSettlementInformation6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV03.class.getMethod("getModifiedCashSettlement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdSvcLvlAgrmt")
	protected List<ModificationScope10> modifiedServiceLevelAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope10
	 * ModificationScope10}</li>
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedServiceLevelAgreement
	 * AccountModificationInstructionV04.mmModifiedServiceLevelAgreement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedServiceLevelAgreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdSvcLvlAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedServiceLevelAgreement";
			definition = "Information related to documents to be added, deleted or updated.\n.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmModifiedServiceLevelAgreement);
			maxOccurs = 30;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV03.class.getMethod("getModifiedServiceLevelAgreement", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmExtension
	 * AccountModificationInstructionV04.mmExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmExtension);
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV03.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUnitRule.forAccountModificationInstructionV03,
						com.tools20022.repository.constraints.ConstraintDividendPercentageRule1.forAccountModificationInstructionV03,
						com.tools20022.repository.constraints.ConstraintDividendPercentageRule2.forAccountModificationInstructionV03,
						com.tools20022.repository.constraints.ConstraintDividendPercentageRule3.forAccountModificationInstructionV03,
						com.tools20022.repository.constraints.ConstraintDividendPercentageRule4.forAccountModificationInstructionV03,
						com.tools20022.repository.constraints.ConstraintDividendPercentageRule5.forAccountModificationInstructionV03,
						com.tools20022.repository.constraints.ConstraintDividendPercentageRule6.forAccountModificationInstructionV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountModificationInstructionV03";
				definition = "Scope\r\nAn account owner, for example, an investor or its designated agent, sends the AccountModificationInstruction message to the account servicer, for example, a registrar, transfer agent or custodian bank to modify, that is, create, update or delete specific details of an existing investment fund account.\r\nUsage\r\nThe AccountModificationInstruction message is used to modify the details of an existing account.\r\nThe AccountModificationInstruction message has three specific uses:\r\n- to maintain/update any of the existing account details, for example, to update the address of the beneficiary or modify the preference to income from distribution to capitalisation, or,\r\n- to add/create specific details to the existing account when these details were not yet recorded at the time of account creation, for example, to add a second address or to establish new cash settlement standing instructions, or,\r\n- to delete specific account details, for example, delete cash standing instructions.\r\nThis message cannot be used to delete an entire account, as institution specific and regulatory rules pertaining to account deletion are diverse.\r\nThe usage of this message may be subject to service level agreement (SLA) between the counterparties.\r\nExecution of the AccountModificationInstruction is confirmed via an AccountDetailsConfirmation message.";
				nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmObject());
				previousVersion_lazy = () -> AccountModificationInstructionV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AcctModInstr";
				businessArea_lazy = () -> AccountManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmMessageIdentification,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmPreviousReference, com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmInstructionDetails,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmInvestmentAccountSelection, com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedInvestmentAccount,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedAccountParties, com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedIntermediaries,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedPlacement, com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedIssueAllocation,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedSavingsInvestmentPlan, com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedWithdrawalInvestmentPlan,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedCashSettlement, com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedServiceLevelAgreement,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "003";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountModificationInstructionV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountModificationInstructionV03 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? Optional.empty() : Optional.of(previousReference);
	}

	public AccountModificationInstructionV03 setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
		return this;
	}

	public Optional<InvestmentAccountModificationDetails> getInstructionDetails() {
		return instructionDetails == null ? Optional.empty() : Optional.of(instructionDetails);
	}

	public AccountModificationInstructionV03 setInstructionDetails(InvestmentAccountModificationDetails instructionDetails) {
		this.instructionDetails = instructionDetails;
		return this;
	}

	public InvestmentAccountSelection2 getInvestmentAccountSelection() {
		return investmentAccountSelection;
	}

	public AccountModificationInstructionV03 setInvestmentAccountSelection(InvestmentAccountSelection2 investmentAccountSelection) {
		this.investmentAccountSelection = Objects.requireNonNull(investmentAccountSelection);
		return this;
	}

	public Optional<InvestmentAccount36> getModifiedInvestmentAccount() {
		return modifiedInvestmentAccount == null ? Optional.empty() : Optional.of(modifiedInvestmentAccount);
	}

	public AccountModificationInstructionV03 setModifiedInvestmentAccount(InvestmentAccount36 modifiedInvestmentAccount) {
		this.modifiedInvestmentAccount = modifiedInvestmentAccount;
		return this;
	}

	public List<AccountParties7> getModifiedAccountParties() {
		return modifiedAccountParties == null ? modifiedAccountParties = new ArrayList<>() : modifiedAccountParties;
	}

	public AccountModificationInstructionV03 setModifiedAccountParties(List<AccountParties7> modifiedAccountParties) {
		this.modifiedAccountParties = Objects.requireNonNull(modifiedAccountParties);
		return this;
	}

	public List<ModificationScope7> getModifiedIntermediaries() {
		return modifiedIntermediaries == null ? modifiedIntermediaries = new ArrayList<>() : modifiedIntermediaries;
	}

	public AccountModificationInstructionV03 setModifiedIntermediaries(List<ModificationScope7> modifiedIntermediaries) {
		this.modifiedIntermediaries = Objects.requireNonNull(modifiedIntermediaries);
		return this;
	}

	public Optional<ReferredAgent1> getModifiedPlacement() {
		return modifiedPlacement == null ? Optional.empty() : Optional.of(modifiedPlacement);
	}

	public AccountModificationInstructionV03 setModifiedPlacement(ReferredAgent1 modifiedPlacement) {
		this.modifiedPlacement = modifiedPlacement;
		return this;
	}

	public Optional<ModificationScope9> getModifiedIssueAllocation() {
		return modifiedIssueAllocation == null ? Optional.empty() : Optional.of(modifiedIssueAllocation);
	}

	public AccountModificationInstructionV03 setModifiedIssueAllocation(ModificationScope9 modifiedIssueAllocation) {
		this.modifiedIssueAllocation = modifiedIssueAllocation;
		return this;
	}

	public List<ModificationScope16> getModifiedSavingsInvestmentPlan() {
		return modifiedSavingsInvestmentPlan == null ? modifiedSavingsInvestmentPlan = new ArrayList<>() : modifiedSavingsInvestmentPlan;
	}

	public AccountModificationInstructionV03 setModifiedSavingsInvestmentPlan(List<ModificationScope16> modifiedSavingsInvestmentPlan) {
		this.modifiedSavingsInvestmentPlan = Objects.requireNonNull(modifiedSavingsInvestmentPlan);
		return this;
	}

	public List<ModificationScope16> getModifiedWithdrawalInvestmentPlan() {
		return modifiedWithdrawalInvestmentPlan == null ? modifiedWithdrawalInvestmentPlan = new ArrayList<>() : modifiedWithdrawalInvestmentPlan;
	}

	public AccountModificationInstructionV03 setModifiedWithdrawalInvestmentPlan(List<ModificationScope16> modifiedWithdrawalInvestmentPlan) {
		this.modifiedWithdrawalInvestmentPlan = Objects.requireNonNull(modifiedWithdrawalInvestmentPlan);
		return this;
	}

	public List<InvestmentFundCashSettlementInformation6> getModifiedCashSettlement() {
		return modifiedCashSettlement == null ? modifiedCashSettlement = new ArrayList<>() : modifiedCashSettlement;
	}

	public AccountModificationInstructionV03 setModifiedCashSettlement(List<InvestmentFundCashSettlementInformation6> modifiedCashSettlement) {
		this.modifiedCashSettlement = Objects.requireNonNull(modifiedCashSettlement);
		return this;
	}

	public List<ModificationScope10> getModifiedServiceLevelAgreement() {
		return modifiedServiceLevelAgreement == null ? modifiedServiceLevelAgreement = new ArrayList<>() : modifiedServiceLevelAgreement;
	}

	public AccountModificationInstructionV03 setModifiedServiceLevelAgreement(List<ModificationScope10> modifiedServiceLevelAgreement) {
		this.modifiedServiceLevelAgreement = Objects.requireNonNull(modifiedServiceLevelAgreement);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public AccountModificationInstructionV03 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.003.001.03")
	static public class Document {
		@XmlElement(name = "AcctModInstr", required = true)
		public AccountModificationInstructionV03 messageBody;
	}
}