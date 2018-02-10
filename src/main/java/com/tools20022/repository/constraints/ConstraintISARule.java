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
 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. <br>
 * If any occurrence of ProductTransfer/Portfolio/ISA is present then the
 * elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
 * OtherCorporateInvestor) are not allowed.
 */
public class ConstraintISARule {

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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present then the elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forPortfolioTransferInstructionV07
	 * ConstraintISARule.forPortfolioTransferInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV08> forPortfolioTransferInstructionV08 = new MMConstraint<PortfolioTransferInstructionV08>() {
		{
			validator = ConstraintISARule::checkPortfolioTransferInstructionV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present then the elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintISARule.forPortfolioTransferInstructionV07;
			owner_lazy = () -> PortfolioTransferInstructionV08.mmObject();
		}
	};
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present, then the elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forPortfolioTransferConfirmationV07
	 * ConstraintISARule.forPortfolioTransferConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV08> forPortfolioTransferConfirmationV08 = new MMConstraint<PortfolioTransferConfirmationV08>() {
		{
			validator = ConstraintISARule::checkPortfolioTransferConfirmationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present, then the elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintISARule.forPortfolioTransferConfirmationV07;
			owner_lazy = () -> PortfolioTransferConfirmationV08.mmObject();
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present, then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forAccountHoldingInformationV05
	 * ConstraintISARule.forAccountHoldingInformationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV06> forAccountHoldingInformationV06 = new MMConstraint<AccountHoldingInformationV06>() {
		{
			validator = ConstraintISARule::checkAccountHoldingInformationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present, then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintISARule.forAccountHoldingInformationV05;
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forAccountHoldingInformationRequestV04
	 * ConstraintISARule.forAccountHoldingInformationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV05> forAccountHoldingInformationRequestV05 = new MMConstraint<AccountHoldingInformationRequestV05>() {
		{
			validator = ConstraintISARule::checkAccountHoldingInformationRequestV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintISARule.forAccountHoldingInformationRequestV04;
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present then the elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forPortfolioTransferInstructionV08
	 * ConstraintISARule.forPortfolioTransferInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forPortfolioTransferInstructionV06
	 * ConstraintISARule.forPortfolioTransferInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV07> forPortfolioTransferInstructionV07 = new MMConstraint<PortfolioTransferInstructionV07>() {
		{
			validator = ConstraintISARule::checkPortfolioTransferInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present then the elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forPortfolioTransferInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintISARule.forPortfolioTransferInstructionV06;
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present, then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forAccountHoldingInformationV06
	 * ConstraintISARule.forAccountHoldingInformationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forAccountHoldingInformationV04
	 * ConstraintISARule.forAccountHoldingInformationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV05> forAccountHoldingInformationV05 = new MMConstraint<AccountHoldingInformationV05>() {
		{
			validator = ConstraintISARule::checkAccountHoldingInformationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present, then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forAccountHoldingInformationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintISARule.forAccountHoldingInformationV04;
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present, then the elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forPortfolioTransferConfirmationV08
	 * ConstraintISARule.forPortfolioTransferConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forPortfolioTransferConfirmationV06
	 * ConstraintISARule.forPortfolioTransferConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV07> forPortfolioTransferConfirmationV07 = new MMConstraint<PortfolioTransferConfirmationV07>() {
		{
			validator = ConstraintISARule::checkPortfolioTransferConfirmationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present, then the elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forPortfolioTransferConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintISARule.forPortfolioTransferConfirmationV06;
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forAccountHoldingInformationRequestV05
	 * ConstraintISARule.forAccountHoldingInformationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forAccountHoldingInformationRequestV03
	 * ConstraintISARule.forAccountHoldingInformationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV04> forAccountHoldingInformationRequestV04 = new MMConstraint<AccountHoldingInformationRequestV04>() {
		{
			validator = ConstraintISARule::checkAccountHoldingInformationRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forAccountHoldingInformationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintISARule.forAccountHoldingInformationRequestV03;
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forAccountHoldingInformationRequestV04
	 * ConstraintISARule.forAccountHoldingInformationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV03> forAccountHoldingInformationRequestV03 = new MMConstraint<AccountHoldingInformationRequestV03>() {
		{
			validator = ConstraintISARule::checkAccountHoldingInformationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forAccountHoldingInformationRequestV04);
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf ProductTransfer/Portfolio/ISA is present, then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forAccountHoldingInformationV05
	 * ConstraintISARule.forAccountHoldingInformationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV04> forAccountHoldingInformationV04 = new MMConstraint<AccountHoldingInformationV04>() {
		{
			validator = ConstraintISARule::checkAccountHoldingInformationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf ProductTransfer/Portfolio/ISA is present, then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forAccountHoldingInformationV05);
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf ProductTransfer/Portfolio/ISA is present, then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forPortfolioTransferInstructionV06
	 * ConstraintISARule.forPortfolioTransferInstructionV06}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV05> forPortfolioTransferInstructionV05 = new MMConstraint<PortfolioTransferInstructionV05>() {
		{
			validator = ConstraintISARule::checkPortfolioTransferInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf ProductTransfer/Portfolio/ISA is present, then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forPortfolioTransferInstructionV06);
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf ProductTransfer/Portfolio/ISA is present, then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forPortfolioTransferConfirmationV06
	 * ConstraintISARule.forPortfolioTransferConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV05> forPortfolioTransferConfirmationV05 = new MMConstraint<PortfolioTransferConfirmationV05>() {
		{
			validator = ConstraintISARule::checkPortfolioTransferConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf ProductTransfer/Portfolio/ISA is present, then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forPortfolioTransferConfirmationV06);
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present, then the elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forPortfolioTransferConfirmationV07
	 * ConstraintISARule.forPortfolioTransferConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forPortfolioTransferConfirmationV05
	 * ConstraintISARule.forPortfolioTransferConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV06> forPortfolioTransferConfirmationV06 = new MMConstraint<PortfolioTransferConfirmationV06>() {
		{
			validator = ConstraintISARule::checkPortfolioTransferConfirmationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present, then the elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forPortfolioTransferConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintISARule.forPortfolioTransferConfirmationV05;
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf ProductTransfer/Portfolio/ISA is present, then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forPortfolioTransferInstructionV07
	 * ConstraintISARule.forPortfolioTransferInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forPortfolioTransferInstructionV05
	 * ConstraintISARule.forPortfolioTransferInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV06> forPortfolioTransferInstructionV06 = new MMConstraint<PortfolioTransferInstructionV06>() {
		{
			validator = ConstraintISARule::checkPortfolioTransferInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf ProductTransfer/Portfolio/ISA is present, then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forPortfolioTransferInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintISARule.forPortfolioTransferInstructionV05;
			owner_lazy = () -> PortfolioTransferInstructionV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer4 ISATransfer4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer4> forISATransfer4 = new MMConstraint<ISATransfer4>() {
		{
			validator = ConstraintISARule::checkISATransfer4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
			owner_lazy = () -> ISATransfer4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer6 ISATransfer6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer6> forISATransfer6 = new MMConstraint<ISATransfer6>() {
		{
			validator = ConstraintISARule::checkISATransfer6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
			owner_lazy = () -> ISATransfer6.mmObject();
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPISATransfer11> forPEPISATransfer11 = new MMConstraint<PEPISATransfer11>() {
		{
			validator = ConstraintISARule::checkPEPISATransfer11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forISATransfer12
	 * ConstraintISARule.forISATransfer12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer9> forISATransfer9 = new MMConstraint<ISATransfer9>() {
		{
			validator = ConstraintISARule::checkISATransfer9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forISATransfer12);
			owner_lazy = () -> ISATransfer9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2 ISATransfer2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer2> forISATransfer2 = new MMConstraint<ISATransfer2>() {
		{
			validator = ConstraintISARule::checkISATransfer2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
			owner_lazy = () -> ISATransfer2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10 ISATransfer10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer10> forISATransfer10 = new MMConstraint<ISATransfer10>() {
		{
			validator = ConstraintISARule::checkISATransfer10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
			owner_lazy = () -> ISATransfer10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer1 ISATransfer1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer1> forISATransfer1 = new MMConstraint<ISATransfer1>() {
		{
			validator = ConstraintISARule::checkISATransfer1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
			owner_lazy = () -> ISATransfer1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer7 ISATransfer7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer7> forISATransfer7 = new MMConstraint<ISATransfer7>() {
		{
			validator = ConstraintISARule::checkISATransfer7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
			owner_lazy = () -> ISATransfer7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer5 ISATransfer5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer5> forISATransfer5 = new MMConstraint<ISATransfer5>() {
		{
			validator = ConstraintISARule::checkISATransfer5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer\\Portfolio\\ISA or ProductTransfer\\Portfolio\\Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
			owner_lazy = () -> ISATransfer5.mmObject();
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forISATransfer19
	 * ConstraintISARule.forISATransfer19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forISATransfer9
	 * ConstraintISARule.forISATransfer9}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer12> forISATransfer12 = new MMConstraint<ISATransfer12>() {
		{
			validator = ConstraintISARule::checkISATransfer12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\n\r\nIf ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forISATransfer19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintISARule.forISATransfer9;
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio is present then the elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forISATransfer24
	 * ConstraintISARule.forISATransfer24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forISATransfer12
	 * ConstraintISARule.forISATransfer12}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer19> forISATransfer19 = new MMConstraint<ISATransfer19>() {
		{
			validator = ConstraintISARule::checkISATransfer19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio is present then the elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forISATransfer24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintISARule.forISATransfer12;
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
	 * name} = "ISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present then the elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forISATransfer19
	 * ConstraintISARule.forISATransfer19}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer24> forISATransfer24 = new MMConstraint<ISATransfer24>() {
		{
			validator = ConstraintISARule::checkISATransfer24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISARule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed. \r\nIf any occurrence of ProductTransfer/Portfolio/ISA is present then the elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintISARule.forISATransfer19;
			owner_lazy = () -> ISATransfer24.mmObject();
		}
	};

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present then the
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.
	 */
	public static void checkPortfolioTransferInstructionV08(PortfolioTransferInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then the
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.<br>
	 * <br>
	 */
	public static void checkPortfolioTransferConfirmationV08(PortfolioTransferConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then the
	 * message elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.<br>
	 */
	public static void checkAccountHoldingInformationV06(AccountHoldingInformationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present then the
	 * message elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.<br>
	 */
	public static void checkAccountHoldingInformationRequestV05(AccountHoldingInformationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present then the
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.
	 */
	public static void checkPortfolioTransferInstructionV07(PortfolioTransferInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then the
	 * message elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.<br>
	 */
	public static void checkAccountHoldingInformationV05(AccountHoldingInformationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then the
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.<br>
	 * <br>
	 */
	public static void checkPortfolioTransferConfirmationV07(PortfolioTransferConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present then the
	 * message elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.<br>
	 */
	public static void checkAccountHoldingInformationRequestV04(AccountHoldingInformationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio
	 * is present, then SecondaryIndividualInvestor and/or
	 * OtherIndividualInvestor is not allowed. <br>
	 * <br>
	 * If ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio
	 * is present then the message elements in the list
	 * (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.<br>
	 */
	public static void checkAccountHoldingInformationRequestV03(AccountHoldingInformationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If ProductTransfer/Portfolio/ISA is present, then the message elements in
	 * the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.<br>
	 */
	public static void checkAccountHoldingInformationV04(AccountHoldingInformationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If ProductTransfer/Portfolio/ISA is present, then the message elements in
	 * the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.<br>
	 */
	public static void checkPortfolioTransferInstructionV05(PortfolioTransferInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If ProductTransfer/Portfolio/ISA is present, then the message elements in
	 * the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.<br>
	 * <br>
	 */
	public static void checkPortfolioTransferConfirmationV05(PortfolioTransferConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then the
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.<br>
	 * <br>
	 */
	public static void checkPortfolioTransferConfirmationV06(PortfolioTransferConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If ProductTransfer/Portfolio/ISA is present, then the message elements in
	 * the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.<br>
	 */
	public static void checkPortfolioTransferInstructionV06(PortfolioTransferInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present, then SecondaryIndividualInvestor and/or
	 * OtherIndividualInvestor is not allowed. <br>
	 * <br>
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present then the message elements in the list
	 * (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.
	 */
	public static void checkISATransfer4(ISATransfer4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present, then SecondaryIndividualInvestor and/or
	 * OtherIndividualInvestor is not allowed. <br>
	 * <br>
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present then the message elements in the list
	 * (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.
	 */
	public static void checkISATransfer6(ISATransfer6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present, then SecondaryIndividualInvestor and/or
	 * OtherIndividualInvestor is not allowed. <br>
	 * <br>
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present then the message elements in the list
	 * (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.
	 */
	public static void checkPEPISATransfer11(PEPISATransfer11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present, then SecondaryIndividualInvestor and/or
	 * OtherIndividualInvestor is not allowed. <br>
	 * <br>
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present then the message elements in the list
	 * (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.
	 */
	public static void checkISATransfer9(ISATransfer9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present, then SecondaryIndividualInvestor and/or
	 * OtherIndividualInvestor is not allowed. <br>
	 * <br>
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present then the message elements in the list
	 * (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.
	 */
	public static void checkISATransfer2(ISATransfer2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present, then SecondaryIndividualInvestor and/or
	 * OtherIndividualInvestor is not allowed. <br>
	 * <br>
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present then the message elements in the list
	 * (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.
	 */
	public static void checkISATransfer10(ISATransfer10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present, then SecondaryIndividualInvestor and/or
	 * OtherIndividualInvestor is not allowed. <br>
	 * <br>
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present then the message elements in the list
	 * (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.
	 */
	public static void checkISATransfer1(ISATransfer1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present, then SecondaryIndividualInvestor and/or
	 * OtherIndividualInvestor is not allowed. <br>
	 * <br>
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present then the message elements in the list
	 * (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.
	 */
	public static void checkISATransfer7(ISATransfer7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present, then SecondaryIndividualInvestor and/or
	 * OtherIndividualInvestor is not allowed. <br>
	 * <br>
	 * If ProductTransfer\Portfolio\ISA or ProductTransfer\Portfolio\Portfolio
	 * is present then the message elements in the list
	 * (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.
	 */
	public static void checkISATransfer5(ISATransfer5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio
	 * is present, then SecondaryIndividualInvestor and/or
	 * OtherIndividualInvestor is not allowed. <br>
	 * <br>
	 * If ProductTransfer/Portfolio/ISA or ProductTransfer/Portfolio/Portfolio
	 * is present then the message elements in the list
	 * (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.<br>
	 */
	public static void checkISATransfer12(ISATransfer12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA or
	 * ProductTransfer/Portfolio/Portfolio is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If any occurrence of ProductTransfer/Portfolio/ISA or
	 * ProductTransfer/Portfolio/Portfolio is present then the elements in the
	 * list (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
	 * OtherCorporateInvestor) are not allowed.<br>
	 */
	public static void checkISATransfer19(ISATransfer19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed. <br>
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present then the
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.<br>
	 */
	public static void checkISATransfer24(ISATransfer24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}