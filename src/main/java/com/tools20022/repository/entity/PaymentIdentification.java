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
import com.tools20022.repository.choice.PaymentIdentification2Choice;
import com.tools20022.repository.choice.PaymentIdentification3Choice;
import com.tools20022.repository.choice.PaymentIdentification4Choice;
import com.tools20022.repository.choice.PaymentIdentificationChoice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different identifications associated with a payment
 * transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentIdentification"
 * src="doc-files/PaymentIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#ExecutionIdentification
 * PaymentIdentification.ExecutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#EndToEndIdentification
 * PaymentIdentification.EndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#InstructionIdentification
 * PaymentIdentification.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#TransactionIdentification
 * PaymentIdentification.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#ClearingSystemReference
 * PaymentIdentification.ClearingSystemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#CreditorReference
 * PaymentIdentification.CreditorReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#Payment
 * PaymentIdentification.Payment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#PaymentRelatedIdentifications
 * Payment.PaymentRelatedIdentifications}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.TradeIdentification
 * TradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice
 * PaymentIdentificationChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice
 * PaymentIdentification2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification3Choice
 * PaymentIdentification3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice
 * PaymentIdentification4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentIdentification1
 * PaymentIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditorReferenceInformation1
 * CreditorReferenceInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditorReferenceInformation2
 * CreditorReferenceInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentIdentification2
 * PaymentIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentIdentification3
 * PaymentIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentIdentification4
 * PaymentIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReferences4
 * TransactionReferences4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CertificateIdentification1
 * CertificateIdentification1}</li>
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
 * "PaymentIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a payment transaction."
 * </li>
 * </ul>
 */
