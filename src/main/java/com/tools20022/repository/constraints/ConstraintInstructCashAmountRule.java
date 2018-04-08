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
import com.tools20022.repository.msg.CorporateActionOption138;
import com.tools20022.repository.msg.CorporateActionOption139;
import com.tools20022.repository.msg.CorporateActionOption148;
import com.tools20022.repository.msg.CorporateActionOption150;

/**
 * If OptionFeatures/Code QCAS (InstructCashAmount) is not present, then any
 * message elements in the list (PriceDetails/MaximumCashToInstruct,
 * PriceDetails/MinimumCashToInstruct,
 * PriceDetails/MinimumMutipleCashToInstruct) must not be present.<br>
 * (MT564 NVR C20).
 */
public class ConstraintInstructCashAmountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148
	 * CorporateActionOption148}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PriceDetails/MaximumCashToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PriceDetails/MinimumCashToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PriceDetails/MinimumMultipleCashToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;/OptionFeatures[*]/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructCashAmount&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructCashAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionFeatures/Code QCAS (InstructCashAmount) is not present, then any message elements in the list (PriceDetails/MaximumCashToInstruct, PriceDetails/MinimumCashToInstruct, PriceDetails/MinimumMutipleCashToInstruct) must not be present.\r\n(MT564 NVR C20)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption148> forCorporateActionOption148 = new MMConstraint<CorporateActionOption148>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructCashAmountRule";
			definition = "If OptionFeatures/Code QCAS (InstructCashAmount) is not present, then any message elements in the list (PriceDetails/MaximumCashToInstruct, PriceDetails/MinimumCashToInstruct, PriceDetails/MinimumMutipleCashToInstruct) must not be present.\r\n(MT564 NVR C20).";
			owner_lazy = () -> CorporateActionOption148.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/PriceDetails/MaximumCashToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/PriceDetails/MinimumCashToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/PriceDetails/MinimumMultipleCashToInstruct</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>/OptionFeatures[*]/Code</leftOperand><rightOperand>InstructCashAmount</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption148 obj) throws Exception {
			checkCorporateActionOption148(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139
	 * CorporateActionOption139}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PriceDetails/MaximumCashToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PriceDetails/MinimumCashToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PriceDetails/MinimumMultipleCashToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;/OptionFeatures[*]/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructCashAmount&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructCashAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionFeatures/Code QCAS (InstructCashAmount) is not present, then any message elements in the list (PriceDetails/MaximumCashToInstruct, PriceDetails/MinimumCashToInstruct, PriceDetails/MinimumMutipleCashToInstruct) must not be present.\r\n(MT564 NVR C20)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption139> forCorporateActionOption139 = new MMConstraint<CorporateActionOption139>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructCashAmountRule";
			definition = "If OptionFeatures/Code QCAS (InstructCashAmount) is not present, then any message elements in the list (PriceDetails/MaximumCashToInstruct, PriceDetails/MinimumCashToInstruct, PriceDetails/MinimumMutipleCashToInstruct) must not be present.\r\n(MT564 NVR C20).";
			owner_lazy = () -> CorporateActionOption139.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/PriceDetails/MaximumCashToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/PriceDetails/MinimumCashToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/PriceDetails/MinimumMultipleCashToInstruct</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>/OptionFeatures[*]/Code</leftOperand><rightOperand>InstructCashAmount</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption139 obj) throws Exception {
			checkCorporateActionOption139(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138
	 * CorporateActionOption138}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PriceDetails/MaximumCashToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PriceDetails/MinimumCashToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PriceDetails/MinimumMultipleCashToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;/OptionFeatures[*]/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructCashAmount&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructCashAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionFeatures/Code QCAS (InstructCashAmount) is not present, then any message elements in the list (PriceDetails/MaximumCashToInstruct, PriceDetails/MinimumCashToInstruct, PriceDetails/MinimumMutipleCashToInstruct) must not be present.\r\n(MT564 NVR C20)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption138> forCorporateActionOption138 = new MMConstraint<CorporateActionOption138>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructCashAmountRule";
			definition = "If OptionFeatures/Code QCAS (InstructCashAmount) is not present, then any message elements in the list (PriceDetails/MaximumCashToInstruct, PriceDetails/MinimumCashToInstruct, PriceDetails/MinimumMutipleCashToInstruct) must not be present.\r\n(MT564 NVR C20).";
			owner_lazy = () -> CorporateActionOption138.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/PriceDetails/MaximumCashToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/PriceDetails/MinimumCashToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/PriceDetails/MinimumMultipleCashToInstruct</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>/OptionFeatures[*]/Code</leftOperand><rightOperand>InstructCashAmount</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption138 obj) throws Exception {
			checkCorporateActionOption138(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150
	 * CorporateActionOption150}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PriceDetails/MaximumCashToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PriceDetails/MinimumCashToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/PriceDetails/MinimumMultipleCashToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;/OptionFeatures[*]/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructCashAmount&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructCashAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionFeatures/Code QCAS (InstructCashAmount) is not present, then any message elements in the list (PriceDetails/MaximumCashToInstruct, PriceDetails/MinimumCashToInstruct, PriceDetails/MinimumMutipleCashToInstruct) must not be present.\r\n(MT564 NVR C20)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption150> forCorporateActionOption150 = new MMConstraint<CorporateActionOption150>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructCashAmountRule";
			definition = "If OptionFeatures/Code QCAS (InstructCashAmount) is not present, then any message elements in the list (PriceDetails/MaximumCashToInstruct, PriceDetails/MinimumCashToInstruct, PriceDetails/MinimumMutipleCashToInstruct) must not be present.\r\n(MT564 NVR C20).";
			owner_lazy = () -> CorporateActionOption150.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/PriceDetails/MaximumCashToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/PriceDetails/MinimumCashToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/PriceDetails/MinimumMultipleCashToInstruct</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>/OptionFeatures[*]/Code</leftOperand><rightOperand>InstructCashAmount</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption150 obj) throws Exception {
			checkCorporateActionOption150(obj);
		}
	};

	/**
	 * If OptionFeatures/Code QCAS (InstructCashAmount) is not present, then any
	 * message elements in the list (PriceDetails/MaximumCashToInstruct,
	 * PriceDetails/MinimumCashToInstruct,
	 * PriceDetails/MinimumMutipleCashToInstruct) must not be present.<br>
	 * (MT564 NVR C20).
	 */
	public static void checkCorporateActionOption148(CorporateActionOption148 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionFeatures/Code QCAS (InstructCashAmount) is not present, then any
	 * message elements in the list (PriceDetails/MaximumCashToInstruct,
	 * PriceDetails/MinimumCashToInstruct,
	 * PriceDetails/MinimumMutipleCashToInstruct) must not be present.<br>
	 * (MT564 NVR C20).
	 */
	public static void checkCorporateActionOption139(CorporateActionOption139 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionFeatures/Code QCAS (InstructCashAmount) is not present, then any
	 * message elements in the list (PriceDetails/MaximumCashToInstruct,
	 * PriceDetails/MinimumCashToInstruct,
	 * PriceDetails/MinimumMutipleCashToInstruct) must not be present.<br>
	 * (MT564 NVR C20).
	 */
	public static void checkCorporateActionOption138(CorporateActionOption138 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionFeatures/Code QCAS (InstructCashAmount) is not present, then any
	 * message elements in the list (PriceDetails/MaximumCashToInstruct,
	 * PriceDetails/MinimumCashToInstruct,
	 * PriceDetails/MinimumMutipleCashToInstruct) must not be present.<br>
	 * (MT564 NVR C20).
	 */
	public static void checkCorporateActionOption150(CorporateActionOption150 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}