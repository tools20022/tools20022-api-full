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
 * StatusAndReason must be present or Movement(*)/StatusAndReason must be
 * present, but not both.
 */
public class ConstraintStatusAndReasonRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending1
	 * IntraPositionPending1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusAndReasonRule#forIntraPositionPending3
	 * ConstraintStatusAndReasonRule.forIntraPositionPending3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionPending1> forIntraPositionPending1 = new MMConstraint<IntraPositionPending1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReasonRule";
			definition = "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusAndReasonRule.forIntraPositionPending3);
			owner_lazy = () -> IntraPositionPending1.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionPending1 obj) throws Exception {
			checkIntraPositionPending1(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusAndReasonRule#forIntraBalanceMovements2
	 * ConstraintStatusAndReasonRule.forIntraBalanceMovements2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceMovements1> forIntraBalanceMovements1 = new MMConstraint<IntraBalanceMovements1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReasonRule";
			definition = "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusAndReasonRule.forIntraBalanceMovements2);
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovements1
	 * IntraPositionMovements1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusAndReasonRule#forIntraPositionMovements2
	 * ConstraintStatusAndReasonRule.forIntraPositionMovements2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovements1> forIntraPositionMovements1 = new MMConstraint<IntraPositionMovements1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReasonRule";
			definition = "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusAndReasonRule.forIntraPositionMovements2);
			owner_lazy = () -> IntraPositionMovements1.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovements1 obj) throws Exception {
			checkIntraPositionMovements1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending1
	 * IntraBalancePending1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusAndReasonRule#forIntraBalancePending3
	 * ConstraintStatusAndReasonRule.forIntraBalancePending3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalancePending1> forIntraBalancePending1 = new MMConstraint<IntraBalancePending1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReasonRule";
			definition = "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusAndReasonRule.forIntraBalancePending3);
			owner_lazy = () -> IntraBalancePending1.mmObject();
		}

		@Override
		public void executeValidator(IntraBalancePending1 obj) throws Exception {
			checkIntraBalancePending1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending3
	 * IntraBalancePending3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusAndReasonRule#forIntraBalancePending1
	 * ConstraintStatusAndReasonRule.forIntraBalancePending1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalancePending3> forIntraBalancePending3 = new MMConstraint<IntraBalancePending3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReasonRule";
			definition = "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatusAndReasonRule.forIntraBalancePending1;
			owner_lazy = () -> IntraBalancePending3.mmObject();
		}

		@Override
		public void executeValidator(IntraBalancePending3 obj) throws Exception {
			checkIntraBalancePending3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovements2
	 * IntraPositionMovements2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusAndReasonRule#forIntraPositionMovements3
	 * ConstraintStatusAndReasonRule.forIntraPositionMovements3}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusAndReasonRule#forIntraPositionMovements1
	 * ConstraintStatusAndReasonRule.forIntraPositionMovements1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovements2> forIntraPositionMovements2 = new MMConstraint<IntraPositionMovements2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReasonRule";
			definition = "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusAndReasonRule.forIntraPositionMovements3);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatusAndReasonRule.forIntraPositionMovements1;
			owner_lazy = () -> IntraPositionMovements2.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovements2 obj) throws Exception {
			checkIntraPositionMovements2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending3
	 * IntraPositionPending3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusAndReasonRule#forIntraPositionPending5
	 * ConstraintStatusAndReasonRule.forIntraPositionPending5}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusAndReasonRule#forIntraPositionPending1
	 * ConstraintStatusAndReasonRule.forIntraPositionPending1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionPending3> forIntraPositionPending3 = new MMConstraint<IntraPositionPending3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReasonRule";
			definition = "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusAndReasonRule.forIntraPositionPending5);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatusAndReasonRule.forIntraPositionPending1;
			owner_lazy = () -> IntraPositionPending3.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionPending3 obj) throws Exception {
			checkIntraPositionPending3(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusAndReasonRule#forIntraBalanceMovements1
	 * ConstraintStatusAndReasonRule.forIntraBalanceMovements1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceMovements2> forIntraBalanceMovements2 = new MMConstraint<IntraBalanceMovements2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReasonRule";
			definition = "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatusAndReasonRule.forIntraBalanceMovements1;
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovements3
	 * IntraPositionMovements3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusAndReasonRule#forIntraPositionMovements2
	 * ConstraintStatusAndReasonRule.forIntraPositionMovements2}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovements3> forIntraPositionMovements3 = new MMConstraint<IntraPositionMovements3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReasonRule";
			definition = "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatusAndReasonRule.forIntraPositionMovements2;
			owner_lazy = () -> IntraPositionMovements3.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovements3 obj) throws Exception {
			checkIntraPositionMovements3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending5
	 * IntraPositionPending5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusAndReasonRule#forIntraPositionPending3
	 * ConstraintStatusAndReasonRule.forIntraPositionPending3}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionPending5> forIntraPositionPending5 = new MMConstraint<IntraPositionPending5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReasonRule";
			definition = "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatusAndReasonRule.forIntraPositionPending3;
			owner_lazy = () -> IntraPositionPending5.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionPending5 obj) throws Exception {
			checkIntraPositionPending5(obj);
		}
	};

	/**
	 * StatusAndReason must be present or Movement(*)/StatusAndReason must be
	 * present, but not both.
	 */
	public static void checkIntraPositionPending1(IntraPositionPending1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * StatusAndReason must be present or Movement(*)/StatusAndReason must be
	 * present, but not both.
	 */
	public static void checkIntraBalanceMovements1(IntraBalanceMovements1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * StatusAndReason must be present or Movement(*)/StatusAndReason must be
	 * present, but not both.
	 */
	public static void checkIntraPositionMovements1(IntraPositionMovements1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * StatusAndReason must be present or Movement(*)/StatusAndReason must be
	 * present, but not both.
	 */
	public static void checkIntraBalancePending1(IntraBalancePending1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * StatusAndReason must be present or Movement(*)/StatusAndReason must be
	 * present, but not both.
	 */
	public static void checkIntraBalancePending3(IntraBalancePending3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * StatusAndReason must be present or Movement(*)/StatusAndReason must be
	 * present, but not both.
	 */
	public static void checkIntraPositionMovements2(IntraPositionMovements2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * StatusAndReason must be present or Movement(*)/StatusAndReason must be
	 * present, but not both.
	 */
	public static void checkIntraPositionPending3(IntraPositionPending3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * StatusAndReason must be present or Movement(*)/StatusAndReason must be
	 * present, but not both.
	 */
	public static void checkIntraBalanceMovements2(IntraBalanceMovements2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * StatusAndReason must be present or Movement(*)/StatusAndReason must be
	 * present, but not both.
	 */
	public static void checkIntraPositionMovements3(IntraPositionMovements3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * StatusAndReason must be present or Movement(*)/StatusAndReason must be
	 * present, but not both.
	 */
	public static void checkIntraPositionPending5(IntraPositionPending5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}