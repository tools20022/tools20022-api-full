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
 * If one occurrence of TaxeRelatedRate is present then at least one occurrence
 * of GrossDividendRate must be present.<br>
 * (MT566 NVR C7)
 */
public class ConstraintGrossDividendRate1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4
	 * CorporateActionRate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate4> forCorporateActionRate4 = new MMConstraint<CorporateActionRate4>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)";
			owner_lazy = () -> CorporateActionRate4.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10
	 * CorporateActionRate10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate10> forCorporateActionRate10 = new MMConstraint<CorporateActionRate10>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)";
			owner_lazy = () -> CorporateActionRate10.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20
	 * CorporateActionRate20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate20> forCorporateActionRate20 = new MMConstraint<CorporateActionRate20>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)";
			owner_lazy = () -> CorporateActionRate20.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22
	 * CorporateActionRate22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate22> forCorporateActionRate22 = new MMConstraint<CorporateActionRate22>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)";
			owner_lazy = () -> CorporateActionRate22.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26
	 * CorporateActionRate26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate26> forCorporateActionRate26 = new MMConstraint<CorporateActionRate26>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)";
			owner_lazy = () -> CorporateActionRate26.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31
	 * CorporateActionRate31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate31> forCorporateActionRate31 = new MMConstraint<CorporateActionRate31>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)";
			owner_lazy = () -> CorporateActionRate31.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38
	 * CorporateActionRate38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate1Rule#forCorporateActionRate46
	 * ConstraintGrossDividendRate1Rule.forCorporateActionRate46}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate38> forCorporateActionRate38 = new MMConstraint<CorporateActionRate38>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate1Rule.forCorporateActionRate46);
			owner_lazy = () -> CorporateActionRate38.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39
	 * CorporateActionRate39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate39> forCorporateActionRate39 = new MMConstraint<CorporateActionRate39>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)";
			owner_lazy = () -> CorporateActionRate39.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate5> forCorporateActionRate5 = new MMConstraint<CorporateActionRate5>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)";
			owner_lazy = () -> CorporateActionRate5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12
	 * CorporateActionRate12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate12> forCorporateActionRate12 = new MMConstraint<CorporateActionRate12>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)";
			owner_lazy = () -> CorporateActionRate12.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15
	 * CorporateActionRate15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate15> forCorporateActionRate15 = new MMConstraint<CorporateActionRate15>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)";
			owner_lazy = () -> CorporateActionRate15.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18
	 * CorporateActionRate18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate18> forCorporateActionRate18 = new MMConstraint<CorporateActionRate18>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)";
			owner_lazy = () -> CorporateActionRate18.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25
	 * CorporateActionRate25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate25> forCorporateActionRate25 = new MMConstraint<CorporateActionRate25>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)";
			owner_lazy = () -> CorporateActionRate25.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30
	 * CorporateActionRate30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate30> forCorporateActionRate30 = new MMConstraint<CorporateActionRate30>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)";
			owner_lazy = () -> CorporateActionRate30.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37
	 * CorporateActionRate37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate1Rule#forCorporateActionRate45
	 * ConstraintGrossDividendRate1Rule.forCorporateActionRate45}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate37> forCorporateActionRate37 = new MMConstraint<CorporateActionRate37>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate1Rule.forCorporateActionRate45);
			owner_lazy = () -> CorporateActionRate37.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40
	 * CorporateActionRate40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate40> forCorporateActionRate40 = new MMConstraint<CorporateActionRate40>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)";
			owner_lazy = () -> CorporateActionRate40.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36
	 * CorporateActionRate36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate1Rule#forCorporateActionRate44
	 * ConstraintGrossDividendRate1Rule.forCorporateActionRate44}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate36> forCorporateActionRate36 = new MMConstraint<CorporateActionRate36>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate1Rule.forCorporateActionRate44);
			owner_lazy = () -> CorporateActionRate36.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42
	 * CorporateActionRate42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate42> forCorporateActionRate42 = new MMConstraint<CorporateActionRate42>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)";
			owner_lazy = () -> CorporateActionRate42.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46
	 * CorporateActionRate46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate1Rule#forCorporateActionRate38
	 * ConstraintGrossDividendRate1Rule.forCorporateActionRate38}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate46> forCorporateActionRate46 = new MMConstraint<CorporateActionRate46>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate1Rule.forCorporateActionRate38;
			owner_lazy = () -> CorporateActionRate46.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45
	 * CorporateActionRate45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate1Rule#forCorporateActionRate37
	 * ConstraintGrossDividendRate1Rule.forCorporateActionRate37}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate45> forCorporateActionRate45 = new MMConstraint<CorporateActionRate45>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate1Rule.forCorporateActionRate37;
			owner_lazy = () -> CorporateActionRate45.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44
	 * CorporateActionRate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate1Rule#forCorporateActionRate36
	 * ConstraintGrossDividendRate1Rule.forCorporateActionRate36}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate44> forCorporateActionRate44 = new MMConstraint<CorporateActionRate44>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate1Rule.forCorporateActionRate36;
			owner_lazy = () -> CorporateActionRate44.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60
	 * CorporateActionRate60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate60> forCorporateActionRate60 = new MMConstraint<CorporateActionRate60>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate60;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)";
			owner_lazy = () -> CorporateActionRate60.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64
	 * CorporateActionRate64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate64> forCorporateActionRate64 = new MMConstraint<CorporateActionRate64>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate64;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT566 NVR C7)";
			owner_lazy = () -> CorporateActionRate64.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57
	 * CorporateActionRate57}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GrossDividendRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TaxRelatedRate[1]/Amount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate57> forCorporateActionRate57 = new MMConstraint<CorporateActionRate57>() {
		{
			validator = ConstraintGrossDividendRate1Rule::checkCorporateActionRate57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate1Rule";
			definition = "If one occurrence of TaxeRelatedRate is present then at least one occurrence of GrossDividendRate must be present.\r\n(MT564 NVR C6)";
			owner_lazy = () -> CorporateActionRate57.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GrossDividendRate[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TaxRelatedRate[1]/Amount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT566 NVR C7)
	 */
	public static void checkCorporateActionRate4(CorporateActionRate4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT566 NVR C7)
	 */
	public static void checkCorporateActionRate10(CorporateActionRate10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT566 NVR C7)
	 */
	public static void checkCorporateActionRate20(CorporateActionRate20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT566 NVR C7)
	 */
	public static void checkCorporateActionRate22(CorporateActionRate22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT566 NVR C7)
	 */
	public static void checkCorporateActionRate26(CorporateActionRate26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT566 NVR C7)
	 */
	public static void checkCorporateActionRate31(CorporateActionRate31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT566 NVR C7)
	 */
	public static void checkCorporateActionRate38(CorporateActionRate38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT566 NVR C7)
	 */
	public static void checkCorporateActionRate39(CorporateActionRate39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT564 NVR C6)
	 */
	public static void checkCorporateActionRate5(CorporateActionRate5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT564 NVR C6)
	 */
	public static void checkCorporateActionRate12(CorporateActionRate12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT564 NVR C6)
	 */
	public static void checkCorporateActionRate15(CorporateActionRate15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT564 NVR C6)
	 */
	public static void checkCorporateActionRate18(CorporateActionRate18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT564 NVR C6)
	 */
	public static void checkCorporateActionRate25(CorporateActionRate25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT564 NVR C6)
	 */
	public static void checkCorporateActionRate30(CorporateActionRate30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT564 NVR C6)
	 */
	public static void checkCorporateActionRate37(CorporateActionRate37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT564 NVR C6)
	 */
	public static void checkCorporateActionRate40(CorporateActionRate40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT564 NVR C6)
	 */
	public static void checkCorporateActionRate36(CorporateActionRate36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT564 NVR C6)
	 */
	public static void checkCorporateActionRate42(CorporateActionRate42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT566 NVR C7)
	 */
	public static void checkCorporateActionRate46(CorporateActionRate46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT564 NVR C6)
	 */
	public static void checkCorporateActionRate45(CorporateActionRate45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT564 NVR C6)
	 */
	public static void checkCorporateActionRate44(CorporateActionRate44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT564 NVR C6)
	 */
	public static void checkCorporateActionRate60(CorporateActionRate60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT566 NVR C7)
	 */
	public static void checkCorporateActionRate64(CorporateActionRate64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If one occurrence of TaxeRelatedRate is present then at least one
	 * occurrence of GrossDividendRate must be present.<br>
	 * (MT564 NVR C6)
	 */
	public static void checkCorporateActionRate57(CorporateActionRate57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}