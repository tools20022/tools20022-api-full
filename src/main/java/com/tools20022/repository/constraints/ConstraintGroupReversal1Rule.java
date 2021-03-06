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
import com.tools20022.repository.area.pain.CustomerPaymentReversalV01;

/**
 * If GroupHeader/GroupReversal is true, then TransactionInformation is not
 * allowed. If GroupHeader/GroupReversal is false, then at least one occurrence
 * of TransactionInformation must be present.
 */
public class ConstraintGroupReversal1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV01
	 * CustomerPaymentReversalV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversal1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is true, then TransactionInformation is not allowed.\nIf GroupHeader/GroupReversal is false, then at least one occurrence of TransactionInformation must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV01> for_pain_CustomerPaymentReversalV01 = new MMConstraint<CustomerPaymentReversalV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversal1Rule";
			definition = "If GroupHeader/GroupReversal is true, then TransactionInformation is not allowed.\nIf GroupHeader/GroupReversal is false, then at least one occurrence of TransactionInformation must be present.";
			owner_lazy = () -> CustomerPaymentReversalV01.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentReversalV01 obj) throws Exception {
			check_pain_CustomerPaymentReversalV01(obj);
		}
	};

	/**
	 * If GroupHeader/GroupReversal is true, then TransactionInformation is not
	 * allowed. If GroupHeader/GroupReversal is false, then at least one
	 * occurrence of TransactionInformation must be present.
	 */
	public static void check_pain_CustomerPaymentReversalV01(CustomerPaymentReversalV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}