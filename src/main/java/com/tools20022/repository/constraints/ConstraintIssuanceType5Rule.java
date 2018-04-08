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
import com.tools20022.repository.area.tsrv.UndertakingIssuanceV01;
import com.tools20022.repository.msg.UndertakingAdvice2;

/**
 * If IssuanceType is "ISAD" then LocalUndertakingDetails must not be present.
 */
public class ConstraintIssuanceType5Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceV01
	 * UndertakingIssuanceV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/UndertakingIssuanceDetails/RequestedLocalUndertaking&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/UndertakingIssuanceDetails/IssuanceType&lt;/leftOperand&gt;&lt;rightOperand&gt;ISAD&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceType5Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IssuanceType is \"ISAD\" then LocalUndertakingDetails must not be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UndertakingIssuanceV01> for_tsrv_UndertakingIssuanceV01 = new MMConstraint<UndertakingIssuanceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceType5Rule";
			definition = "If IssuanceType is \"ISAD\" then LocalUndertakingDetails must not be present.";
			owner_lazy = () -> UndertakingIssuanceV01.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/UndertakingIssuanceDetails/RequestedLocalUndertaking</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/UndertakingIssuanceDetails/IssuanceType</leftOperand><rightOperand>ISAD</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(UndertakingIssuanceV01 obj) throws Exception {
			check_tsrv_UndertakingIssuanceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2
	 * UndertakingAdvice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/UndertakingIssuanceMessage/UndertakingDetails/RequestedLocalUndertaking&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/UndertakingIssuanceMessage/UndertakingDetails/IssuanceType&lt;/leftOperand&gt;&lt;rightOperand&gt;ISAD&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceType5Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IssuanceType is \"ISAD\" then LocalUndertakingDetails must not be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UndertakingAdvice2> forUndertakingAdvice2 = new MMConstraint<UndertakingAdvice2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceType5Rule";
			definition = "If IssuanceType is \"ISAD\" then LocalUndertakingDetails must not be present.";
			owner_lazy = () -> UndertakingAdvice2.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/UndertakingIssuanceMessage/UndertakingDetails/RequestedLocalUndertaking</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/UndertakingIssuanceMessage/UndertakingDetails/IssuanceType</leftOperand><rightOperand>ISAD</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(UndertakingAdvice2 obj) throws Exception {
			checkUndertakingAdvice2(obj);
		}
	};

	/**
	 * If IssuanceType is "ISAD" then LocalUndertakingDetails must not be
	 * present.
	 */
	public static void check_tsrv_UndertakingIssuanceV01(UndertakingIssuanceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IssuanceType is "ISAD" then LocalUndertakingDetails must not be
	 * present.
	 */
	public static void checkUndertakingAdvice2(UndertakingAdvice2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}