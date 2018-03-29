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
import com.tools20022.repository.msg.PendingSettlementStatusReason1;
import com.tools20022.repository.msg.RejectedStatusReason5;
import com.tools20022.repository.msg.TransferUnmatchedStatusReason1;

/**
 * If Structured is Other, then AdditionalInformation is mandatory.
 */
public class ConstraintOtherStatusRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatusReason1
	 * PendingSettlementStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is Other, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingSettlementStatusReason1> forPendingSettlementStatusReason1 = new MMConstraint<PendingSettlementStatusReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherStatusRule";
			definition = "If Structured is Other, then AdditionalInformation is mandatory.";
			owner_lazy = () -> PendingSettlementStatusReason1.mmObject();
		}

		@Override
		public void executeValidator(PendingSettlementStatusReason1 obj) throws Exception {
			checkPendingSettlementStatusReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferUnmatchedStatusReason1
	 * TransferUnmatchedStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is Other, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferUnmatchedStatusReason1> forTransferUnmatchedStatusReason1 = new MMConstraint<TransferUnmatchedStatusReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherStatusRule";
			definition = "If Structured is Other, then AdditionalInformation is mandatory.";
			owner_lazy = () -> TransferUnmatchedStatusReason1.mmObject();
		}

		@Override
		public void executeValidator(TransferUnmatchedStatusReason1 obj) throws Exception {
			checkTransferUnmatchedStatusReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason5
	 * RejectedStatusReason5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is Other, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason5> forRejectedStatusReason5 = new MMConstraint<RejectedStatusReason5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherStatusRule";
			definition = "If Structured is Other, then AdditionalInformation is mandatory.";
			owner_lazy = () -> RejectedStatusReason5.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason5 obj) throws Exception {
			checkRejectedStatusReason5(obj);
		}
	};

	/**
	 * If Structured is Other, then AdditionalInformation is mandatory.
	 */
	public static void checkPendingSettlementStatusReason1(PendingSettlementStatusReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is Other, then AdditionalInformation is mandatory.
	 */
	public static void checkTransferUnmatchedStatusReason1(TransferUnmatchedStatusReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is Other, then AdditionalInformation is mandatory.
	 */
	public static void checkRejectedStatusReason5(RejectedStatusReason5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}