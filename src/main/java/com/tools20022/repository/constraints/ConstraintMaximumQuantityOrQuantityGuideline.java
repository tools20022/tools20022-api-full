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
import com.tools20022.repository.msg.QuoteSide1;

/**
 * It is recommended that Quantity is not used with MinimumQuantity and/or with
 * MaximumQuantity.
 */
public class ConstraintMaximumQuantityOrQuantityGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuoteSide1 QuoteSide1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumQuantityOrQuantityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that Quantity is not used with MinimumQuantity and/or with MaximumQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuoteSide1> forQuoteSide1 = new MMConstraint<QuoteSide1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumQuantityOrQuantityGuideline";
			definition = "It is recommended that Quantity is not used with MinimumQuantity and/or with MaximumQuantity.";
			owner_lazy = () -> QuoteSide1.mmObject();
		}

		@Override
		public void executeValidator(QuoteSide1 obj) throws Exception {
			checkQuoteSide1(obj);
		}
	};

	/**
	 * It is recommended that Quantity is not used with MinimumQuantity and/or
	 * with MaximumQuantity.
	 */
	public static void checkQuoteSide1(QuoteSide1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}