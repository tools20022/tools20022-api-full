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
 * If PaymentMethod is CHK, then CreditTransferTransaction/CreditorAccount is
 * not allowed. <br>
 * <br>
 * If PaymentMethod is different from CHK and if
 * CreditTransferTransaction/Creditor is not present, then
 * CreditTransferTransaction/CreditorAccount is mandatory. <br>
 * <br>
 * If PaymentMethod is different from CHK and if
 * CreditTransferTransaction/Creditor is present, then
 * CreditTransferTransaction/CreditorAccount is optional.
 */
public class ConstraintCreditorAndOrCreditorAgentRule {

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
	 * name} = "CreditorAndOrCreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK, then CreditTransferTransaction/CreditorAccount is not allowed. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is not present, then CreditTransferTransaction/CreditorAccount is mandatory. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is present, then CreditTransferTransaction/CreditorAccount is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction5> forPaymentInstruction5 = new MMConstraint<PaymentInstruction5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAndOrCreditorAgentRule";
			definition = "If PaymentMethod is CHK, then CreditTransferTransaction/CreditorAccount is not allowed. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is not present, then CreditTransferTransaction/CreditorAccount is mandatory. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is present, then CreditTransferTransaction/CreditorAccount is optional.";
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8
	 * PaymentInstruction8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAndOrCreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK, then CreditTransferTransaction/CreditorAccount is not allowed. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is not present, then CreditTransferTransaction/CreditorAccount is mandatory. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is present, then CreditTransferTransaction/CreditorAccount is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction8> forPaymentInstruction8 = new MMConstraint<PaymentInstruction8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAndOrCreditorAgentRule";
			definition = "If PaymentMethod is CHK, then CreditTransferTransaction/CreditorAccount is not allowed. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is not present, then CreditTransferTransaction/CreditorAccount is mandatory. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is present, then CreditTransferTransaction/CreditorAccount is optional.";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAndOrCreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK, then CreditTransferTransaction/CreditorAccount is not allowed. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is not present, then CreditTransferTransaction/CreditorAccount is mandatory. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is present, then CreditTransferTransaction/CreditorAccount is optional."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule#forPaymentInstruction17
	 * ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction11> forPaymentInstruction11 = new MMConstraint<PaymentInstruction11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAndOrCreditorAgentRule";
			definition = "If PaymentMethod is CHK, then CreditTransferTransaction/CreditorAccount is not allowed. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is not present, then CreditTransferTransaction/CreditorAccount is mandatory. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is present, then CreditTransferTransaction/CreditorAccount is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction17);
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAndOrCreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK, then CreditTransferTransaction/CreditorAccount is not allowed. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is not present, then CreditTransferTransaction/CreditorAccount is mandatory. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is present, then CreditTransferTransaction/CreditorAccount is optional."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule#forPaymentInstruction19
	 * ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule#forPaymentInstruction11
	 * ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction11}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction17> forPaymentInstruction17 = new MMConstraint<PaymentInstruction17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAndOrCreditorAgentRule";
			definition = "If PaymentMethod is CHK, then CreditTransferTransaction/CreditorAccount is not allowed. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is not present, then CreditTransferTransaction/CreditorAccount is mandatory. \r\n\r\nIf PaymentMethod is different from CHK and if CreditTransferTransaction/Creditor is present, then CreditTransferTransaction/CreditorAccount is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction11;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19
	 * PaymentInstruction19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAndOrCreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK (Cheque), then CreditTransferTransaction/CreditorAccount is not allowed. \r\n\r\nIf PaymentMethod is different from CHK (Cheque) and if CreditTransferTransaction/Creditor is not present, then CreditTransferTransaction/CreditorAccount is mandatory. \r\n\r\nIf PaymentMethod is different from CHK (Cheque) and if CreditTransferTransaction/Creditor is present, then CreditTransferTransaction/CreditorAccount is optional."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule#forPaymentInstruction23
	 * ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule#forPaymentInstruction17
	 * ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction17}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction19> forPaymentInstruction19 = new MMConstraint<PaymentInstruction19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAndOrCreditorAgentRule";
			definition = "If PaymentMethod is CHK (Cheque), then CreditTransferTransaction/CreditorAccount is not allowed. \r\n\r\nIf PaymentMethod is different from CHK (Cheque) and if CreditTransferTransaction/Creditor is not present, then CreditTransferTransaction/CreditorAccount is mandatory. \r\n\r\nIf PaymentMethod is different from CHK (Cheque) and if CreditTransferTransaction/Creditor is present, then CreditTransferTransaction/CreditorAccount is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction17;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAndOrCreditorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentMethod is CHK (Cheque), then CreditTransferTransaction/CreditorAccount is not allowed. \r\n\r\nIf PaymentMethod is different from CHK (Cheque) and if CreditTransferTransaction/Creditor is not present, then CreditTransferTransaction/CreditorAccount is mandatory. \r\n\r\nIf PaymentMethod is different from CHK (Cheque) and if CreditTransferTransaction/Creditor is present, then CreditTransferTransaction/CreditorAccount is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule#forPaymentInstruction19
	 * ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction19}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentInstruction23> forPaymentInstruction23 = new MMConstraint<PaymentInstruction23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAndOrCreditorAgentRule";
			definition = "If PaymentMethod is CHK (Cheque), then CreditTransferTransaction/CreditorAccount is not allowed. \r\n\r\nIf PaymentMethod is different from CHK (Cheque) and if CreditTransferTransaction/Creditor is not present, then CreditTransferTransaction/CreditorAccount is mandatory. \r\n\r\nIf PaymentMethod is different from CHK (Cheque) and if CreditTransferTransaction/Creditor is present, then CreditTransferTransaction/CreditorAccount is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction19;
			owner_lazy = () -> PaymentInstruction23.mmObject();
		}

		@Override
		public void executeValidator(PaymentInstruction23 obj) throws Exception {
			checkPaymentInstruction23(obj);
		}
	};

	/**
	 * If PaymentMethod is CHK, then CreditTransferTransaction/CreditorAccount
	 * is not allowed. <br>
	 * <br>
	 * If PaymentMethod is different from CHK and if
	 * CreditTransferTransaction/Creditor is not present, then
	 * CreditTransferTransaction/CreditorAccount is mandatory. <br>
	 * <br>
	 * If PaymentMethod is different from CHK and if
	 * CreditTransferTransaction/Creditor is present, then
	 * CreditTransferTransaction/CreditorAccount is optional.
	 */
	public static void checkPaymentInstruction5(PaymentInstruction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK, then CreditTransferTransaction/CreditorAccount
	 * is not allowed. <br>
	 * <br>
	 * If PaymentMethod is different from CHK and if
	 * CreditTransferTransaction/Creditor is not present, then
	 * CreditTransferTransaction/CreditorAccount is mandatory. <br>
	 * <br>
	 * If PaymentMethod is different from CHK and if
	 * CreditTransferTransaction/Creditor is present, then
	 * CreditTransferTransaction/CreditorAccount is optional.
	 */
	public static void checkPaymentInstruction8(PaymentInstruction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK, then CreditTransferTransaction/CreditorAccount
	 * is not allowed. <br>
	 * <br>
	 * If PaymentMethod is different from CHK and if
	 * CreditTransferTransaction/Creditor is not present, then
	 * CreditTransferTransaction/CreditorAccount is mandatory. <br>
	 * <br>
	 * If PaymentMethod is different from CHK and if
	 * CreditTransferTransaction/Creditor is present, then
	 * CreditTransferTransaction/CreditorAccount is optional.
	 */
	public static void checkPaymentInstruction11(PaymentInstruction11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK, then CreditTransferTransaction/CreditorAccount
	 * is not allowed. <br>
	 * <br>
	 * If PaymentMethod is different from CHK and if
	 * CreditTransferTransaction/Creditor is not present, then
	 * CreditTransferTransaction/CreditorAccount is mandatory. <br>
	 * <br>
	 * If PaymentMethod is different from CHK and if
	 * CreditTransferTransaction/Creditor is present, then
	 * CreditTransferTransaction/CreditorAccount is optional.
	 */
	public static void checkPaymentInstruction17(PaymentInstruction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK (Cheque), then
	 * CreditTransferTransaction/CreditorAccount is not allowed. <br>
	 * <br>
	 * If PaymentMethod is different from CHK (Cheque) and if
	 * CreditTransferTransaction/Creditor is not present, then
	 * CreditTransferTransaction/CreditorAccount is mandatory. <br>
	 * <br>
	 * If PaymentMethod is different from CHK (Cheque) and if
	 * CreditTransferTransaction/Creditor is present, then
	 * CreditTransferTransaction/CreditorAccount is optional.
	 */
	public static void checkPaymentInstruction19(PaymentInstruction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentMethod is CHK (Cheque), then
	 * CreditTransferTransaction/CreditorAccount is not allowed. <br>
	 * <br>
	 * If PaymentMethod is different from CHK (Cheque) and if
	 * CreditTransferTransaction/Creditor is not present, then
	 * CreditTransferTransaction/CreditorAccount is mandatory. <br>
	 * <br>
	 * If PaymentMethod is different from CHK (Cheque) and if
	 * CreditTransferTransaction/Creditor is present, then
	 * CreditTransferTransaction/CreditorAccount is optional.
	 */
	public static void checkPaymentInstruction23(PaymentInstruction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}