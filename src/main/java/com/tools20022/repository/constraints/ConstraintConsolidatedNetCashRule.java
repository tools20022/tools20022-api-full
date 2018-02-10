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
 * If ConsolidatedNetCashForecast is present, then at least one occurrence of
 * either FundOrSubFundDetails or FundCashForecastDetails must be present. Both
 * FundOrSubFundDetails and FundCashForecastDetails may be present.
 */
public class ConstraintConsolidatedNetCashRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04
	 * FundConfirmedCashForecastReportV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/FundOrSubFundDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/FundCashForecastDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ConsolidatedNetCashForecast&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsolidatedNetCashRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ConsolidatedNetCashForecast is present, then at least one occurrence of either FundOrSubFundDetails or FundCashForecastDetails must be present. Both FundOrSubFundDetails and FundCashForecastDetails may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundConfirmedCashForecastReportV04> forFundConfirmedCashForecastReportV04 = new MMConstraint<FundConfirmedCashForecastReportV04>() {
		{
			validator = ConstraintConsolidatedNetCashRule::checkFundConfirmedCashForecastReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsolidatedNetCashRule";
			definition = "If ConsolidatedNetCashForecast is present, then at least one occurrence of either FundOrSubFundDetails or FundCashForecastDetails must be present. Both FundOrSubFundDetails and FundCashForecastDetails may be present.";
			owner_lazy = () -> FundConfirmedCashForecastReportV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/FundOrSubFundDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/FundCashForecastDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ConsolidatedNetCashForecast</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/FundOrSubFundDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/EstimatedFundCashForecastDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ConsolidatedNetCashForecast&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsolidatedNetCashRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ConsolidatedNetCashForecast is present, then at least one occurrence of  either FundOrSubFundDetails or EstimatedFundCashForecastDetails must be present. Both FundOrSubFundDetails and EstimatedFundCashForecastDetails may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundEstimatedCashForecastReportV04> forFundEstimatedCashForecastReportV04 = new MMConstraint<FundEstimatedCashForecastReportV04>() {
		{
			validator = ConstraintConsolidatedNetCashRule::checkFundEstimatedCashForecastReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsolidatedNetCashRule";
			definition = "If ConsolidatedNetCashForecast is present, then at least one occurrence of  either FundOrSubFundDetails or EstimatedFundCashForecastDetails must be present. Both FundOrSubFundDetails and EstimatedFundCashForecastDetails may be present.";
			owner_lazy = () -> FundEstimatedCashForecastReportV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/FundOrSubFundDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/EstimatedFundCashForecastDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ConsolidatedNetCashForecast</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/FundOrSubFundDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/FundCashForecastDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ConsolidatedNetCashForecast&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsolidatedNetCashRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ConsolidatedNetCashForecast is present, then at least one occurrence of either FundOrSubFundDetails or FundCashForecastDetails must be present. Both FundOrSubFundDetails and FundCashForecastDetails may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundConfirmedCashForecastReport3> forFundConfirmedCashForecastReport3 = new MMConstraint<FundConfirmedCashForecastReport3>() {
		{
			validator = ConstraintConsolidatedNetCashRule::checkFundConfirmedCashForecastReport3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsolidatedNetCashRule";
			definition = "If ConsolidatedNetCashForecast is present, then at least one occurrence of either FundOrSubFundDetails or FundCashForecastDetails must be present. Both FundOrSubFundDetails and FundCashForecastDetails may be present.";
			owner_lazy = () -> FundConfirmedCashForecastReport3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/FundOrSubFundDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/FundCashForecastDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ConsolidatedNetCashForecast</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If ConsolidatedNetCashForecast is present, then at least one occurrence
	 * of either FundOrSubFundDetails or FundCashForecastDetails must be
	 * present. Both FundOrSubFundDetails and FundCashForecastDetails may be
	 * present.
	 */
	public static void checkFundConfirmedCashForecastReportV04(FundConfirmedCashForecastReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ConsolidatedNetCashForecast is present, then at least one occurrence
	 * of either FundOrSubFundDetails or EstimatedFundCashForecastDetails must
	 * be present. Both FundOrSubFundDetails and
	 * EstimatedFundCashForecastDetails may be present.
	 */
	public static void checkFundEstimatedCashForecastReportV04(FundEstimatedCashForecastReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ConsolidatedNetCashForecast is present, then at least one occurrence
	 * of either FundOrSubFundDetails or FundCashForecastDetails must be
	 * present. Both FundOrSubFundDetails and FundCashForecastDetails may be
	 * present.
	 */
	public static void checkFundConfirmedCashForecastReport3(FundConfirmedCashForecastReport3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}