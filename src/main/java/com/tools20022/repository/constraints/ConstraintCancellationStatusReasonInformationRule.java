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
 * If GroupCancellationStatus is present and is different from RJCR or PNCR,
 * then CancellationStatusReasonInformation/AdditionalInformation is not
 * allowed.
 */
public class ConstraintCancellationStatusReasonInformationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5
	 * OriginalGroupHeader5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PendingCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;RejectedCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupCancellationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupCancellationStatus is present and is different from RJCR or PNCR, then CancellationStatusReasonInformation/AdditionalInformation is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule#forOriginalGroupHeader9
	 * ConstraintCancellationStatusReasonInformationRule.forOriginalGroupHeader9
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupHeader5> forOriginalGroupHeader5 = new MMConstraint<OriginalGroupHeader5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReasonInformationRule";
			definition = "If GroupCancellationStatus is present and is different from RJCR or PNCR, then CancellationStatusReasonInformation/AdditionalInformation is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule.forOriginalGroupHeader9);
			owner_lazy = () -> OriginalGroupHeader5.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupCancellationStatus</leftOperand><rightOperand>PendingCancellationRequest</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupCancellationStatus</leftOperand><rightOperand>RejectedCancellationRequest</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupCancellationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(OriginalGroupHeader5 obj) throws Exception {
			checkOriginalGroupHeader5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction3
	 * OriginalPaymentInstruction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PendingCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;RejectedCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformationCancellationStatus is present and is different from RJCR or PNCR, then CancellationStatusReasonInformation/AdditionalInformation is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule#forOriginalPaymentInstruction10
	 * ConstraintCancellationStatusReasonInformationRule.
	 * forOriginalPaymentInstruction10}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction3> forOriginalPaymentInstruction3 = new MMConstraint<OriginalPaymentInstruction3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReasonInformationRule";
			definition = "If PaymentInformationCancellationStatus is present and is different from RJCR or PNCR, then CancellationStatusReasonInformation/AdditionalInformation is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule.forOriginalPaymentInstruction10);
			owner_lazy = () -> OriginalPaymentInstruction3.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand><rightOperand>PendingCancellationRequest</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand><rightOperand>RejectedCancellationRequest</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(OriginalPaymentInstruction3 obj) throws Exception {
			checkOriginalPaymentInstruction3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10
	 * OriginalPaymentInstruction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PendingCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;RejectedCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformationCancellationStatus is present and is different from RJCR or PNCR, then CancellationStatusReasonInformation/AdditionalInformation is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule#forOriginalPaymentInstruction17
	 * ConstraintCancellationStatusReasonInformationRule.
	 * forOriginalPaymentInstruction17}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule#forOriginalPaymentInstruction3
	 * ConstraintCancellationStatusReasonInformationRule.
	 * forOriginalPaymentInstruction3}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction10> forOriginalPaymentInstruction10 = new MMConstraint<OriginalPaymentInstruction10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReasonInformationRule";
			definition = "If PaymentInformationCancellationStatus is present and is different from RJCR or PNCR, then CancellationStatusReasonInformation/AdditionalInformation is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule.forOriginalPaymentInstruction17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule.forOriginalPaymentInstruction3;
			owner_lazy = () -> OriginalPaymentInstruction10.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand><rightOperand>PendingCancellationRequest</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand><rightOperand>RejectedCancellationRequest</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(OriginalPaymentInstruction10 obj) throws Exception {
			checkOriginalPaymentInstruction10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader9
	 * OriginalGroupHeader9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PendingCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;RejectedCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupCancellationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupCancellationStatus is present and is different from RJCR or PNCR, then CancellationStatusReasonInformation/AdditionalInformation is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule#forOriginalGroupHeader5
	 * ConstraintCancellationStatusReasonInformationRule.forOriginalGroupHeader5
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupHeader9> forOriginalGroupHeader9 = new MMConstraint<OriginalGroupHeader9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReasonInformationRule";
			definition = "If GroupCancellationStatus is present and is different from RJCR or PNCR, then CancellationStatusReasonInformation/AdditionalInformation is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule.forOriginalGroupHeader5;
			owner_lazy = () -> OriginalGroupHeader9.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupCancellationStatus</leftOperand><rightOperand>PendingCancellationRequest</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupCancellationStatus</leftOperand><rightOperand>RejectedCancellationRequest</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupCancellationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(OriginalGroupHeader9 obj) throws Exception {
			checkOriginalGroupHeader9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17
	 * OriginalPaymentInstruction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PendingCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;RejectedCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformationCancellationStatus is present and is different from RJCR (RejectedCancellationRequest) or PNCR (PendingCancellationRequest), then CancellationStatusReasonInformation/AdditionalInformation is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule#forOriginalPaymentInstruction22
	 * ConstraintCancellationStatusReasonInformationRule.
	 * forOriginalPaymentInstruction22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule#forOriginalPaymentInstruction10
	 * ConstraintCancellationStatusReasonInformationRule.
	 * forOriginalPaymentInstruction10}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction17> forOriginalPaymentInstruction17 = new MMConstraint<OriginalPaymentInstruction17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReasonInformationRule";
			definition = "If PaymentInformationCancellationStatus is present and is different from RJCR (RejectedCancellationRequest) or PNCR (PendingCancellationRequest), then CancellationStatusReasonInformation/AdditionalInformation is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule.forOriginalPaymentInstruction22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule.forOriginalPaymentInstruction10;
			owner_lazy = () -> OriginalPaymentInstruction17.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand><rightOperand>PendingCancellationRequest</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand><rightOperand>RejectedCancellationRequest</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(OriginalPaymentInstruction17 obj) throws Exception {
			checkOriginalPaymentInstruction17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26
	 * OriginalPaymentInstruction26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PendingCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;RejectedCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformationCancellationStatus is present and is different from RJCR (RejectedCancellationRequest) or PNCR (PendingCancellationRequest), then CancellationStatusReasonInformation/AdditionalInformation is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule#forOriginalPaymentInstruction22
	 * ConstraintCancellationStatusReasonInformationRule.
	 * forOriginalPaymentInstruction22}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction26> forOriginalPaymentInstruction26 = new MMConstraint<OriginalPaymentInstruction26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReasonInformationRule";
			definition = "If PaymentInformationCancellationStatus is present and is different from RJCR (RejectedCancellationRequest) or PNCR (PendingCancellationRequest), then CancellationStatusReasonInformation/AdditionalInformation is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule.forOriginalPaymentInstruction22;
			owner_lazy = () -> OriginalPaymentInstruction26.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand><rightOperand>PendingCancellationRequest</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand><rightOperand>RejectedCancellationRequest</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(OriginalPaymentInstruction26 obj) throws Exception {
			checkOriginalPaymentInstruction26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation24
	 * OriginalGroupInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PendingCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;RejectedCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupCancellationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupCancellationStatus is present and is different from RJCR or PNCR, then CancellationStatusReasonInformation/AdditionalInformation is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation24> forOriginalGroupInformation24 = new MMConstraint<OriginalGroupInformation24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReasonInformationRule";
			definition = "If GroupCancellationStatus is present and is different from RJCR or PNCR, then CancellationStatusReasonInformation/AdditionalInformation is not allowed.";
			owner_lazy = () -> OriginalGroupInformation24.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupCancellationStatus</leftOperand><rightOperand>PendingCancellationRequest</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupCancellationStatus</leftOperand><rightOperand>RejectedCancellationRequest</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupCancellationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(OriginalGroupInformation24 obj) throws Exception {
			checkOriginalGroupInformation24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
	 * OriginalPaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PendingCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;RejectedCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformationCancellationStatus is present and is different from RJCR (RejectedCancellationRequest) or PNCR (PendingCancellationRequest), then CancellationStatusReasonInformation/AdditionalInformation is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule#forOriginalPaymentInstruction26
	 * ConstraintCancellationStatusReasonInformationRule.
	 * forOriginalPaymentInstruction26}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule#forOriginalPaymentInstruction17
	 * ConstraintCancellationStatusReasonInformationRule.
	 * forOriginalPaymentInstruction17}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction22> forOriginalPaymentInstruction22 = new MMConstraint<OriginalPaymentInstruction22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReasonInformationRule";
			definition = "If PaymentInformationCancellationStatus is present and is different from RJCR (RejectedCancellationRequest) or PNCR (PendingCancellationRequest), then CancellationStatusReasonInformation/AdditionalInformation is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule.forOriginalPaymentInstruction26);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule.forOriginalPaymentInstruction17;
			owner_lazy = () -> OriginalPaymentInstruction22.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand><rightOperand>PendingCancellationRequest</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand><rightOperand>RejectedCancellationRequest</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(OriginalPaymentInstruction22 obj) throws Exception {
			checkOriginalPaymentInstruction22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3
	 * OriginalPaymentInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PendingCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;RejectedCancellationRequest&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationStatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationCancellationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformationCancellationStatus is present and is different from RJCR or PNCR, then CancellationStatusReasonInformation/AdditionalInformation is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInformation3> forOriginalPaymentInformation3 = new MMConstraint<OriginalPaymentInformation3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReasonInformationRule";
			definition = "If PaymentInformationCancellationStatus is present and is different from RJCR or PNCR, then CancellationStatusReasonInformation/AdditionalInformation is not allowed.";
			owner_lazy = () -> OriginalPaymentInformation3.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand><rightOperand>PendingCancellationRequest</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand><rightOperand>RejectedCancellationRequest</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationStatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationCancellationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(OriginalPaymentInformation3 obj) throws Exception {
			checkOriginalPaymentInformation3(obj);
		}
	};

	/**
	 * If GroupCancellationStatus is present and is different from RJCR or PNCR,
	 * then CancellationStatusReasonInformation/AdditionalInformation is not
	 * allowed.
	 */
	public static void checkOriginalGroupHeader5(OriginalGroupHeader5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformationCancellationStatus is present and is different from
	 * RJCR or PNCR, then
	 * CancellationStatusReasonInformation/AdditionalInformation is not allowed.
	 */
	public static void checkOriginalPaymentInstruction3(OriginalPaymentInstruction3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformationCancellationStatus is present and is different from
	 * RJCR or PNCR, then
	 * CancellationStatusReasonInformation/AdditionalInformation is not allowed.
	 */
	public static void checkOriginalPaymentInstruction10(OriginalPaymentInstruction10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupCancellationStatus is present and is different from RJCR or PNCR,
	 * then CancellationStatusReasonInformation/AdditionalInformation is not
	 * allowed.
	 */
	public static void checkOriginalGroupHeader9(OriginalGroupHeader9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformationCancellationStatus is present and is different from
	 * RJCR (RejectedCancellationRequest) or PNCR (PendingCancellationRequest),
	 * then CancellationStatusReasonInformation/AdditionalInformation is not
	 * allowed.
	 */
	public static void checkOriginalPaymentInstruction17(OriginalPaymentInstruction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformationCancellationStatus is present and is different from
	 * RJCR (RejectedCancellationRequest) or PNCR (PendingCancellationRequest),
	 * then CancellationStatusReasonInformation/AdditionalInformation is not
	 * allowed.
	 */
	public static void checkOriginalPaymentInstruction26(OriginalPaymentInstruction26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupCancellationStatus is present and is different from RJCR or PNCR,
	 * then CancellationStatusReasonInformation/AdditionalInformation is not
	 * allowed.
	 */
	public static void checkOriginalGroupInformation24(OriginalGroupInformation24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformationCancellationStatus is present and is different from
	 * RJCR (RejectedCancellationRequest) or PNCR (PendingCancellationRequest),
	 * then CancellationStatusReasonInformation/AdditionalInformation is not
	 * allowed.
	 */
	public static void checkOriginalPaymentInstruction22(OriginalPaymentInstruction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformationCancellationStatus is present and is different from
	 * RJCR or PNCR, then
	 * CancellationStatusReasonInformation/AdditionalInformation is not allowed.
	 */
	public static void checkOriginalPaymentInformation3(OriginalPaymentInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}