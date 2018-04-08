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
public class ConstraintBalanceFromToRule2 {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails30
	 * IntraPositionDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails30> forIntraPositionDetails30 = new MMConstraint<IntraPositionDetails30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails30.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails30 obj) throws Exception {
			checkIntraPositionDetails30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails3
	 * IntraPositionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the IntraPositionMovement BalanceTo SecuritiesBalanceType."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails3> forIntraPositionDetails3 = new MMConstraint<IntraPositionDetails3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the IntraPositionMovement BalanceTo SecuritiesBalanceType.";
			owner_lazy = () -> IntraPositionDetails3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails3 obj) throws Exception {
			checkIntraPositionDetails3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails44
	 * IntraPositionDetails44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails44> forIntraPositionDetails44 = new MMConstraint<IntraPositionDetails44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails44.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails44 obj) throws Exception {
			checkIntraPositionDetails44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails45
	 * IntraPositionDetails45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BalanceFrom/Code must be different from the IntraPositionMovement/BalanceTo/Code."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule2#forIntraPositionDetails40
	 * ConstraintBalanceFromToRule2.forIntraPositionDetails40}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails45> forIntraPositionDetails45 = new MMConstraint<IntraPositionDetails45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "BalanceFrom/Code must be different from the IntraPositionMovement/BalanceTo/Code.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceFromToRule2.forIntraPositionDetails40;
			owner_lazy = () -> IntraPositionDetails45.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails45 obj) throws Exception {
			checkIntraPositionDetails45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails32
	 * IntraPositionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule2#forIntraPositionDetails40
	 * ConstraintBalanceFromToRule2.forIntraPositionDetails40}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule2#forIntraPositionDetails28
	 * ConstraintBalanceFromToRule2.forIntraPositionDetails28}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails32> forIntraPositionDetails32 = new MMConstraint<IntraPositionDetails32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceFromToRule2.forIntraPositionDetails40);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceFromToRule2.forIntraPositionDetails28;
			owner_lazy = () -> IntraPositionDetails32.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails32 obj) throws Exception {
			checkIntraPositionDetails32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails28
	 * IntraPositionDetails28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule2#forIntraPositionDetails32
	 * ConstraintBalanceFromToRule2.forIntraPositionDetails32}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails28> forIntraPositionDetails28 = new MMConstraint<IntraPositionDetails28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceFromToRule2.forIntraPositionDetails32);
			owner_lazy = () -> IntraPositionDetails28.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails28 obj) throws Exception {
			checkIntraPositionDetails28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails17
	 * IntraPositionDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails17> forIntraPositionDetails17 = new MMConstraint<IntraPositionDetails17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails17.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails17 obj) throws Exception {
			checkIntraPositionDetails17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails6
	 * IntraPositionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the IntraPositionMovement BalanceTo SecuritiesBalanceType."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails6> forIntraPositionDetails6 = new MMConstraint<IntraPositionDetails6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the IntraPositionMovement BalanceTo SecuritiesBalanceType.";
			owner_lazy = () -> IntraPositionDetails6.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails6 obj) throws Exception {
			checkIntraPositionDetails6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails40
	 * IntraPositionDetails40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BalanceFrom/Code must be different from the IntraPositionMovement/BalanceTo/Code."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule2#forIntraPositionDetails45
	 * ConstraintBalanceFromToRule2.forIntraPositionDetails45}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule2#forIntraPositionDetails32
	 * ConstraintBalanceFromToRule2.forIntraPositionDetails32}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails40> forIntraPositionDetails40 = new MMConstraint<IntraPositionDetails40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "BalanceFrom/Code must be different from the IntraPositionMovement/BalanceTo/Code.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceFromToRule2.forIntraPositionDetails45);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceFromToRule2.forIntraPositionDetails32;
			owner_lazy = () -> IntraPositionDetails40.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails40 obj) throws Exception {
			checkIntraPositionDetails40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails10
	 * IntraPositionDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the IntraPositionMovement BalanceTo SecuritiesBalanceType."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails10> forIntraPositionDetails10 = new MMConstraint<IntraPositionDetails10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the IntraPositionMovement BalanceTo SecuritiesBalanceType.";
			owner_lazy = () -> IntraPositionDetails10.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails10 obj) throws Exception {
			checkIntraPositionDetails10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails20
	 * IntraPositionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails20> forIntraPositionDetails20 = new MMConstraint<IntraPositionDetails20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails20.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails20 obj) throws Exception {
			checkIntraPositionDetails20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails48
	 * IntraPositionDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails48> forIntraPositionDetails48 = new MMConstraint<IntraPositionDetails48>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails48.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails48 obj) throws Exception {
			checkIntraPositionDetails48(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails18
	 * IntraPositionDetails18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails18> forIntraPositionDetails18 = new MMConstraint<IntraPositionDetails18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails18.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails18 obj) throws Exception {
			checkIntraPositionDetails18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails24
	 * IntraPositionDetails24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails24> forIntraPositionDetails24 = new MMConstraint<IntraPositionDetails24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails24.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails24 obj) throws Exception {
			checkIntraPositionDetails24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails14
	 * IntraPositionDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the IntraPositionMovement BalanceTo SecuritiesBalanceType."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails14> forIntraPositionDetails14 = new MMConstraint<IntraPositionDetails14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the IntraPositionMovement BalanceTo SecuritiesBalanceType.";
			owner_lazy = () -> IntraPositionDetails14.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails14 obj) throws Exception {
			checkIntraPositionDetails14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails37
	 * IntraPositionDetails37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceFrom/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntraPositionMovement[*]/BalanceTo/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails37> forIntraPositionDetails37 = new MMConstraint<IntraPositionDetails37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule2";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails37.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand><rightOperand>/BalanceFrom/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntraPositionMovement[*]/BalanceTo/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(IntraPositionDetails37 obj) throws Exception {
			checkIntraPositionDetails37(obj);
		}
	};

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails30(IntraPositionDetails30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * IntraPositionMovement BalanceTo SecuritiesBalanceType.
	 */
	public static void checkIntraPositionDetails3(IntraPositionDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails44(IntraPositionDetails44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * BalanceFrom/Code must be different from the
	 * IntraPositionMovement/BalanceTo/Code.
	 */
	public static void checkIntraPositionDetails45(IntraPositionDetails45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails32(IntraPositionDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails28(IntraPositionDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails17(IntraPositionDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * IntraPositionMovement BalanceTo SecuritiesBalanceType.
	 */
	public static void checkIntraPositionDetails6(IntraPositionDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * BalanceFrom/Code must be different from the
	 * IntraPositionMovement/BalanceTo/Code.
	 */
	public static void checkIntraPositionDetails40(IntraPositionDetails40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * IntraPositionMovement BalanceTo SecuritiesBalanceType.
	 */
	public static void checkIntraPositionDetails10(IntraPositionDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails20(IntraPositionDetails20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails48(IntraPositionDetails48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails18(IntraPositionDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails24(IntraPositionDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * IntraPositionMovement BalanceTo SecuritiesBalanceType.
	 */
	public static void checkIntraPositionDetails14(IntraPositionDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails37(IntraPositionDetails37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}