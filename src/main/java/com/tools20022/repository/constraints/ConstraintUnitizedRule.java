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
import com.tools20022.repository.msg.RedemptionExecution10;
import com.tools20022.repository.msg.SubscriptionExecution7;

/**
 * If HedgeFundOrderType is not present or is not "NUNI" in at least one
 * occurrence, then DealingPriceDetails must be present.
 */
public class ConstraintUnitizedRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitizedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HedgeFundOrderType is not present or is not \"NUNI\" in at least one occurrence, then DealingPriceDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution7> forSubscriptionExecution7 = new MMConstraint<SubscriptionExecution7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitizedRule";
			definition = "If HedgeFundOrderType is not present or is not \"NUNI\" in at least one occurrence, then DealingPriceDetails must be present.";
			owner_lazy = () -> SubscriptionExecution7.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionExecution7 obj) throws Exception {
			checkSubscriptionExecution7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10
	 * RedemptionExecution10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitizedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HedgeFundOrderType is not present or is not \"NUNI\" in at least one occurrence, then DealingPriceDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution10> forRedemptionExecution10 = new MMConstraint<RedemptionExecution10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitizedRule";
			definition = "If HedgeFundOrderType is not present or is not \"NUNI\" in at least one occurrence, then DealingPriceDetails must be present.";
			owner_lazy = () -> RedemptionExecution10.mmObject();
		}

		@Override
		public void executeValidator(RedemptionExecution10 obj) throws Exception {
			checkRedemptionExecution10(obj);
		}
	};

	/**
	 * If HedgeFundOrderType is not present or is not "NUNI" in at least one
	 * occurrence, then DealingPriceDetails must be present.
	 */
	public static void checkSubscriptionExecution7(SubscriptionExecution7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HedgeFundOrderType is not present or is not "NUNI" in at least one
	 * occurrence, then DealingPriceDetails must be present.
	 */
	public static void checkRedemptionExecution10(RedemptionExecution10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}