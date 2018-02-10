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
import com.tools20022.repository.area.pacs.*;
import java.util.Arrays;

/**
 * GroupHeader/SettlementInformation/SettlementMethod must be different from
 * COVE (Cover) when returning direct debit transactions.
 */
public class ConstraintNoCoverSettlementMethodRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV07
	 * PaymentReturnV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCoverSettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE (Cover) when returning direct debit transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forPaymentReturnV06
	 * ConstraintNoCoverSettlementMethodRule.forPaymentReturnV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV07> forPaymentReturnV07 = new MMConstraint<PaymentReturnV07>() {
		{
			validator = ConstraintNoCoverSettlementMethodRule::checkPaymentReturnV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCoverSettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE (Cover) when returning direct debit transactions.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forPaymentReturnV06;
			owner_lazy = () -> PaymentReturnV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/SettlementInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/SettlementInformation/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07
	 * FIToFIPaymentReversalV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCoverSettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE (Cover) when reversing direct debit transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forFIToFIPaymentReversalV06
	 * ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV07> forFIToFIPaymentReversalV07 = new MMConstraint<FIToFIPaymentReversalV07>() {
		{
			validator = ConstraintNoCoverSettlementMethodRule::checkFIToFIPaymentReversalV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCoverSettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE (Cover) when reversing direct debit transactions.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV06;
			owner_lazy = () -> FIToFIPaymentReversalV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/SettlementInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/SettlementInformation/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV06
	 * FIToFIPaymentReversalV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCoverSettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE (Cover) when reversing direct debit transactions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forFIToFIPaymentReversalV07
	 * ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forFIToFIPaymentReversalV05
	 * ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV06> forFIToFIPaymentReversalV06 = new MMConstraint<FIToFIPaymentReversalV06>() {
		{
			validator = ConstraintNoCoverSettlementMethodRule::checkFIToFIPaymentReversalV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCoverSettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE (Cover) when reversing direct debit transactions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV05;
			owner_lazy = () -> FIToFIPaymentReversalV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/SettlementInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/SettlementInformation/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV06
	 * PaymentReturnV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCoverSettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE (Cover) when returning direct debit transactions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forPaymentReturnV07
	 * ConstraintNoCoverSettlementMethodRule.forPaymentReturnV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forPaymentReturnV05
	 * ConstraintNoCoverSettlementMethodRule.forPaymentReturnV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV06> forPaymentReturnV06 = new MMConstraint<PaymentReturnV06>() {
		{
			validator = ConstraintNoCoverSettlementMethodRule::checkPaymentReturnV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCoverSettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE (Cover) when returning direct debit transactions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forPaymentReturnV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forPaymentReturnV05;
			owner_lazy = () -> PaymentReturnV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/SettlementInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/SettlementInformation/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV02
	 * FIToFIPaymentReversalV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCoverSettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when reversing direct debit transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV02> forFIToFIPaymentReversalV02 = new MMConstraint<FIToFIPaymentReversalV02>() {
		{
			validator = ConstraintNoCoverSettlementMethodRule::checkFIToFIPaymentReversalV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCoverSettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when reversing direct debit transactions.";
			owner_lazy = () -> FIToFIPaymentReversalV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/SettlementInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/SettlementInformation/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV03
	 * FIToFIPaymentReversalV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCoverSettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when reversing direct debit transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV03> forFIToFIPaymentReversalV03 = new MMConstraint<FIToFIPaymentReversalV03>() {
		{
			validator = ConstraintNoCoverSettlementMethodRule::checkFIToFIPaymentReversalV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCoverSettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when reversing direct debit transactions.";
			owner_lazy = () -> FIToFIPaymentReversalV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/SettlementInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/SettlementInformation/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV04
	 * FIToFIPaymentReversalV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCoverSettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when reversing direct debit transactions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forFIToFIPaymentReversalV05
	 * ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV04> forFIToFIPaymentReversalV04 = new MMConstraint<FIToFIPaymentReversalV04>() {
		{
			validator = ConstraintNoCoverSettlementMethodRule::checkFIToFIPaymentReversalV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCoverSettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when reversing direct debit transactions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV05);
			owner_lazy = () -> FIToFIPaymentReversalV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/SettlementInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/SettlementInformation/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV02
	 * PaymentReturnV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCoverSettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when returning direct debit transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV02> forPaymentReturnV02 = new MMConstraint<PaymentReturnV02>() {
		{
			validator = ConstraintNoCoverSettlementMethodRule::checkPaymentReturnV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCoverSettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when returning direct debit transactions.";
			owner_lazy = () -> PaymentReturnV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/SettlementInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/SettlementInformation/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV03
	 * PaymentReturnV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCoverSettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when returning direct debit transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV03> forPaymentReturnV03 = new MMConstraint<PaymentReturnV03>() {
		{
			validator = ConstraintNoCoverSettlementMethodRule::checkPaymentReturnV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCoverSettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when returning direct debit transactions.";
			owner_lazy = () -> PaymentReturnV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/SettlementInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/SettlementInformation/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV04
	 * PaymentReturnV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCoverSettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when returning direct debit transactions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forPaymentReturnV05
	 * ConstraintNoCoverSettlementMethodRule.forPaymentReturnV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV04> forPaymentReturnV04 = new MMConstraint<PaymentReturnV04>() {
		{
			validator = ConstraintNoCoverSettlementMethodRule::checkPaymentReturnV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCoverSettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when returning direct debit transactions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forPaymentReturnV05);
			owner_lazy = () -> PaymentReturnV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/SettlementInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/SettlementInformation/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV05
	 * FIToFIPaymentReversalV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCoverSettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when reversing direct debit transactions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forFIToFIPaymentReversalV06
	 * ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forFIToFIPaymentReversalV04
	 * ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV05> forFIToFIPaymentReversalV05 = new MMConstraint<FIToFIPaymentReversalV05>() {
		{
			validator = ConstraintNoCoverSettlementMethodRule::checkFIToFIPaymentReversalV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCoverSettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when reversing direct debit transactions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV04;
			owner_lazy = () -> FIToFIPaymentReversalV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/SettlementInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/SettlementInformation/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV05
	 * PaymentReturnV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/SettlementInformation/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCoverSettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when returning direct debit transactions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forPaymentReturnV06
	 * ConstraintNoCoverSettlementMethodRule.forPaymentReturnV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forPaymentReturnV04
	 * ConstraintNoCoverSettlementMethodRule.forPaymentReturnV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV05> forPaymentReturnV05 = new MMConstraint<PaymentReturnV05>() {
		{
			validator = ConstraintNoCoverSettlementMethodRule::checkPaymentReturnV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCoverSettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod must be different from COVE when returning direct debit transactions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forPaymentReturnV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forPaymentReturnV04;
			owner_lazy = () -> PaymentReturnV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/SettlementInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/SettlementInformation/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod must be different from
	 * COVE (Cover) when returning direct debit transactions.
	 */
	public static void checkPaymentReturnV07(PaymentReturnV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod must be different from
	 * COVE (Cover) when reversing direct debit transactions.
	 */
	public static void checkFIToFIPaymentReversalV07(FIToFIPaymentReversalV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod must be different from
	 * COVE (Cover) when reversing direct debit transactions.
	 */
	public static void checkFIToFIPaymentReversalV06(FIToFIPaymentReversalV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod must be different from
	 * COVE (Cover) when returning direct debit transactions.
	 */
	public static void checkPaymentReturnV06(PaymentReturnV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod must be different from
	 * COVE when reversing direct debit transactions.
	 */
	public static void checkFIToFIPaymentReversalV02(FIToFIPaymentReversalV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod must be different from
	 * COVE when reversing direct debit transactions.
	 */
	public static void checkFIToFIPaymentReversalV03(FIToFIPaymentReversalV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod must be different from
	 * COVE when reversing direct debit transactions.
	 */
	public static void checkFIToFIPaymentReversalV04(FIToFIPaymentReversalV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod must be different from
	 * COVE when returning direct debit transactions.
	 */
	public static void checkPaymentReturnV02(PaymentReturnV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod must be different from
	 * COVE when returning direct debit transactions.
	 */
	public static void checkPaymentReturnV03(PaymentReturnV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod must be different from
	 * COVE when returning direct debit transactions.
	 */
	public static void checkPaymentReturnV04(PaymentReturnV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod must be different from
	 * COVE when reversing direct debit transactions.
	 */
	public static void checkFIToFIPaymentReversalV05(FIToFIPaymentReversalV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod must be different from
	 * COVE when returning direct debit transactions.
	 */
	public static void checkPaymentReturnV05(PaymentReturnV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}