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
import com.tools20022.repository.area.sese.*;
import java.util.Arrays;

/**
 * If AdditionalPhysicalOrRegistrationDetails is present then the transaction
 * must be free of payment.
 */
public class ConstraintAdditionalPhysicalOrRegistrationDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07
	 * SecuritiesSettlementTransactionGenerationNotificationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is present then the transaction must be free of payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#forSecuritiesSettlementTransactionGenerationNotificationV06
	 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV07> forSecuritiesSettlementTransactionGenerationNotificationV07 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV07>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionGenerationNotificationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is present then the transaction must be free of payment.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.forSecuritiesSettlementTransactionGenerationNotificationV06;
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07
	 * SecuritiesSettlementTransactionInstructionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is present, then the instruction must be free of payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#forSecuritiesSettlementTransactionInstructionV06
	 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV07> forSecuritiesSettlementTransactionInstructionV07 = new MMConstraint<SecuritiesSettlementTransactionInstructionV07>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is present, then the instruction must be free of payment.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.forSecuritiesSettlementTransactionInstructionV06;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07
	 * SecuritiesSettlementTransactionInstruction002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V07> forSecuritiesSettlementTransactionInstruction002V07 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V07>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionInstruction002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V07
	 * SecuritiesSettlementTransactionGenerationNotification002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotification002V07> forSecuritiesSettlementTransactionGenerationNotification002V07 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotification002V07>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionGenerationNotification002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotification002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06
	 * SecuritiesSettlementTransactionInstructionV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#forSecuritiesSettlementTransactionInstructionV07
	 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV06> forSecuritiesSettlementTransactionInstructionV06 = new MMConstraint<SecuritiesSettlementTransactionInstructionV06>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.forSecuritiesSettlementTransactionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.forSecuritiesSettlementTransactionInstructionV05;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06
	 * SecuritiesSettlementTransactionGenerationNotificationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#forSecuritiesSettlementTransactionGenerationNotificationV07
	 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#forSecuritiesSettlementTransactionGenerationNotificationV05
	 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV06> forSecuritiesSettlementTransactionGenerationNotificationV06 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV06>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionGenerationNotificationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.forSecuritiesSettlementTransactionGenerationNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.forSecuritiesSettlementTransactionGenerationNotificationV05;
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V06
	 * SecuritiesSettlementTransactionGenerationNotification002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotification002V06> forSecuritiesSettlementTransactionGenerationNotification002V06 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotification002V06>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionGenerationNotification002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotification002V06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06
	 * SecuritiesSettlementTransactionInstruction002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V06> forSecuritiesSettlementTransactionInstruction002V06 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V06>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionInstruction002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01
	 * SecuritiesSettlementTransactionGenerationNotificationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV01> forSecuritiesSettlementTransactionGenerationNotificationV01 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV01>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionGenerationNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV02
	 * SecuritiesSettlementTransactionGenerationNotificationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV02> forSecuritiesSettlementTransactionGenerationNotificationV02 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV02>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionGenerationNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV03
	 * SecuritiesSettlementTransactionGenerationNotificationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV03> forSecuritiesSettlementTransactionGenerationNotificationV03 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV03>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionGenerationNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04
	 * SecuritiesSettlementTransactionGenerationNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#forSecuritiesSettlementTransactionGenerationNotificationV05
	 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV04> forSecuritiesSettlementTransactionGenerationNotificationV04 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV04>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionGenerationNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.forSecuritiesSettlementTransactionGenerationNotificationV05);
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01
	 * SecuritiesSettlementTransactionInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV01> forSecuritiesSettlementTransactionInstructionV01 = new MMConstraint<SecuritiesSettlementTransactionInstructionV01>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV02
	 * SecuritiesSettlementTransactionInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV02> forSecuritiesSettlementTransactionInstructionV02 = new MMConstraint<SecuritiesSettlementTransactionInstructionV02>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV03
	 * SecuritiesSettlementTransactionInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV03> forSecuritiesSettlementTransactionInstructionV03 = new MMConstraint<SecuritiesSettlementTransactionInstructionV03>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04
	 * SecuritiesSettlementTransactionInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV04> forSecuritiesSettlementTransactionInstructionV04 = new MMConstraint<SecuritiesSettlementTransactionInstructionV04>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.forSecuritiesSettlementTransactionInstructionV05);
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05
	 * SecuritiesSettlementTransactionGenerationNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#forSecuritiesSettlementTransactionGenerationNotificationV06
	 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#forSecuritiesSettlementTransactionGenerationNotificationV04
	 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV05> forSecuritiesSettlementTransactionGenerationNotificationV05 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV05>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionGenerationNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.forSecuritiesSettlementTransactionGenerationNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.forSecuritiesSettlementTransactionGenerationNotificationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05
	 * SecuritiesSettlementTransactionInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#forSecuritiesSettlementTransactionInstructionV06
	 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#forSecuritiesSettlementTransactionInstructionV04
	 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV05> forSecuritiesSettlementTransactionInstructionV05 = new MMConstraint<SecuritiesSettlementTransactionInstructionV05>() {
		{
			validator = ConstraintAdditionalPhysicalOrRegistrationDetailsRule::checkSecuritiesSettlementTransactionInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetailsRule";
			definition = "If AdditionalPhysicalOrRegistrationDetails is used, then the instruction must be free of payment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.forSecuritiesSettlementTransactionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.forSecuritiesSettlementTransactionInstructionV04;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV05.mmObject();
		}
	};

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is present then the
	 * transaction must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV07(SecuritiesSettlementTransactionGenerationNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is present, then the
	 * instruction must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV07(SecuritiesSettlementTransactionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V07(SecuritiesSettlementTransactionInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotification002V07(SecuritiesSettlementTransactionGenerationNotification002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV06(SecuritiesSettlementTransactionInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV06(SecuritiesSettlementTransactionGenerationNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotification002V06(SecuritiesSettlementTransactionGenerationNotification002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V06(SecuritiesSettlementTransactionInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV01(SecuritiesSettlementTransactionGenerationNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV02(SecuritiesSettlementTransactionGenerationNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV03(SecuritiesSettlementTransactionGenerationNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV04(SecuritiesSettlementTransactionGenerationNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV01(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV02(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV03(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV04(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV05(SecuritiesSettlementTransactionGenerationNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AdditionalPhysicalOrRegistrationDetails is used, then the instruction
	 * must be free of payment.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV05(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}