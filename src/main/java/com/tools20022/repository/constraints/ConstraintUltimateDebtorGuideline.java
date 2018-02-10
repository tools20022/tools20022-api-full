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
 * UltimateDebtor may only be present if different from Debtor.
 */
public class ConstraintUltimateDebtorGuideline {

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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation1> forCreditTransferTransactionInformation1 = new MMConstraint<CreditTransferTransactionInformation1>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransactionInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> CreditTransferTransactionInformation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation1> forPaymentInstructionInformation1 = new MMConstraint<PaymentInstructionInformation1>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkPaymentInstructionInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> PaymentInstructionInformation1.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation10> forCreditTransferTransactionInformation10 = new MMConstraint<CreditTransferTransactionInformation10>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransactionInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> CreditTransferTransactionInformation10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3
	 * PaymentInstructionInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation3> forPaymentInstructionInformation3 = new MMConstraint<PaymentInstructionInformation3>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkPaymentInstructionInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> PaymentInstructionInformation3.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction1> forCreditTransferTransaction1 = new MMConstraint<CreditTransferTransaction1>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> CreditTransferTransaction1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6
	 * PaymentInstruction6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction6> forPaymentInstruction6 = new MMConstraint<PaymentInstruction6>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkPaymentInstruction6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> PaymentInstruction6.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction20
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction20}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction6> forCreditTransferTransaction6 = new MMConstraint<CreditTransferTransaction6>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction20);
			owner_lazy = () -> CreditTransferTransaction6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9
	 * PaymentInstruction9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstruction16
	 * ConstraintUltimateDebtorGuideline.forPaymentInstruction16}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction9> forPaymentInstruction9 = new MMConstraint<PaymentInstruction9>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkPaymentInstruction9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstruction16);
			owner_lazy = () -> PaymentInstruction9.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation1> forDirectDebitTransactionInformation1 = new MMConstraint<DirectDebitTransactionInformation1>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> DirectDebitTransactionInformation1.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation9> forDirectDebitTransactionInformation9 = new MMConstraint<DirectDebitTransactionInformation9>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> DirectDebitTransactionInformation9.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation11> forDirectDebitTransactionInformation11 = new MMConstraint<DirectDebitTransactionInformation11>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> DirectDebitTransactionInformation11.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forDirectDebitTransactionInformation18
	 * ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation18}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation13> forDirectDebitTransactionInformation13 = new MMConstraint<DirectDebitTransactionInformation13>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation18);
			owner_lazy = () -> DirectDebitTransactionInformation13.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation2> forCreditTransferTransactionInformation2 = new MMConstraint<CreditTransferTransactionInformation2>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransactionInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation11> forCreditTransferTransactionInformation11 = new MMConstraint<CreditTransferTransactionInformation11>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransactionInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction2> forCreditTransferTransaction2 = new MMConstraint<CreditTransferTransaction2>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction19
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction19}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction7> forCreditTransferTransaction7 = new MMConstraint<CreditTransferTransaction7>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction19);
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation2> forDirectDebitTransactionInformation2 = new MMConstraint<DirectDebitTransactionInformation2>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation10> forDirectDebitTransactionInformation10 = new MMConstraint<DirectDebitTransactionInformation10>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation12> forDirectDebitTransactionInformation12 = new MMConstraint<DirectDebitTransactionInformation12>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forDirectDebitTransactionInformation17
	 * ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation17}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation14> forDirectDebitTransactionInformation14 = new MMConstraint<DirectDebitTransactionInformation14>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation17);
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation3> forCreditTransferTransactionInformation3 = new MMConstraint<CreditTransferTransactionInformation3>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransactionInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation12> forCreditTransferTransactionInformation12 = new MMConstraint<CreditTransferTransactionInformation12>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransactionInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation13> forCreditTransferTransactionInformation13 = new MMConstraint<CreditTransferTransactionInformation13>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransactionInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction18
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction18}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction3> forCreditTransferTransaction3 = new MMConstraint<CreditTransferTransaction3>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction18);
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction4> forCreditTransferTransaction4 = new MMConstraint<CreditTransferTransaction4>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction17
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction8> forCreditTransferTransaction8 = new MMConstraint<CreditTransferTransaction8>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction17);
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateInformation1> forMandateInformation1 = new MMConstraint<MandateInformation1>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkMandateInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandate5
	 * ConstraintUltimateDebtorGuideline.forMandate5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate1> forMandate1 = new MMConstraint<Mandate1>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkMandate1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandate5);
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateInformation3> forMandateInformation3 = new MMConstraint<MandateInformation3>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkMandateInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandate6
	 * ConstraintUltimateDebtorGuideline.forMandate6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate3> forMandate3 = new MMConstraint<Mandate3>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkMandate3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandate6);
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateInformation2> forMandateInformation2 = new MMConstraint<MandateInformation2>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkMandateInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate2> forMandate2 = new MMConstraint<Mandate2>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkMandate2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandate7
	 * ConstraintUltimateDebtorGuideline.forMandate7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate4> forMandate4 = new MMConstraint<Mandate4>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkMandate4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandate7);
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation14> forCreditTransferTransactionInformation14 = new MMConstraint<CreditTransferTransactionInformation14>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransactionInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> CreditTransferTransactionInformation14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5
	 * PaymentInstruction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction5> forPaymentInstruction5 = new MMConstraint<PaymentInstruction5>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkPaymentInstruction5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> PaymentInstruction5.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction5> forCreditTransferTransaction5 = new MMConstraint<CreditTransferTransaction5>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> CreditTransferTransaction5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8
	 * PaymentInstruction8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction8> forPaymentInstruction8 = new MMConstraint<PaymentInstruction8>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkPaymentInstruction8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> PaymentInstruction8.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction21
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction21}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction10> forCreditTransferTransaction10 = new MMConstraint<CreditTransferTransaction10>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction21);
			owner_lazy = () -> CreditTransferTransaction10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11
	 * PaymentInstruction11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstruction17
	 * ConstraintUltimateDebtorGuideline.forPaymentInstruction17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction11> forPaymentInstruction11 = new MMConstraint<PaymentInstruction11>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkPaymentInstruction11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstruction17);
			owner_lazy = () -> PaymentInstruction11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15
	 * DirectDebitTransactionInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation15> forDirectDebitTransactionInformation15 = new MMConstraint<DirectDebitTransactionInformation15>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> DirectDebitTransactionInformation15.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO2022 Guideline:\nUltimateDebtor may only be present if different from Debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation8> forCreditTransferTransactionInformation8 = new MMConstraint<CreditTransferTransactionInformation8>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransactionInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "ISO2022 Guideline:\nUltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation7> forCreditTransferTransactionInformation7 = new MMConstraint<CreditTransferTransactionInformation7>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransactionInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Guideline:\nUltimateDebtor may only be present if different from Debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation9> forCreditTransferTransactionInformation9 = new MMConstraint<CreditTransferTransactionInformation9>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransactionInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "ISO20022 Guideline:\nUltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Guideline:\nUltimateDebtor may only be present if different from Debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation6> forDirectDebitTransactionInformation6 = new MMConstraint<DirectDebitTransactionInformation6>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "ISO20022 Guideline:\nUltimateDebtor may only be present if different from Debtor.";
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Guideline:\nUltimateDebtor may only be present if different from Debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation8> forDirectDebitTransactionInformation8 = new MMConstraint<DirectDebitTransactionInformation8>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "ISO20022 Guideline:\nUltimateDebtor may only be present if different from Debtor.";
			owner_lazy = () -> DirectDebitTransactionInformation8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstruction20
	 * ConstraintUltimateDebtorGuideline.forPaymentInstruction20}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstruction9
	 * ConstraintUltimateDebtorGuideline.forPaymentInstruction9}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction16> forPaymentInstruction16 = new MMConstraint<PaymentInstruction16>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkPaymentInstruction16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstruction20);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstruction9;
			owner_lazy = () -> PaymentInstruction16.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction23
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction8
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction8}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction17> forCreditTransferTransaction17 = new MMConstraint<CreditTransferTransaction17>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction8;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction25
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction25}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction7
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction7}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction19> forCreditTransferTransaction19 = new MMConstraint<CreditTransferTransaction19>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction25);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction7;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forDirectDebitTransactionInformation20
	 * ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation20}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forDirectDebitTransactionInformation14
	 * ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation14}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation17> forDirectDebitTransactionInformation17 = new MMConstraint<DirectDebitTransactionInformation17>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation20);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation14;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandate10
	 * ConstraintUltimateDebtorGuideline.forMandate10}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandate4
	 * ConstraintUltimateDebtorGuideline.forMandate4}</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate7> forMandate7 = new MMConstraint<Mandate7>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkMandate7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandate10);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandate4;
			owner_lazy = () -> Mandate7.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandate8
	 * ConstraintUltimateDebtorGuideline.forMandate8}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandate3
	 * ConstraintUltimateDebtorGuideline.forMandate3}</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate6> forMandate6 = new MMConstraint<Mandate6>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkMandate6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandate8);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandate3;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandate9
	 * ConstraintUltimateDebtorGuideline.forMandate9}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandate1
	 * ConstraintUltimateDebtorGuideline.forMandate1}</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate5> forMandate5 = new MMConstraint<Mandate5>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkMandate5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandate9);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandate1;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction24
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction3
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction3}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction18> forCreditTransferTransaction18 = new MMConstraint<CreditTransferTransaction18>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction3;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forDirectDebitTransactionInformation19
	 * ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation19}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forDirectDebitTransactionInformation13
	 * ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation13}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation18> forDirectDebitTransactionInformation18 = new MMConstraint<DirectDebitTransactionInformation18>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation13;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction26
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction26}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction6
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction6}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction20> forCreditTransferTransaction20 = new MMConstraint<CreditTransferTransaction20>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction26);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction6;
			owner_lazy = () -> CreditTransferTransaction20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstruction19
	 * ConstraintUltimateDebtorGuideline.forPaymentInstruction19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstruction11
	 * ConstraintUltimateDebtorGuideline.forPaymentInstruction11}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction17> forPaymentInstruction17 = new MMConstraint<PaymentInstruction17>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkPaymentInstruction17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstruction19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstruction11;
			owner_lazy = () -> PaymentInstruction17.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction22
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction10
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction10}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction21> forCreditTransferTransaction21 = new MMConstraint<CreditTransferTransaction21>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction10;
			owner_lazy = () -> CreditTransferTransaction21.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction17
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction17}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction23> forCreditTransferTransaction23 = new MMConstraint<CreditTransferTransaction23>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction17;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction19
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction19}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction25> forCreditTransferTransaction25 = new MMConstraint<CreditTransferTransaction25>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction19;
			owner_lazy = () -> CreditTransferTransaction25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19
	 * PaymentInstruction19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstruction23
	 * ConstraintUltimateDebtorGuideline.forPaymentInstruction23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstruction17
	 * ConstraintUltimateDebtorGuideline.forPaymentInstruction17}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction19> forPaymentInstruction19 = new MMConstraint<PaymentInstruction19>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkPaymentInstruction19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstruction23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstruction17;
			owner_lazy = () -> PaymentInstruction19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20
	 * PaymentInstruction20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstruction22
	 * ConstraintUltimateDebtorGuideline.forPaymentInstruction22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstruction16
	 * ConstraintUltimateDebtorGuideline.forPaymentInstruction16}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction20> forPaymentInstruction20 = new MMConstraint<PaymentInstruction20>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkPaymentInstruction20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstruction22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstruction16;
			owner_lazy = () -> PaymentInstruction20.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forDirectDebitTransactionInformation21
	 * ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation21}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forDirectDebitTransactionInformation17
	 * ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation17}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation20> forDirectDebitTransactionInformation20 = new MMConstraint<DirectDebitTransactionInformation20>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation21);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation17;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction18
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction18}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction24> forCreditTransferTransaction24 = new MMConstraint<CreditTransferTransaction24>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction18;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction20
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction20}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction26> forCreditTransferTransaction26 = new MMConstraint<CreditTransferTransaction26>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction20;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forDirectDebitTransactionInformation22
	 * ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation22}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forDirectDebitTransactionInformation18
	 * ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation18}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation19> forDirectDebitTransactionInformation19 = new MMConstraint<DirectDebitTransactionInformation19>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation18;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction21
	 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction21}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction22> forCreditTransferTransaction22 = new MMConstraint<CreditTransferTransaction22>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkCreditTransferTransaction22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction21;
			owner_lazy = () -> CreditTransferTransaction22.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forDirectDebitTransactionInformation20
	 * ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation20}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation21> forDirectDebitTransactionInformation21 = new MMConstraint<DirectDebitTransactionInformation21>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation20;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandate7
	 * ConstraintUltimateDebtorGuideline.forMandate7}</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate10> forMandate10 = new MMConstraint<Mandate10>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkMandate10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandate7;
			owner_lazy = () -> Mandate10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstruction19
	 * ConstraintUltimateDebtorGuideline.forPaymentInstruction19}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction23> forPaymentInstruction23 = new MMConstraint<PaymentInstruction23>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkPaymentInstruction23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstruction19;
			owner_lazy = () -> PaymentInstruction23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstruction20
	 * ConstraintUltimateDebtorGuideline.forPaymentInstruction20}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction22> forPaymentInstruction22 = new MMConstraint<PaymentInstruction22>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkPaymentInstruction22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstruction20;
			owner_lazy = () -> PaymentInstruction22.mmObject();
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandate11
	 * ConstraintUltimateDebtorGuideline.forMandate11}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandate5
	 * ConstraintUltimateDebtorGuideline.forMandate5}</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate9> forMandate9 = new MMConstraint<Mandate9>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkMandate9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandate11);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandate5;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandate9
	 * ConstraintUltimateDebtorGuideline.forMandate9}</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate11> forMandate11 = new MMConstraint<Mandate11>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkMandate11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandate9;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forDirectDebitTransactionInformation19
	 * ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation19}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation22> forDirectDebitTransactionInformation22 = new MMConstraint<DirectDebitTransactionInformation22>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkDirectDebitTransactionInformation22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation19;
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
	 * name} = "UltimateDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateDebtor may only be present if different from Debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandate6
	 * ConstraintUltimateDebtorGuideline.forMandate6}</li>
	 * </ul>
	 */
	public static final MMConstraint<Mandate8> forMandate8 = new MMConstraint<Mandate8>() {
		{
			validator = ConstraintUltimateDebtorGuideline::checkMandate8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtorGuideline";
			definition = "UltimateDebtor may only be present if different from Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandate6;
			owner_lazy = () -> Mandate8.mmObject();
		}
	};

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransactionInformation1(CreditTransferTransactionInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkPaymentInstructionInformation1(PaymentInstructionInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransactionInformation10(CreditTransferTransactionInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkPaymentInstructionInformation3(PaymentInstructionInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction1(CreditTransferTransaction1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkPaymentInstruction6(PaymentInstruction6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction6(CreditTransferTransaction6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkPaymentInstruction9(PaymentInstruction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation1(DirectDebitTransactionInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation9(DirectDebitTransactionInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation11(DirectDebitTransactionInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation13(DirectDebitTransactionInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransactionInformation2(CreditTransferTransactionInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransactionInformation11(CreditTransferTransactionInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction2(CreditTransferTransaction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction7(CreditTransferTransaction7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation2(DirectDebitTransactionInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation10(DirectDebitTransactionInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation12(DirectDebitTransactionInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation14(DirectDebitTransactionInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransactionInformation3(CreditTransferTransactionInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransactionInformation12(CreditTransferTransactionInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransactionInformation13(CreditTransferTransactionInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction3(CreditTransferTransaction3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction4(CreditTransferTransaction4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction8(CreditTransferTransaction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkMandateInformation1(MandateInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkMandate1(Mandate1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkMandateInformation3(MandateInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkMandate3(Mandate3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkMandateInformation2(MandateInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkMandate2(Mandate2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkMandate4(Mandate4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransactionInformation14(CreditTransferTransactionInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkPaymentInstruction5(PaymentInstruction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction5(CreditTransferTransaction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkPaymentInstruction8(PaymentInstruction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction10(CreditTransferTransaction10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkPaymentInstruction11(PaymentInstruction11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation15(DirectDebitTransactionInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO2022 Guideline: UltimateDebtor may only be present if different from
	 * Debtor.
	 */
	public static void checkCreditTransferTransactionInformation8(CreditTransferTransactionInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransactionInformation7(CreditTransferTransactionInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Guideline: UltimateDebtor may only be present if different from
	 * Debtor.
	 */
	public static void checkCreditTransferTransactionInformation9(CreditTransferTransactionInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Guideline: UltimateDebtor may only be present if different from
	 * Debtor.
	 */
	public static void checkDirectDebitTransactionInformation6(DirectDebitTransactionInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Guideline: UltimateDebtor may only be present if different from
	 * Debtor.
	 */
	public static void checkDirectDebitTransactionInformation8(DirectDebitTransactionInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkPaymentInstruction16(PaymentInstruction16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction17(CreditTransferTransaction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction19(CreditTransferTransaction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation17(DirectDebitTransactionInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkMandate7(Mandate7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkMandate6(Mandate6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkMandate5(Mandate5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction18(CreditTransferTransaction18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation18(DirectDebitTransactionInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction20(CreditTransferTransaction20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkPaymentInstruction17(PaymentInstruction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction21(CreditTransferTransaction21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction23(CreditTransferTransaction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction25(CreditTransferTransaction25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkPaymentInstruction19(PaymentInstruction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkPaymentInstruction20(PaymentInstruction20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation20(DirectDebitTransactionInformation20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction24(CreditTransferTransaction24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction26(CreditTransferTransaction26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation19(DirectDebitTransactionInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkCreditTransferTransaction22(CreditTransferTransaction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation21(DirectDebitTransactionInformation21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkMandate10(Mandate10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkPaymentInstruction23(PaymentInstruction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkPaymentInstruction22(PaymentInstruction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkMandate9(Mandate9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkMandate11(Mandate11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkDirectDebitTransactionInformation22(DirectDebitTransactionInformation22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateDebtor may only be present if different from Debtor.
	 */
	public static void checkMandate8(Mandate8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}