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
import com.tools20022.repository.msg.AccountCashEntrySearch2;
import com.tools20022.repository.msg.CashAccountEntrySearch3;
import com.tools20022.repository.msg.CashAccountEntrySearch4;
import com.tools20022.repository.msg.CashAccountEntrySearch5;
import java.util.Arrays;

/**
 * If at least one occurrence of
 * EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is present, then
 * CreditDebitIndicator is not allowed. If
 * EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is not present, then
 * CreditDebitIndicator is optional.
 */
public class ConstraintEntryAmountCreditDebitIndicator1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2
	 * AccountCashEntrySearch2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryAmountCreditDebitIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\nIf EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountCashEntrySearch2> forAccountCashEntrySearch2 = new MMConstraint<AccountCashEntrySearch2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryAmountCreditDebitIndicator1Rule";
			definition = "If at least one occurrence of EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\nIf EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional.";
			owner_lazy = () -> AccountCashEntrySearch2.mmObject();
		}

		@Override
		public void executeValidator(AccountCashEntrySearch2 obj) throws Exception {
			checkAccountCashEntrySearch2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3
	 * CashAccountEntrySearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/EntryAmount[*]/CurrencyAndAmountRange/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryAmountCreditDebitIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\r\nIf EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional.\r\n\r\nIf CreditDebitIndicator is present then \r\nall occurrences of EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator must be absent and\r\nall occurrences of EntryAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator must be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator1Rule#forCashAccountEntrySearch4
	 * ConstraintEntryAmountCreditDebitIndicator1Rule.forCashAccountEntrySearch4
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashAccountEntrySearch3> forCashAccountEntrySearch3 = new MMConstraint<CashAccountEntrySearch3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryAmountCreditDebitIndicator1Rule";
			definition = "If at least one occurrence of EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\r\nIf EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional.\r\n\r\nIf CreditDebitIndicator is present then \r\nall occurrences of EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator must be absent and\r\nall occurrences of EntryAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator1Rule.forCashAccountEntrySearch4);
			owner_lazy = () -> CashAccountEntrySearch3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditDebitIndicator</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/EntryAmount[*]/CurrencyAndAmountRange/CreditDebitIndicator</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CashAccountEntrySearch3 obj) throws Exception {
			checkCashAccountEntrySearch3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4
	 * CashAccountEntrySearch4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/EntryAmount[*]/CurrencyAndAmountRange/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryAmountCreditDebitIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\r\nIf EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional.\r\n\r\nIf CreditDebitIndicator is present then \r\nall occurrences of EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator must be absent and\r\nall occurrences of EntryAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator must be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator1Rule#forCashAccountEntrySearch5
	 * ConstraintEntryAmountCreditDebitIndicator1Rule.forCashAccountEntrySearch5
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator1Rule#forCashAccountEntrySearch3
	 * ConstraintEntryAmountCreditDebitIndicator1Rule.forCashAccountEntrySearch3
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<CashAccountEntrySearch4> forCashAccountEntrySearch4 = new MMConstraint<CashAccountEntrySearch4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryAmountCreditDebitIndicator1Rule";
			definition = "If at least one occurrence of EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\r\nIf EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional.\r\n\r\nIf CreditDebitIndicator is present then \r\nall occurrences of EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator must be absent and\r\nall occurrences of EntryAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator1Rule.forCashAccountEntrySearch5);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator1Rule.forCashAccountEntrySearch3;
			owner_lazy = () -> CashAccountEntrySearch4.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditDebitIndicator</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/EntryAmount[*]/CurrencyAndAmountRange/CreditDebitIndicator</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CashAccountEntrySearch4 obj) throws Exception {
			checkCashAccountEntrySearch4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5
	 * CashAccountEntrySearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/EntryAmount[*]/CurrencyAndAmountRange/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryAmountCreditDebitIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\r\nIf EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional.\r\n\r\nIf CreditDebitIndicator is present then \r\nall occurrences of EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator must be absent and\r\nall occurrences of EntryAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator1Rule#forCashAccountEntrySearch4
	 * ConstraintEntryAmountCreditDebitIndicator1Rule.forCashAccountEntrySearch4
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<CashAccountEntrySearch5> forCashAccountEntrySearch5 = new MMConstraint<CashAccountEntrySearch5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryAmountCreditDebitIndicator1Rule";
			definition = "If at least one occurrence of EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is present, then CreditDebitIndicator is not allowed.\r\nIf EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is not present, then CreditDebitIndicator is optional.\r\n\r\nIf CreditDebitIndicator is present then \r\nall occurrences of EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator must be absent and\r\nall occurrences of EntryAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator must be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator1Rule.forCashAccountEntrySearch4;
			owner_lazy = () -> CashAccountEntrySearch5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditDebitIndicator</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/EntryAmount[*]/CurrencyAndAmountRange/CreditDebitIndicator</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CashAccountEntrySearch5 obj) throws Exception {
			checkCashAccountEntrySearch5(obj);
		}
	};

	/**
	 * If at least one occurrence of
	 * EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is present, then
	 * CreditDebitIndicator is not allowed. If
	 * EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is not present,
	 * then CreditDebitIndicator is optional.
	 */
	public static void checkAccountCashEntrySearch2(AccountCashEntrySearch2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of
	 * EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is present, then
	 * CreditDebitIndicator is not allowed.<br>
	 * If EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is not
	 * present, then CreditDebitIndicator is optional.<br>
	 * <br>
	 * If CreditDebitIndicator is present then <br>
	 * all occurrences of
	 * EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator must be absent
	 * and<br>
	 * all occurrences of
	 * EntryAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator must be
	 * absent.
	 */
	public static void checkCashAccountEntrySearch3(CashAccountEntrySearch3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of
	 * EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is present, then
	 * CreditDebitIndicator is not allowed.<br>
	 * If EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is not
	 * present, then CreditDebitIndicator is optional.<br>
	 * <br>
	 * If CreditDebitIndicator is present then <br>
	 * all occurrences of
	 * EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator must be absent
	 * and<br>
	 * all occurrences of
	 * EntryAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator must be
	 * absent.
	 */
	public static void checkCashAccountEntrySearch4(CashAccountEntrySearch4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of
	 * EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is present, then
	 * CreditDebitIndicator is not allowed.<br>
	 * If EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator is not
	 * present, then CreditDebitIndicator is optional.<br>
	 * <br>
	 * If CreditDebitIndicator is present then <br>
	 * all occurrences of
	 * EntryAmount/CurrencyAndAmountRange/CreditDebitIndicator must be absent
	 * and<br>
	 * all occurrences of
	 * EntryAmount/ImpliedCurrencyAndAmountRange/CreditDebitIndicator must be
	 * absent.
	 */
	public static void checkCashAccountEntrySearch5(CashAccountEntrySearch5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}