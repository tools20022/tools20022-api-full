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
 * If OriginalGroupInformationAndCancellation/GroupCancellation is true, then
 * TransactionInformation is not allowed.
 */
public class ConstraintGroupCancellationTrueAndTransactionInformationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction2
	 * UnderlyingTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupCancellationTrueAndTransactionInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then TransactionInformation is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingTransaction2> forUnderlyingTransaction2 = new MMConstraint<UnderlyingTransaction2>() {
		{
			validator = ConstraintGroupCancellationTrueAndTransactionInformationRule::checkUnderlyingTransaction2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupCancellationTrueAndTransactionInformationRule";
			definition = "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then TransactionInformation is not allowed.";
			owner_lazy = () -> UnderlyingTransaction2.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction5
	 * UnderlyingTransaction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupCancellationTrueAndTransactionInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then TransactionInformation is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingTransaction5> forUnderlyingTransaction5 = new MMConstraint<UnderlyingTransaction5>() {
		{
			validator = ConstraintGroupCancellationTrueAndTransactionInformationRule::checkUnderlyingTransaction5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupCancellationTrueAndTransactionInformationRule";
			definition = "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then TransactionInformation is not allowed.";
			owner_lazy = () -> UnderlyingTransaction5.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction8
	 * UnderlyingTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupCancellationTrueAndTransactionInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then TransactionInformation is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule#forUnderlyingTransaction10
	 * ConstraintGroupCancellationTrueAndTransactionInformationRule.
	 * forUnderlyingTransaction10}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingTransaction8> forUnderlyingTransaction8 = new MMConstraint<UnderlyingTransaction8>() {
		{
			validator = ConstraintGroupCancellationTrueAndTransactionInformationRule::checkUnderlyingTransaction8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupCancellationTrueAndTransactionInformationRule";
			definition = "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then TransactionInformation is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule.forUnderlyingTransaction10);
			owner_lazy = () -> UnderlyingTransaction8.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction10
	 * UnderlyingTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupCancellationTrueAndTransactionInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then TransactionInformation is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule#forUnderlyingTransaction13
	 * ConstraintGroupCancellationTrueAndTransactionInformationRule.
	 * forUnderlyingTransaction13}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule#forUnderlyingTransaction8
	 * ConstraintGroupCancellationTrueAndTransactionInformationRule.
	 * forUnderlyingTransaction8}</li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingTransaction10> forUnderlyingTransaction10 = new MMConstraint<UnderlyingTransaction10>() {
		{
			validator = ConstraintGroupCancellationTrueAndTransactionInformationRule::checkUnderlyingTransaction10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupCancellationTrueAndTransactionInformationRule";
			definition = "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then TransactionInformation is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule.forUnderlyingTransaction13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule.forUnderlyingTransaction8;
			owner_lazy = () -> UnderlyingTransaction10.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction13
	 * UnderlyingTransaction13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupCancellationTrueAndTransactionInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then TransactionInformation is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule#forUnderlyingTransaction16
	 * ConstraintGroupCancellationTrueAndTransactionInformationRule.
	 * forUnderlyingTransaction16}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule#forUnderlyingTransaction10
	 * ConstraintGroupCancellationTrueAndTransactionInformationRule.
	 * forUnderlyingTransaction10}</li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingTransaction13> forUnderlyingTransaction13 = new MMConstraint<UnderlyingTransaction13>() {
		{
			validator = ConstraintGroupCancellationTrueAndTransactionInformationRule::checkUnderlyingTransaction13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupCancellationTrueAndTransactionInformationRule";
			definition = "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then TransactionInformation is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule.forUnderlyingTransaction16);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule.forUnderlyingTransaction10;
			owner_lazy = () -> UnderlyingTransaction13.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16
	 * UnderlyingTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndCancellation/GroupCancellation&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupCancellationTrueAndTransactionInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then TransactionInformation is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule#forUnderlyingTransaction13
	 * ConstraintGroupCancellationTrueAndTransactionInformationRule.
	 * forUnderlyingTransaction13}</li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingTransaction16> forUnderlyingTransaction16 = new MMConstraint<UnderlyingTransaction16>() {
		{
			validator = ConstraintGroupCancellationTrueAndTransactionInformationRule::checkUnderlyingTransaction16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupCancellationTrueAndTransactionInformationRule";
			definition = "If OriginalGroupInformationAndCancellation/GroupCancellation is true, then TransactionInformation is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule.forUnderlyingTransaction13;
			owner_lazy = () -> UnderlyingTransaction16.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndCancellation/GroupCancellation</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If OriginalGroupInformationAndCancellation/GroupCancellation is true,
	 * then TransactionInformation is not allowed.
	 */
	public static void checkUnderlyingTransaction2(UnderlyingTransaction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndCancellation/GroupCancellation is true,
	 * then TransactionInformation is not allowed.
	 */
	public static void checkUnderlyingTransaction5(UnderlyingTransaction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndCancellation/GroupCancellation is true,
	 * then TransactionInformation is not allowed.
	 */
	public static void checkUnderlyingTransaction8(UnderlyingTransaction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndCancellation/GroupCancellation is true,
	 * then TransactionInformation is not allowed.
	 */
	public static void checkUnderlyingTransaction10(UnderlyingTransaction10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndCancellation/GroupCancellation is true,
	 * then TransactionInformation is not allowed.
	 */
	public static void checkUnderlyingTransaction13(UnderlyingTransaction13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndCancellation/GroupCancellation is true,
	 * then TransactionInformation is not allowed.
	 */
	public static void checkUnderlyingTransaction16(UnderlyingTransaction16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}