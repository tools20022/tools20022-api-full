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
import com.tools20022.repository.area.camt.*;
import java.util.Arrays;

/**
 * If Status/Confirmation is present and equal to PECR or RJCR then
 * CancellationDetails must be present.
 */
public class ConstraintPartialOrRejectedCancellationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08
	 * ResolutionOfInvestigationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Status/Confirmation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"WithInList\"&gt;&lt;leftOperand&gt;/Status/Confirmation&lt;/leftOperand&gt;&lt;rightOperand&gt;InvestigationExecutionConfirmation4Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialOrRejectedCancellationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Status/Confirmation is present and equal to PECR or RJCR then CancellationDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule#forResolutionOfInvestigationV07
	 * ConstraintPartialOrRejectedCancellationRule.
	 * forResolutionOfInvestigationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<ResolutionOfInvestigationV08> forResolutionOfInvestigationV08 = new MMConstraint<ResolutionOfInvestigationV08>() {
		{
			validator = ConstraintPartialOrRejectedCancellationRule::checkResolutionOfInvestigationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialOrRejectedCancellationRule";
			definition = "If Status/Confirmation is present and equal to PECR or RJCR then CancellationDetails must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule.forResolutionOfInvestigationV07;
			owner_lazy = () -> ResolutionOfInvestigationV08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Status/Confirmation</leftOperand></BooleanRule><BooleanRule xsi:type=\"WithInList\"><leftOperand>/Status/Confirmation</leftOperand><rightOperand>InvestigationExecutionConfirmation4Code</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07
	 * ResolutionOfInvestigationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Status/Confirmation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"WithInList\"&gt;&lt;leftOperand&gt;/Status/Confirmation&lt;/leftOperand&gt;&lt;rightOperand&gt;InvestigationExecutionConfirmation4Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialOrRejectedCancellationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Status/Confirmation is present and equal to PECR or RJCR then CancellationDetails must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule#forResolutionOfInvestigationV08
	 * ConstraintPartialOrRejectedCancellationRule.
	 * forResolutionOfInvestigationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule#forResolutionOfInvestigationV06
	 * ConstraintPartialOrRejectedCancellationRule.
	 * forResolutionOfInvestigationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<ResolutionOfInvestigationV07> forResolutionOfInvestigationV07 = new MMConstraint<ResolutionOfInvestigationV07>() {
		{
			validator = ConstraintPartialOrRejectedCancellationRule::checkResolutionOfInvestigationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialOrRejectedCancellationRule";
			definition = "If Status/Confirmation is present and equal to PECR or RJCR then CancellationDetails must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule.forResolutionOfInvestigationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule.forResolutionOfInvestigationV06;
			owner_lazy = () -> ResolutionOfInvestigationV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Status/Confirmation</leftOperand></BooleanRule><BooleanRule xsi:type=\"WithInList\"><leftOperand>/Status/Confirmation</leftOperand><rightOperand>InvestigationExecutionConfirmation4Code</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03
	 * ResolutionOfInvestigationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Status/Confirmation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"WithInList\"&gt;&lt;leftOperand&gt;/Status/Confirmation&lt;/leftOperand&gt;&lt;rightOperand&gt;InvestigationExecutionConfirmation4Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialOrRejectedCancellationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Status/Confirmation is present and equal to PECR or RJCR then CancellationDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ResolutionOfInvestigationV03> forResolutionOfInvestigationV03 = new MMConstraint<ResolutionOfInvestigationV03>() {
		{
			validator = ConstraintPartialOrRejectedCancellationRule::checkResolutionOfInvestigationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialOrRejectedCancellationRule";
			definition = "If Status/Confirmation is present and equal to PECR or RJCR then CancellationDetails must be present.";
			owner_lazy = () -> ResolutionOfInvestigationV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Status/Confirmation</leftOperand></BooleanRule><BooleanRule xsi:type=\"WithInList\"><leftOperand>/Status/Confirmation</leftOperand><rightOperand>InvestigationExecutionConfirmation4Code</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV04
	 * ResolutionOfInvestigationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Status/Confirmation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"WithInList\"&gt;&lt;leftOperand&gt;/Status/Confirmation&lt;/leftOperand&gt;&lt;rightOperand&gt;InvestigationExecutionConfirmation4Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialOrRejectedCancellationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Status/Confirmation is present and equal to PECR or RJCR then CancellationDetails must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule#forResolutionOfInvestigationV05
	 * ConstraintPartialOrRejectedCancellationRule.
	 * forResolutionOfInvestigationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ResolutionOfInvestigationV04> forResolutionOfInvestigationV04 = new MMConstraint<ResolutionOfInvestigationV04>() {
		{
			validator = ConstraintPartialOrRejectedCancellationRule::checkResolutionOfInvestigationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialOrRejectedCancellationRule";
			definition = "If Status/Confirmation is present and equal to PECR or RJCR then CancellationDetails must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule.forResolutionOfInvestigationV05);
			owner_lazy = () -> ResolutionOfInvestigationV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Status/Confirmation</leftOperand></BooleanRule><BooleanRule xsi:type=\"WithInList\"><leftOperand>/Status/Confirmation</leftOperand><rightOperand>InvestigationExecutionConfirmation4Code</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV05
	 * ResolutionOfInvestigationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Status/Confirmation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"WithInList\"&gt;&lt;leftOperand&gt;/Status/Confirmation&lt;/leftOperand&gt;&lt;rightOperand&gt;InvestigationExecutionConfirmation4Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialOrRejectedCancellationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Status/Confirmation is present and equal to PECR or RJCR then CancellationDetails must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule#forResolutionOfInvestigationV06
	 * ConstraintPartialOrRejectedCancellationRule.
	 * forResolutionOfInvestigationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule#forResolutionOfInvestigationV04
	 * ConstraintPartialOrRejectedCancellationRule.
	 * forResolutionOfInvestigationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<ResolutionOfInvestigationV05> forResolutionOfInvestigationV05 = new MMConstraint<ResolutionOfInvestigationV05>() {
		{
			validator = ConstraintPartialOrRejectedCancellationRule::checkResolutionOfInvestigationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialOrRejectedCancellationRule";
			definition = "If Status/Confirmation is present and equal to PECR or RJCR then CancellationDetails must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule.forResolutionOfInvestigationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule.forResolutionOfInvestigationV04;
			owner_lazy = () -> ResolutionOfInvestigationV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Status/Confirmation</leftOperand></BooleanRule><BooleanRule xsi:type=\"WithInList\"><leftOperand>/Status/Confirmation</leftOperand><rightOperand>InvestigationExecutionConfirmation4Code</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV06
	 * ResolutionOfInvestigationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Status/Confirmation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"WithInList\"&gt;&lt;leftOperand&gt;/Status/Confirmation&lt;/leftOperand&gt;&lt;rightOperand&gt;InvestigationExecutionConfirmation4Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialOrRejectedCancellationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Status/Confirmation is present and equal to PECR or RJCR then CancellationDetails must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule#forResolutionOfInvestigationV07
	 * ConstraintPartialOrRejectedCancellationRule.
	 * forResolutionOfInvestigationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule#forResolutionOfInvestigationV05
	 * ConstraintPartialOrRejectedCancellationRule.
	 * forResolutionOfInvestigationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<ResolutionOfInvestigationV06> forResolutionOfInvestigationV06 = new MMConstraint<ResolutionOfInvestigationV06>() {
		{
			validator = ConstraintPartialOrRejectedCancellationRule::checkResolutionOfInvestigationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialOrRejectedCancellationRule";
			definition = "If Status/Confirmation is present and equal to PECR or RJCR then CancellationDetails must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule.forResolutionOfInvestigationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule.forResolutionOfInvestigationV05;
			owner_lazy = () -> ResolutionOfInvestigationV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Status/Confirmation</leftOperand></BooleanRule><BooleanRule xsi:type=\"WithInList\"><leftOperand>/Status/Confirmation</leftOperand><rightOperand>InvestigationExecutionConfirmation4Code</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If Status/Confirmation is present and equal to PECR or RJCR then
	 * CancellationDetails must be present.
	 */
	public static void checkResolutionOfInvestigationV08(ResolutionOfInvestigationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Status/Confirmation is present and equal to PECR or RJCR then
	 * CancellationDetails must be present.
	 */
	public static void checkResolutionOfInvestigationV07(ResolutionOfInvestigationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Status/Confirmation is present and equal to PECR or RJCR then
	 * CancellationDetails must be present.
	 */
	public static void checkResolutionOfInvestigationV03(ResolutionOfInvestigationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Status/Confirmation is present and equal to PECR or RJCR then
	 * CancellationDetails must be present.
	 */
	public static void checkResolutionOfInvestigationV04(ResolutionOfInvestigationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Status/Confirmation is present and equal to PECR or RJCR then
	 * CancellationDetails must be present.
	 */
	public static void checkResolutionOfInvestigationV05(ResolutionOfInvestigationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Status/Confirmation is present and equal to PECR or RJCR then
	 * CancellationDetails must be present.
	 */
	public static void checkResolutionOfInvestigationV06(ResolutionOfInvestigationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}