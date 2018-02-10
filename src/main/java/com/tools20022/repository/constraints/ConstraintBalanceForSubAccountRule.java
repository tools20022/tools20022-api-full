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
import com.tools20022.repository.msg.SubAccountIdentification1;
import com.tools20022.repository.msg.SubAccountIdentification2;

/**
 * If SubAccountIdentification2/ActivityIndicator is "true" or "1" (Yes), then
 * SubAccountIdentification2/BalanceForSubAccount must be present.
 */
public class ConstraintBalanceForSubAccountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification2
	 * SubAccountIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForSubAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SubAccountIdentification2/ActivityIndicator is \"true\" or \"1\" (Yes), then SubAccountIdentification2/BalanceForSubAccount must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification2> forSubAccountIdentification2 = new MMConstraint<SubAccountIdentification2>() {
		{
			validator = ConstraintBalanceForSubAccountRule::checkSubAccountIdentification2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForSubAccountRule";
			definition = "If SubAccountIdentification2/ActivityIndicator is \"true\" or \"1\" (Yes), then SubAccountIdentification2/BalanceForSubAccount must be present.";
			owner_lazy = () -> SubAccountIdentification2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification1
	 * SubAccountIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForSubAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SubAccountIdentification/ActivityIndicator is \"true\" or \"1\" (Yes), then SubAccountIdentification/ BalanceForSubAccount must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification1> forSubAccountIdentification1 = new MMConstraint<SubAccountIdentification1>() {
		{
			validator = ConstraintBalanceForSubAccountRule::checkSubAccountIdentification1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForSubAccountRule";
			definition = "If SubAccountIdentification/ActivityIndicator is \"true\" or \"1\" (Yes), then SubAccountIdentification/ BalanceForSubAccount must be present.";
			owner_lazy = () -> SubAccountIdentification1.mmObject();
		}
	};

	/**
	 * If SubAccountIdentification2/ActivityIndicator is "true" or "1" (Yes),
	 * then SubAccountIdentification2/BalanceForSubAccount must be present.
	 */
	public static void checkSubAccountIdentification2(SubAccountIdentification2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SubAccountIdentification/ActivityIndicator is "true" or "1" (Yes),
	 * then SubAccountIdentification/ BalanceForSubAccount must be present.
	 */
	public static void checkSubAccountIdentification1(SubAccountIdentification1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}