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
import com.tools20022.repository.msg.IntraPositionReport3;
import com.tools20022.repository.msg.MovementReport1;
import com.tools20022.repository.msg.SecuritiesReport1;

/**
 * If the report has multiple pages, then the ReportIdentification must remain
 * the same through all the pages. It is a unique number to the report.<br>
 * Two reports of the same type sent one after the other to the same receiver in
 * relation to the same safekeeping account must have different report
 * identifications. For example, a daily report sent on day 1 would have
 * ReportIdentification 001, on day 2, 002, etc.
 */
public class ConstraintReportIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionReport3
	 * IntraPositionReport3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the report has multiple pages, then the ReportIdentification must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different report identifications. For example, a daily report sent on day 1 would have ReportIdentification 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionReport3> forIntraPositionReport3 = new MMConstraint<IntraPositionReport3>() {
		{
			validator = ConstraintReportIdentificationRule::checkIntraPositionReport3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentificationRule";
			definition = "If the report has multiple pages, then the ReportIdentification must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different report identifications. For example, a daily report sent on day 1 would have ReportIdentification 001, on day 2, 002, etc.";
			owner_lazy = () -> IntraPositionReport3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MovementReport1
	 * MovementReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericText) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportIdentification must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different report identifications. For example, a daily report sent on day 1 would have ReportIdentification 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MovementReport1> forMovementReport1 = new MMConstraint<MovementReport1>() {
		{
			validator = ConstraintReportIdentificationRule::checkMovementReport1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentificationRule";
			definition = "If Long number (Exact5NumericText) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportIdentification must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different report identifications. For example, a daily report sent on day 1 would have ReportIdentification 001, on day 2, 002, etc.";
			owner_lazy = () -> MovementReport1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReport1
	 * SecuritiesReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericText) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportIdentification must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different report identifications. For example, a daily report sent on day 1 would have ReportIdentification 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesReport1> forSecuritiesReport1 = new MMConstraint<SecuritiesReport1>() {
		{
			validator = ConstraintReportIdentificationRule::checkSecuritiesReport1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentificationRule";
			definition = "If Long number (Exact5NumericText) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportIdentification must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different report identifications. For example, a daily report sent on day 1 would have ReportIdentification 001, on day 2, 002, etc.";
			owner_lazy = () -> SecuritiesReport1.mmObject();
		}
	};

	/**
	 * If the report has multiple pages, then the ReportIdentification must
	 * remain the same through all the pages. It is a unique number to the
	 * report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * report identifications. For example, a daily report sent on day 1 would
	 * have ReportIdentification 001, on day 2, 002, etc.
	 */
	public static void checkIntraPositionReport3(IntraPositionReport3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericText) is used, then the report must be a
	 * delta reports (UpdateType: DELT).<br>
	 * If the report has multiple pages, then the ReportIdentification must
	 * remain the same through all the pages. It is a unique number to the
	 * report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * report identifications. For example, a daily report sent on day 1 would
	 * have ReportIdentification 001, on day 2, 002, etc.
	 */
	public static void checkMovementReport1(MovementReport1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericText) is used, then the report must be a
	 * delta reports (UpdateType: DELT).<br>
	 * If the report has multiple pages, then the ReportIdentification must
	 * remain the same through all the pages. It is a unique number to the
	 * report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * report identifications. For example, a daily report sent on day 1 would
	 * have ReportIdentification 001, on day 2, 002, etc.
	 */
	public static void checkSecuritiesReport1(SecuritiesReport1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}