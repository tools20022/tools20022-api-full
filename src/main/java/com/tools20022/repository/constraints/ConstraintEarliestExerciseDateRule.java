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
 * If ExerciseStyle is AMER, then EarliestExerciseDate must be present.
 */
public class ConstraintEarliestExerciseDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Option4 Option4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestExerciseDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ExerciseStyle is AMER, then EarliestExerciseDate must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<Option4> forOption4 = new MMConstraint<Option4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestExerciseDateRule";
			definition = "If ExerciseStyle is AMER, then EarliestExerciseDate must be present.";
			owner_lazy = () -> Option4.mmObject();
		}

		@Override
		public void executeValidator(Option4 obj) throws Exception {
			checkOption4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Option6 Option6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestExerciseDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Option/ExerciseStyle is AMER, then Option/EarliestExerciseDate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Option6> forOption6 = new MMConstraint<Option6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestExerciseDateRule";
			definition = "If Option/ExerciseStyle is AMER, then Option/EarliestExerciseDate must be present.";
			owner_lazy = () -> Option6.mmObject();
		}

		@Override
		public void executeValidator(Option6 obj) throws Exception {
			checkOption6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Option3 Option3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestExerciseDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ExerciseStyle is AMER, then EarliestExerciseDate must be present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEarliestExerciseDateRule#forOption10
	 * ConstraintEarliestExerciseDateRule.forOption10}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Option3> forOption3 = new MMConstraint<Option3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestExerciseDateRule";
			definition = "If ExerciseStyle is AMER, then EarliestExerciseDate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEarliestExerciseDateRule.forOption10);
			owner_lazy = () -> Option3.mmObject();
		}

		@Override
		public void executeValidator(Option3 obj) throws Exception {
			checkOption3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Option10 Option10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestExerciseDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ExerciseStyle is AMER, then EarliestExerciseDate must be present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEarliestExerciseDateRule#forOption3
	 * ConstraintEarliestExerciseDateRule.forOption3}</li>
	 * </ul>
	 */
	public static final MMConstraint<Option10> forOption10 = new MMConstraint<Option10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestExerciseDateRule";
			definition = "If ExerciseStyle is AMER, then EarliestExerciseDate must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEarliestExerciseDateRule.forOption3;
			owner_lazy = () -> Option10.mmObject();
		}

		@Override
		public void executeValidator(Option10 obj) throws Exception {
			checkOption10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Option2 Option2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestExerciseDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ExerciseStyle is AMER, then EarliestExerciseDate must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<Option2> forOption2 = new MMConstraint<Option2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestExerciseDateRule";
			definition = "If ExerciseStyle is AMER, then EarliestExerciseDate must be present.";
			owner_lazy = () -> Option2.mmObject();
		}

		@Override
		public void executeValidator(Option2 obj) throws Exception {
			checkOption2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Option5 Option5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestExerciseDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Opttion/ExerciseStyle is AMER, then Option/EarliestExerciseDate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Option5> forOption5 = new MMConstraint<Option5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestExerciseDateRule";
			definition = "If Opttion/ExerciseStyle is AMER, then Option/EarliestExerciseDate must be present.";
			owner_lazy = () -> Option5.mmObject();
		}

		@Override
		public void executeValidator(Option5 obj) throws Exception {
			checkOption5(obj);
		}
	};

	/**
	 * If ExerciseStyle is AMER, then EarliestExerciseDate must be present.
	 */
	public static void checkOption4(Option4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Option/ExerciseStyle is AMER, then Option/EarliestExerciseDate must be
	 * present.
	 */
	public static void checkOption6(Option6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ExerciseStyle is AMER, then EarliestExerciseDate must be present.
	 */
	public static void checkOption3(Option3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ExerciseStyle is AMER, then EarliestExerciseDate must be present.
	 */
	public static void checkOption10(Option10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ExerciseStyle is AMER, then EarliestExerciseDate must be present.
	 */
	public static void checkOption2(Option2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Opttion/ExerciseStyle is AMER, then Option/EarliestExerciseDate must
	 * be present.
	 */
	public static void checkOption5(Option5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}