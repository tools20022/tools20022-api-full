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
import com.tools20022.repository.msg.Balance14;
import com.tools20022.repository.msg.Balance3;
import java.util.Arrays;

/**
 * BalanceForAccount must be present or SubAccountDetails must be present, both
 * may be present.
 */
public class ConstraintBalanceForAccountOrSubAccountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Balance3 Balance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BalanceForAccount must be present or SubAccountDetails must be present, both may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountRule#forBalance14
	 * ConstraintBalanceForAccountOrSubAccountRule.forBalance14}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Balance3> forBalance3 = new MMConstraint<Balance3>() {
		{
			validator = ConstraintBalanceForAccountOrSubAccountRule::checkBalance3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountRule";
			definition = "BalanceForAccount must be present or SubAccountDetails must be present, both may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountRule.forBalance14);
			owner_lazy = () -> Balance3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Balance14 Balance14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BalanceForAccount must be present or SubAccountDetails must be present, both may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountRule#forBalance3
	 * ConstraintBalanceForAccountOrSubAccountRule.forBalance3}</li>
	 * </ul>
	 */
	public static final MMConstraint<Balance14> forBalance14 = new MMConstraint<Balance14>() {
		{
			validator = ConstraintBalanceForAccountOrSubAccountRule::checkBalance14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountRule";
			definition = "BalanceForAccount must be present or SubAccountDetails must be present, both may be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountRule.forBalance3;
			owner_lazy = () -> Balance14.mmObject();
		}
	};

	/**
	 * BalanceForAccount must be present or SubAccountDetails must be present,
	 * both may be present.
	 */
	public static void checkBalance3(Balance3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * BalanceForAccount must be present or SubAccountDetails must be present,
	 * both may be present.
	 */
	public static void checkBalance14(Balance14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}