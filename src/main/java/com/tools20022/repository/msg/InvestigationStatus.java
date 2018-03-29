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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code;
import com.tools20022.repository.codeset.PaymentModificationRejection1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestigationResolution;
import com.tools20022.repository.entity.PaymentInvestigationCaseRejection;
import com.tools20022.repository.entity.PaymentInvestigationCaseResolution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Case;
import com.tools20022.repository.msg.RejectedCancellationJustification;
import com.tools20022.repository.msg.ReturnInformation1;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between different statuses of an investigation case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#InvestigationStatusXorChoiceRule
 * InvestigationStatus.InvestigationStatusXorChoiceRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#mmConfirmation
 * InvestigationStatus.mmConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#mmRejectedModification
 * InvestigationStatus.mmRejectedModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#mmRejectedCancellation
 * InvestigationStatus.mmRejectedCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#mmDuplicateOf
 * InvestigationStatus.mmDuplicateOf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#mmAssignmentCancellationConfirmation
 * InvestigationStatus.mmAssignmentCancellationConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#mmReturnInformation
 * InvestigationStatus.mmReturnInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
 * PaymentInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintConfirmationAndReturnInformation#forInvestigationStatus
 * ConstraintConfirmationAndReturnInformation.forInvestigationStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestigationStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between different statuses of an investigation case."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestigationStatus", propOrder = {"confirmation", "rejectedModification", "rejectedCancellation", "duplicateOf", "assignmentCancellationConfirmation", "returnInformation"})
