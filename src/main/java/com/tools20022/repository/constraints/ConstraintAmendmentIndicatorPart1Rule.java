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
import com.tools20022.repository.msg.MandateRelatedInformation4;
import com.tools20022.repository.msg.MandateRelatedInformation5;

/**
 * ISO20022 Rule: AmendmentIndicatorRule If AmendmentIndicator is true, then
 * AmendementInformationDetails must be present, with amended mandate
 * information. If AmendmentIndicator is false, then AmendmentInformationDetails
 * is not allowed.
 * 
 * Part 1 Implements: If AmendmentIndicator is true, then
 * AmendementInformationDetails must be present, with amended mandate
 * information.
 */
public class ConstraintAmendmentIndicatorPart1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation5
	 * MandateRelatedInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AmendmentInformationDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AmendmentIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentIndicatorPart1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: AmendmentIndicatorRule\nIf AmendmentIndicator is true, then AmendementInformationDetails must be present, with amended mandate information.\nIf AmendmentIndicator is false, then AmendmentInformationDetails is not allowed.\n\nPart 1 Implements:\nIf AmendmentIndicator is true, then AmendementInformationDetails must be present, with amended mandate information."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateRelatedInformation5> forMandateRelatedInformation5 = new MMConstraint<MandateRelatedInformation5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentIndicatorPart1Rule";
			definition = "ISO20022 Rule: AmendmentIndicatorRule\nIf AmendmentIndicator is true, then AmendementInformationDetails must be present, with amended mandate information.\nIf AmendmentIndicator is false, then AmendmentInformationDetails is not allowed.\n\nPart 1 Implements:\nIf AmendmentIndicator is true, then AmendementInformationDetails must be present, with amended mandate information.";
			owner_lazy = () -> MandateRelatedInformation5.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AmendmentInformationDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AmendmentIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(MandateRelatedInformation5 obj) throws Exception {
			checkMandateRelatedInformation5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation4
	 * MandateRelatedInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AmendmentInformationDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AmendmentIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentIndicatorPart1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: AmendmentIndicatorRule\nIf AmendmentIndicator is true, then AmendementInformationDetails must be present, with amended mandate information.\nIf AmendmentIndicator is false, then AmendmentInformationDetails is not allowed.\n\nPart 1 Implements:\nIf AmendmentIndicator is true, then AmendementInformationDetails must be present, with amended mandate information."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateRelatedInformation4> forMandateRelatedInformation4 = new MMConstraint<MandateRelatedInformation4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentIndicatorPart1Rule";
			definition = "ISO20022 Rule: AmendmentIndicatorRule\nIf AmendmentIndicator is true, then AmendementInformationDetails must be present, with amended mandate information.\nIf AmendmentIndicator is false, then AmendmentInformationDetails is not allowed.\n\nPart 1 Implements:\nIf AmendmentIndicator is true, then AmendementInformationDetails must be present, with amended mandate information.";
			owner_lazy = () -> MandateRelatedInformation4.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AmendmentInformationDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AmendmentIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(MandateRelatedInformation4 obj) throws Exception {
			checkMandateRelatedInformation4(obj);
		}
	};

	/**
	 * ISO20022 Rule: AmendmentIndicatorRule If AmendmentIndicator is true, then
	 * AmendementInformationDetails must be present, with amended mandate
	 * information. If AmendmentIndicator is false, then
	 * AmendmentInformationDetails is not allowed.
	 * 
	 * Part 1 Implements: If AmendmentIndicator is true, then
	 * AmendementInformationDetails must be present, with amended mandate
	 * information.
	 */
	public static void checkMandateRelatedInformation5(MandateRelatedInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: AmendmentIndicatorRule If AmendmentIndicator is true, then
	 * AmendementInformationDetails must be present, with amended mandate
	 * information. If AmendmentIndicator is false, then
	 * AmendmentInformationDetails is not allowed.
	 * 
	 * Part 1 Implements: If AmendmentIndicator is true, then
	 * AmendementInformationDetails must be present, with amended mandate
	 * information.
	 */
	public static void checkMandateRelatedInformation4(MandateRelatedInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}