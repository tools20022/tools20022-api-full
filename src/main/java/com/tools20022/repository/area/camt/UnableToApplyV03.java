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
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.choice.UnableToApplyJustification2Choice;
import com.tools20022.repository.choice.UnderlyingTransaction1Choice;
import com.tools20022.repository.msg.Case2;
import com.tools20022.repository.msg.CaseAssignment2;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The Unable To Apply message is sent by a case creator or a case assigner to a
 * case assignee. This message is used to initiate an investigation of a payment
 * instruction that cannot be executed or reconciled.<br>
 * <b>Usage</b><br>
 * The Unable To Apply case occurs in two situations:<br>
 * - an agent cannot execute the payment instruction due to missing or incorrect
 * information<br>
 * - a creditor cannot reconcile the payment entry as it is received
 * unexpectedly, or missing or incorrect information prevents reconciliation<br>
 * The Unable To Apply message<br>
 * - always follows the reverse route of the original payment instruction<br>
 * - must be forwarded to the preceding agents in the payment processing chain,
 * where appropriate<br>
 * - covers one and only one payment instruction (or payment entry) at a time;
 * if several payment instructions cannot be executed or several payment entries
 * cannot be reconciled, then multiple Unable To Apply messages must be sent.<br>
 * Depending on what stage the payment is and what has been done to it, for
 * example incorrect routing, errors/omissions when processing the instruction
 * or even the absence of any error, the unable to apply case may lead to a:<br>
 * - Additional Payment Information message, sent to the case creator/case
 * assigner, if a truncation or omission in a payment instruction prevented
 * reconciliation.<br>
 * - Request To Cancel Payment message, sent to the subsequent agent in the
 * payment processing chain, if the original payment instruction has been
 * incorrectly routed through the chain of agents (this also entails a new
 * corrected payment instruction being issued). Prior to sending the payment
 * cancellation request, the agent should first send a resolution indicating
 * that a cancellation will follow (CWFW).<br>
 * - Request To Modify Payment message, sent to the subsequent agent in the
 * payment processing chain, if a truncation or omission has occurred during the
 * processing of the original payment instruction. Prior to sending the modify
 * payment request, the agent should first send a resolution indicating that a
 * modification will follow (MWFW).<br>
 * - Debit Authorisation Request message, sent to the case creator/case
 * assigner, if the payment instruction has reached an incorrect creditor. The
 * UnableToApply message has the following main characteristics: - Case
 * Identification and Reason Code: The case creator (the instructed
 * party/creditor of a payment instruction) assigns a unique case identification
 * and optionally the reason code for the Unable To Apply message. This
 * information will be passed unchanged to all subsequent case assignees. -
 * Underlying Payment Instruction Identification: The case creator specifies the
 * identification of the underlying payment instruction. This identification
 * needs to be updated by the subsequent case assigner(s) in order to match the
 * one used with their case assignee(s). - Unable To Apply Justification: The
 * Unable To Apply Justification element allows the assigner to indicate whether
 * a specific element causes the unable to apply situation (incorrect element
 * and/or mismatched element can be listed) or whether any supplementary
 * information needs to be forwarded.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "UblToApply"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV03#Assignment
 * UnableToApplyV03.Assignment}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV03#Case
 * UnableToApplyV03.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV03#Underlying
 * UnableToApplyV03.Underlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV03#Justification
 * UnableToApplyV03.Justification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV03#identifier
 * UnableToApplyV03.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnableToApplyV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Unable To Apply message is sent by a case creator or a case assigner to a case assignee. This message is used to initiate an investigation of a payment instruction that cannot be executed or reconciled.\r\nUsage\r\nThe Unable To Apply case occurs in two situations:\r\n- an agent cannot execute the payment instruction due to missing or incorrect information\r\n- a creditor cannot reconcile the payment entry as it is received unexpectedly, or missing or incorrect information prevents reconciliation\r\nThe Unable To Apply message\r\n- always follows the reverse route of the original payment instruction\r\n- must be forwarded to the preceding agents in the payment processing chain, where appropriate\r\n- covers one and only one payment instruction (or payment entry) at a time; if several payment instructions cannot be executed or several payment entries cannot be reconciled, then multiple Unable To Apply messages must be sent.\r\nDepending on what stage the payment is and what has been done to it, for example incorrect routing, errors/omissions when processing the instruction or even the absence of any error, the unable to apply case may lead to a:\r\n- Additional Payment Information message, sent to the case creator/case assigner, if a truncation or omission in a payment instruction prevented reconciliation.\r\n- Request To Cancel Payment message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents (this also entails a new corrected payment instruction being issued). Prior to sending the payment cancellation request, the agent should first send a resolution indicating that a cancellation will follow (CWFW).\r\n- Request To Modify Payment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction. Prior to sending the modify payment request, the agent should first send a resolution indicating that a modification will follow (MWFW).\r\n- Debit Authorisation Request message, sent to the case creator/case assigner, if the payment instruction has reached an incorrect creditor.\nThe UnableToApply message has the following main characteristics:\n- Case Identification and Reason Code:\nThe case creator (the instructed party/creditor of a payment instruction) assigns a unique case identification and optionally\nthe reason code for the Unable To Apply message. This information will be passed unchanged to all subsequent case\nassignees.\n- Underlying Payment Instruction Identification:\nThe case creator specifies the identification of the underlying payment instruction. This identification needs to be updated\nby the subsequent case assigner(s) in order to match the one used with their case assignee(s).\n- Unable To Apply Justification:\nThe Unable To Apply Justification element allows the assigner to indicate whether a specific element causes the unable\nto apply situation (incorrect element and/or mismatched element can be listed) or whether any supplementary information\nneeds to be forwarded."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV04
 * UnableToApplyV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class UnableToApplyV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the assignment of an investigation case from an assigner to an
	 * assignee. Usage: The Assigner must be the sender of this confirmation and
	 * the Assignee must be the receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment2
	 * CaseAssignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Assignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> CaseAssignment2.mmObject();
		}
	};
	/**
	 * Identifies the investigation case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case2 Case2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the investigation case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Case = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> Case2.mmObject();
		}
	};
	/**
	 * References the payment instruction or statement entry that a party is
	 * unable to execute or unable to reconcile.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice
	 * UnderlyingTransaction1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Undrlyg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Underlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "References the payment instruction or statement entry that a party is unable to execute or unable to reconcile."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Underlying = new MMMessageBuildingBlock() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "References the payment instruction or statement entry that a party is unable to execute or unable to reconcile.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> UnderlyingTransaction1Choice.mmObject();
		}
	};
	/**
	 * Explains the reason why the case creator is unable to apply the
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustification2Choice
	 * UnableToApplyJustification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Justfn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Justification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Explains the reason why the case creator is unable to apply the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Justification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Justfn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Justification";
			definition = "Explains the reason why the case creator is unable to apply the instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> UnableToApplyJustification2Choice.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "camt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "026"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "camt";
			messageFunctionality = "026";
			version = "03";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyV03";
				definition = "Scope\r\nThe Unable To Apply message is sent by a case creator or a case assigner to a case assignee. This message is used to initiate an investigation of a payment instruction that cannot be executed or reconciled.\r\nUsage\r\nThe Unable To Apply case occurs in two situations:\r\n- an agent cannot execute the payment instruction due to missing or incorrect information\r\n- a creditor cannot reconcile the payment entry as it is received unexpectedly, or missing or incorrect information prevents reconciliation\r\nThe Unable To Apply message\r\n- always follows the reverse route of the original payment instruction\r\n- must be forwarded to the preceding agents in the payment processing chain, where appropriate\r\n- covers one and only one payment instruction (or payment entry) at a time; if several payment instructions cannot be executed or several payment entries cannot be reconciled, then multiple Unable To Apply messages must be sent.\r\nDepending on what stage the payment is and what has been done to it, for example incorrect routing, errors/omissions when processing the instruction or even the absence of any error, the unable to apply case may lead to a:\r\n- Additional Payment Information message, sent to the case creator/case assigner, if a truncation or omission in a payment instruction prevented reconciliation.\r\n- Request To Cancel Payment message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents (this also entails a new corrected payment instruction being issued). Prior to sending the payment cancellation request, the agent should first send a resolution indicating that a cancellation will follow (CWFW).\r\n- Request To Modify Payment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction. Prior to sending the modify payment request, the agent should first send a resolution indicating that a modification will follow (MWFW).\r\n- Debit Authorisation Request message, sent to the case creator/case assigner, if the payment instruction has reached an incorrect creditor.\nThe UnableToApply message has the following main characteristics:\n- Case Identification and Reason Code:\nThe case creator (the instructed party/creditor of a payment instruction) assigns a unique case identification and optionally\nthe reason code for the Unable To Apply message. This information will be passed unchanged to all subsequent case\nassignees.\n- Underlying Payment Instruction Identification:\nThe case creator specifies the identification of the underlying payment instruction. This identification needs to be updated\nby the subsequent case assigner(s) in order to match the one used with their case assignee(s).\n- Unable To Apply Justification:\nThe Unable To Apply Justification element allows the assigner to indicate whether a specific element causes the unable\nto apply situation (incorrect element and/or mismatched element can be listed) or whether any supplementary information\nneeds to be forwarded.";
				nextVersions_lazy = () -> Arrays.asList(UnableToApplyV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "UblToApply";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.UnableToApplyV03.Assignment, com.tools20022.repository.area.camt.UnableToApplyV03.Case,
						com.tools20022.repository.area.camt.UnableToApplyV03.Underlying, com.tools20022.repository.area.camt.UnableToApplyV03.Justification);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.camt.UnableToApplyV03.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}