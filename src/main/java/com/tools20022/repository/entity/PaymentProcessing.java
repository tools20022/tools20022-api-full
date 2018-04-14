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
import com.tools20022.repository.choice.CategoryPurpose1Choice;
import com.tools20022.repository.choice.LocalInstrument1Choice;
import com.tools20022.repository.choice.LocalInstrument2Choice;
import com.tools20022.repository.choice.MandateClassification1Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPriority
 * PaymentProcessing.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmServiceLevel
 * PaymentProcessing.mmServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmClearingChannel
 * PaymentProcessing.mmClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmLocalInstrument
 * PaymentProcessing.mmLocalInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmCategoryPurpose
 * PaymentProcessing.mmCategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPaymentExecution
 * PaymentProcessing.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmSequenceType
 * PaymentProcessing.mmSequenceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmRelatedMandate
 * PaymentProcessing.mmRelatedMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmBankTransaction
 * PaymentProcessing.mmBankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmContactPoint
 * PaymentProcessing.mmContactPoint}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedPayment
 * ContactPoint.mmRelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
 * PaymentExecution.mmProcessingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmRelatedPayment
 * BankTransaction.mmRelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ServiceLevel#mmPaymentProcessing
 * ServiceLevel.mmPaymentProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmMandatePaymentType
 * DirectDebitMandate.mmMandatePaymentType}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentProcessing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies how a payment must be processed, for instance through which specific clearing channel."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class PaymentProcessing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PriorityCode priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PriorityCode
	 * PriorityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails2#mmPriority
	 * PaymentDetails2.mmPriority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails4#mmPriority
	 * PaymentDetails4.mmPriority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails5#mmPriority
	 * PaymentDetails5.mmPriority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails6#mmPriority
	 * PaymentDetails6.mmPriority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails7#mmPriority
	 * PaymentDetails7.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation1#mmInstructionPriority
	 * PaymentTypeInformation1.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#mmInstructionPriority
	 * PaymentTypeInformation19.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation2#mmInstructionPriority
	 * PaymentTypeInformation2.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation20#mmInstructionPriority
	 * PaymentTypeInformation20.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#mmInstructionPriority
	 * PaymentTypeInformation24.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation6#mmInstructionPriority
	 * PaymentTypeInformation6.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation4#mmInstructionPriority
	 * PaymentTypeInformation4.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation22#mmInstructionPriority
	 * PaymentTypeInformation22.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#mmInstructionPriority
	 * PaymentTypeInformation25.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation3#mmInstructionPriority
	 * PaymentTypeInformation3.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#mmInstructionPriority
	 * PaymentTypeInformation21.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmSettlementPriority
	 * CreditTransferTransactionInformation11.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmSettlementPriority
	 * CreditTransferTransaction2.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmSettlementPriority
	 * CreditTransferTransaction7.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#mmInstructionPriority
	 * PaymentTypeInformation5.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23#mmInstructionPriority
	 * PaymentTypeInformation23.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#mmSettlementPriority
	 * CreditTransferTransactionInformation13.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#mmSettlementPriority
	 * CreditTransferTransaction4.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#mmSettlementPriority
	 * CreditTransferTransaction8.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmSettlementPriority
	 * DirectDebitTransactionInformation15.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation12#mmInstructionPriority
	 * PaymentTypeInformation12.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation18#mmInstructionPriority
	 * PaymentTypeInformation18.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation10#mmInstructionPriority
	 * PaymentTypeInformation10.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation16#mmInstructionPriority
	 * PaymentTypeInformation16.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation11#mmInstructionPriority
	 * PaymentTypeInformation11.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#mmInstructionPriority
	 * PaymentTypeInformation17.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmSettlementPriority
	 * PaymentTransaction50.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#mmSettlementPriority
	 * CreditTransferTransaction17.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmSettlementPriority
	 * CreditTransferTransaction19.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmSettlementPriority
	 * DirectDebitTransactionInformation17.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmSettlementPriority
	 * PaymentTransaction51.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmSettlementPriority
	 * CreditTransferTransaction23.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmSettlementPriority
	 * CreditTransferTransaction25.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmSettlementPriority
	 * PaymentTransaction65.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmSettlementPriority
	 * DirectDebitTransactionInformation20.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmSettlementPriority
	 * PaymentTransaction60.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmSettlementPriority
	 * DirectDebitTransactionInformation21.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmSettlementPriority
	 * PaymentTransaction81.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmSettlementPriority
	 * PaymentTransaction76.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmSettlementPriority
	 * PaymentTransaction87.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmSettlementPriority
	 * CreditTransferTransaction31.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmSettlementPriority
	 * PaymentTransaction88.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmSettlementPriority
	 * CreditTransferTransaction30.mmSettlementPriority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentProcessing, PriorityCode> mmPriority = new MMBusinessAttribute<PaymentProcessing, PriorityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentDetails2.mmPriority, PaymentDetails4.mmPriority, PaymentDetails5.mmPriority, PaymentDetails6.mmPriority, PaymentDetails7.mmPriority, PaymentTypeInformation1.mmInstructionPriority,
					PaymentTypeInformation19.mmInstructionPriority, PaymentTypeInformation2.mmInstructionPriority, PaymentTypeInformation20.mmInstructionPriority, PaymentTypeInformation24.mmInstructionPriority,
					PaymentTypeInformation6.mmInstructionPriority, PaymentTypeInformation4.mmInstructionPriority, PaymentTypeInformation22.mmInstructionPriority, PaymentTypeInformation25.mmInstructionPriority,
					PaymentTypeInformation3.mmInstructionPriority, PaymentTypeInformation21.mmInstructionPriority, CreditTransferTransactionInformation11.mmSettlementPriority, CreditTransferTransaction2.mmSettlementPriority,
					CreditTransferTransaction7.mmSettlementPriority, PaymentTypeInformation5.mmInstructionPriority, PaymentTypeInformation23.mmInstructionPriority, CreditTransferTransactionInformation13.mmSettlementPriority,
					CreditTransferTransaction4.mmSettlementPriority, CreditTransferTransaction8.mmSettlementPriority, DirectDebitTransactionInformation15.mmSettlementPriority, PaymentTypeInformation12.mmInstructionPriority,
					PaymentTypeInformation18.mmInstructionPriority, PaymentTypeInformation10.mmInstructionPriority, PaymentTypeInformation16.mmInstructionPriority, PaymentTypeInformation11.mmInstructionPriority,
					PaymentTypeInformation17.mmInstructionPriority, PaymentTransaction50.mmSettlementPriority, CreditTransferTransaction17.mmSettlementPriority, CreditTransferTransaction19.mmSettlementPriority,
					DirectDebitTransactionInformation17.mmSettlementPriority, PaymentTransaction51.mmSettlementPriority, CreditTransferTransaction23.mmSettlementPriority, CreditTransferTransaction25.mmSettlementPriority,
					PaymentTransaction65.mmSettlementPriority, DirectDebitTransactionInformation20.mmSettlementPriority, PaymentTransaction60.mmSettlementPriority, DirectDebitTransactionInformation21.mmSettlementPriority,
					PaymentTransaction81.mmSettlementPriority, PaymentTransaction76.mmSettlementPriority, PaymentTransaction87.mmSettlementPriority, CreditTransferTransaction31.mmSettlementPriority,
					PaymentTransaction88.mmSettlementPriority, CreditTransferTransaction30.mmSettlementPriority);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}

		@Override
		public PriorityCode getValue(PaymentProcessing obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(PaymentProcessing obj, PriorityCode value) {
			obj.setPriority(value);
		}
	};
	protected ServiceLevel serviceLevel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ServiceLevel
	 * ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel#mmPaymentProcessing
	 * ServiceLevel.mmPaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation1#mmServiceLevel
	 * PaymentTypeInformation1.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#mmServiceLevel
	 * PaymentTypeInformation19.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation2#mmServiceLevel
	 * PaymentTypeInformation2.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation20#mmServiceLevel
	 * PaymentTypeInformation20.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#mmServiceLevel
	 * PaymentTypeInformation24.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation6#mmServiceLevel
	 * PaymentTypeInformation6.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation4#mmServiceLevel
	 * PaymentTypeInformation4.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation22#mmServiceLevel
	 * PaymentTypeInformation22.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#mmServiceLevel
	 * PaymentTypeInformation25.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation3#mmServiceLevel
	 * PaymentTypeInformation3.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#mmServiceLevel
	 * PaymentTypeInformation21.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#mmServiceLevel
	 * PaymentTypeInformation5.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23#mmServiceLevel
	 * PaymentTypeInformation23.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation1#mmServiceLevel
	 * MandateTypeInformation1.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation9#mmServiceLevel
	 * PaymentTypeInformation9.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation15#mmServiceLevel
	 * PaymentTypeInformation15.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation12#mmServiceLevel
	 * PaymentTypeInformation12.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation18#mmServiceLevel
	 * PaymentTypeInformation18.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation7#mmServiceLevel
	 * PaymentTypeInformation7.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation13#mmServiceLevel
	 * PaymentTypeInformation13.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation10#mmServiceLevel
	 * PaymentTypeInformation10.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation16#mmServiceLevel
	 * PaymentTypeInformation16.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation8#mmServiceLevel
	 * PaymentTypeInformation8.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation14#mmServiceLevel
	 * PaymentTypeInformation14.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation11#mmServiceLevel
	 * PaymentTypeInformation11.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#mmServiceLevel
	 * PaymentTypeInformation17.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#mmServiceLevel
	 * MandateTypeInformation2.mmServiceLevel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement under which or rules under which the transaction should be processed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentProcessing, Optional<ServiceLevel>> mmServiceLevel = new MMBusinessAssociationEnd<PaymentProcessing, Optional<ServiceLevel>>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTypeInformation1.mmServiceLevel, PaymentTypeInformation19.mmServiceLevel, PaymentTypeInformation2.mmServiceLevel, PaymentTypeInformation20.mmServiceLevel,
					PaymentTypeInformation24.mmServiceLevel, PaymentTypeInformation6.mmServiceLevel, PaymentTypeInformation4.mmServiceLevel, PaymentTypeInformation22.mmServiceLevel, PaymentTypeInformation25.mmServiceLevel,
					PaymentTypeInformation3.mmServiceLevel, PaymentTypeInformation21.mmServiceLevel, PaymentTypeInformation5.mmServiceLevel, PaymentTypeInformation23.mmServiceLevel, MandateTypeInformation1.mmServiceLevel,
					PaymentTypeInformation9.mmServiceLevel, PaymentTypeInformation15.mmServiceLevel, PaymentTypeInformation12.mmServiceLevel, PaymentTypeInformation18.mmServiceLevel, PaymentTypeInformation7.mmServiceLevel,
					PaymentTypeInformation13.mmServiceLevel, PaymentTypeInformation10.mmServiceLevel, PaymentTypeInformation16.mmServiceLevel, PaymentTypeInformation8.mmServiceLevel, PaymentTypeInformation14.mmServiceLevel,
					PaymentTypeInformation11.mmServiceLevel, PaymentTypeInformation17.mmServiceLevel, MandateTypeInformation2.mmServiceLevel);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the transaction should be processed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ServiceLevel.mmPaymentProcessing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ServiceLevel.mmObject();
		}

		@Override
		public Optional<ServiceLevel> getValue(PaymentProcessing obj) {
			return obj.getServiceLevel();
		}

		@Override
		public void setValue(PaymentProcessing obj, Optional<ServiceLevel> value) {
			obj.setServiceLevel(value.orElse(null));
		}
	};
	protected ClearingChannelCode clearingChannel;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation1#mmClearingChannel
	 * PaymentTypeInformation1.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation2#mmClearingChannel
	 * PaymentTypeInformation2.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation6#mmClearingChannel
	 * PaymentTypeInformation6.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation4#mmClearingChannel
	 * PaymentTypeInformation4.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation22#mmClearingChannel
	 * PaymentTypeInformation22.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#mmClearingChannel
	 * PaymentTypeInformation25.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation3#mmClearingChannel
	 * PaymentTypeInformation3.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#mmClearingChannel
	 * PaymentTypeInformation21.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#mmClearingChannel
	 * PaymentTypeInformation5.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23#mmClearingChannel
	 * PaymentTypeInformation23.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnInformation1#mmClearingChannel
	 * ReturnInformation1.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1#mmClearingChannel
	 * ResolutionInformation1.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation12#mmClearingChannel
	 * PaymentTypeInformation12.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation10#mmClearingChannel
	 * PaymentTypeInformation10.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation11#mmClearingChannel
	 * PaymentTypeInformation11.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails10#mmClearingChannel
	 * RequestDetails10.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails17#mmClearingChannel
	 * RequestDetails17.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation2#mmClearingChannel
	 * ResolutionInformation2.mmClearingChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the clearing channel to be used to process the payment instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentProcessing, ClearingChannelCode> mmClearingChannel = new MMBusinessAttribute<PaymentProcessing, ClearingChannelCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTypeInformation1.mmClearingChannel, PaymentTypeInformation2.mmClearingChannel, PaymentTypeInformation6.mmClearingChannel, PaymentTypeInformation4.mmClearingChannel,
					PaymentTypeInformation22.mmClearingChannel, PaymentTypeInformation25.mmClearingChannel, PaymentTypeInformation3.mmClearingChannel, PaymentTypeInformation21.mmClearingChannel, PaymentTypeInformation5.mmClearingChannel,
					PaymentTypeInformation23.mmClearingChannel, ReturnInformation1.mmClearingChannel, ResolutionInformation1.mmClearingChannel, PaymentTypeInformation12.mmClearingChannel, PaymentTypeInformation10.mmClearingChannel,
					PaymentTypeInformation11.mmClearingChannel, RequestDetails10.mmClearingChannel, RequestDetails17.mmClearingChannel, ResolutionInformation2.mmClearingChannel);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingChannel";
			definition = "Specifies the clearing channel to be used to process the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingChannelCode.mmObject();
		}

		@Override
		public ClearingChannelCode getValue(PaymentProcessing obj) {
			return obj.getClearingChannel();
		}

		@Override
		public void setValue(PaymentProcessing obj, ClearingChannelCode value) {
			obj.setClearingChannel(value);
		}
	};
	protected ExternalCode localInstrument;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument1Choice#mmCode
	 * LocalInstrument1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument1Choice#mmProprietary
	 * LocalInstrument1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation1#mmLocalInstrument
	 * PaymentTypeInformation1.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument2Choice#mmCode
	 * LocalInstrument2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument2Choice#mmProprietary
	 * LocalInstrument2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#mmLocalInstrument
	 * PaymentTypeInformation19.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation2#mmLocalInstrument
	 * PaymentTypeInformation2.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation20#mmLocalInstrument
	 * PaymentTypeInformation20.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#mmLocalInstrument
	 * PaymentTypeInformation24.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation6#mmLocalInstrument
	 * PaymentTypeInformation6.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation4#mmLocalInstrument
	 * PaymentTypeInformation4.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation22#mmLocalInstrument
	 * PaymentTypeInformation22.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#mmLocalInstrument
	 * PaymentTypeInformation25.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation3#mmLocalInstrument
	 * PaymentTypeInformation3.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#mmLocalInstrument
	 * PaymentTypeInformation21.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#mmLocalInstrument
	 * PaymentTypeInformation5.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23#mmLocalInstrument
	 * PaymentTypeInformation23.mmLocalInstrument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LocalInstrument1#mmCode
	 * LocalInstrument1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation15#mmLocalInstrument
	 * PaymentTypeInformation15.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation12#mmLocalInstrument
	 * PaymentTypeInformation12.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation18#mmLocalInstrument
	 * PaymentTypeInformation18.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation10#mmLocalInstrument
	 * PaymentTypeInformation10.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation16#mmLocalInstrument
	 * PaymentTypeInformation16.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation14#mmLocalInstrument
	 * PaymentTypeInformation14.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation11#mmLocalInstrument
	 * PaymentTypeInformation11.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#mmLocalInstrument
	 * PaymentTypeInformation17.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmLocalInstrument
	 * EntryTransaction9.mmLocalInstrument}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "User community specific instrument.\nUsage : When available, codes provided by local authorities should be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentProcessing, ExternalCode> mmLocalInstrument = new MMBusinessAttribute<PaymentProcessing, ExternalCode>() {
		{
			derivation_lazy = () -> Arrays.asList(LocalInstrument1Choice.mmCode, LocalInstrument1Choice.mmProprietary, PaymentTypeInformation1.mmLocalInstrument, LocalInstrument2Choice.mmCode, LocalInstrument2Choice.mmProprietary,
					PaymentTypeInformation19.mmLocalInstrument, PaymentTypeInformation2.mmLocalInstrument, PaymentTypeInformation20.mmLocalInstrument, PaymentTypeInformation24.mmLocalInstrument, PaymentTypeInformation6.mmLocalInstrument,
					PaymentTypeInformation4.mmLocalInstrument, PaymentTypeInformation22.mmLocalInstrument, PaymentTypeInformation25.mmLocalInstrument, PaymentTypeInformation3.mmLocalInstrument, PaymentTypeInformation21.mmLocalInstrument,
					PaymentTypeInformation5.mmLocalInstrument, PaymentTypeInformation23.mmLocalInstrument, LocalInstrument1.mmCode, PaymentTypeInformation15.mmLocalInstrument, PaymentTypeInformation12.mmLocalInstrument,
					PaymentTypeInformation18.mmLocalInstrument, PaymentTypeInformation10.mmLocalInstrument, PaymentTypeInformation16.mmLocalInstrument, PaymentTypeInformation14.mmLocalInstrument, PaymentTypeInformation11.mmLocalInstrument,
					PaymentTypeInformation17.mmLocalInstrument, EntryTransaction9.mmLocalInstrument);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\nUsage : When available, codes provided by local authorities should be used.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalCode.mmObject();
		}

		@Override
		public ExternalCode getValue(PaymentProcessing obj) {
			return obj.getLocalInstrument();
		}

		@Override
		public void setValue(PaymentProcessing obj, ExternalCode value) {
			obj.setLocalInstrument(value);
		}
	};
	protected PaymentCategoryPurposeCode categoryPurpose;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation1#mmCategoryPurpose
	 * PaymentTypeInformation1.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CategoryPurpose1Choice#mmCode
	 * CategoryPurpose1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CategoryPurpose1Choice#mmProprietary
	 * CategoryPurpose1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#mmCategoryPurpose
	 * PaymentTypeInformation19.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation2#mmCategoryPurpose
	 * PaymentTypeInformation2.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#mmPurpose
	 * DirectDebitTransactionInformation1.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation20#mmCategoryPurpose
	 * PaymentTypeInformation20.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmPurpose
	 * DirectDebitTransactionInformation9.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#mmCategoryPurpose
	 * PaymentTypeInformation24.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#mmPurpose
	 * DirectDebitTransactionInformation11.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#mmPurpose
	 * DirectDebitTransactionInformation13.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation6#mmCategoryPurpose
	 * PaymentTypeInformation6.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation4#mmCategoryPurpose
	 * PaymentTypeInformation4.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation22#mmCategoryPurpose
	 * PaymentTypeInformation22.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#mmCategoryPurpose
	 * PaymentTypeInformation25.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation3#mmCategoryPurpose
	 * PaymentTypeInformation3.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#mmCategoryPurpose
	 * PaymentTypeInformation21.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmPurpose
	 * DirectDebitTransactionInformation2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmPurpose
	 * DirectDebitTransactionInformation10.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmPurpose
	 * DirectDebitTransactionInformation12.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmPurpose
	 * DirectDebitTransactionInformation14.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation15#mmCategoryPurpose
	 * PaymentTypeInformation15.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation12#mmCategoryPurpose
	 * PaymentTypeInformation12.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation18#mmCategoryPurpose
	 * PaymentTypeInformation18.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation13#mmCategoryPurpose
	 * PaymentTypeInformation13.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation10#mmCategoryPurpose
	 * PaymentTypeInformation10.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation16#mmCategoryPurpose
	 * PaymentTypeInformation16.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation14#mmCategoryPurpose
	 * PaymentTypeInformation14.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation11#mmCategoryPurpose
	 * PaymentTypeInformation11.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#mmCategoryPurpose
	 * PaymentTypeInformation17.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#mmPurpose
	 * DirectDebitTransactionInformation7.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmPurpose
	 * DirectDebitTransactionInformation6.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmPurpose
	 * DirectDebitTransactionInformation8.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmPurpose
	 * DirectDebitTransactionInformation17.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#mmPurpose
	 * DirectDebitTransactionInformation18.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmPurpose
	 * DirectDebitTransactionInformation20.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#mmPurpose
	 * DirectDebitTransactionInformation19.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmPurpose
	 * DirectDebitTransactionInformation21.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#mmCategoryPurpose
	 * MandateTypeInformation2.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateClassification1Choice#mmCode
	 * MandateClassification1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateClassification1Choice#mmProprietary
	 * MandateClassification1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmPurpose
	 * DirectDebitTransactionInformation22.mmPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the high level purpose of the instruction based on a set of pre-defined categories."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentProcessing, PaymentCategoryPurposeCode> mmCategoryPurpose = new MMBusinessAttribute<PaymentProcessing, PaymentCategoryPurposeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTypeInformation1.mmCategoryPurpose, CategoryPurpose1Choice.mmCode, CategoryPurpose1Choice.mmProprietary, PaymentTypeInformation19.mmCategoryPurpose,
					PaymentTypeInformation2.mmCategoryPurpose, DirectDebitTransactionInformation1.mmPurpose, PaymentTypeInformation20.mmCategoryPurpose, DirectDebitTransactionInformation9.mmPurpose,
					PaymentTypeInformation24.mmCategoryPurpose, DirectDebitTransactionInformation11.mmPurpose, DirectDebitTransactionInformation13.mmPurpose, PaymentTypeInformation6.mmCategoryPurpose,
					PaymentTypeInformation4.mmCategoryPurpose, PaymentTypeInformation22.mmCategoryPurpose, PaymentTypeInformation25.mmCategoryPurpose, PaymentTypeInformation3.mmCategoryPurpose, PaymentTypeInformation21.mmCategoryPurpose,
					DirectDebitTransactionInformation2.mmPurpose, DirectDebitTransactionInformation10.mmPurpose, DirectDebitTransactionInformation12.mmPurpose, DirectDebitTransactionInformation14.mmPurpose,
					PaymentTypeInformation15.mmCategoryPurpose, PaymentTypeInformation12.mmCategoryPurpose, PaymentTypeInformation18.mmCategoryPurpose, PaymentTypeInformation13.mmCategoryPurpose, PaymentTypeInformation10.mmCategoryPurpose,
					PaymentTypeInformation16.mmCategoryPurpose, PaymentTypeInformation14.mmCategoryPurpose, PaymentTypeInformation11.mmCategoryPurpose, PaymentTypeInformation17.mmCategoryPurpose,
					DirectDebitTransactionInformation7.mmPurpose, DirectDebitTransactionInformation6.mmPurpose, DirectDebitTransactionInformation8.mmPurpose, DirectDebitTransactionInformation17.mmPurpose,
					DirectDebitTransactionInformation18.mmPurpose, DirectDebitTransactionInformation20.mmPurpose, DirectDebitTransactionInformation19.mmPurpose, DirectDebitTransactionInformation21.mmPurpose,
					MandateTypeInformation2.mmCategoryPurpose, MandateClassification1Choice.mmCode, MandateClassification1Choice.mmProprietary, DirectDebitTransactionInformation22.mmPurpose);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CategoryPurpose";
			definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentCategoryPurposeCode.mmObject();
		}

		@Override
		public PaymentCategoryPurposeCode getValue(PaymentProcessing obj) {
			return obj.getCategoryPurpose();
		}

		@Override
		public void setValue(PaymentProcessing obj, PaymentCategoryPurposeCode value) {
			obj.setCategoryPurpose(value);
		}
	};
	protected PaymentExecution paymentExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
	 * PaymentExecution.mmProcessingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment execution process for which processing parameters are specified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentProcessing, Optional<PaymentExecution>> mmPaymentExecution = new MMBusinessAssociationEnd<PaymentProcessing, Optional<PaymentExecution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Payment execution process for which processing parameters are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentExecution.mmProcessingInstructions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentExecution.mmObject();
		}

		@Override
		public Optional<PaymentExecution> getValue(PaymentProcessing obj) {
			return obj.getPaymentExecution();
		}

		@Override
		public void setValue(PaymentProcessing obj, Optional<PaymentExecution> value) {
			obj.setPaymentExecution(value.orElse(null));
		}
	};
	protected SequenceTypeCode sequenceType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation2#mmSequenceType
	 * PaymentTypeInformation2.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation20#mmSequenceType
	 * PaymentTypeInformation20.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#mmSequenceType
	 * PaymentTypeInformation24.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation6#mmSequenceType
	 * PaymentTypeInformation6.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation4#mmSequenceType
	 * PaymentTypeInformation4.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation22#mmSequenceType
	 * PaymentTypeInformation22.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#mmSequenceType
	 * PaymentTypeInformation25.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences1#mmSequenceType
	 * MandateOccurrences1.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#mmSequenceType
	 * MandateOccurrences2.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation9#mmSequenceType
	 * PaymentTypeInformation9.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation15#mmSequenceType
	 * PaymentTypeInformation15.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation12#mmSequenceType
	 * PaymentTypeInformation12.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation18#mmSequenceType
	 * PaymentTypeInformation18.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation8#mmSequenceType
	 * PaymentTypeInformation8.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation14#mmSequenceType
	 * PaymentTypeInformation14.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation11#mmSequenceType
	 * PaymentTypeInformation11.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#mmSequenceType
	 * PaymentTypeInformation17.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#mmSequenceType
	 * MandateOccurrences3.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmSequenceType
	 * MandateOccurrences4.mmSequenceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the payment sequence where applicable."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentProcessing, SequenceTypeCode> mmSequenceType = new MMBusinessAttribute<PaymentProcessing, SequenceTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTypeInformation2.mmSequenceType, PaymentTypeInformation20.mmSequenceType, PaymentTypeInformation24.mmSequenceType, PaymentTypeInformation6.mmSequenceType,
					PaymentTypeInformation4.mmSequenceType, PaymentTypeInformation22.mmSequenceType, PaymentTypeInformation25.mmSequenceType, MandateOccurrences1.mmSequenceType, MandateOccurrences2.mmSequenceType,
					PaymentTypeInformation9.mmSequenceType, PaymentTypeInformation15.mmSequenceType, PaymentTypeInformation12.mmSequenceType, PaymentTypeInformation18.mmSequenceType, PaymentTypeInformation8.mmSequenceType,
					PaymentTypeInformation14.mmSequenceType, PaymentTypeInformation11.mmSequenceType, PaymentTypeInformation17.mmSequenceType, MandateOccurrences3.mmSequenceType, MandateOccurrences4.mmSequenceType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SequenceType";
			definition = "Identifies the payment sequence where applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SequenceTypeCode.mmObject();
		}

		@Override
		public SequenceTypeCode getValue(PaymentProcessing obj) {
			return obj.getSequenceType();
		}

		@Override
		public void setValue(PaymentProcessing obj, SequenceTypeCode value) {
			obj.setSequenceType(value);
		}
	};
	protected DirectDebitMandate relatedMandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmMandatePaymentType
	 * DirectDebitMandate.mmMandatePaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mandate for which payment processing parametres are specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentProcessing, Optional<DirectDebitMandate>> mmRelatedMandate = new MMBusinessAssociationEnd<PaymentProcessing, Optional<DirectDebitMandate>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMandate";
			definition = "Mandate for which payment processing parametres are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> DirectDebitMandate.mmMandatePaymentType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DirectDebitMandate.mmObject();
		}

		@Override
		public Optional<DirectDebitMandate> getValue(PaymentProcessing obj) {
			return obj.getRelatedMandate();
		}

		@Override
		public void setValue(PaymentProcessing obj, Optional<DirectDebitMandate> value) {
			obj.setRelatedMandate(value.orElse(null));
		}
	};
	protected List<BankTransaction> bankTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmRelatedPayment
	 * BankTransaction.mmRelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code of the underlying bank transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentProcessing, List<BankTransaction>> mmBankTransaction = new MMBusinessAssociationEnd<PaymentProcessing, List<BankTransaction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankTransaction";
			definition = "Code of the underlying bank transaction.";
			minOccurs = 0;
			opposite_lazy = () -> BankTransaction.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BankTransaction.mmObject();
		}

		@Override
		public List<BankTransaction> getValue(PaymentProcessing obj) {
			return obj.getBankTransaction();
		}

		@Override
		public void setValue(PaymentProcessing obj, List<BankTransaction> value) {
			obj.setBankTransaction(value);
		}
	};
	protected List<ContactPoint> contactPoint;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedPayment
	 * ContactPoint.mmRelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the notification method to be used to inform the beneficiary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentProcessing, List<ContactPoint>> mmContactPoint = new MMBusinessAssociationEnd<PaymentProcessing, List<ContactPoint>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Specifies the notification method to be used to inform the beneficiary.";
			minOccurs = 0;
			opposite_lazy = () -> ContactPoint.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}

		@Override
		public List<ContactPoint> getValue(PaymentProcessing obj) {
			return obj.getContactPoint();
		}

		@Override
		public void setValue(PaymentProcessing obj, List<ContactPoint> value) {
			obj.setContactPoint(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentProcessing";
				definition = "Specifies how a payment must be processed, for instance through which specific clearing channel.";
				associationDomain_lazy = () -> Arrays.asList(ContactPoint.mmRelatedPayment, PaymentExecution.mmProcessingInstructions, BankTransaction.mmRelatedPayment, ServiceLevel.mmPaymentProcessing,
						DirectDebitMandate.mmMandatePaymentType);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentProcessing.mmPriority, com.tools20022.repository.entity.PaymentProcessing.mmServiceLevel,
						com.tools20022.repository.entity.PaymentProcessing.mmClearingChannel, com.tools20022.repository.entity.PaymentProcessing.mmLocalInstrument, com.tools20022.repository.entity.PaymentProcessing.mmCategoryPurpose,
						com.tools20022.repository.entity.PaymentProcessing.mmPaymentExecution, com.tools20022.repository.entity.PaymentProcessing.mmSequenceType, com.tools20022.repository.entity.PaymentProcessing.mmRelatedMandate,
						com.tools20022.repository.entity.PaymentProcessing.mmBankTransaction, com.tools20022.repository.entity.PaymentProcessing.mmContactPoint);
				derivationComponent_lazy = () -> Arrays.asList(LocalInstrument1Choice.mmObject(), PaymentTypeInformation1.mmObject(), LocalInstrument2Choice.mmObject(), PaymentTypeInformation19.mmObject(),
						PaymentTypeInformation2.mmObject(), PaymentTypeInformation20.mmObject(), PaymentTypeInformation24.mmObject(), PaymentTypeInformation6.mmObject(), PaymentTypeInformation4.mmObject(),
						PaymentTypeInformation22.mmObject(), PaymentTypeInformation25.mmObject(), PaymentTypeInformation3.mmObject(), PaymentTypeInformation21.mmObject(), PaymentTypeInformation5.mmObject(),
						PaymentTypeInformation23.mmObject(), LocalInstrument1.mmObject(), PaymentTypeInformation9.mmObject(), PaymentTypeInformation15.mmObject(), PaymentTypeInformation12.mmObject(), PaymentTypeInformation18.mmObject(),
						PaymentTypeInformation7.mmObject(), PaymentTypeInformation13.mmObject(), PaymentTypeInformation10.mmObject(), PaymentTypeInformation16.mmObject(), PaymentTypeInformation8.mmObject(),
						PaymentTypeInformation14.mmObject(), PaymentTypeInformation11.mmObject(), PaymentTypeInformation17.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentProcessing.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PriorityCode getPriority() {
		return priority;
	}

	public PaymentProcessing setPriority(PriorityCode priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}

	public Optional<ServiceLevel> getServiceLevel() {
		return serviceLevel == null ? Optional.empty() : Optional.of(serviceLevel);
	}

	public PaymentProcessing setServiceLevel(ServiceLevel serviceLevel) {
		this.serviceLevel = serviceLevel;
		return this;
	}

	public ClearingChannelCode getClearingChannel() {
		return clearingChannel;
	}

	public PaymentProcessing setClearingChannel(ClearingChannelCode clearingChannel) {
		this.clearingChannel = Objects.requireNonNull(clearingChannel);
		return this;
	}

	public ExternalCode getLocalInstrument() {
		return localInstrument;
	}

	public PaymentProcessing setLocalInstrument(ExternalCode localInstrument) {
		this.localInstrument = Objects.requireNonNull(localInstrument);
		return this;
	}

	public PaymentCategoryPurposeCode getCategoryPurpose() {
		return categoryPurpose;
	}

	public PaymentProcessing setCategoryPurpose(PaymentCategoryPurposeCode categoryPurpose) {
		this.categoryPurpose = Objects.requireNonNull(categoryPurpose);
		return this;
	}

	public Optional<PaymentExecution> getPaymentExecution() {
		return paymentExecution == null ? Optional.empty() : Optional.of(paymentExecution);
	}

	public PaymentProcessing setPaymentExecution(PaymentExecution paymentExecution) {
		this.paymentExecution = paymentExecution;
		return this;
	}

	public SequenceTypeCode getSequenceType() {
		return sequenceType;
	}

	public PaymentProcessing setSequenceType(SequenceTypeCode sequenceType) {
		this.sequenceType = Objects.requireNonNull(sequenceType);
		return this;
	}

	public Optional<DirectDebitMandate> getRelatedMandate() {
		return relatedMandate == null ? Optional.empty() : Optional.of(relatedMandate);
	}

	public PaymentProcessing setRelatedMandate(DirectDebitMandate relatedMandate) {
		this.relatedMandate = relatedMandate;
		return this;
	}

	public List<BankTransaction> getBankTransaction() {
		return bankTransaction == null ? bankTransaction = new ArrayList<>() : bankTransaction;
	}

	public PaymentProcessing setBankTransaction(List<BankTransaction> bankTransaction) {
		this.bankTransaction = Objects.requireNonNull(bankTransaction);
		return this;
	}

	public List<ContactPoint> getContactPoint() {
		return contactPoint == null ? contactPoint = new ArrayList<>() : contactPoint;
	}

	public PaymentProcessing setContactPoint(List<ContactPoint> contactPoint) {
		this.contactPoint = Objects.requireNonNull(contactPoint);
		return this;
	}
}