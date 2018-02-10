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
import com.tools20022.repository.msg.PaymentSearch2;
import com.tools20022.repository.msg.PaymentSearch3;
import com.tools20022.repository.msg.PaymentSearch4;
import com.tools20022.repository.msg.PaymentSearch5;
import java.util.Arrays;

/**
 * If at least one occurrence of
 * InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is
 * present, then CreditDebitIndicator is not allowed. If
 * InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is not
 * present, then CreditDebitIndicator is optional.
 */
public class ConstraintInstructedAmountCreditDebitIndicator2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2 PaymentSearch2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountCreditDebitIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\nIf InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch2> forPaymentSearch2 = new MMConstraint<PaymentSearch2>() {
		{
			validator = ConstraintInstructedAmountCreditDebitIndicator2Rule::checkPaymentSearch2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountCreditDebitIndicator2Rule";
			definition = "If at least one occurrence of InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\nIf InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional.";
			owner_lazy = () -> PaymentSearch2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountCreditDebitIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\nIf InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch3> forPaymentSearch3 = new MMConstraint<PaymentSearch3>() {
		{
			validator = ConstraintInstructedAmountCreditDebitIndicator2Rule::checkPaymentSearch3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountCreditDebitIndicator2Rule";
			definition = "If at least one occurrence of InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\nIf InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional.";
			owner_lazy = () -> PaymentSearch3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4 PaymentSearch4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructedAmount[*]/ImpliedCurrencyAndAmountRange/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountCreditDebitIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\nIf InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountCreditDebitIndicator2Rule#forPaymentSearch5
	 * ConstraintInstructedAmountCreditDebitIndicator2Rule.forPaymentSearch5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch4> forPaymentSearch4 = new MMConstraint<PaymentSearch4>() {
		{
			validator = ConstraintInstructedAmountCreditDebitIndicator2Rule::checkPaymentSearch4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountCreditDebitIndicator2Rule";
			definition = "If at least one occurrence of InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\nIf InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAmountCreditDebitIndicator2Rule.forPaymentSearch5);
			owner_lazy = () -> PaymentSearch4.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditDebitIndicator</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructedAmount[*]/ImpliedCurrencyAndAmountRange/CreditDebitIndicator</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructedAmount[*]/ImpliedCurrencyAndAmountRange/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountCreditDebitIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\nIf InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountCreditDebitIndicator2Rule#forPaymentSearch4
	 * ConstraintInstructedAmountCreditDebitIndicator2Rule.forPaymentSearch4}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch5> forPaymentSearch5 = new MMConstraint<PaymentSearch5>() {
		{
			validator = ConstraintInstructedAmountCreditDebitIndicator2Rule::checkPaymentSearch5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountCreditDebitIndicator2Rule";
			definition = "If at least one occurrence of InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\nIf InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInstructedAmountCreditDebitIndicator2Rule.forPaymentSearch4;
			owner_lazy = () -> PaymentSearch5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditDebitIndicator</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructedAmount[*]/ImpliedCurrencyAndAmountRange/CreditDebitIndicator</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If at least one occurrence of
	 * InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is
	 * present, then CreditDebitIndicator is not allowed. If
	 * InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is
	 * not present, then CreditDebitIndicator is optional.
	 */
	public static void checkPaymentSearch2(PaymentSearch2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of
	 * InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is
	 * present, then CreditDebitIndicator is not allowed. If
	 * InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is
	 * not present, then CreditDebitIndicator is optional.
	 */
	public static void checkPaymentSearch3(PaymentSearch3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of
	 * InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is
	 * present, then CreditDebitIndicator is not allowed. If
	 * InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is
	 * not present, then CreditDebitIndicator is optional.
	 */
	public static void checkPaymentSearch4(PaymentSearch4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of
	 * InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is
	 * present, then CreditDebitIndicator is not allowed. If
	 * InstructedAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator is
	 * not present, then CreditDebitIndicator is optional.
	 */
	public static void checkPaymentSearch5(PaymentSearch5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}