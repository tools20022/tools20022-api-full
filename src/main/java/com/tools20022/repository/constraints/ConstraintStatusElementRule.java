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
import com.tools20022.repository.msg.AccountStatus2;

/**
 * One of the elements (Enabled, Disabled, Pending, PendingOpening, Proforma,
 * Closed, ClosurePending, Other) must be present.
 */
public class ConstraintStatusElementRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2 AccountStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of the elements (Enabled, Disabled, Pending, PendingOpening, Proforma, Closed, ClosurePending, Other) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountStatus2> forAccountStatus2 = new MMConstraint<AccountStatus2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusElementRule";
			definition = "One of the elements (Enabled, Disabled, Pending, PendingOpening, Proforma, Closed, ClosurePending, Other) must be present.";
			owner_lazy = () -> AccountStatus2.mmObject();
		}

		@Override
		public void executeValidator(AccountStatus2 obj) throws Exception {
			checkAccountStatus2(obj);
		}
	};

	/**
	 * One of the elements (Enabled, Disabled, Pending, PendingOpening,
	 * Proforma, Closed, ClosurePending, Other) must be present.
	 */
	public static void checkAccountStatus2(AccountStatus2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}