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
import java.util.Arrays;

/**
 * If GroupReturn is true, then NumberOfTransactions equals the number of
 * transactions in the original message.
 */
public class ConstraintGroupReturnAndNumberOfTransactionsGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6 GroupHeader6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReturnAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReturn is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader6> forGroupHeader6 = new MMConstraint<GroupHeader6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReturnAndNumberOfTransactionsGuideline";
			definition = "If GroupReturn is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader6.mmObject();
		}

		@Override
		public void executeValidator(GroupHeader6 obj) throws Exception {
			checkGroupHeader6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader38 GroupHeader38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReturnAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReturn is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader38> forGroupHeader38 = new MMConstraint<GroupHeader38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReturnAndNumberOfTransactionsGuideline";
			definition = "If GroupReturn is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader38.mmObject();
		}

		@Override
		public void executeValidator(GroupHeader38 obj) throws Exception {
			checkGroupHeader38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader54 GroupHeader54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReturnAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReturn is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndNumberOfTransactionsGuideline#forGroupHeader72
	 * ConstraintGroupReturnAndNumberOfTransactionsGuideline.forGroupHeader72}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader54> forGroupHeader54 = new MMConstraint<GroupHeader54>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReturnAndNumberOfTransactionsGuideline";
			definition = "If GroupReturn is true, then NumberOfTransactions equals the number of transactions in the original message.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReturnAndNumberOfTransactionsGuideline.forGroupHeader72);
			owner_lazy = () -> GroupHeader54.mmObject();
		}

		@Override
		public void executeValidator(GroupHeader54 obj) throws Exception {
			checkGroupHeader54(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17 GroupHeader17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReturnAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Guideline: \nIf GroupReturn is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader17> forGroupHeader17 = new MMConstraint<GroupHeader17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReturnAndNumberOfTransactionsGuideline";
			definition = "ISO20022 Guideline: \nIf GroupReturn is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader17.mmObject();
		}

		@Override
		public void executeValidator(GroupHeader17 obj) throws Exception {
			checkGroupHeader17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27 GroupHeader27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReturnAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Guideline: \nIf GroupReturn is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader27> forGroupHeader27 = new MMConstraint<GroupHeader27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReturnAndNumberOfTransactionsGuideline";
			definition = "ISO20022 Guideline: \nIf GroupReturn is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader27.mmObject();
		}

		@Override
		public void executeValidator(GroupHeader27 obj) throws Exception {
			checkGroupHeader27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72 GroupHeader72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReturnAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReturn is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndNumberOfTransactionsGuideline#forGroupHeader54
	 * ConstraintGroupReturnAndNumberOfTransactionsGuideline.forGroupHeader54}</li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader72> forGroupHeader72 = new MMConstraint<GroupHeader72>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReturnAndNumberOfTransactionsGuideline";
			definition = "If GroupReturn is true, then NumberOfTransactions equals the number of transactions in the original message.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupReturnAndNumberOfTransactionsGuideline.forGroupHeader54;
			owner_lazy = () -> GroupHeader72.mmObject();
		}

		@Override
		public void executeValidator(GroupHeader72 obj) throws Exception {
			checkGroupHeader72(obj);
		}
	};

	/**
	 * If GroupReturn is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader6(GroupHeader6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupReturn is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader38(GroupHeader38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupReturn is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader54(GroupHeader54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Guideline: If GroupReturn is true, then NumberOfTransactions
	 * equals the number of transactions in the original message.
	 */
	public static void checkGroupHeader17(GroupHeader17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Guideline: If GroupReturn is true, then NumberOfTransactions
	 * equals the number of transactions in the original message.
	 */
	public static void checkGroupHeader27(GroupHeader27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupReturn is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader72(GroupHeader72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}