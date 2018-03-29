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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.choice.Amount2Choice;
import com.tools20022.repository.msg.MessageHeader1;
import com.tools20022.repository.msg.PaymentInstruction13;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.SystemMember2;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The BackupPayment message is sent by a member to the transaction
 * administrator.<br>
 * It is used to request a liquidity transfer from the member to another
 * participant in the system when the user is in recovery mode.<br>
 * <b>Usage</b><br>
 * Under very specific circumstances, the transaction administrator can accept
 * direct input of transactions as part of its cash management functionalities.
 * This possibility is available only when a declared incident has been reported
 * to the transaction administrator This could be the case, for example, when
 * the internal systems of the member are having problems sending out payments
 * or when the continuity of the whole system is put at risk.<br>
 * The purpose of the BackupPayment message is to prevent the consequences of a
 * specific failure affecting not only the member experiencing problems but also
 * its counterparties. Members can therefore input transactions directly in
 * order to ensure the stability of the system and smooth exchanges.<br>
 * At any time during the operating hours of the system, and under the agreed
 * circumstances, the member can request a backup payment to be effected.<br>
 * The member can request the transfer by identifying the following elements:<br>
 * - party (account owner) that will receive the funds<br>
 * - the financial institution that will receive the funds on behalf of the
 * account owner<br>
 * Based on the criteria received within the BackupPayment message, the
 * transaction administrator will execute or reject the requested funds
 * transfer.<br>
 * The transaction administrator may send a Receipt message as a reply to the
 * BackupPayment request.<br>
 * To verify the outcome of the request, the member may submit a GetTransaction
 * or GetAccount message with the appropriate search criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BackupPaymentV06#mmMessageHeader
 * BackupPaymentV06.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BackupPaymentV06#mmOriginalMessageIdentification
 * BackupPaymentV06.mmOriginalMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BackupPaymentV06#mmInstructionInformation
 * BackupPaymentV06.mmInstructionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BackupPaymentV06#mmTransferredAmount
 * BackupPaymentV06.mmTransferredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BackupPaymentV06#mmCreditor
 * BackupPaymentV06.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BackupPaymentV06#mmCreditorAgent
 * BackupPaymentV06.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BackupPaymentV06#mmDebtorAgent
 * BackupPaymentV06.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BackupPaymentV06#mmSupplementaryData
 * BackupPaymentV06.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance
 * _SR2018_MX_CashManagement_Maintenance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BckpPmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.023.001.06}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BackupPaymentV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe BackupPayment message is sent by a member to the transaction administrator.\r\nIt is used to request a liquidity transfer from the member to another participant in the system when the user is in recovery mode.\r\nUsage\r\nUnder very specific circumstances, the transaction administrator can accept direct input of transactions as part of its cash management functionalities. This possibility is available only when a declared incident has been reported to the transaction administrator This could be the case, for example, when the internal systems of the member are having problems sending out payments or when the continuity of the whole system is put at risk.\r\nThe purpose of the BackupPayment message is to prevent the consequences of a specific failure affecting not only the member experiencing problems but also its counterparties. Members can therefore input transactions directly in order to ensure the stability of the system and smooth exchanges.\r\nAt any time during the operating hours of the system, and under the agreed circumstances, the member can request a backup payment to be effected.\r\nThe member can request the transfer by identifying the following elements:\r\n- party (account owner) that will receive the funds\r\n- the financial institution that will receive the funds on behalf of the account owner\r\nBased on the criteria received within the BackupPayment message, the transaction administrator will execute or reject the requested funds transfer.\r\nThe transaction administrator may send a Receipt message as a reply to the BackupPayment request.\r\nTo verify the outcome of the request, the member may submit a GetTransaction or GetAccount message with the appropriate search criteria."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BackupPaymentV06", propOrder = {"messageHeader", "originalMessageIdentification", "instructionInformation", "transferredAmount", "creditor", "creditorAgent", "debtorAgent", "supplementaryData"})
