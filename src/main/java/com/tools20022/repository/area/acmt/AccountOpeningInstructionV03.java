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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.001.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementArchive
 * AccountManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctOpngInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmMessageIdentification
 * AccountOpeningInstructionV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmOrderReference
 * AccountOpeningInstructionV03.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmPreviousReference
 * AccountOpeningInstructionV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmInstructionDetails
 * AccountOpeningInstructionV03.mmInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmInvestmentAccount
 * AccountOpeningInstructionV03.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmAccountParties
 * AccountOpeningInstructionV03.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmIntermediaries
 * AccountOpeningInstructionV03.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmPlacement
 * AccountOpeningInstructionV03.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmNewIssueAllocation
 * AccountOpeningInstructionV03.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmSavingsInvestmentPlan
 * AccountOpeningInstructionV03.mmSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmWithdrawalInvestmentPlan
 * AccountOpeningInstructionV03.mmWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmCashSettlement
 * AccountOpeningInstructionV03.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmServiceLevelAgreement
 * AccountOpeningInstructionV03.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmExtension
 * AccountOpeningInstructionV03.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountOpeningInstructionV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner, for example, an investor or its designated agent sends the AccountOpeningInstruction message to the account servicer, for example, a registrar, transfer agent or custodian to instruct the opening of an account or the opening of an account and establishing an investment plan.\r\nUsage\r\nThe AccountOpeningInstruction is used to open an account directly or indirectly with the account servicer or an intermediary.\r\nIn some markets, for example, Australia, and for some products in the United Kingdom, a first order (also known as a deposit instruction) is placed at the same time as the account opening. To cater for this scenario, an order message can be linked (via references in the message) to the AccountOpeningInstruction message when needed.\r\nExecution of the AccountOpeningInstruction is confirmed via an AccountDetailsConfirmation message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04
 * AccountOpeningInstructionV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV02
 * AccountOpeningInstructionV02}</li>
 * </ul>
 */
