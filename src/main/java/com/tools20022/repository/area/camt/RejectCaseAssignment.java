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
import com.tools20022.repository.msg.CaseAssignment;
import com.tools20022.repository.msg.CaseAssignmentRejectionJustification;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "camt.031.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "camt.031.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectCaseAssignment#Assignment
 * RejectCaseAssignment.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectCaseAssignment#Case
 * RejectCaseAssignment.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectCaseAssignment#Justification
 * RejectCaseAssignment.Justification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.camt.RejectCaseAssignment#identifier
 * RejectCaseAssignment.identifier}</li>
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
public class RejectCaseAssignment {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the assignment.
	 * <p>
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
	public static final MMMessageBuildingBlock Assignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> CaseAssignment.mmObject();
		}
	};
	/**
	 * Identifies the case.
	 * <p>
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
	public static final MMMessageBuildingBlock Case = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the case.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.Case.mmObject();
		}
	};
	/**
	 * Specifies the reason for not accepting a Case.
	 * <p>
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
	public static final MMMessageBuildingBlock Justification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Justfn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Justification";
			definition = "Specifies the reason for not accepting a Case.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> CaseAssignmentRejectionJustification.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "camt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "031"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "camt";
			messageFunctionality = "031";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RejectCaseAssignment";
				definition = "Scope\r\nThe Reject Case Assignment message is sent by a case assignee to a case creator or case assigner to reject a case given to him.\r\nUsage\r\nThe Reject Case Assignment message is used to notify the case creator or case assigner the rejection of an assignment by the case assignee in a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nRejecting a case assignment occurs when the case assignee is unable to trace the original payment instruction or when the case assignee is unable, or does not have authority, to process the assigned case.\r\nThe Reject Case Assignment message covers one and only one case at a time. If the case assignee needs to reject several case assignments, then multiple Reject Case Assignment messages must be sent.\r\nThe Reject Case Assignment message must be forwarded by all subsequent case assignee(s) until it reaches the case assigner.\r\nThe Reject Case Assignment message must not be used in place of a Resolution Of Investigation or Case Status Report message.";
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "camt.031.001.01";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				xmlName = "camt.031.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.RejectCaseAssignment.Assignment, com.tools20022.repository.area.camt.RejectCaseAssignment.Case,
						com.tools20022.repository.area.camt.RejectCaseAssignment.Justification);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.camt.RejectCaseAssignment.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}