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
import com.tools20022.repository.area.sese.*;
import java.util.Arrays;

/**
 * If the TransactionIdentificationDetails/SecuritiesMovementType is equal to
 * "Delivery" (DELI) then ReceivingSettlementParties/DeliveringDepository and
 * ReceivingSettlementParties/Party1 must be present.
 */
public class ConstraintReceivingDepositoryAndParty1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV08
	 * SecuritiesSettlementTransactionGenerationNotificationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the TransactionIdentificationDetails/SecuritiesMovementType is equal to \"Delivery\" (DELI) then ReceivingSettlementParties/DeliveringDepository and ReceivingSettlementParties/Party1 must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionGenerationNotificationV07
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV08> forSecuritiesSettlementTransactionGenerationNotificationV08 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV08>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionGenerationNotificationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the TransactionIdentificationDetails/SecuritiesMovementType is equal to \"Delivery\" (DELI) then ReceivingSettlementParties/DeliveringDepository and ReceivingSettlementParties/Party1 must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionGenerationNotificationV07;
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08
	 * SecuritiesSettlementTransactionConfirmationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionConfirmationV07
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV08> forSecuritiesSettlementTransactionConfirmationV08 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV08>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionConfirmationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionConfirmationV07;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV08
	 * SecuritiesFinancingConfirmationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesFinancingConfirmationV07
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesFinancingConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV08> forSecuritiesFinancingConfirmationV08 = new MMConstraint<SecuritiesFinancingConfirmationV08>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesFinancingConfirmationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesFinancingConfirmationV07;
			owner_lazy = () -> SecuritiesFinancingConfirmationV08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV07
	 * SecuritiesSettlementTransactionReversalAdviceV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionReversalAdviceV06
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionReversalAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV07> forSecuritiesSettlementTransactionReversalAdviceV07 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV07>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionReversalAdviceV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionReversalAdviceV06;
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08
	 * SecuritiesSettlementTransactionInstructionV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementTypeAndAdditionalParameters/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionInstructionV07
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV08> forSecuritiesSettlementTransactionInstructionV08 = new MMConstraint<SecuritiesSettlementTransactionInstructionV08>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionInstructionV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionInstructionV07;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementTypeAndAdditionalParameters/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07
	 * SecuritiesSettlementTransactionGenerationNotificationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the TransactionIdentificationDetails/SecuritiesMovementType is equal to \"Delivery\" (DELI) then ReceivingSettlementParties/DeliveringDepository and ReceivingSettlementParties/Party1 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionGenerationNotificationV08
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionGenerationNotificationV06
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV07> forSecuritiesSettlementTransactionGenerationNotificationV07 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV07>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionGenerationNotificationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the TransactionIdentificationDetails/SecuritiesMovementType is equal to \"Delivery\" (DELI) then ReceivingSettlementParties/DeliveringDepository and ReceivingSettlementParties/Party1 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionGenerationNotificationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionGenerationNotificationV06;
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07
	 * SecuritiesSettlementTransactionConfirmationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionConfirmationV08
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionConfirmationV06
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV07> forSecuritiesSettlementTransactionConfirmationV07 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV07>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionConfirmationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionConfirmationV06;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV06
	 * SecuritiesSettlementTransactionReversalAdviceV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionReversalAdviceV07
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionReversalAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionReversalAdviceV05
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionReversalAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV06> forSecuritiesSettlementTransactionReversalAdviceV06 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV06>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionReversalAdviceV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionReversalAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionReversalAdviceV05;
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV07
	 * SecuritiesFinancingConfirmationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesFinancingConfirmationV08
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesFinancingConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesFinancingConfirmationV06
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesFinancingConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV07> forSecuritiesFinancingConfirmationV07 = new MMConstraint<SecuritiesFinancingConfirmationV07>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesFinancingConfirmationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesFinancingConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesFinancingConfirmationV06;
			owner_lazy = () -> SecuritiesFinancingConfirmationV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07
	 * SecuritiesSettlementTransactionInstructionV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementTypeAndAdditionalParameters/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionInstructionV08
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionInstructionV06
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV07> forSecuritiesSettlementTransactionInstructionV07 = new MMConstraint<SecuritiesSettlementTransactionInstructionV07>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionInstructionV06;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementTypeAndAdditionalParameters/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07
	 * SecuritiesSettlementTransactionInstruction002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementTypeAndAdditionalParameters/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V07> forSecuritiesSettlementTransactionInstruction002V07 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V07>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionInstruction002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementTypeAndAdditionalParameters/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07
	 * SecuritiesFinancingConfirmation002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmation002V07> forSecuritiesFinancingConfirmation002V07 = new MMConstraint<SecuritiesFinancingConfirmation002V07>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesFinancingConfirmation002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n";
			owner_lazy = () -> SecuritiesFinancingConfirmation002V07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V07
	 * SecuritiesSettlementTransactionGenerationNotification002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotification002V07> forSecuritiesSettlementTransactionGenerationNotification002V07 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotification002V07>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionGenerationNotification002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotification002V07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07
	 * SecuritiesSettlementTransactionConfirmation002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmation002V07> forSecuritiesSettlementTransactionConfirmation002V07 = new MMConstraint<SecuritiesSettlementTransactionConfirmation002V07>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionConfirmation002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmation002V07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V06
	 * SecuritiesSettlementTransactionReversalAdvice002V06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdvice002V06> forSecuritiesSettlementTransactionReversalAdvice002V06 = new MMConstraint<SecuritiesSettlementTransactionReversalAdvice002V06>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionReversalAdvice002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdvice002V06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01
	 * SecuritiesFinancingConfirmationV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV01> forSecuritiesFinancingConfirmationV01 = new MMConstraint<SecuritiesFinancingConfirmationV01>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesFinancingConfirmationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n";
			owner_lazy = () -> SecuritiesFinancingConfirmationV01.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV02
	 * SecuritiesFinancingConfirmationV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV02> forSecuritiesFinancingConfirmationV02 = new MMConstraint<SecuritiesFinancingConfirmationV02>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesFinancingConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n";
			owner_lazy = () -> SecuritiesFinancingConfirmationV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV03
	 * SecuritiesFinancingConfirmationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV03> forSecuritiesFinancingConfirmationV03 = new MMConstraint<SecuritiesFinancingConfirmationV03>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesFinancingConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n";
			owner_lazy = () -> SecuritiesFinancingConfirmationV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04
	 * SecuritiesFinancingConfirmationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesFinancingConfirmationV05
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesFinancingConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV04> forSecuritiesFinancingConfirmationV04 = new MMConstraint<SecuritiesFinancingConfirmationV04>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesFinancingConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesFinancingConfirmationV05);
			owner_lazy = () -> SecuritiesFinancingConfirmationV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01
	 * SecuritiesSettlementTransactionConfirmationV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV01> forSecuritiesSettlementTransactionConfirmationV01 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV01>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionConfirmationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV01.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV02
	 * SecuritiesSettlementTransactionConfirmationV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV02> forSecuritiesSettlementTransactionConfirmationV02 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV02>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV03
	 * SecuritiesSettlementTransactionConfirmationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV03> forSecuritiesSettlementTransactionConfirmationV03 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV03>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV04
	 * SecuritiesSettlementTransactionConfirmationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionConfirmationV05
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV04> forSecuritiesSettlementTransactionConfirmationV04 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV04>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionConfirmationV05);
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01
	 * SecuritiesSettlementTransactionGenerationNotificationV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV01> forSecuritiesSettlementTransactionGenerationNotificationV01 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV01>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionGenerationNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV01.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV02
	 * SecuritiesSettlementTransactionGenerationNotificationV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV02> forSecuritiesSettlementTransactionGenerationNotificationV02 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV02>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionGenerationNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV02.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV03
	 * SecuritiesSettlementTransactionGenerationNotificationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV03> forSecuritiesSettlementTransactionGenerationNotificationV03 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV03>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionGenerationNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV03.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04
	 * SecuritiesSettlementTransactionGenerationNotificationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionGenerationNotificationV05
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV04> forSecuritiesSettlementTransactionGenerationNotificationV04 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV04>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionGenerationNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionGenerationNotificationV05);
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01
	 * SecuritiesSettlementTransactionInstructionV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementTypeAndAdditionalParameters/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV01> forSecuritiesSettlementTransactionInstructionV01 = new MMConstraint<SecuritiesSettlementTransactionInstructionV01>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV01.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementTypeAndAdditionalParameters/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV02
	 * SecuritiesSettlementTransactionInstructionV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementTypeAndAdditionalParameters/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV02> forSecuritiesSettlementTransactionInstructionV02 = new MMConstraint<SecuritiesSettlementTransactionInstructionV02>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV02.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementTypeAndAdditionalParameters/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV03
	 * SecuritiesSettlementTransactionInstructionV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementTypeAndAdditionalParameters/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV03> forSecuritiesSettlementTransactionInstructionV03 = new MMConstraint<SecuritiesSettlementTransactionInstructionV03>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV03.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementTypeAndAdditionalParameters/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04
	 * SecuritiesSettlementTransactionInstructionV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementTypeAndAdditionalParameters/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV04> forSecuritiesSettlementTransactionInstructionV04 = new MMConstraint<SecuritiesSettlementTransactionInstructionV04>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionInstructionV05);
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementTypeAndAdditionalParameters/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01
	 * SecuritiesSettlementTransactionReversalAdviceV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV01> forSecuritiesSettlementTransactionReversalAdviceV01 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV01>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionReversalAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV01.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV02
	 * SecuritiesSettlementTransactionReversalAdviceV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV02> forSecuritiesSettlementTransactionReversalAdviceV02 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV02>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionReversalAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03
	 * SecuritiesSettlementTransactionReversalAdviceV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionReversalAdviceV04
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionReversalAdviceV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV03> forSecuritiesSettlementTransactionReversalAdviceV03 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV03>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionReversalAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionReversalAdviceV04);
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05
	 * SecuritiesFinancingConfirmationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesFinancingConfirmationV06
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesFinancingConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesFinancingConfirmationV04
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesFinancingConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV05> forSecuritiesFinancingConfirmationV05 = new MMConstraint<SecuritiesFinancingConfirmationV05>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesFinancingConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesFinancingConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesFinancingConfirmationV04;
			owner_lazy = () -> SecuritiesFinancingConfirmationV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05
	 * SecuritiesSettlementTransactionGenerationNotificationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionGenerationNotificationV06
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionGenerationNotificationV04
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV05> forSecuritiesSettlementTransactionGenerationNotificationV05 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV05>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionGenerationNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionGenerationNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionGenerationNotificationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04
	 * SecuritiesSettlementTransactionReversalAdviceV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionReversalAdviceV05
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionReversalAdviceV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionReversalAdviceV03
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionReversalAdviceV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV04> forSecuritiesSettlementTransactionReversalAdviceV04 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV04>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionReversalAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionReversalAdviceV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionReversalAdviceV03;
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05
	 * SecuritiesSettlementTransactionInstructionV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementTypeAndAdditionalParameters/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionInstructionV06
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionInstructionV04
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV05> forSecuritiesSettlementTransactionInstructionV05 = new MMConstraint<SecuritiesSettlementTransactionInstructionV05>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionInstructionV04;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementTypeAndAdditionalParameters/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV05
	 * SecuritiesSettlementTransactionConfirmationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionConfirmationV06
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionConfirmationV04
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV05> forSecuritiesSettlementTransactionConfirmationV05 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV05>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionConfirmationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06
	 * SecuritiesSettlementTransactionInstructionV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementTypeAndAdditionalParameters/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionInstructionV07
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV06> forSecuritiesSettlementTransactionInstructionV06 = new MMConstraint<SecuritiesSettlementTransactionInstructionV06>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionInstructionV05;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementTypeAndAdditionalParameters/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06
	 * SecuritiesSettlementTransactionConfirmationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionConfirmationV07
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionConfirmationV05
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV06> forSecuritiesSettlementTransactionConfirmationV06 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV06>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionConfirmationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionConfirmationV05;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06
	 * SecuritiesSettlementTransactionGenerationNotificationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionGenerationNotificationV07
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionGenerationNotificationV05
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV06> forSecuritiesSettlementTransactionGenerationNotificationV06 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV06>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionGenerationNotificationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionGenerationNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionGenerationNotificationV05;
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05
	 * SecuritiesSettlementTransactionReversalAdviceV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionReversalAdviceV06
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionReversalAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionReversalAdviceV04
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesSettlementTransactionReversalAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV05> forSecuritiesSettlementTransactionReversalAdviceV05 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV05>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionReversalAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionReversalAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionReversalAdviceV04;
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06
	 * SecuritiesFinancingConfirmationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesFinancingConfirmationV07
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesFinancingConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesFinancingConfirmationV05
	 * ConstraintReceivingDepositoryAndParty1Rule.
	 * forSecuritiesFinancingConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV06> forSecuritiesFinancingConfirmationV06 = new MMConstraint<SecuritiesFinancingConfirmationV06>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesFinancingConfirmationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesFinancingConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesFinancingConfirmationV05;
			owner_lazy = () -> SecuritiesFinancingConfirmationV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V05
	 * SecuritiesSettlementTransactionReversalAdvice002V05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdvice002V05> forSecuritiesSettlementTransactionReversalAdvice002V05 = new MMConstraint<SecuritiesSettlementTransactionReversalAdvice002V05>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionReversalAdvice002V05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdvice002V05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V06
	 * SecuritiesSettlementTransactionConfirmation002V06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmation002V06> forSecuritiesSettlementTransactionConfirmation002V06 = new MMConstraint<SecuritiesSettlementTransactionConfirmation002V06>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionConfirmation002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmation002V06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V06
	 * SecuritiesSettlementTransactionGenerationNotification002V06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotification002V06> forSecuritiesSettlementTransactionGenerationNotification002V06 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotification002V06>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionGenerationNotification002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotification002V06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06
	 * SecuritiesSettlementTransactionInstruction002V06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementTypeAndAdditionalParameters/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V06> forSecuritiesSettlementTransactionInstruction002V06 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V06>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesSettlementTransactionInstruction002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the instruction is a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementTypeAndAdditionalParameters/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V06
	 * SecuritiesFinancingConfirmation002V06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceivingSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Delivery&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmation002V06> forSecuritiesFinancingConfirmation002V06 = new MMConstraint<SecuritiesFinancingConfirmation002V06>() {
		{
			validator = ConstraintReceivingDepositoryAndParty1Rule::checkSecuritiesFinancingConfirmation002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDepositoryAndParty1Rule";
			definition = "If the confirmation is on a delivery and no standing settlement instruction applies, then ReceivingDepository and Party1 must be present.\r\n";
			owner_lazy = () -> SecuritiesFinancingConfirmation002V06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceivingSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Delivery</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If the TransactionIdentificationDetails/SecuritiesMovementType is equal
	 * to "Delivery" (DELI) then ReceivingSettlementParties/DeliveringDepository
	 * and ReceivingSettlementParties/Party1 must be present.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV08(SecuritiesSettlementTransactionGenerationNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV08(SecuritiesSettlementTransactionConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation is on a delivery and no standing settlement
	 * instruction applies, then ReceivingDepository and Party1 must be present.<br>
	 */
	public static void checkSecuritiesFinancingConfirmationV08(SecuritiesFinancingConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV07(SecuritiesSettlementTransactionReversalAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV08(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the TransactionIdentificationDetails/SecuritiesMovementType is equal
	 * to "Delivery" (DELI) then ReceivingSettlementParties/DeliveringDepository
	 * and ReceivingSettlementParties/Party1 must be present.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV07(SecuritiesSettlementTransactionGenerationNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV07(SecuritiesSettlementTransactionConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV06(SecuritiesSettlementTransactionReversalAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation is on a delivery and no standing settlement
	 * instruction applies, then ReceivingDepository and Party1 must be present.<br>
	 */
	public static void checkSecuritiesFinancingConfirmationV07(SecuritiesFinancingConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV07(SecuritiesSettlementTransactionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V07(SecuritiesSettlementTransactionInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation is on a delivery and no standing settlement
	 * instruction applies, then ReceivingDepository and Party1 must be present.<br>
	 */
	public static void checkSecuritiesFinancingConfirmation002V07(SecuritiesFinancingConfirmation002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotification002V07(SecuritiesSettlementTransactionGenerationNotification002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionConfirmation002V07(SecuritiesSettlementTransactionConfirmation002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdvice002V06(SecuritiesSettlementTransactionReversalAdvice002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation is on a delivery and no standing settlement
	 * instruction applies, then ReceivingDepository and Party1 must be present.<br>
	 */
	public static void checkSecuritiesFinancingConfirmationV01(SecuritiesFinancingConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation is on a delivery and no standing settlement
	 * instruction applies, then ReceivingDepository and Party1 must be present.<br>
	 */
	public static void checkSecuritiesFinancingConfirmationV02(SecuritiesFinancingConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation is on a delivery and no standing settlement
	 * instruction applies, then ReceivingDepository and Party1 must be present.<br>
	 */
	public static void checkSecuritiesFinancingConfirmationV03(SecuritiesFinancingConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation is on a delivery and no standing settlement
	 * instruction applies, then ReceivingDepository and Party1 must be present.<br>
	 */
	public static void checkSecuritiesFinancingConfirmationV04(SecuritiesFinancingConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV01(SecuritiesSettlementTransactionConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV02(SecuritiesSettlementTransactionConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV03(SecuritiesSettlementTransactionConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV04(SecuritiesSettlementTransactionConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV01(SecuritiesSettlementTransactionGenerationNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV02(SecuritiesSettlementTransactionGenerationNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV03(SecuritiesSettlementTransactionGenerationNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV04(SecuritiesSettlementTransactionGenerationNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV01(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV02(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV03(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV04(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV01(SecuritiesSettlementTransactionReversalAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV02(SecuritiesSettlementTransactionReversalAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV03(SecuritiesSettlementTransactionReversalAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation is on a delivery and no standing settlement
	 * instruction applies, then ReceivingDepository and Party1 must be present.<br>
	 */
	public static void checkSecuritiesFinancingConfirmationV05(SecuritiesFinancingConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV05(SecuritiesSettlementTransactionGenerationNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV04(SecuritiesSettlementTransactionReversalAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV05(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV05(SecuritiesSettlementTransactionConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV06(SecuritiesSettlementTransactionInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV06(SecuritiesSettlementTransactionConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV06(SecuritiesSettlementTransactionGenerationNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV05(SecuritiesSettlementTransactionReversalAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation is on a delivery and no standing settlement
	 * instruction applies, then ReceivingDepository and Party1 must be present.<br>
	 */
	public static void checkSecuritiesFinancingConfirmationV06(SecuritiesFinancingConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdvice002V05(SecuritiesSettlementTransactionReversalAdvice002V05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionConfirmation002V06(SecuritiesSettlementTransactionConfirmation002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotification002V06(SecuritiesSettlementTransactionGenerationNotification002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a delivery and no standing settlement instruction
	 * applies, then ReceivingDepository and Party1 must be present. .
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V06(SecuritiesSettlementTransactionInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation is on a delivery and no standing settlement
	 * instruction applies, then ReceivingDepository and Party1 must be present.<br>
	 */
	public static void checkSecuritiesFinancingConfirmation002V06(SecuritiesFinancingConfirmation002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}