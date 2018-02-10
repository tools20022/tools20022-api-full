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
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If any occurrence of ProductTransfer\Portfolio is present, then one or more
 * elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor,
 * OtherIndividualInvestor) may be present<br>
 * If any occurrence of ProductTransfer\Portfolio is present, then one or more
 * elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
 * OtherCorporateInvestor) may be present.
 */
public class ConstraintPorfolioRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08
	 * PortfolioTransferConfirmationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forPortfolioTransferConfirmationV07
	 * ConstraintPorfolioRule.forPortfolioTransferConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV08> forPortfolioTransferConfirmationV08 = new MMConstraint<PortfolioTransferConfirmationV08>() {
		{
			validator = ConstraintPorfolioRule::checkPortfolioTransferConfirmationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forPortfolioTransferConfirmationV07;
			owner_lazy = () -> PortfolioTransferConfirmationV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07
	 * PortfolioTransferConfirmationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forPortfolioTransferConfirmationV08
	 * ConstraintPorfolioRule.forPortfolioTransferConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forPortfolioTransferConfirmationV06
	 * ConstraintPorfolioRule.forPortfolioTransferConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV07> forPortfolioTransferConfirmationV07 = new MMConstraint<PortfolioTransferConfirmationV07>() {
		{
			validator = ConstraintPorfolioRule::checkPortfolioTransferConfirmationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPorfolioRule.forPortfolioTransferConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forPortfolioTransferConfirmationV06;
			owner_lazy = () -> PortfolioTransferConfirmationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01
	 * PEPOrISAOrPortfolioInformationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioInformationV01> forPEPOrISAOrPortfolioInformationV01 = new MMConstraint<PEPOrISAOrPortfolioInformationV01>() {
		{
			validator = ConstraintPorfolioRule::checkPEPOrISAOrPortfolioInformationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			owner_lazy = () -> PEPOrISAOrPortfolioInformationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02
	 * AccountHoldingInformationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV02> forAccountHoldingInformationV02 = new MMConstraint<AccountHoldingInformationV02>() {
		{
			validator = ConstraintPorfolioRule::checkAccountHoldingInformationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			owner_lazy = () -> AccountHoldingInformationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03
	 * AccountHoldingInformationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forAccountHoldingInformationV04
	 * ConstraintPorfolioRule.forAccountHoldingInformationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV03> forAccountHoldingInformationV03 = new MMConstraint<AccountHoldingInformationV03>() {
		{
			validator = ConstraintPorfolioRule::checkAccountHoldingInformationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPorfolioRule.forAccountHoldingInformationV04);
			owner_lazy = () -> AccountHoldingInformationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02
	 * PEPOrISAOrPortfolioTransferConfirmationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioTransferConfirmationV02> forPEPOrISAOrPortfolioTransferConfirmationV02 = new MMConstraint<PEPOrISAOrPortfolioTransferConfirmationV02>() {
		{
			validator = ConstraintPorfolioRule::checkPEPOrISAOrPortfolioTransferConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			owner_lazy = () -> PEPOrISAOrPortfolioTransferConfirmationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03
	 * PortfolioTransferConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV03> forPortfolioTransferConfirmationV03 = new MMConstraint<PortfolioTransferConfirmationV03>() {
		{
			validator = ConstraintPorfolioRule::checkPortfolioTransferConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			owner_lazy = () -> PortfolioTransferConfirmationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04
	 * PortfolioTransferConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forPortfolioTransferConfirmationV05
	 * ConstraintPorfolioRule.forPortfolioTransferConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV04> forPortfolioTransferConfirmationV04 = new MMConstraint<PortfolioTransferConfirmationV04>() {
		{
			validator = ConstraintPorfolioRule::checkPortfolioTransferConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPorfolioRule.forPortfolioTransferConfirmationV05);
			owner_lazy = () -> PortfolioTransferConfirmationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02
	 * PEPOrISAOrPortfolioTransferInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioTransferInstructionV02> forPEPOrISAOrPortfolioTransferInstructionV02 = new MMConstraint<PEPOrISAOrPortfolioTransferInstructionV02>() {
		{
			validator = ConstraintPorfolioRule::checkPEPOrISAOrPortfolioTransferInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			owner_lazy = () -> PEPOrISAOrPortfolioTransferInstructionV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03
	 * PortfolioTransferInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV03> forPortfolioTransferInstructionV03 = new MMConstraint<PortfolioTransferInstructionV03>() {
		{
			validator = ConstraintPorfolioRule::checkPortfolioTransferInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			owner_lazy = () -> PortfolioTransferInstructionV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04
	 * PortfolioTransferInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forPortfolioTransferInstructionV05
	 * ConstraintPorfolioRule.forPortfolioTransferInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV04> forPortfolioTransferInstructionV04 = new MMConstraint<PortfolioTransferInstructionV04>() {
		{
			validator = ConstraintPorfolioRule::checkPortfolioTransferInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPorfolioRule.forPortfolioTransferInstructionV05);
			owner_lazy = () -> PortfolioTransferInstructionV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01
	 * RequestForPEPOrISAOrPortfolioInformationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestForPEPOrISAOrPortfolioInformationV01> forRequestForPEPOrISAOrPortfolioInformationV01 = new MMConstraint<RequestForPEPOrISAOrPortfolioInformationV01>() {
		{
			validator = ConstraintPorfolioRule::checkRequestForPEPOrISAOrPortfolioInformationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			owner_lazy = () -> RequestForPEPOrISAOrPortfolioInformationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02
	 * AccountHoldingInformationRequestV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forAccountHoldingInformationRequestV03
	 * ConstraintPorfolioRule.forAccountHoldingInformationRequestV03}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV02> forAccountHoldingInformationRequestV02 = new MMConstraint<AccountHoldingInformationRequestV02>() {
		{
			validator = ConstraintPorfolioRule::checkAccountHoldingInformationRequestV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPorfolioRule.forAccountHoldingInformationRequestV03);
			owner_lazy = () -> AccountHoldingInformationRequestV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03
	 * AccountHoldingInformationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\n\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#forAccountHoldingInformationRequestV04
	 * ConstraintPortfolioRule.forAccountHoldingInformationRequestV04}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forAccountHoldingInformationRequestV02
	 * ConstraintPorfolioRule.forAccountHoldingInformationRequestV02}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV03> forAccountHoldingInformationRequestV03 = new MMConstraint<AccountHoldingInformationRequestV03>() {
		{
			validator = ConstraintPorfolioRule::checkAccountHoldingInformationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\n\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPortfolioRule.forAccountHoldingInformationRequestV04);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forAccountHoldingInformationRequestV02;
			owner_lazy = () -> AccountHoldingInformationRequestV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04
	 * AccountHoldingInformationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\n\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#forAccountHoldingInformationV05
	 * ConstraintPortfolioRule.forAccountHoldingInformationV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forAccountHoldingInformationV03
	 * ConstraintPorfolioRule.forAccountHoldingInformationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV04> forAccountHoldingInformationV04 = new MMConstraint<AccountHoldingInformationV04>() {
		{
			validator = ConstraintPorfolioRule::checkAccountHoldingInformationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\n\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPortfolioRule.forAccountHoldingInformationV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forAccountHoldingInformationV03;
			owner_lazy = () -> AccountHoldingInformationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05
	 * PortfolioTransferInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forPortfolioTransferInstructionV06
	 * ConstraintPorfolioRule.forPortfolioTransferInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forPortfolioTransferInstructionV04
	 * ConstraintPorfolioRule.forPortfolioTransferInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV05> forPortfolioTransferInstructionV05 = new MMConstraint<PortfolioTransferInstructionV05>() {
		{
			validator = ConstraintPorfolioRule::checkPortfolioTransferInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPorfolioRule.forPortfolioTransferInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forPortfolioTransferInstructionV04;
			owner_lazy = () -> PortfolioTransferInstructionV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05
	 * PortfolioTransferConfirmationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forPortfolioTransferConfirmationV06
	 * ConstraintPorfolioRule.forPortfolioTransferConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forPortfolioTransferConfirmationV04
	 * ConstraintPorfolioRule.forPortfolioTransferConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV05> forPortfolioTransferConfirmationV05 = new MMConstraint<PortfolioTransferConfirmationV05>() {
		{
			validator = ConstraintPorfolioRule::checkPortfolioTransferConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPorfolioRule.forPortfolioTransferConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forPortfolioTransferConfirmationV04;
			owner_lazy = () -> PortfolioTransferConfirmationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06
	 * PortfolioTransferConfirmationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forPortfolioTransferConfirmationV07
	 * ConstraintPorfolioRule.forPortfolioTransferConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forPortfolioTransferConfirmationV05
	 * ConstraintPorfolioRule.forPortfolioTransferConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV06> forPortfolioTransferConfirmationV06 = new MMConstraint<PortfolioTransferConfirmationV06>() {
		{
			validator = ConstraintPorfolioRule::checkPortfolioTransferConfirmationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPorfolioRule.forPortfolioTransferConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forPortfolioTransferConfirmationV05;
			owner_lazy = () -> PortfolioTransferConfirmationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06
	 * PortfolioTransferInstructionV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#forPortfolioTransferInstructionV07
	 * ConstraintPortfolioRule.forPortfolioTransferInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forPortfolioTransferInstructionV05
	 * ConstraintPorfolioRule.forPortfolioTransferInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV06> forPortfolioTransferInstructionV06 = new MMConstraint<PortfolioTransferInstructionV06>() {
		{
			validator = ConstraintPorfolioRule::checkPortfolioTransferInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\nIf any occurrence of ProductTransfer\\Portfolio is present, then one or more elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPortfolioRule.forPortfolioTransferInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forPortfolioTransferInstructionV05;
			owner_lazy = () -> PortfolioTransferInstructionV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7
	 * PEPISATransfer7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPISATransfer7> forPEPISATransfer7 = new MMConstraint<PEPISATransfer7>() {
		{
			validator = ConstraintPorfolioRule::checkPEPISATransfer7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			owner_lazy = () -> PEPISATransfer7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11
	 * PEPISATransfer11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPISATransfer11> forPEPISATransfer11 = new MMConstraint<PEPISATransfer11>() {
		{
			validator = ConstraintPorfolioRule::checkPEPISATransfer11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			owner_lazy = () -> PEPISATransfer11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9 ISATransfer9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forISATransfer12
	 * ConstraintPorfolioRule.forISATransfer12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer9> forISATransfer9 = new MMConstraint<ISATransfer9>() {
		{
			validator = ConstraintPorfolioRule::checkISATransfer9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\n\nIf ProductTransfer\\Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPorfolioRule.forISATransfer12);
			owner_lazy = () -> ISATransfer9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\n\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forISATransfer19
	 * ConstraintPorfolioRule.forISATransfer19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forISATransfer9
	 * ConstraintPorfolioRule.forISATransfer9}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer12> forISATransfer12 = new MMConstraint<ISATransfer12>() {
		{
			validator = ConstraintPorfolioRule::checkISATransfer12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\n\r\nIf ProductTransfer/Portfolio is present, then one or more message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPorfolioRule.forISATransfer19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forISATransfer9;
			owner_lazy = () -> ISATransfer12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19 ISATransfer19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PorfolioRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\nIf any occurrence of ProductTransfer/Portfolio is present, then one or more message in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#forISATransfer24
	 * ConstraintPortfolioRule.forISATransfer24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forISATransfer12
	 * ConstraintPorfolioRule.forISATransfer12}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer19> forISATransfer19 = new MMConstraint<ISATransfer19>() {
		{
			validator = ConstraintPorfolioRule::checkISATransfer19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PorfolioRule";
			definition = "If any occurrence of ProductTransfer/Portfolio is present, then one or more elements in the list (PrimaryIndividualInvestor, SecondaryIndividualInvestor, OtherIndividualInvestor) may be present\r\nIf any occurrence of ProductTransfer/Portfolio is present, then one or more message in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPortfolioRule.forISATransfer24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPorfolioRule.forISATransfer12;
			owner_lazy = () -> ISATransfer19.mmObject();
		}
	};

	/**
	 * If any occurrence of ProductTransfer\Portfolio is present, then one or
	 * more elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present<br>
	 * If any occurrence of ProductTransfer\Portfolio is present, then one or
	 * more elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPortfolioTransferConfirmationV08(PortfolioTransferConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer\Portfolio is present, then one or
	 * more elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present<br>
	 * If any occurrence of ProductTransfer\Portfolio is present, then one or
	 * more elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPortfolioTransferConfirmationV07(PortfolioTransferConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPEPOrISAOrPortfolioInformationV01(PEPOrISAOrPortfolioInformationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkAccountHoldingInformationV02(AccountHoldingInformationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkAccountHoldingInformationV03(AccountHoldingInformationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPEPOrISAOrPortfolioTransferConfirmationV02(PEPOrISAOrPortfolioTransferConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPortfolioTransferConfirmationV03(PortfolioTransferConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPortfolioTransferConfirmationV04(PortfolioTransferConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPEPOrISAOrPortfolioTransferInstructionV02(PEPOrISAOrPortfolioTransferInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPortfolioTransferInstructionV03(PortfolioTransferInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPortfolioTransferInstructionV04(PortfolioTransferInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkRequestForPEPOrISAOrPortfolioInformationV01(RequestForPEPOrISAOrPortfolioInformationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkAccountHoldingInformationRequestV02(AccountHoldingInformationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present<br>
	 * <br>
	 * If ProductTransfer/Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.<br>
	 */
	public static void checkAccountHoldingInformationRequestV03(AccountHoldingInformationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present<br>
	 * <br>
	 * If ProductTransfer/Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkAccountHoldingInformationV04(AccountHoldingInformationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPortfolioTransferInstructionV05(PortfolioTransferInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPortfolioTransferConfirmationV05(PortfolioTransferConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer\Portfolio is present, then one or
	 * more elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present<br>
	 * If any occurrence of ProductTransfer\Portfolio is present, then one or
	 * more elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPortfolioTransferConfirmationV06(PortfolioTransferConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer\Portfolio is present, then one or
	 * more elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present<br>
	 * If any occurrence of ProductTransfer\Portfolio is present, then one or
	 * more elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPortfolioTransferInstructionV06(PortfolioTransferInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPEPISATransfer7(PEPISATransfer7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkPEPISATransfer11(PEPISATransfer11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present
	 * 
	 * If ProductTransfer\Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkISATransfer9(ISATransfer9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio is present, then one or more message
	 * elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present<br>
	 * <br>
	 * If ProductTransfer/Portfolio is present, then one or more message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.<br>
	 */
	public static void checkISATransfer12(ISATransfer12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio is present, then one or
	 * more elements in the list (PrimaryIndividualInvestor,
	 * SecondaryIndividualInvestor, OtherIndividualInvestor) may be present<br>
	 * If any occurrence of ProductTransfer/Portfolio is present, then one or
	 * more message in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) may be present.
	 */
	public static void checkISATransfer19(ISATransfer19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}