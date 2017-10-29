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
import com.tools20022.repository.choice.LocalInstrument1Choice;
import com.tools20022.repository.choice.LocalInstrument2Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies how a payment must be processed, for instance through which
 * specific clearing channel.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentProcessing" src="doc-files/PaymentProcessing.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentProcessing#Priority
 * PaymentProcessing.Priority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#ServiceLevel
 * PaymentProcessing.ServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#ClearingChannel
 * PaymentProcessing.ClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#LocalInstrument
 * PaymentProcessing.LocalInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#CategoryPurpose
 * PaymentProcessing.CategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#PaymentExecution
 * PaymentProcessing.PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#SequenceType
 * PaymentProcessing.SequenceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#RelatedMandate
 * PaymentProcessing.RelatedMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#BankTransaction
 * PaymentProcessing.BankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#ContactPoint
 * PaymentProcessing.ContactPoint}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#RelatedPayment
 * ContactPoint.RelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#ProcessingInstructions
 * PaymentExecution.ProcessingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#RelatedPayment
 * BankTransaction.RelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ServiceLevel#PaymentProcessing
 * ServiceLevel.PaymentProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#MandatePaymentType
 * DirectDebitMandate.MandatePaymentType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.LocalInstrument1Choice
 * LocalInstrument1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation1
 * PaymentTypeInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LocalInstrument2Choice
 * LocalInstrument2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation19
 * PaymentTypeInformation19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation2
 * PaymentTypeInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation20
 * PaymentTypeInformation20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation24
 * PaymentTypeInformation24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation6
 * PaymentTypeInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation4
 * PaymentTypeInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation22
 * PaymentTypeInformation22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation25
 * PaymentTypeInformation25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation3
 * PaymentTypeInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation21
 * PaymentTypeInformation21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation5
 * PaymentTypeInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation23
 * PaymentTypeInformation23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LocalInstrument1
 * LocalInstrument1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation9
 * PaymentTypeInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation15
 * PaymentTypeInformation15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation12
 * PaymentTypeInformation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation18
 * PaymentTypeInformation18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation7
 * PaymentTypeInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation13
 * PaymentTypeInformation13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation10
 * PaymentTypeInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation16
 * PaymentTypeInformation16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation8
 * PaymentTypeInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation14
 * PaymentTypeInformation14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation11
 * PaymentTypeInformation11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation17
 * PaymentTypeInformation17}</li>
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
 * "PaymentProcessing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies how a payment must be processed, for instance through which specific clearing channel."
 * </li>
 * </ul>
 */
