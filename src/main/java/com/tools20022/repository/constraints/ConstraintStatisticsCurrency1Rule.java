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
import com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1;

/**
 * If present, Currency in HighestPriceValue12Months, LowestPriceValue12Months,
 * OneYearPriceChange, ThreeYearPriceChange and FiveYearPriceChange must be the
 * same.
 */
public class ConstraintStatisticsCurrency1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1
	 * StatisticsByPredefinedTimePeriods1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatisticsCurrency1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If present, Currency in HighestPriceValue12Months, LowestPriceValue12Months, OneYearPriceChange, ThreeYearPriceChange and FiveYearPriceChange must be the same."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<StatisticsByPredefinedTimePeriods1> forStatisticsByPredefinedTimePeriods1 = new MMConstraint<StatisticsByPredefinedTimePeriods1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatisticsCurrency1Rule";
			definition = "If present, Currency in HighestPriceValue12Months, LowestPriceValue12Months, OneYearPriceChange, ThreeYearPriceChange and FiveYearPriceChange must be the same.";
			owner_lazy = () -> StatisticsByPredefinedTimePeriods1.mmObject();
		}

		@Override
		public void executeValidator(StatisticsByPredefinedTimePeriods1 obj) throws Exception {
			checkStatisticsByPredefinedTimePeriods1(obj);
		}
	};

	/**
	 * If present, Currency in HighestPriceValue12Months,
	 * LowestPriceValue12Months, OneYearPriceChange, ThreeYearPriceChange and
	 * FiveYearPriceChange must be the same.
	 */
	public static void checkStatisticsByPredefinedTimePeriods1(StatisticsByPredefinedTimePeriods1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}