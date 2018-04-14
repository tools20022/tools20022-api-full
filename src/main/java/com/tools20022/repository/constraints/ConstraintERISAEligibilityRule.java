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
import com.tools20022.repository.msg.BeneficiaryInformation1;
import com.tools20022.repository.msg.BeneficiaryInformation2;

/**
 * If ERISAEligibility is ELIG, then ERISARate must be present.
 */
public class ConstraintERISAEligibilityRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2
	 * BeneficiaryInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISAEligibilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ERISAEligibility is ELIG, then ERISARate must be present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<BeneficiaryInformation2> forBeneficiaryInformation2 = new MMConstraint<BeneficiaryInformation2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISAEligibilityRule";
			definition = "If ERISAEligibility is ELIG, then ERISARate must be present.";
			owner_lazy = () -> BeneficiaryInformation2.mmObject();
		}

		@Override
		public void executeValidator(BeneficiaryInformation2 obj) throws Exception {
			checkBeneficiaryInformation2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1
	 * BeneficiaryInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISAEligibilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ERISAEligibility is ELIG, then ERISARate must be present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<BeneficiaryInformation1> forBeneficiaryInformation1 = new MMConstraint<BeneficiaryInformation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISAEligibilityRule";
			definition = "If ERISAEligibility is ELIG, then ERISARate must be present.";
			owner_lazy = () -> BeneficiaryInformation1.mmObject();
		}

		@Override
		public void executeValidator(BeneficiaryInformation1 obj) throws Exception {
			checkBeneficiaryInformation1(obj);
		}
	};

	/**
	 * If ERISAEligibility is ELIG, then ERISARate must be present.
	 */
	public static void checkBeneficiaryInformation2(BeneficiaryInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ERISAEligibility is ELIG, then ERISARate must be present.
	 */
	public static void checkBeneficiaryInformation1(BeneficiaryInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}