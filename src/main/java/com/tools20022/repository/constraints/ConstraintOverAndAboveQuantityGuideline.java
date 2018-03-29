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
import com.tools20022.repository.msg.SecuritiesOption2;
import com.tools20022.repository.msg.SecuritiesOption7;

/**
 * OverAndAboveNormalEnsuredEntitlementQuantity defines the quantity to receive
 * on top of the normal entitlement, not the combined quantity.
 */
public class ConstraintOverAndAboveQuantityGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption2
	 * SecuritiesOption2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAndAboveQuantityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OverAndAboveNormalEnsuredEntitlementQuantity defines the quantity to receive on top of the normal entitlement, not the combined quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption2> forSecuritiesOption2 = new MMConstraint<SecuritiesOption2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAndAboveQuantityGuideline";
			definition = "OverAndAboveNormalEnsuredEntitlementQuantity defines the quantity to receive on top of the normal entitlement, not the combined quantity.";
			owner_lazy = () -> SecuritiesOption2.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption2 obj) throws Exception {
			checkSecuritiesOption2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption7
	 * SecuritiesOption7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAndAboveQuantityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OverAndAboveNormalEnsuredEntitlementQuantity defines the quantity to receive on top of the normal entitlement, not the combined quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption7> forSecuritiesOption7 = new MMConstraint<SecuritiesOption7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAndAboveQuantityGuideline";
			definition = "OverAndAboveNormalEnsuredEntitlementQuantity defines the quantity to receive on top of the normal entitlement, not the combined quantity.";
			owner_lazy = () -> SecuritiesOption7.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption7 obj) throws Exception {
			checkSecuritiesOption7(obj);
		}
	};

	/**
	 * OverAndAboveNormalEnsuredEntitlementQuantity defines the quantity to
	 * receive on top of the normal entitlement, not the combined quantity.
	 */
	public static void checkSecuritiesOption2(SecuritiesOption2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OverAndAboveNormalEnsuredEntitlementQuantity defines the quantity to
	 * receive on top of the normal entitlement, not the combined quantity.
	 */
	public static void checkSecuritiesOption7(SecuritiesOption7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}