public class PaymentProcessing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicator of the urgency or order of importance that the instructing
	 * party would like the instructed party to apply to the processing of the
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PriorityCode
	 * PriorityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails2#Priority
	 * PaymentDetails2.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails4#Priority
	 * PaymentDetails4.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails5#Priority
	 * PaymentDetails5.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails6#Priority
	 * PaymentDetails6.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails7#Priority
	 * PaymentDetails7.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation1#InstructionPriority
	 * PaymentTypeInformation1.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#InstructionPriority
	 * PaymentTypeInformation19.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation2#InstructionPriority
	 * PaymentTypeInformation2.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation20#InstructionPriority
	 * PaymentTypeInformation20.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#InstructionPriority
	 * PaymentTypeInformation24.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation6#InstructionPriority
	 * PaymentTypeInformation6.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation4#InstructionPriority
	 * PaymentTypeInformation4.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation22#InstructionPriority
	 * PaymentTypeInformation22.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#InstructionPriority
	 * PaymentTypeInformation25.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation3#InstructionPriority
	 * PaymentTypeInformation3.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#InstructionPriority
	 * PaymentTypeInformation21.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#SettlementPriority
	 * CreditTransferTransactionInformation11.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#SettlementPriority
	 * CreditTransferTransaction2.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#SettlementPriority
	 * CreditTransferTransaction7.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#InstructionPriority
	 * PaymentTypeInformation5.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23#InstructionPriority
	 * PaymentTypeInformation23.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#SettlementPriority
	 * CreditTransferTransactionInformation13.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#SettlementPriority
	 * CreditTransferTransaction4.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#SettlementPriority
	 * CreditTransferTransaction8.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#SettlementPriority
	 * DirectDebitTransactionInformation15.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation12#InstructionPriority
	 * PaymentTypeInformation12.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation18#InstructionPriority
	 * PaymentTypeInformation18.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation10#InstructionPriority
	 * PaymentTypeInformation10.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation16#InstructionPriority
	 * PaymentTypeInformation16.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation11#InstructionPriority
	 * PaymentTypeInformation11.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#InstructionPriority
	 * PaymentTypeInformation17.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#SettlementPriority
	 * PaymentTransaction50.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#SettlementPriority
	 * CreditTransferTransaction17.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#SettlementPriority
	 * CreditTransferTransaction19.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#SettlementPriority
	 * DirectDebitTransactionInformation17.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#SettlementPriority
	 * PaymentTransaction51.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#SettlementPriority
	 * CreditTransferTransaction23.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#SettlementPriority
	 * CreditTransferTransaction25.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#SettlementPriority
	 * PaymentTransaction65.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#SettlementPriority
	 * DirectDebitTransactionInformation20.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#SettlementPriority
	 * PaymentTransaction60.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#SettlementPriority
	 * DirectDebitTransactionInformation21.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#SettlementPriority
	 * PaymentTransaction81.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#SettlementPriority
	 * PaymentTransaction76.SettlementPriority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Priority = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentDetails2.Priority, com.tools20022.repository.msg.PaymentDetails4.Priority, com.tools20022.repository.msg.PaymentDetails5.Priority,
					com.tools20022.repository.msg.PaymentDetails6.Priority, com.tools20022.repository.msg.PaymentDetails7.Priority, com.tools20022.repository.msg.PaymentTypeInformation1.InstructionPriority,
					com.tools20022.repository.msg.PaymentTypeInformation19.InstructionPriority, com.tools20022.repository.msg.PaymentTypeInformation2.InstructionPriority,
					com.tools20022.repository.msg.PaymentTypeInformation20.InstructionPriority, com.tools20022.repository.msg.PaymentTypeInformation24.InstructionPriority,
					com.tools20022.repository.msg.PaymentTypeInformation6.InstructionPriority, com.tools20022.repository.msg.PaymentTypeInformation4.InstructionPriority,
					com.tools20022.repository.msg.PaymentTypeInformation22.InstructionPriority, com.tools20022.repository.msg.PaymentTypeInformation25.InstructionPriority,
					com.tools20022.repository.msg.PaymentTypeInformation3.InstructionPriority, com.tools20022.repository.msg.PaymentTypeInformation21.InstructionPriority,
					com.tools20022.repository.msg.CreditTransferTransactionInformation11.SettlementPriority, com.tools20022.repository.msg.CreditTransferTransaction2.SettlementPriority,
					com.tools20022.repository.msg.CreditTransferTransaction7.SettlementPriority, com.tools20022.repository.msg.PaymentTypeInformation5.InstructionPriority,
					com.tools20022.repository.msg.PaymentTypeInformation23.InstructionPriority, com.tools20022.repository.msg.CreditTransferTransactionInformation13.SettlementPriority,
					com.tools20022.repository.msg.CreditTransferTransaction4.SettlementPriority, com.tools20022.repository.msg.CreditTransferTransaction8.SettlementPriority,
					com.tools20022.repository.msg.DirectDebitTransactionInformation15.SettlementPriority, com.tools20022.repository.msg.PaymentTypeInformation12.InstructionPriority,
					com.tools20022.repository.msg.PaymentTypeInformation18.InstructionPriority, com.tools20022.repository.msg.PaymentTypeInformation10.InstructionPriority,
					com.tools20022.repository.msg.PaymentTypeInformation16.InstructionPriority, com.tools20022.repository.msg.PaymentTypeInformation11.InstructionPriority,
					com.tools20022.repository.msg.PaymentTypeInformation17.InstructionPriority, com.tools20022.repository.msg.PaymentTransaction50.SettlementPriority,
					com.tools20022.repository.msg.CreditTransferTransaction17.SettlementPriority, com.tools20022.repository.msg.CreditTransferTransaction19.SettlementPriority,
					com.tools20022.repository.msg.DirectDebitTransactionInformation17.SettlementPriority, com.tools20022.repository.msg.PaymentTransaction51.SettlementPriority,
					com.tools20022.repository.msg.CreditTransferTransaction23.SettlementPriority, com.tools20022.repository.msg.CreditTransferTransaction25.SettlementPriority,
					com.tools20022.repository.msg.PaymentTransaction65.SettlementPriority, com.tools20022.repository.msg.DirectDebitTransactionInformation20.SettlementPriority,
					com.tools20022.repository.msg.PaymentTransaction60.SettlementPriority, com.tools20022.repository.msg.DirectDebitTransactionInformation21.SettlementPriority,
					com.tools20022.repository.msg.PaymentTransaction81.SettlementPriority, com.tools20022.repository.msg.PaymentTransaction76.SettlementPriority);
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}
	};
	/**
	 * Agreement under which or rules under which the transaction should be
	 * processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel#PaymentProcessing
	 * ServiceLevel.PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ServiceLevel
	 * ServiceLevel}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation1#ServiceLevel
	 * PaymentTypeInformation1.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#ServiceLevel
	 * PaymentTypeInformation19.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation2#ServiceLevel
	 * PaymentTypeInformation2.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation20#ServiceLevel
	 * PaymentTypeInformation20.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#ServiceLevel
	 * PaymentTypeInformation24.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation6#ServiceLevel
	 * PaymentTypeInformation6.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation4#ServiceLevel
	 * PaymentTypeInformation4.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation22#ServiceLevel
	 * PaymentTypeInformation22.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#ServiceLevel
	 * PaymentTypeInformation25.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation3#ServiceLevel
	 * PaymentTypeInformation3.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#ServiceLevel
	 * PaymentTypeInformation21.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#ServiceLevel
	 * PaymentTypeInformation5.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23#ServiceLevel
	 * PaymentTypeInformation23.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation1#ServiceLevel
	 * MandateTypeInformation1.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation9#ServiceLevel
	 * PaymentTypeInformation9.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation15#ServiceLevel
	 * PaymentTypeInformation15.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation12#ServiceLevel
	 * PaymentTypeInformation12.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation18#ServiceLevel
	 * PaymentTypeInformation18.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation7#ServiceLevel
	 * PaymentTypeInformation7.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation13#ServiceLevel
	 * PaymentTypeInformation13.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation10#ServiceLevel
	 * PaymentTypeInformation10.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation16#ServiceLevel
	 * PaymentTypeInformation16.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation8#ServiceLevel
	 * PaymentTypeInformation8.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation14#ServiceLevel
	 * PaymentTypeInformation14.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation11#ServiceLevel
	 * PaymentTypeInformation11.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#ServiceLevel
	 * PaymentTypeInformation17.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#ServiceLevel
	 * MandateTypeInformation2.ServiceLevel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement under which or rules under which the transaction should be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ServiceLevel = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation1.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation19.ServiceLevel,
					com.tools20022.repository.msg.PaymentTypeInformation2.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation20.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation24.ServiceLevel,
					com.tools20022.repository.msg.PaymentTypeInformation6.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation4.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation22.ServiceLevel,
					com.tools20022.repository.msg.PaymentTypeInformation25.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation3.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation21.ServiceLevel,
					com.tools20022.repository.msg.PaymentTypeInformation5.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation23.ServiceLevel, com.tools20022.repository.msg.MandateTypeInformation1.ServiceLevel,
					com.tools20022.repository.msg.PaymentTypeInformation9.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation15.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation12.ServiceLevel,
					com.tools20022.repository.msg.PaymentTypeInformation18.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation7.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation13.ServiceLevel,
					com.tools20022.repository.msg.PaymentTypeInformation10.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation16.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation8.ServiceLevel,
					com.tools20022.repository.msg.PaymentTypeInformation14.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation11.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation17.ServiceLevel,
					com.tools20022.repository.msg.MandateTypeInformation2.ServiceLevel);
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the transaction should be processed.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ServiceLevel.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ServiceLevel.PaymentProcessing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the clearing channel to be used to process the payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingChannelCode
	 * ClearingChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation1#ClearingChannel
	 * PaymentTypeInformation1.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation2#ClearingChannel
	 * PaymentTypeInformation2.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation6#ClearingChannel
	 * PaymentTypeInformation6.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation4#ClearingChannel
	 * PaymentTypeInformation4.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation22#ClearingChannel
	 * PaymentTypeInformation22.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#ClearingChannel
	 * PaymentTypeInformation25.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation3#ClearingChannel
	 * PaymentTypeInformation3.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#ClearingChannel
	 * PaymentTypeInformation21.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#ClearingChannel
	 * PaymentTypeInformation5.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23#ClearingChannel
	 * PaymentTypeInformation23.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnInformation1#ClearingChannel
	 * ReturnInformation1.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1#ClearingChannel
	 * ResolutionInformation1.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation12#ClearingChannel
	 * PaymentTypeInformation12.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation10#ClearingChannel
	 * PaymentTypeInformation10.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation11#ClearingChannel
	 * PaymentTypeInformation11.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails10#ClearingChannel
	 * RequestDetails10.ClearingChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the clearing channel to be used to process the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClearingChannel = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation1.ClearingChannel, com.tools20022.repository.msg.PaymentTypeInformation2.ClearingChannel,
					com.tools20022.repository.msg.PaymentTypeInformation6.ClearingChannel, com.tools20022.repository.msg.PaymentTypeInformation4.ClearingChannel, com.tools20022.repository.msg.PaymentTypeInformation22.ClearingChannel,
					com.tools20022.repository.msg.PaymentTypeInformation25.ClearingChannel, com.tools20022.repository.msg.PaymentTypeInformation3.ClearingChannel, com.tools20022.repository.msg.PaymentTypeInformation21.ClearingChannel,
					com.tools20022.repository.msg.PaymentTypeInformation5.ClearingChannel, com.tools20022.repository.msg.PaymentTypeInformation23.ClearingChannel, com.tools20022.repository.msg.ReturnInformation1.ClearingChannel,
					com.tools20022.repository.msg.ResolutionInformation1.ClearingChannel, com.tools20022.repository.msg.PaymentTypeInformation12.ClearingChannel, com.tools20022.repository.msg.PaymentTypeInformation10.ClearingChannel,
					com.tools20022.repository.msg.PaymentTypeInformation11.ClearingChannel, com.tools20022.repository.msg.RequestDetails10.ClearingChannel);
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingChannel";
			definition = "Specifies the clearing channel to be used to process the payment instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ClearingChannelCode.mmObject();
		}
	};
	/**
	 * User community specific instrument. Usage : When available, codes
	 * provided by local authorities should be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ExternalCode
	 * ExternalCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument1Choice#Code
	 * LocalInstrument1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument1Choice#Proprietary
	 * LocalInstrument1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation1#LocalInstrument
	 * PaymentTypeInformation1.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument2Choice#Code
	 * LocalInstrument2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument2Choice#Proprietary
	 * LocalInstrument2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#LocalInstrument
	 * PaymentTypeInformation19.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation2#LocalInstrument
	 * PaymentTypeInformation2.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation20#LocalInstrument
	 * PaymentTypeInformation20.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#LocalInstrument
	 * PaymentTypeInformation24.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation6#LocalInstrument
	 * PaymentTypeInformation6.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation4#LocalInstrument
	 * PaymentTypeInformation4.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation22#LocalInstrument
	 * PaymentTypeInformation22.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#LocalInstrument
	 * PaymentTypeInformation25.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation3#LocalInstrument
	 * PaymentTypeInformation3.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#LocalInstrument
	 * PaymentTypeInformation21.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#LocalInstrument
	 * PaymentTypeInformation5.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23#LocalInstrument
	 * PaymentTypeInformation23.LocalInstrument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LocalInstrument1#Code
	 * LocalInstrument1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation15#LocalInstrument
	 * PaymentTypeInformation15.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation12#LocalInstrument
	 * PaymentTypeInformation12.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation18#LocalInstrument
	 * PaymentTypeInformation18.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation10#LocalInstrument
	 * PaymentTypeInformation10.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation16#LocalInstrument
	 * PaymentTypeInformation16.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation14#LocalInstrument
	 * PaymentTypeInformation14.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation11#LocalInstrument
	 * PaymentTypeInformation11.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#LocalInstrument
	 * PaymentTypeInformation17.LocalInstrument}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "User community specific instrument.\nUsage : When available, codes provided by local authorities should be used."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LocalInstrument = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.LocalInstrument1Choice.Code, com.tools20022.repository.choice.LocalInstrument1Choice.Proprietary,
					com.tools20022.repository.msg.PaymentTypeInformation1.LocalInstrument, com.tools20022.repository.choice.LocalInstrument2Choice.Code, com.tools20022.repository.choice.LocalInstrument2Choice.Proprietary,
					com.tools20022.repository.msg.PaymentTypeInformation19.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation2.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation20.LocalInstrument,
					com.tools20022.repository.msg.PaymentTypeInformation24.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation6.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation4.LocalInstrument,
					com.tools20022.repository.msg.PaymentTypeInformation22.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation25.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation3.LocalInstrument,
					com.tools20022.repository.msg.PaymentTypeInformation21.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation5.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation23.LocalInstrument,
					com.tools20022.repository.msg.LocalInstrument1.Code, com.tools20022.repository.msg.PaymentTypeInformation15.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation12.LocalInstrument,
					com.tools20022.repository.msg.PaymentTypeInformation18.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation10.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation16.LocalInstrument,
					com.tools20022.repository.msg.PaymentTypeInformation14.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation11.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation17.LocalInstrument);
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\nUsage : When available, codes provided by local authorities should be used.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalCode.mmObject();
		}
	};
	/**
	 * Specifies the high level purpose of the instruction based on a set of
	 * pre-defined categories.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation1#CategoryPurpose
	 * PaymentTypeInformation1.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CategoryPurpose1Choice#Code
	 * CategoryPurpose1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CategoryPurpose1Choice#Proprietary
	 * CategoryPurpose1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#CategoryPurpose
	 * PaymentTypeInformation19.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation2#CategoryPurpose
	 * PaymentTypeInformation2.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#Purpose
	 * DirectDebitTransactionInformation1.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation20#CategoryPurpose
	 * PaymentTypeInformation20.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#Purpose
	 * DirectDebitTransactionInformation9.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#CategoryPurpose
	 * PaymentTypeInformation24.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#Purpose
	 * DirectDebitTransactionInformation11.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#Purpose
	 * DirectDebitTransactionInformation13.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation6#CategoryPurpose
	 * PaymentTypeInformation6.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation4#CategoryPurpose
	 * PaymentTypeInformation4.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation22#CategoryPurpose
	 * PaymentTypeInformation22.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#CategoryPurpose
	 * PaymentTypeInformation25.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation3#CategoryPurpose
	 * PaymentTypeInformation3.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#CategoryPurpose
	 * PaymentTypeInformation21.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#Purpose
	 * DirectDebitTransactionInformation2.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#Purpose
	 * DirectDebitTransactionInformation10.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#Purpose
	 * DirectDebitTransactionInformation12.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#Purpose
	 * DirectDebitTransactionInformation14.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation15#CategoryPurpose
	 * PaymentTypeInformation15.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation12#CategoryPurpose
	 * PaymentTypeInformation12.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation18#CategoryPurpose
	 * PaymentTypeInformation18.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation13#CategoryPurpose
	 * PaymentTypeInformation13.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation10#CategoryPurpose
	 * PaymentTypeInformation10.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation16#CategoryPurpose
	 * PaymentTypeInformation16.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation14#CategoryPurpose
	 * PaymentTypeInformation14.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation11#CategoryPurpose
	 * PaymentTypeInformation11.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#CategoryPurpose
	 * PaymentTypeInformation17.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#Purpose
	 * DirectDebitTransactionInformation7.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#Purpose
	 * DirectDebitTransactionInformation6.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#Purpose
	 * DirectDebitTransactionInformation8.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#Purpose
	 * DirectDebitTransactionInformation17.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#Purpose
	 * DirectDebitTransactionInformation18.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#Purpose
	 * DirectDebitTransactionInformation20.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#Purpose
	 * DirectDebitTransactionInformation19.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#Purpose
	 * DirectDebitTransactionInformation21.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#CategoryPurpose
	 * MandateTypeInformation2.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateClassification1Choice#Code
	 * MandateClassification1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateClassification1Choice#Proprietary
	 * MandateClassification1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#Purpose
	 * DirectDebitTransactionInformation22.Purpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the high level purpose of the instruction based on a set of pre-defined categories."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CategoryPurpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation1.CategoryPurpose, com.tools20022.repository.choice.CategoryPurpose1Choice.Code,
					com.tools20022.repository.choice.CategoryPurpose1Choice.Proprietary, com.tools20022.repository.msg.PaymentTypeInformation19.CategoryPurpose, com.tools20022.repository.msg.PaymentTypeInformation2.CategoryPurpose,
					com.tools20022.repository.msg.DirectDebitTransactionInformation1.Purpose, com.tools20022.repository.msg.PaymentTypeInformation20.CategoryPurpose, com.tools20022.repository.msg.DirectDebitTransactionInformation9.Purpose,
					com.tools20022.repository.msg.PaymentTypeInformation24.CategoryPurpose, com.tools20022.repository.msg.DirectDebitTransactionInformation11.Purpose,
					com.tools20022.repository.msg.DirectDebitTransactionInformation13.Purpose, com.tools20022.repository.msg.PaymentTypeInformation6.CategoryPurpose, com.tools20022.repository.msg.PaymentTypeInformation4.CategoryPurpose,
					com.tools20022.repository.msg.PaymentTypeInformation22.CategoryPurpose, com.tools20022.repository.msg.PaymentTypeInformation25.CategoryPurpose, com.tools20022.repository.msg.PaymentTypeInformation3.CategoryPurpose,
					com.tools20022.repository.msg.PaymentTypeInformation21.CategoryPurpose, com.tools20022.repository.msg.DirectDebitTransactionInformation2.Purpose,
					com.tools20022.repository.msg.DirectDebitTransactionInformation10.Purpose, com.tools20022.repository.msg.DirectDebitTransactionInformation12.Purpose,
					com.tools20022.repository.msg.DirectDebitTransactionInformation14.Purpose, com.tools20022.repository.msg.PaymentTypeInformation15.CategoryPurpose, com.tools20022.repository.msg.PaymentTypeInformation12.CategoryPurpose,
					com.tools20022.repository.msg.PaymentTypeInformation18.CategoryPurpose, com.tools20022.repository.msg.PaymentTypeInformation13.CategoryPurpose, com.tools20022.repository.msg.PaymentTypeInformation10.CategoryPurpose,
					com.tools20022.repository.msg.PaymentTypeInformation16.CategoryPurpose, com.tools20022.repository.msg.PaymentTypeInformation14.CategoryPurpose, com.tools20022.repository.msg.PaymentTypeInformation11.CategoryPurpose,
					com.tools20022.repository.msg.PaymentTypeInformation17.CategoryPurpose, com.tools20022.repository.msg.DirectDebitTransactionInformation7.Purpose, com.tools20022.repository.msg.DirectDebitTransactionInformation6.Purpose,
					com.tools20022.repository.msg.DirectDebitTransactionInformation8.Purpose, com.tools20022.repository.msg.DirectDebitTransactionInformation17.Purpose,
					com.tools20022.repository.msg.DirectDebitTransactionInformation18.Purpose, com.tools20022.repository.msg.DirectDebitTransactionInformation20.Purpose,
					com.tools20022.repository.msg.DirectDebitTransactionInformation19.Purpose, com.tools20022.repository.msg.DirectDebitTransactionInformation21.Purpose,
					com.tools20022.repository.msg.MandateTypeInformation2.CategoryPurpose, com.tools20022.repository.choice.MandateClassification1Choice.Code, com.tools20022.repository.choice.MandateClassification1Choice.Proprietary,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.Purpose);
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CategoryPurpose";
			definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentCategoryPurposeCode.mmObject();
		}
	};
	/**
	 * Payment execution process for which processing parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#ProcessingInstructions
	 * PaymentExecution.ProcessingInstructions}</li>
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
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment execution process for which processing parameters are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Payment execution process for which processing parameters are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.ProcessingInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the payment sequence where applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceTypeCode
	 * SequenceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation2#SequenceType
	 * PaymentTypeInformation2.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation20#SequenceType
	 * PaymentTypeInformation20.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#SequenceType
	 * PaymentTypeInformation24.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation6#SequenceType
	 * PaymentTypeInformation6.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation4#SequenceType
	 * PaymentTypeInformation4.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation22#SequenceType
	 * PaymentTypeInformation22.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#SequenceType
	 * PaymentTypeInformation25.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences1#SequenceType
	 * MandateOccurrences1.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#SequenceType
	 * MandateOccurrences2.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation9#SequenceType
	 * PaymentTypeInformation9.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation15#SequenceType
	 * PaymentTypeInformation15.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation12#SequenceType
	 * PaymentTypeInformation12.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation18#SequenceType
	 * PaymentTypeInformation18.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation8#SequenceType
	 * PaymentTypeInformation8.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation14#SequenceType
	 * PaymentTypeInformation14.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation11#SequenceType
	 * PaymentTypeInformation11.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#SequenceType
	 * PaymentTypeInformation17.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#SequenceType
	 * MandateOccurrences3.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#SequenceType
	 * MandateOccurrences4.SequenceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the payment sequence where applicable."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SequenceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation2.SequenceType, com.tools20022.repository.msg.PaymentTypeInformation20.SequenceType,
					com.tools20022.repository.msg.PaymentTypeInformation24.SequenceType, com.tools20022.repository.msg.PaymentTypeInformation6.SequenceType, com.tools20022.repository.msg.PaymentTypeInformation4.SequenceType,
					com.tools20022.repository.msg.PaymentTypeInformation22.SequenceType, com.tools20022.repository.msg.PaymentTypeInformation25.SequenceType, com.tools20022.repository.msg.MandateOccurrences1.SequenceType,
					com.tools20022.repository.msg.MandateOccurrences2.SequenceType, com.tools20022.repository.msg.PaymentTypeInformation9.SequenceType, com.tools20022.repository.msg.PaymentTypeInformation15.SequenceType,
					com.tools20022.repository.msg.PaymentTypeInformation12.SequenceType, com.tools20022.repository.msg.PaymentTypeInformation18.SequenceType, com.tools20022.repository.msg.PaymentTypeInformation8.SequenceType,
					com.tools20022.repository.msg.PaymentTypeInformation14.SequenceType, com.tools20022.repository.msg.PaymentTypeInformation11.SequenceType, com.tools20022.repository.msg.PaymentTypeInformation17.SequenceType,
					com.tools20022.repository.msg.MandateOccurrences3.SequenceType, com.tools20022.repository.msg.MandateOccurrences4.SequenceType);
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SequenceType";
			definition = "Identifies the payment sequence where applicable.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SequenceTypeCode.mmObject();
		}
	};
	/**
	 * Mandate for which payment processing parametres are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#MandatePaymentType
	 * DirectDebitMandate.MandatePaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mandate for which payment processing parametres are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedMandate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMandate";
			definition = "Mandate for which payment processing parametres are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DirectDebitMandate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.MandatePaymentType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Code of the underlying bank transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#RelatedPayment
	 * BankTransaction.RelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code of the underlying bank transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BankTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankTransaction";
			definition = "Code of the underlying bank transaction.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the notification method to be used to inform the beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedPayment
	 * ContactPoint.RelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the notification method to be used to inform the beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ContactPoint = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Specifies the notification method to be used to inform the beneficiary.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentProcessing";
				definition = "Specifies how a payment must be processed, for instance through which specific clearing channel.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.RelatedPayment, com.tools20022.repository.entity.PaymentExecution.ProcessingInstructions,
						com.tools20022.repository.entity.BankTransaction.RelatedPayment, com.tools20022.repository.entity.ServiceLevel.PaymentProcessing, com.tools20022.repository.entity.DirectDebitMandate.MandatePaymentType);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentProcessing.Priority, com.tools20022.repository.entity.PaymentProcessing.ServiceLevel,
						com.tools20022.repository.entity.PaymentProcessing.ClearingChannel, com.tools20022.repository.entity.PaymentProcessing.LocalInstrument, com.tools20022.repository.entity.PaymentProcessing.CategoryPurpose,
						com.tools20022.repository.entity.PaymentProcessing.PaymentExecution, com.tools20022.repository.entity.PaymentProcessing.SequenceType, com.tools20022.repository.entity.PaymentProcessing.RelatedMandate,
						com.tools20022.repository.entity.PaymentProcessing.BankTransaction, com.tools20022.repository.entity.PaymentProcessing.ContactPoint);
				derivationComponent_lazy = () -> Arrays.asList(LocalInstrument1Choice.mmObject(), PaymentTypeInformation1.mmObject(), LocalInstrument2Choice.mmObject(), PaymentTypeInformation19.mmObject(),
						PaymentTypeInformation2.mmObject(), PaymentTypeInformation20.mmObject(), PaymentTypeInformation24.mmObject(), PaymentTypeInformation6.mmObject(), PaymentTypeInformation4.mmObject(),
						PaymentTypeInformation22.mmObject(), PaymentTypeInformation25.mmObject(), PaymentTypeInformation3.mmObject(), PaymentTypeInformation21.mmObject(), PaymentTypeInformation5.mmObject(),
						PaymentTypeInformation23.mmObject(), LocalInstrument1.mmObject(), PaymentTypeInformation9.mmObject(), PaymentTypeInformation15.mmObject(), PaymentTypeInformation12.mmObject(), PaymentTypeInformation18.mmObject(),
						PaymentTypeInformation7.mmObject(), PaymentTypeInformation13.mmObject(), PaymentTypeInformation10.mmObject(), PaymentTypeInformation16.mmObject(), PaymentTypeInformation8.mmObject(),
						PaymentTypeInformation14.mmObject(), PaymentTypeInformation11.mmObject(), PaymentTypeInformation17.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}