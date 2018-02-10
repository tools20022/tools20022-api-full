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
 * An account owner, eg, and investor or its designated agent, sends the
 * AccountModificationInstruction message to an account servicer, eg, a
 * registrar, transfer agent or custodian bank to modify, ie, create, update or
 * delete specific details of an existing investment fund account.<br>
 * <b>Usage</b><br>
 * The AccountModificationInstruction message is used to modify the details of
 * an existing account.<br>
 * The AccountModificationInstruction message has three specific uses:<br>
 * - to maintain/update any of the existing account details, eg, to update the
 * address of the beneficiary or modify the preference to income from
 * distribution to capitalisation, or,<br>
 * - to add/create specific details to the existing account when these details
 * were not yet recorded at the time of account creation, eg, to add a second
 * address or to establish new cash settlement standing instructions, or,<br>
 * - to delete specific account details, eg, delete cash standing instructions.<br>
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
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmMessageIdentification
 * AccountModificationInstructionV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmPreviousReference
 * AccountModificationInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmInstructionDetails
 * AccountModificationInstructionV02.mmInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmInvestmentAccountSelection
 * AccountModificationInstructionV02.mmInvestmentAccountSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmModifiedInvestmentAccount
 * AccountModificationInstructionV02.mmModifiedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmModifiedAccountParties
 * AccountModificationInstructionV02.mmModifiedAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmModifiedIntermediaries
 * AccountModificationInstructionV02.mmModifiedIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmModifiedPlacement
 * AccountModificationInstructionV02.mmModifiedPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmModifiedIssueAllocation
 * AccountModificationInstructionV02.mmModifiedIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmModifiedSavingsInvestmentPlan
 * AccountModificationInstructionV02.mmModifiedSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmModifiedWithdrawalInvestmentPlan
 * AccountModificationInstructionV02.mmModifiedWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmModifiedCashSettlement
 * AccountModificationInstructionV02.mmModifiedCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmModifiedServiceLevelAgreement
 * AccountModificationInstructionV02.mmModifiedServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmExtension
 * AccountModificationInstructionV02.mmExtension}</li>
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
 * xmlTag} = "AcctModInstrV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementArchive
 * AccountManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.003.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountModificationInstructionV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner, eg, and investor or its designated agent, sends the AccountModificationInstruction message to an account servicer, eg, a registrar, transfer agent or custodian bank to modify, ie, create, update or delete specific details of an existing investment fund account.\r\nUsage\r\nThe AccountModificationInstruction message is used to modify the details of an existing account.\r\nThe AccountModificationInstruction message has three specific uses:\r\n- to maintain/update any of the existing account details, eg, to update the address of the beneficiary or modify the preference to income from distribution to capitalisation, or,\r\n- to add/create specific details to the existing account when these details were not yet recorded at the time of account creation, eg, to add a second address or to establish new cash settlement standing instructions, or,\r\n- to delete specific account details, eg, delete cash standing instructions.\r\nThis message cannot be used to delete an entire account, as institution specific and regulatory rules pertaining to account deletion are diverse.\r\nThe usage of this message may be subject to service level agreement (SLA) between the counterparties.\r\nExecution of the AccountModificationInstruction is confirmed via an AccountDetailsConfirmation message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03
 * AccountModificationInstructionV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountModificationInstructionV02", propOrder = {"messageIdentification", "previousReference", "instructionDetails", "investmentAccountSelection", "modifiedInvestmentAccount", "modifiedAccountParties",
		"modifiedIntermediaries", "modifiedPlacement", "modifiedIssueAllocation", "modifiedSavingsInvestmentPlan", "modifiedWithdrawalInvestmentPlan", "modifiedCashSettlement", "modifiedServiceLevelAgreement", "extension"})
