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
import com.tools20022.repository.msg.*;

/**
 * If Type is MULT, then BilateralLimitCounterpartyIdentification is not
 * allowed.
 */
public class ConstraintBilateralLimitCounterparty1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1
	 * LimitIdentificationDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralLimitCounterparty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is MULT, then BilateralLimitCounterpartyIdentification is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LimitIdentificationDetails1> forLimitIdentificationDetails1 = new MMConstraint<LimitIdentificationDetails1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterparty1Rule";
			definition = "If Type is MULT, then BilateralLimitCounterpartyIdentification is not allowed.";
			owner_lazy = () -> LimitIdentificationDetails1.mmObject();
		}

		@Override
		public void executeValidator(LimitIdentificationDetails1 obj) throws Exception {
			checkLimitIdentificationDetails1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RiskManagementLimitIdentificationDetails
	 * RiskManagementLimitIdentificationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralLimitCounterparty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is MULT, then BilateralLimitCounterpartyIdentification is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RiskManagementLimitIdentificationDetails> forRiskManagementLimitIdentificationDetails = new MMConstraint<RiskManagementLimitIdentificationDetails>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterparty1Rule";
			definition = "If Type is MULT, then BilateralLimitCounterpartyIdentification is not allowed.";
			owner_lazy = () -> RiskManagementLimitIdentificationDetails.mmObject();
		}

		@Override
		public void executeValidator(RiskManagementLimitIdentificationDetails obj) throws Exception {
			checkRiskManagementLimitIdentificationDetails(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentification1
	 * LimitIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BilateralLimitCounterpartyIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Multilateral&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralLimitCounterparty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is MULT, then BilateralLimitCounterpartyIdentification is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LimitIdentification1> forLimitIdentification1 = new MMConstraint<LimitIdentification1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterparty1Rule";
			definition = "If Type is MULT, then BilateralLimitCounterpartyIdentification is not allowed.";
			owner_lazy = () -> LimitIdentification1.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/BilateralLimitCounterpartyIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/Type/Code</leftOperand><rightOperand>Multilateral</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(LimitIdentification1 obj) throws Exception {
			checkLimitIdentification1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails3
	 * LimitIdentificationDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralLimitCounterparty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is MULT, then BilateralLimitCounterpartyIdentification is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LimitIdentificationDetails3> forLimitIdentificationDetails3 = new MMConstraint<LimitIdentificationDetails3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterparty1Rule";
			definition = "If Type is MULT, then BilateralLimitCounterpartyIdentification is not allowed.";
			owner_lazy = () -> LimitIdentificationDetails3.mmObject();
		}

		@Override
		public void executeValidator(LimitIdentificationDetails3 obj) throws Exception {
			checkLimitIdentificationDetails3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails2
	 * LimitIdentificationDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralLimitCounterparty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is MULT, then BilateralLimitCounterpartyIdentification is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LimitIdentificationDetails2> forLimitIdentificationDetails2 = new MMConstraint<LimitIdentificationDetails2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterparty1Rule";
			definition = "If Type is MULT, then BilateralLimitCounterpartyIdentification is not allowed.";
			owner_lazy = () -> LimitIdentificationDetails2.mmObject();
		}

		@Override
		public void executeValidator(LimitIdentificationDetails2 obj) throws Exception {
			checkLimitIdentificationDetails2(obj);
		}
	};

	/**
	 * If Type is MULT, then BilateralLimitCounterpartyIdentification is not
	 * allowed.
	 */
	public static void checkLimitIdentificationDetails1(LimitIdentificationDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type is MULT, then BilateralLimitCounterpartyIdentification is not
	 * allowed.
	 */
	public static void checkRiskManagementLimitIdentificationDetails(RiskManagementLimitIdentificationDetails obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type is MULT, then BilateralLimitCounterpartyIdentification is not
	 * allowed.
	 */
	public static void checkLimitIdentification1(LimitIdentification1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type is MULT, then BilateralLimitCounterpartyIdentification is not
	 * allowed.
	 */
	public static void checkLimitIdentificationDetails3(LimitIdentificationDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type is MULT, then BilateralLimitCounterpartyIdentification is not
	 * allowed.
	 */
	public static void checkLimitIdentificationDetails2(LimitIdentificationDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}