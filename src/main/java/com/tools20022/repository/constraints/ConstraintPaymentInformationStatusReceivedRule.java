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
import java.util.Arrays;

/**
 * If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present
 * and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus
 * is not allowed.
 */
public class ConstraintPaymentInformationStatusReceivedRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation1
	 * OriginalPaymentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Received&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatusReceivedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInformation1> forOriginalPaymentInformation1 = new MMConstraint<OriginalPaymentInformation1>() {
		{
			validator = ConstraintPaymentInformationStatusReceivedRule::checkOriginalPaymentInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatusReceivedRule";
			definition = "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			owner_lazy = () -> OriginalPaymentInformation1.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationStatus</leftOperand><rightOperand>Received</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction1
	 * OriginalPaymentInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Received&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatusReceivedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction1> forOriginalPaymentInstruction1 = new MMConstraint<OriginalPaymentInstruction1>() {
		{
			validator = ConstraintPaymentInformationStatusReceivedRule::checkOriginalPaymentInstruction1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatusReceivedRule";
			definition = "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			owner_lazy = () -> OriginalPaymentInstruction1.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationStatus</leftOperand><rightOperand>Received</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction6
	 * OriginalPaymentInstruction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Received&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatusReceivedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule#forOriginalPaymentInstruction12
	 * ConstraintPaymentInformationStatusReceivedRule.
	 * forOriginalPaymentInstruction12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction6> forOriginalPaymentInstruction6 = new MMConstraint<OriginalPaymentInstruction6>() {
		{
			validator = ConstraintPaymentInformationStatusReceivedRule::checkOriginalPaymentInstruction6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatusReceivedRule";
			definition = "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule.forOriginalPaymentInstruction12);
			owner_lazy = () -> OriginalPaymentInstruction6.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationStatus</leftOperand><rightOperand>Received</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation5
	 * OriginalPaymentInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Received&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatusReceivedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInformation5> forOriginalPaymentInformation5 = new MMConstraint<OriginalPaymentInformation5>() {
		{
			validator = ConstraintPaymentInformationStatusReceivedRule::checkOriginalPaymentInformation5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatusReceivedRule";
			definition = "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			owner_lazy = () -> OriginalPaymentInformation5.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationStatus</leftOperand><rightOperand>Received</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction5
	 * OriginalPaymentInstruction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Received&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatusReceivedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction5> forOriginalPaymentInstruction5 = new MMConstraint<OriginalPaymentInstruction5>() {
		{
			validator = ConstraintPaymentInformationStatusReceivedRule::checkOriginalPaymentInstruction5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatusReceivedRule";
			definition = "If PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			owner_lazy = () -> OriginalPaymentInstruction5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationStatus</leftOperand><rightOperand>Received</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction9
	 * OriginalPaymentInstruction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Received&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatusReceivedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule#forOriginalPaymentInstruction14
	 * ConstraintPaymentInformationStatusReceivedRule.
	 * forOriginalPaymentInstruction14}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction9> forOriginalPaymentInstruction9 = new MMConstraint<OriginalPaymentInstruction9>() {
		{
			validator = ConstraintPaymentInformationStatusReceivedRule::checkOriginalPaymentInstruction9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatusReceivedRule";
			definition = "If PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule.forOriginalPaymentInstruction14);
			owner_lazy = () -> OriginalPaymentInstruction9.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationStatus</leftOperand><rightOperand>Received</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction12
	 * OriginalPaymentInstruction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Received&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatusReceivedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule#forOriginalPaymentInstruction18
	 * ConstraintPaymentInformationStatusReceivedRule.
	 * forOriginalPaymentInstruction18}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule#forOriginalPaymentInstruction6
	 * ConstraintPaymentInformationStatusReceivedRule.
	 * forOriginalPaymentInstruction6}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction12> forOriginalPaymentInstruction12 = new MMConstraint<OriginalPaymentInstruction12>() {
		{
			validator = ConstraintPaymentInformationStatusReceivedRule::checkOriginalPaymentInstruction12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatusReceivedRule";
			definition = "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule.forOriginalPaymentInstruction18);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule.forOriginalPaymentInstruction6;
			owner_lazy = () -> OriginalPaymentInstruction12.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationStatus</leftOperand><rightOperand>Received</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction14
	 * OriginalPaymentInstruction14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Received&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatusReceivedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule#forOriginalPaymentInstruction19
	 * ConstraintPaymentInformationStatusReceivedRule.
	 * forOriginalPaymentInstruction19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule#forOriginalPaymentInstruction9
	 * ConstraintPaymentInformationStatusReceivedRule.
	 * forOriginalPaymentInstruction9}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction14> forOriginalPaymentInstruction14 = new MMConstraint<OriginalPaymentInstruction14>() {
		{
			validator = ConstraintPaymentInformationStatusReceivedRule::checkOriginalPaymentInstruction14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatusReceivedRule";
			definition = "If PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule.forOriginalPaymentInstruction19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule.forOriginalPaymentInstruction9;
			owner_lazy = () -> OriginalPaymentInstruction14.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationStatus</leftOperand><rightOperand>Received</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18
	 * OriginalPaymentInstruction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Received&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatusReceivedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD (Received), then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule#forOriginalPaymentInstruction23
	 * ConstraintPaymentInformationStatusReceivedRule.
	 * forOriginalPaymentInstruction23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule#forOriginalPaymentInstruction12
	 * ConstraintPaymentInformationStatusReceivedRule.
	 * forOriginalPaymentInstruction12}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction18> forOriginalPaymentInstruction18 = new MMConstraint<OriginalPaymentInstruction18>() {
		{
			validator = ConstraintPaymentInformationStatusReceivedRule::checkOriginalPaymentInstruction18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatusReceivedRule";
			definition = "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD (Received), then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule.forOriginalPaymentInstruction23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule.forOriginalPaymentInstruction12;
			owner_lazy = () -> OriginalPaymentInstruction18.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationStatus</leftOperand><rightOperand>Received</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction19
	 * OriginalPaymentInstruction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Received&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatusReceivedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule#forOriginalPaymentInstruction24
	 * ConstraintPaymentInformationStatusReceivedRule.
	 * forOriginalPaymentInstruction24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule#forOriginalPaymentInstruction14
	 * ConstraintPaymentInformationStatusReceivedRule.
	 * forOriginalPaymentInstruction14}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction19> forOriginalPaymentInstruction19 = new MMConstraint<OriginalPaymentInstruction19>() {
		{
			validator = ConstraintPaymentInformationStatusReceivedRule::checkOriginalPaymentInstruction19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatusReceivedRule";
			definition = "If PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule.forOriginalPaymentInstruction24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule.forOriginalPaymentInstruction14;
			owner_lazy = () -> OriginalPaymentInstruction19.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationStatus</leftOperand><rightOperand>Received</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23
	 * OriginalPaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Received&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatusReceivedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD (Received), then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule#forOriginalPaymentInstruction18
	 * ConstraintPaymentInformationStatusReceivedRule.
	 * forOriginalPaymentInstruction18}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction23> forOriginalPaymentInstruction23 = new MMConstraint<OriginalPaymentInstruction23>() {
		{
			validator = ConstraintPaymentInformationStatusReceivedRule::checkOriginalPaymentInstruction23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatusReceivedRule";
			definition = "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD (Received), then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule.forOriginalPaymentInstruction18;
			owner_lazy = () -> OriginalPaymentInstruction23.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationStatus</leftOperand><rightOperand>Received</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24
	 * OriginalPaymentInstruction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Received&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatusReceivedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule#forOriginalPaymentInstruction19
	 * ConstraintPaymentInformationStatusReceivedRule.
	 * forOriginalPaymentInstruction19}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction24> forOriginalPaymentInstruction24 = new MMConstraint<OriginalPaymentInstruction24>() {
		{
			validator = ConstraintPaymentInformationStatusReceivedRule::checkOriginalPaymentInstruction24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatusReceivedRule";
			definition = "If PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule.forOriginalPaymentInstruction19;
			owner_lazy = () -> OriginalPaymentInstruction24.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationStatus</leftOperand><rightOperand>Received</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If OriginalPaymentInformationAndStatus/PaymentInformationStatus is
	 * present and is equal to RCVD, then
	 * TransactionInformationAndStatus/TransactionStatus is not allowed.
	 */
	public static void checkOriginalPaymentInformation1(OriginalPaymentInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalPaymentInformationAndStatus/PaymentInformationStatus is
	 * present and is equal to RCVD, then
	 * TransactionInformationAndStatus/TransactionStatus is not allowed.
	 */
	public static void checkOriginalPaymentInstruction1(OriginalPaymentInstruction1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalPaymentInformationAndStatus/PaymentInformationStatus is
	 * present and is equal to RCVD, then
	 * TransactionInformationAndStatus/TransactionStatus is not allowed.
	 */
	public static void checkOriginalPaymentInstruction6(OriginalPaymentInstruction6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalPaymentInformationAndStatus/PaymentInformationStatus is
	 * present and is equal to RCVD, then
	 * TransactionInformationAndStatus/TransactionStatus is not allowed.
	 */
	public static void checkOriginalPaymentInformation5(OriginalPaymentInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformationStatus is present and is equal to RCVD, then
	 * TransactionInformationAndStatus/TransactionStatus is not allowed.
	 */
	public static void checkOriginalPaymentInstruction5(OriginalPaymentInstruction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformationStatus is present and is equal to RCVD, then
	 * TransactionInformationAndStatus/TransactionStatus is not allowed.
	 */
	public static void checkOriginalPaymentInstruction9(OriginalPaymentInstruction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalPaymentInformationAndStatus/PaymentInformationStatus is
	 * present and is equal to RCVD, then
	 * TransactionInformationAndStatus/TransactionStatus is not allowed.
	 */
	public static void checkOriginalPaymentInstruction12(OriginalPaymentInstruction12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformationStatus is present and is equal to RCVD, then
	 * TransactionInformationAndStatus/TransactionStatus is not allowed.
	 */
	public static void checkOriginalPaymentInstruction14(OriginalPaymentInstruction14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalPaymentInformationAndStatus/PaymentInformationStatus is
	 * present and is equal to RCVD (Received), then
	 * TransactionInformationAndStatus/TransactionStatus is not allowed.
	 */
	public static void checkOriginalPaymentInstruction18(OriginalPaymentInstruction18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformationStatus is present and is equal to RCVD, then
	 * TransactionInformationAndStatus/TransactionStatus is not allowed.
	 */
	public static void checkOriginalPaymentInstruction19(OriginalPaymentInstruction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalPaymentInformationAndStatus/PaymentInformationStatus is
	 * present and is equal to RCVD (Received), then
	 * TransactionInformationAndStatus/TransactionStatus is not allowed.
	 */
	public static void checkOriginalPaymentInstruction23(OriginalPaymentInstruction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformationStatus is present and is equal to RCVD, then
	 * TransactionInformationAndStatus/TransactionStatus is not allowed.
	 */
	public static void checkOriginalPaymentInstruction24(OriginalPaymentInstruction24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}