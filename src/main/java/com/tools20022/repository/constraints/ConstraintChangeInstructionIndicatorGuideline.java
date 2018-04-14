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
 * Identification/ChangeInstructionIndicator may only be used if
 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False)
 * in the CorporateActionNotification message previously received and if
 * CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in
 * the CorporateActionNotification message previously received. .
 */
public class ConstraintChangeInstructionIndicatorGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05
	 * CorporateActionInstructionV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionV06
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * for_seev_CorporateActionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionV04
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * for_seev_CorporateActionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV05> for_seev_CorporateActionInstructionV05 = new MMConstraint<CorporateActionInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionV04;
			owner_lazy = () -> CorporateActionInstructionV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV05 obj) throws Exception {
			check_seev_CorporateActionInstructionV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06
	 * CorporateActionInstructionV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionV07
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * for_seev_CorporateActionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionV05
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * for_seev_CorporateActionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV06> for_seev_CorporateActionInstructionV06 = new MMConstraint<CorporateActionInstructionV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionV05;
			owner_lazy = () -> CorporateActionInstructionV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV06 obj) throws Exception {
			check_seev_CorporateActionInstructionV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV04
	 * CorporateActionInstructionCancellationRequestV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionCancellationRequestV05
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * for_seev_CorporateActionInstructionCancellationRequestV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV04> for_seev_CorporateActionInstructionCancellationRequestV04 = new MMConstraint<CorporateActionInstructionCancellationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionCancellationRequestV05);
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV04 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV02
	 * CorporateActionInstructionCancellationRequestV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV02> for_seev_CorporateActionInstructionCancellationRequestV02 = new MMConstraint<CorporateActionInstructionCancellationRequestV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV02 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV03
	 * CorporateActionInstructionCancellationRequestV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV03> for_seev_CorporateActionInstructionCancellationRequestV03 = new MMConstraint<CorporateActionInstructionCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV03 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV03
	 * CorporateActionInstructionV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV03> for_seev_CorporateActionInstructionV03 = new MMConstraint<CorporateActionInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n.";
			owner_lazy = () -> CorporateActionInstructionV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV03 obj) throws Exception {
			check_seev_CorporateActionInstructionV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07
	 * CorporateActionInstructionCancellationRequestV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionCancellationRequestV06
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * for_seev_CorporateActionInstructionCancellationRequestV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV07> for_seev_CorporateActionInstructionCancellationRequestV07 = new MMConstraint<CorporateActionInstructionCancellationRequestV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionCancellationRequestV06;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV07 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV02
	 * CorporateActionInstructionV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV02> for_seev_CorporateActionInstructionV02 = new MMConstraint<CorporateActionInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n.";
			owner_lazy = () -> CorporateActionInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV02 obj) throws Exception {
			check_seev_CorporateActionInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstruction002V06
	 * CorporateActionInstruction002V06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstruction002V06> for_seev_CorporateActionInstruction002V06 = new MMConstraint<CorporateActionInstruction002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.\r\n";
			owner_lazy = () -> CorporateActionInstruction002V06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstruction002V06 obj) throws Exception {
			check_seev_CorporateActionInstruction002V06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequest002V07
	 * CorporateActionInstructionCancellationRequest002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequest002V07> for_seev_CorporateActionInstructionCancellationRequest002V07 = new MMConstraint<CorporateActionInstructionCancellationRequest002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequest002V07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequest002V07 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequest002V07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV04
	 * CorporateActionInstructionV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionV05
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * for_seev_CorporateActionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV04> for_seev_CorporateActionInstructionV04 = new MMConstraint<CorporateActionInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionV05);
			owner_lazy = () -> CorporateActionInstructionV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV04 obj) throws Exception {
			check_seev_CorporateActionInstructionV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01
	 * CorporateActionInstructionV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV01> for_seev_CorporateActionInstructionV01 = new MMConstraint<CorporateActionInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n.";
			owner_lazy = () -> CorporateActionInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV01 obj) throws Exception {
			check_seev_CorporateActionInstructionV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV01
	 * CorporateActionInstructionCancellationRequestV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV01> for_seev_CorporateActionInstructionCancellationRequestV01 = new MMConstraint<CorporateActionInstructionCancellationRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV01 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07
	 * CorporateActionInstructionV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionV08
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * for_seev_CorporateActionInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionV06
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * for_seev_CorporateActionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV07> for_seev_CorporateActionInstructionV07 = new MMConstraint<CorporateActionInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionV06;
			owner_lazy = () -> CorporateActionInstructionV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV07 obj) throws Exception {
			check_seev_CorporateActionInstructionV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV05
	 * CorporateActionInstructionCancellationRequestV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionCancellationRequestV06
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * for_seev_CorporateActionInstructionCancellationRequestV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionCancellationRequestV04
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * for_seev_CorporateActionInstructionCancellationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV05> for_seev_CorporateActionInstructionCancellationRequestV05 = new MMConstraint<CorporateActionInstructionCancellationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionCancellationRequestV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionCancellationRequestV04;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV05 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV06
	 * CorporateActionInstructionCancellationRequestV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionCancellationRequestV07
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * for_seev_CorporateActionInstructionCancellationRequestV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionCancellationRequestV05
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * for_seev_CorporateActionInstructionCancellationRequestV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV06> for_seev_CorporateActionInstructionCancellationRequestV06 = new MMConstraint<CorporateActionInstructionCancellationRequestV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionCancellationRequestV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionCancellationRequestV05;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV06 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08
	 * CorporateActionInstructionV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionV07
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * for_seev_CorporateActionInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV08> for_seev_CorporateActionInstructionV08 = new MMConstraint<CorporateActionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionV07;
			owner_lazy = () -> CorporateActionInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV08 obj) throws Exception {
			check_seev_CorporateActionInstructionV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstruction002V08
	 * CorporateActionInstruction002V08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstruction002V08> for_seev_CorporateActionInstruction002V08 = new MMConstraint<CorporateActionInstruction002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.";
			owner_lazy = () -> CorporateActionInstruction002V08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstruction002V08 obj) throws Exception {
			check_seev_CorporateActionInstruction002V08(obj);
		}
	};

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received. .
	 */
	public static void check_seev_CorporateActionInstructionV05(CorporateActionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to
	 * 'false' or '0' (No) in the CorporateActionNotification message previously
	 * received and if CorporateActionOptionDetails/ChangeAllowedIndicator was
	 * set to 'true' or '1' (Yes) in the CorporateActionNotification message
	 * previously received.<br>
	 */
	public static void check_seev_CorporateActionInstructionV06(CorporateActionInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestV04(CorporateActionInstructionCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestV02(CorporateActionInstructionCancellationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestV03(CorporateActionInstructionCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received. .
	 */
	public static void check_seev_CorporateActionInstructionV03(CorporateActionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to
	 * 'false' or '0' (No) in the CorporateActionNotification message previously
	 * received and if CorporateActionOptionDetails/ChangeAllowedIndicator was
	 * set to 'true' or '1' (Yes) in the CorporateActionNotification message
	 * previously received.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestV07(CorporateActionInstructionCancellationRequestV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received. .
	 */
	public static void check_seev_CorporateActionInstructionV02(CorporateActionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to
	 * 'false' or '0' (No) in the CorporateActionNotification message previously
	 * received and if CorporateActionOptionDetails/ChangeAllowedIndicator was
	 * set to 'true' or '1' (Yes) in the CorporateActionNotification message
	 * previously received.<br>
	 */
	public static void check_seev_CorporateActionInstruction002V06(CorporateActionInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to
	 * 'false' or '0' (No) in the CorporateActionNotification message previously
	 * received and if CorporateActionOptionDetails/ChangeAllowedIndicator was
	 * set to 'true' or '1' (Yes) in the CorporateActionNotification message
	 * previously received.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequest002V07(CorporateActionInstructionCancellationRequest002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received. .
	 */
	public static void check_seev_CorporateActionInstructionV04(CorporateActionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received. .
	 */
	public static void check_seev_CorporateActionInstructionV01(CorporateActionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestV01(CorporateActionInstructionCancellationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to
	 * 'false' or '0' (No) in the CorporateActionNotification message previously
	 * received and if CorporateActionOptionDetails/ChangeAllowedIndicator was
	 * set to 'true' or '1' (Yes) in the CorporateActionNotification message
	 * previously received.<br>
	 */
	public static void check_seev_CorporateActionInstructionV07(CorporateActionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestV05(CorporateActionInstructionCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to
	 * 'false' or '0' (No) in the CorporateActionNotification message previously
	 * received and if CorporateActionOptionDetails/ChangeAllowedIndicator was
	 * set to 'true' or '1' (Yes) in the CorporateActionNotification message
	 * previously received.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestV06(CorporateActionInstructionCancellationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to
	 * 'false' or '0' (No) in the CorporateActionNotification message previously
	 * received and if CorporateActionOptionDetails/ChangeAllowedIndicator was
	 * set to 'true' or '1' (Yes) in the CorporateActionNotification message
	 * previously received.
	 */
	public static void check_seev_CorporateActionInstructionV08(CorporateActionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to
	 * 'false' or '0' (No) in the CorporateActionNotification message previously
	 * received and if CorporateActionOptionDetails/ChangeAllowedIndicator was
	 * set to 'true' or '1' (Yes) in the CorporateActionNotification message
	 * previously received.
	 */
	public static void check_seev_CorporateActionInstruction002V08(CorporateActionInstruction002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}