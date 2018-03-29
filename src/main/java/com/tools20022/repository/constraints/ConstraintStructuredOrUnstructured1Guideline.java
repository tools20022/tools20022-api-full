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
import com.tools20022.repository.choice.LongPostalAddress2Choice;

/**
 * It is recommended that Structured be used.
 */
public class ConstraintStructuredOrUnstructured1Guideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.LongPostalAddress2Choice
	 * LongPostalAddress2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StructuredOrUnstructured1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "It is recommended that Structured be used."</li>
	 * </ul>
	 */
	public static final MMConstraint<LongPostalAddress2Choice> forLongPostalAddress2Choice = new MMConstraint<LongPostalAddress2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StructuredOrUnstructured1Guideline";
			definition = "It is recommended that Structured be used.";
			owner_lazy = () -> LongPostalAddress2Choice.mmObject();
		}

		@Override
		public void executeValidator(LongPostalAddress2Choice obj) throws Exception {
			checkLongPostalAddress2Choice(obj);
		}
	};

	/**
	 * It is recommended that Structured be used.
	 */
	public static void checkLongPostalAddress2Choice(LongPostalAddress2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}