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
import com.tools20022.repository.msg.CorrectivePaymentInstructionExtract;
import com.tools20022.repository.msg.PaymentInstructionExtract2;

/**
 * If InstructedAmount is present, then RequestedExecutionDate is mandatory. If
 * InstructedAmount is not present, then RequestedExecutionDate is not allowed.
 */
public class ConstraintInstructedAmountAndRequestedExecutionDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2
	 * PaymentInstructionExtract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountAndRequestedExecutionDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructedAmount is present, then RequestedExecutionDate is mandatory.\nIf InstructedAmount is not present, then RequestedExecutionDate is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionExtract2> forPaymentInstructionExtract2 = new MMConstraint<PaymentInstructionExtract2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountAndRequestedExecutionDateRule";
			definition = "If InstructedAmount is present, then RequestedExecutionDate is mandatory.\nIf InstructedAmount is not present, then RequestedExecutionDate is not allowed.";
			owner_lazy = () -> PaymentInstructionExtract2.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstructionExtract2 obj) throws Exception {
			checkPaymentInstructionExtract2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract
	 * CorrectivePaymentInstructionExtract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountAndRequestedExecutionDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructedAmount is present, then RequestedExecutionDate is mandatory.\nIf InstructedAmount is not present, then RequestedExecutionDate is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorrectivePaymentInstructionExtract> forCorrectivePaymentInstructionExtract = new MMConstraint<CorrectivePaymentInstructionExtract>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountAndRequestedExecutionDateRule";
			definition = "If InstructedAmount is present, then RequestedExecutionDate is mandatory.\nIf InstructedAmount is not present, then RequestedExecutionDate is not allowed.";
			owner_lazy = () -> CorrectivePaymentInstructionExtract.mmObject();
		}

		@Override
		public void executeValidator(CorrectivePaymentInstructionExtract obj) throws Exception {
			checkCorrectivePaymentInstructionExtract(obj);
		}
	};

	/**
	 * If InstructedAmount is present, then RequestedExecutionDate is mandatory.
	 * If InstructedAmount is not present, then RequestedExecutionDate is not
	 * allowed.
	 */
	public static void checkPaymentInstructionExtract2(PaymentInstructionExtract2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructedAmount is present, then RequestedExecutionDate is mandatory.
	 * If InstructedAmount is not present, then RequestedExecutionDate is not
	 * allowed.
	 */
	public static void checkCorrectivePaymentInstructionExtract(CorrectivePaymentInstructionExtract obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}