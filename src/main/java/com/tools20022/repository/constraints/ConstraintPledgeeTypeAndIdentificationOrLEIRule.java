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
import com.tools20022.repository.msg.Pledgee1;
import com.tools20022.repository.msg.Pledgee2;
import java.util.Arrays;

/**
 * PledgeeTypeAndIdentification must be present or LEI must be present.
 */
public class ConstraintPledgeeTypeAndIdentificationOrLEIRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Pledgee1 Pledgee1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PledgeeTypeAndIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/LEI&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgeeTypeAndIdentificationOrLEIRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PledgeeTypeAndIdentification must be present or LEI must be present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPledgeeTypeAndIdentificationOrLEIRule#forPledgee2
	 * ConstraintPledgeeTypeAndIdentificationOrLEIRule.forPledgee2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Pledgee1> forPledgee1 = new MMConstraint<Pledgee1>() {
		{
			validator = ConstraintPledgeeTypeAndIdentificationOrLEIRule::checkPledgee1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgeeTypeAndIdentificationOrLEIRule";
			definition = "PledgeeTypeAndIdentification must be present or LEI must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPledgeeTypeAndIdentificationOrLEIRule.forPledgee2);
			owner_lazy = () -> Pledgee1.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PledgeeTypeAndIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/LEI</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Pledgee2 Pledgee2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PledgeeTypeAndIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/LEI&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgeeTypeAndIdentificationOrLEIRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PledgeeTypeAndIdentification must be present or LEI must be present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPledgeeTypeAndIdentificationOrLEIRule#forPledgee1
	 * ConstraintPledgeeTypeAndIdentificationOrLEIRule.forPledgee1}</li>
	 * </ul>
	 */
	public static final MMConstraint<Pledgee2> forPledgee2 = new MMConstraint<Pledgee2>() {
		{
			validator = ConstraintPledgeeTypeAndIdentificationOrLEIRule::checkPledgee2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgeeTypeAndIdentificationOrLEIRule";
			definition = "PledgeeTypeAndIdentification must be present or LEI must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPledgeeTypeAndIdentificationOrLEIRule.forPledgee1;
			owner_lazy = () -> Pledgee2.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PledgeeTypeAndIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/LEI</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};

	/**
	 * PledgeeTypeAndIdentification must be present or LEI must be present.
	 */
	public static void checkPledgee1(Pledgee1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PledgeeTypeAndIdentification must be present or LEI must be present.
	 */
	public static void checkPledgee2(Pledgee2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}