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
import com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1;
import com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3;
import java.util.Arrays;

/**
 * Shareholder list registrar phone number must start with "+81".
 */
public class ConstraintUseOfShareholderListRegistrarContactDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1
	 * UpdatedAdditionalInformation5SD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UseOfShareholderListRegistrarContactDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Shareholder list registrar phone number must start with \"+81\"."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUseOfShareholderListRegistrarContactDetailsRule#forUpdatedAdditionalInformation5SD3
	 * ConstraintUseOfShareholderListRegistrarContactDetailsRule.
	 * forUpdatedAdditionalInformation5SD3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedAdditionalInformation5SD1> forUpdatedAdditionalInformation5SD1 = new MMConstraint<UpdatedAdditionalInformation5SD1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UseOfShareholderListRegistrarContactDetailsRule";
			definition = "Shareholder list registrar phone number must start with \"+81\".";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUseOfShareholderListRegistrarContactDetailsRule.forUpdatedAdditionalInformation5SD3);
			owner_lazy = () -> UpdatedAdditionalInformation5SD1.mmObject();
		}

		@Override
		public void executeValidator(UpdatedAdditionalInformation5SD1 obj) throws Exception {
			checkUpdatedAdditionalInformation5SD1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3
	 * UpdatedAdditionalInformation5SD3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UseOfShareholderListRegistrarContactDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Shareholder list registrar phone number must start with \"+81\"."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUseOfShareholderListRegistrarContactDetailsRule#forUpdatedAdditionalInformation5SD1
	 * ConstraintUseOfShareholderListRegistrarContactDetailsRule.
	 * forUpdatedAdditionalInformation5SD1}</li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedAdditionalInformation5SD3> forUpdatedAdditionalInformation5SD3 = new MMConstraint<UpdatedAdditionalInformation5SD3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UseOfShareholderListRegistrarContactDetailsRule";
			definition = "Shareholder list registrar phone number must start with \"+81\".";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUseOfShareholderListRegistrarContactDetailsRule.forUpdatedAdditionalInformation5SD1;
			owner_lazy = () -> UpdatedAdditionalInformation5SD3.mmObject();
		}

		@Override
		public void executeValidator(UpdatedAdditionalInformation5SD3 obj) throws Exception {
			checkUpdatedAdditionalInformation5SD3(obj);
		}
	};

	/**
	 * Shareholder list registrar phone number must start with "+81".
	 */
	public static void checkUpdatedAdditionalInformation5SD1(UpdatedAdditionalInformation5SD1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Shareholder list registrar phone number must start with "+81".
	 */
	public static void checkUpdatedAdditionalInformation5SD3(UpdatedAdditionalInformation5SD3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}