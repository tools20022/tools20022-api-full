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
import com.tools20022.repository.area.seev.*;
import java.util.Arrays;

/**
 * If CorporateActionGeneralInformation/EventType/Code is RHDI
 * (IntermediateSecuritiesDistribution), then CorporateActionDetails/<br>
 * IntermediateSecuritiesDistributionType must be present in at least one
 * occurrence of CorporateActionDetails.<br>
 * (MT 564 NVR C11).
 */
public class ConstraintIntermediateSecuritiesDistribution1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08
	 * CorporateActionNotificationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/IntermediateSecuritiesDistributionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;IntermediateSecuritiesDistribution&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionGeneralInformation/EventType/Code is RHDI (IntermediateSecuritiesDistribution), then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C11)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule#forCorporateActionNotificationV07
	 * ConstraintIntermediateSecuritiesDistribution1Rule.
	 * forCorporateActionNotificationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> forCorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			validator = ConstraintIntermediateSecuritiesDistribution1Rule::checkCorporateActionNotificationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution1Rule";
			definition = "If CorporateActionGeneralInformation/EventType/Code is RHDI (IntermediateSecuritiesDistribution), then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C11).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule.forCorporateActionNotificationV07;
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/IntermediateSecuritiesDistributionType</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand><rightOperand>IntermediateSecuritiesDistribution</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07
	 * CorporateActionNotificationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/IntermediateSecuritiesDistributionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;IntermediateSecuritiesDistribution&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionGeneralInformation/EventType/Code is RHDI (IntermediateSecuritiesDistribution), then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C11)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule#forCorporateActionNotificationV08
	 * ConstraintIntermediateSecuritiesDistribution1Rule.
	 * forCorporateActionNotificationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule#forCorporateActionNotificationV06
	 * ConstraintIntermediateSecuritiesDistribution1Rule.
	 * forCorporateActionNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV07> forCorporateActionNotificationV07 = new MMConstraint<CorporateActionNotificationV07>() {
		{
			validator = ConstraintIntermediateSecuritiesDistribution1Rule::checkCorporateActionNotificationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution1Rule";
			definition = "If CorporateActionGeneralInformation/EventType/Code is RHDI (IntermediateSecuritiesDistribution), then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C11).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule.forCorporateActionNotificationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule.forCorporateActionNotificationV06;
			owner_lazy = () -> CorporateActionNotificationV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/IntermediateSecuritiesDistributionType</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand><rightOperand>IntermediateSecuritiesDistribution</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07
	 * CorporateActionNotification002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/IntermediateSecuritiesDistributionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;IntermediateSecuritiesDistribution&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionGeneralInformation/EventType/Code is RHDI (IntermediateSecuritiesDistribution), then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C11)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V07> forCorporateActionNotification002V07 = new MMConstraint<CorporateActionNotification002V07>() {
		{
			validator = ConstraintIntermediateSecuritiesDistribution1Rule::checkCorporateActionNotification002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution1Rule";
			definition = "If CorporateActionGeneralInformation/EventType/Code is RHDI (IntermediateSecuritiesDistribution), then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C11).";
			owner_lazy = () -> CorporateActionNotification002V07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/IntermediateSecuritiesDistributionType</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand><rightOperand>IntermediateSecuritiesDistribution</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01
	 * CorporateActionNotificationV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/IntermediateSecuritiesDistributionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;IntermediateSecuritiesDistribution&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/IntermediateSecuritiesDistributionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionGeneralInformation/EventType/Code is RHDI and if CorporateActionDetails/IntermediateSecuritiesDistributionType is present, then CorporateActionOptionDetails/IntermediateSecuritiesDistributionType must not be present in any occurrence of CorporateActionOptionDetails.\n(MT 564 NVR C12)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV01> forCorporateActionNotificationV01 = new MMConstraint<CorporateActionNotificationV01>() {
		{
			validator = ConstraintIntermediateSecuritiesDistribution1Rule::checkCorporateActionNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution1Rule";
			definition = "If CorporateActionGeneralInformation/EventType/Code is RHDI and if CorporateActionDetails/IntermediateSecuritiesDistributionType is present, then CorporateActionOptionDetails/IntermediateSecuritiesDistributionType must not be present in any occurrence of CorporateActionOptionDetails.\n(MT 564 NVR C12).";
			owner_lazy = () -> CorporateActionNotificationV01.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/IntermediateSecuritiesDistributionType</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand><rightOperand>IntermediateSecuritiesDistribution</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/IntermediateSecuritiesDistributionType</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02
	 * CorporateActionNotificationV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/IntermediateSecuritiesDistributionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;IntermediateSecuritiesDistribution&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionGeneralInformation/EventType/Code is RHDI, then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C12)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV02> forCorporateActionNotificationV02 = new MMConstraint<CorporateActionNotificationV02>() {
		{
			validator = ConstraintIntermediateSecuritiesDistribution1Rule::checkCorporateActionNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution1Rule";
			definition = "If CorporateActionGeneralInformation/EventType/Code is RHDI, then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C12).";
			owner_lazy = () -> CorporateActionNotificationV02.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/IntermediateSecuritiesDistributionType</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand><rightOperand>IntermediateSecuritiesDistribution</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03
	 * CorporateActionNotificationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/IntermediateSecuritiesDistributionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;IntermediateSecuritiesDistribution&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionGeneralInformation/EventType/Code is RHDI, then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C12)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV03> forCorporateActionNotificationV03 = new MMConstraint<CorporateActionNotificationV03>() {
		{
			validator = ConstraintIntermediateSecuritiesDistribution1Rule::checkCorporateActionNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution1Rule";
			definition = "If CorporateActionGeneralInformation/EventType/Code is RHDI, then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C12).";
			owner_lazy = () -> CorporateActionNotificationV03.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/IntermediateSecuritiesDistributionType</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand><rightOperand>IntermediateSecuritiesDistribution</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04
	 * CorporateActionNotificationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/IntermediateSecuritiesDistributionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;IntermediateSecuritiesDistribution&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionGeneralInformation/EventType/Code is RHDI, then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C12)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule#forCorporateActionNotificationV05
	 * ConstraintIntermediateSecuritiesDistribution1Rule.
	 * forCorporateActionNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV04> forCorporateActionNotificationV04 = new MMConstraint<CorporateActionNotificationV04>() {
		{
			validator = ConstraintIntermediateSecuritiesDistribution1Rule::checkCorporateActionNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution1Rule";
			definition = "If CorporateActionGeneralInformation/EventType/Code is RHDI, then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C12).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule.forCorporateActionNotificationV05);
			owner_lazy = () -> CorporateActionNotificationV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/IntermediateSecuritiesDistributionType</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand><rightOperand>IntermediateSecuritiesDistribution</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05
	 * CorporateActionNotificationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/IntermediateSecuritiesDistributionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;IntermediateSecuritiesDistribution&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionGeneralInformation/EventType/Code is RHDI, then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C12)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule#forCorporateActionNotificationV06
	 * ConstraintIntermediateSecuritiesDistribution1Rule.
	 * forCorporateActionNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule#forCorporateActionNotificationV04
	 * ConstraintIntermediateSecuritiesDistribution1Rule.
	 * forCorporateActionNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV05> forCorporateActionNotificationV05 = new MMConstraint<CorporateActionNotificationV05>() {
		{
			validator = ConstraintIntermediateSecuritiesDistribution1Rule::checkCorporateActionNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution1Rule";
			definition = "If CorporateActionGeneralInformation/EventType/Code is RHDI, then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C12).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule.forCorporateActionNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule.forCorporateActionNotificationV04;
			owner_lazy = () -> CorporateActionNotificationV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/IntermediateSecuritiesDistributionType</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand><rightOperand>IntermediateSecuritiesDistribution</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06
	 * CorporateActionNotificationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/IntermediateSecuritiesDistributionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;IntermediateSecuritiesDistribution&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionGeneralInformation/EventType/Code is RHDI (IntermediateSecuritiesDistribution), then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C11)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule#forCorporateActionNotificationV07
	 * ConstraintIntermediateSecuritiesDistribution1Rule.
	 * forCorporateActionNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule#forCorporateActionNotificationV05
	 * ConstraintIntermediateSecuritiesDistribution1Rule.
	 * forCorporateActionNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV06> forCorporateActionNotificationV06 = new MMConstraint<CorporateActionNotificationV06>() {
		{
			validator = ConstraintIntermediateSecuritiesDistribution1Rule::checkCorporateActionNotificationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution1Rule";
			definition = "If CorporateActionGeneralInformation/EventType/Code is RHDI (IntermediateSecuritiesDistribution), then CorporateActionDetails/\r\nIntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionDetails.\r\n(MT 564 NVR C11).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule.forCorporateActionNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule.forCorporateActionNotificationV05;
			owner_lazy = () -> CorporateActionNotificationV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/IntermediateSecuritiesDistributionType</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand><rightOperand>IntermediateSecuritiesDistribution</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If CorporateActionGeneralInformation/EventType/Code is RHDI
	 * (IntermediateSecuritiesDistribution), then CorporateActionDetails/<br>
	 * IntermediateSecuritiesDistributionType must be present in at least one
	 * occurrence of CorporateActionDetails.<br>
	 * (MT 564 NVR C11).
	 */
	public static void checkCorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionGeneralInformation/EventType/Code is RHDI
	 * (IntermediateSecuritiesDistribution), then CorporateActionDetails/<br>
	 * IntermediateSecuritiesDistributionType must be present in at least one
	 * occurrence of CorporateActionDetails.<br>
	 * (MT 564 NVR C11).
	 */
	public static void checkCorporateActionNotificationV07(CorporateActionNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionGeneralInformation/EventType/Code is RHDI
	 * (IntermediateSecuritiesDistribution), then CorporateActionDetails/<br>
	 * IntermediateSecuritiesDistributionType must be present in at least one
	 * occurrence of CorporateActionDetails.<br>
	 * (MT 564 NVR C11).
	 */
	public static void checkCorporateActionNotification002V07(CorporateActionNotification002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionGeneralInformation/EventType/Code is RHDI and if
	 * CorporateActionDetails/IntermediateSecuritiesDistributionType is present,
	 * then CorporateActionOptionDetails/IntermediateSecuritiesDistributionType
	 * must not be present in any occurrence of CorporateActionOptionDetails.
	 * (MT 564 NVR C12).
	 */
	public static void checkCorporateActionNotificationV01(CorporateActionNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionGeneralInformation/EventType/Code is RHDI, then
	 * CorporateActionDetails/<br>
	 * IntermediateSecuritiesDistributionType must be present in at least one
	 * occurrence of CorporateActionDetails.<br>
	 * (MT 564 NVR C12).
	 */
	public static void checkCorporateActionNotificationV02(CorporateActionNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionGeneralInformation/EventType/Code is RHDI, then
	 * CorporateActionDetails/<br>
	 * IntermediateSecuritiesDistributionType must be present in at least one
	 * occurrence of CorporateActionDetails.<br>
	 * (MT 564 NVR C12).
	 */
	public static void checkCorporateActionNotificationV03(CorporateActionNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionGeneralInformation/EventType/Code is RHDI, then
	 * CorporateActionDetails/<br>
	 * IntermediateSecuritiesDistributionType must be present in at least one
	 * occurrence of CorporateActionDetails.<br>
	 * (MT 564 NVR C12).
	 */
	public static void checkCorporateActionNotificationV04(CorporateActionNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionGeneralInformation/EventType/Code is RHDI, then
	 * CorporateActionDetails/<br>
	 * IntermediateSecuritiesDistributionType must be present in at least one
	 * occurrence of CorporateActionDetails.<br>
	 * (MT 564 NVR C12).
	 */
	public static void checkCorporateActionNotificationV05(CorporateActionNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionGeneralInformation/EventType/Code is RHDI
	 * (IntermediateSecuritiesDistribution), then CorporateActionDetails/<br>
	 * IntermediateSecuritiesDistributionType must be present in at least one
	 * occurrence of CorporateActionDetails.<br>
	 * (MT 564 NVR C11).
	 */
	public static void checkCorporateActionNotificationV06(CorporateActionNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}