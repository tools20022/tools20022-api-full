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
import com.tools20022.repository.msg.CorrectivePaymentInitiation1;
import com.tools20022.repository.msg.CorrectivePaymentInitiation2;
import com.tools20022.repository.msg.CorrectivePaymentInitiation3;
import java.util.Arrays;

/**
 * Either RequestedExecutionDate or RequestedCollectionDate must be present.
 */
public class ConstraintRequestedDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1
	 * CorrectivePaymentInitiation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RequestedExecutionDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RequestedCollectionDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RequestedExecutionDate or RequestedCollectionDate must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedDateRule#forCorrectivePaymentInitiation2
	 * ConstraintRequestedDateRule.forCorrectivePaymentInitiation2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorrectivePaymentInitiation1> forCorrectivePaymentInitiation1 = new MMConstraint<CorrectivePaymentInitiation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedDateRule";
			definition = "Either RequestedExecutionDate or RequestedCollectionDate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedDateRule.forCorrectivePaymentInitiation2);
			owner_lazy = () -> CorrectivePaymentInitiation1.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/RequestedExecutionDate</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/RequestedCollectionDate</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CorrectivePaymentInitiation1 obj) throws Exception {
			checkCorrectivePaymentInitiation1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2
	 * CorrectivePaymentInitiation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RequestedExecutionDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RequestedCollectionDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RequestedExecutionDate or RequestedCollectionDate must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedDateRule#forCorrectivePaymentInitiation3
	 * ConstraintRequestedDateRule.forCorrectivePaymentInitiation3}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedDateRule#forCorrectivePaymentInitiation1
	 * ConstraintRequestedDateRule.forCorrectivePaymentInitiation1}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorrectivePaymentInitiation2> forCorrectivePaymentInitiation2 = new MMConstraint<CorrectivePaymentInitiation2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedDateRule";
			definition = "Either RequestedExecutionDate or RequestedCollectionDate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedDateRule.forCorrectivePaymentInitiation3);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedDateRule.forCorrectivePaymentInitiation1;
			owner_lazy = () -> CorrectivePaymentInitiation2.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/RequestedExecutionDate</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/RequestedCollectionDate</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CorrectivePaymentInitiation2 obj) throws Exception {
			checkCorrectivePaymentInitiation2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation3
	 * CorrectivePaymentInitiation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RequestedExecutionDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RequestedCollectionDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RequestedExecutionDate or RequestedCollectionDate must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedDateRule#forCorrectivePaymentInitiation2
	 * ConstraintRequestedDateRule.forCorrectivePaymentInitiation2}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorrectivePaymentInitiation3> forCorrectivePaymentInitiation3 = new MMConstraint<CorrectivePaymentInitiation3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedDateRule";
			definition = "Either RequestedExecutionDate or RequestedCollectionDate must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedDateRule.forCorrectivePaymentInitiation2;
			owner_lazy = () -> CorrectivePaymentInitiation3.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/RequestedExecutionDate</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/RequestedCollectionDate</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CorrectivePaymentInitiation3 obj) throws Exception {
			checkCorrectivePaymentInitiation3(obj);
		}
	};

	/**
	 * Either RequestedExecutionDate or RequestedCollectionDate must be present.
	 */
	public static void checkCorrectivePaymentInitiation1(CorrectivePaymentInitiation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RequestedExecutionDate or RequestedCollectionDate must be present.
	 */
	public static void checkCorrectivePaymentInitiation2(CorrectivePaymentInitiation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RequestedExecutionDate or RequestedCollectionDate must be present.
	 */
	public static void checkCorrectivePaymentInitiation3(CorrectivePaymentInitiation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}