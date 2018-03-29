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
import com.tools20022.repository.area.camt.ModifyMemberV03;

/**
 * The NewMemberValueSet consists of a MemberReturnAddress, a
 * CommunicationAddress or a ContactReference. At a minimum, one of these
 * elements must be present.
 */
public class ConstraintMandatoryValueRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.ModifyMemberV03
	 * ModifyMemberV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The NewMemberValueSet consists of a MemberReturnAddress, a CommunicationAddress or a ContactReference. At a minimum, one of these elements must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ModifyMemberV03> forModifyMemberV03 = new MMConstraint<ModifyMemberV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryValueRule";
			definition = "The NewMemberValueSet consists of a MemberReturnAddress, a CommunicationAddress or a ContactReference. At a minimum, one of these elements must be present.";
			owner_lazy = () -> ModifyMemberV03.mmObject();
		}

		@Override
		public void executeValidator(ModifyMemberV03 obj) throws Exception {
			checkModifyMemberV03(obj);
		}
	};

	/**
	 * The NewMemberValueSet consists of a MemberReturnAddress, a
	 * CommunicationAddress or a ContactReference. At a minimum, one of these
	 * elements must be present.
	 */
	public static void checkModifyMemberV03(ModifyMemberV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}