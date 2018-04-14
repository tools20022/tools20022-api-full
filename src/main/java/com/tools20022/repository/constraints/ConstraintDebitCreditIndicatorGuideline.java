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
import com.tools20022.repository.msg.NumberAndSumOfTransactions2;
import com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1;

/**
 * DebitCreditIndicator should be present when TotalNetEntryAmount is present.
 */
public class ConstraintDebitCreditIndicatorGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1
	 * NumberAndSumOfTransactionsPerBankTransactionCode1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCreditIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DebitCreditIndicator should be present when TotalNetEntryAmount is present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<NumberAndSumOfTransactionsPerBankTransactionCode1> forNumberAndSumOfTransactionsPerBankTransactionCode1 = new MMConstraint<NumberAndSumOfTransactionsPerBankTransactionCode1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCreditIndicatorGuideline";
			definition = "DebitCreditIndicator should be present when TotalNetEntryAmount is present.";
			owner_lazy = () -> NumberAndSumOfTransactionsPerBankTransactionCode1.mmObject();
		}

		@Override
		public void executeValidator(NumberAndSumOfTransactionsPerBankTransactionCode1 obj) throws Exception {
			checkNumberAndSumOfTransactionsPerBankTransactionCode1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions2
	 * NumberAndSumOfTransactions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCreditIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DebitCreditIndicator should be present when TotalNetEntryAmount is present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<NumberAndSumOfTransactions2> forNumberAndSumOfTransactions2 = new MMConstraint<NumberAndSumOfTransactions2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCreditIndicatorGuideline";
			definition = "DebitCreditIndicator should be present when TotalNetEntryAmount is present.";
			owner_lazy = () -> NumberAndSumOfTransactions2.mmObject();
		}

		@Override
		public void executeValidator(NumberAndSumOfTransactions2 obj) throws Exception {
			checkNumberAndSumOfTransactions2(obj);
		}
	};

	/**
	 * DebitCreditIndicator should be present when TotalNetEntryAmount is
	 * present.
	 */
	public static void checkNumberAndSumOfTransactionsPerBankTransactionCode1(NumberAndSumOfTransactionsPerBankTransactionCode1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * DebitCreditIndicator should be present when TotalNetEntryAmount is
	 * present.
	 */
	public static void checkNumberAndSumOfTransactions2(NumberAndSumOfTransactions2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}