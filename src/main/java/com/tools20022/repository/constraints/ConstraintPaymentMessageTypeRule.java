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
import com.tools20022.repository.msg.Transactions2;
import com.tools20022.repository.msg.Transactions3;
import com.tools20022.repository.msg.Transactions4;

/**
 * If PaymentCommonInformation/PaymentMessageType is present, then
 * TransactionReport/Transaction/Payment/PaymentMessageType is not allowed. If
 * PaymentCommonInformation/PaymentMessageType is not present, then
 * TransactionReport/Transaction/Payment/PaymentMessageType is optional.
 */
public class ConstraintPaymentMessageTypeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transactions4 Transactions4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMessageTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentCommonInformation/PaymentMessageType is present, then TransactionReport/Transaction/Payment/PaymentMessageType is not allowed.\nIf PaymentCommonInformation/PaymentMessageType is not present, then TransactionReport/Transaction/Payment/PaymentMessageType is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transactions4> forTransactions4 = new MMConstraint<Transactions4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMessageTypeRule";
			definition = "If PaymentCommonInformation/PaymentMessageType is present, then TransactionReport/Transaction/Payment/PaymentMessageType is not allowed.\nIf PaymentCommonInformation/PaymentMessageType is not present, then TransactionReport/Transaction/Payment/PaymentMessageType is optional.";
			owner_lazy = () -> Transactions4.mmObject();
		}

		@Override
		public void executeValidator(Transactions4 obj) throws Exception {
			checkTransactions4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transactions3 Transactions3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMessageTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentCommonInformation/PaymentMessageType is present, then TransactionReport/Transaction/Payment/PaymentMessageType is not allowed.\nIf PaymentCommonInformation/PaymentMessageType is not present, then TransactionReport/Transaction/Payment/PaymentMessageType is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transactions3> forTransactions3 = new MMConstraint<Transactions3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMessageTypeRule";
			definition = "If PaymentCommonInformation/PaymentMessageType is present, then TransactionReport/Transaction/Payment/PaymentMessageType is not allowed.\nIf PaymentCommonInformation/PaymentMessageType is not present, then TransactionReport/Transaction/Payment/PaymentMessageType is optional.";
			owner_lazy = () -> Transactions3.mmObject();
		}

		@Override
		public void executeValidator(Transactions3 obj) throws Exception {
			checkTransactions3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transactions2 Transactions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMessageTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentCommonInformation/PaymentMessageType is present, then TransactionReport/Transaction/Payment/PaymentMessageType is not allowed.\nIf PaymentCommonInformation/PaymentMessageType is not present, then TransactionReport/Transaction/Payment/PaymentMessageType is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transactions2> forTransactions2 = new MMConstraint<Transactions2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMessageTypeRule";
			definition = "If PaymentCommonInformation/PaymentMessageType is present, then TransactionReport/Transaction/Payment/PaymentMessageType is not allowed.\nIf PaymentCommonInformation/PaymentMessageType is not present, then TransactionReport/Transaction/Payment/PaymentMessageType is optional.";
			owner_lazy = () -> Transactions2.mmObject();
		}

		@Override
		public void executeValidator(Transactions2 obj) throws Exception {
			checkTransactions2(obj);
		}
	};

	/**
	 * If PaymentCommonInformation/PaymentMessageType is present, then
	 * TransactionReport/Transaction/Payment/PaymentMessageType is not allowed.
	 * If PaymentCommonInformation/PaymentMessageType is not present, then
	 * TransactionReport/Transaction/Payment/PaymentMessageType is optional.
	 */
	public static void checkTransactions4(Transactions4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentCommonInformation/PaymentMessageType is present, then
	 * TransactionReport/Transaction/Payment/PaymentMessageType is not allowed.
	 * If PaymentCommonInformation/PaymentMessageType is not present, then
	 * TransactionReport/Transaction/Payment/PaymentMessageType is optional.
	 */
	public static void checkTransactions3(Transactions3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentCommonInformation/PaymentMessageType is present, then
	 * TransactionReport/Transaction/Payment/PaymentMessageType is not allowed.
	 * If PaymentCommonInformation/PaymentMessageType is not present, then
	 * TransactionReport/Transaction/Payment/PaymentMessageType is optional.
	 */
	public static void checkTransactions2(Transactions2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}