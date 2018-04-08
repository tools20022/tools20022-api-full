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
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01;

/**
 * If Request Rejected is "true" or "1" (Yes), then Query Reject Reason must be
 * present.<br>
 * If Request Rejected is "false" or "0" (No), then Total Number Trades and Last
 * Report Requested must be present.
 */
public class ConstraintRequestRejectedRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01
	 * ForeignExchangeTradeCaptureReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestRejectedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Request Rejected is \"true\" or \"1\" (Yes), then Query Reject Reason must be present.\r\nIf Request Rejected is \"false\" or \"0\" (No), then Total Number Trades and Last Report Requested must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ForeignExchangeTradeCaptureReportV01> for_fxtr_ForeignExchangeTradeCaptureReportV01 = new MMConstraint<ForeignExchangeTradeCaptureReportV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestRejectedRule";
			definition = "If Request Rejected is \"true\" or \"1\" (Yes), then Query Reject Reason must be present.\r\nIf Request Rejected is \"false\" or \"0\" (No), then Total Number Trades and Last Report Requested must be present.";
			owner_lazy = () -> ForeignExchangeTradeCaptureReportV01.mmObject();
		}

		@Override
		public void executeValidator(ForeignExchangeTradeCaptureReportV01 obj) throws Exception {
			check_fxtr_ForeignExchangeTradeCaptureReportV01(obj);
		}
	};

	/**
	 * If Request Rejected is "true" or "1" (Yes), then Query Reject Reason must
	 * be present.<br>
	 * If Request Rejected is "false" or "0" (No), then Total Number Trades and
	 * Last Report Requested must be present.
	 */
	public static void check_fxtr_ForeignExchangeTradeCaptureReportV01(ForeignExchangeTradeCaptureReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}