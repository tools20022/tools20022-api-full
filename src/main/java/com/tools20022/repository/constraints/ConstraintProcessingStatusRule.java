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
import com.tools20022.repository.msg.IntraBalanceCancellation1;
import com.tools20022.repository.msg.IntraBalanceModification1;
import com.tools20022.repository.msg.IntraPositionCancellation1;
import com.tools20022.repository.msg.IntraPositionModification1;

/**
 * ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must be
 * present, but not both.
 */
public class ConstraintProcessingStatusRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation1
	 * IntraBalanceCancellation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceCancellation1> forIntraBalanceCancellation1 = new MMConstraint<IntraBalanceCancellation1>() {
		{
			validator = ConstraintProcessingStatusRule::checkIntraBalanceCancellation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatusRule";
			definition = "ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must be present, but not both.";
			owner_lazy = () -> IntraBalanceCancellation1.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceModification1> forIntraBalanceModification1 = new MMConstraint<IntraBalanceModification1>() {
		{
			validator = ConstraintProcessingStatusRule::checkIntraBalanceModification1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatusRule";
			definition = "ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must be present, but not both.";
			owner_lazy = () -> IntraBalanceModification1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification1
	 * IntraPositionModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ProcessingStatus must be present or Modification(*)/ProcessingStatus must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionModification1> forIntraPositionModification1 = new MMConstraint<IntraPositionModification1>() {
		{
			validator = ConstraintProcessingStatusRule::checkIntraPositionModification1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatusRule";
			definition = "ProcessingStatus must be present or Modification(*)/ProcessingStatus must be present, but not both.";
			owner_lazy = () -> IntraPositionModification1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation1
	 * IntraPositionCancellation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionCancellation1> forIntraPositionCancellation1 = new MMConstraint<IntraPositionCancellation1>() {
		{
			validator = ConstraintProcessingStatusRule::checkIntraPositionCancellation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatusRule";
			definition = "ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must be present, but not both.";
			owner_lazy = () -> IntraPositionCancellation1.mmObject();
		}
	};

	/**
	 * ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must
	 * be present, but not both.
	 */
	public static void checkIntraBalanceCancellation1(IntraBalanceCancellation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must
	 * be present, but not both.
	 */
	public static void checkIntraBalanceModification1(IntraBalanceModification1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ProcessingStatus must be present or Modification(*)/ProcessingStatus must
	 * be present, but not both.
	 */
	public static void checkIntraPositionModification1(IntraPositionModification1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must
	 * be present, but not both.
	 */
	public static void checkIntraPositionCancellation1(IntraPositionCancellation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}