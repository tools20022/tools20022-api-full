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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CaseAssignmentRejectionCode;
import com.tools20022.repository.codeset.InvestigationRejectionCode;
import com.tools20022.repository.codeset.PaymentCancellationRejectionCode;
import com.tools20022.repository.codeset.PaymentModificationRejectionV2Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the rejection of an activity linked to a payment. The rejected
 * activity may be the assignment of an investigation case, the cancellation or
 * the modification of a payment.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentInvestigationCaseRejection"
 * src="doc-files/PaymentInvestigationCaseRejection.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CaseAssignmentRejectionJustification
 * CaseAssignmentRejectionJustification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CaseAssignmentRejectionJustification2
 * CaseAssignmentRejectionJustification2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestigationRejectionJustification1
 * InvestigationRejectionJustification1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmInvestigationCaseRejection
 * PaymentInvestigationCaseResolution.mmInvestigationCaseRejection}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRejectedModification
 * PaymentInvestigationCaseRejection.mmRejectedModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRejectedCancellation
 * PaymentInvestigationCaseRejection.mmRejectedCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRejectedCancellationReason
 * PaymentInvestigationCaseRejection.mmRejectedCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmAssignmentCancellationConfirmation
 * PaymentInvestigationCaseRejection.mmAssignmentCancellationConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRejectionReason
 * PaymentInvestigationCaseRejection.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRelatedInvestigationCaseResolution
 * PaymentInvestigationCaseRejection.mmRelatedInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmInvestigationRejection
 * PaymentInvestigationCaseRejection.mmInvestigationRejection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInvestigationCaseRejection"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the rejection of an activity linked to a payment. The rejected activity may be the assignment of an investigation case, the cancellation or  the modification of a payment."
 * </li>
 * </ul>
 */
