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
import com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV07;

/**
 * If Function is ADVI (Advice) or Function is not present, and
 * Reversal/TransferInConfirmationDetails is present, then EffectiveTransferDate
 * must be present.
 */
public class ConstraintEffectiveTradeDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV07
	 * ReversalOfTransferInConfirmationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveTradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Function is ADVI (Advice) or Function is not present, and Reversal/TransferInConfirmationDetails is present, then EffectiveTransferDate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReversalOfTransferInConfirmationV07> for_sese_ReversalOfTransferInConfirmationV07 = new MMConstraint<ReversalOfTransferInConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveTradeDateRule";
			definition = "If Function is ADVI (Advice) or Function is not present, and Reversal/TransferInConfirmationDetails is present, then EffectiveTransferDate must be present.";
			owner_lazy = () -> ReversalOfTransferInConfirmationV07.mmObject();
		}

		@Override
		public void executeValidator(ReversalOfTransferInConfirmationV07 obj) throws Exception {
			check_sese_ReversalOfTransferInConfirmationV07(obj);
		}
	};

	/**
	 * If Function is ADVI (Advice) or Function is not present, and
	 * Reversal/TransferInConfirmationDetails is present, then
	 * EffectiveTransferDate must be present.
	 */
	public static void check_sese_ReversalOfTransferInConfirmationV07(ReversalOfTransferInConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}