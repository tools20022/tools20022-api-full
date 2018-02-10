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
import com.tools20022.repository.area.seev.MeetingInstructionStatusV02;
import com.tools20022.repository.area.seev.MeetingInstructionStatusV03;
import com.tools20022.repository.area.seev.MeetingInstructionStatusV04;
import com.tools20022.repository.area.seev.MeetingInstructionStatusV05;
import java.util.Arrays;

/**
 * If InstructionType/InstructionCancellationIdentification is present, then
 * InstructionTypeStatus/CancellationStatus must be present.
 */
public class ConstraintStatus2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV05
	 * MeetingInstructionStatusV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructionTypeStatus/CancellationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructionType/InstructionCancellationIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionType/InstructionCancellationIdentification is present, then InstructionTypeStatus/CancellationStatus must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatus2Rule#forMeetingInstructionStatusV04
	 * ConstraintStatus2Rule.forMeetingInstructionStatusV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingInstructionStatusV05> forMeetingInstructionStatusV05 = new MMConstraint<MeetingInstructionStatusV05>() {
		{
			validator = ConstraintStatus2Rule::checkMeetingInstructionStatusV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status2Rule";
			definition = "If InstructionType/InstructionCancellationIdentification is present, then InstructionTypeStatus/CancellationStatus must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatus2Rule.forMeetingInstructionStatusV04;
			owner_lazy = () -> MeetingInstructionStatusV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructionTypeStatus/CancellationStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructionType/InstructionCancellationIdentification</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04
	 * MeetingInstructionStatusV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructionTypeStatus/CancellationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructionType/InstructionCancellationIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionType/InstructionCancellationIdentification is present, then InstructionTypeStatus/CancellationStatus must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatus2Rule#forMeetingInstructionStatusV05
	 * ConstraintStatus2Rule.forMeetingInstructionStatusV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingInstructionStatusV04> forMeetingInstructionStatusV04 = new MMConstraint<MeetingInstructionStatusV04>() {
		{
			validator = ConstraintStatus2Rule::checkMeetingInstructionStatusV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status2Rule";
			definition = "If InstructionType/InstructionCancellationIdentification is present, then InstructionTypeStatus/CancellationStatus must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatus2Rule.forMeetingInstructionStatusV05);
			owner_lazy = () -> MeetingInstructionStatusV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructionTypeStatus/CancellationStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructionType/InstructionCancellationIdentification</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02
	 * MeetingInstructionStatusV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionCancellationIdentification is present, then CancellationStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingInstructionStatusV02> forMeetingInstructionStatusV02 = new MMConstraint<MeetingInstructionStatusV02>() {
		{
			validator = ConstraintStatus2Rule::checkMeetingInstructionStatusV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status2Rule";
			definition = "If InstructionCancellationIdentification is present, then CancellationStatus must be present.";
			owner_lazy = () -> MeetingInstructionStatusV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV03
	 * MeetingInstructionStatusV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructionTypeStatus/CancellationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructionType/InstructionCancellationIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionType/InstructionCancellationIdentification is present, then InstructionTypeStatus/CancellationStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingInstructionStatusV03> forMeetingInstructionStatusV03 = new MMConstraint<MeetingInstructionStatusV03>() {
		{
			validator = ConstraintStatus2Rule::checkMeetingInstructionStatusV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status2Rule";
			definition = "If InstructionType/InstructionCancellationIdentification is present, then InstructionTypeStatus/CancellationStatus must be present.";
			owner_lazy = () -> MeetingInstructionStatusV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructionTypeStatus/CancellationStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructionType/InstructionCancellationIdentification</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If InstructionType/InstructionCancellationIdentification is present, then
	 * InstructionTypeStatus/CancellationStatus must be present.
	 */
	public static void checkMeetingInstructionStatusV05(MeetingInstructionStatusV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionType/InstructionCancellationIdentification is present, then
	 * InstructionTypeStatus/CancellationStatus must be present.
	 */
	public static void checkMeetingInstructionStatusV04(MeetingInstructionStatusV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionCancellationIdentification is present, then
	 * CancellationStatus must be present.
	 */
	public static void checkMeetingInstructionStatusV02(MeetingInstructionStatusV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionType/InstructionCancellationIdentification is present, then
	 * InstructionTypeStatus/CancellationStatus must be present.
	 */
	public static void checkMeetingInstructionStatusV03(MeetingInstructionStatusV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}