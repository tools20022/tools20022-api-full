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
import com.tools20022.repository.area.pain.*;
import java.util.Arrays;

/**
 * If GroupHeader/GroupReversal is true, then
 * OriginalPaymentInformationAndReversal is not allowed.
 */
public class ConstraintGroupReversalAndPaymentInformationNotPresentRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV06
	 * CustomerPaymentReversalV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndReversal[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndPaymentInformationNotPresentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is true, then OriginalPaymentInformationAndReversal is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule#forCustomerPaymentReversalV07
	 * ConstraintGroupReversalAndPaymentInformationNotPresentRule.
	 * forCustomerPaymentReversalV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule#forCustomerPaymentReversalV05
	 * ConstraintGroupReversalAndPaymentInformationNotPresentRule.
	 * forCustomerPaymentReversalV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV06> forCustomerPaymentReversalV06 = new MMConstraint<CustomerPaymentReversalV06>() {
		{
			validator = ConstraintGroupReversalAndPaymentInformationNotPresentRule::checkCustomerPaymentReversalV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndPaymentInformationNotPresentRule";
			definition = "If GroupHeader/GroupReversal is true, then OriginalPaymentInformationAndReversal is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule.forCustomerPaymentReversalV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule.forCustomerPaymentReversalV05;
			owner_lazy = () -> CustomerPaymentReversalV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalPaymentInformationAndReversal[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/GroupReversal</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/GroupReversal</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07
	 * CustomerPaymentReversalV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndReversal[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndPaymentInformationNotPresentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is true, then OriginalPaymentInformationAndReversal is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule#forCustomerPaymentReversalV06
	 * ConstraintGroupReversalAndPaymentInformationNotPresentRule.
	 * forCustomerPaymentReversalV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV07> forCustomerPaymentReversalV07 = new MMConstraint<CustomerPaymentReversalV07>() {
		{
			validator = ConstraintGroupReversalAndPaymentInformationNotPresentRule::checkCustomerPaymentReversalV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndPaymentInformationNotPresentRule";
			definition = "If GroupHeader/GroupReversal is true, then OriginalPaymentInformationAndReversal is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule.forCustomerPaymentReversalV06;
			owner_lazy = () -> CustomerPaymentReversalV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalPaymentInformationAndReversal[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/GroupReversal</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/GroupReversal</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV02
	 * CustomerPaymentReversalV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndReversal[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndPaymentInformationNotPresentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is true, then OriginalPaymentInformationAndReversal is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV02> forCustomerPaymentReversalV02 = new MMConstraint<CustomerPaymentReversalV02>() {
		{
			validator = ConstraintGroupReversalAndPaymentInformationNotPresentRule::checkCustomerPaymentReversalV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndPaymentInformationNotPresentRule";
			definition = "If GroupHeader/GroupReversal is true, then OriginalPaymentInformationAndReversal is not allowed.";
			owner_lazy = () -> CustomerPaymentReversalV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalPaymentInformationAndReversal[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/GroupReversal</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/GroupReversal</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV03
	 * CustomerPaymentReversalV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndReversal[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndPaymentInformationNotPresentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is true, then OriginalPaymentInformationAndReversal is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV03> forCustomerPaymentReversalV03 = new MMConstraint<CustomerPaymentReversalV03>() {
		{
			validator = ConstraintGroupReversalAndPaymentInformationNotPresentRule::checkCustomerPaymentReversalV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndPaymentInformationNotPresentRule";
			definition = "If GroupHeader/GroupReversal is true, then OriginalPaymentInformationAndReversal is not allowed.";
			owner_lazy = () -> CustomerPaymentReversalV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalPaymentInformationAndReversal[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/GroupReversal</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/GroupReversal</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV04
	 * CustomerPaymentReversalV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndReversal[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndPaymentInformationNotPresentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is true, then OriginalPaymentInformationAndReversal is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule#forCustomerPaymentReversalV05
	 * ConstraintGroupReversalAndPaymentInformationNotPresentRule.
	 * forCustomerPaymentReversalV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV04> forCustomerPaymentReversalV04 = new MMConstraint<CustomerPaymentReversalV04>() {
		{
			validator = ConstraintGroupReversalAndPaymentInformationNotPresentRule::checkCustomerPaymentReversalV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndPaymentInformationNotPresentRule";
			definition = "If GroupHeader/GroupReversal is true, then OriginalPaymentInformationAndReversal is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule.forCustomerPaymentReversalV05);
			owner_lazy = () -> CustomerPaymentReversalV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalPaymentInformationAndReversal[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/GroupReversal</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/GroupReversal</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV05
	 * CustomerPaymentReversalV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndReversal[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndPaymentInformationNotPresentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is true, then OriginalPaymentInformationAndReversal is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule#forCustomerPaymentReversalV06
	 * ConstraintGroupReversalAndPaymentInformationNotPresentRule.
	 * forCustomerPaymentReversalV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule#forCustomerPaymentReversalV04
	 * ConstraintGroupReversalAndPaymentInformationNotPresentRule.
	 * forCustomerPaymentReversalV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV05> forCustomerPaymentReversalV05 = new MMConstraint<CustomerPaymentReversalV05>() {
		{
			validator = ConstraintGroupReversalAndPaymentInformationNotPresentRule::checkCustomerPaymentReversalV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndPaymentInformationNotPresentRule";
			definition = "If GroupHeader/GroupReversal is true, then OriginalPaymentInformationAndReversal is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule.forCustomerPaymentReversalV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule.forCustomerPaymentReversalV04;
			owner_lazy = () -> CustomerPaymentReversalV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalPaymentInformationAndReversal[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/GroupReversal</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/GroupReversal</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If GroupHeader/GroupReversal is true, then
	 * OriginalPaymentInformationAndReversal is not allowed.
	 */
	public static void checkCustomerPaymentReversalV06(CustomerPaymentReversalV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is true, then
	 * OriginalPaymentInformationAndReversal is not allowed.
	 */
	public static void checkCustomerPaymentReversalV07(CustomerPaymentReversalV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is true, then
	 * OriginalPaymentInformationAndReversal is not allowed.
	 */
	public static void checkCustomerPaymentReversalV02(CustomerPaymentReversalV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is true, then
	 * OriginalPaymentInformationAndReversal is not allowed.
	 */
	public static void checkCustomerPaymentReversalV03(CustomerPaymentReversalV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is true, then
	 * OriginalPaymentInformationAndReversal is not allowed.
	 */
	public static void checkCustomerPaymentReversalV04(CustomerPaymentReversalV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is true, then
	 * OriginalPaymentInformationAndReversal is not allowed.
	 */
	public static void checkCustomerPaymentReversalV05(CustomerPaymentReversalV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}