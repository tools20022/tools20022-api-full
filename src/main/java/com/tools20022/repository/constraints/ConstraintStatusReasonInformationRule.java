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
 * StatusReasonInformation/AdditionalStatusReasonInformation may only be present
 * when GroupStatus is present and is equal to RJCTor PDNG.
 */
public class ConstraintStatusReasonInformationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation1
	 * OriginalGroupInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "StatusReasonInformation/AdditionalStatusReasonInformation may only be present when GroupStatus is present and is equal to RJCTor PDNG."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation1> forOriginalGroupInformation1 = new MMConstraint<OriginalGroupInformation1>() {
		{
			validator = ConstraintStatusReasonInformationRule::checkOriginalGroupInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformationRule";
			definition = "StatusReasonInformation/AdditionalStatusReasonInformation may only be present when GroupStatus is present and is equal to RJCTor PDNG.";
			owner_lazy = () -> OriginalGroupInformation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation20
	 * OriginalGroupInformation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Pending&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupStatus is present and is different from RJCT or PDNG then StatusReasonInformation/AdditionalInformation must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation20> forOriginalGroupInformation20 = new MMConstraint<OriginalGroupInformation20>() {
		{
			validator = ConstraintStatusReasonInformationRule::checkOriginalGroupInformation20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformationRule";
			definition = "If GroupStatus is present and is different from RJCT or PDNG then StatusReasonInformation/AdditionalInformation must be absent.";
			owner_lazy = () -> OriginalGroupInformation20.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Pending</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1
	 * OriginalGroupHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Pending&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupStatus is present and is different from RJCT or PDNG then StatusReasonInformation/AdditionalInformation must be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusReasonInformationRule#forOriginalGroupHeader7
	 * ConstraintStatusReasonInformationRule.forOriginalGroupHeader7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupHeader1> forOriginalGroupHeader1 = new MMConstraint<OriginalGroupHeader1>() {
		{
			validator = ConstraintStatusReasonInformationRule::checkOriginalGroupHeader1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformationRule";
			definition = "If GroupStatus is present and is different from RJCT or PDNG then StatusReasonInformation/AdditionalInformation must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusReasonInformationRule.forOriginalGroupHeader7);
			owner_lazy = () -> OriginalGroupHeader1.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Pending</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25
	 * OriginalGroupInformation25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Pending&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupStatus is present and is different from RJCT or PDNG then StatusReasonInformation/AdditionalInformation must be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusReasonInformationRule#forOriginalGroupInformation28
	 * ConstraintStatusReasonInformationRule.forOriginalGroupInformation28}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation25> forOriginalGroupInformation25 = new MMConstraint<OriginalGroupInformation25>() {
		{
			validator = ConstraintStatusReasonInformationRule::checkOriginalGroupInformation25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformationRule";
			definition = "If GroupStatus is present and is different from RJCT or PDNG then StatusReasonInformation/AdditionalInformation must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusReasonInformationRule.forOriginalGroupInformation28);
			owner_lazy = () -> OriginalGroupInformation25.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Pending</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15
	 * OriginalGroupInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[*]/AdditionalStatusReasonInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule:\nStatusReasonInformation/AdditionalStatusReasonInformation may only be present when GroupStatus is present and is equal to RJCT or PNDG.\n\nImplemented as:\nIf GroupStatus is present and different from RJCT and PNDG, then OriginalGroupInformationAndStatus/StatusReasonInformation/AdditionalStatusReasonInformation is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation15> forOriginalGroupInformation15 = new MMConstraint<OriginalGroupInformation15>() {
		{
			validator = ConstraintStatusReasonInformationRule::checkOriginalGroupInformation15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformationRule";
			definition = "ISO20022 Rule:\nStatusReasonInformation/AdditionalStatusReasonInformation may only be present when GroupStatus is present and is equal to RJCT or PNDG.\n\nImplemented as:\nIf GroupStatus is present and different from RJCT and PNDG, then OriginalGroupInformationAndStatus/StatusReasonInformation/AdditionalStatusReasonInformation is not allowed.";
			owner_lazy = () -> OriginalGroupInformation15.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/StatusReasonInformation[*]/AdditionalStatusReasonInformation[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation19
	 * OriginalGroupInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[*]/AdditionalStatusReasonInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Pending&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule:\nStatusReasonInformation/AdditionalStatusReasonInformation may only be present when GroupStatus is present and is equal to RJCT or PNDG.\n\nImplemented as:\nIf GroupStatus is present and different from RJCT or PNDG, then OriginalGroupInformationAndStatus/StatusReasonInformation/AdditionalStatusReasonInformation is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation19> forOriginalGroupInformation19 = new MMConstraint<OriginalGroupInformation19>() {
		{
			validator = ConstraintStatusReasonInformationRule::checkOriginalGroupInformation19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformationRule";
			definition = "ISO20022 Rule:\nStatusReasonInformation/AdditionalStatusReasonInformation may only be present when GroupStatus is present and is equal to RJCT or PNDG.\n\nImplemented as:\nIf GroupStatus is present and different from RJCT or PNDG, then OriginalGroupInformationAndStatus/StatusReasonInformation/AdditionalStatusReasonInformation is not allowed.";
			owner_lazy = () -> OriginalGroupInformation19.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/StatusReasonInformation[*]/AdditionalStatusReasonInformation[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Pending</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7
	 * OriginalGroupHeader7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Pending&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupStatus is present and is different from RJCT or PDNG then StatusReasonInformation/AdditionalInformation must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusReasonInformationRule#forOriginalGroupHeader1
	 * ConstraintStatusReasonInformationRule.forOriginalGroupHeader1}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupHeader7> forOriginalGroupHeader7 = new MMConstraint<OriginalGroupHeader7>() {
		{
			validator = ConstraintStatusReasonInformationRule::checkOriginalGroupHeader7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformationRule";
			definition = "If GroupStatus is present and is different from RJCT or PDNG then StatusReasonInformation/AdditionalInformation must be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatusReasonInformationRule.forOriginalGroupHeader1;
			owner_lazy = () -> OriginalGroupHeader7.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Pending</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28
	 * OriginalGroupInformation28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Pending&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StatusReasonInformation[*]/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupStatus is present and is different from RJCT or PDNG then StatusReasonInformation/AdditionalInformation must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusReasonInformationRule#forOriginalGroupInformation25
	 * ConstraintStatusReasonInformationRule.forOriginalGroupInformation25}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation28> forOriginalGroupInformation28 = new MMConstraint<OriginalGroupInformation28>() {
		{
			validator = ConstraintStatusReasonInformationRule::checkOriginalGroupInformation28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformationRule";
			definition = "If GroupStatus is present and is different from RJCT or PDNG then StatusReasonInformation/AdditionalInformation must be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatusReasonInformationRule.forOriginalGroupInformation25;
			owner_lazy = () -> OriginalGroupInformation28.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Pending</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatusReasonInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StatusReasonInformation[*]/AdditionalInformation[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * StatusReasonInformation/AdditionalStatusReasonInformation may only be
	 * present when GroupStatus is present and is equal to RJCTor PDNG.
	 */
	public static void checkOriginalGroupInformation1(OriginalGroupInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupStatus is present and is different from RJCT or PDNG then
	 * StatusReasonInformation/AdditionalInformation must be absent.
	 */
	public static void checkOriginalGroupInformation20(OriginalGroupInformation20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupStatus is present and is different from RJCT or PDNG then
	 * StatusReasonInformation/AdditionalInformation must be absent.
	 */
	public static void checkOriginalGroupHeader1(OriginalGroupHeader1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupStatus is present and is different from RJCT or PDNG then
	 * StatusReasonInformation/AdditionalInformation must be absent.
	 */
	public static void checkOriginalGroupInformation25(OriginalGroupInformation25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: StatusReasonInformation/AdditionalStatusReasonInformation
	 * may only be present when GroupStatus is present and is equal to RJCT or
	 * PNDG.
	 * 
	 * Implemented as: If GroupStatus is present and different from RJCT and
	 * PNDG, then OriginalGroupInformationAndStatus/StatusReasonInformation/
	 * AdditionalStatusReasonInformation is not allowed.
	 */
	public static void checkOriginalGroupInformation15(OriginalGroupInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: StatusReasonInformation/AdditionalStatusReasonInformation
	 * may only be present when GroupStatus is present and is equal to RJCT or
	 * PNDG.
	 * 
	 * Implemented as: If GroupStatus is present and different from RJCT or
	 * PNDG, then OriginalGroupInformationAndStatus/StatusReasonInformation/
	 * AdditionalStatusReasonInformation is not allowed.
	 */
	public static void checkOriginalGroupInformation19(OriginalGroupInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupStatus is present and is different from RJCT or PDNG then
	 * StatusReasonInformation/AdditionalInformation must be absent.
	 */
	public static void checkOriginalGroupHeader7(OriginalGroupHeader7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupStatus is present and is different from RJCT or PDNG then
	 * StatusReasonInformation/AdditionalInformation must be absent.
	 */
	public static void checkOriginalGroupInformation28(OriginalGroupInformation28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}