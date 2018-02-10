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
import com.tools20022.repository.area.pain.CustomerPaymentReversalV02;
import com.tools20022.repository.area.pain.CustomerPaymentReversalV03;
import com.tools20022.repository.area.pain.CustomerPaymentReversalV04;
import java.util.Arrays;

/**
 * If GroupHeader/GroupReversal is false, then GroupHeader/NumberOfTransactions
 * must equal the number of occurrences of TransactionInformation.
 */
public class ConstraintGroupReversalAndNumberOfTransactionsRule {

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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/NumberOfTransactions&lt;/leftOperand&gt;&lt;rightOperand&gt;Number Occurrences TransactionInformation&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is false, then GroupHeader/NumberOfTransactions must equal the number of occurrences of TransactionInformation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule#forFIToFIPaymentReversalV06
	 * ConstraintGroupReversalAndNumberOfTransactionsRule.
	 * forFIToFIPaymentReversalV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV07> forFIToFIPaymentReversalV07 = new MMConstraint<FIToFIPaymentReversalV07>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsRule::checkFIToFIPaymentReversalV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsRule";
			definition = "If GroupHeader/GroupReversal is false, then GroupHeader/NumberOfTransactions must equal the number of occurrences of TransactionInformation.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule.forFIToFIPaymentReversalV06;
			owner_lazy = () -> FIToFIPaymentReversalV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/NumberOfTransactions</leftOperand><rightOperand>Number Occurrences TransactionInformation</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/GroupReversal</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/GroupReversal</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/NumberOfTransactions&lt;/leftOperand&gt;&lt;rightOperand&gt;Number Occurrences TransactionInformation&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is false, then GroupHeader/NumberOfTransactions must equal the number of occurrences of TransactionInformation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule#forFIToFIPaymentReversalV07
	 * ConstraintGroupReversalAndNumberOfTransactionsRule.
	 * forFIToFIPaymentReversalV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule#forFIToFIPaymentReversalV05
	 * ConstraintGroupReversalAndNumberOfTransactionsRule.
	 * forFIToFIPaymentReversalV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV06> forFIToFIPaymentReversalV06 = new MMConstraint<FIToFIPaymentReversalV06>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsRule::checkFIToFIPaymentReversalV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsRule";
			definition = "If GroupHeader/GroupReversal is false, then GroupHeader/NumberOfTransactions must equal the number of occurrences of TransactionInformation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule.forFIToFIPaymentReversalV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule.forFIToFIPaymentReversalV05;
			owner_lazy = () -> FIToFIPaymentReversalV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/NumberOfTransactions</leftOperand><rightOperand>Number Occurrences TransactionInformation</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/GroupReversal</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/GroupReversal</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * name} = "GroupReversalAndNumberOfTransactionsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is false, then NumberOfTransactions must equal the number of occurrences of TransactionInformation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV02> forCustomerPaymentReversalV02 = new MMConstraint<CustomerPaymentReversalV02>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsRule::checkCustomerPaymentReversalV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsRule";
			definition = "If GroupHeader/GroupReversal is false, then NumberOfTransactions must equal the number of occurrences of TransactionInformation.";
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
	 * name} = "GroupReversalAndNumberOfTransactionsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is false, then NumberOfTransactions must equal the number of occurrences of TransactionInformation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV03> forCustomerPaymentReversalV03 = new MMConstraint<CustomerPaymentReversalV03>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsRule::checkCustomerPaymentReversalV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsRule";
			definition = "If GroupHeader/GroupReversal is false, then NumberOfTransactions must equal the number of occurrences of TransactionInformation.";
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
	 * name} = "GroupReversalAndNumberOfTransactionsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is false, then NumberOfTransactions must equal the number of occurrences of TransactionInformation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline#forCustomerPaymentReversalV05
	 * ConstraintGroupReversalAndNumberOfTransactionsGuideline.
	 * forCustomerPaymentReversalV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV04> forCustomerPaymentReversalV04 = new MMConstraint<CustomerPaymentReversalV04>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsRule::checkCustomerPaymentReversalV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsRule";
			definition = "If GroupHeader/GroupReversal is false, then NumberOfTransactions must equal the number of occurrences of TransactionInformation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline.forCustomerPaymentReversalV05);
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
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV02
	 * FIToFIPaymentReversalV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/NumberOfTransactions&lt;/leftOperand&gt;&lt;rightOperand&gt;Number Occurrences TransactionInformation&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is false, then GroupHeader/NumberOfTransactions must equal the number of occurrences of TransactionInformation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV02> forFIToFIPaymentReversalV02 = new MMConstraint<FIToFIPaymentReversalV02>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsRule::checkFIToFIPaymentReversalV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsRule";
			definition = "If GroupHeader/GroupReversal is false, then GroupHeader/NumberOfTransactions must equal the number of occurrences of TransactionInformation.";
			owner_lazy = () -> FIToFIPaymentReversalV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/NumberOfTransactions</leftOperand><rightOperand>Number Occurrences TransactionInformation</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/GroupReversal</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/GroupReversal</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/NumberOfTransactions&lt;/leftOperand&gt;&lt;rightOperand&gt;Number Occurrences TransactionInformation&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is false, then GroupHeader/NumberOfTransactions must equal the number of occurrences of TransactionInformation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV03> forFIToFIPaymentReversalV03 = new MMConstraint<FIToFIPaymentReversalV03>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsRule::checkFIToFIPaymentReversalV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsRule";
			definition = "If GroupHeader/GroupReversal is false, then GroupHeader/NumberOfTransactions must equal the number of occurrences of TransactionInformation.";
			owner_lazy = () -> FIToFIPaymentReversalV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/NumberOfTransactions</leftOperand><rightOperand>Number Occurrences TransactionInformation</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/GroupReversal</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/GroupReversal</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/NumberOfTransactions&lt;/leftOperand&gt;&lt;rightOperand&gt;Number Occurrences TransactionInformation&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is false, then GroupHeader/NumberOfTransactions must equal the number of occurrences of TransactionInformation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule#forFIToFIPaymentReversalV05
	 * ConstraintGroupReversalAndNumberOfTransactionsRule.
	 * forFIToFIPaymentReversalV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV04> forFIToFIPaymentReversalV04 = new MMConstraint<FIToFIPaymentReversalV04>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsRule::checkFIToFIPaymentReversalV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsRule";
			definition = "If GroupHeader/GroupReversal is false, then GroupHeader/NumberOfTransactions must equal the number of occurrences of TransactionInformation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule.forFIToFIPaymentReversalV05);
			owner_lazy = () -> FIToFIPaymentReversalV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/NumberOfTransactions</leftOperand><rightOperand>Number Occurrences TransactionInformation</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/GroupReversal</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/GroupReversal</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/NumberOfTransactions&lt;/leftOperand&gt;&lt;rightOperand&gt;Number Occurrences TransactionInformation&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/GroupReversal&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is false, then GroupHeader/NumberOfTransactions must equal the number of occurrences of TransactionInformation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule#forFIToFIPaymentReversalV06
	 * ConstraintGroupReversalAndNumberOfTransactionsRule.
	 * forFIToFIPaymentReversalV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule#forFIToFIPaymentReversalV04
	 * ConstraintGroupReversalAndNumberOfTransactionsRule.
	 * forFIToFIPaymentReversalV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV05> forFIToFIPaymentReversalV05 = new MMConstraint<FIToFIPaymentReversalV05>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsRule::checkFIToFIPaymentReversalV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsRule";
			definition = "If GroupHeader/GroupReversal is false, then GroupHeader/NumberOfTransactions must equal the number of occurrences of TransactionInformation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule.forFIToFIPaymentReversalV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule.forFIToFIPaymentReversalV04;
			owner_lazy = () -> FIToFIPaymentReversalV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/NumberOfTransactions</leftOperand><rightOperand>Number Occurrences TransactionInformation</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/GroupReversal</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/GroupReversal</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If GroupHeader/GroupReversal is false, then
	 * GroupHeader/NumberOfTransactions must equal the number of occurrences of
	 * TransactionInformation.
	 */
	public static void checkFIToFIPaymentReversalV07(FIToFIPaymentReversalV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is false, then
	 * GroupHeader/NumberOfTransactions must equal the number of occurrences of
	 * TransactionInformation.
	 */
	public static void checkFIToFIPaymentReversalV06(FIToFIPaymentReversalV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is false, then NumberOfTransactions must
	 * equal the number of occurrences of TransactionInformation.
	 */
	public static void checkCustomerPaymentReversalV02(CustomerPaymentReversalV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is false, then NumberOfTransactions must
	 * equal the number of occurrences of TransactionInformation.
	 */
	public static void checkCustomerPaymentReversalV03(CustomerPaymentReversalV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is false, then NumberOfTransactions must
	 * equal the number of occurrences of TransactionInformation.
	 */
	public static void checkCustomerPaymentReversalV04(CustomerPaymentReversalV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is false, then
	 * GroupHeader/NumberOfTransactions must equal the number of occurrences of
	 * TransactionInformation.
	 */
	public static void checkFIToFIPaymentReversalV02(FIToFIPaymentReversalV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is false, then
	 * GroupHeader/NumberOfTransactions must equal the number of occurrences of
	 * TransactionInformation.
	 */
	public static void checkFIToFIPaymentReversalV03(FIToFIPaymentReversalV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is false, then
	 * GroupHeader/NumberOfTransactions must equal the number of occurrences of
	 * TransactionInformation.
	 */
	public static void checkFIToFIPaymentReversalV04(FIToFIPaymentReversalV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is false, then
	 * GroupHeader/NumberOfTransactions must equal the number of occurrences of
	 * TransactionInformation.
	 */
	public static void checkFIToFIPaymentReversalV05(FIToFIPaymentReversalV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}