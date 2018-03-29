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
import com.tools20022.repository.area.setr.SwitchOrderV03;
import com.tools20022.repository.area.setr.SwitchOrderV04;
import com.tools20022.repository.msg.SwitchOrderInstruction2;
import java.util.Arrays;

/**
 * If SwitchOrderDetails is present more than once, then
 * SwitchOrderDetails/RedemptionLegDetails and
 * SwitchOrderDetails/SubscriptionLegDetails must only be present once.
 */
public class ConstraintMultipleSwitchOrderRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04
	 * SwitchOrderV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSwitchOrderRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SwitchOrderDetails is present more than once, then SwitchOrderDetails/RedemptionLegDetails and SwitchOrderDetails/SubscriptionLegDetails must only be present once."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMultipleSwitchOrderRule#forSwitchOrderV03
	 * ConstraintMultipleSwitchOrderRule.forSwitchOrderV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderV04> forSwitchOrderV04 = new MMConstraint<SwitchOrderV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSwitchOrderRule";
			definition = "If SwitchOrderDetails is present more than once, then SwitchOrderDetails/RedemptionLegDetails and SwitchOrderDetails/SubscriptionLegDetails must only be present once.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMultipleSwitchOrderRule.forSwitchOrderV03;
			owner_lazy = () -> SwitchOrderV04.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderV04 obj) throws Exception {
			checkSwitchOrderV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03
	 * SwitchOrderV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSwitchOrderRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SwitchOrderDetails is present more than once, then SwitchOrderDetails/RedemptionLegDetails and SwitchOrderDetails/SubscriptionLegDetails may only be present once."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMultipleSwitchOrderRule#forSwitchOrderV04
	 * ConstraintMultipleSwitchOrderRule.forSwitchOrderV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderV03> forSwitchOrderV03 = new MMConstraint<SwitchOrderV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSwitchOrderRule";
			definition = "If SwitchOrderDetails is present more than once, then SwitchOrderDetails/RedemptionLegDetails and SwitchOrderDetails/SubscriptionLegDetails may only be present once.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMultipleSwitchOrderRule.forSwitchOrderV04);
			owner_lazy = () -> SwitchOrderV03.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderV03 obj) throws Exception {
			checkSwitchOrderV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderInstruction2
	 * SwitchOrderInstruction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSwitchOrderRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SwitchOrderDetails is present more than once, then SwitchOrderDetails/RedemptionLegDetails and SwitchOrderDetails/SubscriptionLegDetails may only be present once."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderInstruction2> forSwitchOrderInstruction2 = new MMConstraint<SwitchOrderInstruction2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSwitchOrderRule";
			definition = "If SwitchOrderDetails is present more than once, then SwitchOrderDetails/RedemptionLegDetails and SwitchOrderDetails/SubscriptionLegDetails may only be present once.";
			owner_lazy = () -> SwitchOrderInstruction2.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderInstruction2 obj) throws Exception {
			checkSwitchOrderInstruction2(obj);
		}
	};

	/**
	 * If SwitchOrderDetails is present more than once, then
	 * SwitchOrderDetails/RedemptionLegDetails and
	 * SwitchOrderDetails/SubscriptionLegDetails must only be present once.
	 */
	public static void checkSwitchOrderV04(SwitchOrderV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SwitchOrderDetails is present more than once, then
	 * SwitchOrderDetails/RedemptionLegDetails and
	 * SwitchOrderDetails/SubscriptionLegDetails may only be present once.
	 */
	public static void checkSwitchOrderV03(SwitchOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SwitchOrderDetails is present more than once, then
	 * SwitchOrderDetails/RedemptionLegDetails and
	 * SwitchOrderDetails/SubscriptionLegDetails may only be present once.
	 */
	public static void checkSwitchOrderInstruction2(SwitchOrderInstruction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}