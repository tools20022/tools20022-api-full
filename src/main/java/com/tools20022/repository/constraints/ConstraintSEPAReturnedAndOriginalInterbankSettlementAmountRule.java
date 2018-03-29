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
import com.tools20022.repository.msg.PaymentTransactionInformation18;
import com.tools20022.repository.msg.PaymentTransactionInformation23;

/**
 * SEPA TVS 3.x Rule: Only Applicable for SCT, therefore not injected in
 * validation rules ReturnInterbankSettlementAmount must be the same as the
 * OriginalInterbankSettlementAmount.
 */
public class ConstraintSEPAReturnedAndOriginalInterbankSettlementAmountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18
	 * PaymentTransactionInformation18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;rightOperand&gt;/OriginalInterbankSettlementAmount&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.008&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEPAReturnedAndOriginalInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SEPA TVS 3.x Rule: \nOnly Applicable for SCT, therefore not injected in validation rules\nReturnInterbankSettlementAmount must be the same as the OriginalInterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransactionInformation18> forPaymentTransactionInformation18 = new MMConstraint<PaymentTransactionInformation18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEPAReturnedAndOriginalInterbankSettlementAmountRule";
			definition = "SEPA TVS 3.x Rule: \nOnly Applicable for SCT, therefore not injected in validation rules\nReturnInterbankSettlementAmount must be the same as the OriginalInterbankSettlementAmount.";
			owner_lazy = () -> PaymentTransactionInformation18.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReturnedInterbankSettlementAmount</leftOperand><rightOperand>/OriginalInterbankSettlementAmount</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.008</rightOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransactionInformation18 obj) throws Exception {
			checkPaymentTransactionInformation18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23
	 * PaymentTransactionInformation23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/ReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;rightOperand&gt;/OriginalInterbankSettlementAmount&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)&lt;/leftOperand&gt;&lt;rightOperand&gt;pacs.003&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEPAReturnedAndOriginalInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SEPA TVS 3.x Rule: \nOnly Applicable for SCT, therefore not injected in validation rules\nReturnInterbankSettlementAmount must be the same as the OriginalInterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentTransactionInformation23> forPaymentTransactionInformation23 = new MMConstraint<PaymentTransactionInformation23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEPAReturnedAndOriginalInterbankSettlementAmountRule";
			definition = "SEPA TVS 3.x Rule: \nOnly Applicable for SCT, therefore not injected in validation rules\nReturnInterbankSettlementAmount must be the same as the OriginalInterbankSettlementAmount.";
			owner_lazy = () -> PaymentTransactionInformation23.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/ReturnedInterbankSettlementAmount</leftOperand><rightOperand>/OriginalInterbankSettlementAmount</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>substring(/OriginalGroupInformation/OriginalMessageNameIdentification,1,8)</leftOperand><rightOperand>pacs.003</rightOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(PaymentTransactionInformation23 obj) throws Exception {
			checkPaymentTransactionInformation23(obj);
		}
	};

	/**
	 * SEPA TVS 3.x Rule: Only Applicable for SCT, therefore not injected in
	 * validation rules ReturnInterbankSettlementAmount must be the same as the
	 * OriginalInterbankSettlementAmount.
	 */
	public static void checkPaymentTransactionInformation18(PaymentTransactionInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SEPA TVS 3.x Rule: Only Applicable for SCT, therefore not injected in
	 * validation rules ReturnInterbankSettlementAmount must be the same as the
	 * OriginalInterbankSettlementAmount.
	 */
	public static void checkPaymentTransactionInformation23(PaymentTransactionInformation23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}