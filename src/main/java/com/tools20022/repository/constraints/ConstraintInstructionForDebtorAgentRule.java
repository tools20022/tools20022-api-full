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
 * If InstructionForDebtorAgent is present, then
 * CreditTransferTransactionInformation/InstructionForDebtorAgent is not
 * allowed.<br>
 * If CreditTransferTransactionInformation/InstructionForDebtorAgent is present,
 * then InstructionForDebtorAgent is not allowed.<br>
 * CreditTransferTransactionInformation/InstructionForDebtorAgent and
 * InstructionForDebtorAgent may both be absent.
 */
public class ConstraintInstructionForDebtorAgentRule {

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
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructionForDebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InstructionForDebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForDebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionForDebtorAgent is present, then CreditTransferTransactionInformation/InstructionForDebtorAgent is not allowed.\r\nIf CreditTransferTransactionInformation/InstructionForDebtorAgent is present, then InstructionForDebtorAgent is not allowed.\r\nCreditTransferTransactionInformation/InstructionForDebtorAgent and InstructionForDebtorAgent may both be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction6> forPaymentInstruction6 = new MMConstraint<PaymentInstruction6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForDebtorAgentRule";
			definition = "If InstructionForDebtorAgent is present, then CreditTransferTransactionInformation/InstructionForDebtorAgent is not allowed.\r\nIf CreditTransferTransactionInformation/InstructionForDebtorAgent is present, then InstructionForDebtorAgent is not allowed.\r\nCreditTransferTransactionInformation/InstructionForDebtorAgent and InstructionForDebtorAgent may both be absent.";
			owner_lazy = () -> PaymentInstruction6.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructionForDebtorAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InstructionForDebtorAgent</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(PaymentInstruction6 obj) throws Exception {
			checkPaymentInstruction6(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructionForDebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InstructionForDebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForDebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionForDebtorAgent is present, then CreditTransferTransactionInformation/InstructionForDebtorAgent is not allowed.\r\nIf CreditTransferTransactionInformation/InstructionForDebtorAgent is present, then InstructionForDebtorAgent is not allowed.\r\nCreditTransferTransactionInformation/InstructionForDebtorAgent and InstructionForDebtorAgent may both be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionForDebtorAgentRule#forPaymentInstruction20
	 * ConstraintInstructionForDebtorAgentRule.forPaymentInstruction20}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction22> forPaymentInstruction22 = new MMConstraint<PaymentInstruction22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForDebtorAgentRule";
			definition = "If InstructionForDebtorAgent is present, then CreditTransferTransactionInformation/InstructionForDebtorAgent is not allowed.\r\nIf CreditTransferTransactionInformation/InstructionForDebtorAgent is present, then InstructionForDebtorAgent is not allowed.\r\nCreditTransferTransactionInformation/InstructionForDebtorAgent and InstructionForDebtorAgent may both be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInstructionForDebtorAgentRule.forPaymentInstruction20;
			owner_lazy = () -> PaymentInstruction22.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructionForDebtorAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InstructionForDebtorAgent</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(PaymentInstruction22 obj) throws Exception {
			checkPaymentInstruction22(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructionForDebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InstructionForDebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForDebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionForDebtorAgent is present, then CreditTransferTransactionInformation/InstructionForDebtorAgent is not allowed.\r\nIf CreditTransferTransactionInformation/InstructionForDebtorAgent is present, then InstructionForDebtorAgent is not allowed.\r\nCreditTransferTransactionInformation/InstructionForDebtorAgent and InstructionForDebtorAgent may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionForDebtorAgentRule#forPaymentInstruction20
	 * ConstraintInstructionForDebtorAgentRule.forPaymentInstruction20}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionForDebtorAgentRule#forPaymentInstruction9
	 * ConstraintInstructionForDebtorAgentRule.forPaymentInstruction9}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction16> forPaymentInstruction16 = new MMConstraint<PaymentInstruction16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForDebtorAgentRule";
			definition = "If InstructionForDebtorAgent is present, then CreditTransferTransactionInformation/InstructionForDebtorAgent is not allowed.\r\nIf CreditTransferTransactionInformation/InstructionForDebtorAgent is present, then InstructionForDebtorAgent is not allowed.\r\nCreditTransferTransactionInformation/InstructionForDebtorAgent and InstructionForDebtorAgent may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructionForDebtorAgentRule.forPaymentInstruction20);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInstructionForDebtorAgentRule.forPaymentInstruction9;
			owner_lazy = () -> PaymentInstruction16.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructionForDebtorAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InstructionForDebtorAgent</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(PaymentInstruction16 obj) throws Exception {
			checkPaymentInstruction16(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructionForDebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InstructionForDebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForDebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionForDebtorAgent is present, then CreditTransferTransactionInformation/InstructionForDebtorAgent is not allowed.\r\nIf CreditTransferTransactionInformation/InstructionForDebtorAgent is present, then InstructionForDebtorAgent is not allowed.\r\nCreditTransferTransactionInformation/InstructionForDebtorAgent and InstructionForDebtorAgent may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionForDebtorAgentRule#forPaymentInstruction22
	 * ConstraintInstructionForDebtorAgentRule.forPaymentInstruction22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionForDebtorAgentRule#forPaymentInstruction16
	 * ConstraintInstructionForDebtorAgentRule.forPaymentInstruction16}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction20> forPaymentInstruction20 = new MMConstraint<PaymentInstruction20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForDebtorAgentRule";
			definition = "If InstructionForDebtorAgent is present, then CreditTransferTransactionInformation/InstructionForDebtorAgent is not allowed.\r\nIf CreditTransferTransactionInformation/InstructionForDebtorAgent is present, then InstructionForDebtorAgent is not allowed.\r\nCreditTransferTransactionInformation/InstructionForDebtorAgent and InstructionForDebtorAgent may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructionForDebtorAgentRule.forPaymentInstruction22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInstructionForDebtorAgentRule.forPaymentInstruction16;
			owner_lazy = () -> PaymentInstruction20.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructionForDebtorAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InstructionForDebtorAgent</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(PaymentInstruction20 obj) throws Exception {
			checkPaymentInstruction20(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructionForDebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InstructionForDebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForDebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionForDebtorAgent is present, then CreditTransferTransactionInformation/InstructionForDebtorAgent is not allowed.\r\nIf CreditTransferTransactionInformation/InstructionForDebtorAgent is present, then InstructionForDebtorAgent is not allowed.\r\nCreditTransferTransactionInformation/InstructionForDebtorAgent and InstructionForDebtorAgent may both be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionForDebtorAgentRule#forPaymentInstruction16
	 * ConstraintInstructionForDebtorAgentRule.forPaymentInstruction16}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction9> forPaymentInstruction9 = new MMConstraint<PaymentInstruction9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForDebtorAgentRule";
			definition = "If InstructionForDebtorAgent is present, then CreditTransferTransactionInformation/InstructionForDebtorAgent is not allowed.\r\nIf CreditTransferTransactionInformation/InstructionForDebtorAgent is present, then InstructionForDebtorAgent is not allowed.\r\nCreditTransferTransactionInformation/InstructionForDebtorAgent and InstructionForDebtorAgent may both be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructionForDebtorAgentRule.forPaymentInstruction16);
			owner_lazy = () -> PaymentInstruction9.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructionForDebtorAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InstructionForDebtorAgent</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(PaymentInstruction9 obj) throws Exception {
			checkPaymentInstruction9(obj);
		}
	};

	/**
	 * If InstructionForDebtorAgent is present, then
	 * CreditTransferTransactionInformation/InstructionForDebtorAgent is not
	 * allowed.<br>
	 * If CreditTransferTransactionInformation/InstructionForDebtorAgent is
	 * present, then InstructionForDebtorAgent is not allowed.<br>
	 * CreditTransferTransactionInformation/InstructionForDebtorAgent and
	 * InstructionForDebtorAgent may both be absent.
	 */
	public static void checkPaymentInstruction6(PaymentInstruction6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionForDebtorAgent is present, then
	 * CreditTransferTransactionInformation/InstructionForDebtorAgent is not
	 * allowed.<br>
	 * If CreditTransferTransactionInformation/InstructionForDebtorAgent is
	 * present, then InstructionForDebtorAgent is not allowed.<br>
	 * CreditTransferTransactionInformation/InstructionForDebtorAgent and
	 * InstructionForDebtorAgent may both be absent.
	 */
	public static void checkPaymentInstruction22(PaymentInstruction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionForDebtorAgent is present, then
	 * CreditTransferTransactionInformation/InstructionForDebtorAgent is not
	 * allowed.<br>
	 * If CreditTransferTransactionInformation/InstructionForDebtorAgent is
	 * present, then InstructionForDebtorAgent is not allowed.<br>
	 * CreditTransferTransactionInformation/InstructionForDebtorAgent and
	 * InstructionForDebtorAgent may both be absent.
	 */
	public static void checkPaymentInstruction16(PaymentInstruction16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionForDebtorAgent is present, then
	 * CreditTransferTransactionInformation/InstructionForDebtorAgent is not
	 * allowed.<br>
	 * If CreditTransferTransactionInformation/InstructionForDebtorAgent is
	 * present, then InstructionForDebtorAgent is not allowed.<br>
	 * CreditTransferTransactionInformation/InstructionForDebtorAgent and
	 * InstructionForDebtorAgent may both be absent.
	 */
	public static void checkPaymentInstruction20(PaymentInstruction20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionForDebtorAgent is present, then
	 * CreditTransferTransactionInformation/InstructionForDebtorAgent is not
	 * allowed.<br>
	 * If CreditTransferTransactionInformation/InstructionForDebtorAgent is
	 * present, then InstructionForDebtorAgent is not allowed.<br>
	 * CreditTransferTransactionInformation/InstructionForDebtorAgent and
	 * InstructionForDebtorAgent may both be absent.
	 */
	public static void checkPaymentInstruction9(PaymentInstruction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}