public class InvestigationStatus {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Conf", required = true)
	protected InvestigationExecutionConfirmation2Code confirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code
	 * InvestigationExecutionConfirmation2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmInvestigationStatus
	 * PaymentInvestigationCaseResolution.mmInvestigationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestigationStatus
	 * InvestigationStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Conf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the status of an investigation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestigationStatus, InvestigationExecutionConfirmation2Code> mmConfirmation = new MMMessageAttribute<InvestigationStatus, InvestigationExecutionConfirmation2Code>() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseResolution.mmInvestigationStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestigationStatus.mmObject();
			isDerived = false;
			xmlTag = "Conf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmation";
			definition = "Indicates the status of an investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestigationExecutionConfirmation2Code.mmObject();
		}

		@Override
		public InvestigationExecutionConfirmation2Code getValue(InvestigationStatus obj) {
			return obj.getConfirmation();
		}

		@Override
		public void setValue(InvestigationStatus obj, InvestigationExecutionConfirmation2Code value) {
			obj.setConfirmation(value);
		}
	};
	@XmlElement(name = "RjctdMod", required = true)
	protected List<PaymentModificationRejection1Code> rejectedModification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRejectedModification
	 * PaymentInvestigationCaseRejection.mmRejectedModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestigationStatus
	 * InvestigationStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdMod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the rejection of a modification request, in a coded form."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestigationStatus, List<PaymentModificationRejection1Code>> mmRejectedModification = new MMMessageAttribute<InvestigationStatus, List<PaymentModificationRejection1Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseRejection.mmRejectedModification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestigationStatus.mmObject();
			isDerived = false;
			xmlTag = "RjctdMod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedModification";
			definition = "Reason for the rejection of a modification request, in a coded form.";
			maxOccurs = 14;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentModificationRejection1Code.mmObject();
		}

		@Override
		public List<PaymentModificationRejection1Code> getValue(InvestigationStatus obj) {
			return obj.getRejectedModification();
		}

		@Override
		public void setValue(InvestigationStatus obj, List<PaymentModificationRejection1Code> value) {
			obj.setRejectedModification(value);
		}
	};
	@XmlElement(name = "RjctdCxl", required = true)
	protected RejectedCancellationJustification rejectedCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RejectedCancellationJustification
	 * RejectedCancellationJustification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestigationStatus
	 * InvestigationStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdCxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Explains the reason for rejecting a payment cancellation request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestigationStatus, RejectedCancellationJustification> mmRejectedCancellation = new MMMessageAssociationEnd<InvestigationStatus, RejectedCancellationJustification>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestigationStatus.mmObject();
			isDerived = false;
			xmlTag = "RjctdCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedCancellation";
			definition = "Explains the reason for rejecting a payment cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedCancellationJustification.mmObject();
		}

		@Override
		public RejectedCancellationJustification getValue(InvestigationStatus obj) {
			return obj.getRejectedCancellation();
		}

		@Override
		public void setValue(InvestigationStatus obj, RejectedCancellationJustification value) {
			obj.setRejectedCancellation(value);
		}
	};
	@XmlElement(name = "DplctOf", required = true)
	protected Case duplicateOf;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Case Case}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationResolution#mmInvestigationCase
	 * InvestigationResolution.mmInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestigationStatus
	 * InvestigationStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DplctOf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateOf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a duplicated case. When present, the case identified in the message must be closed. The case identified as duplicated (in this component) will be pursued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestigationStatus, Case> mmDuplicateOf = new MMMessageAssociationEnd<InvestigationStatus, Case>() {
		{
			businessElementTrace_lazy = () -> InvestigationResolution.mmInvestigationCase;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestigationStatus.mmObject();
			isDerived = false;
			xmlTag = "DplctOf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateOf";
			definition = "Identifies a duplicated case. When present, the case identified in the message must be closed. The case identified as duplicated (in this component) will be pursued.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Case.mmObject();
		}

		@Override
		public Case getValue(InvestigationStatus obj) {
			return obj.getDuplicateOf();
		}

		@Override
		public void setValue(InvestigationStatus obj, Case value) {
			obj.setDuplicateOf(value);
		}
	};
	@XmlElement(name = "AssgnmtCxlConf", required = true)
	protected YesNoIndicator assignmentCancellationConfirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmAssignmentCancellationConfirmation
	 * PaymentInvestigationCaseRejection.mmAssignmentCancellationConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestigationStatus
	 * InvestigationStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssgnmtCxlConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssignmentCancellationConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If yes, it means the cancellation of the assignment is confirmed.\nIf no, it means the cancellation of the assignment is rejected and the investigation process will continue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestigationStatus, YesNoIndicator> mmAssignmentCancellationConfirmation = new MMMessageAttribute<InvestigationStatus, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseRejection.mmAssignmentCancellationConfirmation;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestigationStatus.mmObject();
			isDerived = false;
			xmlTag = "AssgnmtCxlConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssignmentCancellationConfirmation";
			definition = "If yes, it means the cancellation of the assignment is confirmed.\nIf no, it means the cancellation of the assignment is rejected and the investigation process will continue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestigationStatus obj) {
			return obj.getAssignmentCancellationConfirmation();
		}

		@Override
		public void setValue(InvestigationStatus obj, YesNoIndicator value) {
			obj.setAssignmentCancellationConfirmation(value);
		}
	};
	@XmlElement(name = "RtrInf")
	protected ReturnInformation1 returnInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReturnInformation1
	 * ReturnInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentCorrection
	 * PaymentInvestigationCaseResolution.mmPaymentCorrection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestigationStatus
	 * InvestigationStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details on the returns expected by the debtor side after cancellation or modification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestigationStatus, Optional<ReturnInformation1>> mmReturnInformation = new MMMessageAssociationEnd<InvestigationStatus, Optional<ReturnInformation1>>() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseResolution.mmPaymentCorrection;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestigationStatus.mmObject();
			isDerived = false;
			xmlTag = "RtrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnInformation";
			definition = "Details on the returns expected by the debtor side after cancellation or modification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReturnInformation1.mmObject();
		}

		@Override
		public Optional<ReturnInformation1> getValue(InvestigationStatus obj) {
			return obj.getReturnInformation();
		}

		@Override
		public void setValue(InvestigationStatus obj, Optional<ReturnInformation1> value) {
			obj.setReturnInformation(value.orElse(null));
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.InvestigationStatus
	 * InvestigationStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#mmConfirmation
	 * InvestigationStatus.mmConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#mmAssignmentCancellationConfirmation
	 * InvestigationStatus.mmAssignmentCancellationConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#mmRejectedModification
	 * InvestigationStatus.mmRejectedModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#mmRejectedCancellation
	 * InvestigationStatus.mmRejectedCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#mmDuplicateOf
	 * InvestigationStatus.mmDuplicateOf}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationStatusXorChoiceRule"</li>
	 * </ul>
	 */
	public static final MMXor InvestigationStatusXorChoiceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationStatusXorChoiceRule";
			messageComponent_lazy = () -> com.tools20022.repository.msg.InvestigationStatus.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestigationStatus.mmConfirmation, com.tools20022.repository.msg.InvestigationStatus.mmAssignmentCancellationConfirmation,
					com.tools20022.repository.msg.InvestigationStatus.mmRejectedModification, com.tools20022.repository.msg.InvestigationStatus.mmRejectedCancellation, com.tools20022.repository.msg.InvestigationStatus.mmDuplicateOf);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestigationStatus.mmConfirmation, com.tools20022.repository.msg.InvestigationStatus.mmRejectedModification,
						com.tools20022.repository.msg.InvestigationStatus.mmRejectedCancellation, com.tools20022.repository.msg.InvestigationStatus.mmDuplicateOf,
						com.tools20022.repository.msg.InvestigationStatus.mmAssignmentCancellationConfirmation, com.tools20022.repository.msg.InvestigationStatus.mmReturnInformation);
				trace_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintConfirmationAndReturnInformation.forInvestigationStatus);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "InvestigationStatus";
				definition = "Choice between different statuses of an investigation case.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestigationStatus.InvestigationStatusXorChoiceRule);
			}
		});
		return mmObject_lazy.get();
	}

	public InvestigationExecutionConfirmation2Code getConfirmation() {
		return confirmation;
	}

	public InvestigationStatus setConfirmation(InvestigationExecutionConfirmation2Code confirmation) {
		this.confirmation = Objects.requireNonNull(confirmation);
		return this;
	}

	public List<PaymentModificationRejection1Code> getRejectedModification() {
		return rejectedModification == null ? rejectedModification = new ArrayList<>() : rejectedModification;
	}

	public InvestigationStatus setRejectedModification(List<PaymentModificationRejection1Code> rejectedModification) {
		this.rejectedModification = Objects.requireNonNull(rejectedModification);
		return this;
	}

	public RejectedCancellationJustification getRejectedCancellation() {
		return rejectedCancellation;
	}

	public InvestigationStatus setRejectedCancellation(RejectedCancellationJustification rejectedCancellation) {
		this.rejectedCancellation = Objects.requireNonNull(rejectedCancellation);
		return this;
	}

	public Case getDuplicateOf() {
		return duplicateOf;
	}

	public InvestigationStatus setDuplicateOf(Case duplicateOf) {
		this.duplicateOf = Objects.requireNonNull(duplicateOf);
		return this;
	}

	public YesNoIndicator getAssignmentCancellationConfirmation() {
		return assignmentCancellationConfirmation;
	}

	public InvestigationStatus setAssignmentCancellationConfirmation(YesNoIndicator assignmentCancellationConfirmation) {
		this.assignmentCancellationConfirmation = Objects.requireNonNull(assignmentCancellationConfirmation);
		return this;
	}

	public Optional<ReturnInformation1> getReturnInformation() {
		return returnInformation == null ? Optional.empty() : Optional.of(returnInformation);
	}

	public InvestigationStatus setReturnInformation(ReturnInformation1 returnInformation) {
		this.returnInformation = returnInformation;
		return this;
	}
}