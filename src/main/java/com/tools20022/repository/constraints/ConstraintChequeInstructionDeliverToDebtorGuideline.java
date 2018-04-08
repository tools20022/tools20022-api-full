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
 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and
 * if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is CRDB
 * (CourierToDebtor), MLDB (MailToDebtor), PUDB (PickUpByDebtor) or RGDB
 * (RegisteredMailToDebtor), then
 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if
 * different than Debtor.
 */
public class ConstraintChequeInstructionDeliverToDebtorGuideline {

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
	 * name} = "ChequeInstructionDeliverToDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB (PickUpByDebtor) or RGDB (RegisteredMailToDebtor), then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than Debtor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction23
	 * ConstraintChequeInstructionDeliverToDebtorGuideline.
	 * forPaymentInstruction23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction17
	 * ConstraintChequeInstructionDeliverToDebtorGuideline.
	 * forPaymentInstruction17}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction19> forPaymentInstruction19 = new MMConstraint<PaymentInstruction19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToDebtorGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB (PickUpByDebtor) or RGDB (RegisteredMailToDebtor), then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction17;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3
	 * PaymentInstructionInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB, MLDB, PUDB or RGDB, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from Debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation3> forPaymentInstructionInformation3 = new MMConstraint<PaymentInstructionInformation3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToDebtorGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB, MLDB, PUDB or RGDB, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from Debtor.";
			owner_lazy = () -> PaymentInstructionInformation3.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstructionInformation3 obj) throws Exception {
			checkPaymentInstructionInformation3(obj);
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
	 * name} = "ChequeInstructionDeliverToDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB, MLDB, PUDB or RGDB, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from Debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction6> forPaymentInstruction6 = new MMConstraint<PaymentInstruction6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToDebtorGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB, MLDB, PUDB or RGDB, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from Debtor.";
			owner_lazy = () -> PaymentInstruction6.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction6 obj) throws Exception {
			checkPaymentInstruction6(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB or MLDB or PUDB or RGDB, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different than Debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstructionInformation1> forPaymentInstructionInformation1 = new MMConstraint<PaymentInstructionInformation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToDebtorGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB or MLDB or PUDB or RGDB, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different than Debtor.";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is CRDB or MLDB or PUDB or RGDB, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than Debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction5> forPaymentInstruction5 = new MMConstraint<PaymentInstruction5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToDebtorGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is CRDB or MLDB or PUDB or RGDB, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than Debtor.";
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB (PickUpByDebtor) or RGDB (RegisteredMailToDebtor), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from Debtor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction20
	 * ConstraintChequeInstructionDeliverToDebtorGuideline.
	 * forPaymentInstruction20}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction22> forPaymentInstruction22 = new MMConstraint<PaymentInstruction22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToDebtorGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB (PickUpByDebtor) or RGDB (RegisteredMailToDebtor), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction20;
			owner_lazy = () -> PaymentInstruction22.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction22 obj) throws Exception {
			checkPaymentInstruction22(obj);
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
	 * name} = "ChequeInstructionDeliverToDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB (PickUpByDebtor) or RGDB (RegisteredMailToDebtor), then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than Debtor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction19
	 * ConstraintChequeInstructionDeliverToDebtorGuideline.
	 * forPaymentInstruction19}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction23> forPaymentInstruction23 = new MMConstraint<PaymentInstruction23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToDebtorGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB (PickUpByDebtor) or RGDB (RegisteredMailToDebtor), then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction19;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is CRDB or MLDB or PUDB or RGDB, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than Debtor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction19
	 * ConstraintChequeInstructionDeliverToDebtorGuideline.
	 * forPaymentInstruction19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction11
	 * ConstraintChequeInstructionDeliverToDebtorGuideline.
	 * forPaymentInstruction11}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction17> forPaymentInstruction17 = new MMConstraint<PaymentInstruction17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToDebtorGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is CRDB or MLDB or PUDB or RGDB, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction11;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is CRDB or MLDB or PUDB or RGDB, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than Debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction8> forPaymentInstruction8 = new MMConstraint<PaymentInstruction8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToDebtorGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is CRDB or MLDB or PUDB or RGDB, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than Debtor.";
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB, MLDB, PUDB or RGDB, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from Debtor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction20
	 * ConstraintChequeInstructionDeliverToDebtorGuideline.
	 * forPaymentInstruction20}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction9
	 * ConstraintChequeInstructionDeliverToDebtorGuideline.
	 * forPaymentInstruction9}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction16> forPaymentInstruction16 = new MMConstraint<PaymentInstruction16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToDebtorGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB, MLDB, PUDB or RGDB, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction20);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction9;
			owner_lazy = () -> PaymentInstruction16.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction16 obj) throws Exception {
			checkPaymentInstruction16(obj);
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
	 * name} = "ChequeInstructionDeliverToDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB (PickUpByDebtor) or RGDB (RegisteredMailToDebtor), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from Debtor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction22
	 * ConstraintChequeInstructionDeliverToDebtorGuideline.
	 * forPaymentInstruction22}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction24
	 * ConstraintChequeInstructionDeliverToDebtorGuideline.
	 * forPaymentInstruction24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction16
	 * ConstraintChequeInstructionDeliverToDebtorGuideline.
	 * forPaymentInstruction16}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction20> forPaymentInstruction20 = new MMConstraint<PaymentInstruction20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToDebtorGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB (PickUpByDebtor) or RGDB (RegisteredMailToDebtor), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction22,
					com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction16;
			owner_lazy = () -> PaymentInstruction20.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction20 obj) throws Exception {
			checkPaymentInstruction20(obj);
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
	 * name} = "ChequeInstructionDeliverToDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB, MLDB, PUDB or RGDB, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from Debtor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction16
	 * ConstraintChequeInstructionDeliverToDebtorGuideline.
	 * forPaymentInstruction16}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction9> forPaymentInstruction9 = new MMConstraint<PaymentInstruction9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToDebtorGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB, MLDB, PUDB or RGDB, then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction16);
			owner_lazy = () -> PaymentInstruction9.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction9 obj) throws Exception {
			checkPaymentInstruction9(obj);
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
	 * name} = "ChequeInstructionDeliverToDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is CRDB or MLDB or PUDB or RGDB, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than Debtor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction17
	 * ConstraintChequeInstructionDeliverToDebtorGuideline.
	 * forPaymentInstruction17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction11> forPaymentInstruction11 = new MMConstraint<PaymentInstruction11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToDebtorGuideline";
			definition = "If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is CRDB or MLDB or PUDB or RGDB, then CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present if different than Debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction17);
			owner_lazy = () -> PaymentInstruction11.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction11 obj) throws Exception {
			checkPaymentInstruction11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24
	 * PaymentInstruction24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstructionDeliverToDebtorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB (PickUpByDebtor) or RGDB (RegisteredMailToDebtor), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from Debtor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction20
	 * ConstraintChequeInstructionDeliverToDebtorGuideline.
	 * forPaymentInstruction20}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction24> forPaymentInstruction24 = new MMConstraint<PaymentInstruction24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstructionDeliverToDebtorGuideline";
			definition = "If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod is present and if CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod/Code is CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB (PickUpByDebtor) or RGDB (RegisteredMailToDebtor), then CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only be present if different from Debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction20;
			owner_lazy = () -> PaymentInstruction24.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction24 obj) throws Exception {
			checkPaymentInstruction24(obj);
		}
	};

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is
	 * CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB (PickUpByDebtor) or
	 * RGDB (RegisteredMailToDebtor), then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different than Debtor.
	 */
	public static void checkPaymentInstruction19(PaymentInstruction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and if
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * /Code is CRDB, MLDB, PUDB or RGDB, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from Debtor.
	 */
	public static void checkPaymentInstructionInformation3(PaymentInstructionInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and if
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * /Code is CRDB, MLDB, PUDB or RGDB, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from Debtor.
	 */
	public static void checkPaymentInstruction6(PaymentInstruction6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and if
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * /Code is CRDB or MLDB or PUDB or RGDB, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different than Debtor.
	 */
	public static void checkPaymentInstructionInformation1(PaymentInstructionInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is
	 * CRDB or MLDB or PUDB or RGDB, then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different than Debtor.
	 */
	public static void checkPaymentInstruction5(PaymentInstruction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and if
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * /Code is CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB
	 * (PickUpByDebtor) or RGDB (RegisteredMailToDebtor), then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from Debtor.
	 */
	public static void checkPaymentInstruction22(PaymentInstruction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is
	 * CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB (PickUpByDebtor) or
	 * RGDB (RegisteredMailToDebtor), then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different than Debtor.
	 */
	public static void checkPaymentInstruction23(PaymentInstruction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is
	 * CRDB or MLDB or PUDB or RGDB, then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different than Debtor.
	 */
	public static void checkPaymentInstruction17(PaymentInstruction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is
	 * CRDB or MLDB or PUDB or RGDB, then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different than Debtor.
	 */
	public static void checkPaymentInstruction8(PaymentInstruction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and if
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * /Code is CRDB, MLDB, PUDB or RGDB, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from Debtor.
	 */
	public static void checkPaymentInstruction16(PaymentInstruction16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and if
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * /Code is CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB
	 * (PickUpByDebtor) or RGDB (RegisteredMailToDebtor), then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from Debtor.
	 */
	public static void checkPaymentInstruction20(PaymentInstruction20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and if
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * /Code is CRDB, MLDB, PUDB or RGDB, then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from Debtor.
	 */
	public static void checkPaymentInstruction9(PaymentInstruction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransaction/ChequeInstruction/DeliveryMethod is present
	 * and if CreditTransferTransaction/ChequeInstruction/DeliveryMethod/Code is
	 * CRDB or MLDB or PUDB or RGDB, then
	 * CreditTransferTransaction/ChequeInstruction/DeliverTo may only be present
	 * if different than Debtor.
	 */
	public static void checkPaymentInstruction11(PaymentInstruction11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * is present and if
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliveryMethod
	 * /Code is CRDB (CourierToDebtor), MLDB (MailToDebtor), PUDB
	 * (PickUpByDebtor) or RGDB (RegisteredMailToDebtor), then
	 * CreditTransferTransactionInformation/ChequeInstruction/DeliverTo may only
	 * be present if different from Debtor.
	 */
	public static void checkPaymentInstruction24(PaymentInstruction24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}