public class AccountOpeningInstructionV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Identifies the message.
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
	 * definition} = "Identifies the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmMessageIdentification
	 * AccountOpeningInstructionV04.mmMessageIdentification}</li>
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
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	protected InvestmentFundOrder4 orderReference;
	/**
	 * Identifies a related order.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmOrderReference
	 * AccountOpeningInstructionV04.mmOrderReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOrderReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Identifies a related order.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmOrderReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundOrder4.mmObject();
		}
	};
	protected AdditionalReference3 previousReference;
	/**
	 * Reference to a linked message that was previously sent.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmPreviousReference
	 * AccountOpeningInstructionV04.mmPreviousReference}</li>
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
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmPreviousReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}
	};
	protected InvestmentAccountOpeningDetails instructionDetails;
	/**
	 * Provide detailed information about the opening instruction.
	 * <p>
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
	 * "Provide detailed information about the opening instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmInstructionDetails
	 * AccountOpeningInstructionV04.mmInstructionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionDetails";
			definition = "Provide detailed information about the opening instruction.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmInstructionDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestmentAccountOpeningDetails.mmObject();
		}
	};
	protected InvestmentAccount34 investmentAccount;
	/**
	 * Detailed information about the investment account to be opened
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34
	 * InvestmentAccount34}</li>
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
	 * "Detailed information about the investment account to be opened"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmInvestmentAccount
	 * AccountOpeningInstructionV04.mmInvestmentAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInvestmentAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Detailed information about the investment account to be opened";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmInvestmentAccount);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestmentAccount34.mmObject();
		}
	};
	protected AccountParties6 accountParties;
	/**
	 * Information related to parties who are related to an investment account;
	 * eg. primary account owner.
	 * <p>
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
	 * "Information related to parties who are related to an investment account; eg. primary account owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmAccountParties
	 * AccountOpeningInstructionV04.mmAccountParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountParties";
			definition = "Information related to parties who are related to an investment account; eg. primary account owner.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmAccountParties);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountParties6.mmObject();
		}
	};
	protected List<Intermediary12> intermediaries;
	/**
	 * Information related to an intermediary.
	 * <p>
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
	 * definition} = "Information related to an intermediary."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmIntermediaries
	 * AccountOpeningInstructionV04.mmIntermediaries}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIntermediaries = new MMMessageBuildingBlock() {
		{
			xmlTag = "Intrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediaries";
			definition = "Information related to an intermediary.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmIntermediaries);
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> Intermediary12.mmObject();
		}
	};
	protected ReferredAgent1 placement;
	/**
	 * Placement agent for the hedge fund industry.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmPlacement
	 * AccountOpeningInstructionV04.mmPlacement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPlacement = new MMMessageBuildingBlock() {
		{
			xmlTag = "Plcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			definition = "Placement agent for the hedge fund industry.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmPlacement);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ReferredAgent1.mmObject();
		}
	};
	protected NewIssueAllocation1 newIssueAllocation;
	/**
	 * Eligibility conditions applicable when there is an allocation of new
	 * issues for hedge fund account opening.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmNewIssueAllocation
	 * AccountOpeningInstructionV04.mmNewIssueAllocation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNewIssueAllocation = new MMMessageBuildingBlock() {
		{
			xmlTag = "NewIsseAllcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssueAllocation";
			definition = "Eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmNewIssueAllocation);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NewIssueAllocation1.mmObject();
		}
	};
	protected List<InvestmentPlan6> savingsInvestmentPlan;
	/**
	 * Plan that allows individuals to set aside a fixed amount of money at
	 * specified intervals, usually for a special purpose, eg, retirement.
	 * <p>
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
	 * "Plan that allows individuals to set aside a fixed amount of money at specified intervals, usually for a special purpose, eg, retirement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmSavingsInvestmentPlan
	 * AccountOpeningInstructionV04.mmSavingsInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSavingsInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "SvgsInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsInvestmentPlan";
			definition = "Plan that allows individuals to set aside a fixed amount of money at specified intervals, usually for a special purpose, eg, retirement.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmSavingsInvestmentPlan);
			maxOccurs = 50;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan6.mmObject();
		}
	};
	protected List<InvestmentPlan6> withdrawalInvestmentPlan;
	/**
	 * Plan through which an investment fund investor's holdings are depleted
	 * through regular withdrawals at specified intervals.
	 * <p>
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
	 * "Plan through which an investment fund investor's holdings are depleted through regular withdrawals at specified intervals."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmWithdrawalInvestmentPlan
	 * AccountOpeningInstructionV04.mmWithdrawalInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmWithdrawalInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "WdrwlInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalInvestmentPlan";
			definition = "Plan through which an investment fund investor's holdings are depleted through regular withdrawals at specified intervals.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmWithdrawalInvestmentPlan);
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan6.mmObject();
		}
	};
	protected List<InvestmentFundCashSettlementInformation5> cashSettlement;
	/**
	 * Cash settlement standing instruction associated to the investment fund
	 * transaction.
	 * <p>
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
	 * "Cash settlement standing instruction associated to the investment fund transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmCashSettlement
	 * AccountOpeningInstructionV04.mmCashSettlement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCashSettlement = new MMMessageBuildingBlock() {
		{
			xmlTag = "CshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "Cash settlement standing instruction associated to the investment fund transaction.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmCashSettlement);
			maxOccurs = 8;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundCashSettlementInformation5.mmObject();
		}
	};
	protected List<DocumentToSend1> serviceLevelAgreement;
	/**
	 * Identifies documents to be provided for the account opening.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmServiceLevelAgreement
	 * AccountOpeningInstructionV04.mmServiceLevelAgreement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmServiceLevelAgreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "SvcLvlAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelAgreement";
			definition = "Identifies documents to be provided for the account opening.";
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmServiceLevelAgreement);
			maxOccurs = 30;
			minOccurs = 0;
			complexType_lazy = () -> DocumentToSend1.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmExtension
	 * AccountOpeningInstructionV04.mmExtension}</li>
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
			nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmExtension);
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountOpeningInstructionV03";
				definition = "Scope\r\nAn account owner, for example, an investor or its designated agent sends the AccountOpeningInstruction message to the account servicer, for example, a registrar, transfer agent or custodian to instruct the opening of an account or the opening of an account and establishing an investment plan.\r\nUsage\r\nThe AccountOpeningInstruction is used to open an account directly or indirectly with the account servicer or an intermediary.\r\nIn some markets, for example, Australia, and for some products in the United Kingdom, a first order (also known as a deposit instruction) is placed at the same time as the account opening. To cater for this scenario, an order message can be linked (via references in the message) to the AccountOpeningInstruction message when needed.\r\nExecution of the AccountOpeningInstruction is confirmed via an AccountDetailsConfirmation message.";
				nextVersions_lazy = () -> Arrays.asList(AccountOpeningInstructionV04.mmObject());
				previousVersion_lazy = () -> AccountOpeningInstructionV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AcctOpngInstr";
				businessArea_lazy = () -> AccountManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountOpeningInstructionV03.mmMessageIdentification, AccountOpeningInstructionV03.mmOrderReference, AccountOpeningInstructionV03.mmPreviousReference,
						AccountOpeningInstructionV03.mmInstructionDetails, AccountOpeningInstructionV03.mmInvestmentAccount, AccountOpeningInstructionV03.mmAccountParties, AccountOpeningInstructionV03.mmIntermediaries,
						AccountOpeningInstructionV03.mmPlacement, AccountOpeningInstructionV03.mmNewIssueAllocation, AccountOpeningInstructionV03.mmSavingsInvestmentPlan, AccountOpeningInstructionV03.mmWithdrawalInvestmentPlan,
						AccountOpeningInstructionV03.mmCashSettlement, AccountOpeningInstructionV03.mmServiceLevelAgreement, AccountOpeningInstructionV03.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "001";
						version = "03";
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

	public InvestmentFundOrder4 getOrderReference() {
		return orderReference;
	}

	public void setOrderReference(InvestmentFundOrder4 orderReference) {
		this.orderReference = orderReference;
	}

	public AdditionalReference3 getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
	}

	public InvestmentAccountOpeningDetails getInstructionDetails() {
		return instructionDetails;
	}

	public void setInstructionDetails(InvestmentAccountOpeningDetails instructionDetails) {
		this.instructionDetails = instructionDetails;
	}

	public InvestmentAccount34 getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccount34 investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	public AccountParties6 getAccountParties() {
		return accountParties;
	}

	public void setAccountParties(AccountParties6 accountParties) {
		this.accountParties = accountParties;
	}

	public List<Intermediary12> getIntermediaries() {
		return intermediaries;
	}

	public void setIntermediaries(List<Intermediary12> intermediaries) {
		this.intermediaries = intermediaries;
	}

	public ReferredAgent1 getPlacement() {
		return placement;
	}

	public void setPlacement(ReferredAgent1 placement) {
		this.placement = placement;
	}

	public NewIssueAllocation1 getNewIssueAllocation() {
		return newIssueAllocation;
	}

	public void setNewIssueAllocation(NewIssueAllocation1 newIssueAllocation) {
		this.newIssueAllocation = newIssueAllocation;
	}

	public List<InvestmentPlan6> getSavingsInvestmentPlan() {
		return savingsInvestmentPlan;
	}

	public void setSavingsInvestmentPlan(List<InvestmentPlan6> savingsInvestmentPlan) {
		this.savingsInvestmentPlan = savingsInvestmentPlan;
	}

	public List<InvestmentPlan6> getWithdrawalInvestmentPlan() {
		return withdrawalInvestmentPlan;
	}

	public void setWithdrawalInvestmentPlan(List<InvestmentPlan6> withdrawalInvestmentPlan) {
		this.withdrawalInvestmentPlan = withdrawalInvestmentPlan;
	}

	public List<InvestmentFundCashSettlementInformation5> getCashSettlement() {
		return cashSettlement;
	}

	public void setCashSettlement(List<InvestmentFundCashSettlementInformation5> cashSettlement) {
		this.cashSettlement = cashSettlement;
	}

	public List<DocumentToSend1> getServiceLevelAgreement() {
		return serviceLevelAgreement;
	}

	public void setServiceLevelAgreement(List<DocumentToSend1> serviceLevelAgreement) {
		this.serviceLevelAgreement = serviceLevelAgreement;
	}

	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}
}