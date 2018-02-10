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
import com.tools20022.repository.area.pain.PaymentCancellationRequestV01;

/**
 * If GroupHeader/GroupCancellation is false, then
 * GroupHeader/NumberOfTransactions specifies the number of occurrences of
 * TransactionInformation. .
 */
public class ConstraintGroupCancellation3Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.PaymentCancellationRequestV01
	 * PaymentCancellationRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupCancellation3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupCancellation is false, then GroupHeader/NumberOfTransactions specifies the number of occurrences of TransactionInformation.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentCancellationRequestV01> forPaymentCancellationRequestV01 = new MMConstraint<PaymentCancellationRequestV01>() {
		{
			validator = ConstraintGroupCancellation3Rule::checkPaymentCancellationRequestV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupCancellation3Rule";
			definition = "If GroupHeader/GroupCancellation is false, then GroupHeader/NumberOfTransactions specifies the number of occurrences of TransactionInformation.\n.";
			owner_lazy = () -> PaymentCancellationRequestV01.mmObject();
		}
	};

	/**
	 * If GroupHeader/GroupCancellation is false, then
	 * GroupHeader/NumberOfTransactions specifies the number of occurrences of
	 * TransactionInformation. .
	 */
	public static void checkPaymentCancellationRequestV01(PaymentCancellationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}