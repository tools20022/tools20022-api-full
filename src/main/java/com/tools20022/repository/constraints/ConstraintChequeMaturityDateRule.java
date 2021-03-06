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
import com.tools20022.repository.msg.Cheque5;
import com.tools20022.repository.msg.Cheque6;
import com.tools20022.repository.msg.Cheque7;

/**
 * If ChequeMaturityDate is present, then ChequeType must be present and equal
 * to DRFT or ELDR.
 */
public class ConstraintChequeMaturityDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Cheque6 Cheque6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChequeMaturityDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ChequeType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"WithInList\"&gt;&lt;leftOperand&gt;/ChequeType&lt;/leftOperand&gt;&lt;rightOperand&gt;ChequeType3Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeMaturityDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChequeMaturityDate is present, then ChequeType must be present and equal to DRFT or ELDR."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Cheque6> forCheque6 = new MMConstraint<Cheque6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeMaturityDateRule";
			definition = "If ChequeMaturityDate is present, then ChequeType must be present and equal to DRFT or ELDR.";
			owner_lazy = () -> Cheque6.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChequeMaturityDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ChequeType</leftOperand></BooleanRule><BooleanRule xsi:type=\"WithInList\"><leftOperand>/ChequeType</leftOperand><rightOperand>ChequeType3Code</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Cheque6 obj) throws Exception {
			checkCheque6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Cheque7 Cheque7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ChequeMaturityDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ChequeType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"WithInList\"&gt;&lt;leftOperand&gt;/ChequeType&lt;/leftOperand&gt;&lt;rightOperand&gt;ChequeType3Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeMaturityDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChequeMaturityDate is present, then ChequeType must be present and equal to DRFT or ELDR."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Cheque7> forCheque7 = new MMConstraint<Cheque7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeMaturityDateRule";
			definition = "If ChequeMaturityDate is present, then ChequeType must be present and equal to DRFT or ELDR.";
			owner_lazy = () -> Cheque7.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ChequeMaturityDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ChequeType</leftOperand></BooleanRule><BooleanRule xsi:type=\"WithInList\"><leftOperand>/ChequeType</leftOperand><rightOperand>ChequeType3Code</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Cheque7 obj) throws Exception {
			checkCheque7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Cheque5 Cheque5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeMaturityDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChequeType is present and is DRFT or ELDR, then ChequeMaturityDate is optional. If ChequeType is not present or is different from DRFT or ELDR, then ChequeMaturityDate is not allowed.\n\nRule rationale: ChequeMaturityDate may be present only when ChequeType is DRFT or ELDR."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Cheque5> forCheque5 = new MMConstraint<Cheque5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeMaturityDateRule";
			definition = "If ChequeType is present and is DRFT or ELDR, then ChequeMaturityDate is optional. If ChequeType is not present or is different from DRFT or ELDR, then ChequeMaturityDate is not allowed.\n\nRule rationale: ChequeMaturityDate may be present only when ChequeType is DRFT or ELDR.";
			owner_lazy = () -> Cheque5.mmObject();
		}

		@Override
		public void executeValidator(Cheque5 obj) throws Exception {
			checkCheque5(obj);
		}
	};

	/**
	 * If ChequeMaturityDate is present, then ChequeType must be present and
	 * equal to DRFT or ELDR.
	 */
	public static void checkCheque6(Cheque6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChequeMaturityDate is present, then ChequeType must be present and
	 * equal to DRFT or ELDR.
	 */
	public static void checkCheque7(Cheque7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChequeType is present and is DRFT or ELDR, then ChequeMaturityDate is
	 * optional. If ChequeType is not present or is different from DRFT or ELDR,
	 * then ChequeMaturityDate is not allowed.
	 * 
	 * Rule rationale: ChequeMaturityDate may be present only when ChequeType is
	 * DRFT or ELDR.
	 */
	public static void checkCheque5(Cheque5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}