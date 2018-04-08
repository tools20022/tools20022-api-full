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
import com.tools20022.repository.area.setr.OrderInstructionStatusReportV02;

/**
 * Status 'cancelled' must be used to report a cancellation that is not
 * originated by the instructing party.
 * 
 * If a cancellation has been originated by the instructing party then the
 * message OrderCancellationStatusReport must be used to report the status of
 * this cancellation request.
 */
public class ConstraintStatusCancelledGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02
	 * OrderInstructionStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusCancelledGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status 'cancelled' must be used to report a cancellation that is not originated by the instructing party.\n\nIf a cancellation has been originated by the instructing party then the message OrderCancellationStatusReport must be used to report the status of this cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OrderInstructionStatusReportV02> for_setr_OrderInstructionStatusReportV02 = new MMConstraint<OrderInstructionStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusCancelledGuideline";
			definition = "Status 'cancelled' must be used to report a cancellation that is not originated by the instructing party.\n\nIf a cancellation has been originated by the instructing party then the message OrderCancellationStatusReport must be used to report the status of this cancellation request.";
			owner_lazy = () -> OrderInstructionStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(OrderInstructionStatusReportV02 obj) throws Exception {
			check_setr_OrderInstructionStatusReportV02(obj);
		}
	};

	/**
	 * Status 'cancelled' must be used to report a cancellation that is not
	 * originated by the instructing party.
	 * 
	 * If a cancellation has been originated by the instructing party then the
	 * message OrderCancellationStatusReport must be used to report the status
	 * of this cancellation request.
	 */
	public static void check_setr_OrderInstructionStatusReportV02(OrderInstructionStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}