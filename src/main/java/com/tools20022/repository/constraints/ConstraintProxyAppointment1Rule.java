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
import com.tools20022.repository.msg.Proxy2;
import com.tools20022.repository.msg.Proxy4;
import com.tools20022.repository.msg.Proxy6;
import java.util.Arrays;

/**
 * If ProxyType is Discretionary "DISC" or SecurityHolder "HLDR", then
 * PersonDetails must be present.
 */
public class ConstraintProxyAppointment1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Proxy4 Proxy4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PersonDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ProxyType&lt;/leftOperand&gt;&lt;rightOperand&gt;Discretionary&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ProxyType&lt;/leftOperand&gt;&lt;rightOperand&gt;SecurityHolder&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAppointment1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProxyType is Discretionary \"DISC\" or SecurityHolder \"HLDR\", then PersonDetails must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintProxyAppointment1Rule#forProxy6
	 * ConstraintProxyAppointment1Rule.forProxy6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Proxy4> forProxy4 = new MMConstraint<Proxy4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAppointment1Rule";
			definition = "If ProxyType is Discretionary \"DISC\" or SecurityHolder \"HLDR\", then PersonDetails must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintProxyAppointment1Rule.forProxy6);
			owner_lazy = () -> Proxy4.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PersonDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ProxyType</leftOperand><rightOperand>Discretionary</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ProxyType</leftOperand><rightOperand>SecurityHolder</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Proxy4 obj) throws Exception {
			checkProxy4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Proxy2 Proxy2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAppointment1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProxyType is DISC or HLDR, then PersonDetails must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<Proxy2> forProxy2 = new MMConstraint<Proxy2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAppointment1Rule";
			definition = "If ProxyType is DISC or HLDR, then PersonDetails must be present.";
			owner_lazy = () -> Proxy2.mmObject();
		}

		@Override
		public void executeValidator(Proxy2 obj) throws Exception {
			checkProxy2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Proxy6 Proxy6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PersonDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ProxyType&lt;/leftOperand&gt;&lt;rightOperand&gt;Discretionary&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ProxyType&lt;/leftOperand&gt;&lt;rightOperand&gt;SecurityHolder&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAppointment1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProxyType is Discretionary \"DISC\" or SecurityHolder \"HLDR\", then PersonDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintProxyAppointment1Rule#forProxy4
	 * ConstraintProxyAppointment1Rule.forProxy4}</li>
	 * </ul>
	 */
	public static final MMConstraint<Proxy6> forProxy6 = new MMConstraint<Proxy6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAppointment1Rule";
			definition = "If ProxyType is Discretionary \"DISC\" or SecurityHolder \"HLDR\", then PersonDetails must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintProxyAppointment1Rule.forProxy4;
			owner_lazy = () -> Proxy6.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PersonDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ProxyType</leftOperand><rightOperand>Discretionary</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ProxyType</leftOperand><rightOperand>SecurityHolder</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Proxy6 obj) throws Exception {
			checkProxy6(obj);
		}
	};

	/**
	 * If ProxyType is Discretionary "DISC" or SecurityHolder "HLDR", then
	 * PersonDetails must be present.
	 */
	public static void checkProxy4(Proxy4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProxyType is DISC or HLDR, then PersonDetails must be present.
	 */
	public static void checkProxy2(Proxy2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProxyType is Discretionary "DISC" or SecurityHolder "HLDR", then
	 * PersonDetails must be present.
	 */
	public static void checkProxy6(Proxy6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}