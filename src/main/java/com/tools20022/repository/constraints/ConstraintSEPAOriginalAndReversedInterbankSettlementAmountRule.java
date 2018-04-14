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
import com.tools20022.repository.msg.PaymentTransactionInformation20;
import com.tools20022.repository.msg.PaymentTransactionInformation24;

/**
 * SEA TVS 3.x Rule: Reversed Interbank Settlement Amount must be the same as
 * the Amount of the Collection (AT-06) (i.e OriginalInterbankSettlementAmount).
 */
public class ConstraintSEPAOriginalAndReversedInterbankSettlementAmountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20
	 * PaymentTransactionInformation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/OriginalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReversedInterbankSettlementAmount&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEPAOriginalAndReversedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SEA TVS 3.x Rule: \nReversed Interbank Settlement Amount must be the same as the Amount of the Collection (AT-06) (i.e OriginalInterbankSettlementAmount)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransactionInformation20> forPaymentTransactionInformation20 = new MMConstraint<PaymentTransactionInformation20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEPAOriginalAndReversedInterbankSettlementAmountRule";
			definition = "SEA TVS 3.x Rule: \nReversed Interbank Settlement Amount must be the same as the Amount of the Collection (AT-06) (i.e OriginalInterbankSettlementAmount).";
			owner_lazy = () -> PaymentTransactionInformation20.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/OriginalInterbankSettlementAmount</leftOperand><rightOperand>/ReversedInterbankSettlementAmount</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransactionInformation20 obj) throws Exception {
			checkPaymentTransactionInformation20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/OriginalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;rightOperand&gt;/ReversedInterbankSettlementAmount&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEPAOriginalAndReversedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SEA TVS 3.x Rule: \nReversed Interbank Settlement Amount must be the same as the Amount of the Collection (AT-06) (i.e OriginalInterbankSettlementAmount)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransactionInformation24> forPaymentTransactionInformation24 = new MMConstraint<PaymentTransactionInformation24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEPAOriginalAndReversedInterbankSettlementAmountRule";
			definition = "SEA TVS 3.x Rule: \nReversed Interbank Settlement Amount must be the same as the Amount of the Collection (AT-06) (i.e OriginalInterbankSettlementAmount).";
			owner_lazy = () -> PaymentTransactionInformation24.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/OriginalInterbankSettlementAmount</leftOperand><rightOperand>/ReversedInterbankSettlementAmount</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransactionInformation24 obj) throws Exception {
			checkPaymentTransactionInformation24(obj);
		}
	};

	/**
	 * SEA TVS 3.x Rule: Reversed Interbank Settlement Amount must be the same
	 * as the Amount of the Collection (AT-06) (i.e
	 * OriginalInterbankSettlementAmount).
	 */
	public static void checkPaymentTransactionInformation20(PaymentTransactionInformation20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SEA TVS 3.x Rule: Reversed Interbank Settlement Amount must be the same
	 * as the Amount of the Collection (AT-06) (i.e
	 * OriginalInterbankSettlementAmount).
	 */
	public static void checkPaymentTransactionInformation24(PaymentTransactionInformation24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}