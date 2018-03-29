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
import com.tools20022.repository.msg.Fee1;

/**
 * If StandardRate, RequestedRate and DiscountDetails/Rate are all present, then
 * StandardRate minus DiscountDetails/Rate must equal RequestedRate.
 */
public class ConstraintStandardFeeRateCalculation {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Fee1 Fee1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardFeeRateCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StandardRate, RequestedRate and DiscountDetails/Rate are all present, then StandardRate minus DiscountDetails/Rate must equal RequestedRate."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Fee1> forFee1 = new MMConstraint<Fee1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardFeeRateCalculation";
			definition = "If StandardRate, RequestedRate and DiscountDetails/Rate are all present, then StandardRate minus DiscountDetails/Rate must equal RequestedRate.";
			owner_lazy = () -> Fee1.mmObject();
		}

		@Override
		public void executeValidator(Fee1 obj) throws Exception {
			checkFee1(obj);
		}
	};

	/**
	 * If StandardRate, RequestedRate and DiscountDetails/Rate are all present,
	 * then StandardRate minus DiscountDetails/Rate must equal RequestedRate.
	 */
	public static void checkFee1(Fee1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}