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
import com.tools20022.repository.choice.BeneficiaryCertificationType1Choice;
import com.tools20022.repository.choice.BeneficiaryCertificationType2Choice;
import com.tools20022.repository.choice.BeneficiaryCertificationType3Choice;
import com.tools20022.repository.choice.BeneficiaryCertificationType4Choice;

/**
 * Code/NarrativeDescription shall only be used when all the other code
 * possibilities are not appropriate.
 */
public class ConstraintNarrativeDescriptionRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType4Choice
	 * BeneficiaryCertificationType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeDescriptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code/NarrativeDescription shall only be used when all the other code possibilities are not appropriate."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BeneficiaryCertificationType4Choice> forBeneficiaryCertificationType4Choice = new MMConstraint<BeneficiaryCertificationType4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeDescriptionRule";
			definition = "Code/NarrativeDescription shall only be used when all the other code possibilities are not appropriate.";
			owner_lazy = () -> BeneficiaryCertificationType4Choice.mmObject();
		}

		@Override
		public void executeValidator(BeneficiaryCertificationType4Choice obj) throws Exception {
			checkBeneficiaryCertificationType4Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType2Choice
	 * BeneficiaryCertificationType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeDescriptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code/NarrativeDescription shall only be used when all the other code possibilities are not appropriate."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BeneficiaryCertificationType2Choice> forBeneficiaryCertificationType2Choice = new MMConstraint<BeneficiaryCertificationType2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeDescriptionRule";
			definition = "Code/NarrativeDescription shall only be used when all the other code possibilities are not appropriate.";
			owner_lazy = () -> BeneficiaryCertificationType2Choice.mmObject();
		}

		@Override
		public void executeValidator(BeneficiaryCertificationType2Choice obj) throws Exception {
			checkBeneficiaryCertificationType2Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType3Choice
	 * BeneficiaryCertificationType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeDescriptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code/NarrativeDescription shall only be used when all the other code possibilities are not appropriate."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BeneficiaryCertificationType3Choice> forBeneficiaryCertificationType3Choice = new MMConstraint<BeneficiaryCertificationType3Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeDescriptionRule";
			definition = "Code/NarrativeDescription shall only be used when all the other code possibilities are not appropriate.";
			owner_lazy = () -> BeneficiaryCertificationType3Choice.mmObject();
		}

		@Override
		public void executeValidator(BeneficiaryCertificationType3Choice obj) throws Exception {
			checkBeneficiaryCertificationType3Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1Choice
	 * BeneficiaryCertificationType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeDescriptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code/NarrativeDescription shall only be used when all the other code possibilities are not appropriate."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BeneficiaryCertificationType1Choice> forBeneficiaryCertificationType1Choice = new MMConstraint<BeneficiaryCertificationType1Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeDescriptionRule";
			definition = "Code/NarrativeDescription shall only be used when all the other code possibilities are not appropriate.";
			owner_lazy = () -> BeneficiaryCertificationType1Choice.mmObject();
		}

		@Override
		public void executeValidator(BeneficiaryCertificationType1Choice obj) throws Exception {
			checkBeneficiaryCertificationType1Choice(obj);
		}
	};

	/**
	 * Code/NarrativeDescription shall only be used when all the other code
	 * possibilities are not appropriate.
	 */
	public static void checkBeneficiaryCertificationType4Choice(BeneficiaryCertificationType4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Code/NarrativeDescription shall only be used when all the other code
	 * possibilities are not appropriate.
	 */
	public static void checkBeneficiaryCertificationType2Choice(BeneficiaryCertificationType2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Code/NarrativeDescription shall only be used when all the other code
	 * possibilities are not appropriate.
	 */
	public static void checkBeneficiaryCertificationType3Choice(BeneficiaryCertificationType3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Code/NarrativeDescription shall only be used when all the other code
	 * possibilities are not appropriate.
	 */
	public static void checkBeneficiaryCertificationType1Choice(BeneficiaryCertificationType1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}