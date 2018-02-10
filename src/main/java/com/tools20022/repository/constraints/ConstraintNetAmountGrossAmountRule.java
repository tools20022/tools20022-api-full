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
import com.tools20022.repository.msg.RedemptionOrder4;
import com.tools20022.repository.msg.SubscriptionOrder4;

/**
 * If NetAmount or GrossAmount is present, then Rounding is not allowed.
 */
public class ConstraintNetAmountGrossAmountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4
	 * RedemptionOrder4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmountGrossAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NetAmount or GrossAmount is present, then Rounding is not allowed."</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder4> forRedemptionOrder4 = new MMConstraint<RedemptionOrder4>() {
		{
			validator = ConstraintNetAmountGrossAmountRule::checkRedemptionOrder4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmountGrossAmountRule";
			definition = "If NetAmount or GrossAmount is present, then Rounding is not allowed.";
			owner_lazy = () -> RedemptionOrder4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4
	 * SubscriptionOrder4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmountGrossAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NetAmount or GrossAmount is present, then Rounding is not allowed."</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder4> forSubscriptionOrder4 = new MMConstraint<SubscriptionOrder4>() {
		{
			validator = ConstraintNetAmountGrossAmountRule::checkSubscriptionOrder4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmountGrossAmountRule";
			definition = "If NetAmount or GrossAmount is present, then Rounding is not allowed.";
			owner_lazy = () -> SubscriptionOrder4.mmObject();
		}
	};

	/**
	 * If NetAmount or GrossAmount is present, then Rounding is not allowed.
	 */
	public static void checkRedemptionOrder4(RedemptionOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NetAmount or GrossAmount is present, then Rounding is not allowed.
	 */
	public static void checkSubscriptionOrder4(SubscriptionOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}