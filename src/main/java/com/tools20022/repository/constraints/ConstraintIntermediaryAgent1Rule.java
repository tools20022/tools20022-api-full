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
 * If IntermediaryAgent1 is present, then CreditorAgent must be present.
 */
public class ConstraintIntermediaryAgent1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3
	 * CreditTransferTransactionInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent1 is present, then CreditorAgent must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation3> forCreditTransferTransactionInformation3 = new MMConstraint<CreditTransferTransactionInformation3>() {
		{
			validator = ConstraintIntermediaryAgent1Rule::checkCreditTransferTransactionInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Rule";
			definition = "If IntermediaryAgent1 is present, then CreditorAgent must be present.";
			owner_lazy = () -> CreditTransferTransactionInformation3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13
	 * CreditTransferTransactionInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent1 is present, then CreditorAgent must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation13> forCreditTransferTransactionInformation13 = new MMConstraint<CreditTransferTransactionInformation13>() {
		{
			validator = ConstraintIntermediaryAgent1Rule::checkCreditTransferTransactionInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Rule";
			definition = "If IntermediaryAgent1 is present, then CreditorAgent must be present.";
			owner_lazy = () -> CreditTransferTransactionInformation13.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent1</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4
	 * CreditTransferTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent1 is present, then CreditorAgent must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction4> forCreditTransferTransaction4 = new MMConstraint<CreditTransferTransaction4>() {
		{
			validator = ConstraintIntermediaryAgent1Rule::checkCreditTransferTransaction4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Rule";
			definition = "If IntermediaryAgent1 is present, then CreditorAgent must be present.";
			owner_lazy = () -> CreditTransferTransaction4.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent1</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8
	 * CreditTransferTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent1 is present, then CreditorAgent must be present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule#forCreditTransferTransaction17
	 * ConstraintIntermediaryAgent1Rule.forCreditTransferTransaction17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction8> forCreditTransferTransaction8 = new MMConstraint<CreditTransferTransaction8>() {
		{
			validator = ConstraintIntermediaryAgent1Rule::checkCreditTransferTransaction8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Rule";
			definition = "If IntermediaryAgent1 is present, then CreditorAgent must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule.forCreditTransferTransaction17);
			owner_lazy = () -> CreditTransferTransaction8.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent1</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2
	 * PaymentComplementaryInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent1 is present, then CreditorAgent must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentComplementaryInformation2> forPaymentComplementaryInformation2 = new MMConstraint<PaymentComplementaryInformation2>() {
		{
			validator = ConstraintIntermediaryAgent1Rule::checkPaymentComplementaryInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Rule";
			definition = "If IntermediaryAgent1 is present, then CreditorAgent must be present.";
			owner_lazy = () -> PaymentComplementaryInformation2.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent1</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3
	 * PaymentComplementaryInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent1 is present, then CreditorAgent must be present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule#forPaymentComplementaryInformation4
	 * ConstraintIntermediaryAgent1Rule.forPaymentComplementaryInformation4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentComplementaryInformation3> forPaymentComplementaryInformation3 = new MMConstraint<PaymentComplementaryInformation3>() {
		{
			validator = ConstraintIntermediaryAgent1Rule::checkPaymentComplementaryInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Rule";
			definition = "If IntermediaryAgent1 is present, then CreditorAgent must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule.forPaymentComplementaryInformation4);
			owner_lazy = () -> PaymentComplementaryInformation3.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent1</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9
	 * CreditTransferTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent1 is present, then CreditorAgent must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction9> forCreditTransferTransaction9 = new MMConstraint<CreditTransferTransaction9>() {
		{
			validator = ConstraintIntermediaryAgent1Rule::checkCreditTransferTransaction9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Rule";
			definition = "If IntermediaryAgent1 is present, then CreditorAgent must be present.";
			owner_lazy = () -> CreditTransferTransaction9.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent1</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4
	 * PaymentComplementaryInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent1 is present, then CreditorAgent must be present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule#forPaymentComplementaryInformation5
	 * ConstraintIntermediaryAgent1Rule.forPaymentComplementaryInformation5}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule#forPaymentComplementaryInformation3
	 * ConstraintIntermediaryAgent1Rule.forPaymentComplementaryInformation3}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentComplementaryInformation4> forPaymentComplementaryInformation4 = new MMConstraint<PaymentComplementaryInformation4>() {
		{
			validator = ConstraintIntermediaryAgent1Rule::checkPaymentComplementaryInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Rule";
			definition = "If IntermediaryAgent1 is present, then CreditorAgent must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule.forPaymentComplementaryInformation5);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule.forPaymentComplementaryInformation3;
			owner_lazy = () -> PaymentComplementaryInformation4.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent1</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17
	 * CreditTransferTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent1 is present, then CreditorAgent must be present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule#forCreditTransferTransaction23
	 * ConstraintIntermediaryAgent1Rule.forCreditTransferTransaction23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule#forCreditTransferTransaction8
	 * ConstraintIntermediaryAgent1Rule.forCreditTransferTransaction8}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction17> forCreditTransferTransaction17 = new MMConstraint<CreditTransferTransaction17>() {
		{
			validator = ConstraintIntermediaryAgent1Rule::checkCreditTransferTransaction17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Rule";
			definition = "If IntermediaryAgent1 is present, then CreditorAgent must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule.forCreditTransferTransaction23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule.forCreditTransferTransaction8;
			owner_lazy = () -> CreditTransferTransaction17.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent1</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23
	 * CreditTransferTransaction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent1 is present, then CreditorAgent must be present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule#forCreditTransferTransaction17
	 * ConstraintIntermediaryAgent1Rule.forCreditTransferTransaction17}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction23> forCreditTransferTransaction23 = new MMConstraint<CreditTransferTransaction23>() {
		{
			validator = ConstraintIntermediaryAgent1Rule::checkCreditTransferTransaction23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Rule";
			definition = "If IntermediaryAgent1 is present, then CreditorAgent must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule.forCreditTransferTransaction17;
			owner_lazy = () -> CreditTransferTransaction23.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent1</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5
	 * PaymentComplementaryInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent1 is present, then CreditorAgent must be present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule#forPaymentComplementaryInformation6
	 * ConstraintIntermediaryAgent1Rule.forPaymentComplementaryInformation6}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule#forPaymentComplementaryInformation4
	 * ConstraintIntermediaryAgent1Rule.forPaymentComplementaryInformation4}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentComplementaryInformation5> forPaymentComplementaryInformation5 = new MMConstraint<PaymentComplementaryInformation5>() {
		{
			validator = ConstraintIntermediaryAgent1Rule::checkPaymentComplementaryInformation5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Rule";
			definition = "If IntermediaryAgent1 is present, then CreditorAgent must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule.forPaymentComplementaryInformation6);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule.forPaymentComplementaryInformation4;
			owner_lazy = () -> PaymentComplementaryInformation5.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent1</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6
	 * PaymentComplementaryInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent1 is present, then CreditorAgent must be present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule#forPaymentComplementaryInformation5
	 * ConstraintIntermediaryAgent1Rule.forPaymentComplementaryInformation5}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentComplementaryInformation6> forPaymentComplementaryInformation6 = new MMConstraint<PaymentComplementaryInformation6>() {
		{
			validator = ConstraintIntermediaryAgent1Rule::checkPaymentComplementaryInformation6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Rule";
			definition = "If IntermediaryAgent1 is present, then CreditorAgent must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent1Rule.forPaymentComplementaryInformation5;
			owner_lazy = () -> PaymentComplementaryInformation6.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent1</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If IntermediaryAgent1 is present, then CreditorAgent must be present.
	 */
	public static void checkCreditTransferTransactionInformation3(CreditTransferTransactionInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent1 is present, then CreditorAgent must be present.
	 */
	public static void checkCreditTransferTransactionInformation13(CreditTransferTransactionInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent1 is present, then CreditorAgent must be present.
	 */
	public static void checkCreditTransferTransaction4(CreditTransferTransaction4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent1 is present, then CreditorAgent must be present.
	 */
	public static void checkCreditTransferTransaction8(CreditTransferTransaction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent1 is present, then CreditorAgent must be present.
	 */
	public static void checkPaymentComplementaryInformation2(PaymentComplementaryInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent1 is present, then CreditorAgent must be present.
	 */
	public static void checkPaymentComplementaryInformation3(PaymentComplementaryInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent1 is present, then CreditorAgent must be present.
	 */
	public static void checkCreditTransferTransaction9(CreditTransferTransaction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent1 is present, then CreditorAgent must be present.
	 */
	public static void checkPaymentComplementaryInformation4(PaymentComplementaryInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent1 is present, then CreditorAgent must be present.
	 */
	public static void checkCreditTransferTransaction17(CreditTransferTransaction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent1 is present, then CreditorAgent must be present.
	 */
	public static void checkCreditTransferTransaction23(CreditTransferTransaction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent1 is present, then CreditorAgent must be present.
	 */
	public static void checkPaymentComplementaryInformation5(PaymentComplementaryInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent1 is present, then CreditorAgent must be present.
	 */
	public static void checkPaymentComplementaryInformation6(PaymentComplementaryInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}