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
import com.tools20022.repository.choice.NumberCount1Choice;
import com.tools20022.repository.msg.TotalNumber1;

/**
 * If the Sender wants to indicate that this instruction is linked to one or
 * more settlement instruction, then the CurrentInstructionNumber must be
 * specified.
 */
public class ConstraintCurrentInstructionNumberRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TotalNumber1 TotalNumber1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentInstructionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the Sender wants to indicate that this instruction is linked to one or more settlement instruction, then the CurrentInstructionNumber must be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TotalNumber1> forTotalNumber1 = new MMConstraint<TotalNumber1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentInstructionNumberRule";
			definition = "If the Sender wants to indicate that this instruction is linked to one or more settlement instruction, then the CurrentInstructionNumber must be specified.";
			owner_lazy = () -> TotalNumber1.mmObject();
		}

		@Override
		public void executeValidator(TotalNumber1 obj) throws Exception {
			checkTotalNumber1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NumberCount1Choice
	 * NumberCount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentInstructionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the Sender wants to indicate that this instruction is linked to one or more settlement instruction, then the CurrentInstructionNumber must be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NumberCount1Choice> forNumberCount1Choice = new MMConstraint<NumberCount1Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentInstructionNumberRule";
			definition = "If the Sender wants to indicate that this instruction is linked to one or more settlement instruction, then the CurrentInstructionNumber must be specified.";
			owner_lazy = () -> NumberCount1Choice.mmObject();
		}

		@Override
		public void executeValidator(NumberCount1Choice obj) throws Exception {
			checkNumberCount1Choice(obj);
		}
	};

	/**
	 * If the Sender wants to indicate that this instruction is linked to one or
	 * more settlement instruction, then the CurrentInstructionNumber must be
	 * specified.
	 */
	public static void checkTotalNumber1(TotalNumber1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the Sender wants to indicate that this instruction is linked to one or
	 * more settlement instruction, then the CurrentInstructionNumber must be
	 * specified.
	 */
	public static void checkNumberCount1Choice(NumberCount1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}