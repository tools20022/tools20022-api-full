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
import com.tools20022.repository.msg.SubAccountIdentification36;
import com.tools20022.repository.msg.SubAccountIdentification4;
import com.tools20022.repository.msg.SubAccountIdentification6;
import java.util.Arrays;

/**
 * If ActivityIndicator is "true" or "1" (Yes), then TransactionOnSubAccount
 * must be present. If ActivityIndicator is "false" or "0" (No), then
 * TransactionOnSubAccount is not allowed.
 */
public class ConstraintTransactionOnSubAccountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification36
	 * SubAccountIdentification36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOnSubAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ActivityIndicator is \"true\" or \"1\" (Yes), then TransactionOnSubAccount must be present. If ActivityIndicator is \"false\" or \"0\" (No), then TransactionOnSubAccount is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionOnSubAccountRule#forSubAccountIdentification6
	 * ConstraintTransactionOnSubAccountRule.forSubAccountIdentification6}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification36> forSubAccountIdentification36 = new MMConstraint<SubAccountIdentification36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOnSubAccountRule";
			definition = "If ActivityIndicator is \"true\" or \"1\" (Yes), then TransactionOnSubAccount must be present. If ActivityIndicator is \"false\" or \"0\" (No), then TransactionOnSubAccount is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTransactionOnSubAccountRule.forSubAccountIdentification6;
			owner_lazy = () -> SubAccountIdentification36.mmObject();
		}

		@Override
		public void executeValidator(SubAccountIdentification36 obj) throws Exception {
			checkSubAccountIdentification36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification6
	 * SubAccountIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOnSubAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ActivityIndicator is \"true\" or \"1\" (Yes), then TransactionOnSubAccount must be present. If ActivityIndicator is \"false\" or \"0\" (No), then TransactionOnSubAccount is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionOnSubAccountRule#forSubAccountIdentification36
	 * ConstraintTransactionOnSubAccountRule.forSubAccountIdentification36}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification6> forSubAccountIdentification6 = new MMConstraint<SubAccountIdentification6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOnSubAccountRule";
			definition = "If ActivityIndicator is \"true\" or \"1\" (Yes), then TransactionOnSubAccount must be present. If ActivityIndicator is \"false\" or \"0\" (No), then TransactionOnSubAccount is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransactionOnSubAccountRule.forSubAccountIdentification36);
			owner_lazy = () -> SubAccountIdentification6.mmObject();
		}

		@Override
		public void executeValidator(SubAccountIdentification6 obj) throws Exception {
			checkSubAccountIdentification6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification4
	 * SubAccountIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOnSubAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either TransactionOnAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then TransactionOnAccount and SubAccountDetails are not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification4> forSubAccountIdentification4 = new MMConstraint<SubAccountIdentification4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOnSubAccountRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either TransactionOnAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then TransactionOnAccount and SubAccountDetails are not allowed.";
			owner_lazy = () -> SubAccountIdentification4.mmObject();
		}

		@Override
		public void executeValidator(SubAccountIdentification4 obj) throws Exception {
			checkSubAccountIdentification4(obj);
		}
	};

	/**
	 * If ActivityIndicator is "true" or "1" (Yes), then TransactionOnSubAccount
	 * must be present. If ActivityIndicator is "false" or "0" (No), then
	 * TransactionOnSubAccount is not allowed.
	 */
	public static void checkSubAccountIdentification36(SubAccountIdentification36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ActivityIndicator is "true" or "1" (Yes), then TransactionOnSubAccount
	 * must be present. If ActivityIndicator is "false" or "0" (No), then
	 * TransactionOnSubAccount is not allowed.
	 */
	public static void checkSubAccountIdentification6(SubAccountIdentification6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either TransactionOnAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * TransactionOnAccount and SubAccountDetails are not allowed.
	 */
	public static void checkSubAccountIdentification4(SubAccountIdentification4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}