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
import com.tools20022.repository.msg.DividendTypeFormat4SD1;

/**
 * ProvisionalFlag can only be used with corporate action event type code DVCA.
 */
public class ConstraintUseOfProvisionalDividendFlagRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DividendTypeFormat4SD1
	 * DividendTypeFormat4SD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UseOfProvisionalDividendFlagRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ProvisionalFlag can only be used with corporate action event type code DVCA."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DividendTypeFormat4SD1> forDividendTypeFormat4SD1 = new MMConstraint<DividendTypeFormat4SD1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UseOfProvisionalDividendFlagRule";
			definition = "ProvisionalFlag can only be used with corporate action event type code DVCA.";
			owner_lazy = () -> DividendTypeFormat4SD1.mmObject();
		}

		@Override
		public void executeValidator(DividendTypeFormat4SD1 obj) throws Exception {
			checkDividendTypeFormat4SD1(obj);
		}
	};

	/**
	 * ProvisionalFlag can only be used with corporate action event type code
	 * DVCA.
	 */
	public static void checkDividendTypeFormat4SD1(DividendTypeFormat4SD1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}