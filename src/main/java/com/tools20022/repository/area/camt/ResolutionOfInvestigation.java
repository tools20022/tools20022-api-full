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
import com.tools20022.repository.choice.InvestigationStatusChoice;
import com.tools20022.repository.msg.Case;
import com.tools20022.repository.msg.CaseAssignment;
import com.tools20022.repository.msg.PaymentInstructionExtract;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Resolution Of Investigation message is sent by a case assignee to a case
 * creator/case assigner.<br>
 * This message is used to inform of the resolution of a case, and optionally
 * provides details about .<br>
 * - the corrective action undertaken by the case assignee<br>
 * - information on the return where applicable<br>
 * <b>Usage</b><br>
 * The Resolution Of Investigation message is used by the case assignee to
 * inform a case creator or case assigner about the resolution of a:<br>
 * - request to cancel payment case<br>
 * - request to modify payment case<br>
 * - unable to apply case<br>
 * - claim non receipt case<br>
 * The Resolution Of Investigation message covers one and only one case at a
 * time. If the case assignee needs to communicate about several cases, then
 * several Resolution Of Investigation messages must be sent.<br>
 * The Resolution Of Investigation message provides:<br>
 * - the final outcome of the case, whether positive or negative<br>
 * - optionally, the details of the corrective action undertaken by the case
 * assignee and the information of the return<br>
 * Whenever a payment instruction has been generated to solve the case under
 * investigation, the optional CorrectionTransaction component present in the
 * message must be completed.<br>
 * Whenever the action of modifying or cancelling a payment results in funds
 * being returned, an investigating agent may attached some details in this
 * message. These details facilitates the account reconciliations at the
 * initiating bank and the intermediaries. It must be stressed that returning of
 * funds is outside the scope of this Exceptions and Investigation service. The
 * features given here is only meant to transmit the information of returns when
 * it is available.<br>
 * The Resolution Of Investigation message must<br>
 * - be forwarded by all subsequent case assignee(s) until it reaches the case
 * creator<br>
 * - not be used in place of a Reject Case Assignment or Case Status Report or
 * Notification Of Case Assignment message.<br>
 * Take note of an exceptional rule that allows the use of Resolution Of
 * Investigation in lieu of a Case Status Report. Case Status Report is a
 * response-message to a Case Status Report Request. The latter which is sent
 * when the assigner has waited too long (by his standard) for an answer.
 * However it may happen that when the Request arrives, the investigating agent
 * has just obtained a resolution. In such a situation, it would be redundant to
 * send a Case Status Report when then followed immediately by a Resolution Of
 * Investigation. It is therefore quite acceptable for the investigating agent,
 * the assignee, to skip the Case Status Report and send the Resolution Of
 * Investigation message directly.
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
 * xmlName} = "camt.029.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "camt.029.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigation#mmAssignment
 * ResolutionOfInvestigation.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigation#mmResolvedCase
 * ResolutionOfInvestigation.mmResolvedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigation#mmStatus
 * ResolutionOfInvestigation.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigation#mmCorrectionTransaction
 * ResolutionOfInvestigation.mmCorrectionTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.029.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResolutionOfInvestigation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Resolution Of Investigation message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform of the resolution of a case, and optionally provides details about .\r\n- the corrective action undertaken by the case assignee\r\n- information on the return where applicable\r\nUsage\r\nThe Resolution Of Investigation message is used by the case assignee to inform a case creator or case assigner about the resolution of a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe Resolution Of Investigation message covers one and only one case at a time. If the case assignee needs to communicate about several cases, then several Resolution Of Investigation messages must be sent.\r\nThe Resolution Of Investigation message provides:\r\n- the final outcome of the case, whether positive or negative\r\n- optionally, the details of the corrective action undertaken by the case assignee and the information of the return\r\nWhenever a payment instruction has been generated to solve the case under investigation, the optional CorrectionTransaction component present in the message must be completed.\r\nWhenever the action of modifying or cancelling a payment results in funds being returned, an investigating agent may attached some details in this message. These details facilitates the account reconciliations at the initiating bank and the intermediaries. It must be stressed that returning of funds is outside the scope of this Exceptions and Investigation service. The features given here is only meant to transmit the information of returns when it is available.\r\nThe Resolution Of Investigation message must\r\n- be forwarded by all subsequent case assignee(s) until it reaches the case creator\r\n- not be used in place of a Reject Case Assignment or Case Status Report or Notification Of Case Assignment message.\r\nTake note of an exceptional rule that allows the use of Resolution Of Investigation in lieu of a Case Status Report. Case Status Report is a response-message to a Case Status Report Request. The latter which is sent when the assigner has waited too long (by his standard) for an answer. However it may happen that when the Request arrives, the investigating agent has just obtained a resolution. In such a situation, it would be redundant to send a Case Status Report when then followed immediately by a Resolution Of Investigation. It is therefore quite acceptable for the investigating agent, the assignee, to skip the Case Status Report and send the Resolution Of Investigation message directly."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "camt.029.001.01", propOrder = {"assignment", "resolvedCase", "status", "correctionTransaction"})
