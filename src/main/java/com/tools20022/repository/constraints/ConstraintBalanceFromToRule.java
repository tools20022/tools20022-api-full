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
 * The SecuritiesBalanceType of BalanceFrom must be different from the
 * SecuritiesBalanceType of BalanceTo.
 */
public class ConstraintBalanceFromToRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2
	 * IntraPositionDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails2> forIntraPositionDetails2 = new MMConstraint<IntraPositionDetails2>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails2.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Code</leftOperand><rightOperand>/BalanceTo/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8
	 * IntraPositionDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails8> forIntraPositionDetails8 = new MMConstraint<IntraPositionDetails8>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails8.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Code</leftOperand><rightOperand>/BalanceTo/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12
	 * IntraPositionDetails12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails12> forIntraPositionDetails12 = new MMConstraint<IntraPositionDetails12>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails12.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Code</leftOperand><rightOperand>/BalanceTo/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13
	 * IntraPositionDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails13> forIntraPositionDetails13 = new MMConstraint<IntraPositionDetails13>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails13.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Code</leftOperand><rightOperand>/BalanceTo/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22
	 * IntraPositionDetails22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails22> forIntraPositionDetails22 = new MMConstraint<IntraPositionDetails22>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails22.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26
	 * IntraPositionDetails26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails26> forIntraPositionDetails26 = new MMConstraint<IntraPositionDetails26>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails26.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27
	 * IntraPositionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraPositionDetails34
	 * ConstraintBalanceFromToRule.forIntraPositionDetails34}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails27> forIntraPositionDetails27 = new MMConstraint<IntraPositionDetails27>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraPositionDetails34);
			owner_lazy = () -> IntraPositionDetails27.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29
	 * IntraPositionDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails29> forIntraPositionDetails29 = new MMConstraint<IntraPositionDetails29>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails29.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails1
	 * IntraPositionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails1> forIntraPositionDetails1 = new MMConstraint<IntraPositionDetails1>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails1.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Code</leftOperand><rightOperand>/BalanceTo/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11
	 * IntraPositionDetails11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails11> forIntraPositionDetails11 = new MMConstraint<IntraPositionDetails11>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails11.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Code</leftOperand><rightOperand>/BalanceTo/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails7
	 * IntraPositionDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails7> forIntraPositionDetails7 = new MMConstraint<IntraPositionDetails7>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails7.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Code</leftOperand><rightOperand>/BalanceTo/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16
	 * IntraPositionDetails16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails16> forIntraPositionDetails16 = new MMConstraint<IntraPositionDetails16>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails16.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Code</leftOperand><rightOperand>/BalanceTo/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails21
	 * IntraPositionDetails21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraPositionDetails33
	 * ConstraintBalanceFromToRule.forIntraPositionDetails33}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails21> forIntraPositionDetails21 = new MMConstraint<IntraPositionDetails21>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraPositionDetails33);
			owner_lazy = () -> IntraPositionDetails21.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25
	 * IntraPositionDetails25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails25> forIntraPositionDetails25 = new MMConstraint<IntraPositionDetails25>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails25.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance1 IntraBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cash balance type of BalanceFrom must be different from the cash balance type of BalanceTo."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraBalance3
	 * ConstraintBalanceFromToRule.forIntraBalance3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalance1> forIntraBalance1 = new MMConstraint<IntraBalance1>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraBalance1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The cash balance type of BalanceFrom must be different from the cash balance type of BalanceTo.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraBalance3);
			owner_lazy = () -> IntraBalance1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionType1
	 * IntraPositionType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cash balance type of BalanceFrom must be different from the cash balance type of BalanceTo."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraPositionType2
	 * ConstraintBalanceFromToRule.forIntraPositionType2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionType1> forIntraPositionType1 = new MMConstraint<IntraPositionType1>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionType1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The cash balance type of BalanceFrom must be different from the cash balance type of BalanceTo.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraPositionType2);
			owner_lazy = () -> IntraPositionType1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceType1
	 * IntraBalanceType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cash balance type of BalanceFrom must be different from the cash balance type of BalanceTo."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraBalanceType2
	 * ConstraintBalanceFromToRule.forIntraBalanceType2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceType1> forIntraBalanceType1 = new MMConstraint<IntraBalanceType1>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraBalanceType1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The cash balance type of BalanceFrom must be different from the cash balance type of BalanceTo.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraBalanceType2);
			owner_lazy = () -> IntraBalanceType1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33
	 * IntraPositionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraPositionDetails21
	 * ConstraintBalanceFromToRule.forIntraPositionDetails21}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails33> forIntraPositionDetails33 = new MMConstraint<IntraPositionDetails33>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraPositionDetails21;
			owner_lazy = () -> IntraPositionDetails33.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34
	 * IntraPositionDetails34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraPositionDetails41
	 * ConstraintBalanceFromToRule.forIntraPositionDetails41}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraPositionDetails27
	 * ConstraintBalanceFromToRule.forIntraPositionDetails27}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails34> forIntraPositionDetails34 = new MMConstraint<IntraPositionDetails34>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraPositionDetails41);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraPositionDetails27;
			owner_lazy = () -> IntraPositionDetails34.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35
	 * IntraPositionDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails35> forIntraPositionDetails35 = new MMConstraint<IntraPositionDetails35>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails35.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails36
	 * IntraPositionDetails36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails36> forIntraPositionDetails36 = new MMConstraint<IntraPositionDetails36>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails36.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance3 IntraBalance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cash balance type of BalanceFrom must be different from the cash balance type of BalanceTo."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraBalance1
	 * ConstraintBalanceFromToRule.forIntraBalance1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalance3> forIntraBalance3 = new MMConstraint<IntraBalance3>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraBalance3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The cash balance type of BalanceFrom must be different from the cash balance type of BalanceTo.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraBalance1;
			owner_lazy = () -> IntraBalance3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionType2
	 * IntraPositionType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cash balance type of BalanceFrom must be different from the cash balance type of BalanceTo."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraPositionType1
	 * ConstraintBalanceFromToRule.forIntraPositionType1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionType2> forIntraPositionType2 = new MMConstraint<IntraPositionType2>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionType2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The cash balance type of BalanceFrom must be different from the cash balance type of BalanceTo.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraPositionType1;
			owner_lazy = () -> IntraPositionType2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceType2
	 * IntraBalanceType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cash balance type of BalanceFrom must be different from the cash balance type of BalanceTo."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraBalanceType1
	 * ConstraintBalanceFromToRule.forIntraBalanceType1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceType2> forIntraBalanceType2 = new MMConstraint<IntraBalanceType2>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraBalanceType2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The cash balance type of BalanceFrom must be different from the cash balance type of BalanceTo.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraBalanceType1;
			owner_lazy = () -> IntraBalanceType2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41
	 * IntraPositionDetails41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraPositionDetails46
	 * ConstraintBalanceFromToRule.forIntraPositionDetails46}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraPositionDetails34
	 * ConstraintBalanceFromToRule.forIntraPositionDetails34}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails41> forIntraPositionDetails41 = new MMConstraint<IntraPositionDetails41>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraPositionDetails46);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraPositionDetails34;
			owner_lazy = () -> IntraPositionDetails41.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43
	 * IntraPositionDetails43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails43> forIntraPositionDetails43 = new MMConstraint<IntraPositionDetails43>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails43.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraPositionDetails41
	 * ConstraintBalanceFromToRule.forIntraPositionDetails41}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails46> forIntraPositionDetails46 = new MMConstraint<IntraPositionDetails46>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraPositionDetails41;
			owner_lazy = () -> IntraPositionDetails46.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails47
	 * IntraPositionDetails47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails47> forIntraPositionDetails47 = new MMConstraint<IntraPositionDetails47>() {
		{
			validator = ConstraintBalanceFromToRule::checkIntraPositionDetails47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails47.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}
	};

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails2(IntraPositionDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails8(IntraPositionDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails12(IntraPositionDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails13(IntraPositionDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails22(IntraPositionDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails26(IntraPositionDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails27(IntraPositionDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails29(IntraPositionDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails1(IntraPositionDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails11(IntraPositionDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails7(IntraPositionDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails16(IntraPositionDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails21(IntraPositionDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails25(IntraPositionDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The cash balance type of BalanceFrom must be different from the cash
	 * balance type of BalanceTo.
	 */
	public static void checkIntraBalance1(IntraBalance1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The cash balance type of BalanceFrom must be different from the cash
	 * balance type of BalanceTo.
	 */
	public static void checkIntraPositionType1(IntraPositionType1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The cash balance type of BalanceFrom must be different from the cash
	 * balance type of BalanceTo.
	 */
	public static void checkIntraBalanceType1(IntraBalanceType1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails33(IntraPositionDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails34(IntraPositionDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails35(IntraPositionDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails36(IntraPositionDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The cash balance type of BalanceFrom must be different from the cash
	 * balance type of BalanceTo.
	 */
	public static void checkIntraBalance3(IntraBalance3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The cash balance type of BalanceFrom must be different from the cash
	 * balance type of BalanceTo.
	 */
	public static void checkIntraPositionType2(IntraPositionType2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The cash balance type of BalanceFrom must be different from the cash
	 * balance type of BalanceTo.
	 */
	public static void checkIntraBalanceType2(IntraBalanceType2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails41(IntraPositionDetails41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails43(IntraPositionDetails43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails46(IntraPositionDetails46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails47(IntraPositionDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}