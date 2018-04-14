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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.TradeIdentification
 * TradeIdentification}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
 * PaymentIdentification.mmExecutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
 * PaymentIdentification.mmEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmInstructionIdentification
 * PaymentIdentification.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmTransactionIdentification
 * PaymentIdentification.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmClearingSystemReference
 * PaymentIdentification.mmClearingSystemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmCreditorReference
 * PaymentIdentification.mmCreditorReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmPayment
 * PaymentIdentification.mmPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
 * Payment.mmPaymentRelatedIdentifications}</li>
 * </ul>
 * </li>
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
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification5Choice
 * PaymentIdentification5Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a payment transaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class PaymentIdentification extends TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text executionIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice#mmPaymentInstructionReference
	 * PaymentIdentificationChoice.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmPaymentInstructionReference
	 * PaymentInstructionReferenceDetails3.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails2#mmPaymentInstructionReference
	 * PaymentInstructionReferenceDetails2.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice#mmPaymentInstructionReference
	 * PaymentIdentification2Choice.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#mmPaymentInstructionReference
	 * PaymentInstructionReferenceDetails4.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification3Choice#mmPaymentInstructionReference
	 * PaymentIdentification3Choice.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShortPaymentIdentification1#mmTransactionIdentification
	 * ShortPaymentIdentification1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#mmInstructionReference
	 * PaymentSearch2.mmInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#mmPaymentInstructionReference
	 * PaymentSearch2.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmInstructionReference
	 * PaymentSearch3.mmInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmPaymentInstructionReference
	 * PaymentSearch3.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmPaymentIdentification
	 * PaymentSearch4.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmTransactionIdentification
	 * PaymentSearch4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmPaymentInstructionReference
	 * PaymentDetails5.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmPaymentInstructionReference
	 * PaymentDetails6.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmPaymentInstructionReference
	 * PaymentDetails7.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader23#mmMessageIdentification
	 * GroupHeader23.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader42#mmMessageIdentification
	 * GroupHeader42.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader58#mmMessageIdentification
	 * GroupHeader58.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader1#mmMessageIdentification
	 * GroupHeader1.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader32#mmMessageIdentification
	 * GroupHeader32.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#mmMessageIdentification
	 * GroupHeader48.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader39#mmMessageIdentification
	 * GroupHeader39.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#mmMessageIdentification
	 * GroupHeader55.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader7#mmMessageIdentification
	 * GroupHeader7.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation4#mmOriginalMessageIdentification
	 * OriginalGroupInformation4.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation3.mmOriginalPaymentInformationIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation23#mmOriginalMessageIdentification
	 * OriginalGroupInformation23.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3#mmOriginalMessageIdentification
	 * OriginalGroupInformation3.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader4#mmOriginalMessageIdentification
	 * OriginalGroupHeader4.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction4#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction4.mmPaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction8#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction8.mmPaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader8#mmMessageIdentification
	 * GroupHeader8.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation5#mmOriginalMessageIdentification
	 * OriginalGroupInformation5.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation4.mmOriginalPaymentInformationIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader40#mmMessageIdentification
	 * GroupHeader40.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation22#mmOriginalMessageIdentification
	 * OriginalGroupInformation22.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#mmMessageIdentification
	 * GroupHeader56.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#mmOriginalMessageIdentification
	 * OriginalGroupHeader3.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader5#mmMessageIdentification
	 * GroupHeader5.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation1#mmOriginalMessageIdentification
	 * OriginalGroupInformation1.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation1.mmOriginalPaymentInformationIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader36#mmMessageIdentification
	 * GroupHeader36.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation20#mmOriginalMessageIdentification
	 * OriginalGroupInformation20.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#mmMessageIdentification
	 * GroupHeader52.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#mmOriginalMessageIdentification
	 * OriginalGroupHeader1.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#mmMessageIdentification
	 * GroupHeader2.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#mmMessageIdentification
	 * GroupHeader33.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#mmMessageIdentification
	 * GroupHeader49.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#mmMessageIdentification
	 * GroupHeader3.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#mmMessageIdentification
	 * GroupHeader34.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmMessageIdentification
	 * GroupHeader50.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9#mmMessageIdentification
	 * GroupHeader9.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation5.mmOriginalPaymentInformationIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader41#mmMessageIdentification
	 * GroupHeader41.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader57#mmMessageIdentification
	 * GroupHeader57.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader37#mmMessageIdentification
	 * GroupHeader37.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader53#mmMessageIdentification
	 * GroupHeader53.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#mmMessageIdentification
	 * GroupHeader4.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#mmMessageIdentification
	 * GroupHeader35.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#mmMessageIdentification
	 * GroupHeader51.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader31#mmMessageIdentification
	 * GroupHeader31.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#mmMessageIdentification
	 * GroupHeader47.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6#mmMessageIdentification
	 * GroupHeader6.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation2#mmOriginalMessageIdentification
	 * OriginalGroupInformation2.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader38#mmMessageIdentification
	 * GroupHeader38.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation21#mmOriginalMessageIdentification
	 * OriginalGroupInformation21.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader54#mmMessageIdentification
	 * GroupHeader54.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2#mmOriginalMessageIdentification
	 * OriginalGroupHeader2.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#mmMessageIdentification
	 * GroupHeader46.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#mmOriginalMessageIdentification
	 * OriginalGroupInformation25.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader45#mmMessageIdentification
	 * GroupHeader45.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract#mmAssignerInstructionIdentification
	 * PaymentInstructionExtract.mmAssignerInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract#mmAssigneeInstructionIdentification
	 * PaymentInstructionExtract.mmAssigneeInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmOriginalInstructionIdentification
	 * PaymentInstructionExtract2.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader43#mmMessageIdentification
	 * GroupHeader43.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader59#mmMessageIdentification
	 * GroupHeader59.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader44#mmMessageIdentification
	 * GroupHeader44.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#mmOriginalPaymentInformationIdentification
	 * UnderlyingPaymentInstruction1.mmOriginalPaymentInformationIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmInstructionIdentification
	 * RequestedModification2.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation24#mmOriginalGroupCancellationIdentification
	 * OriginalGroupInformation24.mmOriginalGroupCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation24#mmOriginalMessageIdentification
	 * OriginalGroupInformation24.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmOriginalPaymentInformationIdentification
	 * UnderlyingPaymentInstruction2.mmOriginalPaymentInformationIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#mmOriginalGroupCancellationIdentification
	 * OriginalGroupHeader5.mmOriginalGroupCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#mmOriginalMessageIdentification
	 * OriginalGroupHeader5.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction3#mmOriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction3.
	 * mmOriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmInstructionIdentification
	 * RequestedModification3.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem3#mmOriginalItemIdentification
	 * OriginalItem3.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader60#mmMessageIdentification
	 * GroupHeader60.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader63#mmMessageIdentification
	 * GroupHeader63.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#mmOriginalMessageIdentification
	 * OriginalGroupInformation13.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation17#mmOriginalMessageIdentification
	 * OriginalGroupInformation17.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmOriginalMessageIdentification
	 * OriginalGroupInformation15.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation19#mmOriginalMessageIdentification
	 * OriginalGroupInformation19.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation11#mmOriginalMessageIdentification
	 * OriginalGroupInformation11.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation18#mmOriginalMessageIdentification
	 * OriginalGroupInformation18.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation8#mmOriginalMessageIdentification
	 * OriginalGroupInformation8.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation15.
	 * mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation22.
	 * mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation17.
	 * mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation24.
	 * mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#mmMessageIdentification
	 * GroupHeader19.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#mmMessageIdentification
	 * GroupHeader24.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#mmMessageIdentification
	 * GroupHeader20.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#mmMessageIdentification
	 * GroupHeader25.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#mmMessageIdentification
	 * GroupHeader15.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#mmMessageIdentification
	 * GroupHeader26.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17#mmMessageIdentification
	 * GroupHeader17.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27#mmMessageIdentification
	 * GroupHeader27.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader22#mmMessageIdentification
	 * GroupHeader22.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmMessageIdentification
	 * GroupHeader28.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#mmMessageIdentification
	 * GroupHeader16.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#mmMessageIdentification
	 * GroupHeader29.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18#mmMessageIdentification
	 * GroupHeader18.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30#mmMessageIdentification
	 * GroupHeader30.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation16#mmOriginalMessageIdentification
	 * OriginalGroupInformation16.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation14#mmOriginalMessageIdentification
	 * OriginalGroupInformation14.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation7#mmOriginalMessageIdentification
	 * OriginalGroupInformation7.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader12#mmMessageIdentification
	 * GroupHeader12.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader21#mmMessageIdentification
	 * GroupHeader21.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmPaymentIdentification
	 * PaymentSearch5.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmTransactionIdentification
	 * PaymentSearch5.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader62#mmMessageIdentification
	 * GroupHeader62.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader67#mmMessageIdentification
	 * GroupHeader67.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem4#mmOriginalItemIdentification
	 * OriginalItem4.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmInstructionIdentification
	 * RequestedModification4.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction13.mmPaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10#mmOriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction10.
	 * mmOriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmMessageIdentification
	 * GroupHeader70.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmInstructionIdentification
	 * RequestedModification5.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmMessageIdentification
	 * GroupHeader72.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmMessageIdentification
	 * GroupHeader71.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction15.mmPaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem5#mmOriginalItemIdentification
	 * OriginalItem5.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmOriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction17.
	 * mmOriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#mmOriginalMessageIdentification
	 * OriginalMessage2.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#mmOriginalMessageIdentification
	 * OriginalMessage3.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmPaymentIdentification
	 * PaymentSearch6.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmTransactionIdentification
	 * PaymentSearch6.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation27#mmOriginalMessageIdentification
	 * OriginalGroupInformation27.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmOriginalMessageIdentification
	 * OriginalGroupHeader7.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmInstructionIdentification
	 * RequestedModification6.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmOriginalMessageIdentification
	 * OriginalGroupInformation28.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmOriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction22.
	 * mmOriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction20.mmPaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalPaymentInformationIdentification
	 * UnderlyingPaymentInstruction3.mmOriginalPaymentInformationIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmOriginalMessageIdentification
	 * OriginalGroupHeader6.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmInstructionIdentification
	 * RequestedModification7.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmOriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction26.
	 * mmOriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction4#mmOriginalPaymentInformationIdentification
	 * UnderlyingPaymentInstruction4.mmOriginalPaymentInformationIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch7#mmPaymentIdentification
	 * PaymentSearch7.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch7#mmTransactionIdentification
	 * PaymentSearch7.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader9#mmOriginalGroupCancellationIdentification
	 * OriginalGroupHeader9.mmOriginalGroupCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader9#mmOriginalMessageIdentification
	 * OriginalGroupHeader9.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction29#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction29.mmPaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader13#mmOriginalMessageIdentification
	 * OriginalGroupHeader13.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader74#mmMessageIdentification
	 * GroupHeader74.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader73#mmMessageIdentification
	 * GroupHeader73.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader12#mmOriginalMessageIdentification
	 * OriginalGroupHeader12.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader11#mmOriginalMessageIdentification
	 * OriginalGroupHeader11.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader75#mmMessageIdentification
	 * GroupHeader75.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader76#mmMessageIdentification
	 * GroupHeader76.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader10#mmOriginalMessageIdentification
	 * OriginalGroupHeader10.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation29#mmOriginalMessageIdentification
	 * OriginalGroupInformation29.mmOriginalMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentIdentification, Max35Text> mmExecutionIdentification = new MMBusinessAttribute<PaymentIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentIdentificationChoice.mmPaymentInstructionReference, PaymentInstructionReferenceDetails3.mmPaymentInstructionReference,
					PaymentInstructionReferenceDetails2.mmPaymentInstructionReference, PaymentIdentification2Choice.mmPaymentInstructionReference, PaymentInstructionReferenceDetails4.mmPaymentInstructionReference,
					PaymentIdentification3Choice.mmPaymentInstructionReference, ShortPaymentIdentification1.mmTransactionIdentification, PaymentSearch2.mmInstructionReference, PaymentSearch2.mmPaymentInstructionReference,
					PaymentSearch3.mmInstructionReference, PaymentSearch3.mmPaymentInstructionReference, PaymentSearch4.mmPaymentIdentification, PaymentSearch4.mmTransactionIdentification, PaymentDetails5.mmPaymentInstructionReference,
					PaymentDetails6.mmPaymentInstructionReference, PaymentDetails7.mmPaymentInstructionReference, GroupHeader23.mmMessageIdentification, GroupHeader42.mmMessageIdentification, GroupHeader58.mmMessageIdentification,
					GroupHeader1.mmMessageIdentification, GroupHeader32.mmMessageIdentification, GroupHeader48.mmMessageIdentification, GroupHeader39.mmMessageIdentification, GroupHeader55.mmMessageIdentification,
					GroupHeader7.mmMessageIdentification, OriginalGroupInformation4.mmOriginalMessageIdentification, PaymentTransactionInformation3.mmOriginalPaymentInformationIdentification,
					OriginalGroupInformation23.mmOriginalMessageIdentification, OriginalGroupInformation3.mmOriginalMessageIdentification, OriginalGroupHeader4.mmOriginalMessageIdentification,
					OriginalPaymentInstruction4.mmPaymentCancellationIdentification, OriginalPaymentInstruction8.mmPaymentCancellationIdentification, GroupHeader8.mmMessageIdentification,
					OriginalGroupInformation5.mmOriginalMessageIdentification, PaymentTransactionInformation4.mmOriginalPaymentInformationIdentification, GroupHeader40.mmMessageIdentification,
					OriginalGroupInformation22.mmOriginalMessageIdentification, GroupHeader56.mmMessageIdentification, OriginalGroupHeader3.mmOriginalMessageIdentification, GroupHeader5.mmMessageIdentification,
					OriginalGroupInformation1.mmOriginalMessageIdentification, PaymentTransactionInformation1.mmOriginalPaymentInformationIdentification, GroupHeader36.mmMessageIdentification,
					OriginalGroupInformation20.mmOriginalMessageIdentification, GroupHeader52.mmMessageIdentification, OriginalGroupHeader1.mmOriginalMessageIdentification, GroupHeader2.mmMessageIdentification,
					GroupHeader33.mmMessageIdentification, GroupHeader49.mmMessageIdentification, GroupHeader3.mmMessageIdentification, GroupHeader34.mmMessageIdentification, GroupHeader50.mmMessageIdentification,
					GroupHeader9.mmMessageIdentification, PaymentTransactionInformation5.mmOriginalPaymentInformationIdentification, GroupHeader41.mmMessageIdentification, GroupHeader57.mmMessageIdentification,
					GroupHeader37.mmMessageIdentification, GroupHeader53.mmMessageIdentification, GroupHeader4.mmMessageIdentification, GroupHeader35.mmMessageIdentification, GroupHeader51.mmMessageIdentification,
					GroupHeader31.mmMessageIdentification, GroupHeader47.mmMessageIdentification, GroupHeader6.mmMessageIdentification, OriginalGroupInformation2.mmOriginalMessageIdentification, GroupHeader38.mmMessageIdentification,
					OriginalGroupInformation21.mmOriginalMessageIdentification, GroupHeader54.mmMessageIdentification, OriginalGroupHeader2.mmOriginalMessageIdentification, GroupHeader46.mmMessageIdentification,
					OriginalGroupInformation25.mmOriginalMessageIdentification, GroupHeader45.mmMessageIdentification, PaymentInstructionExtract.mmAssignerInstructionIdentification,
					PaymentInstructionExtract.mmAssigneeInstructionIdentification, PaymentInstructionExtract2.mmOriginalInstructionIdentification, GroupHeader43.mmMessageIdentification, GroupHeader59.mmMessageIdentification,
					GroupHeader44.mmMessageIdentification, UnderlyingPaymentInstruction1.mmOriginalPaymentInformationIdentification, RequestedModification2.mmInstructionIdentification,
					OriginalGroupInformation24.mmOriginalGroupCancellationIdentification, OriginalGroupInformation24.mmOriginalMessageIdentification, UnderlyingPaymentInstruction2.mmOriginalPaymentInformationIdentification,
					OriginalGroupHeader5.mmOriginalGroupCancellationIdentification, OriginalGroupHeader5.mmOriginalMessageIdentification, OriginalPaymentInstruction3.mmOriginalPaymentInformationCancellationIdentification,
					RequestedModification3.mmInstructionIdentification, OriginalItem3.mmOriginalItemIdentification, GroupHeader60.mmMessageIdentification, GroupHeader63.mmMessageIdentification,
					OriginalGroupInformation13.mmOriginalMessageIdentification, OriginalGroupInformation17.mmOriginalMessageIdentification, OriginalGroupInformation15.mmOriginalMessageIdentification,
					OriginalGroupInformation19.mmOriginalMessageIdentification, OriginalGroupInformation11.mmOriginalMessageIdentification, OriginalGroupInformation18.mmOriginalMessageIdentification,
					OriginalGroupInformation8.mmOriginalMessageIdentification, PaymentTransactionInformation15.mmOriginalPaymentInformationIdentification, PaymentTransactionInformation22.mmOriginalPaymentInformationIdentification,
					PaymentTransactionInformation17.mmOriginalPaymentInformationIdentification, PaymentTransactionInformation24.mmOriginalPaymentInformationIdentification, GroupHeader19.mmMessageIdentification,
					GroupHeader24.mmMessageIdentification, GroupHeader20.mmMessageIdentification, GroupHeader25.mmMessageIdentification, GroupHeader15.mmMessageIdentification, GroupHeader26.mmMessageIdentification,
					GroupHeader17.mmMessageIdentification, GroupHeader27.mmMessageIdentification, GroupHeader22.mmMessageIdentification, GroupHeader28.mmMessageIdentification, GroupHeader16.mmMessageIdentification,
					GroupHeader29.mmMessageIdentification, GroupHeader18.mmMessageIdentification, GroupHeader30.mmMessageIdentification, OriginalGroupInformation16.mmOriginalMessageIdentification,
					OriginalGroupInformation14.mmOriginalMessageIdentification, OriginalGroupInformation7.mmOriginalMessageIdentification, GroupHeader12.mmMessageIdentification, GroupHeader21.mmMessageIdentification,
					PaymentSearch5.mmPaymentIdentification, PaymentSearch5.mmTransactionIdentification, GroupHeader62.mmMessageIdentification, GroupHeader67.mmMessageIdentification, OriginalItem4.mmOriginalItemIdentification,
					RequestedModification4.mmInstructionIdentification, OriginalPaymentInstruction13.mmPaymentCancellationIdentification, OriginalPaymentInstruction10.mmOriginalPaymentInformationCancellationIdentification,
					GroupHeader70.mmMessageIdentification, RequestedModification5.mmInstructionIdentification, GroupHeader72.mmMessageIdentification, GroupHeader71.mmMessageIdentification,
					OriginalPaymentInstruction15.mmPaymentCancellationIdentification, OriginalItem5.mmOriginalItemIdentification, OriginalPaymentInstruction17.mmOriginalPaymentInformationCancellationIdentification,
					OriginalMessage2.mmOriginalMessageIdentification, OriginalMessage3.mmOriginalMessageIdentification, PaymentSearch6.mmPaymentIdentification, PaymentSearch6.mmTransactionIdentification,
					OriginalGroupInformation27.mmOriginalMessageIdentification, OriginalGroupHeader7.mmOriginalMessageIdentification, RequestedModification6.mmInstructionIdentification,
					OriginalGroupInformation28.mmOriginalMessageIdentification, OriginalPaymentInstruction22.mmOriginalPaymentInformationCancellationIdentification, OriginalPaymentInstruction20.mmPaymentCancellationIdentification,
					UnderlyingPaymentInstruction3.mmOriginalPaymentInformationIdentification, OriginalGroupHeader6.mmOriginalMessageIdentification, RequestedModification7.mmInstructionIdentification,
					OriginalPaymentInstruction26.mmOriginalPaymentInformationCancellationIdentification, UnderlyingPaymentInstruction4.mmOriginalPaymentInformationIdentification, PaymentSearch7.mmPaymentIdentification,
					PaymentSearch7.mmTransactionIdentification, OriginalGroupHeader9.mmOriginalGroupCancellationIdentification, OriginalGroupHeader9.mmOriginalMessageIdentification,
					OriginalPaymentInstruction29.mmPaymentCancellationIdentification, OriginalGroupHeader13.mmOriginalMessageIdentification, GroupHeader74.mmMessageIdentification, GroupHeader73.mmMessageIdentification,
					OriginalGroupHeader12.mmOriginalMessageIdentification, OriginalGroupHeader11.mmOriginalMessageIdentification, GroupHeader75.mmMessageIdentification, GroupHeader76.mmMessageIdentification,
					OriginalGroupHeader10.mmOriginalMessageIdentification, OriginalGroupInformation29.mmOriginalMessageIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutionIdentification";
			definition = "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentIdentification obj) {
			return obj.getExecutionIdentification();
		}

		@Override
		public void setValue(PaymentIdentification obj, Max35Text value) {
			obj.setExecutionIdentification(value);
		}
	};
	protected Max35Text endToEndIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#mmEndToEndIdentification
	 * LongPaymentIdentification1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#mmTransactionReference
	 * PaymentSearch2.mmTransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmTransactionReference
	 * PaymentSearch3.mmTransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmMessageIdentification
	 * PaymentSearch4.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmEndToEndIdentification
	 * PaymentSearch4.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification1#mmEndToEndIdentification
	 * PaymentIdentification1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmTransactionReference
	 * PaymentDetails6.mmTransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmMessageIdentification
	 * PaymentInstruction1.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmEndToEndIdentification
	 * PaymentInstruction1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#mmEndToEndIdentification
	 * TransactionReferences1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences2#mmEndToEndIdentification
	 * TransactionReferences2.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmEndToEndIdentification
	 * TransactionReferences3.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation3.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation30.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#mmOriginalEndToEndIdentification
	 * PaymentTransaction37.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#mmOriginalEndToEndIdentification
	 * PaymentTransaction47.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation4.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation28.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#mmOriginalEndToEndIdentification
	 * PaymentTransaction35.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#mmOriginalEndToEndIdentification
	 * PaymentTransaction42.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation1.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation25.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#mmOriginalEndToEndIdentification
	 * PaymentTransaction32.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#mmOriginalEndToEndIdentification
	 * PaymentTransaction46.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification2#mmEndToEndIdentification
	 * PaymentIdentification2.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#mmEndToEndIdentification
	 * PaymentIdentification3.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation31.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmOriginalEndToEndIdentification
	 * PaymentTransaction38.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmOriginalEndToEndIdentification
	 * PaymentTransaction48.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation5.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation29.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmOriginalEndToEndIdentification
	 * PaymentTransaction36.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalEndToEndIdentification
	 * PaymentTransaction45.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation26.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmOriginalEndToEndIdentification
	 * PaymentTransaction33.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmOriginalEndToEndIdentification
	 * PaymentTransaction43.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation2.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation27.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmOriginalEndToEndIdentification
	 * PaymentTransaction34.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmOriginalEndToEndIdentification
	 * PaymentTransaction44.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation34.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#mmOriginalEndToEndIdentification
	 * PaymentTransaction41.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#mmOriginalEndToEndIdentification
	 * PaymentTransaction49.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#mmEndToEndIdentification
	 * PaymentIdentification4.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry2#mmEndToEndIdentification
	 * NotificationEntry2.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#mmEndToEndIdentification
	 * NotificationItem3.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem1#mmOriginalEndToEndIdentification
	 * OriginalItem1.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus1#mmOriginalEndToEndIdentification
	 * OriginalItemAndStatus1.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus2#mmOriginalEndToEndIdentification
	 * OriginalItemAndStatus2.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentInstruction1.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentTransaction1.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmEndToEndIdentification
	 * RequestedModification2.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmTransactionIdentification
	 * RequestedModification2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmEndToEndIdentification
	 * PaymentComplementaryInformation2.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation32.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation33.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1#mmEndToEndIdentification
	 * CorrectivePaymentInitiation1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmEndToEndIdentification
	 * CorrectiveInterbankTransaction1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPaymentReference
	 * TradeSettlement1.mmPaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification3#mmTransactionIdentification
	 * ReportSpecification3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentInstruction2.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentTransaction2.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmEndToEndIdentification
	 * PaymentComplementaryInformation3.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#mmOriginalEndToEndIdentification
	 * PaymentTransaction39.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmOriginalEndToEndIdentification
	 * PaymentTransaction40.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmEndToEndIdentification
	 * RequestedModification3.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmTransactionIdentification
	 * RequestedModification3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#mmEndToEndIdentification
	 * NotificationItem4.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem3#mmOriginalEndToEndIdentification
	 * OriginalItem3.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#mmOriginalEndToEndIdentification
	 * OriginalItemAndStatus3.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmPaymentReference
	 * ExpectedExecutionDetails3.mmPaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmPaymentReference
	 * RedemptionExecution10.mmPaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmPaymentReference
	 * RedemptionOrder9.mmPaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmPaymentReference
	 * SubscriptionExecution7.mmPaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmPaymentReference
	 * SubscriptionOrder9.mmPaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation13.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation18.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation15.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation22.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation12.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation19.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation14.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation20.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation16.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation23.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation17.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation24.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation21.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmMessageIdentification
	 * PaymentSearch5.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmEndToEndIdentification
	 * PaymentSearch5.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmMessageIdentification
	 * PaymentInstruction14.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmEndToEndIdentification
	 * PaymentInstruction14.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmEndToEndIdentification
	 * TransactionReferences4.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmEndToEndIdentification
	 * PaymentComplementaryInformation4.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmOriginalEndToEndIdentification
	 * PaymentTransaction50.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmOriginalEndToEndIdentification
	 * PaymentTransaction52.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalEndToEndIdentification
	 * PaymentTransaction51.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem4#mmOriginalEndToEndIdentification
	 * OriginalItem4.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmEndToEndIdentification
	 * RequestedModification4.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmTransactionIdentification
	 * RequestedModification4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#mmOriginalEndToEndIdentification
	 * PaymentTransaction58.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#mmOriginalEndToEndIdentification
	 * PaymentTransaction54.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#mmOriginalEndToEndIdentification
	 * OriginalItemAndStatus4.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmOriginalEndToEndIdentification
	 * PaymentTransaction53.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#mmOriginalEndToEndIdentification
	 * PaymentTransaction57.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#mmOriginalEndToEndIdentification
	 * PaymentTransaction56.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmOriginalEndToEndIdentification
	 * PaymentTransaction55.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#mmEndToEndIdentification
	 * NotificationItem5.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#mmOriginalEndToEndIdentification
	 * PaymentTransaction59.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#mmEndToEndIdentification
	 * CertificateIdentification1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmEndToEndIdentification
	 * RequestedModification5.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmTransactionIdentification
	 * RequestedModification5.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmOriginalEndToEndIdentification
	 * PaymentTransaction65.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmEndToEndIdentification
	 * PaymentComplementaryInformation5.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmOriginalEndToEndIdentification
	 * PaymentTransaction63.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalEndToEndIdentification
	 * PaymentTransaction60.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#mmOriginalEndToEndIdentification
	 * PaymentTransaction68.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#mmOriginalEndToEndIdentification
	 * PaymentTransaction61.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem5#mmOriginalEndToEndIdentification
	 * OriginalItem5.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmOriginalEndToEndIdentification
	 * OriginalItemAndStatus5.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmOriginalEndToEndIdentification
	 * PaymentTransaction66.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmOriginalEndToEndIdentification
	 * PaymentTransaction67.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmOriginalEndToEndIdentification
	 * PaymentTransaction62.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#mmOriginalEndToEndIdentification
	 * PaymentTransaction64.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmEndToEndIdentification
	 * NotificationItem6.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#mmOriginalEndToEndIdentification
	 * PaymentTransaction69.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmMessageIdentification
	 * PaymentSearch6.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmEndToEndIdentification
	 * PaymentSearch6.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmOriginalEndToEndIdentification
	 * PaymentTransaction73.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmOriginalEndToEndIdentification
	 * PaymentTransaction80.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalEndToEndIdentification
	 * PaymentTransaction81.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmEndToEndIdentification
	 * RequestedModification6.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmTransactionIdentification
	 * RequestedModification6.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalEndToEndIdentification
	 * PaymentTransaction76.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalEndToEndIdentification
	 * PaymentTransaction78.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#mmOriginalEndToEndIdentification
	 * PaymentTransaction74.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmOriginalEndToEndIdentification
	 * PaymentTransaction83.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#mmOriginalEndToEndIdentification
	 * PaymentTransaction77.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#mmEndToEndIdentification
	 * CorrectivePaymentInitiation2.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentInstruction3.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalEndToEndIdentification
	 * PaymentTransaction75.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmOriginalEndToEndIdentification
	 * PaymentTransaction82.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalEndToEndIdentification
	 * PaymentTransaction79.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmEndToEndIdentification
	 * PaymentComplementaryInformation6.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmEndToEndIdentification
	 * PaymentComplementaryInformation7.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmOriginalEndToEndIdentification
	 * PaymentTransaction87.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmOriginalEndToEndIdentification
	 * PaymentTransaction88.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmEndToEndIdentification
	 * RequestedModification7.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmTransactionIdentification
	 * RequestedModification7.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90#mmOriginalEndToEndIdentification
	 * PaymentTransaction90.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmOriginalEndToEndIdentification
	 * PaymentTransaction91.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmOriginalEndToEndIdentification
	 * PaymentTransaction85.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction89#mmOriginalEndToEndIdentification
	 * PaymentTransaction89.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction84#mmOriginalEndToEndIdentification
	 * PaymentTransaction84.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction4#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentInstruction4.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction3#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentTransaction3.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation3#mmEndToEndIdentification
	 * CorrectivePaymentInitiation3.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch7#mmMessageIdentification
	 * PaymentSearch7.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch7#mmEndToEndIdentification
	 * PaymentSearch7.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmMessageIdentification
	 * PaymentInstruction26.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmEndToEndIdentification
	 * PaymentInstruction26.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction94#mmOriginalEndToEndIdentification
	 * PaymentTransaction94.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction92#mmOriginalEndToEndIdentification
	 * PaymentTransaction92.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction95#mmOriginalEndToEndIdentification
	 * PaymentTransaction95.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction93#mmOriginalEndToEndIdentification
	 * PaymentTransaction93.mmOriginalEndToEndIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentIdentification, Max35Text> mmEndToEndIdentification = new MMBusinessAttribute<PaymentIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(LongPaymentIdentification1.mmEndToEndIdentification, PaymentSearch2.mmTransactionReference, PaymentSearch3.mmTransactionReference, PaymentSearch4.mmMessageIdentification,
					PaymentSearch4.mmEndToEndIdentification, PaymentIdentification1.mmEndToEndIdentification, PaymentDetails6.mmTransactionReference, PaymentInstruction1.mmMessageIdentification,
					PaymentInstruction1.mmEndToEndIdentification, TransactionReferences1.mmEndToEndIdentification, TransactionReferences2.mmEndToEndIdentification, TransactionReferences3.mmEndToEndIdentification,
					PaymentTransactionInformation3.mmOriginalEndToEndIdentification, PaymentTransactionInformation30.mmOriginalEndToEndIdentification, PaymentTransaction37.mmOriginalEndToEndIdentification,
					PaymentTransaction47.mmOriginalEndToEndIdentification, PaymentTransactionInformation4.mmOriginalEndToEndIdentification, PaymentTransactionInformation28.mmOriginalEndToEndIdentification,
					PaymentTransaction35.mmOriginalEndToEndIdentification, PaymentTransaction42.mmOriginalEndToEndIdentification, PaymentTransactionInformation1.mmOriginalEndToEndIdentification,
					PaymentTransactionInformation25.mmOriginalEndToEndIdentification, PaymentTransaction32.mmOriginalEndToEndIdentification, PaymentTransaction46.mmOriginalEndToEndIdentification,
					PaymentIdentification2.mmEndToEndIdentification, PaymentIdentification3.mmEndToEndIdentification, PaymentTransactionInformation31.mmOriginalEndToEndIdentification, PaymentTransaction38.mmOriginalEndToEndIdentification,
					PaymentTransaction48.mmOriginalEndToEndIdentification, PaymentTransactionInformation5.mmOriginalEndToEndIdentification, PaymentTransactionInformation29.mmOriginalEndToEndIdentification,
					PaymentTransaction36.mmOriginalEndToEndIdentification, PaymentTransaction45.mmOriginalEndToEndIdentification, PaymentTransactionInformation26.mmOriginalEndToEndIdentification,
					PaymentTransaction33.mmOriginalEndToEndIdentification, PaymentTransaction43.mmOriginalEndToEndIdentification, PaymentTransactionInformation2.mmOriginalEndToEndIdentification,
					PaymentTransactionInformation27.mmOriginalEndToEndIdentification, PaymentTransaction34.mmOriginalEndToEndIdentification, PaymentTransaction44.mmOriginalEndToEndIdentification,
					PaymentTransactionInformation34.mmOriginalEndToEndIdentification, PaymentTransaction41.mmOriginalEndToEndIdentification, PaymentTransaction49.mmOriginalEndToEndIdentification,
					PaymentIdentification4.mmEndToEndIdentification, NotificationEntry2.mmEndToEndIdentification, NotificationItem3.mmEndToEndIdentification, OriginalItem1.mmOriginalEndToEndIdentification,
					OriginalItemAndStatus1.mmOriginalEndToEndIdentification, OriginalItemAndStatus2.mmOriginalEndToEndIdentification, UnderlyingPaymentInstruction1.mmOriginalEndToEndIdentification,
					UnderlyingPaymentTransaction1.mmOriginalEndToEndIdentification, RequestedModification2.mmEndToEndIdentification, RequestedModification2.mmTransactionIdentification,
					PaymentComplementaryInformation2.mmEndToEndIdentification, PaymentTransactionInformation32.mmOriginalEndToEndIdentification, PaymentTransactionInformation33.mmOriginalEndToEndIdentification,
					CorrectivePaymentInitiation1.mmEndToEndIdentification, CorrectiveInterbankTransaction1.mmEndToEndIdentification, TradeSettlement1.mmPaymentReference, ReportSpecification3.mmTransactionIdentification,
					UnderlyingPaymentInstruction2.mmOriginalEndToEndIdentification, UnderlyingPaymentTransaction2.mmOriginalEndToEndIdentification, PaymentComplementaryInformation3.mmEndToEndIdentification,
					PaymentTransaction39.mmOriginalEndToEndIdentification, PaymentTransaction40.mmOriginalEndToEndIdentification, RequestedModification3.mmEndToEndIdentification, RequestedModification3.mmTransactionIdentification,
					NotificationItem4.mmEndToEndIdentification, OriginalItem3.mmOriginalEndToEndIdentification, OriginalItemAndStatus3.mmOriginalEndToEndIdentification, ExpectedExecutionDetails3.mmPaymentReference,
					RedemptionExecution10.mmPaymentReference, RedemptionOrder9.mmPaymentReference, SubscriptionExecution7.mmPaymentReference, SubscriptionOrder9.mmPaymentReference,
					PaymentTransactionInformation13.mmOriginalEndToEndIdentification, PaymentTransactionInformation18.mmOriginalEndToEndIdentification, PaymentTransactionInformation15.mmOriginalEndToEndIdentification,
					PaymentTransactionInformation22.mmOriginalEndToEndIdentification, PaymentTransactionInformation12.mmOriginalEndToEndIdentification, PaymentTransactionInformation19.mmOriginalEndToEndIdentification,
					PaymentTransactionInformation14.mmOriginalEndToEndIdentification, PaymentTransactionInformation20.mmOriginalEndToEndIdentification, PaymentTransactionInformation16.mmOriginalEndToEndIdentification,
					PaymentTransactionInformation23.mmOriginalEndToEndIdentification, PaymentTransactionInformation17.mmOriginalEndToEndIdentification, PaymentTransactionInformation24.mmOriginalEndToEndIdentification,
					PaymentTransactionInformation21.mmOriginalEndToEndIdentification, PaymentSearch5.mmMessageIdentification, PaymentSearch5.mmEndToEndIdentification, PaymentInstruction14.mmMessageIdentification,
					PaymentInstruction14.mmEndToEndIdentification, TransactionReferences4.mmEndToEndIdentification, PaymentComplementaryInformation4.mmEndToEndIdentification, PaymentTransaction50.mmOriginalEndToEndIdentification,
					PaymentTransaction52.mmOriginalEndToEndIdentification, PaymentTransaction51.mmOriginalEndToEndIdentification, OriginalItem4.mmOriginalEndToEndIdentification, RequestedModification4.mmEndToEndIdentification,
					RequestedModification4.mmTransactionIdentification, PaymentTransaction58.mmOriginalEndToEndIdentification, PaymentTransaction54.mmOriginalEndToEndIdentification, OriginalItemAndStatus4.mmOriginalEndToEndIdentification,
					PaymentTransaction53.mmOriginalEndToEndIdentification, PaymentTransaction57.mmOriginalEndToEndIdentification, PaymentTransaction56.mmOriginalEndToEndIdentification, PaymentTransaction55.mmOriginalEndToEndIdentification,
					NotificationItem5.mmEndToEndIdentification, PaymentTransaction59.mmOriginalEndToEndIdentification, CertificateIdentification1.mmEndToEndIdentification, RequestedModification5.mmEndToEndIdentification,
					RequestedModification5.mmTransactionIdentification, PaymentTransaction65.mmOriginalEndToEndIdentification, PaymentComplementaryInformation5.mmEndToEndIdentification,
					PaymentTransaction63.mmOriginalEndToEndIdentification, PaymentTransaction60.mmOriginalEndToEndIdentification, PaymentTransaction68.mmOriginalEndToEndIdentification, PaymentTransaction61.mmOriginalEndToEndIdentification,
					OriginalItem5.mmOriginalEndToEndIdentification, OriginalItemAndStatus5.mmOriginalEndToEndIdentification, PaymentTransaction66.mmOriginalEndToEndIdentification, PaymentTransaction67.mmOriginalEndToEndIdentification,
					PaymentTransaction62.mmOriginalEndToEndIdentification, PaymentTransaction64.mmOriginalEndToEndIdentification, NotificationItem6.mmEndToEndIdentification, PaymentTransaction69.mmOriginalEndToEndIdentification,
					PaymentSearch6.mmMessageIdentification, PaymentSearch6.mmEndToEndIdentification, PaymentTransaction73.mmOriginalEndToEndIdentification, PaymentTransaction80.mmOriginalEndToEndIdentification,
					PaymentTransaction81.mmOriginalEndToEndIdentification, RequestedModification6.mmEndToEndIdentification, RequestedModification6.mmTransactionIdentification, PaymentTransaction76.mmOriginalEndToEndIdentification,
					PaymentTransaction78.mmOriginalEndToEndIdentification, PaymentTransaction74.mmOriginalEndToEndIdentification, PaymentTransaction83.mmOriginalEndToEndIdentification, PaymentTransaction77.mmOriginalEndToEndIdentification,
					CorrectivePaymentInitiation2.mmEndToEndIdentification, UnderlyingPaymentInstruction3.mmOriginalEndToEndIdentification, PaymentTransaction75.mmOriginalEndToEndIdentification,
					PaymentTransaction82.mmOriginalEndToEndIdentification, PaymentTransaction79.mmOriginalEndToEndIdentification, PaymentComplementaryInformation6.mmEndToEndIdentification,
					PaymentComplementaryInformation7.mmEndToEndIdentification, PaymentTransaction87.mmOriginalEndToEndIdentification, PaymentTransaction88.mmOriginalEndToEndIdentification, RequestedModification7.mmEndToEndIdentification,
					RequestedModification7.mmTransactionIdentification, PaymentTransaction90.mmOriginalEndToEndIdentification, PaymentTransaction91.mmOriginalEndToEndIdentification, PaymentTransaction85.mmOriginalEndToEndIdentification,
					PaymentTransaction89.mmOriginalEndToEndIdentification, PaymentTransaction84.mmOriginalEndToEndIdentification, UnderlyingPaymentInstruction4.mmOriginalEndToEndIdentification,
					UnderlyingPaymentTransaction3.mmOriginalEndToEndIdentification, CorrectivePaymentInitiation3.mmEndToEndIdentification, PaymentSearch7.mmMessageIdentification, PaymentSearch7.mmEndToEndIdentification,
					PaymentInstruction26.mmMessageIdentification, PaymentInstruction26.mmEndToEndIdentification, PaymentTransaction94.mmOriginalEndToEndIdentification, PaymentTransaction92.mmOriginalEndToEndIdentification,
					PaymentTransaction95.mmOriginalEndToEndIdentification, PaymentTransaction93.mmOriginalEndToEndIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique and unambiguous identifier for a payment as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentIdentification obj) {
			return obj.getEndToEndIdentification();
		}

		@Override
		public void setValue(PaymentIdentification obj, Max35Text value) {
			obj.setEndToEndIdentification(value);
		}
	};
	protected Max35Text instructionIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmPaymentInstructionReference
	 * PaymentInstructionReference1Details.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmPaymentInstructionReference
	 * PaymentInstructionReference2Details.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification1#mmInstructionIdentification
	 * PaymentIdentification1.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#mmInstructionIdentification
	 * TransactionReferences1.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences2#mmInstructionIdentification
	 * TransactionReferences2.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmInstructionIdentification
	 * TransactionReferences3.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation3.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation30.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#mmOriginalInstructionIdentification
	 * PaymentTransaction37.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#mmOriginalInstructionIdentification
	 * PaymentTransaction47.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation4.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation28.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation2#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInformation2.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#mmOriginalInstructionIdentification
	 * PaymentTransaction35.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction2#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction2.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#mmOriginalInstructionIdentification
	 * PaymentTransaction42.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction7#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction7.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation1.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation25.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#mmOriginalInstructionIdentification
	 * PaymentTransaction32.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#mmOriginalInstructionIdentification
	 * PaymentTransaction46.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification2#mmInstructionIdentification
	 * PaymentIdentification2.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#mmInstructionIdentification
	 * PaymentIdentification3.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation31.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmOriginalInstructionIdentification
	 * PaymentTransaction38.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmOriginalInstructionIdentification
	 * PaymentTransaction48.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation5.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation29.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmOriginalInstructionIdentification
	 * PaymentTransaction36.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalInstructionIdentification
	 * PaymentTransaction45.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation26.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmOriginalInstructionIdentification
	 * PaymentTransaction33.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmOriginalInstructionIdentification
	 * PaymentTransaction43.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation2.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation27.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmOriginalInstructionIdentification
	 * PaymentTransaction34.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmOriginalInstructionIdentification
	 * PaymentTransaction44.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation34.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#mmOriginalInstructionIdentification
	 * PaymentTransaction41.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#mmOriginalInstructionIdentification
	 * PaymentTransaction49.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract#mmInstructionIdentification
	 * CorrectivePaymentInstructionExtract.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#mmInstructionIdentification
	 * PaymentIdentification4.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#mmOriginalInstructionIdentification
	 * UnderlyingPaymentInstruction1.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#mmOriginalInstructionIdentification
	 * UnderlyingPaymentTransaction1.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmInstructionIdentification
	 * PaymentComplementaryInformation2.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation32.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation33.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1#mmInstructionIdentification
	 * CorrectivePaymentInitiation1.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmInstructionIdentification
	 * CorrectiveInterbankTransaction1.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmOriginalInstructionIdentification
	 * UnderlyingPaymentInstruction2.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalInstructionIdentification
	 * UnderlyingPaymentTransaction2.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmInstructionIdentification
	 * PaymentComplementaryInformation3.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#mmOriginalInstructionIdentification
	 * PaymentTransaction39.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmOriginalInstructionIdentification
	 * PaymentTransaction40.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation13.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation18.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation15.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation22.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation12.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation19.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation14.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation20.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation16.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation23.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation17.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation24.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation21.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmInstructionIdentification
	 * TransactionReferences4.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmInstructionIdentification
	 * PaymentComplementaryInformation4.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmOriginalInstructionIdentification
	 * PaymentTransaction50.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction11.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmOriginalInstructionIdentification
	 * PaymentTransaction52.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalInstructionIdentification
	 * PaymentTransaction51.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#mmOriginalInstructionIdentification
	 * PaymentTransaction58.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#mmOriginalInstructionIdentification
	 * PaymentTransaction54.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmOriginalInstructionIdentification
	 * PaymentTransaction53.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#mmOriginalInstructionIdentification
	 * PaymentTransaction57.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#mmOriginalInstructionIdentification
	 * PaymentTransaction56.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmOriginalInstructionIdentification
	 * PaymentTransaction55.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#mmOriginalInstructionIdentification
	 * PaymentTransaction59.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#mmInstructionIdentification
	 * CertificateIdentification1.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction16.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmOriginalInstructionIdentification
	 * PaymentTransaction65.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmInstructionIdentification
	 * PaymentComplementaryInformation5.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmOriginalInstructionIdentification
	 * PaymentTransaction63.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalInstructionIdentification
	 * PaymentTransaction60.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#mmOriginalInstructionIdentification
	 * PaymentTransaction68.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#mmOriginalInstructionIdentification
	 * PaymentTransaction61.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmOriginalInstructionIdentification
	 * PaymentTransaction66.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmOriginalInstructionIdentification
	 * PaymentTransaction67.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmOriginalInstructionIdentification
	 * PaymentTransaction62.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#mmOriginalInstructionIdentification
	 * PaymentTransaction64.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#mmOriginalInstructionIdentification
	 * PaymentTransaction69.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmOriginalInstructionIdentification
	 * PaymentTransaction73.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmOriginalInstructionIdentification
	 * PaymentTransaction80.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalInstructionIdentification
	 * PaymentTransaction81.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction21.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalInstructionIdentification
	 * PaymentTransaction76.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalInstructionIdentification
	 * PaymentTransaction78.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#mmOriginalInstructionIdentification
	 * PaymentTransaction74.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmOriginalInstructionIdentification
	 * PaymentTransaction83.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#mmOriginalInstructionIdentification
	 * PaymentTransaction77.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#mmInstructionIdentification
	 * CorrectivePaymentInitiation2.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalInstructionIdentification
	 * UnderlyingPaymentInstruction3.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalInstructionIdentification
	 * PaymentTransaction75.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmOriginalInstructionIdentification
	 * PaymentTransaction82.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalInstructionIdentification
	 * PaymentTransaction79.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmInstructionIdentification
	 * PaymentComplementaryInformation6.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmInstructionIdentification
	 * PaymentComplementaryInformation7.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmOriginalInstructionIdentification
	 * PaymentTransaction87.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmOriginalInstructionIdentification
	 * PaymentTransaction88.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90#mmOriginalInstructionIdentification
	 * PaymentTransaction90.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmOriginalInstructionIdentification
	 * PaymentTransaction91.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmOriginalInstructionIdentification
	 * PaymentTransaction85.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction89#mmOriginalInstructionIdentification
	 * PaymentTransaction89.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction84#mmOriginalInstructionIdentification
	 * PaymentTransaction84.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction4#mmOriginalInstructionIdentification
	 * UnderlyingPaymentInstruction4.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction3#mmOriginalInstructionIdentification
	 * UnderlyingPaymentTransaction3.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation3#mmInstructionIdentification
	 * CorrectivePaymentInitiation3.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction28#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction28.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction94#mmOriginalInstructionIdentification
	 * PaymentTransaction94.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction92#mmOriginalInstructionIdentification
	 * PaymentTransaction92.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction95#mmOriginalInstructionIdentification
	 * PaymentTransaction95.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction93#mmOriginalInstructionIdentification
	 * PaymentTransaction93.mmOriginalInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by an instructing party for an instructed party to unambiguously identify the instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentIdentification, Max35Text> mmInstructionIdentification = new MMBusinessAttribute<PaymentIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstructionReference1Details.mmPaymentInstructionReference, PaymentInstructionReference2Details.mmPaymentInstructionReference, PaymentIdentification1.mmInstructionIdentification,
					TransactionReferences1.mmInstructionIdentification, TransactionReferences2.mmInstructionIdentification, TransactionReferences3.mmInstructionIdentification,
					PaymentTransactionInformation3.mmOriginalInstructionIdentification, PaymentTransactionInformation30.mmOriginalInstructionIdentification, PaymentTransaction37.mmOriginalInstructionIdentification,
					PaymentTransaction47.mmOriginalInstructionIdentification, PaymentTransactionInformation4.mmOriginalInstructionIdentification, PaymentTransactionInformation28.mmOriginalInstructionIdentification,
					OriginalPaymentInformation2.mmReversalPaymentInformationIdentification, PaymentTransaction35.mmOriginalInstructionIdentification, OriginalPaymentInstruction2.mmReversalPaymentInformationIdentification,
					PaymentTransaction42.mmOriginalInstructionIdentification, OriginalPaymentInstruction7.mmReversalPaymentInformationIdentification, PaymentTransactionInformation1.mmOriginalInstructionIdentification,
					PaymentTransactionInformation25.mmOriginalInstructionIdentification, PaymentTransaction32.mmOriginalInstructionIdentification, PaymentTransaction46.mmOriginalInstructionIdentification,
					PaymentIdentification2.mmInstructionIdentification, PaymentIdentification3.mmInstructionIdentification, PaymentTransactionInformation31.mmOriginalInstructionIdentification,
					PaymentTransaction38.mmOriginalInstructionIdentification, PaymentTransaction48.mmOriginalInstructionIdentification, PaymentTransactionInformation5.mmOriginalInstructionIdentification,
					PaymentTransactionInformation29.mmOriginalInstructionIdentification, PaymentTransaction36.mmOriginalInstructionIdentification, PaymentTransaction45.mmOriginalInstructionIdentification,
					PaymentTransactionInformation26.mmOriginalInstructionIdentification, PaymentTransaction33.mmOriginalInstructionIdentification, PaymentTransaction43.mmOriginalInstructionIdentification,
					PaymentTransactionInformation2.mmOriginalInstructionIdentification, PaymentTransactionInformation27.mmOriginalInstructionIdentification, PaymentTransaction34.mmOriginalInstructionIdentification,
					PaymentTransaction44.mmOriginalInstructionIdentification, PaymentTransactionInformation34.mmOriginalInstructionIdentification, PaymentTransaction41.mmOriginalInstructionIdentification,
					PaymentTransaction49.mmOriginalInstructionIdentification, CorrectivePaymentInstructionExtract.mmInstructionIdentification, PaymentIdentification4.mmInstructionIdentification,
					UnderlyingPaymentInstruction1.mmOriginalInstructionIdentification, UnderlyingPaymentTransaction1.mmOriginalInstructionIdentification, PaymentComplementaryInformation2.mmInstructionIdentification,
					PaymentTransactionInformation32.mmOriginalInstructionIdentification, PaymentTransactionInformation33.mmOriginalInstructionIdentification, CorrectivePaymentInitiation1.mmInstructionIdentification,
					CorrectiveInterbankTransaction1.mmInstructionIdentification, UnderlyingPaymentInstruction2.mmOriginalInstructionIdentification, UnderlyingPaymentTransaction2.mmOriginalInstructionIdentification,
					PaymentComplementaryInformation3.mmInstructionIdentification, PaymentTransaction39.mmOriginalInstructionIdentification, PaymentTransaction40.mmOriginalInstructionIdentification,
					PaymentTransactionInformation13.mmOriginalInstructionIdentification, PaymentTransactionInformation18.mmOriginalInstructionIdentification, PaymentTransactionInformation15.mmOriginalInstructionIdentification,
					PaymentTransactionInformation22.mmOriginalInstructionIdentification, PaymentTransactionInformation12.mmOriginalInstructionIdentification, PaymentTransactionInformation19.mmOriginalInstructionIdentification,
					PaymentTransactionInformation14.mmOriginalInstructionIdentification, PaymentTransactionInformation20.mmOriginalInstructionIdentification, PaymentTransactionInformation16.mmOriginalInstructionIdentification,
					PaymentTransactionInformation23.mmOriginalInstructionIdentification, PaymentTransactionInformation17.mmOriginalInstructionIdentification, PaymentTransactionInformation24.mmOriginalInstructionIdentification,
					PaymentTransactionInformation21.mmOriginalInstructionIdentification, TransactionReferences4.mmInstructionIdentification, PaymentComplementaryInformation4.mmInstructionIdentification,
					PaymentTransaction50.mmOriginalInstructionIdentification, OriginalPaymentInstruction11.mmReversalPaymentInformationIdentification, PaymentTransaction52.mmOriginalInstructionIdentification,
					PaymentTransaction51.mmOriginalInstructionIdentification, PaymentTransaction58.mmOriginalInstructionIdentification, PaymentTransaction54.mmOriginalInstructionIdentification,
					PaymentTransaction53.mmOriginalInstructionIdentification, PaymentTransaction57.mmOriginalInstructionIdentification, PaymentTransaction56.mmOriginalInstructionIdentification,
					PaymentTransaction55.mmOriginalInstructionIdentification, PaymentTransaction59.mmOriginalInstructionIdentification, CertificateIdentification1.mmInstructionIdentification,
					OriginalPaymentInstruction16.mmReversalPaymentInformationIdentification, PaymentTransaction65.mmOriginalInstructionIdentification, PaymentComplementaryInformation5.mmInstructionIdentification,
					PaymentTransaction63.mmOriginalInstructionIdentification, PaymentTransaction60.mmOriginalInstructionIdentification, PaymentTransaction68.mmOriginalInstructionIdentification,
					PaymentTransaction61.mmOriginalInstructionIdentification, PaymentTransaction66.mmOriginalInstructionIdentification, PaymentTransaction67.mmOriginalInstructionIdentification,
					PaymentTransaction62.mmOriginalInstructionIdentification, PaymentTransaction64.mmOriginalInstructionIdentification, PaymentTransaction69.mmOriginalInstructionIdentification,
					PaymentTransaction73.mmOriginalInstructionIdentification, PaymentTransaction80.mmOriginalInstructionIdentification, PaymentTransaction81.mmOriginalInstructionIdentification,
					OriginalPaymentInstruction21.mmReversalPaymentInformationIdentification, PaymentTransaction76.mmOriginalInstructionIdentification, PaymentTransaction78.mmOriginalInstructionIdentification,
					PaymentTransaction74.mmOriginalInstructionIdentification, PaymentTransaction83.mmOriginalInstructionIdentification, PaymentTransaction77.mmOriginalInstructionIdentification,
					CorrectivePaymentInitiation2.mmInstructionIdentification, UnderlyingPaymentInstruction3.mmOriginalInstructionIdentification, PaymentTransaction75.mmOriginalInstructionIdentification,
					PaymentTransaction82.mmOriginalInstructionIdentification, PaymentTransaction79.mmOriginalInstructionIdentification, PaymentComplementaryInformation6.mmInstructionIdentification,
					PaymentComplementaryInformation7.mmInstructionIdentification, PaymentTransaction87.mmOriginalInstructionIdentification, PaymentTransaction88.mmOriginalInstructionIdentification,
					PaymentTransaction90.mmOriginalInstructionIdentification, PaymentTransaction91.mmOriginalInstructionIdentification, PaymentTransaction85.mmOriginalInstructionIdentification,
					PaymentTransaction89.mmOriginalInstructionIdentification, PaymentTransaction84.mmOriginalInstructionIdentification, UnderlyingPaymentInstruction4.mmOriginalInstructionIdentification,
					UnderlyingPaymentTransaction3.mmOriginalInstructionIdentification, CorrectivePaymentInitiation3.mmInstructionIdentification, OriginalPaymentInstruction28.mmReversalPaymentInformationIdentification,
					PaymentTransaction94.mmOriginalInstructionIdentification, PaymentTransaction92.mmOriginalInstructionIdentification, PaymentTransaction95.mmOriginalInstructionIdentification,
					PaymentTransaction93.mmOriginalInstructionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionIdentification";
			definition = "Unique identification assigned by an instructing party for an instructed party to unambiguously identify the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentIdentification obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(PaymentIdentification obj, Max35Text value) {
			obj.setInstructionIdentification(value);
		}
	};
	protected Max35Text transactionIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#mmTransactionIdentification
	 * LongPaymentIdentification1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice#mmTransactionIdentification
	 * PaymentIdentification4Choice.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmTransactionReference
	 * PaymentDetails5.mmTransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmTransactionReference
	 * PaymentDetails7.mmTransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmTransactionIdentification
	 * PaymentInstruction1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#mmTransactionIdentification
	 * TransactionReferences1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences2#mmTransactionIdentification
	 * TransactionReferences2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmTransactionIdentification
	 * TransactionReferences3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation3.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation1.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification2#mmTransactionIdentification
	 * PaymentIdentification2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#mmTransactionIdentification
	 * PaymentIdentification3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation31.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmOriginalTransactionIdentification
	 * PaymentTransaction38.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmOriginalTransactionIdentification
	 * PaymentTransaction48.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation5.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation29.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmOriginalTransactionIdentification
	 * PaymentTransaction36.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalTransactionIdentification
	 * PaymentTransaction45.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation26.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmOriginalTransactionIdentification
	 * PaymentTransaction33.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmOriginalTransactionIdentification
	 * PaymentTransaction43.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation2.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation27.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmOriginalTransactionIdentification
	 * PaymentTransaction34.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmOriginalTransactionIdentification
	 * PaymentTransaction44.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#mmTransactionIdentification
	 * PaymentIdentification4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#mmOriginalTransactionIdentification
	 * UnderlyingPaymentTransaction1.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmTransactionIdentification
	 * PaymentComplementaryInformation2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation33.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmTransactionIdentification
	 * CorrectiveInterbankTransaction1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalTransactionIdentification
	 * UnderlyingPaymentTransaction2.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmTransactionIdentification
	 * PaymentComplementaryInformation3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmOriginalTransactionIdentification
	 * PaymentTransaction40.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation13.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation18.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation15.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation22.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation12.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation19.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation14.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation20.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation16.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation23.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation17.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation24.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation21.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmTransactionIdentification
	 * PaymentInstruction14.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmTransactionIdentification
	 * TransactionReferences4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmTransactionIdentification
	 * PaymentComplementaryInformation4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmOriginalTransactionIdentification
	 * PaymentTransaction50.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmOriginalTransactionIdentification
	 * PaymentTransaction52.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalTransactionIdentification
	 * PaymentTransaction51.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmOriginalTransactionIdentification
	 * PaymentTransaction53.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmOriginalTransactionIdentification
	 * PaymentTransaction55.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RelatedReference1#mmTransactionUniqueIdentifier
	 * RelatedReference1.mmTransactionUniqueIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RelatedReference1#mmMessageReference
	 * RelatedReference1.mmMessageReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmOriginalTransactionIdentification
	 * PaymentTransaction65.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmTransactionIdentification
	 * PaymentComplementaryInformation5.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmOriginalTransactionIdentification
	 * PaymentTransaction63.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalTransactionIdentification
	 * PaymentTransaction60.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmOriginalTransactionIdentification
	 * PaymentTransaction67.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmOriginalTransactionIdentification
	 * PaymentTransaction62.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmOriginalTransactionIdentification
	 * PaymentTransaction73.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmOriginalTransactionIdentification
	 * PaymentTransaction80.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalTransactionIdentification
	 * PaymentTransaction81.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalTransactionIdentification
	 * PaymentTransaction76.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalTransactionIdentification
	 * PaymentTransaction75.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalTransactionIdentification
	 * PaymentTransaction79.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmTransactionIdentification
	 * PaymentComplementaryInformation6.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmTransactionIdentification
	 * PaymentComplementaryInformation7.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmOriginalTransactionIdentification
	 * PaymentTransaction87.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmOriginalTransactionIdentification
	 * PaymentTransaction88.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification5Choice#mmTransactionIdentification
	 * PaymentIdentification5Choice.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90#mmOriginalTransactionIdentification
	 * PaymentTransaction90.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmOriginalTransactionIdentification
	 * PaymentTransaction91.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmOriginalTransactionIdentification
	 * PaymentTransaction85.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction89#mmOriginalTransactionIdentification
	 * PaymentTransaction89.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction3#mmOriginalTransactionIdentification
	 * UnderlyingPaymentTransaction3.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmTransactionIdentification
	 * PaymentInstruction26.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction94#mmOriginalTransactionIdentification
	 * PaymentTransaction94.mmOriginalTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the first instructing agent to unambiguously identify the transaction and passed on, unchanged, throughout the entire interbank chain. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentIdentification, Max35Text> mmTransactionIdentification = new MMBusinessAttribute<PaymentIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(LongPaymentIdentification1.mmTransactionIdentification, PaymentIdentification4Choice.mmTransactionIdentification, PaymentDetails5.mmTransactionReference,
					PaymentDetails7.mmTransactionReference, PaymentInstruction1.mmTransactionIdentification, TransactionReferences1.mmTransactionIdentification, TransactionReferences2.mmTransactionIdentification,
					TransactionReferences3.mmTransactionIdentification, PaymentTransactionInformation3.mmOriginalTransactionIdentification, PaymentTransactionInformation1.mmOriginalTransactionIdentification,
					PaymentIdentification2.mmTransactionIdentification, PaymentIdentification3.mmTransactionIdentification, PaymentTransactionInformation31.mmOriginalTransactionIdentification,
					PaymentTransaction38.mmOriginalTransactionIdentification, PaymentTransaction48.mmOriginalTransactionIdentification, PaymentTransactionInformation5.mmOriginalTransactionIdentification,
					PaymentTransactionInformation29.mmOriginalTransactionIdentification, PaymentTransaction36.mmOriginalTransactionIdentification, PaymentTransaction45.mmOriginalTransactionIdentification,
					PaymentTransactionInformation26.mmOriginalTransactionIdentification, PaymentTransaction33.mmOriginalTransactionIdentification, PaymentTransaction43.mmOriginalTransactionIdentification,
					PaymentTransactionInformation2.mmOriginalTransactionIdentification, PaymentTransactionInformation27.mmOriginalTransactionIdentification, PaymentTransaction34.mmOriginalTransactionIdentification,
					PaymentTransaction44.mmOriginalTransactionIdentification, PaymentIdentification4.mmTransactionIdentification, UnderlyingPaymentTransaction1.mmOriginalTransactionIdentification,
					PaymentComplementaryInformation2.mmTransactionIdentification, PaymentTransactionInformation33.mmOriginalTransactionIdentification, CorrectiveInterbankTransaction1.mmTransactionIdentification,
					UnderlyingPaymentTransaction2.mmOriginalTransactionIdentification, PaymentComplementaryInformation3.mmTransactionIdentification, PaymentTransaction40.mmOriginalTransactionIdentification,
					PaymentTransactionInformation13.mmOriginalTransactionIdentification, PaymentTransactionInformation18.mmOriginalTransactionIdentification, PaymentTransactionInformation15.mmOriginalTransactionIdentification,
					PaymentTransactionInformation22.mmOriginalTransactionIdentification, PaymentTransactionInformation12.mmOriginalTransactionIdentification, PaymentTransactionInformation19.mmOriginalTransactionIdentification,
					PaymentTransactionInformation14.mmOriginalTransactionIdentification, PaymentTransactionInformation20.mmOriginalTransactionIdentification, PaymentTransactionInformation16.mmOriginalTransactionIdentification,
					PaymentTransactionInformation23.mmOriginalTransactionIdentification, PaymentTransactionInformation17.mmOriginalTransactionIdentification, PaymentTransactionInformation24.mmOriginalTransactionIdentification,
					PaymentTransactionInformation21.mmOriginalTransactionIdentification, PaymentInstruction14.mmTransactionIdentification, TransactionReferences4.mmTransactionIdentification,
					PaymentComplementaryInformation4.mmTransactionIdentification, PaymentTransaction50.mmOriginalTransactionIdentification, PaymentTransaction52.mmOriginalTransactionIdentification,
					PaymentTransaction51.mmOriginalTransactionIdentification, PaymentTransaction53.mmOriginalTransactionIdentification, PaymentTransaction55.mmOriginalTransactionIdentification,
					RelatedReference1.mmTransactionUniqueIdentifier, RelatedReference1.mmMessageReference, PaymentTransaction65.mmOriginalTransactionIdentification, PaymentComplementaryInformation5.mmTransactionIdentification,
					PaymentTransaction63.mmOriginalTransactionIdentification, PaymentTransaction60.mmOriginalTransactionIdentification, PaymentTransaction67.mmOriginalTransactionIdentification,
					PaymentTransaction62.mmOriginalTransactionIdentification, PaymentTransaction73.mmOriginalTransactionIdentification, PaymentTransaction80.mmOriginalTransactionIdentification,
					PaymentTransaction81.mmOriginalTransactionIdentification, PaymentTransaction76.mmOriginalTransactionIdentification, PaymentTransaction75.mmOriginalTransactionIdentification,
					PaymentTransaction79.mmOriginalTransactionIdentification, PaymentComplementaryInformation6.mmTransactionIdentification, PaymentComplementaryInformation7.mmTransactionIdentification,
					PaymentTransaction87.mmOriginalTransactionIdentification, PaymentTransaction88.mmOriginalTransactionIdentification, PaymentIdentification5Choice.mmTransactionIdentification,
					PaymentTransaction90.mmOriginalTransactionIdentification, PaymentTransaction91.mmOriginalTransactionIdentification, PaymentTransaction85.mmOriginalTransactionIdentification,
					PaymentTransaction89.mmOriginalTransactionIdentification, UnderlyingPaymentTransaction3.mmOriginalTransactionIdentification, PaymentInstruction26.mmTransactionIdentification,
					PaymentTransaction94.mmOriginalTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the first instructing agent to unambiguously identify the transaction and passed on, unchanged, throughout the entire interbank chain. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentIdentification obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(PaymentIdentification obj, Max35Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	protected Max35Text clearingSystemReference;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#mmClearingSystemReference
	 * TransactionReferences1.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences2#mmClearingSystemReference
	 * TransactionReferences2.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmClearingSystemReference
	 * TransactionReferences3.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#mmClearingSystemReference
	 * PaymentTransactionInformation25.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#mmClearingSystemReference
	 * PaymentTransaction32.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#mmClearingSystemReference
	 * PaymentTransaction46.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#mmClearingSystemReference
	 * PaymentIdentification3.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalClearingSystemReference
	 * PaymentTransactionInformation31.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmOriginalClearingSystemReference
	 * PaymentTransaction38.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmOriginalClearingSystemReference
	 * PaymentTransaction48.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmOriginalClearingSystemReference
	 * PaymentTransactionInformation29.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmOriginalClearingSystemReference
	 * PaymentTransaction36.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalClearingSystemReference
	 * PaymentTransaction45.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmClearingSystemReference
	 * PaymentTransactionInformation26.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmClearingSystemReference
	 * PaymentTransaction33.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmClearingSystemReference
	 * PaymentTransaction43.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmOriginalClearingSystemReference
	 * PaymentTransactionInformation27.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmOriginalClearingSystemReference
	 * PaymentTransaction34.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmOriginalClearingSystemReference
	 * PaymentTransaction44.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#mmClearingSystemReference
	 * PaymentTransactionInformation34.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#mmClearingSystemReference
	 * PaymentTransaction41.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#mmClearingSystemReference
	 * PaymentTransaction49.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#mmClearingSystemReference
	 * PaymentIdentification4.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmOriginalClearingSystemReference
	 * PaymentTransactionInformation33.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmOriginalClearingSystemReference
	 * PaymentTransaction40.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmOriginalClearingSystemReference
	 * PaymentTransaction50.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmClearingSystemReference
	 * PaymentTransaction52.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalClearingSystemReference
	 * PaymentTransaction51.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmOriginalClearingSystemReference
	 * PaymentTransaction53.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#mmClearingSystemReference
	 * PaymentTransaction57.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmOriginalClearingSystemReference
	 * PaymentTransaction55.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#mmClearingSystemReference
	 * PaymentTransaction59.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmOriginalClearingSystemReference
	 * PaymentTransaction65.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmClearingSystemReference
	 * PaymentTransaction63.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalClearingSystemReference
	 * PaymentTransaction60.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#mmClearingSystemReference
	 * PaymentTransaction68.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmOriginalClearingSystemReference
	 * PaymentTransaction67.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmOriginalClearingSystemReference
	 * PaymentTransaction62.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#mmClearingSystemReference
	 * PaymentTransaction69.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmClearingSystemReference
	 * PaymentTransaction73.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmClearingSystemReference
	 * PaymentTransaction80.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalClearingSystemReference
	 * PaymentTransaction81.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalClearingSystemReference
	 * PaymentTransaction76.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmClearingSystemReference
	 * PaymentTransaction83.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalClearingSystemReference
	 * PaymentTransaction75.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmClearingSystemReference
	 * PaymentTransaction82.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalClearingSystemReference
	 * PaymentTransaction79.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmOriginalClearingSystemReference
	 * PaymentTransaction87.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmClearingSystemReference
	 * PaymentTransaction87.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmOriginalClearingSystemReference
	 * PaymentTransaction88.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90#mmOriginalClearingSystemReference
	 * PaymentTransaction90.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmClearingSystemReference
	 * PaymentTransaction91.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmOriginalClearingSystemReference
	 * PaymentTransaction85.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction89#mmOriginalClearingSystemReference
	 * PaymentTransaction89.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction94#mmClearingSystemReference
	 * PaymentTransaction94.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction92#mmClearingSystemReference
	 * PaymentTransaction92.mmClearingSystemReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentIdentification, Max35Text> mmClearingSystemReference = new MMBusinessAttribute<PaymentIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionReferences1.mmClearingSystemReference, TransactionReferences2.mmClearingSystemReference, TransactionReferences3.mmClearingSystemReference,
					PaymentTransactionInformation25.mmClearingSystemReference, PaymentTransaction32.mmClearingSystemReference, PaymentTransaction46.mmClearingSystemReference, PaymentIdentification3.mmClearingSystemReference,
					PaymentTransactionInformation31.mmOriginalClearingSystemReference, PaymentTransaction38.mmOriginalClearingSystemReference, PaymentTransaction48.mmOriginalClearingSystemReference,
					PaymentTransactionInformation29.mmOriginalClearingSystemReference, PaymentTransaction36.mmOriginalClearingSystemReference, PaymentTransaction45.mmOriginalClearingSystemReference,
					PaymentTransactionInformation26.mmClearingSystemReference, PaymentTransaction33.mmClearingSystemReference, PaymentTransaction43.mmClearingSystemReference,
					PaymentTransactionInformation27.mmOriginalClearingSystemReference, PaymentTransaction34.mmOriginalClearingSystemReference, PaymentTransaction44.mmOriginalClearingSystemReference,
					PaymentTransactionInformation34.mmClearingSystemReference, PaymentTransaction41.mmClearingSystemReference, PaymentTransaction49.mmClearingSystemReference, PaymentIdentification4.mmClearingSystemReference,
					PaymentTransactionInformation33.mmOriginalClearingSystemReference, PaymentTransaction40.mmOriginalClearingSystemReference, PaymentTransaction50.mmOriginalClearingSystemReference,
					PaymentTransaction52.mmClearingSystemReference, PaymentTransaction51.mmOriginalClearingSystemReference, PaymentTransaction53.mmOriginalClearingSystemReference, PaymentTransaction57.mmClearingSystemReference,
					PaymentTransaction55.mmOriginalClearingSystemReference, PaymentTransaction59.mmClearingSystemReference, PaymentTransaction65.mmOriginalClearingSystemReference, PaymentTransaction63.mmClearingSystemReference,
					PaymentTransaction60.mmOriginalClearingSystemReference, PaymentTransaction68.mmClearingSystemReference, PaymentTransaction67.mmOriginalClearingSystemReference, PaymentTransaction62.mmOriginalClearingSystemReference,
					PaymentTransaction69.mmClearingSystemReference, PaymentTransaction73.mmClearingSystemReference, PaymentTransaction80.mmClearingSystemReference, PaymentTransaction81.mmOriginalClearingSystemReference,
					PaymentTransaction76.mmOriginalClearingSystemReference, PaymentTransaction83.mmClearingSystemReference, PaymentTransaction75.mmOriginalClearingSystemReference, PaymentTransaction82.mmClearingSystemReference,
					PaymentTransaction79.mmOriginalClearingSystemReference, PaymentTransaction87.mmOriginalClearingSystemReference, PaymentTransaction87.mmClearingSystemReference, PaymentTransaction88.mmOriginalClearingSystemReference,
					PaymentTransaction90.mmOriginalClearingSystemReference, PaymentTransaction91.mmClearingSystemReference, PaymentTransaction85.mmOriginalClearingSystemReference, PaymentTransaction89.mmOriginalClearingSystemReference,
					PaymentTransaction94.mmClearingSystemReference, PaymentTransaction92.mmClearingSystemReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentIdentification obj) {
			return obj.getClearingSystemReference();
		}

		@Override
		public void setValue(PaymentIdentification obj, Max35Text value) {
			obj.setClearingSystemReference(value);
		}
	};
	protected Max35Text creditorReference;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation1#mmCreditorReference
	 * CreditorReferenceInformation1.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation6.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation2#mmReference
	 * CreditorReferenceInformation2.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation7.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation9.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation8.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer3#mmReference
	 * CreditTransfer3.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer4#mmReference
	 * CreditTransfer4.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmReference
	 * CreditTransfer6.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmCreditorReference
	 * StructuredRemittanceInformation2.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmCreditorReference
	 * TradeSettlement1.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation10.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation12.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation13.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmReference
	 * CreditTransfer8.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation14#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation14.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation15.mmCreditorReferenceInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous reference assigned by the creditor to refer to the payment obligation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentIdentification, Max35Text> mmCreditorReference = new MMBusinessAttribute<PaymentIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CreditorReferenceInformation1.mmCreditorReference, StructuredRemittanceInformation6.mmCreditorReferenceInformation, CreditorReferenceInformation2.mmReference,
					StructuredRemittanceInformation7.mmCreditorReferenceInformation, StructuredRemittanceInformation9.mmCreditorReferenceInformation, StructuredRemittanceInformation8.mmCreditorReferenceInformation,
					CreditTransfer3.mmReference, CreditTransfer4.mmReference, CreditTransfer6.mmReference, StructuredRemittanceInformation2.mmCreditorReference, TradeSettlement1.mmCreditorReference,
					StructuredRemittanceInformation10.mmCreditorReferenceInformation, StructuredRemittanceInformation12.mmCreditorReferenceInformation, StructuredRemittanceInformation13.mmCreditorReferenceInformation,
					CreditTransfer8.mmReference, StructuredRemittanceInformation14.mmCreditorReferenceInformation, StructuredRemittanceInformation15.mmCreditorReferenceInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditorReference";
			definition = "Unique and unambiguous reference assigned by the creditor to refer to the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentIdentification obj) {
			return obj.getCreditorReference();
		}

		@Override
		public void setValue(PaymentIdentification obj, Max35Text value) {
			obj.setCreditorReference(value);
		}
	};
	protected Payment payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
	 * Payment.mmPaymentRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which identifications are provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentIdentification, com.tools20022.repository.entity.Payment> mmPayment = new MMBusinessAssociationEnd<PaymentIdentification, com.tools20022.repository.entity.Payment>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which identifications are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentRelatedIdentifications;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Payment getValue(PaymentIdentification obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(PaymentIdentification obj, com.tools20022.repository.entity.Payment value) {
			obj.setPayment(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentIdentification";
				definition = "Specifies the different identifications associated with a payment transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmPaymentRelatedIdentifications);
				superType_lazy = () -> TradeIdentification.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentIdentification.mmExecutionIdentification, com.tools20022.repository.entity.PaymentIdentification.mmEndToEndIdentification,
						com.tools20022.repository.entity.PaymentIdentification.mmInstructionIdentification, com.tools20022.repository.entity.PaymentIdentification.mmTransactionIdentification,
						com.tools20022.repository.entity.PaymentIdentification.mmClearingSystemReference, com.tools20022.repository.entity.PaymentIdentification.mmCreditorReference,
						com.tools20022.repository.entity.PaymentIdentification.mmPayment);
				derivationComponent_lazy = () -> Arrays.asList(PaymentIdentificationChoice.mmObject(), PaymentIdentification2Choice.mmObject(), PaymentIdentification3Choice.mmObject(), PaymentIdentification4Choice.mmObject(),
						PaymentIdentification1.mmObject(), CreditorReferenceInformation1.mmObject(), CreditorReferenceInformation2.mmObject(), PaymentIdentification2.mmObject(), PaymentIdentification3.mmObject(),
						PaymentIdentification4.mmObject(), TransactionReferences4.mmObject(), CertificateIdentification1.mmObject(), PaymentIdentification5Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getExecutionIdentification() {
		return executionIdentification;
	}

	public PaymentIdentification setExecutionIdentification(Max35Text executionIdentification) {
		this.executionIdentification = Objects.requireNonNull(executionIdentification);
		return this;
	}

	public Max35Text getEndToEndIdentification() {
		return endToEndIdentification;
	}

	public PaymentIdentification setEndToEndIdentification(Max35Text endToEndIdentification) {
		this.endToEndIdentification = Objects.requireNonNull(endToEndIdentification);
		return this;
	}

	public Max35Text getInstructionIdentification() {
		return instructionIdentification;
	}

	public PaymentIdentification setInstructionIdentification(Max35Text instructionIdentification) {
		this.instructionIdentification = Objects.requireNonNull(instructionIdentification);
		return this;
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public PaymentIdentification setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Max35Text getClearingSystemReference() {
		return clearingSystemReference;
	}

	public PaymentIdentification setClearingSystemReference(Max35Text clearingSystemReference) {
		this.clearingSystemReference = Objects.requireNonNull(clearingSystemReference);
		return this;
	}

	public Max35Text getCreditorReference() {
		return creditorReference;
	}

	public PaymentIdentification setCreditorReference(Max35Text creditorReference) {
		this.creditorReference = Objects.requireNonNull(creditorReference);
		return this;
	}

	public Payment getPayment() {
		return payment;
	}

	public PaymentIdentification setPayment(com.tools20022.repository.entity.Payment payment) {
		this.payment = Objects.requireNonNull(payment);
		return this;
	}
}