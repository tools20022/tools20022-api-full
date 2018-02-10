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
import com.tools20022.repository.msg.OtherParties1;
import com.tools20022.repository.msg.OtherParties18;

/**
 * When investor is used with a country code, the country code specifies the
 * nationality of the investor, for the settlement of certain securities (i.e.
 * airlines, defence manufacturers) under the EU legislation.
 */
public class ConstraintInvestorUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties18 OtherParties18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When investor is used with a country code, the country code specifies the nationality of the investor, for the settlement of certain securities (i.e. airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties18> forOtherParties18 = new MMConstraint<OtherParties18>() {
		{
			validator = ConstraintInvestorUsageRule::checkOtherParties18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorUsageRule";
			definition = "When investor is used with a country code, the country code specifies the nationality of the investor, for the settlement of certain securities (i.e. airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties1 OtherParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When investor is used with a country code, the country code specifies the nationality of the investor, for the settlement of certain securities (i.e. airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties1> forOtherParties1 = new MMConstraint<OtherParties1>() {
		{
			validator = ConstraintInvestorUsageRule::checkOtherParties1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorUsageRule";
			definition = "When investor is used with a country code, the country code specifies the nationality of the investor, for the settlement of certain securities (i.e. airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties1.mmObject();
		}
	};

	/**
	 * When investor is used with a country code, the country code specifies the
	 * nationality of the investor, for the settlement of certain securities
	 * (i.e. airlines, defence manufacturers) under the EU legislation.
	 */
	public static void checkOtherParties18(OtherParties18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When investor is used with a country code, the country code specifies the
	 * nationality of the investor, for the settlement of certain securities
	 * (i.e. airlines, defence manufacturers) under the EU legislation.
	 */
	public static void checkOtherParties1(OtherParties1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}