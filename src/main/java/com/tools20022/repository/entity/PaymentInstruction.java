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
import com.tools20022.repository.choice.TransactionOrError1Choice;
import com.tools20022.repository.choice.TransactionOrError2Choice;
import com.tools20022.repository.codeset.InstructionCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instruction to pay an amount of money to an ultimate beneficiary, on behalf
 * of an originator. This instruction may have to be forwarded several times to
 * complete the settlement chain.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentInstruction" src="doc-files/PaymentInstruction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#ProcessingValidityTime
 * PaymentInstruction.ProcessingValidityTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#InstructionForNextAgent
 * PaymentInstruction.InstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#SettlementInstruction
 * PaymentInstruction.SettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#ClearingChargeAmount
 * PaymentInstruction.ClearingChargeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#StandingOrder
 * PaymentInstruction.StandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentInstruction#Previous
 * PaymentInstruction.Previous}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PaymentInstruction
 * DateTimePeriod.PaymentInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#Next
 * PaymentExecution.Next}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#RelatedPaymentInstruction
 * CashSettlement.RelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#PaymentInstructionTrigger
 * StandingOrder.PaymentInstructionTrigger}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice#ShortBusinessIdentification
 * PaymentIdentificationChoice.ShortBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice#LongBusinessIdentification
 * PaymentIdentificationChoice.LongBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice#LongBusinessIdentification
 * PaymentIdentification2Choice.LongBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice#ShortBusinessIdentification
 * PaymentIdentification2Choice.ShortBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification3Choice#LongBusinessIdentification
 * PaymentIdentification3Choice.LongBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification3Choice#ShortBusinessIdentification
 * PaymentIdentification3Choice.ShortBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice#LongBusinessIdentification
 * PaymentIdentification4Choice.LongBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice#ShortBusinessIdentification
 * PaymentIdentification4Choice.ShortBusinessIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch2#PaymentType
 * PaymentSearch2.PaymentType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch3#PaymentType
 * PaymentSearch3.PaymentType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch4#PaymentType
 * PaymentSearch4.PaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionModification1#InstructionReference
 * TransactionModification1.InstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionModification1#NewPaymentValueSet
 * TransactionModification1.NewPaymentValueSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionModification2#PaymentIdentification
 * TransactionModification2.PaymentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionModification2#NewPaymentValueSet
 * TransactionModification2.NewPaymentValueSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction3#Payment
 * Transaction3.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction4#Payment
 * Transaction4.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction5#Payment
 * Transaction5.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction24#Payment
 * Transaction24.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction1#OriginalGroupInformationAndCancellation
 * UnderlyingTransaction1.OriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction1#OriginalPaymentInformationAndCancellation
 * UnderlyingTransaction1.OriginalPaymentInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction6#OriginalGroupInformationAndCancellation
 * UnderlyingTransaction6.OriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction6#OriginalPaymentInformationAndCancellation
 * UnderlyingTransaction6.OriginalPaymentInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction7#OriginalGroupInformationAndCancellation
 * UnderlyingTransaction7.OriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction7#OriginalPaymentInformationAndCancellation
 * UnderlyingTransaction7.OriginalPaymentInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction2#OriginalGroupInformationAndCancellation
 * UnderlyingTransaction2.OriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction5#OriginalGroupInformationAndCancellation
 * UnderlyingTransaction5.OriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction8#OriginalGroupInformationAndCancellation
 * UnderlyingTransaction8.OriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance1#OriginalMessageInformation
 * MandateAcceptance1.OriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance2#OriginalMessageInformation
 * MandateAcceptance2.OriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance3#OriginalMessageInformation
 * MandateAcceptance3.OriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification4#OriginalNotificationReference
 * OriginalNotification4.OriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification3#OriginalNotificationReference
 * OriginalNotification3.OriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice#Initiation
 * UnderlyingTransaction1Choice.Initiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction3#OriginalGroupInformationAndStatus
 * UnderlyingTransaction3.OriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction3#OriginalPaymentInformationAndStatus
 * UnderlyingTransaction3.OriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice#Initiation
 * UnderlyingTransaction2Choice.Initiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction4#OriginalGroupInformationAndStatus
 * UnderlyingTransaction4.OriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction4#OriginalPaymentInformationAndStatus
 * UnderlyingTransaction4.OriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification6#OriginalNotificationReference
 * OriginalNotification6.OriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification5#OriginalNotificationReference
 * OriginalNotification5.OriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionModification3#PaymentIdentification
 * TransactionModification3.PaymentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionModification3#NewPaymentValueSet
 * TransactionModification3.NewPaymentValueSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5#PaymentType
 * PaymentSearch5.PaymentType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction33#Payment
 * Transaction33.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation8#OriginalPaymentInformation
 * RemittanceInformation8.OriginalPaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification7#OriginalNotificationReference
 * OriginalNotification7.OriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction10#OriginalGroupInformationAndCancellation
 * UnderlyingTransaction10.OriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction11#OriginalGroupInformationAndCancellation
 * UnderlyingTransaction11.OriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction11#OriginalPaymentInformationAndCancellation
 * UnderlyingTransaction11.OriginalPaymentInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance4#OriginalMessageInformation
 * MandateAcceptance4.OriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction9#OriginalGroupInformationAndStatus
 * UnderlyingTransaction9.OriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction9#OriginalPaymentInformationAndStatus
 * UnderlyingTransaction9.OriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification8#OriginalNotificationReference
 * OriginalNotification8.OriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification10#OriginalNotificationReference
 * OriginalNotification10.OriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction13#OriginalGroupInformationAndCancellation
 * UnderlyingTransaction13.OriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification9#OriginalNotificationReference
 * OriginalNotification9.OriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction12#OriginalGroupInformationAndCancellation
 * UnderlyingTransaction12.OriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction12#OriginalPaymentInformationAndCancellation
 * UnderlyingTransaction12.OriginalPaymentInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction14#OriginalGroupInformationAndStatus
 * UnderlyingTransaction14.OriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction14#OriginalPaymentInformationAndStatus
 * UnderlyingTransaction14.OriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation12#OriginalPaymentInformation
 * RemittanceInformation12.OriginalPaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#Initiation
 * UnderlyingTransaction3Choice.Initiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16#OriginalGroupInformationAndCancellation
 * UnderlyingTransaction16.OriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#OriginalPaymentInformation
 * RemittanceInformation13.OriginalPaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5#OriginalMessageInformation
 * MandateAcceptance5.OriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#OriginalGroupInformationAndStatus
 * UnderlyingTransaction17.OriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#OriginalPaymentInformationAndStatus
 * UnderlyingTransaction17.OriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction15#OriginalGroupInformationAndCancellation
 * UnderlyingTransaction15.OriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction15#OriginalPaymentInformationAndCancellation
 * UnderlyingTransaction15.OriginalPaymentInformationAndCancellation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PaymentExecution
 * PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstructionInformation
 * PaymentInstructionInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction3
 * PaymentInstruction3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details
 * PaymentInstructionReference1Details}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details
 * PaymentInstructionReference2Details}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3
 * PaymentInstructionReferenceDetails3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails2
 * PaymentInstructionReferenceDetails2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4
 * PaymentInstructionReferenceDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LongPaymentIdentification1
 * LongPaymentIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ShortPaymentIdentification1
 * ShortPaymentIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch2 PaymentSearch2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch4 PaymentSearch4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails2
 * PaymentDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails4
 * PaymentDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionModification1
 * TransactionModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction2
 * PaymentInstruction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionModification2
 * TransactionModification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommonDetails2
 * PaymentCommonDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails5
 * PaymentDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommonDetails3
 * PaymentCommonDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails6
 * PaymentDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommonDetails4
 * PaymentCommonDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails7
 * PaymentDetails7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommon1 PaymentCommon1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction1
 * PaymentInstruction1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionOrError1Choice
 * TransactionOrError1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
 * PaymentInstructionInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3
 * PaymentInstructionInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction6
 * PaymentInstruction6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction9
 * PaymentInstruction9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2
 * PaymentInstructionInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4
 * PaymentInstructionInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction7
 * PaymentInstruction7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction10
 * PaymentInstruction10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction1
 * UnderlyingTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction6
 * UnderlyingTransaction6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction7
 * UnderlyingTransaction7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionForNextAgent1
 * InstructionForNextAgent1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction2
 * UnderlyingTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction5
 * UnderlyingTransaction5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction8
 * UnderlyingTransaction8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalMessageInformation1
 * OriginalMessageInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction5
 * PaymentInstruction5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction8
 * PaymentInstruction8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction11
 * PaymentInstruction11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstructionExtract
 * PaymentInstructionExtract}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestedModification
 * RequestedModification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2
 * PaymentInstructionExtract2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
 * PaymentComplementaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract
 * CorrectivePaymentInstructionExtract}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotification1
 * OriginalNotification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotificationReference1
 * OriginalNotificationReference1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotification4
 * OriginalNotification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotification2
 * OriginalNotification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotificationReference2
 * OriginalNotificationReference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotification3
 * OriginalNotification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1
 * UnderlyingPaymentInstruction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1
 * UnderlyingPaymentTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestedModification2
 * RequestedModification2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2
 * PaymentComplementaryInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction3
 * UnderlyingTransaction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInformation15
 * PaymentInformation15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2
 * UnderlyingPaymentInstruction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2
 * UnderlyingPaymentTransaction2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3
 * PaymentComplementaryInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction4
 * UnderlyingTransaction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestedModification3
 * RequestedModification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotificationReference4
 * OriginalNotificationReference4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotification6
 * OriginalNotification6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotificationReference3
 * OriginalNotificationReference3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotification5
 * OriginalNotification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction13
 * PaymentInstruction13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionModification3
 * TransactionModification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction12
 * PaymentInstruction12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommon2 PaymentCommon2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction14
 * PaymentInstruction14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionOrError2Choice
 * TransactionOrError2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotification7
 * OriginalNotification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction16
 * PaymentInstruction16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4
 * PaymentComplementaryInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction10
 * UnderlyingTransaction10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction11
 * UnderlyingTransaction11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction9
 * UnderlyingTransaction9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotification8
 * OriginalNotification8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction15
 * PaymentInstruction15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotificationReference6
 * OriginalNotificationReference6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestedModification4
 * RequestedModification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotificationReference5
 * OriginalNotificationReference5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction17
 * PaymentInstruction17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction18
 * PaymentInstruction18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestedModification5
 * RequestedModification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotification10
 * OriginalNotification10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction13
 * UnderlyingTransaction13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotification9
 * OriginalNotification9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction19
 * PaymentInstruction19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction12
 * UnderlyingTransaction12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5
 * PaymentComplementaryInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction20
 * PaymentInstruction20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction14
 * UnderlyingTransaction14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotificationReference8
 * OriginalNotificationReference8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotificationReference7
 * OriginalNotificationReference7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction21
 * PaymentInstruction21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction16
 * UnderlyingTransaction16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestedModification6
 * RequestedModification6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction23
 * PaymentInstruction23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction17
 * UnderlyingTransaction17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction22
 * PaymentInstruction22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction15
 * UnderlyingTransaction15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3
 * UnderlyingPaymentInstruction3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6
 * PaymentComplementaryInformation6}</li>
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
 * "PaymentInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain."
 * </li>
 * </ul>
 */
