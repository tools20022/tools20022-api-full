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
 * If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is
 * present, then no occurrence of InstructedAmountCurrency is allowed. If
 * InstructedAmount/CurrencyAndAmountRange is not present, then any occurrence
 * of InstructedAmountCurrency is optional.
 */
public class ConstraintInstructedAmountCurrencyRule {

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
	 * name} = "InstructedAmountCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is present, then no occurrence of InstructedAmountCurrency is allowed.\nIf InstructedAmount/CurrencyAndAmountRange is not present, then any occurrence of InstructedAmountCurrency is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch2> forPaymentSearch2 = new MMConstraint<PaymentSearch2>() {
		{
			validator = ConstraintInstructedAmountCurrencyRule::checkPaymentSearch2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountCurrencyRule";
			definition = "If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is present, then no occurrence of InstructedAmountCurrency is allowed.\nIf InstructedAmount/CurrencyAndAmountRange is not present, then any occurrence of InstructedAmountCurrency is optional.";
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
	 * name} = "InstructedAmountCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is present, then no occurrence of InstructedAmountCurrency is allowed.\nIf InstructedAmount/CurrencyAndAmountRange is not present, then any occurrence of InstructedAmountCurrency is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch3> forPaymentSearch3 = new MMConstraint<PaymentSearch3>() {
		{
			validator = ConstraintInstructedAmountCurrencyRule::checkPaymentSearch3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountCurrencyRule";
			definition = "If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is present, then no occurrence of InstructedAmountCurrency is allowed.\nIf InstructedAmount/CurrencyAndAmountRange is not present, then any occurrence of InstructedAmountCurrency is optional.";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructedAmountCurrency[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructedAmount[*]/CurrencyAndAmountRange/Currency&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is present, then no occurrence of InstructedAmountCurrency is allowed.\nIf InstructedAmount/CurrencyAndAmountRange is not present, then any occurrence of InstructedAmountCurrency is optional."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule#forPaymentSearch5
	 * ConstraintInstructedAmountCurrencyRule.forPaymentSearch5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch4> forPaymentSearch4 = new MMConstraint<PaymentSearch4>() {
		{
			validator = ConstraintInstructedAmountCurrencyRule::checkPaymentSearch4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountCurrencyRule";
			definition = "If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is present, then no occurrence of InstructedAmountCurrency is allowed.\nIf InstructedAmount/CurrencyAndAmountRange is not present, then any occurrence of InstructedAmountCurrency is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule.forPaymentSearch5);
			owner_lazy = () -> PaymentSearch4.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructedAmountCurrency[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructedAmount[*]/CurrencyAndAmountRange/Currency</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructedAmountCurrency[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructedAmount[*]/CurrencyAndAmountRange/Currency&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is present, then no occurrence of InstructedAmountCurrency is allowed.\nIf InstructedAmount/CurrencyAndAmountRange is not present, then any occurrence of InstructedAmountCurrency is optional."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule#forPaymentSearch6
	 * ConstraintInstructedAmountCurrencyRule.forPaymentSearch6}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule#forPaymentSearch4
	 * ConstraintInstructedAmountCurrencyRule.forPaymentSearch4}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch5> forPaymentSearch5 = new MMConstraint<PaymentSearch5>() {
		{
			validator = ConstraintInstructedAmountCurrencyRule::checkPaymentSearch5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountCurrencyRule";
			definition = "If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is present, then no occurrence of InstructedAmountCurrency is allowed.\nIf InstructedAmount/CurrencyAndAmountRange is not present, then any occurrence of InstructedAmountCurrency is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule.forPaymentSearch6);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule.forPaymentSearch4;
			owner_lazy = () -> PaymentSearch5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructedAmountCurrency[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructedAmount[*]/CurrencyAndAmountRange/Currency</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6 PaymentSearch6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructedAmountCurrency[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructedAmount[*]/CurrencyAndAmountRange/Currency&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is present, then no occurrence of InstructedAmountCurrency is allowed.\nIf InstructedAmount/CurrencyAndAmountRange is not present, then any occurrence of InstructedAmountCurrency is optional."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule#forPaymentSearch7
	 * ConstraintInstructedAmountCurrencyRule.forPaymentSearch7}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule#forPaymentSearch5
	 * ConstraintInstructedAmountCurrencyRule.forPaymentSearch5}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch6> forPaymentSearch6 = new MMConstraint<PaymentSearch6>() {
		{
			validator = ConstraintInstructedAmountCurrencyRule::checkPaymentSearch6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountCurrencyRule";
			definition = "If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is present, then no occurrence of InstructedAmountCurrency is allowed.\nIf InstructedAmount/CurrencyAndAmountRange is not present, then any occurrence of InstructedAmountCurrency is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule.forPaymentSearch7);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule.forPaymentSearch5;
			owner_lazy = () -> PaymentSearch6.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructedAmountCurrency[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructedAmount[*]/CurrencyAndAmountRange/Currency</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch7 PaymentSearch7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructedAmountCurrency[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructedAmount[*]/CurrencyAndAmountRange/Currency&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is present, then no occurrence of InstructedAmountCurrency is allowed.\nIf InstructedAmount/CurrencyAndAmountRange is not present, then any occurrence of InstructedAmountCurrency is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule#forPaymentSearch6
	 * ConstraintInstructedAmountCurrencyRule.forPaymentSearch6}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch7> forPaymentSearch7 = new MMConstraint<PaymentSearch7>() {
		{
			validator = ConstraintInstructedAmountCurrencyRule::checkPaymentSearch7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountCurrencyRule";
			definition = "If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is present, then no occurrence of InstructedAmountCurrency is allowed.\nIf InstructedAmount/CurrencyAndAmountRange is not present, then any occurrence of InstructedAmountCurrency is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule.forPaymentSearch6;
			owner_lazy = () -> PaymentSearch7.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructedAmountCurrency[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructedAmount[*]/CurrencyAndAmountRange/Currency</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is
	 * present, then no occurrence of InstructedAmountCurrency is allowed. If
	 * InstructedAmount/CurrencyAndAmountRange is not present, then any
	 * occurrence of InstructedAmountCurrency is optional.
	 */
	public static void checkPaymentSearch2(PaymentSearch2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is
	 * present, then no occurrence of InstructedAmountCurrency is allowed. If
	 * InstructedAmount/CurrencyAndAmountRange is not present, then any
	 * occurrence of InstructedAmountCurrency is optional.
	 */
	public static void checkPaymentSearch3(PaymentSearch3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is
	 * present, then no occurrence of InstructedAmountCurrency is allowed. If
	 * InstructedAmount/CurrencyAndAmountRange is not present, then any
	 * occurrence of InstructedAmountCurrency is optional.
	 */
	public static void checkPaymentSearch4(PaymentSearch4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is
	 * present, then no occurrence of InstructedAmountCurrency is allowed. If
	 * InstructedAmount/CurrencyAndAmountRange is not present, then any
	 * occurrence of InstructedAmountCurrency is optional.
	 */
	public static void checkPaymentSearch5(PaymentSearch5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is
	 * present, then no occurrence of InstructedAmountCurrency is allowed. If
	 * InstructedAmount/CurrencyAndAmountRange is not present, then any
	 * occurrence of InstructedAmountCurrency is optional.
	 */
	public static void checkPaymentSearch6(PaymentSearch6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of InstructedAmount/CurrencyAndAmountRange is
	 * present, then no occurrence of InstructedAmountCurrency is allowed. If
	 * InstructedAmount/CurrencyAndAmountRange is not present, then any
	 * occurrence of InstructedAmountCurrency is optional.
	 */
	public static void checkPaymentSearch7(PaymentSearch7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}