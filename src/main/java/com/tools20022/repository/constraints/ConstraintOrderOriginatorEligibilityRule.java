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
import com.tools20022.repository.msg.SwitchExecution4;
import com.tools20022.repository.msg.SwitchOrder3;
import com.tools20022.repository.msg.SwitchOrder4;
import java.util.Arrays;

/**
 * Either InvestmentAccountDetails/OrderOriginatorEligibility or a single
 * occurrence of
 * RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a
 * single occurrence of
 * SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility
 * should be only present.
 */
public class ConstraintOrderOriginatorEligibilityRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4 SwitchOrder4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility should be only present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forSwitchOrder7
	 * ConstraintOrderOriginatorEligibility3Rule.forSwitchOrder7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder4> forSwitchOrder4 = new MMConstraint<SwitchOrder4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibilityRule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility should be only present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forSwitchOrder7);
			owner_lazy = () -> SwitchOrder4.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrder4 obj) throws Exception {
			checkSwitchOrder4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3 SwitchOrder3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility should be only present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder3> forSwitchOrder3 = new MMConstraint<SwitchOrder3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibilityRule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility should be only present.";
			owner_lazy = () -> SwitchOrder3.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrder3 obj) throws Exception {
			checkSwitchOrder3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4
	 * SwitchExecution4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility should be only present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forSwitchExecution7
	 * ConstraintOrderOriginatorEligibility3Rule.forSwitchExecution7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchExecution4> forSwitchExecution4 = new MMConstraint<SwitchExecution4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibilityRule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility should be only present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forSwitchExecution7);
			owner_lazy = () -> SwitchExecution4.mmObject();
		}

		@Override
		public void executeValidator(SwitchExecution4 obj) throws Exception {
			checkSwitchExecution4(obj);
		}
	};

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or a single
	 * occurrence of RedemptionLegDetails/InvestmentAccountDetails/
	 * OrderOriginatorEligibility or a single occurrence of
	 * SubscriptionLegDetails
	 * /InvestmentAccountDetails/OrderOriginatorEligibility should be only
	 * present.
	 */
	public static void checkSwitchOrder4(SwitchOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or a single
	 * occurrence of RedemptionLegDetails/InvestmentAccountDetails/
	 * OrderOriginatorEligibility or a single occurrence of
	 * SubscriptionLegDetails
	 * /InvestmentAccountDetails/OrderOriginatorEligibility should be only
	 * present.
	 */
	public static void checkSwitchOrder3(SwitchOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or a single
	 * occurrence of RedemptionLegDetails/InvestmentAccountDetails/
	 * OrderOriginatorEligibility or a single occurrence of
	 * SubscriptionLegDetails
	 * /InvestmentAccountDetails/OrderOriginatorEligibility should be only
	 * present.
	 */
	public static void checkSwitchExecution4(SwitchExecution4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}