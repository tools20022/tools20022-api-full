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
import com.tools20022.repository.area.pacs.*;
import com.tools20022.repository.msg.CreditTransferTransaction9;

/**
 * If GroupHeader/InterbankSettlementDate is present, then
 * TransactionInformation/InterbankSettlementDate is not allowed. If
 * GroupHeader/InterbankSettlementDate is not present, then
 * TransactionInformation/InterbankSettlementDate must be present.
 */
public class ConstraintInterbankSettlementDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV01
	 * PaymentReturnV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed. \nIf GroupHeader/InterbankSettlementDate is not present, then TransactionInformation/InterbankSettlementDate must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV01> for_pacs_PaymentReturnV01 = new MMConstraint<PaymentReturnV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed. \nIf GroupHeader/InterbankSettlementDate is not present, then TransactionInformation/InterbankSettlementDate must be present.";
			owner_lazy = () -> PaymentReturnV01.mmObject();
		}

		@Override
		public void executeValidator(PaymentReturnV01 obj) throws Exception {
			check_pacs_PaymentReturnV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV01
	 * FIToFICustomerCreditTransferV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed. \nIf GroupHeader/InterbankSettlementDate is not present, then CreditTransferTransactionInformation/InterbankSettlementDate must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV01> for_pacs_FIToFICustomerCreditTransferV01 = new MMConstraint<FIToFICustomerCreditTransferV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed. \nIf GroupHeader/InterbankSettlementDate is not present, then CreditTransferTransactionInformation/InterbankSettlementDate must be present.";
			owner_lazy = () -> FIToFICustomerCreditTransferV01.mmObject();
		}

		@Override
		public void executeValidator(FIToFICustomerCreditTransferV01 obj) throws Exception {
			check_pacs_FIToFICustomerCreditTransferV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9
	 * CreditTransferTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/DirectDebitTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction9> forCreditTransferTransaction9 = new MMConstraint<CreditTransferTransaction9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDateRule";
			definition = "If InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.";
			owner_lazy = () -> CreditTransferTransaction9.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/DirectDebitTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CreditTransferTransaction9 obj) throws Exception {
			checkCreditTransferTransaction9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV01
	 * FinancialInstitutionCreditTransferV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed. \nIf GroupHeader/InterbankSettlementDate is not present, then CreditTransferTransactionInformation/InterbankSettlementDate must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV01> for_pacs_FinancialInstitutionCreditTransferV01 = new MMConstraint<FinancialInstitutionCreditTransferV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed. \nIf GroupHeader/InterbankSettlementDate is not present, then CreditTransferTransactionInformation/InterbankSettlementDate must be present.";
			owner_lazy = () -> FinancialInstitutionCreditTransferV01.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstitutionCreditTransferV01 obj) throws Exception {
			check_pacs_FinancialInstitutionCreditTransferV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV01
	 * FIToFIPaymentReversalV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed. \nIf GroupHeader/InterbankSettlementDate is not present, then TransactionInformation/InterbankSettlementDate must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV01> for_pacs_FIToFIPaymentReversalV01 = new MMConstraint<FIToFIPaymentReversalV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then TransactionInformation/InterbankSettlementDate is not allowed. \nIf GroupHeader/InterbankSettlementDate is not present, then TransactionInformation/InterbankSettlementDate must be present.";
			owner_lazy = () -> FIToFIPaymentReversalV01.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentReversalV01 obj) throws Exception {
			check_pacs_FIToFIPaymentReversalV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV01
	 * FIToFICustomerDirectDebitV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed. \nIf GroupHeader/InterbankSettlementDate is not present, then DirectDebitTransactionInformation/InterbankSettlementDate must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV01> for_pacs_FIToFICustomerDirectDebitV01 = new MMConstraint<FIToFICustomerDirectDebitV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then DirectDebitTransactionInformation/InterbankSettlementDate is not allowed. \nIf GroupHeader/InterbankSettlementDate is not present, then DirectDebitTransactionInformation/InterbankSettlementDate must be present.";
			owner_lazy = () -> FIToFICustomerDirectDebitV01.mmObject();
		}

		@Override
		public void executeValidator(FIToFICustomerDirectDebitV01 obj) throws Exception {
			check_pacs_FIToFICustomerDirectDebitV01(obj);
		}
	};

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed. If
	 * GroupHeader/InterbankSettlementDate is not present, then
	 * TransactionInformation/InterbankSettlementDate must be present.
	 */
	public static void check_pacs_PaymentReturnV01(PaymentReturnV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed. If GroupHeader/InterbankSettlementDate is not present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate must be
	 * present.
	 */
	public static void check_pacs_FIToFICustomerCreditTransferV01(FIToFICustomerCreditTransferV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InterbankSettlementDate is present, then
	 * DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.
	 */
	public static void checkCreditTransferTransaction9(CreditTransferTransaction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed. If GroupHeader/InterbankSettlementDate is not present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate must be
	 * present.
	 */
	public static void check_pacs_FinancialInstitutionCreditTransferV01(FinancialInstitutionCreditTransferV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * TransactionInformation/InterbankSettlementDate is not allowed. If
	 * GroupHeader/InterbankSettlementDate is not present, then
	 * TransactionInformation/InterbankSettlementDate must be present.
	 */
	public static void check_pacs_FIToFIPaymentReversalV01(FIToFIPaymentReversalV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * DirectDebitTransactionInformation/InterbankSettlementDate is not allowed.
	 * If GroupHeader/InterbankSettlementDate is not present, then
	 * DirectDebitTransactionInformation/InterbankSettlementDate must be
	 * present.
	 */
	public static void check_pacs_FIToFICustomerDirectDebitV01(FIToFICustomerDirectDebitV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}