public class PaymentInvestigationCaseRejection {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentModificationRejectionV2Code rejectedModification;
	/**
	 * Reason for the rejection of a modification request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatusChoice#mmRejectedModification
	 * InvestigationStatusChoice.mmRejectedModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#mmRejectedModification
	 * InvestigationStatus.mmRejectedModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus2Choice#mmRejectedModification
	 * InvestigationStatus2Choice.mmRejectedModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice#mmRejectedModification
	 * InvestigationStatus3Choice.mmRejectedModification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the rejection of a modification request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRejectedModification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestigationStatusChoice.mmRejectedModification, InvestigationStatus.mmRejectedModification, InvestigationStatus2Choice.mmRejectedModification,
					InvestigationStatus3Choice.mmRejectedModification);
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedModification";
			definition = "Reason for the rejection of a modification request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
		}
	};
	protected PaymentCancellationRejectionCode rejectedCancellation;
	/**
	 * Justification for the rejection of the cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode
	 * PaymentCancellationRejectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedCancellationJustification#mmReasonCode
	 * RejectedCancellationJustification.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatusChoice#mmRejectedCancellation
	 * InvestigationStatusChoice.mmRejectedCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatusReason1Choice#mmCode
	 * CancellationStatusReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatusReason1Choice#mmProprietary
	 * CancellationStatusReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReasonInformation1#mmReason
	 * CancellationStatusReasonInformation1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation24#mmCancellationStatusReasonInformation
	 * OriginalGroupInformation24.mmCancellationStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatusReason2Choice#mmCode
	 * CancellationStatusReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatusReason2Choice#mmProprietary
	 * CancellationStatusReason2Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Justification for the rejection of the cancellation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRejectedCancellation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RejectedCancellationJustification.mmReasonCode, InvestigationStatusChoice.mmRejectedCancellation, CancellationStatusReason1Choice.mmCode, CancellationStatusReason1Choice.mmProprietary,
					CancellationStatusReasonInformation1.mmReason, OriginalGroupInformation24.mmCancellationStatusReasonInformation, CancellationStatusReason2Choice.mmCode, CancellationStatusReason2Choice.mmProprietary);
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedCancellation";
			definition = "Justification for the rejection of the cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentCancellationRejectionCode.mmObject();
		}
	};
	protected Max140Text rejectedCancellationReason;
	/**
	 * Free text justification for rejecting a cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedCancellationJustification#mmReason
	 * RejectedCancellationJustification.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedCancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free text justification for rejecting a cancellation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRejectedCancellationReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RejectedCancellationJustification.mmReason);
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedCancellationReason";
			definition = "Free text justification for rejecting a cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatusChoice#mmAssignmentCancellationConfirmation
	 * InvestigationStatusChoice.mmAssignmentCancellationConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestigationStatus#mmAssignmentCancellationConfirmation
	 * InvestigationStatus.mmAssignmentCancellationConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus2Choice#mmAssignmentCancellationConfirmation
	 * InvestigationStatus2Choice.mmAssignmentCancellationConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice#mmAssignmentCancellationConfirmation
	 * InvestigationStatus3Choice.mmAssignmentCancellationConfirmation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssignmentCancellationConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If yes, it means the cancellation of the assignment is confirmed.\nIf no, it means the cancellation of the assignment is rejected and the investigation process will continue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAssignmentCancellationConfirmation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestigationStatusChoice.mmAssignmentCancellationConfirmation, InvestigationStatus.mmAssignmentCancellationConfirmation, InvestigationStatus2Choice.mmAssignmentCancellationConfirmation,
					InvestigationStatus3Choice.mmAssignmentCancellationConfirmation);
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssignmentCancellationConfirmation";
			definition = "If yes, it means the cancellation of the assignment is confirmed.\nIf no, it means the cancellation of the assignment is rejected and the investigation process will continue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CaseAssignmentRejectionCode rejectionReason;
	/**
	 * Reason for the rejection of a case assignment, in a coded form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
	 * CaseAssignmentRejectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CaseAssignmentRejectionJustification#mmRejectionReason
	 * CaseAssignmentRejectionJustification.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CaseAssignmentRejectionJustification2#mmRejectionReason
	 * CaseAssignmentRejectionJustification2.mmRejectionReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the rejection of a case assignment, in a coded form."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CaseAssignmentRejectionJustification.mmRejectionReason, CaseAssignmentRejectionJustification2.mmRejectionReason);
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectionReason";
			definition = "Reason for the rejection of a case assignment, in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CaseAssignmentRejectionCode.mmObject();
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCaseResolution;
	/**
	 * Resolution which consists in rejecting the case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmInvestigationCaseRejection
	 * PaymentInvestigationCaseResolution.mmInvestigationCaseRejection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Resolution which consists in rejecting the case."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Resolution which consists in rejecting the case.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmInvestigationCaseRejection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
		}
	};
	protected InvestigationRejectionCode investigationRejection;
	/**
	 * Reason for the rejection of a case assignment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode
	 * InvestigationRejectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestigationRejectionJustification1#mmRejectionReason
	 * InvestigationRejectionJustification1.mmRejectionReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the rejection of a case assignment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInvestigationRejection = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestigationRejectionJustification1.mmRejectionReason);
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestigationRejection";
			definition = "Reason for the rejection of a case assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestigationRejectionCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInvestigationCaseRejection";
				definition = "Specifies the rejection of an activity linked to a payment. The rejected activity may be the assignment of an investigation case, the cancellation or  the modification of a payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmInvestigationCaseRejection);
				element_lazy = () -> Arrays.asList(PaymentInvestigationCaseRejection.mmRejectedModification, PaymentInvestigationCaseRejection.mmRejectedCancellation, PaymentInvestigationCaseRejection.mmRejectedCancellationReason,
						PaymentInvestigationCaseRejection.mmAssignmentCancellationConfirmation, PaymentInvestigationCaseRejection.mmRejectionReason, PaymentInvestigationCaseRejection.mmRelatedInvestigationCaseResolution,
						PaymentInvestigationCaseRejection.mmInvestigationRejection);
				derivationComponent_lazy = () -> Arrays.asList(CaseAssignmentRejectionJustification.mmObject(), CaseAssignmentRejectionJustification2.mmObject(), InvestigationRejectionJustification1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentModificationRejectionV2Code getRejectedModification() {
		return rejectedModification;
	}

	public void setRejectedModification(PaymentModificationRejectionV2Code rejectedModification) {
		this.rejectedModification = rejectedModification;
	}

	public PaymentCancellationRejectionCode getRejectedCancellation() {
		return rejectedCancellation;
	}

	public void setRejectedCancellation(PaymentCancellationRejectionCode rejectedCancellation) {
		this.rejectedCancellation = rejectedCancellation;
	}

	public Max140Text getRejectedCancellationReason() {
		return rejectedCancellationReason;
	}

	public void setRejectedCancellationReason(Max140Text rejectedCancellationReason) {
		this.rejectedCancellationReason = rejectedCancellationReason;
	}

	public YesNoIndicator getAssignmentCancellationConfirmation() {
		return assignmentCancellationConfirmation;
	}

	public void setAssignmentCancellationConfirmation(YesNoIndicator assignmentCancellationConfirmation) {
		this.assignmentCancellationConfirmation = assignmentCancellationConfirmation;
	}

	public CaseAssignmentRejectionCode getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(CaseAssignmentRejectionCode rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCaseResolution() {
		return relatedInvestigationCaseResolution;
	}

	public void setRelatedInvestigationCaseResolution(com.tools20022.repository.entity.PaymentInvestigationCaseResolution relatedInvestigationCaseResolution) {
		this.relatedInvestigationCaseResolution = relatedInvestigationCaseResolution;
	}

	public InvestigationRejectionCode getInvestigationRejection() {
		return investigationRejection;
	}

	public void setInvestigationRejection(InvestigationRejectionCode investigationRejection) {
		this.investigationRejection = investigationRejection;
	}
}