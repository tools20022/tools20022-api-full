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
import com.tools20022.repository.msg.TotalValueInPageAndStatement1;
import com.tools20022.repository.msg.TotalValueInPageAndStatement3;

/**
 * Total eligible collateral value is only to be used in (I)CSD-participant
 * communication or if bilaterally agreed between the sender and receiver.
 */
public class ConstraintTotalEligibleCollateralValueRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1
	 * TotalValueInPageAndStatement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleCollateralValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total eligible collateral value is only to be used in (I)CSD-participant communication or if bilaterally agreed between the sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TotalValueInPageAndStatement1> forTotalValueInPageAndStatement1 = new MMConstraint<TotalValueInPageAndStatement1>() {
		{
			validator = ConstraintTotalEligibleCollateralValueRule::checkTotalValueInPageAndStatement1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleCollateralValueRule";
			definition = "Total eligible collateral value is only to be used in (I)CSD-participant communication or if bilaterally agreed between the sender and receiver.";
			owner_lazy = () -> TotalValueInPageAndStatement1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement3
	 * TotalValueInPageAndStatement3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleCollateralValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total eligible collateral value is only to be used in (I)CSD-participant communication or if bilaterally agreed between the sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TotalValueInPageAndStatement3> forTotalValueInPageAndStatement3 = new MMConstraint<TotalValueInPageAndStatement3>() {
		{
			validator = ConstraintTotalEligibleCollateralValueRule::checkTotalValueInPageAndStatement3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleCollateralValueRule";
			definition = "Total eligible collateral value is only to be used in (I)CSD-participant communication or if bilaterally agreed between the sender and receiver.";
			owner_lazy = () -> TotalValueInPageAndStatement3.mmObject();
		}
	};

	/**
	 * Total eligible collateral value is only to be used in (I)CSD-participant
	 * communication or if bilaterally agreed between the sender and receiver.
	 */
	public static void checkTotalValueInPageAndStatement1(TotalValueInPageAndStatement1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Total eligible collateral value is only to be used in (I)CSD-participant
	 * communication or if bilaterally agreed between the sender and receiver.
	 */
	public static void checkTotalValueInPageAndStatement3(TotalValueInPageAndStatement3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}