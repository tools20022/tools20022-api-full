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
 * If InstructionType/InstructionIdentification/Identification is "NONREF", then
 * InstructionTypeStatus
 * /InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status must be
 * NOIN.
 */
public class ConstraintReminder1Rule {

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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status&lt;/leftOperand&gt;&lt;rightOperand&gt;NotReceived&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/InstructionType/InstructionIdentification/Identification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reminder1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionType/InstructionIdentification/Identification is \"NONREF\", then InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status must be NOIN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReminder1Rule#forMeetingInstructionStatusV04
	 * ConstraintReminder1Rule.forMeetingInstructionStatusV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingInstructionStatusV05> forMeetingInstructionStatusV05 = new MMConstraint<MeetingInstructionStatusV05>() {
		{
			validator = ConstraintReminder1Rule::checkMeetingInstructionStatusV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reminder1Rule";
			definition = "If InstructionType/InstructionIdentification/Identification is \"NONREF\", then InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status must be NOIN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReminder1Rule.forMeetingInstructionStatusV04;
			owner_lazy = () -> MeetingInstructionStatusV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status</leftOperand><rightOperand>NotReceived</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/InstructionType/InstructionIdentification/Identification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status&lt;/leftOperand&gt;&lt;rightOperand&gt;NotReceived&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/InstructionType/InstructionIdentification/Identification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reminder1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionType/InstructionIdentification/Identification is \"NONREF\", then InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status must be NOIN."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReminder1Rule#forMeetingInstructionStatusV05
	 * ConstraintReminder1Rule.forMeetingInstructionStatusV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingInstructionStatusV04> forMeetingInstructionStatusV04 = new MMConstraint<MeetingInstructionStatusV04>() {
		{
			validator = ConstraintReminder1Rule::checkMeetingInstructionStatusV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reminder1Rule";
			definition = "If InstructionType/InstructionIdentification/Identification is \"NONREF\", then InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status must be NOIN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReminder1Rule.forMeetingInstructionStatusV05);
			owner_lazy = () -> MeetingInstructionStatusV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status</leftOperand><rightOperand>NotReceived</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/InstructionType/InstructionIdentification/Identification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * name} = "Reminder1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionIdentification/Identification is \"NONREF\", then InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status must be NOIN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingInstructionStatusV02> forMeetingInstructionStatusV02 = new MMConstraint<MeetingInstructionStatusV02>() {
		{
			validator = ConstraintReminder1Rule::checkMeetingInstructionStatusV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reminder1Rule";
			definition = "If InstructionIdentification/Identification is \"NONREF\", then InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status must be NOIN.";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status&lt;/leftOperand&gt;&lt;rightOperand&gt;NotReceived&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/InstructionType/InstructionIdentification/Identification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reminder1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionType/InstructionIdentification/Identification is \"NONREF\", then InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status must be NOIN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingInstructionStatusV03> forMeetingInstructionStatusV03 = new MMConstraint<MeetingInstructionStatusV03>() {
		{
			validator = ConstraintReminder1Rule::checkMeetingInstructionStatusV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reminder1Rule";
			definition = "If InstructionType/InstructionIdentification/Identification is \"NONREF\", then InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status must be NOIN.";
			owner_lazy = () -> MeetingInstructionStatusV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status</leftOperand><rightOperand>NotReceived</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/InstructionType/InstructionIdentification/Identification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If InstructionType/InstructionIdentification/Identification is "NONREF",
	 * then InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/
	 * ProcessingStatus/Status must be NOIN.
	 */
	public static void checkMeetingInstructionStatusV05(MeetingInstructionStatusV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionType/InstructionIdentification/Identification is "NONREF",
	 * then InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/
	 * ProcessingStatus/Status must be NOIN.
	 */
	public static void checkMeetingInstructionStatusV04(MeetingInstructionStatusV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionIdentification/Identification is "NONREF", then
	 * InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status must be
	 * NOIN.
	 */
	public static void checkMeetingInstructionStatusV02(MeetingInstructionStatusV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionType/InstructionIdentification/Identification is "NONREF",
	 * then InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/
	 * ProcessingStatus/Status must be NOIN.
	 */
	public static void checkMeetingInstructionStatusV03(MeetingInstructionStatusV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}