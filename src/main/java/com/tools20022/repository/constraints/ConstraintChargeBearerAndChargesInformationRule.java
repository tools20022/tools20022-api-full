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
import java.util.Arrays;

/**
 * If ChargeBearer contains DEBT, then ChargesInformation may be present to
 * communicate charges that have been added for (the) InstructedAgent(s). If
 * ChargeBearer contains CRED, then at least one occurrence of
 * ChargesInformation must be present to communicate charges that have been
 * deducted from the InstructedAmount by (the) InstructingAgent(s). If
 * ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.
 */
public class ConstraintChargeBearerAndChargesInformationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2
	 * CreditTransferTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ChargesInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;rightOperand&gt;BorneByCreditor&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerAndChargesInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s).\nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s).\nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction2> forCreditTransferTransaction2 = new MMConstraint<CreditTransferTransaction2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerAndChargesInformationRule";
			definition = "If ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s).\nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s).\nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.";
			owner_lazy = () -> CreditTransferTransaction2.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ChargesInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ChargeBearer</leftOperand><rightOperand>BorneByCreditor</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CreditTransferTransaction2 obj) throws Exception {
			checkCreditTransferTransaction2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7
	 * CreditTransferTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ChargesInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;rightOperand&gt;BorneByCreditor&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerAndChargesInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s).\nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s).\nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerAndChargesInformationRule#forCreditTransferTransaction19
	 * ConstraintChargeBearerAndChargesInformationRule.
	 * forCreditTransferTransaction19}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction7> forCreditTransferTransaction7 = new MMConstraint<CreditTransferTransaction7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerAndChargesInformationRule";
			definition = "If ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s).\nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s).\nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChargeBearerAndChargesInformationRule.forCreditTransferTransaction19);
			owner_lazy = () -> CreditTransferTransaction7.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ChargesInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ChargeBearer</leftOperand><rightOperand>BorneByCreditor</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CreditTransferTransaction7 obj) throws Exception {
			checkCreditTransferTransaction7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30
	 * CreditTransferTransaction30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ChargesInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;rightOperand&gt;BorneByCreditor&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerAndChargesInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s).\nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s).\nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction30> forCreditTransferTransaction30 = new MMConstraint<CreditTransferTransaction30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerAndChargesInformationRule";
			definition = "If ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s).\nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s).\nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.";
			owner_lazy = () -> CreditTransferTransaction30.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ChargesInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ChargeBearer</leftOperand><rightOperand>BorneByCreditor</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CreditTransferTransaction30 obj) throws Exception {
			checkCreditTransferTransaction30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19
	 * CreditTransferTransaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ChargesInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;rightOperand&gt;BorneByCreditor&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerAndChargesInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s).\nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s).\nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerAndChargesInformationRule#forCreditTransferTransaction25
	 * ConstraintChargeBearerAndChargesInformationRule.
	 * forCreditTransferTransaction25}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerAndChargesInformationRule#forCreditTransferTransaction7
	 * ConstraintChargeBearerAndChargesInformationRule.
	 * forCreditTransferTransaction7}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction19> forCreditTransferTransaction19 = new MMConstraint<CreditTransferTransaction19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerAndChargesInformationRule";
			definition = "If ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s).\nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s).\nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChargeBearerAndChargesInformationRule.forCreditTransferTransaction25);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChargeBearerAndChargesInformationRule.forCreditTransferTransaction7;
			owner_lazy = () -> CreditTransferTransaction19.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ChargesInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ChargeBearer</leftOperand><rightOperand>BorneByCreditor</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CreditTransferTransaction19 obj) throws Exception {
			checkCreditTransferTransaction19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25
	 * CreditTransferTransaction25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ChargesInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;rightOperand&gt;BorneByCreditor&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerAndChargesInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s).\nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s).\nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerAndChargesInformationRule#forCreditTransferTransaction19
	 * ConstraintChargeBearerAndChargesInformationRule.
	 * forCreditTransferTransaction19}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction25> forCreditTransferTransaction25 = new MMConstraint<CreditTransferTransaction25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerAndChargesInformationRule";
			definition = "If ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s).\nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s).\nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChargeBearerAndChargesInformationRule.forCreditTransferTransaction19;
			owner_lazy = () -> CreditTransferTransaction25.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ChargesInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ChargeBearer</leftOperand><rightOperand>BorneByCreditor</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CreditTransferTransaction25 obj) throws Exception {
			checkCreditTransferTransaction25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11
	 * CreditTransferTransactionInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ChargesInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ChargeBearer&lt;/leftOperand&gt;&lt;rightOperand&gt;BorneByCreditor&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearerAndChargesInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s).\nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s).\nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation11> forCreditTransferTransactionInformation11 = new MMConstraint<CreditTransferTransactionInformation11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearerAndChargesInformationRule";
			definition = "If ChargeBearer contains DEBT, then ChargesInformation may be present to communicate charges that have been added for (the) InstructedAgent(s).\nIf ChargeBearer contains CRED, then at least one occurrence of ChargesInformation must be present to communicate charges that have been deducted from the InstructedAmount by (the) InstructingAgent(s).\nIf ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.";
			owner_lazy = () -> CreditTransferTransactionInformation11.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ChargesInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ChargeBearer</leftOperand><rightOperand>BorneByCreditor</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CreditTransferTransactionInformation11 obj) throws Exception {
			checkCreditTransferTransactionInformation11(obj);
		}
	};

	/**
	 * If ChargeBearer contains DEBT, then ChargesInformation may be present to
	 * communicate charges that have been added for (the) InstructedAgent(s). If
	 * ChargeBearer contains CRED, then at least one occurrence of
	 * ChargesInformation must be present to communicate charges that have been
	 * deducted from the InstructedAmount by (the) InstructingAgent(s). If
	 * ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.
	 */
	public static void checkCreditTransferTransaction2(CreditTransferTransaction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer contains DEBT, then ChargesInformation may be present to
	 * communicate charges that have been added for (the) InstructedAgent(s). If
	 * ChargeBearer contains CRED, then at least one occurrence of
	 * ChargesInformation must be present to communicate charges that have been
	 * deducted from the InstructedAmount by (the) InstructingAgent(s). If
	 * ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.
	 */
	public static void checkCreditTransferTransaction7(CreditTransferTransaction7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer contains DEBT, then ChargesInformation may be present to
	 * communicate charges that have been added for (the) InstructedAgent(s). If
	 * ChargeBearer contains CRED, then at least one occurrence of
	 * ChargesInformation must be present to communicate charges that have been
	 * deducted from the InstructedAmount by (the) InstructingAgent(s). If
	 * ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.
	 */
	public static void checkCreditTransferTransaction30(CreditTransferTransaction30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer contains DEBT, then ChargesInformation may be present to
	 * communicate charges that have been added for (the) InstructedAgent(s). If
	 * ChargeBearer contains CRED, then at least one occurrence of
	 * ChargesInformation must be present to communicate charges that have been
	 * deducted from the InstructedAmount by (the) InstructingAgent(s). If
	 * ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.
	 */
	public static void checkCreditTransferTransaction19(CreditTransferTransaction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer contains DEBT, then ChargesInformation may be present to
	 * communicate charges that have been added for (the) InstructedAgent(s). If
	 * ChargeBearer contains CRED, then at least one occurrence of
	 * ChargesInformation must be present to communicate charges that have been
	 * deducted from the InstructedAmount by (the) InstructingAgent(s). If
	 * ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.
	 */
	public static void checkCreditTransferTransaction25(CreditTransferTransaction25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChargeBearer contains DEBT, then ChargesInformation may be present to
	 * communicate charges that have been added for (the) InstructedAgent(s). If
	 * ChargeBearer contains CRED, then at least one occurrence of
	 * ChargesInformation must be present to communicate charges that have been
	 * deducted from the InstructedAmount by (the) InstructingAgent(s). If
	 * ChargeBearer contains SHAR or SLEV, then ChargesInformation is optional.
	 */
	public static void checkCreditTransferTransactionInformation11(CreditTransferTransactionInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}