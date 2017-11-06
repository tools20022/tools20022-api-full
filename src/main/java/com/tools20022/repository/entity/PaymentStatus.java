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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a payment at a specified time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentStatus" src="doc-files/PaymentStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus#mmStatus
 * PaymentStatus.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus#mmPayment
 * PaymentStatus.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmUnmatchedStatusReason
 * PaymentStatus.mmUnmatchedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmSuspendedStatusReason
 * PaymentStatus.mmSuspendedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmPendingSettlement
 * PaymentStatus.mmPendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmInstructionStatus
 * PaymentStatus.mmInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmTransactionRejectionReason
 * PaymentStatus.mmTransactionRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmRelatedInvestigationCase
 * PaymentStatus.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmNotificationStatus
 * PaymentStatus.mmNotificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmTransactionStatus
 * PaymentStatus.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmCashPaymentStatus
 * PaymentStatus.mmCashPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmUnsuccessfulStatusReason
 * PaymentStatus.mmUnsuccessfulStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmCancellationReason
 * PaymentStatus.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmMandateRejectionReason
 * PaymentStatus.mmMandateRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmPendingFailingSettlement
 * PaymentStatus.mmPendingFailingSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
 * Payment.mmPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmPaymentStatus
 * PaymentInvestigationCase.mmPaymentStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch2#mmPaymentInstructionStatus
 * InstructionStatusSearch2.mmPaymentInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3#mmPaymentInstructionStatus
 * InstructionStatusSearch3.mmPaymentInstructionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch4#mmStatus
 * PaymentSearch4.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails1#mmPaymentInstructionStatus
 * PaymentStatusDetails1.mmPaymentInstructionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus1#mmCode
 * PaymentStatus1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation10#mmReason
 * ReturnReasonInformation10.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation1#mmReversalReason
 * ReversalReasonInformation1.mmReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation1#mmStatusReason
 * StatusReasonInformation1.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation8#mmReason
 * StatusReasonInformation8.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation4#mmStatusReason
 * StatusReasonInformation4.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation6#mmStatusReason
 * StatusReasonInformation6.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation5#mmStatusReason
 * StatusReasonInformation5.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation7#mmStatusReason
 * StatusReasonInformation7.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation4#mmReversalReason
 * ReversalReasonInformation4.mmReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation5#mmReversalReason
 * ReversalReasonInformation5.mmReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLinkStatus1#mmStatusReason
 * AccountLinkStatus1.mmStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5#mmStatus
 * PaymentSearch5.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus2#mmCode
 * PaymentStatus2.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmStatusReason
 * CurrencyControlGroupStatus1.mmStatusReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice
 * PaymentStatusCodeSearchChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionStatusSearch2
 * InstructionStatusSearch2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice
 * PaymentStatusCodeSearch2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionStatusSearch3
 * InstructionStatusSearch3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentStatusCodeChoice
 * PaymentStatusCodeChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentStatusCode2Choice
 * PaymentStatusCode2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice
 * PaymentStatusReasonCode3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatusDetails1
 * PaymentStatusDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentStatusCode3Choice
 * PaymentStatusCode3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatusDetails3
 * PaymentStatusDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentStatusCode4Choice
 * PaymentStatusCode4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice
 * PaymentStatusReasonCode4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatusDetails4
 * PaymentStatusDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice
 * PaymentStatusCode5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus1 PaymentStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReturnReasonInformation5
 * ReturnReasonInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReturnReasonInformation10
 * ReturnReasonInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationReason1Choice
 * CancellationReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationReasonInformation1
 * CancellationReasonInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationReason2Choice
 * CancellationReason2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationReasonInformation3
 * CancellationReasonInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationReason14Choice
 * CancellationReason14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCancellationReason2
 * PaymentCancellationReason2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReversalReason1Choice
 * ReversalReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReversalReasonInformation1
 * ReversalReasonInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReversalReason4Choice
 * ReversalReason4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.StatusReason1Choice
 * StatusReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReasonInformation1
 * StatusReasonInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReasonInformation8
 * StatusReasonInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReasonInformation9
 * StatusReasonInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MandateReason1Choice
 * MandateReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationReasonInformation2
 * CancellationReasonInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCancellationReason1
 * PaymentCancellationReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReturnReasonInformation1
 * ReturnReasonInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReturnReasonInformation9
 * ReturnReasonInformation9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusReasonInformation1
 * CancellationStatusReasonInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.StatusReason3Choice
 * StatusReason3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReasonInformation4
 * StatusReasonInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.StatusReason5Choice
 * StatusReason5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReasonInformation6
 * StatusReasonInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReasonInformation5
 * StatusReasonInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReasonInformation7
 * StatusReasonInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReturnReasonInformation3
 * ReturnReasonInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReturnReasonInformation4
 * ReturnReasonInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReturnReasonInformation6
 * ReturnReasonInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReversalReason3Choice
 * ReversalReason3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReversalReasonInformation4
 * ReversalReasonInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReversalReasonInformation5
 * ReversalReasonInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReturnReasonInformation7
 * ReturnReasonInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReasonInformation10
 * StatusReasonInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusAndReason1
 * PendingStatusAndReason1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice
 * PaymentStatusCode6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus2 PaymentStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCancellationReason3
 * PaymentCancellationReason3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationReason33Choice
 * CancellationReason33Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MandateSuspensionReason1Choice
 * MandateSuspensionReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateSuspensionReason1
 * MandateSuspensionReason1}</li>
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
 * "PaymentStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a payment at a specified time."</li>
 * </ul>
 */
