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
import com.tools20022.repository.choice.UnderlyingTransaction1Choice;
import com.tools20022.repository.msg.Case2;
import com.tools20022.repository.msg.CaseAssignment2;
import com.tools20022.repository.msg.RequestedModification2;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Request To Modify Payment message is sent by a case creator/case assigner
 * to a case assignee.<br>
 * This message is used to request the modification of characteristics of an
 * original payment instruction.<br>
 * <b>Usage</b><br>
 * The Request To Modify Payment message must be answered with a:<br>
 * - Resolution Of Investigation message with a positive final outcome when the
 * case assignee can perform the requested modification<br>
 * - Resolution Of Investigation message with a negative final outcome when the
 * case assignee may perform the requested modification but fails to do so (too
 * late, irrevocable instruction, one requested element cannot be modified.)<br>
 * - Reject Case Assignment message when the case assignee is unable or not
 * authorised to perform the requested modification<br>
 * - Notification Of Case Assignment message to indicate whether the case
 * assignee will take on the case himself or reassign the case to a subsequent
 * party in the payment processing chain.<br>
 * The Request To Modify Payment message covers one and only one original
 * instruction at a time. If several original payment instructions need to be
 * modified, then multiple Request To Modify Payment messages must be sent.<br>
 * The Request To Modify Payment message can be sent to request the modification
 * of one or several elements of the original payment instruction. If many
 * elements need to be modified, it is recommended to cancel the original
 * payment instruction and initiate a new one.<br>
 * The Request To Modify Payment must be processed on an all or nothing basis.
 * If one of the elements to be modified cannot be altered, the assignment must
 * be rejected in full by means of a negative Resolution Of Investigation
 * message. (See section on Resolution Of Investigation for more details.)<br>
 * The Request To Modify Payment message must never be sent to request the
 * modification of the currency of the original payment instruction. If the
 * currency is wrong, use Request To Cancel Payment message to cancel it and
 * issue and a new payment instruction.<br>
 * The Request To Modify Payment message may be forwarded to subsequent case
 * assignee(s).<br>
 * When a Request To Modify Payment message is used to decrease the amount of
 * the original payment instruction, the modification will trigger a return of
 * funds from the case assignee to the case creator. The assignee may indicate,
 * within the Resolution Of Investigation message, the amount to be returned,
 * the date it is or will be returned and the channel through which the return
 * will be done.<br>
 * The Request To Modify Payment message must never be sent to request the
 * increase of the amount of the original payment instruction. To increase the
 * amount in a payment, the debtor can do one of the following:<br>
 * - Cancel the first payment using a Request To Cancel Payment message and make
 * a new payment with a higher and correct amount.<br>
 * - Simply send a second payment with the supplementary amount.<br>
 * Depending on the requested modification(s) and the processing stage of the
 * original payment instruction, the processing of a request to modify payment
 * case may end with one of the following:<br>
 * - an Additional Payment Information message sent to the creditor of the
 * original payment instruction<br>
 * - a Debit Authorisation Request message sent to the creditor of the original
 * payment instruction<br>
 * - a Request To Cancel Payment message sent to a subsequent case assignee<br>
 * The Request To Modify Payment message can be sent to correct characteristics
 * of an original payment instruction following receipt of an Unable To Apply
 * message. In this scenario, the case identification will remain the same.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.007.002.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03_replaced#mmAssignment
 * RequestToModifyPaymentV03_replaced.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03_replaced#mmCase
 * RequestToModifyPaymentV03_replaced.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03_replaced#mmUnderlying
 * RequestToModifyPaymentV03_replaced.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03_replaced#mmModification
 * RequestToModifyPaymentV03_replaced.mmModification}</li>
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
 * xmlTag} = "ReqToModfyPmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestToModifyPaymentV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Request To Modify Payment message is sent by a case creator/case assigner to a case assignee.\r\nThis message is used to request the modification of characteristics of an original payment instruction.\r\nUsage\r\nThe Request To Modify Payment message must be answered with a:\r\n- Resolution Of Investigation message with a positive final outcome when the case assignee can perform the requested modification\r\n- Resolution Of Investigation message with a negative final outcome when the case assignee may perform the requested modification but fails to do so (too late, irrevocable instruction, one requested element cannot be modified.)\r\n- Reject Case Assignment message when the case assignee is unable or not authorised to perform the requested modification\r\n- Notification Of Case Assignment message to indicate whether the case assignee will take on the case himself or reassign the case to a subsequent party in the payment processing chain.\r\nThe Request To Modify Payment message covers one and only one original instruction at a time. If several original payment instructions need to be modified, then multiple Request To Modify Payment messages must be sent.\r\nThe Request To Modify Payment message can be sent to request the modification of one or several elements of the original payment instruction. If many elements need to be modified, it is recommended to cancel the original payment instruction and initiate a new one.\r\nThe Request To Modify Payment must be processed on an all or nothing basis. If one of the elements to be modified cannot be altered, the assignment must be rejected in full by means of a negative Resolution Of Investigation message. (See section on Resolution Of Investigation for more details.)\r\nThe Request To Modify Payment message must never be sent to request the modification of the currency of the original payment instruction. If the currency is wrong, use Request To Cancel Payment message to cancel it and issue and a new payment instruction.\r\nThe Request To Modify Payment message may be forwarded to subsequent case assignee(s).\r\nWhen a Request To Modify Payment message is used to decrease the amount of the original payment instruction, the modification will trigger a return of funds from the case assignee to the case creator. The assignee may indicate, within the Resolution Of Investigation message, the amount to be returned, the date it is or will be returned and the channel through which the return will be done.\r\nThe Request To Modify Payment message must never be sent to request the increase of the amount of the original payment instruction. To increase the amount in a payment, the debtor can do one of the following:\r\n- Cancel the first payment using a Request To Cancel Payment message and make a new payment with a higher and correct amount.\r\n- Simply send a second payment with the supplementary amount.\r\nDepending on the requested modification(s) and the processing stage of the original payment instruction, the processing of a request to modify payment case may end with one of the following:\r\n- an Additional Payment Information message sent to the creditor of the original payment instruction\r\n- a Debit Authorisation Request message sent to the creditor of the original payment instruction\r\n- a Request To Cancel Payment message sent to a subsequent case assignee\r\nThe Request To Modify Payment message can be sent to correct characteristics of an original payment instruction following receipt of an Unable To Apply message. In this scenario, the case identification will remain the same."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV01
 * RequestToModifyPaymentV01}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequestToModifyPaymentV03", propOrder = {"assignment", "case_", "underlying", "modification"})
