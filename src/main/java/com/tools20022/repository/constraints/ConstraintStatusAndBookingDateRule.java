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
import com.tools20022.repository.msg.NotificationEntry1;
import com.tools20022.repository.msg.ReportEntry1;
import com.tools20022.repository.msg.StatementEntry1;

/**
 * If Status is pending, BookingDate must is not allowed.
 */
public class ConstraintStatusAndBookingDateRule {

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
	 * name} = "StatusAndBookingDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "If Status is pending, BookingDate must is not allowed."</li>
	 * </ul>
	 */
	public static final MMConstraint<StatementEntry1> forStatementEntry1 = new MMConstraint<StatementEntry1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndBookingDateRule";
			definition = "If Status is pending, BookingDate must is not allowed.";
			owner_lazy = () -> StatementEntry1.mmObject();
		}

		@Override
		public void executeValidator(StatementEntry1 obj) throws Exception {
			checkStatementEntry1(obj);
		}
	};
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
	 * name} = "StatusAndBookingDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "If Status is pending, BookingDate is not allowed."</li>
	 * </ul>
	 */
	public static final MMConstraint<ReportEntry1> forReportEntry1 = new MMConstraint<ReportEntry1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndBookingDateRule";
			definition = "If Status is pending, BookingDate is not allowed.";
			owner_lazy = () -> ReportEntry1.mmObject();
		}

		@Override
		public void executeValidator(ReportEntry1 obj) throws Exception {
			checkReportEntry1(obj);
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
	 * name} = "StatusAndBookingDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "If Status is pending, BookingDate is not allowed."</li>
	 * </ul>
	 */
	public static final MMConstraint<NotificationEntry1> forNotificationEntry1 = new MMConstraint<NotificationEntry1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndBookingDateRule";
			definition = "If Status is pending, BookingDate is not allowed.";
			owner_lazy = () -> NotificationEntry1.mmObject();
		}

		@Override
		public void executeValidator(NotificationEntry1 obj) throws Exception {
			checkNotificationEntry1(obj);
		}
	};

	/**
	 * If Status is pending, BookingDate must is not allowed.
	 */
	public static void checkStatementEntry1(StatementEntry1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Status is pending, BookingDate is not allowed.
	 */
	public static void checkReportEntry1(ReportEntry1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Status is pending, BookingDate is not allowed.
	 */
	public static void checkNotificationEntry1(NotificationEntry1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}