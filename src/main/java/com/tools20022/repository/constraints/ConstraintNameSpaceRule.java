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
import com.tools20022.repository.msg.EncapsulatedBusinessMessage1;

/**
 * The name space of the Msg MUST be one of the registered ISO 20022 messages.
 */
public class ConstraintNameSpaceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1
	 * EncapsulatedBusinessMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} = " "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMConstraint#getExpressionLanguage
	 * expressionLanguage} = " "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameSpaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The name space of the Msg MUST be one of the registered ISO 20022 messages."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EncapsulatedBusinessMessage1> forEncapsulatedBusinessMessage1 = new MMConstraint<EncapsulatedBusinessMessage1>() {
		{
			validator = ConstraintNameSpaceRule::checkEncapsulatedBusinessMessage1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameSpaceRule";
			definition = "The name space of the Msg MUST be one of the registered ISO 20022 messages.";
			owner_lazy = () -> EncapsulatedBusinessMessage1.mmObject();
			expression = " ";
			expressionLanguage = " ";
		}
	};

	/**
	 * The name space of the Msg MUST be one of the registered ISO 20022
	 * messages.
	 */
	public static void checkEncapsulatedBusinessMessage1(EncapsulatedBusinessMessage1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}