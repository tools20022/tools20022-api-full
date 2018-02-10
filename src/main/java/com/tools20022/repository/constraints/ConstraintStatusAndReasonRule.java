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
import com.tools20022.repository.msg.IntraBalanceMovements1;
import com.tools20022.repository.msg.IntraBalancePending1;
import com.tools20022.repository.msg.IntraPositionMovements1;
import com.tools20022.repository.msg.IntraPositionPending1;

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
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionPending1> forIntraPositionPending1 = new MMConstraint<IntraPositionPending1>() {
		{
			validator = ConstraintStatusAndReasonRule::checkIntraPositionPending1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReasonRule";
			definition = "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both.";
			owner_lazy = () -> IntraPositionPending1.mmObject();
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
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceMovements1> forIntraBalanceMovements1 = new MMConstraint<IntraBalanceMovements1>() {
		{
			validator = ConstraintStatusAndReasonRule::checkIntraBalanceMovements1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReasonRule";
			definition = "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both.";
			owner_lazy = () -> IntraBalanceMovements1.mmObject();
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
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovements1> forIntraPositionMovements1 = new MMConstraint<IntraPositionMovements1>() {
		{
			validator = ConstraintStatusAndReasonRule::checkIntraPositionMovements1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReasonRule";
			definition = "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both.";
			owner_lazy = () -> IntraPositionMovements1.mmObject();
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
	 * </ul>
	 */
	public static final MMConstraint<IntraBalancePending1> forIntraBalancePending1 = new MMConstraint<IntraBalancePending1>() {
		{
			validator = ConstraintStatusAndReasonRule::checkIntraBalancePending1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReasonRule";
			definition = "StatusAndReason must be present or Movement(*)/StatusAndReason must be present, but not both.";
			owner_lazy = () -> IntraBalancePending1.mmObject();
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
}