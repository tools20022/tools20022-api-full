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
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.choice.UnableToApplyJustification2Choice;
import com.tools20022.repository.choice.UnderlyingTransaction2Choice;
import com.tools20022.repository.msg.Case3;
import com.tools20022.repository.msg.CaseAssignment3;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.026.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV04#mmAssignment
 * UnableToApplyV04.mmAssignment}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV04#mmCase
 * UnableToApplyV04.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV04#mmUnderlying
 * UnableToApplyV04.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV04#mmJustification
 * UnableToApplyV04.mmJustification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV04#mmSupplementaryData
 * UnableToApplyV04.mmSupplementaryData}</li>
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
 * xmlTag} = "UblToApply"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnableToApplyV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Unable To Apply message is sent by a case creator or a case assigner to a case assignee. This message is used to initiate an investigation of a payment instruction that cannot be executed or reconciled.\r\nUsage\r\nThe Unable To Apply case occurs in two situations:\r\n- an agent cannot execute the payment instruction due to missing or incorrect information\r\n- a creditor cannot reconcile the payment entry as it is received unexpectedly, or missing or incorrect information prevents reconciliation\r\nThe Unable To Apply message\r\n- always follows the reverse route of the original payment instruction\r\n- must be forwarded to the preceding agents in the payment processing chain, where appropriate\r\n- covers one and only one payment instruction (or payment entry) at a time; if several payment instructions cannot be executed or several payment entries cannot be reconciled, then multiple Unable To Apply messages must be sent.\r\nDepending on what stage the payment is and what has been done to it, for example incorrect routing, errors/omissions when processing the instruction or even the absence of any error, the unable to apply case may lead to a:\r\n- Additional Payment Information message, sent to the case creator/case assigner, if a truncation or omission in a payment instruction prevented reconciliation.\r\n- Request To Cancel Payment message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents (this also entails a new corrected payment instruction being issued). Prior to sending the payment cancellation request, the agent should first send a resolution indicating that a cancellation will follow (CWFW).\r\n- Request To Modify Payment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction. Prior to sending the modify payment request, the agent should first send a resolution indicating that a modification will follow (MWFW).\r\n- Debit Authorisation Request message, sent to the case creator/case assigner, if the payment instruction has reached an incorrect creditor.\r\nThe UnableToApply message has the following main characteristics:\r\nThe case creator (the instructed party/creditor of a payment instruction) assigns a unique case identification and optionally the reason code for the Unable To Apply message. This information will be passed unchanged to all subsequent case assignees.\r\nThe case creator specifies the identification of the underlying payment instruction. This identification needs to be updated by the subsequent case assigner(s) in order to match the one used with their case assignee(s).\r\nThe Unable To Apply Justification element allows the assigner to indicate whether a specific element causes the unable to apply situation (incorrect element and/or mismatched element can be listed) or whether any supplementary information needs to be forwarded."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnableToApplyV04", propOrder = {"assignment", "case_", "underlying", "justification", "supplementaryData"})