public class BackupPaymentV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgHdr", required = true)
	protected MessageHeader1 messageHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MessageHeader1
	 * MessageHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common business identification for the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BackupPaymentV06, MessageHeader1> mmMessageHeader = new MMMessageBuildingBlock<BackupPaymentV06, MessageHeader1>() {
		{
			xmlTag = "MsgHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageHeader";
			definition = "Common business identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageHeader1.mmObject();
		}

		@Override
		public MessageHeader1 getValue(BackupPaymentV06 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(BackupPaymentV06 obj, MessageHeader1 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "OrgnlMsgId")
	protected MessageHeader1 originalMessageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MessageHeader1
	 * MessageHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the original message identification.\nThis was formerly the PaymentInstructionReference."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BackupPaymentV06, Optional<MessageHeader1>> mmOriginalMessageIdentification = new MMMessageBuildingBlock<BackupPaymentV06, Optional<MessageHeader1>>() {
		{
			xmlTag = "OrgnlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Identifies the original message identification.\nThis was formerly the PaymentInstructionReference.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MessageHeader1.mmObject();
		}

		@Override
		public Optional<MessageHeader1> getValue(BackupPaymentV06 obj) {
			return obj.getOriginalMessageIdentification();
		}

		@Override
		public void setValue(BackupPaymentV06 obj, Optional<MessageHeader1> value) {
			obj.setOriginalMessageIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrInf")
	protected PaymentInstruction13 instructionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction13
	 * PaymentInstruction13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the execution and type of payment contained in the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BackupPaymentV06, Optional<PaymentInstruction13>> mmInstructionInformation = new MMMessageBuildingBlock<BackupPaymentV06, Optional<PaymentInstruction13>>() {
		{
			xmlTag = "InstrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionInformation";
			definition = "Provides details on the execution and type of payment contained in the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PaymentInstruction13.mmObject();
		}

		@Override
		public Optional<PaymentInstruction13> getValue(BackupPaymentV06 obj) {
			return obj.getInstructionInformation();
		}

		@Override
		public void setValue(BackupPaymentV06 obj, Optional<PaymentInstruction13> value) {
			obj.setInstructionInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfdAmt", required = true)
	protected Amount2Choice transferredAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Amount2Choice Amount2Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of cash that the transaction administrator transfers from one account to another."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BackupPaymentV06, Amount2Choice> mmTransferredAmount = new MMMessageBuildingBlock<BackupPaymentV06, Amount2Choice>() {
		{
			xmlTag = "TrfdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferredAmount";
			definition = "Quantity of cash that the transaction administrator transfers from one account to another.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Amount2Choice.mmObject();
		}

		@Override
		public Amount2Choice getValue(BackupPaymentV06 obj) {
			return obj.getTransferredAmount();
		}

		@Override
		public void setValue(BackupPaymentV06 obj, Amount2Choice value) {
			obj.setTransferredAmount(value);
		}
	};
	@XmlElement(name = "Cdtr", required = true)
	protected SystemMember2 creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.SystemMember2
	 * SystemMember2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that receives an amount of money from the debtor."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BackupPaymentV06, SystemMember2> mmCreditor = new MMMessageBuildingBlock<BackupPaymentV06, SystemMember2>() {
		{
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party that receives an amount of money from the debtor.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SystemMember2.mmObject();
		}

		@Override
		public SystemMember2 getValue(BackupPaymentV06 obj) {
			return obj.getCreditor();
		}

		@Override
		public void setValue(BackupPaymentV06 obj, SystemMember2 value) {
			obj.setCreditor(value);
		}
	};
	@XmlElement(name = "CdtrAgt")
	protected SystemMember2 creditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.SystemMember2
	 * SystemMember2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the payment transaction on behalf of an account owner, or other nominated party, and credits the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BackupPaymentV06, Optional<SystemMember2>> mmCreditorAgent = new MMMessageBuildingBlock<BackupPaymentV06, Optional<SystemMember2>>() {
		{
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution that receives the payment transaction on behalf of an account owner, or other nominated party, and credits the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SystemMember2.mmObject();
		}

		@Override
		public Optional<SystemMember2> getValue(BackupPaymentV06 obj) {
			return obj.getCreditorAgent();
		}

		@Override
		public void setValue(BackupPaymentV06 obj, Optional<SystemMember2> value) {
			obj.setCreditorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAgt")
	protected SystemMember2 debtorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.SystemMember2
	 * SystemMember2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the payment transaction from the account owner, or other authorised party, and processes the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BackupPaymentV06, Optional<SystemMember2>> mmDebtorAgent = new MMMessageBuildingBlock<BackupPaymentV06, Optional<SystemMember2>>() {
		{
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution that receives the payment transaction from the account owner, or other authorised party, and processes the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SystemMember2.mmObject();
		}

		@Override
		public Optional<SystemMember2> getValue(BackupPaymentV06 obj) {
			return obj.getDebtorAgent();
		}

		@Override
		public void setValue(BackupPaymentV06 obj, Optional<SystemMember2> value) {
			obj.setDebtorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BackupPaymentV06, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<BackupPaymentV06, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(BackupPaymentV06 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(BackupPaymentV06 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BackupPaymentV06";
				definition = "Scope\r\nThe BackupPayment message is sent by a member to the transaction administrator.\r\nIt is used to request a liquidity transfer from the member to another participant in the system when the user is in recovery mode.\r\nUsage\r\nUnder very specific circumstances, the transaction administrator can accept direct input of transactions as part of its cash management functionalities. This possibility is available only when a declared incident has been reported to the transaction administrator This could be the case, for example, when the internal systems of the member are having problems sending out payments or when the continuity of the whole system is put at risk.\r\nThe purpose of the BackupPayment message is to prevent the consequences of a specific failure affecting not only the member experiencing problems but also its counterparties. Members can therefore input transactions directly in order to ensure the stability of the system and smooth exchanges.\r\nAt any time during the operating hours of the system, and under the agreed circumstances, the member can request a backup payment to be effected.\r\nThe member can request the transfer by identifying the following elements:\r\n- party (account owner) that will receive the funds\r\n- the financial institution that will receive the funds on behalf of the account owner\r\nBased on the criteria received within the BackupPayment message, the transaction administrator will execute or reject the requested funds transfer.\r\nThe transaction administrator may send a Receipt message as a reply to the BackupPayment request.\r\nTo verify the outcome of the request, the member may submit a GetTransaction or GetAccount message with the appropriate search criteria.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "BckpPmt";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.BackupPaymentV06.mmMessageHeader, com.tools20022.repository.area.camt.BackupPaymentV06.mmOriginalMessageIdentification,
						com.tools20022.repository.area.camt.BackupPaymentV06.mmInstructionInformation, com.tools20022.repository.area.camt.BackupPaymentV06.mmTransferredAmount,
						com.tools20022.repository.area.camt.BackupPaymentV06.mmCreditor, com.tools20022.repository.area.camt.BackupPaymentV06.mmCreditorAgent, com.tools20022.repository.area.camt.BackupPaymentV06.mmDebtorAgent,
						com.tools20022.repository.area.camt.BackupPaymentV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "023";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return BackupPaymentV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader1 getMessageHeader() {
		return messageHeader;
	}

	public BackupPaymentV06 setMessageHeader(MessageHeader1 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public Optional<MessageHeader1> getOriginalMessageIdentification() {
		return originalMessageIdentification == null ? Optional.empty() : Optional.of(originalMessageIdentification);
	}

	public BackupPaymentV06 setOriginalMessageIdentification(MessageHeader1 originalMessageIdentification) {
		this.originalMessageIdentification = originalMessageIdentification;
		return this;
	}

	public Optional<PaymentInstruction13> getInstructionInformation() {
		return instructionInformation == null ? Optional.empty() : Optional.of(instructionInformation);
	}

	public BackupPaymentV06 setInstructionInformation(PaymentInstruction13 instructionInformation) {
		this.instructionInformation = instructionInformation;
		return this;
	}

	public Amount2Choice getTransferredAmount() {
		return transferredAmount;
	}

	public BackupPaymentV06 setTransferredAmount(Amount2Choice transferredAmount) {
		this.transferredAmount = Objects.requireNonNull(transferredAmount);
		return this;
	}

	public SystemMember2 getCreditor() {
		return creditor;
	}

	public BackupPaymentV06 setCreditor(SystemMember2 creditor) {
		this.creditor = Objects.requireNonNull(creditor);
		return this;
	}

	public Optional<SystemMember2> getCreditorAgent() {
		return creditorAgent == null ? Optional.empty() : Optional.of(creditorAgent);
	}

	public BackupPaymentV06 setCreditorAgent(SystemMember2 creditorAgent) {
		this.creditorAgent = creditorAgent;
		return this;
	}

	public Optional<SystemMember2> getDebtorAgent() {
		return debtorAgent == null ? Optional.empty() : Optional.of(debtorAgent);
	}

	public BackupPaymentV06 setDebtorAgent(SystemMember2 debtorAgent) {
		this.debtorAgent = debtorAgent;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public BackupPaymentV06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.023.001.06")
	static public class Document {
		@XmlElement(name = "BckpPmt", required = true)
		public BackupPaymentV06 messageBody;
	}
}