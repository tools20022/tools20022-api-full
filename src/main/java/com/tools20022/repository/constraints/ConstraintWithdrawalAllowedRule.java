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
import com.tools20022.repository.msg.CorporateActionOption1;

/**
 * If the value of WithdrawalAllowedIndicator is true, then
 * PeriodDetails/RevocabilityPeriod is Mandatory.
 */
public class ConstraintWithdrawalAllowedRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAllowedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the value of WithdrawalAllowedIndicator is true, then PeriodDetails/RevocabilityPeriod is Mandatory."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption1> forCorporateActionOption1 = new MMConstraint<CorporateActionOption1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalAllowedRule";
			definition = "If the value of WithdrawalAllowedIndicator is true, then PeriodDetails/RevocabilityPeriod is Mandatory.";
			owner_lazy = () -> CorporateActionOption1.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption1 obj) throws Exception {
			checkCorporateActionOption1(obj);
		}
	};

	/**
	 * If the value of WithdrawalAllowedIndicator is true, then
	 * PeriodDetails/RevocabilityPeriod is Mandatory.
	 */
	public static void checkCorporateActionOption1(CorporateActionOption1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}