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
import com.tools20022.repository.area.seev.AgentCAMovementInstructionV01;

/**
 * IF MovementGeneralInformation/OrderType is CHAN (OptionChangeOrder) then
 * OptionNumber and OptionType must be present in each occurrence of
 * UnderlyingSecuritiesMovementDetails/CreditAccountDetails and
 * UnderlyingSecuritiesMovement/DebitAccountDetails and OptionNumber and
 * OptionType cannot be present in MovementGeneralInformation.
 */
public class ConstraintOptionRule1 {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01
	 * AgentCAMovementInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionRule1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IF MovementGeneralInformation/OrderType is CHAN (OptionChangeOrder) then OptionNumber and OptionType must be present in each occurrence of UnderlyingSecuritiesMovementDetails/CreditAccountDetails and UnderlyingSecuritiesMovement/DebitAccountDetails and OptionNumber and OptionType cannot be present in MovementGeneralInformation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AgentCAMovementInstructionV01> for_seev_AgentCAMovementInstructionV01 = new MMConstraint<AgentCAMovementInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionRule1";
			definition = "IF MovementGeneralInformation/OrderType is CHAN (OptionChangeOrder) then OptionNumber and OptionType must be present in each occurrence of UnderlyingSecuritiesMovementDetails/CreditAccountDetails and UnderlyingSecuritiesMovement/DebitAccountDetails and OptionNumber and OptionType cannot be present in MovementGeneralInformation.";
			owner_lazy = () -> AgentCAMovementInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(AgentCAMovementInstructionV01 obj) throws Exception {
			check_seev_AgentCAMovementInstructionV01(obj);
		}
	};

	/**
	 * IF MovementGeneralInformation/OrderType is CHAN (OptionChangeOrder) then
	 * OptionNumber and OptionType must be present in each occurrence of
	 * UnderlyingSecuritiesMovementDetails/CreditAccountDetails and
	 * UnderlyingSecuritiesMovement/DebitAccountDetails and OptionNumber and
	 * OptionType cannot be present in MovementGeneralInformation.
	 */
	public static void check_seev_AgentCAMovementInstructionV01(AgentCAMovementInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}