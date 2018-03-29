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
import com.tools20022.repository.msg.StructuredLongPostalAddress1;

/**
 * If StreetName is not present, then PostOfficeBox is mandatory. If StreetName
 * is present, then PostOfficeBox is optional.
 */
public class ConstraintStreetNameAndOrPostOfficeBoxRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1
	 * StructuredLongPostalAddress1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetNameAndOrPostOfficeBoxRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StreetName is not present, then PostOfficeBox is mandatory. If StreetName is present, then PostOfficeBox is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StructuredLongPostalAddress1> forStructuredLongPostalAddress1 = new MMConstraint<StructuredLongPostalAddress1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetNameAndOrPostOfficeBoxRule";
			definition = "If StreetName is not present, then PostOfficeBox is mandatory. If StreetName is present, then PostOfficeBox is optional.";
			owner_lazy = () -> StructuredLongPostalAddress1.mmObject();
		}

		@Override
		public void executeValidator(StructuredLongPostalAddress1 obj) throws Exception {
			checkStructuredLongPostalAddress1(obj);
		}
	};

	/**
	 * If StreetName is not present, then PostOfficeBox is mandatory. If
	 * StreetName is present, then PostOfficeBox is optional.
	 */
	public static void checkStructuredLongPostalAddress1(StructuredLongPostalAddress1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}