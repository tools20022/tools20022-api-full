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
 * ChangeInstructionIndicator may only be used if
 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or
 * '0' (No) in the CorporateActionNotification message previously received and
 * if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or
 * '1' (Yes) in the CorporateActionNotification message previously received.
 */
public class ConstraintChangeInstructionIndicatorGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07
	 * CorporateActionInstructionCancellationRequestV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#forCorporateActionInstructionCancellationRequestV06
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * forCorporateActionInstructionCancellationRequestV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV07> forCorporateActionInstructionCancellationRequestV07 = new MMConstraint<CorporateActionInstructionCancellationRequestV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.forCorporateActionInstructionCancellationRequestV06;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV07 obj) throws Exception {
			checkCorporateActionInstructionCancellationRequestV07(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#forCorporateActionInstructionV07
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * forCorporateActionInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV08> forCorporateActionInstructionV08 = new MMConstraint<CorporateActionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.forCorporateActionInstructionV07;
			owner_lazy = () -> CorporateActionInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV08 obj) throws Exception {
			checkCorporateActionInstructionV08(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequest002V07> forCorporateActionInstructionCancellationRequest002V07 = new MMConstraint<CorporateActionInstructionCancellationRequest002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequest002V07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequest002V07 obj) throws Exception {
			checkCorporateActionInstructionCancellationRequest002V07(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstruction002V08> forCorporateActionInstruction002V08 = new MMConstraint<CorporateActionInstruction002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.";
			owner_lazy = () -> CorporateActionInstruction002V08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstruction002V08 obj) throws Exception {
			checkCorporateActionInstruction002V08(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#forCorporateActionInstructionCancellationRequestV07
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * forCorporateActionInstructionCancellationRequestV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#forCorporateActionInstructionCancellationRequestV05
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * forCorporateActionInstructionCancellationRequestV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV06> forCorporateActionInstructionCancellationRequestV06 = new MMConstraint<CorporateActionInstructionCancellationRequestV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.forCorporateActionInstructionCancellationRequestV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.forCorporateActionInstructionCancellationRequestV05;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV06 obj) throws Exception {
			checkCorporateActionInstructionCancellationRequestV06(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#forCorporateActionInstructionV08
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * forCorporateActionInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#forCorporateActionInstructionV06
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * forCorporateActionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV07> forCorporateActionInstructionV07 = new MMConstraint<CorporateActionInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.forCorporateActionInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.forCorporateActionInstructionV06;
			owner_lazy = () -> CorporateActionInstructionV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV07 obj) throws Exception {
			checkCorporateActionInstructionV07(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV01> forCorporateActionInstructionV01 = new MMConstraint<CorporateActionInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n.";
			owner_lazy = () -> CorporateActionInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV01 obj) throws Exception {
			checkCorporateActionInstructionV01(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV02> forCorporateActionInstructionV02 = new MMConstraint<CorporateActionInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n.";
			owner_lazy = () -> CorporateActionInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV02 obj) throws Exception {
			checkCorporateActionInstructionV02(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV03> forCorporateActionInstructionV03 = new MMConstraint<CorporateActionInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n.";
			owner_lazy = () -> CorporateActionInstructionV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV03 obj) throws Exception {
			checkCorporateActionInstructionV03(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#forCorporateActionInstructionV05
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * forCorporateActionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV04> forCorporateActionInstructionV04 = new MMConstraint<CorporateActionInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.forCorporateActionInstructionV05);
			owner_lazy = () -> CorporateActionInstructionV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV04 obj) throws Exception {
			checkCorporateActionInstructionV04(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV01> forCorporateActionInstructionCancellationRequestV01 = new MMConstraint<CorporateActionInstructionCancellationRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV01 obj) throws Exception {
			checkCorporateActionInstructionCancellationRequestV01(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV02> forCorporateActionInstructionCancellationRequestV02 = new MMConstraint<CorporateActionInstructionCancellationRequestV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV02 obj) throws Exception {
			checkCorporateActionInstructionCancellationRequestV02(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV03> forCorporateActionInstructionCancellationRequestV03 = new MMConstraint<CorporateActionInstructionCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV03 obj) throws Exception {
			checkCorporateActionInstructionCancellationRequestV03(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#forCorporateActionInstructionCancellationRequestV05
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * forCorporateActionInstructionCancellationRequestV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV04> forCorporateActionInstructionCancellationRequestV04 = new MMConstraint<CorporateActionInstructionCancellationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.forCorporateActionInstructionCancellationRequestV05);
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV04 obj) throws Exception {
			checkCorporateActionInstructionCancellationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05
	 * CorporateActionInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#forCorporateActionInstructionV06
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * forCorporateActionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#forCorporateActionInstructionV04
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * forCorporateActionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV05> forCorporateActionInstructionV05 = new MMConstraint<CorporateActionInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.forCorporateActionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.forCorporateActionInstructionV04;
			owner_lazy = () -> CorporateActionInstructionV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV05 obj) throws Exception {
			checkCorporateActionInstructionV05(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#forCorporateActionInstructionCancellationRequestV06
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * forCorporateActionInstructionCancellationRequestV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#forCorporateActionInstructionCancellationRequestV04
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * forCorporateActionInstructionCancellationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV05> forCorporateActionInstructionCancellationRequestV05 = new MMConstraint<CorporateActionInstructionCancellationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "Identification/ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No (False) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes (True) in the CorporateActionNotification message previously received.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.forCorporateActionInstructionCancellationRequestV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.forCorporateActionInstructionCancellationRequestV04;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV05 obj) throws Exception {
			checkCorporateActionInstructionCancellationRequestV05(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#forCorporateActionInstructionV07
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * forCorporateActionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#forCorporateActionInstructionV05
	 * ConstraintChangeInstructionIndicatorGuideline.
	 * forCorporateActionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV06> forCorporateActionInstructionV06 = new MMConstraint<CorporateActionInstructionV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.forCorporateActionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.forCorporateActionInstructionV05;
			owner_lazy = () -> CorporateActionInstructionV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV06 obj) throws Exception {
			checkCorporateActionInstructionV06(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstruction002V06> forCorporateActionInstruction002V06 = new MMConstraint<CorporateActionInstruction002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.\r\n";
			owner_lazy = () -> CorporateActionInstruction002V06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstruction002V06 obj) throws Exception {
			checkCorporateActionInstruction002V06(obj);
		}
	};

	/**
	 * ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to
	 * 'false' or '0' (No) in the CorporateActionNotification message previously
	 * received and if CorporateActionOptionDetails/ChangeAllowedIndicator was
	 * set to 'true' or '1' (Yes) in the CorporateActionNotification message
	 * previously received.
	 */
	public static void checkCorporateActionInstructionCancellationRequestV07(CorporateActionInstructionCancellationRequestV07 obj) throws Exception {
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
	public static void checkCorporateActionInstructionV08(CorporateActionInstructionV08 obj) throws Exception {
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
	public static void checkCorporateActionInstructionCancellationRequest002V07(CorporateActionInstructionCancellationRequest002V07 obj) throws Exception {
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
	public static void checkCorporateActionInstruction002V08(CorporateActionInstruction002V08 obj) throws Exception {
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
	public static void checkCorporateActionInstructionCancellationRequestV06(CorporateActionInstructionCancellationRequestV06 obj) throws Exception {
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
	public static void checkCorporateActionInstructionV07(CorporateActionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received. .
	 */
	public static void checkCorporateActionInstructionV01(CorporateActionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received. .
	 */
	public static void checkCorporateActionInstructionV02(CorporateActionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received. .
	 */
	public static void checkCorporateActionInstructionV03(CorporateActionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received. .
	 */
	public static void checkCorporateActionInstructionV04(CorporateActionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received.
	 */
	public static void checkCorporateActionInstructionCancellationRequestV01(CorporateActionInstructionCancellationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received.
	 */
	public static void checkCorporateActionInstructionCancellationRequestV02(CorporateActionInstructionCancellationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received.
	 */
	public static void checkCorporateActionInstructionCancellationRequestV03(CorporateActionInstructionCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received.
	 */
	public static void checkCorporateActionInstructionCancellationRequestV04(CorporateActionInstructionCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received. .
	 */
	public static void checkCorporateActionInstructionV05(CorporateActionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification/ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to No
	 * (False) in the CorporateActionNotification message previously received
	 * and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to Yes
	 * (True) in the CorporateActionNotification message previously received.
	 */
	public static void checkCorporateActionInstructionCancellationRequestV05(CorporateActionInstructionCancellationRequestV05 obj) throws Exception {
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
	public static void checkCorporateActionInstructionV06(CorporateActionInstructionV06 obj) throws Exception {
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
	public static void checkCorporateActionInstruction002V06(CorporateActionInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}