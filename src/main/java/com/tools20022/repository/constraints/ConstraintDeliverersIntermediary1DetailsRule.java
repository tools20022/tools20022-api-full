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
import com.tools20022.repository.msg.DeliveringPartiesAndAccount14;
import com.tools20022.repository.msg.DeliveringPartiesAndAccount16;

/**
 * If DeliverersIntermediary2Details is present, then
 * DeliverersIntermediary1Details must also be present.
 */
public class ConstraintDeliverersIntermediary1DetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14
	 * DeliveringPartiesAndAccount14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliverersIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliverersIntermediary2Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersIntermediary1DetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliverersIntermediary2Details is present, then DeliverersIntermediary1Details must also be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount14> forDeliveringPartiesAndAccount14 = new MMConstraint<DeliveringPartiesAndAccount14>() {
		{
			validator = ConstraintDeliverersIntermediary1DetailsRule::checkDeliveringPartiesAndAccount14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediary1DetailsRule";
			definition = "If DeliverersIntermediary2Details is present, then DeliverersIntermediary1Details must also be present.";
			owner_lazy = () -> DeliveringPartiesAndAccount14.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliverersIntermediary1Details</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliverersIntermediary2Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16
	 * DeliveringPartiesAndAccount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliverersIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliverersIntermediary2Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersIntermediary1DetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliverersIntermediary2Details is present, then DeliverersIntermediary1Details must be present. If DeliverersIntermediary2Details is not present then DeliverersIntermediary1Details is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount16> forDeliveringPartiesAndAccount16 = new MMConstraint<DeliveringPartiesAndAccount16>() {
		{
			validator = ConstraintDeliverersIntermediary1DetailsRule::checkDeliveringPartiesAndAccount16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediary1DetailsRule";
			definition = "If DeliverersIntermediary2Details is present, then DeliverersIntermediary1Details must be present. If DeliverersIntermediary2Details is not present then DeliverersIntermediary1Details is optional.";
			owner_lazy = () -> DeliveringPartiesAndAccount16.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliverersIntermediary1Details</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliverersIntermediary2Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If DeliverersIntermediary2Details is present, then
	 * DeliverersIntermediary1Details must also be present.
	 */
	public static void checkDeliveringPartiesAndAccount14(DeliveringPartiesAndAccount14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DeliverersIntermediary2Details is present, then
	 * DeliverersIntermediary1Details must be present. If
	 * DeliverersIntermediary2Details is not present then
	 * DeliverersIntermediary1Details is optional.
	 */
	public static void checkDeliveringPartiesAndAccount16(DeliveringPartiesAndAccount16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}