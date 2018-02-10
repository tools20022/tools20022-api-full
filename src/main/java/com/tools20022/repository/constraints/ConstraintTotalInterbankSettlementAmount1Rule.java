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
 * If GroupHeader/TotalInterbankSettlementAmount is present, then all
 * occurrences of CreditTransferTransactionInformation/InterbankSettlementAmount
 * must have the same currency as the currency of
 * GroupHeader/TotalInterbankSettlementAmount.
 */
public class ConstraintTotalInterbankSettlementAmount1Rule {

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
	 * name} = "TotalInterbankSettlementAmount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalInterbankSettlementAmount is present, then all occurrences of  CreditTransferTransactionInformation/InterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalInterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV01> forFIToFICustomerCreditTransferV01 = new MMConstraint<FIToFICustomerCreditTransferV01>() {
		{
			validator = ConstraintTotalInterbankSettlementAmount1Rule::checkFIToFICustomerCreditTransferV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementAmount1Rule";
			definition = "If GroupHeader/TotalInterbankSettlementAmount is present, then all occurrences of  CreditTransferTransactionInformation/InterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalInterbankSettlementAmount.";
			owner_lazy = () -> FIToFICustomerCreditTransferV01.mmObject();
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
	 * name} = "TotalInterbankSettlementAmount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalInterbankSettlementAmount is present, then all occurrences of  DirectDebitTransactionInformation/InterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalInterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV01> forFIToFICustomerDirectDebitV01 = new MMConstraint<FIToFICustomerDirectDebitV01>() {
		{
			validator = ConstraintTotalInterbankSettlementAmount1Rule::checkFIToFICustomerDirectDebitV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementAmount1Rule";
			definition = "If GroupHeader/TotalInterbankSettlementAmount is present, then all occurrences of  DirectDebitTransactionInformation/InterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalInterbankSettlementAmount.";
			owner_lazy = () -> FIToFICustomerDirectDebitV01.mmObject();
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
	 * name} = "TotalInterbankSettlementAmount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalInterbankSettlementAmount is present, then all occurrences of  CreditTransferTransactionInformation/InterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalInterbankSettlementAmount. \n"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV01> forFinancialInstitutionCreditTransferV01 = new MMConstraint<FinancialInstitutionCreditTransferV01>() {
		{
			validator = ConstraintTotalInterbankSettlementAmount1Rule::checkFinancialInstitutionCreditTransferV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementAmount1Rule";
			definition = "If GroupHeader/TotalInterbankSettlementAmount is present, then all occurrences of  CreditTransferTransactionInformation/InterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalInterbankSettlementAmount. \n";
			owner_lazy = () -> FinancialInstitutionCreditTransferV01.mmObject();
		}
	};

	/**
	 * If GroupHeader/TotalInterbankSettlementAmount is present, then all
	 * occurrences of
	 * CreditTransferTransactionInformation/InterbankSettlementAmount must have
	 * the same currency as the currency of
	 * GroupHeader/TotalInterbankSettlementAmount.
	 */
	public static void checkFIToFICustomerCreditTransferV01(FIToFICustomerCreditTransferV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalInterbankSettlementAmount is present, then all
	 * occurrences of
	 * DirectDebitTransactionInformation/InterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalInterbankSettlementAmount.
	 */
	public static void checkFIToFICustomerDirectDebitV01(FIToFICustomerDirectDebitV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalInterbankSettlementAmount is present, then all
	 * occurrences of
	 * CreditTransferTransactionInformation/InterbankSettlementAmount must have
	 * the same currency as the currency of
	 * GroupHeader/TotalInterbankSettlementAmount.
	 */
	public static void checkFinancialInstitutionCreditTransferV01(FinancialInstitutionCreditTransferV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}