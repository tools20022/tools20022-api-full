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
import com.tools20022.repository.msg.SecuritiesSettlement1;
import com.tools20022.repository.msg.SecuritiesSettlement2;

/**
 * Date must only be present if DateCode is not present or if DateCode contains
 * the value FUTU (Future) or WHIF (WhenAndIfIssued) or SELL (SellersOption).
 */
public class ConstraintDateAndDateCodeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlement1
	 * SecuritiesSettlement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateAndDateCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date must only be present if DateCode is not present or if DateCode contains the value FUTU (Future) or WHIF (WhenAndIfIssued) or SELL (SellersOption)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlement1> forSecuritiesSettlement1 = new MMConstraint<SecuritiesSettlement1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateAndDateCodeRule";
			definition = "Date must only be present if DateCode is not present or if DateCode contains the value FUTU (Future) or WHIF (WhenAndIfIssued) or SELL (SellersOption).";
			owner_lazy = () -> SecuritiesSettlement1.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlement1 obj) throws Exception {
			checkSecuritiesSettlement1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlement2
	 * SecuritiesSettlement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateAndDateCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date must only be present if DateCode is not present or if DateCode contains the value FUTU (Future) or WHIF (WhenAndIfIssued) or SELL (SellersOption)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlement2> forSecuritiesSettlement2 = new MMConstraint<SecuritiesSettlement2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateAndDateCodeRule";
			definition = "Date must only be present if DateCode is not present or if DateCode contains the value FUTU (Future) or WHIF (WhenAndIfIssued) or SELL (SellersOption).";
			owner_lazy = () -> SecuritiesSettlement2.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlement2 obj) throws Exception {
			checkSecuritiesSettlement2(obj);
		}
	};

	/**
	 * Date must only be present if DateCode is not present or if DateCode
	 * contains the value FUTU (Future) or WHIF (WhenAndIfIssued) or SELL
	 * (SellersOption).
	 */
	public static void checkSecuritiesSettlement1(SecuritiesSettlement1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Date must only be present if DateCode is not present or if DateCode
	 * contains the value FUTU (Future) or WHIF (WhenAndIfIssued) or SELL
	 * (SellersOption).
	 */
	public static void checkSecuritiesSettlement2(SecuritiesSettlement2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}