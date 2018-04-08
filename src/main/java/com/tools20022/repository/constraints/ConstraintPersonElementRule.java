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
import com.tools20022.repository.msg.IndividualPerson31;
import com.tools20022.repository.msg.IndividualPerson32;

/**
 * One of the elements (Name, BirthDate, CountryAndResidentialStatus,
 * BeneficiaryCertificationCompletion, OtherIdentification) must be present.
 */
public class ConstraintPersonElementRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson31
	 * IndividualPerson31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of the elements (Name, BirthDate, CountryAndResidentialStatus, BeneficiaryCertificationCompletion, OtherIdentification) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IndividualPerson31> forIndividualPerson31 = new MMConstraint<IndividualPerson31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonElementRule";
			definition = "One of the elements (Name, BirthDate, CountryAndResidentialStatus, BeneficiaryCertificationCompletion, OtherIdentification) must be present.";
			owner_lazy = () -> IndividualPerson31.mmObject();
		}

		@Override
		public void executeValidator(IndividualPerson31 obj) throws Exception {
			checkIndividualPerson31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson32
	 * IndividualPerson32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of the elements (Name, BirthDate, CountryAndResidentialStatus, OtherIdentification) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IndividualPerson32> forIndividualPerson32 = new MMConstraint<IndividualPerson32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonElementRule";
			definition = "One of the elements (Name, BirthDate, CountryAndResidentialStatus, OtherIdentification) must be present.";
			owner_lazy = () -> IndividualPerson32.mmObject();
		}

		@Override
		public void executeValidator(IndividualPerson32 obj) throws Exception {
			checkIndividualPerson32(obj);
		}
	};

	/**
	 * One of the elements (Name, BirthDate, CountryAndResidentialStatus,
	 * BeneficiaryCertificationCompletion, OtherIdentification) must be present.
	 */
	public static void checkIndividualPerson31(IndividualPerson31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * One of the elements (Name, BirthDate, CountryAndResidentialStatus,
	 * OtherIdentification) must be present.
	 */
	public static void checkIndividualPerson32(IndividualPerson32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}