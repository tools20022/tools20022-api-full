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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process required for executing an end to end payment. It consists of a
 * payment initiation which may be followed by a series of instructions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentExecution" src="doc-files/PaymentExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#CreditDebitIndicator
 * PaymentExecution.CreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#CreationDate
 * PaymentExecution.CreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#AcceptanceDateTime
 * PaymentExecution.AcceptanceDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#Payment
 * PaymentExecution.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#ProcessingInstructions
 * PaymentExecution.ProcessingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#RequestedExecutionDate
 * PaymentExecution.RequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#RelatedInvestigationCase
 * PaymentExecution.RelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#RelatedInvestigationCaseResolution
 * PaymentExecution.RelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#Next
 * PaymentExecution.Next}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#CurrencyExchange
 * PaymentExecution.CurrencyExchange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PaymentExecution
 * Payment.PaymentExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentInstruction#Previous
 * PaymentInstruction.Previous}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#PaymentExecution
 * PaymentProcessing.PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#PaymentExecution
 * CurrencyExchange.PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingInstruction
 * PaymentInvestigationCase.UnderlyingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#PaymentExecutionCorrection
 * PaymentInvestigationCaseResolution.PaymentExecutionCorrection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification3#PaymentTypeInformation
 * RequestedModification3.PaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification4#PaymentTypeInformation
 * RequestedModification4.PaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification5#PaymentTypeInformation
 * RequestedModification5.PaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification6#PaymentTypeInformation
 * RequestedModification6.PaymentTypeInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentInitiation
 * PaymentInitiation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDates1
 * TransactionDates1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDates2
 * TransactionDates2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader4
 * OriginalGroupHeader4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader3
 * OriginalGroupHeader3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader1
 * OriginalGroupHeader1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader2
 * OriginalGroupHeader2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader5
 * OriginalGroupHeader5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader67 GroupHeader67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader7
 * OriginalGroupHeader7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
 * OriginalGroupHeader6}</li>
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
 * "PaymentExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions."
 * </li>
 * </ul>
 */