public class PaymentInstruction extends PaymentExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time range within which the payment instruction must be
	 * processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PaymentInstruction
	 * DateTimePeriod.PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#ProcessingValidityTime
	 * PaymentSearch2.ProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#ProcessingValidityTime
	 * PaymentSearch3.ProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#ProcessingValidityTime
	 * PaymentSearch4.ProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails2#ProcessingValidityTime
	 * PaymentDetails2.ProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails4#ProcessingValidityTime
	 * PaymentDetails4.ProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction2#ProcessingValidityTime
	 * PaymentInstruction2.ProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#ProcessingValidityTime
	 * PaymentDetails5.ProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#ProcessingValidityTime
	 * PaymentDetails6.ProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#ProcessingValidityTime
	 * PaymentDetails7.ProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#ProcessingValidityTime
	 * PaymentInstruction1.ProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction12#ProcessingValidityTime
	 * PaymentInstruction12.ProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#ProcessingValidityTime
	 * PaymentSearch5.ProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#ProcessingValidityTime
	 * PaymentInstruction14.ProcessingValidityTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingValidityTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time range within which the payment instruction must be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProcessingValidityTime = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentSearch2.ProcessingValidityTime, com.tools20022.repository.msg.PaymentSearch3.ProcessingValidityTime,
					com.tools20022.repository.msg.PaymentSearch4.ProcessingValidityTime, com.tools20022.repository.msg.PaymentDetails2.ProcessingValidityTime, com.tools20022.repository.msg.PaymentDetails4.ProcessingValidityTime,
					com.tools20022.repository.msg.PaymentInstruction2.ProcessingValidityTime, com.tools20022.repository.msg.PaymentDetails5.ProcessingValidityTime, com.tools20022.repository.msg.PaymentDetails6.ProcessingValidityTime,
					com.tools20022.repository.msg.PaymentDetails7.ProcessingValidityTime, com.tools20022.repository.msg.PaymentInstruction1.ProcessingValidityTime, com.tools20022.repository.msg.PaymentInstruction12.ProcessingValidityTime,
					com.tools20022.repository.msg.PaymentSearch5.ProcessingValidityTime, com.tools20022.repository.msg.PaymentInstruction14.ProcessingValidityTime);
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingValidityTime";
			definition = "Date and time range within which the payment instruction must be processed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PaymentInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Further information related to the processing of the payment instruction
	 * that may need to be acted upon by the next agent. <br>
	 * Usage: The next agent may not be the creditor agent.<br>
	 * The instruction can relate to a level of service, can be an instruction
	 * that has to be executed by the agent, or can be information required by
	 * the next agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch4#Instruction
	 * PaymentSearch4.Instruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails2#Instruction
	 * PaymentDetails2.Instruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails4#Instruction
	 * PaymentDetails4.Instruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction2#Instruction
	 * PaymentInstruction2.Instruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionForNextAgent1#Code
	 * InstructionForNextAgent1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#InstructionForNextAgent
	 * CreditTransferTransactionInformation2.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#InstructionForNextAgent
	 * CreditTransferTransactionInformation11.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#InstructionForNextAgent
	 * CreditTransferTransaction2.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#InstructionForNextAgent
	 * CreditTransferTransaction7.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#InstructionForNextAgent
	 * CreditTransferTransactionInformation3.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#InstructionForNextAgent
	 * CreditTransferTransactionInformation13.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#InstructionForNextAgent
	 * CreditTransferTransaction4.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#InstructionForNextAgent
	 * CreditTransferTransaction8.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#InstructionCode
	 * RequestedModification.InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#InstructionForNextAgent
	 * RequestedModification2.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#InstructionForNextAgent
	 * PaymentComplementaryInformation2.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#InstructionForNextAgent
	 * PaymentComplementaryInformation3.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#InstructionForNextAgent
	 * RequestedModification3.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#InstructionForNextAgent
	 * CreditTransferTransactionInformation7.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#InstructionForNextAgent
	 * CreditTransferTransactionInformation9.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction12#Instruction
	 * PaymentInstruction12.Instruction}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5#Instruction
	 * PaymentSearch5.Instruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#InstructionForNextAgent
	 * PaymentComplementaryInformation4.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#InstructionForNextAgent
	 * CreditTransferTransaction17.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#InstructionForNextAgent
	 * CreditTransferTransaction19.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#InstructionForNextAgent
	 * RequestedModification4.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction18#InstructionForNextAgent
	 * CreditTransferTransaction18.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#InstructionForNextAgent
	 * CreditTransferTransaction23.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#InstructionForNextAgent
	 * RequestedModification5.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#InstructionForNextAgent
	 * CreditTransferTransaction25.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#InstructionForNextAgent
	 * PaymentComplementaryInformation5.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#InstructionForNextAgent
	 * CreditTransferTransaction24.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#InstructionForNextAgent
	 * RequestedModification6.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#InstructionForNextAgent
	 * PaymentComplementaryInformation6.InstructionForNextAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction that may need to be acted upon by the next agent. \r\nUsage: The next agent may not be the creditor agent.\r\nThe instruction can relate to a level of service, can be an instruction that has to be executed by the agent, or can be information required by the next agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionForNextAgent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentSearch4.Instruction, com.tools20022.repository.msg.PaymentDetails2.Instruction, com.tools20022.repository.msg.PaymentDetails4.Instruction,
					com.tools20022.repository.msg.PaymentInstruction2.Instruction, com.tools20022.repository.msg.InstructionForNextAgent1.Code, com.tools20022.repository.msg.CreditTransferTransactionInformation2.InstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransactionInformation11.InstructionForNextAgent, com.tools20022.repository.msg.CreditTransferTransaction2.InstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransaction7.InstructionForNextAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation3.InstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransactionInformation13.InstructionForNextAgent, com.tools20022.repository.msg.CreditTransferTransaction4.InstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransaction8.InstructionForNextAgent, com.tools20022.repository.msg.RequestedModification.InstructionCode,
					com.tools20022.repository.msg.RequestedModification2.InstructionForNextAgent, com.tools20022.repository.msg.PaymentComplementaryInformation2.InstructionForNextAgent,
					com.tools20022.repository.msg.PaymentComplementaryInformation3.InstructionForNextAgent, com.tools20022.repository.msg.RequestedModification3.InstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransactionInformation7.InstructionForNextAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation9.InstructionForNextAgent,
					com.tools20022.repository.msg.PaymentInstruction12.Instruction, com.tools20022.repository.msg.PaymentSearch5.Instruction, com.tools20022.repository.msg.PaymentComplementaryInformation4.InstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransaction17.InstructionForNextAgent, com.tools20022.repository.msg.CreditTransferTransaction19.InstructionForNextAgent,
					com.tools20022.repository.msg.RequestedModification4.InstructionForNextAgent, com.tools20022.repository.msg.CreditTransferTransaction18.InstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransaction23.InstructionForNextAgent, com.tools20022.repository.msg.RequestedModification5.InstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransaction25.InstructionForNextAgent, com.tools20022.repository.msg.PaymentComplementaryInformation5.InstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransaction24.InstructionForNextAgent, com.tools20022.repository.msg.RequestedModification6.InstructionForNextAgent,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.InstructionForNextAgent);
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionForNextAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the next agent. \r\nUsage: The next agent may not be the creditor agent.\r\nThe instruction can relate to a level of service, can be an instruction that has to be executed by the agent, or can be information required by the next agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}
	};
	/**
	 * Instruction for the cash settlement between two clearing agents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#RelatedPaymentInstruction
	 * CashSettlement.RelatedPaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#Settlement
	 * PaymentStatusCode5Choice.Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#SettlementInformation
	 * OriginalTransactionReference1.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#SettlementInformation
	 * OriginalTransactionReference13.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#SettlementInformation
	 * OriginalTransactionReference16.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#SettlementInformation
	 * GroupHeader2.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#SettlementTimeIndication
	 * CreditTransferTransactionInformation2.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#SettlementInformation
	 * GroupHeader33.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#SettlementTimeIndication
	 * CreditTransferTransactionInformation11.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#SettlementInformation
	 * GroupHeader49.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#SettlementTimeIndication
	 * CreditTransferTransaction2.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#SettlementTimeIndication
	 * CreditTransferTransaction7.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#SettlementInformation
	 * GroupHeader3.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#SettlementInformation
	 * GroupHeader34.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#SettlementInformation
	 * GroupHeader50.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9#SettlementInformation
	 * GroupHeader9.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader41#SettlementInformation
	 * GroupHeader41.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader57#SettlementInformation
	 * GroupHeader57.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#SettlementInformation
	 * GroupHeader4.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#SettlementTimeIndication
	 * CreditTransferTransactionInformation3.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#SettlementInformation
	 * GroupHeader35.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#SettlementTimeIndication
	 * CreditTransferTransactionInformation13.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#SettlementInformation
	 * GroupHeader51.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#SettlementTimeIndication
	 * CreditTransferTransaction4.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#SettlementTimeIndication
	 * CreditTransferTransaction8.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6#SettlementInformation
	 * GroupHeader6.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader38#SettlementInformation
	 * GroupHeader38.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader54#SettlementInformation
	 * GroupHeader54.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#SettlementInformation
	 * OriginalTransactionReference15.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#SettlementInformation
	 * OriginalTransactionReference17.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#SettlementInformation
	 * RequestedModification2.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#SettlementInformation
	 * PaymentComplementaryInformation2.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#ResolutionRelatedInformation
	 * PaymentTransactionInformation33.ResolutionRelatedInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#SettlementTerms
	 * Baseline2.SettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#SettlementTerms
	 * PaymentObligation1.SettlementTerms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#SettlementTerms
	 * Baseline3.SettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet2#SettlementTerms
	 * CommercialDataSet2.SettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet3#SettlementTerms
	 * CommercialDataSet3.SettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntentToPay1#SettlementTerms
	 * IntentToPay1.SettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#SettlementInformation
	 * PaymentComplementaryInformation3.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#ResolutionRelatedInformation
	 * PaymentTransaction40.ResolutionRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference7#SettlementInformation
	 * OriginalTransactionReference7.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference10#SettlementInformation
	 * OriginalTransactionReference10.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#SettlementInformation
	 * OriginalTransactionReference9.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#SettlementInformation
	 * OriginalTransactionReference12.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#SettlementInformation
	 * OriginalTransactionReference8.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#SettlementInformation
	 * OriginalTransactionReference11.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#SettlementTimeIndication
	 * CreditTransferTransactionInformation7.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#SettlementTimeIndication
	 * CreditTransferTransactionInformation9.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#SettlementInformation
	 * GroupHeader19.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#SettlementInformation
	 * GroupHeader24.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#SettlementInformation
	 * GroupHeader20.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#SettlementInformation
	 * GroupHeader25.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#SettlementInformation
	 * GroupHeader15.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#SettlementInformation
	 * GroupHeader26.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17#SettlementInformation
	 * GroupHeader17.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27#SettlementInformation
	 * GroupHeader27.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader22#SettlementInformation
	 * GroupHeader22.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28#SettlementInformation
	 * GroupHeader28.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#SettlementInformation
	 * GroupHeader16.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#SettlementInformation
	 * GroupHeader29.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18#SettlementInformation
	 * GroupHeader18.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30#SettlementInformation
	 * GroupHeader30.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader21#SettlementInformation
	 * GroupHeader21.SettlementInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#SettlementTerms
	 * Baseline4.SettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet4#SettlementTerms
	 * CommercialDataSet4.SettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#SettlementTerms
	 * PaymentObligation2.SettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#Settlement
	 * PaymentStatusCode6Choice.Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntentToPay2#SettlementTerms
	 * IntentToPay2.SettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#SettlementInformation
	 * PaymentComplementaryInformation4.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#SettlementTimeIndication
	 * CreditTransferTransaction17.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#SettlementTimeIndication
	 * CreditTransferTransaction19.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#ResolutionRelatedInformation
	 * PaymentTransaction53.ResolutionRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#SettlementInformation
	 * OriginalTransactionReference20.SettlementInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#SettlementTerms
	 * Baseline5.SettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5#SettlementTerms
	 * CommercialDataSet5.SettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#SettlementTimeIndication
	 * CreditTransferTransaction23.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#SettlementInformation
	 * GroupHeader70.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#SettlementTimeIndication
	 * CreditTransferTransaction25.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#SettlementInformation
	 * GroupHeader72.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#SettlementInformation
	 * PaymentComplementaryInformation5.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#SettlementInformation
	 * GroupHeader71.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#SettlementInformation
	 * OriginalTransactionReference22.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#ResolutionRelatedInformation
	 * PaymentTransaction67.ResolutionRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#SettlementInformation
	 * OriginalTransactionReference24.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#ResolutionRelatedInformation
	 * PaymentTransaction79.ResolutionRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#SettlementInformation
	 * PaymentComplementaryInformation6.SettlementInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction for the cash settlement between two clearing agents."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementInstruction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusCode5Choice.Settlement, com.tools20022.repository.msg.OriginalTransactionReference1.SettlementInformation,
					com.tools20022.repository.msg.OriginalTransactionReference13.SettlementInformation, com.tools20022.repository.msg.OriginalTransactionReference16.SettlementInformation,
					com.tools20022.repository.msg.GroupHeader2.SettlementInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation2.SettlementTimeIndication,
					com.tools20022.repository.msg.GroupHeader33.SettlementInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation11.SettlementTimeIndication,
					com.tools20022.repository.msg.GroupHeader49.SettlementInformation, com.tools20022.repository.msg.CreditTransferTransaction2.SettlementTimeIndication,
					com.tools20022.repository.msg.CreditTransferTransaction7.SettlementTimeIndication, com.tools20022.repository.msg.GroupHeader3.SettlementInformation, com.tools20022.repository.msg.GroupHeader34.SettlementInformation,
					com.tools20022.repository.msg.GroupHeader50.SettlementInformation, com.tools20022.repository.msg.GroupHeader9.SettlementInformation, com.tools20022.repository.msg.GroupHeader41.SettlementInformation,
					com.tools20022.repository.msg.GroupHeader57.SettlementInformation, com.tools20022.repository.msg.GroupHeader4.SettlementInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation3.SettlementTimeIndication, com.tools20022.repository.msg.GroupHeader35.SettlementInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation13.SettlementTimeIndication, com.tools20022.repository.msg.GroupHeader51.SettlementInformation,
					com.tools20022.repository.msg.CreditTransferTransaction4.SettlementTimeIndication, com.tools20022.repository.msg.CreditTransferTransaction8.SettlementTimeIndication,
					com.tools20022.repository.msg.GroupHeader6.SettlementInformation, com.tools20022.repository.msg.GroupHeader38.SettlementInformation, com.tools20022.repository.msg.GroupHeader54.SettlementInformation,
					com.tools20022.repository.msg.OriginalTransactionReference15.SettlementInformation, com.tools20022.repository.msg.OriginalTransactionReference17.SettlementInformation,
					com.tools20022.repository.msg.RequestedModification2.SettlementInformation, com.tools20022.repository.msg.PaymentComplementaryInformation2.SettlementInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation33.ResolutionRelatedInformation, com.tools20022.repository.msg.Baseline2.SettlementTerms, com.tools20022.repository.msg.PaymentObligation1.SettlementTerms,
					com.tools20022.repository.msg.Baseline3.SettlementTerms, com.tools20022.repository.msg.CommercialDataSet2.SettlementTerms, com.tools20022.repository.msg.CommercialDataSet3.SettlementTerms,
					com.tools20022.repository.msg.IntentToPay1.SettlementTerms, com.tools20022.repository.msg.PaymentComplementaryInformation3.SettlementInformation,
					com.tools20022.repository.msg.PaymentTransaction40.ResolutionRelatedInformation, com.tools20022.repository.msg.OriginalTransactionReference7.SettlementInformation,
					com.tools20022.repository.msg.OriginalTransactionReference10.SettlementInformation, com.tools20022.repository.msg.OriginalTransactionReference9.SettlementInformation,
					com.tools20022.repository.msg.OriginalTransactionReference12.SettlementInformation, com.tools20022.repository.msg.OriginalTransactionReference8.SettlementInformation,
					com.tools20022.repository.msg.OriginalTransactionReference11.SettlementInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation7.SettlementTimeIndication,
					com.tools20022.repository.msg.CreditTransferTransactionInformation9.SettlementTimeIndication, com.tools20022.repository.msg.GroupHeader19.SettlementInformation,
					com.tools20022.repository.msg.GroupHeader24.SettlementInformation, com.tools20022.repository.msg.GroupHeader20.SettlementInformation, com.tools20022.repository.msg.GroupHeader25.SettlementInformation,
					com.tools20022.repository.msg.GroupHeader15.SettlementInformation, com.tools20022.repository.msg.GroupHeader26.SettlementInformation, com.tools20022.repository.msg.GroupHeader17.SettlementInformation,
					com.tools20022.repository.msg.GroupHeader27.SettlementInformation, com.tools20022.repository.msg.GroupHeader22.SettlementInformation, com.tools20022.repository.msg.GroupHeader28.SettlementInformation,
					com.tools20022.repository.msg.GroupHeader16.SettlementInformation, com.tools20022.repository.msg.GroupHeader29.SettlementInformation, com.tools20022.repository.msg.GroupHeader18.SettlementInformation,
					com.tools20022.repository.msg.GroupHeader30.SettlementInformation, com.tools20022.repository.msg.GroupHeader21.SettlementInformation, com.tools20022.repository.msg.Baseline4.SettlementTerms,
					com.tools20022.repository.msg.CommercialDataSet4.SettlementTerms, com.tools20022.repository.msg.PaymentObligation2.SettlementTerms, com.tools20022.repository.choice.PaymentStatusCode6Choice.Settlement,
					com.tools20022.repository.msg.IntentToPay2.SettlementTerms, com.tools20022.repository.msg.PaymentComplementaryInformation4.SettlementInformation,
					com.tools20022.repository.msg.CreditTransferTransaction17.SettlementTimeIndication, com.tools20022.repository.msg.CreditTransferTransaction19.SettlementTimeIndication,
					com.tools20022.repository.msg.PaymentTransaction53.ResolutionRelatedInformation, com.tools20022.repository.msg.OriginalTransactionReference20.SettlementInformation,
					com.tools20022.repository.msg.Baseline5.SettlementTerms, com.tools20022.repository.msg.CommercialDataSet5.SettlementTerms, com.tools20022.repository.msg.CreditTransferTransaction23.SettlementTimeIndication,
					com.tools20022.repository.msg.GroupHeader70.SettlementInformation, com.tools20022.repository.msg.CreditTransferTransaction25.SettlementTimeIndication, com.tools20022.repository.msg.GroupHeader72.SettlementInformation,
					com.tools20022.repository.msg.PaymentComplementaryInformation5.SettlementInformation, com.tools20022.repository.msg.GroupHeader71.SettlementInformation,
					com.tools20022.repository.msg.OriginalTransactionReference22.SettlementInformation, com.tools20022.repository.msg.PaymentTransaction67.ResolutionRelatedInformation,
					com.tools20022.repository.msg.OriginalTransactionReference24.SettlementInformation, com.tools20022.repository.msg.PaymentTransaction79.ResolutionRelatedInformation,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.SettlementInformation);
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Instruction for the cash settlement between two clearing agents.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.RelatedPaymentInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money taken by a clearing agent as compensation for the
	 * processing of the payment instruction. This charge is paid either by the
	 * debtor or by the creditor or shared between them.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#CompensationAmount
	 * PaymentTransactionInformation5.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#CompensationAmount
	 * PaymentTransactionInformation29.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#CompensationAmount
	 * PaymentTransactionInformation2.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#CompensationAmount
	 * PaymentTransactionInformation27.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#CompensationAmount
	 * PaymentTransactionInformation13.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#CompensationAmount
	 * PaymentTransactionInformation18.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#CompensationAmount
	 * PaymentTransactionInformation16.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#CompensationAmount
	 * PaymentTransactionInformation23.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#CompensationAmount
	 * PaymentTransactionInformation17.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#CompensationAmount
	 * PaymentTransactionInformation24.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#CompensationAmount
	 * PaymentTransactionInformation21.CompensationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingChargeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money taken by a clearing agent as compensation for the processing of the payment instruction. This charge is paid either by the debtor or by the creditor or shared between them."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClearingChargeAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransactionInformation5.CompensationAmount, com.tools20022.repository.msg.PaymentTransactionInformation29.CompensationAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation2.CompensationAmount, com.tools20022.repository.msg.PaymentTransactionInformation27.CompensationAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation13.CompensationAmount, com.tools20022.repository.msg.PaymentTransactionInformation18.CompensationAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation16.CompensationAmount, com.tools20022.repository.msg.PaymentTransactionInformation23.CompensationAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation17.CompensationAmount, com.tools20022.repository.msg.PaymentTransactionInformation24.CompensationAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation21.CompensationAmount);
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingChargeAmount";
			definition = "Amount of money taken by a clearing agent as compensation for the processing of the payment instruction. This charge is paid either by the debtor or by the creditor or shared between them.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Instruction given by an account holder to an account servicer to make
	 * regular transfers on given dates to the same beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#PaymentInstructionTrigger
	 * StandingOrder.PaymentInstructionTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StandingOrder
	 * StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrder";
			definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.PaymentInstructionTrigger;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies that a payment instruction may be preceeded by another payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#Next
	 * PaymentExecution.Next}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Previous"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a payment instruction may be preceeded by another payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Previous = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Previous";
			definition = "Specifies that a payment instruction may be preceeded by another payment instruction.";
			minOccurs = 0;
			type_lazy = () -> PaymentExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.Next;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentInstruction";
				definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.PaymentInstruction, com.tools20022.repository.entity.PaymentExecution.Next,
						com.tools20022.repository.entity.CashSettlement.RelatedPaymentInstruction, com.tools20022.repository.entity.StandingOrder.PaymentInstructionTrigger);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentIdentificationChoice.ShortBusinessIdentification, com.tools20022.repository.choice.PaymentIdentificationChoice.LongBusinessIdentification,
						com.tools20022.repository.choice.PaymentIdentification2Choice.LongBusinessIdentification, com.tools20022.repository.choice.PaymentIdentification2Choice.ShortBusinessIdentification,
						com.tools20022.repository.choice.PaymentIdentification3Choice.LongBusinessIdentification, com.tools20022.repository.choice.PaymentIdentification3Choice.ShortBusinessIdentification,
						com.tools20022.repository.choice.PaymentIdentification4Choice.LongBusinessIdentification, com.tools20022.repository.choice.PaymentIdentification4Choice.ShortBusinessIdentification,
						com.tools20022.repository.msg.PaymentSearch2.PaymentType, com.tools20022.repository.msg.PaymentSearch3.PaymentType, com.tools20022.repository.msg.PaymentSearch4.PaymentType,
						com.tools20022.repository.msg.TransactionModification1.InstructionReference, com.tools20022.repository.msg.TransactionModification1.NewPaymentValueSet,
						com.tools20022.repository.msg.TransactionModification2.PaymentIdentification, com.tools20022.repository.msg.TransactionModification2.NewPaymentValueSet, com.tools20022.repository.msg.Transaction3.Payment,
						com.tools20022.repository.msg.Transaction4.Payment, com.tools20022.repository.msg.Transaction5.Payment, com.tools20022.repository.msg.Transaction24.Payment,
						com.tools20022.repository.msg.UnderlyingTransaction1.OriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction1.OriginalPaymentInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction6.OriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction6.OriginalPaymentInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction7.OriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction7.OriginalPaymentInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction2.OriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction5.OriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction8.OriginalGroupInformationAndCancellation, com.tools20022.repository.msg.MandateAcceptance1.OriginalMessageInformation,
						com.tools20022.repository.msg.MandateAcceptance2.OriginalMessageInformation, com.tools20022.repository.msg.MandateAcceptance3.OriginalMessageInformation,
						com.tools20022.repository.msg.OriginalNotification4.OriginalNotificationReference, com.tools20022.repository.msg.OriginalNotification3.OriginalNotificationReference,
						com.tools20022.repository.choice.UnderlyingTransaction1Choice.Initiation, com.tools20022.repository.msg.UnderlyingTransaction3.OriginalGroupInformationAndStatus,
						com.tools20022.repository.msg.UnderlyingTransaction3.OriginalPaymentInformationAndStatus, com.tools20022.repository.choice.UnderlyingTransaction2Choice.Initiation,
						com.tools20022.repository.msg.UnderlyingTransaction4.OriginalGroupInformationAndStatus, com.tools20022.repository.msg.UnderlyingTransaction4.OriginalPaymentInformationAndStatus,
						com.tools20022.repository.msg.OriginalNotification6.OriginalNotificationReference, com.tools20022.repository.msg.OriginalNotification5.OriginalNotificationReference,
						com.tools20022.repository.msg.TransactionModification3.PaymentIdentification, com.tools20022.repository.msg.TransactionModification3.NewPaymentValueSet, com.tools20022.repository.msg.PaymentSearch5.PaymentType,
						com.tools20022.repository.msg.Transaction33.Payment, com.tools20022.repository.msg.RemittanceInformation8.OriginalPaymentInformation,
						com.tools20022.repository.msg.OriginalNotification7.OriginalNotificationReference, com.tools20022.repository.msg.UnderlyingTransaction10.OriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction11.OriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction11.OriginalPaymentInformationAndCancellation,
						com.tools20022.repository.msg.MandateAcceptance4.OriginalMessageInformation, com.tools20022.repository.msg.UnderlyingTransaction9.OriginalGroupInformationAndStatus,
						com.tools20022.repository.msg.UnderlyingTransaction9.OriginalPaymentInformationAndStatus, com.tools20022.repository.msg.OriginalNotification8.OriginalNotificationReference,
						com.tools20022.repository.msg.OriginalNotification10.OriginalNotificationReference, com.tools20022.repository.msg.UnderlyingTransaction13.OriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.OriginalNotification9.OriginalNotificationReference, com.tools20022.repository.msg.UnderlyingTransaction12.OriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction12.OriginalPaymentInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction14.OriginalGroupInformationAndStatus,
						com.tools20022.repository.msg.UnderlyingTransaction14.OriginalPaymentInformationAndStatus, com.tools20022.repository.msg.RemittanceInformation12.OriginalPaymentInformation,
						com.tools20022.repository.choice.UnderlyingTransaction3Choice.Initiation, com.tools20022.repository.msg.UnderlyingTransaction16.OriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.RemittanceInformation13.OriginalPaymentInformation, com.tools20022.repository.msg.MandateAcceptance5.OriginalMessageInformation,
						com.tools20022.repository.msg.UnderlyingTransaction17.OriginalGroupInformationAndStatus, com.tools20022.repository.msg.UnderlyingTransaction17.OriginalPaymentInformationAndStatus,
						com.tools20022.repository.msg.UnderlyingTransaction15.OriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction15.OriginalPaymentInformationAndCancellation);
				superType_lazy = () -> PaymentExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInstruction.ProcessingValidityTime, com.tools20022.repository.entity.PaymentInstruction.InstructionForNextAgent,
						com.tools20022.repository.entity.PaymentInstruction.SettlementInstruction, com.tools20022.repository.entity.PaymentInstruction.ClearingChargeAmount, com.tools20022.repository.entity.PaymentInstruction.StandingOrder,
						com.tools20022.repository.entity.PaymentInstruction.Previous);
				derivationComponent_lazy = () -> Arrays.asList(PaymentInstructionInformation.mmObject(), PaymentInstruction3.mmObject(), PaymentInstructionReference1Details.mmObject(), PaymentInstructionReference2Details.mmObject(),
						PaymentInstructionReferenceDetails3.mmObject(), PaymentInstructionReferenceDetails2.mmObject(), PaymentInstructionReferenceDetails4.mmObject(), LongPaymentIdentification1.mmObject(),
						ShortPaymentIdentification1.mmObject(), PaymentSearch2.mmObject(), PaymentSearch3.mmObject(), PaymentSearch4.mmObject(), PaymentDetails2.mmObject(), PaymentDetails4.mmObject(), TransactionModification1.mmObject(),
						PaymentInstruction2.mmObject(), TransactionModification2.mmObject(), PaymentCommonDetails2.mmObject(), PaymentDetails5.mmObject(), PaymentCommonDetails3.mmObject(), PaymentDetails6.mmObject(),
						PaymentCommonDetails4.mmObject(), PaymentDetails7.mmObject(), PaymentCommon1.mmObject(), PaymentInstruction1.mmObject(), TransactionOrError1Choice.mmObject(), PaymentInstructionInformation1.mmObject(),
						PaymentInstructionInformation3.mmObject(), PaymentInstruction6.mmObject(), PaymentInstruction9.mmObject(), PaymentInstructionInformation2.mmObject(), PaymentInstructionInformation4.mmObject(),
						PaymentInstruction7.mmObject(), PaymentInstruction10.mmObject(), UnderlyingTransaction1.mmObject(), UnderlyingTransaction6.mmObject(), UnderlyingTransaction7.mmObject(), InstructionForNextAgent1.mmObject(),
						UnderlyingTransaction2.mmObject(), UnderlyingTransaction5.mmObject(), UnderlyingTransaction8.mmObject(), OriginalMessageInformation1.mmObject(), PaymentInstruction5.mmObject(), PaymentInstruction8.mmObject(),
						PaymentInstruction11.mmObject(), PaymentInstructionExtract.mmObject(), RequestedModification.mmObject(), PaymentInstructionExtract2.mmObject(), PaymentComplementaryInformation.mmObject(),
						CorrectivePaymentInstructionExtract.mmObject(), OriginalNotification1.mmObject(), OriginalNotificationReference1.mmObject(), OriginalNotification4.mmObject(), OriginalNotification2.mmObject(),
						OriginalNotificationReference2.mmObject(), OriginalNotification3.mmObject(), UnderlyingPaymentInstruction1.mmObject(), UnderlyingPaymentTransaction1.mmObject(), RequestedModification2.mmObject(),
						PaymentComplementaryInformation2.mmObject(), UnderlyingTransaction3.mmObject(), PaymentInformation15.mmObject(), UnderlyingPaymentInstruction2.mmObject(), UnderlyingPaymentTransaction2.mmObject(),
						PaymentComplementaryInformation3.mmObject(), UnderlyingTransaction4.mmObject(), RequestedModification3.mmObject(), OriginalNotificationReference4.mmObject(), OriginalNotification6.mmObject(),
						OriginalNotificationReference3.mmObject(), OriginalNotification5.mmObject(), PaymentInstruction13.mmObject(), TransactionModification3.mmObject(), PaymentInstruction12.mmObject(), PaymentSearch5.mmObject(),
						PaymentCommon2.mmObject(), PaymentInstruction14.mmObject(), TransactionOrError2Choice.mmObject(), OriginalNotification7.mmObject(), PaymentInstruction16.mmObject(), PaymentComplementaryInformation4.mmObject(),
						UnderlyingTransaction10.mmObject(), UnderlyingTransaction11.mmObject(), UnderlyingTransaction9.mmObject(), OriginalNotification8.mmObject(), PaymentInstruction15.mmObject(),
						OriginalNotificationReference6.mmObject(), RequestedModification4.mmObject(), OriginalNotificationReference5.mmObject(), PaymentInstruction17.mmObject(), PaymentInstruction18.mmObject(),
						RequestedModification5.mmObject(), OriginalNotification10.mmObject(), UnderlyingTransaction13.mmObject(), OriginalNotification9.mmObject(), PaymentInstruction19.mmObject(), UnderlyingTransaction12.mmObject(),
						PaymentComplementaryInformation5.mmObject(), PaymentInstruction20.mmObject(), UnderlyingTransaction14.mmObject(), OriginalNotificationReference8.mmObject(), OriginalNotificationReference7.mmObject(),
						PaymentInstruction21.mmObject(), UnderlyingTransaction16.mmObject(), RequestedModification6.mmObject(), PaymentInstruction23.mmObject(), UnderlyingTransaction17.mmObject(), PaymentInstruction22.mmObject(),
						UnderlyingTransaction15.mmObject(), UnderlyingPaymentInstruction3.mmObject(), PaymentComplementaryInformation6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}