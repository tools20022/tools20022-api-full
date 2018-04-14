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
import com.tools20022.repository.msg.IndividualPerson3;
import com.tools20022.repository.msg.IndividualPerson8;

/**
 * The UK Insurance Number must be indicated without spaces.
 */
public class ConstraintSocialSecurityNumberGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson3
	 * IndividualPerson3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityNumberGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The UK Insurance Number must be indicated without spaces."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<IndividualPerson3> forIndividualPerson3 = new MMConstraint<IndividualPerson3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityNumberGuideline";
			definition = "The UK Insurance Number must be indicated without spaces.";
			owner_lazy = () -> IndividualPerson3.mmObject();
		}

		@Override
		public void executeValidator(IndividualPerson3 obj) throws Exception {
			checkIndividualPerson3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityNumberGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The UK Insurance Number must be indicated without spaces."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<IndividualPerson8> forIndividualPerson8 = new MMConstraint<IndividualPerson8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityNumberGuideline";
			definition = "The UK Insurance Number must be indicated without spaces.";
			owner_lazy = () -> IndividualPerson8.mmObject();
		}

		@Override
		public void executeValidator(IndividualPerson8 obj) throws Exception {
			checkIndividualPerson8(obj);
		}
	};

	/**
	 * The UK Insurance Number must be indicated without spaces.
	 */
	public static void checkIndividualPerson3(IndividualPerson3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The UK Insurance Number must be indicated without spaces.
	 */
	public static void checkIndividualPerson8(IndividualPerson8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}