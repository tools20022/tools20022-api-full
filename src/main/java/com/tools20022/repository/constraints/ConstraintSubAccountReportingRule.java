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
import java.util.Arrays;

/**
 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present.
 */
public class ConstraintSubAccountReportingRule {

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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV03> forSecuritiesBalanceAccountingReportV03 = new MMConstraint<SecuritiesBalanceAccountingReportV03>() {
		{
			validator = ConstraintSubAccountReportingRule::checkSecuritiesBalanceAccountingReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV03.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV04> forSecuritiesBalanceAccountingReportV04 = new MMConstraint<SecuritiesBalanceAccountingReportV04>() {
		{
			validator = ConstraintSubAccountReportingRule::checkSecuritiesBalanceAccountingReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV05> forSecuritiesBalanceAccountingReportV05 = new MMConstraint<SecuritiesBalanceAccountingReportV05>() {
		{
			validator = ConstraintSubAccountReportingRule::checkSecuritiesBalanceAccountingReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV06> forSecuritiesBalanceAccountingReportV06 = new MMConstraint<SecuritiesBalanceAccountingReportV06>() {
		{
			validator = ConstraintSubAccountReportingRule::checkSecuritiesBalanceAccountingReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV03> forSecuritiesBalanceCustodyReportV03 = new MMConstraint<SecuritiesBalanceCustodyReportV03>() {
		{
			validator = ConstraintSubAccountReportingRule::checkSecuritiesBalanceCustodyReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV03.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV04> forSecuritiesBalanceCustodyReportV04 = new MMConstraint<SecuritiesBalanceCustodyReportV04>() {
		{
			validator = ConstraintSubAccountReportingRule::checkSecuritiesBalanceCustodyReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV05> forSecuritiesBalanceCustodyReportV05 = new MMConstraint<SecuritiesBalanceCustodyReportV05>() {
		{
			validator = ConstraintSubAccountReportingRule::checkSecuritiesBalanceCustodyReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV06> forSecuritiesBalanceCustodyReportV06 = new MMConstraint<SecuritiesBalanceCustodyReportV06>() {
		{
			validator = ConstraintSubAccountReportingRule::checkSecuritiesBalanceCustodyReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01
	 * SecuritiesTransactionPostingReportV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FinancialInstrumentDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV01> forSecuritiesTransactionPostingReportV01 = new MMConstraint<SecuritiesTransactionPostingReportV01>() {
		{
			validator = ConstraintSubAccountReportingRule::checkSecuritiesTransactionPostingReportV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present.";
			owner_lazy = () -> SecuritiesTransactionPostingReportV01.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/FinancialInstrumentDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV02
	 * SecuritiesTransactionPostingReportV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FinancialInstrumentDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV02> forSecuritiesTransactionPostingReportV02 = new MMConstraint<SecuritiesTransactionPostingReportV02>() {
		{
			validator = ConstraintSubAccountReportingRule::checkSecuritiesTransactionPostingReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present.";
			owner_lazy = () -> SecuritiesTransactionPostingReportV02.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/FinancialInstrumentDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV03
	 * SecuritiesTransactionPostingReportV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FinancialInstrumentDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV03> forSecuritiesTransactionPostingReportV03 = new MMConstraint<SecuritiesTransactionPostingReportV03>() {
		{
			validator = ConstraintSubAccountReportingRule::checkSecuritiesTransactionPostingReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present.";
			owner_lazy = () -> SecuritiesTransactionPostingReportV03.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/FinancialInstrumentDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV04
	 * SecuritiesTransactionPostingReportV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FinancialInstrumentDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubAccountDetailsFinancialInstrumentPresenceRule#forSecuritiesTransactionPostingReportV05
	 * ConstraintSubAccountDetailsFinancialInstrumentPresenceRule.
	 * forSecuritiesTransactionPostingReportV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV04> forSecuritiesTransactionPostingReportV04 = new MMConstraint<SecuritiesTransactionPostingReportV04>() {
		{
			validator = ConstraintSubAccountReportingRule::checkSecuritiesTransactionPostingReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubAccountDetailsFinancialInstrumentPresenceRule.forSecuritiesTransactionPostingReportV05);
			owner_lazy = () -> SecuritiesTransactionPostingReportV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/FinancialInstrumentDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be
	 * present.
	 */
	public static void checkSecuritiesBalanceAccountingReportV03(SecuritiesBalanceAccountingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be
	 * present.
	 */
	public static void checkSecuritiesBalanceAccountingReportV04(SecuritiesBalanceAccountingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be
	 * present.
	 */
	public static void checkSecuritiesBalanceAccountingReportV05(SecuritiesBalanceAccountingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be
	 * present.
	 */
	public static void checkSecuritiesBalanceAccountingReportV06(SecuritiesBalanceAccountingReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be
	 * present.
	 */
	public static void checkSecuritiesBalanceCustodyReportV03(SecuritiesBalanceCustodyReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be
	 * present.
	 */
	public static void checkSecuritiesBalanceCustodyReportV04(SecuritiesBalanceCustodyReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be
	 * present.
	 */
	public static void checkSecuritiesBalanceCustodyReportV05(SecuritiesBalanceCustodyReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be
	 * present.
	 */
	public static void checkSecuritiesBalanceCustodyReportV06(SecuritiesBalanceCustodyReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be
	 * present.
	 */
	public static void checkSecuritiesTransactionPostingReportV01(SecuritiesTransactionPostingReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be
	 * present.
	 */
	public static void checkSecuritiesTransactionPostingReportV02(SecuritiesTransactionPostingReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be
	 * present.
	 */
	public static void checkSecuritiesTransactionPostingReportV03(SecuritiesTransactionPostingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be
	 * present.
	 */
	public static void checkSecuritiesTransactionPostingReportV04(SecuritiesTransactionPostingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}