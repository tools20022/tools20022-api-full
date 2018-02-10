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
import com.tools20022.repository.msg.SecuritiesAccountStatus1;

/**
 * If Status equals COMP (Completed) then RelatedSecuritiesAccount must be
 * present.
 */
public class ConstraintPresenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatus1
	 * SecuritiesAccountStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Status equals COMP (Completed) then RelatedSecuritiesAccount must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesAccountStatus1> forSecuritiesAccountStatus1 = new MMConstraint<SecuritiesAccountStatus1>() {
		{
			validator = ConstraintPresenceRule::checkSecuritiesAccountStatus1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresenceRule";
			definition = "If Status equals COMP (Completed) then RelatedSecuritiesAccount must be present.";
			owner_lazy = () -> SecuritiesAccountStatus1.mmObject();
		}
	};

	/**
	 * If Status equals COMP (Completed) then RelatedSecuritiesAccount must be
	 * present.
	 */
	public static void checkSecuritiesAccountStatus1(SecuritiesAccountStatus1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}