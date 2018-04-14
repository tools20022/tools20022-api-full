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
import com.tools20022.repository.msg.LineItemDetails13;
import com.tools20022.repository.msg.LineItemDetails14;

/**
 * ProductOrigin is mandatory if PaymentObligation (BPO) is used in this
 * transaction.
 */
public class ConstraintProductOriginBPORule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14
	 * LineItemDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductOriginBPORule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ProductOrigin is mandatory if PaymentObligation (BPO) is used in this transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<LineItemDetails14> forLineItemDetails14 = new MMConstraint<LineItemDetails14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductOriginBPORule";
			definition = "ProductOrigin is mandatory if PaymentObligation (BPO) is used in this transaction.";
			owner_lazy = () -> LineItemDetails14.mmObject();
		}

		@Override
		public void executeValidator(LineItemDetails14 obj) throws Exception {
			checkLineItemDetails14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductOriginBPORule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ProductOrigin is mandatory if PaymentObligation (BPO) is used in this transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<LineItemDetails13> forLineItemDetails13 = new MMConstraint<LineItemDetails13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductOriginBPORule";
			definition = "ProductOrigin is mandatory if PaymentObligation (BPO) is used in this transaction.";
			owner_lazy = () -> LineItemDetails13.mmObject();
		}

		@Override
		public void executeValidator(LineItemDetails13 obj) throws Exception {
			checkLineItemDetails13(obj);
		}
	};

	/**
	 * ProductOrigin is mandatory if PaymentObligation (BPO) is used in this
	 * transaction.
	 */
	public static void checkLineItemDetails14(LineItemDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ProductOrigin is mandatory if PaymentObligation (BPO) is used in this
	 * transaction.
	 */
	public static void checkLineItemDetails13(LineItemDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}