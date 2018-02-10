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
 * If UltimateCreditor is present, then
 * DirectDebitTransactionInformation/UltimateCreditor is not allowed. If
 * DirectDebitTransactionInformation/UltimateCreditor is present, then
 * UltimateCreditor is not allowed.
 * DirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor may
 * both be absent.
 */
public class ConstraintUltimateCreditorRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4
	 * PaymentInstructionInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/UltimateCreditor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/UltimateCreditor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If UltimateCreditor is present, then DirectDebitTransactionInformation/UltimateCreditor is not allowed.\nIf DirectDebitTransactionInformation/UltimateCreditor is present, then UltimateCreditor is not allowed.\nDirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation4> forPaymentInstructionInformation4 = new MMConstraint<PaymentInstructionInformation4>() {
		{
			validator = ConstraintUltimateCreditorRule::checkPaymentInstructionInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorRule";
			definition = "If UltimateCreditor is present, then DirectDebitTransactionInformation/UltimateCreditor is not allowed.\nIf DirectDebitTransactionInformation/UltimateCreditor is present, then UltimateCreditor is not allowed.\nDirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor may both be absent.";
			owner_lazy = () -> PaymentInstructionInformation4.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/UltimateCreditor</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/UltimateCreditor</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7
	 * PaymentInstruction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/UltimateCreditor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/UltimateCreditor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If UltimateCreditor is present, then DirectDebitTransactionInformation/UltimateCreditor is not allowed.\nIf DirectDebitTransactionInformation/UltimateCreditor is present, then UltimateCreditor is not allowed.\nDirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction7> forPaymentInstruction7 = new MMConstraint<PaymentInstruction7>() {
		{
			validator = ConstraintUltimateCreditorRule::checkPaymentInstruction7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorRule";
			definition = "If UltimateCreditor is present, then DirectDebitTransactionInformation/UltimateCreditor is not allowed.\nIf DirectDebitTransactionInformation/UltimateCreditor is present, then UltimateCreditor is not allowed.\nDirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor may both be absent.";
			owner_lazy = () -> PaymentInstruction7.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/UltimateCreditor</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/UltimateCreditor</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10
	 * PaymentInstruction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/UltimateCreditor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/UltimateCreditor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If UltimateCreditor is present, then DirectDebitTransactionInformation/UltimateCreditor is not allowed.\nIf DirectDebitTransactionInformation/UltimateCreditor is present, then UltimateCreditor is not allowed.\nDirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorRule#forPaymentInstruction15
	 * ConstraintUltimateCreditorRule.forPaymentInstruction15}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction10> forPaymentInstruction10 = new MMConstraint<PaymentInstruction10>() {
		{
			validator = ConstraintUltimateCreditorRule::checkPaymentInstruction10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorRule";
			definition = "If UltimateCreditor is present, then DirectDebitTransactionInformation/UltimateCreditor is not allowed.\nIf DirectDebitTransactionInformation/UltimateCreditor is present, then UltimateCreditor is not allowed.\nDirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorRule.forPaymentInstruction15);
			owner_lazy = () -> PaymentInstruction10.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/UltimateCreditor</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/UltimateCreditor</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/UltimateCreditor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/UltimateCreditor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If UltimateCreditor is present, then DirectDebitTransactionInformation/UltimateCreditor is not allowed.\nIf DirectDebitTransactionInformation/UltimateCreditor is present, then UltimateCreditor is not allowed.\nDirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorRule#forPaymentInstruction18
	 * ConstraintUltimateCreditorRule.forPaymentInstruction18}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorRule#forPaymentInstruction10
	 * ConstraintUltimateCreditorRule.forPaymentInstruction10}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction15> forPaymentInstruction15 = new MMConstraint<PaymentInstruction15>() {
		{
			validator = ConstraintUltimateCreditorRule::checkPaymentInstruction15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorRule";
			definition = "If UltimateCreditor is present, then DirectDebitTransactionInformation/UltimateCreditor is not allowed.\nIf DirectDebitTransactionInformation/UltimateCreditor is present, then UltimateCreditor is not allowed.\nDirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorRule.forPaymentInstruction18);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorRule.forPaymentInstruction10;
			owner_lazy = () -> PaymentInstruction15.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/UltimateCreditor</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/UltimateCreditor</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18
	 * PaymentInstruction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/UltimateCreditor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/UltimateCreditor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If UltimateCreditor is present, then DirectDebitTransactionInformation/UltimateCreditor is not allowed.\nIf DirectDebitTransactionInformation/UltimateCreditor is present, then UltimateCreditor is not allowed.\nDirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorRule#forPaymentInstruction21
	 * ConstraintUltimateCreditorRule.forPaymentInstruction21}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorRule#forPaymentInstruction15
	 * ConstraintUltimateCreditorRule.forPaymentInstruction15}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction18> forPaymentInstruction18 = new MMConstraint<PaymentInstruction18>() {
		{
			validator = ConstraintUltimateCreditorRule::checkPaymentInstruction18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorRule";
			definition = "If UltimateCreditor is present, then DirectDebitTransactionInformation/UltimateCreditor is not allowed.\nIf DirectDebitTransactionInformation/UltimateCreditor is present, then UltimateCreditor is not allowed.\nDirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorRule.forPaymentInstruction21);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorRule.forPaymentInstruction15;
			owner_lazy = () -> PaymentInstruction18.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/UltimateCreditor</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/UltimateCreditor</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21
	 * PaymentInstruction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/UltimateCreditor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/UltimateCreditor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If UltimateCreditor is present, then DirectDebitTransactionInformation/UltimateCreditor is not allowed.\nIf DirectDebitTransactionInformation/UltimateCreditor is present, then UltimateCreditor is not allowed.\nDirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor may both be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorRule#forPaymentInstruction18
	 * ConstraintUltimateCreditorRule.forPaymentInstruction18}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction21> forPaymentInstruction21 = new MMConstraint<PaymentInstruction21>() {
		{
			validator = ConstraintUltimateCreditorRule::checkPaymentInstruction21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorRule";
			definition = "If UltimateCreditor is present, then DirectDebitTransactionInformation/UltimateCreditor is not allowed.\nIf DirectDebitTransactionInformation/UltimateCreditor is present, then UltimateCreditor is not allowed.\nDirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor may both be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorRule.forPaymentInstruction18;
			owner_lazy = () -> PaymentInstruction21.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/UltimateCreditor</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/UltimateCreditor</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};

	/**
	 * If UltimateCreditor is present, then
	 * DirectDebitTransactionInformation/UltimateCreditor is not allowed. If
	 * DirectDebitTransactionInformation/UltimateCreditor is present, then
	 * UltimateCreditor is not allowed.
	 * DirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor
	 * may both be absent.
	 */
	public static void checkPaymentInstructionInformation4(PaymentInstructionInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If UltimateCreditor is present, then
	 * DirectDebitTransactionInformation/UltimateCreditor is not allowed. If
	 * DirectDebitTransactionInformation/UltimateCreditor is present, then
	 * UltimateCreditor is not allowed.
	 * DirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor
	 * may both be absent.
	 */
	public static void checkPaymentInstruction7(PaymentInstruction7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If UltimateCreditor is present, then
	 * DirectDebitTransactionInformation/UltimateCreditor is not allowed. If
	 * DirectDebitTransactionInformation/UltimateCreditor is present, then
	 * UltimateCreditor is not allowed.
	 * DirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor
	 * may both be absent.
	 */
	public static void checkPaymentInstruction10(PaymentInstruction10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If UltimateCreditor is present, then
	 * DirectDebitTransactionInformation/UltimateCreditor is not allowed. If
	 * DirectDebitTransactionInformation/UltimateCreditor is present, then
	 * UltimateCreditor is not allowed.
	 * DirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor
	 * may both be absent.
	 */
	public static void checkPaymentInstruction15(PaymentInstruction15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If UltimateCreditor is present, then
	 * DirectDebitTransactionInformation/UltimateCreditor is not allowed. If
	 * DirectDebitTransactionInformation/UltimateCreditor is present, then
	 * UltimateCreditor is not allowed.
	 * DirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor
	 * may both be absent.
	 */
	public static void checkPaymentInstruction18(PaymentInstruction18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If UltimateCreditor is present, then
	 * DirectDebitTransactionInformation/UltimateCreditor is not allowed. If
	 * DirectDebitTransactionInformation/UltimateCreditor is present, then
	 * UltimateCreditor is not allowed.
	 * DirectDebitTransactionInformation/UltimateCreditor and UltimateCreditor
	 * may both be absent.
	 */
	public static void checkPaymentInstruction21(PaymentInstruction21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}