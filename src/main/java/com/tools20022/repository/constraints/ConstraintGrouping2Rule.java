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
import com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV01;
import com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV02;
import com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV02;
import com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV01;

/**
 * If GroupHeader/Grouping is present and equals SNGL, then each occurrence of
 * PaymentInformation must contain one and only one occurrence of
 * PaymentInformation/CreditTransferTransactionInformation.
 */
public class ConstraintGrouping2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV02
	 * CreditorPaymentActivationRequestV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Grouping2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/Grouping is present and equals SNGL, then each occurrence of PaymentInformation must contain one and only one occurrence of PaymentInformation/CreditTransferTransactionInformation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestV02> for_pain_CreditorPaymentActivationRequestV02 = new MMConstraint<CreditorPaymentActivationRequestV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Grouping2Rule";
			definition = "If GroupHeader/Grouping is present and equals SNGL, then each occurrence of PaymentInformation must contain one and only one occurrence of PaymentInformation/CreditTransferTransactionInformation.";
			owner_lazy = () -> CreditorPaymentActivationRequestV02.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestV02 obj) throws Exception {
			check_pain_CreditorPaymentActivationRequestV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV02
	 * CustomerCreditTransferInitiationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Grouping2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/Grouping is present and equals SNGL, then each occurrence of PaymentInformation must contain one and only one occurrence of PaymentInformation/CreditTransferTransactionInformation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerCreditTransferInitiationV02> for_pain_CustomerCreditTransferInitiationV02 = new MMConstraint<CustomerCreditTransferInitiationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Grouping2Rule";
			definition = "If GroupHeader/Grouping is present and equals SNGL, then each occurrence of PaymentInformation must contain one and only one occurrence of PaymentInformation/CreditTransferTransactionInformation.";
			owner_lazy = () -> CustomerCreditTransferInitiationV02.mmObject();
		}

		@Override
		public void executeValidator(CustomerCreditTransferInitiationV02 obj) throws Exception {
			check_pain_CustomerCreditTransferInitiationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV01
	 * CustomerDirectDebitInitiationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Grouping2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/Grouping is present and equals SNGL, then each occurrence of PaymentInformation must contain one and only one occurrence of PaymentInformation/DirectDebitTransactionInformation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerDirectDebitInitiationV01> for_pain_CustomerDirectDebitInitiationV01 = new MMConstraint<CustomerDirectDebitInitiationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Grouping2Rule";
			definition = "If GroupHeader/Grouping is present and equals SNGL, then each occurrence of PaymentInformation must contain one and only one occurrence of PaymentInformation/DirectDebitTransactionInformation.";
			owner_lazy = () -> CustomerDirectDebitInitiationV01.mmObject();
		}

		@Override
		public void executeValidator(CustomerDirectDebitInitiationV01 obj) throws Exception {
			check_pain_CustomerDirectDebitInitiationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV01
	 * CreditorPaymentActivationRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Grouping2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/Grouping is present and equals SNGL, then each occurrence of PaymentInformation must contain one and only one occurrence of PaymentInformation/CreditTransferTransactionInformation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestV01> for_pain_CreditorPaymentActivationRequestV01 = new MMConstraint<CreditorPaymentActivationRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Grouping2Rule";
			definition = "If GroupHeader/Grouping is present and equals SNGL, then each occurrence of PaymentInformation must contain one and only one occurrence of PaymentInformation/CreditTransferTransactionInformation.";
			owner_lazy = () -> CreditorPaymentActivationRequestV01.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestV01 obj) throws Exception {
			check_pain_CreditorPaymentActivationRequestV01(obj);
		}
	};

	/**
	 * If GroupHeader/Grouping is present and equals SNGL, then each occurrence
	 * of PaymentInformation must contain one and only one occurrence of
	 * PaymentInformation/CreditTransferTransactionInformation.
	 */
	public static void check_pain_CreditorPaymentActivationRequestV02(CreditorPaymentActivationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/Grouping is present and equals SNGL, then each occurrence
	 * of PaymentInformation must contain one and only one occurrence of
	 * PaymentInformation/CreditTransferTransactionInformation.
	 */
	public static void check_pain_CustomerCreditTransferInitiationV02(CustomerCreditTransferInitiationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/Grouping is present and equals SNGL, then each occurrence
	 * of PaymentInformation must contain one and only one occurrence of
	 * PaymentInformation/DirectDebitTransactionInformation.
	 */
	public static void check_pain_CustomerDirectDebitInitiationV01(CustomerDirectDebitInitiationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/Grouping is present and equals SNGL, then each occurrence
	 * of PaymentInformation must contain one and only one occurrence of
	 * PaymentInformation/CreditTransferTransactionInformation.
	 */
	public static void check_pain_CreditorPaymentActivationRequestV01(CreditorPaymentActivationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}