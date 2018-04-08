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
 * If FundCashForecastDetails is not present, then at least one occurrence of
 * FundOrSubFundDetails/TradeDateTime must be present.
 */
public class ConstraintTradeDate2Rule {

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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/FundOrSubFundDetails[*]/TradeDateTime&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FundCashForecastDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If FundCashForecastDetails is not present, then at least one occurrence of FundOrSubFundDetails/TradeDateTime must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundConfirmedCashForecastReportV04> for_camt_FundConfirmedCashForecastReportV04 = new MMConstraint<FundConfirmedCashForecastReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate2Rule";
			definition = "If FundCashForecastDetails is not present, then at least one occurrence of FundOrSubFundDetails/TradeDateTime must be present.";
			owner_lazy = () -> FundConfirmedCashForecastReportV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/FundOrSubFundDetails[*]/TradeDateTime</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FundCashForecastDetails[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/FundOrSubFundDetails[*]/TradeDateTime&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FundCashForecastDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If FundCashForecastDetails is not present, then at least one occurrence of FundOrSubFundDetails/TradeDateTime must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundConfirmedCashForecastReport3> forFundConfirmedCashForecastReport3 = new MMConstraint<FundConfirmedCashForecastReport3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate2Rule";
			definition = "If FundCashForecastDetails is not present, then at least one occurrence of FundOrSubFundDetails/TradeDateTime must be present.";
			owner_lazy = () -> FundConfirmedCashForecastReport3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/FundOrSubFundDetails[*]/TradeDateTime</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FundCashForecastDetails[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/FundOrSubFundDetails[*]/TradeDateTime&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/EstimatedFundCashForecastDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If EstimatedFundCashForecastDetails is not present, then at least one occurrence of FundOrSubFundDetails/TradeDateTime must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundEstimatedCashForecastReportV04> for_camt_FundEstimatedCashForecastReportV04 = new MMConstraint<FundEstimatedCashForecastReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate2Rule";
			definition = "If EstimatedFundCashForecastDetails is not present, then at least one occurrence of FundOrSubFundDetails/TradeDateTime must be present.";
			owner_lazy = () -> FundEstimatedCashForecastReportV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/FundOrSubFundDetails[*]/TradeDateTime</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/EstimatedFundCashForecastDetails[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(FundEstimatedCashForecastReportV04 obj) throws Exception {
			check_camt_FundEstimatedCashForecastReportV04(obj);
		}
	};

	/**
	 * If FundCashForecastDetails is not present, then at least one occurrence
	 * of FundOrSubFundDetails/TradeDateTime must be present.
	 */
	public static void check_camt_FundConfirmedCashForecastReportV04(FundConfirmedCashForecastReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If FundCashForecastDetails is not present, then at least one occurrence
	 * of FundOrSubFundDetails/TradeDateTime must be present.
	 */
	public static void checkFundConfirmedCashForecastReport3(FundConfirmedCashForecastReport3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If EstimatedFundCashForecastDetails is not present, then at least one
	 * occurrence of FundOrSubFundDetails/TradeDateTime must be present.
	 */
	public static void check_camt_FundEstimatedCashForecastReportV04(FundEstimatedCashForecastReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}