public class PaymentExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the payment is a debit or a credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#CreditDebitIndicator
	 * PaymentInstructionReference2Details.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#CreditDebitIndicator
	 * PaymentSearch2.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#CreditDebitIndicator
	 * PaymentSearch3.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#CreditDebitIndicator
	 * PaymentSearch4.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction3#CreditDebitIndicator
	 * Transaction3.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction4#CreditDebitIndicator
	 * Transaction4.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction5#CreditDebitIndicator
	 * Transaction5.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction24#CreditDebitIndicator
	 * Transaction24.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection8#CreditDebitIndicator
	 * AmountAndDirection8.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#CreditDebitIndicator
	 * AmountAndDirection32.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9#CreditDebitIndicator
	 * AmountAndDirection9.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection12#CreditDebitIndicator
	 * AmountAndDirection12.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#CreditDebitIndicator
	 * AmountAndDirection33.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection17#CreditDebitIndicator
	 * AmountAndDirection17.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection24#CreditDebitIndicator
	 * AmountAndDirection24.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection5#CreditDebit
	 * AmountAndDirection5.CreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection4#CreditDebitIndicator
	 * AmountAndDirection4.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2#CreditDebitIndicator
	 * AmountAndDirection2.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection19#CreditDebit
	 * AmountAndDirection19.CreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection13#CreditDebitIndicator
	 * AmountAndDirection13.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#CreditDebitIndicator
	 * AmountAndDirection16.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection7#CreditDebitIndicator
	 * AmountAndDirection7.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection15#CreditDebitIndicator
	 * AmountAndDirection15.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection3#CreditDebit
	 * AmountAndDirection3.CreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection18#CreditDebit
	 * AmountAndDirection18.CreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection1#CreditDebit
	 * AmountAndDirection1.CreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29#CreditDebitIndicator
	 * AmountAndDirection29.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#CreditDebitIndicator
	 * AmountAndDirection28.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection10#CreditDebitIndicator
	 * AmountAndDirection10.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection22#CreditDebitIndicator
	 * AmountAndDirection22.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection23#CreditDebitIndicator
	 * AmountAndDirection23.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection20#CreditDebitIndicator
	 * AmountAndDirection20.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection11#CreditDebitIndicator
	 * AmountAndDirection11.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection25#CreditDebitIndicator
	 * AmountAndDirection25.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection26#CreditDebitIndicator
	 * AmountAndDirection26.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection27#CreditDebitIndicator
	 * AmountAndDirection27.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection21#CreditDebitIndicator
	 * AmountAndDirection21.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#CreditDebitIndicator
	 * PaymentSearch5.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction33#CreditDebitIndicator
	 * Transaction33.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#CreditDebitIndicator
	 * AmountAndDirection36.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#CreditDebitIndicator
	 * AmountAndDirection37.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#CreditDebitIndicator
	 * AmountAndDirection38.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#CreditDebitIndicator
	 * AmountAndDirection40.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#CreditDebitIndicator
	 * AmountAndDirection46.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection49#CreditDebitIndicator
	 * AmountAndDirection49.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection48#CreditDebitIndicator
	 * AmountAndDirection48.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44#CreditDebitIndicator
	 * AmountAndDirection44.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#CreditDebitIndicator
	 * AmountAndDirection45.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection51#CreditDebitIndicator
	 * AmountAndDirection51.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection52#CreditDebitIndicator
	 * AmountAndDirection52.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection47#CreditDebitIndicator
	 * AmountAndDirection47.CreditDebitIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount33#CreditDebit
	 * CashAccount33.CreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection66#CreditDebitIndicator
	 * AmountAndDirection66.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#CreditDebitIndicator
	 * AmountAndDirection60.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection71#CreditDebitIndicator
	 * AmountAndDirection71.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection57#CreditDebitIndicator
	 * AmountAndDirection57.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#CreditDebitIndicator
	 * AmountAndDirection85.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection55#CreditDebitIndicator
	 * AmountAndDirection55.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection59#CreditDebitIndicator
	 * AmountAndDirection59.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection58#CreditDebitIndicator
	 * AmountAndDirection58.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection72#CreditDebitIndicator
	 * AmountAndDirection72.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection67#CreditDebitIndicator
	 * AmountAndDirection67.CreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment is a debit or a credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference2Details.CreditDebitIndicator, com.tools20022.repository.msg.PaymentSearch2.CreditDebitIndicator,
					com.tools20022.repository.msg.PaymentSearch3.CreditDebitIndicator, com.tools20022.repository.msg.PaymentSearch4.CreditDebitIndicator, com.tools20022.repository.msg.Transaction3.CreditDebitIndicator,
					com.tools20022.repository.msg.Transaction4.CreditDebitIndicator, com.tools20022.repository.msg.Transaction5.CreditDebitIndicator, com.tools20022.repository.msg.Transaction24.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection8.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection32.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection9.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection12.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection33.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection17.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection24.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection5.CreditDebit, com.tools20022.repository.msg.AmountAndDirection4.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection2.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection19.CreditDebit, com.tools20022.repository.msg.AmountAndDirection13.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection16.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection7.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection15.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection3.CreditDebit, com.tools20022.repository.msg.AmountAndDirection18.CreditDebit, com.tools20022.repository.msg.AmountAndDirection1.CreditDebit,
					com.tools20022.repository.msg.AmountAndDirection29.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection28.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection10.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection22.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection23.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection20.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection11.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection25.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection26.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection27.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection21.CreditDebitIndicator, com.tools20022.repository.msg.PaymentSearch5.CreditDebitIndicator,
					com.tools20022.repository.msg.Transaction33.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection36.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection37.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection38.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection40.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection46.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection49.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection48.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection44.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection45.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection51.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection52.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection47.CreditDebitIndicator, com.tools20022.repository.msg.CashAccount33.CreditDebit, com.tools20022.repository.msg.AmountAndDirection66.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection60.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection71.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection57.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection85.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection55.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection59.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection58.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection72.CreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection67.CreditDebitIndicator);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the payment is a debit or a credit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Date and time at which the payment execution was created by the
	 * instructing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader23#CreationDateTime
	 * GroupHeader23.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader42#CreationDateTime
	 * GroupHeader42.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader58#CreationDateTime
	 * GroupHeader58.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader1#CreationDateTime
	 * GroupHeader1.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader32#CreationDateTime
	 * GroupHeader32.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#CreationDateTime
	 * GroupHeader48.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader39#CreationDateTime
	 * GroupHeader39.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#CreationDateTime
	 * GroupHeader55.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader7#CreationDateTime
	 * GroupHeader7.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation4#OriginalCreationDateTime
	 * OriginalGroupInformation4.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation23#OriginalCreationDateTime
	 * OriginalGroupInformation23.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3#OriginalCreationDateTime
	 * OriginalGroupInformation3.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader4#OriginalCreationDateTime
	 * OriginalGroupHeader4.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader8#CreationDateTime
	 * GroupHeader8.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation5#OriginalCreationDateTime
	 * OriginalGroupInformation5.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader40#CreationDateTime
	 * GroupHeader40.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation22#OriginalCreationDateTime
	 * OriginalGroupInformation22.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#CreationDateTime
	 * GroupHeader56.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#OriginalCreationDateTime
	 * OriginalGroupHeader3.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader5#CreationDateTime
	 * GroupHeader5.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation1#OriginalCreationDateTime
	 * OriginalGroupInformation1.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader36#CreationDateTime
	 * GroupHeader36.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation20#OriginalCreationDateTime
	 * OriginalGroupInformation20.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#CreationDateTime
	 * GroupHeader52.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#OriginalCreationDateTime
	 * OriginalGroupHeader1.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#CreationDateTime
	 * GroupHeader2.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#CreationDateTime
	 * GroupHeader33.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#CreationDateTime
	 * GroupHeader49.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#CreationDateTime
	 * GroupHeader3.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#CreationDateTime
	 * GroupHeader34.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#CreationDateTime
	 * GroupHeader50.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9#CreationDateTime
	 * GroupHeader9.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader41#CreationDateTime
	 * GroupHeader41.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader57#CreationDateTime
	 * GroupHeader57.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader37#CreationDateTime
	 * GroupHeader37.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader53#CreationDateTime
	 * GroupHeader53.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#CreationDateTime
	 * GroupHeader4.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#CreationDateTime
	 * GroupHeader35.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#CreationDateTime
	 * GroupHeader51.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader31#CreationDateTime
	 * GroupHeader31.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#CreationDateTime
	 * GroupHeader47.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6#CreationDateTime
	 * GroupHeader6.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation2#OriginalCreationDateTime
	 * OriginalGroupInformation2.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader38#CreationDateTime
	 * GroupHeader38.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation21#OriginalCreationDateTime
	 * OriginalGroupInformation21.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader54#CreationDateTime
	 * GroupHeader54.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2#OriginalCreationDateTime
	 * OriginalGroupHeader2.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#CreationDateTime
	 * GroupHeader46.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#OriginalCreationDateTime
	 * OriginalGroupInformation25.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader45#CreationDateTime
	 * GroupHeader45.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader43#CreationDateTime
	 * GroupHeader43.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader59#CreationDateTime
	 * GroupHeader59.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification1#OriginalCreationDateTime
	 * OriginalNotification1.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification4#OriginalCreationDateTime
	 * OriginalNotification4.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader44#CreationDateTime
	 * GroupHeader44.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification2#OriginalCreationDateTime
	 * OriginalNotification2.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification3#OriginalCreationDateTime
	 * OriginalNotification3.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation24#OriginalCreationDateTime
	 * OriginalGroupInformation24.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#OriginalCreationDateTime
	 * OriginalGroupHeader5.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification6#OriginalCreationDateTime
	 * OriginalNotification6.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader60#CreationDateTime
	 * GroupHeader60.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification5#OriginalCreationDateTime
	 * OriginalNotification5.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader63#CreationDateTime
	 * GroupHeader63.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#OriginalCreationDateTime
	 * OriginalGroupInformation15.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation19#OriginalCreationDateTime
	 * OriginalGroupInformation19.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation11#OriginalCreationDateTime
	 * OriginalGroupInformation11.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation18#OriginalCreationDateTime
	 * OriginalGroupInformation18.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#CreationDateTime
	 * GroupHeader19.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#CreationDateTime
	 * GroupHeader24.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#CreationDateTime
	 * GroupHeader20.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#CreationDateTime
	 * GroupHeader25.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#CreationDateTime
	 * GroupHeader15.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#CreationDateTime
	 * GroupHeader26.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17#CreationDateTime
	 * GroupHeader17.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27#CreationDateTime
	 * GroupHeader27.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader22#CreationDateTime
	 * GroupHeader22.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28#CreationDateTime
	 * GroupHeader28.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#CreationDateTime
	 * GroupHeader16.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#CreationDateTime
	 * GroupHeader29.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18#CreationDateTime
	 * GroupHeader18.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30#CreationDateTime
	 * GroupHeader30.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation16#OriginalCreationDateTime
	 * OriginalGroupInformation16.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader12#CreationDateTime
	 * GroupHeader12.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader21#CreationDateTime
	 * GroupHeader21.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader62#CreationDateTime
	 * GroupHeader62.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader67#CreationDateTime
	 * GroupHeader67.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification7#OriginalCreationDateTime
	 * OriginalNotification7.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification8#OriginalCreationDateTime
	 * OriginalNotification8.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#CreationDateTime
	 * GroupHeader70.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification10#OriginalCreationDateTime
	 * OriginalNotification10.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification9#OriginalCreationDateTime
	 * OriginalNotification9.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#CreationDateTime
	 * GroupHeader72.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#CreationDateTime
	 * GroupHeader71.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#OriginalCreationDateTime
	 * OriginalMessage2.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#OriginalCreationDateTime
	 * OriginalMessage3.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation27#OriginalCreationDateTime
	 * OriginalGroupInformation27.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#OriginalCreationDateTime
	 * OriginalGroupHeader7.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#OriginalCreationDateTime
	 * OriginalGroupInformation28.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#OriginalCreationDateTime
	 * OriginalGroupHeader6.OriginalCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the payment execution was created by the instructing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GroupHeader23.CreationDateTime, com.tools20022.repository.msg.GroupHeader42.CreationDateTime, com.tools20022.repository.msg.GroupHeader58.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader1.CreationDateTime, com.tools20022.repository.msg.GroupHeader32.CreationDateTime, com.tools20022.repository.msg.GroupHeader48.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader39.CreationDateTime, com.tools20022.repository.msg.GroupHeader55.CreationDateTime, com.tools20022.repository.msg.GroupHeader7.CreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation4.OriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupInformation23.OriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation3.OriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupHeader4.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader8.CreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation5.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader40.CreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation22.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader56.CreationDateTime,
					com.tools20022.repository.msg.OriginalGroupHeader3.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader5.CreationDateTime, com.tools20022.repository.msg.OriginalGroupInformation1.OriginalCreationDateTime,
					com.tools20022.repository.msg.GroupHeader36.CreationDateTime, com.tools20022.repository.msg.OriginalGroupInformation20.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader52.CreationDateTime,
					com.tools20022.repository.msg.OriginalGroupHeader1.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader2.CreationDateTime, com.tools20022.repository.msg.GroupHeader33.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader49.CreationDateTime, com.tools20022.repository.msg.GroupHeader3.CreationDateTime, com.tools20022.repository.msg.GroupHeader34.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader50.CreationDateTime, com.tools20022.repository.msg.GroupHeader9.CreationDateTime, com.tools20022.repository.msg.GroupHeader41.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader57.CreationDateTime, com.tools20022.repository.msg.GroupHeader37.CreationDateTime, com.tools20022.repository.msg.GroupHeader53.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader4.CreationDateTime, com.tools20022.repository.msg.GroupHeader35.CreationDateTime, com.tools20022.repository.msg.GroupHeader51.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader31.CreationDateTime, com.tools20022.repository.msg.GroupHeader47.CreationDateTime, com.tools20022.repository.msg.GroupHeader6.CreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation2.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader38.CreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation21.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader54.CreationDateTime,
					com.tools20022.repository.msg.OriginalGroupHeader2.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader46.CreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation25.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader45.CreationDateTime, com.tools20022.repository.msg.GroupHeader43.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader59.CreationDateTime, com.tools20022.repository.msg.OriginalNotification1.OriginalCreationDateTime, com.tools20022.repository.msg.OriginalNotification4.OriginalCreationDateTime,
					com.tools20022.repository.msg.GroupHeader44.CreationDateTime, com.tools20022.repository.msg.OriginalNotification2.OriginalCreationDateTime, com.tools20022.repository.msg.OriginalNotification3.OriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation24.OriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupHeader5.OriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalNotification6.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader60.CreationDateTime, com.tools20022.repository.msg.OriginalNotification5.OriginalCreationDateTime,
					com.tools20022.repository.msg.GroupHeader63.CreationDateTime, com.tools20022.repository.msg.OriginalGroupInformation15.OriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation19.OriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupInformation11.OriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation18.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader19.CreationDateTime, com.tools20022.repository.msg.GroupHeader24.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader20.CreationDateTime, com.tools20022.repository.msg.GroupHeader25.CreationDateTime, com.tools20022.repository.msg.GroupHeader15.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader26.CreationDateTime, com.tools20022.repository.msg.GroupHeader17.CreationDateTime, com.tools20022.repository.msg.GroupHeader27.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader22.CreationDateTime, com.tools20022.repository.msg.GroupHeader28.CreationDateTime, com.tools20022.repository.msg.GroupHeader16.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader29.CreationDateTime, com.tools20022.repository.msg.GroupHeader18.CreationDateTime, com.tools20022.repository.msg.GroupHeader30.CreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation16.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader12.CreationDateTime, com.tools20022.repository.msg.GroupHeader21.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader62.CreationDateTime, com.tools20022.repository.msg.GroupHeader67.CreationDateTime, com.tools20022.repository.msg.OriginalNotification7.OriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalNotification8.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader70.CreationDateTime, com.tools20022.repository.msg.OriginalNotification10.OriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalNotification9.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader72.CreationDateTime, com.tools20022.repository.msg.GroupHeader71.CreationDateTime,
					com.tools20022.repository.msg.OriginalMessage2.OriginalCreationDateTime, com.tools20022.repository.msg.OriginalMessage3.OriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation27.OriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupHeader7.OriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation28.OriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupHeader6.OriginalCreationDateTime);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreationDate";
			definition = "Date and time at which the payment execution was created by the instructing agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date and time at which all processing conditions for execution of the
	 * payment are met and adequate financial cover is available at the account
	 * servicing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates1#AcceptanceDateTime
	 * TransactionDates1.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#AcceptanceDateTime
	 * TransactionDates2.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#AcceptanceDateTime
	 * PaymentTransactionInformation1.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#AcceptanceDateTime
	 * PaymentTransactionInformation25.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#AcceptanceDateTime
	 * PaymentTransaction32.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#AcceptanceDateTime
	 * PaymentTransaction46.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#AcceptanceDateTime
	 * CreditTransferTransactionInformation2.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#AcceptanceDateTime
	 * CreditTransferTransactionInformation11.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#AcceptanceDateTime
	 * CreditTransferTransaction2.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#AcceptanceDateTime
	 * CreditTransferTransaction7.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#AcceptanceDateTime
	 * PaymentTransactionInformation26.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#AcceptanceDateTime
	 * PaymentTransaction33.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#AcceptanceDateTime
	 * PaymentTransaction43.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#AcceptanceDateTime
	 * PaymentTransactionInformation34.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#AcceptanceDateTime
	 * PaymentTransaction41.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#AcceptanceDateTime
	 * PaymentTransaction49.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#AcceptanceDateTime
	 * PaymentTransactionInformation15.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#AcceptanceDateTime
	 * PaymentTransactionInformation22.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#AcceptanceDateTime
	 * CreditTransferTransactionInformation7.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#AcceptanceDateTime
	 * CreditTransferTransactionInformation9.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#AcceptanceDateTime
	 * CreditTransferTransaction19.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#AcceptanceDateTime
	 * PaymentTransaction52.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#AcceptanceDateTime
	 * PaymentTransaction57.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#AcceptanceDateTime
	 * PaymentTransaction59.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#AcceptanceDateTime
	 * CreditTransferTransaction25.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#AcceptanceDateTime
	 * PaymentTransaction63.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#AcceptanceDateTime
	 * PaymentTransaction68.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#AcceptanceDateTime
	 * PaymentTransaction69.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#AcceptanceDateTime
	 * PaymentTransaction73.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#AcceptanceDateTime
	 * PaymentTransaction80.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#AcceptanceDateTime
	 * PaymentTransaction83.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#AcceptanceDateTime
	 * PaymentTransaction82.AcceptanceDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptanceDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which all processing conditions for execution of the payment are met and adequate financial cover is available at the account servicing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AcceptanceDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDates1.AcceptanceDateTime, com.tools20022.repository.msg.TransactionDates2.AcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransactionInformation1.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransactionInformation25.AcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransaction32.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction46.AcceptanceDateTime,
					com.tools20022.repository.msg.CreditTransferTransactionInformation2.AcceptanceDateTime, com.tools20022.repository.msg.CreditTransferTransactionInformation11.AcceptanceDateTime,
					com.tools20022.repository.msg.CreditTransferTransaction2.AcceptanceDateTime, com.tools20022.repository.msg.CreditTransferTransaction7.AcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransactionInformation26.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction33.AcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransaction43.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransactionInformation34.AcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransaction41.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction49.AcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransactionInformation15.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransactionInformation22.AcceptanceDateTime,
					com.tools20022.repository.msg.CreditTransferTransactionInformation7.AcceptanceDateTime, com.tools20022.repository.msg.CreditTransferTransactionInformation9.AcceptanceDateTime,
					com.tools20022.repository.msg.CreditTransferTransaction19.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction52.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction57.AcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransaction59.AcceptanceDateTime, com.tools20022.repository.msg.CreditTransferTransaction25.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction63.AcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransaction68.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction69.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction73.AcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransaction80.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction83.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction82.AcceptanceDateTime);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptanceDateTime";
			definition = "Date and time at which all processing conditions for execution of the payment are met and adequate financial cover is available at the account servicing agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the end to end payment which is at the origin of the payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PaymentExecution
	 * Payment.PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#PaymentMethod
	 * PaymentInstructionReference1Details.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#PaymentMethod
	 * PaymentInstructionReference2Details.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#PaymentMethod
	 * LongPaymentIdentification1.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails2#PaymentMethod
	 * PaymentCommonDetails2.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails3#PaymentMethod
	 * PaymentCommonDetails3.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#PaymentMethod
	 * PaymentCommonDetails4.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#PaymentMethod
	 * PaymentCommon1.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction2#TransactionInformation
	 * UnderlyingTransaction2.TransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction5#TransactionInformation
	 * UnderlyingTransaction5.TransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction8#TransactionInformation
	 * UnderlyingTransaction8.TransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification1#OriginalItem
	 * OriginalNotification1.OriginalItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference1#OriginalItem
	 * OriginalNotificationReference1.OriginalItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification2#OriginalItemAndStatus
	 * OriginalNotification2.OriginalItemAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference2#OriginalItemAndStatus
	 * OriginalNotificationReference2.OriginalItemAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction3#TransactionInformationAndStatus
	 * UnderlyingTransaction3.TransactionInformationAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction4#TransactionInformationAndStatus
	 * UnderlyingTransaction4.TransactionInformationAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#OriginalItem
	 * OriginalNotificationReference4.OriginalItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference3#OriginalItemAndStatus
	 * OriginalNotificationReference3.OriginalItemAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2#PaymentMethod
	 * PaymentCommon2.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction10#TransactionInformation
	 * UnderlyingTransaction10.TransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction9#TransactionInformationAndStatus
	 * UnderlyingTransaction9.TransactionInformationAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#OriginalGroupInformation
	 * PaymentTransaction52.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#OriginalItem
	 * OriginalNotificationReference6.OriginalItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference5#OriginalItemAndStatus
	 * OriginalNotificationReference5.OriginalItemAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction13#TransactionInformation
	 * UnderlyingTransaction13.TransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction14#TransactionInformationAndStatus
	 * UnderlyingTransaction14.TransactionInformationAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#OriginalGroupInformation
	 * PaymentTransaction63.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#OriginalItem
	 * OriginalNotificationReference8.OriginalItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#OriginalItemAndStatus
	 * OriginalNotificationReference7.OriginalItemAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#OriginalGroupInformation
	 * PaymentTransaction73.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#OriginalGroupInformation
	 * PaymentTransaction80.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16#TransactionInformation
	 * UnderlyingTransaction16.TransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#TransactionInformationAndStatus
	 * UnderlyingTransaction17.TransactionInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the end to end payment which is at the origin of the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference1Details.PaymentMethod, com.tools20022.repository.msg.PaymentInstructionReference2Details.PaymentMethod,
					com.tools20022.repository.msg.LongPaymentIdentification1.PaymentMethod, com.tools20022.repository.msg.PaymentCommonDetails2.PaymentMethod, com.tools20022.repository.msg.PaymentCommonDetails3.PaymentMethod,
					com.tools20022.repository.msg.PaymentCommonDetails4.PaymentMethod, com.tools20022.repository.msg.PaymentCommon1.PaymentMethod, com.tools20022.repository.msg.UnderlyingTransaction2.TransactionInformation,
					com.tools20022.repository.msg.UnderlyingTransaction5.TransactionInformation, com.tools20022.repository.msg.UnderlyingTransaction8.TransactionInformation, com.tools20022.repository.msg.OriginalNotification1.OriginalItem,
					com.tools20022.repository.msg.OriginalNotificationReference1.OriginalItem, com.tools20022.repository.msg.OriginalNotification2.OriginalItemAndStatus,
					com.tools20022.repository.msg.OriginalNotificationReference2.OriginalItemAndStatus, com.tools20022.repository.msg.UnderlyingTransaction3.TransactionInformationAndStatus,
					com.tools20022.repository.msg.UnderlyingTransaction4.TransactionInformationAndStatus, com.tools20022.repository.msg.OriginalNotificationReference4.OriginalItem,
					com.tools20022.repository.msg.OriginalNotificationReference3.OriginalItemAndStatus, com.tools20022.repository.msg.PaymentCommon2.PaymentMethod,
					com.tools20022.repository.msg.UnderlyingTransaction10.TransactionInformation, com.tools20022.repository.msg.UnderlyingTransaction9.TransactionInformationAndStatus,
					com.tools20022.repository.msg.PaymentTransaction52.OriginalGroupInformation, com.tools20022.repository.msg.OriginalNotificationReference6.OriginalItem,
					com.tools20022.repository.msg.OriginalNotificationReference5.OriginalItemAndStatus, com.tools20022.repository.msg.UnderlyingTransaction13.TransactionInformation,
					com.tools20022.repository.msg.UnderlyingTransaction14.TransactionInformationAndStatus, com.tools20022.repository.msg.PaymentTransaction63.OriginalGroupInformation,
					com.tools20022.repository.msg.OriginalNotificationReference8.OriginalItem, com.tools20022.repository.msg.OriginalNotificationReference7.OriginalItemAndStatus,
					com.tools20022.repository.msg.PaymentTransaction73.OriginalGroupInformation, com.tools20022.repository.msg.PaymentTransaction80.OriginalGroupInformation,
					com.tools20022.repository.msg.UnderlyingTransaction16.TransactionInformation, com.tools20022.repository.msg.UnderlyingTransaction17.TransactionInformationAndStatus);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the end to end payment which is at the origin of the payment instruction.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.PaymentExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies how the payment must be processed, for instance through which
	 * specific clearing channel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#PaymentExecution
	 * PaymentProcessing.PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#PaymentTypeInformation
	 * CreditTransferTransactionInformation1.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#PaymentTypeInformation
	 * PaymentInstructionInformation1.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#PaymentTypeInformation
	 * CreditTransferTransactionInformation10.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3#PaymentTypeInformation
	 * PaymentInstructionInformation3.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#PaymentTypeInformation
	 * CreditTransferTransaction1.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#PaymentTypeInformation
	 * PaymentInstruction6.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#PaymentTypeInformation
	 * CreditTransferTransaction6.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#PaymentTypeInformation
	 * PaymentInstruction9.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2#PaymentTypeInformation
	 * PaymentInstructionInformation2.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4#PaymentTypeInformation
	 * PaymentInstructionInformation4.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7#PaymentTypeInformation
	 * PaymentInstruction7.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#PaymentTypeInformation
	 * PaymentInstruction10.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#PaymentTypeInformation
	 * OriginalTransactionReference1.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#PaymentTypeInformation
	 * OriginalTransactionReference13.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#PaymentTypeInformation
	 * OriginalTransactionReference16.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#PaymentTypeInformation
	 * GroupHeader2.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#PaymentTypeInformation
	 * CreditTransferTransactionInformation2.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#PaymentTypeInformation
	 * GroupHeader33.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#PaymentTypeInformation
	 * CreditTransferTransactionInformation11.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#PaymentTypeInformation
	 * GroupHeader49.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#PaymentTypeInformation
	 * CreditTransferTransaction2.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#PaymentTypeInformation
	 * CreditTransferTransaction7.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#PaymentTypeInformation
	 * GroupHeader3.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#PaymentTypeInformation
	 * GroupHeader34.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#PaymentTypeInformation
	 * GroupHeader50.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#PaymentTypeInformation
	 * GroupHeader4.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#PaymentTypeInformation
	 * CreditTransferTransactionInformation3.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#PaymentTypeInformation
	 * GroupHeader35.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#PaymentTypeInformation
	 * CreditTransferTransactionInformation13.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#PaymentTypeInformation
	 * GroupHeader51.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#PaymentTypeInformation
	 * CreditTransferTransaction4.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#PaymentTypeInformation
	 * CreditTransferTransaction8.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#PaymentTypeInformation
	 * OriginalTransactionReference15.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#PaymentTypeInformation
	 * OriginalTransactionReference17.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference19#PaymentTypeInformation
	 * OriginalTransactionReference19.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#PaymentTypeInformation
	 * CreditTransferTransactionInformation14.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5#PaymentTypeInformation
	 * PaymentInstruction5.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#PaymentTypeInformation
	 * CreditTransferTransaction5.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8#PaymentTypeInformation
	 * PaymentInstruction8.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#PaymentTypeInformation
	 * CreditTransferTransaction10.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#PaymentTypeInformation
	 * PaymentInstruction11.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#PaymentTypeInformation
	 * PaymentComplementaryInformation2.PaymentTypeInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentMeans1#PaymentType
	 * PaymentMeans1.PaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#PaymentTypeInformation
	 * PaymentComplementaryInformation3.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#PaymentTypeInformation
	 * CreditTransferTransaction9.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference7#PaymentTypeInformation
	 * OriginalTransactionReference7.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference10#PaymentTypeInformation
	 * OriginalTransactionReference10.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#PaymentTypeInformation
	 * OriginalTransactionReference9.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#PaymentTypeInformation
	 * OriginalTransactionReference12.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#PaymentTypeInformation
	 * OriginalTransactionReference8.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#PaymentTypeInformation
	 * OriginalTransactionReference11.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation6#PaymentTypeInformation
	 * CreditTransferTransactionInformation6.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#PaymentTypeInformation
	 * CreditTransferTransactionInformation8.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#PaymentTypeInformation
	 * CreditTransferTransactionInformation7.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#PaymentTypeInformation
	 * CreditTransferTransactionInformation9.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#PaymentTypeInformation
	 * GroupHeader19.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#PaymentTypeInformation
	 * GroupHeader24.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#PaymentTypeInformation
	 * GroupHeader20.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#PaymentTypeInformation
	 * GroupHeader25.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#PaymentTypeInformation
	 * GroupHeader15.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#PaymentTypeInformation
	 * GroupHeader26.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#PaymentTypeInformation
	 * GroupHeader16.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#PaymentTypeInformation
	 * GroupHeader29.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#PaymentTypeInformation
	 * OriginalPaymentInformation6.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#PaymentTypeInformation
	 * PaymentInstruction16.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#PaymentTypeInformation
	 * PaymentComplementaryInformation4.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#PaymentTypeInformation
	 * CreditTransferTransaction17.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#PaymentTypeInformation
	 * CreditTransferTransaction19.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#PaymentTypeInformation
	 * PaymentInstruction15.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#PaymentTypeInformation
	 * OriginalTransactionReference20.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#PaymentTypeInformation
	 * CreditTransferTransaction20.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#PaymentTypeInformation
	 * PaymentInstruction17.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference21#PaymentTypeInformation
	 * OriginalTransactionReference21.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#PaymentTypeInformation
	 * CreditTransferTransaction21.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#PaymentTypeInformation
	 * PaymentInstruction18.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#PaymentTypeInformation
	 * CreditTransferTransaction23.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#PaymentTypeInformation
	 * GroupHeader70.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#PaymentTypeInformation
	 * CreditTransferTransaction25.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#PaymentTypeInformation
	 * PaymentInstruction19.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#PaymentTypeInformation
	 * PaymentComplementaryInformation5.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#PaymentTypeInformation
	 * PaymentInstruction20.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#PaymentTypeInformation
	 * OriginalTransactionReference22.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#PaymentTypeInformation
	 * CreditTransferTransaction26.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#PaymentTypeInformation
	 * CreditTransferTransaction22.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference23#PaymentTypeInformation
	 * OriginalTransactionReference23.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#PaymentTypeInformation
	 * PaymentInstruction21.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#PaymentTypeInformation
	 * PaymentInstruction23.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#PaymentTypeInformation
	 * PaymentInstruction22.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#PaymentTypeInformation
	 * OriginalTransactionReference24.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#PaymentTypeInformation
	 * OriginalPaymentInformation7.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#PaymentTypeInformation
	 * OriginalTransactionReference26.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#PaymentTypeInformation
	 * PaymentComplementaryInformation6.PaymentTypeInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the payment must be processed, for instance through which specific clearing channel."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProcessingInstructions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransactionInformation1.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstructionInformation1.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation10.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstructionInformation3.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction1.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction6.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction6.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction9.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstructionInformation2.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstructionInformation4.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstruction7.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction10.PaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference1.PaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference13.PaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference16.PaymentTypeInformation, com.tools20022.repository.msg.GroupHeader2.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation2.PaymentTypeInformation, com.tools20022.repository.msg.GroupHeader33.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation11.PaymentTypeInformation, com.tools20022.repository.msg.GroupHeader49.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction2.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction7.PaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader3.PaymentTypeInformation, com.tools20022.repository.msg.GroupHeader34.PaymentTypeInformation, com.tools20022.repository.msg.GroupHeader50.PaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader4.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation3.PaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader35.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation13.PaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader51.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction4.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction8.PaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference15.PaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference17.PaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference19.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation14.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction5.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction5.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction8.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction10.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction11.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentComplementaryInformation2.PaymentTypeInformation, com.tools20022.repository.msg.PaymentMeans1.PaymentType,
					com.tools20022.repository.msg.PaymentComplementaryInformation3.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction9.PaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference7.PaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference10.PaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference9.PaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference12.PaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference8.PaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference11.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation6.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation8.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation7.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation9.PaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader19.PaymentTypeInformation, com.tools20022.repository.msg.GroupHeader24.PaymentTypeInformation, com.tools20022.repository.msg.GroupHeader20.PaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader25.PaymentTypeInformation, com.tools20022.repository.msg.GroupHeader15.PaymentTypeInformation, com.tools20022.repository.msg.GroupHeader26.PaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader16.PaymentTypeInformation, com.tools20022.repository.msg.GroupHeader29.PaymentTypeInformation, com.tools20022.repository.msg.OriginalPaymentInformation6.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstruction16.PaymentTypeInformation, com.tools20022.repository.msg.PaymentComplementaryInformation4.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction17.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction19.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstruction15.PaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference20.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction20.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction17.PaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference21.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction21.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstruction18.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction23.PaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader70.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction25.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstruction19.PaymentTypeInformation, com.tools20022.repository.msg.PaymentComplementaryInformation5.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstruction20.PaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference22.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction26.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction22.PaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference23.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction21.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstruction23.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction22.PaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference24.PaymentTypeInformation, com.tools20022.repository.msg.OriginalPaymentInformation7.PaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference26.PaymentTypeInformation, com.tools20022.repository.msg.PaymentComplementaryInformation6.PaymentTypeInformation);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingInstructions";
			definition = "Specifies how the payment must be processed, for instance through which specific clearing channel.";
			minOccurs = 0;
			type_lazy = () -> PaymentProcessing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.PaymentExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date at which the initiating party requests the clearing agent to process
	 * the payment. <br>
	 * Usage: This is the date on which the debtor's account is to be debited.
	 * If payment by cheque, the date when the cheque must be generated by the
	 * bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction3#RequestedExecutionDateTime
	 * PaymentInstruction3.RequestedExecutionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#RequestedExecutionDate
	 * PaymentCommon1.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#RequestedExecutionDate
	 * PaymentInstruction1.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#RequestedExecutionDate
	 * PaymentInstructionInformation1.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#RequestedExecutionDate
	 * PaymentInstruction6.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#RequestedExecutionDate
	 * PaymentInstruction9.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2#RequestedCollectionDate
	 * PaymentInstructionInformation2.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4#RequestedCollectionDate
	 * PaymentInstructionInformation4.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7#RequestedCollectionDate
	 * PaymentInstruction7.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#RequestedCollectionDate
	 * PaymentInstruction10.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#OriginalRequestedExecutionDate
	 * PaymentTransactionInformation30.OriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#OriginalRequestedCollectionDate
	 * PaymentTransactionInformation30.OriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5#RequestedExecutionDate
	 * PaymentInstruction5.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8#RequestedExecutionDate
	 * PaymentInstruction8.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#RequestedExecutionDate
	 * PaymentInstruction11.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#RequestedExecutionDate
	 * PaymentInstructionExtract2.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract#RequestedExecutionDate
	 * CorrectivePaymentInstructionExtract.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#RequestedExecutionDate
	 * UnderlyingPaymentInstruction1.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#RequestedExecutionDate
	 * PaymentComplementaryInformation2.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#RequestedCollectionDate
	 * PaymentComplementaryInformation2.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#OriginalRequestedExecutionDate
	 * PaymentTransactionInformation32.OriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#OriginalRequestedCollectionDate
	 * PaymentTransactionInformation32.OriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1#RequestedExecutionDate
	 * CorrectivePaymentInitiation1.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#RequestedExecutionDate
	 * UnderlyingPaymentInstruction2.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#RequestedExecutionDate
	 * PaymentComplementaryInformation3.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#RequestedCollectionDate
	 * PaymentComplementaryInformation3.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction13#RequestedExecutionDateTime
	 * PaymentInstruction13.RequestedExecutionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2#RequestedExecutionDate
	 * PaymentCommon2.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#RequestedExecutionDate
	 * PaymentInstruction14.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#RequestedExecutionDate
	 * OriginalPaymentInformation6.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#RequestedExecutionDate
	 * PaymentInstruction16.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#RequestedExecutionDate
	 * PaymentComplementaryInformation4.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#RequestedCollectionDate
	 * PaymentComplementaryInformation4.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#RequestedCollectionDate
	 * PaymentInstruction15.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#RequestedExecutionDate
	 * PaymentInstruction17.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#RequestedCollectionDate
	 * PaymentInstruction18.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#RequestedExecutionDate
	 * PaymentInstruction19.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#RequestedExecutionDate
	 * PaymentComplementaryInformation5.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#RequestedCollectionDate
	 * PaymentComplementaryInformation5.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#RequestedExecutionDate
	 * PaymentInstruction20.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#RequestedCollectionDate
	 * PaymentInstruction21.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#RequestedExecutionDate
	 * PaymentInstruction23.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#RequestedExecutionDate
	 * PaymentInstruction22.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#RequestedExecutionDate
	 * OriginalPaymentInformation7.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#RequestedExecutionDate
	 * CorrectivePaymentInitiation2.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#RequestedExecutionDate
	 * UnderlyingPaymentInstruction3.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#RequestedExecutionDate
	 * PaymentComplementaryInformation6.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#RequestedCollectionDate
	 * PaymentComplementaryInformation6.RequestedCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the initiating party requests the clearing agent to process the payment. \r\nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedExecutionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction3.RequestedExecutionDateTime, com.tools20022.repository.msg.PaymentCommon1.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction1.RequestedExecutionDate, com.tools20022.repository.msg.PaymentInstructionInformation1.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction6.RequestedExecutionDate, com.tools20022.repository.msg.PaymentInstruction9.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstructionInformation2.RequestedCollectionDate, com.tools20022.repository.msg.PaymentInstructionInformation4.RequestedCollectionDate,
					com.tools20022.repository.msg.PaymentInstruction7.RequestedCollectionDate, com.tools20022.repository.msg.PaymentInstruction10.RequestedCollectionDate,
					com.tools20022.repository.msg.PaymentTransactionInformation30.OriginalRequestedExecutionDate, com.tools20022.repository.msg.PaymentTransactionInformation30.OriginalRequestedCollectionDate,
					com.tools20022.repository.msg.PaymentInstruction5.RequestedExecutionDate, com.tools20022.repository.msg.PaymentInstruction8.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction11.RequestedExecutionDate, com.tools20022.repository.msg.PaymentInstructionExtract2.RequestedExecutionDate,
					com.tools20022.repository.msg.CorrectivePaymentInstructionExtract.RequestedExecutionDate, com.tools20022.repository.msg.UnderlyingPaymentInstruction1.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation2.RequestedExecutionDate, com.tools20022.repository.msg.PaymentComplementaryInformation2.RequestedCollectionDate,
					com.tools20022.repository.msg.PaymentTransactionInformation32.OriginalRequestedExecutionDate, com.tools20022.repository.msg.PaymentTransactionInformation32.OriginalRequestedCollectionDate,
					com.tools20022.repository.msg.CorrectivePaymentInitiation1.RequestedExecutionDate, com.tools20022.repository.msg.UnderlyingPaymentInstruction2.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation3.RequestedExecutionDate, com.tools20022.repository.msg.PaymentComplementaryInformation3.RequestedCollectionDate,
					com.tools20022.repository.msg.PaymentInstruction13.RequestedExecutionDateTime, com.tools20022.repository.msg.PaymentCommon2.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction14.RequestedExecutionDate, com.tools20022.repository.msg.OriginalPaymentInformation6.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction16.RequestedExecutionDate, com.tools20022.repository.msg.PaymentComplementaryInformation4.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation4.RequestedCollectionDate, com.tools20022.repository.msg.PaymentInstruction15.RequestedCollectionDate,
					com.tools20022.repository.msg.PaymentInstruction17.RequestedExecutionDate, com.tools20022.repository.msg.PaymentInstruction18.RequestedCollectionDate,
					com.tools20022.repository.msg.PaymentInstruction19.RequestedExecutionDate, com.tools20022.repository.msg.PaymentComplementaryInformation5.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation5.RequestedCollectionDate, com.tools20022.repository.msg.PaymentInstruction20.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction21.RequestedCollectionDate, com.tools20022.repository.msg.PaymentInstruction23.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction22.RequestedExecutionDate, com.tools20022.repository.msg.OriginalPaymentInformation7.RequestedExecutionDate,
					com.tools20022.repository.msg.CorrectivePaymentInitiation2.RequestedExecutionDate, com.tools20022.repository.msg.UnderlyingPaymentInstruction3.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.RequestedExecutionDate, com.tools20022.repository.msg.PaymentComplementaryInformation6.RequestedCollectionDate);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the initiating party requests the clearing agent to process the payment. \r\nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Investigation case assigned to the payment execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingInstruction
	 * PaymentInvestigationCase.UnderlyingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation23#Case
	 * OriginalGroupInformation23.Case}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader4#Case
	 * OriginalGroupHeader4.Case}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#ResolvedCase
	 * OriginalGroupHeader5.ResolvedCase}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#Case
	 * OriginalGroupHeader6.Case}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investigation case assigned to the payment execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupInformation23.Case, com.tools20022.repository.msg.OriginalGroupHeader4.Case, com.tools20022.repository.msg.OriginalGroupHeader5.ResolvedCase,
					com.tools20022.repository.msg.OriginalGroupHeader6.Case);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Investigation case assigned to the payment execution.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment investigation case resolution which is the source of the
	 * corrected payment execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#PaymentExecutionCorrection
	 * PaymentInvestigationCaseResolution.PaymentExecutionCorrection}</li>
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
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment investigation case resolution which is the source of the corrected payment execution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Payment investigation case resolution which is the source of the corrected payment execution.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentExecutionCorrection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the next payment instruction in the payment end-to-end chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#Previous
	 * PaymentInstruction.Previous}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Next"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the next payment instruction in the payment end-to-end chain."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Next = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Next";
			definition = "Specifies the next payment instruction in the payment end-to-end chain.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.Previous;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Rate used to transform the original amount into the credited amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#PaymentExecution
	 * CurrencyExchange.PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to transform the original amount into the credited amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Rate used to transform the original amount into the credited amount.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.PaymentExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentExecution";
				definition = "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.PaymentExecution, com.tools20022.repository.entity.PaymentInstruction.Previous,
						com.tools20022.repository.entity.PaymentProcessing.PaymentExecution, com.tools20022.repository.entity.CurrencyExchange.PaymentExecution,
						com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingInstruction, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentExecutionCorrection);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestedModification3.PaymentTypeInformation, com.tools20022.repository.msg.RequestedModification4.PaymentTypeInformation,
						com.tools20022.repository.msg.RequestedModification5.PaymentTypeInformation, com.tools20022.repository.msg.RequestedModification6.PaymentTypeInformation);
				subType_lazy = () -> Arrays.asList(PaymentInstruction.mmObject(), PaymentInitiation.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentExecution.CreditDebitIndicator, com.tools20022.repository.entity.PaymentExecution.CreationDate,
						com.tools20022.repository.entity.PaymentExecution.AcceptanceDateTime, com.tools20022.repository.entity.PaymentExecution.Payment, com.tools20022.repository.entity.PaymentExecution.ProcessingInstructions,
						com.tools20022.repository.entity.PaymentExecution.RequestedExecutionDate, com.tools20022.repository.entity.PaymentExecution.RelatedInvestigationCase,
						com.tools20022.repository.entity.PaymentExecution.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.PaymentExecution.Next, com.tools20022.repository.entity.PaymentExecution.CurrencyExchange);
				derivationComponent_lazy = () -> Arrays.asList(TransactionDates1.mmObject(), TransactionDates2.mmObject(), OriginalGroupHeader4.mmObject(), OriginalGroupHeader3.mmObject(), OriginalGroupHeader1.mmObject(),
						OriginalGroupHeader2.mmObject(), OriginalGroupHeader5.mmObject(), GroupHeader67.mmObject(), OriginalGroupHeader7.mmObject(), OriginalGroupHeader6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}