public class PaymentStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentStatusCode status;
	/**
	 * Specifies the status of the payment execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#mmInstructionStatus
	 * PaymentSearch2.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmInstructionStatus
	 * PaymentSearch3.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation1#mmGroupStatus
	 * OriginalGroupInformation1.mmGroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#mmTransactionStatus
	 * PaymentTransactionInformation1.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation20#mmGroupStatus
	 * OriginalGroupInformation20.mmGroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#mmTransactionStatus
	 * PaymentTransactionInformation25.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation1#mmPaymentInformationStatus
	 * OriginalPaymentInformation1.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#mmGroupStatus
	 * OriginalGroupHeader1.mmGroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction1#mmPaymentInformationStatus
	 * OriginalPaymentInstruction1.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction6#mmPaymentInformationStatus
	 * OriginalPaymentInstruction6.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmTransactionStatus
	 * PaymentTransactionInformation26.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#mmGroupStatus
	 * OriginalGroupInformation25.mmGroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#mmTransactionStatus
	 * PaymentTransactionInformation34.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation5#mmPaymentInformationStatus
	 * OriginalPaymentInformation5.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction5#mmPaymentInformationStatus
	 * OriginalPaymentInstruction5.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction9#mmPaymentInformationStatus
	 * OriginalPaymentInstruction9.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation24#mmGroupCancellationStatus
	 * OriginalGroupInformation24.mmGroupCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#mmTransactionCancellationStatus
	 * PaymentTransactionInformation32.mmTransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3#mmPaymentInformationCancellationStatus
	 * OriginalPaymentInformation3.mmPaymentInformationCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmTransactionCancellationStatus
	 * PaymentTransactionInformation33.mmTransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction3#mmPaymentInformationCancellationStatus
	 * OriginalPaymentInstruction3.mmPaymentInformationCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#mmGroupStatus
	 * OriginalGroupInformation13.mmGroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation17#mmGroupStatus
	 * OriginalGroupInformation17.mmGroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmGroupStatus
	 * OriginalGroupInformation15.mmGroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation19#mmGroupStatus
	 * OriginalGroupInformation19.mmGroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#mmTransactionStatus
	 * PaymentTransactionInformation15.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#mmTransactionStatus
	 * PaymentTransactionInformation22.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#mmTransactionStatus
	 * PaymentTransactionInformation12.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#mmTransactionStatus
	 * PaymentTransactionInformation19.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction12#mmPaymentInformationStatus
	 * OriginalPaymentInstruction12.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10#mmPaymentInformationCancellationStatus
	 * OriginalPaymentInstruction10.mmPaymentInformationCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction14#mmPaymentInformationStatus
	 * OriginalPaymentInstruction14.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#mmPaymentInformationStatus
	 * OriginalPaymentInstruction18.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmPaymentInformationCancellationStatus
	 * OriginalPaymentInstruction17.mmPaymentInformationCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction19#mmPaymentInformationStatus
	 * OriginalPaymentInstruction19.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmGroupStatus
	 * OriginalGroupHeader7.mmGroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#mmPaymentInformationStatus
	 * OriginalPaymentInstruction23.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#mmPaymentInformationStatus
	 * OriginalPaymentInstruction24.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmGroupStatus
	 * OriginalGroupInformation28.mmGroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmPaymentInformationCancellationStatus
	 * OriginalPaymentInstruction22.mmPaymentInformationCancellationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the payment execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentSearch2.mmInstructionStatus, com.tools20022.repository.msg.PaymentSearch3.mmInstructionStatus,
					com.tools20022.repository.msg.OriginalGroupInformation1.mmGroupStatus, com.tools20022.repository.msg.PaymentTransactionInformation1.mmTransactionStatus,
					com.tools20022.repository.msg.OriginalGroupInformation20.mmGroupStatus, com.tools20022.repository.msg.PaymentTransactionInformation25.mmTransactionStatus,
					com.tools20022.repository.msg.OriginalPaymentInformation1.mmPaymentInformationStatus, com.tools20022.repository.msg.OriginalGroupHeader1.mmGroupStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction1.mmPaymentInformationStatus, com.tools20022.repository.msg.OriginalPaymentInstruction6.mmPaymentInformationStatus,
					com.tools20022.repository.msg.PaymentTransactionInformation26.mmTransactionStatus, com.tools20022.repository.msg.OriginalGroupInformation25.mmGroupStatus,
					com.tools20022.repository.msg.PaymentTransactionInformation34.mmTransactionStatus, com.tools20022.repository.msg.OriginalPaymentInformation5.mmPaymentInformationStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction5.mmPaymentInformationStatus, com.tools20022.repository.msg.OriginalPaymentInstruction9.mmPaymentInformationStatus,
					com.tools20022.repository.msg.OriginalGroupInformation24.mmGroupCancellationStatus, com.tools20022.repository.msg.PaymentTransactionInformation32.mmTransactionCancellationStatus,
					com.tools20022.repository.msg.OriginalPaymentInformation3.mmPaymentInformationCancellationStatus, com.tools20022.repository.msg.PaymentTransactionInformation33.mmTransactionCancellationStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction3.mmPaymentInformationCancellationStatus, com.tools20022.repository.msg.OriginalGroupInformation13.mmGroupStatus,
					com.tools20022.repository.msg.OriginalGroupInformation17.mmGroupStatus, com.tools20022.repository.msg.OriginalGroupInformation15.mmGroupStatus, com.tools20022.repository.msg.OriginalGroupInformation19.mmGroupStatus,
					com.tools20022.repository.msg.PaymentTransactionInformation15.mmTransactionStatus, com.tools20022.repository.msg.PaymentTransactionInformation22.mmTransactionStatus,
					com.tools20022.repository.msg.PaymentTransactionInformation12.mmTransactionStatus, com.tools20022.repository.msg.PaymentTransactionInformation19.mmTransactionStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction12.mmPaymentInformationStatus, com.tools20022.repository.msg.OriginalPaymentInstruction10.mmPaymentInformationCancellationStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction14.mmPaymentInformationStatus, com.tools20022.repository.msg.OriginalPaymentInstruction18.mmPaymentInformationStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction17.mmPaymentInformationCancellationStatus, com.tools20022.repository.msg.OriginalPaymentInstruction19.mmPaymentInformationStatus,
					com.tools20022.repository.msg.OriginalGroupHeader7.mmGroupStatus, com.tools20022.repository.msg.OriginalPaymentInstruction23.mmPaymentInformationStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction24.mmPaymentInformationStatus, com.tools20022.repository.msg.OriginalGroupInformation28.mmGroupStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction22.mmPaymentInformationCancellationStatus);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the payment execution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentStatusCode.mmObject();
		}
	};
	protected Payment payment;
	/**
	 * Payment for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected UnmatchedStatusReasonCode unmatchedStatusReason;
	/**
	 * Reason the transaction/instruction is unmatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#mmUnmatchedStatusReason
	 * PaymentStatusReasonCode4Choice.mmUnmatchedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#mmUnmatched
	 * PaymentStatusReasonCode5Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmUnmatched
	 * PaymentStatusReasonCode6Choice.mmUnmatched}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnmatchedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the transaction/instruction is unmatched."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnmatchedStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmUnmatchedStatusReason, com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmUnmatched,
					com.tools20022.repository.choice.PaymentStatusReasonCode6Choice.mmUnmatched);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnmatchedStatusReason";
			definition = "Reason the transaction/instruction is unmatched.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnmatchedStatusReasonCode.mmObject();
		}
	};
	protected SuspendedStatusReasonCode suspendedStatusReason;
	/**
	 * Reason the transaction/instruction is suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode
	 * SuspendedStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#mmSuspendedStatusReason
	 * PaymentStatusReasonCode4Choice.mmSuspendedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#mmSuspended
	 * PaymentStatusReasonCode5Choice.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmSuspended
	 * PaymentStatusReasonCode6Choice.mmSuspended}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspendedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the transaction/instruction is suspended."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSuspendedStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmSuspendedStatusReason, com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmSuspended,
					com.tools20022.repository.choice.PaymentStatusReasonCode6Choice.mmSuspended);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspendedStatusReason";
			definition = "Reason the transaction/instruction is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReasonCode.mmObject();
		}
	};
	protected PendingSettlementStatusReasonCode pendingSettlement;
	/**
	 * Reason the instruction is pending settlement, ie, delivery or receipt of
	 * the financial instrument. Settlement on the instructed settlement date is
	 * still possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#mmPendingSettlement
	 * PaymentStatusReasonCode3Choice.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#mmPendingSettlement
	 * PaymentStatusReasonCode4Choice.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#mmPendingSettlement
	 * PaymentStatusReasonCode5Choice.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmPendingSettlement
	 * PaymentStatusReasonCode6Choice.mmPendingSettlement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason the instruction is pending settlement, ie, delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPendingSettlement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusReasonCode3Choice.mmPendingSettlement, com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmPendingSettlement,
					com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmPendingSettlement, com.tools20022.repository.choice.PaymentStatusReasonCode6Choice.mmPendingSettlement);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingSettlement";
			definition = "Reason the instruction is pending settlement, ie, delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
		}
	};
	protected PaymentInstructionStatusCode instructionStatus;
	/**
	 * Specifies the state of a payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmStatusValue
	 * PaymentInstructionReference2Details.mmStatusValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice#mmPendingStatus
	 * PaymentStatusCodeSearchChoice.mmPendingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice#mmFinalStatus
	 * PaymentStatusCodeSearchChoice.mmFinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice#mmPendingStatus
	 * PaymentStatusCodeSearch2Choice.mmPendingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice#mmFinalStatus
	 * PaymentStatusCodeSearch2Choice.mmFinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeChoice#mmPendingStatus
	 * PaymentStatusCodeChoice.mmPendingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeChoice#mmFinalStatus
	 * PaymentStatusCodeChoice.mmFinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode2Choice#mmPendingStatus
	 * PaymentStatusCode2Choice.mmPendingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode2Choice#mmFinalStatus
	 * PaymentStatusCode2Choice.mmFinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode3Choice#mmPendingStatus
	 * PaymentStatusCode3Choice.mmPendingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode3Choice#mmFinalStatus
	 * PaymentStatusCode3Choice.mmFinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode4Choice#mmPendingStatus
	 * PaymentStatusCode4Choice.mmPendingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode4Choice#mmFinalStatus
	 * PaymentStatusCode4Choice.mmFinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode4Choice#mmProprietaryStatus
	 * PaymentStatusCode4Choice.mmProprietaryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmPending
	 * PaymentStatusCode5Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmFinal
	 * PaymentStatusCode5Choice.mmFinal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmProprietary
	 * PaymentStatusCode5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmPending
	 * PaymentStatusCode6Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmFinal
	 * PaymentStatusCode6Choice.mmFinal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmProprietary
	 * PaymentStatusCode6Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the state of a payment instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInstructionStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference2Details.mmStatusValue, com.tools20022.repository.choice.PaymentStatusCodeSearchChoice.mmPendingStatus,
					com.tools20022.repository.choice.PaymentStatusCodeSearchChoice.mmFinalStatus, com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice.mmPendingStatus,
					com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice.mmFinalStatus, com.tools20022.repository.choice.PaymentStatusCodeChoice.mmPendingStatus,
					com.tools20022.repository.choice.PaymentStatusCodeChoice.mmFinalStatus, com.tools20022.repository.choice.PaymentStatusCode2Choice.mmPendingStatus, com.tools20022.repository.choice.PaymentStatusCode2Choice.mmFinalStatus,
					com.tools20022.repository.choice.PaymentStatusCode3Choice.mmPendingStatus, com.tools20022.repository.choice.PaymentStatusCode3Choice.mmFinalStatus,
					com.tools20022.repository.choice.PaymentStatusCode4Choice.mmPendingStatus, com.tools20022.repository.choice.PaymentStatusCode4Choice.mmFinalStatus,
					com.tools20022.repository.choice.PaymentStatusCode4Choice.mmProprietaryStatus, com.tools20022.repository.choice.PaymentStatusCode5Choice.mmPending, com.tools20022.repository.choice.PaymentStatusCode5Choice.mmFinal,
					com.tools20022.repository.choice.PaymentStatusCode5Choice.mmProprietary, com.tools20022.repository.choice.PaymentStatusCode6Choice.mmPending, com.tools20022.repository.choice.PaymentStatusCode6Choice.mmFinal,
					com.tools20022.repository.choice.PaymentStatusCode6Choice.mmProprietary);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionStatus";
			definition = "Specifies the state of a payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentInstructionStatusCode.mmObject();
		}
	};
	protected TransactionReasonCode transactionRejectionReason;
	/**
	 * Specifies the reason to reject, return or reverse the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason1Choice#mmCode
	 * ReversalReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason1Choice#mmProprietary
	 * ReversalReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation5#mmReversalReasonInformation
	 * OriginalGroupInformation5.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason4Choice#mmCode
	 * ReversalReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason4Choice#mmProprietary
	 * ReversalReason4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation22#mmReversalReasonInformation
	 * OriginalGroupInformation22.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason1Choice#mmCode
	 * StatusReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason1Choice#mmProprietary
	 * StatusReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason3Choice#mmCode
	 * StatusReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason3Choice#mmProprietary
	 * StatusReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason5Choice#mmCode
	 * StatusReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason5Choice#mmProprietary
	 * StatusReason5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason3Choice#mmCode
	 * ReversalReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason3Choice#mmProprietary
	 * ReversalReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation16#mmReversalReasonInformation
	 * OriginalGroupInformation16.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation14#mmReversalReasonInformation
	 * OriginalGroupInformation14.mmReversalReasonInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason to reject, return or reverse the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReversalReason1Choice.mmCode, com.tools20022.repository.choice.ReversalReason1Choice.mmProprietary,
					com.tools20022.repository.msg.OriginalGroupInformation5.mmReversalReasonInformation, com.tools20022.repository.choice.ReversalReason4Choice.mmCode, com.tools20022.repository.choice.ReversalReason4Choice.mmProprietary,
					com.tools20022.repository.msg.OriginalGroupInformation22.mmReversalReasonInformation, com.tools20022.repository.choice.StatusReason1Choice.mmCode, com.tools20022.repository.choice.StatusReason1Choice.mmProprietary,
					com.tools20022.repository.choice.StatusReason3Choice.mmCode, com.tools20022.repository.choice.StatusReason3Choice.mmProprietary, com.tools20022.repository.choice.StatusReason5Choice.mmCode,
					com.tools20022.repository.choice.StatusReason5Choice.mmProprietary, com.tools20022.repository.choice.ReversalReason3Choice.mmCode, com.tools20022.repository.choice.ReversalReason3Choice.mmProprietary,
					com.tools20022.repository.msg.OriginalGroupInformation16.mmReversalReasonInformation, com.tools20022.repository.msg.OriginalGroupInformation14.mmReversalReasonInformation);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionRejectionReason";
			definition = "Specifies the reason to reject, return or reverse the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionReasonCode.mmObject();
		}
	};
	protected PaymentInvestigationCase relatedInvestigationCase;
	/**
	 * Specifies an investigation case in relation with the payment status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmPaymentStatus
	 * PaymentInvestigationCase.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an investigation case in relation with the payment status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Specifies an investigation case in relation with the payment status.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmPaymentStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
		}
	};
	protected NotificationToReceiveStatusCode notificationStatus;
	/**
	 * Specifies the status of the payment in comparison with the notification
	 * to receive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode
	 * NotificationToReceiveStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification2#mmNotificationStatus
	 * OriginalNotification2.mmNotificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus2#mmItemStatus
	 * OriginalItemAndStatus2.mmItemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification3#mmNotificationStatus
	 * OriginalNotification3.mmNotificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#mmItemStatus
	 * OriginalItemAndStatus3.mmItemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification5#mmNotificationStatus
	 * OriginalNotification5.mmNotificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification7#mmNotificationStatus
	 * OriginalNotification7.mmNotificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#mmItemStatus
	 * OriginalItemAndStatus4.mmItemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification9#mmNotificationStatus
	 * OriginalNotification9.mmNotificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmItemStatus
	 * OriginalItemAndStatus5.mmItemStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the payment in comparison with the notification to receive."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNotificationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalNotification2.mmNotificationStatus, com.tools20022.repository.msg.OriginalItemAndStatus2.mmItemStatus,
					com.tools20022.repository.msg.OriginalNotification3.mmNotificationStatus, com.tools20022.repository.msg.OriginalItemAndStatus3.mmItemStatus, com.tools20022.repository.msg.OriginalNotification5.mmNotificationStatus,
					com.tools20022.repository.msg.OriginalNotification7.mmNotificationStatus, com.tools20022.repository.msg.OriginalItemAndStatus4.mmItemStatus, com.tools20022.repository.msg.OriginalNotification9.mmNotificationStatus,
					com.tools20022.repository.msg.OriginalItemAndStatus5.mmItemStatus);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotificationStatus";
			definition = "Specifies the status of the payment in comparison with the notification to receive.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NotificationToReceiveStatusCode.mmObject();
		}
	};
	protected TransactionStatusCode transactionStatus;
	/**
	 * Specifies the processing status of an investment fund transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionStatusCode
	 * TransactionStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus1#mmItemStatus
	 * OriginalItemAndStatus1.mmItemStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing status of an investment fund transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalItemAndStatus1.mmItemStatus);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Specifies the processing status of an investment fund transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionStatusCode.mmObject();
		}
	};
	protected CashPaymentStatusCode cashPaymentStatus;
	/**
	 * Specifies a generic status of a payment at a specified time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashPaymentStatusCode
	 * CashPaymentStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice#mmPendingAndFinalStatus
	 * PaymentStatusCodeSearchChoice.mmPendingAndFinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice#mmPendingAndFinalStatus
	 * PaymentStatusCodeSearch2Choice.mmPendingAndFinalStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashPaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a generic status of a payment at a specified time."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCashPaymentStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusCodeSearchChoice.mmPendingAndFinalStatus, com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice.mmPendingAndFinalStatus);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashPaymentStatus";
			definition = "Specifies a generic status of a payment at a specified time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashPaymentStatusCode.mmObject();
		}
	};
	protected ExternalStatusReason1Code unsuccessfulStatusReason;
	/**
	 * Reason provided for the status of a transaction.The reason may be in
	 * coded or free text form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalStatusReason1Code
	 * ExternalStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsuccessfulStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason provided for the status of a transaction.The reason may be in coded or free text form."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnsuccessfulStatusReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnsuccessfulStatusReason";
			definition = "Reason provided for the status of a transaction.The reason may be in coded or free text form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalStatusReason1Code.mmObject();
		}
	};
	protected CancellationReasonCode cancellationReason;
	/**
	 * Reason for the cancellation of the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason1Choice#mmCode
	 * CancellationReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason1Choice#mmProprietary
	 * CancellationReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation1#mmCancellationReason
	 * CancellationReasonInformation1.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation4#mmCancellationReasonInformation
	 * OriginalGroupInformation4.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#mmCancellationReasonInformation
	 * PaymentTransactionInformation3.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason2Choice#mmCode
	 * CancellationReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason2Choice#mmProprietary
	 * CancellationReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation3#mmReason
	 * CancellationReasonInformation3.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation23#mmCancellationReasonInformation
	 * OriginalGroupInformation23.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#mmCancellationReasonInformation
	 * PaymentTransactionInformation30.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason14Choice#mmCode
	 * CancellationReason14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason14Choice#mmProprietary
	 * CancellationReason14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason2#mmReason
	 * PaymentCancellationReason2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader4#mmCancellationReasonInformation
	 * OriginalGroupHeader4.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#mmCancellationReasonInformation
	 * PaymentTransaction37.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#mmCancellationReasonInformation
	 * PaymentTransaction47.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmCancellationReasonInformation
	 * PaymentTransactionInformation31.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmCancellationReasonInformation
	 * PaymentTransaction38.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmCancellationReasonInformation
	 * PaymentTransaction48.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationDetails#mmCancellationReason
	 * DebitAuthorisationDetails.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationDetails2#mmCancellationReason
	 * DebitAuthorisationDetails2.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationDetails3#mmCancellationReason
	 * DebitAuthorisationDetails3.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1#mmCancellationReason
	 * DebitAuthorisation1.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#mmCancellationReasonInformation
	 * PaymentTransaction58.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmCancellationReasonInformation
	 * PaymentTransaction55.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#mmCancellationReasonInformation
	 * PaymentTransaction61.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmCancellationReasonInformation
	 * PaymentTransaction62.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason3#mmReason
	 * PaymentCancellationReason3.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2#mmCancellationReason
	 * DebitAuthorisation2.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason33Choice#mmCode
	 * CancellationReason33Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason33Choice#mmProprietary
	 * CancellationReason33Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#mmCancellationReasonInformation
	 * PaymentTransaction74.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmCancellationReasonInformation
	 * OriginalGroupHeader6.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmCancellationReasonInformation
	 * PaymentTransaction75.mmCancellationReasonInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the cancellation of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCancellationReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CancellationReason1Choice.mmCode, com.tools20022.repository.choice.CancellationReason1Choice.mmProprietary,
					com.tools20022.repository.msg.CancellationReasonInformation1.mmCancellationReason, com.tools20022.repository.msg.OriginalGroupInformation4.mmCancellationReasonInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation3.mmCancellationReasonInformation, com.tools20022.repository.choice.CancellationReason2Choice.mmCode,
					com.tools20022.repository.choice.CancellationReason2Choice.mmProprietary, com.tools20022.repository.msg.CancellationReasonInformation3.mmReason,
					com.tools20022.repository.msg.OriginalGroupInformation23.mmCancellationReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation30.mmCancellationReasonInformation,
					com.tools20022.repository.choice.CancellationReason14Choice.mmCode, com.tools20022.repository.choice.CancellationReason14Choice.mmProprietary, com.tools20022.repository.msg.PaymentCancellationReason2.mmReason,
					com.tools20022.repository.msg.OriginalGroupHeader4.mmCancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction37.mmCancellationReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction47.mmCancellationReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation31.mmCancellationReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction38.mmCancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction48.mmCancellationReasonInformation,
					com.tools20022.repository.msg.DebitAuthorisationDetails.mmCancellationReason, com.tools20022.repository.msg.DebitAuthorisationDetails2.mmCancellationReason,
					com.tools20022.repository.msg.DebitAuthorisationDetails3.mmCancellationReason, com.tools20022.repository.msg.DebitAuthorisation1.mmCancellationReason,
					com.tools20022.repository.msg.PaymentTransaction58.mmCancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction55.mmCancellationReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction61.mmCancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction62.mmCancellationReasonInformation,
					com.tools20022.repository.msg.PaymentCancellationReason3.mmReason, com.tools20022.repository.msg.DebitAuthorisation2.mmCancellationReason, com.tools20022.repository.choice.CancellationReason33Choice.mmCode,
					com.tools20022.repository.choice.CancellationReason33Choice.mmProprietary, com.tools20022.repository.msg.PaymentTransaction74.mmCancellationReasonInformation,
					com.tools20022.repository.msg.OriginalGroupHeader6.mmCancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction75.mmCancellationReasonInformation);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Reason for the cancellation of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationReasonCode.mmObject();
		}
	};
	protected MandateReasonCode mandateRejectionReason;
	/**
	 * Reason for requesting the cancellation or the amendment of a mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode
	 * MandateReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateReason1Choice#mmCode
	 * MandateReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateReason1Choice#mmProprietary
	 * MandateReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation2#mmReason
	 * CancellationReasonInformation2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason1#mmReason
	 * PaymentCancellationReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateSuspensionReason1Choice#mmCode
	 * MandateSuspensionReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateSuspensionReason1Choice#mmProprietary
	 * MandateSuspensionReason1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for requesting the cancellation or the amendment of a mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMandateRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MandateReason1Choice.mmCode, com.tools20022.repository.choice.MandateReason1Choice.mmProprietary,
					com.tools20022.repository.msg.CancellationReasonInformation2.mmReason, com.tools20022.repository.msg.PaymentCancellationReason1.mmReason, com.tools20022.repository.choice.MandateSuspensionReason1Choice.mmCode,
					com.tools20022.repository.choice.MandateSuspensionReason1Choice.mmProprietary);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandateRejectionReason";
			definition = "Reason for requesting the cancellation or the amendment of a mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MandateReasonCode.mmObject();
		}
	};
	protected PendingFailingSettlementCode pendingFailingSettlement;
	/**
	 * Reason the transaction/instruction is pending due to failing settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#mmPendingFailingSettlement
	 * PaymentStatusReasonCode3Choice.mmPendingFailingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#mmPendingFailingSettlement
	 * PaymentStatusReasonCode4Choice.mmPendingFailingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#mmPendingFailingSettlement
	 * PaymentStatusReasonCode5Choice.mmPendingFailingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmPendingFailingSettlement
	 * PaymentStatusReasonCode6Choice.mmPendingFailingSettlement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingFailingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason the transaction/instruction is pending due to failing settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPendingFailingSettlement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusReasonCode3Choice.mmPendingFailingSettlement, com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmPendingFailingSettlement,
					com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmPendingFailingSettlement, com.tools20022.repository.choice.PaymentStatusReasonCode6Choice.mmPendingFailingSettlement);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingFailingSettlement";
			definition = "Reason the transaction/instruction is pending due to failing settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingSettlementCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentStatus";
				definition = "Specifies the status of a payment at a specified time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmPaymentStatus, com.tools20022.repository.entity.PaymentInvestigationCase.mmPaymentStatus);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructionStatusSearch2.mmPaymentInstructionStatus, com.tools20022.repository.msg.InstructionStatusSearch3.mmPaymentInstructionStatus,
						com.tools20022.repository.msg.PaymentSearch4.mmStatus, com.tools20022.repository.msg.PaymentStatusDetails1.mmPaymentInstructionStatus, com.tools20022.repository.msg.PaymentStatus1.mmCode,
						com.tools20022.repository.msg.ReturnReasonInformation10.mmReason, com.tools20022.repository.msg.ReversalReasonInformation1.mmReversalReason, com.tools20022.repository.msg.StatusReasonInformation1.mmStatusReason,
						com.tools20022.repository.msg.StatusReasonInformation8.mmReason, com.tools20022.repository.msg.StatusReasonInformation4.mmStatusReason, com.tools20022.repository.msg.StatusReasonInformation6.mmStatusReason,
						com.tools20022.repository.msg.StatusReasonInformation5.mmStatusReason, com.tools20022.repository.msg.StatusReasonInformation7.mmStatusReason,
						com.tools20022.repository.msg.ReversalReasonInformation4.mmReversalReason, com.tools20022.repository.msg.ReversalReasonInformation5.mmReversalReason, com.tools20022.repository.msg.AccountLinkStatus1.mmStatusReason,
						com.tools20022.repository.msg.PaymentSearch5.mmStatus, com.tools20022.repository.msg.PaymentStatus2.mmCode, com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmStatusReason);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentStatus.mmStatus, com.tools20022.repository.entity.PaymentStatus.mmPayment, com.tools20022.repository.entity.PaymentStatus.mmUnmatchedStatusReason,
						com.tools20022.repository.entity.PaymentStatus.mmSuspendedStatusReason, com.tools20022.repository.entity.PaymentStatus.mmPendingSettlement, com.tools20022.repository.entity.PaymentStatus.mmInstructionStatus,
						com.tools20022.repository.entity.PaymentStatus.mmTransactionRejectionReason, com.tools20022.repository.entity.PaymentStatus.mmRelatedInvestigationCase,
						com.tools20022.repository.entity.PaymentStatus.mmNotificationStatus, com.tools20022.repository.entity.PaymentStatus.mmTransactionStatus, com.tools20022.repository.entity.PaymentStatus.mmCashPaymentStatus,
						com.tools20022.repository.entity.PaymentStatus.mmUnsuccessfulStatusReason, com.tools20022.repository.entity.PaymentStatus.mmCancellationReason,
						com.tools20022.repository.entity.PaymentStatus.mmMandateRejectionReason, com.tools20022.repository.entity.PaymentStatus.mmPendingFailingSettlement);
				derivationComponent_lazy = () -> Arrays.asList(PaymentStatusCodeSearchChoice.mmObject(), InstructionStatusSearch2.mmObject(), PaymentStatusCodeSearch2Choice.mmObject(), InstructionStatusSearch3.mmObject(),
						PaymentStatusCodeChoice.mmObject(), PaymentStatusCode2Choice.mmObject(), PaymentStatusReasonCode3Choice.mmObject(), PaymentStatusDetails1.mmObject(), PaymentStatusCode3Choice.mmObject(),
						PaymentStatusDetails3.mmObject(), PaymentStatusCode4Choice.mmObject(), PaymentStatusReasonCode4Choice.mmObject(), PaymentStatusDetails4.mmObject(), PaymentStatusCode5Choice.mmObject(), PaymentStatus1.mmObject(),
						ReturnReasonInformation5.mmObject(), ReturnReasonInformation10.mmObject(), CancellationReason1Choice.mmObject(), CancellationReasonInformation1.mmObject(), CancellationReason2Choice.mmObject(),
						CancellationReasonInformation3.mmObject(), CancellationReason14Choice.mmObject(), PaymentCancellationReason2.mmObject(), ReversalReason1Choice.mmObject(), ReversalReasonInformation1.mmObject(),
						ReversalReason4Choice.mmObject(), StatusReason1Choice.mmObject(), StatusReasonInformation1.mmObject(), StatusReasonInformation8.mmObject(), StatusReasonInformation9.mmObject(), MandateReason1Choice.mmObject(),
						CancellationReasonInformation2.mmObject(), PaymentCancellationReason1.mmObject(), ReturnReasonInformation1.mmObject(), ReturnReasonInformation9.mmObject(), CancellationStatusReasonInformation1.mmObject(),
						StatusReason3Choice.mmObject(), StatusReasonInformation4.mmObject(), StatusReason5Choice.mmObject(), StatusReasonInformation6.mmObject(), StatusReasonInformation5.mmObject(), StatusReasonInformation7.mmObject(),
						ReturnReasonInformation3.mmObject(), ReturnReasonInformation4.mmObject(), ReturnReasonInformation6.mmObject(), ReversalReason3Choice.mmObject(), ReversalReasonInformation4.mmObject(),
						ReversalReasonInformation5.mmObject(), ReturnReasonInformation7.mmObject(), StatusReasonInformation10.mmObject(), PendingStatusAndReason1.mmObject(), PaymentStatusCode6Choice.mmObject(), PaymentStatus2.mmObject(),
						PaymentCancellationReason3.mmObject(), CancellationReason33Choice.mmObject(), MandateSuspensionReason1Choice.mmObject(), MandateSuspensionReason1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentStatusCode getStatus() {
		return status;
	}

	public void setStatus(PaymentStatusCode status) {
		this.status = status;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(com.tools20022.repository.entity.Payment payment) {
		this.payment = payment;
	}

	public UnmatchedStatusReasonCode getUnmatchedStatusReason() {
		return unmatchedStatusReason;
	}

	public void setUnmatchedStatusReason(UnmatchedStatusReasonCode unmatchedStatusReason) {
		this.unmatchedStatusReason = unmatchedStatusReason;
	}

	public SuspendedStatusReasonCode getSuspendedStatusReason() {
		return suspendedStatusReason;
	}

	public void setSuspendedStatusReason(SuspendedStatusReasonCode suspendedStatusReason) {
		this.suspendedStatusReason = suspendedStatusReason;
	}

	public PendingSettlementStatusReasonCode getPendingSettlement() {
		return pendingSettlement;
	}

	public void setPendingSettlement(PendingSettlementStatusReasonCode pendingSettlement) {
		this.pendingSettlement = pendingSettlement;
	}

	public PaymentInstructionStatusCode getInstructionStatus() {
		return instructionStatus;
	}

	public void setInstructionStatus(PaymentInstructionStatusCode instructionStatus) {
		this.instructionStatus = instructionStatus;
	}

	public TransactionReasonCode getTransactionRejectionReason() {
		return transactionRejectionReason;
	}

	public void setTransactionRejectionReason(TransactionReasonCode transactionRejectionReason) {
		this.transactionRejectionReason = transactionRejectionReason;
	}

	public PaymentInvestigationCase getRelatedInvestigationCase() {
		return relatedInvestigationCase;
	}

	public void setRelatedInvestigationCase(com.tools20022.repository.entity.PaymentInvestigationCase relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
	}

	public NotificationToReceiveStatusCode getNotificationStatus() {
		return notificationStatus;
	}

	public void setNotificationStatus(NotificationToReceiveStatusCode notificationStatus) {
		this.notificationStatus = notificationStatus;
	}

	public TransactionStatusCode getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatusCode transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public CashPaymentStatusCode getCashPaymentStatus() {
		return cashPaymentStatus;
	}

	public void setCashPaymentStatus(CashPaymentStatusCode cashPaymentStatus) {
		this.cashPaymentStatus = cashPaymentStatus;
	}

	public ExternalStatusReason1Code getUnsuccessfulStatusReason() {
		return unsuccessfulStatusReason;
	}

	public void setUnsuccessfulStatusReason(ExternalStatusReason1Code unsuccessfulStatusReason) {
		this.unsuccessfulStatusReason = unsuccessfulStatusReason;
	}

	public CancellationReasonCode getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(CancellationReasonCode cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	public MandateReasonCode getMandateRejectionReason() {
		return mandateRejectionReason;
	}

	public void setMandateRejectionReason(MandateReasonCode mandateRejectionReason) {
		this.mandateRejectionReason = mandateRejectionReason;
	}

	public PendingFailingSettlementCode getPendingFailingSettlement() {
		return pendingFailingSettlement;
	}

	public void setPendingFailingSettlement(PendingFailingSettlementCode pendingFailingSettlement) {
		this.pendingFailingSettlement = pendingFailingSettlement;
	}
}