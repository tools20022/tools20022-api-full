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
 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
 * cannot be used.
 */
public class ConstraintAvailableWithNoStatusRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6
	 * SubBalanceInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;AvailableWithNoAdditionalStatus&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAvailableWithNoStatusRule#forSubBalanceInformation14
	 * ConstraintAvailableWithNoStatusRule.forSubBalanceInformation14}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation6> forSubBalanceInformation6 = new MMConstraint<SubBalanceInformation6>() {
		{
			validator = ConstraintAvailableWithNoStatusRule::checkSubBalanceInformation6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoStatusRule";
			definition = "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAvailableWithNoStatusRule.forSubBalanceInformation14);
			owner_lazy = () -> SubBalanceInformation6.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>AvailableWithNoAdditionalStatus</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation7
	 * SubBalanceInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;AvailableWithNoAdditionalStatus&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation7> forSubBalanceInformation7 = new MMConstraint<SubBalanceInformation7>() {
		{
			validator = ConstraintAvailableWithNoStatusRule::checkSubBalanceInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoStatusRule";
			definition = "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used.";
			owner_lazy = () -> SubBalanceInformation7.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>AvailableWithNoAdditionalStatus</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation5
	 * SubBalanceInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;AvailableWithNoAdditionalStatus&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation5> forSubBalanceInformation5 = new MMConstraint<SubBalanceInformation5>() {
		{
			validator = ConstraintAvailableWithNoStatusRule::checkSubBalanceInformation5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoStatusRule";
			definition = "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used.";
			owner_lazy = () -> SubBalanceInformation5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>AvailableWithNoAdditionalStatus</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation8
	 * SubBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;AvailableWithNoAdditionalStatus&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation8> forSubBalanceInformation8 = new MMConstraint<SubBalanceInformation8>() {
		{
			validator = ConstraintAvailableWithNoStatusRule::checkSubBalanceInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoStatusRule";
			definition = "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used.";
			owner_lazy = () -> SubBalanceInformation8.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>AvailableWithNoAdditionalStatus</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation9
	 * SubBalanceInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;AvailableWithNoAdditionalStatus&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation9> forSubBalanceInformation9 = new MMConstraint<SubBalanceInformation9>() {
		{
			validator = ConstraintAvailableWithNoStatusRule::checkSubBalanceInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoStatusRule";
			definition = "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used.";
			owner_lazy = () -> SubBalanceInformation9.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>AvailableWithNoAdditionalStatus</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation10
	 * SubBalanceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;AvailableWithNoAdditionalStatus&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation10> forSubBalanceInformation10 = new MMConstraint<SubBalanceInformation10>() {
		{
			validator = ConstraintAvailableWithNoStatusRule::checkSubBalanceInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoStatusRule";
			definition = "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used.";
			owner_lazy = () -> SubBalanceInformation10.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>AvailableWithNoAdditionalStatus</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation11
	 * SubBalanceInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;AvailableWithNoAdditionalStatus&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAvailableWithNoStatusRule#forSubBalanceInformation15
	 * ConstraintAvailableWithNoStatusRule.forSubBalanceInformation15}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation11> forSubBalanceInformation11 = new MMConstraint<SubBalanceInformation11>() {
		{
			validator = ConstraintAvailableWithNoStatusRule::checkSubBalanceInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoStatusRule";
			definition = "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAvailableWithNoStatusRule.forSubBalanceInformation15);
			owner_lazy = () -> SubBalanceInformation11.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>AvailableWithNoAdditionalStatus</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation12
	 * SubBalanceInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;AvailableWithNoAdditionalStatus&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation12> forSubBalanceInformation12 = new MMConstraint<SubBalanceInformation12>() {
		{
			validator = ConstraintAvailableWithNoStatusRule::checkSubBalanceInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoStatusRule";
			definition = "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used.";
			owner_lazy = () -> SubBalanceInformation12.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>AvailableWithNoAdditionalStatus</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15
	 * SubBalanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;AvailableWithNoAdditionalStatus&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAvailableWithNoStatusRule#forSubBalanceInformation11
	 * ConstraintAvailableWithNoStatusRule.forSubBalanceInformation11}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation15> forSubBalanceInformation15 = new MMConstraint<SubBalanceInformation15>() {
		{
			validator = ConstraintAvailableWithNoStatusRule::checkSubBalanceInformation15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoStatusRule";
			definition = "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAvailableWithNoStatusRule.forSubBalanceInformation11;
			owner_lazy = () -> SubBalanceInformation15.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>AvailableWithNoAdditionalStatus</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14
	 * SubBalanceInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;AvailableWithNoAdditionalStatus&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAvailableWithNoStatusRule#forSubBalanceInformation6
	 * ConstraintAvailableWithNoStatusRule.forSubBalanceInformation6}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation14> forSubBalanceInformation14 = new MMConstraint<SubBalanceInformation14>() {
		{
			validator = ConstraintAvailableWithNoStatusRule::checkSubBalanceInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoStatusRule";
			definition = "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAvailableWithNoStatusRule.forSubBalanceInformation6;
			owner_lazy = () -> SubBalanceInformation14.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>AvailableWithNoAdditionalStatus</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation17
	 * SubBalanceInformation17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;AvailableWithNoAdditionalStatus&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation17> forSubBalanceInformation17 = new MMConstraint<SubBalanceInformation17>() {
		{
			validator = ConstraintAvailableWithNoStatusRule::checkSubBalanceInformation17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoStatusRule";
			definition = "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used.";
			owner_lazy = () -> SubBalanceInformation17.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>AvailableWithNoAdditionalStatus</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation16
	 * SubBalanceInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;AvailableWithNoAdditionalStatus&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation16> forSubBalanceInformation16 = new MMConstraint<SubBalanceInformation16>() {
		{
			validator = ConstraintAvailableWithNoStatusRule::checkSubBalanceInformation16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoStatusRule";
			definition = "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used.";
			owner_lazy = () -> SubBalanceInformation16.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>AvailableWithNoAdditionalStatus</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
	 * cannot be used.
	 */
	public static void checkSubBalanceInformation6(SubBalanceInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
	 * cannot be used.
	 */
	public static void checkSubBalanceInformation7(SubBalanceInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
	 * cannot be used.
	 */
	public static void checkSubBalanceInformation5(SubBalanceInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
	 * cannot be used.
	 */
	public static void checkSubBalanceInformation8(SubBalanceInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
	 * cannot be used.
	 */
	public static void checkSubBalanceInformation9(SubBalanceInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
	 * cannot be used.
	 */
	public static void checkSubBalanceInformation10(SubBalanceInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
	 * cannot be used.
	 */
	public static void checkSubBalanceInformation11(SubBalanceInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
	 * cannot be used.
	 */
	public static void checkSubBalanceInformation12(SubBalanceInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
	 * cannot be used.
	 */
	public static void checkSubBalanceInformation15(SubBalanceInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
	 * cannot be used.
	 */
	public static void checkSubBalanceInformation14(SubBalanceInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
	 * cannot be used.
	 */
	public static void checkSubBalanceInformation17(SubBalanceInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
	 * cannot be used.
	 */
	public static void checkSubBalanceInformation16(SubBalanceInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}