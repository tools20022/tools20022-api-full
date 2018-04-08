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
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04;

/**
 * SettlementSessionIdentifer must only be present in StatusDetails if all of
 * the trades within the bulk sttaus report have been generated from a single
 * settlement session.
 */
public class ConstraintSettlementSessionIdentifierRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04
	 * ForeignExchangeTradeBulkStatusNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSessionIdentifierRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SettlementSessionIdentifer must only be present in StatusDetails if all of the trades within the bulk sttaus report have been generated from a single settlement session."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ForeignExchangeTradeBulkStatusNotificationV04> for_fxtr_ForeignExchangeTradeBulkStatusNotificationV04 = new MMConstraint<ForeignExchangeTradeBulkStatusNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSessionIdentifierRule";
			definition = "SettlementSessionIdentifer must only be present in StatusDetails if all of the trades within the bulk sttaus report have been generated from a single settlement session.";
			owner_lazy = () -> ForeignExchangeTradeBulkStatusNotificationV04.mmObject();
		}

		@Override
		public void executeValidator(ForeignExchangeTradeBulkStatusNotificationV04 obj) throws Exception {
			check_fxtr_ForeignExchangeTradeBulkStatusNotificationV04(obj);
		}
	};

	/**
	 * SettlementSessionIdentifer must only be present in StatusDetails if all
	 * of the trades within the bulk sttaus report have been generated from a
	 * single settlement session.
	 */
	public static void check_fxtr_ForeignExchangeTradeBulkStatusNotificationV04(ForeignExchangeTradeBulkStatusNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}