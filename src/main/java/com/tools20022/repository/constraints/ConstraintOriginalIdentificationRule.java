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
 * Either OriginalInstructionIdentification, OriginalEndToEndIdentification or
 * both must be present.
 */
public class ConstraintOriginalIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1
	 * UnderlyingPaymentInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalInstructionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalEndToEndIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either OriginalInstructionIdentification, OriginalEndToEndIdentification or both must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingPaymentInstruction1> forUnderlyingPaymentInstruction1 = new MMConstraint<UnderlyingPaymentInstruction1>() {
		{
			validator = ConstraintOriginalIdentificationRule::checkUnderlyingPaymentInstruction1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalIdentificationRule";
			definition = "Either OriginalInstructionIdentification, OriginalEndToEndIdentification or both must be present.";
			owner_lazy = () -> UnderlyingPaymentInstruction1.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalInstructionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalEndToEndIdentification</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1
	 * UnderlyingPaymentTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalInstructionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalEndToEndIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either OriginalInstructionIdentification, OriginalEndToEndIdentification, OriginalTransactionIdentification or any combination of the three must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingPaymentTransaction1> forUnderlyingPaymentTransaction1 = new MMConstraint<UnderlyingPaymentTransaction1>() {
		{
			validator = ConstraintOriginalIdentificationRule::checkUnderlyingPaymentTransaction1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalIdentificationRule";
			definition = "Either OriginalInstructionIdentification, OriginalEndToEndIdentification, OriginalTransactionIdentification or any combination of the three must be present.";
			owner_lazy = () -> UnderlyingPaymentTransaction1.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalInstructionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalEndToEndIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalTransactionIdentification</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2
	 * UnderlyingPaymentInstruction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalInstructionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalEndToEndIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either OriginalInstructionIdentification, OriginalEndToEndIdentification or both must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalIdentificationRule#forUnderlyingPaymentInstruction3
	 * ConstraintOriginalIdentificationRule.forUnderlyingPaymentInstruction3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingPaymentInstruction2> forUnderlyingPaymentInstruction2 = new MMConstraint<UnderlyingPaymentInstruction2>() {
		{
			validator = ConstraintOriginalIdentificationRule::checkUnderlyingPaymentInstruction2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalIdentificationRule";
			definition = "Either OriginalInstructionIdentification, OriginalEndToEndIdentification or both must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOriginalIdentificationRule.forUnderlyingPaymentInstruction3);
			owner_lazy = () -> UnderlyingPaymentInstruction2.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalInstructionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalEndToEndIdentification</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2
	 * UnderlyingPaymentTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalInstructionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalEndToEndIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either OriginalInstructionIdentification, OriginalEndToEndIdentification, OriginalTransactionIdentification or any combination of the three must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingPaymentTransaction2> forUnderlyingPaymentTransaction2 = new MMConstraint<UnderlyingPaymentTransaction2>() {
		{
			validator = ConstraintOriginalIdentificationRule::checkUnderlyingPaymentTransaction2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalIdentificationRule";
			definition = "Either OriginalInstructionIdentification, OriginalEndToEndIdentification, OriginalTransactionIdentification or any combination of the three must be present.";
			owner_lazy = () -> UnderlyingPaymentTransaction2.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalInstructionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalEndToEndIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalTransactionIdentification</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3
	 * UnderlyingPaymentInstruction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalInstructionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalEndToEndIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either OriginalInstructionIdentification, OriginalEndToEndIdentification or both must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalIdentificationRule#forUnderlyingPaymentInstruction2
	 * ConstraintOriginalIdentificationRule.forUnderlyingPaymentInstruction2}</li>
	 * </ul>
	 */
	public static final MMConstraint<UnderlyingPaymentInstruction3> forUnderlyingPaymentInstruction3 = new MMConstraint<UnderlyingPaymentInstruction3>() {
		{
			validator = ConstraintOriginalIdentificationRule::checkUnderlyingPaymentInstruction3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalIdentificationRule";
			definition = "Either OriginalInstructionIdentification, OriginalEndToEndIdentification or both must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOriginalIdentificationRule.forUnderlyingPaymentInstruction2;
			owner_lazy = () -> UnderlyingPaymentInstruction3.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalInstructionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalEndToEndIdentification</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};

	/**
	 * Either OriginalInstructionIdentification, OriginalEndToEndIdentification
	 * or both must be present.
	 */
	public static void checkUnderlyingPaymentInstruction1(UnderlyingPaymentInstruction1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either OriginalInstructionIdentification, OriginalEndToEndIdentification,
	 * OriginalTransactionIdentification or any combination of the three must be
	 * present.
	 */
	public static void checkUnderlyingPaymentTransaction1(UnderlyingPaymentTransaction1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either OriginalInstructionIdentification, OriginalEndToEndIdentification
	 * or both must be present.
	 */
	public static void checkUnderlyingPaymentInstruction2(UnderlyingPaymentInstruction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either OriginalInstructionIdentification, OriginalEndToEndIdentification,
	 * OriginalTransactionIdentification or any combination of the three must be
	 * present.
	 */
	public static void checkUnderlyingPaymentTransaction2(UnderlyingPaymentTransaction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either OriginalInstructionIdentification, OriginalEndToEndIdentification
	 * or both must be present.
	 */
	public static void checkUnderlyingPaymentInstruction3(UnderlyingPaymentInstruction3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}