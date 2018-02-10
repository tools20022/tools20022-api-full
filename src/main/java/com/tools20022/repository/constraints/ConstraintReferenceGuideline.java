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
 * At least one reference should present to identify the underlying
 * transaction(s).
 */
public class ConstraintReferenceGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry1 ReportEntry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one reference should present to identify the underlying transaction(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReportEntry1> forReportEntry1 = new MMConstraint<ReportEntry1>() {
		{
			validator = ConstraintReferenceGuideline::checkReportEntry1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceGuideline";
			definition = "At least one reference should present to identify the underlying transaction(s).";
			owner_lazy = () -> ReportEntry1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2 ReportEntry2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one reference should be present to identify the underlying transaction(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReportEntry2> forReportEntry2 = new MMConstraint<ReportEntry2>() {
		{
			validator = ConstraintReferenceGuideline::checkReportEntry2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceGuideline";
			definition = "At least one reference should be present to identify the underlying transaction(s).";
			owner_lazy = () -> ReportEntry2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one reference should be present to identify the underlying transaction(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReportEntry3> forReportEntry3 = new MMConstraint<ReportEntry3>() {
		{
			validator = ConstraintReferenceGuideline::checkReportEntry3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceGuideline";
			definition = "At least one reference should be present to identify the underlying transaction(s).";
			owner_lazy = () -> ReportEntry3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one reference should be present to identify the underlying transaction(s)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReferenceGuideline#forReportEntry7
	 * ConstraintReferenceGuideline.forReportEntry7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReportEntry4> forReportEntry4 = new MMConstraint<ReportEntry4>() {
		{
			validator = ConstraintReferenceGuideline::checkReportEntry4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceGuideline";
			definition = "At least one reference should be present to identify the underlying transaction(s).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReferenceGuideline.forReportEntry7);
			owner_lazy = () -> ReportEntry4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one reference should present to identify the underlying transaction(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NotificationEntry1> forNotificationEntry1 = new MMConstraint<NotificationEntry1>() {
		{
			validator = ConstraintReferenceGuideline::checkNotificationEntry1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceGuideline";
			definition = "At least one reference should present to identify the underlying transaction(s).";
			owner_lazy = () -> NotificationEntry1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1
	 * StatementEntry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one reference should present to identify the underlying transaction(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatementEntry1> forStatementEntry1 = new MMConstraint<StatementEntry1>() {
		{
			validator = ConstraintReferenceGuideline::checkStatementEntry1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceGuideline";
			definition = "At least one reference should present to identify the underlying transaction(s).";
			owner_lazy = () -> StatementEntry1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7 ReportEntry7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one reference should be present to identify the underlying transaction(s)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReferenceGuideline#forReportEntry8
	 * ConstraintReferenceGuideline.forReportEntry8}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReferenceGuideline#forReportEntry4
	 * ConstraintReferenceGuideline.forReportEntry4}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReportEntry7> forReportEntry7 = new MMConstraint<ReportEntry7>() {
		{
			validator = ConstraintReferenceGuideline::checkReportEntry7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceGuideline";
			definition = "At least one reference should be present to identify the underlying transaction(s).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReferenceGuideline.forReportEntry8);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReferenceGuideline.forReportEntry4;
			owner_lazy = () -> ReportEntry7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8 ReportEntry8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one reference should be present to identify the underlying transaction(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReferenceGuideline#forReportEntry7
	 * ConstraintReferenceGuideline.forReportEntry7}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReportEntry8> forReportEntry8 = new MMConstraint<ReportEntry8>() {
		{
			validator = ConstraintReferenceGuideline::checkReportEntry8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceGuideline";
			definition = "At least one reference should be present to identify the underlying transaction(s).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReferenceGuideline.forReportEntry7;
			owner_lazy = () -> ReportEntry8.mmObject();
		}
	};

	/**
	 * At least one reference should present to identify the underlying
	 * transaction(s).
	 */
	public static void checkReportEntry1(ReportEntry1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one reference should be present to identify the underlying
	 * transaction(s).
	 */
	public static void checkReportEntry2(ReportEntry2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one reference should be present to identify the underlying
	 * transaction(s).
	 */
	public static void checkReportEntry3(ReportEntry3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one reference should be present to identify the underlying
	 * transaction(s).
	 */
	public static void checkReportEntry4(ReportEntry4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one reference should present to identify the underlying
	 * transaction(s).
	 */
	public static void checkNotificationEntry1(NotificationEntry1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one reference should present to identify the underlying
	 * transaction(s).
	 */
	public static void checkStatementEntry1(StatementEntry1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one reference should be present to identify the underlying
	 * transaction(s).
	 */
	public static void checkReportEntry7(ReportEntry7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one reference should be present to identify the underlying
	 * transaction(s).
	 */
	public static void checkReportEntry8(ReportEntry8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}