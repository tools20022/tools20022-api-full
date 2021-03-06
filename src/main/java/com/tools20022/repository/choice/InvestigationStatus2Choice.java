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
import com.tools20022.repository.area.camt.ResolutionOfInvestigationV03;
import com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code;
import com.tools20022.repository.codeset.ModificationRejection2Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.PaymentInvestigationCaseRejection;
import com.tools20022.repository.entity.PaymentInvestigationCaseResolution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Case2;
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
 * Specifies the status of an investigation case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationStatus2Choice#mmConfirmation
 * InvestigationStatus2Choice.mmConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationStatus2Choice#mmRejectedModification
 * InvestigationStatus2Choice.mmRejectedModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationStatus2Choice#mmDuplicateOf
 * InvestigationStatus2Choice.mmDuplicateOf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationStatus2Choice#mmAssignmentCancellationConfirmation
 * InvestigationStatus2Choice.mmAssignmentCancellationConfirmation}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03#mmStatus
 * ResolutionOfInvestigationV03.mmStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestigationStatus2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of an investigation case."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestigationStatus2Choice", propOrder = {"confirmation", "rejectedModification", "duplicateOf", "assignmentCancellationConfirmation"})
public class InvestigationStatus2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Conf", required = true)
	protected InvestigationExecutionConfirmation3Code confirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmInvestigationStatus
	 * PaymentInvestigationCaseResolution.mmInvestigationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus2Choice
	 * InvestigationStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Conf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the investigation, in a coded form."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestigationStatus2Choice, InvestigationExecutionConfirmation3Code> mmConfirmation = new MMMessageAttribute<InvestigationStatus2Choice, InvestigationExecutionConfirmation3Code>() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseResolution.mmInvestigationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.InvestigationStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "Conf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmation";
			definition = "Specifies the status of the investigation, in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestigationExecutionConfirmation3Code.mmObject();
		}

		@Override
		public InvestigationExecutionConfirmation3Code getValue(InvestigationStatus2Choice obj) {
			return obj.getConfirmation();
		}

		@Override
		public void setValue(InvestigationStatus2Choice obj, InvestigationExecutionConfirmation3Code value) {
			obj.setConfirmation(value);
		}
	};
	@XmlElement(name = "RjctdMod", required = true)
	protected List<ModificationRejection2Code> rejectedModification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRejectedModification
	 * PaymentInvestigationCaseRejection.mmRejectedModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus2Choice
	 * InvestigationStatus2Choice}</li>
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
	public static final MMMessageAttribute<InvestigationStatus2Choice, List<ModificationRejection2Code>> mmRejectedModification = new MMMessageAttribute<InvestigationStatus2Choice, List<ModificationRejection2Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseRejection.mmRejectedModification;
			componentContext_lazy = () -> com.tools20022.repository.choice.InvestigationStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "RjctdMod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedModification";
			definition = "Reason for the rejection of a modification request, in a coded form.";
			minOccurs = 1;
			simpleType_lazy = () -> ModificationRejection2Code.mmObject();
		}

		@Override
		public List<ModificationRejection2Code> getValue(InvestigationStatus2Choice obj) {
			return obj.getRejectedModification();
		}

		@Override
		public void setValue(InvestigationStatus2Choice obj, List<ModificationRejection2Code> value) {
			obj.setRejectedModification(value);
		}
	};
	@XmlElement(name = "DplctOf", required = true)
	protected Case2 duplicateOf;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Case2 Case2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmDuplicateCase
	 * PaymentInvestigationCaseResolution.mmDuplicateCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus2Choice
	 * InvestigationStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DplctOf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateOf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a duplicated case. \nUsage: When present, the case identified in the message must be closed. The case identified as duplicated (in this component) will be pursued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestigationStatus2Choice, Case2> mmDuplicateOf = new MMMessageAssociationEnd<InvestigationStatus2Choice, Case2>() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseResolution.mmDuplicateCase;
			componentContext_lazy = () -> com.tools20022.repository.choice.InvestigationStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "DplctOf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateOf";
			definition = "Indicates a duplicated case. \nUsage: When present, the case identified in the message must be closed. The case identified as duplicated (in this component) will be pursued.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Case2.mmObject();
		}

		@Override
		public Case2 getValue(InvestigationStatus2Choice obj) {
			return obj.getDuplicateOf();
		}

		@Override
		public void setValue(InvestigationStatus2Choice obj, Case2 value) {
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
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus2Choice
	 * InvestigationStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssgnmtCxlConf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssignmentCancellationConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cancellation of the assignment is confirmed or rejected.\nUsage: If yes, the cancellation of the assignment is confirmed.\nIf no, the cancellation of the assignment is rejected and the investigation process will continue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestigationStatus2Choice, YesNoIndicator> mmAssignmentCancellationConfirmation = new MMMessageAttribute<InvestigationStatus2Choice, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseRejection.mmAssignmentCancellationConfirmation;
			componentContext_lazy = () -> com.tools20022.repository.choice.InvestigationStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "AssgnmtCxlConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssignmentCancellationConfirmation";
			definition = "Indicates whether the cancellation of the assignment is confirmed or rejected.\nUsage: If yes, the cancellation of the assignment is confirmed.\nIf no, the cancellation of the assignment is rejected and the investigation process will continue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestigationStatus2Choice obj) {
			return obj.getAssignmentCancellationConfirmation();
		}

		@Override
		public void setValue(InvestigationStatus2Choice obj, YesNoIndicator value) {
			obj.setAssignmentCancellationConfirmation(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InvestigationStatus2Choice.mmConfirmation, com.tools20022.repository.choice.InvestigationStatus2Choice.mmRejectedModification,
						com.tools20022.repository.choice.InvestigationStatus2Choice.mmDuplicateOf, com.tools20022.repository.choice.InvestigationStatus2Choice.mmAssignmentCancellationConfirmation);
				messageBuildingBlock_lazy = () -> Arrays.asList(ResolutionOfInvestigationV03.mmStatus);
				trace_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestigationStatus2Choice";
				definition = "Specifies the status of an investigation case.";
			}
		});
		return mmObject_lazy.get();
	}

	public InvestigationExecutionConfirmation3Code getConfirmation() {
		return confirmation;
	}

	public InvestigationStatus2Choice setConfirmation(InvestigationExecutionConfirmation3Code confirmation) {
		this.confirmation = Objects.requireNonNull(confirmation);
		return this;
	}

	public List<ModificationRejection2Code> getRejectedModification() {
		return rejectedModification == null ? rejectedModification = new ArrayList<>() : rejectedModification;
	}

	public InvestigationStatus2Choice setRejectedModification(List<ModificationRejection2Code> rejectedModification) {
		this.rejectedModification = Objects.requireNonNull(rejectedModification);
		return this;
	}

	public Case2 getDuplicateOf() {
		return duplicateOf;
	}

	public InvestigationStatus2Choice setDuplicateOf(Case2 duplicateOf) {
		this.duplicateOf = Objects.requireNonNull(duplicateOf);
		return this;
	}

	public YesNoIndicator getAssignmentCancellationConfirmation() {
		return assignmentCancellationConfirmation;
	}

	public InvestigationStatus2Choice setAssignmentCancellationConfirmation(YesNoIndicator assignmentCancellationConfirmation) {
		this.assignmentCancellationConfirmation = Objects.requireNonNull(assignmentCancellationConfirmation);
		return this;
	}
}