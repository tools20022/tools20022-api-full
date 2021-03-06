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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.ResolutionOfInvestigation;
import com.tools20022.repository.codeset.InvestigationExecutionConfirmation1Code;
import com.tools20022.repository.codeset.PaymentModificationRejection1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.PaymentInvestigationCaseRejection;
import com.tools20022.repository.entity.PaymentInvestigationCaseResolution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Case;
import com.tools20022.repository.msg.RejectedCancellationJustification;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between different statuses of an investigation case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationStatusChoice#mmConfirmation
 * InvestigationStatusChoice.mmConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationStatusChoice#mmRejectedModification
 * InvestigationStatusChoice.mmRejectedModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationStatusChoice#mmRejectedCancellation
 * InvestigationStatusChoice.mmRejectedCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationStatusChoice#mmDuplicateOf
 * InvestigationStatusChoice.mmDuplicateOf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationStatusChoice#mmAssignmentCancellationConfirmation
 * InvestigationStatusChoice.mmAssignmentCancellationConfirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
 * PaymentInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigation#mmStatus
 * ResolutionOfInvestigation.mmStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestigationStatusChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between different statuses of an investigation case."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestigationStatusChoice", propOrder = {"confirmation", "rejectedModification", "rejectedCancellation", "duplicateOf", "assignmentCancellationConfirmation"})
