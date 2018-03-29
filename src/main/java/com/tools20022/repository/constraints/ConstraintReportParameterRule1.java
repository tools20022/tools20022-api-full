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
import com.tools20022.repository.choice.FundParameters3Choice;

/**
 * At least one element in the list (FundManagementCompany,
 * FinancialInstrumentDetails, DateFrom) must be present. More than<br>
 * one element in the list (FundManagementCompany, FinancialInstrumentDetails,
 * DateFrom) may be present.
 */
public class ConstraintReportParameterRule1 {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.FundParameters3Choice
	 * FundParameters3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Parameters/FinancialInstrumentDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Parameters/FundManagementCompany[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Parameters/DateFrom&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Parameters&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportParameterRule#1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one element in the list (FundManagementCompany, FinancialInstrumentDetails, DateFrom) must be present. More than\r\none element in the list (FundManagementCompany, FinancialInstrumentDetails, DateFrom) may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundParameters3Choice> forFundParameters3Choice = new MMConstraint<FundParameters3Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportParameterRule#1";
			definition = "At least one element in the list (FundManagementCompany, FinancialInstrumentDetails, DateFrom) must be present. More than\r\none element in the list (FundManagementCompany, FinancialInstrumentDetails, DateFrom) may be present.";
			owner_lazy = () -> FundParameters3Choice.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Parameters/FinancialInstrumentDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Parameters/FundManagementCompany[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Parameters/DateFrom</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Parameters</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(FundParameters3Choice obj) throws Exception {
			checkFundParameters3Choice(obj);
		}
	};

	/**
	 * At least one element in the list (FundManagementCompany,
	 * FinancialInstrumentDetails, DateFrom) must be present. More than<br>
	 * one element in the list (FundManagementCompany,
	 * FinancialInstrumentDetails, DateFrom) may be present.
	 */
	public static void checkFundParameters3Choice(FundParameters3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}