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
 * When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the
 * instruction is assumed to be processed “on a best effort basis” by the
 * account servicer.
 */
public class ConstraintAccountServicerDeadlineMissedGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason3
	 * PendingCancellationStatusReason3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissedGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the instruction is assumed to be processed “on a best effort basis” by the account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountServicerDeadlineMissedGuideline#forPendingCancellationStatusReason5
	 * ConstraintAccountServicerDeadlineMissedGuideline.
	 * forPendingCancellationStatusReason5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason3> forPendingCancellationStatusReason3 = new MMConstraint<PendingCancellationStatusReason3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissedGuideline";
			definition = "When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the instruction is assumed to be processed “on a best effort basis” by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountServicerDeadlineMissedGuideline.forPendingCancellationStatusReason5);
			owner_lazy = () -> PendingCancellationStatusReason3.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason3 obj) throws Exception {
			checkPendingCancellationStatusReason3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason4
	 * PendingCancellationStatusReason4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissedGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the instruction is assumed to be processed “on a best effort basis” by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason4> forPendingCancellationStatusReason4 = new MMConstraint<PendingCancellationStatusReason4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissedGuideline";
			definition = "When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the instruction is assumed to be processed “on a best effort basis” by the account servicer.";
			owner_lazy = () -> PendingCancellationStatusReason4.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason4 obj) throws Exception {
			checkPendingCancellationStatusReason4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason5
	 * PendingCancellationStatusReason5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissedGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the instruction is assumed to be processed “on a best effort basis” by the account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountServicerDeadlineMissedGuideline#forPendingCancellationStatusReason7
	 * ConstraintAccountServicerDeadlineMissedGuideline.
	 * forPendingCancellationStatusReason7}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountServicerDeadlineMissedGuideline#forPendingCancellationStatusReason3
	 * ConstraintAccountServicerDeadlineMissedGuideline.
	 * forPendingCancellationStatusReason3}</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason5> forPendingCancellationStatusReason5 = new MMConstraint<PendingCancellationStatusReason5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissedGuideline";
			definition = "When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the instruction is assumed to be processed “on a best effort basis” by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountServicerDeadlineMissedGuideline.forPendingCancellationStatusReason7);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountServicerDeadlineMissedGuideline.forPendingCancellationStatusReason3;
			owner_lazy = () -> PendingCancellationStatusReason5.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason5 obj) throws Exception {
			checkPendingCancellationStatusReason5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason6
	 * PendingCancellationStatusReason6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissedGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the instruction is assumed to be processed “on a best effort basis” by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason6> forPendingCancellationStatusReason6 = new MMConstraint<PendingCancellationStatusReason6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissedGuideline";
			definition = "When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the instruction is assumed to be processed “on a best effort basis” by the account servicer.";
			owner_lazy = () -> PendingCancellationStatusReason6.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason6 obj) throws Exception {
			checkPendingCancellationStatusReason6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason7
	 * PendingCancellationStatusReason7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissedGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the instruction is assumed to be processed “on a best effort basis” by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountServicerDeadlineMissedGuideline#forPendingCancellationStatusReason5
	 * ConstraintAccountServicerDeadlineMissedGuideline.
	 * forPendingCancellationStatusReason5}</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason7> forPendingCancellationStatusReason7 = new MMConstraint<PendingCancellationStatusReason7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissedGuideline";
			definition = "When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the instruction is assumed to be processed “on a best effort basis” by the account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountServicerDeadlineMissedGuideline.forPendingCancellationStatusReason5;
			owner_lazy = () -> PendingCancellationStatusReason7.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason7 obj) throws Exception {
			checkPendingCancellationStatusReason7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason8
	 * PendingCancellationStatusReason8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissedGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the instruction is assumed to be processed “on a best effort basis” by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason8> forPendingCancellationStatusReason8 = new MMConstraint<PendingCancellationStatusReason8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissedGuideline";
			definition = "When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the instruction is assumed to be processed “on a best effort basis” by the account servicer.";
			owner_lazy = () -> PendingCancellationStatusReason8.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason8 obj) throws Exception {
			checkPendingCancellationStatusReason8(obj);
		}
	};

	/**
	 * When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the
	 * instruction is assumed to be processed “on a best effort basis” by the
	 * account servicer.
	 */
	public static void checkPendingCancellationStatusReason3(PendingCancellationStatusReason3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the
	 * instruction is assumed to be processed “on a best effort basis” by the
	 * account servicer.
	 */
	public static void checkPendingCancellationStatusReason4(PendingCancellationStatusReason4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the
	 * instruction is assumed to be processed “on a best effort basis” by the
	 * account servicer.
	 */
	public static void checkPendingCancellationStatusReason5(PendingCancellationStatusReason5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the
	 * instruction is assumed to be processed “on a best effort basis” by the
	 * account servicer.
	 */
	public static void checkPendingCancellationStatusReason6(PendingCancellationStatusReason6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the
	 * instruction is assumed to be processed “on a best effort basis” by the
	 * account servicer.
	 */
	public static void checkPendingCancellationStatusReason7(PendingCancellationStatusReason7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When ReasonCode/Code is ADEA (Account Servicer Deadline Missed), the
	 * instruction is assumed to be processed “on a best effort basis” by the
	 * account servicer.
	 */
	public static void checkPendingCancellationStatusReason8(PendingCancellationStatusReason8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}