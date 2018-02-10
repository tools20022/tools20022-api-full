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
import com.tools20022.repository.msg.CollateralResponse1;
import com.tools20022.repository.msg.CollateralResponse2;
import java.util.Arrays;

/**
 * CashCollateralResponse or SecuritiesCollateralResponse or
 * OtherCollateralResponse must be present at least once.
 */
public class ConstraintCollateralResponsePresenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse1
	 * CollateralResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CashCollateralResponse[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecuritiesCollateralResponse[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OtherCollateralResponse[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralResponsePresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CashCollateralResponse or SecuritiesCollateralResponse or OtherCollateralResponse must be present at least once."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCollateralResponsePresenceRule#forCollateralResponse2
	 * ConstraintCollateralResponsePresenceRule.forCollateralResponse2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CollateralResponse1> forCollateralResponse1 = new MMConstraint<CollateralResponse1>() {
		{
			validator = ConstraintCollateralResponsePresenceRule::checkCollateralResponse1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralResponsePresenceRule";
			definition = "CashCollateralResponse or SecuritiesCollateralResponse or OtherCollateralResponse must be present at least once.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCollateralResponsePresenceRule.forCollateralResponse2);
			owner_lazy = () -> CollateralResponse1.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CashCollateralResponse[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecuritiesCollateralResponse[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OtherCollateralResponse[*]</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse2
	 * CollateralResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CashCollateralResponse[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SecuritiesCollateralResponse[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OtherCollateralResponse[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralResponsePresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CashCollateralResponse or SecuritiesCollateralResponse or OtherCollateralResponse must be present at least once."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCollateralResponsePresenceRule#forCollateralResponse1
	 * ConstraintCollateralResponsePresenceRule.forCollateralResponse1}</li>
	 * </ul>
	 */
	public static final MMConstraint<CollateralResponse2> forCollateralResponse2 = new MMConstraint<CollateralResponse2>() {
		{
			validator = ConstraintCollateralResponsePresenceRule::checkCollateralResponse2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralResponsePresenceRule";
			definition = "CashCollateralResponse or SecuritiesCollateralResponse or OtherCollateralResponse must be present at least once.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCollateralResponsePresenceRule.forCollateralResponse1;
			owner_lazy = () -> CollateralResponse2.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CashCollateralResponse[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/SecuritiesCollateralResponse[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OtherCollateralResponse[*]</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};

	/**
	 * CashCollateralResponse or SecuritiesCollateralResponse or
	 * OtherCollateralResponse must be present at least once.
	 */
	public static void checkCollateralResponse1(CollateralResponse1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CashCollateralResponse or SecuritiesCollateralResponse or
	 * OtherCollateralResponse must be present at least once.
	 */
	public static void checkCollateralResponse2(CollateralResponse2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}