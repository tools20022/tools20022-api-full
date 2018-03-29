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
import com.tools20022.repository.area.acmt.*;
import java.util.Arrays;

/**
 * If InstructionDetails/OpeningType/Code is SUPA (SupplementaryAccountOpening),
 * then InvestmentAccount/Identification must be present and must contain the
 * identification of the main account to which the supplementary account is
 * related.
 */
public class ConstraintInvestmentAccountIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07
	 * AccountOpeningInstructionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionDetails/OpeningType/Code is SUPA (SupplementaryAccountOpening), then InvestmentAccount/Identification must be present and must contain the identification of the main account to which the supplementary account is related."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule#forAccountOpeningInstructionV06
	 * ConstraintInvestmentAccountIdentificationRule.
	 * forAccountOpeningInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV07> forAccountOpeningInstructionV07 = new MMConstraint<AccountOpeningInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountIdentificationRule";
			definition = "If InstructionDetails/OpeningType/Code is SUPA (SupplementaryAccountOpening), then InvestmentAccount/Identification must be present and must contain the identification of the main account to which the supplementary account is related.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule.forAccountOpeningInstructionV06;
			owner_lazy = () -> AccountOpeningInstructionV07.mmObject();
		}

		@Override
		public void executeValidator(AccountOpeningInstructionV07 obj) throws Exception {
			checkAccountOpeningInstructionV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06
	 * AccountOpeningInstructionV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionDetails/OpeningType is SUPA, then InvestmentAccount/Identification must be present and must contain the identification of the main account to which the supplementary account is related."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule#forAccountOpeningInstructionV07
	 * ConstraintInvestmentAccountIdentificationRule.
	 * forAccountOpeningInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule#forAccountOpeningInstructionV05
	 * ConstraintInvestmentAccountIdentificationRule.
	 * forAccountOpeningInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV06> forAccountOpeningInstructionV06 = new MMConstraint<AccountOpeningInstructionV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountIdentificationRule";
			definition = "If InstructionDetails/OpeningType is SUPA, then InvestmentAccount/Identification must be present and must contain the identification of the main account to which the supplementary account is related.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule.forAccountOpeningInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule.forAccountOpeningInstructionV05;
			owner_lazy = () -> AccountOpeningInstructionV06.mmObject();
		}

		@Override
		public void executeValidator(AccountOpeningInstructionV06 obj) throws Exception {
			checkAccountOpeningInstructionV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV02
	 * AccountOpeningInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionDetails/OpeningType is SUPA, then InvestmentAccount/Identification must be present and must contain the identification of the main account to which the supplementary account is related."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV02> forAccountOpeningInstructionV02 = new MMConstraint<AccountOpeningInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountIdentificationRule";
			definition = "If InstructionDetails/OpeningType is SUPA, then InvestmentAccount/Identification must be present and must contain the identification of the main account to which the supplementary account is related.";
			owner_lazy = () -> AccountOpeningInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(AccountOpeningInstructionV02 obj) throws Exception {
			checkAccountOpeningInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03
	 * AccountOpeningInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionDetails/OpeningType is SUPA, then InvestmentAccount/Identification must be present and must contain the identification of the main account to which the supplementary account is related."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule#forAccountOpeningInstructionV04
	 * ConstraintInvestmentAccountIdentificationRule.
	 * forAccountOpeningInstructionV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV03> forAccountOpeningInstructionV03 = new MMConstraint<AccountOpeningInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountIdentificationRule";
			definition = "If InstructionDetails/OpeningType is SUPA, then InvestmentAccount/Identification must be present and must contain the identification of the main account to which the supplementary account is related.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule.forAccountOpeningInstructionV04);
			owner_lazy = () -> AccountOpeningInstructionV03.mmObject();
		}

		@Override
		public void executeValidator(AccountOpeningInstructionV03 obj) throws Exception {
			checkAccountOpeningInstructionV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04
	 * AccountOpeningInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionDetails/OpeningType is SUPA, then InvestmentAccount/Identification must be present and must contain the identification of the main account to which the supplementary account is related."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule#forAccountOpeningInstructionV05
	 * ConstraintInvestmentAccountIdentificationRule.
	 * forAccountOpeningInstructionV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule#forAccountOpeningInstructionV03
	 * ConstraintInvestmentAccountIdentificationRule.
	 * forAccountOpeningInstructionV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV04> forAccountOpeningInstructionV04 = new MMConstraint<AccountOpeningInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountIdentificationRule";
			definition = "If InstructionDetails/OpeningType is SUPA, then InvestmentAccount/Identification must be present and must contain the identification of the main account to which the supplementary account is related.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule.forAccountOpeningInstructionV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule.forAccountOpeningInstructionV03;
			owner_lazy = () -> AccountOpeningInstructionV04.mmObject();
		}

		@Override
		public void executeValidator(AccountOpeningInstructionV04 obj) throws Exception {
			checkAccountOpeningInstructionV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05
	 * AccountOpeningInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionDetails/OpeningType is SUPA, then InvestmentAccount/Identification must be present and must contain the identification of the main account to which the supplementary account is related."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule#forAccountOpeningInstructionV06
	 * ConstraintInvestmentAccountIdentificationRule.
	 * forAccountOpeningInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule#forAccountOpeningInstructionV04
	 * ConstraintInvestmentAccountIdentificationRule.
	 * forAccountOpeningInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV05> forAccountOpeningInstructionV05 = new MMConstraint<AccountOpeningInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountIdentificationRule";
			definition = "If InstructionDetails/OpeningType is SUPA, then InvestmentAccount/Identification must be present and must contain the identification of the main account to which the supplementary account is related.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule.forAccountOpeningInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestmentAccountIdentificationRule.forAccountOpeningInstructionV04;
			owner_lazy = () -> AccountOpeningInstructionV05.mmObject();
		}

		@Override
		public void executeValidator(AccountOpeningInstructionV05 obj) throws Exception {
			checkAccountOpeningInstructionV05(obj);
		}
	};

	/**
	 * If InstructionDetails/OpeningType/Code is SUPA
	 * (SupplementaryAccountOpening), then InvestmentAccount/Identification must
	 * be present and must contain the identification of the main account to
	 * which the supplementary account is related.
	 */
	public static void checkAccountOpeningInstructionV07(AccountOpeningInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionDetails/OpeningType is SUPA, then
	 * InvestmentAccount/Identification must be present and must contain the
	 * identification of the main account to which the supplementary account is
	 * related.
	 */
	public static void checkAccountOpeningInstructionV06(AccountOpeningInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionDetails/OpeningType is SUPA, then
	 * InvestmentAccount/Identification must be present and must contain the
	 * identification of the main account to which the supplementary account is
	 * related.
	 */
	public static void checkAccountOpeningInstructionV02(AccountOpeningInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionDetails/OpeningType is SUPA, then
	 * InvestmentAccount/Identification must be present and must contain the
	 * identification of the main account to which the supplementary account is
	 * related.
	 */
	public static void checkAccountOpeningInstructionV03(AccountOpeningInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionDetails/OpeningType is SUPA, then
	 * InvestmentAccount/Identification must be present and must contain the
	 * identification of the main account to which the supplementary account is
	 * related.
	 */
	public static void checkAccountOpeningInstructionV04(AccountOpeningInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstructionDetails/OpeningType is SUPA, then
	 * InvestmentAccount/Identification must be present and must contain the
	 * identification of the main account to which the supplementary account is
	 * related.
	 */
	public static void checkAccountOpeningInstructionV05(AccountOpeningInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}