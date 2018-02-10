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
 * ResolvedCase may be present at either ResolvedCase,
 * OriginalGroupInformationAndStatus level, OriginalPaymentInformationAndStatus
 * or TransactionInformationAndStatus level.
 */
public class ConstraintGroupOrPaymentInformationResolvedCaseRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction3
	 * UnderlyingTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupOrPaymentInformationResolvedCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus level, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingTransaction3> forUnderlyingTransaction3 = new MMConstraint<UnderlyingTransaction3>() {
		{
			validator = ConstraintGroupOrPaymentInformationResolvedCaseRule::checkUnderlyingTransaction3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupOrPaymentInformationResolvedCaseRule";
			definition = "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus level, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level.";
			owner_lazy = () -> UnderlyingTransaction3.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/ResolvedCase</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/ResolvedCase</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalPaymentInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction4
	 * UnderlyingTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupOrPaymentInformationResolvedCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus level, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule#forUnderlyingTransaction9
	 * ConstraintGroupOrPaymentInformationResolvedCaseRule.
	 * forUnderlyingTransaction9}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingTransaction4> forUnderlyingTransaction4 = new MMConstraint<UnderlyingTransaction4>() {
		{
			validator = ConstraintGroupOrPaymentInformationResolvedCaseRule::checkUnderlyingTransaction4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupOrPaymentInformationResolvedCaseRule";
			definition = "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus level, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule.forUnderlyingTransaction9);
			owner_lazy = () -> UnderlyingTransaction4.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/ResolvedCase</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/ResolvedCase</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalPaymentInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction9
	 * UnderlyingTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupOrPaymentInformationResolvedCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus level, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule#forUnderlyingTransaction14
	 * ConstraintGroupOrPaymentInformationResolvedCaseRule.
	 * forUnderlyingTransaction14}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule#forUnderlyingTransaction4
	 * ConstraintGroupOrPaymentInformationResolvedCaseRule.
	 * forUnderlyingTransaction4}</li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingTransaction9> forUnderlyingTransaction9 = new MMConstraint<UnderlyingTransaction9>() {
		{
			validator = ConstraintGroupOrPaymentInformationResolvedCaseRule::checkUnderlyingTransaction9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupOrPaymentInformationResolvedCaseRule";
			definition = "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus level, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule.forUnderlyingTransaction14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule.forUnderlyingTransaction4;
			owner_lazy = () -> UnderlyingTransaction9.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/ResolvedCase</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/ResolvedCase</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalPaymentInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction14
	 * UnderlyingTransaction14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupOrPaymentInformationResolvedCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus level, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule#forUnderlyingTransaction17
	 * ConstraintGroupOrPaymentInformationResolvedCaseRule.
	 * forUnderlyingTransaction17}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule#forUnderlyingTransaction9
	 * ConstraintGroupOrPaymentInformationResolvedCaseRule.
	 * forUnderlyingTransaction9}</li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingTransaction14> forUnderlyingTransaction14 = new MMConstraint<UnderlyingTransaction14>() {
		{
			validator = ConstraintGroupOrPaymentInformationResolvedCaseRule::checkUnderlyingTransaction14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupOrPaymentInformationResolvedCaseRule";
			definition = "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus level, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule.forUnderlyingTransaction17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule.forUnderlyingTransaction9;
			owner_lazy = () -> UnderlyingTransaction14.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/ResolvedCase</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/ResolvedCase</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalPaymentInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17
	 * UnderlyingTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupOrPaymentInformationResolvedCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus level, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule#forUnderlyingTransaction19
	 * ConstraintGroupOrPaymentInformationResolvedCaseRule.
	 * forUnderlyingTransaction19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule#forUnderlyingTransaction14
	 * ConstraintGroupOrPaymentInformationResolvedCaseRule.
	 * forUnderlyingTransaction14}</li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingTransaction17> forUnderlyingTransaction17 = new MMConstraint<UnderlyingTransaction17>() {
		{
			validator = ConstraintGroupOrPaymentInformationResolvedCaseRule::checkUnderlyingTransaction17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupOrPaymentInformationResolvedCaseRule";
			definition = "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus level, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule.forUnderlyingTransaction19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule.forUnderlyingTransaction14;
			owner_lazy = () -> UnderlyingTransaction17.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/ResolvedCase</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/ResolvedCase</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalPaymentInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction19
	 * UnderlyingTransaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupOrPaymentInformationResolvedCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus level, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule#forUnderlyingTransaction17
	 * ConstraintGroupOrPaymentInformationResolvedCaseRule.
	 * forUnderlyingTransaction17}</li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingTransaction19> forUnderlyingTransaction19 = new MMConstraint<UnderlyingTransaction19>() {
		{
			validator = ConstraintGroupOrPaymentInformationResolvedCaseRule::checkUnderlyingTransaction19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupOrPaymentInformationResolvedCaseRule";
			definition = "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus level, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule.forUnderlyingTransaction17;
			owner_lazy = () -> UnderlyingTransaction19.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/ResolvedCase</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/ResolvedCase</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalPaymentInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * ResolvedCase may be present at either ResolvedCase,
	 * OriginalGroupInformationAndStatus level,
	 * OriginalPaymentInformationAndStatus or TransactionInformationAndStatus
	 * level.
	 */
	public static void checkUnderlyingTransaction3(UnderlyingTransaction3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ResolvedCase may be present at either ResolvedCase,
	 * OriginalGroupInformationAndStatus level,
	 * OriginalPaymentInformationAndStatus or TransactionInformationAndStatus
	 * level.
	 */
	public static void checkUnderlyingTransaction4(UnderlyingTransaction4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ResolvedCase may be present at either ResolvedCase,
	 * OriginalGroupInformationAndStatus level,
	 * OriginalPaymentInformationAndStatus or TransactionInformationAndStatus
	 * level.
	 */
	public static void checkUnderlyingTransaction9(UnderlyingTransaction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ResolvedCase may be present at either ResolvedCase,
	 * OriginalGroupInformationAndStatus level,
	 * OriginalPaymentInformationAndStatus or TransactionInformationAndStatus
	 * level.
	 */
	public static void checkUnderlyingTransaction14(UnderlyingTransaction14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ResolvedCase may be present at either ResolvedCase,
	 * OriginalGroupInformationAndStatus level,
	 * OriginalPaymentInformationAndStatus or TransactionInformationAndStatus
	 * level.
	 */
	public static void checkUnderlyingTransaction17(UnderlyingTransaction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ResolvedCase may be present at either ResolvedCase,
	 * OriginalGroupInformationAndStatus level,
	 * OriginalPaymentInformationAndStatus or TransactionInformationAndStatus
	 * level.
	 */
	public static void checkUnderlyingTransaction19(UnderlyingTransaction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}