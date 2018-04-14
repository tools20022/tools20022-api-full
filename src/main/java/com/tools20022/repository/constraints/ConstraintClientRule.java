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
import com.tools20022.repository.msg.TransactionDetails1;
import com.tools20022.repository.msg.TransactionDetails3;

/**
 * If Capacity is Agent (AGEN), then Client must be present.
 */
public class ConstraintClientRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "If Capacity is Agent (AGEN), then Client must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails1> forTransactionDetails1 = new MMConstraint<TransactionDetails1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientRule";
			definition = "If Capacity is Agent (AGEN), then Client must be present.";
			owner_lazy = () -> TransactionDetails1.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails1 obj) throws Exception {
			checkTransactionDetails1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "If Capacity is Agent (AGEN), then Client must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails3> forTransactionDetails3 = new MMConstraint<TransactionDetails3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientRule";
			definition = "If Capacity is Agent (AGEN), then Client must be present.";
			owner_lazy = () -> TransactionDetails3.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails3 obj) throws Exception {
			checkTransactionDetails3(obj);
		}
	};

	/**
	 * If Capacity is Agent (AGEN), then Client must be present.
	 */
	public static void checkTransactionDetails1(TransactionDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Capacity is Agent (AGEN), then Client must be present.
	 */
	public static void checkTransactionDetails3(TransactionDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}