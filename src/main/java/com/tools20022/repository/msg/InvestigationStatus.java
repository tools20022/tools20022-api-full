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
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#mmInvestigationStatusXorChoiceRule
 * InvestigationStatus.mmInvestigationStatusXorChoiceRule}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InvestigationStatus", propOrder = {"confirmation", "rejectedModification", "rejectedCancellation", "duplicateOf", "assignmentCancellationConfirmation", "returnInformation"})
public class InvestigationStatus {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected InvestigationExecutionConfirmation2Code confirmation;
	/**
	 * Indicates the status of an investigation.
	 * <p>
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
	public static final MMMessageAttribute mmConfirmation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseResolution.mmInvestigationStatus;
			componentContext_lazy = () -> InvestigationStatus.mmObject();
			isDerived = false;
			xmlTag = "Conf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmation";
			definition = "Indicates the status of an investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestigationExecutionConfirmation2Code.mmObject();
		}
	};
	protected List<PaymentModificationRejection1Code> rejectedModification;
	/**
	 * Reason for the rejection of a modification request, in a coded form.
	 * <p>
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
	public static final MMMessageAttribute mmRejectedModification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseRejection.mmRejectedModification;
			componentContext_lazy = () -> InvestigationStatus.mmObject();
			isDerived = false;
			xmlTag = "RjctdMod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedModification";
			definition = "Reason for the rejection of a modification request, in a coded form.";
			maxOccurs = 14;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentModificationRejection1Code.mmObject();
		}
	};
	protected RejectedCancellationJustification rejectedCancellation;
	/**
	 * Explains the reason for rejecting a payment cancellation request.
	 * <p>
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
	public static final MMMessageAssociationEnd mmRejectedCancellation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestigationStatus.mmObject();
			isDerived = false;
			xmlTag = "RjctdCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedCancellation";
			definition = "Explains the reason for rejecting a payment cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RejectedCancellationJustification.mmObject();
		}
	};
	protected Case duplicateOf;
	/**
	 * Identifies a duplicated case. When present, the case identified in the
	 * message must be closed. The case identified as duplicated (in this
	 * component) will be pursued.
	 * <p>
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
	public static final MMMessageAssociationEnd mmDuplicateOf = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestigationResolution.mmInvestigationCase;
			componentContext_lazy = () -> InvestigationStatus.mmObject();
			isDerived = false;
			xmlTag = "DplctOf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateOf";
			definition = "Identifies a duplicated case. When present, the case identified in the message must be closed. The case identified as duplicated (in this component) will be pursued.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Case.mmObject();
		}
	};
	protected YesNoIndicator assignmentCancellationConfirmation;
	/**
	 * If yes, it means the cancellation of the assignment is confirmed. If no,
	 * it means the cancellation of the assignment is rejected and the
	 * investigation process will continue.
	 * <p>
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
	public static final MMMessageAttribute mmAssignmentCancellationConfirmation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseRejection.mmAssignmentCancellationConfirmation;
			componentContext_lazy = () -> InvestigationStatus.mmObject();
			isDerived = false;
			xmlTag = "AssgnmtCxlConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssignmentCancellationConfirmation";
			definition = "If yes, it means the cancellation of the assignment is confirmed.\nIf no, it means the cancellation of the assignment is rejected and the investigation process will continue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ReturnInformation1 returnInformation;
	/**
	 * Details on the returns expected by the debtor side after cancellation or
	 * modification.
	 * <p>
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
	public static final MMMessageAssociationEnd mmReturnInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseResolution.mmPaymentCorrection;
			componentContext_lazy = () -> InvestigationStatus.mmObject();
			isDerived = false;
			xmlTag = "RtrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnInformation";
			definition = "Details on the returns expected by the debtor side after cancellation or modification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReturnInformation1.mmObject();
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
	public static final MMXor mmInvestigationStatusXorChoiceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationStatusXorChoiceRule";
			messageComponent_lazy = () -> InvestigationStatus.mmObject();
			impactedElements_lazy = () -> Arrays.asList(InvestigationStatus.mmConfirmation, InvestigationStatus.mmAssignmentCancellationConfirmation, InvestigationStatus.mmRejectedModification, InvestigationStatus.mmRejectedCancellation,
					InvestigationStatus.mmDuplicateOf);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InvestigationStatus.mmConfirmation, InvestigationStatus.mmRejectedModification, InvestigationStatus.mmRejectedCancellation, InvestigationStatus.mmDuplicateOf,
						InvestigationStatus.mmAssignmentCancellationConfirmation, InvestigationStatus.mmReturnInformation);
				trace_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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
				xors_lazy = () -> Arrays.asList(InvestigationStatus.mmInvestigationStatusXorChoiceRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Conf", required = true)
	public InvestigationExecutionConfirmation2Code getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(InvestigationExecutionConfirmation2Code confirmation) {
		this.confirmation = confirmation;
	}

	@XmlElement(name = "RjctdMod", required = true)
	public List<PaymentModificationRejection1Code> getRejectedModification() {
		return rejectedModification;
	}

	public void setRejectedModification(List<PaymentModificationRejection1Code> rejectedModification) {
		this.rejectedModification = rejectedModification;
	}

	@XmlElement(name = "RjctdCxl", required = true)
	public RejectedCancellationJustification getRejectedCancellation() {
		return rejectedCancellation;
	}

	public void setRejectedCancellation(com.tools20022.repository.msg.RejectedCancellationJustification rejectedCancellation) {
		this.rejectedCancellation = rejectedCancellation;
	}

	@XmlElement(name = "DplctOf", required = true)
	public Case getDuplicateOf() {
		return duplicateOf;
	}

	public void setDuplicateOf(com.tools20022.repository.msg.Case duplicateOf) {
		this.duplicateOf = duplicateOf;
	}

	@XmlElement(name = "AssgnmtCxlConf", required = true)
	public YesNoIndicator getAssignmentCancellationConfirmation() {
		return assignmentCancellationConfirmation;
	}

	public void setAssignmentCancellationConfirmation(YesNoIndicator assignmentCancellationConfirmation) {
		this.assignmentCancellationConfirmation = assignmentCancellationConfirmation;
	}

	@XmlElement(name = "RtrInf")
	public ReturnInformation1 getReturnInformation() {
		return returnInformation;
	}

	public void setReturnInformation(com.tools20022.repository.msg.ReturnInformation1 returnInformation) {
		this.returnInformation = returnInformation;
	}
}