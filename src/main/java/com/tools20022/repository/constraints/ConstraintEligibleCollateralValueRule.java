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
import com.tools20022.repository.msg.BalanceAmounts3;
import com.tools20022.repository.msg.BalanceAmounts4;

/**
 * EligibleCollateralValue is only to be used in (I)CSD-participant
 * communication or if bilaterally agreed between the sender and receiver.
 */
public class ConstraintEligibleCollateralValueRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3
	 * BalanceAmounts3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleCollateralValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EligibleCollateralValue is only to be used in (I)CSD-participant communication or if bilaterally agreed between the sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BalanceAmounts3> forBalanceAmounts3 = new MMConstraint<BalanceAmounts3>() {
		{
			validator = ConstraintEligibleCollateralValueRule::checkBalanceAmounts3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleCollateralValueRule";
			definition = "EligibleCollateralValue is only to be used in (I)CSD-participant communication or if bilaterally agreed between the sender and receiver.";
			owner_lazy = () -> BalanceAmounts3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts4
	 * BalanceAmounts4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleCollateralValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EligibleCollateralValue is only to be used in (I)CSD-participant communication or if bilaterally agreed between the sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BalanceAmounts4> forBalanceAmounts4 = new MMConstraint<BalanceAmounts4>() {
		{
			validator = ConstraintEligibleCollateralValueRule::checkBalanceAmounts4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleCollateralValueRule";
			definition = "EligibleCollateralValue is only to be used in (I)CSD-participant communication or if bilaterally agreed between the sender and receiver.";
			owner_lazy = () -> BalanceAmounts4.mmObject();
		}
	};

	/**
	 * EligibleCollateralValue is only to be used in (I)CSD-participant
	 * communication or if bilaterally agreed between the sender and receiver.
	 */
	public static void checkBalanceAmounts3(BalanceAmounts3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EligibleCollateralValue is only to be used in (I)CSD-participant
	 * communication or if bilaterally agreed between the sender and receiver.
	 */
	public static void checkBalanceAmounts4(BalanceAmounts4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}