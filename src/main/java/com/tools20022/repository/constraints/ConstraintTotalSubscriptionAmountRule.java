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
import com.tools20022.repository.msg.SwitchOrder2;
import com.tools20022.repository.msg.SwitchOrder3;
import com.tools20022.repository.msg.SwitchOrder4;

/**
 * If RedemptionLegDetails/FinancialInstrumentQuantityChoice/
 * PercentageOfTotalSubscriptionAmount is present, then TotalSubscriptionAmount
 * must be present. If RedemptionLegDetails/FinancialInstrumentQuantityChoice/
 * PercentageOfTotalSubscriptionAmount is not present, then
 * TotalSubscriptionAmount is optional.
 */
public class ConstraintTotalSubscriptionAmountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2 SwitchOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalSubscriptionAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RedemptionLegDetails/FinancialInstrumentQuantityChoice/PercentageOfTotalSubscriptionAmount is present, then TotalSubscriptionAmount must be present. If RedemptionLegDetails/FinancialInstrumentQuantityChoice/PercentageOfTotalSubscriptionAmount is not present, then TotalSubscriptionAmount is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder2> forSwitchOrder2 = new MMConstraint<SwitchOrder2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalSubscriptionAmountRule";
			definition = "If RedemptionLegDetails/FinancialInstrumentQuantityChoice/PercentageOfTotalSubscriptionAmount is present, then TotalSubscriptionAmount must be present. If RedemptionLegDetails/FinancialInstrumentQuantityChoice/PercentageOfTotalSubscriptionAmount is not present, then TotalSubscriptionAmount is optional.";
			owner_lazy = () -> SwitchOrder2.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrder2 obj) throws Exception {
			checkSwitchOrder2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4 SwitchOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalSubscriptionAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RedemptionLegDetails/FinancialInstrumentQuantityChoice/PercentageOfTotalSubscriptionAmount is present, then TotalSubscriptionAmount must be present. If RedemptionLegDetails/FinancialInstrumentQuantityChoice/PercentageOfTotalSubscriptionAmount is not present, then TotalSubscriptionAmount is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder4> forSwitchOrder4 = new MMConstraint<SwitchOrder4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalSubscriptionAmountRule";
			definition = "If RedemptionLegDetails/FinancialInstrumentQuantityChoice/PercentageOfTotalSubscriptionAmount is present, then TotalSubscriptionAmount must be present. If RedemptionLegDetails/FinancialInstrumentQuantityChoice/PercentageOfTotalSubscriptionAmount is not present, then TotalSubscriptionAmount is optional.";
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalSubscriptionAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RedemptionLegDetails/FinancialInstrumentQuantityChoice/PercentageOfTotalSubscriptionAmount is present, then TotalSubscriptionAmount must be present. If RedemptionLegDetails/FinancialInstrumentQuantityChoice/PercentageOfTotalSubscriptionAmount is not present, then TotalSubscriptionAmount is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder3> forSwitchOrder3 = new MMConstraint<SwitchOrder3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalSubscriptionAmountRule";
			definition = "If RedemptionLegDetails/FinancialInstrumentQuantityChoice/PercentageOfTotalSubscriptionAmount is present, then TotalSubscriptionAmount must be present. If RedemptionLegDetails/FinancialInstrumentQuantityChoice/PercentageOfTotalSubscriptionAmount is not present, then TotalSubscriptionAmount is optional.";
			owner_lazy = () -> SwitchOrder3.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrder3 obj) throws Exception {
			checkSwitchOrder3(obj);
		}
	};

	/**
	 * If RedemptionLegDetails/FinancialInstrumentQuantityChoice/
	 * PercentageOfTotalSubscriptionAmount is present, then
	 * TotalSubscriptionAmount must be present. If
	 * RedemptionLegDetails/FinancialInstrumentQuantityChoice
	 * /PercentageOfTotalSubscriptionAmount is not present, then
	 * TotalSubscriptionAmount is optional.
	 */
	public static void checkSwitchOrder2(SwitchOrder2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RedemptionLegDetails/FinancialInstrumentQuantityChoice/
	 * PercentageOfTotalSubscriptionAmount is present, then
	 * TotalSubscriptionAmount must be present. If
	 * RedemptionLegDetails/FinancialInstrumentQuantityChoice
	 * /PercentageOfTotalSubscriptionAmount is not present, then
	 * TotalSubscriptionAmount is optional.
	 */
	public static void checkSwitchOrder4(SwitchOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RedemptionLegDetails/FinancialInstrumentQuantityChoice/
	 * PercentageOfTotalSubscriptionAmount is present, then
	 * TotalSubscriptionAmount must be present. If
	 * RedemptionLegDetails/FinancialInstrumentQuantityChoice
	 * /PercentageOfTotalSubscriptionAmount is not present, then
	 * TotalSubscriptionAmount is optional.
	 */
	public static void checkSwitchOrder3(SwitchOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}