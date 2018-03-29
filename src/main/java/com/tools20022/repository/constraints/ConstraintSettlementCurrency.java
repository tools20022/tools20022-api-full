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
import com.tools20022.repository.msg.Order3;
import com.tools20022.repository.msg.Order6;

/**
 * SettlementCurrency must be present if ForeignExchangeExecutionRequested
 * equals Yes.
 */
public class ConstraintSettlementCurrency {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Order3 Order3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SettlementCurrency must be present if ForeignExchangeExecutionRequested equals Yes."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Order3> forOrder3 = new MMConstraint<Order3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "SettlementCurrency must be present if ForeignExchangeExecutionRequested equals Yes.";
			owner_lazy = () -> Order3.mmObject();
		}

		@Override
		public void executeValidator(Order3 obj) throws Exception {
			checkOrder3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Order6 Order6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SettlementCurrency must be present if ForeignExchangeExecutionRequested equals Yes."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Order6> forOrder6 = new MMConstraint<Order6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "SettlementCurrency must be present if ForeignExchangeExecutionRequested equals Yes.";
			owner_lazy = () -> Order6.mmObject();
		}

		@Override
		public void executeValidator(Order6 obj) throws Exception {
			checkOrder6(obj);
		}
	};

	/**
	 * SettlementCurrency must be present if ForeignExchangeExecutionRequested
	 * equals Yes.
	 */
	public static void checkOrder3(Order3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SettlementCurrency must be present if ForeignExchangeExecutionRequested
	 * equals Yes.
	 */
	public static void checkOrder6(Order6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}