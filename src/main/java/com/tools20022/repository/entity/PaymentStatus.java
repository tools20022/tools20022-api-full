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
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus#Status
 * PaymentStatus.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus#Payment
 * PaymentStatus.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#UnmatchedStatusReason
 * PaymentStatus.UnmatchedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#SuspendedStatusReason
 * PaymentStatus.SuspendedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#PendingSettlement
 * PaymentStatus.PendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#InstructionStatus
 * PaymentStatus.InstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#TransactionRejectionReason
 * PaymentStatus.TransactionRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#RelatedInvestigationCase
 * PaymentStatus.RelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#NotificationStatus
 * PaymentStatus.NotificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#TransactionStatus
 * PaymentStatus.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#CashPaymentStatus
 * PaymentStatus.CashPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#UnsuccessfulStatusReason
 * PaymentStatus.UnsuccessfulStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#CancellationReason
 * PaymentStatus.CancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#MandateRejectionReason
 * PaymentStatus.MandateRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#PendingFailingSettlement
 * PaymentStatus.PendingFailingSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PaymentStatus
 * Payment.PaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#PaymentStatus
 * PaymentInvestigationCase.PaymentStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch2#PaymentInstructionStatus
 * InstructionStatusSearch2.PaymentInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3#PaymentInstructionStatus
 * InstructionStatusSearch3.PaymentInstructionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch4#Status
 * PaymentSearch4.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails1#PaymentInstructionStatus
 * PaymentStatusDetails1.PaymentInstructionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus1#Code
 * PaymentStatus1.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation10#Reason
 * ReturnReasonInformation10.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation1#ReversalReason
 * ReversalReasonInformation1.ReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation1#StatusReason
 * StatusReasonInformation1.StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation8#Reason
 * StatusReasonInformation8.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation4#StatusReason
 * StatusReasonInformation4.StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation6#StatusReason
 * StatusReasonInformation6.StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation5#StatusReason
 * StatusReasonInformation5.StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation7#StatusReason
 * StatusReasonInformation7.StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation4#ReversalReason
 * ReversalReasonInformation4.ReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation5#ReversalReason
 * ReversalReasonInformation5.ReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLinkStatus1#StatusReason
 * AccountLinkStatus1.StatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5#Status
 * PaymentSearch5.Status}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus2#Code
 * PaymentStatus2.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#StatusReason
 * CurrencyControlGroupStatus1.StatusReason}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#InstructionStatus
	 * PaymentSearch2.InstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#InstructionStatus
	 * PaymentSearch3.InstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation1#GroupStatus
	 * OriginalGroupInformation1.GroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#TransactionStatus
	 * PaymentTransactionInformation1.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation20#GroupStatus
	 * OriginalGroupInformation20.GroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#TransactionStatus
	 * PaymentTransactionInformation25.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation1#PaymentInformationStatus
	 * OriginalPaymentInformation1.PaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#GroupStatus
	 * OriginalGroupHeader1.GroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction1#PaymentInformationStatus
	 * OriginalPaymentInstruction1.PaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction6#PaymentInformationStatus
	 * OriginalPaymentInstruction6.PaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#TransactionStatus
	 * PaymentTransactionInformation26.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#GroupStatus
	 * OriginalGroupInformation25.GroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#TransactionStatus
	 * PaymentTransactionInformation34.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation5#PaymentInformationStatus
	 * OriginalPaymentInformation5.PaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction5#PaymentInformationStatus
	 * OriginalPaymentInstruction5.PaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction9#PaymentInformationStatus
	 * OriginalPaymentInstruction9.PaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation24#GroupCancellationStatus
	 * OriginalGroupInformation24.GroupCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#TransactionCancellationStatus
	 * PaymentTransactionInformation32.TransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3#PaymentInformationCancellationStatus
	 * OriginalPaymentInformation3.PaymentInformationCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#TransactionCancellationStatus
	 * PaymentTransactionInformation33.TransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction3#PaymentInformationCancellationStatus
	 * OriginalPaymentInstruction3.PaymentInformationCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#GroupStatus
	 * OriginalGroupInformation13.GroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation17#GroupStatus
	 * OriginalGroupInformation17.GroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#GroupStatus
	 * OriginalGroupInformation15.GroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation19#GroupStatus
	 * OriginalGroupInformation19.GroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#TransactionStatus
	 * PaymentTransactionInformation15.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#TransactionStatus
	 * PaymentTransactionInformation22.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#TransactionStatus
	 * PaymentTransactionInformation12.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#TransactionStatus
	 * PaymentTransactionInformation19.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction12#PaymentInformationStatus
	 * OriginalPaymentInstruction12.PaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10#PaymentInformationCancellationStatus
	 * OriginalPaymentInstruction10.PaymentInformationCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction14#PaymentInformationStatus
	 * OriginalPaymentInstruction14.PaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#PaymentInformationStatus
	 * OriginalPaymentInstruction18.PaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#PaymentInformationCancellationStatus
	 * OriginalPaymentInstruction17.PaymentInformationCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction19#PaymentInformationStatus
	 * OriginalPaymentInstruction19.PaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#GroupStatus
	 * OriginalGroupHeader7.GroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#PaymentInformationStatus
	 * OriginalPaymentInstruction23.PaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#PaymentInformationStatus
	 * OriginalPaymentInstruction24.PaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#GroupStatus
	 * OriginalGroupInformation28.GroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#PaymentInformationCancellationStatus
	 * OriginalPaymentInstruction22.PaymentInformationCancellationStatus}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the payment execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Status = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentSearch2.InstructionStatus, com.tools20022.repository.msg.PaymentSearch3.InstructionStatus,
					com.tools20022.repository.msg.OriginalGroupInformation1.GroupStatus, com.tools20022.repository.msg.PaymentTransactionInformation1.TransactionStatus, com.tools20022.repository.msg.OriginalGroupInformation20.GroupStatus,
					com.tools20022.repository.msg.PaymentTransactionInformation25.TransactionStatus, com.tools20022.repository.msg.OriginalPaymentInformation1.PaymentInformationStatus,
					com.tools20022.repository.msg.OriginalGroupHeader1.GroupStatus, com.tools20022.repository.msg.OriginalPaymentInstruction1.PaymentInformationStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction6.PaymentInformationStatus, com.tools20022.repository.msg.PaymentTransactionInformation26.TransactionStatus,
					com.tools20022.repository.msg.OriginalGroupInformation25.GroupStatus, com.tools20022.repository.msg.PaymentTransactionInformation34.TransactionStatus,
					com.tools20022.repository.msg.OriginalPaymentInformation5.PaymentInformationStatus, com.tools20022.repository.msg.OriginalPaymentInstruction5.PaymentInformationStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction9.PaymentInformationStatus, com.tools20022.repository.msg.OriginalGroupInformation24.GroupCancellationStatus,
					com.tools20022.repository.msg.PaymentTransactionInformation32.TransactionCancellationStatus, com.tools20022.repository.msg.OriginalPaymentInformation3.PaymentInformationCancellationStatus,
					com.tools20022.repository.msg.PaymentTransactionInformation33.TransactionCancellationStatus, com.tools20022.repository.msg.OriginalPaymentInstruction3.PaymentInformationCancellationStatus,
					com.tools20022.repository.msg.OriginalGroupInformation13.GroupStatus, com.tools20022.repository.msg.OriginalGroupInformation17.GroupStatus, com.tools20022.repository.msg.OriginalGroupInformation15.GroupStatus,
					com.tools20022.repository.msg.OriginalGroupInformation19.GroupStatus, com.tools20022.repository.msg.PaymentTransactionInformation15.TransactionStatus,
					com.tools20022.repository.msg.PaymentTransactionInformation22.TransactionStatus, com.tools20022.repository.msg.PaymentTransactionInformation12.TransactionStatus,
					com.tools20022.repository.msg.PaymentTransactionInformation19.TransactionStatus, com.tools20022.repository.msg.OriginalPaymentInstruction12.PaymentInformationStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction10.PaymentInformationCancellationStatus, com.tools20022.repository.msg.OriginalPaymentInstruction14.PaymentInformationStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction18.PaymentInformationStatus, com.tools20022.repository.msg.OriginalPaymentInstruction17.PaymentInformationCancellationStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction19.PaymentInformationStatus, com.tools20022.repository.msg.OriginalGroupHeader7.GroupStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction23.PaymentInformationStatus, com.tools20022.repository.msg.OriginalPaymentInstruction24.PaymentInformationStatus,
					com.tools20022.repository.msg.OriginalGroupInformation28.GroupStatus, com.tools20022.repository.msg.OriginalPaymentInstruction22.PaymentInformationCancellationStatus);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the payment execution.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentStatusCode.mmObject();
		}
	};
	/**
	 * Payment for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PaymentStatus
	 * Payment.PaymentStatus}</li>
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
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which a status is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.PaymentStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#UnmatchedStatusReason
	 * PaymentStatusReasonCode4Choice.UnmatchedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#Unmatched
	 * PaymentStatusReasonCode5Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#Unmatched
	 * PaymentStatusReasonCode6Choice.Unmatched}</li>
	 * </ul>
	 * </li>
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
	 * name} = "UnmatchedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the transaction/instruction is unmatched."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnmatchedStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.UnmatchedStatusReason, com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.Unmatched,
					com.tools20022.repository.choice.PaymentStatusReasonCode6Choice.Unmatched);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnmatchedStatusReason";
			definition = "Reason the transaction/instruction is unmatched.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UnmatchedStatusReasonCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#SuspendedStatusReason
	 * PaymentStatusReasonCode4Choice.SuspendedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#Suspended
	 * PaymentStatusReasonCode5Choice.Suspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#Suspended
	 * PaymentStatusReasonCode6Choice.Suspended}</li>
	 * </ul>
	 * </li>
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
	 * name} = "SuspendedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the transaction/instruction is suspended."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SuspendedStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.SuspendedStatusReason, com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.Suspended,
					com.tools20022.repository.choice.PaymentStatusReasonCode6Choice.Suspended);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspendedStatusReason";
			definition = "Reason the transaction/instruction is suspended.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReasonCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#PendingSettlement
	 * PaymentStatusReasonCode3Choice.PendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#PendingSettlement
	 * PaymentStatusReasonCode4Choice.PendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#PendingSettlement
	 * PaymentStatusReasonCode5Choice.PendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#PendingSettlement
	 * PaymentStatusReasonCode6Choice.PendingSettlement}</li>
	 * </ul>
	 * </li>
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
	 * name} = "PendingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason the instruction is pending settlement, ie, delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PendingSettlement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusReasonCode3Choice.PendingSettlement, com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.PendingSettlement,
					com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.PendingSettlement, com.tools20022.repository.choice.PaymentStatusReasonCode6Choice.PendingSettlement);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingSettlement";
			definition = "Reason the instruction is pending settlement, ie, delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#StatusValue
	 * PaymentInstructionReference2Details.StatusValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice#PendingStatus
	 * PaymentStatusCodeSearchChoice.PendingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice#FinalStatus
	 * PaymentStatusCodeSearchChoice.FinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice#PendingStatus
	 * PaymentStatusCodeSearch2Choice.PendingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice#FinalStatus
	 * PaymentStatusCodeSearch2Choice.FinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeChoice#PendingStatus
	 * PaymentStatusCodeChoice.PendingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeChoice#FinalStatus
	 * PaymentStatusCodeChoice.FinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode2Choice#PendingStatus
	 * PaymentStatusCode2Choice.PendingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode2Choice#FinalStatus
	 * PaymentStatusCode2Choice.FinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode3Choice#PendingStatus
	 * PaymentStatusCode3Choice.PendingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode3Choice#FinalStatus
	 * PaymentStatusCode3Choice.FinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode4Choice#PendingStatus
	 * PaymentStatusCode4Choice.PendingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode4Choice#FinalStatus
	 * PaymentStatusCode4Choice.FinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode4Choice#ProprietaryStatus
	 * PaymentStatusCode4Choice.ProprietaryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#Pending
	 * PaymentStatusCode5Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#Final
	 * PaymentStatusCode5Choice.Final}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#Proprietary
	 * PaymentStatusCode5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#Pending
	 * PaymentStatusCode6Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#Final
	 * PaymentStatusCode6Choice.Final}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#Proprietary
	 * PaymentStatusCode6Choice.Proprietary}</li>
	 * </ul>
	 * </li>
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
	 * name} = "InstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the state of a payment instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference2Details.StatusValue, com.tools20022.repository.choice.PaymentStatusCodeSearchChoice.PendingStatus,
					com.tools20022.repository.choice.PaymentStatusCodeSearchChoice.FinalStatus, com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice.PendingStatus,
					com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice.FinalStatus, com.tools20022.repository.choice.PaymentStatusCodeChoice.PendingStatus, com.tools20022.repository.choice.PaymentStatusCodeChoice.FinalStatus,
					com.tools20022.repository.choice.PaymentStatusCode2Choice.PendingStatus, com.tools20022.repository.choice.PaymentStatusCode2Choice.FinalStatus, com.tools20022.repository.choice.PaymentStatusCode3Choice.PendingStatus,
					com.tools20022.repository.choice.PaymentStatusCode3Choice.FinalStatus, com.tools20022.repository.choice.PaymentStatusCode4Choice.PendingStatus, com.tools20022.repository.choice.PaymentStatusCode4Choice.FinalStatus,
					com.tools20022.repository.choice.PaymentStatusCode4Choice.ProprietaryStatus, com.tools20022.repository.choice.PaymentStatusCode5Choice.Pending, com.tools20022.repository.choice.PaymentStatusCode5Choice.Final,
					com.tools20022.repository.choice.PaymentStatusCode5Choice.Proprietary, com.tools20022.repository.choice.PaymentStatusCode6Choice.Pending, com.tools20022.repository.choice.PaymentStatusCode6Choice.Final,
					com.tools20022.repository.choice.PaymentStatusCode6Choice.Proprietary);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionStatus";
			definition = "Specifies the state of a payment instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentInstructionStatusCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason1Choice#Code
	 * ReversalReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason1Choice#Proprietary
	 * ReversalReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation5#ReversalReasonInformation
	 * OriginalGroupInformation5.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason4Choice#Code
	 * ReversalReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason4Choice#Proprietary
	 * ReversalReason4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation22#ReversalReasonInformation
	 * OriginalGroupInformation22.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason1Choice#Code
	 * StatusReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason1Choice#Proprietary
	 * StatusReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason3Choice#Code
	 * StatusReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason3Choice#Proprietary
	 * StatusReason3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason5Choice#Code
	 * StatusReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason5Choice#Proprietary
	 * StatusReason5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason3Choice#Code
	 * ReversalReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason3Choice#Proprietary
	 * ReversalReason3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation16#ReversalReasonInformation
	 * OriginalGroupInformation16.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation14#ReversalReasonInformation
	 * OriginalGroupInformation14.ReversalReasonInformation}</li>
	 * </ul>
	 * </li>
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
	 * name} = "TransactionRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason to reject, return or reverse the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReversalReason1Choice.Code, com.tools20022.repository.choice.ReversalReason1Choice.Proprietary,
					com.tools20022.repository.msg.OriginalGroupInformation5.ReversalReasonInformation, com.tools20022.repository.choice.ReversalReason4Choice.Code, com.tools20022.repository.choice.ReversalReason4Choice.Proprietary,
					com.tools20022.repository.msg.OriginalGroupInformation22.ReversalReasonInformation, com.tools20022.repository.choice.StatusReason1Choice.Code, com.tools20022.repository.choice.StatusReason1Choice.Proprietary,
					com.tools20022.repository.choice.StatusReason3Choice.Code, com.tools20022.repository.choice.StatusReason3Choice.Proprietary, com.tools20022.repository.choice.StatusReason5Choice.Code,
					com.tools20022.repository.choice.StatusReason5Choice.Proprietary, com.tools20022.repository.choice.ReversalReason3Choice.Code, com.tools20022.repository.choice.ReversalReason3Choice.Proprietary,
					com.tools20022.repository.msg.OriginalGroupInformation16.ReversalReasonInformation, com.tools20022.repository.msg.OriginalGroupInformation14.ReversalReasonInformation);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionRejectionReason";
			definition = "Specifies the reason to reject, return or reverse the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionReasonCode.mmObject();
		}
	};
	/**
	 * Specifies an investigation case in relation with the payment status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#PaymentStatus
	 * PaymentInvestigationCase.PaymentStatus}</li>
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
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Specifies an investigation case in relation with the payment status.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.PaymentStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification2#NotificationStatus
	 * OriginalNotification2.NotificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus2#ItemStatus
	 * OriginalItemAndStatus2.ItemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification3#NotificationStatus
	 * OriginalNotification3.NotificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#ItemStatus
	 * OriginalItemAndStatus3.ItemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification5#NotificationStatus
	 * OriginalNotification5.NotificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification7#NotificationStatus
	 * OriginalNotification7.NotificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#ItemStatus
	 * OriginalItemAndStatus4.ItemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification9#NotificationStatus
	 * OriginalNotification9.NotificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#ItemStatus
	 * OriginalItemAndStatus5.ItemStatus}</li>
	 * </ul>
	 * </li>
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
	 * name} = "NotificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the payment in comparison with the notification to receive."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NotificationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalNotification2.NotificationStatus, com.tools20022.repository.msg.OriginalItemAndStatus2.ItemStatus,
					com.tools20022.repository.msg.OriginalNotification3.NotificationStatus, com.tools20022.repository.msg.OriginalItemAndStatus3.ItemStatus, com.tools20022.repository.msg.OriginalNotification5.NotificationStatus,
					com.tools20022.repository.msg.OriginalNotification7.NotificationStatus, com.tools20022.repository.msg.OriginalItemAndStatus4.ItemStatus, com.tools20022.repository.msg.OriginalNotification9.NotificationStatus,
					com.tools20022.repository.msg.OriginalItemAndStatus5.ItemStatus);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotificationStatus";
			definition = "Specifies the status of the payment in comparison with the notification to receive.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NotificationToReceiveStatusCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus1#ItemStatus
	 * OriginalItemAndStatus1.ItemStatus}</li>
	 * </ul>
	 * </li>
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
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing status of an investment fund transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalItemAndStatus1.ItemStatus);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Specifies the processing status of an investment fund transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionStatusCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice#PendingAndFinalStatus
	 * PaymentStatusCodeSearchChoice.PendingAndFinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice#PendingAndFinalStatus
	 * PaymentStatusCodeSearch2Choice.PendingAndFinalStatus}</li>
	 * </ul>
	 * </li>
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
	 * name} = "CashPaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a generic status of a payment at a specified time."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashPaymentStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusCodeSearchChoice.PendingAndFinalStatus, com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice.PendingAndFinalStatus);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashPaymentStatus";
			definition = "Specifies a generic status of a payment at a specified time.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CashPaymentStatusCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute UnsuccessfulStatusReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnsuccessfulStatusReason";
			definition = "Reason provided for the status of a transaction.The reason may be in coded or free text form.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalStatusReason1Code.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason1Choice#Code
	 * CancellationReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason1Choice#Proprietary
	 * CancellationReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation1#CancellationReason
	 * CancellationReasonInformation1.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation4#CancellationReasonInformation
	 * OriginalGroupInformation4.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#CancellationReasonInformation
	 * PaymentTransactionInformation3.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason2Choice#Code
	 * CancellationReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason2Choice#Proprietary
	 * CancellationReason2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation3#Reason
	 * CancellationReasonInformation3.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation23#CancellationReasonInformation
	 * OriginalGroupInformation23.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#CancellationReasonInformation
	 * PaymentTransactionInformation30.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason14Choice#Code
	 * CancellationReason14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason14Choice#Proprietary
	 * CancellationReason14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason2#Reason
	 * PaymentCancellationReason2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader4#CancellationReasonInformation
	 * OriginalGroupHeader4.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#CancellationReasonInformation
	 * PaymentTransaction37.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#CancellationReasonInformation
	 * PaymentTransaction47.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#CancellationReasonInformation
	 * PaymentTransactionInformation31.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#CancellationReasonInformation
	 * PaymentTransaction38.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#CancellationReasonInformation
	 * PaymentTransaction48.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationDetails#CancellationReason
	 * DebitAuthorisationDetails.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationDetails2#CancellationReason
	 * DebitAuthorisationDetails2.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationDetails3#CancellationReason
	 * DebitAuthorisationDetails3.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1#CancellationReason
	 * DebitAuthorisation1.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#CancellationReasonInformation
	 * PaymentTransaction58.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#CancellationReasonInformation
	 * PaymentTransaction55.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#CancellationReasonInformation
	 * PaymentTransaction61.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#CancellationReasonInformation
	 * PaymentTransaction62.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason3#Reason
	 * PaymentCancellationReason3.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2#CancellationReason
	 * DebitAuthorisation2.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason33Choice#Code
	 * CancellationReason33Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason33Choice#Proprietary
	 * CancellationReason33Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#CancellationReasonInformation
	 * PaymentTransaction74.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#CancellationReasonInformation
	 * OriginalGroupHeader6.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#CancellationReasonInformation
	 * PaymentTransaction75.CancellationReasonInformation}</li>
	 * </ul>
	 * </li>
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
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the cancellation of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CancellationReason1Choice.Code, com.tools20022.repository.choice.CancellationReason1Choice.Proprietary,
					com.tools20022.repository.msg.CancellationReasonInformation1.CancellationReason, com.tools20022.repository.msg.OriginalGroupInformation4.CancellationReasonInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation3.CancellationReasonInformation, com.tools20022.repository.choice.CancellationReason2Choice.Code,
					com.tools20022.repository.choice.CancellationReason2Choice.Proprietary, com.tools20022.repository.msg.CancellationReasonInformation3.Reason,
					com.tools20022.repository.msg.OriginalGroupInformation23.CancellationReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation30.CancellationReasonInformation,
					com.tools20022.repository.choice.CancellationReason14Choice.Code, com.tools20022.repository.choice.CancellationReason14Choice.Proprietary, com.tools20022.repository.msg.PaymentCancellationReason2.Reason,
					com.tools20022.repository.msg.OriginalGroupHeader4.CancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction37.CancellationReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction47.CancellationReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation31.CancellationReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction38.CancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction48.CancellationReasonInformation,
					com.tools20022.repository.msg.DebitAuthorisationDetails.CancellationReason, com.tools20022.repository.msg.DebitAuthorisationDetails2.CancellationReason,
					com.tools20022.repository.msg.DebitAuthorisationDetails3.CancellationReason, com.tools20022.repository.msg.DebitAuthorisation1.CancellationReason,
					com.tools20022.repository.msg.PaymentTransaction58.CancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction55.CancellationReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction61.CancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction62.CancellationReasonInformation,
					com.tools20022.repository.msg.PaymentCancellationReason3.Reason, com.tools20022.repository.msg.DebitAuthorisation2.CancellationReason, com.tools20022.repository.choice.CancellationReason33Choice.Code,
					com.tools20022.repository.choice.CancellationReason33Choice.Proprietary, com.tools20022.repository.msg.PaymentTransaction74.CancellationReasonInformation,
					com.tools20022.repository.msg.OriginalGroupHeader6.CancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction75.CancellationReasonInformation);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Reason for the cancellation of the payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancellationReasonCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateReason1Choice#Code
	 * MandateReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateReason1Choice#Proprietary
	 * MandateReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation2#Reason
	 * CancellationReasonInformation2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason1#Reason
	 * PaymentCancellationReason1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateSuspensionReason1Choice#Code
	 * MandateSuspensionReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateSuspensionReason1Choice#Proprietary
	 * MandateSuspensionReason1Choice.Proprietary}</li>
	 * </ul>
	 * </li>
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
	 * name} = "MandateRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for requesting the cancellation or the amendment of a mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MandateRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MandateReason1Choice.Code, com.tools20022.repository.choice.MandateReason1Choice.Proprietary,
					com.tools20022.repository.msg.CancellationReasonInformation2.Reason, com.tools20022.repository.msg.PaymentCancellationReason1.Reason, com.tools20022.repository.choice.MandateSuspensionReason1Choice.Code,
					com.tools20022.repository.choice.MandateSuspensionReason1Choice.Proprietary);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandateRejectionReason";
			definition = "Reason for requesting the cancellation or the amendment of a mandate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MandateReasonCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#PendingFailingSettlement
	 * PaymentStatusReasonCode3Choice.PendingFailingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#PendingFailingSettlement
	 * PaymentStatusReasonCode4Choice.PendingFailingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#PendingFailingSettlement
	 * PaymentStatusReasonCode5Choice.PendingFailingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#PendingFailingSettlement
	 * PaymentStatusReasonCode6Choice.PendingFailingSettlement}</li>
	 * </ul>
	 * </li>
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
	 * name} = "PendingFailingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason the transaction/instruction is pending due to failing settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PendingFailingSettlement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusReasonCode3Choice.PendingFailingSettlement, com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.PendingFailingSettlement,
					com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.PendingFailingSettlement, com.tools20022.repository.choice.PaymentStatusReasonCode6Choice.PendingFailingSettlement);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingFailingSettlement";
			definition = "Reason the transaction/instruction is pending due to failing settlement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PendingFailingSettlementCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentStatus";
				definition = "Specifies the status of a payment at a specified time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.PaymentStatus, com.tools20022.repository.entity.PaymentInvestigationCase.PaymentStatus);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructionStatusSearch2.PaymentInstructionStatus, com.tools20022.repository.msg.InstructionStatusSearch3.PaymentInstructionStatus,
						com.tools20022.repository.msg.PaymentSearch4.Status, com.tools20022.repository.msg.PaymentStatusDetails1.PaymentInstructionStatus, com.tools20022.repository.msg.PaymentStatus1.Code,
						com.tools20022.repository.msg.ReturnReasonInformation10.Reason, com.tools20022.repository.msg.ReversalReasonInformation1.ReversalReason, com.tools20022.repository.msg.StatusReasonInformation1.StatusReason,
						com.tools20022.repository.msg.StatusReasonInformation8.Reason, com.tools20022.repository.msg.StatusReasonInformation4.StatusReason, com.tools20022.repository.msg.StatusReasonInformation6.StatusReason,
						com.tools20022.repository.msg.StatusReasonInformation5.StatusReason, com.tools20022.repository.msg.StatusReasonInformation7.StatusReason, com.tools20022.repository.msg.ReversalReasonInformation4.ReversalReason,
						com.tools20022.repository.msg.ReversalReasonInformation5.ReversalReason, com.tools20022.repository.msg.AccountLinkStatus1.StatusReason, com.tools20022.repository.msg.PaymentSearch5.Status,
						com.tools20022.repository.msg.PaymentStatus2.Code, com.tools20022.repository.msg.CurrencyControlGroupStatus1.StatusReason);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentStatus.Status, com.tools20022.repository.entity.PaymentStatus.Payment, com.tools20022.repository.entity.PaymentStatus.UnmatchedStatusReason,
						com.tools20022.repository.entity.PaymentStatus.SuspendedStatusReason, com.tools20022.repository.entity.PaymentStatus.PendingSettlement, com.tools20022.repository.entity.PaymentStatus.InstructionStatus,
						com.tools20022.repository.entity.PaymentStatus.TransactionRejectionReason, com.tools20022.repository.entity.PaymentStatus.RelatedInvestigationCase, com.tools20022.repository.entity.PaymentStatus.NotificationStatus,
						com.tools20022.repository.entity.PaymentStatus.TransactionStatus, com.tools20022.repository.entity.PaymentStatus.CashPaymentStatus, com.tools20022.repository.entity.PaymentStatus.UnsuccessfulStatusReason,
						com.tools20022.repository.entity.PaymentStatus.CancellationReason, com.tools20022.repository.entity.PaymentStatus.MandateRejectionReason, com.tools20022.repository.entity.PaymentStatus.PendingFailingSettlement);
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
}