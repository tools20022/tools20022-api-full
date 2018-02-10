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
import com.tools20022.repository.msg.Instruction2;
import com.tools20022.repository.msg.Instruction3;
import java.util.Arrays;

/**
 * If instructions are provided via a proxy, then it is recommended that vote
 * instructions are provided via the element
 * Proxy/VoteInstructionForAgendaResolution/VoteInstruction or
 * Proxy/VoteInstructionForAgendaResolution/GlobalVoteInstruction. If
 * instructions are not provided via a proxy, then it is recommended to use the
 * element VoteDetails/VoteInstructionForAgendaResolution/VoteInstruction or
 * VoteDetails/VoteInstructionForAgendaResolution/GlobalVoteInstruction.
 */
public class ConstraintVoteInstruction1Guideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Instruction2 Instruction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstruction1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If instructions are provided via a proxy, then it is recommended that vote instructions are provided via the element Proxy/VoteInstructionForAgendaResolution/VoteInstruction or Proxy/VoteInstructionForAgendaResolution/GlobalVoteInstruction.\nIf instructions are not provided via a proxy, then it is recommended to use the element VoteDetails/VoteInstructionForAgendaResolution/VoteInstruction or VoteDetails/VoteInstructionForAgendaResolution/GlobalVoteInstruction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintVoteInstruction1Guideline#forInstruction3
	 * ConstraintVoteInstruction1Guideline.forInstruction3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Instruction2> forInstruction2 = new MMConstraint<Instruction2>() {
		{
			validator = ConstraintVoteInstruction1Guideline::checkInstruction2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstruction1Guideline";
			definition = "If instructions are provided via a proxy, then it is recommended that vote instructions are provided via the element Proxy/VoteInstructionForAgendaResolution/VoteInstruction or Proxy/VoteInstructionForAgendaResolution/GlobalVoteInstruction.\nIf instructions are not provided via a proxy, then it is recommended to use the element VoteDetails/VoteInstructionForAgendaResolution/VoteInstruction or VoteDetails/VoteInstructionForAgendaResolution/GlobalVoteInstruction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintVoteInstruction1Guideline.forInstruction3);
			owner_lazy = () -> Instruction2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Instruction3 Instruction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstruction1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If instructions are provided via a proxy, then it is recommended that vote instructions are provided via the element Proxy/VoteInstructionForAgendaResolution/VoteInstruction or Proxy/VoteInstructionForAgendaResolution/GlobalVoteInstruction.\nIf instructions are not provided via a proxy, then it is recommended to use the element VoteDetails/VoteInstructionForAgendaResolution/VoteInstruction or VoteDetails/VoteInstructionForAgendaResolution/GlobalVoteInstruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintVoteInstruction1Guideline#forInstruction2
	 * ConstraintVoteInstruction1Guideline.forInstruction2}</li>
	 * </ul>
	 */
	public static final MMConstraint<Instruction3> forInstruction3 = new MMConstraint<Instruction3>() {
		{
			validator = ConstraintVoteInstruction1Guideline::checkInstruction3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstruction1Guideline";
			definition = "If instructions are provided via a proxy, then it is recommended that vote instructions are provided via the element Proxy/VoteInstructionForAgendaResolution/VoteInstruction or Proxy/VoteInstructionForAgendaResolution/GlobalVoteInstruction.\nIf instructions are not provided via a proxy, then it is recommended to use the element VoteDetails/VoteInstructionForAgendaResolution/VoteInstruction or VoteDetails/VoteInstructionForAgendaResolution/GlobalVoteInstruction.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintVoteInstruction1Guideline.forInstruction2;
			owner_lazy = () -> Instruction3.mmObject();
		}
	};

	/**
	 * If instructions are provided via a proxy, then it is recommended that
	 * vote instructions are provided via the element
	 * Proxy/VoteInstructionForAgendaResolution/VoteInstruction or
	 * Proxy/VoteInstructionForAgendaResolution/GlobalVoteInstruction. If
	 * instructions are not provided via a proxy, then it is recommended to use
	 * the element
	 * VoteDetails/VoteInstructionForAgendaResolution/VoteInstruction or
	 * VoteDetails/VoteInstructionForAgendaResolution/GlobalVoteInstruction.
	 */
	public static void checkInstruction2(Instruction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If instructions are provided via a proxy, then it is recommended that
	 * vote instructions are provided via the element
	 * Proxy/VoteInstructionForAgendaResolution/VoteInstruction or
	 * Proxy/VoteInstructionForAgendaResolution/GlobalVoteInstruction. If
	 * instructions are not provided via a proxy, then it is recommended to use
	 * the element
	 * VoteDetails/VoteInstructionForAgendaResolution/VoteInstruction or
	 * VoteDetails/VoteInstructionForAgendaResolution/GlobalVoteInstruction.
	 */
	public static void checkInstruction3(Instruction3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}