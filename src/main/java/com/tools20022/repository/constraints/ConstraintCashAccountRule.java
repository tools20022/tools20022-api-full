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
 * CashAccount must be present or Cancellation(*)/CashAccount must be present,
 * but not both.
 */
public class ConstraintCashAccountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification3
	 * IntraBalanceModification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CashAccount must be present or Cancellation(*)/CashAccount must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashAccountRule#forIntraBalanceModification1
	 * ConstraintCashAccountRule.forIntraBalanceModification1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceModification3> forIntraBalanceModification3 = new MMConstraint<IntraBalanceModification3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountRule";
			definition = "CashAccount must be present or Cancellation(*)/CashAccount must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashAccountRule.forIntraBalanceModification1;
			owner_lazy = () -> IntraBalanceModification3.mmObject();
		}

		@Override
		public void executeValidator(IntraBalanceModification3 obj) throws Exception {
			checkIntraBalanceModification3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation3
	 * IntraBalanceCancellation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CashAccount must be present or Cancellation(*)/CashAccount must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashAccountRule#forIntraBalanceCancellation1
	 * ConstraintCashAccountRule.forIntraBalanceCancellation1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceCancellation3> forIntraBalanceCancellation3 = new MMConstraint<IntraBalanceCancellation3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountRule";
			definition = "CashAccount must be present or Cancellation(*)/CashAccount must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashAccountRule.forIntraBalanceCancellation1;
			owner_lazy = () -> IntraBalanceCancellation3.mmObject();
		}

		@Override
		public void executeValidator(IntraBalanceCancellation3 obj) throws Exception {
			checkIntraBalanceCancellation3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovements1
	 * IntraBalanceMovements1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CashAccount must be present or Movement(*)/CashAccount must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashAccountRule#forIntraBalanceMovements2
	 * ConstraintCashAccountRule.forIntraBalanceMovements2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceMovements1> forIntraBalanceMovements1 = new MMConstraint<IntraBalanceMovements1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountRule";
			definition = "CashAccount must be present or Movement(*)/CashAccount must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashAccountRule.forIntraBalanceMovements2);
			owner_lazy = () -> IntraBalanceMovements1.mmObject();
		}

		@Override
		public void executeValidator(IntraBalanceMovements1 obj) throws Exception {
			checkIntraBalanceMovements1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification1
	 * IntraBalanceModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CashAccount must be present or Cancellation(*)/CashAccount must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashAccountRule#forIntraBalanceModification3
	 * ConstraintCashAccountRule.forIntraBalanceModification3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceModification1> forIntraBalanceModification1 = new MMConstraint<IntraBalanceModification1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountRule";
			definition = "CashAccount must be present or Cancellation(*)/CashAccount must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashAccountRule.forIntraBalanceModification3);
			owner_lazy = () -> IntraBalanceModification1.mmObject();
		}

		@Override
		public void executeValidator(IntraBalanceModification1 obj) throws Exception {
			checkIntraBalanceModification1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovements2
	 * IntraBalanceMovements2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CashAccount must be present or Movement(*)/CashAccount must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashAccountRule#forIntraBalanceMovements1
	 * ConstraintCashAccountRule.forIntraBalanceMovements1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceMovements2> forIntraBalanceMovements2 = new MMConstraint<IntraBalanceMovements2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountRule";
			definition = "CashAccount must be present or Movement(*)/CashAccount must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashAccountRule.forIntraBalanceMovements1;
			owner_lazy = () -> IntraBalanceMovements2.mmObject();
		}

		@Override
		public void executeValidator(IntraBalanceMovements2 obj) throws Exception {
			checkIntraBalanceMovements2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation1
	 * IntraBalanceCancellation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CashAccount must be present or Cancellation(*)/CashAccount must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashAccountRule#forIntraBalanceCancellation3
	 * ConstraintCashAccountRule.forIntraBalanceCancellation3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceCancellation1> forIntraBalanceCancellation1 = new MMConstraint<IntraBalanceCancellation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountRule";
			definition = "CashAccount must be present or Cancellation(*)/CashAccount must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashAccountRule.forIntraBalanceCancellation3);
			owner_lazy = () -> IntraBalanceCancellation1.mmObject();
		}

		@Override
		public void executeValidator(IntraBalanceCancellation1 obj) throws Exception {
			checkIntraBalanceCancellation1(obj);
		}
	};

	/**
	 * CashAccount must be present or Cancellation(*)/CashAccount must be
	 * present, but not both.
	 */
	public static void checkIntraBalanceModification3(IntraBalanceModification3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CashAccount must be present or Cancellation(*)/CashAccount must be
	 * present, but not both.
	 */
	public static void checkIntraBalanceCancellation3(IntraBalanceCancellation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CashAccount must be present or Movement(*)/CashAccount must be present,
	 * but not both.
	 */
	public static void checkIntraBalanceMovements1(IntraBalanceMovements1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CashAccount must be present or Cancellation(*)/CashAccount must be
	 * present, but not both.
	 */
	public static void checkIntraBalanceModification1(IntraBalanceModification1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CashAccount must be present or Movement(*)/CashAccount must be present,
	 * but not both.
	 */
	public static void checkIntraBalanceMovements2(IntraBalanceMovements2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CashAccount must be present or Cancellation(*)/CashAccount must be
	 * present, but not both.
	 */
	public static void checkIntraBalanceCancellation1(IntraBalanceCancellation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}