public class RequestToModifyPaymentV03_replaced {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment2 assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment2
	 * CaseAssignment2}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RequestToModifyPaymentV03_replaced, CaseAssignment2> mmAssignment = new MMMessageBuildingBlock<RequestToModifyPaymentV03_replaced, CaseAssignment2>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment2.mmObject();
		}

		@Override
		public CaseAssignment2 getValue(RequestToModifyPaymentV03_replaced obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(RequestToModifyPaymentV03_replaced obj, CaseAssignment2 value) {
			obj.setAssignment(value);
		}
	};
	@XmlElement(name = "Case", required = true)
	protected Case2 case_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case2 Case2}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RequestToModifyPaymentV03_replaced, Case2> mmCase = new MMMessageBuildingBlock<RequestToModifyPaymentV03_replaced, Case2>() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case2.mmObject();
		}

		@Override
		public Case2 getValue(RequestToModifyPaymentV03_replaced obj) {
			return obj.getCase();
		}

		@Override
		public void setValue(RequestToModifyPaymentV03_replaced obj, Case2 value) {
			obj.setCase(value);
		}
	};
	@XmlElement(name = "Undrlyg", required = true)
	protected UnderlyingTransaction1Choice underlying;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice
	 * UnderlyingTransaction1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Undrlyg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Underlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the payment transaction to be modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RequestToModifyPaymentV03_replaced, UnderlyingTransaction1Choice> mmUnderlying = new MMMessageBuildingBlock<RequestToModifyPaymentV03_replaced, UnderlyingTransaction1Choice>() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "Identifies the payment transaction to be modified.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnderlyingTransaction1Choice.mmObject();
		}

		@Override
		public UnderlyingTransaction1Choice getValue(RequestToModifyPaymentV03_replaced obj) {
			return obj.getUnderlying();
		}

		@Override
		public void setValue(RequestToModifyPaymentV03_replaced obj, UnderlyingTransaction1Choice value) {
			obj.setUnderlying(value);
		}
	};
	@XmlElement(name = "Mod", required = true)
	protected RequestedModification2 modification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2
	 * RequestedModification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mod"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the list of modifications requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RequestToModifyPaymentV03_replaced, RequestedModification2> mmModification = new MMMessageBuildingBlock<RequestToModifyPaymentV03_replaced, RequestedModification2>() {
		{
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Identifies the list of modifications requested.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> RequestedModification2.mmObject();
		}

		@Override
		public RequestedModification2 getValue(RequestToModifyPaymentV03_replaced obj) {
			return obj.getModification();
		}

		@Override
		public void setValue(RequestToModifyPaymentV03_replaced obj, RequestedModification2 value) {
			obj.setModification(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestToModifyPaymentV03";
				definition = "Scope\r\nThe Request To Modify Payment message is sent by a case creator/case assigner to a case assignee.\r\nThis message is used to request the modification of characteristics of an original payment instruction.\r\nUsage\r\nThe Request To Modify Payment message must be answered with a:\r\n- Resolution Of Investigation message with a positive final outcome when the case assignee can perform the requested modification\r\n- Resolution Of Investigation message with a negative final outcome when the case assignee may perform the requested modification but fails to do so (too late, irrevocable instruction, one requested element cannot be modified.)\r\n- Reject Case Assignment message when the case assignee is unable or not authorised to perform the requested modification\r\n- Notification Of Case Assignment message to indicate whether the case assignee will take on the case himself or reassign the case to a subsequent party in the payment processing chain.\r\nThe Request To Modify Payment message covers one and only one original instruction at a time. If several original payment instructions need to be modified, then multiple Request To Modify Payment messages must be sent.\r\nThe Request To Modify Payment message can be sent to request the modification of one or several elements of the original payment instruction. If many elements need to be modified, it is recommended to cancel the original payment instruction and initiate a new one.\r\nThe Request To Modify Payment must be processed on an all or nothing basis. If one of the elements to be modified cannot be altered, the assignment must be rejected in full by means of a negative Resolution Of Investigation message. (See section on Resolution Of Investigation for more details.)\r\nThe Request To Modify Payment message must never be sent to request the modification of the currency of the original payment instruction. If the currency is wrong, use Request To Cancel Payment message to cancel it and issue and a new payment instruction.\r\nThe Request To Modify Payment message may be forwarded to subsequent case assignee(s).\r\nWhen a Request To Modify Payment message is used to decrease the amount of the original payment instruction, the modification will trigger a return of funds from the case assignee to the case creator. The assignee may indicate, within the Resolution Of Investigation message, the amount to be returned, the date it is or will be returned and the channel through which the return will be done.\r\nThe Request To Modify Payment message must never be sent to request the increase of the amount of the original payment instruction. To increase the amount in a payment, the debtor can do one of the following:\r\n- Cancel the first payment using a Request To Cancel Payment message and make a new payment with a higher and correct amount.\r\n- Simply send a second payment with the supplementary amount.\r\nDepending on the requested modification(s) and the processing stage of the original payment instruction, the processing of a request to modify payment case may end with one of the following:\r\n- an Additional Payment Information message sent to the creditor of the original payment instruction\r\n- a Debit Authorisation Request message sent to the creditor of the original payment instruction\r\n- a Request To Cancel Payment message sent to a subsequent case assignee\r\nThe Request To Modify Payment message can be sent to correct characteristics of an original payment instruction following receipt of an Unable To Apply message. In this scenario, the case identification will remain the same.";
				nextVersions_lazy = () -> Arrays.asList(RequestToModifyPaymentV01.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "ReqToModfyPmt";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.RequestToModifyPaymentV03_replaced.mmAssignment, com.tools20022.repository.area.camt.RequestToModifyPaymentV03_replaced.mmCase,
						com.tools20022.repository.area.camt.RequestToModifyPaymentV03_replaced.mmUnderlying, com.tools20022.repository.area.camt.RequestToModifyPaymentV03_replaced.mmModification);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "007";
						version = "03";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RequestToModifyPaymentV03_replaced.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment2 getAssignment() {
		return assignment;
	}

	public RequestToModifyPaymentV03_replaced setAssignment(CaseAssignment2 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Case2 getCase() {
		return case_;
	}

	public RequestToModifyPaymentV03_replaced setCase(Case2 case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	public UnderlyingTransaction1Choice getUnderlying() {
		return underlying;
	}

	public RequestToModifyPaymentV03_replaced setUnderlying(UnderlyingTransaction1Choice underlying) {
		this.underlying = Objects.requireNonNull(underlying);
		return this;
	}

	public RequestedModification2 getModification() {
		return modification;
	}

	public RequestToModifyPaymentV03_replaced setModification(RequestedModification2 modification) {
		this.modification = Objects.requireNonNull(modification);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.007.002.03")
	static public class Document {
		@XmlElement(name = "ReqToModfyPmt", required = true)
		public RequestToModifyPaymentV03_replaced messageBody;
	}
}