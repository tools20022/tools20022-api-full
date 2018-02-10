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
 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and
 * Sub Account Details must be absent.
 */
public class ConstraintBalanceForAccountReportingRule {

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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule#forSecuritiesBalanceCustodyReportV08
	 * ConstraintBalanceForAccountReportingRule.
	 * forSecuritiesBalanceCustodyReportV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV09> forSecuritiesBalanceCustodyReportV09 = new MMConstraint<SecuritiesBalanceCustodyReportV09>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceCustodyReportV09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule.forSecuritiesBalanceCustodyReportV08;
			owner_lazy = () -> SecuritiesBalanceCustodyReportV09.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule#forSecuritiesBalanceAccountingReportV08
	 * ConstraintBalanceForAccountReportingRule.
	 * forSecuritiesBalanceAccountingReportV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV09> forSecuritiesBalanceAccountingReportV09 = new MMConstraint<SecuritiesBalanceAccountingReportV09>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceAccountingReportV09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule.forSecuritiesBalanceAccountingReportV08;
			owner_lazy = () -> SecuritiesBalanceAccountingReportV09.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReport002V09> forSecuritiesBalanceAccountingReport002V09 = new MMConstraint<SecuritiesBalanceAccountingReport002V09>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceAccountingReport002V09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent.";
			owner_lazy = () -> SecuritiesBalanceAccountingReport002V09.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReport002V09> forSecuritiesBalanceCustodyReport002V09 = new MMConstraint<SecuritiesBalanceCustodyReport002V09>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceCustodyReport002V09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent.";
			owner_lazy = () -> SecuritiesBalanceCustodyReport002V09.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule#forSecuritiesBalanceCustodyReportV09
	 * ConstraintBalanceForAccountReportingRule.
	 * forSecuritiesBalanceCustodyReportV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule#forSecuritiesBalanceCustodyReportV07
	 * ConstraintBalanceForAccountReportingRule.
	 * forSecuritiesBalanceCustodyReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV08> forSecuritiesBalanceCustodyReportV08 = new MMConstraint<SecuritiesBalanceCustodyReportV08>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceCustodyReportV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule.forSecuritiesBalanceCustodyReportV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule.forSecuritiesBalanceCustodyReportV07;
			owner_lazy = () -> SecuritiesBalanceCustodyReportV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule#forSecuritiesBalanceAccountingReportV09
	 * ConstraintBalanceForAccountReportingRule.
	 * forSecuritiesBalanceAccountingReportV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule#forSecuritiesBalanceAccountingReportV07
	 * ConstraintBalanceForAccountReportingRule.
	 * forSecuritiesBalanceAccountingReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV08> forSecuritiesBalanceAccountingReportV08 = new MMConstraint<SecuritiesBalanceAccountingReportV08>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceAccountingReportV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule.forSecuritiesBalanceAccountingReportV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule.forSecuritiesBalanceAccountingReportV07;
			owner_lazy = () -> SecuritiesBalanceAccountingReportV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV03> forSecuritiesBalanceAccountingReportV03 = new MMConstraint<SecuritiesBalanceAccountingReportV03>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceAccountingReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV03.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV04> forSecuritiesBalanceAccountingReportV04 = new MMConstraint<SecuritiesBalanceAccountingReportV04>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceAccountingReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV05> forSecuritiesBalanceAccountingReportV05 = new MMConstraint<SecuritiesBalanceAccountingReportV05>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceAccountingReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule#forSecuritiesBalanceAccountingReportV07
	 * ConstraintBalanceForAccountReportingRule.
	 * forSecuritiesBalanceAccountingReportV07}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV06> forSecuritiesBalanceAccountingReportV06 = new MMConstraint<SecuritiesBalanceAccountingReportV06>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceAccountingReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule.forSecuritiesBalanceAccountingReportV07);
			owner_lazy = () -> SecuritiesBalanceAccountingReportV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV03> forSecuritiesBalanceCustodyReportV03 = new MMConstraint<SecuritiesBalanceCustodyReportV03>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceCustodyReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV03.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV04> forSecuritiesBalanceCustodyReportV04 = new MMConstraint<SecuritiesBalanceCustodyReportV04>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceCustodyReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV05> forSecuritiesBalanceCustodyReportV05 = new MMConstraint<SecuritiesBalanceCustodyReportV05>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceCustodyReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule#forSecuritiesBalanceCustodyReportV07
	 * ConstraintBalanceForAccountReportingRule.
	 * forSecuritiesBalanceCustodyReportV07}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV06> forSecuritiesBalanceCustodyReportV06 = new MMConstraint<SecuritiesBalanceCustodyReportV06>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceCustodyReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule.forSecuritiesBalanceCustodyReportV07);
			owner_lazy = () -> SecuritiesBalanceCustodyReportV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule#forSecuritiesBalanceCustodyReportV08
	 * ConstraintBalanceForAccountReportingRule.
	 * forSecuritiesBalanceCustodyReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule#forSecuritiesBalanceCustodyReportV06
	 * ConstraintBalanceForAccountReportingRule.
	 * forSecuritiesBalanceCustodyReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV07> forSecuritiesBalanceCustodyReportV07 = new MMConstraint<SecuritiesBalanceCustodyReportV07>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceCustodyReportV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule.forSecuritiesBalanceCustodyReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule.forSecuritiesBalanceCustodyReportV06;
			owner_lazy = () -> SecuritiesBalanceCustodyReportV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule#forSecuritiesBalanceAccountingReportV08
	 * ConstraintBalanceForAccountReportingRule.
	 * forSecuritiesBalanceAccountingReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule#forSecuritiesBalanceAccountingReportV06
	 * ConstraintBalanceForAccountReportingRule.
	 * forSecuritiesBalanceAccountingReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV07> forSecuritiesBalanceAccountingReportV07 = new MMConstraint<SecuritiesBalanceAccountingReportV07>() {
		{
			validator = ConstraintBalanceForAccountReportingRule::checkSecuritiesBalanceAccountingReportV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountReportingRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present and Sub Account Details must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule.forSecuritiesBalanceAccountingReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceForAccountReportingRule.forSecuritiesBalanceAccountingReportV06;
			owner_lazy = () -> SecuritiesBalanceAccountingReportV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present
	 * and Sub Account Details must be absent.
	 */
	public static void checkSecuritiesBalanceCustodyReportV09(SecuritiesBalanceCustodyReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present
	 * and Sub Account Details must be absent.
	 */
	public static void checkSecuritiesBalanceAccountingReportV09(SecuritiesBalanceAccountingReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present
	 * and Sub Account Details must be absent.
	 */
	public static void checkSecuritiesBalanceAccountingReport002V09(SecuritiesBalanceAccountingReport002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present
	 * and Sub Account Details must be absent.
	 */
	public static void checkSecuritiesBalanceCustodyReport002V09(SecuritiesBalanceCustodyReport002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present
	 * and Sub Account Details must be absent.
	 */
	public static void checkSecuritiesBalanceCustodyReportV08(SecuritiesBalanceCustodyReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present
	 * and Sub Account Details must be absent.
	 */
	public static void checkSecuritiesBalanceAccountingReportV08(SecuritiesBalanceAccountingReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be
	 * present.
	 */
	public static void checkSecuritiesBalanceAccountingReportV03(SecuritiesBalanceAccountingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be
	 * present.
	 */
	public static void checkSecuritiesBalanceAccountingReportV04(SecuritiesBalanceAccountingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be
	 * present.
	 */
	public static void checkSecuritiesBalanceAccountingReportV05(SecuritiesBalanceAccountingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be
	 * present.
	 */
	public static void checkSecuritiesBalanceAccountingReportV06(SecuritiesBalanceAccountingReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be
	 * present.
	 */
	public static void checkSecuritiesBalanceCustodyReportV03(SecuritiesBalanceCustodyReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be
	 * present.
	 */
	public static void checkSecuritiesBalanceCustodyReportV04(SecuritiesBalanceCustodyReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be
	 * present.
	 */
	public static void checkSecuritiesBalanceCustodyReportV05(SecuritiesBalanceCustodyReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be
	 * present.
	 */
	public static void checkSecuritiesBalanceCustodyReportV06(SecuritiesBalanceCustodyReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present
	 * and Sub Account Details must be absent.
	 */
	public static void checkSecuritiesBalanceCustodyReportV07(SecuritiesBalanceCustodyReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is FALSE (NO), then BalanceForAccount must be present
	 * and Sub Account Details must be absent.
	 */
	public static void checkSecuritiesBalanceAccountingReportV07(SecuritiesBalanceAccountingReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}