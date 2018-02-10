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

/**
 * If SettlementMethod is equal to COVE then: - SettlementAccount is not
 * allowed; - Reimbursement agent(s) must be present; - ClearingSystem is not
 * allowed.
 */
public class ConstraintSettlementMethod2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation1
	 * SettlementInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementMethod is equal to COVE then: \n- SettlementAccount is not allowed;\n- Reimbursement agent(s) must be present;\n- ClearingSystem is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementInformation1> forSettlementInformation1 = new MMConstraint<SettlementInformation1>() {
		{
			validator = ConstraintSettlementMethod2Rule::checkSettlementInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod2Rule";
			definition = "If SettlementMethod is equal to COVE then: \n- SettlementAccount is not allowed;\n- Reimbursement agent(s) must be present;\n- ClearingSystem is not allowed.";
			owner_lazy = () -> SettlementInformation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation2
	 * SettlementInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementMethod is equal to CLRG then: \n- SettlementAccount is not allowed;\n- ClearingSystem must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementInformation2> forSettlementInformation2 = new MMConstraint<SettlementInformation2>() {
		{
			validator = ConstraintSettlementMethod2Rule::checkSettlementInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod2Rule";
			definition = "If SettlementMethod is equal to CLRG then: \n- SettlementAccount is not allowed;\n- ClearingSystem must be present.";
			owner_lazy = () -> SettlementInformation2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation11
	 * SettlementInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementAccount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ClearingSystem&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;ClearingSystem&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementMethod is equal to CLRG then: \n- SettlementAccount is not allowed;\n- ClearingSystem must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementInformation11> forSettlementInformation11 = new MMConstraint<SettlementInformation11>() {
		{
			validator = ConstraintSettlementMethod2Rule::checkSettlementInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod2Rule";
			definition = "If SettlementMethod is equal to CLRG then: \n- SettlementAccount is not allowed;\n- ClearingSystem must be present.";
			owner_lazy = () -> SettlementInformation11.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementAccount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ClearingSystem</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>ClearingSystem</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation12
	 * SettlementInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementAccount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ClearingSystem&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;ClearingSystem&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementMethod is equal to CLRG then: \n- SettlementAccount is not allowed;\n- ClearingSystem must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementInformation12> forSettlementInformation12 = new MMConstraint<SettlementInformation12>() {
		{
			validator = ConstraintSettlementMethod2Rule::checkSettlementInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod2Rule";
			definition = "If SettlementMethod is equal to CLRG then: \n- SettlementAccount is not allowed;\n- ClearingSystem must be present.";
			owner_lazy = () -> SettlementInformation12.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementAccount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ClearingSystem</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>ClearingSystem</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation9
	 * SettlementInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ClearingSystem&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementAccount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;ClearingSystem&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementMethod is equal to CLRG then: \n- SettlementAccount is not allowed;\n- ClearingSystem must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementInformation9> forSettlementInformation9 = new MMConstraint<SettlementInformation9>() {
		{
			validator = ConstraintSettlementMethod2Rule::checkSettlementInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod2Rule";
			definition = "If SettlementMethod is equal to CLRG then: \n- SettlementAccount is not allowed;\n- ClearingSystem must be present.";
			owner_lazy = () -> SettlementInformation9.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ClearingSystem</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementAccount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>ClearingSystem</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If SettlementMethod is equal to COVE then: - SettlementAccount is not
	 * allowed; - Reimbursement agent(s) must be present; - ClearingSystem is
	 * not allowed.
	 */
	public static void checkSettlementInformation1(SettlementInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementMethod is equal to CLRG then: - SettlementAccount is not
	 * allowed; - ClearingSystem must be present.
	 */
	public static void checkSettlementInformation2(SettlementInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementMethod is equal to CLRG then: - SettlementAccount is not
	 * allowed; - ClearingSystem must be present.
	 */
	public static void checkSettlementInformation11(SettlementInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementMethod is equal to CLRG then: - SettlementAccount is not
	 * allowed; - ClearingSystem must be present.
	 */
	public static void checkSettlementInformation12(SettlementInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementMethod is equal to CLRG then: - SettlementAccount is not
	 * allowed; - ClearingSystem must be present.
	 */
	public static void checkSettlementInformation9(SettlementInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}