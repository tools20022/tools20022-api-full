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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the status of a payment at a specified time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentStatus" src="doc-files/PaymentStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch6#mmStatus
 * PaymentSearch6.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus3#mmCode
 * PaymentStatus3.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch7#mmStatus
 * PaymentSearch7.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch4#mmPaymentInstructionStatus
 * InstructionStatusSearch4.mmPaymentInstructionStatus}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusAndReason2
 * PendingStatusAndReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCancellationReason3
 * PaymentCancellationReason3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationReason33Choice
 * CancellationReason33Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MandateSuspensionReason1Choice
 * MandateSuspensionReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateSuspensionReason1
 * MandateSuspensionReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus3 PaymentStatus3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionStatusSearch4
 * InstructionStatusSearch4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCancellationReason4
 * PaymentCancellationReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReasonInformation11
 * StatusReasonInformation11}</li>
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
	protected PaymentStatusCode status;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmPaymentInformationCancellationStatus
	 * OriginalPaymentInstruction26.mmPaymentInformationCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction27#mmPaymentInformationStatus
	 * OriginalPaymentInstruction27.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader13#mmGroupStatus
	 * OriginalGroupHeader13.mmGroupStatus}</li>
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
	public static final MMBusinessAttribute mmStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentSearch2.mmInstructionStatus, PaymentSearch3.mmInstructionStatus, OriginalGroupInformation1.mmGroupStatus, PaymentTransactionInformation1.mmTransactionStatus,
					OriginalGroupInformation20.mmGroupStatus, PaymentTransactionInformation25.mmTransactionStatus, OriginalPaymentInformation1.mmPaymentInformationStatus, OriginalGroupHeader1.mmGroupStatus,
					OriginalPaymentInstruction1.mmPaymentInformationStatus, OriginalPaymentInstruction6.mmPaymentInformationStatus, PaymentTransactionInformation26.mmTransactionStatus, OriginalGroupInformation25.mmGroupStatus,
					PaymentTransactionInformation34.mmTransactionStatus, OriginalPaymentInformation5.mmPaymentInformationStatus, OriginalPaymentInstruction5.mmPaymentInformationStatus,
					OriginalPaymentInstruction9.mmPaymentInformationStatus, OriginalGroupInformation24.mmGroupCancellationStatus, PaymentTransactionInformation32.mmTransactionCancellationStatus,
					OriginalPaymentInformation3.mmPaymentInformationCancellationStatus, PaymentTransactionInformation33.mmTransactionCancellationStatus, OriginalPaymentInstruction3.mmPaymentInformationCancellationStatus,
					OriginalGroupInformation13.mmGroupStatus, OriginalGroupInformation17.mmGroupStatus, OriginalGroupInformation15.mmGroupStatus, OriginalGroupInformation19.mmGroupStatus,
					PaymentTransactionInformation15.mmTransactionStatus, PaymentTransactionInformation22.mmTransactionStatus, PaymentTransactionInformation12.mmTransactionStatus, PaymentTransactionInformation19.mmTransactionStatus,
					OriginalPaymentInstruction12.mmPaymentInformationStatus, OriginalPaymentInstruction10.mmPaymentInformationCancellationStatus, OriginalPaymentInstruction14.mmPaymentInformationStatus,
					OriginalPaymentInstruction18.mmPaymentInformationStatus, OriginalPaymentInstruction17.mmPaymentInformationCancellationStatus, OriginalPaymentInstruction19.mmPaymentInformationStatus, OriginalGroupHeader7.mmGroupStatus,
					OriginalPaymentInstruction23.mmPaymentInformationStatus, OriginalPaymentInstruction24.mmPaymentInformationStatus, OriginalGroupInformation28.mmGroupStatus,
					OriginalPaymentInstruction22.mmPaymentInformationCancellationStatus, OriginalPaymentInstruction26.mmPaymentInformationCancellationStatus, OriginalPaymentInstruction27.mmPaymentInformationStatus,
					OriginalGroupHeader13.mmGroupStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the payment execution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Payment payment;
	/**
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected TransferUnmatchedReasonCode unmatchedStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferUnmatchedReasonCode
	 * TransferUnmatchedReasonCode}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice#mmUnmatched
	 * PaymentStatusReasonCode7Choice.mmUnmatched}</li>
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
	public static final MMBusinessAttribute mmUnmatchedStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentStatusReasonCode4Choice.mmUnmatchedStatusReason, PaymentStatusReasonCode5Choice.mmUnmatched, PaymentStatusReasonCode6Choice.mmUnmatched, PaymentStatusReasonCode7Choice.mmUnmatched);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnmatchedStatusReason";
			definition = "Reason the transaction/instruction is unmatched.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransferUnmatchedReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getUnmatchedStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SuspendedStatusReasonCode suspendedStatusReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#mmSuspendedStatusReason
	 * PaymentStatusReasonCode4Choice.mmSuspendedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#mmSuspended
	 * PaymentStatusReasonCode5Choice.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmSuspended
	 * PaymentStatusReasonCode6Choice.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice#mmSuspended
	 * PaymentStatusReasonCode7Choice.mmSuspended}</li>
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
	public static final MMBusinessAttribute mmSuspendedStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentStatusReasonCode4Choice.mmSuspendedStatusReason, PaymentStatusReasonCode5Choice.mmSuspended, PaymentStatusReasonCode6Choice.mmSuspended, PaymentStatusReasonCode7Choice.mmSuspended);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuspendedStatusReason";
			definition = "Reason the transaction/instruction is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getSuspendedStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PendingSettlementStatusReasonCode pendingSettlement;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice#mmPendingSettlement
	 * PaymentStatusReasonCode7Choice.mmPendingSettlement}</li>
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
	public static final MMBusinessAttribute mmPendingSettlement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentStatusReasonCode3Choice.mmPendingSettlement, PaymentStatusReasonCode4Choice.mmPendingSettlement, PaymentStatusReasonCode5Choice.mmPendingSettlement,
					PaymentStatusReasonCode6Choice.mmPendingSettlement, PaymentStatusReasonCode7Choice.mmPendingSettlement);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingSettlement";
			definition = "Reason the instruction is pending settlement, ie, delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getPendingSettlement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentInstructionStatusCode instructionStatus;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmInstructionStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstructionReference2Details.mmStatusValue, PaymentStatusCodeSearchChoice.mmPendingStatus, PaymentStatusCodeSearchChoice.mmFinalStatus,
					PaymentStatusCodeSearch2Choice.mmPendingStatus, PaymentStatusCodeSearch2Choice.mmFinalStatus, PaymentStatusCodeChoice.mmPendingStatus, PaymentStatusCodeChoice.mmFinalStatus, PaymentStatusCode2Choice.mmPendingStatus,
					PaymentStatusCode2Choice.mmFinalStatus, PaymentStatusCode3Choice.mmPendingStatus, PaymentStatusCode3Choice.mmFinalStatus, PaymentStatusCode4Choice.mmPendingStatus, PaymentStatusCode4Choice.mmFinalStatus,
					PaymentStatusCode4Choice.mmProprietaryStatus, PaymentStatusCode5Choice.mmPending, PaymentStatusCode5Choice.mmFinal, PaymentStatusCode5Choice.mmProprietary, PaymentStatusCode6Choice.mmPending,
					PaymentStatusCode6Choice.mmFinal, PaymentStatusCode6Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionStatus";
			definition = "Specifies the state of a payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentInstructionStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getInstructionStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransactionReasonCode transactionRejectionReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmTransactionRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ReversalReason1Choice.mmCode, ReversalReason1Choice.mmProprietary, OriginalGroupInformation5.mmReversalReasonInformation, ReversalReason4Choice.mmCode, ReversalReason4Choice.mmProprietary,
					OriginalGroupInformation22.mmReversalReasonInformation, StatusReason1Choice.mmCode, StatusReason1Choice.mmProprietary, StatusReason3Choice.mmCode, StatusReason3Choice.mmProprietary, StatusReason5Choice.mmCode,
					StatusReason5Choice.mmProprietary, ReversalReason3Choice.mmCode, ReversalReason3Choice.mmProprietary, OriginalGroupInformation16.mmReversalReasonInformation, OriginalGroupInformation14.mmReversalReasonInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionRejectionReason";
			definition = "Specifies the reason to reject, return or reverse the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getTransactionRejectionReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentInvestigationCase relatedInvestigationCase;
	/**
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Specifies an investigation case in relation with the payment status.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmPaymentStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
		}
	};
	protected NotificationToReceiveStatusCode notificationStatus;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmNotificationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalNotification2.mmNotificationStatus, OriginalItemAndStatus2.mmItemStatus, OriginalNotification3.mmNotificationStatus, OriginalItemAndStatus3.mmItemStatus,
					OriginalNotification5.mmNotificationStatus, OriginalNotification7.mmNotificationStatus, OriginalItemAndStatus4.mmItemStatus, OriginalNotification9.mmNotificationStatus, OriginalItemAndStatus5.mmItemStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotificationStatus";
			definition = "Specifies the status of the payment in comparison with the notification to receive.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NotificationToReceiveStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getNotificationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransactionStatusCode transactionStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus1#mmItemStatus
	 * OriginalItemAndStatus1.mmItemStatus}</li>
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
	public static final MMBusinessAttribute mmTransactionStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalItemAndStatus1.mmItemStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Specifies the processing status of an investment fund transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getTransactionStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashPaymentStatusCode cashPaymentStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice#mmPendingAndFinalStatus
	 * PaymentStatusCodeSearchChoice.mmPendingAndFinalStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice#mmPendingAndFinalStatus
	 * PaymentStatusCodeSearch2Choice.mmPendingAndFinalStatus}</li>
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
	public static final MMBusinessAttribute mmCashPaymentStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentStatusCodeSearchChoice.mmPendingAndFinalStatus, PaymentStatusCodeSearch2Choice.mmPendingAndFinalStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashPaymentStatus";
			definition = "Specifies a generic status of a payment at a specified time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashPaymentStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getCashPaymentStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExternalStatusReason1Code unsuccessfulStatusReason;
	/**
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnsuccessfulStatusReason";
			definition = "Reason provided for the status of a transaction.The reason may be in coded or free text form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalStatusReason1Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getUnsuccessfulStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CancellationReasonCode cancellationReason;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction89#mmCancellationReasonInformation
	 * PaymentTransaction89.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction95#mmCancellationReasonInformation
	 * PaymentTransaction95.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason4#mmReason
	 * PaymentCancellationReason4.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader10#mmCancellationReasonInformation
	 * OriginalGroupHeader10.mmCancellationReasonInformation}</li>
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
	public static final MMBusinessAttribute mmCancellationReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CancellationReason1Choice.mmCode, CancellationReason1Choice.mmProprietary, CancellationReasonInformation1.mmCancellationReason, OriginalGroupInformation4.mmCancellationReasonInformation,
					PaymentTransactionInformation3.mmCancellationReasonInformation, CancellationReason2Choice.mmCode, CancellationReason2Choice.mmProprietary, CancellationReasonInformation3.mmReason,
					OriginalGroupInformation23.mmCancellationReasonInformation, PaymentTransactionInformation30.mmCancellationReasonInformation, CancellationReason14Choice.mmCode, CancellationReason14Choice.mmProprietary,
					PaymentCancellationReason2.mmReason, OriginalGroupHeader4.mmCancellationReasonInformation, PaymentTransaction37.mmCancellationReasonInformation, PaymentTransaction47.mmCancellationReasonInformation,
					PaymentTransactionInformation31.mmCancellationReasonInformation, PaymentTransaction38.mmCancellationReasonInformation, PaymentTransaction48.mmCancellationReasonInformation,
					DebitAuthorisationDetails.mmCancellationReason, DebitAuthorisationDetails2.mmCancellationReason, DebitAuthorisationDetails3.mmCancellationReason, DebitAuthorisation1.mmCancellationReason,
					PaymentTransaction58.mmCancellationReasonInformation, PaymentTransaction55.mmCancellationReasonInformation, PaymentTransaction61.mmCancellationReasonInformation, PaymentTransaction62.mmCancellationReasonInformation,
					PaymentCancellationReason3.mmReason, DebitAuthorisation2.mmCancellationReason, CancellationReason33Choice.mmCode, CancellationReason33Choice.mmProprietary, PaymentTransaction74.mmCancellationReasonInformation,
					OriginalGroupHeader6.mmCancellationReasonInformation, PaymentTransaction75.mmCancellationReasonInformation, PaymentTransaction89.mmCancellationReasonInformation, PaymentTransaction95.mmCancellationReasonInformation,
					PaymentCancellationReason4.mmReason, OriginalGroupHeader10.mmCancellationReasonInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Reason for the cancellation of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getCancellationReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MandateReasonCode mandateRejectionReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmMandateRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MandateReason1Choice.mmCode, MandateReason1Choice.mmProprietary, CancellationReasonInformation2.mmReason, PaymentCancellationReason1.mmReason, MandateSuspensionReason1Choice.mmCode,
					MandateSuspensionReason1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandateRejectionReason";
			definition = "Reason for requesting the cancellation or the amendment of a mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MandateReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getMandateRejectionReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PendingFailingSettlementCode pendingFailingSettlement;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice#mmPendingFailingSettlement
	 * PaymentStatusReasonCode7Choice.mmPendingFailingSettlement}</li>
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
	public static final MMBusinessAttribute mmPendingFailingSettlement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentStatusReasonCode3Choice.mmPendingFailingSettlement, PaymentStatusReasonCode4Choice.mmPendingFailingSettlement, PaymentStatusReasonCode5Choice.mmPendingFailingSettlement,
					PaymentStatusReasonCode6Choice.mmPendingFailingSettlement, PaymentStatusReasonCode7Choice.mmPendingFailingSettlement);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingFailingSettlement";
			definition = "Reason the transaction/instruction is pending due to failing settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingSettlementCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getPendingFailingSettlement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentStatus";
				definition = "Specifies the status of a payment at a specified time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmPaymentStatus, com.tools20022.repository.entity.PaymentInvestigationCase.mmPaymentStatus);
				derivationElement_lazy = () -> Arrays.asList(InstructionStatusSearch2.mmPaymentInstructionStatus, InstructionStatusSearch3.mmPaymentInstructionStatus, PaymentSearch4.mmStatus,
						PaymentStatusDetails1.mmPaymentInstructionStatus, PaymentStatus1.mmCode, ReturnReasonInformation10.mmReason, ReversalReasonInformation1.mmReversalReason, StatusReasonInformation1.mmStatusReason,
						StatusReasonInformation8.mmReason, StatusReasonInformation4.mmStatusReason, StatusReasonInformation6.mmStatusReason, StatusReasonInformation5.mmStatusReason, StatusReasonInformation7.mmStatusReason,
						ReversalReasonInformation4.mmReversalReason, ReversalReasonInformation5.mmReversalReason, AccountLinkStatus1.mmStatusReason, PaymentSearch5.mmStatus, PaymentStatus2.mmCode,
						CurrencyControlGroupStatus1.mmStatusReason, PaymentSearch6.mmStatus, PaymentStatus3.mmCode, PaymentSearch7.mmStatus, InstructionStatusSearch4.mmPaymentInstructionStatus);
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
						PendingStatusAndReason2.mmObject(), PaymentCancellationReason3.mmObject(), CancellationReason33Choice.mmObject(), MandateSuspensionReason1Choice.mmObject(), MandateSuspensionReason1.mmObject(),
						PaymentStatus3.mmObject(), InstructionStatusSearch4.mmObject(), PaymentCancellationReason4.mmObject(), StatusReasonInformation11.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentStatusCode getStatus() {
		return status;
	}

	public PaymentStatus setStatus(PaymentStatusCode status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<Payment> getPayment() {
		return payment == null ? Optional.empty() : Optional.of(payment);
	}

	public PaymentStatus setPayment(com.tools20022.repository.entity.Payment payment) {
		this.payment = payment;
		return this;
	}

	public TransferUnmatchedReasonCode getUnmatchedStatusReason() {
		return unmatchedStatusReason;
	}

	public PaymentStatus setUnmatchedStatusReason(TransferUnmatchedReasonCode unmatchedStatusReason) {
		this.unmatchedStatusReason = Objects.requireNonNull(unmatchedStatusReason);
		return this;
	}

	public SuspendedStatusReasonCode getSuspendedStatusReason() {
		return suspendedStatusReason;
	}

	public PaymentStatus setSuspendedStatusReason(SuspendedStatusReasonCode suspendedStatusReason) {
		this.suspendedStatusReason = Objects.requireNonNull(suspendedStatusReason);
		return this;
	}

	public PendingSettlementStatusReasonCode getPendingSettlement() {
		return pendingSettlement;
	}

	public PaymentStatus setPendingSettlement(PendingSettlementStatusReasonCode pendingSettlement) {
		this.pendingSettlement = Objects.requireNonNull(pendingSettlement);
		return this;
	}

	public PaymentInstructionStatusCode getInstructionStatus() {
		return instructionStatus;
	}

	public PaymentStatus setInstructionStatus(PaymentInstructionStatusCode instructionStatus) {
		this.instructionStatus = Objects.requireNonNull(instructionStatus);
		return this;
	}

	public TransactionReasonCode getTransactionRejectionReason() {
		return transactionRejectionReason;
	}

	public PaymentStatus setTransactionRejectionReason(TransactionReasonCode transactionRejectionReason) {
		this.transactionRejectionReason = Objects.requireNonNull(transactionRejectionReason);
		return this;
	}

	public Optional<PaymentInvestigationCase> getRelatedInvestigationCase() {
		return relatedInvestigationCase == null ? Optional.empty() : Optional.of(relatedInvestigationCase);
	}

	public PaymentStatus setRelatedInvestigationCase(com.tools20022.repository.entity.PaymentInvestigationCase relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
		return this;
	}

	public NotificationToReceiveStatusCode getNotificationStatus() {
		return notificationStatus;
	}

	public PaymentStatus setNotificationStatus(NotificationToReceiveStatusCode notificationStatus) {
		this.notificationStatus = Objects.requireNonNull(notificationStatus);
		return this;
	}

	public TransactionStatusCode getTransactionStatus() {
		return transactionStatus;
	}

	public PaymentStatus setTransactionStatus(TransactionStatusCode transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public CashPaymentStatusCode getCashPaymentStatus() {
		return cashPaymentStatus;
	}

	public PaymentStatus setCashPaymentStatus(CashPaymentStatusCode cashPaymentStatus) {
		this.cashPaymentStatus = Objects.requireNonNull(cashPaymentStatus);
		return this;
	}

	public ExternalStatusReason1Code getUnsuccessfulStatusReason() {
		return unsuccessfulStatusReason;
	}

	public PaymentStatus setUnsuccessfulStatusReason(ExternalStatusReason1Code unsuccessfulStatusReason) {
		this.unsuccessfulStatusReason = Objects.requireNonNull(unsuccessfulStatusReason);
		return this;
	}

	public CancellationReasonCode getCancellationReason() {
		return cancellationReason;
	}

	public PaymentStatus setCancellationReason(CancellationReasonCode cancellationReason) {
		this.cancellationReason = Objects.requireNonNull(cancellationReason);
		return this;
	}

	public MandateReasonCode getMandateRejectionReason() {
		return mandateRejectionReason;
	}

	public PaymentStatus setMandateRejectionReason(MandateReasonCode mandateRejectionReason) {
		this.mandateRejectionReason = Objects.requireNonNull(mandateRejectionReason);
		return this;
	}

	public PendingFailingSettlementCode getPendingFailingSettlement() {
		return pendingFailingSettlement;
	}

	public PaymentStatus setPendingFailingSettlement(PendingFailingSettlementCode pendingFailingSettlement) {
		this.pendingFailingSettlement = Objects.requireNonNull(pendingFailingSettlement);
		return this;
	}
}