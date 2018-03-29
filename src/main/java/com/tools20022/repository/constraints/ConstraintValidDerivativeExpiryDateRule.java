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
import com.tools20022.repository.msg.SecuritiesReferenceDataReport5;

/**
 * DerivativesInstrumentAttributes/ExpiryDate cannot be a date earlier than
 * TradingVenueRelatedAttributes/FirstTradeDate,
 * TradingVenueRelatedAttributes/RequestForAdmissionDate or
 * TradingVenueRelatedAttributes/AdmissionApprovalDate.
 */
public class ConstraintValidDerivativeExpiryDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
	 * SecuritiesReferenceDataReport5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidDerivativeExpiryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DerivativesInstrumentAttributes/ExpiryDate cannot be a date earlier than TradingVenueRelatedAttributes/FirstTradeDate, TradingVenueRelatedAttributes/RequestForAdmissionDate or TradingVenueRelatedAttributes/AdmissionApprovalDate."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesReferenceDataReport5> forSecuritiesReferenceDataReport5 = new MMConstraint<SecuritiesReferenceDataReport5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidDerivativeExpiryDateRule";
			definition = "DerivativesInstrumentAttributes/ExpiryDate cannot be a date earlier than TradingVenueRelatedAttributes/FirstTradeDate, TradingVenueRelatedAttributes/RequestForAdmissionDate or TradingVenueRelatedAttributes/AdmissionApprovalDate.";
			owner_lazy = () -> SecuritiesReferenceDataReport5.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesReferenceDataReport5 obj) throws Exception {
			checkSecuritiesReferenceDataReport5(obj);
		}
	};

	/**
	 * DerivativesInstrumentAttributes/ExpiryDate cannot be a date earlier than
	 * TradingVenueRelatedAttributes/FirstTradeDate,
	 * TradingVenueRelatedAttributes/RequestForAdmissionDate or
	 * TradingVenueRelatedAttributes/AdmissionApprovalDate.
	 */
	public static void checkSecuritiesReferenceDataReport5(SecuritiesReferenceDataReport5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}