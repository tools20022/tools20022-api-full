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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#forSecuritiesSettlementTransactionModificationRequestV05
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * forSecuritiesSettlementTransactionModificationRequestV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV06> forSecuritiesSettlementTransactionModificationRequestV06 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.forSecuritiesSettlementTransactionModificationRequestV05;
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequestV06 obj) throws Exception {
			checkSecuritiesSettlementTransactionModificationRequestV06(obj);
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
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequest002V06> forSecuritiesSettlementTransactionModificationRequest002V06 = new MMConstraint<SecuritiesSettlementTransactionModificationRequest002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequest002V06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequest002V06 obj) throws Exception {
			checkSecuritiesSettlementTransactionModificationRequest002V06(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#forSecuritiesSettlementTransactionModificationRequestV06
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * forSecuritiesSettlementTransactionModificationRequestV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#forSecuritiesSettlementTransactionModificationRequestV04
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * forSecuritiesSettlementTransactionModificationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV05> forSecuritiesSettlementTransactionModificationRequestV05 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.forSecuritiesSettlementTransactionModificationRequestV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.forSecuritiesSettlementTransactionModificationRequestV04;
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequestV05 obj) throws Exception {
			checkSecuritiesSettlementTransactionModificationRequestV05(obj);
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
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequest002V05> forSecuritiesSettlementTransactionModificationRequest002V05 = new MMConstraint<SecuritiesSettlementTransactionModificationRequest002V05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequest002V05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequest002V05 obj) throws Exception {
			checkSecuritiesSettlementTransactionModificationRequest002V05(obj);
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
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV01> forSecuritiesSettlementTransactionModificationRequestV01 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequestV01 obj) throws Exception {
			checkSecuritiesSettlementTransactionModificationRequestV01(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#forSecuritiesSettlementTransactionModificationRequestV03
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * forSecuritiesSettlementTransactionModificationRequestV03}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV02> forSecuritiesSettlementTransactionModificationRequestV02 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.forSecuritiesSettlementTransactionModificationRequestV03);
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequestV02 obj) throws Exception {
			checkSecuritiesSettlementTransactionModificationRequestV02(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#forSecuritiesSettlementTransactionModificationRequestV04
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * forSecuritiesSettlementTransactionModificationRequestV04}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#forSecuritiesSettlementTransactionModificationRequestV02
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * forSecuritiesSettlementTransactionModificationRequestV02}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV03> forSecuritiesSettlementTransactionModificationRequestV03 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.forSecuritiesSettlementTransactionModificationRequestV04);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.forSecuritiesSettlementTransactionModificationRequestV02;
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequestV03 obj) throws Exception {
			checkSecuritiesSettlementTransactionModificationRequestV03(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#forSecuritiesSettlementTransactionModificationRequestV05
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * forSecuritiesSettlementTransactionModificationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#forSecuritiesSettlementTransactionModificationRequestV03
	 * ConstraintPhysicalInstructionDetailsUsageRule.
	 * forSecuritiesSettlementTransactionModificationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV04> forSecuritiesSettlementTransactionModificationRequestV04 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.forSecuritiesSettlementTransactionModificationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.forSecuritiesSettlementTransactionModificationRequestV03;
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequestV04 obj) throws Exception {
			checkSecuritiesSettlementTransactionModificationRequestV04(obj);
		}
	};
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
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequest002V04> forSecuritiesSettlementTransactionModificationRequest002V04 = new MMConstraint<SecuritiesSettlementTransactionModificationRequest002V04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInstructionDetailsUsageRule";
			definition = "PhysicalInstructionDetails can only be used with free of payment instructions.";
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequest002V04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequest002V04 obj) throws Exception {
			checkSecuritiesSettlementTransactionModificationRequest002V04(obj);
		}
	};

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequestV06(SecuritiesSettlementTransactionModificationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequest002V06(SecuritiesSettlementTransactionModificationRequest002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequestV05(SecuritiesSettlementTransactionModificationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequest002V05(SecuritiesSettlementTransactionModificationRequest002V05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequestV01(SecuritiesSettlementTransactionModificationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequestV02(SecuritiesSettlementTransactionModificationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequestV03(SecuritiesSettlementTransactionModificationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequestV04(SecuritiesSettlementTransactionModificationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PhysicalInstructionDetails can only be used with free of payment
	 * instructions.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequest002V04(SecuritiesSettlementTransactionModificationRequest002V04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}