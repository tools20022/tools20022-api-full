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
import com.tools20022.repository.area.seev.*;
import java.util.Arrays;

/**
 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true'
 * or '1'), then at least one occurrence of
 * AccountDetails/AccountsListAndBalanceDetails must be present and
 * TotalEligibleBalance must be present in all occurrences of
 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false'
 * or '0') or is not present, then TotalEligibleBalance may or may not be
 * present in all occurrences of
 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
 * necessarily be the final eligible balance quantity.
 */
public class ConstraintTotalEligibleBalanceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03
	 * CorporateActionNotificationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV03> for_seev_CorporateActionNotificationV03 = new MMConstraint<CorporateActionNotificationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			owner_lazy = () -> CorporateActionNotificationV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV03 obj) throws Exception {
			check_seev_CorporateActionNotificationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06
	 * CorporateActionNotification002V06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V06> for_seev_CorporateActionNotification002V06 = new MMConstraint<CorporateActionNotification002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			owner_lazy = () -> CorporateActionNotification002V06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotification002V06 obj) throws Exception {
			check_seev_CorporateActionNotification002V06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08
	 * CorporateActionNotificationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#for_seev_CorporateActionNotificationV07
	 * ConstraintTotalEligibleBalanceRule.
	 * for_seev_CorporateActionNotificationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> for_seev_CorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.for_seev_CorporateActionNotificationV07;
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV08 obj) throws Exception {
			check_seev_CorporateActionNotificationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06
	 * CorporateActionNotificationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#for_seev_CorporateActionNotificationV07
	 * ConstraintTotalEligibleBalanceRule.
	 * for_seev_CorporateActionNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#for_seev_CorporateActionNotificationV05
	 * ConstraintTotalEligibleBalanceRule.
	 * for_seev_CorporateActionNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV06> for_seev_CorporateActionNotificationV06 = new MMConstraint<CorporateActionNotificationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.for_seev_CorporateActionNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.for_seev_CorporateActionNotificationV05;
			owner_lazy = () -> CorporateActionNotificationV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV06 obj) throws Exception {
			check_seev_CorporateActionNotificationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07
	 * CorporateActionNotificationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#for_seev_CorporateActionNotificationV08
	 * ConstraintTotalEligibleBalanceRule.
	 * for_seev_CorporateActionNotificationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#for_seev_CorporateActionNotificationV06
	 * ConstraintTotalEligibleBalanceRule.
	 * for_seev_CorporateActionNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV07> for_seev_CorporateActionNotificationV07 = new MMConstraint<CorporateActionNotificationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.for_seev_CorporateActionNotificationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.for_seev_CorporateActionNotificationV06;
			owner_lazy = () -> CorporateActionNotificationV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV07 obj) throws Exception {
			check_seev_CorporateActionNotificationV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05
	 * CorporateActionNotificationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#for_seev_CorporateActionNotificationV06
	 * ConstraintTotalEligibleBalanceRule.
	 * for_seev_CorporateActionNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#for_seev_CorporateActionNotificationV04
	 * ConstraintTotalEligibleBalanceRule.
	 * for_seev_CorporateActionNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV05> for_seev_CorporateActionNotificationV05 = new MMConstraint<CorporateActionNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.for_seev_CorporateActionNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.for_seev_CorporateActionNotificationV04;
			owner_lazy = () -> CorporateActionNotificationV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV05 obj) throws Exception {
			check_seev_CorporateActionNotificationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08
	 * CorporateActionNotification002V08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V08> for_seev_CorporateActionNotification002V08 = new MMConstraint<CorporateActionNotification002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			owner_lazy = () -> CorporateActionNotification002V08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotification002V08 obj) throws Exception {
			check_seev_CorporateActionNotification002V08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04
	 * CorporateActionNotificationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#for_seev_CorporateActionNotificationV05
	 * ConstraintTotalEligibleBalanceRule.
	 * for_seev_CorporateActionNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV04> for_seev_CorporateActionNotificationV04 = new MMConstraint<CorporateActionNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.for_seev_CorporateActionNotificationV05);
			owner_lazy = () -> CorporateActionNotificationV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV04 obj) throws Exception {
			check_seev_CorporateActionNotificationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02
	 * CorporateActionNotificationV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV02> for_seev_CorporateActionNotificationV02 = new MMConstraint<CorporateActionNotificationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			owner_lazy = () -> CorporateActionNotificationV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV02 obj) throws Exception {
			check_seev_CorporateActionNotificationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01
	 * CorporateActionNotificationV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV01> for_seev_CorporateActionNotificationV01 = new MMConstraint<CorporateActionNotificationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			owner_lazy = () -> CorporateActionNotificationV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV01 obj) throws Exception {
			check_seev_CorporateActionNotificationV01(obj);
		}
	};

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes'
	 * ('true' or '1'), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'No'
	 * ('false' or '0') or is not present, then TotalEligibleBalance may or may
	 * not be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void check_seev_CorporateActionNotificationV03(CorporateActionNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or
	 * '1' (Yes), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or
	 * '0' (No) or is not present, then TotalEligibleBalance may or may not be
	 * present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void check_seev_CorporateActionNotification002V06(CorporateActionNotification002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or
	 * '1' (Yes), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or
	 * '0' (No) or is not present, then TotalEligibleBalance may or may not be
	 * present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void check_seev_CorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or
	 * '1' (Yes), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or
	 * '0' (No) or is not present, then TotalEligibleBalance may or may not be
	 * present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void check_seev_CorporateActionNotificationV06(CorporateActionNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or
	 * '1' (Yes), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or
	 * '0' (No) or is not present, then TotalEligibleBalance may or may not be
	 * present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void check_seev_CorporateActionNotificationV07(CorporateActionNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes'
	 * ('true' or '1'), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'No'
	 * ('false' or '0') or is not present, then TotalEligibleBalance may or may
	 * not be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void check_seev_CorporateActionNotificationV05(CorporateActionNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or
	 * '1' (Yes), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or
	 * '0' (No) or is not present, then TotalEligibleBalance may or may not be
	 * present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void check_seev_CorporateActionNotification002V08(CorporateActionNotification002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes'
	 * ('true' or '1'), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'No'
	 * ('false' or '0') or is not present, then TotalEligibleBalance may or may
	 * not be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void check_seev_CorporateActionNotificationV04(CorporateActionNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes'
	 * ('true' or '1'), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'No'
	 * ('false' or '0') or is not present, then TotalEligibleBalance may or may
	 * not be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void check_seev_CorporateActionNotificationV02(CorporateActionNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes'
	 * ('true' or '1'), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'No'
	 * ('false' or '0') or is not present, then TotalEligibleBalance may or may
	 * not be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void check_seev_CorporateActionNotificationV01(CorporateActionNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}