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
import com.tools20022.repository.area.setr.*;
import java.util.Arrays;

/**
 * If Reference/RelatedReference/MessageName or
 * Reference/OtherReference/MessageName is present, it must it must contain 502
 * or must start with setr.002, setr.005, setr.008, setr.011, setr.014 or
 * setr.018 and Reference/RelatedReference/Reference must contain the message
 * reference of a message in this list.
 */
public class ConstraintMessageNameAndReferenceGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04
	 * OrderCancellationStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageNameAndReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reference/RelatedReference/MessageName or Reference/OtherReference/MessageName is present, it must it must contain 502 or must start with setr.002, setr.005, setr.008, setr.011, setr.014 or setr.018 and Reference/RelatedReference/Reference must contain the message reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OrderCancellationStatusReportV04> forOrderCancellationStatusReportV04 = new MMConstraint<OrderCancellationStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageNameAndReferenceGuideline";
			definition = "If Reference/RelatedReference/MessageName or Reference/OtherReference/MessageName is present, it must it must contain 502 or must start with setr.002, setr.005, setr.008, setr.011, setr.014 or setr.018 and Reference/RelatedReference/Reference must contain the message reference of a message in this list.";
			owner_lazy = () -> OrderCancellationStatusReportV04.mmObject();
		}

		@Override
		public void executeValidator(OrderCancellationStatusReportV04 obj) throws Exception {
			checkOrderCancellationStatusReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04
	 * OrderInstructionStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageNameAndReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reference/RelatedReference/MessageName or Reference/OtherReference/MessageName is present, it must contain 502 or must start with setr.001, setr.004, setr.007, setr.010, setr.013, setr.019 or setr.018 and Reference/RelatedReference/Reference must contain the message reference of a message in this list."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageNameAndReferenceGuideline#forOrderInstructionStatusReportV03
	 * ConstraintMessageNameAndReferenceGuideline.
	 * forOrderInstructionStatusReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<OrderInstructionStatusReportV04> forOrderInstructionStatusReportV04 = new MMConstraint<OrderInstructionStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageNameAndReferenceGuideline";
			definition = "If Reference/RelatedReference/MessageName or Reference/OtherReference/MessageName is present, it must contain 502 or must start with setr.001, setr.004, setr.007, setr.010, setr.013, setr.019 or setr.018 and Reference/RelatedReference/Reference must contain the message reference of a message in this list.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageNameAndReferenceGuideline.forOrderInstructionStatusReportV03;
			owner_lazy = () -> OrderInstructionStatusReportV04.mmObject();
		}

		@Override
		public void executeValidator(OrderInstructionStatusReportV04 obj) throws Exception {
			checkOrderInstructionStatusReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02
	 * OrderConfirmationStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageNameAndReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reference/RelatedReference/MessageName or Reference/OtherReference/MessageName is present, it must contain 502 or must start with setr.047, setr.049, setr.051, setr.053, setr.055, setr.058 and Reference/RelatedReference/Reference must contain the message reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OrderConfirmationStatusReportV02> forOrderConfirmationStatusReportV02 = new MMConstraint<OrderConfirmationStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageNameAndReferenceGuideline";
			definition = "If Reference/RelatedReference/MessageName or Reference/OtherReference/MessageName is present, it must contain 502 or must start with setr.047, setr.049, setr.051, setr.053, setr.055, setr.058 and Reference/RelatedReference/Reference must contain the message reference of a message in this list.";
			owner_lazy = () -> OrderConfirmationStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(OrderConfirmationStatusReportV02 obj) throws Exception {
			checkOrderConfirmationStatusReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03
	 * OrderCancellationStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageNameAndReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RelatedReference/MessageName or OtherReference/MessageName is present, it must contain 502 or must start with setr.002, setr.005, setr.008, setr.011, setr.014 or setr.018 and RelatedReference/Reference must contain the message reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OrderCancellationStatusReportV03> forOrderCancellationStatusReportV03 = new MMConstraint<OrderCancellationStatusReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageNameAndReferenceGuideline";
			definition = "If RelatedReference/MessageName or OtherReference/MessageName is present, it must contain 502 or must start with setr.002, setr.005, setr.008, setr.011, setr.014 or setr.018 and RelatedReference/Reference must contain the message reference of a message in this list.";
			owner_lazy = () -> OrderCancellationStatusReportV03.mmObject();
		}

		@Override
		public void executeValidator(OrderCancellationStatusReportV03 obj) throws Exception {
			checkOrderCancellationStatusReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03
	 * OrderInstructionStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageNameAndReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RelatedReference/MessageName or OtherReference/MessageName is present, it must contain 502 or must start with setr.001, setr.004, setr.007, setr.010, setr.013, setr.019 or setr.018 and RelatedReference/Reference must contain the message reference of a message in this list."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageNameAndReferenceGuideline#forOrderInstructionStatusReportV04
	 * ConstraintMessageNameAndReferenceGuideline.
	 * forOrderInstructionStatusReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OrderInstructionStatusReportV03> forOrderInstructionStatusReportV03 = new MMConstraint<OrderInstructionStatusReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageNameAndReferenceGuideline";
			definition = "If RelatedReference/MessageName or OtherReference/MessageName is present, it must contain 502 or must start with setr.001, setr.004, setr.007, setr.010, setr.013, setr.019 or setr.018 and RelatedReference/Reference must contain the message reference of a message in this list.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageNameAndReferenceGuideline.forOrderInstructionStatusReportV04);
			owner_lazy = () -> OrderInstructionStatusReportV03.mmObject();
		}

		@Override
		public void executeValidator(OrderInstructionStatusReportV03 obj) throws Exception {
			checkOrderInstructionStatusReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV02
	 * OrderCancellationStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageNameAndReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If MessageName is present, it must contain 502 or must start with setr.002 or setr.005 or setr.008 or setr.011 or setr.014 or setr.025 and Reference must contain the business reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OrderCancellationStatusReportV02> forOrderCancellationStatusReportV02 = new MMConstraint<OrderCancellationStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageNameAndReferenceGuideline";
			definition = "If MessageName is present, it must contain 502 or must start with setr.002 or setr.005 or setr.008 or setr.011 or setr.014 or setr.025 and Reference must contain the business reference of a message in this list.";
			owner_lazy = () -> OrderCancellationStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(OrderCancellationStatusReportV02 obj) throws Exception {
			checkOrderCancellationStatusReportV02(obj);
		}
	};

	/**
	 * If Reference/RelatedReference/MessageName or
	 * Reference/OtherReference/MessageName is present, it must it must contain
	 * 502 or must start with setr.002, setr.005, setr.008, setr.011, setr.014
	 * or setr.018 and Reference/RelatedReference/Reference must contain the
	 * message reference of a message in this list.
	 */
	public static void checkOrderCancellationStatusReportV04(OrderCancellationStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reference/RelatedReference/MessageName or
	 * Reference/OtherReference/MessageName is present, it must contain 502 or
	 * must start with setr.001, setr.004, setr.007, setr.010, setr.013,
	 * setr.019 or setr.018 and Reference/RelatedReference/Reference must
	 * contain the message reference of a message in this list.
	 */
	public static void checkOrderInstructionStatusReportV04(OrderInstructionStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reference/RelatedReference/MessageName or
	 * Reference/OtherReference/MessageName is present, it must contain 502 or
	 * must start with setr.047, setr.049, setr.051, setr.053, setr.055,
	 * setr.058 and Reference/RelatedReference/Reference must contain the
	 * message reference of a message in this list.
	 */
	public static void checkOrderConfirmationStatusReportV02(OrderConfirmationStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RelatedReference/MessageName or OtherReference/MessageName is present,
	 * it must contain 502 or must start with setr.002, setr.005, setr.008,
	 * setr.011, setr.014 or setr.018 and RelatedReference/Reference must
	 * contain the message reference of a message in this list.
	 */
	public static void checkOrderCancellationStatusReportV03(OrderCancellationStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RelatedReference/MessageName or OtherReference/MessageName is present,
	 * it must contain 502 or must start with setr.001, setr.004, setr.007,
	 * setr.010, setr.013, setr.019 or setr.018 and RelatedReference/Reference
	 * must contain the message reference of a message in this list.
	 */
	public static void checkOrderInstructionStatusReportV03(OrderInstructionStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If MessageName is present, it must contain 502 or must start with
	 * setr.002 or setr.005 or setr.008 or setr.011 or setr.014 or setr.025 and
	 * Reference must contain the business reference of a message in this list.
	 */
	public static void checkOrderCancellationStatusReportV02(OrderCancellationStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}