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
import com.tools20022.repository.msg.AttendanceCard1;
import com.tools20022.repository.msg.AttendanceCard2;

/**
 * If DeliveryMethod is OADR, then OtherAddress must be present.
 */
public class ConstraintOtherAddressCode1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AttendanceCard1
	 * AttendanceCard1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAddressCode1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliveryMethod is OADR, then OtherAddress must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<AttendanceCard1> forAttendanceCard1 = new MMConstraint<AttendanceCard1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAddressCode1Rule";
			definition = "If DeliveryMethod is OADR, then OtherAddress must be present.";
			owner_lazy = () -> AttendanceCard1.mmObject();
		}

		@Override
		public void executeValidator(AttendanceCard1 obj) throws Exception {
			checkAttendanceCard1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AttendanceCard2
	 * AttendanceCard2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OtherAddress&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/DeliveryMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;OtherAddress&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAddressCode1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliveryMethod is OtherAddress \"OADR\", then OtherAddress must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AttendanceCard2> forAttendanceCard2 = new MMConstraint<AttendanceCard2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAddressCode1Rule";
			definition = "If DeliveryMethod is OtherAddress \"OADR\", then OtherAddress must be present.";
			owner_lazy = () -> AttendanceCard2.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OtherAddress</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/DeliveryMethod</leftOperand><rightOperand>OtherAddress</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(AttendanceCard2 obj) throws Exception {
			checkAttendanceCard2(obj);
		}
	};

	/**
	 * If DeliveryMethod is OADR, then OtherAddress must be present.
	 */
	public static void checkAttendanceCard1(AttendanceCard1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DeliveryMethod is OtherAddress "OADR", then OtherAddress must be
	 * present.
	 */
	public static void checkAttendanceCard2(AttendanceCard2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}