public class InvestigationStatusChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Conf", required = true)
	protected InvestigationExecutionConfirmation1Code confirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation1Code
	 * InvestigationExecutionConfirmation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmInvestigationStatus
	 * PaymentInvestigationCaseResolution.mmInvestigationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatusChoice
	 * InvestigationStatusChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Conf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the status of an investigation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestigationStatusChoice, InvestigationExecutionConfirmation1Code> mmConfirmation = new MMMessageAttribute<InvestigationStatusChoice, InvestigationExecutionConfirmation1Code>() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseResolution.mmInvestigationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.InvestigationStatusChoice.mmObject();
			isDerived = false;
			xmlTag = "Conf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmation";
			definition = "Indicates the status of an investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestigationExecutionConfirmation1Code.mmObject();
		}

		@Override
		public InvestigationExecutionConfirmation1Code getValue(InvestigationStatusChoice obj) {
			return obj.getConfirmation();
		}

		@Override
		public void setValue(InvestigationStatusChoice obj, InvestigationExecutionConfirmation1Code value) {
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
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatusChoice
	 * InvestigationStatusChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdMod"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the rejection of a modification request, in a coded form."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestigationStatusChoice, List<PaymentModificationRejection1Code>> mmRejectedModification = new MMMessageAttribute<InvestigationStatusChoice, List<PaymentModificationRejection1Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseRejection.mmRejectedModification;
			componentContext_lazy = () -> com.tools20022.repository.choice.InvestigationStatusChoice.mmObject();
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
		public List<PaymentModificationRejection1Code> getValue(InvestigationStatusChoice obj) {
			return obj.getRejectedModification();
		}

		@Override
		public void setValue(InvestigationStatusChoice obj, List<PaymentModificationRejection1Code> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRejectedCancellation
	 * PaymentInvestigationCaseRejection.mmRejectedCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatusChoice
	 * InvestigationStatusChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdCxl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Explains the reason for rejecting a payment cancellation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestigationStatusChoice, RejectedCancellationJustification> mmRejectedCancellation = new MMMessageAssociationEnd<InvestigationStatusChoice, RejectedCancellationJustification>() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseRejection.mmRejectedCancellation;
			componentContext_lazy = () -> com.tools20022.repository.choice.InvestigationStatusChoice.mmObject();
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
		public RejectedCancellationJustification getValue(InvestigationStatusChoice obj) {
			return obj.getRejectedCancellation();
		}

		@Override
		public void setValue(InvestigationStatusChoice obj, RejectedCancellationJustification value) {
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
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmDuplicateCase
	 * PaymentInvestigationCaseResolution.mmDuplicateCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatusChoice
	 * InvestigationStatusChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DplctOf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateOf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a duplicated case. When present, the case identified in the message must be closed. The case identified as duplicated (in this component) will be pursued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestigationStatusChoice, Case> mmDuplicateOf = new MMMessageAssociationEnd<InvestigationStatusChoice, Case>() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseResolution.mmDuplicateCase;
			componentContext_lazy = () -> com.tools20022.repository.choice.InvestigationStatusChoice.mmObject();
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
		public Case getValue(InvestigationStatusChoice obj) {
			return obj.getDuplicateOf();
		}

		@Override
		public void setValue(InvestigationStatusChoice obj, Case value) {
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
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatusChoice
	 * InvestigationStatusChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssgnmtCxlConf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssignmentCancellationConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If yes, it means the cancellation of the assignment is confirmed.\nIf no, it means the cancellation of the assignment is rejected and the investigation process will continue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestigationStatusChoice, YesNoIndicator> mmAssignmentCancellationConfirmation = new MMMessageAttribute<InvestigationStatusChoice, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseRejection.mmAssignmentCancellationConfirmation;
			componentContext_lazy = () -> com.tools20022.repository.choice.InvestigationStatusChoice.mmObject();
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
		public YesNoIndicator getValue(InvestigationStatusChoice obj) {
			return obj.getAssignmentCancellationConfirmation();
		}

		@Override
		public void setValue(InvestigationStatusChoice obj, YesNoIndicator value) {
			obj.setAssignmentCancellationConfirmation(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InvestigationStatusChoice.mmConfirmation, com.tools20022.repository.choice.InvestigationStatusChoice.mmRejectedModification,
						com.tools20022.repository.choice.InvestigationStatusChoice.mmRejectedCancellation, com.tools20022.repository.choice.InvestigationStatusChoice.mmDuplicateOf,
						com.tools20022.repository.choice.InvestigationStatusChoice.mmAssignmentCancellationConfirmation);
				messageBuildingBlock_lazy = () -> Arrays.asList(ResolutionOfInvestigation.mmStatus);
				trace_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestigationStatusChoice";
				definition = "Choice between different statuses of an investigation case.";
			}
		});
		return mmObject_lazy.get();
	}

	public InvestigationExecutionConfirmation1Code getConfirmation() {
		return confirmation;
	}

	public InvestigationStatusChoice setConfirmation(InvestigationExecutionConfirmation1Code confirmation) {
		this.confirmation = Objects.requireNonNull(confirmation);
		return this;
	}

	public List<PaymentModificationRejection1Code> getRejectedModification() {
		return rejectedModification == null ? rejectedModification = new ArrayList<>() : rejectedModification;
	}

	public InvestigationStatusChoice setRejectedModification(List<PaymentModificationRejection1Code> rejectedModification) {
		this.rejectedModification = Objects.requireNonNull(rejectedModification);
		return this;
	}

	public RejectedCancellationJustification getRejectedCancellation() {
		return rejectedCancellation;
	}

	public InvestigationStatusChoice setRejectedCancellation(RejectedCancellationJustification rejectedCancellation) {
		this.rejectedCancellation = Objects.requireNonNull(rejectedCancellation);
		return this;
	}

	public Case getDuplicateOf() {
		return duplicateOf;
	}

	public InvestigationStatusChoice setDuplicateOf(Case duplicateOf) {
		this.duplicateOf = Objects.requireNonNull(duplicateOf);
		return this;
	}

	public YesNoIndicator getAssignmentCancellationConfirmation() {
		return assignmentCancellationConfirmation;
	}

	public InvestigationStatusChoice setAssignmentCancellationConfirmation(YesNoIndicator assignmentCancellationConfirmation) {
		this.assignmentCancellationConfirmation = Objects.requireNonNull(assignmentCancellationConfirmation);
		return this;
	}
}