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
 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present and
 * FinancialInstrumentDetails must be absent.
 */
public class ConstraintSubAccountDetailsFinancialInstrumentPresenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07
	 * SecuritiesTransactionPostingReportV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FinancialInstrumentDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetailsFinancialInstrumentPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present and FinancialInstrumentDetails must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubAccountDetailsFinancialInstrumentPresenceRule#forSecuritiesTransactionPostingReportV06
	 * ConstraintSubAccountDetailsFinancialInstrumentPresenceRule.
	 * forSecuritiesTransactionPostingReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV07> forSecuritiesTransactionPostingReportV07 = new MMConstraint<SecuritiesTransactionPostingReportV07>() {
		{
			validator = ConstraintSubAccountDetailsFinancialInstrumentPresenceRule::checkSecuritiesTransactionPostingReportV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetailsFinancialInstrumentPresenceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present and FinancialInstrumentDetails must be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubAccountDetailsFinancialInstrumentPresenceRule.forSecuritiesTransactionPostingReportV06;
			owner_lazy = () -> SecuritiesTransactionPostingReportV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/FinancialInstrumentDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V07
	 * SecuritiesTransactionPostingReport002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FinancialInstrumentDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetailsFinancialInstrumentPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present and FinancialInstrumentDetails must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReport002V07> forSecuritiesTransactionPostingReport002V07 = new MMConstraint<SecuritiesTransactionPostingReport002V07>() {
		{
			validator = ConstraintSubAccountDetailsFinancialInstrumentPresenceRule::checkSecuritiesTransactionPostingReport002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetailsFinancialInstrumentPresenceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present and FinancialInstrumentDetails must be absent.";
			owner_lazy = () -> SecuritiesTransactionPostingReport002V07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/FinancialInstrumentDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06
	 * SecuritiesTransactionPostingReportV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FinancialInstrumentDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetailsFinancialInstrumentPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present and FinancialInstrumentDetails must be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubAccountDetailsFinancialInstrumentPresenceRule#forSecuritiesTransactionPostingReportV07
	 * ConstraintSubAccountDetailsFinancialInstrumentPresenceRule.
	 * forSecuritiesTransactionPostingReportV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubAccountDetailsFinancialInstrumentPresenceRule#forSecuritiesTransactionPostingReportV05
	 * ConstraintSubAccountDetailsFinancialInstrumentPresenceRule.
	 * forSecuritiesTransactionPostingReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV06> forSecuritiesTransactionPostingReportV06 = new MMConstraint<SecuritiesTransactionPostingReportV06>() {
		{
			validator = ConstraintSubAccountDetailsFinancialInstrumentPresenceRule::checkSecuritiesTransactionPostingReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetailsFinancialInstrumentPresenceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present and FinancialInstrumentDetails must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubAccountDetailsFinancialInstrumentPresenceRule.forSecuritiesTransactionPostingReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubAccountDetailsFinancialInstrumentPresenceRule.forSecuritiesTransactionPostingReportV05;
			owner_lazy = () -> SecuritiesTransactionPostingReportV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/FinancialInstrumentDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V06
	 * SecuritiesTransactionPostingReport002V06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FinancialInstrumentDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetailsFinancialInstrumentPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present and FinancialInstrumentDetails must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReport002V06> forSecuritiesTransactionPostingReport002V06 = new MMConstraint<SecuritiesTransactionPostingReport002V06>() {
		{
			validator = ConstraintSubAccountDetailsFinancialInstrumentPresenceRule::checkSecuritiesTransactionPostingReport002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetailsFinancialInstrumentPresenceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present and FinancialInstrumentDetails must be absent.";
			owner_lazy = () -> SecuritiesTransactionPostingReport002V06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/FinancialInstrumentDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05
	 * SecuritiesTransactionPostingReportV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FinancialInstrumentDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/SubAccountIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetailsFinancialInstrumentPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present and FinancialInstrumentDetails must be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubAccountDetailsFinancialInstrumentPresenceRule#forSecuritiesTransactionPostingReportV06
	 * ConstraintSubAccountDetailsFinancialInstrumentPresenceRule.
	 * forSecuritiesTransactionPostingReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubAccountReportingRule#forSecuritiesTransactionPostingReportV04
	 * ConstraintSubAccountReportingRule.
	 * forSecuritiesTransactionPostingReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV05> forSecuritiesTransactionPostingReportV05 = new MMConstraint<SecuritiesTransactionPostingReportV05>() {
		{
			validator = ConstraintSubAccountDetailsFinancialInstrumentPresenceRule::checkSecuritiesTransactionPostingReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetailsFinancialInstrumentPresenceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present and FinancialInstrumentDetails must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubAccountDetailsFinancialInstrumentPresenceRule.forSecuritiesTransactionPostingReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubAccountReportingRule.forSecuritiesTransactionPostingReportV04;
			owner_lazy = () -> SecuritiesTransactionPostingReportV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/FinancialInstrumentDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/SubAccountIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present
	 * and FinancialInstrumentDetails must be absent.
	 */
	public static void checkSecuritiesTransactionPostingReportV07(SecuritiesTransactionPostingReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present
	 * and FinancialInstrumentDetails must be absent.
	 */
	public static void checkSecuritiesTransactionPostingReport002V07(SecuritiesTransactionPostingReport002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present
	 * and FinancialInstrumentDetails must be absent.
	 */
	public static void checkSecuritiesTransactionPostingReportV06(SecuritiesTransactionPostingReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present
	 * and FinancialInstrumentDetails must be absent.
	 */
	public static void checkSecuritiesTransactionPostingReport002V06(SecuritiesTransactionPostingReport002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes) and
	 * SubAccountIndicator is TRUE (YES), then SubAccountDetails must be present
	 * and FinancialInstrumentDetails must be absent.
	 */
	public static void checkSecuritiesTransactionPostingReportV05(SecuritiesTransactionPostingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}