public class PaymentIdentification extends TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identifier for a payment execution, as assigned by
	 * the clearing agent or the initiating party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice#PaymentInstructionReference
	 * PaymentIdentificationChoice.PaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#PaymentInstructionReference
	 * PaymentInstructionReferenceDetails3.PaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails2#PaymentInstructionReference
	 * PaymentInstructionReferenceDetails2.PaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice#PaymentInstructionReference
	 * PaymentIdentification2Choice.PaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#PaymentInstructionReference
	 * PaymentInstructionReferenceDetails4.PaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification3Choice#PaymentInstructionReference
	 * PaymentIdentification3Choice.PaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShortPaymentIdentification1#TransactionIdentification
	 * ShortPaymentIdentification1.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#InstructionReference
	 * PaymentSearch2.InstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#PaymentInstructionReference
	 * PaymentSearch2.PaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#InstructionReference
	 * PaymentSearch3.InstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#PaymentInstructionReference
	 * PaymentSearch3.PaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#PaymentIdentification
	 * PaymentSearch4.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#TransactionIdentification
	 * PaymentSearch4.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#PaymentInstructionReference
	 * PaymentDetails5.PaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#PaymentInstructionReference
	 * PaymentDetails6.PaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#PaymentInstructionReference
	 * PaymentDetails7.PaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader23#MessageIdentification
	 * GroupHeader23.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader42#MessageIdentification
	 * GroupHeader42.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader58#MessageIdentification
	 * GroupHeader58.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader1#MessageIdentification
	 * GroupHeader1.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader32#MessageIdentification
	 * GroupHeader32.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#MessageIdentification
	 * GroupHeader48.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader39#MessageIdentification
	 * GroupHeader39.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#MessageIdentification
	 * GroupHeader55.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader7#MessageIdentification
	 * GroupHeader7.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation4#OriginalMessageIdentification
	 * OriginalGroupInformation4.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#OriginalPaymentInformationIdentification
	 * PaymentTransactionInformation3.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation23#OriginalMessageIdentification
	 * OriginalGroupInformation23.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3#OriginalMessageIdentification
	 * OriginalGroupInformation3.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader4#OriginalMessageIdentification
	 * OriginalGroupHeader4.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction4#PaymentCancellationIdentification
	 * OriginalPaymentInstruction4.PaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction8#PaymentCancellationIdentification
	 * OriginalPaymentInstruction8.PaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader8#MessageIdentification
	 * GroupHeader8.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation5#OriginalMessageIdentification
	 * OriginalGroupInformation5.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#OriginalPaymentInformationIdentification
	 * PaymentTransactionInformation4.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader40#MessageIdentification
	 * GroupHeader40.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation22#OriginalMessageIdentification
	 * OriginalGroupInformation22.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#MessageIdentification
	 * GroupHeader56.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#OriginalMessageIdentification
	 * OriginalGroupHeader3.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader5#MessageIdentification
	 * GroupHeader5.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation1#OriginalMessageIdentification
	 * OriginalGroupInformation1.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#OriginalPaymentInformationIdentification
	 * PaymentTransactionInformation1.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader36#MessageIdentification
	 * GroupHeader36.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation20#OriginalMessageIdentification
	 * OriginalGroupInformation20.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#MessageIdentification
	 * GroupHeader52.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#OriginalMessageIdentification
	 * OriginalGroupHeader1.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#MessageIdentification
	 * GroupHeader2.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#MessageIdentification
	 * GroupHeader33.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#MessageIdentification
	 * GroupHeader49.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#MessageIdentification
	 * GroupHeader3.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#MessageIdentification
	 * GroupHeader34.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#MessageIdentification
	 * GroupHeader50.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9#MessageIdentification
	 * GroupHeader9.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#OriginalPaymentInformationIdentification
	 * PaymentTransactionInformation5.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader41#MessageIdentification
	 * GroupHeader41.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader57#MessageIdentification
	 * GroupHeader57.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader37#MessageIdentification
	 * GroupHeader37.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader53#MessageIdentification
	 * GroupHeader53.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#MessageIdentification
	 * GroupHeader4.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#MessageIdentification
	 * GroupHeader35.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#MessageIdentification
	 * GroupHeader51.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader31#MessageIdentification
	 * GroupHeader31.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#MessageIdentification
	 * GroupHeader47.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6#MessageIdentification
	 * GroupHeader6.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation2#OriginalMessageIdentification
	 * OriginalGroupInformation2.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader38#MessageIdentification
	 * GroupHeader38.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation21#OriginalMessageIdentification
	 * OriginalGroupInformation21.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader54#MessageIdentification
	 * GroupHeader54.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2#OriginalMessageIdentification
	 * OriginalGroupHeader2.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#MessageIdentification
	 * GroupHeader46.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#OriginalMessageIdentification
	 * OriginalGroupInformation25.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader45#MessageIdentification
	 * GroupHeader45.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract#AssignerInstructionIdentification
	 * PaymentInstructionExtract.AssignerInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract#AssigneeInstructionIdentification
	 * PaymentInstructionExtract.AssigneeInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#OriginalInstructionIdentification
	 * PaymentInstructionExtract2.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader43#MessageIdentification
	 * GroupHeader43.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader59#MessageIdentification
	 * GroupHeader59.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader44#MessageIdentification
	 * GroupHeader44.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#OriginalPaymentInformationIdentification
	 * UnderlyingPaymentInstruction1.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#InstructionIdentification
	 * RequestedModification2.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation24#OriginalGroupCancellationIdentification
	 * OriginalGroupInformation24.OriginalGroupCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation24#OriginalMessageIdentification
	 * OriginalGroupInformation24.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#OriginalPaymentInformationIdentification
	 * UnderlyingPaymentInstruction2.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#OriginalGroupCancellationIdentification
	 * OriginalGroupHeader5.OriginalGroupCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#OriginalMessageIdentification
	 * OriginalGroupHeader5.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction3#OriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction3.
	 * OriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#InstructionIdentification
	 * RequestedModification3.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem3#OriginalItemIdentification
	 * OriginalItem3.OriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader60#MessageIdentification
	 * GroupHeader60.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader63#MessageIdentification
	 * GroupHeader63.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#OriginalMessageIdentification
	 * OriginalGroupInformation13.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation17#OriginalMessageIdentification
	 * OriginalGroupInformation17.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#OriginalMessageIdentification
	 * OriginalGroupInformation15.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation19#OriginalMessageIdentification
	 * OriginalGroupInformation19.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation11#OriginalMessageIdentification
	 * OriginalGroupInformation11.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation18#OriginalMessageIdentification
	 * OriginalGroupInformation18.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation8#OriginalMessageIdentification
	 * OriginalGroupInformation8.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#OriginalPaymentInformationIdentification
	 * PaymentTransactionInformation15.OriginalPaymentInformationIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#OriginalPaymentInformationIdentification
	 * PaymentTransactionInformation22.OriginalPaymentInformationIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#OriginalPaymentInformationIdentification
	 * PaymentTransactionInformation17.OriginalPaymentInformationIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#OriginalPaymentInformationIdentification
	 * PaymentTransactionInformation24.OriginalPaymentInformationIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#MessageIdentification
	 * GroupHeader19.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#MessageIdentification
	 * GroupHeader24.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#MessageIdentification
	 * GroupHeader20.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#MessageIdentification
	 * GroupHeader25.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#MessageIdentification
	 * GroupHeader15.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#MessageIdentification
	 * GroupHeader26.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17#MessageIdentification
	 * GroupHeader17.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27#MessageIdentification
	 * GroupHeader27.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader22#MessageIdentification
	 * GroupHeader22.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28#MessageIdentification
	 * GroupHeader28.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#MessageIdentification
	 * GroupHeader16.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#MessageIdentification
	 * GroupHeader29.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18#MessageIdentification
	 * GroupHeader18.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30#MessageIdentification
	 * GroupHeader30.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation16#OriginalMessageIdentification
	 * OriginalGroupInformation16.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation14#OriginalMessageIdentification
	 * OriginalGroupInformation14.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation7#OriginalMessageIdentification
	 * OriginalGroupInformation7.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader12#MessageIdentification
	 * GroupHeader12.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader21#MessageIdentification
	 * GroupHeader21.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#PaymentIdentification
	 * PaymentSearch5.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#TransactionIdentification
	 * PaymentSearch5.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader62#MessageIdentification
	 * GroupHeader62.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader67#MessageIdentification
	 * GroupHeader67.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem4#OriginalItemIdentification
	 * OriginalItem4.OriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#InstructionIdentification
	 * RequestedModification4.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#PaymentCancellationIdentification
	 * OriginalPaymentInstruction13.PaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10#OriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction10.
	 * OriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#MessageIdentification
	 * GroupHeader70.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#InstructionIdentification
	 * RequestedModification5.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#MessageIdentification
	 * GroupHeader72.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#MessageIdentification
	 * GroupHeader71.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#PaymentCancellationIdentification
	 * OriginalPaymentInstruction15.PaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem5#OriginalItemIdentification
	 * OriginalItem5.OriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#OriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction17.
	 * OriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#OriginalMessageIdentification
	 * OriginalMessage2.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#OriginalMessageIdentification
	 * OriginalMessage3.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation27#OriginalMessageIdentification
	 * OriginalGroupInformation27.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#OriginalMessageIdentification
	 * OriginalGroupHeader7.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#InstructionIdentification
	 * RequestedModification6.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#OriginalMessageIdentification
	 * OriginalGroupInformation28.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#OriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction22.
	 * OriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#PaymentCancellationIdentification
	 * OriginalPaymentInstruction20.PaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#OriginalPaymentInformationIdentification
	 * UnderlyingPaymentInstruction3.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#OriginalMessageIdentification
	 * OriginalGroupHeader6.OriginalMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExecutionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentIdentificationChoice.PaymentInstructionReference, com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.PaymentInstructionReference,
					com.tools20022.repository.msg.PaymentInstructionReferenceDetails2.PaymentInstructionReference, com.tools20022.repository.choice.PaymentIdentification2Choice.PaymentInstructionReference,
					com.tools20022.repository.msg.PaymentInstructionReferenceDetails4.PaymentInstructionReference, com.tools20022.repository.choice.PaymentIdentification3Choice.PaymentInstructionReference,
					com.tools20022.repository.msg.ShortPaymentIdentification1.TransactionIdentification, com.tools20022.repository.msg.PaymentSearch2.InstructionReference,
					com.tools20022.repository.msg.PaymentSearch2.PaymentInstructionReference, com.tools20022.repository.msg.PaymentSearch3.InstructionReference, com.tools20022.repository.msg.PaymentSearch3.PaymentInstructionReference,
					com.tools20022.repository.msg.PaymentSearch4.PaymentIdentification, com.tools20022.repository.msg.PaymentSearch4.TransactionIdentification, com.tools20022.repository.msg.PaymentDetails5.PaymentInstructionReference,
					com.tools20022.repository.msg.PaymentDetails6.PaymentInstructionReference, com.tools20022.repository.msg.PaymentDetails7.PaymentInstructionReference, com.tools20022.repository.msg.GroupHeader23.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader42.MessageIdentification, com.tools20022.repository.msg.GroupHeader58.MessageIdentification, com.tools20022.repository.msg.GroupHeader1.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader32.MessageIdentification, com.tools20022.repository.msg.GroupHeader48.MessageIdentification, com.tools20022.repository.msg.GroupHeader39.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader55.MessageIdentification, com.tools20022.repository.msg.GroupHeader7.MessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation4.OriginalMessageIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation3.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalGroupInformation23.OriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation3.OriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupHeader4.OriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction4.PaymentCancellationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction8.PaymentCancellationIdentification,
					com.tools20022.repository.msg.GroupHeader8.MessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation5.OriginalMessageIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation4.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.GroupHeader40.MessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation22.OriginalMessageIdentification, com.tools20022.repository.msg.GroupHeader56.MessageIdentification,
					com.tools20022.repository.msg.OriginalGroupHeader3.OriginalMessageIdentification, com.tools20022.repository.msg.GroupHeader5.MessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation1.OriginalMessageIdentification, com.tools20022.repository.msg.PaymentTransactionInformation1.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.GroupHeader36.MessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation20.OriginalMessageIdentification,
					com.tools20022.repository.msg.GroupHeader52.MessageIdentification, com.tools20022.repository.msg.OriginalGroupHeader1.OriginalMessageIdentification, com.tools20022.repository.msg.GroupHeader2.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader33.MessageIdentification, com.tools20022.repository.msg.GroupHeader49.MessageIdentification, com.tools20022.repository.msg.GroupHeader3.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader34.MessageIdentification, com.tools20022.repository.msg.GroupHeader50.MessageIdentification, com.tools20022.repository.msg.GroupHeader9.MessageIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation5.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.GroupHeader41.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader57.MessageIdentification, com.tools20022.repository.msg.GroupHeader37.MessageIdentification, com.tools20022.repository.msg.GroupHeader53.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader4.MessageIdentification, com.tools20022.repository.msg.GroupHeader35.MessageIdentification, com.tools20022.repository.msg.GroupHeader51.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader31.MessageIdentification, com.tools20022.repository.msg.GroupHeader47.MessageIdentification, com.tools20022.repository.msg.GroupHeader6.MessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation2.OriginalMessageIdentification, com.tools20022.repository.msg.GroupHeader38.MessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation21.OriginalMessageIdentification, com.tools20022.repository.msg.GroupHeader54.MessageIdentification,
					com.tools20022.repository.msg.OriginalGroupHeader2.OriginalMessageIdentification, com.tools20022.repository.msg.GroupHeader46.MessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation25.OriginalMessageIdentification, com.tools20022.repository.msg.GroupHeader45.MessageIdentification,
					com.tools20022.repository.msg.PaymentInstructionExtract.AssignerInstructionIdentification, com.tools20022.repository.msg.PaymentInstructionExtract.AssigneeInstructionIdentification,
					com.tools20022.repository.msg.PaymentInstructionExtract2.OriginalInstructionIdentification, com.tools20022.repository.msg.GroupHeader43.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader59.MessageIdentification, com.tools20022.repository.msg.GroupHeader44.MessageIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction1.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.RequestedModification2.InstructionIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation24.OriginalGroupCancellationIdentification, com.tools20022.repository.msg.OriginalGroupInformation24.OriginalMessageIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction2.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalGroupHeader5.OriginalGroupCancellationIdentification,
					com.tools20022.repository.msg.OriginalGroupHeader5.OriginalMessageIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction3.OriginalPaymentInformationCancellationIdentification,
					com.tools20022.repository.msg.RequestedModification3.InstructionIdentification, com.tools20022.repository.msg.OriginalItem3.OriginalItemIdentification, com.tools20022.repository.msg.GroupHeader60.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader63.MessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation13.OriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation17.OriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation15.OriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation19.OriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation11.OriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation18.OriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation8.OriginalMessageIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation15.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentTransactionInformation22.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation17.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentTransactionInformation24.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.GroupHeader19.MessageIdentification, com.tools20022.repository.msg.GroupHeader24.MessageIdentification, com.tools20022.repository.msg.GroupHeader20.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader25.MessageIdentification, com.tools20022.repository.msg.GroupHeader15.MessageIdentification, com.tools20022.repository.msg.GroupHeader26.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader17.MessageIdentification, com.tools20022.repository.msg.GroupHeader27.MessageIdentification, com.tools20022.repository.msg.GroupHeader22.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader28.MessageIdentification, com.tools20022.repository.msg.GroupHeader16.MessageIdentification, com.tools20022.repository.msg.GroupHeader29.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader18.MessageIdentification, com.tools20022.repository.msg.GroupHeader30.MessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation16.OriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation14.OriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation7.OriginalMessageIdentification, com.tools20022.repository.msg.GroupHeader12.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader21.MessageIdentification, com.tools20022.repository.msg.PaymentSearch5.PaymentIdentification, com.tools20022.repository.msg.PaymentSearch5.TransactionIdentification,
					com.tools20022.repository.msg.GroupHeader62.MessageIdentification, com.tools20022.repository.msg.GroupHeader67.MessageIdentification, com.tools20022.repository.msg.OriginalItem4.OriginalItemIdentification,
					com.tools20022.repository.msg.RequestedModification4.InstructionIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction13.PaymentCancellationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction10.OriginalPaymentInformationCancellationIdentification, com.tools20022.repository.msg.GroupHeader70.MessageIdentification,
					com.tools20022.repository.msg.RequestedModification5.InstructionIdentification, com.tools20022.repository.msg.GroupHeader72.MessageIdentification, com.tools20022.repository.msg.GroupHeader71.MessageIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction15.PaymentCancellationIdentification, com.tools20022.repository.msg.OriginalItem5.OriginalItemIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction17.OriginalPaymentInformationCancellationIdentification, com.tools20022.repository.msg.OriginalMessage2.OriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalMessage3.OriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation27.OriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupHeader7.OriginalMessageIdentification, com.tools20022.repository.msg.RequestedModification6.InstructionIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation28.OriginalMessageIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction22.OriginalPaymentInformationCancellationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction20.PaymentCancellationIdentification, com.tools20022.repository.msg.UnderlyingPaymentInstruction3.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalGroupHeader6.OriginalMessageIdentification);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutionIdentification";
			definition = "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for a payment as assigned by the
	 * originator. The payment transaction reference is used for reconciliation
	 * or to link tasks relating to the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#EndToEndIdentification
	 * LongPaymentIdentification1.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#TransactionReference
	 * PaymentSearch2.TransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#TransactionReference
	 * PaymentSearch3.TransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#MessageIdentification
	 * PaymentSearch4.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#EndToEndIdentification
	 * PaymentSearch4.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification1#EndToEndIdentification
	 * PaymentIdentification1.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#TransactionReference
	 * PaymentDetails6.TransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#MessageIdentification
	 * PaymentInstruction1.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#EndToEndIdentification
	 * PaymentInstruction1.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#EndToEndIdentification
	 * TransactionReferences1.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences2#EndToEndIdentification
	 * TransactionReferences2.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#EndToEndIdentification
	 * TransactionReferences3.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#OriginalEndToEndIdentification
	 * PaymentTransactionInformation3.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#OriginalEndToEndIdentification
	 * PaymentTransactionInformation30.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#OriginalEndToEndIdentification
	 * PaymentTransaction37.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#OriginalEndToEndIdentification
	 * PaymentTransaction47.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#OriginalEndToEndIdentification
	 * PaymentTransactionInformation4.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#OriginalEndToEndIdentification
	 * PaymentTransactionInformation28.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#OriginalEndToEndIdentification
	 * PaymentTransaction35.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#OriginalEndToEndIdentification
	 * PaymentTransaction42.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#OriginalEndToEndIdentification
	 * PaymentTransactionInformation1.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#OriginalEndToEndIdentification
	 * PaymentTransactionInformation25.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#OriginalEndToEndIdentification
	 * PaymentTransaction32.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#OriginalEndToEndIdentification
	 * PaymentTransaction46.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification2#EndToEndIdentification
	 * PaymentIdentification2.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#EndToEndIdentification
	 * PaymentIdentification3.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#OriginalEndToEndIdentification
	 * PaymentTransactionInformation31.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#OriginalEndToEndIdentification
	 * PaymentTransaction38.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#OriginalEndToEndIdentification
	 * PaymentTransaction48.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#OriginalEndToEndIdentification
	 * PaymentTransactionInformation5.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#OriginalEndToEndIdentification
	 * PaymentTransactionInformation29.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#OriginalEndToEndIdentification
	 * PaymentTransaction36.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#OriginalEndToEndIdentification
	 * PaymentTransaction45.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#OriginalEndToEndIdentification
	 * PaymentTransactionInformation26.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#OriginalEndToEndIdentification
	 * PaymentTransaction33.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#OriginalEndToEndIdentification
	 * PaymentTransaction43.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#OriginalEndToEndIdentification
	 * PaymentTransactionInformation2.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#OriginalEndToEndIdentification
	 * PaymentTransactionInformation27.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#OriginalEndToEndIdentification
	 * PaymentTransaction34.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#OriginalEndToEndIdentification
	 * PaymentTransaction44.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#OriginalEndToEndIdentification
	 * PaymentTransactionInformation34.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#OriginalEndToEndIdentification
	 * PaymentTransaction41.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#OriginalEndToEndIdentification
	 * PaymentTransaction49.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#EndToEndIdentification
	 * PaymentIdentification4.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry2#EndToEndIdentification
	 * NotificationEntry2.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#EndToEndIdentification
	 * NotificationItem3.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem1#OriginalEndToEndIdentification
	 * OriginalItem1.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus1#OriginalEndToEndIdentification
	 * OriginalItemAndStatus1.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus2#OriginalEndToEndIdentification
	 * OriginalItemAndStatus2.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#OriginalEndToEndIdentification
	 * UnderlyingPaymentInstruction1.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#OriginalEndToEndIdentification
	 * UnderlyingPaymentTransaction1.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#EndToEndIdentification
	 * RequestedModification2.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#TransactionIdentification
	 * RequestedModification2.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#EndToEndIdentification
	 * PaymentComplementaryInformation2.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#OriginalEndToEndIdentification
	 * PaymentTransactionInformation32.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#OriginalEndToEndIdentification
	 * PaymentTransactionInformation33.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1#EndToEndIdentification
	 * CorrectivePaymentInitiation1.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#EndToEndIdentification
	 * CorrectiveInterbankTransaction1.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#PaymentReference
	 * TradeSettlement1.PaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification3#TransactionIdentification
	 * ReportSpecification3.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#OriginalEndToEndIdentification
	 * UnderlyingPaymentInstruction2.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#OriginalEndToEndIdentification
	 * UnderlyingPaymentTransaction2.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#EndToEndIdentification
	 * PaymentComplementaryInformation3.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#OriginalEndToEndIdentification
	 * PaymentTransaction39.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#OriginalEndToEndIdentification
	 * PaymentTransaction40.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#EndToEndIdentification
	 * RequestedModification3.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#TransactionIdentification
	 * RequestedModification3.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#EndToEndIdentification
	 * NotificationItem4.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem3#OriginalEndToEndIdentification
	 * OriginalItem3.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#OriginalEndToEndIdentification
	 * OriginalItemAndStatus3.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#PaymentReference
	 * ExpectedExecutionDetails3.PaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#PaymentReference
	 * RedemptionExecution10.PaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#PaymentReference
	 * RedemptionOrder9.PaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#PaymentReference
	 * SubscriptionExecution7.PaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#PaymentReference
	 * SubscriptionOrder9.PaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#OriginalEndToEndIdentification
	 * PaymentTransactionInformation13.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#OriginalEndToEndIdentification
	 * PaymentTransactionInformation18.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#OriginalEndToEndIdentification
	 * PaymentTransactionInformation15.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#OriginalEndToEndIdentification
	 * PaymentTransactionInformation22.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#OriginalEndToEndIdentification
	 * PaymentTransactionInformation12.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#OriginalEndToEndIdentification
	 * PaymentTransactionInformation19.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#OriginalEndToEndIdentification
	 * PaymentTransactionInformation14.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#OriginalEndToEndIdentification
	 * PaymentTransactionInformation20.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#OriginalEndToEndIdentification
	 * PaymentTransactionInformation16.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#OriginalEndToEndIdentification
	 * PaymentTransactionInformation23.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#OriginalEndToEndIdentification
	 * PaymentTransactionInformation17.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#OriginalEndToEndIdentification
	 * PaymentTransactionInformation24.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#OriginalEndToEndIdentification
	 * PaymentTransactionInformation21.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#MessageIdentification
	 * PaymentSearch5.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#EndToEndIdentification
	 * PaymentSearch5.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#MessageIdentification
	 * PaymentInstruction14.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#EndToEndIdentification
	 * PaymentInstruction14.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#EndToEndIdentification
	 * TransactionReferences4.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#EndToEndIdentification
	 * PaymentComplementaryInformation4.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#OriginalEndToEndIdentification
	 * PaymentTransaction50.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#OriginalEndToEndIdentification
	 * PaymentTransaction52.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#OriginalEndToEndIdentification
	 * PaymentTransaction51.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem4#OriginalEndToEndIdentification
	 * OriginalItem4.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#EndToEndIdentification
	 * RequestedModification4.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#TransactionIdentification
	 * RequestedModification4.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#OriginalEndToEndIdentification
	 * PaymentTransaction58.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#OriginalEndToEndIdentification
	 * PaymentTransaction54.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#OriginalEndToEndIdentification
	 * OriginalItemAndStatus4.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#OriginalEndToEndIdentification
	 * PaymentTransaction53.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#OriginalEndToEndIdentification
	 * PaymentTransaction57.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#OriginalEndToEndIdentification
	 * PaymentTransaction56.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#OriginalEndToEndIdentification
	 * PaymentTransaction55.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#EndToEndIdentification
	 * NotificationItem5.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#OriginalEndToEndIdentification
	 * PaymentTransaction59.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#EndToEndIdentification
	 * CertificateIdentification1.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#EndToEndIdentification
	 * RequestedModification5.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#TransactionIdentification
	 * RequestedModification5.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#OriginalEndToEndIdentification
	 * PaymentTransaction65.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#EndToEndIdentification
	 * PaymentComplementaryInformation5.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#OriginalEndToEndIdentification
	 * PaymentTransaction63.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#OriginalEndToEndIdentification
	 * PaymentTransaction60.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#OriginalEndToEndIdentification
	 * PaymentTransaction68.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#OriginalEndToEndIdentification
	 * PaymentTransaction61.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem5#OriginalEndToEndIdentification
	 * OriginalItem5.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#OriginalEndToEndIdentification
	 * OriginalItemAndStatus5.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#OriginalEndToEndIdentification
	 * PaymentTransaction66.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#OriginalEndToEndIdentification
	 * PaymentTransaction67.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#OriginalEndToEndIdentification
	 * PaymentTransaction62.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#OriginalEndToEndIdentification
	 * PaymentTransaction64.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#EndToEndIdentification
	 * NotificationItem6.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#OriginalEndToEndIdentification
	 * PaymentTransaction69.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#OriginalEndToEndIdentification
	 * PaymentTransaction73.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#OriginalEndToEndIdentification
	 * PaymentTransaction80.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#OriginalEndToEndIdentification
	 * PaymentTransaction81.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#EndToEndIdentification
	 * RequestedModification6.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#TransactionIdentification
	 * RequestedModification6.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#OriginalEndToEndIdentification
	 * PaymentTransaction76.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#OriginalEndToEndIdentification
	 * PaymentTransaction78.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#OriginalEndToEndIdentification
	 * PaymentTransaction74.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#OriginalEndToEndIdentification
	 * PaymentTransaction83.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#OriginalEndToEndIdentification
	 * PaymentTransaction77.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#EndToEndIdentification
	 * CorrectivePaymentInitiation2.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#OriginalEndToEndIdentification
	 * UnderlyingPaymentInstruction3.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalEndToEndIdentification
	 * PaymentTransaction75.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#OriginalEndToEndIdentification
	 * PaymentTransaction82.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalEndToEndIdentification
	 * PaymentTransaction79.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#EndToEndIdentification
	 * PaymentComplementaryInformation6.EndToEndIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EndToEndIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LongPaymentIdentification1.EndToEndIdentification, com.tools20022.repository.msg.PaymentSearch2.TransactionReference,
					com.tools20022.repository.msg.PaymentSearch3.TransactionReference, com.tools20022.repository.msg.PaymentSearch4.MessageIdentification, com.tools20022.repository.msg.PaymentSearch4.EndToEndIdentification,
					com.tools20022.repository.msg.PaymentIdentification1.EndToEndIdentification, com.tools20022.repository.msg.PaymentDetails6.TransactionReference, com.tools20022.repository.msg.PaymentInstruction1.MessageIdentification,
					com.tools20022.repository.msg.PaymentInstruction1.EndToEndIdentification, com.tools20022.repository.msg.TransactionReferences1.EndToEndIdentification,
					com.tools20022.repository.msg.TransactionReferences2.EndToEndIdentification, com.tools20022.repository.msg.TransactionReferences3.EndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation3.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation30.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction37.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction47.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation4.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation28.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction35.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction42.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation1.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation25.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction32.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction46.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentIdentification2.EndToEndIdentification, com.tools20022.repository.msg.PaymentIdentification3.EndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation31.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction38.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction48.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation5.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation29.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction36.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction45.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation26.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction33.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction43.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation2.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation27.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction34.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction44.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation34.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction41.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction49.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentIdentification4.EndToEndIdentification,
					com.tools20022.repository.msg.NotificationEntry2.EndToEndIdentification, com.tools20022.repository.msg.NotificationItem3.EndToEndIdentification,
					com.tools20022.repository.msg.OriginalItem1.OriginalEndToEndIdentification, com.tools20022.repository.msg.OriginalItemAndStatus1.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.OriginalItemAndStatus2.OriginalEndToEndIdentification, com.tools20022.repository.msg.UnderlyingPaymentInstruction1.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentTransaction1.OriginalEndToEndIdentification, com.tools20022.repository.msg.RequestedModification2.EndToEndIdentification,
					com.tools20022.repository.msg.RequestedModification2.TransactionIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation2.EndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation32.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation33.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.CorrectivePaymentInitiation1.EndToEndIdentification, com.tools20022.repository.msg.CorrectiveInterbankTransaction1.EndToEndIdentification,
					com.tools20022.repository.msg.TradeSettlement1.PaymentReference, com.tools20022.repository.msg.ReportSpecification3.TransactionIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction2.OriginalEndToEndIdentification, com.tools20022.repository.msg.UnderlyingPaymentTransaction2.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation3.EndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction39.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction40.OriginalEndToEndIdentification, com.tools20022.repository.msg.RequestedModification3.EndToEndIdentification,
					com.tools20022.repository.msg.RequestedModification3.TransactionIdentification, com.tools20022.repository.msg.NotificationItem4.EndToEndIdentification,
					com.tools20022.repository.msg.OriginalItem3.OriginalEndToEndIdentification, com.tools20022.repository.msg.OriginalItemAndStatus3.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.ExpectedExecutionDetails3.PaymentReference, com.tools20022.repository.msg.RedemptionExecution10.PaymentReference, com.tools20022.repository.msg.RedemptionOrder9.PaymentReference,
					com.tools20022.repository.msg.SubscriptionExecution7.PaymentReference, com.tools20022.repository.msg.SubscriptionOrder9.PaymentReference,
					com.tools20022.repository.msg.PaymentTransactionInformation13.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation18.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation15.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation22.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation12.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation19.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation14.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation20.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation16.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation23.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation17.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation24.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation21.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentSearch5.MessageIdentification,
					com.tools20022.repository.msg.PaymentSearch5.EndToEndIdentification, com.tools20022.repository.msg.PaymentInstruction14.MessageIdentification, com.tools20022.repository.msg.PaymentInstruction14.EndToEndIdentification,
					com.tools20022.repository.msg.TransactionReferences4.EndToEndIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation4.EndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction50.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction52.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction51.OriginalEndToEndIdentification, com.tools20022.repository.msg.OriginalItem4.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.RequestedModification4.EndToEndIdentification, com.tools20022.repository.msg.RequestedModification4.TransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction58.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction54.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.OriginalItemAndStatus4.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction53.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction57.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction56.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction55.OriginalEndToEndIdentification, com.tools20022.repository.msg.NotificationItem5.EndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction59.OriginalEndToEndIdentification, com.tools20022.repository.msg.CertificateIdentification1.EndToEndIdentification,
					com.tools20022.repository.msg.RequestedModification5.EndToEndIdentification, com.tools20022.repository.msg.RequestedModification5.TransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction65.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation5.EndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction63.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction60.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction68.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction61.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.OriginalItem5.OriginalEndToEndIdentification, com.tools20022.repository.msg.OriginalItemAndStatus5.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction66.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction67.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction62.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction64.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.NotificationItem6.EndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction69.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction73.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction80.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction81.OriginalEndToEndIdentification, com.tools20022.repository.msg.RequestedModification6.EndToEndIdentification,
					com.tools20022.repository.msg.RequestedModification6.TransactionIdentification, com.tools20022.repository.msg.PaymentTransaction76.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction78.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction74.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction83.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction77.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.CorrectivePaymentInitiation2.EndToEndIdentification, com.tools20022.repository.msg.UnderlyingPaymentInstruction3.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction75.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction82.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction79.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation6.EndToEndIdentification);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique and unambiguous identifier for a payment as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification assigned by an instructing party for an instructed
	 * party to unambiguously identify the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#PaymentInstructionReference
	 * PaymentInstructionReference1Details.PaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#PaymentInstructionReference
	 * PaymentInstructionReference2Details.PaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification1#InstructionIdentification
	 * PaymentIdentification1.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#InstructionIdentification
	 * TransactionReferences1.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences2#InstructionIdentification
	 * TransactionReferences2.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#InstructionIdentification
	 * TransactionReferences3.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#OriginalInstructionIdentification
	 * PaymentTransactionInformation3.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#OriginalInstructionIdentification
	 * PaymentTransactionInformation30.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#OriginalInstructionIdentification
	 * PaymentTransaction37.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#OriginalInstructionIdentification
	 * PaymentTransaction47.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#OriginalInstructionIdentification
	 * PaymentTransactionInformation4.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#OriginalInstructionIdentification
	 * PaymentTransactionInformation28.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation2#ReversalPaymentInformationIdentification
	 * OriginalPaymentInformation2.ReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#OriginalInstructionIdentification
	 * PaymentTransaction35.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction2#ReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction2.ReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#OriginalInstructionIdentification
	 * PaymentTransaction42.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction7#ReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction7.ReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#OriginalInstructionIdentification
	 * PaymentTransactionInformation1.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#OriginalInstructionIdentification
	 * PaymentTransactionInformation25.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#OriginalInstructionIdentification
	 * PaymentTransaction32.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#OriginalInstructionIdentification
	 * PaymentTransaction46.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification2#InstructionIdentification
	 * PaymentIdentification2.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#InstructionIdentification
	 * PaymentIdentification3.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#OriginalInstructionIdentification
	 * PaymentTransactionInformation31.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#OriginalInstructionIdentification
	 * PaymentTransaction38.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#OriginalInstructionIdentification
	 * PaymentTransaction48.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#OriginalInstructionIdentification
	 * PaymentTransactionInformation5.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#OriginalInstructionIdentification
	 * PaymentTransactionInformation29.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#OriginalInstructionIdentification
	 * PaymentTransaction36.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#OriginalInstructionIdentification
	 * PaymentTransaction45.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#OriginalInstructionIdentification
	 * PaymentTransactionInformation26.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#OriginalInstructionIdentification
	 * PaymentTransaction33.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#OriginalInstructionIdentification
	 * PaymentTransaction43.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#OriginalInstructionIdentification
	 * PaymentTransactionInformation2.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#OriginalInstructionIdentification
	 * PaymentTransactionInformation27.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#OriginalInstructionIdentification
	 * PaymentTransaction34.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#OriginalInstructionIdentification
	 * PaymentTransaction44.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#OriginalInstructionIdentification
	 * PaymentTransactionInformation34.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#OriginalInstructionIdentification
	 * PaymentTransaction41.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#OriginalInstructionIdentification
	 * PaymentTransaction49.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract#InstructionIdentification
	 * CorrectivePaymentInstructionExtract.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#InstructionIdentification
	 * PaymentIdentification4.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#OriginalInstructionIdentification
	 * UnderlyingPaymentInstruction1.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#OriginalInstructionIdentification
	 * UnderlyingPaymentTransaction1.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#InstructionIdentification
	 * PaymentComplementaryInformation2.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#OriginalInstructionIdentification
	 * PaymentTransactionInformation32.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#OriginalInstructionIdentification
	 * PaymentTransactionInformation33.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1#InstructionIdentification
	 * CorrectivePaymentInitiation1.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#InstructionIdentification
	 * CorrectiveInterbankTransaction1.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#OriginalInstructionIdentification
	 * UnderlyingPaymentInstruction2.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#OriginalInstructionIdentification
	 * UnderlyingPaymentTransaction2.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#InstructionIdentification
	 * PaymentComplementaryInformation3.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#OriginalInstructionIdentification
	 * PaymentTransaction39.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#OriginalInstructionIdentification
	 * PaymentTransaction40.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#OriginalInstructionIdentification
	 * PaymentTransactionInformation13.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#OriginalInstructionIdentification
	 * PaymentTransactionInformation18.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#OriginalInstructionIdentification
	 * PaymentTransactionInformation15.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#OriginalInstructionIdentification
	 * PaymentTransactionInformation22.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#OriginalInstructionIdentification
	 * PaymentTransactionInformation12.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#OriginalInstructionIdentification
	 * PaymentTransactionInformation19.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#OriginalInstructionIdentification
	 * PaymentTransactionInformation14.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#OriginalInstructionIdentification
	 * PaymentTransactionInformation20.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#OriginalInstructionIdentification
	 * PaymentTransactionInformation16.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#OriginalInstructionIdentification
	 * PaymentTransactionInformation23.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#OriginalInstructionIdentification
	 * PaymentTransactionInformation17.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#OriginalInstructionIdentification
	 * PaymentTransactionInformation24.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#OriginalInstructionIdentification
	 * PaymentTransactionInformation21.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#InstructionIdentification
	 * TransactionReferences4.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#InstructionIdentification
	 * PaymentComplementaryInformation4.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#OriginalInstructionIdentification
	 * PaymentTransaction50.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#ReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction11.ReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#OriginalInstructionIdentification
	 * PaymentTransaction52.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#OriginalInstructionIdentification
	 * PaymentTransaction51.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#OriginalInstructionIdentification
	 * PaymentTransaction58.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#OriginalInstructionIdentification
	 * PaymentTransaction54.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#OriginalInstructionIdentification
	 * PaymentTransaction53.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#OriginalInstructionIdentification
	 * PaymentTransaction57.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#OriginalInstructionIdentification
	 * PaymentTransaction56.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#OriginalInstructionIdentification
	 * PaymentTransaction55.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#OriginalInstructionIdentification
	 * PaymentTransaction59.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#InstructionIdentification
	 * CertificateIdentification1.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#ReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction16.ReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#OriginalInstructionIdentification
	 * PaymentTransaction65.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#InstructionIdentification
	 * PaymentComplementaryInformation5.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#OriginalInstructionIdentification
	 * PaymentTransaction63.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#OriginalInstructionIdentification
	 * PaymentTransaction60.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#OriginalInstructionIdentification
	 * PaymentTransaction68.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#OriginalInstructionIdentification
	 * PaymentTransaction61.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#OriginalInstructionIdentification
	 * PaymentTransaction66.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#OriginalInstructionIdentification
	 * PaymentTransaction67.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#OriginalInstructionIdentification
	 * PaymentTransaction62.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#OriginalInstructionIdentification
	 * PaymentTransaction64.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#OriginalInstructionIdentification
	 * PaymentTransaction69.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#OriginalInstructionIdentification
	 * PaymentTransaction73.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#OriginalInstructionIdentification
	 * PaymentTransaction80.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#OriginalInstructionIdentification
	 * PaymentTransaction81.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#ReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction21.ReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#OriginalInstructionIdentification
	 * PaymentTransaction76.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#OriginalInstructionIdentification
	 * PaymentTransaction78.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#OriginalInstructionIdentification
	 * PaymentTransaction74.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#OriginalInstructionIdentification
	 * PaymentTransaction83.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#OriginalInstructionIdentification
	 * PaymentTransaction77.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#InstructionIdentification
	 * CorrectivePaymentInitiation2.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#OriginalInstructionIdentification
	 * UnderlyingPaymentInstruction3.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalInstructionIdentification
	 * PaymentTransaction75.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#OriginalInstructionIdentification
	 * PaymentTransaction82.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalInstructionIdentification
	 * PaymentTransaction79.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#InstructionIdentification
	 * PaymentComplementaryInformation6.InstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by an instructing party for an instructed party to unambiguously identify the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference1Details.PaymentInstructionReference, com.tools20022.repository.msg.PaymentInstructionReference2Details.PaymentInstructionReference,
					com.tools20022.repository.msg.PaymentIdentification1.InstructionIdentification, com.tools20022.repository.msg.TransactionReferences1.InstructionIdentification,
					com.tools20022.repository.msg.TransactionReferences2.InstructionIdentification, com.tools20022.repository.msg.TransactionReferences3.InstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation3.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation30.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction37.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction47.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation4.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation28.OriginalInstructionIdentification,
					com.tools20022.repository.msg.OriginalPaymentInformation2.ReversalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentTransaction35.OriginalInstructionIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction2.ReversalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentTransaction42.OriginalInstructionIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction7.ReversalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentTransactionInformation1.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation25.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction32.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction46.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentIdentification2.InstructionIdentification,
					com.tools20022.repository.msg.PaymentIdentification3.InstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation31.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction38.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction48.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation5.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation29.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction36.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction45.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation26.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction33.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction43.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation2.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation27.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction34.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction44.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation34.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction41.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction49.OriginalInstructionIdentification,
					com.tools20022.repository.msg.CorrectivePaymentInstructionExtract.InstructionIdentification, com.tools20022.repository.msg.PaymentIdentification4.InstructionIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction1.OriginalInstructionIdentification, com.tools20022.repository.msg.UnderlyingPaymentTransaction1.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation2.InstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation32.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation33.OriginalInstructionIdentification, com.tools20022.repository.msg.CorrectivePaymentInitiation1.InstructionIdentification,
					com.tools20022.repository.msg.CorrectiveInterbankTransaction1.InstructionIdentification, com.tools20022.repository.msg.UnderlyingPaymentInstruction2.OriginalInstructionIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentTransaction2.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation3.InstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction39.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction40.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation13.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation18.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation15.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation22.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation12.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation19.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation14.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation20.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation16.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation23.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation17.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation24.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation21.OriginalInstructionIdentification, com.tools20022.repository.msg.TransactionReferences4.InstructionIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation4.InstructionIdentification, com.tools20022.repository.msg.PaymentTransaction50.OriginalInstructionIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction11.ReversalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentTransaction52.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction51.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction58.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction54.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction53.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction57.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction56.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction55.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction59.OriginalInstructionIdentification,
					com.tools20022.repository.msg.CertificateIdentification1.InstructionIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction16.ReversalPaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentTransaction65.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation5.InstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction63.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction60.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction68.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction61.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction66.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction67.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction62.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction64.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction69.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction73.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction80.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction81.OriginalInstructionIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction21.ReversalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentTransaction76.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction78.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction74.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction83.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction77.OriginalInstructionIdentification,
					com.tools20022.repository.msg.CorrectivePaymentInitiation2.InstructionIdentification, com.tools20022.repository.msg.UnderlyingPaymentInstruction3.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction75.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction82.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction79.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation6.InstructionIdentification);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionIdentification";
			definition = "Unique identification assigned by an instructing party for an instructed party to unambiguously identify the instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification assigned by the first instructing agent to
	 * unambiguously identify the transaction and passed on, unchanged,
	 * throughout the entire interbank chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#TransactionIdentification
	 * LongPaymentIdentification1.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice#TransactionIdentification
	 * PaymentIdentification4Choice.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#TransactionReference
	 * PaymentDetails5.TransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#TransactionReference
	 * PaymentDetails7.TransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#TransactionIdentification
	 * PaymentInstruction1.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#TransactionIdentification
	 * TransactionReferences1.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences2#TransactionIdentification
	 * TransactionReferences2.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#TransactionIdentification
	 * TransactionReferences3.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#OriginalTransactionIdentification
	 * PaymentTransactionInformation3.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#OriginalTransactionIdentification
	 * PaymentTransactionInformation1.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification2#TransactionIdentification
	 * PaymentIdentification2.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#TransactionIdentification
	 * PaymentIdentification3.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#OriginalTransactionIdentification
	 * PaymentTransactionInformation31.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#OriginalTransactionIdentification
	 * PaymentTransaction38.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#OriginalTransactionIdentification
	 * PaymentTransaction48.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#OriginalTransactionIdentification
	 * PaymentTransactionInformation5.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#OriginalTransactionIdentification
	 * PaymentTransactionInformation29.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#OriginalTransactionIdentification
	 * PaymentTransaction36.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#OriginalTransactionIdentification
	 * PaymentTransaction45.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#OriginalTransactionIdentification
	 * PaymentTransactionInformation26.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#OriginalTransactionIdentification
	 * PaymentTransaction33.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#OriginalTransactionIdentification
	 * PaymentTransaction43.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#OriginalTransactionIdentification
	 * PaymentTransactionInformation2.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#OriginalTransactionIdentification
	 * PaymentTransactionInformation27.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#OriginalTransactionIdentification
	 * PaymentTransaction34.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#OriginalTransactionIdentification
	 * PaymentTransaction44.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#TransactionIdentification
	 * PaymentIdentification4.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#OriginalTransactionIdentification
	 * UnderlyingPaymentTransaction1.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#TransactionIdentification
	 * PaymentComplementaryInformation2.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#OriginalTransactionIdentification
	 * PaymentTransactionInformation33.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#TransactionIdentification
	 * CorrectiveInterbankTransaction1.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#OriginalTransactionIdentification
	 * UnderlyingPaymentTransaction2.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#TransactionIdentification
	 * PaymentComplementaryInformation3.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#OriginalTransactionIdentification
	 * PaymentTransaction40.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#OriginalTransactionIdentification
	 * PaymentTransactionInformation13.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#OriginalTransactionIdentification
	 * PaymentTransactionInformation18.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#OriginalTransactionIdentification
	 * PaymentTransactionInformation15.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#OriginalTransactionIdentification
	 * PaymentTransactionInformation22.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#OriginalTransactionIdentification
	 * PaymentTransactionInformation12.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#OriginalTransactionIdentification
	 * PaymentTransactionInformation19.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#OriginalTransactionIdentification
	 * PaymentTransactionInformation14.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#OriginalTransactionIdentification
	 * PaymentTransactionInformation20.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#OriginalTransactionIdentification
	 * PaymentTransactionInformation16.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#OriginalTransactionIdentification
	 * PaymentTransactionInformation23.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#OriginalTransactionIdentification
	 * PaymentTransactionInformation17.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#OriginalTransactionIdentification
	 * PaymentTransactionInformation24.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#OriginalTransactionIdentification
	 * PaymentTransactionInformation21.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#TransactionIdentification
	 * PaymentInstruction14.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#TransactionIdentification
	 * TransactionReferences4.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#TransactionIdentification
	 * PaymentComplementaryInformation4.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#OriginalTransactionIdentification
	 * PaymentTransaction50.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#OriginalTransactionIdentification
	 * PaymentTransaction52.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#OriginalTransactionIdentification
	 * PaymentTransaction51.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#OriginalTransactionIdentification
	 * PaymentTransaction53.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#OriginalTransactionIdentification
	 * PaymentTransaction55.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RelatedReference1#TransactionUniqueIdentifier
	 * RelatedReference1.TransactionUniqueIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RelatedReference1#MessageReference
	 * RelatedReference1.MessageReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#OriginalTransactionIdentification
	 * PaymentTransaction65.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#TransactionIdentification
	 * PaymentComplementaryInformation5.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#OriginalTransactionIdentification
	 * PaymentTransaction63.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#OriginalTransactionIdentification
	 * PaymentTransaction60.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#OriginalTransactionIdentification
	 * PaymentTransaction67.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#OriginalTransactionIdentification
	 * PaymentTransaction62.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#OriginalTransactionIdentification
	 * PaymentTransaction73.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#OriginalTransactionIdentification
	 * PaymentTransaction80.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#OriginalTransactionIdentification
	 * PaymentTransaction81.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#OriginalTransactionIdentification
	 * PaymentTransaction76.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalTransactionIdentification
	 * PaymentTransaction75.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalTransactionIdentification
	 * PaymentTransaction79.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#TransactionIdentification
	 * PaymentComplementaryInformation6.TransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the first instructing agent to unambiguously identify the transaction and passed on, unchanged, throughout the entire interbank chain. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LongPaymentIdentification1.TransactionIdentification, com.tools20022.repository.choice.PaymentIdentification4Choice.TransactionIdentification,
					com.tools20022.repository.msg.PaymentDetails5.TransactionReference, com.tools20022.repository.msg.PaymentDetails7.TransactionReference, com.tools20022.repository.msg.PaymentInstruction1.TransactionIdentification,
					com.tools20022.repository.msg.TransactionReferences1.TransactionIdentification, com.tools20022.repository.msg.TransactionReferences2.TransactionIdentification,
					com.tools20022.repository.msg.TransactionReferences3.TransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation3.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation1.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentIdentification2.TransactionIdentification,
					com.tools20022.repository.msg.PaymentIdentification3.TransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation31.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction38.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction48.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation5.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation29.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction36.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction45.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation26.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction33.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction43.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation2.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation27.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction34.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction44.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentIdentification4.TransactionIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentTransaction1.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation2.TransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation33.OriginalTransactionIdentification, com.tools20022.repository.msg.CorrectiveInterbankTransaction1.TransactionIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentTransaction2.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation3.TransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction40.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation13.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation18.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation15.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation22.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation12.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation19.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation14.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation20.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation16.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation23.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation17.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation24.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation21.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentInstruction14.TransactionIdentification, com.tools20022.repository.msg.TransactionReferences4.TransactionIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation4.TransactionIdentification, com.tools20022.repository.msg.PaymentTransaction50.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction52.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction51.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction53.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction55.OriginalTransactionIdentification,
					com.tools20022.repository.msg.RelatedReference1.TransactionUniqueIdentifier, com.tools20022.repository.msg.RelatedReference1.MessageReference,
					com.tools20022.repository.msg.PaymentTransaction65.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation5.TransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction63.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction60.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction67.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction62.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction73.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction80.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction81.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction76.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction75.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction79.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.TransactionIdentification);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the first instructing agent to unambiguously identify the transaction and passed on, unchanged, throughout the entire interbank chain. ";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for a payment instruction, as assigned
	 * by the clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#ClearingSystemReference
	 * TransactionReferences1.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences2#ClearingSystemReference
	 * TransactionReferences2.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#ClearingSystemReference
	 * TransactionReferences3.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#ClearingSystemReference
	 * PaymentTransactionInformation25.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#ClearingSystemReference
	 * PaymentTransaction32.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#ClearingSystemReference
	 * PaymentTransaction46.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#ClearingSystemReference
	 * PaymentIdentification3.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#OriginalClearingSystemReference
	 * PaymentTransactionInformation31.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#OriginalClearingSystemReference
	 * PaymentTransaction38.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#OriginalClearingSystemReference
	 * PaymentTransaction48.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#OriginalClearingSystemReference
	 * PaymentTransactionInformation29.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#OriginalClearingSystemReference
	 * PaymentTransaction36.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#OriginalClearingSystemReference
	 * PaymentTransaction45.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#ClearingSystemReference
	 * PaymentTransactionInformation26.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#ClearingSystemReference
	 * PaymentTransaction33.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#ClearingSystemReference
	 * PaymentTransaction43.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#OriginalClearingSystemReference
	 * PaymentTransactionInformation27.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#OriginalClearingSystemReference
	 * PaymentTransaction34.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#OriginalClearingSystemReference
	 * PaymentTransaction44.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#ClearingSystemReference
	 * PaymentTransactionInformation34.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#ClearingSystemReference
	 * PaymentTransaction41.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#ClearingSystemReference
	 * PaymentTransaction49.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#ClearingSystemReference
	 * PaymentIdentification4.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#OriginalClearingSystemReference
	 * PaymentTransactionInformation33.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#OriginalClearingSystemReference
	 * PaymentTransaction40.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#OriginalClearingSystemReference
	 * PaymentTransaction50.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#ClearingSystemReference
	 * PaymentTransaction52.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#OriginalClearingSystemReference
	 * PaymentTransaction51.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#OriginalClearingSystemReference
	 * PaymentTransaction53.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#ClearingSystemReference
	 * PaymentTransaction57.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#OriginalClearingSystemReference
	 * PaymentTransaction55.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#ClearingSystemReference
	 * PaymentTransaction59.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#OriginalClearingSystemReference
	 * PaymentTransaction65.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#ClearingSystemReference
	 * PaymentTransaction63.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#OriginalClearingSystemReference
	 * PaymentTransaction60.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#ClearingSystemReference
	 * PaymentTransaction68.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#OriginalClearingSystemReference
	 * PaymentTransaction67.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#OriginalClearingSystemReference
	 * PaymentTransaction62.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#ClearingSystemReference
	 * PaymentTransaction69.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#ClearingSystemReference
	 * PaymentTransaction73.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#ClearingSystemReference
	 * PaymentTransaction80.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#OriginalClearingSystemReference
	 * PaymentTransaction81.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#OriginalClearingSystemReference
	 * PaymentTransaction76.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#ClearingSystemReference
	 * PaymentTransaction83.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalClearingSystemReference
	 * PaymentTransaction75.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#ClearingSystemReference
	 * PaymentTransaction82.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalClearingSystemReference
	 * PaymentTransaction79.OriginalClearingSystemReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClearingSystemReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReferences1.ClearingSystemReference, com.tools20022.repository.msg.TransactionReferences2.ClearingSystemReference,
					com.tools20022.repository.msg.TransactionReferences3.ClearingSystemReference, com.tools20022.repository.msg.PaymentTransactionInformation25.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction32.ClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction46.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentIdentification3.ClearingSystemReference, com.tools20022.repository.msg.PaymentTransactionInformation31.OriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction38.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction48.OriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransactionInformation29.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction36.OriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction45.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransactionInformation26.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction33.ClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction43.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransactionInformation27.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction34.OriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction44.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransactionInformation34.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction41.ClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction49.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentIdentification4.ClearingSystemReference, com.tools20022.repository.msg.PaymentTransactionInformation33.OriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction40.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction50.OriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction52.ClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction51.OriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction53.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction57.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction55.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction59.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction65.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction63.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction60.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction68.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction67.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction62.OriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction69.ClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction73.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction80.ClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction81.OriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction76.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction83.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction75.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction82.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction79.OriginalClearingSystemReference);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique and unambiguous reference assigned by the creditor to refer to the
	 * payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation1#CreditorReference
	 * CreditorReferenceInformation1.CreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#CreditorReferenceInformation
	 * StructuredRemittanceInformation6.CreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation2#Reference
	 * CreditorReferenceInformation2.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7#CreditorReferenceInformation
	 * StructuredRemittanceInformation7.CreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#CreditorReferenceInformation
	 * StructuredRemittanceInformation9.CreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8#CreditorReferenceInformation
	 * StructuredRemittanceInformation8.CreditorReferenceInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer3#Reference
	 * CreditTransfer3.Reference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer4#Reference
	 * CreditTransfer4.Reference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer6#Reference
	 * CreditTransfer6.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#CreditorReference
	 * StructuredRemittanceInformation2.CreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#CreditorReference
	 * TradeSettlement1.CreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#CreditorReferenceInformation
	 * StructuredRemittanceInformation10.CreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#CreditorReferenceInformation
	 * StructuredRemittanceInformation12.CreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#CreditorReferenceInformation
	 * StructuredRemittanceInformation13.CreditorReferenceInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer8#Reference
	 * CreditTransfer8.Reference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous reference assigned by the creditor to refer to the payment obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditorReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditorReferenceInformation1.CreditorReference, com.tools20022.repository.msg.StructuredRemittanceInformation6.CreditorReferenceInformation,
					com.tools20022.repository.msg.CreditorReferenceInformation2.Reference, com.tools20022.repository.msg.StructuredRemittanceInformation7.CreditorReferenceInformation,
					com.tools20022.repository.msg.StructuredRemittanceInformation9.CreditorReferenceInformation, com.tools20022.repository.msg.StructuredRemittanceInformation8.CreditorReferenceInformation,
					com.tools20022.repository.msg.CreditTransfer3.Reference, com.tools20022.repository.msg.CreditTransfer4.Reference, com.tools20022.repository.msg.CreditTransfer6.Reference,
					com.tools20022.repository.msg.StructuredRemittanceInformation2.CreditorReference, com.tools20022.repository.msg.TradeSettlement1.CreditorReference,
					com.tools20022.repository.msg.StructuredRemittanceInformation10.CreditorReferenceInformation, com.tools20022.repository.msg.StructuredRemittanceInformation12.CreditorReferenceInformation,
					com.tools20022.repository.msg.StructuredRemittanceInformation13.CreditorReferenceInformation, com.tools20022.repository.msg.CreditTransfer8.Reference);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditorReference";
			definition = "Unique and unambiguous reference assigned by the creditor to refer to the payment obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Payment for which identifications are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PaymentRelatedIdentifications
	 * Payment.PaymentRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which identifications are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which identifications are provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.PaymentRelatedIdentifications;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentIdentification";
				definition = "Specifies the different identifications associated with a payment transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.PaymentRelatedIdentifications);
				superType_lazy = () -> TradeIdentification.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentIdentification.ExecutionIdentification, com.tools20022.repository.entity.PaymentIdentification.EndToEndIdentification,
						com.tools20022.repository.entity.PaymentIdentification.InstructionIdentification, com.tools20022.repository.entity.PaymentIdentification.TransactionIdentification,
						com.tools20022.repository.entity.PaymentIdentification.ClearingSystemReference, com.tools20022.repository.entity.PaymentIdentification.CreditorReference,
						com.tools20022.repository.entity.PaymentIdentification.Payment);
				derivationComponent_lazy = () -> Arrays.asList(PaymentIdentificationChoice.mmObject(), PaymentIdentification2Choice.mmObject(), PaymentIdentification3Choice.mmObject(), PaymentIdentification4Choice.mmObject(),
						PaymentIdentification1.mmObject(), CreditorReferenceInformation1.mmObject(), CreditorReferenceInformation2.mmObject(), PaymentIdentification2.mmObject(), PaymentIdentification3.mmObject(),
						PaymentIdentification4.mmObject(), TransactionReferences4.mmObject(), CertificateIdentification1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}