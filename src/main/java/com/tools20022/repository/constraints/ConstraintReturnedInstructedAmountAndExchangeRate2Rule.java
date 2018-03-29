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
 * If ReturnedInstructedAmount is present and the currency is the same as the
 * currency in InterbankSettlementAmount, then ExchangeRate is not allowed.
 */
public class ConstraintReturnedInstructedAmountAndExchangeRate2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2
	 * PaymentTransactionInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransactionInformation2> forPaymentTransactionInformation2 = new MMConstraint<PaymentTransactionInformation2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReturnedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed.";
			owner_lazy = () -> PaymentTransactionInformation2.mmObject();
		}

		@Override
		public void executeValidator(PaymentTransactionInformation2 obj) throws Exception {
			checkPaymentTransactionInformation2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27
	 * PaymentTransactionInformation27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnedInstructedAmount is present and the currency is the same as the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransactionInformation27> forPaymentTransactionInformation27 = new MMConstraint<PaymentTransactionInformation27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReturnedInstructedAmount is present and the currency is the same as the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is not allowed.";
			owner_lazy = () -> PaymentTransactionInformation27.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReturnedInstructedAmount/@Currency</leftOperand><rightOperand>/ReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransactionInformation27 obj) throws Exception {
			checkPaymentTransactionInformation27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34
	 * PaymentTransaction34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnedInstructedAmount is present and the currency is the same as the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransaction34> forPaymentTransaction34 = new MMConstraint<PaymentTransaction34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReturnedInstructedAmount is present and the currency is the same as the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is not allowed.";
			owner_lazy = () -> PaymentTransaction34.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReturnedInstructedAmount/@Currency</leftOperand><rightOperand>/ReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransaction34 obj) throws Exception {
			checkPaymentTransaction34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44
	 * PaymentTransaction44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnedInstructedAmount is present and the currency is the same as the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction50
	 * ConstraintReturnedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction50}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransaction44> forPaymentTransaction44 = new MMConstraint<PaymentTransaction44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReturnedInstructedAmount is present and the currency is the same as the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction50);
			owner_lazy = () -> PaymentTransaction44.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReturnedInstructedAmount/@Currency</leftOperand><rightOperand>/ReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransaction44 obj) throws Exception {
			checkPaymentTransaction44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: \nIf ReturnedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransactionInformation16> forPaymentTransactionInformation16 = new MMConstraint<PaymentTransactionInformation16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnedInstructedAmountAndExchangeRate2Rule";
			definition = "ISO20022 Rule: \nIf ReturnedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed.";
			owner_lazy = () -> PaymentTransactionInformation16.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReturnedInstructedAmount/@Currency</leftOperand><rightOperand>/ReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransactionInformation16 obj) throws Exception {
			checkPaymentTransactionInformation16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23
	 * PaymentTransactionInformation23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: \nIf ReturnedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransactionInformation23> forPaymentTransactionInformation23 = new MMConstraint<PaymentTransactionInformation23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnedInstructedAmountAndExchangeRate2Rule";
			definition = "ISO20022 Rule: \nIf ReturnedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed.";
			owner_lazy = () -> PaymentTransactionInformation23.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReturnedInstructedAmount/@Currency</leftOperand><rightOperand>/ReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransactionInformation23 obj) throws Exception {
			checkPaymentTransactionInformation23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21
	 * PaymentTransactionInformation21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: \nIf ReturnedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransactionInformation21> forPaymentTransactionInformation21 = new MMConstraint<PaymentTransactionInformation21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnedInstructedAmountAndExchangeRate2Rule";
			definition = "ISO20022 Rule: \nIf ReturnedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed.";
			owner_lazy = () -> PaymentTransactionInformation21.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReturnedInstructedAmount/@Currency</leftOperand><rightOperand>/ReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransactionInformation21 obj) throws Exception {
			checkPaymentTransactionInformation21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50
	 * PaymentTransaction50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnedInstructedAmount is present and the currency is the same as the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction65
	 * ConstraintReturnedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction65}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction44
	 * ConstraintReturnedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction44}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransaction50> forPaymentTransaction50 = new MMConstraint<PaymentTransaction50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReturnedInstructedAmount is present and the currency is the same as the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction65);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction44;
			owner_lazy = () -> PaymentTransaction50.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReturnedInstructedAmount/@Currency</leftOperand><rightOperand>/ReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransaction50 obj) throws Exception {
			checkPaymentTransaction50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65
	 * PaymentTransaction65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnedInstructedAmount is present and the currency is the same as the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction76
	 * ConstraintReturnedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction76}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction50
	 * ConstraintReturnedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction50}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransaction65> forPaymentTransaction65 = new MMConstraint<PaymentTransaction65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReturnedInstructedAmount is present and the currency is the same as the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction76);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction50;
			owner_lazy = () -> PaymentTransaction65.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReturnedInstructedAmount/@Currency</leftOperand><rightOperand>/ReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransaction65 obj) throws Exception {
			checkPaymentTransaction65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76
	 * PaymentTransaction76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnedInstructedAmount is present and the currency is the same as the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction87
	 * ConstraintReturnedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction87}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction65
	 * ConstraintReturnedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction65}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransaction76> forPaymentTransaction76 = new MMConstraint<PaymentTransaction76>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReturnedInstructedAmount is present and the currency is the same as the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction87);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction65;
			owner_lazy = () -> PaymentTransaction76.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReturnedInstructedAmount/@Currency</leftOperand><rightOperand>/ReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransaction76 obj) throws Exception {
			checkPaymentTransaction76(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87
	 * PaymentTransaction87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReturnedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnedInstructedAmount is present and the currency is the same as the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction76
	 * ConstraintReturnedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction76}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransaction87> forPaymentTransaction87 = new MMConstraint<PaymentTransaction87>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReturnedInstructedAmount is present and the currency is the same as the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReturnedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction76;
			owner_lazy = () -> PaymentTransaction87.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReturnedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReturnedInstructedAmount/@Currency</leftOperand><rightOperand>/ReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransaction87 obj) throws Exception {
			checkPaymentTransaction87(obj);
		}
	};

	/**
	 * If ReturnedInstructedAmount is present and the currency is the same as
	 * the currency in InterbankSettlementAmount, then ExchangeRate is not
	 * allowed.
	 */
	public static void checkPaymentTransactionInformation2(PaymentTransactionInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnedInstructedAmount is present and the currency is the same as
	 * the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is
	 * not allowed.
	 */
	public static void checkPaymentTransactionInformation27(PaymentTransactionInformation27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnedInstructedAmount is present and the currency is the same as
	 * the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is
	 * not allowed.
	 */
	public static void checkPaymentTransaction34(PaymentTransaction34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnedInstructedAmount is present and the currency is the same as
	 * the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is
	 * not allowed.
	 */
	public static void checkPaymentTransaction44(PaymentTransaction44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: If ReturnedInstructedAmount is present and the currency is
	 * the same as the currency in InterbankSettlementAmount, then ExchangeRate
	 * is not allowed.
	 */
	public static void checkPaymentTransactionInformation16(PaymentTransactionInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: If ReturnedInstructedAmount is present and the currency is
	 * the same as the currency in InterbankSettlementAmount, then ExchangeRate
	 * is not allowed.
	 */
	public static void checkPaymentTransactionInformation23(PaymentTransactionInformation23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: If ReturnedInstructedAmount is present and the currency is
	 * the same as the currency in InterbankSettlementAmount, then ExchangeRate
	 * is not allowed.
	 */
	public static void checkPaymentTransactionInformation21(PaymentTransactionInformation21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnedInstructedAmount is present and the currency is the same as
	 * the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is
	 * not allowed.
	 */
	public static void checkPaymentTransaction50(PaymentTransaction50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnedInstructedAmount is present and the currency is the same as
	 * the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is
	 * not allowed.
	 */
	public static void checkPaymentTransaction65(PaymentTransaction65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnedInstructedAmount is present and the currency is the same as
	 * the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is
	 * not allowed.
	 */
	public static void checkPaymentTransaction76(PaymentTransaction76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnedInstructedAmount is present and the currency is the same as
	 * the currency in ReturnedInterbankSettlementAmount, then ExchangeRate is
	 * not allowed.
	 */
	public static void checkPaymentTransaction87(PaymentTransaction87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}