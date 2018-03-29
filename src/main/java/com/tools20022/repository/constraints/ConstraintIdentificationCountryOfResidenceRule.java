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
import com.tools20022.repository.msg.*;

/**
 * Identification and/or CountryOfResidence must be present.
 */
public class ConstraintIdentificationCountryOfResidenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount19
	 * PartyIdentificationAndAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationCountryOfResidenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification and/or CountryOfResidence must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount19> forPartyIdentificationAndAccount19 = new MMConstraint<PartyIdentificationAndAccount19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationCountryOfResidenceRule";
			definition = "Identification and/or CountryOfResidence must be present.";
			owner_lazy = () -> PartyIdentificationAndAccount19.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount19 obj) throws Exception {
			checkPartyIdentificationAndAccount19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount40
	 * PartyIdentificationAndAccount40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationCountryOfResidenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification and/or CountryOfResidence must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount40> forPartyIdentificationAndAccount40 = new MMConstraint<PartyIdentificationAndAccount40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationCountryOfResidenceRule";
			definition = "Identification and/or CountryOfResidence must be present.";
			owner_lazy = () -> PartyIdentificationAndAccount40.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount40 obj) throws Exception {
			checkPartyIdentificationAndAccount40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount28
	 * PartyIdentificationAndAccount28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationCountryOfResidenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification and/or CountryOfResidence must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount28> forPartyIdentificationAndAccount28 = new MMConstraint<PartyIdentificationAndAccount28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationCountryOfResidenceRule";
			definition = "Identification and/or CountryOfResidence must be present.";
			owner_lazy = () -> PartyIdentificationAndAccount28.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount28 obj) throws Exception {
			checkPartyIdentificationAndAccount28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount36
	 * PartyIdentificationAndAccount36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationCountryOfResidenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification and/or CountryOfResidence must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount36> forPartyIdentificationAndAccount36 = new MMConstraint<PartyIdentificationAndAccount36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationCountryOfResidenceRule";
			definition = "Identification and/or CountryOfResidence must be present.";
			owner_lazy = () -> PartyIdentificationAndAccount36.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount36 obj) throws Exception {
			checkPartyIdentificationAndAccount36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount61
	 * PartyIdentificationAndAccount61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationCountryOfResidenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification and/or CountryOfResidence must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount61> forPartyIdentificationAndAccount61 = new MMConstraint<PartyIdentificationAndAccount61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationCountryOfResidenceRule";
			definition = "Identification and/or CountryOfResidence must be present.";
			owner_lazy = () -> PartyIdentificationAndAccount61.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount61 obj) throws Exception {
			checkPartyIdentificationAndAccount61(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount65
	 * PartyIdentificationAndAccount65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationCountryOfResidenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification and/or CountryOfResidence must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount65> forPartyIdentificationAndAccount65 = new MMConstraint<PartyIdentificationAndAccount65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationCountryOfResidenceRule";
			definition = "Identification and/or CountryOfResidence must be present.";
			owner_lazy = () -> PartyIdentificationAndAccount65.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount65 obj) throws Exception {
			checkPartyIdentificationAndAccount65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount46
	 * PartyIdentificationAndAccount46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationCountryOfResidenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification and/or CountryOfResidence must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount46> forPartyIdentificationAndAccount46 = new MMConstraint<PartyIdentificationAndAccount46>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationCountryOfResidenceRule";
			definition = "Identification and/or CountryOfResidence must be present.";
			owner_lazy = () -> PartyIdentificationAndAccount46.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount46 obj) throws Exception {
			checkPartyIdentificationAndAccount46(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount73
	 * PartyIdentificationAndAccount73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationCountryOfResidenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification and/or CountryOfResidence must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount73> forPartyIdentificationAndAccount73 = new MMConstraint<PartyIdentificationAndAccount73>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationCountryOfResidenceRule";
			definition = "Identification and/or CountryOfResidence must be present.";
			owner_lazy = () -> PartyIdentificationAndAccount73.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount73 obj) throws Exception {
			checkPartyIdentificationAndAccount73(obj);
		}
	};

	/**
	 * Identification and/or CountryOfResidence must be present.
	 */
	public static void checkPartyIdentificationAndAccount19(PartyIdentificationAndAccount19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification and/or CountryOfResidence must be present.
	 */
	public static void checkPartyIdentificationAndAccount40(PartyIdentificationAndAccount40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification and/or CountryOfResidence must be present.
	 */
	public static void checkPartyIdentificationAndAccount28(PartyIdentificationAndAccount28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification and/or CountryOfResidence must be present.
	 */
	public static void checkPartyIdentificationAndAccount36(PartyIdentificationAndAccount36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification and/or CountryOfResidence must be present.
	 */
	public static void checkPartyIdentificationAndAccount61(PartyIdentificationAndAccount61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification and/or CountryOfResidence must be present.
	 */
	public static void checkPartyIdentificationAndAccount65(PartyIdentificationAndAccount65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification and/or CountryOfResidence must be present.
	 */
	public static void checkPartyIdentificationAndAccount46(PartyIdentificationAndAccount46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification and/or CountryOfResidence must be present.
	 */
	public static void checkPartyIdentificationAndAccount73(PartyIdentificationAndAccount73 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}