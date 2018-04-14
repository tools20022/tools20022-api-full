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
 * If at least one occurrence of CounterpartyType is present and is equal to
 * Multilateral (MULT), then no occurrence of CounterpartyIdentification is
 * allowed.<br>
 * If CounterpartyType is not present, then any occurrence of
 * CounterpartyIdentification is optional.
 */
public class ConstraintCounterpartyIdentification1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance9 CashBalance9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CounterpartyIdentification[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CounterpartyType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CounterpartyType&lt;/leftOperand&gt;&lt;rightOperand&gt;Multilateral&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyIdentification1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of CounterpartyType is present and is equal to Multilateral (MULT), then no occurrence of CounterpartyIdentification is allowed.\r\nIf CounterpartyType is not present, then any occurrence of CounterpartyIdentification is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCounterpartyIdentification1Rule#forCashBalance4
	 * ConstraintCounterpartyIdentification1Rule.forCashBalance4}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashBalance9> forCashBalance9 = new MMConstraint<CashBalance9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentification1Rule";
			definition = "If at least one occurrence of CounterpartyType is present and is equal to Multilateral (MULT), then no occurrence of CounterpartyIdentification is allowed.\r\nIf CounterpartyType is not present, then any occurrence of CounterpartyIdentification is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCounterpartyIdentification1Rule.forCashBalance4;
			owner_lazy = () -> CashBalance9.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CounterpartyIdentification[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CounterpartyType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CounterpartyType</leftOperand><rightOperand>Multilateral</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CashBalance9 obj) throws Exception {
			checkCashBalance9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails4
	 * BalanceDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyIdentification1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of BalanceType is present and is MULT, then no occurrence of CounterpartyIdentification is allowed.\nIf BalanceType is not present, then any occurrence of CounterpartyIdentification is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<BalanceDetails4> forBalanceDetails4 = new MMConstraint<BalanceDetails4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentification1Rule";
			definition = "If at least one occurrence of BalanceType is present and is MULT, then no occurrence of CounterpartyIdentification is allowed.\nIf BalanceType is not present, then any occurrence of CounterpartyIdentification is optional.";
			owner_lazy = () -> BalanceDetails4.mmObject();
		}

		@Override
		public void executeValidator(BalanceDetails4 obj) throws Exception {
			checkBalanceDetails4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails3
	 * BalanceDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyIdentification1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of BalanceType is present and is MULT, then no occurrence of CounterpartyIdentification is allowed.\nIf BalanceType is not present, then any occurrence of CounterpartyIdentification is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<BalanceDetails3> forBalanceDetails3 = new MMConstraint<BalanceDetails3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentification1Rule";
			definition = "If at least one occurrence of BalanceType is present and is MULT, then no occurrence of CounterpartyIdentification is allowed.\nIf BalanceType is not present, then any occurrence of CounterpartyIdentification is optional.";
			owner_lazy = () -> BalanceDetails3.mmObject();
		}

		@Override
		public void executeValidator(BalanceDetails3 obj) throws Exception {
			checkBalanceDetails3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance4 CashBalance4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CounterpartyIdentification[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CounterpartyType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CounterpartyType&lt;/leftOperand&gt;&lt;rightOperand&gt;Multilateral&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyIdentification1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of CounterpartyType is present and is equal to Multilateral (MULT), then no occurrence of CounterpartyIdentification is allowed.\r\nIf CounterpartyType is not present, then any occurrence of CounterpartyIdentification is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCounterpartyIdentification1Rule#forCashBalance9
	 * ConstraintCounterpartyIdentification1Rule.forCashBalance9}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashBalance4> forCashBalance4 = new MMConstraint<CashBalance4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentification1Rule";
			definition = "If at least one occurrence of CounterpartyType is present and is equal to Multilateral (MULT), then no occurrence of CounterpartyIdentification is allowed.\r\nIf CounterpartyType is not present, then any occurrence of CounterpartyIdentification is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCounterpartyIdentification1Rule.forCashBalance9);
			owner_lazy = () -> CashBalance4.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CounterpartyIdentification[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CounterpartyType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CounterpartyType</leftOperand><rightOperand>Multilateral</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CashBalance4 obj) throws Exception {
			checkCashBalance4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails2
	 * BalanceDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyIdentification1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of BalanceType is present and is MULT, then no occurrence of CounterpartyIdentification is allowed.\nIf BalanceType is not present, then any occurrence of CounterpartyIdentification is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<BalanceDetails2> forBalanceDetails2 = new MMConstraint<BalanceDetails2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentification1Rule";
			definition = "If at least one occurrence of BalanceType is present and is MULT, then no occurrence of CounterpartyIdentification is allowed.\nIf BalanceType is not present, then any occurrence of CounterpartyIdentification is optional.";
			owner_lazy = () -> BalanceDetails2.mmObject();
		}

		@Override
		public void executeValidator(BalanceDetails2 obj) throws Exception {
			checkBalanceDetails2(obj);
		}
	};

	/**
	 * If at least one occurrence of CounterpartyType is present and is equal to
	 * Multilateral (MULT), then no occurrence of CounterpartyIdentification is
	 * allowed.<br>
	 * If CounterpartyType is not present, then any occurrence of
	 * CounterpartyIdentification is optional.
	 */
	public static void checkCashBalance9(CashBalance9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of BalanceType is present and is MULT, then no
	 * occurrence of CounterpartyIdentification is allowed. If BalanceType is
	 * not present, then any occurrence of CounterpartyIdentification is
	 * optional.
	 */
	public static void checkBalanceDetails4(BalanceDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of BalanceType is present and is MULT, then no
	 * occurrence of CounterpartyIdentification is allowed. If BalanceType is
	 * not present, then any occurrence of CounterpartyIdentification is
	 * optional.
	 */
	public static void checkBalanceDetails3(BalanceDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of CounterpartyType is present and is equal to
	 * Multilateral (MULT), then no occurrence of CounterpartyIdentification is
	 * allowed.<br>
	 * If CounterpartyType is not present, then any occurrence of
	 * CounterpartyIdentification is optional.
	 */
	public static void checkCashBalance4(CashBalance4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of BalanceType is present and is MULT, then no
	 * occurrence of CounterpartyIdentification is allowed. If BalanceType is
	 * not present, then any occurrence of CounterpartyIdentification is
	 * optional.
	 */
	public static void checkBalanceDetails2(BalanceDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}