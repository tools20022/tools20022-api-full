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
 * If InterbankSettlementAmount is present, then InterbankSettlementDate is
 * mandatory. If InterbankSettlementAmount is not present, then
 * InterbankSettlementDate is not allowed.
 */
public class ConstraintInterbankSettlementAmountAndDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2
	 * PaymentInstructionExtract2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmountAndDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InterbankSettlementAmount is present, then InterbankSettlementDate is mandatory.\nIf InterbankSettlementAmount is not present, then InterbankSettlementDate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionExtract2> forPaymentInstructionExtract2 = new MMConstraint<PaymentInstructionExtract2>() {
		{
			validator = ConstraintInterbankSettlementAmountAndDateRule::checkPaymentInstructionExtract2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmountAndDateRule";
			definition = "If InterbankSettlementAmount is present, then InterbankSettlementDate is mandatory.\nIf InterbankSettlementAmount is not present, then InterbankSettlementDate is not allowed.";
			owner_lazy = () -> PaymentInstructionExtract2.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmountAndDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InterbankSettlementAmount is present, then InterbankSettlementDate is mandatory.\nIf InterbankSettlementAmount is not present, then InterbankSettlementDate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorrectivePaymentInstructionExtract> forCorrectivePaymentInstructionExtract = new MMConstraint<CorrectivePaymentInstructionExtract>() {
		{
			validator = ConstraintInterbankSettlementAmountAndDateRule::checkCorrectivePaymentInstructionExtract;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmountAndDateRule";
			definition = "If InterbankSettlementAmount is present, then InterbankSettlementDate is mandatory.\nIf InterbankSettlementAmount is not present, then InterbankSettlementDate is not allowed.";
			owner_lazy = () -> CorrectivePaymentInstructionExtract.mmObject();
		}
	};

	/**
	 * If InterbankSettlementAmount is present, then InterbankSettlementDate is
	 * mandatory. If InterbankSettlementAmount is not present, then
	 * InterbankSettlementDate is not allowed.
	 */
	public static void checkPaymentInstructionExtract2(PaymentInstructionExtract2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InterbankSettlementAmount is present, then InterbankSettlementDate is
	 * mandatory. If InterbankSettlementAmount is not present, then
	 * InterbankSettlementDate is not allowed.
	 */
	public static void checkCorrectivePaymentInstructionExtract(CorrectivePaymentInstructionExtract obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}