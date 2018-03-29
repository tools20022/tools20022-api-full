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
import com.tools20022.repository.area.camt.*;
import java.util.Arrays;

/**
 * MessagePagination may be present or ReportPagination may be present, but not
 * both.
 */
public class ConstraintMessageOrReportPaginationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV07
	 * BankToCustomerAccountReportV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Report[*]/ReportPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrReportPaginationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MessagePagination may be present or ReportPagination may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrReportPaginationRule#forBankToCustomerAccountReportV06
	 * ConstraintMessageOrReportPaginationRule.forBankToCustomerAccountReportV06
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerAccountReportV07> forBankToCustomerAccountReportV07 = new MMConstraint<BankToCustomerAccountReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrReportPaginationRule";
			definition = "MessagePagination may be present or ReportPagination may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrReportPaginationRule.forBankToCustomerAccountReportV06;
			owner_lazy = () -> BankToCustomerAccountReportV07.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Report[*]/ReportPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(BankToCustomerAccountReportV07 obj) throws Exception {
			checkBankToCustomerAccountReportV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV06
	 * BankToCustomerAccountReportV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Report[*]/ReportPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrReportPaginationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MessagePagination may be present or ReportPagination may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrReportPaginationRule#forBankToCustomerAccountReportV07
	 * ConstraintMessageOrReportPaginationRule.forBankToCustomerAccountReportV07
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrReportPaginationRule#forBankToCustomerAccountReportV05
	 * ConstraintMessageOrReportPaginationRule.forBankToCustomerAccountReportV05
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerAccountReportV06> forBankToCustomerAccountReportV06 = new MMConstraint<BankToCustomerAccountReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrReportPaginationRule";
			definition = "MessagePagination may be present or ReportPagination may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrReportPaginationRule.forBankToCustomerAccountReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrReportPaginationRule.forBankToCustomerAccountReportV05;
			owner_lazy = () -> BankToCustomerAccountReportV06.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Report[*]/ReportPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(BankToCustomerAccountReportV06 obj) throws Exception {
			checkBankToCustomerAccountReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV03
	 * BankToCustomerAccountReportV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Report[*]/ReportPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrReportPaginationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MessagePagination may be present or ReportPagination may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerAccountReportV03> forBankToCustomerAccountReportV03 = new MMConstraint<BankToCustomerAccountReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrReportPaginationRule";
			definition = "MessagePagination may be present or ReportPagination may be present, but not both.";
			owner_lazy = () -> BankToCustomerAccountReportV03.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Report[*]/ReportPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(BankToCustomerAccountReportV03 obj) throws Exception {
			checkBankToCustomerAccountReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV04
	 * BankToCustomerAccountReportV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Report[*]/ReportPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrReportPaginationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MessagePagination may be present or ReportPagination may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrReportPaginationRule#forBankToCustomerAccountReportV05
	 * ConstraintMessageOrReportPaginationRule.forBankToCustomerAccountReportV05
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerAccountReportV04> forBankToCustomerAccountReportV04 = new MMConstraint<BankToCustomerAccountReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrReportPaginationRule";
			definition = "MessagePagination may be present or ReportPagination may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrReportPaginationRule.forBankToCustomerAccountReportV05);
			owner_lazy = () -> BankToCustomerAccountReportV04.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Report[*]/ReportPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(BankToCustomerAccountReportV04 obj) throws Exception {
			checkBankToCustomerAccountReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV05
	 * BankToCustomerAccountReportV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Report[*]/ReportPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrReportPaginationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MessagePagination may be present or ReportPagination may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrReportPaginationRule#forBankToCustomerAccountReportV06
	 * ConstraintMessageOrReportPaginationRule.forBankToCustomerAccountReportV06
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrReportPaginationRule#forBankToCustomerAccountReportV04
	 * ConstraintMessageOrReportPaginationRule.forBankToCustomerAccountReportV04
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerAccountReportV05> forBankToCustomerAccountReportV05 = new MMConstraint<BankToCustomerAccountReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrReportPaginationRule";
			definition = "MessagePagination may be present or ReportPagination may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrReportPaginationRule.forBankToCustomerAccountReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrReportPaginationRule.forBankToCustomerAccountReportV04;
			owner_lazy = () -> BankToCustomerAccountReportV05.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Report[*]/ReportPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(BankToCustomerAccountReportV05 obj) throws Exception {
			checkBankToCustomerAccountReportV05(obj);
		}
	};

	/**
	 * MessagePagination may be present or ReportPagination may be present, but
	 * not both.
	 */
	public static void checkBankToCustomerAccountReportV07(BankToCustomerAccountReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MessagePagination may be present or ReportPagination may be present, but
	 * not both.
	 */
	public static void checkBankToCustomerAccountReportV06(BankToCustomerAccountReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MessagePagination may be present or ReportPagination may be present, but
	 * not both.
	 */
	public static void checkBankToCustomerAccountReportV03(BankToCustomerAccountReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MessagePagination may be present or ReportPagination may be present, but
	 * not both.
	 */
	public static void checkBankToCustomerAccountReportV04(BankToCustomerAccountReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MessagePagination may be present or ReportPagination may be present, but
	 * not both.
	 */
	public static void checkBankToCustomerAccountReportV05(BankToCustomerAccountReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}