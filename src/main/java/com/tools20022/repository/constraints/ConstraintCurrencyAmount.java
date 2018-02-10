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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.RestrictedFINActiveOrHistoricCurrencyAndAmount;

/**
 * The number of fractional digits (or minor unit of currency) must comply with
 * ISO 4217. Note: The decimal separator is a dot.
 */
public class ConstraintCurrencyAmount {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The number of fractional digits (or minor unit of currency) must comply with ISO 4217.\nNote: The decimal separator is a dot."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ActiveCurrencyAndAmount> forActiveCurrencyAndAmount = new MMConstraint<ActiveCurrencyAndAmount>() {
		{
			validator = ConstraintCurrencyAmount::checkActiveCurrencyAndAmount;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyAmount";
			definition = "The number of fractional digits (or minor unit of currency) must comply with ISO 4217.\nNote: The decimal separator is a dot.";
			owner_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The number of fractional digits (or minor unit of currency) must comply with ISO 4217.\nNote: The decimal separator is a dot."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ActiveOrHistoricCurrencyAndAmount> forActiveOrHistoricCurrencyAndAmount = new MMConstraint<ActiveOrHistoricCurrencyAndAmount>() {
		{
			validator = ConstraintCurrencyAmount::checkActiveOrHistoricCurrencyAndAmount;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyAmount";
			definition = "The number of fractional digits (or minor unit of currency) must comply with ISO 4217.\nNote: The decimal separator is a dot.";
			owner_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The number of fractional digits (or minor unit of currency) must comply with ISO 4217.\nNote: The decimal separator is a dot."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RestrictedFINActiveCurrencyAndAmount> forRestrictedFINActiveCurrencyAndAmount = new MMConstraint<RestrictedFINActiveCurrencyAndAmount>() {
		{
			validator = ConstraintCurrencyAmount::checkRestrictedFINActiveCurrencyAndAmount;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyAmount";
			definition = "The number of fractional digits (or minor unit of currency) must comply with ISO 4217.\nNote: The decimal separator is a dot.";
			owner_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveOrHistoricCurrencyAndAmount
	 * RestrictedFINActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The number of fractional digits (or minor unit of currency) must comply with ISO 4217.\nNote: The decimal separator is a dot."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RestrictedFINActiveOrHistoricCurrencyAndAmount> forRestrictedFINActiveOrHistoricCurrencyAndAmount = new MMConstraint<RestrictedFINActiveOrHistoricCurrencyAndAmount>() {
		{
			validator = ConstraintCurrencyAmount::checkRestrictedFINActiveOrHistoricCurrencyAndAmount;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyAmount";
			definition = "The number of fractional digits (or minor unit of currency) must comply with ISO 4217.\nNote: The decimal separator is a dot.";
			owner_lazy = () -> RestrictedFINActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};

	/**
	 * The number of fractional digits (or minor unit of currency) must comply
	 * with ISO 4217. Note: The decimal separator is a dot.
	 */
	public static void checkActiveCurrencyAndAmount(ActiveCurrencyAndAmount obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The number of fractional digits (or minor unit of currency) must comply
	 * with ISO 4217. Note: The decimal separator is a dot.
	 */
	public static void checkActiveOrHistoricCurrencyAndAmount(ActiveOrHistoricCurrencyAndAmount obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The number of fractional digits (or minor unit of currency) must comply
	 * with ISO 4217. Note: The decimal separator is a dot.
	 */
	public static void checkRestrictedFINActiveCurrencyAndAmount(RestrictedFINActiveCurrencyAndAmount obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The number of fractional digits (or minor unit of currency) must comply
	 * with ISO 4217. Note: The decimal separator is a dot.
	 */
	public static void checkRestrictedFINActiveOrHistoricCurrencyAndAmount(RestrictedFINActiveOrHistoricCurrencyAndAmount obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}