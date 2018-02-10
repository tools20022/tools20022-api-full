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
import com.tools20022.repository.msg.SafeKeepingPlace1;
import com.tools20022.repository.msg.SafeKeepingPlace2;
import java.util.Arrays;

/**
 * SafekeepingPlaceFormat must be present or LEI must be present.
 */
public class ConstraintSafekeepingPlaceFormatOrLEIRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SafeKeepingPlace1
	 * SafeKeepingPlace1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SafekeepingPlaceFormat&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/LEI&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceFormatOrLEIRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SafekeepingPlaceFormat must be present or LEI must be present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceFormatOrLEIRule#forSafeKeepingPlace2
	 * ConstraintSafekeepingPlaceFormatOrLEIRule.forSafeKeepingPlace2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SafeKeepingPlace1> forSafeKeepingPlace1 = new MMConstraint<SafeKeepingPlace1>() {
		{
			validator = ConstraintSafekeepingPlaceFormatOrLEIRule::checkSafeKeepingPlace1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceFormatOrLEIRule";
			definition = "SafekeepingPlaceFormat must be present or LEI must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceFormatOrLEIRule.forSafeKeepingPlace2);
			owner_lazy = () -> SafeKeepingPlace1.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SafekeepingPlaceFormat</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/LEI</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SafeKeepingPlace2
	 * SafeKeepingPlace2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SafekeepingPlaceFormat&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/LEI&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceFormatOrLEIRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SafekeepingPlaceFormat must be present or LEI must be present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceFormatOrLEIRule#forSafeKeepingPlace1
	 * ConstraintSafekeepingPlaceFormatOrLEIRule.forSafeKeepingPlace1}</li>
	 * </ul>
	 */
	public static final MMConstraint<SafeKeepingPlace2> forSafeKeepingPlace2 = new MMConstraint<SafeKeepingPlace2>() {
		{
			validator = ConstraintSafekeepingPlaceFormatOrLEIRule::checkSafeKeepingPlace2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceFormatOrLEIRule";
			definition = "SafekeepingPlaceFormat must be present or LEI must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceFormatOrLEIRule.forSafeKeepingPlace1;
			owner_lazy = () -> SafeKeepingPlace2.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SafekeepingPlaceFormat</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/LEI</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};

	/**
	 * SafekeepingPlaceFormat must be present or LEI must be present.
	 */
	public static void checkSafeKeepingPlace1(SafeKeepingPlace1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingPlaceFormat must be present or LEI must be present.
	 */
	public static void checkSafeKeepingPlace2(SafeKeepingPlace2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}