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
 * If CollateralSubstitutionRequestSequence equals "Updated" (UPDD) then
 * LinkedReferences must be present.
 */
public class ConstraintSubstitutionRequestSequenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution3
	 * CollateralSubstitution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/LinkedReferences&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CollateralSubstitutionSequence&lt;/leftOperand&gt;&lt;rightOperand&gt;Updated&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionRequestSequenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CollateralSubstitutionRequestSequence equals \"Updated\" (UPDD) then LinkedReferences must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule#forCollateralSubstitution4
	 * ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution4}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule#forCollateralSubstitution2
	 * ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution2}</li>
	 * </ul>
	 */
	public static final MMConstraint<CollateralSubstitution3> forCollateralSubstitution3 = new MMConstraint<CollateralSubstitution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionRequestSequenceRule";
			definition = "If CollateralSubstitutionRequestSequence equals \"Updated\" (UPDD) then LinkedReferences must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution4);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution2;
			owner_lazy = () -> CollateralSubstitution3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/LinkedReferences</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CollateralSubstitutionSequence</leftOperand><rightOperand>Updated</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CollateralSubstitution3 obj) throws Exception {
			checkCollateralSubstitution3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution4
	 * CollateralSubstitution4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/LinkedReferences&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CollateralSubstitutionSequence&lt;/leftOperand&gt;&lt;rightOperand&gt;Updated&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionRequestSequenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CollateralSubstitutionRequestSequence equals \"Updated\" (UPDD) then LinkedReferences must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule#forCollateralSubstitution3
	 * ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution3}</li>
	 * </ul>
	 */
	public static final MMConstraint<CollateralSubstitution4> forCollateralSubstitution4 = new MMConstraint<CollateralSubstitution4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionRequestSequenceRule";
			definition = "If CollateralSubstitutionRequestSequence equals \"Updated\" (UPDD) then LinkedReferences must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution3;
			owner_lazy = () -> CollateralSubstitution4.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/LinkedReferences</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CollateralSubstitutionSequence</leftOperand><rightOperand>Updated</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CollateralSubstitution4 obj) throws Exception {
			checkCollateralSubstitution4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5
	 * CollateralSubstitution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/LinkedReferences&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CollateralSubstitutionSequence&lt;/leftOperand&gt;&lt;rightOperand&gt;Updated&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionRequestSequenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CollateralSubstitutionRequestSequence equals \"Updated\" (UPDD) then LinkedReferences must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule#forCollateralSubstitution2
	 * ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution2}</li>
	 * </ul>
	 */
	public static final MMConstraint<CollateralSubstitution5> forCollateralSubstitution5 = new MMConstraint<CollateralSubstitution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionRequestSequenceRule";
			definition = "If CollateralSubstitutionRequestSequence equals \"Updated\" (UPDD) then LinkedReferences must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution2;
			owner_lazy = () -> CollateralSubstitution5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/LinkedReferences</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CollateralSubstitutionSequence</leftOperand><rightOperand>Updated</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CollateralSubstitution5 obj) throws Exception {
			checkCollateralSubstitution5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2
	 * CollateralSubstitution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/LinkedReferences&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CollateralSubstitutionSequence&lt;/leftOperand&gt;&lt;rightOperand&gt;Updated&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionRequestSequenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CollateralSubstitutionRequestSequence equals \"Updated\" (UPDD) then LinkedReferences must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule#forCollateralSubstitution3
	 * ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule#forCollateralSubstitution5
	 * ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution5}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule#forCollateralSubstitution1
	 * ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution1}</li>
	 * </ul>
	 */
	public static final MMConstraint<CollateralSubstitution2> forCollateralSubstitution2 = new MMConstraint<CollateralSubstitution2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionRequestSequenceRule";
			definition = "If CollateralSubstitutionRequestSequence equals \"Updated\" (UPDD) then LinkedReferences must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution3,
					com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution5);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution1;
			owner_lazy = () -> CollateralSubstitution2.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/LinkedReferences</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CollateralSubstitutionSequence</leftOperand><rightOperand>Updated</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CollateralSubstitution2 obj) throws Exception {
			checkCollateralSubstitution2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1
	 * CollateralSubstitution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReferenceDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CollateralSubstitutionSequence&lt;/leftOperand&gt;&lt;rightOperand&gt;Updated&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionRequestSequenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CollateralSubstitutionRequestSequence equals updated then Reference must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule#forCollateralSubstitution2
	 * ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CollateralSubstitution1> forCollateralSubstitution1 = new MMConstraint<CollateralSubstitution1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionRequestSequenceRule";
			definition = "If CollateralSubstitutionRequestSequence equals updated then Reference must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution2);
			owner_lazy = () -> CollateralSubstitution1.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReferenceDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CollateralSubstitutionSequence</leftOperand><rightOperand>Updated</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CollateralSubstitution1 obj) throws Exception {
			checkCollateralSubstitution1(obj);
		}
	};

	/**
	 * If CollateralSubstitutionRequestSequence equals "Updated" (UPDD) then
	 * LinkedReferences must be present.
	 */
	public static void checkCollateralSubstitution3(CollateralSubstitution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CollateralSubstitutionRequestSequence equals "Updated" (UPDD) then
	 * LinkedReferences must be present.
	 */
	public static void checkCollateralSubstitution4(CollateralSubstitution4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CollateralSubstitutionRequestSequence equals "Updated" (UPDD) then
	 * LinkedReferences must be present.
	 */
	public static void checkCollateralSubstitution5(CollateralSubstitution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CollateralSubstitutionRequestSequence equals "Updated" (UPDD) then
	 * LinkedReferences must be present.
	 */
	public static void checkCollateralSubstitution2(CollateralSubstitution2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CollateralSubstitutionRequestSequence equals updated then Reference
	 * must be present.
	 */
	public static void checkCollateralSubstitution1(CollateralSubstitution1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}