public class AccountModificationInstructionV02 {

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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV02.class.getMethod("getMessageIdentification", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV02.class.getMethod("getPreviousReference", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionDetails";
			definition = "Provide detailed information about the application modification instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccountModificationDetails.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV02.class.getMethod("getInstructionDetails", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInvestmentAccountSelection = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvstmtAcctSelctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountSelection";
			definition = "Investment account selection information used to identify the account for which the information is modified.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestmentAccountSelection2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV02.class.getMethod("getInvestmentAccountSelection", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdInvstmtAcct")
	protected InvestmentAccount28 modifiedInvestmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28
	 * InvestmentAccount28}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedInvestmentAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdInvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedInvestmentAccount";
			definition = "Information related to general characteristics of an investment account to be inserted, updated or deleted.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccount28.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV02.class.getMethod("getModifiedInvestmentAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdAcctPties")
	protected List<AccountParties4> modifiedAccountParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedAccountParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdAcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedAccountParties";
			definition = "Information related to the account related parties (eg. account owner) to be inserted, updated or deleted.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> AccountParties4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV02.class.getMethod("getModifiedAccountParties", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedIntermediaries = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdIntrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedIntermediaries";
			definition = "Information related to intermediaries to be inserted, updated or deleted.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV02.class.getMethod("getModifiedIntermediaries", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedPlacement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdPlcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedPlacement";
			definition = "Information related to referred placement agent in the hedge fund industry to be inserted, updated or deleted.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ReferredAgent1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV02.class.getMethod("getModifiedPlacement", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedIssueAllocation = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdIsseAllcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedIssueAllocation";
			definition = "Eligibility conditions information related to new issues allocation to be inserted, updated or deleted.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope9.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV02.class.getMethod("getModifiedIssueAllocation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdSvgsInvstmtPlan")
	protected List<ModificationScope8> modifiedSavingsInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope8
	 * ModificationScope8}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedSavingsInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdSvgsInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedSavingsInvestmentPlan";
			definition = "Information related to a savings plan to be either inserted, updated or deleted.";
			maxOccurs = 50;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV02.class.getMethod("getModifiedSavingsInvestmentPlan", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdWdrwlInvstmtPlan")
	protected List<ModificationScope8> modifiedWithdrawalInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope8
	 * ModificationScope8}</li>
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
	 * "Information related to a withrawal plan to be either inserted, updated or deleted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedWithdrawalInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdWdrwlInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedWithdrawalInvestmentPlan";
			definition = "Information related to a withrawal plan to be either inserted, updated or deleted.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV02.class.getMethod("getModifiedWithdrawalInvestmentPlan", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ModfdCshSttlm")
	protected List<InvestmentFundCashSettlementInformation4> modifiedCashSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation4
	 * InvestmentFundCashSettlementInformation4}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedCashSettlement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdCshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedCashSettlement";
			definition = "Cash settlement standing instruction associated to the investment fund transaction and to be either inserted or deleted.";
			maxOccurs = 8;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundCashSettlementInformation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV02.class.getMethod("getModifiedCashSettlement", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedServiceLevelAgreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdSvcLvlAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedServiceLevelAgreement";
			definition = "Information related to documents to be added, deleted or updated.\n.";
			maxOccurs = 30;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV02.class.getMethod("getModifiedServiceLevelAgreement", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountModificationInstructionV02.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountModificationInstructionV02";
				definition = "Scope\r\nAn account owner, eg, and investor or its designated agent, sends the AccountModificationInstruction message to an account servicer, eg, a registrar, transfer agent or custodian bank to modify, ie, create, update or delete specific details of an existing investment fund account.\r\nUsage\r\nThe AccountModificationInstruction message is used to modify the details of an existing account.\r\nThe AccountModificationInstruction message has three specific uses:\r\n- to maintain/update any of the existing account details, eg, to update the address of the beneficiary or modify the preference to income from distribution to capitalisation, or,\r\n- to add/create specific details to the existing account when these details were not yet recorded at the time of account creation, eg, to add a second address or to establish new cash settlement standing instructions, or,\r\n- to delete specific account details, eg, delete cash standing instructions.\r\nThis message cannot be used to delete an entire account, as institution specific and regulatory rules pertaining to account deletion are diverse.\r\nThe usage of this message may be subject to service level agreement (SLA) between the counterparties.\r\nExecution of the AccountModificationInstruction is confirmed via an AccountDetailsConfirmation message.";
				nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AcctModInstrV02";
				businessArea_lazy = () -> AccountManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmMessageIdentification,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmPreviousReference, com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmInstructionDetails,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmInvestmentAccountSelection, com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmModifiedInvestmentAccount,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmModifiedAccountParties, com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmModifiedIntermediaries,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmModifiedPlacement, com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmModifiedIssueAllocation,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmModifiedSavingsInvestmentPlan, com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmModifiedWithdrawalInvestmentPlan,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmModifiedCashSettlement, com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmModifiedServiceLevelAgreement,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "003";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountModificationInstructionV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountModificationInstructionV02 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? Optional.empty() : Optional.of(previousReference);
	}

	public AccountModificationInstructionV02 setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
		return this;
	}

	public Optional<InvestmentAccountModificationDetails> getInstructionDetails() {
		return instructionDetails == null ? Optional.empty() : Optional.of(instructionDetails);
	}

	public AccountModificationInstructionV02 setInstructionDetails(InvestmentAccountModificationDetails instructionDetails) {
		this.instructionDetails = instructionDetails;
		return this;
	}

	public InvestmentAccountSelection2 getInvestmentAccountSelection() {
		return investmentAccountSelection;
	}

	public AccountModificationInstructionV02 setInvestmentAccountSelection(InvestmentAccountSelection2 investmentAccountSelection) {
		this.investmentAccountSelection = Objects.requireNonNull(investmentAccountSelection);
		return this;
	}

	public Optional<InvestmentAccount28> getModifiedInvestmentAccount() {
		return modifiedInvestmentAccount == null ? Optional.empty() : Optional.of(modifiedInvestmentAccount);
	}

	public AccountModificationInstructionV02 setModifiedInvestmentAccount(InvestmentAccount28 modifiedInvestmentAccount) {
		this.modifiedInvestmentAccount = modifiedInvestmentAccount;
		return this;
	}

	public List<AccountParties4> getModifiedAccountParties() {
		return modifiedAccountParties == null ? modifiedAccountParties = new ArrayList<>() : modifiedAccountParties;
	}

	public AccountModificationInstructionV02 setModifiedAccountParties(List<AccountParties4> modifiedAccountParties) {
		this.modifiedAccountParties = Objects.requireNonNull(modifiedAccountParties);
		return this;
	}

	public List<ModificationScope7> getModifiedIntermediaries() {
		return modifiedIntermediaries == null ? modifiedIntermediaries = new ArrayList<>() : modifiedIntermediaries;
	}

	public AccountModificationInstructionV02 setModifiedIntermediaries(List<ModificationScope7> modifiedIntermediaries) {
		this.modifiedIntermediaries = Objects.requireNonNull(modifiedIntermediaries);
		return this;
	}

	public Optional<ReferredAgent1> getModifiedPlacement() {
		return modifiedPlacement == null ? Optional.empty() : Optional.of(modifiedPlacement);
	}

	public AccountModificationInstructionV02 setModifiedPlacement(ReferredAgent1 modifiedPlacement) {
		this.modifiedPlacement = modifiedPlacement;
		return this;
	}

	public Optional<ModificationScope9> getModifiedIssueAllocation() {
		return modifiedIssueAllocation == null ? Optional.empty() : Optional.of(modifiedIssueAllocation);
	}

	public AccountModificationInstructionV02 setModifiedIssueAllocation(ModificationScope9 modifiedIssueAllocation) {
		this.modifiedIssueAllocation = modifiedIssueAllocation;
		return this;
	}

	public List<ModificationScope8> getModifiedSavingsInvestmentPlan() {
		return modifiedSavingsInvestmentPlan == null ? modifiedSavingsInvestmentPlan = new ArrayList<>() : modifiedSavingsInvestmentPlan;
	}

	public AccountModificationInstructionV02 setModifiedSavingsInvestmentPlan(List<ModificationScope8> modifiedSavingsInvestmentPlan) {
		this.modifiedSavingsInvestmentPlan = Objects.requireNonNull(modifiedSavingsInvestmentPlan);
		return this;
	}

	public List<ModificationScope8> getModifiedWithdrawalInvestmentPlan() {
		return modifiedWithdrawalInvestmentPlan == null ? modifiedWithdrawalInvestmentPlan = new ArrayList<>() : modifiedWithdrawalInvestmentPlan;
	}

	public AccountModificationInstructionV02 setModifiedWithdrawalInvestmentPlan(List<ModificationScope8> modifiedWithdrawalInvestmentPlan) {
		this.modifiedWithdrawalInvestmentPlan = Objects.requireNonNull(modifiedWithdrawalInvestmentPlan);
		return this;
	}

	public List<InvestmentFundCashSettlementInformation4> getModifiedCashSettlement() {
		return modifiedCashSettlement == null ? modifiedCashSettlement = new ArrayList<>() : modifiedCashSettlement;
	}

	public AccountModificationInstructionV02 setModifiedCashSettlement(List<InvestmentFundCashSettlementInformation4> modifiedCashSettlement) {
		this.modifiedCashSettlement = Objects.requireNonNull(modifiedCashSettlement);
		return this;
	}

	public List<ModificationScope10> getModifiedServiceLevelAgreement() {
		return modifiedServiceLevelAgreement == null ? modifiedServiceLevelAgreement = new ArrayList<>() : modifiedServiceLevelAgreement;
	}

	public AccountModificationInstructionV02 setModifiedServiceLevelAgreement(List<ModificationScope10> modifiedServiceLevelAgreement) {
		this.modifiedServiceLevelAgreement = Objects.requireNonNull(modifiedServiceLevelAgreement);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public AccountModificationInstructionV02 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.003.001.02")
	static public class Document {
		@XmlElement(name = "AcctModInstrV02", required = true)
		public AccountModificationInstructionV02 messageBody;
	}
}