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
 * If PaymentMethod is CHK and
 * CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is
 * present and is equal to MLFA, CRFA, RGFA or PUFA, then
 * CreditTransferTransactionInformation/CreditorAgent must be present.
 */
public class ConstraintChequeDeliveryAndCreditorAgentRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3
	 * PaymentInstructionInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;Cheque&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"WithInList\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;ChequeDelivery2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeDeliveryAndCreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK and CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransactionInformation/CreditorAgent must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation3> forPaymentInstructionInformation3 = new MMConstraint<PaymentInstructionInformation3>() {
		{
			validator = ConstraintChequeDeliveryAndCreditorAgentRule::checkPaymentInstructionInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeDeliveryAndCreditorAgentRule";
			definition = "If PaymentMethod is CHK and CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransactionInformation/CreditorAgent must be present.";
			owner_lazy = () -> PaymentInstructionInformation3.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentMethod</leftOperand><rightOperand>Cheque</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"WithInList\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code</leftOperand><rightOperand>ChequeDelivery2Code</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6
	 * PaymentInstruction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;Cheque&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"WithInList\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;ChequeDelivery2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeDeliveryAndCreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK and CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransactionInformation/CreditorAgent must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction6> forPaymentInstruction6 = new MMConstraint<PaymentInstruction6>() {
		{
			validator = ConstraintChequeDeliveryAndCreditorAgentRule::checkPaymentInstruction6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeDeliveryAndCreditorAgentRule";
			definition = "If PaymentMethod is CHK and CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransactionInformation/CreditorAgent must be present.";
			owner_lazy = () -> PaymentInstruction6.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentMethod</leftOperand><rightOperand>Cheque</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"WithInList\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code</leftOperand><rightOperand>ChequeDelivery2Code</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9
	 * PaymentInstruction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;Cheque&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"WithInList\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;ChequeDelivery2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeDeliveryAndCreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK and CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransactionInformation/CreditorAgent must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeDeliveryAndCreditorAgentRule#forPaymentInstruction16
	 * ConstraintChequeDeliveryAndCreditorAgentRule.forPaymentInstruction16}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction9> forPaymentInstruction9 = new MMConstraint<PaymentInstruction9>() {
		{
			validator = ConstraintChequeDeliveryAndCreditorAgentRule::checkPaymentInstruction9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeDeliveryAndCreditorAgentRule";
			definition = "If PaymentMethod is CHK and CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransactionInformation/CreditorAgent must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeDeliveryAndCreditorAgentRule.forPaymentInstruction16);
			owner_lazy = () -> PaymentInstruction9.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentMethod</leftOperand><rightOperand>Cheque</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"WithInList\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code</leftOperand><rightOperand>ChequeDelivery2Code</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;Cheque&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"WithInList\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;ChequeDelivery2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeDeliveryAndCreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK and CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransactionInformation/CreditorAgent must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeDeliveryAndCreditorAgentRule#forPaymentInstruction20
	 * ConstraintChequeDeliveryAndCreditorAgentRule.forPaymentInstruction20}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeDeliveryAndCreditorAgentRule#forPaymentInstruction9
	 * ConstraintChequeDeliveryAndCreditorAgentRule.forPaymentInstruction9}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction16> forPaymentInstruction16 = new MMConstraint<PaymentInstruction16>() {
		{
			validator = ConstraintChequeDeliveryAndCreditorAgentRule::checkPaymentInstruction16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeDeliveryAndCreditorAgentRule";
			definition = "If PaymentMethod is CHK and CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransactionInformation/CreditorAgent must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeDeliveryAndCreditorAgentRule.forPaymentInstruction20);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeDeliveryAndCreditorAgentRule.forPaymentInstruction9;
			owner_lazy = () -> PaymentInstruction16.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentMethod</leftOperand><rightOperand>Cheque</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"WithInList\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code</leftOperand><rightOperand>ChequeDelivery2Code</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20
	 * PaymentInstruction20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;Cheque&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"WithInList\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;ChequeDelivery2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeDeliveryAndCreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK (Cheque) and CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is present and is equal to MLFA (MailToFinalAgent), CRFA (CourierToFinalAgent), RGFA (RegisteredMailToFinalAgent) or PUFA (PickUpByFinalAgent), then CreditTransferTransactionInformation/CreditorAgent must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeDeliveryAndCreditorAgentRule#forPaymentInstruction22
	 * ConstraintChequeDeliveryAndCreditorAgentRule.forPaymentInstruction22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeDeliveryAndCreditorAgentRule#forPaymentInstruction16
	 * ConstraintChequeDeliveryAndCreditorAgentRule.forPaymentInstruction16}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction20> forPaymentInstruction20 = new MMConstraint<PaymentInstruction20>() {
		{
			validator = ConstraintChequeDeliveryAndCreditorAgentRule::checkPaymentInstruction20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeDeliveryAndCreditorAgentRule";
			definition = "If PaymentMethod is CHK (Cheque) and CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is present and is equal to MLFA (MailToFinalAgent), CRFA (CourierToFinalAgent), RGFA (RegisteredMailToFinalAgent) or PUFA (PickUpByFinalAgent), then CreditTransferTransactionInformation/CreditorAgent must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeDeliveryAndCreditorAgentRule.forPaymentInstruction22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeDeliveryAndCreditorAgentRule.forPaymentInstruction16;
			owner_lazy = () -> PaymentInstruction20.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentMethod</leftOperand><rightOperand>Cheque</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"WithInList\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code</leftOperand><rightOperand>ChequeDelivery2Code</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/CreditorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;Cheque&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"WithInList\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;ChequeDelivery2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeDeliveryAndCreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK (Cheque) and CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is present and is equal to MLFA (MailToFinalAgent), CRFA (CourierToFinalAgent), RGFA (RegisteredMailToFinalAgent) or PUFA (PickUpByFinalAgent), then CreditTransferTransactionInformation/CreditorAgent must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeDeliveryAndCreditorAgentRule#forPaymentInstruction20
	 * ConstraintChequeDeliveryAndCreditorAgentRule.forPaymentInstruction20}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction22> forPaymentInstruction22 = new MMConstraint<PaymentInstruction22>() {
		{
			validator = ConstraintChequeDeliveryAndCreditorAgentRule::checkPaymentInstruction22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeDeliveryAndCreditorAgentRule";
			definition = "If PaymentMethod is CHK (Cheque) and CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is present and is equal to MLFA (MailToFinalAgent), CRFA (CourierToFinalAgent), RGFA (RegisteredMailToFinalAgent) or PUFA (PickUpByFinalAgent), then CreditTransferTransactionInformation/CreditorAgent must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeDeliveryAndCreditorAgentRule.forPaymentInstruction20;
			owner_lazy = () -> PaymentInstruction22.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/CreditorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentMethod</leftOperand><rightOperand>Cheque</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"WithInList\"><leftOperand>/CreditTransferTransactionInformation[*]/ChequeInstruction/DeliveryMethod/Code</leftOperand><rightOperand>ChequeDelivery2Code</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If PaymentMethod is CHK and
	 * CreditTransferTransactionInformation/ChequeInstruction
	 * /DeliveryMethod/Code is present and is equal to MLFA, CRFA, RGFA or PUFA,
	 * then CreditTransferTransactionInformation/CreditorAgent must be present.
	 */
	public static void checkPaymentInstructionInformation3(PaymentInstructionInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK and
	 * CreditTransferTransactionInformation/ChequeInstruction
	 * /DeliveryMethod/Code is present and is equal to MLFA, CRFA, RGFA or PUFA,
	 * then CreditTransferTransactionInformation/CreditorAgent must be present.
	 */
	public static void checkPaymentInstruction6(PaymentInstruction6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK and
	 * CreditTransferTransactionInformation/ChequeInstruction
	 * /DeliveryMethod/Code is present and is equal to MLFA, CRFA, RGFA or PUFA,
	 * then CreditTransferTransactionInformation/CreditorAgent must be present.
	 */
	public static void checkPaymentInstruction9(PaymentInstruction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK and
	 * CreditTransferTransactionInformation/ChequeInstruction
	 * /DeliveryMethod/Code is present and is equal to MLFA, CRFA, RGFA or PUFA,
	 * then CreditTransferTransactionInformation/CreditorAgent must be present.
	 */
	public static void checkPaymentInstruction16(PaymentInstruction16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK (Cheque) and
	 * CreditTransferTransactionInformation/
	 * ChequeInstruction/DeliveryMethod/Code is present and is equal to MLFA
	 * (MailToFinalAgent), CRFA (CourierToFinalAgent), RGFA
	 * (RegisteredMailToFinalAgent) or PUFA (PickUpByFinalAgent), then
	 * CreditTransferTransactionInformation/CreditorAgent must be present.
	 */
	public static void checkPaymentInstruction20(PaymentInstruction20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK (Cheque) and
	 * CreditTransferTransactionInformation/
	 * ChequeInstruction/DeliveryMethod/Code is present and is equal to MLFA
	 * (MailToFinalAgent), CRFA (CourierToFinalAgent), RGFA
	 * (RegisteredMailToFinalAgent) or PUFA (PickUpByFinalAgent), then
	 * CreditTransferTransactionInformation/CreditorAgent must be present.
	 */
	public static void checkPaymentInstruction22(PaymentInstruction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}