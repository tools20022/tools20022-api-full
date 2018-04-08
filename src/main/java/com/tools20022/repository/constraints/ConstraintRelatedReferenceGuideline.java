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
import com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01;
import com.tools20022.repository.area.setr.OrderInstructionStatusReportV02;

/**
 * If RelatedReference/MessageName is present, it must contain 515 or must start
 * with setr.003, setr.006, setr.009, setr.012, setr.015, setr.047, setr.048,
 * setr.049, setr.050, setr.051, setr.052, setr.053, setr.054, setr.055,setr.056
 * or setr.058 and RelatedReference/Reference must contain the reference of a
 * message in this list.
 */
public class ConstraintRelatedReferenceGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01
	 * OrderConfirmationStatusReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RelatedReference/MessageName is present, it must contain 515 or must start with setr.003, setr.006, setr.009, setr.012, setr.015, setr.047, setr.048, setr.049, setr.050, setr.051, setr.052, setr.053, setr.054, setr.055,setr.056 or setr.058 and RelatedReference/Reference must contain the reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OrderConfirmationStatusReportV01> for_setr_OrderConfirmationStatusReportV01 = new MMConstraint<OrderConfirmationStatusReportV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceGuideline";
			definition = "If RelatedReference/MessageName is present, it must contain 515 or must start with setr.003, setr.006, setr.009, setr.012, setr.015, setr.047, setr.048, setr.049, setr.050, setr.051, setr.052, setr.053, setr.054, setr.055,setr.056 or setr.058 and RelatedReference/Reference must contain the reference of a message in this list.";
			owner_lazy = () -> OrderConfirmationStatusReportV01.mmObject();
		}

		@Override
		public void executeValidator(OrderConfirmationStatusReportV01 obj) throws Exception {
			check_setr_OrderConfirmationStatusReportV01(obj);
		}
	};
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
	 * name} = "RelatedReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RelatedReference/MessageName is present, it must contain 502 or must start with setr.001 or setr.004 or setr.007 or setr.010 or setr.013 or setr.025 and Reference must contain the business reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OrderInstructionStatusReportV02> for_setr_OrderInstructionStatusReportV02 = new MMConstraint<OrderInstructionStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceGuideline";
			definition = "If RelatedReference/MessageName is present, it must contain 502 or must start with setr.001 or setr.004 or setr.007 or setr.010 or setr.013 or setr.025 and Reference must contain the business reference of a message in this list.";
			owner_lazy = () -> OrderInstructionStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(OrderInstructionStatusReportV02 obj) throws Exception {
			check_setr_OrderInstructionStatusReportV02(obj);
		}
	};

	/**
	 * If RelatedReference/MessageName is present, it must contain 515 or must
	 * start with setr.003, setr.006, setr.009, setr.012, setr.015, setr.047,
	 * setr.048, setr.049, setr.050, setr.051, setr.052, setr.053, setr.054,
	 * setr.055,setr.056 or setr.058 and RelatedReference/Reference must contain
	 * the reference of a message in this list.
	 */
	public static void check_setr_OrderConfirmationStatusReportV01(OrderConfirmationStatusReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RelatedReference/MessageName is present, it must contain 502 or must
	 * start with setr.001 or setr.004 or setr.007 or setr.010 or setr.013 or
	 * setr.025 and Reference must contain the business reference of a message
	 * in this list.
	 */
	public static void check_setr_OrderInstructionStatusReportV02(OrderInstructionStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}