public class UnableToApplyV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment3 assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#mmAssignment
	 * UnableToApplyV05.mmAssignment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UnableToApplyV04, CaseAssignment3> mmAssignment = new MMMessageBuildingBlock<UnableToApplyV04, CaseAssignment3>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			nextVersions_lazy = () -> Arrays.asList(UnableToApplyV05.mmAssignment);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment3.mmObject();
		}

		@Override
		public CaseAssignment3 getValue(UnableToApplyV04 obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(UnableToApplyV04 obj, CaseAssignment3 value) {
			obj.setAssignment(value);
		}
	};
	@XmlElement(name = "Case", required = true)
	protected Case3 case_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the investigation case."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#mmCase
	 * UnableToApplyV05.mmCase}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UnableToApplyV04, Case3> mmCase = new MMMessageBuildingBlock<UnableToApplyV04, Case3>() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			nextVersions_lazy = () -> Arrays.asList(UnableToApplyV05.mmCase);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case3.mmObject();
		}

		@Override
		public Case3 getValue(UnableToApplyV04 obj) {
			return obj.getCase();
		}

		@Override
		public void setValue(UnableToApplyV04 obj, Case3 value) {
			obj.setCase(value);
		}
	};
	@XmlElement(name = "Undrlyg", required = true)
	protected UnderlyingTransaction2Choice underlying;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice
	 * UnderlyingTransaction2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Undrlyg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Underlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "References the payment instruction or statement entry that a party is unable to execute or unable to reconcile."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#mmUnderlying
	 * UnableToApplyV05.mmUnderlying}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UnableToApplyV04, UnderlyingTransaction2Choice> mmUnderlying = new MMMessageBuildingBlock<UnableToApplyV04, UnderlyingTransaction2Choice>() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "References the payment instruction or statement entry that a party is unable to execute or unable to reconcile.";
			nextVersions_lazy = () -> Arrays.asList(UnableToApplyV05.mmUnderlying);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnderlyingTransaction2Choice.mmObject();
		}

		@Override
		public UnderlyingTransaction2Choice getValue(UnableToApplyV04 obj) {
			return obj.getUnderlying();
		}

		@Override
		public void setValue(UnableToApplyV04 obj, UnderlyingTransaction2Choice value) {
			obj.setUnderlying(value);
		}
	};
	@XmlElement(name = "Justfn", required = true)
	protected UnableToApplyJustification2Choice justification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustification2Choice
	 * UnableToApplyJustification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Justfn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Justification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Explains the reason why the case creator is unable to apply the instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#mmJustification
	 * UnableToApplyV05.mmJustification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UnableToApplyV04, UnableToApplyJustification2Choice> mmJustification = new MMMessageBuildingBlock<UnableToApplyV04, UnableToApplyJustification2Choice>() {
		{
			xmlTag = "Justfn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Justification";
			definition = "Explains the reason why the case creator is unable to apply the instruction.";
			nextVersions_lazy = () -> Arrays.asList(UnableToApplyV05.mmJustification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnableToApplyJustification2Choice.mmObject();
		}

		@Override
		public UnableToApplyJustification2Choice getValue(UnableToApplyV04 obj) {
			return obj.getJustification();
		}

		@Override
		public void setValue(UnableToApplyV04 obj, UnableToApplyJustification2Choice value) {
			obj.setJustification(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#mmSupplementaryData
	 * UnableToApplyV05.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UnableToApplyV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<UnableToApplyV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(UnableToApplyV05.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(UnableToApplyV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(UnableToApplyV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyV04";
				definition = "Scope\r\nThe Unable To Apply message is sent by a case creator or a case assigner to a case assignee. This message is used to initiate an investigation of a payment instruction that cannot be executed or reconciled.\r\nUsage\r\nThe Unable To Apply case occurs in two situations:\r\n- an agent cannot execute the payment instruction due to missing or incorrect information\r\n- a creditor cannot reconcile the payment entry as it is received unexpectedly, or missing or incorrect information prevents reconciliation\r\nThe Unable To Apply message\r\n- always follows the reverse route of the original payment instruction\r\n- must be forwarded to the preceding agents in the payment processing chain, where appropriate\r\n- covers one and only one payment instruction (or payment entry) at a time; if several payment instructions cannot be executed or several payment entries cannot be reconciled, then multiple Unable To Apply messages must be sent.\r\nDepending on what stage the payment is and what has been done to it, for example incorrect routing, errors/omissions when processing the instruction or even the absence of any error, the unable to apply case may lead to a:\r\n- Additional Payment Information message, sent to the case creator/case assigner, if a truncation or omission in a payment instruction prevented reconciliation.\r\n- Request To Cancel Payment message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents (this also entails a new corrected payment instruction being issued). Prior to sending the payment cancellation request, the agent should first send a resolution indicating that a cancellation will follow (CWFW).\r\n- Request To Modify Payment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction. Prior to sending the modify payment request, the agent should first send a resolution indicating that a modification will follow (MWFW).\r\n- Debit Authorisation Request message, sent to the case creator/case assigner, if the payment instruction has reached an incorrect creditor.\r\nThe UnableToApply message has the following main characteristics:\r\nThe case creator (the instructed party/creditor of a payment instruction) assigns a unique case identification and optionally the reason code for the Unable To Apply message. This information will be passed unchanged to all subsequent case assignees.\r\nThe case creator specifies the identification of the underlying payment instruction. This identification needs to be updated by the subsequent case assigner(s) in order to match the one used with their case assignee(s).\r\nThe Unable To Apply Justification element allows the assigner to indicate whether a specific element causes the unable to apply situation (incorrect element and/or mismatched element can be listed) or whether any supplementary information needs to be forwarded.";
				nextVersions_lazy = () -> Arrays.asList(UnableToApplyV05.mmObject());
				previousVersion_lazy = () -> UnableToApplyV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "UblToApply";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.UnableToApplyV04.mmAssignment, com.tools20022.repository.area.camt.UnableToApplyV04.mmCase,
						com.tools20022.repository.area.camt.UnableToApplyV04.mmUnderlying, com.tools20022.repository.area.camt.UnableToApplyV04.mmJustification, com.tools20022.repository.area.camt.UnableToApplyV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "026";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return UnableToApplyV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment3 getAssignment() {
		return assignment;
	}

	public UnableToApplyV04 setAssignment(CaseAssignment3 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Case3 getCase() {
		return case_;
	}

	public UnableToApplyV04 setCase(Case3 case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	public UnderlyingTransaction2Choice getUnderlying() {
		return underlying;
	}

	public UnableToApplyV04 setUnderlying(UnderlyingTransaction2Choice underlying) {
		this.underlying = Objects.requireNonNull(underlying);
		return this;
	}

	public UnableToApplyJustification2Choice getJustification() {
		return justification;
	}

	public UnableToApplyV04 setJustification(UnableToApplyJustification2Choice justification) {
		this.justification = Objects.requireNonNull(justification);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public UnableToApplyV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.026.001.04")
	static public class Document {
		@XmlElement(name = "UblToApply", required = true)
		public UnableToApplyV04 messageBody;
	}
}