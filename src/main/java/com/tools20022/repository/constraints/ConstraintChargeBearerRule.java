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
 * If ChargeBearer is present, then
 * CreditTransferTransactionInformation/ChargeBearer is not allowed. If
 * CreditTransferTransactionInformation/ChargeBearer is present, then
 * ChargeBearer is not allowed.
 * CreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both
 * be absent.
 */
public class ConstraintChargeBearerRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation1> forPaymentInstructionInformation1 = new MMConstraint<PaymentInstructionInformation1>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstructionInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			owner_lazy = () -> PaymentInstructionInformation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3
	 * PaymentInstructionInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation3> forPaymentInstructionInformation3 = new MMConstraint<PaymentInstructionInformation3>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstructionInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			owner_lazy = () -> PaymentInstructionInformation3.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6
	 * PaymentInstruction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction6> forPaymentInstruction6 = new MMConstraint<PaymentInstruction6>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			owner_lazy = () -> PaymentInstruction6.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9
	 * PaymentInstruction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction16
	 * ConstraintChargeBearerRule.forPaymentInstruction16}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction9> forPaymentInstruction9 = new MMConstraint<PaymentInstruction9>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction16);
			owner_lazy = () -> PaymentInstruction9.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2
	 * PaymentInstructionInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation2> forPaymentInstructionInformation2 = new MMConstraint<PaymentInstructionInformation2>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstructionInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			owner_lazy = () -> PaymentInstructionInformation2.mmObject();
		}
	};
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation4> forPaymentInstructionInformation4 = new MMConstraint<PaymentInstructionInformation4>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstructionInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			owner_lazy = () -> PaymentInstructionInformation4.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction7> forPaymentInstruction7 = new MMConstraint<PaymentInstruction7>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			owner_lazy = () -> PaymentInstruction7.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction15
	 * ConstraintChargeBearerRule.forPaymentInstruction15}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction10> forPaymentInstruction10 = new MMConstraint<PaymentInstruction10>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction15);
			owner_lazy = () -> PaymentInstruction10.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2
	 * CreditTransferTransactionInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s). \nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s). \nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation2> forCreditTransferTransactionInformation2 = new MMConstraint<CreditTransferTransactionInformation2>() {
		{
			validator = ConstraintChargeBearerRule::checkCreditTransferTransactionInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s). \nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s). \nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.";
			owner_lazy = () -> CreditTransferTransactionInformation2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5
	 * PaymentInstruction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer is not allowed.\r\nIf CreditTransferTransaction/ChargeBearer is present, then ChargeBearer is not allowed.\r\nCreditTransferTransaction/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction5> forPaymentInstruction5 = new MMConstraint<PaymentInstruction5>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer is not allowed.\r\nIf CreditTransferTransaction/ChargeBearer is present, then ChargeBearer is not allowed.\r\nCreditTransferTransaction/ChargeBearer and ChargeBearer may both be absent.";
			owner_lazy = () -> PaymentInstruction5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8
	 * PaymentInstruction8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer is not allowed.\r\nIf CreditTransferTransaction/ChargeBearer is present, then ChargeBearer is not allowed.\r\nCreditTransferTransaction/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction8> forPaymentInstruction8 = new MMConstraint<PaymentInstruction8>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer is not allowed.\r\nIf CreditTransferTransaction/ChargeBearer is present, then ChargeBearer is not allowed.\r\nCreditTransferTransaction/ChargeBearer and ChargeBearer may both be absent.";
			owner_lazy = () -> PaymentInstruction8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11
	 * PaymentInstruction11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer is not allowed.\r\nIf CreditTransferTransaction/ChargeBearer is present, then ChargeBearer is not allowed.\r\nCreditTransferTransaction/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction17
	 * ConstraintChargeBearerRule.forPaymentInstruction17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction11> forPaymentInstruction11 = new MMConstraint<PaymentInstruction11>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer is not allowed.\r\nIf CreditTransferTransaction/ChargeBearer is present, then ChargeBearer is not allowed.\r\nCreditTransferTransaction/ChargeBearer and ChargeBearer may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction17);
			owner_lazy = () -> PaymentInstruction11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7
	 * CreditTransferTransactionInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;rightOperand&gt;FollowingServiceLevel&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: (not injected)\nIf ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s). \nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s). \nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation7> forCreditTransferTransactionInformation7 = new MMConstraint<CreditTransferTransactionInformation7>() {
		{
			validator = ConstraintChargeBearerRule::checkCreditTransferTransactionInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "ISO20022 Rule: (not injected)\nIf ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s). \nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s). \nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.";
			owner_lazy = () -> CreditTransferTransactionInformation7.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ChargeBearer</leftOperand><rightOperand>FollowingServiceLevel</rightOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;rightOperand&gt;FollowingServiceLevel&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: \nIf ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s). \nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s). \nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation9> forCreditTransferTransactionInformation9 = new MMConstraint<CreditTransferTransactionInformation9>() {
		{
			validator = ConstraintChargeBearerRule::checkCreditTransferTransactionInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "ISO20022 Rule: \nIf ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s). \nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s). \nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.";
			owner_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ChargeBearer</leftOperand><rightOperand>FollowingServiceLevel</rightOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction20
	 * ConstraintChargeBearerRule.forPaymentInstruction20}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction9
	 * ConstraintChargeBearerRule.forPaymentInstruction9}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction16> forPaymentInstruction16 = new MMConstraint<PaymentInstruction16>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction20);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction9;
			owner_lazy = () -> PaymentInstruction16.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction18
	 * ConstraintChargeBearerRule.forPaymentInstruction18}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction10
	 * ConstraintChargeBearerRule.forPaymentInstruction10}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction15> forPaymentInstruction15 = new MMConstraint<PaymentInstruction15>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction18);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction10;
			owner_lazy = () -> PaymentInstruction15.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer is not allowed.\r\nIf CreditTransferTransaction/ChargeBearer is present, then ChargeBearer is not allowed.\r\nCreditTransferTransaction/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction19
	 * ConstraintChargeBearerRule.forPaymentInstruction19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction11
	 * ConstraintChargeBearerRule.forPaymentInstruction11}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction17> forPaymentInstruction17 = new MMConstraint<PaymentInstruction17>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer is not allowed.\r\nIf CreditTransferTransaction/ChargeBearer is present, then ChargeBearer is not allowed.\r\nCreditTransferTransaction/ChargeBearer and ChargeBearer may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction11;
			owner_lazy = () -> PaymentInstruction17.mmObject();
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction21
	 * ConstraintChargeBearerRule.forPaymentInstruction21}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction15
	 * ConstraintChargeBearerRule.forPaymentInstruction15}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction18> forPaymentInstruction18 = new MMConstraint<PaymentInstruction18>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction21);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction15;
			owner_lazy = () -> PaymentInstruction18.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19
	 * PaymentInstruction19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer is not allowed.\r\nIf CreditTransferTransaction/ChargeBearer is present, then ChargeBearer is not allowed.\r\nCreditTransferTransaction/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction23
	 * ConstraintChargeBearerRule.forPaymentInstruction23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction17
	 * ConstraintChargeBearerRule.forPaymentInstruction17}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction19> forPaymentInstruction19 = new MMConstraint<PaymentInstruction19>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer is not allowed.\r\nIf CreditTransferTransaction/ChargeBearer is present, then ChargeBearer is not allowed.\r\nCreditTransferTransaction/ChargeBearer and ChargeBearer may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction17;
			owner_lazy = () -> PaymentInstruction19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20
	 * PaymentInstruction20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction22
	 * ConstraintChargeBearerRule.forPaymentInstruction22}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction24
	 * ConstraintChargeBearerRule.forPaymentInstruction24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction16
	 * ConstraintChargeBearerRule.forPaymentInstruction16}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction20> forPaymentInstruction20 = new MMConstraint<PaymentInstruction20>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction22, com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction16;
			owner_lazy = () -> PaymentInstruction20.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction18
	 * ConstraintChargeBearerRule.forPaymentInstruction18}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction21> forPaymentInstruction21 = new MMConstraint<PaymentInstruction21>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then DirectDebitTransactionInformation/ChargeBearer is not allowed.\nIf DirectDebitTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nDirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction18;
			owner_lazy = () -> PaymentInstruction21.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer is not allowed.\r\nIf CreditTransferTransaction/ChargeBearer is present, then ChargeBearer is not allowed.\r\nCreditTransferTransaction/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction19
	 * ConstraintChargeBearerRule.forPaymentInstruction19}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction23> forPaymentInstruction23 = new MMConstraint<PaymentInstruction23>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer is not allowed.\r\nIf CreditTransferTransaction/ChargeBearer is present, then ChargeBearer is not allowed.\r\nCreditTransferTransaction/ChargeBearer and ChargeBearer may both be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction19;
			owner_lazy = () -> PaymentInstruction23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction20
	 * ConstraintChargeBearerRule.forPaymentInstruction20}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction22> forPaymentInstruction22 = new MMConstraint<PaymentInstruction22>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction20;
			owner_lazy = () -> PaymentInstruction22.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24
	 * PaymentInstruction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChargeBearer&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction20
	 * ConstraintChargeBearerRule.forPaymentInstruction20}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction24> forPaymentInstruction24 = new MMConstraint<PaymentInstruction24>() {
		{
			validator = ConstraintChargeBearerRule::checkPaymentInstruction24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerRule";
			definition = "If ChargeBearer is present, then CreditTransferTransactionInformation/ChargeBearer is not allowed.\nIf CreditTransferTransactionInformation/ChargeBearer is present, then ChargeBearer is not allowed.\nCreditTransferTransactionInformation/ChargeBearer and ChargeBearer may both be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction20;
			owner_lazy = () -> PaymentInstruction24.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChargeBearer</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChargeBearer</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}
	};

	/**
	 * If ChargeBearer is present, then
	 * CreditTransferTransactionInformation/ChargeBearer is not allowed. If
	 * CreditTransferTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * CreditTransferTransactionInformation/ChargeBearer and ChargeBearer may
	 * both be absent.
	 */
	public static void checkPaymentInstructionInformation1(PaymentInstructionInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * CreditTransferTransactionInformation/ChargeBearer is not allowed. If
	 * CreditTransferTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * CreditTransferTransactionInformation/ChargeBearer and ChargeBearer may
	 * both be absent.
	 */
	public static void checkPaymentInstructionInformation3(PaymentInstructionInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * CreditTransferTransactionInformation/ChargeBearer is not allowed. If
	 * CreditTransferTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * CreditTransferTransactionInformation/ChargeBearer and ChargeBearer may
	 * both be absent.
	 */
	public static void checkPaymentInstruction6(PaymentInstruction6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * CreditTransferTransactionInformation/ChargeBearer is not allowed. If
	 * CreditTransferTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * CreditTransferTransactionInformation/ChargeBearer and ChargeBearer may
	 * both be absent.
	 */
	public static void checkPaymentInstruction9(PaymentInstruction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * DirectDebitTransactionInformation/ChargeBearer is not allowed. If
	 * DirectDebitTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * DirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both
	 * be absent.
	 */
	public static void checkPaymentInstructionInformation2(PaymentInstructionInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * DirectDebitTransactionInformation/ChargeBearer is not allowed. If
	 * DirectDebitTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * DirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both
	 * be absent.
	 */
	public static void checkPaymentInstructionInformation4(PaymentInstructionInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * DirectDebitTransactionInformation/ChargeBearer is not allowed. If
	 * DirectDebitTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * DirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both
	 * be absent.
	 */
	public static void checkPaymentInstruction7(PaymentInstruction7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * DirectDebitTransactionInformation/ChargeBearer is not allowed. If
	 * DirectDebitTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * DirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both
	 * be absent.
	 */
	public static void checkPaymentInstruction10(PaymentInstruction10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer contains DEBT, then ChargesInformation may be present to
	 * communicate charges that have been added for (the) InstructedAgent(s). If
	 * ChargeBearer contains CRED, then at least one occurrence of
	 * ChargesInformation must be present to communicate charges that have been
	 * deducted from the InstructedAmount by (the) InstructingAgent(s). If
	 * ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.
	 */
	public static void checkCreditTransferTransactionInformation2(CreditTransferTransactionInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer
	 * is not allowed.<br>
	 * If CreditTransferTransaction/ChargeBearer is present, then ChargeBearer
	 * is not allowed.<br>
	 * CreditTransferTransaction/ChargeBearer and ChargeBearer may both be
	 * absent.
	 */
	public static void checkPaymentInstruction5(PaymentInstruction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer
	 * is not allowed.<br>
	 * If CreditTransferTransaction/ChargeBearer is present, then ChargeBearer
	 * is not allowed.<br>
	 * CreditTransferTransaction/ChargeBearer and ChargeBearer may both be
	 * absent.
	 */
	public static void checkPaymentInstruction8(PaymentInstruction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer
	 * is not allowed.<br>
	 * If CreditTransferTransaction/ChargeBearer is present, then ChargeBearer
	 * is not allowed.<br>
	 * CreditTransferTransaction/ChargeBearer and ChargeBearer may both be
	 * absent.
	 */
	public static void checkPaymentInstruction11(PaymentInstruction11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: (not injected) If ChargeBearer contains DEBT, then
	 * ChargesInformation may be present to communicate charges that have been
	 * added for (the) InstructedAgent(s). If ChargeBearer contains CRED, then
	 * at least one occurrence of ChargesInformation must be present to
	 * communicate charges that have been deducted from the InstructedAmount by
	 * (the) InstructingAgent(s). If ChargeBearer contains SHAR or SLEV, then
	 * ChargesInformation is optional.
	 */
	public static void checkCreditTransferTransactionInformation7(CreditTransferTransactionInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: If ChargeBearer contains DEBT, then ChargesInformation may
	 * be present to communicate charges that have been added for (the)
	 * InstructedAgent(s). If ChargeBearer contains CRED, then at least one
	 * occurrence of ChargesInformation must be present to communicate charges
	 * that have been deducted from the InstructedAmount by (the)
	 * InstructingAgent(s). If ChargeBearer contains SHAR or SLEV, then
	 * ChargesInformation is optional.
	 */
	public static void checkCreditTransferTransactionInformation9(CreditTransferTransactionInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * CreditTransferTransactionInformation/ChargeBearer is not allowed. If
	 * CreditTransferTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * CreditTransferTransactionInformation/ChargeBearer and ChargeBearer may
	 * both be absent.
	 */
	public static void checkPaymentInstruction16(PaymentInstruction16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * DirectDebitTransactionInformation/ChargeBearer is not allowed. If
	 * DirectDebitTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * DirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both
	 * be absent.
	 */
	public static void checkPaymentInstruction15(PaymentInstruction15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer
	 * is not allowed.<br>
	 * If CreditTransferTransaction/ChargeBearer is present, then ChargeBearer
	 * is not allowed.<br>
	 * CreditTransferTransaction/ChargeBearer and ChargeBearer may both be
	 * absent.
	 */
	public static void checkPaymentInstruction17(PaymentInstruction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * DirectDebitTransactionInformation/ChargeBearer is not allowed. If
	 * DirectDebitTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * DirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both
	 * be absent.
	 */
	public static void checkPaymentInstruction18(PaymentInstruction18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer
	 * is not allowed.<br>
	 * If CreditTransferTransaction/ChargeBearer is present, then ChargeBearer
	 * is not allowed.<br>
	 * CreditTransferTransaction/ChargeBearer and ChargeBearer may both be
	 * absent.
	 */
	public static void checkPaymentInstruction19(PaymentInstruction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * CreditTransferTransactionInformation/ChargeBearer is not allowed. If
	 * CreditTransferTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * CreditTransferTransactionInformation/ChargeBearer and ChargeBearer may
	 * both be absent.
	 */
	public static void checkPaymentInstruction20(PaymentInstruction20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * DirectDebitTransactionInformation/ChargeBearer is not allowed. If
	 * DirectDebitTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * DirectDebitTransactionInformation/ChargeBearer and ChargeBearer may both
	 * be absent.
	 */
	public static void checkPaymentInstruction21(PaymentInstruction21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then CreditTransferTransaction/ChargeBearer
	 * is not allowed.<br>
	 * If CreditTransferTransaction/ChargeBearer is present, then ChargeBearer
	 * is not allowed.<br>
	 * CreditTransferTransaction/ChargeBearer and ChargeBearer may both be
	 * absent.
	 */
	public static void checkPaymentInstruction23(PaymentInstruction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * CreditTransferTransactionInformation/ChargeBearer is not allowed. If
	 * CreditTransferTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * CreditTransferTransactionInformation/ChargeBearer and ChargeBearer may
	 * both be absent.
	 */
	public static void checkPaymentInstruction22(PaymentInstruction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer is present, then
	 * CreditTransferTransactionInformation/ChargeBearer is not allowed. If
	 * CreditTransferTransactionInformation/ChargeBearer is present, then
	 * ChargeBearer is not allowed.
	 * CreditTransferTransactionInformation/ChargeBearer and ChargeBearer may
	 * both be absent.
	 */
	public static void checkPaymentInstruction24(PaymentInstruction24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}