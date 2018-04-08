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
 * NotificationType REPL is used to replace a previously sent
 * CorporateActionNotification message that was reported with
 * EventCompletenessStatus being incomplete or complete.
 */
public class ConstraintNotificationTypeGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4
	 * CorporateActionNotification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationTypeGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "NotificationType REPL is used to replace a previously sent CorporateActionNotification message that was reported with EventCompletenessStatus being incomplete or complete."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline#forCorporateActionNotification5
	 * ConstraintNotificationTypeGuideline.forCorporateActionNotification5}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline#forCorporateActionNotification3
	 * ConstraintNotificationTypeGuideline.forCorporateActionNotification3}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification4> forCorporateActionNotification4 = new MMConstraint<CorporateActionNotification4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationTypeGuideline";
			definition = "NotificationType REPL is used to replace a previously sent CorporateActionNotification message that was reported with EventCompletenessStatus being incomplete or complete.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline.forCorporateActionNotification5);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline.forCorporateActionNotification3;
			owner_lazy = () -> CorporateActionNotification4.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotification4 obj) throws Exception {
			checkCorporateActionNotification4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification3
	 * CorporateActionNotification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationTypeGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "NotificationType REPL is used to replace a previously sent CorporateActionNotification message that was reported with EventCompletenessStatus being incomplete or complete."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline#forCorporateActionNotification4
	 * ConstraintNotificationTypeGuideline.forCorporateActionNotification4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification3> forCorporateActionNotification3 = new MMConstraint<CorporateActionNotification3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationTypeGuideline";
			definition = "NotificationType REPL is used to replace a previously sent CorporateActionNotification message that was reported with EventCompletenessStatus being incomplete or complete.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline.forCorporateActionNotification4);
			owner_lazy = () -> CorporateActionNotification3.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotification3 obj) throws Exception {
			checkCorporateActionNotification3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5
	 * CorporateActionNotification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationTypeGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "NotificationType REPL is used to replace a previously sent CorporateActionNotification message that was reported with EventCompletenessStatus being incomplete or complete."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline#forCorporateActionNotification6
	 * ConstraintNotificationTypeGuideline.forCorporateActionNotification6}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline#forCorporateActionNotification4
	 * ConstraintNotificationTypeGuideline.forCorporateActionNotification4}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification5> forCorporateActionNotification5 = new MMConstraint<CorporateActionNotification5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationTypeGuideline";
			definition = "NotificationType REPL is used to replace a previously sent CorporateActionNotification message that was reported with EventCompletenessStatus being incomplete or complete.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline.forCorporateActionNotification6);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline.forCorporateActionNotification4;
			owner_lazy = () -> CorporateActionNotification5.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotification5 obj) throws Exception {
			checkCorporateActionNotification5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification6
	 * CorporateActionNotification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationTypeGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "NotificationType REPL is used to replace a previously sent CorporateActionNotification message that was reported with EventCompletenessStatus being incomplete or complete."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline#forCorporateActionNotification5
	 * ConstraintNotificationTypeGuideline.forCorporateActionNotification5}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification6> forCorporateActionNotification6 = new MMConstraint<CorporateActionNotification6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationTypeGuideline";
			definition = "NotificationType REPL is used to replace a previously sent CorporateActionNotification message that was reported with EventCompletenessStatus being incomplete or complete.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline.forCorporateActionNotification5;
			owner_lazy = () -> CorporateActionNotification6.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotification6 obj) throws Exception {
			checkCorporateActionNotification6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification2
	 * CorporateActionNotification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationTypeGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "NotificationType REPL is used to replace a previously sent CorporateActionNotification message that was reported with EventCompletenessStatus being incomplete or complete."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification2> forCorporateActionNotification2 = new MMConstraint<CorporateActionNotification2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationTypeGuideline";
			definition = "NotificationType REPL is used to replace a previously sent CorporateActionNotification message that was reported with EventCompletenessStatus being incomplete or complete.";
			owner_lazy = () -> CorporateActionNotification2.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotification2 obj) throws Exception {
			checkCorporateActionNotification2(obj);
		}
	};

	/**
	 * NotificationType REPL is used to replace a previously sent
	 * CorporateActionNotification message that was reported with
	 * EventCompletenessStatus being incomplete or complete.
	 */
	public static void checkCorporateActionNotification4(CorporateActionNotification4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * NotificationType REPL is used to replace a previously sent
	 * CorporateActionNotification message that was reported with
	 * EventCompletenessStatus being incomplete or complete.
	 */
	public static void checkCorporateActionNotification3(CorporateActionNotification3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * NotificationType REPL is used to replace a previously sent
	 * CorporateActionNotification message that was reported with
	 * EventCompletenessStatus being incomplete or complete.
	 */
	public static void checkCorporateActionNotification5(CorporateActionNotification5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * NotificationType REPL is used to replace a previously sent
	 * CorporateActionNotification message that was reported with
	 * EventCompletenessStatus being incomplete or complete.
	 */
	public static void checkCorporateActionNotification6(CorporateActionNotification6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * NotificationType REPL is used to replace a previously sent
	 * CorporateActionNotification message that was reported with
	 * EventCompletenessStatus being incomplete or complete.
	 */
	public static void checkCorporateActionNotification2(CorporateActionNotification2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}