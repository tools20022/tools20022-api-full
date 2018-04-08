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
import com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04;
import com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04;
import com.tools20022.repository.msg.FundConfirmedCashForecastReport3;

/**
 * When using the message to provide cash in and cash out amounts for more than
 * one fund/sub fund, and more than one share classes, (two or more
 * FundOrSubFundDetails sequences and two or more FundCashForecastDetails
 * sequences and used), in this usage there is no way to determine which share
 * class belongs to which fund/sub fund from the message content itself, which
 * may not be desirable and this type of usage should be bilaterally agreed.
 */
public class ConstraintFundOrSubFundAndShareClassGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04
	 * FundConfirmedCashForecastReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOrSubFundAndShareClassGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When using the message to provide cash in and cash out amounts for more than one fund/sub fund, and more than one share classes, (two or more FundOrSubFundDetails sequences and two or more FundCashForecastDetails sequences and used), in this usage there is no way to determine which share class belongs to which fund/sub fund from the message content itself, which may not be desirable and this type of usage should be bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundConfirmedCashForecastReportV04> for_camt_FundConfirmedCashForecastReportV04 = new MMConstraint<FundConfirmedCashForecastReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundOrSubFundAndShareClassGuideline";
			definition = "When using the message to provide cash in and cash out amounts for more than one fund/sub fund, and more than one share classes, (two or more FundOrSubFundDetails sequences and two or more FundCashForecastDetails sequences and used), in this usage there is no way to determine which share class belongs to which fund/sub fund from the message content itself, which may not be desirable and this type of usage should be bilaterally agreed.";
			owner_lazy = () -> FundConfirmedCashForecastReportV04.mmObject();
		}

		@Override
		public void executeValidator(FundConfirmedCashForecastReportV04 obj) throws Exception {
			check_camt_FundConfirmedCashForecastReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3
	 * FundConfirmedCashForecastReport3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOrSubFundAndShareClassGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When using the message to provide cash in and cash out amounts for more than one fund/sub fund, and more than one share classes, (two or more FundOrSubFundDetails sequences and two or more FundCashForecastDetails sequences and used), in this usage there is no way to determine which share class belongs to which fund/sub fund from the message content itself, which may not be desirable and this type of usage should be bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundConfirmedCashForecastReport3> forFundConfirmedCashForecastReport3 = new MMConstraint<FundConfirmedCashForecastReport3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundOrSubFundAndShareClassGuideline";
			definition = "When using the message to provide cash in and cash out amounts for more than one fund/sub fund, and more than one share classes, (two or more FundOrSubFundDetails sequences and two or more FundCashForecastDetails sequences and used), in this usage there is no way to determine which share class belongs to which fund/sub fund from the message content itself, which may not be desirable and this type of usage should be bilaterally agreed.";
			owner_lazy = () -> FundConfirmedCashForecastReport3.mmObject();
		}

		@Override
		public void executeValidator(FundConfirmedCashForecastReport3 obj) throws Exception {
			checkFundConfirmedCashForecastReport3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04
	 * FundEstimatedCashForecastReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOrSubFundAndShareClassGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When using the message to provide cash in and cash out amounts for more than one fund/sub fund, and more than one share classes, (two or more FundOrSubFundDetails sequences and two or more EstimatedFundCashForecastDetails sequences and used), in this usage there is no way to determine which share class belongs to which fund/sub fund from the message content itself, which may not be desirable and this type of usage should be bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundEstimatedCashForecastReportV04> for_camt_FundEstimatedCashForecastReportV04 = new MMConstraint<FundEstimatedCashForecastReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundOrSubFundAndShareClassGuideline";
			definition = "When using the message to provide cash in and cash out amounts for more than one fund/sub fund, and more than one share classes, (two or more FundOrSubFundDetails sequences and two or more EstimatedFundCashForecastDetails sequences and used), in this usage there is no way to determine which share class belongs to which fund/sub fund from the message content itself, which may not be desirable and this type of usage should be bilaterally agreed.";
			owner_lazy = () -> FundEstimatedCashForecastReportV04.mmObject();
		}

		@Override
		public void executeValidator(FundEstimatedCashForecastReportV04 obj) throws Exception {
			check_camt_FundEstimatedCashForecastReportV04(obj);
		}
	};

	/**
	 * When using the message to provide cash in and cash out amounts for more
	 * than one fund/sub fund, and more than one share classes, (two or more
	 * FundOrSubFundDetails sequences and two or more FundCashForecastDetails
	 * sequences and used), in this usage there is no way to determine which
	 * share class belongs to which fund/sub fund from the message content
	 * itself, which may not be desirable and this type of usage should be
	 * bilaterally agreed.
	 */
	public static void check_camt_FundConfirmedCashForecastReportV04(FundConfirmedCashForecastReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When using the message to provide cash in and cash out amounts for more
	 * than one fund/sub fund, and more than one share classes, (two or more
	 * FundOrSubFundDetails sequences and two or more FundCashForecastDetails
	 * sequences and used), in this usage there is no way to determine which
	 * share class belongs to which fund/sub fund from the message content
	 * itself, which may not be desirable and this type of usage should be
	 * bilaterally agreed.
	 */
	public static void checkFundConfirmedCashForecastReport3(FundConfirmedCashForecastReport3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When using the message to provide cash in and cash out amounts for more
	 * than one fund/sub fund, and more than one share classes, (two or more
	 * FundOrSubFundDetails sequences and two or more
	 * EstimatedFundCashForecastDetails sequences and used), in this usage there
	 * is no way to determine which share class belongs to which fund/sub fund
	 * from the message content itself, which may not be desirable and this type
	 * of usage should be bilaterally agreed.
	 */
	public static void check_camt_FundEstimatedCashForecastReportV04(FundEstimatedCashForecastReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}