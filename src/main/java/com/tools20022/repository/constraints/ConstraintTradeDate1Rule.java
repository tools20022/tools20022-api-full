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
 * If any occurrence of FundCashForecastDetails is present, then any occurrence
 * of FundOrSubFundDetails/TradeDateTime is not allowed.
 */
public class ConstraintTradeDate1Rule {

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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FundOrSubFundDetails[*]/TradeDateTime&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/FundCashForecastDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of FundCashForecastDetails is present, then any occurrence of FundOrSubFundDetails/TradeDateTime is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundConfirmedCashForecastReportV04> forFundConfirmedCashForecastReportV04 = new MMConstraint<FundConfirmedCashForecastReportV04>() {
		{
			validator = ConstraintTradeDate1Rule::checkFundConfirmedCashForecastReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate1Rule";
			definition = "If any occurrence of FundCashForecastDetails is present, then any occurrence of FundOrSubFundDetails/TradeDateTime is not allowed.";
			owner_lazy = () -> FundConfirmedCashForecastReportV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FundOrSubFundDetails[*]/TradeDateTime</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/FundCashForecastDetails[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FundOrSubFundDetails[*]/TradeDateTime&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/EstimatedFundCashForecastDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of EstimatedFundCashForecastDetails is present, then any occurrence of FundOrSubFundDetails/TradeDateTime is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundEstimatedCashForecastReportV04> forFundEstimatedCashForecastReportV04 = new MMConstraint<FundEstimatedCashForecastReportV04>() {
		{
			validator = ConstraintTradeDate1Rule::checkFundEstimatedCashForecastReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate1Rule";
			definition = "If any occurrence of EstimatedFundCashForecastDetails is present, then any occurrence of FundOrSubFundDetails/TradeDateTime is not allowed.";
			owner_lazy = () -> FundEstimatedCashForecastReportV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FundOrSubFundDetails[*]/TradeDateTime</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/EstimatedFundCashForecastDetails[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FundOrSubFundDetails[*]/TradeDateTime&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/FundCashForecastDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of FundCashForecastDetails is present, then any occurrence of FundOrSubFundDetails/TradeDateTime is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundConfirmedCashForecastReport3> forFundConfirmedCashForecastReport3 = new MMConstraint<FundConfirmedCashForecastReport3>() {
		{
			validator = ConstraintTradeDate1Rule::checkFundConfirmedCashForecastReport3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate1Rule";
			definition = "If any occurrence of FundCashForecastDetails is present, then any occurrence of FundOrSubFundDetails/TradeDateTime is not allowed.";
			owner_lazy = () -> FundConfirmedCashForecastReport3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FundOrSubFundDetails[*]/TradeDateTime</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/FundCashForecastDetails[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If any occurrence of FundCashForecastDetails is present, then any
	 * occurrence of FundOrSubFundDetails/TradeDateTime is not allowed.
	 */
	public static void checkFundConfirmedCashForecastReportV04(FundConfirmedCashForecastReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of EstimatedFundCashForecastDetails is present, then
	 * any occurrence of FundOrSubFundDetails/TradeDateTime is not allowed.
	 */
	public static void checkFundEstimatedCashForecastReportV04(FundEstimatedCashForecastReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of FundCashForecastDetails is present, then any
	 * occurrence of FundOrSubFundDetails/TradeDateTime is not allowed.
	 */
	public static void checkFundConfirmedCashForecastReport3(FundConfirmedCashForecastReport3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}