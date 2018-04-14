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
import com.tools20022.repository.msg.UnitPrice15;
import com.tools20022.repository.msg.UnitPrice6;

/**
 * If Type/Structured is not NonAdjustedUnpublished, then CalculationBasis is
 * not allowed. If Type/Structured is NonAdjustedUnpublished, then
 * CalculationBasis may be present.
 */
public class ConstraintCalculationBasisRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6 UnitPrice6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationBasisRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Structured is not NonAdjustedUnpublished, then CalculationBasis is not allowed. If Type/Structured is NonAdjustedUnpublished, then CalculationBasis may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<UnitPrice6> forUnitPrice6 = new MMConstraint<UnitPrice6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationBasisRule";
			definition = "If Type/Structured is not NonAdjustedUnpublished, then CalculationBasis is not allowed. If Type/Structured is NonAdjustedUnpublished, then CalculationBasis may be present.";
			owner_lazy = () -> UnitPrice6.mmObject();
		}

		@Override
		public void executeValidator(UnitPrice6 obj) throws Exception {
			checkUnitPrice6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationBasisRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is not NonAdjustedUnpublished, then CalculationBasis is not allowed. If Type is NonAdjustedUnpublished, then CalculationBasis may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<UnitPrice15> forUnitPrice15 = new MMConstraint<UnitPrice15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationBasisRule";
			definition = "If Type is not NonAdjustedUnpublished, then CalculationBasis is not allowed. If Type is NonAdjustedUnpublished, then CalculationBasis may be present.";
			owner_lazy = () -> UnitPrice15.mmObject();
		}

		@Override
		public void executeValidator(UnitPrice15 obj) throws Exception {
			checkUnitPrice15(obj);
		}
	};

	/**
	 * If Type/Structured is not NonAdjustedUnpublished, then CalculationBasis
	 * is not allowed. If Type/Structured is NonAdjustedUnpublished, then
	 * CalculationBasis may be present.
	 */
	public static void checkUnitPrice6(UnitPrice6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type is not NonAdjustedUnpublished, then CalculationBasis is not
	 * allowed. If Type is NonAdjustedUnpublished, then CalculationBasis may be
	 * present.
	 */
	public static void checkUnitPrice15(UnitPrice15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}