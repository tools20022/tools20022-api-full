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
import com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1;
import com.tools20022.repository.msg.ConfirmationRejectedStatus2;
import com.tools20022.repository.msg.RejectedStatus10;

/**
 * Either Reason or AdditionalInformation must be present. Both may be present.
 */
public class ConstraintReasonElementRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus2
	 * ConfirmationRejectedStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Reason or AdditionalInformation must be present. Both may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ConfirmationRejectedStatus2> forConfirmationRejectedStatus2 = new MMConstraint<ConfirmationRejectedStatus2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonElementRule";
			definition = "Either Reason or AdditionalInformation must be present. Both may be present.";
			owner_lazy = () -> ConfirmationRejectedStatus2.mmObject();
		}

		@Override
		public void executeValidator(ConfirmationRejectedStatus2 obj) throws Exception {
			checkConfirmationRejectedStatus2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus10
	 * RejectedStatus10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Reason or AdditionalInformation must be present. Both may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatus10> forRejectedStatus10 = new MMConstraint<RejectedStatus10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonElementRule";
			definition = "Either Reason or AdditionalInformation must be present. Both may be present.";
			owner_lazy = () -> RejectedStatus10.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatus10 obj) throws Exception {
			checkRejectedStatus10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1
	 * AccountStatusUpdateInstructionReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Code or AdditionalInformation must be present. Both may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountStatusUpdateInstructionReason1> forAccountStatusUpdateInstructionReason1 = new MMConstraint<AccountStatusUpdateInstructionReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonElementRule";
			definition = "Either Code or AdditionalInformation must be present. Both may be present.";
			owner_lazy = () -> AccountStatusUpdateInstructionReason1.mmObject();
		}

		@Override
		public void executeValidator(AccountStatusUpdateInstructionReason1 obj) throws Exception {
			checkAccountStatusUpdateInstructionReason1(obj);
		}
	};

	/**
	 * Either Reason or AdditionalInformation must be present. Both may be
	 * present.
	 */
	public static void checkConfirmationRejectedStatus2(ConfirmationRejectedStatus2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either Reason or AdditionalInformation must be present. Both may be
	 * present.
	 */
	public static void checkRejectedStatus10(RejectedStatus10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either Code or AdditionalInformation must be present. Both may be
	 * present.
	 */
	public static void checkAccountStatusUpdateInstructionReason1(AccountStatusUpdateInstructionReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}