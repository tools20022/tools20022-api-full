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
 * If MultilateralBalance is not present, then at least one occurrence of
 * CurrentBilateralLimit/BilateralBalance must be present. If
 * MultilateralBalance is present, then any occurrence of
 * CurrentBilateralLimit/BilateralBalance is optional.
 */
public class ConstraintBilateralBalanceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1
	 * CashAccountDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If MultilateralBalance is not present, then at least one occurrence of CurrentBilateralLimit/BilateralBalance must be present.\nIf MultilateralBalance is present, then any occurrence of CurrentBilateralLimit/BilateralBalance is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashAccountDetails1> forCashAccountDetails1 = new MMConstraint<CashAccountDetails1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralBalanceRule";
			definition = "If MultilateralBalance is not present, then at least one occurrence of CurrentBilateralLimit/BilateralBalance must be present.\nIf MultilateralBalance is present, then any occurrence of CurrentBilateralLimit/BilateralBalance is optional.";
			owner_lazy = () -> CashAccountDetails1.mmObject();
		}

		@Override
		public void executeValidator(CashAccountDetails1 obj) throws Exception {
			checkCashAccountDetails1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3
	 * CashAccountDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If MultilateralBalance is not present, then at least one occurrence of CurrentBilateralLimit/BilateralBalance must be present.\nIf MultilateralBalance is present, then any occurrence of CurrentBilateralLimit/BilateralBalance is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashAccountDetails3> forCashAccountDetails3 = new MMConstraint<CashAccountDetails3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralBalanceRule";
			definition = "If MultilateralBalance is not present, then at least one occurrence of CurrentBilateralLimit/BilateralBalance must be present.\nIf MultilateralBalance is present, then any occurrence of CurrentBilateralLimit/BilateralBalance is optional.";
			owner_lazy = () -> CashAccountDetails3.mmObject();
		}

		@Override
		public void executeValidator(CashAccountDetails3 obj) throws Exception {
			checkCashAccountDetails3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails4
	 * CashAccountDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If MultilateralBalance is not present, then at least one occurrence of CurrentBilateralLimit/BilateralBalance must be present.\nIf MultilateralBalance is present, then any occurrence of CurrentBilateralLimit/BilateralBalance is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashAccountDetails4> forCashAccountDetails4 = new MMConstraint<CashAccountDetails4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralBalanceRule";
			definition = "If MultilateralBalance is not present, then at least one occurrence of CurrentBilateralLimit/BilateralBalance must be present.\nIf MultilateralBalance is present, then any occurrence of CurrentBilateralLimit/BilateralBalance is optional.";
			owner_lazy = () -> CashAccountDetails4.mmObject();
		}

		@Override
		public void executeValidator(CashAccountDetails4 obj) throws Exception {
			checkCashAccountDetails4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount23 CashAccount23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CurrentBilateralLimit[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CurrentBilateralLimit[1]/BilateralBalance[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MultilateralBalance[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If MultilateralBalance is not present, then at least one occurrence of CurrentBilateralLimit/BilateralBalance must be present.\nIf MultilateralBalance is present, then any occurrence of CurrentBilateralLimit/BilateralBalance is optional."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBilateralBalanceRule#forCashAccount35
	 * ConstraintBilateralBalanceRule.forCashAccount35}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashAccount23> forCashAccount23 = new MMConstraint<CashAccount23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralBalanceRule";
			definition = "If MultilateralBalance is not present, then at least one occurrence of CurrentBilateralLimit/BilateralBalance must be present.\nIf MultilateralBalance is present, then any occurrence of CurrentBilateralLimit/BilateralBalance is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBilateralBalanceRule.forCashAccount35);
			owner_lazy = () -> CashAccount23.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CurrentBilateralLimit[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CurrentBilateralLimit[1]/BilateralBalance[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/MultilateralBalance[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CashAccount23 obj) throws Exception {
			checkCashAccount23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount35 CashAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CurrentBilateralLimit[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CurrentBilateralLimit[1]/BilateralBalance[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MultilateralBalance[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If MultilateralBalance is not present, then at least one occurrence of CurrentBilateralLimit/BilateralBalance must be present.\nIf MultilateralBalance is present, then any occurrence of CurrentBilateralLimit/BilateralBalance is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBilateralBalanceRule#forCashAccount23
	 * ConstraintBilateralBalanceRule.forCashAccount23}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashAccount35> forCashAccount35 = new MMConstraint<CashAccount35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralBalanceRule";
			definition = "If MultilateralBalance is not present, then at least one occurrence of CurrentBilateralLimit/BilateralBalance must be present.\nIf MultilateralBalance is present, then any occurrence of CurrentBilateralLimit/BilateralBalance is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBilateralBalanceRule.forCashAccount23;
			owner_lazy = () -> CashAccount35.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CurrentBilateralLimit[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CurrentBilateralLimit[1]/BilateralBalance[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/MultilateralBalance[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CashAccount35 obj) throws Exception {
			checkCashAccount35(obj);
		}
	};

	/**
	 * If MultilateralBalance is not present, then at least one occurrence of
	 * CurrentBilateralLimit/BilateralBalance must be present. If
	 * MultilateralBalance is present, then any occurrence of
	 * CurrentBilateralLimit/BilateralBalance is optional.
	 */
	public static void checkCashAccountDetails1(CashAccountDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If MultilateralBalance is not present, then at least one occurrence of
	 * CurrentBilateralLimit/BilateralBalance must be present. If
	 * MultilateralBalance is present, then any occurrence of
	 * CurrentBilateralLimit/BilateralBalance is optional.
	 */
	public static void checkCashAccountDetails3(CashAccountDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If MultilateralBalance is not present, then at least one occurrence of
	 * CurrentBilateralLimit/BilateralBalance must be present. If
	 * MultilateralBalance is present, then any occurrence of
	 * CurrentBilateralLimit/BilateralBalance is optional.
	 */
	public static void checkCashAccountDetails4(CashAccountDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If MultilateralBalance is not present, then at least one occurrence of
	 * CurrentBilateralLimit/BilateralBalance must be present. If
	 * MultilateralBalance is present, then any occurrence of
	 * CurrentBilateralLimit/BilateralBalance is optional.
	 */
	public static void checkCashAccount23(CashAccount23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If MultilateralBalance is not present, then at least one occurrence of
	 * CurrentBilateralLimit/BilateralBalance must be present. If
	 * MultilateralBalance is present, then any occurrence of
	 * CurrentBilateralLimit/BilateralBalance is optional.
	 */
	public static void checkCashAccount35(CashAccount35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}