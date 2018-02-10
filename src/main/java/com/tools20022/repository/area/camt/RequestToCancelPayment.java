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
import com.tools20022.repository.msg.DebitAuthorisationDetails;
import com.tools20022.repository.msg.PaymentInstructionExtract;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Request To Cancel Payment message is sent by a case creator/case assigner
 * to a case assignee.<br>
 * This message is used to request the cancellation of an original payment
 * instruction.<br>
 * <b>Usage</b><br>
 * The Request To Cancel Payment message must be answered with a:<br>
 * - Resolution Of Investigation message with a positive final outcome when the
 * case assignee can perform the requested cancellation<br>
 * - Resolution Of Investigation message with a negative final outcome when the
 * case assignee may perform the requested cancellation but fails to do so (too
 * late, irrevocable instruction.)<br>
 * - Reject Case Assignment message when the case assignee is unable or not
 * authorised to perform the requested cancellation<br>
 * - Notification Of Case Assignment message to indicate whether the case
 * assignee will take on the case himself or reassign the case to a subsequent
 * party in the payment processing chain.<br>
 * A Request To Cancel Payment message concerns one and only one original
 * payment instruction at a time. If several original payment instructions need
 * to be cancelled, then multiple Request To Cancel Payment messages must be
 * sent.<br>
 * When a case assignee successfully performs a cancellation, it must return the
 * corresponding funds to the case assigner. It may provide some details about
 * the return in the Resolution Of Investigation message.<br>
 * The processing of a request to cancel payment case may end with a Debit
 * Authorisation Request message sent to the creditor by its account servicing
 * institution.<br>
 * The Request To Cancel Payment message may be used to escalate a case after an
 * unsuccessful request to modify the payment. In this scenario, the case
 * identification remains the same as in the original Request To Modify Payment
 * message and the element ReopenCaseIndication is set to 'Yes' or 'true'.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToCancelPayment#mmAssignment
 * RequestToCancelPayment.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToCancelPayment#mmCase
 * RequestToCancelPayment.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToCancelPayment#mmUnderlying
 * RequestToCancelPayment.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToCancelPayment#mmJustification
 * RequestToCancelPayment.mmJustification}</li>
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
 * xmlTag} = "camt.008.002.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "camt.008.002.01"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.008.002.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestToCancelPayment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Request To Cancel Payment message is sent by a case creator/case assigner to a case assignee.\r\nThis message is used to request the cancellation of an original payment instruction.\r\nUsage\r\nThe Request To Cancel Payment message must be answered with a:\r\n- Resolution Of Investigation message with a positive final outcome when the case assignee can perform the requested cancellation\r\n- Resolution Of Investigation message with a negative final outcome when the case assignee may perform the requested cancellation but fails to do so (too late, irrevocable instruction.)\r\n- Reject Case Assignment message when the case assignee is unable or not authorised to perform the requested cancellation\r\n- Notification Of Case Assignment message to indicate whether the case assignee will take on the case himself or reassign the case to a subsequent party in the payment processing chain.\r\nA Request To Cancel Payment message concerns one and only one original payment instruction at a time. If several original payment instructions need to be cancelled, then multiple Request To Cancel Payment messages must be sent.\r\nWhen a case assignee successfully performs a cancellation, it must return the corresponding funds to the case assigner. It may provide some details about the return in the Resolution Of Investigation message.\r\nThe processing of a request to cancel payment case may end with a Debit Authorisation Request message sent to the creditor by its account servicing institution.\r\nThe Request To Cancel Payment message may be used to escalate a case after an unsuccessful request to modify the payment. In this scenario, the case identification remains the same as in the original Request To Modify Payment message and the element ReopenCaseIndication is set to 'Yes' or 'true'."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "camt.008.002.01", propOrder = {"assignment", "case_", "underlying", "justification"})
public class RequestToCancelPayment {

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
	 * definition} =
	 * "Identifies the assignment of a case from an assigner to an assignee."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of a case from an assigner to an assignee.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestToCancelPayment.class.getMethod("getAssignment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmCase = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestToCancelPayment.class.getMethod("getCase", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Undrlyg", required = true)
	protected PaymentInstructionExtract underlying;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract
	 * PaymentInstructionExtract}</li>
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
	 * definition} = "Identifies the payment instruction to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUnderlying = new MMMessageBuildingBlock() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "Identifies the payment instruction to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstructionExtract.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestToCancelPayment.class.getMethod("getUnderlying", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Justfn", required = true)
	protected DebitAuthorisationDetails justification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationDetails
	 * DebitAuthorisationDetails}</li>
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
	 * definition} = "Defines the reason for requesting the cancellation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmJustification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Justfn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Justification";
			definition = "Defines the reason for requesting the cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DebitAuthorisationDetails.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestToCancelPayment.class.getMethod("getJustification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestToCancelPayment";
				definition = "Scope\r\nThe Request To Cancel Payment message is sent by a case creator/case assigner to a case assignee.\r\nThis message is used to request the cancellation of an original payment instruction.\r\nUsage\r\nThe Request To Cancel Payment message must be answered with a:\r\n- Resolution Of Investigation message with a positive final outcome when the case assignee can perform the requested cancellation\r\n- Resolution Of Investigation message with a negative final outcome when the case assignee may perform the requested cancellation but fails to do so (too late, irrevocable instruction.)\r\n- Reject Case Assignment message when the case assignee is unable or not authorised to perform the requested cancellation\r\n- Notification Of Case Assignment message to indicate whether the case assignee will take on the case himself or reassign the case to a subsequent party in the payment processing chain.\r\nA Request To Cancel Payment message concerns one and only one original payment instruction at a time. If several original payment instructions need to be cancelled, then multiple Request To Cancel Payment messages must be sent.\r\nWhen a case assignee successfully performs a cancellation, it must return the corresponding funds to the case assigner. It may provide some details about the return in the Resolution Of Investigation message.\r\nThe processing of a request to cancel payment case may end with a Debit Authorisation Request message sent to the creditor by its account servicing institution.\r\nThe Request To Cancel Payment message may be used to escalate a case after an unsuccessful request to modify the payment. In this scenario, the case identification remains the same as in the original Request To Modify Payment message and the element ReopenCaseIndication is set to 'Yes' or 'true'.";
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "camt.008.002.01";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				xmlName = "camt.008.002.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.RequestToCancelPayment.mmAssignment, com.tools20022.repository.area.camt.RequestToCancelPayment.mmCase,
						com.tools20022.repository.area.camt.RequestToCancelPayment.mmUnderlying, com.tools20022.repository.area.camt.RequestToCancelPayment.mmJustification);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "008";
						version = "01";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RequestToCancelPayment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment getAssignment() {
		return assignment;
	}

	public RequestToCancelPayment setAssignment(CaseAssignment assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Case getCase() {
		return case_;
	}

	public RequestToCancelPayment setCase(Case case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	public PaymentInstructionExtract getUnderlying() {
		return underlying;
	}

	public RequestToCancelPayment setUnderlying(PaymentInstructionExtract underlying) {
		this.underlying = Objects.requireNonNull(underlying);
		return this;
	}

	public DebitAuthorisationDetails getJustification() {
		return justification;
	}

	public RequestToCancelPayment setJustification(DebitAuthorisationDetails justification) {
		this.justification = Objects.requireNonNull(justification);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.008.002.01")
	static public class Document {
		@XmlElement(name = "camt.008.002.01", required = true)
		public RequestToCancelPayment messageBody;
	}
}