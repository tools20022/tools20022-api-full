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
import com.tools20022.repository.msg.LimitSearchCriteria1;
import com.tools20022.repository.msg.LimitSearchCriteria2;
import com.tools20022.repository.msg.LimitSearchCriteria3;

/**
 * If at least one occurrence of RiskManagementCurrentLimitType is present and
 * is MULT, then no occurrence of BilateralLimitCounterpartyIdentification is
 * allowed. If no occurrence of RiskManagementCurrentLimitType is MULT, then any
 * occurrence of BilateralLimitCounterpartyIdentification is optional. If
 * RiskManagementCurrentLimitType is not present, then any occurrence of
 * BilateralLimitCounterpartyIdentification is optional.
 */
public class ConstraintBilateralLimitCounterparty3Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1
	 * LimitSearchCriteria1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralLimitCounterparty3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of RiskManagementCurrentLimitType is present and is MULT, then no occurrence of BilateralLimitCounterpartyIdentification is allowed.\nIf no occurrence of RiskManagementCurrentLimitType is MULT, then any occurrence of BilateralLimitCounterpartyIdentification is optional.\nIf RiskManagementCurrentLimitType is not present, then any occurrence of BilateralLimitCounterpartyIdentification is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LimitSearchCriteria1> forLimitSearchCriteria1 = new MMConstraint<LimitSearchCriteria1>() {
		{
			validator = ConstraintBilateralLimitCounterparty3Rule::checkLimitSearchCriteria1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterparty3Rule";
			definition = "If at least one occurrence of RiskManagementCurrentLimitType is present and is MULT, then no occurrence of BilateralLimitCounterpartyIdentification is allowed.\nIf no occurrence of RiskManagementCurrentLimitType is MULT, then any occurrence of BilateralLimitCounterpartyIdentification is optional.\nIf RiskManagementCurrentLimitType is not present, then any occurrence of BilateralLimitCounterpartyIdentification is optional.";
			owner_lazy = () -> LimitSearchCriteria1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria2
	 * LimitSearchCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralLimitCounterparty3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of RiskManagementCurrentLimitType is present and is MULT, then no occurrence of BilateralLimitCounterpartyIdentification is allowed.\nIf no occurrence of RiskManagementCurrentLimitType is MULT, then any occurrence of BilateralLimitCounterpartyIdentification is optional.\nIf RiskManagementCurrentLimitType is not present, then any occurrence of BilateralLimitCounterpartyIdentification is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LimitSearchCriteria2> forLimitSearchCriteria2 = new MMConstraint<LimitSearchCriteria2>() {
		{
			validator = ConstraintBilateralLimitCounterparty3Rule::checkLimitSearchCriteria2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterparty3Rule";
			definition = "If at least one occurrence of RiskManagementCurrentLimitType is present and is MULT, then no occurrence of BilateralLimitCounterpartyIdentification is allowed.\nIf no occurrence of RiskManagementCurrentLimitType is MULT, then any occurrence of BilateralLimitCounterpartyIdentification is optional.\nIf RiskManagementCurrentLimitType is not present, then any occurrence of BilateralLimitCounterpartyIdentification is optional.";
			owner_lazy = () -> LimitSearchCriteria2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3
	 * LimitSearchCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BilateralLimitCounterpartyIdentification[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CurrentLimitType[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CurrentLimitType[*]/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Multilateral&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralLimitCounterparty3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of CurrentLimitType is present and is MULT, then no occurrence of BilateralLimitCounterpartyIdentification is allowed.\r\nIf no occurrence of CurrentLimitType is MULT, then any occurrence of BilateralLimitCounterpartyIdentification is optional.\r\nIf CurrentLimitType is not present, then any occurrence of BilateralLimitCounterpartyIdentification is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LimitSearchCriteria3> forLimitSearchCriteria3 = new MMConstraint<LimitSearchCriteria3>() {
		{
			validator = ConstraintBilateralLimitCounterparty3Rule::checkLimitSearchCriteria3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterparty3Rule";
			definition = "If at least one occurrence of CurrentLimitType is present and is MULT, then no occurrence of BilateralLimitCounterpartyIdentification is allowed.\r\nIf no occurrence of CurrentLimitType is MULT, then any occurrence of BilateralLimitCounterpartyIdentification is optional.\r\nIf CurrentLimitType is not present, then any occurrence of BilateralLimitCounterpartyIdentification is optional.";
			owner_lazy = () -> LimitSearchCriteria3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/BilateralLimitCounterpartyIdentification[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CurrentLimitType[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CurrentLimitType[*]/Code</leftOperand><rightOperand>Multilateral</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If at least one occurrence of RiskManagementCurrentLimitType is present
	 * and is MULT, then no occurrence of
	 * BilateralLimitCounterpartyIdentification is allowed. If no occurrence of
	 * RiskManagementCurrentLimitType is MULT, then any occurrence of
	 * BilateralLimitCounterpartyIdentification is optional. If
	 * RiskManagementCurrentLimitType is not present, then any occurrence of
	 * BilateralLimitCounterpartyIdentification is optional.
	 */
	public static void checkLimitSearchCriteria1(LimitSearchCriteria1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of RiskManagementCurrentLimitType is present
	 * and is MULT, then no occurrence of
	 * BilateralLimitCounterpartyIdentification is allowed. If no occurrence of
	 * RiskManagementCurrentLimitType is MULT, then any occurrence of
	 * BilateralLimitCounterpartyIdentification is optional. If
	 * RiskManagementCurrentLimitType is not present, then any occurrence of
	 * BilateralLimitCounterpartyIdentification is optional.
	 */
	public static void checkLimitSearchCriteria2(LimitSearchCriteria2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of CurrentLimitType is present and is MULT,
	 * then no occurrence of BilateralLimitCounterpartyIdentification is
	 * allowed.<br>
	 * If no occurrence of CurrentLimitType is MULT, then any occurrence of
	 * BilateralLimitCounterpartyIdentification is optional.<br>
	 * If CurrentLimitType is not present, then any occurrence of
	 * BilateralLimitCounterpartyIdentification is optional.
	 */
	public static void checkLimitSearchCriteria3(LimitSearchCriteria3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}