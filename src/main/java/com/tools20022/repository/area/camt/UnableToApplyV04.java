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
import com.tools20022.repository.area.CashManagementPreviousVersion;
import com.tools20022.repository.choice.UnableToApplyJustification2Choice;
import com.tools20022.repository.choice.UnderlyingTransaction2Choice;
import com.tools20022.repository.msg.Case3;
import com.tools20022.repository.msg.CaseAssignment3;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ExceptionsandInvestigationsISOPreviousversion;
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
 * assigner, if the payment instruction has reached an incorrect creditor.<br>
 * The UnableToApply message has the following main characteristics:<br>
 * The case creator (the instructed party/creditor of a payment instruction)
 * assigns a unique case identification and optionally the reason code for the
 * Unable To Apply message. This information will be passed unchanged to all
 * subsequent case assignees.<br>
 * The case creator specifies the identification of the underlying payment
 * instruction. This identification needs to be updated by the subsequent case
 * assigner(s) in order to match the one used with their case assignee(s).<br>
 * The Unable To Apply Justification element allows the assigner to indicate
 * whether a specific element causes the unable to apply situation (incorrect
 * element and/or mismatched element can be listed) or whether any supplementary
 * information needs to be forwarded.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementPreviousVersion
 * CashManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ExceptionsandInvestigationsISOPreviousversion
 * ExceptionsandInvestigationsISOPreviousversion}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV04#Assignment
 * UnableToApplyV04.Assignment}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV04#Case
 * UnableToApplyV04.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV04#Underlying
 * UnableToApplyV04.Underlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV04#Justification
 * UnableToApplyV04.Justification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV04#SupplementaryData
 * UnableToApplyV04.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV04#identifier
 * UnableToApplyV04.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnableToApplyV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Unable To Apply message is sent by a case creator or a case assigner to a case assignee. This message is used to initiate an investigation of a payment instruction that cannot be executed or reconciled.\r\nUsage\r\nThe Unable To Apply case occurs in two situations:\r\n- an agent cannot execute the payment instruction due to missing or incorrect information\r\n- a creditor cannot reconcile the payment entry as it is received unexpectedly, or missing or incorrect information prevents reconciliation\r\nThe Unable To Apply message\r\n- always follows the reverse route of the original payment instruction\r\n- must be forwarded to the preceding agents in the payment processing chain, where appropriate\r\n- covers one and only one payment instruction (or payment entry) at a time; if several payment instructions cannot be executed or several payment entries cannot be reconciled, then multiple Unable To Apply messages must be sent.\r\nDepending on what stage the payment is and what has been done to it, for example incorrect routing, errors/omissions when processing the instruction or even the absence of any error, the unable to apply case may lead to a:\r\n- Additional Payment Information message, sent to the case creator/case assigner, if a truncation or omission in a payment instruction prevented reconciliation.\r\n- Request To Cancel Payment message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents (this also entails a new corrected payment instruction being issued). Prior to sending the payment cancellation request, the agent should first send a resolution indicating that a cancellation will follow (CWFW).\r\n- Request To Modify Payment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction. Prior to sending the modify payment request, the agent should first send a resolution indicating that a modification will follow (MWFW).\r\n- Debit Authorisation Request message, sent to the case creator/case assigner, if the payment instruction has reached an incorrect creditor.\r\nThe UnableToApply message has the following main characteristics:\r\nThe case creator (the instructed party/creditor of a payment instruction) assigns a unique case identification and optionally the reason code for the Unable To Apply message. This information will be passed unchanged to all subsequent case assignees.\r\nThe case creator specifies the identification of the underlying payment instruction. This identification needs to be updated by the subsequent case assigner(s) in order to match the one used with their case assignee(s).\r\nThe Unable To Apply Justification element allows the assigner to indicate whether a specific element causes the unable to apply situation (incorrect element and/or mismatched element can be listed) or whether any supplementary information needs to be forwarded."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV05
 * UnableToApplyV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV03
 * UnableToApplyV03}</li>
 * </ul>
 */
