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
 * reports (UpdateType: DELT).<br>
 * If the report has multiple pages, then the ReportNumber must remain the same
 * through all the pages. It is a unique number to the report.<br>
 * Two reports of the same type sent one after the other to the same receiver in
 * relation to the same safekeeping account must have different ReportNumbers.
 * For example, a daily report sent on day 1 would have ReportNumber 001, on day
 * 2, 002.
 */
public class ConstraintReportNumberRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement67 Statement67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement67> forStatement67 = new MMConstraint<Statement67>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002.";
			owner_lazy = () -> Statement67.mmObject();
		}

		@Override
		public void executeValidator(Statement67 obj) throws Exception {
			checkStatement67(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement45);
			owner_lazy = () -> Statement33.mmObject();
		}

		@Override
		public void executeValidator(Statement33 obj) throws Exception {
			checkStatement33(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement40);
			owner_lazy = () -> Statement20.mmObject();
		}

		@Override
		public void executeValidator(Statement20 obj) throws Exception {
			checkStatement20(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement21.mmObject();
		}

		@Override
		public void executeValidator(Statement21 obj) throws Exception {
			checkStatement21(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement55.mmObject();
		}

		@Override
		public void executeValidator(Statement55 obj) throws Exception {
			checkStatement55(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement34.mmObject();
		}

		@Override
		public void executeValidator(Statement34 obj) throws Exception {
			checkStatement34(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> ReportParameters3.mmObject();
		}

		@Override
		public void executeValidator(ReportParameters3 obj) throws Exception {
			checkReportParameters3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement64 Statement64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement41
	 * ConstraintReportNumberRule.forStatement41}</li>
	 * </ul>
	 */
	public static final MMConstraint<Statement64> forStatement64 = new MMConstraint<Statement64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement41;
			owner_lazy = () -> Statement64.mmObject();
		}

		@Override
		public void executeValidator(Statement64 obj) throws Exception {
			checkStatement64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement58 Statement58}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement36
	 * ConstraintReportNumberRule.forStatement36}</li>
	 * </ul>
	 */
	public static final MMConstraint<Statement58> forStatement58 = new MMConstraint<Statement58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement36;
			owner_lazy = () -> Statement58.mmObject();
		}

		@Override
		public void executeValidator(Statement58 obj) throws Exception {
			checkStatement58(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, the ReportNumber must remain the same through all the pages of the report.";
			owner_lazy = () -> Statement13.mmObject();
		}

		@Override
		public void executeValidator(Statement13 obj) throws Exception {
			checkStatement13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement63 Statement63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement39
	 * ConstraintReportNumberRule.forStatement39}</li>
	 * </ul>
	 */
	public static final MMConstraint<Statement63> forStatement63 = new MMConstraint<Statement63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement39;
			owner_lazy = () -> Statement63.mmObject();
		}

		@Override
		public void executeValidator(Statement63 obj) throws Exception {
			checkStatement63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3
	 * IntraBalanceReport3}</li>
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forIntraBalanceReport1
	 * ConstraintReportNumberRule.forIntraBalanceReport1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceReport3> forIntraBalanceReport3 = new MMConstraint<IntraBalanceReport3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forIntraBalanceReport1;
			owner_lazy = () -> IntraBalanceReport3.mmObject();
		}

		@Override
		public void executeValidator(IntraBalanceReport3 obj) throws Exception {
			checkIntraBalanceReport3(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement20;
			owner_lazy = () -> Statement40.mmObject();
		}

		@Override
		public void executeValidator(Statement40 obj) throws Exception {
			checkStatement40(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement22.mmObject();
		}

		@Override
		public void executeValidator(Statement22 obj) throws Exception {
			checkStatement22(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement58
	 * ConstraintReportNumberRule.forStatement58}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement36> forStatement36 = new MMConstraint<Statement36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement58);
			owner_lazy = () -> Statement36.mmObject();
		}

		@Override
		public void executeValidator(Statement36 obj) throws Exception {
			checkStatement36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement70 Statement70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement70> forStatement70 = new MMConstraint<Statement70>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002.";
			owner_lazy = () -> Statement70.mmObject();
		}

		@Override
		public void executeValidator(Statement70 obj) throws Exception {
			checkStatement70(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionReport5
	 * IntraPositionReport5}</li>
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forIntraPositionReport2
	 * ConstraintReportNumberRule.forIntraPositionReport2}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionReport5> forIntraPositionReport5 = new MMConstraint<IntraPositionReport5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forIntraPositionReport2;
			owner_lazy = () -> IntraPositionReport5.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionReport5 obj) throws Exception {
			checkIntraPositionReport5(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forIntraBalanceReport3
	 * ConstraintReportNumberRule.forIntraBalanceReport3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceReport1> forIntraBalanceReport1 = new MMConstraint<IntraBalanceReport1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forIntraBalanceReport3);
			owner_lazy = () -> IntraBalanceReport1.mmObject();
		}

		@Override
		public void executeValidator(IntraBalanceReport1 obj) throws Exception {
			checkIntraBalanceReport1(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, the ReportNumber must remain the same through all the pages of the report.";
			owner_lazy = () -> Statement18.mmObject();
		}

		@Override
		public void executeValidator(Statement18 obj) throws Exception {
			checkStatement18(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement60
	 * ConstraintReportNumberRule.forStatement60}</li>
	 * </ul>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement60);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement15;
			owner_lazy = () -> Statement43.mmObject();
		}

		@Override
		public void executeValidator(Statement43 obj) throws Exception {
			checkStatement43(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement23.mmObject();
		}

		@Override
		public void executeValidator(Statement23 obj) throws Exception {
			checkStatement23(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement39);
			owner_lazy = () -> Statement17.mmObject();
		}

		@Override
		public void executeValidator(Statement17 obj) throws Exception {
			checkStatement17(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement53.mmObject();
		}

		@Override
		public void executeValidator(Statement53 obj) throws Exception {
			checkStatement53(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement61 Statement61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement44
	 * ConstraintReportNumberRule.forStatement44}</li>
	 * </ul>
	 */
	public static final MMConstraint<Statement61> forStatement61 = new MMConstraint<Statement61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement44;
			owner_lazy = () -> Statement61.mmObject();
		}

		@Override
		public void executeValidator(Statement61 obj) throws Exception {
			checkStatement61(obj);
		}
	};
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement43);
			owner_lazy = () -> Statement15.mmObject();
		}

		@Override
		public void executeValidator(Statement15 obj) throws Exception {
			checkStatement15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement71 Statement71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement71> forStatement71 = new MMConstraint<Statement71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002.";
			owner_lazy = () -> Statement71.mmObject();
		}

		@Override
		public void executeValidator(Statement71 obj) throws Exception {
			checkStatement71(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement31.mmObject();
		}

		@Override
		public void executeValidator(Statement31 obj) throws Exception {
			checkStatement31(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement49.mmObject();
		}

		@Override
		public void executeValidator(Statement49 obj) throws Exception {
			checkStatement49(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement63
	 * ConstraintReportNumberRule.forStatement63}</li>
	 * </ul>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement63);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement17;
			owner_lazy = () -> Statement39.mmObject();
		}

		@Override
		public void executeValidator(Statement39 obj) throws Exception {
			checkStatement39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement60 Statement60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement43
	 * ConstraintReportNumberRule.forStatement43}</li>
	 * </ul>
	 */
	public static final MMConstraint<Statement60> forStatement60 = new MMConstraint<Statement60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement43;
			owner_lazy = () -> Statement60.mmObject();
		}

		@Override
		public void executeValidator(Statement60 obj) throws Exception {
			checkStatement60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement69 Statement69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement69> forStatement69 = new MMConstraint<Statement69>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002.";
			owner_lazy = () -> Statement69.mmObject();
		}

		@Override
		public void executeValidator(Statement69 obj) throws Exception {
			checkStatement69(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement24.mmObject();
		}

		@Override
		public void executeValidator(Statement24 obj) throws Exception {
			checkStatement24(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement52.mmObject();
		}

		@Override
		public void executeValidator(Statement52 obj) throws Exception {
			checkStatement52(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forIntraPositionReport5
	 * ConstraintReportNumberRule.forIntraPositionReport5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionReport2> forIntraPositionReport2 = new MMConstraint<IntraPositionReport2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forIntraPositionReport5);
			owner_lazy = () -> IntraPositionReport2.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionReport2 obj) throws Exception {
			checkIntraPositionReport2(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement41);
			owner_lazy = () -> Statement14.mmObject();
		}

		@Override
		public void executeValidator(Statement14 obj) throws Exception {
			checkStatement14(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement28.mmObject();
		}

		@Override
		public void executeValidator(Statement28 obj) throws Exception {
			checkStatement28(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement61
	 * ConstraintReportNumberRule.forStatement61}</li>
	 * </ul>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement61);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement11;
			owner_lazy = () -> Statement44.mmObject();
		}

		@Override
		public void executeValidator(Statement44 obj) throws Exception {
			checkStatement44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionReport6
	 * IntraPositionReport6}</li>
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forIntraPositionReport1
	 * ConstraintReportNumberRule.forIntraPositionReport1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionReport6> forIntraPositionReport6 = new MMConstraint<IntraPositionReport6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forIntraPositionReport1;
			owner_lazy = () -> IntraPositionReport6.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionReport6 obj) throws Exception {
			checkIntraPositionReport6(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forIntraPositionReport6
	 * ConstraintReportNumberRule.forIntraPositionReport6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionReport1> forIntraPositionReport1 = new MMConstraint<IntraPositionReport1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forIntraPositionReport6);
			owner_lazy = () -> IntraPositionReport1.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionReport1 obj) throws Exception {
			checkIntraPositionReport1(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement56.mmObject();
		}

		@Override
		public void executeValidator(Statement56 obj) throws Exception {
			checkStatement56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport4
	 * IntraBalanceReport4}</li>
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forIntraBalanceReport2
	 * ConstraintReportNumberRule.forIntraBalanceReport2}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceReport4> forIntraBalanceReport4 = new MMConstraint<IntraBalanceReport4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forIntraBalanceReport2;
			owner_lazy = () -> IntraBalanceReport4.mmObject();
		}

		@Override
		public void executeValidator(IntraBalanceReport4 obj) throws Exception {
			checkIntraBalanceReport4(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement26.mmObject();
		}

		@Override
		public void executeValidator(Statement26 obj) throws Exception {
			checkStatement26(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> ReportParameters1.mmObject();
		}

		@Override
		public void executeValidator(ReportParameters1 obj) throws Exception {
			checkReportParameters1(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement44);
			owner_lazy = () -> Statement11.mmObject();
		}

		@Override
		public void executeValidator(Statement11 obj) throws Exception {
			checkStatement11(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forIntraBalanceReport4
	 * ConstraintReportNumberRule.forIntraBalanceReport4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceReport2> forIntraBalanceReport2 = new MMConstraint<IntraBalanceReport2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forIntraBalanceReport4);
			owner_lazy = () -> IntraBalanceReport2.mmObject();
		}

		@Override
		public void executeValidator(IntraBalanceReport2 obj) throws Exception {
			checkIntraBalanceReport2(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement27.mmObject();
		}

		@Override
		public void executeValidator(Statement27 obj) throws Exception {
			checkStatement27(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement51.mmObject();
		}

		@Override
		public void executeValidator(Statement51 obj) throws Exception {
			checkStatement51(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement33;
			owner_lazy = () -> Statement45.mmObject();
		}

		@Override
		public void executeValidator(Statement45 obj) throws Exception {
			checkStatement45(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement64
	 * ConstraintReportNumberRule.forStatement64}</li>
	 * </ul>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement64);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement14;
			owner_lazy = () -> Statement41.mmObject();
		}

		@Override
		public void executeValidator(Statement41 obj) throws Exception {
			checkStatement41(obj);
		}
	};

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT).<br>
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002.
	 */
	public static void checkStatement67(Statement67 obj) throws Exception {
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
	public static void checkStatement34(Statement34 obj) throws Exception {
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
	 * delta reports (UpdateType: DELT).<br>
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002.
	 */
	public static void checkStatement64(Statement64 obj) throws Exception {
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
	public static void checkStatement58(Statement58 obj) throws Exception {
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
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT).<br>
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002.
	 */
	public static void checkStatement63(Statement63 obj) throws Exception {
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
	public static void checkIntraBalanceReport3(IntraBalanceReport3 obj) throws Exception {
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
	public static void checkStatement22(Statement22 obj) throws Exception {
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
	 * delta reports (UpdateType: DELT).<br>
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002.
	 */
	public static void checkStatement70(Statement70 obj) throws Exception {
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
	public static void checkIntraPositionReport5(IntraPositionReport5 obj) throws Exception {
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
	 * If the report has multiple pages, the ReportNumber must remain the same
	 * through all the pages of the report.
	 */
	public static void checkStatement18(Statement18 obj) throws Exception {
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
	public static void checkStatement53(Statement53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT).<br>
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002.
	 */
	public static void checkStatement61(Statement61 obj) throws Exception {
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
	public static void checkStatement15(Statement15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT).<br>
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002.
	 */
	public static void checkStatement71(Statement71 obj) throws Exception {
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
	public static void checkStatement39(Statement39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT).<br>
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002.
	 */
	public static void checkStatement60(Statement60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT).<br>
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002.
	 */
	public static void checkStatement69(Statement69 obj) throws Exception {
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
	public static void checkStatement52(Statement52 obj) throws Exception {
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
	public static void checkStatement28(Statement28 obj) throws Exception {
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
	public static void checkIntraPositionReport6(IntraPositionReport6 obj) throws Exception {
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
	public static void checkIntraBalanceReport4(IntraBalanceReport4 obj) throws Exception {
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
	public static void checkIntraBalanceReport2(IntraBalanceReport2 obj) throws Exception {
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
	public static void checkStatement41(Statement41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}