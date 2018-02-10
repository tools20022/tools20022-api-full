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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * During ISO 15022 – 20022 coexistence, Amount length must not be greater than
 * 15, including the decimal point.
 */
public class ConstraintCoexistenceAmountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01
	 * SecuritiesFinancingConfirmationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV01> forSecuritiesFinancingConfirmationV01 = new MMConstraint<SecuritiesFinancingConfirmationV01>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingConfirmationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingConfirmationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV02
	 * SecuritiesFinancingConfirmationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV02> forSecuritiesFinancingConfirmationV02 = new MMConstraint<SecuritiesFinancingConfirmationV02>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingConfirmationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV03
	 * SecuritiesFinancingConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV03> forSecuritiesFinancingConfirmationV03 = new MMConstraint<SecuritiesFinancingConfirmationV03>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingConfirmationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04
	 * SecuritiesFinancingConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesFinancingConfirmationV05
	 * ConstraintCoexistenceAmountRule.forSecuritiesFinancingConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV04> forSecuritiesFinancingConfirmationV04 = new MMConstraint<SecuritiesFinancingConfirmationV04>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesFinancingConfirmationV05);
			owner_lazy = () -> SecuritiesFinancingConfirmationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01
	 * SecuritiesFinancingInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV01> forSecuritiesFinancingInstructionV01 = new MMConstraint<SecuritiesFinancingInstructionV01>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingInstructionV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV02
	 * SecuritiesFinancingInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV02> forSecuritiesFinancingInstructionV02 = new MMConstraint<SecuritiesFinancingInstructionV02>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingInstructionV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV03
	 * SecuritiesFinancingInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV03> forSecuritiesFinancingInstructionV03 = new MMConstraint<SecuritiesFinancingInstructionV03>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingInstructionV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01
	 * SecuritiesSettlementTransactionConfirmationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV01> forSecuritiesSettlementTransactionConfirmationV01 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV01>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionConfirmationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV02
	 * SecuritiesSettlementTransactionConfirmationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV02> forSecuritiesSettlementTransactionConfirmationV02 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV02>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV03
	 * SecuritiesSettlementTransactionConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV03> forSecuritiesSettlementTransactionConfirmationV03 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV03>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV04
	 * SecuritiesSettlementTransactionConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesSettlementTransactionConfirmationV05
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV04> forSecuritiesSettlementTransactionConfirmationV04 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV04>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesSettlementTransactionConfirmationV05);
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV04.mmObject();
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
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV01> forSecuritiesSettlementTransactionGenerationNotificationV01 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV01>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionGenerationNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
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
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV02> forSecuritiesSettlementTransactionGenerationNotificationV02 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV02>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionGenerationNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
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
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV03> forSecuritiesSettlementTransactionGenerationNotificationV03 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV03>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionGenerationNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
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
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesSettlementTransactionGenerationNotificationV05
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV04> forSecuritiesSettlementTransactionGenerationNotificationV04 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV04>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionGenerationNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesSettlementTransactionGenerationNotificationV05);
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
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV01> forSecuritiesSettlementTransactionInstructionV01 = new MMConstraint<SecuritiesSettlementTransactionInstructionV01>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
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
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV02> forSecuritiesSettlementTransactionInstructionV02 = new MMConstraint<SecuritiesSettlementTransactionInstructionV02>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
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
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV03> forSecuritiesSettlementTransactionInstructionV03 = new MMConstraint<SecuritiesSettlementTransactionInstructionV03>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
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
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV04> forSecuritiesSettlementTransactionInstructionV04 = new MMConstraint<SecuritiesSettlementTransactionInstructionV04>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesSettlementTransactionInstructionV05);
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV04
	 * SecuritiesFinancingInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesFinancingInstructionV05
	 * ConstraintCoexistenceAmountRule.forSecuritiesFinancingInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV04> forSecuritiesFinancingInstructionV04 = new MMConstraint<SecuritiesFinancingInstructionV04>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesFinancingInstructionV05);
			owner_lazy = () -> SecuritiesFinancingInstructionV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01
	 * SecuritiesFinancingModificationInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingModificationInstructionV01> forSecuritiesFinancingModificationInstructionV01 = new MMConstraint<SecuritiesFinancingModificationInstructionV01>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingModificationInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingModificationInstructionV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV02
	 * SecuritiesFinancingModificationInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingModificationInstructionV02> forSecuritiesFinancingModificationInstructionV02 = new MMConstraint<SecuritiesFinancingModificationInstructionV02>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingModificationInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingModificationInstructionV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01
	 * SecuritiesSettlementTransactionAllegementNotificationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01> forSecuritiesSettlementTransactionAllegementNotificationV01 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionAllegementNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV02
	 * SecuritiesSettlementTransactionAllegementNotificationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02> forSecuritiesSettlementTransactionAllegementNotificationV02 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionAllegementNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01
	 * SecuritiesSettlementTransactionReversalAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV01> forSecuritiesSettlementTransactionReversalAdviceV01 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV01>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionReversalAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV02
	 * SecuritiesSettlementTransactionReversalAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV02> forSecuritiesSettlementTransactionReversalAdviceV02 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV02>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionReversalAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03
	 * SecuritiesFinancingModificationInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesFinancingModificationInstructionV04
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesFinancingModificationInstructionV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingModificationInstructionV03> forSecuritiesFinancingModificationInstructionV03 = new MMConstraint<SecuritiesFinancingModificationInstructionV03>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingModificationInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesFinancingModificationInstructionV04);
			owner_lazy = () -> SecuritiesFinancingModificationInstructionV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV03
	 * SecuritiesSettlementTransactionAllegementNotificationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesSettlementTransactionAllegementNotificationV04
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03> forSecuritiesSettlementTransactionAllegementNotificationV03 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionAllegementNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesSettlementTransactionAllegementNotificationV04);
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03
	 * SecuritiesSettlementTransactionReversalAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesSettlementTransactionReversalAdviceV04
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesSettlementTransactionReversalAdviceV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV03> forSecuritiesSettlementTransactionReversalAdviceV03 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV03>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionReversalAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesSettlementTransactionReversalAdviceV04);
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV04
	 * SecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesSettlementTransactionAllegementNotificationV03
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04> forSecuritiesSettlementTransactionAllegementNotificationV04 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionAllegementNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesSettlementTransactionAllegementNotificationV03;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05
	 * SecuritiesFinancingConfirmationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesFinancingConfirmationV04
	 * ConstraintCoexistenceAmountRule.forSecuritiesFinancingConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV05> forSecuritiesFinancingConfirmationV05 = new MMConstraint<SecuritiesFinancingConfirmationV05>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesFinancingConfirmationV04;
			owner_lazy = () -> SecuritiesFinancingConfirmationV05.mmObject();
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
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesSettlementTransactionGenerationNotificationV04
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV05> forSecuritiesSettlementTransactionGenerationNotificationV05 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV05>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionGenerationNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesSettlementTransactionGenerationNotificationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04
	 * SecuritiesSettlementTransactionReversalAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesSettlementTransactionReversalAdviceV03
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesSettlementTransactionReversalAdviceV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV04> forSecuritiesSettlementTransactionReversalAdviceV04 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV04>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionReversalAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesSettlementTransactionReversalAdviceV03;
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV05
	 * SecuritiesFinancingInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesFinancingInstructionV04
	 * ConstraintCoexistenceAmountRule.forSecuritiesFinancingInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV05> forSecuritiesFinancingInstructionV05 = new MMConstraint<SecuritiesFinancingInstructionV05>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesFinancingInstructionV04;
			owner_lazy = () -> SecuritiesFinancingInstructionV05.mmObject();
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
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesSettlementTransactionInstructionV04
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesSettlementTransactionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV05> forSecuritiesSettlementTransactionInstructionV05 = new MMConstraint<SecuritiesSettlementTransactionInstructionV05>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesSettlementTransactionInstructionV04;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV05
	 * SecuritiesSettlementTransactionConfirmationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesSettlementTransactionConfirmationV04
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesSettlementTransactionConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV05> forSecuritiesSettlementTransactionConfirmationV05 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV05>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesSettlementTransactionConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesSettlementTransactionConfirmationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04
	 * SecuritiesFinancingModificationInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesFinancingModificationInstructionV03
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesFinancingModificationInstructionV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingModificationInstructionV04> forSecuritiesFinancingModificationInstructionV04 = new MMConstraint<SecuritiesFinancingModificationInstructionV04>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingModificationInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesFinancingModificationInstructionV03;
			owner_lazy = () -> SecuritiesFinancingModificationInstructionV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection8
	 * AmountAndDirection8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection8> forAmountAndDirection8 = new MMConstraint<AmountAndDirection8>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountAndDirection8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails10
	 * TransactionDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails10> forTransactionDetails10 = new MMConstraint<TransactionDetails10>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails29
	 * TransactionDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails29> forTransactionDetails29 = new MMConstraint<TransactionDetails29>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11
	 * ForeignExchangeTerms11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ForeignExchangeTerms11> forForeignExchangeTerms11 = new MMConstraint<ForeignExchangeTerms11>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkForeignExchangeTerms11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> ForeignExchangeTerms11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32
	 * AmountAndDirection32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forAmountAndDirection37
	 * ConstraintCoexistenceAmountRule.forAmountAndDirection37}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection32> forAmountAndDirection32 = new MMConstraint<AmountAndDirection32>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forAmountAndDirection37);
			owner_lazy = () -> AmountAndDirection32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection9> forAmountAndDirection9 = new MMConstraint<AmountAndDirection9>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountAndDirection9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12 OtherAmounts12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts12> forOtherAmounts12 = new MMConstraint<OtherAmounts12>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14 OtherAmounts14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts14> forOtherAmounts14 = new MMConstraint<OtherAmounts14>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails28
	 * TransactionDetails28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails28> forTransactionDetails28 = new MMConstraint<TransactionDetails28>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection12
	 * AmountAndDirection12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection12> forAmountAndDirection12 = new MMConstraint<AmountAndDirection12>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AmountAndDirection12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails31
	 * TransactionDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails31> forTransactionDetails31 = new MMConstraint<TransactionDetails31>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails44
	 * TransactionDetails44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails44> forTransactionDetails44 = new MMConstraint<TransactionDetails44>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails44.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12
	 * ForeignExchangeTerms12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ForeignExchangeTerms12> forForeignExchangeTerms12 = new MMConstraint<ForeignExchangeTerms12>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkForeignExchangeTerms12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> ForeignExchangeTerms12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33
	 * AmountAndDirection33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection33> forAmountAndDirection33 = new MMConstraint<AmountAndDirection33>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountAndDirection33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection17> forAmountAndDirection17 = new MMConstraint<AmountAndDirection17>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AmountAndDirection17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20 OtherAmounts20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts20> forOtherAmounts20 = new MMConstraint<OtherAmounts20>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities2
	 * OriginalAndCurrentQuantities2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalAndCurrentQuantities2> forOriginalAndCurrentQuantities2 = new MMConstraint<OriginalAndCurrentQuantities2>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOriginalAndCurrentQuantities2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OriginalAndCurrentQuantities2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Quantity4Choice
	 * Quantity4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity4Choice> forQuantity4Choice = new MMConstraint<Quantity4Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantity4Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Quantity4Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat12Choice
	 * RateAndAmountFormat12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat12Choice> forRateAndAmountFormat12Choice = new MMConstraint<RateAndAmountFormat12Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat12Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateAndAmountFormat12Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat5Choice
	 * PriceFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat5Choice> forPriceFormat5Choice = new MMConstraint<PriceFormat5Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat5Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat5Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat9Choice
	 * PriceFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat9Choice> forPriceFormat9Choice = new MMConstraint<PriceFormat9Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat9Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat9Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5
	 * CorporateActionOption5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption5> forCorporateActionOption5 = new MMConstraint<CorporateActionOption5>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities3
	 * OriginalAndCurrentQuantities3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalAndCurrentQuantities3> forOriginalAndCurrentQuantities3 = new MMConstraint<OriginalAndCurrentQuantities3>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOriginalAndCurrentQuantities3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> OriginalAndCurrentQuantities3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Quantity9Choice
	 * Quantity9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity9Choice> forQuantity9Choice = new MMConstraint<Quantity9Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantity9Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> Quantity9Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat13Choice
	 * RateAndAmountFormat13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat13Choice> forRateAndAmountFormat13Choice = new MMConstraint<RateAndAmountFormat13Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat13Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RateAndAmountFormat13Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat17Choice
	 * PriceFormat17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat17Choice> forPriceFormat17Choice = new MMConstraint<PriceFormat17Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat17Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PriceFormat17Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat18Choice
	 * PriceFormat18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat18Choice> forPriceFormat18Choice = new MMConstraint<PriceFormat18Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat18Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PriceFormat18Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13
	 * CorporateActionOption13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption13> forCorporateActionOption13 = new MMConstraint<CorporateActionOption13>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CorporateActionOption13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat21Choice
	 * PriceFormat21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forPriceFormat33Choice
	 * ConstraintCoexistenceAmountRule.forPriceFormat33Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat21Choice> forPriceFormat21Choice = new MMConstraint<PriceFormat21Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat21Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forPriceFormat33Choice);
			owner_lazy = () -> PriceFormat21Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25
	 * CorporateActionOption25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption25> forCorporateActionOption25 = new MMConstraint<CorporateActionOption25>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat24Choice
	 * PriceFormat24Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat24Choice> forPriceFormat24Choice = new MMConstraint<PriceFormat24Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat24Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat24Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30
	 * CorporateActionOption30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption30> forCorporateActionOption30 = new MMConstraint<CorporateActionOption30>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption30.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38
	 * CorporateActionOption38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption38> forCorporateActionOption38 = new MMConstraint<CorporateActionOption38>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption38.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47
	 * CorporateActionOption47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption47> forCorporateActionOption47 = new MMConstraint<CorporateActionOption47>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption47.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57
	 * CorporateActionOption57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionOption103
	 * ConstraintCoexistenceAmountRule.forCorporateActionOption103}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption57> forCorporateActionOption57 = new MMConstraint<CorporateActionOption57>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionOption103);
			owner_lazy = () -> CorporateActionOption57.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58
	 * CorporateActionOption58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption58> forCorporateActionOption58 = new MMConstraint<CorporateActionOption58>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption58;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption58.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat5Choice
	 * RateAndAmountFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat5Choice> forRateAndAmountFormat5Choice = new MMConstraint<RateAndAmountFormat5Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat5Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateAndAmountFormat5Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus1
	 * RateTypeAndAmountAndStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus1> forRateTypeAndAmountAndStatus1 = new MMConstraint<RateTypeAndAmountAndStatus1>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateTypeAndAmountAndStatus1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat2Choice
	 * GrossDividendRateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GrossDividendRateFormat2Choice> forGrossDividendRateFormat2Choice = new MMConstraint<GrossDividendRateFormat2Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkGrossDividendRateFormat2Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> GrossDividendRateFormat2Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus3
	 * RateTypeAndAmountAndStatus3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus3> forRateTypeAndAmountAndStatus3 = new MMConstraint<RateTypeAndAmountAndStatus3>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateTypeAndAmountAndStatus3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat2Choice
	 * InterestRateUsedForPaymentFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InterestRateUsedForPaymentFormat2Choice> forInterestRateUsedForPaymentFormat2Choice = new MMConstraint<InterestRateUsedForPaymentFormat2Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkInterestRateUsedForPaymentFormat2Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> InterestRateUsedForPaymentFormat2Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus4
	 * RateTypeAndAmountAndStatus4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus4> forRateTypeAndAmountAndStatus4 = new MMConstraint<RateTypeAndAmountAndStatus4>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateTypeAndAmountAndStatus4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat2Choice
	 * NetDividendRateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat2Choice> forNetDividendRateFormat2Choice = new MMConstraint<NetDividendRateFormat2Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat2Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> NetDividendRateFormat2Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus5
	 * RateTypeAndAmountAndStatus5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus5> forRateTypeAndAmountAndStatus5 = new MMConstraint<RateTypeAndAmountAndStatus5>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateTypeAndAmountAndStatus5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat2Choice
	 * TaxCreditRateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TaxCreditRateFormat2Choice> forTaxCreditRateFormat2Choice = new MMConstraint<TaxCreditRateFormat2Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTaxCreditRateFormat2Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TaxCreditRateFormat2Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus6
	 * RateTypeAndAmountAndStatus6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus6> forRateTypeAndAmountAndStatus6 = new MMConstraint<RateTypeAndAmountAndStatus6>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateTypeAndAmountAndStatus6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat6Choice
	 * PriceFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat6Choice> forPriceFormat6Choice = new MMConstraint<PriceFormat6Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat6Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat6Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice
	 * PriceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forPriceFormat34Choice
	 * ConstraintCoexistenceAmountRule.forPriceFormat34Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat7Choice> forPriceFormat7Choice = new MMConstraint<PriceFormat7Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat7Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forPriceFormat34Choice);
			owner_lazy = () -> PriceFormat7Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat3Choice
	 * RatioFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat3Choice> forRatioFormat3Choice = new MMConstraint<RatioFormat3Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRatioFormat3Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat3Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio2
	 * AmountAndQuantityRatio2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndQuantityRatio2> forAmountAndQuantityRatio2 = new MMConstraint<AmountAndQuantityRatio2>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndQuantityRatio2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountAndQuantityRatio2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat4Choice
	 * RatioFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat4Choice> forRatioFormat4Choice = new MMConstraint<RatioFormat4Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRatioFormat4Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat4Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts2> forCorporateActionAmounts2 = new MMConstraint<CorporateActionAmounts2>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionAmounts2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption2 CashOption2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption2> forCashOption2 = new MMConstraint<CashOption2>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4
	 * CorporateActionOption4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption4> forCorporateActionOption4 = new MMConstraint<CorporateActionOption4>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat6Choice
	 * RateAndAmountFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat6Choice> forRateAndAmountFormat6Choice = new MMConstraint<RateAndAmountFormat6Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat6Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RateAndAmountFormat6Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus2
	 * RateTypeAndAmountAndStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus2> forRateTypeAndAmountAndStatus2 = new MMConstraint<RateTypeAndAmountAndStatus2>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RateTypeAndAmountAndStatus2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat3Choice
	 * GrossDividendRateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GrossDividendRateFormat3Choice> forGrossDividendRateFormat3Choice = new MMConstraint<GrossDividendRateFormat3Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkGrossDividendRateFormat3Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> GrossDividendRateFormat3Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus7
	 * RateTypeAndAmountAndStatus7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus7> forRateTypeAndAmountAndStatus7 = new MMConstraint<RateTypeAndAmountAndStatus7>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RateTypeAndAmountAndStatus7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat3Choice
	 * InterestRateUsedForPaymentFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InterestRateUsedForPaymentFormat3Choice> forInterestRateUsedForPaymentFormat3Choice = new MMConstraint<InterestRateUsedForPaymentFormat3Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkInterestRateUsedForPaymentFormat3Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> InterestRateUsedForPaymentFormat3Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus8
	 * RateTypeAndAmountAndStatus8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus8> forRateTypeAndAmountAndStatus8 = new MMConstraint<RateTypeAndAmountAndStatus8>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RateTypeAndAmountAndStatus8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat3Choice
	 * NetDividendRateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat3Choice> forNetDividendRateFormat3Choice = new MMConstraint<NetDividendRateFormat3Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat3Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> NetDividendRateFormat3Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus9
	 * RateTypeAndAmountAndStatus9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus9> forRateTypeAndAmountAndStatus9 = new MMConstraint<RateTypeAndAmountAndStatus9>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RateTypeAndAmountAndStatus9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat3Choice
	 * TaxCreditRateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TaxCreditRateFormat3Choice> forTaxCreditRateFormat3Choice = new MMConstraint<TaxCreditRateFormat3Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTaxCreditRateFormat3Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> TaxCreditRateFormat3Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus10
	 * RateTypeAndAmountAndStatus10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus10> forRateTypeAndAmountAndStatus10 = new MMConstraint<RateTypeAndAmountAndStatus10>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RateTypeAndAmountAndStatus10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat12Choice
	 * PriceFormat12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat12Choice> forPriceFormat12Choice = new MMConstraint<PriceFormat12Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat12Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PriceFormat12Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat13Choice
	 * PriceFormat13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat13Choice> forPriceFormat13Choice = new MMConstraint<PriceFormat13Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat13Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PriceFormat13Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat7Choice
	 * RatioFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat7Choice> forRatioFormat7Choice = new MMConstraint<RatioFormat7Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRatioFormat7Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RatioFormat7Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio3
	 * AmountAndQuantityRatio3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndQuantityRatio3> forAmountAndQuantityRatio3 = new MMConstraint<AmountAndQuantityRatio3>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndQuantityRatio3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AmountAndQuantityRatio3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat8Choice
	 * RatioFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat8Choice> forRatioFormat8Choice = new MMConstraint<RatioFormat8Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRatioFormat8Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RatioFormat8Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5
	 * CorporateActionAmounts5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts5> forCorporateActionAmounts5 = new MMConstraint<CorporateActionAmounts5>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CorporateActionAmounts5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption9 CashOption9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption9> forCashOption9 = new MMConstraint<CashOption9>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CashOption9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14
	 * CorporateActionOption14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption14> forCorporateActionOption14 = new MMConstraint<CorporateActionOption14>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CorporateActionOption14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus11
	 * RateTypeAndAmountAndStatus11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus11> forRateTypeAndAmountAndStatus11 = new MMConstraint<RateTypeAndAmountAndStatus11>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateTypeAndAmountAndStatus11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11
	 * CorporateActionAmounts11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts11> forCorporateActionAmounts11 = new MMConstraint<CorporateActionAmounts11>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionAmounts11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption12 CashOption12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption12> forCashOption12 = new MMConstraint<CashOption12>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23
	 * CorporateActionOption23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption23> forCorporateActionOption23 = new MMConstraint<CorporateActionOption23>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus12
	 * RateTypeAndAmountAndStatus12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus12> forRateTypeAndAmountAndStatus12 = new MMConstraint<RateTypeAndAmountAndStatus12>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateTypeAndAmountAndStatus12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts12> forCorporateActionAmounts12 = new MMConstraint<CorporateActionAmounts12>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionAmounts12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption13 CashOption13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption13> forCashOption13 = new MMConstraint<CashOption13>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31
	 * CorporateActionOption31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption31> forCorporateActionOption31 = new MMConstraint<CorporateActionOption31>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat1Choice
	 * NetDividendRateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat1Choice> forNetDividendRateFormat1Choice = new MMConstraint<NetDividendRateFormat1Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat1Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> NetDividendRateFormat1Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat5Choice
	 * NetDividendRateFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat5Choice> forNetDividendRateFormat5Choice = new MMConstraint<NetDividendRateFormat5Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat5Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> NetDividendRateFormat5Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat7Choice
	 * NetDividendRateFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat7Choice> forNetDividendRateFormat7Choice = new MMConstraint<NetDividendRateFormat7Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat7Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> NetDividendRateFormat7Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat15Choice
	 * RatioFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat15Choice> forRatioFormat15Choice = new MMConstraint<RatioFormat15Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRatioFormat15Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat15Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17
	 * CorporateActionAmounts17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts17> forCorporateActionAmounts17 = new MMConstraint<CorporateActionAmounts17>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionAmounts17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption18 CashOption18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption18> forCashOption18 = new MMConstraint<CashOption18>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37
	 * CorporateActionOption37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption37> forCorporateActionOption37 = new MMConstraint<CorporateActionOption37>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat8Choice
	 * NetDividendRateFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat8Choice> forNetDividendRateFormat8Choice = new MMConstraint<NetDividendRateFormat8Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat8Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> NetDividendRateFormat8Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat16Choice
	 * RatioFormat16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat16Choice> forRatioFormat16Choice = new MMConstraint<RatioFormat16Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRatioFormat16Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat16Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20
	 * CorporateActionAmounts20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts20> forCorporateActionAmounts20 = new MMConstraint<CorporateActionAmounts20>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionAmounts20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption22 CashOption22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption22> forCashOption22 = new MMConstraint<CashOption22>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46
	 * CorporateActionOption46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption46> forCorporateActionOption46 = new MMConstraint<CorporateActionOption46>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption46.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus15
	 * RateTypeAndAmountAndStatus15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus15> forRateTypeAndAmountAndStatus15 = new MMConstraint<RateTypeAndAmountAndStatus15>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateTypeAndAmountAndStatus15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat10Choice
	 * GrossDividendRateFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GrossDividendRateFormat10Choice> forGrossDividendRateFormat10Choice = new MMConstraint<GrossDividendRateFormat10Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkGrossDividendRateFormat10Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> GrossDividendRateFormat10Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus16
	 * RateTypeAndAmountAndStatus16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus16> forRateTypeAndAmountAndStatus16 = new MMConstraint<RateTypeAndAmountAndStatus16>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateTypeAndAmountAndStatus16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat12Choice
	 * NetDividendRateFormat12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat12Choice> forNetDividendRateFormat12Choice = new MMConstraint<NetDividendRateFormat12Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat12Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> NetDividendRateFormat12Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23
	 * CorporateActionAmounts23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionAmounts29
	 * ConstraintCoexistenceAmountRule.forCorporateActionAmounts29}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts23> forCorporateActionAmounts23 = new MMConstraint<CorporateActionAmounts23>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionAmounts29);
			owner_lazy = () -> CorporateActionAmounts23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus13
	 * RateTypeAndAmountAndStatus13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus13> forRateTypeAndAmountAndStatus13 = new MMConstraint<RateTypeAndAmountAndStatus13>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateTypeAndAmountAndStatus13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat8Choice
	 * GrossDividendRateFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GrossDividendRateFormat8Choice> forGrossDividendRateFormat8Choice = new MMConstraint<GrossDividendRateFormat8Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkGrossDividendRateFormat8Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> GrossDividendRateFormat8Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus14
	 * RateTypeAndAmountAndStatus14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus14> forRateTypeAndAmountAndStatus14 = new MMConstraint<RateTypeAndAmountAndStatus14>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateTypeAndAmountAndStatus14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat10Choice
	 * NetDividendRateFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat10Choice> forNetDividendRateFormat10Choice = new MMConstraint<NetDividendRateFormat10Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat10Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> NetDividendRateFormat10Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption26 CashOption26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCashOption30
	 * ConstraintCoexistenceAmountRule.forCashOption30}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption26> forCashOption26 = new MMConstraint<CashOption26>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCashOption30);
			owner_lazy = () -> CashOption26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53
	 * CorporateActionOption53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionOption102
	 * ConstraintCoexistenceAmountRule.forCorporateActionOption102}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption53> forCorporateActionOption53 = new MMConstraint<CorporateActionOption53>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption53;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionOption102);
			owner_lazy = () -> CorporateActionOption53.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus17
	 * RateTypeAndAmountAndStatus17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus17> forRateTypeAndAmountAndStatus17 = new MMConstraint<RateTypeAndAmountAndStatus17>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RateTypeAndAmountAndStatus17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat11Choice
	 * GrossDividendRateFormat11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GrossDividendRateFormat11Choice> forGrossDividendRateFormat11Choice = new MMConstraint<GrossDividendRateFormat11Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkGrossDividendRateFormat11Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> GrossDividendRateFormat11Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus18
	 * RateTypeAndAmountAndStatus18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus18> forRateTypeAndAmountAndStatus18 = new MMConstraint<RateTypeAndAmountAndStatus18>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RateTypeAndAmountAndStatus18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat13Choice
	 * NetDividendRateFormat13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat13Choice> forNetDividendRateFormat13Choice = new MMConstraint<NetDividendRateFormat13Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat13Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> NetDividendRateFormat13Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus19
	 * RateTypeAndAmountAndStatus19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus19> forRateTypeAndAmountAndStatus19 = new MMConstraint<RateTypeAndAmountAndStatus19>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateTypeAndAmountAndStatus19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24
	 * CorporateActionAmounts24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts24> forCorporateActionAmounts24 = new MMConstraint<CorporateActionAmounts24>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionAmounts24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus20
	 * RateTypeAndAmountAndStatus20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus20> forRateTypeAndAmountAndStatus20 = new MMConstraint<RateTypeAndAmountAndStatus20>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RateTypeAndAmountAndStatus20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat12Choice
	 * GrossDividendRateFormat12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GrossDividendRateFormat12Choice> forGrossDividendRateFormat12Choice = new MMConstraint<GrossDividendRateFormat12Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkGrossDividendRateFormat12Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> GrossDividendRateFormat12Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat18Choice
	 * RateAndAmountFormat18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat18Choice> forRateAndAmountFormat18Choice = new MMConstraint<RateAndAmountFormat18Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat18Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateAndAmountFormat18Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus21
	 * RateTypeAndAmountAndStatus21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateTypeAndAmountAndStatus21> forRateTypeAndAmountAndStatus21 = new MMConstraint<RateTypeAndAmountAndStatus21>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateTypeAndAmountAndStatus21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RateTypeAndAmountAndStatus21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat14Choice
	 * NetDividendRateFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat14Choice> forNetDividendRateFormat14Choice = new MMConstraint<NetDividendRateFormat14Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat14Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> NetDividendRateFormat14Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption27 CashOption27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption27> forCashOption27 = new MMConstraint<CashOption27>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54
	 * CorporateActionOption54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption54> forCorporateActionOption54 = new MMConstraint<CorporateActionOption54>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption54;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption54.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat3Choice
	 * RateAndAmountFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat3Choice> forRateAndAmountFormat3Choice = new MMConstraint<RateAndAmountFormat3Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat3Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateAndAmountFormat3Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat4Choice
	 * RateAndAmountFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat4Choice> forRateAndAmountFormat4Choice = new MMConstraint<RateAndAmountFormat4Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat4Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateAndAmountFormat4Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat1Choice
	 * GrossDividendRateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GrossDividendRateFormat1Choice> forGrossDividendRateFormat1Choice = new MMConstraint<GrossDividendRateFormat1Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkGrossDividendRateFormat1Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> GrossDividendRateFormat1Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat1Choice
	 * InterestRateUsedForPaymentFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InterestRateUsedForPaymentFormat1Choice> forInterestRateUsedForPaymentFormat1Choice = new MMConstraint<InterestRateUsedForPaymentFormat1Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkInterestRateUsedForPaymentFormat1Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> InterestRateUsedForPaymentFormat1Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat1Choice
	 * TaxCreditRateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TaxCreditRateFormat1Choice> forTaxCreditRateFormat1Choice = new MMConstraint<TaxCreditRateFormat1Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTaxCreditRateFormat1Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TaxCreditRateFormat1Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat1Choice
	 * SolicitationFeeRateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SolicitationFeeRateFormat1Choice> forSolicitationFeeRateFormat1Choice = new MMConstraint<SolicitationFeeRateFormat1Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSolicitationFeeRateFormat1Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SolicitationFeeRateFormat1Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat11Choice
	 * PriceFormat11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat11Choice> forPriceFormat11Choice = new MMConstraint<PriceFormat11Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat11Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat11Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat8Choice
	 * PriceFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat8Choice> forPriceFormat8Choice = new MMConstraint<PriceFormat8Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat8Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat8Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat5Choice
	 * RatioFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat5Choice> forRatioFormat5Choice = new MMConstraint<RatioFormat5Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRatioFormat5Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat5Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat6Choice
	 * RatioFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat6Choice> forRatioFormat6Choice = new MMConstraint<RatioFormat6Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRatioFormat6Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat6Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat10Choice
	 * PriceFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat10Choice> forPriceFormat10Choice = new MMConstraint<PriceFormat10Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat10Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat10Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption3 CashOption3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption3> forCashOption3 = new MMConstraint<CashOption3>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10
	 * CorporateActionOption10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption10> forCorporateActionOption10 = new MMConstraint<CorporateActionOption10>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat7Choice
	 * RateAndAmountFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat7Choice> forRateAndAmountFormat7Choice = new MMConstraint<RateAndAmountFormat7Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat7Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RateAndAmountFormat7Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat8Choice
	 * RateAndAmountFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat8Choice> forRateAndAmountFormat8Choice = new MMConstraint<RateAndAmountFormat8Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat8Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RateAndAmountFormat8Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat4Choice
	 * GrossDividendRateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GrossDividendRateFormat4Choice> forGrossDividendRateFormat4Choice = new MMConstraint<GrossDividendRateFormat4Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkGrossDividendRateFormat4Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> GrossDividendRateFormat4Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat4Choice
	 * InterestRateUsedForPaymentFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InterestRateUsedForPaymentFormat4Choice> forInterestRateUsedForPaymentFormat4Choice = new MMConstraint<InterestRateUsedForPaymentFormat4Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkInterestRateUsedForPaymentFormat4Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> InterestRateUsedForPaymentFormat4Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat4Choice
	 * NetDividendRateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat4Choice> forNetDividendRateFormat4Choice = new MMConstraint<NetDividendRateFormat4Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat4Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> NetDividendRateFormat4Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat4Choice
	 * TaxCreditRateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TaxCreditRateFormat4Choice> forTaxCreditRateFormat4Choice = new MMConstraint<TaxCreditRateFormat4Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTaxCreditRateFormat4Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> TaxCreditRateFormat4Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat2Choice
	 * SolicitationFeeRateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SolicitationFeeRateFormat2Choice> forSolicitationFeeRateFormat2Choice = new MMConstraint<SolicitationFeeRateFormat2Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSolicitationFeeRateFormat2Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SolicitationFeeRateFormat2Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat15Choice
	 * PriceFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat15Choice> forPriceFormat15Choice = new MMConstraint<PriceFormat15Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat15Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PriceFormat15Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat16Choice
	 * PriceFormat16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat16Choice> forPriceFormat16Choice = new MMConstraint<PriceFormat16Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat16Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PriceFormat16Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat9Choice
	 * RatioFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat9Choice> forRatioFormat9Choice = new MMConstraint<RatioFormat9Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRatioFormat9Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RatioFormat9Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat10Choice
	 * RatioFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat10Choice> forRatioFormat10Choice = new MMConstraint<RatioFormat10Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRatioFormat10Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RatioFormat10Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat14Choice
	 * PriceFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat14Choice> forPriceFormat14Choice = new MMConstraint<PriceFormat14Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat14Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PriceFormat14Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption6 CashOption6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption6> forCashOption6 = new MMConstraint<CashOption6>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CashOption6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15
	 * CorporateActionOption15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption15> forCorporateActionOption15 = new MMConstraint<CorporateActionOption15>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CorporateActionOption15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat14Choice
	 * RateAndAmountFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forRateAndAmountFormat19Choice
	 * ConstraintCoexistenceAmountRule.forRateAndAmountFormat19Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat14Choice> forRateAndAmountFormat14Choice = new MMConstraint<RateAndAmountFormat14Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat14Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forRateAndAmountFormat19Choice);
			owner_lazy = () -> RateAndAmountFormat14Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat5Choice
	 * GrossDividendRateFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GrossDividendRateFormat5Choice> forGrossDividendRateFormat5Choice = new MMConstraint<GrossDividendRateFormat5Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkGrossDividendRateFormat5Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> GrossDividendRateFormat5Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice
	 * InterestRateUsedForPaymentFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InterestRateUsedForPaymentFormat5Choice> forInterestRateUsedForPaymentFormat5Choice = new MMConstraint<InterestRateUsedForPaymentFormat5Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkInterestRateUsedForPaymentFormat5Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> InterestRateUsedForPaymentFormat5Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat19Choice
	 * PriceFormat19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat19Choice> forPriceFormat19Choice = new MMConstraint<PriceFormat19Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat19Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat19Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice
	 * PriceFormat20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forPriceFormat32Choice
	 * ConstraintCoexistenceAmountRule.forPriceFormat32Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat20Choice> forPriceFormat20Choice = new MMConstraint<PriceFormat20Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat20Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forPriceFormat32Choice);
			owner_lazy = () -> PriceFormat20Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat11Choice
	 * RatioFormat11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat11Choice> forRatioFormat11Choice = new MMConstraint<RatioFormat11Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRatioFormat11Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat11Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat12Choice
	 * RatioFormat12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat12Choice> forRatioFormat12Choice = new MMConstraint<RatioFormat12Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRatioFormat12Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat12Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13
	 * ForeignExchangeTerms13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ForeignExchangeTerms13> forForeignExchangeTerms13 = new MMConstraint<ForeignExchangeTerms13>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkForeignExchangeTerms13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> ForeignExchangeTerms13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat3Choice
	 * SolicitationFeeRateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SolicitationFeeRateFormat3Choice> forSolicitationFeeRateFormat3Choice = new MMConstraint<SolicitationFeeRateFormat3Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSolicitationFeeRateFormat3Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SolicitationFeeRateFormat3Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat15Choice
	 * RateAndAmountFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat15Choice> forRateAndAmountFormat15Choice = new MMConstraint<RateAndAmountFormat15Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat15Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateAndAmountFormat15Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat5Choice
	 * TaxCreditRateFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TaxCreditRateFormat5Choice> forTaxCreditRateFormat5Choice = new MMConstraint<TaxCreditRateFormat5Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTaxCreditRateFormat5Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TaxCreditRateFormat5Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat23Choice
	 * PriceFormat23Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat23Choice> forPriceFormat23Choice = new MMConstraint<PriceFormat23Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat23Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat23Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat22Choice
	 * PriceFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat22Choice> forPriceFormat22Choice = new MMConstraint<PriceFormat22Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat22Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat22Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption11 CashOption11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption11> forCashOption11 = new MMConstraint<CashOption11>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20
	 * CorporateActionOption20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption20> forCorporateActionOption20 = new MMConstraint<CorporateActionOption20>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat16Choice
	 * RateAndAmountFormat16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat16Choice> forRateAndAmountFormat16Choice = new MMConstraint<RateAndAmountFormat16Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat16Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateAndAmountFormat16Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat6Choice
	 * GrossDividendRateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GrossDividendRateFormat6Choice> forGrossDividendRateFormat6Choice = new MMConstraint<GrossDividendRateFormat6Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkGrossDividendRateFormat6Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> GrossDividendRateFormat6Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat6Choice
	 * InterestRateUsedForPaymentFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InterestRateUsedForPaymentFormat6Choice> forInterestRateUsedForPaymentFormat6Choice = new MMConstraint<InterestRateUsedForPaymentFormat6Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkInterestRateUsedForPaymentFormat6Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> InterestRateUsedForPaymentFormat6Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat25Choice
	 * PriceFormat25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat25Choice> forPriceFormat25Choice = new MMConstraint<PriceFormat25Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat25Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat25Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat26Choice
	 * PriceFormat26Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat26Choice> forPriceFormat26Choice = new MMConstraint<PriceFormat26Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat26Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat26Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat13Choice
	 * RatioFormat13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat13Choice> forRatioFormat13Choice = new MMConstraint<RatioFormat13Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRatioFormat13Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat13Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat14Choice
	 * RatioFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat14Choice> forRatioFormat14Choice = new MMConstraint<RatioFormat14Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRatioFormat14Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat14Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15
	 * ForeignExchangeTerms15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ForeignExchangeTerms15> forForeignExchangeTerms15 = new MMConstraint<ForeignExchangeTerms15>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkForeignExchangeTerms15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> ForeignExchangeTerms15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat4Choice
	 * SolicitationFeeRateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SolicitationFeeRateFormat4Choice> forSolicitationFeeRateFormat4Choice = new MMConstraint<SolicitationFeeRateFormat4Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSolicitationFeeRateFormat4Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SolicitationFeeRateFormat4Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat17Choice
	 * RateAndAmountFormat17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat17Choice> forRateAndAmountFormat17Choice = new MMConstraint<RateAndAmountFormat17Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat17Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateAndAmountFormat17Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat6Choice
	 * NetDividendRateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat6Choice> forNetDividendRateFormat6Choice = new MMConstraint<NetDividendRateFormat6Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat6Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> NetDividendRateFormat6Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat6Choice
	 * TaxCreditRateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TaxCreditRateFormat6Choice> forTaxCreditRateFormat6Choice = new MMConstraint<TaxCreditRateFormat6Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTaxCreditRateFormat6Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TaxCreditRateFormat6Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice
	 * PriceFormat27Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat27Choice> forPriceFormat27Choice = new MMConstraint<PriceFormat27Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat27Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat27Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice
	 * PriceFormat28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat28Choice> forPriceFormat28Choice = new MMConstraint<PriceFormat28Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat28Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat28Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption14 CashOption14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption14> forCashOption14 = new MMConstraint<CashOption14>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32
	 * CorporateActionOption32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption32> forCorporateActionOption32 = new MMConstraint<CorporateActionOption32>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat29Choice
	 * PriceFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat29Choice> forPriceFormat29Choice = new MMConstraint<PriceFormat29Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat29Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat29Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption16 CashOption16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption16> forCashOption16 = new MMConstraint<CashOption16>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35
	 * CorporateActionOption35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption35> forCorporateActionOption35 = new MMConstraint<CorporateActionOption35>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat31Choice
	 * PriceFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat31Choice> forPriceFormat31Choice = new MMConstraint<PriceFormat31Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat31Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat31Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption20 CashOption20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption20> forCashOption20 = new MMConstraint<CashOption20>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44
	 * CorporateActionOption44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption44> forCorporateActionOption44 = new MMConstraint<CorporateActionOption44>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption44.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat9Choice
	 * GrossDividendRateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GrossDividendRateFormat9Choice> forGrossDividendRateFormat9Choice = new MMConstraint<GrossDividendRateFormat9Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkGrossDividendRateFormat9Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> GrossDividendRateFormat9Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat11Choice
	 * NetDividendRateFormat11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat11Choice> forNetDividendRateFormat11Choice = new MMConstraint<NetDividendRateFormat11Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat11Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> NetDividendRateFormat11Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat7Choice
	 * GrossDividendRateFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GrossDividendRateFormat7Choice> forGrossDividendRateFormat7Choice = new MMConstraint<GrossDividendRateFormat7Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkGrossDividendRateFormat7Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> GrossDividendRateFormat7Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice
	 * SolicitationFeeRateFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SolicitationFeeRateFormat5Choice> forSolicitationFeeRateFormat5Choice = new MMConstraint<SolicitationFeeRateFormat5Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSolicitationFeeRateFormat5Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SolicitationFeeRateFormat5Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat8Choice
	 * RateFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateFormat8Choice> forRateFormat8Choice = new MMConstraint<RateFormat8Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateFormat8Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateFormat8Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat9Choice
	 * NetDividendRateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat9Choice> forNetDividendRateFormat9Choice = new MMConstraint<NetDividendRateFormat9Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat9Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> NetDividendRateFormat9Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption25 CashOption25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCashOption31
	 * ConstraintCoexistenceAmountRule.forCashOption31}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption25> forCashOption25 = new MMConstraint<CashOption25>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCashOption31);
			owner_lazy = () -> CashOption25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52
	 * CorporateActionOption52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionOption100
	 * ConstraintCoexistenceAmountRule.forCorporateActionOption100}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption52> forCorporateActionOption52 = new MMConstraint<CorporateActionOption52>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionOption100);
			owner_lazy = () -> CorporateActionOption52.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat13Choice
	 * GrossDividendRateFormat13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GrossDividendRateFormat13Choice> forGrossDividendRateFormat13Choice = new MMConstraint<GrossDividendRateFormat13Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkGrossDividendRateFormat13Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> GrossDividendRateFormat13Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat15Choice
	 * NetDividendRateFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat15Choice> forNetDividendRateFormat15Choice = new MMConstraint<NetDividendRateFormat15Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat15Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> NetDividendRateFormat15Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat14Choice
	 * GrossDividendRateFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GrossDividendRateFormat14Choice> forGrossDividendRateFormat14Choice = new MMConstraint<GrossDividendRateFormat14Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkGrossDividendRateFormat14Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> GrossDividendRateFormat14Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat6Choice
	 * SolicitationFeeRateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SolicitationFeeRateFormat6Choice> forSolicitationFeeRateFormat6Choice = new MMConstraint<SolicitationFeeRateFormat6Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSolicitationFeeRateFormat6Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SolicitationFeeRateFormat6Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat9Choice
	 * RateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateFormat9Choice> forRateFormat9Choice = new MMConstraint<RateFormat9Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateFormat9Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateFormat9Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat16Choice
	 * NetDividendRateFormat16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetDividendRateFormat16Choice> forNetDividendRateFormat16Choice = new MMConstraint<NetDividendRateFormat16Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkNetDividendRateFormat16Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> NetDividendRateFormat16Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption28 CashOption28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption28> forCashOption28 = new MMConstraint<CashOption28>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55
	 * CorporateActionOption55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption55> forCorporateActionOption55 = new MMConstraint<CorporateActionOption55>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption55.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption5 CashOption5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption5> forCashOption5 = new MMConstraint<CashOption5>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption7 CashOption7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption7> forCashOption7 = new MMConstraint<CashOption7>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CashOption7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption19 CashOption19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption19> forCashOption19 = new MMConstraint<CashOption19>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption23 CashOption23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption23> forCashOption23 = new MMConstraint<CashOption23>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4
	 * CorporateActionAmounts4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts4> forCorporateActionAmounts4 = new MMConstraint<CorporateActionAmounts4>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionAmounts4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption4 CashOption4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption4> forCashOption4 = new MMConstraint<CashOption4>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3
	 * CorporateActionOption3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption3> forCorporateActionOption3 = new MMConstraint<CorporateActionOption3>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7
	 * CorporateActionAmounts7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts7> forCorporateActionAmounts7 = new MMConstraint<CorporateActionAmounts7>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CorporateActionAmounts7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption8 CashOption8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption8> forCashOption8 = new MMConstraint<CashOption8>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CashOption8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17
	 * CorporateActionOption17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption17> forCorporateActionOption17 = new MMConstraint<CorporateActionOption17>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CorporateActionOption17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts10> forCorporateActionAmounts10 = new MMConstraint<CorporateActionAmounts10>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionAmounts10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption10 CashOption10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption10> forCashOption10 = new MMConstraint<CashOption10>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption19> forCorporateActionOption19 = new MMConstraint<CorporateActionOption19>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14
	 * CorporateActionAmounts14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts14> forCorporateActionAmounts14 = new MMConstraint<CorporateActionAmounts14>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionAmounts14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption15 CashOption15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption15> forCashOption15 = new MMConstraint<CashOption15>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34
	 * CorporateActionOption34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption34> forCorporateActionOption34 = new MMConstraint<CorporateActionOption34>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15
	 * CorporateActionAmounts15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts15> forCorporateActionAmounts15 = new MMConstraint<CorporateActionAmounts15>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionAmounts15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption17 CashOption17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption17> forCashOption17 = new MMConstraint<CashOption17>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36
	 * CorporateActionOption36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption36> forCorporateActionOption36 = new MMConstraint<CorporateActionOption36>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18
	 * CorporateActionAmounts18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts18> forCorporateActionAmounts18 = new MMConstraint<CorporateActionAmounts18>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionAmounts18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption21 CashOption21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption21> forCashOption21 = new MMConstraint<CashOption21>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45
	 * CorporateActionOption45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption45> forCorporateActionOption45 = new MMConstraint<CorporateActionOption45>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption45.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21
	 * CorporateActionAmounts21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionAmounts27
	 * ConstraintCoexistenceAmountRule.forCorporateActionAmounts27}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts21> forCorporateActionAmounts21 = new MMConstraint<CorporateActionAmounts21>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionAmounts27);
			owner_lazy = () -> CorporateActionAmounts21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption24 CashOption24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCashOption32
	 * ConstraintCoexistenceAmountRule.forCashOption32}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption24> forCashOption24 = new MMConstraint<CashOption24>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCashOption32);
			owner_lazy = () -> CashOption24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51
	 * CorporateActionOption51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionOption101
	 * ConstraintCoexistenceAmountRule.forCorporateActionOption101}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption51> forCorporateActionOption51 = new MMConstraint<CorporateActionOption51>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionOption101);
			owner_lazy = () -> CorporateActionOption51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26
	 * CorporateActionAmounts26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts26> forCorporateActionAmounts26 = new MMConstraint<CorporateActionAmounts26>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionAmounts26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption29 CashOption29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption29> forCashOption29 = new MMConstraint<CashOption29>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56
	 * CorporateActionOption56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption56> forCorporateActionOption56 = new MMConstraint<CorporateActionOption56>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD1Choice
	 * PriceFormatSD1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forPriceFormatSD2Choice
	 * ConstraintCoexistenceAmountRule.forPriceFormatSD2Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormatSD1Choice> forPriceFormatSD1Choice = new MMConstraint<PriceFormatSD1Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormatSD1Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forPriceFormatSD2Choice);
			owner_lazy = () -> PriceFormatSD1Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection24
	 * AmountAndDirection24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection24> forAmountAndDirection24 = new MMConstraint<AmountAndDirection24>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountAndDirection24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4
	 * QuantityBreakdown4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown4> forQuantityBreakdown4 = new MMConstraint<QuantityBreakdown4>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityBreakdown4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7
	 * AggregateBalancePerSafekeepingPlace7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace7> forAggregateBalancePerSafekeepingPlace7 = new MMConstraint<AggregateBalancePerSafekeepingPlace7>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation8> forAggregateBalanceInformation8 = new MMConstraint<AggregateBalanceInformation8>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalanceInformation8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8
	 * QuantityBreakdown8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown8> forQuantityBreakdown8 = new MMConstraint<QuantityBreakdown8>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityBreakdown8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> QuantityBreakdown8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10
	 * AggregateBalancePerSafekeepingPlace10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace10> forAggregateBalancePerSafekeepingPlace10 = new MMConstraint<AggregateBalancePerSafekeepingPlace10>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11
	 * AggregateBalanceInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation11> forAggregateBalanceInformation11 = new MMConstraint<AggregateBalanceInformation11>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AggregateBalanceInformation11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12
	 * AggregateBalancePerSafekeepingPlace12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace12> forAggregateBalancePerSafekeepingPlace12 = new MMConstraint<AggregateBalancePerSafekeepingPlace12>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13
	 * AggregateBalanceInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation13> forAggregateBalanceInformation13 = new MMConstraint<AggregateBalanceInformation13>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalanceInformation13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14
	 * AggregateBalancePerSafekeepingPlace14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace14> forAggregateBalancePerSafekeepingPlace14 = new MMConstraint<AggregateBalancePerSafekeepingPlace14>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15
	 * AggregateBalanceInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation15> forAggregateBalanceInformation15 = new MMConstraint<AggregateBalanceInformation15>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalanceInformation15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14
	 * QuantityBreakdown14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown14> forQuantityBreakdown14 = new MMConstraint<QuantityBreakdown14>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityBreakdown14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16
	 * AggregateBalancePerSafekeepingPlace16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace16> forAggregateBalancePerSafekeepingPlace16 = new MMConstraint<AggregateBalancePerSafekeepingPlace16>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17
	 * AggregateBalanceInformation17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation17> forAggregateBalanceInformation17 = new MMConstraint<AggregateBalanceInformation17>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalanceInformation17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19
	 * QuantityBreakdown19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown19> forQuantityBreakdown19 = new MMConstraint<QuantityBreakdown19>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityBreakdown19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace18> forAggregateBalancePerSafekeepingPlace18 = new MMConstraint<AggregateBalancePerSafekeepingPlace18>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19
	 * AggregateBalanceInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation19> forAggregateBalanceInformation19 = new MMConstraint<AggregateBalanceInformation19>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalanceInformation19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24
	 * QuantityBreakdown24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown24> forQuantityBreakdown24 = new MMConstraint<QuantityBreakdown24>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityBreakdown24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21
	 * AggregateBalancePerSafekeepingPlace21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forAggregateBalancePerSafekeepingPlace25
	 * ConstraintCoexistenceAmountRule.forAggregateBalancePerSafekeepingPlace25}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace21> forAggregateBalancePerSafekeepingPlace21 = new MMConstraint<AggregateBalancePerSafekeepingPlace21>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forAggregateBalancePerSafekeepingPlace25);
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22
	 * AggregateBalanceInformation22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forAggregateBalanceInformation26
	 * ConstraintCoexistenceAmountRule.forAggregateBalanceInformation26}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation22> forAggregateBalanceInformation22 = new MMConstraint<AggregateBalanceInformation22>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forAggregateBalanceInformation26);
			owner_lazy = () -> AggregateBalanceInformation22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25
	 * QuantityBreakdown25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown25> forQuantityBreakdown25 = new MMConstraint<QuantityBreakdown25>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityBreakdown25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22
	 * AggregateBalancePerSafekeepingPlace22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace22> forAggregateBalancePerSafekeepingPlace22 = new MMConstraint<AggregateBalancePerSafekeepingPlace22>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23
	 * AggregateBalanceInformation23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation23> forAggregateBalanceInformation23 = new MMConstraint<AggregateBalanceInformation23>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalanceInformation23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8
	 * AggregateBalancePerSafekeepingPlace8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace8> forAggregateBalancePerSafekeepingPlace8 = new MMConstraint<AggregateBalancePerSafekeepingPlace8>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9
	 * AggregateBalanceInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation9> forAggregateBalanceInformation9 = new MMConstraint<AggregateBalanceInformation9>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalanceInformation9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9
	 * AggregateBalancePerSafekeepingPlace9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace9> forAggregateBalancePerSafekeepingPlace9 = new MMConstraint<AggregateBalancePerSafekeepingPlace9>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10
	 * AggregateBalanceInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation10> forAggregateBalanceInformation10 = new MMConstraint<AggregateBalanceInformation10>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AggregateBalanceInformation10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11
	 * AggregateBalancePerSafekeepingPlace11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace11> forAggregateBalancePerSafekeepingPlace11 = new MMConstraint<AggregateBalancePerSafekeepingPlace11>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12
	 * AggregateBalanceInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation12> forAggregateBalanceInformation12 = new MMConstraint<AggregateBalanceInformation12>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalanceInformation12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13
	 * AggregateBalancePerSafekeepingPlace13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace13> forAggregateBalancePerSafekeepingPlace13 = new MMConstraint<AggregateBalancePerSafekeepingPlace13>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14
	 * AggregateBalanceInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation14> forAggregateBalanceInformation14 = new MMConstraint<AggregateBalanceInformation14>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalanceInformation14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15
	 * AggregateBalancePerSafekeepingPlace15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace15> forAggregateBalancePerSafekeepingPlace15 = new MMConstraint<AggregateBalancePerSafekeepingPlace15>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16
	 * AggregateBalanceInformation16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation16> forAggregateBalanceInformation16 = new MMConstraint<AggregateBalanceInformation16>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalanceInformation16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17
	 * AggregateBalancePerSafekeepingPlace17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace17> forAggregateBalancePerSafekeepingPlace17 = new MMConstraint<AggregateBalancePerSafekeepingPlace17>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18
	 * AggregateBalanceInformation18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation18> forAggregateBalanceInformation18 = new MMConstraint<AggregateBalanceInformation18>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalanceInformation18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20
	 * AggregateBalancePerSafekeepingPlace20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forAggregateBalancePerSafekeepingPlace24
	 * ConstraintCoexistenceAmountRule.forAggregateBalancePerSafekeepingPlace24}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace20> forAggregateBalancePerSafekeepingPlace20 = new MMConstraint<AggregateBalancePerSafekeepingPlace20>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forAggregateBalancePerSafekeepingPlace24);
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21
	 * AggregateBalanceInformation21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forAggregateBalanceInformation25
	 * ConstraintCoexistenceAmountRule.forAggregateBalanceInformation25}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation21> forAggregateBalanceInformation21 = new MMConstraint<AggregateBalanceInformation21>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forAggregateBalanceInformation25);
			owner_lazy = () -> AggregateBalanceInformation21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23
	 * AggregateBalancePerSafekeepingPlace23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace23> forAggregateBalancePerSafekeepingPlace23 = new MMConstraint<AggregateBalancePerSafekeepingPlace23>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24
	 * AggregateBalanceInformation24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation24> forAggregateBalanceInformation24 = new MMConstraint<AggregateBalanceInformation24>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalanceInformation24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6
	 * QuantityAndAccount6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount6> forQuantityAndAccount6 = new MMConstraint<QuantityAndAccount6>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityAndAccount6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection4
	 * AmountAndDirection4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection4> forAmountAndDirection4 = new MMConstraint<AmountAndDirection4>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountAndDirection4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3
	 * SecuritiesFinancingTransactionDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails3> forSecuritiesFinancingTransactionDetails3 = new MMConstraint<SecuritiesFinancingTransactionDetails3>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2
	 * AmountAndDirection2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forAmountAndDirection36
	 * ConstraintCoexistenceAmountRule.forAmountAndDirection36}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection2> forAmountAndDirection2 = new MMConstraint<AmountAndDirection2>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forAmountAndDirection36);
			owner_lazy = () -> AmountAndDirection2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4 OtherAmounts4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts4> forOtherAmounts4 = new MMConstraint<OtherAmounts4>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11
	 * QuantityAndAccount11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount11> forQuantityAndAccount11 = new MMConstraint<QuantityAndAccount11>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityAndAccount11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> QuantityAndAccount11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection13
	 * AmountAndDirection13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection13> forAmountAndDirection13 = new MMConstraint<AmountAndDirection13>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AmountAndDirection13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5
	 * SecuritiesFinancingTransactionDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails5> forSecuritiesFinancingTransactionDetails5 = new MMConstraint<SecuritiesFinancingTransactionDetails5>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16
	 * AmountAndDirection16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection16> forAmountAndDirection16 = new MMConstraint<AmountAndDirection16>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AmountAndDirection16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5 OtherAmounts5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts5> forOtherAmounts5 = new MMConstraint<OtherAmounts5>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> OtherAmounts5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18
	 * QuantityAndAccount18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount18> forQuantityAndAccount18 = new MMConstraint<QuantityAndAccount18>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityAndAccount18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19
	 * QuantityAndAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount19> forQuantityAndAccount19 = new MMConstraint<QuantityAndAccount19>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityAndAccount19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1
	 * SecuritiesFinancingTransactionDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails1> forSecuritiesFinancingTransactionDetails1 = new MMConstraint<SecuritiesFinancingTransactionDetails1>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11
	 * SecuritiesFinancingTransactionDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails11> forSecuritiesFinancingTransactionDetails11 = new MMConstraint<SecuritiesFinancingTransactionDetails11>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts17> forOtherAmounts17 = new MMConstraint<OtherAmounts17>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14
	 * SecuritiesFinancingTransactionDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails14> forSecuritiesFinancingTransactionDetails14 = new MMConstraint<SecuritiesFinancingTransactionDetails14>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23 OtherAmounts23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts23> forOtherAmounts23 = new MMConstraint<OtherAmounts23>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3 OtherAmounts3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts3> forOtherAmounts3 = new MMConstraint<OtherAmounts3>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4
	 * SecuritiesFinancingTransactionDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails4> forSecuritiesFinancingTransactionDetails4 = new MMConstraint<SecuritiesFinancingTransactionDetails4>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts7> forOtherAmounts7 = new MMConstraint<OtherAmounts7>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> OtherAmounts7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection7
	 * AmountAndDirection7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection7> forAmountAndDirection7 = new MMConstraint<AmountAndDirection7>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountAndDirection7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2
	 * QuantityAndAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount2> forQuantityAndAccount2 = new MMConstraint<QuantityAndAccount2>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityAndAccount2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection15
	 * AmountAndDirection15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection15> forAmountAndDirection15 = new MMConstraint<AmountAndDirection15>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AmountAndDirection15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12
	 * QuantityAndAccount12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount12> forQuantityAndAccount12 = new MMConstraint<QuantityAndAccount12>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityAndAccount12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> QuantityAndAccount12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15
	 * QuantityAndAccount15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount15> forQuantityAndAccount15 = new MMConstraint<QuantityAndAccount15>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityAndAccount15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts9> forOtherAmounts9 = new MMConstraint<OtherAmounts9>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20
	 * QuantityAndAccount20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount20> forQuantityAndAccount20 = new MMConstraint<QuantityAndAccount20>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityAndAccount20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10 OtherAmounts10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts10> forOtherAmounts10 = new MMConstraint<OtherAmounts10>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28
	 * QuantityAndAccount28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount28> forQuantityAndAccount28 = new MMConstraint<QuantityAndAccount28>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityAndAccount28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18 OtherAmounts18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts18> forOtherAmounts18 = new MMConstraint<OtherAmounts18>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37
	 * QuantityAndAccount37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount37> forQuantityAndAccount37 = new MMConstraint<QuantityAndAccount37>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantityAndAccount37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24 OtherAmounts24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts24> forOtherAmounts24 = new MMConstraint<OtherAmounts24>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13 OtherAmounts13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts13> forOtherAmounts13 = new MMConstraint<OtherAmounts13>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> OtherAmounts13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5
	 * TransactionDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails5> forTransactionDetails5 = new MMConstraint<TransactionDetails5>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9
	 * TransactionDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails9> forTransactionDetails9 = new MMConstraint<TransactionDetails9>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> TransactionDetails9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22
	 * TransactionDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails22> forTransactionDetails22 = new MMConstraint<TransactionDetails22>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23
	 * TransactionDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails23> forTransactionDetails23 = new MMConstraint<TransactionDetails23>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36
	 * TransactionDetails36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails36> forTransactionDetails36 = new MMConstraint<TransactionDetails36>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47
	 * TransactionDetails47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails47> forTransactionDetails47 = new MMConstraint<TransactionDetails47>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails47.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53
	 * TransactionDetails53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forTransactionDetails61
	 * ConstraintCoexistenceAmountRule.forTransactionDetails61}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails53> forTransactionDetails53 = new MMConstraint<TransactionDetails53>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails53;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forTransactionDetails61);
			owner_lazy = () -> TransactionDetails53.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58
	 * TransactionDetails58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails58> forTransactionDetails58 = new MMConstraint<TransactionDetails58>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails58;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails58.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7
	 * TransactionDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails7> forTransactionDetails7 = new MMConstraint<TransactionDetails7>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8
	 * TransactionDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails8> forTransactionDetails8 = new MMConstraint<TransactionDetails8>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16
	 * TransactionDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails16> forTransactionDetails16 = new MMConstraint<TransactionDetails16>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> TransactionDetails16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17
	 * TransactionDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails17> forTransactionDetails17 = new MMConstraint<TransactionDetails17>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> TransactionDetails17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26
	 * TransactionDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails26> forTransactionDetails26 = new MMConstraint<TransactionDetails26>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25
	 * TransactionDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails25> forTransactionDetails25 = new MMConstraint<TransactionDetails25>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27
	 * TransactionDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails27> forTransactionDetails27 = new MMConstraint<TransactionDetails27>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33
	 * TransactionDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails33> forTransactionDetails33 = new MMConstraint<TransactionDetails33>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39
	 * TransactionDetails39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails39> forTransactionDetails39 = new MMConstraint<TransactionDetails39>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50
	 * TransactionDetails50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails50> forTransactionDetails50 = new MMConstraint<TransactionDetails50>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails50.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56
	 * TransactionDetails56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forTransactionDetails62
	 * ConstraintCoexistenceAmountRule.forTransactionDetails62}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails56> forTransactionDetails56 = new MMConstraint<TransactionDetails56>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forTransactionDetails62);
			owner_lazy = () -> TransactionDetails56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59
	 * TransactionDetails59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails59> forTransactionDetails59 = new MMConstraint<TransactionDetails59>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails59;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails59.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6
	 * TransactionDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails6> forTransactionDetails6 = new MMConstraint<TransactionDetails6>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18
	 * TransactionDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails18> forTransactionDetails18 = new MMConstraint<TransactionDetails18>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> TransactionDetails18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24
	 * TransactionDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails24> forTransactionDetails24 = new MMConstraint<TransactionDetails24>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34
	 * TransactionDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails34> forTransactionDetails34 = new MMConstraint<TransactionDetails34>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37
	 * TransactionDetails37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails37> forTransactionDetails37 = new MMConstraint<TransactionDetails37>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48
	 * TransactionDetails48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails48> forTransactionDetails48 = new MMConstraint<TransactionDetails48>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails48;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails48.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57
	 * TransactionDetails57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forTransactionDetails63
	 * ConstraintCoexistenceAmountRule.forTransactionDetails63}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails57> forTransactionDetails57 = new MMConstraint<TransactionDetails57>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forTransactionDetails63);
			owner_lazy = () -> TransactionDetails57.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60
	 * TransactionDetails60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails60> forTransactionDetails60 = new MMConstraint<TransactionDetails60>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails60;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails60.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts2> forOtherAmounts2 = new MMConstraint<OtherAmounts2>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7
	 * SecuritiesTradeDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails7> forSecuritiesTradeDetails7 = new MMConstraint<SecuritiesTradeDetails7>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesTradeDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesTradeDetails7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19
	 * SecuritiesTradeDetails19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails19> forSecuritiesTradeDetails19 = new MMConstraint<SecuritiesTradeDetails19>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesTradeDetails19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesTradeDetails19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection10
	 * AmountAndDirection10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection10> forAmountAndDirection10 = new MMConstraint<AmountAndDirection10>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountAndDirection10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2
	 * SecuritiesFinancingTransactionDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails2> forSecuritiesFinancingTransactionDetails2 = new MMConstraint<SecuritiesFinancingTransactionDetails2>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8
	 * SecuritiesFinancingTransactionDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails8> forSecuritiesFinancingTransactionDetails8 = new MMConstraint<SecuritiesFinancingTransactionDetails8>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
	 * SecuritiesFinancingTransactionDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails7> forSecuritiesFinancingTransactionDetails7 = new MMConstraint<SecuritiesFinancingTransactionDetails7>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection22
	 * AmountAndDirection22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection22> forAmountAndDirection22 = new MMConstraint<AmountAndDirection22>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountAndDirection22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection23
	 * AmountAndDirection23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection23> forAmountAndDirection23 = new MMConstraint<AmountAndDirection23>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountAndDirection23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts8 OtherAmounts8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts8> forOtherAmounts8 = new MMConstraint<OtherAmounts8>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4
	 * SecuritiesTradeDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails4> forSecuritiesTradeDetails4 = new MMConstraint<SecuritiesTradeDetails4>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesTradeDetails4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesTradeDetails4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17
	 * SecuritiesTradeDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails17> forSecuritiesTradeDetails17 = new MMConstraint<SecuritiesTradeDetails17>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesTradeDetails17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesTradeDetails17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4
	 * TransactionDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails4> forTransactionDetails4 = new MMConstraint<TransactionDetails4>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30
	 * TransactionDetails30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails30> forTransactionDetails30 = new MMConstraint<TransactionDetails30>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails30.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection11
	 * AmountAndDirection11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection11> forAmountAndDirection11 = new MMConstraint<AmountAndDirection11>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AmountAndDirection11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails19> forSecuritiesFinancingTransactionDetails19 = new MMConstraint<SecuritiesFinancingTransactionDetails19>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails20> forSecuritiesFinancingTransactionDetails20 = new MMConstraint<SecuritiesFinancingTransactionDetails20>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6
	 * SecuritiesFinancingTransactionDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails6> forSecuritiesFinancingTransactionDetails6 = new MMConstraint<SecuritiesFinancingTransactionDetails6>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10
	 * SecuritiesFinancingTransactionDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails10> forSecuritiesFinancingTransactionDetails10 = new MMConstraint<SecuritiesFinancingTransactionDetails10>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17
	 * SecuritiesFinancingTransactionDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesFinancingTransactionDetails21
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesFinancingTransactionDetails21}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails17> forSecuritiesFinancingTransactionDetails17 = new MMConstraint<SecuritiesFinancingTransactionDetails17>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesFinancingTransactionDetails21);
			owner_lazy = () -> SecuritiesFinancingTransactionDetails17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18
	 * SecuritiesFinancingTransactionDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails18> forSecuritiesFinancingTransactionDetails18 = new MMConstraint<SecuritiesFinancingTransactionDetails18>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails20
	 * TransactionDetails20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails20> forTransactionDetails20 = new MMConstraint<TransactionDetails20>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> TransactionDetails20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
	 * SecuritiesFinancingTransactionDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails9> forSecuritiesFinancingTransactionDetails9 = new MMConstraint<SecuritiesFinancingTransactionDetails9>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection25
	 * AmountAndDirection25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection25> forAmountAndDirection25 = new MMConstraint<AmountAndDirection25>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountAndDirection25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection26
	 * AmountAndDirection26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection26> forAmountAndDirection26 = new MMConstraint<AmountAndDirection26>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountAndDirection26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts11 OtherAmounts11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts11> forOtherAmounts11 = new MMConstraint<OtherAmounts11>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10
	 * SecuritiesTradeDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails10> forSecuritiesTradeDetails10 = new MMConstraint<SecuritiesTradeDetails10>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesTradeDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SecuritiesTradeDetails10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22
	 * SecuritiesTradeDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails22> forSecuritiesTradeDetails22 = new MMConstraint<SecuritiesTradeDetails22>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesTradeDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesTradeDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23
	 * SecuritiesTradeDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesTradeDetails35
	 * ConstraintCoexistenceAmountRule.forSecuritiesTradeDetails35}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails23> forSecuritiesTradeDetails23 = new MMConstraint<SecuritiesTradeDetails23>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesTradeDetails23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesTradeDetails35);
			owner_lazy = () -> SecuritiesTradeDetails23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29
	 * SecuritiesTradeDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails29> forSecuritiesTradeDetails29 = new MMConstraint<SecuritiesTradeDetails29>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesTradeDetails29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesTradeDetails29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40
	 * TransactionDetails40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails40> forTransactionDetails40 = new MMConstraint<TransactionDetails40>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails40.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42
	 * TransactionDetails42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails42> forTransactionDetails42 = new MMConstraint<TransactionDetails42>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails42.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46
	 * TransactionDetails46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails46> forTransactionDetails46 = new MMConstraint<TransactionDetails46>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails46.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails32
	 * TransactionDetails32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails32> forTransactionDetails32 = new MMConstraint<TransactionDetails32>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14
	 * TransactionDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails14> forTransactionDetails14 = new MMConstraint<TransactionDetails14>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> TransactionDetails14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35
	 * TransactionDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails35> forTransactionDetails35 = new MMConstraint<TransactionDetails35>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts6 OtherAmounts6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts6> forOtherAmounts6 = new MMConstraint<OtherAmounts6>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> OtherAmounts6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14
	 * SecuritiesTradeDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails14> forSecuritiesTradeDetails14 = new MMConstraint<SecuritiesTradeDetails14>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesTradeDetails14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SecuritiesTradeDetails14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20
	 * SecuritiesTradeDetails20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails20> forSecuritiesTradeDetails20 = new MMConstraint<SecuritiesTradeDetails20>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesTradeDetails20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesTradeDetails20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15 OtherAmounts15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts15> forOtherAmounts15 = new MMConstraint<OtherAmounts15>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24
	 * SecuritiesTradeDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails24> forSecuritiesTradeDetails24 = new MMConstraint<SecuritiesTradeDetails24>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesTradeDetails24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesTradeDetails24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts22 OtherAmounts22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherAmounts22> forOtherAmounts22 = new MMConstraint<OtherAmounts22>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOtherAmounts22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OtherAmounts22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30
	 * SecuritiesTradeDetails30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails30> forSecuritiesTradeDetails30 = new MMConstraint<SecuritiesTradeDetails30>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesTradeDetails30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesTradeDetails30.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45
	 * TransactionDetails45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails45> forTransactionDetails45 = new MMConstraint<TransactionDetails45>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails45.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51
	 * TransactionDetails51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails51> forTransactionDetails51 = new MMConstraint<TransactionDetails51>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19
	 * AggregateBalancePerSafekeepingPlace19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace19> forAggregateBalancePerSafekeepingPlace19 = new MMConstraint<AggregateBalancePerSafekeepingPlace19>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails52
	 * TransactionDetails52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails52> forTransactionDetails52 = new MMConstraint<TransactionDetails52>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails52.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61
	 * TransactionDetails61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forTransactionDetails70
	 * ConstraintCoexistenceAmountRule.forTransactionDetails70}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forTransactionDetails53
	 * ConstraintCoexistenceAmountRule.forTransactionDetails53}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails61> forTransactionDetails61 = new MMConstraint<TransactionDetails61>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails61;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forTransactionDetails70);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forTransactionDetails53;
			owner_lazy = () -> TransactionDetails61.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36
	 * AmountAndDirection36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forAmountAndDirection2
	 * ConstraintCoexistenceAmountRule.forAmountAndDirection2}</li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection36> forAmountAndDirection36 = new MMConstraint<AmountAndDirection36>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forAmountAndDirection2;
			owner_lazy = () -> AmountAndDirection36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21
	 * SecuritiesFinancingTransactionDetails21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesFinancingTransactionDetails24
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesFinancingTransactionDetails24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesFinancingTransactionDetails17
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesFinancingTransactionDetails17}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails21> forSecuritiesFinancingTransactionDetails21 = new MMConstraint<SecuritiesFinancingTransactionDetails21>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesFinancingTransactionDetails24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesFinancingTransactionDetails17;
			owner_lazy = () -> SecuritiesFinancingTransactionDetails21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62
	 * TransactionDetails62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forTransactionDetails69
	 * ConstraintCoexistenceAmountRule.forTransactionDetails69}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forTransactionDetails56
	 * ConstraintCoexistenceAmountRule.forTransactionDetails56}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails62> forTransactionDetails62 = new MMConstraint<TransactionDetails62>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forTransactionDetails69);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forTransactionDetails56;
			owner_lazy = () -> TransactionDetails62.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37
	 * AmountAndDirection37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forAmountAndDirection32
	 * ConstraintCoexistenceAmountRule.forAmountAndDirection32}</li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection37> forAmountAndDirection37 = new MMConstraint<AmountAndDirection37>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forAmountAndDirection32;
			owner_lazy = () -> AmountAndDirection37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63
	 * TransactionDetails63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forTransactionDetails57
	 * ConstraintCoexistenceAmountRule.forTransactionDetails57}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails63> forTransactionDetails63 = new MMConstraint<TransactionDetails63>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forTransactionDetails57;
			owner_lazy = () -> TransactionDetails63.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103
	 * CorporateActionOption103}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionOption57
	 * ConstraintCoexistenceAmountRule.forCorporateActionOption57}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption103> forCorporateActionOption103 = new MMConstraint<CorporateActionOption103>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption103;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionOption57;
			owner_lazy = () -> CorporateActionOption103.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100
	 * CorporateActionOption100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionOption52
	 * ConstraintCoexistenceAmountRule.forCorporateActionOption52}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption100> forCorporateActionOption100 = new MMConstraint<CorporateActionOption100>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption100;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionOption52;
			owner_lazy = () -> CorporateActionOption100.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101
	 * CorporateActionOption101}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionOption51
	 * ConstraintCoexistenceAmountRule.forCorporateActionOption51}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption101> forCorporateActionOption101 = new MMConstraint<CorporateActionOption101>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption101;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionOption51;
			owner_lazy = () -> CorporateActionOption101.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102
	 * CorporateActionOption102}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionOption111
	 * ConstraintCoexistenceAmountRule.forCorporateActionOption111}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionOption53
	 * ConstraintCoexistenceAmountRule.forCorporateActionOption53}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption102> forCorporateActionOption102 = new MMConstraint<CorporateActionOption102>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption102;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionOption111);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionOption53;
			owner_lazy = () -> CorporateActionOption102.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat33Choice
	 * PriceFormat33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forPriceFormat21Choice
	 * ConstraintCoexistenceAmountRule.forPriceFormat21Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat33Choice> forPriceFormat33Choice = new MMConstraint<PriceFormat33Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat33Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forPriceFormat21Choice;
			owner_lazy = () -> PriceFormat33Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29
	 * CorporateActionAmounts29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionAmounts23
	 * ConstraintCoexistenceAmountRule.forCorporateActionAmounts23}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts29> forCorporateActionAmounts29 = new MMConstraint<CorporateActionAmounts29>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionAmounts23;
			owner_lazy = () -> CorporateActionAmounts29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption30 CashOption30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCashOption39
	 * ConstraintCoexistenceAmountRule.forCashOption39}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCashOption26
	 * ConstraintCoexistenceAmountRule.forCashOption26}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption30> forCashOption30 = new MMConstraint<CashOption30>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCashOption39);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCashOption26;
			owner_lazy = () -> CashOption30.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat19Choice
	 * RateAndAmountFormat19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forRateAndAmountFormat14Choice
	 * ConstraintCoexistenceAmountRule.forRateAndAmountFormat14Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat19Choice> forRateAndAmountFormat19Choice = new MMConstraint<RateAndAmountFormat19Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat19Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forRateAndAmountFormat14Choice;
			owner_lazy = () -> RateAndAmountFormat19Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat20Choice
	 * RateAndAmountFormat20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat20Choice> forRateAndAmountFormat20Choice = new MMConstraint<RateAndAmountFormat20Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat20Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateAndAmountFormat20Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat21Choice
	 * RateAndAmountFormat21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat21Choice> forRateAndAmountFormat21Choice = new MMConstraint<RateAndAmountFormat21Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat21Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateAndAmountFormat21Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice
	 * PriceFormat32Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forPriceFormat20Choice
	 * ConstraintCoexistenceAmountRule.forPriceFormat20Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat32Choice> forPriceFormat32Choice = new MMConstraint<PriceFormat32Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat32Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forPriceFormat20Choice;
			owner_lazy = () -> PriceFormat32Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27
	 * CorporateActionAmounts27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionAmounts21
	 * ConstraintCoexistenceAmountRule.forCorporateActionAmounts21}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts27> forCorporateActionAmounts27 = new MMConstraint<CorporateActionAmounts27>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionAmounts21;
			owner_lazy = () -> CorporateActionAmounts27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice
	 * PriceFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forPriceFormat7Choice
	 * ConstraintCoexistenceAmountRule.forPriceFormat7Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat34Choice> forPriceFormat34Choice = new MMConstraint<PriceFormat34Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat34Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forPriceFormat7Choice;
			owner_lazy = () -> PriceFormat34Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption31 CashOption31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCashOption25
	 * ConstraintCoexistenceAmountRule.forCashOption25}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption31> forCashOption31 = new MMConstraint<CashOption31>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCashOption25;
			owner_lazy = () -> CashOption31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption32 CashOption32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCashOption24
	 * ConstraintCoexistenceAmountRule.forCashOption24}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption32> forCashOption32 = new MMConstraint<CashOption32>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCashOption24;
			owner_lazy = () -> CashOption32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35
	 * SecuritiesTradeDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesTradeDetails23
	 * ConstraintCoexistenceAmountRule.forSecuritiesTradeDetails23}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails35> forSecuritiesTradeDetails35 = new MMConstraint<SecuritiesTradeDetails35>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesTradeDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesTradeDetails23;
			owner_lazy = () -> SecuritiesTradeDetails35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110
	 * CorporateActionOption110}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption110> forCorporateActionOption110 = new MMConstraint<CorporateActionOption110>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption110;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption110.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption108> forCorporateActionOption108 = new MMConstraint<CorporateActionOption108>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption108;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption108.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107
	 * CorporateActionOption107}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption107> forCorporateActionOption107 = new MMConstraint<CorporateActionOption107>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption107;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption107.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106
	 * CorporateActionOption106}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption106> forCorporateActionOption106 = new MMConstraint<CorporateActionOption106>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption106;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption106.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat43Choice
	 * PriceFormat43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat43Choice> forPriceFormat43Choice = new MMConstraint<PriceFormat43Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat43Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PriceFormat43Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat28Choice
	 * RateAndAmountFormat28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat28Choice> forRateAndAmountFormat28Choice = new MMConstraint<RateAndAmountFormat28Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat28Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateAndAmountFormat28Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption36 CashOption36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption36> forCashOption36 = new MMConstraint<CashOption36>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Quantity16Choice
	 * Quantity16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity16Choice> forQuantity16Choice = new MMConstraint<Quantity16Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkQuantity16Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Quantity16Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption35 CashOption35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption35> forCashOption35 = new MMConstraint<CashOption35>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32
	 * CorporateActionAmounts32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts32> forCorporateActionAmounts32 = new MMConstraint<CorporateActionAmounts32>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionAmounts32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat35Choice
	 * RateAndAmountFormat35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat35Choice> forRateAndAmountFormat35Choice = new MMConstraint<RateAndAmountFormat35Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat35Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RateAndAmountFormat35Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat32Choice
	 * RateAndAmountFormat32Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat32Choice> forRateAndAmountFormat32Choice = new MMConstraint<RateAndAmountFormat32Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat32Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateAndAmountFormat32Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat40Choice
	 * PriceFormat40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat40Choice> forPriceFormat40Choice = new MMConstraint<PriceFormat40Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat40Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat40Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption38 CashOption38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption38> forCashOption38 = new MMConstraint<CashOption38>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption38.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat30Choice
	 * RateAndAmountFormat30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateAndAmountFormat30Choice> forRateAndAmountFormat30Choice = new MMConstraint<RateAndAmountFormat30Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkRateAndAmountFormat30Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RateAndAmountFormat30Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat39Choice
	 * PriceFormat39Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat39Choice> forPriceFormat39Choice = new MMConstraint<PriceFormat39Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormat39Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat39Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities5
	 * OriginalAndCurrentQuantities5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalAndCurrentQuantities5> forOriginalAndCurrentQuantities5 = new MMConstraint<OriginalAndCurrentQuantities5>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkOriginalAndCurrentQuantities5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> OriginalAndCurrentQuantities5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35
	 * CorporateActionAmounts35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionAmounts35> forCorporateActionAmounts35 = new MMConstraint<CorporateActionAmounts35>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionAmounts35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionAmounts35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38
	 * AmountAndDirection38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection38> forAmountAndDirection38 = new MMConstraint<AmountAndDirection38>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AmountAndDirection38.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22
	 * SecuritiesFinancingTransactionDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails22> forSecuritiesFinancingTransactionDetails22 = new MMConstraint<SecuritiesFinancingTransactionDetails22>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66
	 * TransactionDetails66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails66> forTransactionDetails66 = new MMConstraint<TransactionDetails66>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails66;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails66.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42
	 * SecuritiesTradeDetails42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails42> forSecuritiesTradeDetails42 = new MMConstraint<SecuritiesTradeDetails42>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesTradeDetails42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesTradeDetails42.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67
	 * TransactionDetails67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails67> forTransactionDetails67 = new MMConstraint<TransactionDetails67>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails67.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68
	 * TransactionDetails68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails68> forTransactionDetails68 = new MMConstraint<TransactionDetails68>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails68.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40
	 * AmountAndDirection40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndDirection40> forAmountAndDirection40 = new MMConstraint<AmountAndDirection40>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAmountAndDirection40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountAndDirection40.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24
	 * SecuritiesFinancingTransactionDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesFinancingTransactionDetails21
	 * ConstraintCoexistenceAmountRule.
	 * forSecuritiesFinancingTransactionDetails21}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails24> forSecuritiesFinancingTransactionDetails24 = new MMConstraint<SecuritiesFinancingTransactionDetails24>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesFinancingTransactionDetails21;
			owner_lazy = () -> SecuritiesFinancingTransactionDetails24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70
	 * TransactionDetails70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forTransactionDetails61
	 * ConstraintCoexistenceAmountRule.forTransactionDetails61}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails70> forTransactionDetails70 = new MMConstraint<TransactionDetails70>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forTransactionDetails61;
			owner_lazy = () -> TransactionDetails70.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69
	 * TransactionDetails69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forTransactionDetails62
	 * ConstraintCoexistenceAmountRule.forTransactionDetails62}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails69> forTransactionDetails69 = new MMConstraint<TransactionDetails69>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails69;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forTransactionDetails62;
			owner_lazy = () -> TransactionDetails69.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26
	 * AggregateBalanceInformation26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forAggregateBalanceInformation22
	 * ConstraintCoexistenceAmountRule.forAggregateBalanceInformation22}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation26> forAggregateBalanceInformation26 = new MMConstraint<AggregateBalanceInformation26>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forAggregateBalanceInformation22;
			owner_lazy = () -> AggregateBalanceInformation26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25
	 * AggregateBalanceInformation25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forAggregateBalanceInformation21
	 * ConstraintCoexistenceAmountRule.forAggregateBalanceInformation21}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation25> forAggregateBalanceInformation25 = new MMConstraint<AggregateBalanceInformation25>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forAggregateBalanceInformation21;
			owner_lazy = () -> AggregateBalanceInformation25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forAggregateBalancePerSafekeepingPlace20
	 * ConstraintCoexistenceAmountRule.forAggregateBalancePerSafekeepingPlace20}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace24> forAggregateBalancePerSafekeepingPlace24 = new MMConstraint<AggregateBalancePerSafekeepingPlace24>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forAggregateBalancePerSafekeepingPlace20;
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25
	 * AggregateBalancePerSafekeepingPlace25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forAggregateBalancePerSafekeepingPlace21
	 * ConstraintCoexistenceAmountRule.forAggregateBalancePerSafekeepingPlace21}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace25> forAggregateBalancePerSafekeepingPlace25 = new MMConstraint<AggregateBalancePerSafekeepingPlace25>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forAggregateBalancePerSafekeepingPlace21;
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111
	 * CorporateActionOption111}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionOption102
	 * ConstraintCoexistenceAmountRule.forCorporateActionOption102}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption111> forCorporateActionOption111 = new MMConstraint<CorporateActionOption111>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption111;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionOption102;
			owner_lazy = () -> CorporateActionOption111.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption39 CashOption39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCashOption30
	 * ConstraintCoexistenceAmountRule.forCashOption30}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption39> forCashOption39 = new MMConstraint<CashOption39>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCashOption30;
			owner_lazy = () -> CashOption39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113
	 * CorporateActionOption113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption113> forCorporateActionOption113 = new MMConstraint<CorporateActionOption113>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCorporateActionOption113;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption113.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption41 CashOption41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption41> forCashOption41 = new MMConstraint<CashOption41>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkCashOption41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CashOption41.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28
	 * AggregateBalanceInformation28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation28> forAggregateBalanceInformation28 = new MMConstraint<AggregateBalanceInformation28>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalanceInformation28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71
	 * TransactionDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails71> forTransactionDetails71 = new MMConstraint<TransactionDetails71>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails71;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails71.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25
	 * SecuritiesFinancingTransactionDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails25> forSecuritiesFinancingTransactionDetails25 = new MMConstraint<SecuritiesFinancingTransactionDetails25>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkSecuritiesFinancingTransactionDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27
	 * AggregateBalanceInformation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation27> forAggregateBalanceInformation27 = new MMConstraint<AggregateBalanceInformation27>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalanceInformation27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalanceInformation27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26
	 * AggregateBalancePerSafekeepingPlace26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace26> forAggregateBalancePerSafekeepingPlace26 = new MMConstraint<AggregateBalancePerSafekeepingPlace26>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27
	 * AggregateBalancePerSafekeepingPlace27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace27> forAggregateBalancePerSafekeepingPlace27 = new MMConstraint<AggregateBalancePerSafekeepingPlace27>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkAggregateBalancePerSafekeepingPlace27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72
	 * TransactionDetails72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails72> forTransactionDetails72 = new MMConstraint<TransactionDetails72>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkTransactionDetails72;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails72.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD2Choice
	 * PriceFormatSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forPriceFormatSD1Choice
	 * ConstraintCoexistenceAmountRule.forPriceFormatSD1Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormatSD2Choice> forPriceFormatSD2Choice = new MMConstraint<PriceFormatSD2Choice>() {
		{
			validator = ConstraintCoexistenceAmountRule::checkPriceFormatSD2Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceAmountRule";
			definition = "During ISO 15022 – 20022 coexistence, Amount length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forPriceFormatSD1Choice;
			owner_lazy = () -> PriceFormatSD2Choice.mmObject();
		}
	};

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingConfirmationV01(SecuritiesFinancingConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingConfirmationV02(SecuritiesFinancingConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingConfirmationV03(SecuritiesFinancingConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingConfirmationV04(SecuritiesFinancingConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingInstructionV01(SecuritiesFinancingInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingInstructionV02(SecuritiesFinancingInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingInstructionV03(SecuritiesFinancingInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV01(SecuritiesSettlementTransactionConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV02(SecuritiesSettlementTransactionConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV03(SecuritiesSettlementTransactionConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV04(SecuritiesSettlementTransactionConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV01(SecuritiesSettlementTransactionGenerationNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV02(SecuritiesSettlementTransactionGenerationNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV03(SecuritiesSettlementTransactionGenerationNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV04(SecuritiesSettlementTransactionGenerationNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV01(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV02(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV03(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV04(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingInstructionV04(SecuritiesFinancingInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingModificationInstructionV01(SecuritiesFinancingModificationInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingModificationInstructionV02(SecuritiesFinancingModificationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV01(SecuritiesSettlementTransactionAllegementNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV02(SecuritiesSettlementTransactionAllegementNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV01(SecuritiesSettlementTransactionReversalAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV02(SecuritiesSettlementTransactionReversalAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingModificationInstructionV03(SecuritiesFinancingModificationInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV03(SecuritiesSettlementTransactionAllegementNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV03(SecuritiesSettlementTransactionReversalAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV04(SecuritiesSettlementTransactionAllegementNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingConfirmationV05(SecuritiesFinancingConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV05(SecuritiesSettlementTransactionGenerationNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV04(SecuritiesSettlementTransactionReversalAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingInstructionV05(SecuritiesFinancingInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV05(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV05(SecuritiesSettlementTransactionConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingModificationInstructionV04(SecuritiesFinancingModificationInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection8(AmountAndDirection8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails10(TransactionDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails29(TransactionDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkForeignExchangeTerms11(ForeignExchangeTerms11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection32(AmountAndDirection32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection9(AmountAndDirection9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts12(OtherAmounts12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts14(OtherAmounts14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails28(TransactionDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAmountAndDirection12(AmountAndDirection12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails31(TransactionDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails44(TransactionDetails44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkForeignExchangeTerms12(ForeignExchangeTerms12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection33(AmountAndDirection33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAmountAndDirection17(AmountAndDirection17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts20(OtherAmounts20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOriginalAndCurrentQuantities2(OriginalAndCurrentQuantities2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantity4Choice(Quantity4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat12Choice(RateAndAmountFormat12Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat5Choice(PriceFormat5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat9Choice(PriceFormat9Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption5(CorporateActionOption5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkOriginalAndCurrentQuantities3(OriginalAndCurrentQuantities3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantity9Choice(Quantity9Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRateAndAmountFormat13Choice(RateAndAmountFormat13Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPriceFormat17Choice(PriceFormat17Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPriceFormat18Choice(PriceFormat18Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCorporateActionOption13(CorporateActionOption13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat21Choice(PriceFormat21Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption25(CorporateActionOption25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat24Choice(PriceFormat24Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption30(CorporateActionOption30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption38(CorporateActionOption38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption47(CorporateActionOption47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption57(CorporateActionOption57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption58(CorporateActionOption58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat5Choice(RateAndAmountFormat5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateTypeAndAmountAndStatus1(RateTypeAndAmountAndStatus1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkGrossDividendRateFormat2Choice(GrossDividendRateFormat2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateTypeAndAmountAndStatus3(RateTypeAndAmountAndStatus3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkInterestRateUsedForPaymentFormat2Choice(InterestRateUsedForPaymentFormat2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateTypeAndAmountAndStatus4(RateTypeAndAmountAndStatus4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkNetDividendRateFormat2Choice(NetDividendRateFormat2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateTypeAndAmountAndStatus5(RateTypeAndAmountAndStatus5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTaxCreditRateFormat2Choice(TaxCreditRateFormat2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateTypeAndAmountAndStatus6(RateTypeAndAmountAndStatus6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat6Choice(PriceFormat6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat7Choice(PriceFormat7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat3Choice(RatioFormat3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndQuantityRatio2(AmountAndQuantityRatio2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat4Choice(RatioFormat4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts2(CorporateActionAmounts2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption2(CashOption2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption4(CorporateActionOption4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRateAndAmountFormat6Choice(RateAndAmountFormat6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRateTypeAndAmountAndStatus2(RateTypeAndAmountAndStatus2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkGrossDividendRateFormat3Choice(GrossDividendRateFormat3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRateTypeAndAmountAndStatus7(RateTypeAndAmountAndStatus7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkInterestRateUsedForPaymentFormat3Choice(InterestRateUsedForPaymentFormat3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRateTypeAndAmountAndStatus8(RateTypeAndAmountAndStatus8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkNetDividendRateFormat3Choice(NetDividendRateFormat3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRateTypeAndAmountAndStatus9(RateTypeAndAmountAndStatus9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkTaxCreditRateFormat3Choice(TaxCreditRateFormat3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRateTypeAndAmountAndStatus10(RateTypeAndAmountAndStatus10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPriceFormat12Choice(PriceFormat12Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPriceFormat13Choice(PriceFormat13Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRatioFormat7Choice(RatioFormat7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAmountAndQuantityRatio3(AmountAndQuantityRatio3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRatioFormat8Choice(RatioFormat8Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCorporateActionAmounts5(CorporateActionAmounts5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCashOption9(CashOption9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCorporateActionOption14(CorporateActionOption14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateTypeAndAmountAndStatus11(RateTypeAndAmountAndStatus11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts11(CorporateActionAmounts11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption12(CashOption12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption23(CorporateActionOption23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateTypeAndAmountAndStatus12(RateTypeAndAmountAndStatus12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts12(CorporateActionAmounts12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption13(CashOption13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption31(CorporateActionOption31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkNetDividendRateFormat1Choice(NetDividendRateFormat1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkNetDividendRateFormat5Choice(NetDividendRateFormat5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkNetDividendRateFormat7Choice(NetDividendRateFormat7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat15Choice(RatioFormat15Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts17(CorporateActionAmounts17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption18(CashOption18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption37(CorporateActionOption37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkNetDividendRateFormat8Choice(NetDividendRateFormat8Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat16Choice(RatioFormat16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts20(CorporateActionAmounts20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption22(CashOption22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption46(CorporateActionOption46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateTypeAndAmountAndStatus15(RateTypeAndAmountAndStatus15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkGrossDividendRateFormat10Choice(GrossDividendRateFormat10Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateTypeAndAmountAndStatus16(RateTypeAndAmountAndStatus16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkNetDividendRateFormat12Choice(NetDividendRateFormat12Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts23(CorporateActionAmounts23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateTypeAndAmountAndStatus13(RateTypeAndAmountAndStatus13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkGrossDividendRateFormat8Choice(GrossDividendRateFormat8Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateTypeAndAmountAndStatus14(RateTypeAndAmountAndStatus14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkNetDividendRateFormat10Choice(NetDividendRateFormat10Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption26(CashOption26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption53(CorporateActionOption53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRateTypeAndAmountAndStatus17(RateTypeAndAmountAndStatus17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkGrossDividendRateFormat11Choice(GrossDividendRateFormat11Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRateTypeAndAmountAndStatus18(RateTypeAndAmountAndStatus18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkNetDividendRateFormat13Choice(NetDividendRateFormat13Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateTypeAndAmountAndStatus19(RateTypeAndAmountAndStatus19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts24(CorporateActionAmounts24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRateTypeAndAmountAndStatus20(RateTypeAndAmountAndStatus20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkGrossDividendRateFormat12Choice(GrossDividendRateFormat12Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat18Choice(RateAndAmountFormat18Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRateTypeAndAmountAndStatus21(RateTypeAndAmountAndStatus21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkNetDividendRateFormat14Choice(NetDividendRateFormat14Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption27(CashOption27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption54(CorporateActionOption54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat3Choice(RateAndAmountFormat3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat4Choice(RateAndAmountFormat4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkGrossDividendRateFormat1Choice(GrossDividendRateFormat1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkInterestRateUsedForPaymentFormat1Choice(InterestRateUsedForPaymentFormat1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTaxCreditRateFormat1Choice(TaxCreditRateFormat1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSolicitationFeeRateFormat1Choice(SolicitationFeeRateFormat1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat11Choice(PriceFormat11Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat8Choice(PriceFormat8Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat5Choice(RatioFormat5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat6Choice(RatioFormat6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat10Choice(PriceFormat10Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption3(CashOption3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption10(CorporateActionOption10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRateAndAmountFormat7Choice(RateAndAmountFormat7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRateAndAmountFormat8Choice(RateAndAmountFormat8Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkGrossDividendRateFormat4Choice(GrossDividendRateFormat4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkInterestRateUsedForPaymentFormat4Choice(InterestRateUsedForPaymentFormat4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkNetDividendRateFormat4Choice(NetDividendRateFormat4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkTaxCreditRateFormat4Choice(TaxCreditRateFormat4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSolicitationFeeRateFormat2Choice(SolicitationFeeRateFormat2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPriceFormat15Choice(PriceFormat15Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPriceFormat16Choice(PriceFormat16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRatioFormat9Choice(RatioFormat9Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRatioFormat10Choice(RatioFormat10Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPriceFormat14Choice(PriceFormat14Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCashOption6(CashOption6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCorporateActionOption15(CorporateActionOption15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat14Choice(RateAndAmountFormat14Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkGrossDividendRateFormat5Choice(GrossDividendRateFormat5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkInterestRateUsedForPaymentFormat5Choice(InterestRateUsedForPaymentFormat5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat19Choice(PriceFormat19Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat20Choice(PriceFormat20Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat11Choice(RatioFormat11Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat12Choice(RatioFormat12Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkForeignExchangeTerms13(ForeignExchangeTerms13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSolicitationFeeRateFormat3Choice(SolicitationFeeRateFormat3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat15Choice(RateAndAmountFormat15Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTaxCreditRateFormat5Choice(TaxCreditRateFormat5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat23Choice(PriceFormat23Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat22Choice(PriceFormat22Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption11(CashOption11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption20(CorporateActionOption20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat16Choice(RateAndAmountFormat16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkGrossDividendRateFormat6Choice(GrossDividendRateFormat6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkInterestRateUsedForPaymentFormat6Choice(InterestRateUsedForPaymentFormat6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat25Choice(PriceFormat25Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat26Choice(PriceFormat26Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat13Choice(RatioFormat13Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat14Choice(RatioFormat14Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkForeignExchangeTerms15(ForeignExchangeTerms15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSolicitationFeeRateFormat4Choice(SolicitationFeeRateFormat4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat17Choice(RateAndAmountFormat17Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkNetDividendRateFormat6Choice(NetDividendRateFormat6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTaxCreditRateFormat6Choice(TaxCreditRateFormat6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat27Choice(PriceFormat27Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat28Choice(PriceFormat28Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption14(CashOption14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption32(CorporateActionOption32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat29Choice(PriceFormat29Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption16(CashOption16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption35(CorporateActionOption35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat31Choice(PriceFormat31Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption20(CashOption20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption44(CorporateActionOption44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkGrossDividendRateFormat9Choice(GrossDividendRateFormat9Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkNetDividendRateFormat11Choice(NetDividendRateFormat11Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkGrossDividendRateFormat7Choice(GrossDividendRateFormat7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSolicitationFeeRateFormat5Choice(SolicitationFeeRateFormat5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateFormat8Choice(RateFormat8Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkNetDividendRateFormat9Choice(NetDividendRateFormat9Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption25(CashOption25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption52(CorporateActionOption52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkGrossDividendRateFormat13Choice(GrossDividendRateFormat13Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkNetDividendRateFormat15Choice(NetDividendRateFormat15Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkGrossDividendRateFormat14Choice(GrossDividendRateFormat14Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSolicitationFeeRateFormat6Choice(SolicitationFeeRateFormat6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateFormat9Choice(RateFormat9Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkNetDividendRateFormat16Choice(NetDividendRateFormat16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption28(CashOption28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption55(CorporateActionOption55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption5(CashOption5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCashOption7(CashOption7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption19(CashOption19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption23(CashOption23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts4(CorporateActionAmounts4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption4(CashOption4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption3(CorporateActionOption3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCorporateActionAmounts7(CorporateActionAmounts7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCashOption8(CashOption8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCorporateActionOption17(CorporateActionOption17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts10(CorporateActionAmounts10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption10(CashOption10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption19(CorporateActionOption19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts14(CorporateActionAmounts14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption15(CashOption15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption34(CorporateActionOption34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts15(CorporateActionAmounts15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption17(CashOption17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption36(CorporateActionOption36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts18(CorporateActionAmounts18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption21(CashOption21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption45(CorporateActionOption45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts21(CorporateActionAmounts21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption24(CashOption24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption51(CorporateActionOption51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts26(CorporateActionAmounts26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption29(CashOption29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption56(CorporateActionOption56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormatSD1Choice(PriceFormatSD1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection24(AmountAndDirection24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown4(QuantityBreakdown4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace7(AggregateBalancePerSafekeepingPlace7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation8(AggregateBalanceInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantityBreakdown8(QuantityBreakdown8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace10(AggregateBalancePerSafekeepingPlace10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAggregateBalanceInformation11(AggregateBalanceInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace12(AggregateBalancePerSafekeepingPlace12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation13(AggregateBalanceInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace14(AggregateBalancePerSafekeepingPlace14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation15(AggregateBalanceInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown14(QuantityBreakdown14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace16(AggregateBalancePerSafekeepingPlace16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation17(AggregateBalanceInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown19(QuantityBreakdown19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace18(AggregateBalancePerSafekeepingPlace18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation19(AggregateBalanceInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown24(QuantityBreakdown24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace21(AggregateBalancePerSafekeepingPlace21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation22(AggregateBalanceInformation22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown25(QuantityBreakdown25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace22(AggregateBalancePerSafekeepingPlace22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation23(AggregateBalanceInformation23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace8(AggregateBalancePerSafekeepingPlace8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation9(AggregateBalanceInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace9(AggregateBalancePerSafekeepingPlace9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAggregateBalanceInformation10(AggregateBalanceInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace11(AggregateBalancePerSafekeepingPlace11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation12(AggregateBalanceInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace13(AggregateBalancePerSafekeepingPlace13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation14(AggregateBalanceInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace15(AggregateBalancePerSafekeepingPlace15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation16(AggregateBalanceInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace17(AggregateBalancePerSafekeepingPlace17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation18(AggregateBalanceInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace20(AggregateBalancePerSafekeepingPlace20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation21(AggregateBalanceInformation21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace23(AggregateBalancePerSafekeepingPlace23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation24(AggregateBalanceInformation24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount6(QuantityAndAccount6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection4(AmountAndDirection4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails3(SecuritiesFinancingTransactionDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection2(AmountAndDirection2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts4(OtherAmounts4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantityAndAccount11(QuantityAndAccount11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAmountAndDirection13(AmountAndDirection13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSecuritiesFinancingTransactionDetails5(SecuritiesFinancingTransactionDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAmountAndDirection16(AmountAndDirection16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkOtherAmounts5(OtherAmounts5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount18(QuantityAndAccount18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount19(QuantityAndAccount19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails1(SecuritiesFinancingTransactionDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails11(SecuritiesFinancingTransactionDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts17(OtherAmounts17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails14(SecuritiesFinancingTransactionDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts23(OtherAmounts23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts3(OtherAmounts3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSecuritiesFinancingTransactionDetails4(SecuritiesFinancingTransactionDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkOtherAmounts7(OtherAmounts7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection7(AmountAndDirection7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount2(QuantityAndAccount2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAmountAndDirection15(AmountAndDirection15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantityAndAccount12(QuantityAndAccount12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount15(QuantityAndAccount15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts9(OtherAmounts9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount20(QuantityAndAccount20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts10(OtherAmounts10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount28(QuantityAndAccount28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts18(OtherAmounts18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount37(QuantityAndAccount37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts24(OtherAmounts24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkOtherAmounts13(OtherAmounts13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails5(TransactionDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkTransactionDetails9(TransactionDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails22(TransactionDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails23(TransactionDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails36(TransactionDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails47(TransactionDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails53(TransactionDetails53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails58(TransactionDetails58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails7(TransactionDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails8(TransactionDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkTransactionDetails16(TransactionDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkTransactionDetails17(TransactionDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails26(TransactionDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails25(TransactionDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails27(TransactionDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails33(TransactionDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails39(TransactionDetails39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails50(TransactionDetails50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails56(TransactionDetails56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails59(TransactionDetails59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails6(TransactionDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkTransactionDetails18(TransactionDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails24(TransactionDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails34(TransactionDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails37(TransactionDetails37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails48(TransactionDetails48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails57(TransactionDetails57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails60(TransactionDetails60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts2(OtherAmounts2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesTradeDetails7(SecuritiesTradeDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesTradeDetails19(SecuritiesTradeDetails19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection10(AmountAndDirection10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails2(SecuritiesFinancingTransactionDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails8(SecuritiesFinancingTransactionDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails7(SecuritiesFinancingTransactionDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection22(AmountAndDirection22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection23(AmountAndDirection23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts8(OtherAmounts8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesTradeDetails4(SecuritiesTradeDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesTradeDetails17(SecuritiesTradeDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails4(TransactionDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails30(TransactionDetails30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAmountAndDirection11(AmountAndDirection11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails19(SecuritiesFinancingTransactionDetails19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails20(SecuritiesFinancingTransactionDetails20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSecuritiesFinancingTransactionDetails6(SecuritiesFinancingTransactionDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails10(SecuritiesFinancingTransactionDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails17(SecuritiesFinancingTransactionDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails18(SecuritiesFinancingTransactionDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkTransactionDetails20(TransactionDetails20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails9(SecuritiesFinancingTransactionDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection25(AmountAndDirection25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection26(AmountAndDirection26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts11(OtherAmounts11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSecuritiesTradeDetails10(SecuritiesTradeDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesTradeDetails22(SecuritiesTradeDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesTradeDetails23(SecuritiesTradeDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesTradeDetails29(SecuritiesTradeDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails40(TransactionDetails40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails42(TransactionDetails42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails46(TransactionDetails46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails32(TransactionDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkTransactionDetails14(TransactionDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails35(TransactionDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkOtherAmounts6(OtherAmounts6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSecuritiesTradeDetails14(SecuritiesTradeDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesTradeDetails20(SecuritiesTradeDetails20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts15(OtherAmounts15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesTradeDetails24(SecuritiesTradeDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOtherAmounts22(OtherAmounts22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesTradeDetails30(SecuritiesTradeDetails30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails45(TransactionDetails45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails51(TransactionDetails51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace19(AggregateBalancePerSafekeepingPlace19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails52(TransactionDetails52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails61(TransactionDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection36(AmountAndDirection36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails21(SecuritiesFinancingTransactionDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails62(TransactionDetails62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection37(AmountAndDirection37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails63(TransactionDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption103(CorporateActionOption103 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption100(CorporateActionOption100 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption101(CorporateActionOption101 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption102(CorporateActionOption102 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat33Choice(PriceFormat33Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts29(CorporateActionAmounts29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption30(CashOption30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat19Choice(RateAndAmountFormat19Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat20Choice(RateAndAmountFormat20Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat21Choice(RateAndAmountFormat21Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat32Choice(PriceFormat32Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts27(CorporateActionAmounts27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat34Choice(PriceFormat34Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption31(CashOption31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption32(CashOption32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesTradeDetails35(SecuritiesTradeDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption110(CorporateActionOption110 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption108(CorporateActionOption108 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption107(CorporateActionOption107 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption106(CorporateActionOption106 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPriceFormat43Choice(PriceFormat43Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat28Choice(RateAndAmountFormat28Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption36(CashOption36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantity16Choice(Quantity16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption35(CashOption35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts32(CorporateActionAmounts32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRateAndAmountFormat35Choice(RateAndAmountFormat35Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat32Choice(RateAndAmountFormat32Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat40Choice(PriceFormat40Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption38(CashOption38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRateAndAmountFormat30Choice(RateAndAmountFormat30Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat39Choice(PriceFormat39Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkOriginalAndCurrentQuantities5(OriginalAndCurrentQuantities5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionAmounts35(CorporateActionAmounts35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAmountAndDirection38(AmountAndDirection38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails22(SecuritiesFinancingTransactionDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails66(TransactionDetails66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesTradeDetails42(SecuritiesTradeDetails42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails67(TransactionDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails68(TransactionDetails68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndDirection40(AmountAndDirection40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails24(SecuritiesFinancingTransactionDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails70(TransactionDetails70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails69(TransactionDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation26(AggregateBalanceInformation26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation25(AggregateBalanceInformation25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace24(AggregateBalancePerSafekeepingPlace24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace25(AggregateBalancePerSafekeepingPlace25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption111(CorporateActionOption111 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption39(CashOption39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption113(CorporateActionOption113 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCashOption41(CashOption41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation28(AggregateBalanceInformation28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails71(TransactionDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails25(SecuritiesFinancingTransactionDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalanceInformation27(AggregateBalanceInformation27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace26(AggregateBalancePerSafekeepingPlace26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace27(AggregateBalancePerSafekeepingPlace27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails72(TransactionDetails72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Amount length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormatSD2Choice(PriceFormatSD2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}