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
 * If any occurrence of ProductTransfer\Portfolio is present, then one or more
 * elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor,
 * OtherIndividualInvestor) may be present.<br>
 * If any occurrence of ProductTransfer\Portfolio is present, then one or more
 * elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
 * OtherCorporateInvestor) may be present.
 */
public class ConstraintPortfolioRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08
	 * PortfolioTransferInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#forPortfolioTransferInstructionV07
	 * ConstraintPortfolioRule.forPortfolioTransferInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV08> forPortfolioTransferInstructionV08 = new MMConstraint<PortfolioTransferInstructionV08>() {
		{
			validator = ConstraintPortfolioRule::checkPortfolioTransferInstructionV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioRule";
			definition = "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPortfolioRule.forPortfolioTransferInstructionV07;
			owner_lazy = () -> PortfolioTransferInstructionV08.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#forAccountHoldingInformationV05
	 * ConstraintPortfolioRule.forAccountHoldingInformationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV06> forAccountHoldingInformationV06 = new MMConstraint<AccountHoldingInformationV06>() {
		{
			validator = ConstraintPortfolioRule::checkAccountHoldingInformationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioRule";
			definition = "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPortfolioRule.forAccountHoldingInformationV05;
			owner_lazy = () -> AccountHoldingInformationV06.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#forAccountHoldingInformationRequestV04
	 * ConstraintPortfolioRule.forAccountHoldingInformationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV05> forAccountHoldingInformationRequestV05 = new MMConstraint<AccountHoldingInformationRequestV05>() {
		{
			validator = ConstraintPortfolioRule::checkAccountHoldingInformationRequestV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioRule";
			definition = "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPortfolioRule.forAccountHoldingInformationRequestV04;
			owner_lazy = () -> AccountHoldingInformationRequestV05.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#forPortfolioTransferInstructionV08
	 * ConstraintPortfolioRule.forPortfolioTransferInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forPortfolioTransferInstructionV06
	 * ConstraintPorfolioRule.forPortfolioTransferInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV07> forPortfolioTransferInstructionV07 = new MMConstraint<PortfolioTransferInstructionV07>() {
		{
			validator = ConstraintPortfolioRule::checkPortfolioTransferInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioRule";
			definition = "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPortfolioRule.forPortfolioTransferInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forPortfolioTransferInstructionV06;
			owner_lazy = () -> PortfolioTransferInstructionV07.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#forAccountHoldingInformationV06
	 * ConstraintPortfolioRule.forAccountHoldingInformationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forAccountHoldingInformationV04
	 * ConstraintPorfolioRule.forAccountHoldingInformationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV05> forAccountHoldingInformationV05 = new MMConstraint<AccountHoldingInformationV05>() {
		{
			validator = ConstraintPortfolioRule::checkAccountHoldingInformationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioRule";
			definition = "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPortfolioRule.forAccountHoldingInformationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forAccountHoldingInformationV04;
			owner_lazy = () -> AccountHoldingInformationV05.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#forAccountHoldingInformationRequestV05
	 * ConstraintPortfolioRule.forAccountHoldingInformationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forAccountHoldingInformationRequestV03
	 * ConstraintPorfolioRule.forAccountHoldingInformationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV04> forAccountHoldingInformationRequestV04 = new MMConstraint<AccountHoldingInformationRequestV04>() {
		{
			validator = ConstraintPortfolioRule::checkAccountHoldingInformationRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioRule";
			definition = "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPortfolioRule.forAccountHoldingInformationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forAccountHoldingInformationRequestV03;
			owner_lazy = () -> AccountHoldingInformationRequestV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf any occurrence of ProductTransfer/Portfolio is present, then one or more message in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forISATransfer19
	 * ConstraintPorfolioRule.forISATransfer19}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer24> forISATransfer24 = new MMConstraint<ISATransfer24>() {
		{
			validator = ConstraintPortfolioRule::checkISATransfer24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioRule";
			definition = "If any occurrence of ProductTransfer/Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.\r\nIf any occurrence of ProductTransfer/Portfolio is present, then one or more message in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forISATransfer19;
			owner_lazy = () -> ISATransfer24.mmObject();
		}
	};

	/**
	 * If any occurrence of ProductTransfer\Portfolio is present, then one or
	 * more elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present.<br>
	 * If any occurrence of ProductTransfer\Portfolio is present, then one or
	 * more elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPortfolioTransferInstructionV08(PortfolioTransferInstructionV08 obj) throws Exception {
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
	public static void checkAccountHoldingInformationV06(AccountHoldingInformationV06 obj) throws Exception {
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
	public static void checkAccountHoldingInformationRequestV05(AccountHoldingInformationRequestV05 obj) throws Exception {
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
	public static void checkPortfolioTransferInstructionV07(PortfolioTransferInstructionV07 obj) throws Exception {
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
	public static void checkAccountHoldingInformationV05(AccountHoldingInformationV05 obj) throws Exception {
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
	public static void checkAccountHoldingInformationRequestV04(AccountHoldingInformationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

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
}