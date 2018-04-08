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
 * If at least one occurrence of
 * InterbankSettlementAmount/CurrencyAndAmountRange is present, then no
 * occurrence of InterbankSettlementAmountCurrency is allowed. If
 * InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any
 * occurrence of InterbankSettlementAmountCurrency is optional.
 */
public class ConstraintSettlementAmountCurrencyRule {

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
	 * name} = "SettlementAmountCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InterbankSettlementAmount/CurrencyAndAmountRange is present, then no occurrence of InterbankSettlementAmountCurrency is allowed.\nIf InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any occurrence of InterbankSettlementAmountCurrency is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch3> forPaymentSearch3 = new MMConstraint<PaymentSearch3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRule";
			definition = "If at least one occurrence of InterbankSettlementAmount/CurrencyAndAmountRange is present, then no occurrence of InterbankSettlementAmountCurrency is allowed.\nIf InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any occurrence of InterbankSettlementAmountCurrency is optional.";
			owner_lazy = () -> PaymentSearch3.mmObject();
		}

		@Override
		public void executeValidator(PaymentSearch3 obj) throws Exception {
			checkPaymentSearch3(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InterbankSettlementAmountCurrency[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InterbankSettlementAmount[*]/CurrencyAndAmountRange&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InterbankSettlementAmount/CurrencyAndAmountRange is present, then no occurrence of InterbankSettlementAmountCurrency is allowed.\nIf InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any occurrence of InterbankSettlementAmountCurrency is optional."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule#forPaymentSearch6
	 * ConstraintSettlementAmountCurrencyRule.forPaymentSearch6}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule#forPaymentSearch4
	 * ConstraintSettlementAmountCurrencyRule.forPaymentSearch4}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch5> forPaymentSearch5 = new MMConstraint<PaymentSearch5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRule";
			definition = "If at least one occurrence of InterbankSettlementAmount/CurrencyAndAmountRange is present, then no occurrence of InterbankSettlementAmountCurrency is allowed.\nIf InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any occurrence of InterbankSettlementAmountCurrency is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule.forPaymentSearch6);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule.forPaymentSearch4;
			owner_lazy = () -> PaymentSearch5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InterbankSettlementAmountCurrency[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InterbankSettlementAmount[*]/CurrencyAndAmountRange</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(PaymentSearch5 obj) throws Exception {
			checkPaymentSearch5(obj);
		}
	};
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
	 * name} = "SettlementAmountCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InterbankSettlementAmount/CurrencyAndAmountRange is present, then no occurrence of InterbankSettlementAmountCurrency is allowed.\nIf InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any occurrence of InterbankSettlementAmountCurrency is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch2> forPaymentSearch2 = new MMConstraint<PaymentSearch2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRule";
			definition = "If at least one occurrence of InterbankSettlementAmount/CurrencyAndAmountRange is present, then no occurrence of InterbankSettlementAmountCurrency is allowed.\nIf InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any occurrence of InterbankSettlementAmountCurrency is optional.";
			owner_lazy = () -> PaymentSearch2.mmObject();
		}

		@Override
		public void executeValidator(PaymentSearch2 obj) throws Exception {
			checkPaymentSearch2(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InterbankSettlementAmountCurrency[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InterbankSettlementAmount[*]/CurrencyAndAmountRange&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InterbankSettlementAmount/CurrencyAndAmountRange is present, then no occurrence of InterbankSettlementAmountCurrency is allowed.\nIf InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any occurrence of InterbankSettlementAmountCurrency is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule#forPaymentSearch6
	 * ConstraintSettlementAmountCurrencyRule.forPaymentSearch6}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch7> forPaymentSearch7 = new MMConstraint<PaymentSearch7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRule";
			definition = "If at least one occurrence of InterbankSettlementAmount/CurrencyAndAmountRange is present, then no occurrence of InterbankSettlementAmountCurrency is allowed.\nIf InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any occurrence of InterbankSettlementAmountCurrency is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule.forPaymentSearch6;
			owner_lazy = () -> PaymentSearch7.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InterbankSettlementAmountCurrency[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InterbankSettlementAmount[*]/CurrencyAndAmountRange</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(PaymentSearch7 obj) throws Exception {
			checkPaymentSearch7(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InterbankSettlementAmountCurrency[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InterbankSettlementAmount[*]/CurrencyAndAmountRange&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InterbankSettlementAmount/CurrencyAndAmountRange is present, then no occurrence of InterbankSettlementAmountCurrency is allowed.\nIf InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any occurrence of InterbankSettlementAmountCurrency is optional."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule#forPaymentSearch5
	 * ConstraintSettlementAmountCurrencyRule.forPaymentSearch5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch4> forPaymentSearch4 = new MMConstraint<PaymentSearch4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRule";
			definition = "If at least one occurrence of InterbankSettlementAmount/CurrencyAndAmountRange is present, then no occurrence of InterbankSettlementAmountCurrency is allowed.\nIf InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any occurrence of InterbankSettlementAmountCurrency is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule.forPaymentSearch5);
			owner_lazy = () -> PaymentSearch4.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InterbankSettlementAmountCurrency[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InterbankSettlementAmount[*]/CurrencyAndAmountRange</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(PaymentSearch4 obj) throws Exception {
			checkPaymentSearch4(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InterbankSettlementAmountCurrency[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InterbankSettlementAmount[*]/CurrencyAndAmountRange&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of InterbankSettlementAmount/CurrencyAndAmountRange is present, then no occurrence of InterbankSettlementAmountCurrency is allowed.\nIf InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any occurrence of InterbankSettlementAmountCurrency is optional."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule#forPaymentSearch7
	 * ConstraintSettlementAmountCurrencyRule.forPaymentSearch7}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule#forPaymentSearch5
	 * ConstraintSettlementAmountCurrencyRule.forPaymentSearch5}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentSearch6> forPaymentSearch6 = new MMConstraint<PaymentSearch6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRule";
			definition = "If at least one occurrence of InterbankSettlementAmount/CurrencyAndAmountRange is present, then no occurrence of InterbankSettlementAmountCurrency is allowed.\nIf InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any occurrence of InterbankSettlementAmountCurrency is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule.forPaymentSearch7);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule.forPaymentSearch5;
			owner_lazy = () -> PaymentSearch6.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InterbankSettlementAmountCurrency[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InterbankSettlementAmount[*]/CurrencyAndAmountRange</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(PaymentSearch6 obj) throws Exception {
			checkPaymentSearch6(obj);
		}
	};

	/**
	 * If at least one occurrence of
	 * InterbankSettlementAmount/CurrencyAndAmountRange is present, then no
	 * occurrence of InterbankSettlementAmountCurrency is allowed. If
	 * InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any
	 * occurrence of InterbankSettlementAmountCurrency is optional.
	 */
	public static void checkPaymentSearch3(PaymentSearch3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of
	 * InterbankSettlementAmount/CurrencyAndAmountRange is present, then no
	 * occurrence of InterbankSettlementAmountCurrency is allowed. If
	 * InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any
	 * occurrence of InterbankSettlementAmountCurrency is optional.
	 */
	public static void checkPaymentSearch5(PaymentSearch5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of
	 * InterbankSettlementAmount/CurrencyAndAmountRange is present, then no
	 * occurrence of InterbankSettlementAmountCurrency is allowed. If
	 * InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any
	 * occurrence of InterbankSettlementAmountCurrency is optional.
	 */
	public static void checkPaymentSearch2(PaymentSearch2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of
	 * InterbankSettlementAmount/CurrencyAndAmountRange is present, then no
	 * occurrence of InterbankSettlementAmountCurrency is allowed. If
	 * InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any
	 * occurrence of InterbankSettlementAmountCurrency is optional.
	 */
	public static void checkPaymentSearch7(PaymentSearch7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of
	 * InterbankSettlementAmount/CurrencyAndAmountRange is present, then no
	 * occurrence of InterbankSettlementAmountCurrency is allowed. If
	 * InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any
	 * occurrence of InterbankSettlementAmountCurrency is optional.
	 */
	public static void checkPaymentSearch4(PaymentSearch4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of
	 * InterbankSettlementAmount/CurrencyAndAmountRange is present, then no
	 * occurrence of InterbankSettlementAmountCurrency is allowed. If
	 * InterbankSettlementAmount/CurrencyAndAmountRange is not present, then any
	 * occurrence of InterbankSettlementAmountCurrency is optional.
	 */
	public static void checkPaymentSearch6(PaymentSearch6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}