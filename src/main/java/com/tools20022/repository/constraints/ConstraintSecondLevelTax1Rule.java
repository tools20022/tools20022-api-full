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
 * If at least one occurrence of SecondLevelTax is present, then at least one
 * occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).
 */
public class ConstraintSecondLevelTax1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails23 RateDetails23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule#forRateDetails27
	 * ConstraintSecondLevelTax1Rule.forRateDetails27}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails23> forRateDetails23 = new MMConstraint<RateDetails23>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkRateDetails23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule.forRateDetails27);
			owner_lazy = () -> RateDetails23.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68
	 * CorporateActionRate68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule#forCorporateActionRate80
	 * ConstraintSecondLevelTax1Rule.forCorporateActionRate80}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate68> forCorporateActionRate68 = new MMConstraint<CorporateActionRate68>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule.forCorporateActionRate80);
			owner_lazy = () -> CorporateActionRate68.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70
	 * CorporateActionRate70}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule#forCorporateActionRate82
	 * ConstraintSecondLevelTax1Rule.forCorporateActionRate82}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate70> forCorporateActionRate70 = new MMConstraint<CorporateActionRate70>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule.forCorporateActionRate82);
			owner_lazy = () -> CorporateActionRate70.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67
	 * CorporateActionRate67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule#forCorporateActionRate81
	 * ConstraintSecondLevelTax1Rule.forCorporateActionRate81}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate67> forCorporateActionRate67 = new MMConstraint<CorporateActionRate67>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule.forCorporateActionRate81);
			owner_lazy = () -> CorporateActionRate67.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails22 RateDetails22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule#forRateDetails26
	 * ConstraintSecondLevelTax1Rule.forRateDetails26}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails22> forRateDetails22 = new MMConstraint<RateDetails22>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkRateDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule.forRateDetails26);
			owner_lazy = () -> RateDetails22.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74
	 * CorporateActionRate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate74> forCorporateActionRate74 = new MMConstraint<CorporateActionRate74>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate74;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).";
			owner_lazy = () -> CorporateActionRate74.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79
	 * CorporateActionRate79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate79> forCorporateActionRate79 = new MMConstraint<CorporateActionRate79>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate79;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).";
			owner_lazy = () -> CorporateActionRate79.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails24 RateDetails24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails24> forRateDetails24 = new MMConstraint<RateDetails24>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkRateDetails24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).";
			owner_lazy = () -> RateDetails24.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails25 RateDetails25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails25> forRateDetails25 = new MMConstraint<RateDetails25>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkRateDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).";
			owner_lazy = () -> RateDetails25.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76
	 * CorporateActionRate76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate76> forCorporateActionRate76 = new MMConstraint<CorporateActionRate76>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate76;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present.";
			owner_lazy = () -> CorporateActionRate76.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails26 RateDetails26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule#forRateDetails31
	 * ConstraintSecondLevelTax3Rule.forRateDetails31}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule#forRateDetails22
	 * ConstraintSecondLevelTax1Rule.forRateDetails22}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails26> forRateDetails26 = new MMConstraint<RateDetails26>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkRateDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule.forRateDetails31);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule.forRateDetails22;
			owner_lazy = () -> RateDetails26.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82
	 * CorporateActionRate82}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule#forCorporateActionRate88
	 * ConstraintSecondLevelTax3Rule.forCorporateActionRate88}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule#forCorporateActionRate70
	 * ConstraintSecondLevelTax1Rule.forCorporateActionRate70}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate82> forCorporateActionRate82 = new MMConstraint<CorporateActionRate82>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate82;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule.forCorporateActionRate88);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule.forCorporateActionRate70;
			owner_lazy = () -> CorporateActionRate82.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80
	 * CorporateActionRate80}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule#forCorporateActionRate87
	 * ConstraintSecondLevelTax3Rule.forCorporateActionRate87}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule#forCorporateActionRate68
	 * ConstraintSecondLevelTax1Rule.forCorporateActionRate68}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate80> forCorporateActionRate80 = new MMConstraint<CorporateActionRate80>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate80;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule.forCorporateActionRate87);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule.forCorporateActionRate68;
			owner_lazy = () -> CorporateActionRate80.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails27 RateDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule#forRateDetails32
	 * ConstraintSecondLevelTax3Rule.forRateDetails32}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule#forRateDetails23
	 * ConstraintSecondLevelTax1Rule.forRateDetails23}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails27> forRateDetails27 = new MMConstraint<RateDetails27>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkRateDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule.forRateDetails32);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule.forRateDetails23;
			owner_lazy = () -> RateDetails27.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81
	 * CorporateActionRate81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule#forCorporateActionRate86
	 * ConstraintSecondLevelTax3Rule.forCorporateActionRate86}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule#forCorporateActionRate67
	 * ConstraintSecondLevelTax1Rule.forCorporateActionRate67}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate81> forCorporateActionRate81 = new MMConstraint<CorporateActionRate81>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate81;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule.forCorporateActionRate86);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule.forCorporateActionRate67;
			owner_lazy = () -> CorporateActionRate81.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83
	 * CorporateActionRate83}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate83> forCorporateActionRate83 = new MMConstraint<CorporateActionRate83>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate83;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).";
			owner_lazy = () -> CorporateActionRate83.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84
	 * CorporateActionRate84}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate84> forCorporateActionRate84 = new MMConstraint<CorporateActionRate84>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate84;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present.";
			owner_lazy = () -> CorporateActionRate84.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85
	 * CorporateActionRate85}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate85> forCorporateActionRate85 = new MMConstraint<CorporateActionRate85>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate85;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).";
			owner_lazy = () -> CorporateActionRate85.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails28> forRateDetails28 = new MMConstraint<RateDetails28>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkRateDetails28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).";
			owner_lazy = () -> RateDetails28.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails30 RateDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/WithholdingTaxRate[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecondLevelTax[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails30> forRateDetails30 = new MMConstraint<RateDetails30>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkRateDetails30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If at least one occurrence of SecondLevelTax is present, then at least one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).";
			owner_lazy = () -> RateDetails30.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/WithholdingTaxRate[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecondLevelTax[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails31> forRateDetails31 = new MMConstraint<RateDetails31>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkRateDetails31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> RateDetails31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86
	 * CorporateActionRate86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate86> forCorporateActionRate86 = new MMConstraint<CorporateActionRate86>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate86;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate86.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 566 NVR C4)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails32> forRateDetails32 = new MMConstraint<RateDetails32>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkRateDetails32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 566 NVR C4).";
			owner_lazy = () -> RateDetails32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate87> forCorporateActionRate87 = new MMConstraint<CorporateActionRate87>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate87;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate87.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate88
	 * CorporateActionRate88}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate88> forCorporateActionRate88 = new MMConstraint<CorporateActionRate88>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate88;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate88.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate92
	 * CorporateActionRate92}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate92> forCorporateActionRate92 = new MMConstraint<CorporateActionRate92>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate92;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate92.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails33 RateDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 566 NVR C4)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails33> forRateDetails33 = new MMConstraint<RateDetails33>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkRateDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 566 NVR C4).";
			owner_lazy = () -> RateDetails33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate94
	 * CorporateActionRate94}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate94> forCorporateActionRate94 = new MMConstraint<CorporateActionRate94>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate94;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate94.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails34 RateDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails34> forRateDetails34 = new MMConstraint<RateDetails34>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkRateDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> RateDetails34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate97
	 * CorporateActionRate97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate97> forCorporateActionRate97 = new MMConstraint<CorporateActionRate97>() {
		{
			validator = ConstraintSecondLevelTax1Rule::checkCorporateActionRate97;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax1Rule";
			definition = "If SecondLevelTax is repeated, then SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different in each occurrence of SecondLevelTax. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate97.mmObject();
		}
	};

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).
	 */
	public static void checkRateDetails23(RateDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).
	 */
	public static void checkCorporateActionRate68(CorporateActionRate68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).
	 */
	public static void checkCorporateActionRate70(CorporateActionRate70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present.
	 */
	public static void checkCorporateActionRate67(CorporateActionRate67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).
	 */
	public static void checkRateDetails22(RateDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).
	 */
	public static void checkCorporateActionRate74(CorporateActionRate74 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).
	 */
	public static void checkCorporateActionRate79(CorporateActionRate79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).
	 */
	public static void checkRateDetails24(RateDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).
	 */
	public static void checkRateDetails25(RateDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present.
	 */
	public static void checkCorporateActionRate76(CorporateActionRate76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).
	 */
	public static void checkRateDetails26(RateDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).
	 */
	public static void checkCorporateActionRate82(CorporateActionRate82 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).
	 */
	public static void checkCorporateActionRate80(CorporateActionRate80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).
	 */
	public static void checkRateDetails27(RateDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present.
	 */
	public static void checkCorporateActionRate81(CorporateActionRate81 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).
	 */
	public static void checkCorporateActionRate83(CorporateActionRate83 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present.
	 */
	public static void checkCorporateActionRate84(CorporateActionRate84 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).
	 */
	public static void checkCorporateActionRate85(CorporateActionRate85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 564 NVR C19).
	 */
	public static void checkRateDetails28(RateDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If at least one occurrence of SecondLevelTax is present, then at least
	 * one occurrence of WithholdingTaxRate must be present. (MT 566 NVR C8).
	 */
	public static void checkRateDetails30(RateDetails30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondLevelTax is repeated, then
	 * SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different
	 * in each occurrence of SecondLevelTax. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails31(RateDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondLevelTax is repeated, then
	 * SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different
	 * in each occurrence of SecondLevelTax. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate86(CorporateActionRate86 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondLevelTax is repeated, then
	 * SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different
	 * in each occurrence of SecondLevelTax. <br>
	 * (MT 566 NVR C4).
	 */
	public static void checkRateDetails32(RateDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondLevelTax is repeated, then
	 * SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different
	 * in each occurrence of SecondLevelTax. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate87(CorporateActionRate87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondLevelTax is repeated, then
	 * SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different
	 * in each occurrence of SecondLevelTax. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate88(CorporateActionRate88 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondLevelTax is repeated, then
	 * SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different
	 * in each occurrence of SecondLevelTax. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate92(CorporateActionRate92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondLevelTax is repeated, then
	 * SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different
	 * in each occurrence of SecondLevelTax. <br>
	 * (MT 566 NVR C4).
	 */
	public static void checkRateDetails33(RateDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondLevelTax is repeated, then
	 * SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different
	 * in each occurrence of SecondLevelTax. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate94(CorporateActionRate94 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondLevelTax is repeated, then
	 * SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different
	 * in each occurrence of SecondLevelTax. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails34(RateDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondLevelTax is repeated, then
	 * SecondLevelTax/RateTypeAndRate/RateType/Code values must all be different
	 * in each occurrence of SecondLevelTax. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate97(CorporateActionRate97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}