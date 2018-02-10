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
 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is
 * present and is CRFA or MLFA or PUFA or RGFA, then
 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be
 * present if different than CreditTransferTransactionInformation/Creditor.
 */
public class ConstraintChequeInstructionDeliverToCreditorAgentGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRFA or MLFA or PUFA or RGFA, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different than CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation1> forPaymentInstructionInformation1 = new MMConstraint<PaymentInstructionInformation1>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorAgentGuideline::checkPaymentInstructionInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorAgentGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRFA or MLFA or PUFA or RGFA, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different than CreditTransferTransactionInformation/Creditor.";
			owner_lazy = () -> PaymentInstructionInformation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3
	 * PaymentInstructionInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRFA, MLFA, PUFA or RGFA, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation3> forPaymentInstructionInformation3 = new MMConstraint<PaymentInstructionInformation3>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorAgentGuideline::checkPaymentInstructionInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorAgentGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRFA, MLFA, PUFA or RGFA, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor.";
			owner_lazy = () -> PaymentInstructionInformation3.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRFA, MLFA, PUFA or RGFA, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction6> forPaymentInstruction6 = new MMConstraint<PaymentInstruction6>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorAgentGuideline::checkPaymentInstruction6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorAgentGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRFA, MLFA, PUFA or RGFA, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor.";
			owner_lazy = () -> PaymentInstruction6.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRFA, MLFA, PUFA or RGFA, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstruction16
	 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
	 * forPaymentInstruction16}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction9> forPaymentInstruction9 = new MMConstraint<PaymentInstruction9>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorAgentGuideline::checkPaymentInstruction9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorAgentGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRFA, MLFA, PUFA or RGFA, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstruction16);
			owner_lazy = () -> PaymentInstruction9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5
	 * PaymentInstruction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRFA or MLFA or PUFA or RGFA, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than CreditTransferTransaction/Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction5> forPaymentInstruction5 = new MMConstraint<PaymentInstruction5>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorAgentGuideline::checkPaymentInstruction5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorAgentGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRFA or MLFA or PUFA or RGFA, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than CreditTransferTransaction/Creditor.";
			owner_lazy = () -> PaymentInstruction5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8
	 * PaymentInstruction8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRFA or MLFA or PUFA or RGFA, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than CreditTransferTransaction/Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction8> forPaymentInstruction8 = new MMConstraint<PaymentInstruction8>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorAgentGuideline::checkPaymentInstruction8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorAgentGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRFA or MLFA or PUFA or RGFA, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than CreditTransferTransaction/Creditor.";
			owner_lazy = () -> PaymentInstruction8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11
	 * PaymentInstruction11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRFA or MLFA or PUFA or RGFA, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than CreditTransferTransaction/Creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstruction17
	 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
	 * forPaymentInstruction17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction11> forPaymentInstruction11 = new MMConstraint<PaymentInstruction11>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorAgentGuideline::checkPaymentInstruction11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorAgentGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRFA or MLFA or PUFA or RGFA, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than CreditTransferTransaction/Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstruction17);
			owner_lazy = () -> PaymentInstruction11.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRFA, MLFA, PUFA or RGFA, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstruction20
	 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
	 * forPaymentInstruction20}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstruction9
	 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
	 * forPaymentInstruction9}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction16> forPaymentInstruction16 = new MMConstraint<PaymentInstruction16>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorAgentGuideline::checkPaymentInstruction16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorAgentGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRFA, MLFA, PUFA or RGFA, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstruction20);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstruction9;
			owner_lazy = () -> PaymentInstruction16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRFA or MLFA or PUFA or RGFA, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than CreditTransferTransaction/Creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstruction19
	 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
	 * forPaymentInstruction19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstruction11
	 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
	 * forPaymentInstruction11}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction17> forPaymentInstruction17 = new MMConstraint<PaymentInstruction17>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorAgentGuideline::checkPaymentInstruction17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorAgentGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRFA or MLFA or PUFA or RGFA, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than CreditTransferTransaction/Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstruction19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstruction11;
			owner_lazy = () -> PaymentInstruction17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19
	 * PaymentInstruction19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than CreditTransferTransaction/Creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstruction23
	 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
	 * forPaymentInstruction23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstruction17
	 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
	 * forPaymentInstruction17}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction19> forPaymentInstruction19 = new MMConstraint<PaymentInstruction19>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorAgentGuideline::checkPaymentInstruction19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorAgentGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than CreditTransferTransaction/Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstruction23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstruction17;
			owner_lazy = () -> PaymentInstruction19.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstruction22
	 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
	 * forPaymentInstruction22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstruction16
	 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
	 * forPaymentInstruction16}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction20> forPaymentInstruction20 = new MMConstraint<PaymentInstruction20>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorAgentGuideline::checkPaymentInstruction20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorAgentGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstruction22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstruction16;
			owner_lazy = () -> PaymentInstruction20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than CreditTransferTransaction/Creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstruction19
	 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
	 * forPaymentInstruction19}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction23> forPaymentInstruction23 = new MMConstraint<PaymentInstruction23>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorAgentGuideline::checkPaymentInstruction23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorAgentGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than CreditTransferTransaction/Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstruction19;
			owner_lazy = () -> PaymentInstruction23.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToCreditorAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstruction20
	 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
	 * forPaymentInstruction20}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction22> forPaymentInstruction22 = new MMConstraint<PaymentInstruction22>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorAgentGuideline::checkPaymentInstruction22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorAgentGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstruction20;
			owner_lazy = () -> PaymentInstruction22.mmObject();
		}
	};

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and is CRFA or MLFA or PUFA or RGFA, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different than
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstructionInformation1(PaymentInstructionInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and is CRFA, MLFA, PUFA or RGFA, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstructionInformation3(PaymentInstructionInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and is CRFA, MLFA, PUFA or RGFA, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstruction6(PaymentInstruction6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and is CRFA, MLFA, PUFA or RGFA, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstruction9(PaymentInstruction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and is CRFA or MLFA or PUFA or RGFA, then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different than CreditTransferTransaction/Creditor.
	 */
	public static void checkPaymentInstruction5(PaymentInstruction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and is CRFA or MLFA or PUFA or RGFA, then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different than CreditTransferTransaction/Creditor.
	 */
	public static void checkPaymentInstruction8(PaymentInstruction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and is CRFA or MLFA or PUFA or RGFA, then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different than CreditTransferTransaction/Creditor.
	 */
	public static void checkPaymentInstruction11(PaymentInstruction11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and is CRFA, MLFA, PUFA or RGFA, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstruction16(PaymentInstruction16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and is CRFA or MLFA or PUFA or RGFA, then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different than CreditTransferTransaction/Creditor.
	 */
	public static void checkPaymentInstruction17(PaymentInstruction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and is CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA
	 * (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different than CreditTransferTransaction/Creditor.
	 */
	public static void checkPaymentInstruction19(PaymentInstruction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and is CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent),
	 * PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstruction20(PaymentInstruction20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and is CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA
	 * (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different than CreditTransferTransaction/Creditor.
	 */
	public static void checkPaymentInstruction23(PaymentInstruction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and is CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent),
	 * PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstruction22(PaymentInstruction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}