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
import com.tools20022.repository.msg.*;
import java.util.Arrays;

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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportIdentificationRule#forIntraPositionReport4
	 * ConstraintReportIdentificationRule.forIntraPositionReport4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionReport3> forIntraPositionReport3 = new MMConstraint<IntraPositionReport3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentificationRule";
			definition = "If the report has multiple pages, then the ReportIdentification must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different report identifications. For example, a daily report sent on day 1 would have ReportIdentification 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportIdentificationRule.forIntraPositionReport4);
			owner_lazy = () -> IntraPositionReport3.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionReport3 obj) throws Exception {
			checkIntraPositionReport3(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentificationRule";
			definition = "If Long number (Exact5NumericText) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportIdentification must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different report identifications. For example, a daily report sent on day 1 would have ReportIdentification 001, on day 2, 002, etc.";
			owner_lazy = () -> MovementReport1.mmObject();
		}

		@Override
		public void executeValidator(MovementReport1 obj) throws Exception {
			checkMovementReport1(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportIdentificationRule#forSecuritiesReport2
	 * ConstraintReportIdentificationRule.forSecuritiesReport2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesReport1> forSecuritiesReport1 = new MMConstraint<SecuritiesReport1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentificationRule";
			definition = "If Long number (Exact5NumericText) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportIdentification must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different report identifications. For example, a daily report sent on day 1 would have ReportIdentification 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportIdentificationRule.forSecuritiesReport2);
			owner_lazy = () -> SecuritiesReport1.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesReport1 obj) throws Exception {
			checkSecuritiesReport1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionReport4
	 * IntraPositionReport4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportIdentificationRule#forIntraPositionReport3
	 * ConstraintReportIdentificationRule.forIntraPositionReport3}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionReport4> forIntraPositionReport4 = new MMConstraint<IntraPositionReport4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentificationRule";
			definition = "If the report has multiple pages, then the ReportIdentification must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different report identifications. For example, a daily report sent on day 1 would have ReportIdentification 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportIdentificationRule.forIntraPositionReport3;
			owner_lazy = () -> IntraPositionReport4.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionReport4 obj) throws Exception {
			checkIntraPositionReport4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReport2
	 * SecuritiesReport2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportIdentificationRule#forSecuritiesReport1
	 * ConstraintReportIdentificationRule.forSecuritiesReport1}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesReport2> forSecuritiesReport2 = new MMConstraint<SecuritiesReport2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentificationRule";
			definition = "If Long number (Exact5NumericText) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportIdentification must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different report identifications. For example, a daily report sent on day 1 would have ReportIdentification 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportIdentificationRule.forSecuritiesReport1;
			owner_lazy = () -> SecuritiesReport2.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesReport2 obj) throws Exception {
			checkSecuritiesReport2(obj);
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

	/**
	 * If the report has multiple pages, then the ReportIdentification must
	 * remain the same through all the pages. It is a unique number to the
	 * report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * report identifications. For example, a daily report sent on day 1 would
	 * have ReportIdentification 001, on day 2, 002, etc.
	 */
	public static void checkIntraPositionReport4(IntraPositionReport4 obj) throws Exception {
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
	public static void checkSecuritiesReport2(SecuritiesReport2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}