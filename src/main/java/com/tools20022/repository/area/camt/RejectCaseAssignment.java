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
import com.tools20022.repository.msg.Case;
import com.tools20022.repository.msg.CaseAssignment;
import com.tools20022.repository.msg.CaseAssignmentRejectionJustification;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Reject Case Assignment message is sent by a case assignee to a case
 * creator or case assigner to reject a case given to him.<br>
 * <b>Usage</b><br>
 * The Reject Case Assignment message is used to notify the case creator or case
 * assigner the rejection of an assignment by the case assignee in a:<br>
 * - request to cancel payment case<br>
 * - request to modify payment case<br>
 * - unable to apply case<br>
 * - claim non receipt case<br>
 * Rejecting a case assignment occurs when the case assignee is unable to trace
 * the original payment instruction or when the case assignee is unable, or does
 * not have authority, to process the assigned case.<br>
 * The Reject Case Assignment message covers one and only one case at a time. If
 * the case assignee needs to reject several case assignments, then multiple
 * Reject Case Assignment messages must be sent.<br>
 * The Reject Case Assignment message must be forwarded by all subsequent case
 * assignee(s) until it reaches the case assigner.<br>
 * The Reject Case Assignment message must not be used in place of a Resolution
 * Of Investigation or Case Status Report message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectCaseAssignment#mmAssignment
 * RejectCaseAssignment.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectCaseAssignment#mmCase
 * RejectCaseAssignment.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectCaseAssignment#mmJustification
 * RejectCaseAssignment.mmJustification}</li>
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
 * xmlTag} = "camt.031.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "camt.031.001.01"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.031.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectCaseAssignment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Reject Case Assignment message is sent by a case assignee to a case creator or case assigner to reject a case given to him.\r\nUsage\r\nThe Reject Case Assignment message is used to notify the case creator or case assigner the rejection of an assignment by the case assignee in a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nRejecting a case assignment occurs when the case assignee is unable to trace the original payment instruction or when the case assignee is unable, or does not have authority, to process the assigned case.\r\nThe Reject Case Assignment message covers one and only one case at a time. If the case assignee needs to reject several case assignments, then multiple Reject Case Assignment messages must be sent.\r\nThe Reject Case Assignment message must be forwarded by all subsequent case assignee(s) until it reaches the case assigner.\r\nThe Reject Case Assignment message must not be used in place of a Resolution Of Investigation or Case Status Report message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "camt.031.001.01", propOrder = {"assignment", "case_", "justification"})
public class RejectCaseAssignment {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment
	 * CaseAssignment}</li>
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
	 * definition} = "Identifies the assignment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RejectCaseAssignment, CaseAssignment> mmAssignment = new MMMessageBuildingBlock<RejectCaseAssignment, CaseAssignment>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment.mmObject();
		}

		@Override
		public CaseAssignment getValue(RejectCaseAssignment obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(RejectCaseAssignment obj, CaseAssignment value) {
			obj.setAssignment(value);
		}
	};
	@XmlElement(name = "Case", required = true)
	protected Case case_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case Case}</li>
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
	 * definition} = "Identifies the case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RejectCaseAssignment, Case> mmCase = new MMMessageBuildingBlock<RejectCaseAssignment, Case>() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case.mmObject();
		}

		@Override
		public Case getValue(RejectCaseAssignment obj) {
			return obj.getCase();
		}

		@Override
		public void setValue(RejectCaseAssignment obj, Case value) {
			obj.setCase(value);
		}
	};
	@XmlElement(name = "Justfn", required = true)
	protected CaseAssignmentRejectionJustification justification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CaseAssignmentRejectionJustification
	 * CaseAssignmentRejectionJustification}</li>
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
	 * definition} = "Specifies the reason for not accepting a Case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RejectCaseAssignment, CaseAssignmentRejectionJustification> mmJustification = new MMMessageBuildingBlock<RejectCaseAssignment, CaseAssignmentRejectionJustification>() {
		{
			xmlTag = "Justfn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Justification";
			definition = "Specifies the reason for not accepting a Case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignmentRejectionJustification.mmObject();
		}

		@Override
		public CaseAssignmentRejectionJustification getValue(RejectCaseAssignment obj) {
			return obj.getJustification();
		}

		@Override
		public void setValue(RejectCaseAssignment obj, CaseAssignmentRejectionJustification value) {
			obj.setJustification(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectCaseAssignment";
				definition = "Scope\r\nThe Reject Case Assignment message is sent by a case assignee to a case creator or case assigner to reject a case given to him.\r\nUsage\r\nThe Reject Case Assignment message is used to notify the case creator or case assigner the rejection of an assignment by the case assignee in a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nRejecting a case assignment occurs when the case assignee is unable to trace the original payment instruction or when the case assignee is unable, or does not have authority, to process the assigned case.\r\nThe Reject Case Assignment message covers one and only one case at a time. If the case assignee needs to reject several case assignments, then multiple Reject Case Assignment messages must be sent.\r\nThe Reject Case Assignment message must be forwarded by all subsequent case assignee(s) until it reaches the case assigner.\r\nThe Reject Case Assignment message must not be used in place of a Resolution Of Investigation or Case Status Report message.";
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "camt.031.001.01";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				xmlName = "camt.031.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.RejectCaseAssignment.mmAssignment, com.tools20022.repository.area.camt.RejectCaseAssignment.mmCase,
						com.tools20022.repository.area.camt.RejectCaseAssignment.mmJustification);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "031";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RejectCaseAssignment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment getAssignment() {
		return assignment;
	}

	public RejectCaseAssignment setAssignment(CaseAssignment assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Case getCase() {
		return case_;
	}

	public RejectCaseAssignment setCase(Case case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	public CaseAssignmentRejectionJustification getJustification() {
		return justification;
	}

	public RejectCaseAssignment setJustification(CaseAssignmentRejectionJustification justification) {
		this.justification = Objects.requireNonNull(justification);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.031.001.01")
	static public class Document {
		@XmlElement(name = "camt.031.001.01", required = true)
		public RejectCaseAssignment messageBody;
	}
}