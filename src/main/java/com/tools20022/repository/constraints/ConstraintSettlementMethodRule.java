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
import com.tools20022.repository.area.pacs.FIToFIPaymentReversalV01;
import com.tools20022.repository.area.pacs.PaymentReturnV01;

/**
 * GroupHeader/SettlementInformation/SettlementMethod/COVE is not allowed when
 * returning direct debit transactions.
 */
public class ConstraintSettlementMethodRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV01
	 * FIToFIPaymentReversalV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod/COVE is not allowed when returning direct debit transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV01> forFIToFIPaymentReversalV01 = new MMConstraint<FIToFIPaymentReversalV01>() {
		{
			validator = ConstraintSettlementMethodRule::checkFIToFIPaymentReversalV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod/COVE is not allowed when returning direct debit transactions.";
			owner_lazy = () -> FIToFIPaymentReversalV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV01
	 * PaymentReturnV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/SettlementInformation/SettlementMethod/COVE is not allowed when returning direct debit transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV01> forPaymentReturnV01 = new MMConstraint<PaymentReturnV01>() {
		{
			validator = ConstraintSettlementMethodRule::checkPaymentReturnV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethodRule";
			definition = "GroupHeader/SettlementInformation/SettlementMethod/COVE is not allowed when returning direct debit transactions.";
			owner_lazy = () -> PaymentReturnV01.mmObject();
		}
	};

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod/COVE is not allowed
	 * when returning direct debit transactions.
	 */
	public static void checkFIToFIPaymentReversalV01(FIToFIPaymentReversalV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/SettlementInformation/SettlementMethod/COVE is not allowed
	 * when returning direct debit transactions.
	 */
	public static void checkPaymentReturnV01(PaymentReturnV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}