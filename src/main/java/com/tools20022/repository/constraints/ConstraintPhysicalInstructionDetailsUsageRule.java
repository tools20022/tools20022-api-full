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
 * PhysicalInstructionDetails can only be used with free of payment
 * instructions.
 */
public class ConstraintPhysicalInstructionDetailsUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequest002V04
	 * SecuritiesSettlementTransactionModificationRequest002V04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalInstructionDetailsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PhysicalInstructionDetails can only be used with free of payment instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequest002V04> for_sese_SecuritiesSettlementTransactionModificationRequest002V04 = new MMConstraint<SecuritiesSettlementTransactionModificationRequest002V04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequest002V04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequest002V04 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionModificationRequest002V04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV03
	 * SecuritiesSettlementTransactionModificationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalInstructionDetailsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PhysicalInstructionDetails can only be used with free of payment instructions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#for_sese_SecuritiesSettlementTransactionModificationRequestV04
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * for_sese_SecuritiesSettlementTransactionModificationRequestV04}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#for_sese_SecuritiesSettlementTransactionModificationRequestV02
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * for_sese_SecuritiesSettlementTransactionModificationRequestV02}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV03> for_sese_SecuritiesSettlementTransactionModificationRequestV03 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.for_sese_SecuritiesSettlementTransactionModificationRequestV04);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.for_sese_SecuritiesSettlementTransactionModificationRequestV02;
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequestV03 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionModificationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequest002V06
	 * SecuritiesSettlementTransactionModificationRequest002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalInstructionDetailsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PhysicalInstructionDetails can only be used with free of payment instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequest002V06> for_sese_SecuritiesSettlementTransactionModificationRequest002V06 = new MMConstraint<SecuritiesSettlementTransactionModificationRequest002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequest002V06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequest002V06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionModificationRequest002V06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV01
	 * SecuritiesSettlementTransactionModificationRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalInstructionDetailsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PhysicalInstructionDetails can only be used with free of payment instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV01> for_sese_SecuritiesSettlementTransactionModificationRequestV01 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequestV01 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionModificationRequestV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV04
	 * SecuritiesSettlementTransactionModificationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalInstructionDetailsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PhysicalInstructionDetails can only be used with free of payment instructions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#for_sese_SecuritiesSettlementTransactionModificationRequestV05
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * for_sese_SecuritiesSettlementTransactionModificationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#for_sese_SecuritiesSettlementTransactionModificationRequestV03
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * for_sese_SecuritiesSettlementTransactionModificationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV04> for_sese_SecuritiesSettlementTransactionModificationRequestV04 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.for_sese_SecuritiesSettlementTransactionModificationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.for_sese_SecuritiesSettlementTransactionModificationRequestV03;
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequestV04 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionModificationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV02
	 * SecuritiesSettlementTransactionModificationRequestV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalInstructionDetailsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PhysicalInstructionDetails can only be used with free of payment instructions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#for_sese_SecuritiesSettlementTransactionModificationRequestV03
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * for_sese_SecuritiesSettlementTransactionModificationRequestV03}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV02> for_sese_SecuritiesSettlementTransactionModificationRequestV02 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.for_sese_SecuritiesSettlementTransactionModificationRequestV03);
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequestV02 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionModificationRequestV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV06
	 * SecuritiesSettlementTransactionModificationRequestV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalInstructionDetailsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PhysicalInstructionDetails can only be used with free of payment instructions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#for_sese_SecuritiesSettlementTransactionModificationRequestV05
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * for_sese_SecuritiesSettlementTransactionModificationRequestV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV06> for_sese_SecuritiesSettlementTransactionModificationRequestV06 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.for_sese_SecuritiesSettlementTransactionModificationRequestV05;
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequestV06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionModificationRequestV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequest002V05
	 * SecuritiesSettlementTransactionModificationRequest002V05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalInstructionDetailsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PhysicalInstructionDetails can only be used with free of payment instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequest002V05> for_sese_SecuritiesSettlementTransactionModificationRequest002V05 = new MMConstraint<SecuritiesSettlementTransactionModificationRequest002V05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequest002V05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequest002V05 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionModificationRequest002V05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV05
	 * SecuritiesSettlementTransactionModificationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalInstructionDetailsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PhysicalInstructionDetails can only be used with free of payment instructions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#for_sese_SecuritiesSettlementTransactionModificationRequestV06
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * for_sese_SecuritiesSettlementTransactionModificationRequestV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#for_sese_SecuritiesSettlementTransactionModificationRequestV04
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * for_sese_SecuritiesSettlementTransactionModificationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV05> for_sese_SecuritiesSettlementTransactionModificationRequestV05 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.for_sese_SecuritiesSettlementTransactionModificationRequestV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.for_sese_SecuritiesSettlementTransactionModificationRequestV04;
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequestV05 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionModificationRequestV05(obj);
		}
	};

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void check_sese_SecuritiesSettlementTransactionModificationRequest002V04(SecuritiesSettlementTransactionModificationRequest002V04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void check_sese_SecuritiesSettlementTransactionModificationRequestV03(SecuritiesSettlementTransactionModificationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void check_sese_SecuritiesSettlementTransactionModificationRequest002V06(SecuritiesSettlementTransactionModificationRequest002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void check_sese_SecuritiesSettlementTransactionModificationRequestV01(SecuritiesSettlementTransactionModificationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void check_sese_SecuritiesSettlementTransactionModificationRequestV04(SecuritiesSettlementTransactionModificationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void check_sese_SecuritiesSettlementTransactionModificationRequestV02(SecuritiesSettlementTransactionModificationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void check_sese_SecuritiesSettlementTransactionModificationRequestV06(SecuritiesSettlementTransactionModificationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void check_sese_SecuritiesSettlementTransactionModificationRequest002V05(SecuritiesSettlementTransactionModificationRequest002V05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void check_sese_SecuritiesSettlementTransactionModificationRequestV05(SecuritiesSettlementTransactionModificationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}