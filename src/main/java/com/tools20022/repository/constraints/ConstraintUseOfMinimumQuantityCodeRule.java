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
import com.tools20022.repository.msg.CorporateActionQuantity4SD2;

/**
 * MinimumQuantityCode can only be used with corporate action event type codes
 * TEND or BIDS.
 */
public class ConstraintUseOfMinimumQuantityCodeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2
	 * CorporateActionQuantity4SD2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UseOfMinimumQuantityCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MinimumQuantityCode can only be used with corporate action event type codes TEND or BIDS."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity4SD2> forCorporateActionQuantity4SD2 = new MMConstraint<CorporateActionQuantity4SD2>() {
		{
			validator = ConstraintUseOfMinimumQuantityCodeRule::checkCorporateActionQuantity4SD2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UseOfMinimumQuantityCodeRule";
			definition = "MinimumQuantityCode can only be used with corporate action event type codes TEND or BIDS.";
			owner_lazy = () -> CorporateActionQuantity4SD2.mmObject();
		}
	};

	/**
	 * MinimumQuantityCode can only be used with corporate action event type
	 * codes TEND or BIDS.
	 */
	public static void checkCorporateActionQuantity4SD2(CorporateActionQuantity4SD2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}