public class UnableToApplyV04 {

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
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#Assignment
	 * UnableToApplyV05.Assignment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Assignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.UnableToApplyV05.Assignment);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> CaseAssignment3.mmObject();
		}
	};
	/**
	 * Identifies the investigation case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#Case
	 * UnableToApplyV05.Case}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Case = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.UnableToApplyV05.Case);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> Case3.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice
	 * UnderlyingTransaction2Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#Underlying
	 * UnableToApplyV05.Underlying}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Underlying = new MMMessageBuildingBlock() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "References the payment instruction or statement entry that a party is unable to execute or unable to reconcile.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.UnableToApplyV05.Underlying);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> UnderlyingTransaction2Choice.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#Justification
	 * UnableToApplyV05.Justification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Justification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Justfn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Justification";
			definition = "Explains the reason why the case creator is unable to apply the instruction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.UnableToApplyV05.Justification);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> UnableToApplyJustification2Choice.mmObject();
		}
	};
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#SupplementaryData
	 * UnableToApplyV05.SupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock SupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.UnableToApplyV05.SupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "04"</li>
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
			version = "04";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyV04";
				definition = "Scope\r\nThe Unable To Apply message is sent by a case creator or a case assigner to a case assignee. This message is used to initiate an investigation of a payment instruction that cannot be executed or reconciled.\r\nUsage\r\nThe Unable To Apply case occurs in two situations:\r\n- an agent cannot execute the payment instruction due to missing or incorrect information\r\n- a creditor cannot reconcile the payment entry as it is received unexpectedly, or missing or incorrect information prevents reconciliation\r\nThe Unable To Apply message\r\n- always follows the reverse route of the original payment instruction\r\n- must be forwarded to the preceding agents in the payment processing chain, where appropriate\r\n- covers one and only one payment instruction (or payment entry) at a time; if several payment instructions cannot be executed or several payment entries cannot be reconciled, then multiple Unable To Apply messages must be sent.\r\nDepending on what stage the payment is and what has been done to it, for example incorrect routing, errors/omissions when processing the instruction or even the absence of any error, the unable to apply case may lead to a:\r\n- Additional Payment Information message, sent to the case creator/case assigner, if a truncation or omission in a payment instruction prevented reconciliation.\r\n- Request To Cancel Payment message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents (this also entails a new corrected payment instruction being issued). Prior to sending the payment cancellation request, the agent should first send a resolution indicating that a cancellation will follow (CWFW).\r\n- Request To Modify Payment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction. Prior to sending the modify payment request, the agent should first send a resolution indicating that a modification will follow (MWFW).\r\n- Debit Authorisation Request message, sent to the case creator/case assigner, if the payment instruction has reached an incorrect creditor.\r\nThe UnableToApply message has the following main characteristics:\r\nThe case creator (the instructed party/creditor of a payment instruction) assigns a unique case identification and optionally the reason code for the Unable To Apply message. This information will be passed unchanged to all subsequent case assignees.\r\nThe case creator specifies the identification of the underlying payment instruction. This identification needs to be updated by the subsequent case assigner(s) in order to match the one used with their case assignee(s).\r\nThe Unable To Apply Justification element allows the assigner to indicate whether a specific element causes the unable to apply situation (incorrect element and/or mismatched element can be listed) or whether any supplementary information needs to be forwarded.";
				previousVersion_lazy = () -> UnableToApplyV03.mmObject();
				nextVersions_lazy = () -> Arrays.asList(UnableToApplyV05.mmObject());
				messageSet_lazy = () -> Arrays.asList(ExceptionsandInvestigationsISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "UblToApply";
				businessArea_lazy = () -> CashManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.UnableToApplyV04.Assignment, com.tools20022.repository.area.camt.UnableToApplyV04.Case,
						com.tools20022.repository.area.camt.UnableToApplyV04.Underlying, com.tools20022.repository.area.camt.UnableToApplyV04.Justification, com.tools20022.repository.area.camt.UnableToApplyV04.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.camt.UnableToApplyV04.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}