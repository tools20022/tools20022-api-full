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
import com.tools20022.repository.msg.TotalFeesAndTaxes40;

/**
 * One of the elements (TotalOverheadApplied, TotalFees, TotalTaxes,
 * CommercialAgreementReference, IndividualFee, IndividualTax) must be present.
 */
public class ConstraintTransactionOverheadElementRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40
	 * TotalFeesAndTaxes40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOverheadElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of the elements (TotalOverheadApplied, TotalFees, TotalTaxes, CommercialAgreementReference, IndividualFee, IndividualTax) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TotalFeesAndTaxes40> forTotalFeesAndTaxes40 = new MMConstraint<TotalFeesAndTaxes40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOverheadElementRule";
			definition = "One of the elements (TotalOverheadApplied, TotalFees, TotalTaxes, CommercialAgreementReference, IndividualFee, IndividualTax) must be present.";
			owner_lazy = () -> TotalFeesAndTaxes40.mmObject();
		}

		@Override
		public void executeValidator(TotalFeesAndTaxes40 obj) throws Exception {
			checkTotalFeesAndTaxes40(obj);
		}
	};

	/**
	 * One of the elements (TotalOverheadApplied, TotalFees, TotalTaxes,
	 * CommercialAgreementReference, IndividualFee, IndividualTax) must be
	 * present.
	 */
	public static void checkTotalFeesAndTaxes40(TotalFeesAndTaxes40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}