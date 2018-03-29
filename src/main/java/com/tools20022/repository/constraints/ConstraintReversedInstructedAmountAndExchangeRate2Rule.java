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
 * If ReversedInstructedAmount is present and the currency is the same as the
 * currency in InterbankSettlementAmount, then ExchangeRate is not allowed.
 */
public class ConstraintReversedInstructedAmountAndExchangeRate2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5
	 * PaymentTransactionInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransactionInformation5> forPaymentTransactionInformation5 = new MMConstraint<PaymentTransactionInformation5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed.";
			owner_lazy = () -> PaymentTransactionInformation5.mmObject();
		}

		@Override
		public void executeValidator(PaymentTransactionInformation5 obj) throws Exception {
			checkPaymentTransactionInformation5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29
	 * PaymentTransactionInformation29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransactionInformation29> forPaymentTransactionInformation29 = new MMConstraint<PaymentTransactionInformation29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed.";
			owner_lazy = () -> PaymentTransactionInformation29.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReversedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReversedInstructedAmount/@Currency</leftOperand><rightOperand>/ReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransactionInformation29 obj) throws Exception {
			checkPaymentTransactionInformation29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36
	 * PaymentTransaction36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransaction36> forPaymentTransaction36 = new MMConstraint<PaymentTransaction36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed.";
			owner_lazy = () -> PaymentTransaction36.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReversedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReversedInstructedAmount/@Currency</leftOperand><rightOperand>/ReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransaction36 obj) throws Exception {
			checkPaymentTransaction36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45
	 * PaymentTransaction45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction51
	 * ConstraintReversedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction51}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransaction45> forPaymentTransaction45 = new MMConstraint<PaymentTransaction45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction51);
			owner_lazy = () -> PaymentTransaction45.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReversedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReversedInstructedAmount/@Currency</leftOperand><rightOperand>/ReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransaction45 obj) throws Exception {
			checkPaymentTransaction45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17
	 * PaymentTransactionInformation17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: \nIf ReversedInstructedAmount is present and the currency is the same as the currency in ReversedInterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransactionInformation17> forPaymentTransactionInformation17 = new MMConstraint<PaymentTransactionInformation17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInstructedAmountAndExchangeRate2Rule";
			definition = "ISO20022 Rule: \nIf ReversedInstructedAmount is present and the currency is the same as the currency in ReversedInterbankSettlementAmount, then ExchangeRate is not allowed.";
			owner_lazy = () -> PaymentTransactionInformation17.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReversedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReversedInstructedAmount/@Currency</leftOperand><rightOperand>/ReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransactionInformation17 obj) throws Exception {
			checkPaymentTransactionInformation17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: \nIf ReversedInstructedAmount is present and the currency is the same as the currency in ReversedInterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransactionInformation24> forPaymentTransactionInformation24 = new MMConstraint<PaymentTransactionInformation24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInstructedAmountAndExchangeRate2Rule";
			definition = "ISO20022 Rule: \nIf ReversedInstructedAmount is present and the currency is the same as the currency in ReversedInterbankSettlementAmount, then ExchangeRate is not allowed.";
			owner_lazy = () -> PaymentTransactionInformation24.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReversedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReversedInstructedAmount/@Currency</leftOperand><rightOperand>/ReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransactionInformation24 obj) throws Exception {
			checkPaymentTransactionInformation24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction60
	 * ConstraintReversedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction60}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction45
	 * ConstraintReversedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction45}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransaction51> forPaymentTransaction51 = new MMConstraint<PaymentTransaction51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction60);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction45;
			owner_lazy = () -> PaymentTransaction51.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReversedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReversedInstructedAmount/@Currency</leftOperand><rightOperand>/ReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransaction51 obj) throws Exception {
			checkPaymentTransaction51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60
	 * PaymentTransaction60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction81
	 * ConstraintReversedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction81}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction51
	 * ConstraintReversedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction51}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransaction60> forPaymentTransaction60 = new MMConstraint<PaymentTransaction60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction81);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction51;
			owner_lazy = () -> PaymentTransaction60.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReversedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReversedInstructedAmount/@Currency</leftOperand><rightOperand>/ReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransaction60 obj) throws Exception {
			checkPaymentTransaction60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81
	 * PaymentTransaction81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction88
	 * ConstraintReversedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction88}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction60
	 * ConstraintReversedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction60}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransaction81> forPaymentTransaction81 = new MMConstraint<PaymentTransaction81>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction88);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction60;
			owner_lazy = () -> PaymentTransaction81.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReversedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReversedInstructedAmount/@Currency</leftOperand><rightOperand>/ReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransaction81 obj) throws Exception {
			checkPaymentTransaction81(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88
	 * PaymentTransaction88}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReversedInstructedAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInstructedAmountAndExchangeRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction81
	 * ConstraintReversedInstructedAmountAndExchangeRate2Rule.
	 * forPaymentTransaction81}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransaction88> forPaymentTransaction88 = new MMConstraint<PaymentTransaction88>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInstructedAmountAndExchangeRate2Rule";
			definition = "If ReversedInstructedAmount is present and the currency is the same as the currency in InterbankSettlementAmount, then ExchangeRate is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction81;
			owner_lazy = () -> PaymentTransaction88.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ExchangeRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReversedInstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReversedInstructedAmount/@Currency</leftOperand><rightOperand>/ReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransaction88 obj) throws Exception {
			checkPaymentTransaction88(obj);
		}
	};

	/**
	 * If ReversedInstructedAmount is present and the currency is the same as
	 * the currency in InterbankSettlementAmount, then ExchangeRate is not
	 * allowed.
	 */
	public static void checkPaymentTransactionInformation5(PaymentTransactionInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReversedInstructedAmount is present and the currency is the same as
	 * the currency in InterbankSettlementAmount, then ExchangeRate is not
	 * allowed.
	 */
	public static void checkPaymentTransactionInformation29(PaymentTransactionInformation29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReversedInstructedAmount is present and the currency is the same as
	 * the currency in InterbankSettlementAmount, then ExchangeRate is not
	 * allowed.
	 */
	public static void checkPaymentTransaction36(PaymentTransaction36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReversedInstructedAmount is present and the currency is the same as
	 * the currency in InterbankSettlementAmount, then ExchangeRate is not
	 * allowed.
	 */
	public static void checkPaymentTransaction45(PaymentTransaction45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: If ReversedInstructedAmount is present and the currency is
	 * the same as the currency in ReversedInterbankSettlementAmount, then
	 * ExchangeRate is not allowed.
	 */
	public static void checkPaymentTransactionInformation17(PaymentTransactionInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: If ReversedInstructedAmount is present and the currency is
	 * the same as the currency in ReversedInterbankSettlementAmount, then
	 * ExchangeRate is not allowed.
	 */
	public static void checkPaymentTransactionInformation24(PaymentTransactionInformation24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReversedInstructedAmount is present and the currency is the same as
	 * the currency in InterbankSettlementAmount, then ExchangeRate is not
	 * allowed.
	 */
	public static void checkPaymentTransaction51(PaymentTransaction51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReversedInstructedAmount is present and the currency is the same as
	 * the currency in InterbankSettlementAmount, then ExchangeRate is not
	 * allowed.
	 */
	public static void checkPaymentTransaction60(PaymentTransaction60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReversedInstructedAmount is present and the currency is the same as
	 * the currency in InterbankSettlementAmount, then ExchangeRate is not
	 * allowed.
	 */
	public static void checkPaymentTransaction81(PaymentTransaction81 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReversedInstructedAmount is present and the currency is the same as
	 * the currency in InterbankSettlementAmount, then ExchangeRate is not
	 * allowed.
	 */
	public static void checkPaymentTransaction88(PaymentTransaction88 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}