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
import com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV01;
import com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV01;
import com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV01;

/**
 * If GroupHeader/TotalInterbankSettlementAmount is present, then it must equal
 * to the sum of all occurrences of
 * CreditTransferTransactionInformation/InterbankSettlementAmount.
 */
public class ConstraintTotalInterbankSettlementAmount2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV01
	 * FIToFICustomerCreditTransferV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterbankSettlementAmount2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalInterbankSettlementAmount is present, then it must equal to the sum of all occurrences of CreditTransferTransactionInformation/InterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV01> for_pacs_FIToFICustomerCreditTransferV01 = new MMConstraint<FIToFICustomerCreditTransferV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementAmount2Rule";
			definition = "If GroupHeader/TotalInterbankSettlementAmount is present, then it must equal to the sum of all occurrences of CreditTransferTransactionInformation/InterbankSettlementAmount.";
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
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV01
	 * FinancialInstitutionCreditTransferV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterbankSettlementAmount2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalInterbankSettlementAmount is present, then it must equal to the sum of all occurrences of CreditTransferTransactionInformation/InterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV01> for_pacs_FinancialInstitutionCreditTransferV01 = new MMConstraint<FinancialInstitutionCreditTransferV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementAmount2Rule";
			definition = "If GroupHeader/TotalInterbankSettlementAmount is present, then it must equal to the sum of all occurrences of CreditTransferTransactionInformation/InterbankSettlementAmount.";
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
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV01
	 * FIToFICustomerDirectDebitV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterbankSettlementAmount2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalInterbankSettlementAmount is present, then it must be equal to the sum of all occurrences of DirectDebitTransactionInformation/InterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV01> for_pacs_FIToFICustomerDirectDebitV01 = new MMConstraint<FIToFICustomerDirectDebitV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementAmount2Rule";
			definition = "If GroupHeader/TotalInterbankSettlementAmount is present, then it must be equal to the sum of all occurrences of DirectDebitTransactionInformation/InterbankSettlementAmount.";
			owner_lazy = () -> FIToFICustomerDirectDebitV01.mmObject();
		}

		@Override
		public void executeValidator(FIToFICustomerDirectDebitV01 obj) throws Exception {
			check_pacs_FIToFICustomerDirectDebitV01(obj);
		}
	};

	/**
	 * If GroupHeader/TotalInterbankSettlementAmount is present, then it must
	 * equal to the sum of all occurrences of
	 * CreditTransferTransactionInformation/InterbankSettlementAmount.
	 */
	public static void check_pacs_FIToFICustomerCreditTransferV01(FIToFICustomerCreditTransferV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalInterbankSettlementAmount is present, then it must
	 * equal to the sum of all occurrences of
	 * CreditTransferTransactionInformation/InterbankSettlementAmount.
	 */
	public static void check_pacs_FinancialInstitutionCreditTransferV01(FinancialInstitutionCreditTransferV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalInterbankSettlementAmount is present, then it must be
	 * equal to the sum of all occurrences of
	 * DirectDebitTransactionInformation/InterbankSettlementAmount.
	 */
	public static void check_pacs_FIToFICustomerDirectDebitV01(FIToFICustomerDirectDebitV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}