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
import com.tools20022.repository.msg.Undertaking3;

/**
 * If PlaceOfPresentation is "PRES", then one occurrence of
 * AdditionalParty/TypeCode must be "PRES".
 */
public class ConstraintPlaceOfPresentation1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfPresentation1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfPresentation is \"PRES\", then one occurrence of AdditionalParty/TypeCode must be \"PRES\"."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Undertaking3> forUndertaking3 = new MMConstraint<Undertaking3>() {
		{
			validator = ConstraintPlaceOfPresentation1Rule::checkUndertaking3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfPresentation1Rule";
			definition = "If PlaceOfPresentation is \"PRES\", then one occurrence of AdditionalParty/TypeCode must be \"PRES\".";
			owner_lazy = () -> Undertaking3.mmObject();
		}
	};

	/**
	 * If PlaceOfPresentation is "PRES", then one occurrence of
	 * AdditionalParty/TypeCode must be "PRES".
	 */
	public static void checkUndertaking3(Undertaking3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}