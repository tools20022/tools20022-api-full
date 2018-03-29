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
import com.tools20022.repository.msg.SwitchOrder7;
import java.util.Arrays;

/**
 * If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not present,
 * then RedemptionLegDetails/FinancialInstrumentQuantityChoice is mandatory. If
 * SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present, then it
 * must be present in each occurrence of SubscriptionLegDetails.
 */
public class ConstraintFinancialInstrumentQuantity1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2 SwitchOrder2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is mandatory. If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present, then it must be present in each occurrence of SubscriptionLegDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder2> forSwitchOrder2 = new MMConstraint<SwitchOrder2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity1Rule";
			definition = "If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is mandatory. If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present, then it must be present in each occurrence of SubscriptionLegDetails.";
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3 SwitchOrder3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is mandatory in each occurrence of RedemptionLegDetails.\nIf SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present, then it must be present in each occurrence of SubscriptionLegDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder3> forSwitchOrder3 = new MMConstraint<SwitchOrder3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity1Rule";
			definition = "If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is mandatory in each occurrence of RedemptionLegDetails.\nIf SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present, then it must be present in each occurrence of SubscriptionLegDetails.";
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4 SwitchOrder4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is mandatory in each occurrence of RedemptionLegDetails.\nIf SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present, then it must be present in each occurrence of SubscriptionLegDetails."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentQuantity1Rule#forSwitchOrder7
	 * ConstraintFinancialInstrumentQuantity1Rule.forSwitchOrder7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder4> forSwitchOrder4 = new MMConstraint<SwitchOrder4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity1Rule";
			definition = "If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is mandatory in each occurrence of RedemptionLegDetails.\nIf SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present, then it must be present in each occurrence of SubscriptionLegDetails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentQuantity1Rule.forSwitchOrder7);
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7 SwitchOrder7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is mandatory in each occurrence of RedemptionLegDetails.\r\nIf SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present, then it must be present in each occurrence of SubscriptionLegDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentQuantity1Rule#forSwitchOrder4
	 * ConstraintFinancialInstrumentQuantity1Rule.forSwitchOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder7> forSwitchOrder7 = new MMConstraint<SwitchOrder7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity1Rule";
			definition = "If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is mandatory in each occurrence of RedemptionLegDetails.\r\nIf SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present, then it must be present in each occurrence of SubscriptionLegDetails.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentQuantity1Rule.forSwitchOrder4;
			owner_lazy = () -> SwitchOrder7.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrder7 obj) throws Exception {
			checkSwitchOrder7(obj);
		}
	};

	/**
	 * If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not
	 * present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is
	 * mandatory. If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is
	 * present, then it must be present in each occurrence of
	 * SubscriptionLegDetails.
	 */
	public static void checkSwitchOrder2(SwitchOrder2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not
	 * present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is
	 * mandatory in each occurrence of RedemptionLegDetails. If
	 * SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present, then
	 * it must be present in each occurrence of SubscriptionLegDetails.
	 */
	public static void checkSwitchOrder3(SwitchOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not
	 * present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is
	 * mandatory in each occurrence of RedemptionLegDetails. If
	 * SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present, then
	 * it must be present in each occurrence of SubscriptionLegDetails.
	 */
	public static void checkSwitchOrder4(SwitchOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not
	 * present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is
	 * mandatory in each occurrence of RedemptionLegDetails.<br>
	 * If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present,
	 * then it must be present in each occurrence of SubscriptionLegDetails.
	 */
	public static void checkSwitchOrder7(SwitchOrder7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}