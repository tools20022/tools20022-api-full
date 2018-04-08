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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification3
	 * IntraBalanceModification3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintProcessingStatusRule#forIntraBalanceModification1
	 * ConstraintProcessingStatusRule.forIntraBalanceModification1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceModification3> forIntraBalanceModification3 = new MMConstraint<IntraBalanceModification3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatusRule";
			definition = "ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintProcessingStatusRule.forIntraBalanceModification1;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintProcessingStatusRule#forIntraBalanceCancellation1
	 * ConstraintProcessingStatusRule.forIntraBalanceCancellation1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceCancellation3> forIntraBalanceCancellation3 = new MMConstraint<IntraBalanceCancellation3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatusRule";
			definition = "ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintProcessingStatusRule.forIntraBalanceCancellation1;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintProcessingStatusRule#forIntraPositionCancellation3
	 * ConstraintProcessingStatusRule.forIntraPositionCancellation3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionCancellation1> forIntraPositionCancellation1 = new MMConstraint<IntraPositionCancellation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatusRule";
			definition = "ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintProcessingStatusRule.forIntraPositionCancellation3);
			owner_lazy = () -> IntraPositionCancellation1.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionCancellation1 obj) throws Exception {
			checkIntraPositionCancellation1(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintProcessingStatusRule#forIntraBalanceModification3
	 * ConstraintProcessingStatusRule.forIntraBalanceModification3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceModification1> forIntraBalanceModification1 = new MMConstraint<IntraBalanceModification1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatusRule";
			definition = "ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintProcessingStatusRule.forIntraBalanceModification3);
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification3
	 * IntraPositionModification3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintProcessingStatusRule#forIntraPositionModification1
	 * ConstraintProcessingStatusRule.forIntraPositionModification1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionModification3> forIntraPositionModification3 = new MMConstraint<IntraPositionModification3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatusRule";
			definition = "ProcessingStatus must be present or Modification(*)/ProcessingStatus must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintProcessingStatusRule.forIntraPositionModification1;
			owner_lazy = () -> IntraPositionModification3.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionModification3 obj) throws Exception {
			checkIntraPositionModification3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation3
	 * IntraPositionCancellation3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintProcessingStatusRule#forIntraPositionCancellation1
	 * ConstraintProcessingStatusRule.forIntraPositionCancellation1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionCancellation3> forIntraPositionCancellation3 = new MMConstraint<IntraPositionCancellation3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatusRule";
			definition = "ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintProcessingStatusRule.forIntraPositionCancellation1;
			owner_lazy = () -> IntraPositionCancellation3.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionCancellation3 obj) throws Exception {
			checkIntraPositionCancellation3(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintProcessingStatusRule#forIntraPositionModification3
	 * ConstraintProcessingStatusRule.forIntraPositionModification3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionModification1> forIntraPositionModification1 = new MMConstraint<IntraPositionModification1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatusRule";
			definition = "ProcessingStatus must be present or Modification(*)/ProcessingStatus must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintProcessingStatusRule.forIntraPositionModification3);
			owner_lazy = () -> IntraPositionModification1.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionModification1 obj) throws Exception {
			checkIntraPositionModification1(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintProcessingStatusRule#forIntraBalanceCancellation3
	 * ConstraintProcessingStatusRule.forIntraBalanceCancellation3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceCancellation1> forIntraBalanceCancellation1 = new MMConstraint<IntraBalanceCancellation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatusRule";
			definition = "ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintProcessingStatusRule.forIntraBalanceCancellation3);
			owner_lazy = () -> IntraBalanceCancellation1.mmObject();
		}

		@Override
		public void executeValidator(IntraBalanceCancellation1 obj) throws Exception {
			checkIntraBalanceCancellation1(obj);
		}
	};

	/**
	 * ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must
	 * be present, but not both.
	 */
	public static void checkIntraBalanceModification3(IntraBalanceModification3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must
	 * be present, but not both.
	 */
	public static void checkIntraBalanceCancellation3(IntraBalanceCancellation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must
	 * be present, but not both.
	 */
	public static void checkIntraPositionCancellation1(IntraPositionCancellation1 obj) throws Exception {
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
	public static void checkIntraPositionModification3(IntraPositionModification3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ProcessingStatus must be present or Cancellation(*)/ProcessingStatus must
	 * be present, but not both.
	 */
	public static void checkIntraPositionCancellation3(IntraPositionCancellation3 obj) throws Exception {
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
	public static void checkIntraBalanceCancellation1(IntraBalanceCancellation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}