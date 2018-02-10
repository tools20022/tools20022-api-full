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
import com.tools20022.repository.area.acmt.*;
import java.util.Arrays;

/**
 * If SavingsInvestmentPlan is present, then SavingsInvestmentPlan/Quantity/Unit
 * is not allowed.
 */
public class ConstraintUnit1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06
	 * AccountDetailsConfirmationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SavingsInvestmentPlan[*]/Quantity/Unit&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SavingsInvestmentPlan[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SavingsInvestmentPlan is present, then SavingsInvestmentPlan/Quantity/Unit is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUnitRule#forAccountDetailsConfirmationV07
	 * ConstraintUnitRule.forAccountDetailsConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUnit1Rule#forAccountDetailsConfirmationV05
	 * ConstraintUnit1Rule.forAccountDetailsConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV06> forAccountDetailsConfirmationV06 = new MMConstraint<AccountDetailsConfirmationV06>() {
		{
			validator = ConstraintUnit1Rule::checkAccountDetailsConfirmationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit1Rule";
			definition = "If SavingsInvestmentPlan is present, then SavingsInvestmentPlan/Quantity/Unit is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUnitRule.forAccountDetailsConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUnit1Rule.forAccountDetailsConfirmationV05;
			owner_lazy = () -> AccountDetailsConfirmationV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SavingsInvestmentPlan[*]/Quantity/Unit</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SavingsInvestmentPlan[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06
	 * AccountModificationInstructionV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ModifiedSavingsInvestmentPlan[*]/InvestmentPlan/Quantity/Unit&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ModifiedSavingsInvestmentPlan[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ModifiedSavingsInvestmentPlan is present, then ModifiedSavingsInvestmentPlan/InvestmentPlan/Quantity/Unit is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUnitRule#forAccountModificationInstructionV07
	 * ConstraintUnitRule.forAccountModificationInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUnit1Rule#forAccountModificationInstructionV05
	 * ConstraintUnit1Rule.forAccountModificationInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountModificationInstructionV06> forAccountModificationInstructionV06 = new MMConstraint<AccountModificationInstructionV06>() {
		{
			validator = ConstraintUnit1Rule::checkAccountModificationInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit1Rule";
			definition = "If ModifiedSavingsInvestmentPlan is present, then ModifiedSavingsInvestmentPlan/InvestmentPlan/Quantity/Unit is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUnitRule.forAccountModificationInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUnit1Rule.forAccountModificationInstructionV05;
			owner_lazy = () -> AccountModificationInstructionV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ModifiedSavingsInvestmentPlan[*]/InvestmentPlan/Quantity/Unit</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ModifiedSavingsInvestmentPlan[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04
	 * AccountDetailsConfirmationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SavingsInvestmentPlan[*]/Quantity/Unit&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SavingsInvestmentPlan[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SavingsInvestmentPlan is present, then SavingsInvestmentPlan/Quantity/Unit is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUnit1Rule#forAccountDetailsConfirmationV05
	 * ConstraintUnit1Rule.forAccountDetailsConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUnitRule#forAccountDetailsConfirmationV03
	 * ConstraintUnitRule.forAccountDetailsConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV04> forAccountDetailsConfirmationV04 = new MMConstraint<AccountDetailsConfirmationV04>() {
		{
			validator = ConstraintUnit1Rule::checkAccountDetailsConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit1Rule";
			definition = "If SavingsInvestmentPlan is present, then SavingsInvestmentPlan/Quantity/Unit is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUnit1Rule.forAccountDetailsConfirmationV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUnitRule.forAccountDetailsConfirmationV03;
			owner_lazy = () -> AccountDetailsConfirmationV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SavingsInvestmentPlan[*]/Quantity/Unit</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SavingsInvestmentPlan[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04
	 * AccountModificationInstructionV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ModifiedSavingsInvestmentPlan[*]/InvestmentPlan/Quantity/Unit&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ModifiedSavingsInvestmentPlan[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ModifiedSavingsInvestmentPlan is present, then ModifiedSavingsInvestmentPlan/InvestmentPlan/Quantity/Unit is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUnit1Rule#forAccountModificationInstructionV05
	 * ConstraintUnit1Rule.forAccountModificationInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountModificationInstructionV04> forAccountModificationInstructionV04 = new MMConstraint<AccountModificationInstructionV04>() {
		{
			validator = ConstraintUnit1Rule::checkAccountModificationInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit1Rule";
			definition = "If ModifiedSavingsInvestmentPlan is present, then ModifiedSavingsInvestmentPlan/InvestmentPlan/Quantity/Unit is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUnit1Rule.forAccountModificationInstructionV05);
			owner_lazy = () -> AccountModificationInstructionV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ModifiedSavingsInvestmentPlan[*]/InvestmentPlan/Quantity/Unit</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ModifiedSavingsInvestmentPlan[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04
	 * AccountOpeningInstructionV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SavingsInvestmentPlan[*]/Quantity/Unit&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SavingsInvestmentPlan[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SavingsInvestmentPlan is present, then SavingsInvestmentPlan/Quantity/Unit is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUnitRule#forAccountOpeningInstructionV05
	 * ConstraintUnitRule.forAccountOpeningInstructionV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUnitRule#forAccountOpeningInstructionV03
	 * ConstraintUnitRule.forAccountOpeningInstructionV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV04> forAccountOpeningInstructionV04 = new MMConstraint<AccountOpeningInstructionV04>() {
		{
			validator = ConstraintUnit1Rule::checkAccountOpeningInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit1Rule";
			definition = "If SavingsInvestmentPlan is present, then SavingsInvestmentPlan/Quantity/Unit is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUnitRule.forAccountOpeningInstructionV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUnitRule.forAccountOpeningInstructionV03;
			owner_lazy = () -> AccountOpeningInstructionV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SavingsInvestmentPlan[*]/Quantity/Unit</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SavingsInvestmentPlan[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05
	 * AccountModificationInstructionV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ModifiedSavingsInvestmentPlan[*]/InvestmentPlan/Quantity/Unit&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ModifiedSavingsInvestmentPlan[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ModifiedSavingsInvestmentPlan is present, then ModifiedSavingsInvestmentPlan/InvestmentPlan/Quantity/Unit is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUnit1Rule#forAccountModificationInstructionV06
	 * ConstraintUnit1Rule.forAccountModificationInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUnit1Rule#forAccountModificationInstructionV04
	 * ConstraintUnit1Rule.forAccountModificationInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountModificationInstructionV05> forAccountModificationInstructionV05 = new MMConstraint<AccountModificationInstructionV05>() {
		{
			validator = ConstraintUnit1Rule::checkAccountModificationInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit1Rule";
			definition = "If ModifiedSavingsInvestmentPlan is present, then ModifiedSavingsInvestmentPlan/InvestmentPlan/Quantity/Unit is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUnit1Rule.forAccountModificationInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUnit1Rule.forAccountModificationInstructionV04;
			owner_lazy = () -> AccountModificationInstructionV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ModifiedSavingsInvestmentPlan[*]/InvestmentPlan/Quantity/Unit</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ModifiedSavingsInvestmentPlan[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05
	 * AccountDetailsConfirmationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SavingsInvestmentPlan[*]/Quantity/Unit&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SavingsInvestmentPlan[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SavingsInvestmentPlan is present, then SavingsInvestmentPlan/Quantity/Unit is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUnit1Rule#forAccountDetailsConfirmationV06
	 * ConstraintUnit1Rule.forAccountDetailsConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUnit1Rule#forAccountDetailsConfirmationV04
	 * ConstraintUnit1Rule.forAccountDetailsConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV05> forAccountDetailsConfirmationV05 = new MMConstraint<AccountDetailsConfirmationV05>() {
		{
			validator = ConstraintUnit1Rule::checkAccountDetailsConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit1Rule";
			definition = "If SavingsInvestmentPlan is present, then SavingsInvestmentPlan/Quantity/Unit is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUnit1Rule.forAccountDetailsConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUnit1Rule.forAccountDetailsConfirmationV04;
			owner_lazy = () -> AccountDetailsConfirmationV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SavingsInvestmentPlan[*]/Quantity/Unit</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SavingsInvestmentPlan[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If SavingsInvestmentPlan is present, then
	 * SavingsInvestmentPlan/Quantity/Unit is not allowed.
	 */
	public static void checkAccountDetailsConfirmationV06(AccountDetailsConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ModifiedSavingsInvestmentPlan is present, then
	 * ModifiedSavingsInvestmentPlan/InvestmentPlan/Quantity/Unit is not
	 * allowed.
	 */
	public static void checkAccountModificationInstructionV06(AccountModificationInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SavingsInvestmentPlan is present, then
	 * SavingsInvestmentPlan/Quantity/Unit is not allowed.
	 */
	public static void checkAccountDetailsConfirmationV04(AccountDetailsConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ModifiedSavingsInvestmentPlan is present, then
	 * ModifiedSavingsInvestmentPlan/InvestmentPlan/Quantity/Unit is not
	 * allowed.
	 */
	public static void checkAccountModificationInstructionV04(AccountModificationInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SavingsInvestmentPlan is present, then
	 * SavingsInvestmentPlan/Quantity/Unit is not allowed.
	 */
	public static void checkAccountOpeningInstructionV04(AccountOpeningInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ModifiedSavingsInvestmentPlan is present, then
	 * ModifiedSavingsInvestmentPlan/InvestmentPlan/Quantity/Unit is not
	 * allowed.
	 */
	public static void checkAccountModificationInstructionV05(AccountModificationInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SavingsInvestmentPlan is present, then
	 * SavingsInvestmentPlan/Quantity/Unit is not allowed.
	 */
	public static void checkAccountDetailsConfirmationV05(AccountDetailsConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}