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
import com.tools20022.repository.msg.SettlementInformation6;
import com.tools20022.repository.msg.SettlementInformation8;

/**
 * ISO 20022 Rule: If SettlementMethod is equal to COVE then: -
 * SettlementAccount is not allowed; - Reimbursement agent(s) must be present; -
 * ClearingSystem is not allowed. Part 1 implements: If SettlementMethod is
 * equal to COVE then: - SettlementAccount is not allowed; - ClearingSystem is
 * not allowed.
 */
public class ConstraintSettlementMethod2Part1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6
	 * SettlementInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ClearingSystem&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementAccount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod2Part1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO 20022 Rule:\nIf SettlementMethod is equal to COVE then:\n- SettlementAccount is not allowed;\n- Reimbursement agent(s) must be present;\n- ClearingSystem is not allowed.\nPart 1 implements: \nIf SettlementMethod is equal to COVE then:\n- SettlementAccount is not allowed;\n- ClearingSystem is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementInformation6> forSettlementInformation6 = new MMConstraint<SettlementInformation6>() {
		{
			validator = ConstraintSettlementMethod2Part1Rule::checkSettlementInformation6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod2Part1Rule";
			definition = "ISO 20022 Rule:\nIf SettlementMethod is equal to COVE then:\n- SettlementAccount is not allowed;\n- Reimbursement agent(s) must be present;\n- ClearingSystem is not allowed.\nPart 1 implements: \nIf SettlementMethod is equal to COVE then:\n- SettlementAccount is not allowed;\n- ClearingSystem is not allowed.";
			owner_lazy = () -> SettlementInformation6.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ClearingSystem</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementAccount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation8
	 * SettlementInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ClearingSystem&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementAccount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod2Part1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO 20022 Rule:\nIf SettlementMethod is equal to COVE then:\n- SettlementAccount is not allowed;\n- Reimbursement agent(s) must be present;\n- ClearingSystem is not allowed.\nPart 1 implements: \nIf SettlementMethod is equal to COVE then:\n- SettlementAccount is not allowed;\n- ClearingSystem is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementInformation8> forSettlementInformation8 = new MMConstraint<SettlementInformation8>() {
		{
			validator = ConstraintSettlementMethod2Part1Rule::checkSettlementInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod2Part1Rule";
			definition = "ISO 20022 Rule:\nIf SettlementMethod is equal to COVE then:\n- SettlementAccount is not allowed;\n- Reimbursement agent(s) must be present;\n- ClearingSystem is not allowed.\nPart 1 implements: \nIf SettlementMethod is equal to COVE then:\n- SettlementAccount is not allowed;\n- ClearingSystem is not allowed.";
			owner_lazy = () -> SettlementInformation8.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ClearingSystem</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementAccount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * ISO 20022 Rule: If SettlementMethod is equal to COVE then: -
	 * SettlementAccount is not allowed; - Reimbursement agent(s) must be
	 * present; - ClearingSystem is not allowed. Part 1 implements: If
	 * SettlementMethod is equal to COVE then: - SettlementAccount is not
	 * allowed; - ClearingSystem is not allowed.
	 */
	public static void checkSettlementInformation6(SettlementInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO 20022 Rule: If SettlementMethod is equal to COVE then: -
	 * SettlementAccount is not allowed; - Reimbursement agent(s) must be
	 * present; - ClearingSystem is not allowed. Part 1 implements: If
	 * SettlementMethod is equal to COVE then: - SettlementAccount is not
	 * allowed; - ClearingSystem is not allowed.
	 */
	public static void checkSettlementInformation8(SettlementInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}