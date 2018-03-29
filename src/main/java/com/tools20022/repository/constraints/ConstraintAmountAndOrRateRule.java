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
import com.tools20022.repository.msg.PriceValue2;
import com.tools20022.repository.msg.PriceValueChange1;
import com.tools20022.repository.msg.Tax17;
import com.tools20022.repository.msg.Tax8;

/**
 * If Amount is not present, then Rate is mandatory. If Amount is present, then
 * Rate is optional.
 */
public class ConstraintAmountAndOrRateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Tax8 Tax8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountAndOrRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Amount is not present, then Rate is mandatory. If Amount is present, then Rate is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Tax8> forTax8 = new MMConstraint<Tax8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountAndOrRateRule";
			definition = "If Amount is not present, then Rate is mandatory. If Amount is present, then Rate is optional.";
			owner_lazy = () -> Tax8.mmObject();
		}

		@Override
		public void executeValidator(Tax8 obj) throws Exception {
			checkTax8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceValue2 PriceValue2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountAndOrRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Amount is not present, then Rate is mandatory. If Amount is present, then Rate is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceValue2> forPriceValue2 = new MMConstraint<PriceValue2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountAndOrRateRule";
			definition = "If Amount is not present, then Rate is mandatory. If Amount is present, then Rate is optional.";
			owner_lazy = () -> PriceValue2.mmObject();
		}

		@Override
		public void executeValidator(PriceValue2 obj) throws Exception {
			checkPriceValue2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Tax17 Tax17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountAndOrRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Amount is not present, then Rate is mandatory. If Amount is present, then Rate is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Tax17> forTax17 = new MMConstraint<Tax17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountAndOrRateRule";
			definition = "If Amount is not present, then Rate is mandatory. If Amount is present, then Rate is optional.";
			owner_lazy = () -> Tax17.mmObject();
		}

		@Override
		public void executeValidator(Tax17 obj) throws Exception {
			checkTax17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceValueChange1
	 * PriceValueChange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountAndOrRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Amount is not present, then Rate is mandatory. If Amount is present, then Rate is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceValueChange1> forPriceValueChange1 = new MMConstraint<PriceValueChange1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountAndOrRateRule";
			definition = "If Amount is not present, then Rate is mandatory. If Amount is present, then Rate is optional.";
			owner_lazy = () -> PriceValueChange1.mmObject();
		}

		@Override
		public void executeValidator(PriceValueChange1 obj) throws Exception {
			checkPriceValueChange1(obj);
		}
	};

	/**
	 * If Amount is not present, then Rate is mandatory. If Amount is present,
	 * then Rate is optional.
	 */
	public static void checkTax8(Tax8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Amount is not present, then Rate is mandatory. If Amount is present,
	 * then Rate is optional.
	 */
	public static void checkPriceValue2(PriceValue2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Amount is not present, then Rate is mandatory. If Amount is present,
	 * then Rate is optional.
	 */
	public static void checkTax17(Tax17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Amount is not present, then Rate is mandatory. If Amount is present,
	 * then Rate is optional.
	 */
	public static void checkPriceValueChange1(PriceValueChange1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}