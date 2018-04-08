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
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * The following combinations are allowed: only Search Criteria, or only Return
 * Criteria, or only a Statement Report, or a combination of Search and Return
 * criteria, or a combination of Search criteria and a Statement Report.<br>
 * Rule rationale: <br>
 * - If ReturnCriteria are present, they define the expected report.<br>
 * - If StatementReport is present, it indicates that a statement-type report
 * needs to be returned. In this case, the return message will contain
 * information equivalent to that present in field 61 (Statement Line) of FIN
 * standards, eg, value date, entry date, debit/credit indicator, amount,
 * transaction type identification code, reference for the account owner,
 * reference of the account servicing institution and supplementary details.<br>
 * - If the StatementReportIndicator equals "false" or "0" (No), this means that
 * the report type is pre-defined between the transaction administrator and the
 * member.
 */
public class ConstraintSearchAndReturnCriteriaAndStatementReportRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria7
	 * TransactionCriteria7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SearchCriteria[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatementReport&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnCriteria&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchAndReturnCriteriaAndStatementReportRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The following combinations are allowed: only Search Criteria, or only Return Criteria, or only a Statement Report, or a combination of Search and Return criteria, or a combination of Search criteria and a Statement Report.\r\nRule rationale: \r\n- If ReturnCriteria are present, they define the expected report.\r\n- If StatementReport is present, it indicates that a statement-type report needs to be returned. In this case, the return message will contain information equivalent to that present in field 61 (Statement Line) of FIN standards, eg, value date, entry date, debit/credit indicator, amount, transaction type identification code, reference for the account owner, reference of the account servicing institution and supplementary details.\r\n- If the StatementReportIndicator equals \"false\" or \"0\" (No), this means that the report type is pre-defined between the transaction administrator and the member."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule#forTransactionCriteria6
	 * ConstraintSearchAndReturnCriteriaAndStatementReportRule.
	 * forTransactionCriteria6}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionCriteria7> forTransactionCriteria7 = new MMConstraint<TransactionCriteria7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchAndReturnCriteriaAndStatementReportRule";
			definition = "The following combinations are allowed: only Search Criteria, or only Return Criteria, or only a Statement Report, or a combination of Search and Return criteria, or a combination of Search criteria and a Statement Report.\r\nRule rationale: \r\n- If ReturnCriteria are present, they define the expected report.\r\n- If StatementReport is present, it indicates that a statement-type report needs to be returned. In this case, the return message will contain information equivalent to that present in field 61 (Statement Line) of FIN standards, eg, value date, entry date, debit/credit indicator, amount, transaction type identification code, reference for the account owner, reference of the account servicing institution and supplementary details.\r\n- If the StatementReportIndicator equals \"false\" or \"0\" (No), this means that the report type is pre-defined between the transaction administrator and the member.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule.forTransactionCriteria6;
			owner_lazy = () -> TransactionCriteria7.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatementReport</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(TransactionCriteria7 obj) throws Exception {
			checkTransactionCriteria7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria5
	 * TransactionCriteria5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SearchCriteria[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatementReport&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnCriteria&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchAndReturnCriteriaAndStatementReportRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The following combinations are allowed: only Search Criteria, or only Return Criteria, or only a Statement Report, or a combination of Search and Return criteria, or a combination of Search criteria and a Statement Report.\r\nRule rationale: \r\n- If ReturnCriteria are present, they define the expected report.\r\n- If StatementReport is present, it indicates that a statement-type report needs to be returned. In this case, the return message will contain information equivalent to that present in field 61 (Statement Line) of FIN standards, eg, value date, entry date, debit/credit indicator, amount, transaction type identification code, reference for the account owner, reference of the account servicing institution and supplementary details.\r\n- If the StatementReportIndicator equals \"false\" or \"0\" (No), this means that the report type is pre-defined between the transaction administrator and the member."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule#forTransactionCriteria6
	 * ConstraintSearchAndReturnCriteriaAndStatementReportRule.
	 * forTransactionCriteria6}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule#forTransactionCriteria4
	 * ConstraintSearchAndReturnCriteriaAndStatementReportRule.
	 * forTransactionCriteria4}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionCriteria5> forTransactionCriteria5 = new MMConstraint<TransactionCriteria5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchAndReturnCriteriaAndStatementReportRule";
			definition = "The following combinations are allowed: only Search Criteria, or only Return Criteria, or only a Statement Report, or a combination of Search and Return criteria, or a combination of Search criteria and a Statement Report.\r\nRule rationale: \r\n- If ReturnCriteria are present, they define the expected report.\r\n- If StatementReport is present, it indicates that a statement-type report needs to be returned. In this case, the return message will contain information equivalent to that present in field 61 (Statement Line) of FIN standards, eg, value date, entry date, debit/credit indicator, amount, transaction type identification code, reference for the account owner, reference of the account servicing institution and supplementary details.\r\n- If the StatementReportIndicator equals \"false\" or \"0\" (No), this means that the report type is pre-defined between the transaction administrator and the member.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule.forTransactionCriteria6);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule.forTransactionCriteria4;
			owner_lazy = () -> TransactionCriteria5.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatementReport</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(TransactionCriteria5 obj) throws Exception {
			checkTransactionCriteria5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria4
	 * TransactionCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SearchCriteria[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatementReport&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnCriteria&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchAndReturnCriteriaAndStatementReportRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The following combinations are allowed: only Search Criteria, or only Return Criteria, or only a Statement Report, or a combination of Search and Return criteria, or a combination of Search criteria and a Statement Report.\r\nRule rationale: \r\n- If ReturnCriteria are present, they define the expected report.\r\n- If StatementReport is present, it indicates that a statement-type report needs to be returned. In this case, the return message will contain information equivalent to that present in field 61 (Statement Line) of FIN standards, eg, value date, entry date, debit/credit indicator, amount, transaction type identification code, reference for the account owner, reference of the account servicing institution and supplementary details.\r\n- If the StatementReportIndicator equals \"false\" or \"0\" (No), this means that the report type is pre-defined between the transaction administrator and the member."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule#forTransactionCriteria5
	 * ConstraintSearchAndReturnCriteriaAndStatementReportRule.
	 * forTransactionCriteria5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionCriteria4> forTransactionCriteria4 = new MMConstraint<TransactionCriteria4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchAndReturnCriteriaAndStatementReportRule";
			definition = "The following combinations are allowed: only Search Criteria, or only Return Criteria, or only a Statement Report, or a combination of Search and Return criteria, or a combination of Search criteria and a Statement Report.\r\nRule rationale: \r\n- If ReturnCriteria are present, they define the expected report.\r\n- If StatementReport is present, it indicates that a statement-type report needs to be returned. In this case, the return message will contain information equivalent to that present in field 61 (Statement Line) of FIN standards, eg, value date, entry date, debit/credit indicator, amount, transaction type identification code, reference for the account owner, reference of the account servicing institution and supplementary details.\r\n- If the StatementReportIndicator equals \"false\" or \"0\" (No), this means that the report type is pre-defined between the transaction administrator and the member.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule.forTransactionCriteria5);
			owner_lazy = () -> TransactionCriteria4.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatementReport</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(TransactionCriteria4 obj) throws Exception {
			checkTransactionCriteria4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria6
	 * TransactionCriteria6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SearchCriteria[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatementReport&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnCriteria&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchAndReturnCriteriaAndStatementReportRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The following combinations are allowed: only Search Criteria, or only Return Criteria, or only a Statement Report, or a combination of Search and Return criteria, or a combination of Search criteria and a Statement Report.\r\nRule rationale: \r\n- If ReturnCriteria are present, they define the expected report.\r\n- If StatementReport is present, it indicates that a statement-type report needs to be returned. In this case, the return message will contain information equivalent to that present in field 61 (Statement Line) of FIN standards, eg, value date, entry date, debit/credit indicator, amount, transaction type identification code, reference for the account owner, reference of the account servicing institution and supplementary details.\r\n- If the StatementReportIndicator equals \"false\" or \"0\" (No), this means that the report type is pre-defined between the transaction administrator and the member."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule#forTransactionCriteria7
	 * ConstraintSearchAndReturnCriteriaAndStatementReportRule.
	 * forTransactionCriteria7}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule#forTransactionCriteria5
	 * ConstraintSearchAndReturnCriteriaAndStatementReportRule.
	 * forTransactionCriteria5}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionCriteria6> forTransactionCriteria6 = new MMConstraint<TransactionCriteria6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchAndReturnCriteriaAndStatementReportRule";
			definition = "The following combinations are allowed: only Search Criteria, or only Return Criteria, or only a Statement Report, or a combination of Search and Return criteria, or a combination of Search criteria and a Statement Report.\r\nRule rationale: \r\n- If ReturnCriteria are present, they define the expected report.\r\n- If StatementReport is present, it indicates that a statement-type report needs to be returned. In this case, the return message will contain information equivalent to that present in field 61 (Statement Line) of FIN standards, eg, value date, entry date, debit/credit indicator, amount, transaction type identification code, reference for the account owner, reference of the account servicing institution and supplementary details.\r\n- If the StatementReportIndicator equals \"false\" or \"0\" (No), this means that the report type is pre-defined between the transaction administrator and the member.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule.forTransactionCriteria7);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule.forTransactionCriteria5;
			owner_lazy = () -> TransactionCriteria6.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatementReport</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(TransactionCriteria6 obj) throws Exception {
			checkTransactionCriteria6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria2
	 * TransactionCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchAndReturnCriteriaAndStatementReportRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The following combinations are allowed: only Search Criteria, or only Return Criteria, or only a Statement Report, or a combination of Search and Return criteria, or\na combination of Search criteria and a Statement Report.\nRule rationale: \n- If ReturnCriteria are present, they define the expected report.\n- If StatementReport is present, it indicates that a statement-type report needs to be returned. In this case, the return message will contain information equivalent to that present in field 61 (Statement Line) of FIN standards, eg, value date, entry date, debit/credit indicator, amount, transaction type identification code, reference for the account owner, reference of the account servicing institution and supplementary details.\n- If the StatementReportIndicator equals \"false\" or \"0\" (No), this means that the report type is pre-defined between the transaction administrator and the member."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionCriteria2> forTransactionCriteria2 = new MMConstraint<TransactionCriteria2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchAndReturnCriteriaAndStatementReportRule";
			definition = "The following combinations are allowed: only Search Criteria, or only Return Criteria, or only a Statement Report, or a combination of Search and Return criteria, or\na combination of Search criteria and a Statement Report.\nRule rationale: \n- If ReturnCriteria are present, they define the expected report.\n- If StatementReport is present, it indicates that a statement-type report needs to be returned. In this case, the return message will contain information equivalent to that present in field 61 (Statement Line) of FIN standards, eg, value date, entry date, debit/credit indicator, amount, transaction type identification code, reference for the account owner, reference of the account servicing institution and supplementary details.\n- If the StatementReportIndicator equals \"false\" or \"0\" (No), this means that the report type is pre-defined between the transaction administrator and the member.";
			owner_lazy = () -> TransactionCriteria2.mmObject();
		}

		@Override
		public void executeValidator(TransactionCriteria2 obj) throws Exception {
			checkTransactionCriteria2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria3
	 * TransactionCriteria3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchAndReturnCriteriaAndStatementReportRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The following combinations are allowed: only Search Criteria, or only Return Criteria, or only a Statement Report, or a combination of Search and Return criteria, or\na combination of Search criteria and a Statement Report.\nRule rationale: \n- If ReturnCriteria are present, they define the expected report.\n- If StatementReport is present, it indicates that a statement-type report needs to be returned. In this case, the return message will contain information equivalent to that present in field 61 (Statement Line) of FIN standards, eg, value date, entry date, debit/credit indicator, amount, transaction type identification code, reference for the account owner, reference of the account servicing institution and supplementary details.\n- If the StatementReportIndicator equals \"false\" or \"0\" (No), this means that the report type is pre-defined between the transaction administrator and the member."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionCriteria3> forTransactionCriteria3 = new MMConstraint<TransactionCriteria3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchAndReturnCriteriaAndStatementReportRule";
			definition = "The following combinations are allowed: only Search Criteria, or only Return Criteria, or only a Statement Report, or a combination of Search and Return criteria, or\na combination of Search criteria and a Statement Report.\nRule rationale: \n- If ReturnCriteria are present, they define the expected report.\n- If StatementReport is present, it indicates that a statement-type report needs to be returned. In this case, the return message will contain information equivalent to that present in field 61 (Statement Line) of FIN standards, eg, value date, entry date, debit/credit indicator, amount, transaction type identification code, reference for the account owner, reference of the account servicing institution and supplementary details.\n- If the StatementReportIndicator equals \"false\" or \"0\" (No), this means that the report type is pre-defined between the transaction administrator and the member.";
			owner_lazy = () -> TransactionCriteria3.mmObject();
		}

		@Override
		public void executeValidator(TransactionCriteria3 obj) throws Exception {
			checkTransactionCriteria3(obj);
		}
	};

	/**
	 * The following combinations are allowed: only Search Criteria, or only
	 * Return Criteria, or only a Statement Report, or a combination of Search
	 * and Return criteria, or a combination of Search criteria and a Statement
	 * Report.<br>
	 * Rule rationale: <br>
	 * - If ReturnCriteria are present, they define the expected report.<br>
	 * - If StatementReport is present, it indicates that a statement-type
	 * report needs to be returned. In this case, the return message will
	 * contain information equivalent to that present in field 61 (Statement
	 * Line) of FIN standards, eg, value date, entry date, debit/credit
	 * indicator, amount, transaction type identification code, reference for
	 * the account owner, reference of the account servicing institution and
	 * supplementary details.<br>
	 * - If the StatementReportIndicator equals "false" or "0" (No), this means
	 * that the report type is pre-defined between the transaction administrator
	 * and the member.
	 */
	public static void checkTransactionCriteria7(TransactionCriteria7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The following combinations are allowed: only Search Criteria, or only
	 * Return Criteria, or only a Statement Report, or a combination of Search
	 * and Return criteria, or a combination of Search criteria and a Statement
	 * Report.<br>
	 * Rule rationale: <br>
	 * - If ReturnCriteria are present, they define the expected report.<br>
	 * - If StatementReport is present, it indicates that a statement-type
	 * report needs to be returned. In this case, the return message will
	 * contain information equivalent to that present in field 61 (Statement
	 * Line) of FIN standards, eg, value date, entry date, debit/credit
	 * indicator, amount, transaction type identification code, reference for
	 * the account owner, reference of the account servicing institution and
	 * supplementary details.<br>
	 * - If the StatementReportIndicator equals "false" or "0" (No), this means
	 * that the report type is pre-defined between the transaction administrator
	 * and the member.
	 */
	public static void checkTransactionCriteria5(TransactionCriteria5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The following combinations are allowed: only Search Criteria, or only
	 * Return Criteria, or only a Statement Report, or a combination of Search
	 * and Return criteria, or a combination of Search criteria and a Statement
	 * Report.<br>
	 * Rule rationale: <br>
	 * - If ReturnCriteria are present, they define the expected report.<br>
	 * - If StatementReport is present, it indicates that a statement-type
	 * report needs to be returned. In this case, the return message will
	 * contain information equivalent to that present in field 61 (Statement
	 * Line) of FIN standards, eg, value date, entry date, debit/credit
	 * indicator, amount, transaction type identification code, reference for
	 * the account owner, reference of the account servicing institution and
	 * supplementary details.<br>
	 * - If the StatementReportIndicator equals "false" or "0" (No), this means
	 * that the report type is pre-defined between the transaction administrator
	 * and the member.
	 */
	public static void checkTransactionCriteria4(TransactionCriteria4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The following combinations are allowed: only Search Criteria, or only
	 * Return Criteria, or only a Statement Report, or a combination of Search
	 * and Return criteria, or a combination of Search criteria and a Statement
	 * Report.<br>
	 * Rule rationale: <br>
	 * - If ReturnCriteria are present, they define the expected report.<br>
	 * - If StatementReport is present, it indicates that a statement-type
	 * report needs to be returned. In this case, the return message will
	 * contain information equivalent to that present in field 61 (Statement
	 * Line) of FIN standards, eg, value date, entry date, debit/credit
	 * indicator, amount, transaction type identification code, reference for
	 * the account owner, reference of the account servicing institution and
	 * supplementary details.<br>
	 * - If the StatementReportIndicator equals "false" or "0" (No), this means
	 * that the report type is pre-defined between the transaction administrator
	 * and the member.
	 */
	public static void checkTransactionCriteria6(TransactionCriteria6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The following combinations are allowed: only Search Criteria, or only
	 * Return Criteria, or only a Statement Report, or a combination of Search
	 * and Return criteria, or a combination of Search criteria and a Statement
	 * Report. Rule rationale: - If ReturnCriteria are present, they define the
	 * expected report. - If StatementReport is present, it indicates that a
	 * statement-type report needs to be returned. In this case, the return
	 * message will contain information equivalent to that present in field 61
	 * (Statement Line) of FIN standards, eg, value date, entry date,
	 * debit/credit indicator, amount, transaction type identification code,
	 * reference for the account owner, reference of the account servicing
	 * institution and supplementary details. - If the StatementReportIndicator
	 * equals "false" or "0" (No), this means that the report type is
	 * pre-defined between the transaction administrator and the member.
	 */
	public static void checkTransactionCriteria2(TransactionCriteria2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The following combinations are allowed: only Search Criteria, or only
	 * Return Criteria, or only a Statement Report, or a combination of Search
	 * and Return criteria, or a combination of Search criteria and a Statement
	 * Report. Rule rationale: - If ReturnCriteria are present, they define the
	 * expected report. - If StatementReport is present, it indicates that a
	 * statement-type report needs to be returned. In this case, the return
	 * message will contain information equivalent to that present in field 61
	 * (Statement Line) of FIN standards, eg, value date, entry date,
	 * debit/credit indicator, amount, transaction type identification code,
	 * reference for the account owner, reference of the account servicing
	 * institution and supplementary details. - If the StatementReportIndicator
	 * equals "false" or "0" (No), this means that the report type is
	 * pre-defined between the transaction administrator and the member.
	 */
	public static void checkTransactionCriteria3(TransactionCriteria3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}