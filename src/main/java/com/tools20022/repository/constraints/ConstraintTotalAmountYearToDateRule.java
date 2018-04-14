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
import com.tools20022.repository.msg.SubscriptionInformation;
import com.tools20022.repository.msg.SubscriptionInformation1;

/**
 * TotalAmountYearToDate must be equal to the sum of EquityComponent and
 * CashComponent.
 */
public class ConstraintTotalAmountYearToDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation
	 * SubscriptionInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountYearToDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalAmountYearToDate must be equal to the sum of EquityComponent and CashComponent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionInformation> forSubscriptionInformation = new MMConstraint<SubscriptionInformation>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountYearToDateRule";
			definition = "TotalAmountYearToDate must be equal to the sum of EquityComponent and CashComponent.";
			owner_lazy = () -> SubscriptionInformation.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionInformation obj) throws Exception {
			checkSubscriptionInformation(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1
	 * SubscriptionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountYearToDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalAmountYearToDate must be equal to the sum of EquityComponent and CashComponent if present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionInformation1> forSubscriptionInformation1 = new MMConstraint<SubscriptionInformation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountYearToDateRule";
			definition = "TotalAmountYearToDate must be equal to the sum of EquityComponent and CashComponent if present.";
			owner_lazy = () -> SubscriptionInformation1.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionInformation1 obj) throws Exception {
			checkSubscriptionInformation1(obj);
		}
	};

	/**
	 * TotalAmountYearToDate must be equal to the sum of EquityComponent and
	 * CashComponent.
	 */
	public static void checkSubscriptionInformation(SubscriptionInformation obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalAmountYearToDate must be equal to the sum of EquityComponent and
	 * CashComponent if present.
	 */
	public static void checkSubscriptionInformation1(SubscriptionInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}