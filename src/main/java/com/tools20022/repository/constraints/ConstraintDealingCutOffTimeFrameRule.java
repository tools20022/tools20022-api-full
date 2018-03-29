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
import com.tools20022.repository.msg.ProcessingCharacteristics2;
import com.tools20022.repository.msg.ProcessingCharacteristics3;

/**
 * If DealingCutOffTimeFrame is present then OtherTimeFrameDescription or
 * ReferToOrderDesk or TradeMinus must be present.
 */
public class ConstraintDealingCutOffTimeFrameRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DealingCutOffTimeFrame/OtherTimeFrameDescription&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DealingCutOffTimeFrame/TradeMinus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DealingCutOffTimeFrame/ReferToOrderDesk&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DealingCutOffTimeFrame&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingCutOffTimeFrameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DealingCutOffTimeFrame is present then OtherTimeFrameDescription or ReferToOrderDesk or TradeMinus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingCharacteristics2> forProcessingCharacteristics2 = new MMConstraint<ProcessingCharacteristics2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingCutOffTimeFrameRule";
			definition = "If DealingCutOffTimeFrame is present then OtherTimeFrameDescription or ReferToOrderDesk or TradeMinus must be present.";
			owner_lazy = () -> ProcessingCharacteristics2.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DealingCutOffTimeFrame/OtherTimeFrameDescription</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/DealingCutOffTimeFrame/TradeMinus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/DealingCutOffTimeFrame/ReferToOrderDesk</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DealingCutOffTimeFrame</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(ProcessingCharacteristics2 obj) throws Exception {
			checkProcessingCharacteristics2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3
	 * ProcessingCharacteristics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DealingCutOffTimeFrame/OtherTimeFrameDescription&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DealingCutOffTimeFrame/TradeMinus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DealingCutOffTimeFrame/ReferToOrderDesk&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DealingCutOffTimeFrame&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingCutOffTimeFrameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DealingCutOffTimeFrame is present then OtherTimeFrameDescription or ReferToOrderDesk or TradeMinus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingCharacteristics3> forProcessingCharacteristics3 = new MMConstraint<ProcessingCharacteristics3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingCutOffTimeFrameRule";
			definition = "If DealingCutOffTimeFrame is present then OtherTimeFrameDescription or ReferToOrderDesk or TradeMinus must be present.";
			owner_lazy = () -> ProcessingCharacteristics3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DealingCutOffTimeFrame/OtherTimeFrameDescription</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/DealingCutOffTimeFrame/TradeMinus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/DealingCutOffTimeFrame/ReferToOrderDesk</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DealingCutOffTimeFrame</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(ProcessingCharacteristics3 obj) throws Exception {
			checkProcessingCharacteristics3(obj);
		}
	};

	/**
	 * If DealingCutOffTimeFrame is present then OtherTimeFrameDescription or
	 * ReferToOrderDesk or TradeMinus must be present.
	 */
	public static void checkProcessingCharacteristics2(ProcessingCharacteristics2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DealingCutOffTimeFrame is present then OtherTimeFrameDescription or
	 * ReferToOrderDesk or TradeMinus must be present.
	 */
	public static void checkProcessingCharacteristics3(ProcessingCharacteristics3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}