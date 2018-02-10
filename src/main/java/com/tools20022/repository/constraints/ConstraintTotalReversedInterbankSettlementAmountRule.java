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
import com.tools20022.repository.msg.GroupHeader18;
import com.tools20022.repository.msg.GroupHeader30;
import com.tools20022.repository.msg.GroupHeader9;
import java.util.Arrays;

/**
 * If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all
 * occurrences of TransactionInformation/ReversedInterbankSettlementAmount must
 * have the same currency as the currency of
 * GroupHeader/TotalReversedInterbankSettlementAmount.
 */
public class ConstraintTotalReversedInterbankSettlementAmountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV08
	 * FIToFIPaymentReversalV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReversedInterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReversedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReversedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReversedInterbankSettlementAmount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule#forFIToFIPaymentReversalV07
	 * ConstraintTotalReversedInterbankSettlementAmountRule.
	 * forFIToFIPaymentReversalV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV08> forFIToFIPaymentReversalV08 = new MMConstraint<FIToFIPaymentReversalV08>() {
		{
			validator = ConstraintTotalReversedInterbankSettlementAmountRule::checkFIToFIPaymentReversalV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReversedInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReversedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReversedInterbankSettlementAmount.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule.forFIToFIPaymentReversalV07;
			owner_lazy = () -> FIToFIPaymentReversalV08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/TransactionInformation[*]/ReversedInterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalReversedInterbankSettlementAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[*]/ReversedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReversedInterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReversedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReversedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReversedInterbankSettlementAmount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule#forFIToFIPaymentReversalV08
	 * ConstraintTotalReversedInterbankSettlementAmountRule.
	 * forFIToFIPaymentReversalV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule#forFIToFIPaymentReversalV06
	 * ConstraintTotalReversedInterbankSettlementAmountRule.
	 * forFIToFIPaymentReversalV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV07> forFIToFIPaymentReversalV07 = new MMConstraint<FIToFIPaymentReversalV07>() {
		{
			validator = ConstraintTotalReversedInterbankSettlementAmountRule::checkFIToFIPaymentReversalV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReversedInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReversedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReversedInterbankSettlementAmount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule.forFIToFIPaymentReversalV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule.forFIToFIPaymentReversalV06;
			owner_lazy = () -> FIToFIPaymentReversalV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/TransactionInformation[*]/ReversedInterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalReversedInterbankSettlementAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[*]/ReversedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReversedInterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReversedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReversedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReversedInterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV02> forFIToFIPaymentReversalV02 = new MMConstraint<FIToFIPaymentReversalV02>() {
		{
			validator = ConstraintTotalReversedInterbankSettlementAmountRule::checkFIToFIPaymentReversalV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReversedInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReversedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReversedInterbankSettlementAmount.";
			owner_lazy = () -> FIToFIPaymentReversalV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/TransactionInformation[*]/ReversedInterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalReversedInterbankSettlementAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[*]/ReversedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReversedInterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReversedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReversedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReversedInterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV03> forFIToFIPaymentReversalV03 = new MMConstraint<FIToFIPaymentReversalV03>() {
		{
			validator = ConstraintTotalReversedInterbankSettlementAmountRule::checkFIToFIPaymentReversalV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReversedInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReversedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReversedInterbankSettlementAmount.";
			owner_lazy = () -> FIToFIPaymentReversalV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/TransactionInformation[*]/ReversedInterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalReversedInterbankSettlementAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[*]/ReversedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReversedInterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReversedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReversedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReversedInterbankSettlementAmount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule#forFIToFIPaymentReversalV05
	 * ConstraintTotalReversedInterbankSettlementAmountRule.
	 * forFIToFIPaymentReversalV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV04> forFIToFIPaymentReversalV04 = new MMConstraint<FIToFIPaymentReversalV04>() {
		{
			validator = ConstraintTotalReversedInterbankSettlementAmountRule::checkFIToFIPaymentReversalV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReversedInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReversedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReversedInterbankSettlementAmount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule.forFIToFIPaymentReversalV05);
			owner_lazy = () -> FIToFIPaymentReversalV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/TransactionInformation[*]/ReversedInterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalReversedInterbankSettlementAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[*]/ReversedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReversedInterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReversedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReversedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReversedInterbankSettlementAmount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule#forFIToFIPaymentReversalV06
	 * ConstraintTotalReversedInterbankSettlementAmountRule.
	 * forFIToFIPaymentReversalV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule#forFIToFIPaymentReversalV04
	 * ConstraintTotalReversedInterbankSettlementAmountRule.
	 * forFIToFIPaymentReversalV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV05> forFIToFIPaymentReversalV05 = new MMConstraint<FIToFIPaymentReversalV05>() {
		{
			validator = ConstraintTotalReversedInterbankSettlementAmountRule::checkFIToFIPaymentReversalV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReversedInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReversedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReversedInterbankSettlementAmount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule.forFIToFIPaymentReversalV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule.forFIToFIPaymentReversalV04;
			owner_lazy = () -> FIToFIPaymentReversalV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/TransactionInformation[*]/ReversedInterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalReversedInterbankSettlementAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[*]/ReversedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReversedInterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalReversedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReversedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReversedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReversedInterbankSettlementAmount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule#forFIToFIPaymentReversalV07
	 * ConstraintTotalReversedInterbankSettlementAmountRule.
	 * forFIToFIPaymentReversalV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule#forFIToFIPaymentReversalV05
	 * ConstraintTotalReversedInterbankSettlementAmountRule.
	 * forFIToFIPaymentReversalV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV06> forFIToFIPaymentReversalV06 = new MMConstraint<FIToFIPaymentReversalV06>() {
		{
			validator = ConstraintTotalReversedInterbankSettlementAmountRule::checkFIToFIPaymentReversalV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReversedInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalReversedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReversedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReversedInterbankSettlementAmount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule.forFIToFIPaymentReversalV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule.forFIToFIPaymentReversalV05;
			owner_lazy = () -> FIToFIPaymentReversalV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/TransactionInformation[*]/ReversedInterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalReversedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalReversedInterbankSettlementAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[*]/ReversedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9 GroupHeader9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReversedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TotalReversedInterbankSettlementAmount is present, then InterbankSettlementDate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader9> forGroupHeader9 = new MMConstraint<GroupHeader9>() {
		{
			validator = ConstraintTotalReversedInterbankSettlementAmountRule::checkGroupHeader9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReversedInterbankSettlementAmountRule";
			definition = "If TotalReversedInterbankSettlementAmount is present, then InterbankSettlementDate must be present.";
			owner_lazy = () -> GroupHeader9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18 GroupHeader18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TotalReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReversedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: (not injected)\nIf TotalReversedInterbankSettlementAmount is present, then InterbankSettlementDate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader18> forGroupHeader18 = new MMConstraint<GroupHeader18>() {
		{
			validator = ConstraintTotalReversedInterbankSettlementAmountRule::checkGroupHeader18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReversedInterbankSettlementAmountRule";
			definition = "ISO20022 Rule: (not injected)\nIf TotalReversedInterbankSettlementAmount is present, then InterbankSettlementDate must be present.";
			owner_lazy = () -> GroupHeader18.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TotalReversedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30 GroupHeader30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TotalReversedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReversedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: (not injected)\nIf TotalReversedInterbankSettlementAmount is present, then InterbankSettlementDate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader30> forGroupHeader30 = new MMConstraint<GroupHeader30>() {
		{
			validator = ConstraintTotalReversedInterbankSettlementAmountRule::checkGroupHeader30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReversedInterbankSettlementAmountRule";
			definition = "ISO20022 Rule: (not injected)\nIf TotalReversedInterbankSettlementAmount is present, then InterbankSettlementDate must be present.";
			owner_lazy = () -> GroupHeader30.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TotalReversedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If GroupHeader/TotalReversedInterbankSettlementAmount is present, then
	 * all occurrences of
	 * TransactionInformation/ReversedInterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalReversedInterbankSettlementAmount.
	 */
	public static void checkFIToFIPaymentReversalV08(FIToFIPaymentReversalV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalReversedInterbankSettlementAmount is present, then
	 * all occurrences of
	 * TransactionInformation/ReversedInterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalReversedInterbankSettlementAmount.
	 */
	public static void checkFIToFIPaymentReversalV07(FIToFIPaymentReversalV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalReversedInterbankSettlementAmount is present, then
	 * all occurrences of
	 * TransactionInformation/ReversedInterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalReversedInterbankSettlementAmount.
	 */
	public static void checkFIToFIPaymentReversalV02(FIToFIPaymentReversalV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalReversedInterbankSettlementAmount is present, then
	 * all occurrences of
	 * TransactionInformation/ReversedInterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalReversedInterbankSettlementAmount.
	 */
	public static void checkFIToFIPaymentReversalV03(FIToFIPaymentReversalV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalReversedInterbankSettlementAmount is present, then
	 * all occurrences of
	 * TransactionInformation/ReversedInterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalReversedInterbankSettlementAmount.
	 */
	public static void checkFIToFIPaymentReversalV04(FIToFIPaymentReversalV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalReversedInterbankSettlementAmount is present, then
	 * all occurrences of
	 * TransactionInformation/ReversedInterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalReversedInterbankSettlementAmount.
	 */
	public static void checkFIToFIPaymentReversalV05(FIToFIPaymentReversalV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalReversedInterbankSettlementAmount is present, then
	 * all occurrences of
	 * TransactionInformation/ReversedInterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalReversedInterbankSettlementAmount.
	 */
	public static void checkFIToFIPaymentReversalV06(FIToFIPaymentReversalV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TotalReversedInterbankSettlementAmount is present, then
	 * InterbankSettlementDate must be present.
	 */
	public static void checkGroupHeader9(GroupHeader9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: (not injected) If TotalReversedInterbankSettlementAmount
	 * is present, then InterbankSettlementDate must be present.
	 */
	public static void checkGroupHeader18(GroupHeader18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: (not injected) If TotalReversedInterbankSettlementAmount
	 * is present, then InterbankSettlementDate must be present.
	 */
	public static void checkGroupHeader30(GroupHeader30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}