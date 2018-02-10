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
import com.tools20022.repository.msg.BlockedHoldingDetails1;
import com.tools20022.repository.msg.BlockedHoldingDetails2;
import java.util.Arrays;

/**
 * If BlockHolding is “CERT” then HoldingCertificateNumber is mandatory.
 */
public class ConstraintHoldingCertificateNumberRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails1
	 * BlockedHoldingDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldingCertificateNumber&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/BlockedHolding&lt;/leftOperand&gt;&lt;rightOperand&gt;Certificate&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingCertificateNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BlockHolding is “CERT” then HoldingCertificateNumber is mandatory."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingCertificateNumberRule#forBlockedHoldingDetails2
	 * ConstraintHoldingCertificateNumberRule.forBlockedHoldingDetails2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BlockedHoldingDetails1> forBlockedHoldingDetails1 = new MMConstraint<BlockedHoldingDetails1>() {
		{
			validator = ConstraintHoldingCertificateNumberRule::checkBlockedHoldingDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingCertificateNumberRule";
			definition = "If BlockHolding is “CERT” then HoldingCertificateNumber is mandatory.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintHoldingCertificateNumberRule.forBlockedHoldingDetails2);
			owner_lazy = () -> BlockedHoldingDetails1.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldingCertificateNumber</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/BlockedHolding</leftOperand><rightOperand>Certificate</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2
	 * BlockedHoldingDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldingCertificateNumber&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/BlockedHolding&lt;/leftOperand&gt;&lt;rightOperand&gt;Certificate&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingCertificateNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BlockHolding is CERT (Certificate) then HoldingCertificateNumber is mandatory."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingCertificateNumberRule#forBlockedHoldingDetails1
	 * ConstraintHoldingCertificateNumberRule.forBlockedHoldingDetails1}</li>
	 * </ul>
	 */
	public static final MMConstraint<BlockedHoldingDetails2> forBlockedHoldingDetails2 = new MMConstraint<BlockedHoldingDetails2>() {
		{
			validator = ConstraintHoldingCertificateNumberRule::checkBlockedHoldingDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingCertificateNumberRule";
			definition = "If BlockHolding is CERT (Certificate) then HoldingCertificateNumber is mandatory.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintHoldingCertificateNumberRule.forBlockedHoldingDetails1;
			owner_lazy = () -> BlockedHoldingDetails2.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldingCertificateNumber</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/BlockedHolding</leftOperand><rightOperand>Certificate</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If BlockHolding is “CERT” then HoldingCertificateNumber is mandatory.
	 */
	public static void checkBlockedHoldingDetails1(BlockedHoldingDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BlockHolding is CERT (Certificate) then HoldingCertificateNumber is
	 * mandatory.
	 */
	public static void checkBlockedHoldingDetails2(BlockedHoldingDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}