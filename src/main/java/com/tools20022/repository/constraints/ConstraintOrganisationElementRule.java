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
import com.tools20022.repository.msg.Organisation29;
import com.tools20022.repository.msg.Organisation30;

/**
 * One of the elements (Name, ShortName, Identification, LegalEntityIdentifier,
 * Purpose, RegistrationCountry, RegistrationDate, PostalAddress,
 * TypeOfOrganisation, PlaceOfListing) must be present.
 */
public class ConstraintOrganisationElementRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of the elements (Name, ShortName, Identification, LegalEntityIdentifier, Purpose, RegistrationCountry, RegistrationDate, PostalAddress, TypeOfOrganisation, PlaceOfListing) must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Organisation30> forOrganisation30 = new MMConstraint<Organisation30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationElementRule";
			definition = "One of the elements (Name, ShortName, Identification, LegalEntityIdentifier, Purpose, RegistrationCountry, RegistrationDate, PostalAddress, TypeOfOrganisation, PlaceOfListing) must be present.";
			owner_lazy = () -> Organisation30.mmObject();
		}

		@Override
		public void executeValidator(Organisation30 obj) throws Exception {
			checkOrganisation30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Organisation29 Organisation29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of the elements (Name, ShortName, Identification, LegalEntityIdentifier, Purpose, RegistrationCountry, RegistrationDate, ModifiedPostalAddress, TypeOfOrganisation, PlaceOfListing) must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Organisation29> forOrganisation29 = new MMConstraint<Organisation29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationElementRule";
			definition = "One of the elements (Name, ShortName, Identification, LegalEntityIdentifier, Purpose, RegistrationCountry, RegistrationDate, ModifiedPostalAddress, TypeOfOrganisation, PlaceOfListing) must be present.";
			owner_lazy = () -> Organisation29.mmObject();
		}

		@Override
		public void executeValidator(Organisation29 obj) throws Exception {
			checkOrganisation29(obj);
		}
	};

	/**
	 * One of the elements (Name, ShortName, Identification,
	 * LegalEntityIdentifier, Purpose, RegistrationCountry, RegistrationDate,
	 * PostalAddress, TypeOfOrganisation, PlaceOfListing) must be present.
	 */
	public static void checkOrganisation30(Organisation30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * One of the elements (Name, ShortName, Identification,
	 * LegalEntityIdentifier, Purpose, RegistrationCountry, RegistrationDate,
	 * ModifiedPostalAddress, TypeOfOrganisation, PlaceOfListing) must be
	 * present.
	 */
	public static void checkOrganisation29(Organisation29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}