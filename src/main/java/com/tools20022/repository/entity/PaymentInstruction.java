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
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmProcessingValidityTime
 * PaymentInstruction.mmProcessingValidityTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmInstructionForNextAgent
 * PaymentInstruction.mmInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
 * PaymentInstruction.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmClearingChargeAmount
 * PaymentInstruction.mmClearingChargeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmStandingOrder
 * PaymentInstruction.mmStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmPrevious
 * PaymentInstruction.mmPrevious}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPaymentInstruction
 * DateTimePeriod.mmPaymentInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#mmNext
 * PaymentExecution.mmNext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedPaymentInstruction
 * CashSettlement.mmRelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmPaymentInstructionTrigger
 * StandingOrder.mmPaymentInstructionTrigger}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice#mmShortBusinessIdentification
 * PaymentIdentificationChoice.mmShortBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice#mmLongBusinessIdentification
 * PaymentIdentificationChoice.mmLongBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice#mmLongBusinessIdentification
 * PaymentIdentification2Choice.mmLongBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice#mmShortBusinessIdentification
 * PaymentIdentification2Choice.mmShortBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification3Choice#mmLongBusinessIdentification
 * PaymentIdentification3Choice.mmLongBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification3Choice#mmShortBusinessIdentification
 * PaymentIdentification3Choice.mmShortBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice#mmLongBusinessIdentification
 * PaymentIdentification4Choice.mmLongBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice#mmShortBusinessIdentification
 * PaymentIdentification4Choice.mmShortBusinessIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch2#mmPaymentType
 * PaymentSearch2.mmPaymentType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch3#mmPaymentType
 * PaymentSearch3.mmPaymentType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch4#mmPaymentType
 * PaymentSearch4.mmPaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionModification1#mmInstructionReference
 * TransactionModification1.mmInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionModification1#mmNewPaymentValueSet
 * TransactionModification1.mmNewPaymentValueSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionModification2#mmPaymentIdentification
 * TransactionModification2.mmPaymentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionModification2#mmNewPaymentValueSet
 * TransactionModification2.mmNewPaymentValueSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction3#mmPayment
 * Transaction3.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction4#mmPayment
 * Transaction4.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction5#mmPayment
 * Transaction5.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction24#mmPayment
 * Transaction24.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction1#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction1.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction1#mmOriginalPaymentInformationAndCancellation
 * UnderlyingTransaction1.mmOriginalPaymentInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction6#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction6.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction6#mmOriginalPaymentInformationAndCancellation
 * UnderlyingTransaction6.mmOriginalPaymentInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction7#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction7.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction7#mmOriginalPaymentInformationAndCancellation
 * UnderlyingTransaction7.mmOriginalPaymentInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction2#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction2.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction5#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction5.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction8#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction8.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance1#mmOriginalMessageInformation
 * MandateAcceptance1.mmOriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance2#mmOriginalMessageInformation
 * MandateAcceptance2.mmOriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance3#mmOriginalMessageInformation
 * MandateAcceptance3.mmOriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification4#mmOriginalNotificationReference
 * OriginalNotification4.mmOriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification3#mmOriginalNotificationReference
 * OriginalNotification3.mmOriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice#mmInitiation
 * UnderlyingTransaction1Choice.mmInitiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction3#mmOriginalGroupInformationAndStatus
 * UnderlyingTransaction3.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction3#mmOriginalPaymentInformationAndStatus
 * UnderlyingTransaction3.mmOriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice#mmInitiation
 * UnderlyingTransaction2Choice.mmInitiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction4#mmOriginalGroupInformationAndStatus
 * UnderlyingTransaction4.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction4#mmOriginalPaymentInformationAndStatus
 * UnderlyingTransaction4.mmOriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification6#mmOriginalNotificationReference
 * OriginalNotification6.mmOriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification5#mmOriginalNotificationReference
 * OriginalNotification5.mmOriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionModification3#mmPaymentIdentification
 * TransactionModification3.mmPaymentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionModification3#mmNewPaymentValueSet
 * TransactionModification3.mmNewPaymentValueSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5#mmPaymentType
 * PaymentSearch5.mmPaymentType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction33#mmPayment
 * Transaction33.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation8#mmOriginalPaymentInformation
 * RemittanceInformation8.mmOriginalPaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification7#mmOriginalNotificationReference
 * OriginalNotification7.mmOriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction10#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction10.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction11#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction11.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction11#mmOriginalPaymentInformationAndCancellation
 * UnderlyingTransaction11.mmOriginalPaymentInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance4#mmOriginalMessageInformation
 * MandateAcceptance4.mmOriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction9#mmOriginalGroupInformationAndStatus
 * UnderlyingTransaction9.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction9#mmOriginalPaymentInformationAndStatus
 * UnderlyingTransaction9.mmOriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification8#mmOriginalNotificationReference
 * OriginalNotification8.mmOriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification10#mmOriginalNotificationReference
 * OriginalNotification10.mmOriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction13#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction13.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification9#mmOriginalNotificationReference
 * OriginalNotification9.mmOriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction12#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction12.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction12#mmOriginalPaymentInformationAndCancellation
 * UnderlyingTransaction12.mmOriginalPaymentInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction14#mmOriginalGroupInformationAndStatus
 * UnderlyingTransaction14.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction14#mmOriginalPaymentInformationAndStatus
 * UnderlyingTransaction14.mmOriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation12#mmOriginalPaymentInformation
 * RemittanceInformation12.mmOriginalPaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#mmInitiation
 * UnderlyingTransaction3Choice.mmInitiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction16.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#mmOriginalPaymentInformation
 * RemittanceInformation13.mmOriginalPaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5#mmOriginalMessageInformation
 * MandateAcceptance5.mmOriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#mmOriginalGroupInformationAndStatus
 * UnderlyingTransaction17.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#mmOriginalPaymentInformationAndStatus
 * UnderlyingTransaction17.mmOriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction15#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction15.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction15#mmOriginalPaymentInformationAndCancellation
 * UnderlyingTransaction15.mmOriginalPaymentInformationAndCancellation}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected DateTimePeriod processingValidityTime;
	/**
	 * Date and time range within which the payment instruction must be
	 * processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPaymentInstruction
	 * DateTimePeriod.mmPaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#mmProcessingValidityTime
	 * PaymentSearch2.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmProcessingValidityTime
	 * PaymentSearch3.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmProcessingValidityTime
	 * PaymentSearch4.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails2#mmProcessingValidityTime
	 * PaymentDetails2.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails4#mmProcessingValidityTime
	 * PaymentDetails4.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction2#mmProcessingValidityTime
	 * PaymentInstruction2.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmProcessingValidityTime
	 * PaymentDetails5.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmProcessingValidityTime
	 * PaymentDetails6.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmProcessingValidityTime
	 * PaymentDetails7.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmProcessingValidityTime
	 * PaymentInstruction1.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction12#mmProcessingValidityTime
	 * PaymentInstruction12.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmProcessingValidityTime
	 * PaymentSearch5.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmProcessingValidityTime
	 * PaymentInstruction14.mmProcessingValidityTime}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmProcessingValidityTime = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentSearch2.mmProcessingValidityTime, com.tools20022.repository.msg.PaymentSearch3.mmProcessingValidityTime,
					com.tools20022.repository.msg.PaymentSearch4.mmProcessingValidityTime, com.tools20022.repository.msg.PaymentDetails2.mmProcessingValidityTime, com.tools20022.repository.msg.PaymentDetails4.mmProcessingValidityTime,
					com.tools20022.repository.msg.PaymentInstruction2.mmProcessingValidityTime, com.tools20022.repository.msg.PaymentDetails5.mmProcessingValidityTime, com.tools20022.repository.msg.PaymentDetails6.mmProcessingValidityTime,
					com.tools20022.repository.msg.PaymentDetails7.mmProcessingValidityTime, com.tools20022.repository.msg.PaymentInstruction1.mmProcessingValidityTime,
					com.tools20022.repository.msg.PaymentInstruction12.mmProcessingValidityTime, com.tools20022.repository.msg.PaymentSearch5.mmProcessingValidityTime,
					com.tools20022.repository.msg.PaymentInstruction14.mmProcessingValidityTime);
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingValidityTime";
			definition = "Date and time range within which the payment instruction must be processed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmPaymentInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected InstructionCode instructionForNextAgent;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInstruction
	 * PaymentSearch4.mmInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails2#mmInstruction
	 * PaymentDetails2.mmInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails4#mmInstruction
	 * PaymentDetails4.mmInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction2#mmInstruction
	 * PaymentInstruction2.mmInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionForNextAgent1#mmCode
	 * InstructionForNextAgent1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmInstructionForNextAgent
	 * CreditTransferTransactionInformation2.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmInstructionForNextAgent
	 * CreditTransferTransactionInformation11.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmInstructionForNextAgent
	 * CreditTransferTransaction2.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmInstructionForNextAgent
	 * CreditTransferTransaction7.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#mmInstructionForNextAgent
	 * CreditTransferTransactionInformation3.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#mmInstructionForNextAgent
	 * CreditTransferTransactionInformation13.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#mmInstructionForNextAgent
	 * CreditTransferTransaction4.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#mmInstructionForNextAgent
	 * CreditTransferTransaction8.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmInstructionCode
	 * RequestedModification.mmInstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmInstructionForNextAgent
	 * RequestedModification2.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmInstructionForNextAgent
	 * PaymentComplementaryInformation2.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmInstructionForNextAgent
	 * PaymentComplementaryInformation3.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmInstructionForNextAgent
	 * RequestedModification3.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmInstructionForNextAgent
	 * CreditTransferTransactionInformation7.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmInstructionForNextAgent
	 * CreditTransferTransactionInformation9.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction12#mmInstruction
	 * PaymentInstruction12.mmInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmInstruction
	 * PaymentSearch5.mmInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmInstructionForNextAgent
	 * PaymentComplementaryInformation4.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#mmInstructionForNextAgent
	 * CreditTransferTransaction17.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmInstructionForNextAgent
	 * CreditTransferTransaction19.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmInstructionForNextAgent
	 * RequestedModification4.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction18#mmInstructionForNextAgent
	 * CreditTransferTransaction18.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmInstructionForNextAgent
	 * CreditTransferTransaction23.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmInstructionForNextAgent
	 * RequestedModification5.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmInstructionForNextAgent
	 * CreditTransferTransaction25.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmInstructionForNextAgent
	 * PaymentComplementaryInformation5.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmInstructionForNextAgent
	 * CreditTransferTransaction24.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmInstructionForNextAgent
	 * RequestedModification6.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmInstructionForNextAgent
	 * PaymentComplementaryInformation6.mmInstructionForNextAgent}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmInstructionForNextAgent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentSearch4.mmInstruction, com.tools20022.repository.msg.PaymentDetails2.mmInstruction, com.tools20022.repository.msg.PaymentDetails4.mmInstruction,
					com.tools20022.repository.msg.PaymentInstruction2.mmInstruction, com.tools20022.repository.msg.InstructionForNextAgent1.mmCode,
					com.tools20022.repository.msg.CreditTransferTransactionInformation2.mmInstructionForNextAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation11.mmInstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransaction2.mmInstructionForNextAgent, com.tools20022.repository.msg.CreditTransferTransaction7.mmInstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransactionInformation3.mmInstructionForNextAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation13.mmInstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransaction4.mmInstructionForNextAgent, com.tools20022.repository.msg.CreditTransferTransaction8.mmInstructionForNextAgent,
					com.tools20022.repository.msg.RequestedModification.mmInstructionCode, com.tools20022.repository.msg.RequestedModification2.mmInstructionForNextAgent,
					com.tools20022.repository.msg.PaymentComplementaryInformation2.mmInstructionForNextAgent, com.tools20022.repository.msg.PaymentComplementaryInformation3.mmInstructionForNextAgent,
					com.tools20022.repository.msg.RequestedModification3.mmInstructionForNextAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation7.mmInstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransactionInformation9.mmInstructionForNextAgent, com.tools20022.repository.msg.PaymentInstruction12.mmInstruction,
					com.tools20022.repository.msg.PaymentSearch5.mmInstruction, com.tools20022.repository.msg.PaymentComplementaryInformation4.mmInstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransaction17.mmInstructionForNextAgent, com.tools20022.repository.msg.CreditTransferTransaction19.mmInstructionForNextAgent,
					com.tools20022.repository.msg.RequestedModification4.mmInstructionForNextAgent, com.tools20022.repository.msg.CreditTransferTransaction18.mmInstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransaction23.mmInstructionForNextAgent, com.tools20022.repository.msg.RequestedModification5.mmInstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransaction25.mmInstructionForNextAgent, com.tools20022.repository.msg.PaymentComplementaryInformation5.mmInstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransaction24.mmInstructionForNextAgent, com.tools20022.repository.msg.RequestedModification6.mmInstructionForNextAgent,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.mmInstructionForNextAgent);
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionForNextAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the next agent. \r\nUsage: The next agent may not be the creditor agent.\r\nThe instruction can relate to a level of service, can be an instruction that has to be executed by the agent, or can be information required by the next agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}
	};
	protected CashSettlement settlementInstruction;
	/**
	 * Instruction for the cash settlement between two clearing agents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedPaymentInstruction
	 * CashSettlement.mmRelatedPaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmSettlement
	 * PaymentStatusCode5Choice.mmSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#mmSettlementInformation
	 * OriginalTransactionReference1.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#mmSettlementInformation
	 * OriginalTransactionReference13.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#mmSettlementInformation
	 * OriginalTransactionReference16.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#mmSettlementInformation
	 * GroupHeader2.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmSettlementTimeIndication
	 * CreditTransferTransactionInformation2.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#mmSettlementInformation
	 * GroupHeader33.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmSettlementTimeIndication
	 * CreditTransferTransactionInformation11.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#mmSettlementInformation
	 * GroupHeader49.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmSettlementTimeIndication
	 * CreditTransferTransaction2.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmSettlementTimeIndication
	 * CreditTransferTransaction7.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#mmSettlementInformation
	 * GroupHeader3.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#mmSettlementInformation
	 * GroupHeader34.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmSettlementInformation
	 * GroupHeader50.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9#mmSettlementInformation
	 * GroupHeader9.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader41#mmSettlementInformation
	 * GroupHeader41.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader57#mmSettlementInformation
	 * GroupHeader57.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#mmSettlementInformation
	 * GroupHeader4.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#mmSettlementTimeIndication
	 * CreditTransferTransactionInformation3.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#mmSettlementInformation
	 * GroupHeader35.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#mmSettlementTimeIndication
	 * CreditTransferTransactionInformation13.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#mmSettlementInformation
	 * GroupHeader51.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#mmSettlementTimeIndication
	 * CreditTransferTransaction4.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#mmSettlementTimeIndication
	 * CreditTransferTransaction8.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6#mmSettlementInformation
	 * GroupHeader6.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader38#mmSettlementInformation
	 * GroupHeader38.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader54#mmSettlementInformation
	 * GroupHeader54.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#mmSettlementInformation
	 * OriginalTransactionReference15.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#mmSettlementInformation
	 * OriginalTransactionReference17.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmSettlementInformation
	 * RequestedModification2.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmSettlementInformation
	 * PaymentComplementaryInformation2.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmResolutionRelatedInformation
	 * PaymentTransactionInformation33.mmResolutionRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline2#mmSettlementTerms
	 * Baseline2.mmSettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmSettlementTerms
	 * PaymentObligation1.mmSettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline3#mmSettlementTerms
	 * Baseline3.mmSettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet2#mmSettlementTerms
	 * CommercialDataSet2.mmSettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet3#mmSettlementTerms
	 * CommercialDataSet3.mmSettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntentToPay1#mmSettlementTerms
	 * IntentToPay1.mmSettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmSettlementInformation
	 * PaymentComplementaryInformation3.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmResolutionRelatedInformation
	 * PaymentTransaction40.mmResolutionRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference7#mmSettlementInformation
	 * OriginalTransactionReference7.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference10#mmSettlementInformation
	 * OriginalTransactionReference10.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#mmSettlementInformation
	 * OriginalTransactionReference9.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#mmSettlementInformation
	 * OriginalTransactionReference12.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#mmSettlementInformation
	 * OriginalTransactionReference8.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#mmSettlementInformation
	 * OriginalTransactionReference11.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmSettlementTimeIndication
	 * CreditTransferTransactionInformation7.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmSettlementTimeIndication
	 * CreditTransferTransactionInformation9.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#mmSettlementInformation
	 * GroupHeader19.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#mmSettlementInformation
	 * GroupHeader24.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#mmSettlementInformation
	 * GroupHeader20.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#mmSettlementInformation
	 * GroupHeader25.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#mmSettlementInformation
	 * GroupHeader15.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#mmSettlementInformation
	 * GroupHeader26.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17#mmSettlementInformation
	 * GroupHeader17.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27#mmSettlementInformation
	 * GroupHeader27.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader22#mmSettlementInformation
	 * GroupHeader22.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmSettlementInformation
	 * GroupHeader28.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#mmSettlementInformation
	 * GroupHeader16.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#mmSettlementInformation
	 * GroupHeader29.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18#mmSettlementInformation
	 * GroupHeader18.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30#mmSettlementInformation
	 * GroupHeader30.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader21#mmSettlementInformation
	 * GroupHeader21.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmSettlementTerms
	 * Baseline4.mmSettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet4#mmSettlementTerms
	 * CommercialDataSet4.mmSettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmSettlementTerms
	 * PaymentObligation2.mmSettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmSettlement
	 * PaymentStatusCode6Choice.mmSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntentToPay2#mmSettlementTerms
	 * IntentToPay2.mmSettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmSettlementInformation
	 * PaymentComplementaryInformation4.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#mmSettlementTimeIndication
	 * CreditTransferTransaction17.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmSettlementTimeIndication
	 * CreditTransferTransaction19.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmResolutionRelatedInformation
	 * PaymentTransaction53.mmResolutionRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#mmSettlementInformation
	 * OriginalTransactionReference20.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline5#mmSettlementTerms
	 * Baseline5.mmSettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5#mmSettlementTerms
	 * CommercialDataSet5.mmSettlementTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmSettlementTimeIndication
	 * CreditTransferTransaction23.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmSettlementInformation
	 * GroupHeader70.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmSettlementTimeIndication
	 * CreditTransferTransaction25.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmSettlementInformation
	 * GroupHeader72.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmSettlementInformation
	 * PaymentComplementaryInformation5.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmSettlementInformation
	 * GroupHeader71.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#mmSettlementInformation
	 * OriginalTransactionReference22.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmResolutionRelatedInformation
	 * PaymentTransaction67.mmResolutionRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmSettlementInformation
	 * OriginalTransactionReference24.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmResolutionRelatedInformation
	 * PaymentTransaction79.mmResolutionRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmSettlementInformation
	 * PaymentComplementaryInformation6.mmSettlementInformation}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusCode5Choice.mmSettlement, com.tools20022.repository.msg.OriginalTransactionReference1.mmSettlementInformation,
					com.tools20022.repository.msg.OriginalTransactionReference13.mmSettlementInformation, com.tools20022.repository.msg.OriginalTransactionReference16.mmSettlementInformation,
					com.tools20022.repository.msg.GroupHeader2.mmSettlementInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation2.mmSettlementTimeIndication,
					com.tools20022.repository.msg.GroupHeader33.mmSettlementInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation11.mmSettlementTimeIndication,
					com.tools20022.repository.msg.GroupHeader49.mmSettlementInformation, com.tools20022.repository.msg.CreditTransferTransaction2.mmSettlementTimeIndication,
					com.tools20022.repository.msg.CreditTransferTransaction7.mmSettlementTimeIndication, com.tools20022.repository.msg.GroupHeader3.mmSettlementInformation,
					com.tools20022.repository.msg.GroupHeader34.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader50.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader9.mmSettlementInformation,
					com.tools20022.repository.msg.GroupHeader41.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader57.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader4.mmSettlementInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation3.mmSettlementTimeIndication, com.tools20022.repository.msg.GroupHeader35.mmSettlementInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation13.mmSettlementTimeIndication, com.tools20022.repository.msg.GroupHeader51.mmSettlementInformation,
					com.tools20022.repository.msg.CreditTransferTransaction4.mmSettlementTimeIndication, com.tools20022.repository.msg.CreditTransferTransaction8.mmSettlementTimeIndication,
					com.tools20022.repository.msg.GroupHeader6.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader38.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader54.mmSettlementInformation,
					com.tools20022.repository.msg.OriginalTransactionReference15.mmSettlementInformation, com.tools20022.repository.msg.OriginalTransactionReference17.mmSettlementInformation,
					com.tools20022.repository.msg.RequestedModification2.mmSettlementInformation, com.tools20022.repository.msg.PaymentComplementaryInformation2.mmSettlementInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation33.mmResolutionRelatedInformation, com.tools20022.repository.msg.Baseline2.mmSettlementTerms,
					com.tools20022.repository.msg.PaymentObligation1.mmSettlementTerms, com.tools20022.repository.msg.Baseline3.mmSettlementTerms, com.tools20022.repository.msg.CommercialDataSet2.mmSettlementTerms,
					com.tools20022.repository.msg.CommercialDataSet3.mmSettlementTerms, com.tools20022.repository.msg.IntentToPay1.mmSettlementTerms, com.tools20022.repository.msg.PaymentComplementaryInformation3.mmSettlementInformation,
					com.tools20022.repository.msg.PaymentTransaction40.mmResolutionRelatedInformation, com.tools20022.repository.msg.OriginalTransactionReference7.mmSettlementInformation,
					com.tools20022.repository.msg.OriginalTransactionReference10.mmSettlementInformation, com.tools20022.repository.msg.OriginalTransactionReference9.mmSettlementInformation,
					com.tools20022.repository.msg.OriginalTransactionReference12.mmSettlementInformation, com.tools20022.repository.msg.OriginalTransactionReference8.mmSettlementInformation,
					com.tools20022.repository.msg.OriginalTransactionReference11.mmSettlementInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation7.mmSettlementTimeIndication,
					com.tools20022.repository.msg.CreditTransferTransactionInformation9.mmSettlementTimeIndication, com.tools20022.repository.msg.GroupHeader19.mmSettlementInformation,
					com.tools20022.repository.msg.GroupHeader24.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader20.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader25.mmSettlementInformation,
					com.tools20022.repository.msg.GroupHeader15.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader26.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader17.mmSettlementInformation,
					com.tools20022.repository.msg.GroupHeader27.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader22.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader28.mmSettlementInformation,
					com.tools20022.repository.msg.GroupHeader16.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader29.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader18.mmSettlementInformation,
					com.tools20022.repository.msg.GroupHeader30.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader21.mmSettlementInformation, com.tools20022.repository.msg.Baseline4.mmSettlementTerms,
					com.tools20022.repository.msg.CommercialDataSet4.mmSettlementTerms, com.tools20022.repository.msg.PaymentObligation2.mmSettlementTerms, com.tools20022.repository.choice.PaymentStatusCode6Choice.mmSettlement,
					com.tools20022.repository.msg.IntentToPay2.mmSettlementTerms, com.tools20022.repository.msg.PaymentComplementaryInformation4.mmSettlementInformation,
					com.tools20022.repository.msg.CreditTransferTransaction17.mmSettlementTimeIndication, com.tools20022.repository.msg.CreditTransferTransaction19.mmSettlementTimeIndication,
					com.tools20022.repository.msg.PaymentTransaction53.mmResolutionRelatedInformation, com.tools20022.repository.msg.OriginalTransactionReference20.mmSettlementInformation,
					com.tools20022.repository.msg.Baseline5.mmSettlementTerms, com.tools20022.repository.msg.CommercialDataSet5.mmSettlementTerms, com.tools20022.repository.msg.CreditTransferTransaction23.mmSettlementTimeIndication,
					com.tools20022.repository.msg.GroupHeader70.mmSettlementInformation, com.tools20022.repository.msg.CreditTransferTransaction25.mmSettlementTimeIndication,
					com.tools20022.repository.msg.GroupHeader72.mmSettlementInformation, com.tools20022.repository.msg.PaymentComplementaryInformation5.mmSettlementInformation,
					com.tools20022.repository.msg.GroupHeader71.mmSettlementInformation, com.tools20022.repository.msg.OriginalTransactionReference22.mmSettlementInformation,
					com.tools20022.repository.msg.PaymentTransaction67.mmResolutionRelatedInformation, com.tools20022.repository.msg.OriginalTransactionReference24.mmSettlementInformation,
					com.tools20022.repository.msg.PaymentTransaction79.mmResolutionRelatedInformation, com.tools20022.repository.msg.PaymentComplementaryInformation6.mmSettlementInformation);
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Instruction for the cash settlement between two clearing agents.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmRelatedPaymentInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
		}
	};
	protected CurrencyAndAmount clearingChargeAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmCompensationAmount
	 * PaymentTransactionInformation5.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmCompensationAmount
	 * PaymentTransactionInformation29.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmCompensationAmount
	 * PaymentTransactionInformation2.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmCompensationAmount
	 * PaymentTransactionInformation27.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmCompensationAmount
	 * PaymentTransactionInformation13.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmCompensationAmount
	 * PaymentTransactionInformation18.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmCompensationAmount
	 * PaymentTransactionInformation16.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmCompensationAmount
	 * PaymentTransactionInformation23.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmCompensationAmount
	 * PaymentTransactionInformation17.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmCompensationAmount
	 * PaymentTransactionInformation24.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmCompensationAmount
	 * PaymentTransactionInformation21.mmCompensationAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmClearingChargeAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransactionInformation5.mmCompensationAmount, com.tools20022.repository.msg.PaymentTransactionInformation29.mmCompensationAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation2.mmCompensationAmount, com.tools20022.repository.msg.PaymentTransactionInformation27.mmCompensationAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation13.mmCompensationAmount, com.tools20022.repository.msg.PaymentTransactionInformation18.mmCompensationAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation16.mmCompensationAmount, com.tools20022.repository.msg.PaymentTransactionInformation23.mmCompensationAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation17.mmCompensationAmount, com.tools20022.repository.msg.PaymentTransactionInformation24.mmCompensationAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation21.mmCompensationAmount);
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingChargeAmount";
			definition = "Amount of money taken by a clearing agent as compensation for the processing of the payment instruction. This charge is paid either by the debtor or by the creditor or shared between them.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected StandingOrder standingOrder;
	/**
	 * Instruction given by an account holder to an account servicer to make
	 * regular transfers on given dates to the same beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmPaymentInstructionTrigger
	 * StandingOrder.mmPaymentInstructionTrigger}</li>
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
	public static final MMBusinessAssociationEnd mmStandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrder";
			definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmPaymentInstructionTrigger;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
		}
	};
	protected List<PaymentExecution> previous;
	/**
	 * Specifies that a payment instruction may be preceeded by another payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmNext
	 * PaymentExecution.mmNext}</li>
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
	public static final MMBusinessAssociationEnd mmPrevious = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Previous";
			definition = "Specifies that a payment instruction may be preceeded by another payment instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmNext;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentExecution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentInstruction";
				definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmPaymentInstruction, com.tools20022.repository.entity.PaymentExecution.mmNext,
						com.tools20022.repository.entity.CashSettlement.mmRelatedPaymentInstruction, com.tools20022.repository.entity.StandingOrder.mmPaymentInstructionTrigger);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentIdentificationChoice.mmShortBusinessIdentification,
						com.tools20022.repository.choice.PaymentIdentificationChoice.mmLongBusinessIdentification, com.tools20022.repository.choice.PaymentIdentification2Choice.mmLongBusinessIdentification,
						com.tools20022.repository.choice.PaymentIdentification2Choice.mmShortBusinessIdentification, com.tools20022.repository.choice.PaymentIdentification3Choice.mmLongBusinessIdentification,
						com.tools20022.repository.choice.PaymentIdentification3Choice.mmShortBusinessIdentification, com.tools20022.repository.choice.PaymentIdentification4Choice.mmLongBusinessIdentification,
						com.tools20022.repository.choice.PaymentIdentification4Choice.mmShortBusinessIdentification, com.tools20022.repository.msg.PaymentSearch2.mmPaymentType, com.tools20022.repository.msg.PaymentSearch3.mmPaymentType,
						com.tools20022.repository.msg.PaymentSearch4.mmPaymentType, com.tools20022.repository.msg.TransactionModification1.mmInstructionReference, com.tools20022.repository.msg.TransactionModification1.mmNewPaymentValueSet,
						com.tools20022.repository.msg.TransactionModification2.mmPaymentIdentification, com.tools20022.repository.msg.TransactionModification2.mmNewPaymentValueSet, com.tools20022.repository.msg.Transaction3.mmPayment,
						com.tools20022.repository.msg.Transaction4.mmPayment, com.tools20022.repository.msg.Transaction5.mmPayment, com.tools20022.repository.msg.Transaction24.mmPayment,
						com.tools20022.repository.msg.UnderlyingTransaction1.mmOriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction1.mmOriginalPaymentInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction6.mmOriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction6.mmOriginalPaymentInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction7.mmOriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction7.mmOriginalPaymentInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction2.mmOriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction5.mmOriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction8.mmOriginalGroupInformationAndCancellation, com.tools20022.repository.msg.MandateAcceptance1.mmOriginalMessageInformation,
						com.tools20022.repository.msg.MandateAcceptance2.mmOriginalMessageInformation, com.tools20022.repository.msg.MandateAcceptance3.mmOriginalMessageInformation,
						com.tools20022.repository.msg.OriginalNotification4.mmOriginalNotificationReference, com.tools20022.repository.msg.OriginalNotification3.mmOriginalNotificationReference,
						com.tools20022.repository.choice.UnderlyingTransaction1Choice.mmInitiation, com.tools20022.repository.msg.UnderlyingTransaction3.mmOriginalGroupInformationAndStatus,
						com.tools20022.repository.msg.UnderlyingTransaction3.mmOriginalPaymentInformationAndStatus, com.tools20022.repository.choice.UnderlyingTransaction2Choice.mmInitiation,
						com.tools20022.repository.msg.UnderlyingTransaction4.mmOriginalGroupInformationAndStatus, com.tools20022.repository.msg.UnderlyingTransaction4.mmOriginalPaymentInformationAndStatus,
						com.tools20022.repository.msg.OriginalNotification6.mmOriginalNotificationReference, com.tools20022.repository.msg.OriginalNotification5.mmOriginalNotificationReference,
						com.tools20022.repository.msg.TransactionModification3.mmPaymentIdentification, com.tools20022.repository.msg.TransactionModification3.mmNewPaymentValueSet,
						com.tools20022.repository.msg.PaymentSearch5.mmPaymentType, com.tools20022.repository.msg.Transaction33.mmPayment, com.tools20022.repository.msg.RemittanceInformation8.mmOriginalPaymentInformation,
						com.tools20022.repository.msg.OriginalNotification7.mmOriginalNotificationReference, com.tools20022.repository.msg.UnderlyingTransaction10.mmOriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction11.mmOriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction11.mmOriginalPaymentInformationAndCancellation,
						com.tools20022.repository.msg.MandateAcceptance4.mmOriginalMessageInformation, com.tools20022.repository.msg.UnderlyingTransaction9.mmOriginalGroupInformationAndStatus,
						com.tools20022.repository.msg.UnderlyingTransaction9.mmOriginalPaymentInformationAndStatus, com.tools20022.repository.msg.OriginalNotification8.mmOriginalNotificationReference,
						com.tools20022.repository.msg.OriginalNotification10.mmOriginalNotificationReference, com.tools20022.repository.msg.UnderlyingTransaction13.mmOriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.OriginalNotification9.mmOriginalNotificationReference, com.tools20022.repository.msg.UnderlyingTransaction12.mmOriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction12.mmOriginalPaymentInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction14.mmOriginalGroupInformationAndStatus,
						com.tools20022.repository.msg.UnderlyingTransaction14.mmOriginalPaymentInformationAndStatus, com.tools20022.repository.msg.RemittanceInformation12.mmOriginalPaymentInformation,
						com.tools20022.repository.choice.UnderlyingTransaction3Choice.mmInitiation, com.tools20022.repository.msg.UnderlyingTransaction16.mmOriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.RemittanceInformation13.mmOriginalPaymentInformation, com.tools20022.repository.msg.MandateAcceptance5.mmOriginalMessageInformation,
						com.tools20022.repository.msg.UnderlyingTransaction17.mmOriginalGroupInformationAndStatus, com.tools20022.repository.msg.UnderlyingTransaction17.mmOriginalPaymentInformationAndStatus,
						com.tools20022.repository.msg.UnderlyingTransaction15.mmOriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction15.mmOriginalPaymentInformationAndCancellation);
				superType_lazy = () -> PaymentExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInstruction.mmProcessingValidityTime, com.tools20022.repository.entity.PaymentInstruction.mmInstructionForNextAgent,
						com.tools20022.repository.entity.PaymentInstruction.mmSettlementInstruction, com.tools20022.repository.entity.PaymentInstruction.mmClearingChargeAmount,
						com.tools20022.repository.entity.PaymentInstruction.mmStandingOrder, com.tools20022.repository.entity.PaymentInstruction.mmPrevious);
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

	public DateTimePeriod getProcessingValidityTime() {
		return processingValidityTime;
	}

	public void setProcessingValidityTime(com.tools20022.repository.entity.DateTimePeriod processingValidityTime) {
		this.processingValidityTime = processingValidityTime;
	}

	public InstructionCode getInstructionForNextAgent() {
		return instructionForNextAgent;
	}

	public void setInstructionForNextAgent(InstructionCode instructionForNextAgent) {
		this.instructionForNextAgent = instructionForNextAgent;
	}

	public CashSettlement getSettlementInstruction() {
		return settlementInstruction;
	}

	public void setSettlementInstruction(com.tools20022.repository.entity.CashSettlement settlementInstruction) {
		this.settlementInstruction = settlementInstruction;
	}

	public CurrencyAndAmount getClearingChargeAmount() {
		return clearingChargeAmount;
	}

	public void setClearingChargeAmount(CurrencyAndAmount clearingChargeAmount) {
		this.clearingChargeAmount = clearingChargeAmount;
	}

	public StandingOrder getStandingOrder() {
		return standingOrder;
	}

	public void setStandingOrder(com.tools20022.repository.entity.StandingOrder standingOrder) {
		this.standingOrder = standingOrder;
	}

	public List<PaymentExecution> getPrevious() {
		return previous;
	}

	public void setPrevious(List<PaymentExecution> previous) {
		this.previous = previous;
	}
}