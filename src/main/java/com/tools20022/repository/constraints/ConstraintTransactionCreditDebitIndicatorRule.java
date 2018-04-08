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
 * If CreditDebitIndicator is present, then AccountEntry/Entry/Amount or
 * Payment/InstructedAmount or Payment/InterbankSettlementAmount must be
 * present.<br>
 * If CreditDebitIndicator is not present, then any Message Elements in the list
 * (AccountEntry/Entry/Amount, Payment/InstructedAmount,
 * Payment/InterbankSettlementAmount) is optional.<br>
 */
public class ConstraintTransactionCreditDebitIndicatorRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction33 Transaction33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountEntry/Entry/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Payment/InstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Payment/InterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCreditDebitIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditDebitIndicator is present, then AccountEntry/Entry/Amount or Payment/InstructedAmount or Payment/InterbankSettlementAmount must be present.\r\nIf CreditDebitIndicator is not present, then any Message Elements in the list (AccountEntry/Entry/Amount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) is optional.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionCreditDebitIndicatorRule#forTransaction59
	 * ConstraintTransactionCreditDebitIndicatorRule.forTransaction59}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionCreditDebitIndicatorRule#forTransaction24
	 * ConstraintTransactionCreditDebitIndicatorRule.forTransaction24}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction33> forTransaction33 = new MMConstraint<Transaction33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCreditDebitIndicatorRule";
			definition = "If CreditDebitIndicator is present, then AccountEntry/Entry/Amount or Payment/InstructedAmount or Payment/InterbankSettlementAmount must be present.\r\nIf CreditDebitIndicator is not present, then any Message Elements in the list (AccountEntry/Entry/Amount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) is optional.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransactionCreditDebitIndicatorRule.forTransaction59);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTransactionCreditDebitIndicatorRule.forTransaction24;
			owner_lazy = () -> Transaction33.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountEntry/Entry/Amount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Payment/InstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Payment/InterbankSettlementAmount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditDebitIndicator</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(Transaction33 obj) throws Exception {
			checkTransaction33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction59 Transaction59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountEntry/Entry/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Payment/InstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Payment/InterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCreditDebitIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditDebitIndicator is present, then AccountEntry/Entry/Amount or Payment/InstructedAmount or Payment/InterbankSettlementAmount must be present.\r\nIf CreditDebitIndicator is not present, then any Message Elements in the list (AccountEntry/Entry/Amount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) is optional.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionCreditDebitIndicatorRule#forTransaction33
	 * ConstraintTransactionCreditDebitIndicatorRule.forTransaction33}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction59> forTransaction59 = new MMConstraint<Transaction59>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCreditDebitIndicatorRule";
			definition = "If CreditDebitIndicator is present, then AccountEntry/Entry/Amount or Payment/InstructedAmount or Payment/InterbankSettlementAmount must be present.\r\nIf CreditDebitIndicator is not present, then any Message Elements in the list (AccountEntry/Entry/Amount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) is optional.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTransactionCreditDebitIndicatorRule.forTransaction33;
			owner_lazy = () -> Transaction59.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountEntry/Entry/Amount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Payment/InstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Payment/InterbankSettlementAmount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditDebitIndicator</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(Transaction59 obj) throws Exception {
			checkTransaction59(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction4 Transaction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCreditDebitIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditDebitIndicator is present, then at least one or more Message Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) must be present.\nIf CreditDebitIndicator is not present, then any Message Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction4> forTransaction4 = new MMConstraint<Transaction4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCreditDebitIndicatorRule";
			definition = "If CreditDebitIndicator is present, then at least one or more Message Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) must be present.\nIf CreditDebitIndicator is not present, then any Message Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) is optional.";
			owner_lazy = () -> Transaction4.mmObject();
		}

		@Override
		public void executeValidator(Transaction4 obj) throws Exception {
			checkTransaction4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction24 Transaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountEntry/Entry/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Payment/InstructedAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Payment/InterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCreditDebitIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditDebitIndicator is present, then AccountEntry/Entry/Amount or Payment/InstructedAmount or Payment/InterbankSettlementAmount must be present.\r\nIf CreditDebitIndicator is not present, then any Message Elements in the list (AccountEntry/Entry/Amount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) is optional.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionCreditDebitIndicatorRule#forTransaction33
	 * ConstraintTransactionCreditDebitIndicatorRule.forTransaction33}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction24> forTransaction24 = new MMConstraint<Transaction24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCreditDebitIndicatorRule";
			definition = "If CreditDebitIndicator is present, then AccountEntry/Entry/Amount or Payment/InstructedAmount or Payment/InterbankSettlementAmount must be present.\r\nIf CreditDebitIndicator is not present, then any Message Elements in the list (AccountEntry/Entry/Amount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) is optional.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransactionCreditDebitIndicatorRule.forTransaction33);
			owner_lazy = () -> Transaction24.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountEntry/Entry/Amount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Payment/InstructedAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Payment/InterbankSettlementAmount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditDebitIndicator</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(Transaction24 obj) throws Exception {
			checkTransaction24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction3 Transaction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCreditDebitIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditDebitIndicator is present, then at least one or more Message Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) must be present.\nIf CreditDebitIndicator is not present, then any Message Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) is optional.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction3> forTransaction3 = new MMConstraint<Transaction3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCreditDebitIndicatorRule";
			definition = "If CreditDebitIndicator is present, then at least one or more Message Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) must be present.\nIf CreditDebitIndicator is not present, then any Message Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) is optional.\n.";
			owner_lazy = () -> Transaction3.mmObject();
		}

		@Override
		public void executeValidator(Transaction3 obj) throws Exception {
			checkTransaction3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction5 Transaction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCreditDebitIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditDebitIndicator is present, then at least one or more Message Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) must be present.\nIf CreditDebitIndicator is not present, then any Message Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction5> forTransaction5 = new MMConstraint<Transaction5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCreditDebitIndicatorRule";
			definition = "If CreditDebitIndicator is present, then at least one or more Message Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) must be present.\nIf CreditDebitIndicator is not present, then any Message Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount, Payment/InterbankSettlementAmount) is optional.";
			owner_lazy = () -> Transaction5.mmObject();
		}

		@Override
		public void executeValidator(Transaction5 obj) throws Exception {
			checkTransaction5(obj);
		}
	};

	/**
	 * If CreditDebitIndicator is present, then AccountEntry/Entry/Amount or
	 * Payment/InstructedAmount or Payment/InterbankSettlementAmount must be
	 * present.<br>
	 * If CreditDebitIndicator is not present, then any Message Elements in the
	 * list (AccountEntry/Entry/Amount, Payment/InstructedAmount,
	 * Payment/InterbankSettlementAmount) is optional.<br>
	 */
	public static void checkTransaction33(Transaction33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditDebitIndicator is present, then AccountEntry/Entry/Amount or
	 * Payment/InstructedAmount or Payment/InterbankSettlementAmount must be
	 * present.<br>
	 * If CreditDebitIndicator is not present, then any Message Elements in the
	 * list (AccountEntry/Entry/Amount, Payment/InstructedAmount,
	 * Payment/InterbankSettlementAmount) is optional.<br>
	 */
	public static void checkTransaction59(Transaction59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditDebitIndicator is present, then at least one or more Message
	 * Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount,
	 * Payment/InterbankSettlementAmount) must be present. If
	 * CreditDebitIndicator is not present, then any Message Elements in the
	 * list (AccountEntry/EntryAmount, Payment/InstructedAmount,
	 * Payment/InterbankSettlementAmount) is optional.
	 */
	public static void checkTransaction4(Transaction4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditDebitIndicator is present, then AccountEntry/Entry/Amount or
	 * Payment/InstructedAmount or Payment/InterbankSettlementAmount must be
	 * present.<br>
	 * If CreditDebitIndicator is not present, then any Message Elements in the
	 * list (AccountEntry/Entry/Amount, Payment/InstructedAmount,
	 * Payment/InterbankSettlementAmount) is optional.<br>
	 */
	public static void checkTransaction24(Transaction24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditDebitIndicator is present, then at least one or more Message
	 * Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount,
	 * Payment/InterbankSettlementAmount) must be present. If
	 * CreditDebitIndicator is not present, then any Message Elements in the
	 * list (AccountEntry/EntryAmount, Payment/InstructedAmount,
	 * Payment/InterbankSettlementAmount) is optional. .
	 */
	public static void checkTransaction3(Transaction3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditDebitIndicator is present, then at least one or more Message
	 * Elements in the list (AccountEntry/EntryAmount, Payment/InstructedAmount,
	 * Payment/InterbankSettlementAmount) must be present. If
	 * CreditDebitIndicator is not present, then any Message Elements in the
	 * list (AccountEntry/EntryAmount, Payment/InstructedAmount,
	 * Payment/InterbankSettlementAmount) is optional.
	 */
	public static void checkTransaction5(Transaction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}