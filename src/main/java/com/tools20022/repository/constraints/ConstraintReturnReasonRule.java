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
import com.tools20022.repository.msg.*;

/**
 * If ReturnReason/Code is equal to 'NARR', then at least one occurrence of
 * AdditionalReturnReasonInformation must be present.
 */
public class ConstraintReturnReasonRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation5
	 * ReturnReasonInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnReason/Code is equal to 'NARR', then at least one occurrence of AdditionalReturnReasonInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReturnReasonInformation5> forReturnReasonInformation5 = new MMConstraint<ReturnReasonInformation5>() {
		{
			validator = ConstraintReturnReasonRule::checkReturnReasonInformation5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnReasonRule";
			definition = "If ReturnReason/Code is equal to 'NARR', then at least one occurrence of AdditionalReturnReasonInformation must be present.";
			owner_lazy = () -> ReturnReasonInformation5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation10
	 * ReturnReasonInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;NARR&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reason/Code is equal to NARR, then AdditionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReturnReasonInformation10> forReturnReasonInformation10 = new MMConstraint<ReturnReasonInformation10>() {
		{
			validator = ConstraintReturnReasonRule::checkReturnReasonInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnReasonRule";
			definition = "If Reason/Code is equal to NARR, then AdditionalInformation must be present.";
			owner_lazy = () -> ReturnReasonInformation10.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/Reason/Code</leftOperand><rightOperand>NARR</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason2
	 * PaymentReturnReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;NARR&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reason/Code is equal to NARR, then AdditionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnReason2> forPaymentReturnReason2 = new MMConstraint<PaymentReturnReason2>() {
		{
			validator = ConstraintReturnReasonRule::checkPaymentReturnReason2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnReasonRule";
			definition = "If Reason/Code is equal to NARR, then AdditionalInformation must be present.";
			owner_lazy = () -> PaymentReturnReason2.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/Reason/Code</leftOperand><rightOperand>NARR</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation1
	 * ReturnReasonInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnReason/Code is equal to 'NARR', then at least one occurrence of AddititionalReturnReasonInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReturnReasonInformation1> forReturnReasonInformation1 = new MMConstraint<ReturnReasonInformation1>() {
		{
			validator = ConstraintReturnReasonRule::checkReturnReasonInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnReasonRule";
			definition = "If ReturnReason/Code is equal to 'NARR', then at least one occurrence of AddititionalReturnReasonInformation must be present.";
			owner_lazy = () -> ReturnReasonInformation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation9
	 * ReturnReasonInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;NARR&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reason/Code is equal to NARR, then AddititionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReturnReasonInformation9> forReturnReasonInformation9 = new MMConstraint<ReturnReasonInformation9>() {
		{
			validator = ConstraintReturnReasonRule::checkReturnReasonInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnReasonRule";
			definition = "If Reason/Code is equal to NARR, then AddititionalInformation must be present.";
			owner_lazy = () -> ReturnReasonInformation9.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/Reason/Code</leftOperand><rightOperand>NARR</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason1
	 * PaymentReturnReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;NARR&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reason/Code is equal to NARR, then AddititionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnReason1> forPaymentReturnReason1 = new MMConstraint<PaymentReturnReason1>() {
		{
			validator = ConstraintReturnReasonRule::checkPaymentReturnReason1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnReasonRule";
			definition = "If Reason/Code is equal to NARR, then AddititionalInformation must be present.";
			owner_lazy = () -> PaymentReturnReason1.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/Reason/Code</leftOperand><rightOperand>NARR</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation3
	 * ReturnReasonInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalReturnReasonInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ReturnReason/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Narrative&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnReason/Code is equal to 'NARR', then at least one occurrence of AddititionalReturnReasonInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReturnReasonInformation3> forReturnReasonInformation3 = new MMConstraint<ReturnReasonInformation3>() {
		{
			validator = ConstraintReturnReasonRule::checkReturnReasonInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnReasonRule";
			definition = "If ReturnReason/Code is equal to 'NARR', then at least one occurrence of AddititionalReturnReasonInformation must be present.";
			owner_lazy = () -> ReturnReasonInformation3.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalReturnReasonInformation[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ReturnReason/Code</leftOperand><rightOperand>Narrative</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If ReturnReason/Code is equal to 'NARR', then at least one occurrence of
	 * AdditionalReturnReasonInformation must be present.
	 */
	public static void checkReturnReasonInformation5(ReturnReasonInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reason/Code is equal to NARR, then AdditionalInformation must be
	 * present.
	 */
	public static void checkReturnReasonInformation10(ReturnReasonInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reason/Code is equal to NARR, then AdditionalInformation must be
	 * present.
	 */
	public static void checkPaymentReturnReason2(PaymentReturnReason2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnReason/Code is equal to 'NARR', then at least one occurrence of
	 * AddititionalReturnReasonInformation must be present.
	 */
	public static void checkReturnReasonInformation1(ReturnReasonInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reason/Code is equal to NARR, then AddititionalInformation must be
	 * present.
	 */
	public static void checkReturnReasonInformation9(ReturnReasonInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reason/Code is equal to NARR, then AddititionalInformation must be
	 * present.
	 */
	public static void checkPaymentReturnReason1(PaymentReturnReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnReason/Code is equal to 'NARR', then at least one occurrence of
	 * AddititionalReturnReasonInformation must be present.
	 */
	public static void checkReturnReasonInformation3(ReturnReasonInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}