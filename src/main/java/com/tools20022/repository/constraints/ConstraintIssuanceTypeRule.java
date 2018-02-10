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
import com.tools20022.repository.msg.UndertakingAdvice1;

/**
 * Issuance type must be for either 'UndertakingIssuedViaAdvisingParty' (ISAD)
 * or 'UndertakingIsuuedViaConfirmingParty' (ISCO).
 */
public class ConstraintIssuanceTypeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1
	 * UndertakingAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/UndertakingIssuanceMessage/UndertakingDetails/IssuanceType&lt;/leftOperand&gt;&lt;rightOperand&gt;UndertakingViaAdvisingParty&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/UndertakingIssuanceMessage/UndertakingDetails/IssuanceType&lt;/leftOperand&gt;&lt;rightOperand&gt;UndertakingIssuedViaConfirmingParty&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuance type must be for either 'UndertakingIssuedViaAdvisingParty' (ISAD) or 'UndertakingIsuuedViaConfirmingParty' (ISCO)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UndertakingAdvice1> forUndertakingAdvice1 = new MMConstraint<UndertakingAdvice1>() {
		{
			validator = ConstraintIssuanceTypeRule::checkUndertakingAdvice1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceTypeRule";
			definition = "Issuance type must be for either 'UndertakingIssuedViaAdvisingParty' (ISAD) or 'UndertakingIsuuedViaConfirmingParty' (ISCO).";
			owner_lazy = () -> UndertakingAdvice1.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/UndertakingIssuanceMessage/UndertakingDetails/IssuanceType</leftOperand><rightOperand>UndertakingViaAdvisingParty</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/UndertakingIssuanceMessage/UndertakingDetails/IssuanceType</leftOperand><rightOperand>UndertakingIssuedViaConfirmingParty</rightOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};

	/**
	 * Issuance type must be for either 'UndertakingIssuedViaAdvisingParty'
	 * (ISAD) or 'UndertakingIsuuedViaConfirmingParty' (ISCO).
	 */
	public static void checkUndertakingAdvice1(UndertakingAdvice1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}