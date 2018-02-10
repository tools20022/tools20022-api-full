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
 * If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/
 * DeliveryMethod is present and is CRCD or MLCD or PUCD or RGCD, then
 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be
 * present if different from CreditTransferTransactionInformation/Creditor.
 */
public class ConstraintChequeInstructionDeliverToCreditorGuideline {

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
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD or MLCD or PUCD or RGCD, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation1> forPaymentInstructionInformation1 = new MMConstraint<PaymentInstructionInformation1>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorGuideline::checkPaymentInstructionInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD or MLCD or PUCD or RGCD, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor.";
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
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD, MLCD, PUCD or RGCD, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation3> forPaymentInstructionInformation3 = new MMConstraint<PaymentInstructionInformation3>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorGuideline::checkPaymentInstructionInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD, MLCD, PUCD or RGCD, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor.";
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
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD, MLCD, PUCD or RGCD, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction6> forPaymentInstruction6 = new MMConstraint<PaymentInstruction6>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorGuideline::checkPaymentInstruction6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD, MLCD, PUCD or RGCD, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor.";
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
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD, MLCD, PUCD or RGCD, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstruction16
	 * ConstraintChequeInstructionDeliverToCreditorGuideline.
	 * forPaymentInstruction16}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction9> forPaymentInstruction9 = new MMConstraint<PaymentInstruction9>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorGuideline::checkPaymentInstruction9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD, MLCD, PUCD or RGCD, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction16);
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
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRCD or MLCD or PUCD or RGCD, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransaction/Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction5> forPaymentInstruction5 = new MMConstraint<PaymentInstruction5>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorGuideline::checkPaymentInstruction5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRCD or MLCD or PUCD or RGCD, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransaction/Creditor.";
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
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRCD or MLCD or PUCD or RGCD, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransaction/Creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction8> forPaymentInstruction8 = new MMConstraint<PaymentInstruction8>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorGuideline::checkPaymentInstruction8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRCD or MLCD or PUCD or RGCD, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransaction/Creditor.";
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
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRCD or MLCD or PUCD or RGCD, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransaction/Creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstruction17
	 * ConstraintChequeInstructionDeliverToCreditorGuideline.
	 * forPaymentInstruction17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction11> forPaymentInstruction11 = new MMConstraint<PaymentInstruction11>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorGuideline::checkPaymentInstruction11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRCD or MLCD or PUCD or RGCD, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransaction/Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction17);
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
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD, MLCD, PUCD or RGCD, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstruction20
	 * ConstraintChequeInstructionDeliverToCreditorGuideline.
	 * forPaymentInstruction20}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstruction9
	 * ConstraintChequeInstructionDeliverToCreditorGuideline.
	 * forPaymentInstruction9}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction16> forPaymentInstruction16 = new MMConstraint<PaymentInstruction16>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorGuideline::checkPaymentInstruction16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD, MLCD, PUCD or RGCD, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction20);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction9;
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
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRCD or MLCD or PUCD or RGCD, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransaction/Creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstruction19
	 * ConstraintChequeInstructionDeliverToCreditorGuideline.
	 * forPaymentInstruction19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstruction11
	 * ConstraintChequeInstructionDeliverToCreditorGuideline.
	 * forPaymentInstruction11}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction17> forPaymentInstruction17 = new MMConstraint<PaymentInstruction17>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorGuideline::checkPaymentInstruction17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRCD or MLCD or PUCD or RGCD, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransaction/Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction11;
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
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransaction/Creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstruction23
	 * ConstraintChequeInstructionDeliverToCreditorGuideline.
	 * forPaymentInstruction23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstruction17
	 * ConstraintChequeInstructionDeliverToCreditorGuideline.
	 * forPaymentInstruction17}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction19> forPaymentInstruction19 = new MMConstraint<PaymentInstruction19>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorGuideline::checkPaymentInstruction19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransaction/Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction17;
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
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstruction22
	 * ConstraintChequeInstructionDeliverToCreditorGuideline.
	 * forPaymentInstruction22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstruction16
	 * ConstraintChequeInstructionDeliverToCreditorGuideline.
	 * forPaymentInstruction16}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction20> forPaymentInstruction20 = new MMConstraint<PaymentInstruction20>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorGuideline::checkPaymentInstruction20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction16;
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
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransaction/Creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstruction19
	 * ConstraintChequeInstructionDeliverToCreditorGuideline.
	 * forPaymentInstruction19}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction23> forPaymentInstruction23 = new MMConstraint<PaymentInstruction23>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorGuideline::checkPaymentInstruction23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransaction/Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction19;
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
	 * name} = "ChequeInstructionDeliverToCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstruction20
	 * ConstraintChequeInstructionDeliverToCreditorGuideline.
	 * forPaymentInstruction20}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction22> forPaymentInstruction22 = new MMConstraint<PaymentInstruction22>() {
		{
			validator = ConstraintChequeInstructionDeliverToCreditorGuideline::checkPaymentInstruction22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToCreditorGuideline";
			definition = "If PaymentInformation/CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from CreditTransferTransactionInformation/Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction20;
			owner_lazy = () -> PaymentInstruction22.mmObject();
		}
	};

	/**
	 * If PaymentInformation/CreditTransferTransactionInformation/
	 * ChequeInstruction/DeliveryMethod is present and is CRCD or MLCD or PUCD
	 * or RGCD, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstructionInformation1(PaymentInstructionInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformation/CreditTransferTransactionInformation/
	 * ChequeInstruction/DeliveryMethod is present and is CRCD, MLCD, PUCD or
	 * RGCD, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstructionInformation3(PaymentInstructionInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformation/CreditTransferTransactionInformation/
	 * ChequeInstruction/DeliveryMethod is present and is CRCD, MLCD, PUCD or
	 * RGCD, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstruction6(PaymentInstruction6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformation/CreditTransferTransactionInformation/
	 * ChequeInstruction/DeliveryMethod is present and is CRCD, MLCD, PUCD or
	 * RGCD, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstruction9(PaymentInstruction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and is CRCD or MLCD or PUCD or RGCD, then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different from CreditTransferTransaction/Creditor.
	 */
	public static void checkPaymentInstruction5(PaymentInstruction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and is CRCD or MLCD or PUCD or RGCD, then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different from CreditTransferTransaction/Creditor.
	 */
	public static void checkPaymentInstruction8(PaymentInstruction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and is CRCD or MLCD or PUCD or RGCD, then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different from CreditTransferTransaction/Creditor.
	 */
	public static void checkPaymentInstruction11(PaymentInstruction11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformation/CreditTransferTransactionInformation/
	 * ChequeInstruction/DeliveryMethod is present and is CRCD, MLCD, PUCD or
	 * RGCD, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstruction16(PaymentInstruction16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and is CRCD or MLCD or PUCD or RGCD, then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different from CreditTransferTransaction/Creditor.
	 */
	public static void checkPaymentInstruction17(PaymentInstruction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD
	 * (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different from CreditTransferTransaction/Creditor.
	 */
	public static void checkPaymentInstruction19(PaymentInstruction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformation/CreditTransferTransactionInformation/
	 * ChequeInstruction/DeliveryMethod is present and is CRCD
	 * (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or
	 * RGCD (RegisteredMailToCreditor), then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstruction20(PaymentInstruction20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and is CRCD (CourierToCreditor), MLCD (MailToCreditor), PUCD
	 * (PickUpByCreditor) or RGCD (RegisteredMailToCreditor), then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different from CreditTransferTransaction/Creditor.
	 */
	public static void checkPaymentInstruction23(PaymentInstruction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformation/CreditTransferTransactionInformation/
	 * ChequeInstruction/DeliveryMethod is present and is CRCD
	 * (CourierToCreditor), MLCD (MailToCreditor), PUCD (PickUpByCreditor) or
	 * RGCD (RegisteredMailToCreditor), then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from
	 * CreditTransferTransactionInformation/Creditor.
	 */
	public static void checkPaymentInstruction22(PaymentInstruction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}