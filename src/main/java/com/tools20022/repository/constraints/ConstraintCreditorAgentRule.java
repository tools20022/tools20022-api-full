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
import com.tools20022.repository.area.pacs.PaymentCancellationRequestV01;
import com.tools20022.repository.area.pacs.PaymentStatusReportV02;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If PaymentMethod is CHK (Cheque) and if CreditTransferTransaction/
 * ChequeInstruction/DeliveryMethod is present and is equal to CRFA
 * (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or
 * RGFA (RegisteredMailToFinalAgent), then
 * CreditTransferTransaction/CreditorAgent is mandatory. <br>
 * <br>
 * If PaymentMethod is CHK (Cheque) and if CreditTransferTransaction/
 * ChequeInstruction/DeliveryMethod is not present or is not equal to CRFA
 * (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or
 * RGFA (RegisteredMailToFinalAgent), then
 * CreditTransferTransaction/CreditorAgent is not allowed.
 */
public class ConstraintCreditorAgentRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19
	 * PaymentInstruction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK (Cheque) and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is present and is equal to CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransaction/CreditorAgent is mandatory. \r\n\r\nIf PaymentMethod is CHK (Cheque) and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is not present or is not equal to CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransaction/CreditorAgent is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAgentRule#forPaymentInstruction23
	 * ConstraintCreditorAgentRule.forPaymentInstruction23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAgentRule#forPaymentInstruction17
	 * ConstraintCreditorAgentRule.forPaymentInstruction17}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction19> forPaymentInstruction19 = new MMConstraint<PaymentInstruction19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentRule";
			definition = "If PaymentMethod is CHK (Cheque) and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is present and is equal to CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransaction/CreditorAgent is mandatory. \r\n\r\nIf PaymentMethod is CHK (Cheque) and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is not present or is not equal to CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransaction/CreditorAgent is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCreditorAgentRule.forPaymentInstruction23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCreditorAgentRule.forPaymentInstruction17;
			owner_lazy = () -> PaymentInstruction19.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction19 obj) throws Exception {
			checkPaymentInstruction19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentCancellationRequestV01
	 * PaymentCancellationRequestV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "GroupHeader/CreditorAgent is not allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentCancellationRequestV01> for_pacs_PaymentCancellationRequestV01 = new MMConstraint<PaymentCancellationRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentRule";
			definition = "GroupHeader/CreditorAgent is not allowed.";
			owner_lazy = () -> PaymentCancellationRequestV01.mmObject();
		}

		@Override
		public void executeValidator(PaymentCancellationRequestV01 obj) throws Exception {
			check_pacs_PaymentCancellationRequestV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK and if CreditTransferTransactionInformation/ ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransactionInformation/CreditorAgent is mandatory. \n\nIf PaymentMethod is CHK and if CreditTransferTransactionInformation/ ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransactionInformation/CreditorAgent is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation1> forPaymentInstructionInformation1 = new MMConstraint<PaymentInstructionInformation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentRule";
			definition = "If PaymentMethod is CHK and if CreditTransferTransactionInformation/ ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransactionInformation/CreditorAgent is mandatory. \n\nIf PaymentMethod is CHK and if CreditTransferTransactionInformation/ ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransactionInformation/CreditorAgent is not allowed.";
			owner_lazy = () -> PaymentInstructionInformation1.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstructionInformation1 obj) throws Exception {
			checkPaymentInstructionInformation1(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is mandatory. \r\n\r\nIf PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction5> forPaymentInstruction5 = new MMConstraint<PaymentInstruction5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentRule";
			definition = "If PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is mandatory. \r\n\r\nIf PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is not allowed.";
			owner_lazy = () -> PaymentInstruction5.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction5 obj) throws Exception {
			checkPaymentInstruction5(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK (Cheque) and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is present and is equal to CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransaction/CreditorAgent is mandatory. \r\n\r\nIf PaymentMethod is CHK (Cheque) and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is not present or is not equal to CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransaction/CreditorAgent is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAgentRule#forPaymentInstruction19
	 * ConstraintCreditorAgentRule.forPaymentInstruction19}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction23> forPaymentInstruction23 = new MMConstraint<PaymentInstruction23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentRule";
			definition = "If PaymentMethod is CHK (Cheque) and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is present and is equal to CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransaction/CreditorAgent is mandatory. \r\n\r\nIf PaymentMethod is CHK (Cheque) and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is not present or is not equal to CRFA (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent) or RGFA (RegisteredMailToFinalAgent), then CreditTransferTransaction/CreditorAgent is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCreditorAgentRule.forPaymentInstruction19;
			owner_lazy = () -> PaymentInstruction23.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction23 obj) throws Exception {
			checkPaymentInstruction23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentStatusReportV02
	 * PaymentStatusReportV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "GroupHeader/CreditorAgent is not allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentStatusReportV02> for_pacs_PaymentStatusReportV02 = new MMConstraint<PaymentStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentRule";
			definition = "GroupHeader/CreditorAgent is not allowed.";
			owner_lazy = () -> PaymentStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(PaymentStatusReportV02 obj) throws Exception {
			check_pacs_PaymentStatusReportV02(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is mandatory. \r\n\r\nIf PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAgentRule#forPaymentInstruction19
	 * ConstraintCreditorAgentRule.forPaymentInstruction19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAgentRule#forPaymentInstruction11
	 * ConstraintCreditorAgentRule.forPaymentInstruction11}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction17> forPaymentInstruction17 = new MMConstraint<PaymentInstruction17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentRule";
			definition = "If PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is mandatory. \r\n\r\nIf PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCreditorAgentRule.forPaymentInstruction19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCreditorAgentRule.forPaymentInstruction11;
			owner_lazy = () -> PaymentInstruction17.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction17 obj) throws Exception {
			checkPaymentInstruction17(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is mandatory. \r\n\r\nIf PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction8> forPaymentInstruction8 = new MMConstraint<PaymentInstruction8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentRule";
			definition = "If PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is mandatory. \r\n\r\nIf PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is not allowed.";
			owner_lazy = () -> PaymentInstruction8.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction8 obj) throws Exception {
			checkPaymentInstruction8(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is mandatory. \r\n\r\nIf PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAgentRule#forPaymentInstruction17
	 * ConstraintCreditorAgentRule.forPaymentInstruction17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction11> forPaymentInstruction11 = new MMConstraint<PaymentInstruction11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentRule";
			definition = "If PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is mandatory. \r\n\r\nIf PaymentMethod is CHK and if CreditTransferTransaction/ ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA, CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCreditorAgentRule.forPaymentInstruction17);
			owner_lazy = () -> PaymentInstruction11.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction11 obj) throws Exception {
			checkPaymentInstruction11(obj);
		}
	};

	/**
	 * If PaymentMethod is CHK (Cheque) and if CreditTransferTransaction/
	 * ChequeInstruction/DeliveryMethod is present and is equal to CRFA
	 * (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent)
	 * or RGFA (RegisteredMailToFinalAgent), then
	 * CreditTransferTransaction/CreditorAgent is mandatory. <br>
	 * <br>
	 * If PaymentMethod is CHK (Cheque) and if CreditTransferTransaction/
	 * ChequeInstruction/DeliveryMethod is not present or is not equal to CRFA
	 * (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent)
	 * or RGFA (RegisteredMailToFinalAgent), then
	 * CreditTransferTransaction/CreditorAgent is not allowed.
	 */
	public static void checkPaymentInstruction19(PaymentInstruction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/CreditorAgent is not allowed.
	 */
	public static void check_pacs_PaymentCancellationRequestV01(PaymentCancellationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK and if CreditTransferTransactionInformation/
	 * ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA,
	 * RGFA or PUFA, then CreditTransferTransactionInformation/CreditorAgent is
	 * mandatory.
	 * 
	 * If PaymentMethod is CHK and if CreditTransferTransactionInformation/
	 * ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA,
	 * CRFA, RGFA or PUFA, then
	 * CreditTransferTransactionInformation/CreditorAgent is not allowed.
	 */
	public static void checkPaymentInstructionInformation1(PaymentInstructionInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK and if CreditTransferTransaction/
	 * ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA,
	 * RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is mandatory. <br>
	 * <br>
	 * If PaymentMethod is CHK and if CreditTransferTransaction/
	 * ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA,
	 * CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is not
	 * allowed.
	 */
	public static void checkPaymentInstruction5(PaymentInstruction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK (Cheque) and if CreditTransferTransaction/
	 * ChequeInstruction/DeliveryMethod is present and is equal to CRFA
	 * (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent)
	 * or RGFA (RegisteredMailToFinalAgent), then
	 * CreditTransferTransaction/CreditorAgent is mandatory. <br>
	 * <br>
	 * If PaymentMethod is CHK (Cheque) and if CreditTransferTransaction/
	 * ChequeInstruction/DeliveryMethod is not present or is not equal to CRFA
	 * (CourierToFinalAgent), MLFA (MailToFinalAgent), PUFA (PickUpByFinalAgent)
	 * or RGFA (RegisteredMailToFinalAgent), then
	 * CreditTransferTransaction/CreditorAgent is not allowed.
	 */
	public static void checkPaymentInstruction23(PaymentInstruction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/CreditorAgent is not allowed.
	 */
	public static void check_pacs_PaymentStatusReportV02(PaymentStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK and if CreditTransferTransaction/
	 * ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA,
	 * RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is mandatory. <br>
	 * <br>
	 * If PaymentMethod is CHK and if CreditTransferTransaction/
	 * ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA,
	 * CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is not
	 * allowed.
	 */
	public static void checkPaymentInstruction17(PaymentInstruction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK and if CreditTransferTransaction/
	 * ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA,
	 * RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is mandatory. <br>
	 * <br>
	 * If PaymentMethod is CHK and if CreditTransferTransaction/
	 * ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA,
	 * CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is not
	 * allowed.
	 */
	public static void checkPaymentInstruction8(PaymentInstruction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK and if CreditTransferTransaction/
	 * ChequeInstruction/DeliveryMethod is present and is equal to MLFA, CRFA,
	 * RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is mandatory. <br>
	 * <br>
	 * If PaymentMethod is CHK and if CreditTransferTransaction/
	 * ChequeInstruction/DeliveryMethod is not present or is not equal to MLFA,
	 * CRFA, RGFA or PUFA, then CreditTransferTransaction/CreditorAgent is not
	 * allowed.
	 */
	public static void checkPaymentInstruction11(PaymentInstruction11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}