public class ResolutionOfInvestigation {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected CaseAssignment assignment;
	/**
	 * Note: the Assigner must be the sender of this confirmation and the
	 * Assignee must be the receiver.
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
	 * definition} =
	 * "Note: the Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Note: the Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ResolutionOfInvestigation.class.getMethod("getAssignment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Case resolvedCase;
	/**
	 * Identifies a resolved case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case Case}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RslvdCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolvedCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a resolved case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmResolvedCase = new MMMessageBuildingBlock() {
		{
			xmlTag = "RslvdCase";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolvedCase";
			definition = "Identifies a resolved case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ResolutionOfInvestigation.class.getMethod("getResolvedCase", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestigationStatusChoice status;
	/**
	 * Indicates the status of the investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatusChoice
	 * InvestigationStatusChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the status of the investigation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Indicates the status of the investigation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestigationStatusChoice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ResolutionOfInvestigation.class.getMethod("getStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentInstructionExtract correctionTransaction;
	/**
	 * References a transaction intitiated to fix the case under investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract
	 * PaymentInstructionExtract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrrctnTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrectionTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "References a transaction intitiated to fix the case under investigation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorrectionTransaction = new MMMessageBuildingBlock() {
		{
			xmlTag = "CrrctnTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrectionTransaction";
			definition = "References a transaction intitiated to fix the case under investigation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PaymentInstructionExtract.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ResolutionOfInvestigation.class.getMethod("getCorrectionTransaction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResolutionOfInvestigation";
				definition = "Scope\r\nThe Resolution Of Investigation message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform of the resolution of a case, and optionally provides details about .\r\n- the corrective action undertaken by the case assignee\r\n- information on the return where applicable\r\nUsage\r\nThe Resolution Of Investigation message is used by the case assignee to inform a case creator or case assigner about the resolution of a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe Resolution Of Investigation message covers one and only one case at a time. If the case assignee needs to communicate about several cases, then several Resolution Of Investigation messages must be sent.\r\nThe Resolution Of Investigation message provides:\r\n- the final outcome of the case, whether positive or negative\r\n- optionally, the details of the corrective action undertaken by the case assignee and the information of the return\r\nWhenever a payment instruction has been generated to solve the case under investigation, the optional CorrectionTransaction component present in the message must be completed.\r\nWhenever the action of modifying or cancelling a payment results in funds being returned, an investigating agent may attached some details in this message. These details facilitates the account reconciliations at the initiating bank and the intermediaries. It must be stressed that returning of funds is outside the scope of this Exceptions and Investigation service. The features given here is only meant to transmit the information of returns when it is available.\r\nThe Resolution Of Investigation message must\r\n- be forwarded by all subsequent case assignee(s) until it reaches the case creator\r\n- not be used in place of a Reject Case Assignment or Case Status Report or Notification Of Case Assignment message.\r\nTake note of an exceptional rule that allows the use of Resolution Of Investigation in lieu of a Case Status Report. Case Status Report is a response-message to a Case Status Report Request. The latter which is sent when the assigner has waited too long (by his standard) for an answer. However it may happen that when the Request arrives, the investigating agent has just obtained a resolution. In such a situation, it would be redundant to send a Case Status Report when then followed immediately by a Resolution Of Investigation. It is therefore quite acceptable for the investigating agent, the assignee, to skip the Case Status Report and send the Resolution Of Investigation message directly.";
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "camt.029.001.01";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				xmlName = "camt.029.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ResolutionOfInvestigation.mmAssignment, com.tools20022.repository.area.camt.ResolutionOfInvestigation.mmResolvedCase,
						com.tools20022.repository.area.camt.ResolutionOfInvestigation.mmStatus, com.tools20022.repository.area.camt.ResolutionOfInvestigation.mmCorrectionTransaction);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "029";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ResolutionOfInvestigation.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Assgnmt", required = true)
	public CaseAssignment getAssignment() {
		return assignment;
	}

	public void setAssignment(CaseAssignment assignment) {
		this.assignment = assignment;
	}

	@XmlElement(name = "RslvdCase", required = true)
	public Case getResolvedCase() {
		return resolvedCase;
	}

	public void setResolvedCase(Case resolvedCase) {
		this.resolvedCase = resolvedCase;
	}

	@XmlElement(name = "Sts")
	public InvestigationStatusChoice getStatus() {
		return status;
	}

	public void setStatus(InvestigationStatusChoice status) {
		this.status = status;
	}

	@XmlElement(name = "CrrctnTx")
	public PaymentInstructionExtract getCorrectionTransaction() {
		return correctionTransaction;
	}

	public void setCorrectionTransaction(PaymentInstructionExtract correctionTransaction) {
		this.correctionTransaction = correctionTransaction;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.01.01")
	static public class Document {
		@XmlElement(name = "camt.029.001.01", required = true)
		public ResolutionOfInvestigation messageBody;
	}
}