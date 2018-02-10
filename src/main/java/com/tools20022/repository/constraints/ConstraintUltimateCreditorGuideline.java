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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * UltimateCreditor may only be present if different from Creditor.
 */
public class ConstraintUltimateCreditorGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation1> forCreditTransferTransactionInformation1 = new MMConstraint<CreditTransferTransactionInformation1>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransactionInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransactionInformation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10
	 * CreditTransferTransactionInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation10> forCreditTransferTransactionInformation10 = new MMConstraint<CreditTransferTransactionInformation10>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransactionInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransactionInformation10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1
	 * CreditTransferTransaction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction1> forCreditTransferTransaction1 = new MMConstraint<CreditTransferTransaction1>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransaction1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6
	 * CreditTransferTransaction6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction20
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction20}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction6> forCreditTransferTransaction6 = new MMConstraint<CreditTransferTransaction6>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction20);
			owner_lazy = () -> CreditTransferTransaction6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1
	 * DirectDebitTransactionInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation1> forDirectDebitTransactionInformation1 = new MMConstraint<DirectDebitTransactionInformation1>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> DirectDebitTransactionInformation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2
	 * PaymentInstructionInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation2> forPaymentInstructionInformation2 = new MMConstraint<PaymentInstructionInformation2>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkPaymentInstructionInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> PaymentInstructionInformation2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation9> forDirectDebitTransactionInformation9 = new MMConstraint<DirectDebitTransactionInformation9>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> DirectDebitTransactionInformation9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4
	 * PaymentInstructionInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation4> forPaymentInstructionInformation4 = new MMConstraint<PaymentInstructionInformation4>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkPaymentInstructionInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> PaymentInstructionInformation4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11
	 * DirectDebitTransactionInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation11> forDirectDebitTransactionInformation11 = new MMConstraint<DirectDebitTransactionInformation11>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> DirectDebitTransactionInformation11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7
	 * PaymentInstruction7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction7> forPaymentInstruction7 = new MMConstraint<PaymentInstruction7>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkPaymentInstruction7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> PaymentInstruction7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13
	 * DirectDebitTransactionInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forDirectDebitTransactionInformation18
	 * ConstraintUltimateCreditorGuideline.
	 * forDirectDebitTransactionInformation18}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation13> forDirectDebitTransactionInformation13 = new MMConstraint<DirectDebitTransactionInformation13>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forDirectDebitTransactionInformation18);
			owner_lazy = () -> DirectDebitTransactionInformation13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10
	 * PaymentInstruction10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forPaymentInstruction15
	 * ConstraintUltimateCreditorGuideline.forPaymentInstruction15}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction10> forPaymentInstruction10 = new MMConstraint<PaymentInstruction10>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkPaymentInstruction10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forPaymentInstruction15);
			owner_lazy = () -> PaymentInstruction10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2
	 * CreditTransferTransactionInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation2> forCreditTransferTransactionInformation2 = new MMConstraint<CreditTransferTransactionInformation2>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransactionInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransactionInformation2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11
	 * CreditTransferTransactionInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation11> forCreditTransferTransactionInformation11 = new MMConstraint<CreditTransferTransactionInformation11>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransactionInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransactionInformation11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2
	 * CreditTransferTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction2> forCreditTransferTransaction2 = new MMConstraint<CreditTransferTransaction2>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransaction2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7
	 * CreditTransferTransaction7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction19
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction19}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction7> forCreditTransferTransaction7 = new MMConstraint<CreditTransferTransaction7>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction19);
			owner_lazy = () -> CreditTransferTransaction7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2
	 * DirectDebitTransactionInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation2> forDirectDebitTransactionInformation2 = new MMConstraint<DirectDebitTransactionInformation2>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> DirectDebitTransactionInformation2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10
	 * DirectDebitTransactionInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation10> forDirectDebitTransactionInformation10 = new MMConstraint<DirectDebitTransactionInformation10>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> DirectDebitTransactionInformation10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12
	 * DirectDebitTransactionInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation12> forDirectDebitTransactionInformation12 = new MMConstraint<DirectDebitTransactionInformation12>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> DirectDebitTransactionInformation12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14
	 * DirectDebitTransactionInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forDirectDebitTransactionInformation17
	 * ConstraintUltimateCreditorGuideline.
	 * forDirectDebitTransactionInformation17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation14> forDirectDebitTransactionInformation14 = new MMConstraint<DirectDebitTransactionInformation14>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forDirectDebitTransactionInformation17);
			owner_lazy = () -> DirectDebitTransactionInformation14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3
	 * CreditTransferTransactionInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation3> forCreditTransferTransactionInformation3 = new MMConstraint<CreditTransferTransactionInformation3>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransactionInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransactionInformation3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation12> forCreditTransferTransactionInformation12 = new MMConstraint<CreditTransferTransactionInformation12>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransactionInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransactionInformation12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13
	 * CreditTransferTransactionInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation13> forCreditTransferTransactionInformation13 = new MMConstraint<CreditTransferTransactionInformation13>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransactionInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransactionInformation13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction3
	 * CreditTransferTransaction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction18
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction18}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction3> forCreditTransferTransaction3 = new MMConstraint<CreditTransferTransaction3>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction18);
			owner_lazy = () -> CreditTransferTransaction3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4
	 * CreditTransferTransaction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction4> forCreditTransferTransaction4 = new MMConstraint<CreditTransferTransaction4>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransaction4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8
	 * CreditTransferTransaction8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction17
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction8> forCreditTransferTransaction8 = new MMConstraint<CreditTransferTransaction8>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction17);
			owner_lazy = () -> CreditTransferTransaction8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation1
	 * MandateInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateInformation1> forMandateInformation1 = new MMConstraint<MandateInformation1>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkMandateInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> MandateInformation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate1 Mandate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate5
	 * ConstraintUltimateCreditorGuideline.forMandate5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate1> forMandate1 = new MMConstraint<Mandate1>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkMandate1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate5);
			owner_lazy = () -> Mandate1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation3
	 * MandateInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateInformation3> forMandateInformation3 = new MMConstraint<MandateInformation3>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkMandateInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> MandateInformation3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate3 Mandate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate6
	 * ConstraintUltimateCreditorGuideline.forMandate6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate3> forMandate3 = new MMConstraint<Mandate3>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkMandate3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate6);
			owner_lazy = () -> Mandate3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateInformation2> forMandateInformation2 = new MMConstraint<MandateInformation2>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkMandateInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> MandateInformation2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate2 Mandate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate2> forMandate2 = new MMConstraint<Mandate2>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkMandate2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> Mandate2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate4 Mandate4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate7
	 * ConstraintUltimateCreditorGuideline.forMandate7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate4> forMandate4 = new MMConstraint<Mandate4>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkMandate4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate7);
			owner_lazy = () -> Mandate4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation14> forCreditTransferTransactionInformation14 = new MMConstraint<CreditTransferTransactionInformation14>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransactionInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransactionInformation14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5
	 * CreditTransferTransaction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction5> forCreditTransferTransaction5 = new MMConstraint<CreditTransferTransaction5>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransaction5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction21
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction21}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction10> forCreditTransferTransaction10 = new MMConstraint<CreditTransferTransaction10>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction21);
			owner_lazy = () -> CreditTransferTransaction10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9
	 * CreditTransferTransaction9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction9> forCreditTransferTransaction9 = new MMConstraint<CreditTransferTransaction9>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransaction9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8
	 * CreditTransferTransactionInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO2022 Guideline:\nUltimateCreditor may only be present if different from Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation8> forCreditTransferTransactionInformation8 = new MMConstraint<CreditTransferTransactionInformation8>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransactionInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "ISO2022 Guideline:\nUltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransactionInformation8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7
	 * CreditTransferTransactionInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation7> forCreditTransferTransactionInformation7 = new MMConstraint<CreditTransferTransactionInformation7>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransactionInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransactionInformation7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Guideline:\nUltimateCreditor may only be present if different from Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation9> forCreditTransferTransactionInformation9 = new MMConstraint<CreditTransferTransactionInformation9>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransactionInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "ISO20022 Guideline:\nUltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransactionInformation9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6
	 * DirectDebitTransactionInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Guideline:\nUltimateCreditor may only be present if different from Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation6> forDirectDebitTransactionInformation6 = new MMConstraint<DirectDebitTransactionInformation6>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "ISO20022 Guideline:\nUltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> DirectDebitTransactionInformation6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8
	 * DirectDebitTransactionInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Guideline:\nUltimateCreditor may only be present if different from Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation8> forDirectDebitTransactionInformation8 = new MMConstraint<DirectDebitTransactionInformation8>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "ISO20022 Guideline:\nUltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> DirectDebitTransactionInformation8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17
	 * CreditTransferTransaction17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction23
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction8
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction8}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction17> forCreditTransferTransaction17 = new MMConstraint<CreditTransferTransaction17>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction8;
			owner_lazy = () -> CreditTransferTransaction17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19
	 * CreditTransferTransaction19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction25
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction25}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction7
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction7}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction19> forCreditTransferTransaction19 = new MMConstraint<CreditTransferTransaction19>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction25);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction7;
			owner_lazy = () -> CreditTransferTransaction19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17
	 * DirectDebitTransactionInformation17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forDirectDebitTransactionInformation20
	 * ConstraintUltimateCreditorGuideline.
	 * forDirectDebitTransactionInformation20}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forDirectDebitTransactionInformation14
	 * ConstraintUltimateCreditorGuideline.
	 * forDirectDebitTransactionInformation14}</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation17> forDirectDebitTransactionInformation17 = new MMConstraint<DirectDebitTransactionInformation17>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forDirectDebitTransactionInformation20);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forDirectDebitTransactionInformation14;
			owner_lazy = () -> DirectDebitTransactionInformation17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate7 Mandate7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate10
	 * ConstraintUltimateCreditorGuideline.forMandate10}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate4
	 * ConstraintUltimateCreditorGuideline.forMandate4}</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate7> forMandate7 = new MMConstraint<Mandate7>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkMandate7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate10);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate4;
			owner_lazy = () -> Mandate7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forPaymentInstruction18
	 * ConstraintUltimateCreditorGuideline.forPaymentInstruction18}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forPaymentInstruction10
	 * ConstraintUltimateCreditorGuideline.forPaymentInstruction10}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction15> forPaymentInstruction15 = new MMConstraint<PaymentInstruction15>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkPaymentInstruction15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forPaymentInstruction18);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forPaymentInstruction10;
			owner_lazy = () -> PaymentInstruction15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate6 Mandate6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate8
	 * ConstraintUltimateCreditorGuideline.forMandate8}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate3
	 * ConstraintUltimateCreditorGuideline.forMandate3}</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate6> forMandate6 = new MMConstraint<Mandate6>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkMandate6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate8);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate3;
			owner_lazy = () -> Mandate6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate5 Mandate5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate9
	 * ConstraintUltimateCreditorGuideline.forMandate9}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate1
	 * ConstraintUltimateCreditorGuideline.forMandate1}</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate5> forMandate5 = new MMConstraint<Mandate5>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkMandate5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate9);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate1;
			owner_lazy = () -> Mandate5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction18
	 * CreditTransferTransaction18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction24
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction3
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction3}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction18> forCreditTransferTransaction18 = new MMConstraint<CreditTransferTransaction18>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction3;
			owner_lazy = () -> CreditTransferTransaction18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18
	 * DirectDebitTransactionInformation18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forDirectDebitTransactionInformation19
	 * ConstraintUltimateCreditorGuideline.
	 * forDirectDebitTransactionInformation19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forDirectDebitTransactionInformation13
	 * ConstraintUltimateCreditorGuideline.
	 * forDirectDebitTransactionInformation13}</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation18> forDirectDebitTransactionInformation18 = new MMConstraint<DirectDebitTransactionInformation18>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forDirectDebitTransactionInformation19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forDirectDebitTransactionInformation13;
			owner_lazy = () -> DirectDebitTransactionInformation18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20
	 * CreditTransferTransaction20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction26
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction26}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction6
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction6}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction20> forCreditTransferTransaction20 = new MMConstraint<CreditTransferTransaction20>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction26);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction6;
			owner_lazy = () -> CreditTransferTransaction20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21
	 * CreditTransferTransaction21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction22
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction10
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction10}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction21> forCreditTransferTransaction21 = new MMConstraint<CreditTransferTransaction21>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction10;
			owner_lazy = () -> CreditTransferTransaction21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18
	 * PaymentInstruction18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forPaymentInstruction21
	 * ConstraintUltimateCreditorGuideline.forPaymentInstruction21}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forPaymentInstruction15
	 * ConstraintUltimateCreditorGuideline.forPaymentInstruction15}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction18> forPaymentInstruction18 = new MMConstraint<PaymentInstruction18>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkPaymentInstruction18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forPaymentInstruction21);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forPaymentInstruction15;
			owner_lazy = () -> PaymentInstruction18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23
	 * CreditTransferTransaction23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction17
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction17}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction23> forCreditTransferTransaction23 = new MMConstraint<CreditTransferTransaction23>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction17;
			owner_lazy = () -> CreditTransferTransaction23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25
	 * CreditTransferTransaction25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction19
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction19}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction25> forCreditTransferTransaction25 = new MMConstraint<CreditTransferTransaction25>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction19;
			owner_lazy = () -> CreditTransferTransaction25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20
	 * DirectDebitTransactionInformation20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forDirectDebitTransactionInformation21
	 * ConstraintUltimateCreditorGuideline.
	 * forDirectDebitTransactionInformation21}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forDirectDebitTransactionInformation17
	 * ConstraintUltimateCreditorGuideline.
	 * forDirectDebitTransactionInformation17}</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation20> forDirectDebitTransactionInformation20 = new MMConstraint<DirectDebitTransactionInformation20>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forDirectDebitTransactionInformation21);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forDirectDebitTransactionInformation17;
			owner_lazy = () -> DirectDebitTransactionInformation20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24
	 * CreditTransferTransaction24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction18
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction18}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction24> forCreditTransferTransaction24 = new MMConstraint<CreditTransferTransaction24>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction18;
			owner_lazy = () -> CreditTransferTransaction24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26
	 * CreditTransferTransaction26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction20
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction20}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction26> forCreditTransferTransaction26 = new MMConstraint<CreditTransferTransaction26>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction20;
			owner_lazy = () -> CreditTransferTransaction26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19
	 * DirectDebitTransactionInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forDirectDebitTransactionInformation22
	 * ConstraintUltimateCreditorGuideline.
	 * forDirectDebitTransactionInformation22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forDirectDebitTransactionInformation18
	 * ConstraintUltimateCreditorGuideline.
	 * forDirectDebitTransactionInformation18}</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation19> forDirectDebitTransactionInformation19 = new MMConstraint<DirectDebitTransactionInformation19>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forDirectDebitTransactionInformation22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forDirectDebitTransactionInformation18;
			owner_lazy = () -> DirectDebitTransactionInformation19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22
	 * CreditTransferTransaction22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction21
	 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction21}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction22> forCreditTransferTransaction22 = new MMConstraint<CreditTransferTransaction22>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkCreditTransferTransaction22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction21;
			owner_lazy = () -> CreditTransferTransaction22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21
	 * PaymentInstruction21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forPaymentInstruction18
	 * ConstraintUltimateCreditorGuideline.forPaymentInstruction18}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction21> forPaymentInstruction21 = new MMConstraint<PaymentInstruction21>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkPaymentInstruction21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forPaymentInstruction18;
			owner_lazy = () -> PaymentInstruction21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21
	 * DirectDebitTransactionInformation21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forDirectDebitTransactionInformation20
	 * ConstraintUltimateCreditorGuideline.
	 * forDirectDebitTransactionInformation20}</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation21> forDirectDebitTransactionInformation21 = new MMConstraint<DirectDebitTransactionInformation21>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forDirectDebitTransactionInformation20;
			owner_lazy = () -> DirectDebitTransactionInformation21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate10 Mandate10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate7
	 * ConstraintUltimateCreditorGuideline.forMandate7}</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate10> forMandate10 = new MMConstraint<Mandate10>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkMandate10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate7;
			owner_lazy = () -> Mandate10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9 Mandate9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate11
	 * ConstraintUltimateCreditorGuideline.forMandate11}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate5
	 * ConstraintUltimateCreditorGuideline.forMandate5}</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate9> forMandate9 = new MMConstraint<Mandate9>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkMandate9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate11);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate5;
			owner_lazy = () -> Mandate9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate11 Mandate11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate9
	 * ConstraintUltimateCreditorGuideline.forMandate9}</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate11> forMandate11 = new MMConstraint<Mandate11>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkMandate11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate9;
			owner_lazy = () -> Mandate11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22
	 * DirectDebitTransactionInformation22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forDirectDebitTransactionInformation19
	 * ConstraintUltimateCreditorGuideline.
	 * forDirectDebitTransactionInformation19}</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation22> forDirectDebitTransactionInformation22 = new MMConstraint<DirectDebitTransactionInformation22>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkDirectDebitTransactionInformation22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forDirectDebitTransactionInformation19;
			owner_lazy = () -> DirectDebitTransactionInformation22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate8 Mandate8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate6
	 * ConstraintUltimateCreditorGuideline.forMandate6}</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate8> forMandate8 = new MMConstraint<Mandate8>() {
		{
			validator = ConstraintUltimateCreditorGuideline::checkMandate8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate6;
			owner_lazy = () -> Mandate8.mmObject();
		}
	};

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransactionInformation1(CreditTransferTransactionInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransactionInformation10(CreditTransferTransactionInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction1(CreditTransferTransaction1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction6(CreditTransferTransaction6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation1(DirectDebitTransactionInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkPaymentInstructionInformation2(PaymentInstructionInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation9(DirectDebitTransactionInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkPaymentInstructionInformation4(PaymentInstructionInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation11(DirectDebitTransactionInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkPaymentInstruction7(PaymentInstruction7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation13(DirectDebitTransactionInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkPaymentInstruction10(PaymentInstruction10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransactionInformation2(CreditTransferTransactionInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransactionInformation11(CreditTransferTransactionInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction2(CreditTransferTransaction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction7(CreditTransferTransaction7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation2(DirectDebitTransactionInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation10(DirectDebitTransactionInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation12(DirectDebitTransactionInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation14(DirectDebitTransactionInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransactionInformation3(CreditTransferTransactionInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransactionInformation12(CreditTransferTransactionInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransactionInformation13(CreditTransferTransactionInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction3(CreditTransferTransaction3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction4(CreditTransferTransaction4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction8(CreditTransferTransaction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandateInformation1(MandateInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate1(Mandate1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandateInformation3(MandateInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate3(Mandate3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandateInformation2(MandateInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate2(Mandate2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate4(Mandate4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransactionInformation14(CreditTransferTransactionInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction5(CreditTransferTransaction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction10(CreditTransferTransaction10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction9(CreditTransferTransaction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO2022 Guideline: UltimateCreditor may only be present if different from
	 * Creditor.
	 */
	public static void checkCreditTransferTransactionInformation8(CreditTransferTransactionInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransactionInformation7(CreditTransferTransactionInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Guideline: UltimateCreditor may only be present if different
	 * from Creditor.
	 */
	public static void checkCreditTransferTransactionInformation9(CreditTransferTransactionInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Guideline: UltimateCreditor may only be present if different
	 * from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation6(DirectDebitTransactionInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Guideline: UltimateCreditor may only be present if different
	 * from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation8(DirectDebitTransactionInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction17(CreditTransferTransaction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction19(CreditTransferTransaction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation17(DirectDebitTransactionInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate7(Mandate7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkPaymentInstruction15(PaymentInstruction15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate6(Mandate6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate5(Mandate5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction18(CreditTransferTransaction18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation18(DirectDebitTransactionInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction20(CreditTransferTransaction20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction21(CreditTransferTransaction21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkPaymentInstruction18(PaymentInstruction18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction23(CreditTransferTransaction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction25(CreditTransferTransaction25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation20(DirectDebitTransactionInformation20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction24(CreditTransferTransaction24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction26(CreditTransferTransaction26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation19(DirectDebitTransactionInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction22(CreditTransferTransaction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkPaymentInstruction21(PaymentInstruction21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation21(DirectDebitTransactionInformation21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate10(Mandate10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate9(Mandate9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate11(Mandate11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation22(DirectDebitTransactionInformation22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate8(Mandate8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}