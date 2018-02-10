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
import com.tools20022.repository.msg.FundCashForecastParameters2;
import com.tools20022.repository.msg.FundParameters2;
import com.tools20022.repository.msg.FundParameters3;

/**
 * At least one element in the list (FinancialInstrumentDetails, TradeDateTime,
 * DetailedReportParameter) must be present.
 */
public class ConstraintReportParameterRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters2
	 * FundCashForecastParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportParameterRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one element in the list (FinancialInstrumentDetails, TradeDateTime, DetailedReportParameter) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundCashForecastParameters2> forFundCashForecastParameters2 = new MMConstraint<FundCashForecastParameters2>() {
		{
			validator = ConstraintReportParameterRule::checkFundCashForecastParameters2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportParameterRule";
			definition = "At least one element in the list (FinancialInstrumentDetails, TradeDateTime, DetailedReportParameter) must be present.";
			owner_lazy = () -> FundCashForecastParameters2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FundParameters2
	 * FundParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportParameterRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one element in the list (FundManagementCompany, FinancialInstrumentDetails, DateFrom) must be present. More than one element in the list (FundManagementCompany, FinancialInstrumentDetails, DateFrom) may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundParameters2> forFundParameters2 = new MMConstraint<FundParameters2>() {
		{
			validator = ConstraintReportParameterRule::checkFundParameters2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportParameterRule";
			definition = "At least one element in the list (FundManagementCompany, FinancialInstrumentDetails, DateFrom) must be present. More than one element in the list (FundManagementCompany, FinancialInstrumentDetails, DateFrom) may be present.";
			owner_lazy = () -> FundParameters2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FundParameters3
	 * FundParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportParameterRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either FinancialInstrumentDetails or ValuationDateTime must be present. Both FinancialInstrumentDetails and ValuationDateTime may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundParameters3> forFundParameters3 = new MMConstraint<FundParameters3>() {
		{
			validator = ConstraintReportParameterRule::checkFundParameters3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportParameterRule";
			definition = "Either FinancialInstrumentDetails or ValuationDateTime must be present. Both FinancialInstrumentDetails and ValuationDateTime may be present.";
			owner_lazy = () -> FundParameters3.mmObject();
		}
	};

	/**
	 * At least one element in the list (FinancialInstrumentDetails,
	 * TradeDateTime, DetailedReportParameter) must be present.
	 */
	public static void checkFundCashForecastParameters2(FundCashForecastParameters2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one element in the list (FundManagementCompany,
	 * FinancialInstrumentDetails, DateFrom) must be present. More than one
	 * element in the list (FundManagementCompany, FinancialInstrumentDetails,
	 * DateFrom) may be present.
	 */
	public static void checkFundParameters2(FundParameters2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either FinancialInstrumentDetails or ValuationDateTime must be present.
	 * Both FinancialInstrumentDetails and ValuationDateTime may be present.
	 */
	public static void checkFundParameters3(FundParameters3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}