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
import com.tools20022.repository.msg.LiquidityRequiredAndAvailable1;

/**
 * In each iteration, the value of LiquidityHorizon must be different.
 */
public class ConstraintLiquidityHorizonRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityRequiredAndAvailable1
	 * LiquidityRequiredAndAvailable1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityHorizonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In each iteration, the value of LiquidityHorizon must be different."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<LiquidityRequiredAndAvailable1> forLiquidityRequiredAndAvailable1 = new MMConstraint<LiquidityRequiredAndAvailable1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityHorizonRule";
			definition = "In each iteration, the value of LiquidityHorizon must be different.";
			owner_lazy = () -> LiquidityRequiredAndAvailable1.mmObject();
		}

		@Override
		public void executeValidator(LiquidityRequiredAndAvailable1 obj) throws Exception {
			checkLiquidityRequiredAndAvailable1(obj);
		}
	};

	/**
	 * In each iteration, the value of LiquidityHorizon must be different.
	 */
	public static void checkLiquidityRequiredAndAvailable1(LiquidityRequiredAndAvailable1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}