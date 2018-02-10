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
import com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04;
import com.tools20022.repository.area.sese.AccountHoldingInformationV05;
import com.tools20022.repository.area.sese.PortfolioTransferInstructionV07;
import com.tools20022.repository.msg.ISATransfer24;

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