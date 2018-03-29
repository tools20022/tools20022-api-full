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
import com.tools20022.repository.msg.TotalNumber1;

/**
 * In a block trade instruction, the total number of children must be provided
 * using TotalOfLinkedInstructions.<br>
 * The CurrentInstructionNumber of the parent must be 000. The children must
 * have an incremental CurrentInstructionNumber from 001 to 999.<br>
 * For more details, see the relevant market practice document on www.smpg.info.
 */
public class ConstraintBlockTradeGuideline {

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
	 * name} = "BlockTradeGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a block trade instruction, the total number of children must be provided using TotalOfLinkedInstructions.\r\nThe CurrentInstructionNumber of the parent must be 000. The children must have an incremental CurrentInstructionNumber from 001 to 999.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TotalNumber1> forTotalNumber1 = new MMConstraint<TotalNumber1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockTradeGuideline";
			definition = "In a block trade instruction, the total number of children must be provided using TotalOfLinkedInstructions.\r\nThe CurrentInstructionNumber of the parent must be 000. The children must have an incremental CurrentInstructionNumber from 001 to 999.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> TotalNumber1.mmObject();
		}

		@Override
		public void executeValidator(TotalNumber1 obj) throws Exception {
			checkTotalNumber1(obj);
		}
	};

	/**
	 * In a block trade instruction, the total number of children must be
	 * provided using TotalOfLinkedInstructions.<br>
	 * The CurrentInstructionNumber of the parent must be 000. The children must
	 * have an incremental CurrentInstructionNumber from 001 to 999.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkTotalNumber1(TotalNumber1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}