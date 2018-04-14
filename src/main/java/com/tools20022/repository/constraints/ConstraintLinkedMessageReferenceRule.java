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
import com.tools20022.repository.msg.RejectionReason1;
import com.tools20022.repository.msg.RejectionReason3;

/**
 * If Reason is InvalidOrUnrecognisedReference, then LinkedMessageReference is
 * mandatory. If Reason is not InvalidOrUnrecognisedReference, then
 * LinkedMessageReference is optional.
 */
public class ConstraintLinkedMessageReferenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason3
	 * RejectionReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedMessageReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reason is InvalidOrUnrecognisedReference, then LinkedMessageReference is mandatory. If Reason is not InvalidOrUnrecognisedReference, then LinkedMessageReference is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectionReason3> forRejectionReason3 = new MMConstraint<RejectionReason3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedMessageReferenceRule";
			definition = "If Reason is InvalidOrUnrecognisedReference, then LinkedMessageReference is mandatory. If Reason is not InvalidOrUnrecognisedReference, then LinkedMessageReference is optional.";
			owner_lazy = () -> RejectionReason3.mmObject();
		}

		@Override
		public void executeValidator(RejectionReason3 obj) throws Exception {
			checkRejectionReason3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason1
	 * RejectionReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedMessageReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reason is InvalidOrUnrecognisedReference, then LinkedMessageReference is mandatory. If Reason is not InvalidOrUnrecognisedReference, then LinkedMessageReference is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectionReason1> forRejectionReason1 = new MMConstraint<RejectionReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedMessageReferenceRule";
			definition = "If Reason is InvalidOrUnrecognisedReference, then LinkedMessageReference is mandatory. If Reason is not InvalidOrUnrecognisedReference, then LinkedMessageReference is optional.";
			owner_lazy = () -> RejectionReason1.mmObject();
		}

		@Override
		public void executeValidator(RejectionReason1 obj) throws Exception {
			checkRejectionReason1(obj);
		}
	};

	/**
	 * If Reason is InvalidOrUnrecognisedReference, then LinkedMessageReference
	 * is mandatory. If Reason is not InvalidOrUnrecognisedReference, then
	 * LinkedMessageReference is optional.
	 */
	public static void checkRejectionReason3(RejectionReason3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reason is InvalidOrUnrecognisedReference, then LinkedMessageReference
	 * is mandatory. If Reason is not InvalidOrUnrecognisedReference, then
	 * LinkedMessageReference is optional.
	 */
	public static void checkRejectionReason1(RejectionReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}