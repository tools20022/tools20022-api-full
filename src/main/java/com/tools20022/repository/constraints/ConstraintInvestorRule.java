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
 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may
 * be present. If PrimaryIndividualInvestor is not present, then
 * SecondaryIndividualInvestor is not allowed.<br>
 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be
 * present. If PrimaryIndividualInvestor is not present, then
 * OtherIndividualInvestor is not allowed.
 */
public class ConstraintInvestorRule {

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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\r\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forPortfolioTransferInstructionV06
	 * ConstraintInvestorRule.forPortfolioTransferInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV07> forPortfolioTransferInstructionV07 = new MMConstraint<PortfolioTransferInstructionV07>() {
		{
			validator = ConstraintInvestorRule::checkPortfolioTransferInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\r\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorRule.forPortfolioTransferInstructionV06;
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forAccountHoldingInformationV04
	 * ConstraintInvestorRule.forAccountHoldingInformationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV05> forAccountHoldingInformationV05 = new MMConstraint<AccountHoldingInformationV05>() {
		{
			validator = ConstraintInvestorRule::checkAccountHoldingInformationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorRule.forAccountHoldingInformationV04;
			owner_lazy = () -> AccountHoldingInformationV05.mmObject();
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\r\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forPortfolioTransferConfirmationV06
	 * ConstraintInvestorRule.forPortfolioTransferConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV07> forPortfolioTransferConfirmationV07 = new MMConstraint<PortfolioTransferConfirmationV07>() {
		{
			validator = ConstraintInvestorRule::checkPortfolioTransferConfirmationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\r\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorRule.forPortfolioTransferConfirmationV06;
			owner_lazy = () -> PortfolioTransferConfirmationV07.mmObject();
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forAccountHoldingInformationRequestV03
	 * ConstraintInvestorRule.forAccountHoldingInformationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV04> forAccountHoldingInformationRequestV04 = new MMConstraint<AccountHoldingInformationRequestV04>() {
		{
			validator = ConstraintInvestorRule::checkAccountHoldingInformationRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorRule.forAccountHoldingInformationRequestV03;
			owner_lazy = () -> AccountHoldingInformationRequestV04.mmObject();
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forAccountHoldingInformationRequestV04
	 * ConstraintInvestorRule.forAccountHoldingInformationRequestV04}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forAccountHoldingInformationRequestV02
	 * ConstraintInvestorRule.forAccountHoldingInformationRequestV02}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV03> forAccountHoldingInformationRequestV03 = new MMConstraint<AccountHoldingInformationRequestV03>() {
		{
			validator = ConstraintInvestorRule::checkAccountHoldingInformationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorRule.forAccountHoldingInformationRequestV04);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorRule.forAccountHoldingInformationRequestV02;
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forAccountHoldingInformationV05
	 * ConstraintInvestorRule.forAccountHoldingInformationV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forAccountHoldingInformationV03
	 * ConstraintInvestorRule.forAccountHoldingInformationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV04> forAccountHoldingInformationV04 = new MMConstraint<AccountHoldingInformationV04>() {
		{
			validator = ConstraintInvestorRule::checkAccountHoldingInformationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorRule.forAccountHoldingInformationV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorRule.forAccountHoldingInformationV03;
			owner_lazy = () -> AccountHoldingInformationV04.mmObject();
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\r\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forPortfolioTransferConfirmationV07
	 * ConstraintInvestorRule.forPortfolioTransferConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forPortfolioTransferConfirmationV05
	 * ConstraintInvestorRule.forPortfolioTransferConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV06> forPortfolioTransferConfirmationV06 = new MMConstraint<PortfolioTransferConfirmationV06>() {
		{
			validator = ConstraintInvestorRule::checkPortfolioTransferConfirmationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\r\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorRule.forPortfolioTransferConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorRule.forPortfolioTransferConfirmationV05;
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\r\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forPortfolioTransferInstructionV07
	 * ConstraintInvestorRule.forPortfolioTransferInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forPortfolioTransferInstructionV05
	 * ConstraintInvestorRule.forPortfolioTransferInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV06> forPortfolioTransferInstructionV06 = new MMConstraint<PortfolioTransferInstructionV06>() {
		{
			validator = ConstraintInvestorRule::checkPortfolioTransferInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\r\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorRule.forPortfolioTransferInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorRule.forPortfolioTransferInstructionV05;
			owner_lazy = () -> PortfolioTransferInstructionV06.mmObject();
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioInformationV01> forPEPOrISAOrPortfolioInformationV01 = new MMConstraint<PEPOrISAOrPortfolioInformationV01>() {
		{
			validator = ConstraintInvestorRule::checkPEPOrISAOrPortfolioInformationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV02> forAccountHoldingInformationV02 = new MMConstraint<AccountHoldingInformationV02>() {
		{
			validator = ConstraintInvestorRule::checkAccountHoldingInformationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forAccountHoldingInformationV04
	 * ConstraintInvestorRule.forAccountHoldingInformationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV03> forAccountHoldingInformationV03 = new MMConstraint<AccountHoldingInformationV03>() {
		{
			validator = ConstraintInvestorRule::checkAccountHoldingInformationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorRule.forAccountHoldingInformationV04);
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioTransferConfirmationV02> forPEPOrISAOrPortfolioTransferConfirmationV02 = new MMConstraint<PEPOrISAOrPortfolioTransferConfirmationV02>() {
		{
			validator = ConstraintInvestorRule::checkPEPOrISAOrPortfolioTransferConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV03> forPortfolioTransferConfirmationV03 = new MMConstraint<PortfolioTransferConfirmationV03>() {
		{
			validator = ConstraintInvestorRule::checkPortfolioTransferConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forPortfolioTransferConfirmationV05
	 * ConstraintInvestorRule.forPortfolioTransferConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV04> forPortfolioTransferConfirmationV04 = new MMConstraint<PortfolioTransferConfirmationV04>() {
		{
			validator = ConstraintInvestorRule::checkPortfolioTransferConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorRule.forPortfolioTransferConfirmationV05);
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioTransferInstructionV02> forPEPOrISAOrPortfolioTransferInstructionV02 = new MMConstraint<PEPOrISAOrPortfolioTransferInstructionV02>() {
		{
			validator = ConstraintInvestorRule::checkPEPOrISAOrPortfolioTransferInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV03> forPortfolioTransferInstructionV03 = new MMConstraint<PortfolioTransferInstructionV03>() {
		{
			validator = ConstraintInvestorRule::checkPortfolioTransferInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forPortfolioTransferInstructionV05
	 * ConstraintInvestorRule.forPortfolioTransferInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV04> forPortfolioTransferInstructionV04 = new MMConstraint<PortfolioTransferInstructionV04>() {
		{
			validator = ConstraintInvestorRule::checkPortfolioTransferInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorRule.forPortfolioTransferInstructionV05);
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestForPEPOrISAOrPortfolioInformationV01> forRequestForPEPOrISAOrPortfolioInformationV01 = new MMConstraint<RequestForPEPOrISAOrPortfolioInformationV01>() {
		{
			validator = ConstraintInvestorRule::checkRequestForPEPOrISAOrPortfolioInformationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forAccountHoldingInformationRequestV03
	 * ConstraintInvestorRule.forAccountHoldingInformationRequestV03}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV02> forAccountHoldingInformationRequestV02 = new MMConstraint<AccountHoldingInformationRequestV02>() {
		{
			validator = ConstraintInvestorRule::checkAccountHoldingInformationRequestV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorRule.forAccountHoldingInformationRequestV03);
			owner_lazy = () -> AccountHoldingInformationRequestV02.mmObject();
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forPortfolioTransferInstructionV06
	 * ConstraintInvestorRule.forPortfolioTransferInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forPortfolioTransferInstructionV04
	 * ConstraintInvestorRule.forPortfolioTransferInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV05> forPortfolioTransferInstructionV05 = new MMConstraint<PortfolioTransferInstructionV05>() {
		{
			validator = ConstraintInvestorRule::checkPortfolioTransferInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorRule.forPortfolioTransferInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorRule.forPortfolioTransferInstructionV04;
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forPortfolioTransferConfirmationV06
	 * ConstraintInvestorRule.forPortfolioTransferConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forPortfolioTransferConfirmationV04
	 * ConstraintInvestorRule.forPortfolioTransferConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV05> forPortfolioTransferConfirmationV05 = new MMConstraint<PortfolioTransferConfirmationV05>() {
		{
			validator = ConstraintInvestorRule::checkPortfolioTransferConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorRule.forPortfolioTransferConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorRule.forPortfolioTransferConfirmationV04;
			owner_lazy = () -> PortfolioTransferConfirmationV05.mmObject();
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPISATransfer7> forPEPISATransfer7 = new MMConstraint<PEPISATransfer7>() {
		{
			validator = ConstraintInvestorRule::checkPEPISATransfer7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPISATransfer11> forPEPISATransfer11 = new MMConstraint<PEPISATransfer11>() {
		{
			validator = ConstraintInvestorRule::checkPEPISATransfer11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forISATransfer12
	 * ConstraintInvestorRule.forISATransfer12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer9> forISATransfer9 = new MMConstraint<ISATransfer9>() {
		{
			validator = ConstraintInvestorRule::checkISATransfer9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorRule.forISATransfer12);
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forISATransfer19
	 * ConstraintInvestorRule.forISATransfer19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forISATransfer9
	 * ConstraintInvestorRule.forISATransfer9}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer12> forISATransfer12 = new MMConstraint<ISATransfer12>() {
		{
			validator = ConstraintInvestorRule::checkISATransfer12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\n\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorRule.forISATransfer19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorRule.forISATransfer9;
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\r\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forISATransfer24
	 * ConstraintInvestorRule.forISATransfer24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forISATransfer12
	 * ConstraintInvestorRule.forISATransfer12}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer19> forISATransfer19 = new MMConstraint<ISATransfer19>() {
		{
			validator = ConstraintInvestorRule::checkISATransfer19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\r\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorRule.forISATransfer24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorRule.forISATransfer12;
			owner_lazy = () -> ISATransfer19.mmObject();
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
	 * name} = "InvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\r\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forISATransfer19
	 * ConstraintInvestorRule.forISATransfer19}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer24> forISATransfer24 = new MMConstraint<ISATransfer24>() {
		{
			validator = ConstraintInvestorRule::checkISATransfer24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRule";
			definition = "If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then SecondaryIndividualInvestor is not allowed.\r\nIf PrimaryIndividualInvestor is present, then OtherIndividualInvestor may be present. If PrimaryIndividualInvestor is not present, then OtherIndividualInvestor is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorRule.forISATransfer19;
			owner_lazy = () -> ISATransfer24.mmObject();
		}
	};

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.<br>
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPortfolioTransferInstructionV07(PortfolioTransferInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkAccountHoldingInformationV05(AccountHoldingInformationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.<br>
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPortfolioTransferConfirmationV07(PortfolioTransferConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkAccountHoldingInformationRequestV04(AccountHoldingInformationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkAccountHoldingInformationRequestV03(AccountHoldingInformationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkAccountHoldingInformationV04(AccountHoldingInformationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.<br>
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPortfolioTransferConfirmationV06(PortfolioTransferConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.<br>
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPortfolioTransferInstructionV06(PortfolioTransferInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPEPOrISAOrPortfolioInformationV01(PEPOrISAOrPortfolioInformationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkAccountHoldingInformationV02(AccountHoldingInformationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkAccountHoldingInformationV03(AccountHoldingInformationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPEPOrISAOrPortfolioTransferConfirmationV02(PEPOrISAOrPortfolioTransferConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPortfolioTransferConfirmationV03(PortfolioTransferConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPortfolioTransferConfirmationV04(PortfolioTransferConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPEPOrISAOrPortfolioTransferInstructionV02(PEPOrISAOrPortfolioTransferInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPortfolioTransferInstructionV03(PortfolioTransferInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPortfolioTransferInstructionV04(PortfolioTransferInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkRequestForPEPOrISAOrPortfolioInformationV01(RequestForPEPOrISAOrPortfolioInformationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkAccountHoldingInformationRequestV02(AccountHoldingInformationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPortfolioTransferInstructionV05(PortfolioTransferInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPortfolioTransferConfirmationV05(PortfolioTransferConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPEPISATransfer7(PEPISATransfer7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkPEPISATransfer11(PEPISATransfer11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkISATransfer9(ISATransfer9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.
	 * 
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkISATransfer12(ISATransfer12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.<br>
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkISATransfer19(ISATransfer19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryIndividualInvestor is present, then SecondaryIndividualInvestor
	 * may be present. If PrimaryIndividualInvestor is not present, then
	 * SecondaryIndividualInvestor is not allowed.<br>
	 * If PrimaryIndividualInvestor is present, then OtherIndividualInvestor may
	 * be present. If PrimaryIndividualInvestor is not present, then
	 * OtherIndividualInvestor is not allowed.
	 */
	public static void checkISATransfer24(ISATransfer24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}