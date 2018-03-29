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
import com.tools20022.repository.msg.DeliveringPartiesAndAccount16;
import com.tools20022.repository.msg.DeliveringPartiesAndAccount3;
import com.tools20022.repository.msg.DeliveringPartiesAndAccount6;
import java.util.Arrays;

/**
 * If DeliverersIntermediaryDetails is present, then DeliverersCustodianDetails
 * must also be present. If DeliverersIntermediaryDetails is not present then
 * DeliverersCustodianDetails is optional.
 */
public class ConstraintDeliverersCustodianRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount3
	 * DeliveringPartiesAndAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliverersIntermediaryDetails is present, then DeliverersCustodianDetails must also be present. If DeliverersIntermediaryDetails is not present then DeliverersCustodianDetails is optional."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianRule#forDeliveringPartiesAndAccount16
	 * ConstraintDeliverersCustodianRule.forDeliveringPartiesAndAccount16}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount3> forDeliveringPartiesAndAccount3 = new MMConstraint<DeliveringPartiesAndAccount3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianRule";
			definition = "If DeliverersIntermediaryDetails is present, then DeliverersCustodianDetails must also be present. If DeliverersIntermediaryDetails is not present then DeliverersCustodianDetails is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianRule.forDeliveringPartiesAndAccount16);
			owner_lazy = () -> DeliveringPartiesAndAccount3.mmObject();
		}

		@Override
		public void executeValidator(DeliveringPartiesAndAccount3 obj) throws Exception {
			checkDeliveringPartiesAndAccount3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount6
	 * DeliveringPartiesAndAccount6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliverersIntermediaryDetails is present, then DeliverersCustodianDetails must also be present. If DeliverersIntermediaryDetails is not present then DeliverersCustodianDetails is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount6> forDeliveringPartiesAndAccount6 = new MMConstraint<DeliveringPartiesAndAccount6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianRule";
			definition = "If DeliverersIntermediaryDetails is present, then DeliverersCustodianDetails must also be present. If DeliverersIntermediaryDetails is not present then DeliverersCustodianDetails is optional.";
			owner_lazy = () -> DeliveringPartiesAndAccount6.mmObject();
		}

		@Override
		public void executeValidator(DeliveringPartiesAndAccount6 obj) throws Exception {
			checkDeliveringPartiesAndAccount6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16
	 * DeliveringPartiesAndAccount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliverersCustodianDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliverersIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliverersIntermediary1Details is present, then DeliverersCustodianDetails must be present. If DeliverersIntermediary1Details is not present then DeliverersCustodianDetails is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianRule#forDeliveringPartiesAndAccount3
	 * ConstraintDeliverersCustodianRule.forDeliveringPartiesAndAccount3}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount16> forDeliveringPartiesAndAccount16 = new MMConstraint<DeliveringPartiesAndAccount16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianRule";
			definition = "If DeliverersIntermediary1Details is present, then DeliverersCustodianDetails must be present. If DeliverersIntermediary1Details is not present then DeliverersCustodianDetails is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersCustodianRule.forDeliveringPartiesAndAccount3;
			owner_lazy = () -> DeliveringPartiesAndAccount16.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliverersCustodianDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliverersIntermediary1Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(DeliveringPartiesAndAccount16 obj) throws Exception {
			checkDeliveringPartiesAndAccount16(obj);
		}
	};

	/**
	 * If DeliverersIntermediaryDetails is present, then
	 * DeliverersCustodianDetails must also be present. If
	 * DeliverersIntermediaryDetails is not present then
	 * DeliverersCustodianDetails is optional.
	 */
	public static void checkDeliveringPartiesAndAccount3(DeliveringPartiesAndAccount3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DeliverersIntermediaryDetails is present, then
	 * DeliverersCustodianDetails must also be present. If
	 * DeliverersIntermediaryDetails is not present then
	 * DeliverersCustodianDetails is optional.
	 */
	public static void checkDeliveringPartiesAndAccount6(DeliveringPartiesAndAccount6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DeliverersIntermediary1Details is present, then
	 * DeliverersCustodianDetails must be present. If
	 * DeliverersIntermediary1Details is not present then
	 * DeliverersCustodianDetails is optional.
	 */
	public static void checkDeliveringPartiesAndAccount16(DeliveringPartiesAndAccount16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}