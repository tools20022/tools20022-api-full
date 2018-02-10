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

/**
 * If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s) and
 * ClearingSystem are not allowed.
 */
public class ConstraintSettlementMethodAgentRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ClearingSystem&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructingReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructedReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ThirdReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructingAgent&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructedAgent&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethodAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s) and ClearingSystem are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementInformation13> forSettlementInformation13 = new MMConstraint<SettlementInformation13>() {
		{
			validator = ConstraintSettlementMethodAgentRule::checkSettlementInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethodAgentRule";
			definition = "If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s) and ClearingSystem are not allowed.";
			owner_lazy = () -> SettlementInformation13.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ClearingSystem</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructingReimbursementAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructedReimbursementAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/ThirdReimbursementAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>InstructingAgent</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>InstructedAgent</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4
	 * SettlementInstruction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ClearingSystem&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructingReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructedReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ThirdReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructingAgent&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructedAgent&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethodAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s) and ClearingSystem are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementInstruction4> forSettlementInstruction4 = new MMConstraint<SettlementInstruction4>() {
		{
			validator = ConstraintSettlementMethodAgentRule::checkSettlementInstruction4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethodAgentRule";
			definition = "If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s) and ClearingSystem are not allowed.";
			owner_lazy = () -> SettlementInstruction4.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ClearingSystem</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructingReimbursementAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructedReimbursementAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/ThirdReimbursementAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>InstructingAgent</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>InstructedAgent</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction1
	 * SettlementInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ClearingSystem&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructingReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructedReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ThirdReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructingAgent&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructedAgent&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethodAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s) and ClearingSystem are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementInstruction1> forSettlementInstruction1 = new MMConstraint<SettlementInstruction1>() {
		{
			validator = ConstraintSettlementMethodAgentRule::checkSettlementInstruction1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethodAgentRule";
			definition = "If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s) and ClearingSystem are not allowed.";
			owner_lazy = () -> SettlementInstruction1.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ClearingSystem</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructingReimbursementAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructedReimbursementAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/ThirdReimbursementAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>InstructingAgent</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>InstructedAgent</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation14
	 * SettlementInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ClearingSystem&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructingAgent&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructedAgent&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethodAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementMethod is equal to INDA or INGA, then ClearingSystem is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementInformation14> forSettlementInformation14 = new MMConstraint<SettlementInformation14>() {
		{
			validator = ConstraintSettlementMethodAgentRule::checkSettlementInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethodAgentRule";
			definition = "If SettlementMethod is equal to INDA or INGA, then ClearingSystem is not allowed.";
			owner_lazy = () -> SettlementInformation14.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ClearingSystem</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>InstructingAgent</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>InstructedAgent</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2
	 * SettlementInstruction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ClearingSystem&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructingAgent&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructedAgent&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethodAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementMethod is equal to INDA or INGA, then ClearingSystem is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementInstruction2> forSettlementInstruction2 = new MMConstraint<SettlementInstruction2>() {
		{
			validator = ConstraintSettlementMethodAgentRule::checkSettlementInstruction2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethodAgentRule";
			definition = "If SettlementMethod is equal to INDA or INGA, then ClearingSystem is not allowed.";
			owner_lazy = () -> SettlementInstruction2.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ClearingSystem</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>InstructingAgent</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>InstructedAgent</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation16
	 * SettlementInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ClearingSystem&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructingReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructedReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ThirdReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructingAgent&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructedAgent&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethodAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s) and ClearingSystem are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementInformation16> forSettlementInformation16 = new MMConstraint<SettlementInformation16>() {
		{
			validator = ConstraintSettlementMethodAgentRule::checkSettlementInformation16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethodAgentRule";
			definition = "If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s) and ClearingSystem are not allowed.";
			owner_lazy = () -> SettlementInformation16.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ClearingSystem</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructingReimbursementAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructedReimbursementAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/ThirdReimbursementAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>InstructingAgent</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>InstructedAgent</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s)
	 * and ClearingSystem are not allowed.
	 */
	public static void checkSettlementInformation13(SettlementInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s)
	 * and ClearingSystem are not allowed.
	 */
	public static void checkSettlementInstruction4(SettlementInstruction4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s)
	 * and ClearingSystem are not allowed.
	 */
	public static void checkSettlementInstruction1(SettlementInstruction1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementMethod is equal to INDA or INGA, then ClearingSystem is not
	 * allowed.
	 */
	public static void checkSettlementInformation14(SettlementInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementMethod is equal to INDA or INGA, then ClearingSystem is not
	 * allowed.
	 */
	public static void checkSettlementInstruction2(SettlementInstruction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s)
	 * and ClearingSystem are not allowed.
	 */
	public static void checkSettlementInformation16(SettlementInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}