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
import com.tools20022.repository.msg.CashBalance1;
import com.tools20022.repository.msg.CashBalance2;

/**
 * If Type is equal to ForwardAvailable, Availability is not allowed.
 */
public class ConstraintAvailabilityAndTypeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance1 CashBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailabilityAndTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is equal to ForwardAvailable,  Availability is not allowed."</li>
	 * </ul>
	 */
	public static final MMConstraint<CashBalance1> forCashBalance1 = new MMConstraint<CashBalance1>() {
		{
			validator = ConstraintAvailabilityAndTypeRule::checkCashBalance1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailabilityAndTypeRule";
			definition = "If Type is equal to ForwardAvailable,  Availability is not allowed.";
			owner_lazy = () -> CashBalance1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance2 CashBalance2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailabilityAndTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is equal to ForwardAvailable,  Availability is not allowed."</li>
	 * </ul>
	 */
	public static final MMConstraint<CashBalance2> forCashBalance2 = new MMConstraint<CashBalance2>() {
		{
			validator = ConstraintAvailabilityAndTypeRule::checkCashBalance2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailabilityAndTypeRule";
			definition = "If Type is equal to ForwardAvailable,  Availability is not allowed.";
			owner_lazy = () -> CashBalance2.mmObject();
		}
	};

	/**
	 * If Type is equal to ForwardAvailable, Availability is not allowed.
	 */
	public static void checkCashBalance1(CashBalance1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type is equal to ForwardAvailable, Availability is not allowed.
	 */
	public static void checkCashBalance2(CashBalance2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}