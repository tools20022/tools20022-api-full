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
import com.tools20022.repository.msg.FinancialInstrumentAttributes23SD1;

/**
 * PostEffectiveDateClassification can only be used with Event Type Code MRGR.
 */
public class ConstraintUseOfPostEffectiveDateClassificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23SD1
	 * FinancialInstrumentAttributes23SD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UseOfPostEffectiveDateClassificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PostEffectiveDateClassification can only be used with Event Type Code MRGR."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes23SD1> forFinancialInstrumentAttributes23SD1 = new MMConstraint<FinancialInstrumentAttributes23SD1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UseOfPostEffectiveDateClassificationRule";
			definition = "PostEffectiveDateClassification can only be used with Event Type Code MRGR.";
			owner_lazy = () -> FinancialInstrumentAttributes23SD1.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes23SD1 obj) throws Exception {
			checkFinancialInstrumentAttributes23SD1(obj);
		}
	};

	/**
	 * PostEffectiveDateClassification can only be used with Event Type Code
	 * MRGR.
	 */
	public static void checkFinancialInstrumentAttributes23SD1(FinancialInstrumentAttributes23SD1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}