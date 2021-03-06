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
import com.tools20022.repository.msg.AccountManagementMessageReference1;

/**
 * At least one message element in the list (PreviousReference, OtherReference,
 * AccountApplicationIdentification) must be present.
 */
public class ConstraintPreviousOrOtherReferenceOrAccountApplicationIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference1
	 * AccountManagementMessageReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousOrOtherReferenceOrAccountApplicationIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one message element in the list (PreviousReference, OtherReference, AccountApplicationIdentification) must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountManagementMessageReference1> forAccountManagementMessageReference1 = new MMConstraint<AccountManagementMessageReference1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousOrOtherReferenceOrAccountApplicationIdentificationRule";
			definition = "At least one message element in the list (PreviousReference, OtherReference, AccountApplicationIdentification) must be present.";
			owner_lazy = () -> AccountManagementMessageReference1.mmObject();
		}

		@Override
		public void executeValidator(AccountManagementMessageReference1 obj) throws Exception {
			checkAccountManagementMessageReference1(obj);
		}
	};

	/**
	 * At least one message element in the list (PreviousReference,
	 * OtherReference, AccountApplicationIdentification) must be present.
	 */
	public static void checkAccountManagementMessageReference1(AccountManagementMessageReference1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}