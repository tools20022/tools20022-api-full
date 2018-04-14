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
import com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01;
import com.tools20022.repository.area.setr.SwitchOrderConfirmationV03;
import com.tools20022.repository.area.setr.SwitchOrderConfirmationV04;
import com.tools20022.repository.msg.SwitchOrderConfirmation1;
import java.util.Arrays;

/**
 * If SwitchExecutionDetails is present more than once, then
 * SwitchExecutionDetails/RedemptionLegDetails and
 * SwitchExecutionDetails/SubscriptionLegDetails may only be present once.
 */
public class ConstraintMultipleSwitchExecutionRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03
	 * SwitchOrderConfirmationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSwitchExecutionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SwitchExecutionDetails is present more than once, then SwitchExecutionDetails/RedemptionLegDetails and SwitchExecutionDetails/SubscriptionLegDetails may only be present once."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMultipleSwitchExecutionRule#for_setr_SwitchOrderConfirmationV04
	 * ConstraintMultipleSwitchExecutionRule.for_setr_SwitchOrderConfirmationV04
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmationV03> for_setr_SwitchOrderConfirmationV03 = new MMConstraint<SwitchOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSwitchExecutionRule";
			definition = "If SwitchExecutionDetails is present more than once, then SwitchExecutionDetails/RedemptionLegDetails and SwitchExecutionDetails/SubscriptionLegDetails may only be present once.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMultipleSwitchExecutionRule.for_setr_SwitchOrderConfirmationV04);
			owner_lazy = () -> SwitchOrderConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderConfirmationV03 obj) throws Exception {
			check_setr_SwitchOrderConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV04
	 * SwitchOrderConfirmationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSwitchExecutionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SwitchExecutionDetails is present more than once, then SwitchExecutionDetails/RedemptionLegDetails and SwitchExecutionDetails/SubscriptionLegDetails must only be present once."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMultipleSwitchExecutionRule#for_setr_SwitchOrderConfirmationV03
	 * ConstraintMultipleSwitchExecutionRule.for_setr_SwitchOrderConfirmationV03
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmationV04> for_setr_SwitchOrderConfirmationV04 = new MMConstraint<SwitchOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSwitchExecutionRule";
			definition = "If SwitchExecutionDetails is present more than once, then SwitchExecutionDetails/RedemptionLegDetails and SwitchExecutionDetails/SubscriptionLegDetails must only be present once.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMultipleSwitchExecutionRule.for_setr_SwitchOrderConfirmationV03;
			owner_lazy = () -> SwitchOrderConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderConfirmationV04 obj) throws Exception {
			check_setr_SwitchOrderConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01
	 * SwitchOrderConfirmationAmendmentV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSwitchExecutionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SwitchExecutionDetails is present more than once, then SwitchExecutionDetails/RedemptionLegDetails and SwitchExecutionDetails/SubscriptionLegDetails may only be present once."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmationAmendmentV01> for_setr_SwitchOrderConfirmationAmendmentV01 = new MMConstraint<SwitchOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSwitchExecutionRule";
			definition = "If SwitchExecutionDetails is present more than once, then SwitchExecutionDetails/RedemptionLegDetails and SwitchExecutionDetails/SubscriptionLegDetails may only be present once.";
			owner_lazy = () -> SwitchOrderConfirmationAmendmentV01.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderConfirmationAmendmentV01 obj) throws Exception {
			check_setr_SwitchOrderConfirmationAmendmentV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderConfirmation1
	 * SwitchOrderConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSwitchExecutionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SwitchExecutionDetails is present more than once, then SwitchExecutionDetails/RedemptionLegDetails and SwitchExecutionDetails/SubscriptionLegDetails may only be present once."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmation1> forSwitchOrderConfirmation1 = new MMConstraint<SwitchOrderConfirmation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSwitchExecutionRule";
			definition = "If SwitchExecutionDetails is present more than once, then SwitchExecutionDetails/RedemptionLegDetails and SwitchExecutionDetails/SubscriptionLegDetails may only be present once.";
			owner_lazy = () -> SwitchOrderConfirmation1.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderConfirmation1 obj) throws Exception {
			checkSwitchOrderConfirmation1(obj);
		}
	};

	/**
	 * If SwitchExecutionDetails is present more than once, then
	 * SwitchExecutionDetails/RedemptionLegDetails and
	 * SwitchExecutionDetails/SubscriptionLegDetails may only be present once.
	 */
	public static void check_setr_SwitchOrderConfirmationV03(SwitchOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SwitchExecutionDetails is present more than once, then
	 * SwitchExecutionDetails/RedemptionLegDetails and
	 * SwitchExecutionDetails/SubscriptionLegDetails must only be present once.
	 */
	public static void check_setr_SwitchOrderConfirmationV04(SwitchOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SwitchExecutionDetails is present more than once, then
	 * SwitchExecutionDetails/RedemptionLegDetails and
	 * SwitchExecutionDetails/SubscriptionLegDetails may only be present once.
	 */
	public static void check_setr_SwitchOrderConfirmationAmendmentV01(SwitchOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SwitchExecutionDetails is present more than once, then
	 * SwitchExecutionDetails/RedemptionLegDetails and
	 * SwitchExecutionDetails/SubscriptionLegDetails may only be present once.
	 */
	public static void checkSwitchOrderConfirmation1(SwitchOrderConfirmation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}