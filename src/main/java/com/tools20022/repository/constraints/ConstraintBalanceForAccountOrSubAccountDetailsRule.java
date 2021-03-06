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
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.msg.AccountingStatementOfHoldings1;
import com.tools20022.repository.msg.AccountingStatementOfHoldings2;
import com.tools20022.repository.msg.CustodyStatementOfHoldings1;
import com.tools20022.repository.msg.CustodyStatementOfHoldings2;
import java.util.Arrays;

/**
 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
 * either BalanceForAccount or SubAccountDetails is mandatory. If
 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
 * BalanceForAccount and SubAccountDetails may be present.
 */
public class ConstraintBalanceForAccountOrSubAccountDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2
	 * CustodyStatementOfHoldings2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CustodyStatementOfHoldings2> forCustodyStatementOfHoldings2 = new MMConstraint<CustodyStatementOfHoldings2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present.";
			owner_lazy = () -> CustodyStatementOfHoldings2.mmObject();
		}

		@Override
		public void executeValidator(CustodyStatementOfHoldings2 obj) throws Exception {
			checkCustodyStatementOfHoldings2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1
	 * CustodyStatementOfHoldings1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails are not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CustodyStatementOfHoldings1> forCustodyStatementOfHoldings1 = new MMConstraint<CustodyStatementOfHoldings1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails are not allowed.";
			owner_lazy = () -> CustodyStatementOfHoldings1.mmObject();
		}

		@Override
		public void executeValidator(CustodyStatementOfHoldings1 obj) throws Exception {
			checkCustodyStatementOfHoldings1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03
	 * SecuritiesBalanceAccountingReportV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV03> for_semt_SecuritiesBalanceAccountingReportV03 = new MMConstraint<SecuritiesBalanceAccountingReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV03.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV03 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV06
	 * SecuritiesBalanceCustodyReportV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#for_semt_SecuritiesBalanceCustodyReportV07
	 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
	 * for_semt_SecuritiesBalanceCustodyReportV07}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV06> for_semt_SecuritiesBalanceCustodyReportV06 = new MMConstraint<SecuritiesBalanceCustodyReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.for_semt_SecuritiesBalanceCustodyReportV07);
			owner_lazy = () -> SecuritiesBalanceCustodyReportV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV06 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings2
	 * AccountingStatementOfHoldings2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountingStatementOfHoldings2> forAccountingStatementOfHoldings2 = new MMConstraint<AccountingStatementOfHoldings2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present.";
			owner_lazy = () -> AccountingStatementOfHoldings2.mmObject();
		}

		@Override
		public void executeValidator(AccountingStatementOfHoldings2 obj) throws Exception {
			checkAccountingStatementOfHoldings2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReport002V09
	 * SecuritiesBalanceCustodyReport002V09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReport002V09> for_semt_SecuritiesBalanceCustodyReport002V09 = new MMConstraint<SecuritiesBalanceCustodyReport002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			owner_lazy = () -> SecuritiesBalanceCustodyReport002V09.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReport002V09 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReport002V09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV04
	 * SecuritiesBalanceCustodyReportV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV04> for_semt_SecuritiesBalanceCustodyReportV04 = new MMConstraint<SecuritiesBalanceCustodyReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV04 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings
	 * CustodyStatementOfHoldings}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails are not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CustodyStatementOfHoldings> for_semt_CustodyStatementOfHoldings = new MMConstraint<CustodyStatementOfHoldings>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails are not allowed.";
			owner_lazy = () -> CustodyStatementOfHoldings.mmObject();
		}

		@Override
		public void executeValidator(CustodyStatementOfHoldings obj) throws Exception {
			check_semt_CustodyStatementOfHoldings(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05
	 * SecuritiesBalanceCustodyReportV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV05> for_semt_SecuritiesBalanceCustodyReportV05 = new MMConstraint<SecuritiesBalanceCustodyReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV05 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03
	 * SecuritiesBalanceCustodyReportV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV03> for_semt_SecuritiesBalanceCustodyReportV03 = new MMConstraint<SecuritiesBalanceCustodyReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV03.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV03 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09
	 * SecuritiesBalanceCustodyReportV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#for_semt_SecuritiesBalanceCustodyReportV08
	 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
	 * for_semt_SecuritiesBalanceCustodyReportV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV09> for_semt_SecuritiesBalanceCustodyReportV09 = new MMConstraint<SecuritiesBalanceCustodyReportV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.for_semt_SecuritiesBalanceCustodyReportV08;
			owner_lazy = () -> SecuritiesBalanceCustodyReportV09.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV09 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08
	 * SecuritiesBalanceAccountingReportV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#for_semt_SecuritiesBalanceAccountingReportV09
	 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
	 * for_semt_SecuritiesBalanceAccountingReportV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#for_semt_SecuritiesBalanceAccountingReportV07
	 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
	 * for_semt_SecuritiesBalanceAccountingReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV08> for_semt_SecuritiesBalanceAccountingReportV08 = new MMConstraint<SecuritiesBalanceAccountingReportV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.for_semt_SecuritiesBalanceAccountingReportV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.for_semt_SecuritiesBalanceAccountingReportV07;
			owner_lazy = () -> SecuritiesBalanceAccountingReportV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV08 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV07
	 * SecuritiesBalanceCustodyReportV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#for_semt_SecuritiesBalanceCustodyReportV08
	 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
	 * for_semt_SecuritiesBalanceCustodyReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#for_semt_SecuritiesBalanceCustodyReportV06
	 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
	 * for_semt_SecuritiesBalanceCustodyReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV07> for_semt_SecuritiesBalanceCustodyReportV07 = new MMConstraint<SecuritiesBalanceCustodyReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.for_semt_SecuritiesBalanceCustodyReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.for_semt_SecuritiesBalanceCustodyReportV06;
			owner_lazy = () -> SecuritiesBalanceCustodyReportV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV07 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV08
	 * SecuritiesBalanceCustodyReportV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#for_semt_SecuritiesBalanceCustodyReportV09
	 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
	 * for_semt_SecuritiesBalanceCustodyReportV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#for_semt_SecuritiesBalanceCustodyReportV07
	 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
	 * for_semt_SecuritiesBalanceCustodyReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV08> for_semt_SecuritiesBalanceCustodyReportV08 = new MMConstraint<SecuritiesBalanceCustodyReportV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.for_semt_SecuritiesBalanceCustodyReportV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.for_semt_SecuritiesBalanceCustodyReportV07;
			owner_lazy = () -> SecuritiesBalanceCustodyReportV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV08 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02
	 * AccountingStatementOfHoldingsV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountingStatementOfHoldingsV02> for_semt_AccountingStatementOfHoldingsV02 = new MMConstraint<AccountingStatementOfHoldingsV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present.";
			owner_lazy = () -> AccountingStatementOfHoldingsV02.mmObject();
		}

		@Override
		public void executeValidator(AccountingStatementOfHoldingsV02 obj) throws Exception {
			check_semt_AccountingStatementOfHoldingsV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05
	 * SecuritiesBalanceAccountingReportV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV05> for_semt_SecuritiesBalanceAccountingReportV05 = new MMConstraint<SecuritiesBalanceAccountingReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV05 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02
	 * CustodyStatementOfHoldingsV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CustodyStatementOfHoldingsV02> for_semt_CustodyStatementOfHoldingsV02 = new MMConstraint<CustodyStatementOfHoldingsV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present.";
			owner_lazy = () -> CustodyStatementOfHoldingsV02.mmObject();
		}

		@Override
		public void executeValidator(CustodyStatementOfHoldingsV02 obj) throws Exception {
			check_semt_CustodyStatementOfHoldingsV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07
	 * SecuritiesBalanceAccountingReportV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#for_semt_SecuritiesBalanceAccountingReportV08
	 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
	 * for_semt_SecuritiesBalanceAccountingReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#for_semt_SecuritiesBalanceAccountingReportV06
	 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
	 * for_semt_SecuritiesBalanceAccountingReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV07> for_semt_SecuritiesBalanceAccountingReportV07 = new MMConstraint<SecuritiesBalanceAccountingReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.for_semt_SecuritiesBalanceAccountingReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.for_semt_SecuritiesBalanceAccountingReportV06;
			owner_lazy = () -> SecuritiesBalanceAccountingReportV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV07 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReport002V09
	 * SecuritiesBalanceAccountingReport002V09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReport002V09> for_semt_SecuritiesBalanceAccountingReport002V09 = new MMConstraint<SecuritiesBalanceAccountingReport002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			owner_lazy = () -> SecuritiesBalanceAccountingReport002V09.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReport002V09 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReport002V09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings1
	 * AccountingStatementOfHoldings1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails are not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountingStatementOfHoldings1> forAccountingStatementOfHoldings1 = new MMConstraint<AccountingStatementOfHoldings1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails are not allowed.";
			owner_lazy = () -> AccountingStatementOfHoldings1.mmObject();
		}

		@Override
		public void executeValidator(AccountingStatementOfHoldings1 obj) throws Exception {
			checkAccountingStatementOfHoldings1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04
	 * SecuritiesBalanceAccountingReportV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV04> for_semt_SecuritiesBalanceAccountingReportV04 = new MMConstraint<SecuritiesBalanceAccountingReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV04 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06
	 * SecuritiesBalanceAccountingReportV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#for_semt_SecuritiesBalanceAccountingReportV07
	 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
	 * for_semt_SecuritiesBalanceAccountingReportV07}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV06> for_semt_SecuritiesBalanceAccountingReportV06 = new MMConstraint<SecuritiesBalanceAccountingReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.for_semt_SecuritiesBalanceAccountingReportV07);
			owner_lazy = () -> SecuritiesBalanceAccountingReportV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV06 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldings
	 * AccountingStatementOfHoldings}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails are not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountingStatementOfHoldings> for_semt_AccountingStatementOfHoldings = new MMConstraint<AccountingStatementOfHoldings>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails are not allowed.";
			owner_lazy = () -> AccountingStatementOfHoldings.mmObject();
		}

		@Override
		public void executeValidator(AccountingStatementOfHoldings obj) throws Exception {
			check_semt_AccountingStatementOfHoldings(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09
	 * SecuritiesBalanceAccountingReportV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#for_semt_SecuritiesBalanceAccountingReportV08
	 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
	 * for_semt_SecuritiesBalanceAccountingReportV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV09> for_semt_SecuritiesBalanceAccountingReportV09 = new MMConstraint<SecuritiesBalanceAccountingReportV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.for_semt_SecuritiesBalanceAccountingReportV08;
			owner_lazy = () -> SecuritiesBalanceAccountingReportV09.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV09 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV09(obj);
		}
	};

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either BalanceForAccount or SubAccountDetails is mandatory. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * BalanceForAccount and SubAccountDetails may be present.
	 */
	public static void checkCustodyStatementOfHoldings2(CustodyStatementOfHoldings2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either BalanceForAccount or SubAccountDetails is mandatory. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * BalanceForAccount and SubAccountDetails are not allowed.
	 */
	public static void checkCustodyStatementOfHoldings1(CustodyStatementOfHoldings1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV03(SecuritiesBalanceAccountingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV06(SecuritiesBalanceCustodyReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either BalanceForAccount or SubAccountDetails is mandatory. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * BalanceForAccount and SubAccountDetails may be present.
	 */
	public static void checkAccountingStatementOfHoldings2(AccountingStatementOfHoldings2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReport002V09(SecuritiesBalanceCustodyReport002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV04(SecuritiesBalanceCustodyReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either BalanceForAccount or SubAccountDetails is mandatory. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * BalanceForAccount and SubAccountDetails are not allowed.
	 */
	public static void check_semt_CustodyStatementOfHoldings(CustodyStatementOfHoldings obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV05(SecuritiesBalanceCustodyReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV03(SecuritiesBalanceCustodyReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV09(SecuritiesBalanceCustodyReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV08(SecuritiesBalanceAccountingReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV07(SecuritiesBalanceCustodyReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV08(SecuritiesBalanceCustodyReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either BalanceForAccount or SubAccountDetails is mandatory. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * BalanceForAccount and SubAccountDetails may be present.
	 */
	public static void check_semt_AccountingStatementOfHoldingsV02(AccountingStatementOfHoldingsV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV05(SecuritiesBalanceAccountingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either BalanceForAccount or SubAccountDetails is mandatory. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * BalanceForAccount and SubAccountDetails may be present.
	 */
	public static void check_semt_CustodyStatementOfHoldingsV02(CustodyStatementOfHoldingsV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV07(SecuritiesBalanceAccountingReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReport002V09(SecuritiesBalanceAccountingReport002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either BalanceForAccount or SubAccountDetails is mandatory. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * BalanceForAccount and SubAccountDetails are not allowed.
	 */
	public static void checkAccountingStatementOfHoldings1(AccountingStatementOfHoldings1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV04(SecuritiesBalanceAccountingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV06(SecuritiesBalanceAccountingReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either BalanceForAccount or SubAccountDetails is mandatory. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * BalanceForAccount and SubAccountDetails are not allowed.
	 */
	public static void check_semt_AccountingStatementOfHoldings(AccountingStatementOfHoldings obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV09(SecuritiesBalanceAccountingReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}