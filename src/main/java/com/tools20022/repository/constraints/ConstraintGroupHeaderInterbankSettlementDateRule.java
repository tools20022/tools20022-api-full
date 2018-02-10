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
 * If GroupHeader/InterbankSettlementDate is present, then
 * DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.
 */
public class ConstraintGroupHeaderInterbankSettlementDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07
	 * FIToFICustomerDirectDebitV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFICustomerDirectDebitV06
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFICustomerDirectDebitV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV07> forFIToFICustomerDirectDebitV07 = new MMConstraint<FIToFICustomerDirectDebitV07>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFICustomerDirectDebitV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFICustomerDirectDebitV06;
			owner_lazy = () -> FIToFICustomerDirectDebitV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV07
	 * FIToFICustomerCreditTransferV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFICustomerCreditTransferV06
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFICustomerCreditTransferV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV07> forFIToFICustomerCreditTransferV07 = new MMConstraint<FIToFICustomerCreditTransferV07>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFICustomerCreditTransferV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFICustomerCreditTransferV06;
			owner_lazy = () -> FIToFICustomerCreditTransferV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV07
	 * FinancialInstitutionCreditTransferV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFinancialInstitutionCreditTransferV06
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFinancialInstitutionCreditTransferV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV07> forFinancialInstitutionCreditTransferV07 = new MMConstraint<FinancialInstitutionCreditTransferV07>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFinancialInstitutionCreditTransferV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFinancialInstitutionCreditTransferV06;
			owner_lazy = () -> FinancialInstitutionCreditTransferV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFIPaymentReversalV07
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFIPaymentReversalV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV08> forFIToFIPaymentReversalV08 = new MMConstraint<FIToFIPaymentReversalV08>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFIPaymentReversalV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFIPaymentReversalV07;
			owner_lazy = () -> FIToFIPaymentReversalV08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV08
	 * PaymentReturnV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forPaymentReturnV07
	 * ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV08> forPaymentReturnV08 = new MMConstraint<PaymentReturnV08>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkPaymentReturnV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV07;
			owner_lazy = () -> PaymentReturnV08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV06
	 * FIToFICustomerDirectDebitV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFICustomerDirectDebitV07
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFICustomerDirectDebitV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFICustomerDirectDebitV05
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFICustomerDirectDebitV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV06> forFIToFICustomerDirectDebitV06 = new MMConstraint<FIToFICustomerDirectDebitV06>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFICustomerDirectDebitV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFICustomerDirectDebitV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFICustomerDirectDebitV05;
			owner_lazy = () -> FIToFICustomerDirectDebitV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06
	 * FinancialInstitutionCreditTransferV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFinancialInstitutionCreditTransferV07
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFinancialInstitutionCreditTransferV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFinancialInstitutionCreditTransferV05
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFinancialInstitutionCreditTransferV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV06> forFinancialInstitutionCreditTransferV06 = new MMConstraint<FinancialInstitutionCreditTransferV06>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFinancialInstitutionCreditTransferV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFinancialInstitutionCreditTransferV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFinancialInstitutionCreditTransferV05;
			owner_lazy = () -> FinancialInstitutionCreditTransferV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06
	 * FIToFICustomerCreditTransferV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFICustomerCreditTransferV07
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFICustomerCreditTransferV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFICustomerCreditTransferV05
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFICustomerCreditTransferV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV06> forFIToFICustomerCreditTransferV06 = new MMConstraint<FIToFICustomerCreditTransferV06>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFICustomerCreditTransferV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFICustomerCreditTransferV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFICustomerCreditTransferV05;
			owner_lazy = () -> FIToFICustomerCreditTransferV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forPaymentReturnV08
	 * ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forPaymentReturnV06
	 * ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV07> forPaymentReturnV07 = new MMConstraint<PaymentReturnV07>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkPaymentReturnV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV06;
			owner_lazy = () -> PaymentReturnV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFIPaymentReversalV08
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFIPaymentReversalV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFIPaymentReversalV06
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFIPaymentReversalV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV07> forFIToFIPaymentReversalV07 = new MMConstraint<FIToFIPaymentReversalV07>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFIPaymentReversalV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFIPaymentReversalV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFIPaymentReversalV06;
			owner_lazy = () -> FIToFIPaymentReversalV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02
	 * FIToFICustomerCreditTransferV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV02> forFIToFICustomerCreditTransferV02 = new MMConstraint<FIToFICustomerCreditTransferV02>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFICustomerCreditTransferV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed.";
			owner_lazy = () -> FIToFICustomerCreditTransferV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV03
	 * FIToFICustomerCreditTransferV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV03> forFIToFICustomerCreditTransferV03 = new MMConstraint<FIToFICustomerCreditTransferV03>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFICustomerCreditTransferV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed.";
			owner_lazy = () -> FIToFICustomerCreditTransferV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV04
	 * FIToFICustomerCreditTransferV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFICustomerCreditTransferV05
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFICustomerCreditTransferV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV04> forFIToFICustomerCreditTransferV04 = new MMConstraint<FIToFICustomerCreditTransferV04>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFICustomerCreditTransferV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFICustomerCreditTransferV05);
			owner_lazy = () -> FIToFICustomerCreditTransferV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV02
	 * FIToFICustomerDirectDebitV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV02> forFIToFICustomerDirectDebitV02 = new MMConstraint<FIToFICustomerDirectDebitV02>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFICustomerDirectDebitV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.";
			owner_lazy = () -> FIToFICustomerDirectDebitV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV03
	 * FIToFICustomerDirectDebitV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV03> forFIToFICustomerDirectDebitV03 = new MMConstraint<FIToFICustomerDirectDebitV03>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFICustomerDirectDebitV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.";
			owner_lazy = () -> FIToFICustomerDirectDebitV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV04
	 * FIToFICustomerDirectDebitV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFICustomerDirectDebitV05
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFICustomerDirectDebitV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV04> forFIToFICustomerDirectDebitV04 = new MMConstraint<FIToFICustomerDirectDebitV04>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFICustomerDirectDebitV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFICustomerDirectDebitV05);
			owner_lazy = () -> FIToFICustomerDirectDebitV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV02> forFIToFIPaymentReversalV02 = new MMConstraint<FIToFIPaymentReversalV02>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFIPaymentReversalV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed.";
			owner_lazy = () -> FIToFIPaymentReversalV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV03> forFIToFIPaymentReversalV03 = new MMConstraint<FIToFIPaymentReversalV03>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFIPaymentReversalV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed.";
			owner_lazy = () -> FIToFIPaymentReversalV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFIPaymentReversalV05
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFIPaymentReversalV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV04> forFIToFIPaymentReversalV04 = new MMConstraint<FIToFIPaymentReversalV04>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFIPaymentReversalV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFIPaymentReversalV05);
			owner_lazy = () -> FIToFIPaymentReversalV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV02
	 * FinancialInstitutionCreditTransferV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV02> forFinancialInstitutionCreditTransferV02 = new MMConstraint<FinancialInstitutionCreditTransferV02>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFinancialInstitutionCreditTransferV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed.";
			owner_lazy = () -> FinancialInstitutionCreditTransferV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV03
	 * FinancialInstitutionCreditTransferV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV03> forFinancialInstitutionCreditTransferV03 = new MMConstraint<FinancialInstitutionCreditTransferV03>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFinancialInstitutionCreditTransferV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed.";
			owner_lazy = () -> FinancialInstitutionCreditTransferV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV04
	 * FinancialInstitutionCreditTransferV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFinancialInstitutionCreditTransferV05
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFinancialInstitutionCreditTransferV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV04> forFinancialInstitutionCreditTransferV04 = new MMConstraint<FinancialInstitutionCreditTransferV04>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFinancialInstitutionCreditTransferV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFinancialInstitutionCreditTransferV05);
			owner_lazy = () -> FinancialInstitutionCreditTransferV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV02> forPaymentReturnV02 = new MMConstraint<PaymentReturnV02>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkPaymentReturnV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed.";
			owner_lazy = () -> PaymentReturnV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV03> forPaymentReturnV03 = new MMConstraint<PaymentReturnV03>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkPaymentReturnV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed.";
			owner_lazy = () -> PaymentReturnV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forPaymentReturnV05
	 * ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV04> forPaymentReturnV04 = new MMConstraint<PaymentReturnV04>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkPaymentReturnV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV05);
			owner_lazy = () -> PaymentReturnV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV05
	 * FinancialInstitutionCreditTransferV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFinancialInstitutionCreditTransferV06
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFinancialInstitutionCreditTransferV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFinancialInstitutionCreditTransferV04
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFinancialInstitutionCreditTransferV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV05> forFinancialInstitutionCreditTransferV05 = new MMConstraint<FinancialInstitutionCreditTransferV05>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFinancialInstitutionCreditTransferV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFinancialInstitutionCreditTransferV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFinancialInstitutionCreditTransferV04;
			owner_lazy = () -> FinancialInstitutionCreditTransferV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV05
	 * FIToFICustomerDirectDebitV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFICustomerDirectDebitV06
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFICustomerDirectDebitV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFICustomerDirectDebitV04
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFICustomerDirectDebitV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV05> forFIToFICustomerDirectDebitV05 = new MMConstraint<FIToFICustomerDirectDebitV05>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFICustomerDirectDebitV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFICustomerDirectDebitV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFICustomerDirectDebitV04;
			owner_lazy = () -> FIToFICustomerDirectDebitV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFIPaymentReversalV06
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFIPaymentReversalV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFIPaymentReversalV04
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFIPaymentReversalV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV05> forFIToFIPaymentReversalV05 = new MMConstraint<FIToFIPaymentReversalV05>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFIPaymentReversalV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFIPaymentReversalV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFIPaymentReversalV04;
			owner_lazy = () -> FIToFIPaymentReversalV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forPaymentReturnV06
	 * ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forPaymentReturnV04
	 * ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV05> forPaymentReturnV05 = new MMConstraint<PaymentReturnV05>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkPaymentReturnV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV04;
			owner_lazy = () -> PaymentReturnV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV05
	 * FIToFICustomerCreditTransferV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFICustomerCreditTransferV06
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFICustomerCreditTransferV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFICustomerCreditTransferV04
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFICustomerCreditTransferV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV05> forFIToFICustomerCreditTransferV05 = new MMConstraint<FIToFICustomerCreditTransferV05>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFICustomerCreditTransferV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFICustomerCreditTransferV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFICustomerCreditTransferV04;
			owner_lazy = () -> FIToFICustomerCreditTransferV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFIPaymentReversalV07
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFIPaymentReversalV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFIPaymentReversalV05
	 * ConstraintGroupHeaderInterbankSettlementDateRule.
	 * forFIToFIPaymentReversalV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV06> forFIToFIPaymentReversalV06 = new MMConstraint<FIToFIPaymentReversalV06>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkFIToFIPaymentReversalV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFIPaymentReversalV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFIPaymentReversalV05;
			owner_lazy = () -> FIToFIPaymentReversalV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forPaymentReturnV07
	 * ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forPaymentReturnV05
	 * ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV06> forPaymentReturnV06 = new MMConstraint<PaymentReturnV06>() {
		{
			validator = ConstraintGroupHeaderInterbankSettlementDateRule::checkPaymentReturnV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV05;
			owner_lazy = () -> PaymentReturnV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkFIToFICustomerDirectDebitV07(FIToFICustomerDirectDebitV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed.
	 */
	public static void checkFIToFICustomerCreditTransferV07(FIToFICustomerCreditTransferV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed.
	 */
	public static void checkFinancialInstitutionCreditTransferV07(FinancialInstitutionCreditTransferV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkFIToFIPaymentReversalV08(FIToFIPaymentReversalV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkPaymentReturnV08(PaymentReturnV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkFIToFICustomerDirectDebitV06(FIToFICustomerDirectDebitV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed.
	 */
	public static void checkFinancialInstitutionCreditTransferV06(FinancialInstitutionCreditTransferV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed.
	 */
	public static void checkFIToFICustomerCreditTransferV06(FIToFICustomerCreditTransferV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkPaymentReturnV07(PaymentReturnV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkFIToFIPaymentReversalV07(FIToFIPaymentReversalV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed.
	 */
	public static void checkFIToFICustomerCreditTransferV02(FIToFICustomerCreditTransferV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed.
	 */
	public static void checkFIToFICustomerCreditTransferV03(FIToFICustomerCreditTransferV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed.
	 */
	public static void checkFIToFICustomerCreditTransferV04(FIToFICustomerCreditTransferV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkFIToFICustomerDirectDebitV02(FIToFICustomerDirectDebitV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkFIToFICustomerDirectDebitV03(FIToFICustomerDirectDebitV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkFIToFICustomerDirectDebitV04(FIToFICustomerDirectDebitV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkFIToFIPaymentReversalV02(FIToFIPaymentReversalV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkFIToFIPaymentReversalV03(FIToFIPaymentReversalV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkFIToFIPaymentReversalV04(FIToFIPaymentReversalV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed.
	 */
	public static void checkFinancialInstitutionCreditTransferV02(FinancialInstitutionCreditTransferV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed.
	 */
	public static void checkFinancialInstitutionCreditTransferV03(FinancialInstitutionCreditTransferV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed.
	 */
	public static void checkFinancialInstitutionCreditTransferV04(FinancialInstitutionCreditTransferV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkPaymentReturnV02(PaymentReturnV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkPaymentReturnV03(PaymentReturnV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkPaymentReturnV04(PaymentReturnV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed.
	 */
	public static void checkFinancialInstitutionCreditTransferV05(FinancialInstitutionCreditTransferV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkFIToFICustomerDirectDebitV05(FIToFICustomerDirectDebitV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkFIToFIPaymentReversalV05(FIToFIPaymentReversalV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkPaymentReturnV05(PaymentReturnV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed.
	 */
	public static void checkFIToFICustomerCreditTransferV05(FIToFICustomerCreditTransferV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkFIToFIPaymentReversalV06(FIToFIPaymentReversalV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkPaymentReturnV06(PaymentReturnV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}