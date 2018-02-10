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
 * If Long number (Exact5NumericTest) is used, then the report must be a delta
 * reports (UpdateType: DELT). If the report has multiple pages, then the
 * ReportNumber must remain the same through all the pages. It is a unique
 * number to the report. Two reports of the same type sent one after the other
 * to the same receiver in relation to the same safekeeping account must have
 * different ReportNumbers. For example, a daily report sent on day 1 would have
 * ReportNumber 001, on day 2, 002, etc.
 */
public class ConstraintReportNumberRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement15 Statement15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement43
	 * ConstraintReportNumberRule.forStatement43}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement15> forStatement15 = new MMConstraint<Statement15>() {
		{
			validator = ConstraintReportNumberRule::checkStatement15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement43);
			owner_lazy = () -> Statement15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement22 Statement22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement22> forStatement22 = new MMConstraint<Statement22>() {
		{
			validator = ConstraintReportNumberRule::checkStatement22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement20 Statement20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement40
	 * ConstraintReportNumberRule.forStatement40}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement20> forStatement20 = new MMConstraint<Statement20>() {
		{
			validator = ConstraintReportNumberRule::checkStatement20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement40);
			owner_lazy = () -> Statement20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement24 Statement24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement24> forStatement24 = new MMConstraint<Statement24>() {
		{
			validator = ConstraintReportNumberRule::checkStatement24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement21 Statement21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement21> forStatement21 = new MMConstraint<Statement21>() {
		{
			validator = ConstraintReportNumberRule::checkStatement21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement23 Statement23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement23> forStatement23 = new MMConstraint<Statement23>() {
		{
			validator = ConstraintReportNumberRule::checkStatement23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement33 Statement33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement45
	 * ConstraintReportNumberRule.forStatement45}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement33> forStatement33 = new MMConstraint<Statement33>() {
		{
			validator = ConstraintReportNumberRule::checkStatement33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement45);
			owner_lazy = () -> Statement33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement34 Statement34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement34> forStatement34 = new MMConstraint<Statement34>() {
		{
			validator = ConstraintReportNumberRule::checkStatement34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement14 Statement14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement41
	 * ConstraintReportNumberRule.forStatement41}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement14> forStatement14 = new MMConstraint<Statement14>() {
		{
			validator = ConstraintReportNumberRule::checkStatement14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement41);
			owner_lazy = () -> Statement14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement26 Statement26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement26> forStatement26 = new MMConstraint<Statement26>() {
		{
			validator = ConstraintReportNumberRule::checkStatement26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement11 Statement11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement44
	 * ConstraintReportNumberRule.forStatement44}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement11> forStatement11 = new MMConstraint<Statement11>() {
		{
			validator = ConstraintReportNumberRule::checkStatement11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement44);
			owner_lazy = () -> Statement11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement27 Statement27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement27> forStatement27 = new MMConstraint<Statement27>() {
		{
			validator = ConstraintReportNumberRule::checkStatement27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement17 Statement17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement39
	 * ConstraintReportNumberRule.forStatement39}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement17> forStatement17 = new MMConstraint<Statement17>() {
		{
			validator = ConstraintReportNumberRule::checkStatement17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement39);
			owner_lazy = () -> Statement17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement28 Statement28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement28> forStatement28 = new MMConstraint<Statement28>() {
		{
			validator = ConstraintReportNumberRule::checkStatement28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement31 Statement31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement31> forStatement31 = new MMConstraint<Statement31>() {
		{
			validator = ConstraintReportNumberRule::checkStatement31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters1
	 * ReportParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReportParameters1> forReportParameters1 = new MMConstraint<ReportParameters1>() {
		{
			validator = ConstraintReportNumberRule::checkReportParameters1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> ReportParameters1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters3
	 * ReportParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReportParameters3> forReportParameters3 = new MMConstraint<ReportParameters3>() {
		{
			validator = ConstraintReportNumberRule::checkReportParameters3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> ReportParameters3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport1
	 * IntraBalanceReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceReport1> forIntraBalanceReport1 = new MMConstraint<IntraBalanceReport1>() {
		{
			validator = ConstraintReportNumberRule::checkIntraBalanceReport1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> IntraBalanceReport1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionReport1
	 * IntraPositionReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionReport1> forIntraPositionReport1 = new MMConstraint<IntraPositionReport1>() {
		{
			validator = ConstraintReportNumberRule::checkIntraPositionReport1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> IntraPositionReport1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionReport2
	 * IntraPositionReport2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionReport2> forIntraPositionReport2 = new MMConstraint<IntraPositionReport2>() {
		{
			validator = ConstraintReportNumberRule::checkIntraPositionReport2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> IntraPositionReport2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport2
	 * IntraBalanceReport2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceReport2> forIntraBalanceReport2 = new MMConstraint<IntraBalanceReport2>() {
		{
			validator = ConstraintReportNumberRule::checkIntraBalanceReport2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> IntraBalanceReport2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement13 Statement13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the report has multiple pages, the ReportNumber must remain the same through all the pages of the report."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement13> forStatement13 = new MMConstraint<Statement13>() {
		{
			validator = ConstraintReportNumberRule::checkStatement13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, the ReportNumber must remain the same through all the pages of the report.";
			owner_lazy = () -> Statement13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement18 Statement18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the report has multiple pages, the ReportNumber must remain the same through all the pages of the report."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement18> forStatement18 = new MMConstraint<Statement18>() {
		{
			validator = ConstraintReportNumberRule::checkStatement18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, the ReportNumber must remain the same through all the pages of the report.";
			owner_lazy = () -> Statement18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement36 Statement36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement36> forStatement36 = new MMConstraint<Statement36>() {
		{
			validator = ConstraintReportNumberRule::checkStatement36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement41 Statement41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement14
	 * ConstraintReportNumberRule.forStatement14}</li>
	 * </ul>
	 */
	public static final MMConstraint<Statement41> forStatement41 = new MMConstraint<Statement41>() {
		{
			validator = ConstraintReportNumberRule::checkStatement41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement14;
			owner_lazy = () -> Statement41.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement39 Statement39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement17
	 * ConstraintReportNumberRule.forStatement17}</li>
	 * </ul>
	 */
	public static final MMConstraint<Statement39> forStatement39 = new MMConstraint<Statement39>() {
		{
			validator = ConstraintReportNumberRule::checkStatement39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement17;
			owner_lazy = () -> Statement39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement44 Statement44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement11
	 * ConstraintReportNumberRule.forStatement11}</li>
	 * </ul>
	 */
	public static final MMConstraint<Statement44> forStatement44 = new MMConstraint<Statement44>() {
		{
			validator = ConstraintReportNumberRule::checkStatement44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement11;
			owner_lazy = () -> Statement44.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement43 Statement43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement15
	 * ConstraintReportNumberRule.forStatement15}</li>
	 * </ul>
	 */
	public static final MMConstraint<Statement43> forStatement43 = new MMConstraint<Statement43>() {
		{
			validator = ConstraintReportNumberRule::checkStatement43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement15;
			owner_lazy = () -> Statement43.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement45 Statement45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement33
	 * ConstraintReportNumberRule.forStatement33}</li>
	 * </ul>
	 */
	public static final MMConstraint<Statement45> forStatement45 = new MMConstraint<Statement45>() {
		{
			validator = ConstraintReportNumberRule::checkStatement45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement33;
			owner_lazy = () -> Statement45.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement40 Statement40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement20
	 * ConstraintReportNumberRule.forStatement20}</li>
	 * </ul>
	 */
	public static final MMConstraint<Statement40> forStatement40 = new MMConstraint<Statement40>() {
		{
			validator = ConstraintReportNumberRule::checkStatement40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement20;
			owner_lazy = () -> Statement40.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement56 Statement56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement56> forStatement56 = new MMConstraint<Statement56>() {
		{
			validator = ConstraintReportNumberRule::checkStatement56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement55 Statement55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement55> forStatement55 = new MMConstraint<Statement55>() {
		{
			validator = ConstraintReportNumberRule::checkStatement55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement55.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement51 Statement51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement51> forStatement51 = new MMConstraint<Statement51>() {
		{
			validator = ConstraintReportNumberRule::checkStatement51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement49 Statement49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement49> forStatement49 = new MMConstraint<Statement49>() {
		{
			validator = ConstraintReportNumberRule::checkStatement49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement49.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement53 Statement53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement53> forStatement53 = new MMConstraint<Statement53>() {
		{
			validator = ConstraintReportNumberRule::checkStatement53;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement53.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement52 Statement52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement52> forStatement52 = new MMConstraint<Statement52>() {
		{
			validator = ConstraintReportNumberRule::checkStatement52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement52.mmObject();
		}
	};

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement15(Statement15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement22(Statement22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement20(Statement20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement24(Statement24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement21(Statement21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement23(Statement23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement33(Statement33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement34(Statement34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement14(Statement14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement26(Statement26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement11(Statement11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement27(Statement27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement17(Statement17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement28(Statement28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement31(Statement31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkReportParameters1(ReportParameters1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkReportParameters3(ReportParameters3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkIntraBalanceReport1(IntraBalanceReport1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkIntraPositionReport1(IntraPositionReport1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkIntraPositionReport2(IntraPositionReport2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkIntraBalanceReport2(IntraBalanceReport2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the report has multiple pages, the ReportNumber must remain the same
	 * through all the pages of the report.
	 */
	public static void checkStatement13(Statement13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the report has multiple pages, the ReportNumber must remain the same
	 * through all the pages of the report.
	 */
	public static void checkStatement18(Statement18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement36(Statement36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement41(Statement41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement39(Statement39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement44(Statement44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement43(Statement43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement45(Statement45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement40(Statement40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement56(Statement56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement55(Statement55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement51(Statement51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement49(Statement49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement53(Statement53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement52(Statement52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}