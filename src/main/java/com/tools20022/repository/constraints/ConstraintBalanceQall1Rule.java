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
import com.tools20022.repository.msg.SafekeepingAccount3;
import com.tools20022.repository.msg.SafekeepingAccount4;
import com.tools20022.repository.msg.SafekeepingAccount6;
import java.util.Arrays;

/**
 * If SubAccountDetails/SubAccountIdentification is present, then
 * InstructedBalance/Balance/Code "QALL" is not allowed in any occurrence of
 * InstructedBalance.
 */
public class ConstraintBalanceQall1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount3
	 * SafekeepingAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceQall1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SubAccountDetails/SubAccountIdentification is present, then InstructedBalance/Balance/Code \"QALL\" is not allowed in any occurrence of InstructedBalance."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SafekeepingAccount3> forSafekeepingAccount3 = new MMConstraint<SafekeepingAccount3>() {
		{
			validator = ConstraintBalanceQall1Rule::checkSafekeepingAccount3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceQall1Rule";
			definition = "If SubAccountDetails/SubAccountIdentification is present, then InstructedBalance/Balance/Code \"QALL\" is not allowed in any occurrence of InstructedBalance.";
			owner_lazy = () -> SafekeepingAccount3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4
	 * SafekeepingAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructedBalance[*]/Balance/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails/Identification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceQall1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SubAccountDetails/Identification is present, then InstructedBalance/Balance/Code \"QALL\" is not allowed in any occurrence of InstructedBalance."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceQall1Rule#forSafekeepingAccount6
	 * ConstraintBalanceQall1Rule.forSafekeepingAccount6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SafekeepingAccount4> forSafekeepingAccount4 = new MMConstraint<SafekeepingAccount4>() {
		{
			validator = ConstraintBalanceQall1Rule::checkSafekeepingAccount4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceQall1Rule";
			definition = "If SubAccountDetails/Identification is present, then InstructedBalance/Balance/Code \"QALL\" is not allowed in any occurrence of InstructedBalance.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceQall1Rule.forSafekeepingAccount6);
			owner_lazy = () -> SafekeepingAccount4.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructedBalance[*]/Balance/Code</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails/Identification</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6
	 * SafekeepingAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructedBalance[*]/Balance/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubAccountDetails/Identification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceQall1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SubAccountDetails/Identification is present, then InstructedBalance/Balance/Code \"QALL\" is not allowed in any occurrence of InstructedBalance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceQall1Rule#forSafekeepingAccount4
	 * ConstraintBalanceQall1Rule.forSafekeepingAccount4}</li>
	 * </ul>
	 */
	public static final MMConstraint<SafekeepingAccount6> forSafekeepingAccount6 = new MMConstraint<SafekeepingAccount6>() {
		{
			validator = ConstraintBalanceQall1Rule::checkSafekeepingAccount6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceQall1Rule";
			definition = "If SubAccountDetails/Identification is present, then InstructedBalance/Balance/Code \"QALL\" is not allowed in any occurrence of InstructedBalance.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBalanceQall1Rule.forSafekeepingAccount4;
			owner_lazy = () -> SafekeepingAccount6.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructedBalance[*]/Balance/Code</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubAccountDetails/Identification</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If SubAccountDetails/SubAccountIdentification is present, then
	 * InstructedBalance/Balance/Code "QALL" is not allowed in any occurrence of
	 * InstructedBalance.
	 */
	public static void checkSafekeepingAccount3(SafekeepingAccount3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SubAccountDetails/Identification is present, then
	 * InstructedBalance/Balance/Code "QALL" is not allowed in any occurrence of
	 * InstructedBalance.
	 */
	public static void checkSafekeepingAccount4(SafekeepingAccount4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SubAccountDetails/Identification is present, then
	 * InstructedBalance/Balance/Code "QALL" is not allowed in any occurrence of
	 * InstructedBalance.
	 */
	public static void checkSafekeepingAccount6(SafekeepingAccount6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}