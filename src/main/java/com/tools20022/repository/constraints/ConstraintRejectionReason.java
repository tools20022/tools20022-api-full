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
import com.tools20022.repository.msg.OrderStatus2;
import com.tools20022.repository.msg.OrderStatusAndReason5;
import com.tools20022.repository.msg.QuoteStatus1;

/**
 * RejectionReason must be present if ListOrderStatus equals "Rejected".
 */
public class ConstraintRejectionReason {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2 OrderStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "RejectionReason must be present if ListOrderStatus equals \"Rejected\"."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OrderStatus2> forOrderStatus2 = new MMConstraint<OrderStatus2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "RejectionReason must be present if ListOrderStatus equals \"Rejected\".";
			owner_lazy = () -> OrderStatus2.mmObject();
		}

		@Override
		public void executeValidator(OrderStatus2 obj) throws Exception {
			checkOrderStatus2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuoteStatus1 QuoteStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "RejectionReason is only present if QuoteStatus is Rejected."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuoteStatus1> forQuoteStatus1 = new MMConstraint<QuoteStatus1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "RejectionReason is only present if QuoteStatus is Rejected.";
			owner_lazy = () -> QuoteStatus1.mmObject();
		}

		@Override
		public void executeValidator(QuoteStatus1 obj) throws Exception {
			checkQuoteStatus1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5
	 * OrderStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "RejectionReason must be present if Status equals \"Rejected\"."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OrderStatusAndReason5> forOrderStatusAndReason5 = new MMConstraint<OrderStatusAndReason5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "RejectionReason must be present if Status equals \"Rejected\".";
			owner_lazy = () -> OrderStatusAndReason5.mmObject();
		}

		@Override
		public void executeValidator(OrderStatusAndReason5 obj) throws Exception {
			checkOrderStatusAndReason5(obj);
		}
	};

	/**
	 * RejectionReason must be present if ListOrderStatus equals "Rejected".
	 */
	public static void checkOrderStatus2(OrderStatus2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * RejectionReason is only present if QuoteStatus is Rejected.
	 */
	public static void checkQuoteStatus1(QuoteStatus1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * RejectionReason must be present if Status equals "Rejected".
	 */
	public static void checkOrderStatusAndReason5(OrderStatusAndReason5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}