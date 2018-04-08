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
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01;

/**
 * If QueryByPeriod is "false" or "0" (No), then QueryTradeIdentification must
 * be present. If QueryByPeriod is "true" or "1" (Yes), then QueryPeriod must be
 * present.
 */
public class ConstraintQueryPeriodandTradeIdentificationRule2 {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01
	 * ForeignExchangeTradeCaptureReportRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryPeriodandTradeIdentificationRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If QueryByPeriod is \"false\" or \"0\" (No), then QueryTradeIdentification must be present. If QueryByPeriod is \"true\" or \"1\" (Yes), then QueryPeriod must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ForeignExchangeTradeCaptureReportRequestV01> for_fxtr_ForeignExchangeTradeCaptureReportRequestV01 = new MMConstraint<ForeignExchangeTradeCaptureReportRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryPeriodandTradeIdentificationRule2";
			definition = "If QueryByPeriod is \"false\" or \"0\" (No), then QueryTradeIdentification must be present. If QueryByPeriod is \"true\" or \"1\" (Yes), then QueryPeriod must be present.";
			owner_lazy = () -> ForeignExchangeTradeCaptureReportRequestV01.mmObject();
		}

		@Override
		public void executeValidator(ForeignExchangeTradeCaptureReportRequestV01 obj) throws Exception {
			check_fxtr_ForeignExchangeTradeCaptureReportRequestV01(obj);
		}
	};

	/**
	 * If QueryByPeriod is "false" or "0" (No), then QueryTradeIdentification
	 * must be present. If QueryByPeriod is "true" or "1" (Yes), then
	 * QueryPeriod must be present.
	 */
	public static void check_fxtr_ForeignExchangeTradeCaptureReportRequestV01(ForeignExchangeTradeCaptureReportRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}