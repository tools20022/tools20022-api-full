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
import com.tools20022.repository.msg.ReceiveInformation16;
import com.tools20022.repository.msg.ReceivingPartiesAndAccount13;
import com.tools20022.repository.msg.ReceivingPartiesAndAccount14;
import com.tools20022.repository.msg.ReceivingPartiesAndAccount16;

/**
 * If PhysicalTransferDetails is present, then
 * SettlementPartiesDetails/ReceiversIntermediary1Details is not allowed.
 */
public class ConstraintReceiversIntermediary1DetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16
	 * ReceiveInformation16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediary1DetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediary1Details is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule#forReceiveInformation15
	 * ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation15}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation16> forReceiveInformation16 = new MMConstraint<ReceiveInformation16>() {
		{
			validator = ConstraintReceiversIntermediary1DetailsRule::checkReceiveInformation16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary1DetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediary1Details is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation15;
			owner_lazy = () -> ReceiveInformation16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14
	 * ReceivingPartiesAndAccount14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary2Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediary1DetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediary2Details is present, then ReceiversIntermediary1Details must also be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount14> forReceivingPartiesAndAccount14 = new MMConstraint<ReceivingPartiesAndAccount14>() {
		{
			validator = ConstraintReceiversIntermediary1DetailsRule::checkReceivingPartiesAndAccount14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary1DetailsRule";
			definition = "If ReceiversIntermediary2Details is present, then ReceiversIntermediary1Details must also be present.";
			owner_lazy = () -> ReceivingPartiesAndAccount14.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary1Details</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary2Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13
	 * ReceivingPartiesAndAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary2Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediary1DetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediary2Details is present, then ReceiversIntermediary1Details must also be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount13> forReceivingPartiesAndAccount13 = new MMConstraint<ReceivingPartiesAndAccount13>() {
		{
			validator = ConstraintReceiversIntermediary1DetailsRule::checkReceivingPartiesAndAccount13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary1DetailsRule";
			definition = "If ReceiversIntermediary2Details is present, then ReceiversIntermediary1Details must also be present.";
			owner_lazy = () -> ReceivingPartiesAndAccount13.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary1Details</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary2Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16
	 * ReceivingPartiesAndAccount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary2Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediary1DetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediary2Details is present, then ReceiversIntermediary1Details must be present. If ReceiversIntermediary2Details is not present, then  ReceiversIntermediary1Details is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount16> forReceivingPartiesAndAccount16 = new MMConstraint<ReceivingPartiesAndAccount16>() {
		{
			validator = ConstraintReceiversIntermediary1DetailsRule::checkReceivingPartiesAndAccount16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary1DetailsRule";
			definition = "If ReceiversIntermediary2Details is present, then ReceiversIntermediary1Details must be present. If ReceiversIntermediary2Details is not present, then  ReceiversIntermediary1Details is optional.";
			owner_lazy = () -> ReceivingPartiesAndAccount16.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary1Details</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary2Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediary1Details is not allowed.
	 */
	public static void checkReceiveInformation16(ReceiveInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReceiversIntermediary2Details is present, then
	 * ReceiversIntermediary1Details must also be present.
	 */
	public static void checkReceivingPartiesAndAccount14(ReceivingPartiesAndAccount14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReceiversIntermediary2Details is present, then
	 * ReceiversIntermediary1Details must also be present.
	 */
	public static void checkReceivingPartiesAndAccount13(ReceivingPartiesAndAccount13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReceiversIntermediary2Details is present, then
	 * ReceiversIntermediary1Details must be present. If
	 * ReceiversIntermediary2Details is not present, then
	 * ReceiversIntermediary1Details is optional.
	 */
	public static void checkReceivingPartiesAndAccount16(ReceivingPartiesAndAccount16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}