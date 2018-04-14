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
import com.tools20022.repository.msg.ISATransfer24;
import java.util.Arrays;

/**
 * If any occurrence of ProductTransfer/Portfolio is present, then one or more
 * elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor,
 * OtherIndividualInvestor) may be present.<br>
 * If any occurrence of ProductTransfer/Portfolio is present, then one or more
 * message in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
 * OtherCorporateInvestor) may be present.
 */
public class ConstraintPortfolioRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf any occurrence of ProductTransfer/Portfolio is present, then one or more message in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forISATransfer19
	 * ConstraintPorfolioRule.forISATransfer19}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer24> forISATransfer24 = new MMConstraint<ISATransfer24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioRule";
			definition = "If any occurrence of ProductTransfer/Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf any occurrence of ProductTransfer/Portfolio is present, then one or more message in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forISATransfer19;
			owner_lazy = () -> ISATransfer24.mmObject();
		}

		@Override
		public void executeValidator(ISATransfer24 obj) throws Exception {
			checkISATransfer24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04
	 * AccountHoldingInformationRequestV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#for_sese_AccountHoldingInformationRequestV05
	 * ConstraintPortfolioRule.for_sese_AccountHoldingInformationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#for_sese_AccountHoldingInformationRequestV03
	 * ConstraintPorfolioRule.for_sese_AccountHoldingInformationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV04> for_sese_AccountHoldingInformationRequestV04 = new MMConstraint<AccountHoldingInformationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioRule";
			definition = "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPortfolioRule.for_sese_AccountHoldingInformationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.for_sese_AccountHoldingInformationRequestV03;
			owner_lazy = () -> AccountHoldingInformationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(AccountHoldingInformationRequestV04 obj) throws Exception {
			check_sese_AccountHoldingInformationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05
	 * AccountHoldingInformationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#for_sese_AccountHoldingInformationV06
	 * ConstraintPortfolioRule.for_sese_AccountHoldingInformationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#for_sese_AccountHoldingInformationV04
	 * ConstraintPorfolioRule.for_sese_AccountHoldingInformationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV05> for_sese_AccountHoldingInformationV05 = new MMConstraint<AccountHoldingInformationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioRule";
			definition = "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPortfolioRule.for_sese_AccountHoldingInformationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.for_sese_AccountHoldingInformationV04;
			owner_lazy = () -> AccountHoldingInformationV05.mmObject();
		}

		@Override
		public void executeValidator(AccountHoldingInformationV05 obj) throws Exception {
			check_sese_AccountHoldingInformationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07
	 * PortfolioTransferInstructionV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#for_sese_PortfolioTransferInstructionV08
	 * ConstraintPortfolioRule.for_sese_PortfolioTransferInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#for_sese_PortfolioTransferInstructionV06
	 * ConstraintPorfolioRule.for_sese_PortfolioTransferInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV07> for_sese_PortfolioTransferInstructionV07 = new MMConstraint<PortfolioTransferInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioRule";
			definition = "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPortfolioRule.for_sese_PortfolioTransferInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.for_sese_PortfolioTransferInstructionV06;
			owner_lazy = () -> PortfolioTransferInstructionV07.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferInstructionV07 obj) throws Exception {
			check_sese_PortfolioTransferInstructionV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV06
	 * AccountHoldingInformationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#for_sese_AccountHoldingInformationV05
	 * ConstraintPortfolioRule.for_sese_AccountHoldingInformationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV06> for_sese_AccountHoldingInformationV06 = new MMConstraint<AccountHoldingInformationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioRule";
			definition = "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPortfolioRule.for_sese_AccountHoldingInformationV05;
			owner_lazy = () -> AccountHoldingInformationV06.mmObject();
		}

		@Override
		public void executeValidator(AccountHoldingInformationV06 obj) throws Exception {
			check_sese_AccountHoldingInformationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08
	 * PortfolioTransferInstructionV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#for_sese_PortfolioTransferInstructionV07
	 * ConstraintPortfolioRule.for_sese_PortfolioTransferInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV08> for_sese_PortfolioTransferInstructionV08 = new MMConstraint<PortfolioTransferInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioRule";
			definition = "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPortfolioRule.for_sese_PortfolioTransferInstructionV07;
			owner_lazy = () -> PortfolioTransferInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferInstructionV08 obj) throws Exception {
			check_sese_PortfolioTransferInstructionV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05
	 * AccountHoldingInformationRequestV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#for_sese_AccountHoldingInformationRequestV04
	 * ConstraintPortfolioRule.for_sese_AccountHoldingInformationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV05> for_sese_AccountHoldingInformationRequestV05 = new MMConstraint<AccountHoldingInformationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioRule";
			definition = "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPortfolioRule.for_sese_AccountHoldingInformationRequestV04;
			owner_lazy = () -> AccountHoldingInformationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(AccountHoldingInformationRequestV05 obj) throws Exception {
			check_sese_AccountHoldingInformationRequestV05(obj);
		}
	};

	/**
	 * If any occurrence of ProductTransfer/Portfolio is present, then one or
	 * more elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.<br>
	 * If any occurrence of ProductTransfer/Portfolio is present, then one or
	 * more message in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkISATransfer24(ISATransfer24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.<br>
	 * If ProductTransfer/Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.<br>
	 */
	public static void check_sese_AccountHoldingInformationRequestV04(AccountHoldingInformationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.<br>
	 * If ProductTransfer/Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void check_sese_AccountHoldingInformationV05(AccountHoldingInformationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer\Portfolio is present, then one or
	 * more elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.<br>
	 * If any occurrence of ProductTransfer\Portfolio is present, then one or
	 * more elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void check_sese_PortfolioTransferInstructionV07(PortfolioTransferInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.<br>
	 * If ProductTransfer/Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void check_sese_AccountHoldingInformationV06(AccountHoldingInformationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer\Portfolio is present, then one or
	 * more elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.<br>
	 * If any occurrence of ProductTransfer\Portfolio is present, then one or
	 * more elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void check_sese_PortfolioTransferInstructionV08(PortfolioTransferInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.<br>
	 * If ProductTransfer/Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.<br>
	 */
	public static void check_sese_AccountHoldingInformationRequestV05(AccountHoldingInformationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}