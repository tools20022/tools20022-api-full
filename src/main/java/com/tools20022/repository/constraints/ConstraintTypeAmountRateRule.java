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
import com.tools20022.repository.msg.Commission11;
import com.tools20022.repository.msg.Commission14;

/**
 * If Type is present, then either Amount or Rate must be present. If Amount or
 * Rate is present, then Type must be present.
 */
public class ConstraintTypeAmountRateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Commission14 Commission14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeAmountRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is present, then either Amount or Rate must be present. If Amount or Rate is present, then Type must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Commission14> forCommission14 = new MMConstraint<Commission14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeAmountRateRule";
			definition = "If Type is present, then either Amount or Rate must be present. If Amount or Rate is present, then Type must be present.";
			owner_lazy = () -> Commission14.mmObject();
		}

		@Override
		public void executeValidator(Commission14 obj) throws Exception {
			checkCommission14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Commission11 Commission11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeAmountRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type or ExtendedType is present, then either Amount or Rate must be present. If Amount or Rate is present, then either Type or Extended Type must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Commission11> forCommission11 = new MMConstraint<Commission11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeAmountRateRule";
			definition = "If Type or ExtendedType is present, then either Amount or Rate must be present. If Amount or Rate is present, then either Type or Extended Type must be present.";
			owner_lazy = () -> Commission11.mmObject();
		}

		@Override
		public void executeValidator(Commission11 obj) throws Exception {
			checkCommission11(obj);
		}
	};

	/**
	 * If Type is present, then either Amount or Rate must be present. If Amount
	 * or Rate is present, then Type must be present.
	 */
	public static void checkCommission14(Commission14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type or ExtendedType is present, then either Amount or Rate must be
	 * present. If Amount or Rate is present, then either Type or Extended Type
	 * must be present.
	 */
	public static void checkCommission11(Commission11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}