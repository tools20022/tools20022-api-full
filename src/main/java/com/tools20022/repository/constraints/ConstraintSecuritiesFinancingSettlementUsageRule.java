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
 * In the framework of Securities Financing (repo, reverse repo, sec lending,
 * sec borrowing), the SettlementInstruction can only be used for the plain
 * vanilla settlement of the opening leg and closing leg.
 */
public class ConstraintSecuritiesFinancingSettlementUsageRule {

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
	 * name} = "SecuritiesFinancingSettlementUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule#forSecuritiesSettlementTransactionModificationRequestV04
	 * ConstraintSecuritiesFinancingSettlementUsageRule.
	 * forSecuritiesSettlementTransactionModificationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV05> forSecuritiesSettlementTransactionModificationRequestV05 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV05>() {
		{
			validator = ConstraintSecuritiesFinancingSettlementUsageRule::checkSecuritiesSettlementTransactionModificationRequestV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingSettlementUsageRule";
			definition = "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule.forSecuritiesSettlementTransactionModificationRequestV04;
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV05.mmObject();
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
	 * name} = "SecuritiesFinancingSettlementUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequest002V05> forSecuritiesSettlementTransactionModificationRequest002V05 = new MMConstraint<SecuritiesSettlementTransactionModificationRequest002V05>() {
		{
			validator = ConstraintSecuritiesFinancingSettlementUsageRule::checkSecuritiesSettlementTransactionModificationRequest002V05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingSettlementUsageRule";
			definition = "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg.";
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequest002V05.mmObject();
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
	 * name} = "SecuritiesFinancingSettlementUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule#forSecuritiesSettlementTransactionModificationRequestV05
	 * ConstraintSecuritiesFinancingSettlementUsageRule.
	 * forSecuritiesSettlementTransactionModificationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule#forSecuritiesSettlementTransactionModificationRequestV03
	 * ConstraintSecuritiesFinancingSettlementUsageRule.
	 * forSecuritiesSettlementTransactionModificationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV04> forSecuritiesSettlementTransactionModificationRequestV04 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV04>() {
		{
			validator = ConstraintSecuritiesFinancingSettlementUsageRule::checkSecuritiesSettlementTransactionModificationRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingSettlementUsageRule";
			definition = "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule.forSecuritiesSettlementTransactionModificationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule.forSecuritiesSettlementTransactionModificationRequestV03;
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV04.mmObject();
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
	 * name} = "SecuritiesFinancingSettlementUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequest002V04> forSecuritiesSettlementTransactionModificationRequest002V04 = new MMConstraint<SecuritiesSettlementTransactionModificationRequest002V04>() {
		{
			validator = ConstraintSecuritiesFinancingSettlementUsageRule::checkSecuritiesSettlementTransactionModificationRequest002V04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingSettlementUsageRule";
			definition = "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg.";
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequest002V04.mmObject();
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
	 * name} = "SecuritiesFinancingSettlementUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV01> forSecuritiesSettlementTransactionModificationRequestV01 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV01>() {
		{
			validator = ConstraintSecuritiesFinancingSettlementUsageRule::checkSecuritiesSettlementTransactionModificationRequestV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingSettlementUsageRule";
			definition = "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg.";
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV01.mmObject();
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
	 * name} = "SecuritiesFinancingSettlementUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule#forSecuritiesSettlementTransactionModificationRequestV03
	 * ConstraintSecuritiesFinancingSettlementUsageRule.
	 * forSecuritiesSettlementTransactionModificationRequestV03}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV02> forSecuritiesSettlementTransactionModificationRequestV02 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV02>() {
		{
			validator = ConstraintSecuritiesFinancingSettlementUsageRule::checkSecuritiesSettlementTransactionModificationRequestV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingSettlementUsageRule";
			definition = "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule.forSecuritiesSettlementTransactionModificationRequestV03);
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV02.mmObject();
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
	 * name} = "SecuritiesFinancingSettlementUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule#forSecuritiesSettlementTransactionModificationRequestV04
	 * ConstraintSecuritiesFinancingSettlementUsageRule.
	 * forSecuritiesSettlementTransactionModificationRequestV04}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule#forSecuritiesSettlementTransactionModificationRequestV02
	 * ConstraintSecuritiesFinancingSettlementUsageRule.
	 * forSecuritiesSettlementTransactionModificationRequestV02}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV03> forSecuritiesSettlementTransactionModificationRequestV03 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV03>() {
		{
			validator = ConstraintSecuritiesFinancingSettlementUsageRule::checkSecuritiesSettlementTransactionModificationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingSettlementUsageRule";
			definition = "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule.forSecuritiesSettlementTransactionModificationRequestV04);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule.forSecuritiesSettlementTransactionModificationRequestV02;
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV03.mmObject();
		}
	};

	/**
	 * In the framework of Securities Financing (repo, reverse repo, sec
	 * lending, sec borrowing), the SettlementInstruction can only be used for
	 * the plain vanilla settlement of the opening leg and closing leg.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequestV05(SecuritiesSettlementTransactionModificationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In the framework of Securities Financing (repo, reverse repo, sec
	 * lending, sec borrowing), the SettlementInstruction can only be used for
	 * the plain vanilla settlement of the opening leg and closing leg.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequest002V05(SecuritiesSettlementTransactionModificationRequest002V05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In the framework of Securities Financing (repo, reverse repo, sec
	 * lending, sec borrowing), the SettlementInstruction can only be used for
	 * the plain vanilla settlement of the opening leg and closing leg.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequestV04(SecuritiesSettlementTransactionModificationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In the framework of Securities Financing (repo, reverse repo, sec
	 * lending, sec borrowing), the SettlementInstruction can only be used for
	 * the plain vanilla settlement of the opening leg and closing leg.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequest002V04(SecuritiesSettlementTransactionModificationRequest002V04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In the framework of Securities Financing (repo, reverse repo, sec
	 * lending, sec borrowing), the SettlementInstruction can only be used for
	 * the plain vanilla settlement of the opening leg and closing leg.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequestV01(SecuritiesSettlementTransactionModificationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In the framework of Securities Financing (repo, reverse repo, sec
	 * lending, sec borrowing), the SettlementInstruction can only be used for
	 * the plain vanilla settlement of the opening leg and closing leg.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequestV02(SecuritiesSettlementTransactionModificationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In the framework of Securities Financing (repo, reverse repo, sec
	 * lending, sec borrowing), the SettlementInstruction can only be used for
	 * the plain vanilla settlement of the opening leg and closing leg.
	 */
	public static void checkSecuritiesSettlementTransactionModificationRequestV03(SecuritiesSettlementTransactionModificationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}