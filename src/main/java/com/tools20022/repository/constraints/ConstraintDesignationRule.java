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
 * If ProductTransfer\ISA or ProductTransfer\PEP is present, then
 * ClientAccount\Designation is not allowed.
 * 
 * If ProductTransfer\Portfolio is present, then ClientAccount\Designation is
 * allowed.
 */
public class ConstraintDesignationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01
	 * RequestForPEPOrISAOrPortfolioInformationV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then ClientAccount\\Designation is not allowed.\n\nIf ProductTransfer\\Portfolio is present, then ClientAccount\\Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RequestForPEPOrISAOrPortfolioInformationV01> for_sese_RequestForPEPOrISAOrPortfolioInformationV01 = new MMConstraint<RequestForPEPOrISAOrPortfolioInformationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then ClientAccount\\Designation is not allowed.\n\nIf ProductTransfer\\Portfolio is present, then ClientAccount\\Designation is allowed.";
			owner_lazy = () -> RequestForPEPOrISAOrPortfolioInformationV01.mmObject();
		}

		@Override
		public void executeValidator(RequestForPEPOrISAOrPortfolioInformationV01 obj) throws Exception {
			check_sese_RequestForPEPOrISAOrPortfolioInformationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10 ISATransfer10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer10> forISATransfer10 = new MMConstraint<ISATransfer10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed.";
			owner_lazy = () -> ISATransfer10.mmObject();
		}

		@Override
		public void executeValidator(ISATransfer10 obj) throws Exception {
			checkISATransfer10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed.\r\nIf any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#forISATransfer19
	 * ConstraintDesignationRule.forISATransfer19}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer24> forISATransfer24 = new MMConstraint<ISATransfer24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed.\r\nIf any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDesignationRule.forISATransfer19;
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer7 ISATransfer7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer7> forISATransfer7 = new MMConstraint<ISATransfer7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed.";
			owner_lazy = () -> ISATransfer7.mmObject();
		}

		@Override
		public void executeValidator(ISATransfer7 obj) throws Exception {
			checkISATransfer7(obj);
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
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed.\r\n\r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_AccountHoldingInformationRequestV05
	 * ConstraintDesignationRule.for_sese_AccountHoldingInformationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_AccountHoldingInformationRequestV03
	 * ConstraintDesignationRule.for_sese_AccountHoldingInformationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV04> for_sese_AccountHoldingInformationRequestV04 = new MMConstraint<AccountHoldingInformationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed.\r\n\r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_AccountHoldingInformationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_AccountHoldingInformationRequestV03;
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer4 ISATransfer4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer4> forISATransfer4 = new MMConstraint<ISATransfer4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed.";
			owner_lazy = () -> ISATransfer4.mmObject();
		}

		@Override
		public void executeValidator(ISATransfer4 obj) throws Exception {
			checkISATransfer4(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then ClientAccount\\Designation is not allowed.\n\nIf ProductTransfer\\Portfolio is present, then ClientAccount\\Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioTransferInstructionV02> for_sese_PEPOrISAOrPortfolioTransferInstructionV02 = new MMConstraint<PEPOrISAOrPortfolioTransferInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then ClientAccount\\Designation is not allowed.\n\nIf ProductTransfer\\Portfolio is present, then ClientAccount\\Designation is allowed.";
			owner_lazy = () -> PEPOrISAOrPortfolioTransferInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(PEPOrISAOrPortfolioTransferInstructionV02 obj) throws Exception {
			check_sese_PEPOrISAOrPortfolioTransferInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9 ISATransfer9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#forISATransfer12
	 * ConstraintDesignationRule.forISATransfer12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer9> forISATransfer9 = new MMConstraint<ISATransfer9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDesignationRule.forISATransfer12);
			owner_lazy = () -> ISATransfer9.mmObject();
		}

		@Override
		public void executeValidator(ISATransfer9 obj) throws Exception {
			checkISATransfer9(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_PortfolioTransferConfirmationV06
	 * ConstraintDesignationRule.for_sese_PortfolioTransferConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV05> for_sese_PortfolioTransferConfirmationV05 = new MMConstraint<PortfolioTransferConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_PortfolioTransferConfirmationV06);
			owner_lazy = () -> PortfolioTransferConfirmationV05.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferConfirmationV05 obj) throws Exception {
			check_sese_PortfolioTransferConfirmationV05(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_PortfolioTransferInstructionV07
	 * ConstraintDesignationRule.for_sese_PortfolioTransferInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_PortfolioTransferInstructionV05
	 * ConstraintDesignationRule.for_sese_PortfolioTransferInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV06> for_sese_PortfolioTransferInstructionV06 = new MMConstraint<PortfolioTransferInstructionV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_PortfolioTransferInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_PortfolioTransferInstructionV05;
			owner_lazy = () -> PortfolioTransferInstructionV06.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferInstructionV06 obj) throws Exception {
			check_sese_PortfolioTransferInstructionV06(obj);
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
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. \r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_AccountHoldingInformationV06
	 * ConstraintDesignationRule.for_sese_AccountHoldingInformationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_AccountHoldingInformationV04
	 * ConstraintDesignationRule.for_sese_AccountHoldingInformationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV05> for_sese_AccountHoldingInformationV05 = new MMConstraint<AccountHoldingInformationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. \r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_AccountHoldingInformationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_AccountHoldingInformationV04;
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer5 ISATransfer5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer5> forISATransfer5 = new MMConstraint<ISATransfer5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed.";
			owner_lazy = () -> ISATransfer5.mmObject();
		}

		@Override
		public void executeValidator(ISATransfer5 obj) throws Exception {
			checkISATransfer5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19 ISATransfer19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed.\r\nIf any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#forISATransfer24
	 * ConstraintDesignationRule.forISATransfer24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#forISATransfer12
	 * ConstraintDesignationRule.forISATransfer12}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer19> forISATransfer19 = new MMConstraint<ISATransfer19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed.\r\nIf any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDesignationRule.forISATransfer24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDesignationRule.forISATransfer12;
			owner_lazy = () -> ISATransfer19.mmObject();
		}

		@Override
		public void executeValidator(ISATransfer19 obj) throws Exception {
			checkISATransfer19(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_PortfolioTransferConfirmationV08
	 * ConstraintDesignationRule.for_sese_PortfolioTransferConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_PortfolioTransferConfirmationV06
	 * ConstraintDesignationRule.for_sese_PortfolioTransferConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV07> for_sese_PortfolioTransferConfirmationV07 = new MMConstraint<PortfolioTransferConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_PortfolioTransferConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_PortfolioTransferConfirmationV06;
			owner_lazy = () -> PortfolioTransferConfirmationV07.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferConfirmationV07 obj) throws Exception {
			check_sese_PortfolioTransferConfirmationV07(obj);
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
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_PortfolioTransferInstructionV08
	 * ConstraintDesignationRule.for_sese_PortfolioTransferInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_PortfolioTransferInstructionV06
	 * ConstraintDesignationRule.for_sese_PortfolioTransferInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV07> for_sese_PortfolioTransferInstructionV07 = new MMConstraint<PortfolioTransferInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_PortfolioTransferInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_PortfolioTransferInstructionV06;
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed.\r\n\r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#forISATransfer19
	 * ConstraintDesignationRule.forISATransfer19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#forISATransfer9
	 * ConstraintDesignationRule.forISATransfer9}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer12> forISATransfer12 = new MMConstraint<ISATransfer12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed.\r\n\r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDesignationRule.forISATransfer19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDesignationRule.forISATransfer9;
			owner_lazy = () -> ISATransfer12.mmObject();
		}

		@Override
		public void executeValidator(ISATransfer12 obj) throws Exception {
			checkISATransfer12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer1 ISATransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer1> forISATransfer1 = new MMConstraint<ISATransfer1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed.";
			owner_lazy = () -> ISATransfer1.mmObject();
		}

		@Override
		public void executeValidator(ISATransfer1 obj) throws Exception {
			checkISATransfer1(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then ClientAccount\\Designation is not allowed.\n\nIf ProductTransfer\\Portfolio is present, then ClientAccount\\Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PEPISATransfer7> forPEPISATransfer7 = new MMConstraint<PEPISATransfer7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then ClientAccount\\Designation is not allowed.\n\nIf ProductTransfer\\Portfolio is present, then ClientAccount\\Designation is allowed.";
			owner_lazy = () -> PEPISATransfer7.mmObject();
		}

		@Override
		public void executeValidator(PEPISATransfer7 obj) throws Exception {
			checkPEPISATransfer7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2 ISATransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer2> forISATransfer2 = new MMConstraint<ISATransfer2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed.";
			owner_lazy = () -> ISATransfer2.mmObject();
		}

		@Override
		public void executeValidator(ISATransfer2 obj) throws Exception {
			checkISATransfer2(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed.\r\n\r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_AccountHoldingInformationRequestV04
	 * ConstraintDesignationRule.for_sese_AccountHoldingInformationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV03> for_sese_AccountHoldingInformationRequestV03 = new MMConstraint<AccountHoldingInformationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed.\r\n\r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_AccountHoldingInformationRequestV04);
			owner_lazy = () -> AccountHoldingInformationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(AccountHoldingInformationRequestV03 obj) throws Exception {
			check_sese_AccountHoldingInformationRequestV03(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_PortfolioTransferInstructionV06
	 * ConstraintDesignationRule.for_sese_PortfolioTransferInstructionV06}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV05> for_sese_PortfolioTransferInstructionV05 = new MMConstraint<PortfolioTransferInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_PortfolioTransferInstructionV06);
			owner_lazy = () -> PortfolioTransferInstructionV05.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferInstructionV05 obj) throws Exception {
			check_sese_PortfolioTransferInstructionV05(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then ClientAccount\\Designation is not allowed.\n\nIf ProductTransfer\\Portfolio is present, then ClientAccount\\Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioInformationV01> for_sese_PEPOrISAOrPortfolioInformationV01 = new MMConstraint<PEPOrISAOrPortfolioInformationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then ClientAccount\\Designation is not allowed.\n\nIf ProductTransfer\\Portfolio is present, then ClientAccount\\Designation is allowed.";
			owner_lazy = () -> PEPOrISAOrPortfolioInformationV01.mmObject();
		}

		@Override
		public void executeValidator(PEPOrISAOrPortfolioInformationV01 obj) throws Exception {
			check_sese_PEPOrISAOrPortfolioInformationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer6 ISATransfer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer6> forISATransfer6 = new MMConstraint<ISATransfer6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed.";
			owner_lazy = () -> ISATransfer6.mmObject();
		}

		@Override
		public void executeValidator(ISATransfer6 obj) throws Exception {
			checkISATransfer6(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. \r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_AccountHoldingInformationV05
	 * ConstraintDesignationRule.for_sese_AccountHoldingInformationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV04> for_sese_AccountHoldingInformationV04 = new MMConstraint<AccountHoldingInformationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. \r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_AccountHoldingInformationV05);
			owner_lazy = () -> AccountHoldingInformationV04.mmObject();
		}

		@Override
		public void executeValidator(AccountHoldingInformationV04 obj) throws Exception {
			check_sese_AccountHoldingInformationV04(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PEPISATransfer11> forPEPISATransfer11 = new MMConstraint<PEPISATransfer11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer\\Portfolio\\ISA is present, then TransferorAccount\\Designation is not allowed.\r\n\r\nIf ProductTransfer\\Portfolio\\Portfolio is present, then TransferorAccount\\Designation is allowed.";
			owner_lazy = () -> PEPISATransfer11.mmObject();
		}

		@Override
		public void executeValidator(PEPISATransfer11 obj) throws Exception {
			checkPEPISATransfer11(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_PortfolioTransferConfirmationV07
	 * ConstraintDesignationRule.for_sese_PortfolioTransferConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV08> for_sese_PortfolioTransferConfirmationV08 = new MMConstraint<PortfolioTransferConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_PortfolioTransferConfirmationV07;
			owner_lazy = () -> PortfolioTransferConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferConfirmationV08 obj) throws Exception {
			check_sese_PortfolioTransferConfirmationV08(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then ClientAccount\\Designation is not allowed.\n\nIf ProductTransfer\\Portfolio is present, then ClientAccount\\Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioTransferConfirmationV02> for_sese_PEPOrISAOrPortfolioTransferConfirmationV02 = new MMConstraint<PEPOrISAOrPortfolioTransferConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then ClientAccount\\Designation is not allowed.\n\nIf ProductTransfer\\Portfolio is present, then ClientAccount\\Designation is allowed.";
			owner_lazy = () -> PEPOrISAOrPortfolioTransferConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(PEPOrISAOrPortfolioTransferConfirmationV02 obj) throws Exception {
			check_sese_PEPOrISAOrPortfolioTransferConfirmationV02(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_PortfolioTransferConfirmationV07
	 * ConstraintDesignationRule.for_sese_PortfolioTransferConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_PortfolioTransferConfirmationV05
	 * ConstraintDesignationRule.for_sese_PortfolioTransferConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV06> for_sese_PortfolioTransferConfirmationV06 = new MMConstraint<PortfolioTransferConfirmationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_PortfolioTransferConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_PortfolioTransferConfirmationV05;
			owner_lazy = () -> PortfolioTransferConfirmationV06.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferConfirmationV06 obj) throws Exception {
			check_sese_PortfolioTransferConfirmationV06(obj);
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
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. \r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_AccountHoldingInformationV05
	 * ConstraintDesignationRule.for_sese_AccountHoldingInformationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV06> for_sese_AccountHoldingInformationV06 = new MMConstraint<AccountHoldingInformationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. \r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_AccountHoldingInformationV05;
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
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_PortfolioTransferInstructionV07
	 * ConstraintDesignationRule.for_sese_PortfolioTransferInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV08> for_sese_PortfolioTransferInstructionV08 = new MMConstraint<PortfolioTransferInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_PortfolioTransferInstructionV07;
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
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed.\r\n\r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_AccountHoldingInformationRequestV04
	 * ConstraintDesignationRule.for_sese_AccountHoldingInformationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV05> for_sese_AccountHoldingInformationRequestV05 = new MMConstraint<AccountHoldingInformationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed.\r\n\r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_AccountHoldingInformationRequestV04;
			owner_lazy = () -> AccountHoldingInformationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(AccountHoldingInformationRequestV05 obj) throws Exception {
			check_sese_AccountHoldingInformationRequestV05(obj);
		}
	};

	/**
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present, then
	 * ClientAccount\Designation is not allowed.
	 * 
	 * If ProductTransfer\Portfolio is present, then ClientAccount\Designation
	 * is allowed.
	 */
	public static void check_sese_RequestForPEPOrISAOrPortfolioInformationV01(RequestForPEPOrISAOrPortfolioInformationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA is present, then
	 * TransferorAccount\Designation is not allowed.<br>
	 * <br>
	 * If ProductTransfer\Portfolio\Portfolio is present, then
	 * TransferorAccount\Designation is allowed.
	 */
	public static void checkISATransfer10(ISATransfer10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed.<br>
	 * If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.
	 */
	public static void checkISATransfer24(ISATransfer24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA is present, then
	 * TransferorAccount\Designation is not allowed.<br>
	 * <br>
	 * If ProductTransfer\Portfolio\Portfolio is present, then
	 * TransferorAccount\Designation is allowed.
	 */
	public static void checkISATransfer7(ISATransfer7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed.<br>
	 * <br>
	 * If ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.<br>
	 */
	public static void check_sese_AccountHoldingInformationRequestV04(AccountHoldingInformationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA is present, then
	 * TransferorAccount\Designation is not allowed.<br>
	 * <br>
	 * If ProductTransfer\Portfolio\Portfolio is present, then
	 * TransferorAccount\Designation is allowed.
	 */
	public static void checkISATransfer4(ISATransfer4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present, then
	 * ClientAccount\Designation is not allowed.
	 * 
	 * If ProductTransfer\Portfolio is present, then ClientAccount\Designation
	 * is allowed.
	 */
	public static void check_sese_PEPOrISAOrPortfolioTransferInstructionV02(PEPOrISAOrPortfolioTransferInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA is present, then
	 * TransferorAccount\Designation is not allowed.<br>
	 * <br>
	 * If ProductTransfer\Portfolio\Portfolio is present, then
	 * TransferorAccount\Designation is allowed.
	 */
	public static void checkISATransfer9(ISATransfer9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed. If
	 * ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.
	 */
	public static void check_sese_PortfolioTransferConfirmationV05(PortfolioTransferConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed. If any occurrence of
	 * ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.
	 */
	public static void check_sese_PortfolioTransferInstructionV06(PortfolioTransferInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed. <br>
	 * If ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.<br>
	 */
	public static void check_sese_AccountHoldingInformationV05(AccountHoldingInformationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA is present, then
	 * TransferorAccount\Designation is not allowed.<br>
	 * <br>
	 * If ProductTransfer\Portfolio\Portfolio is present, then
	 * TransferorAccount\Designation is allowed.
	 */
	public static void checkISATransfer5(ISATransfer5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed.<br>
	 * If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.
	 */
	public static void checkISATransfer19(ISATransfer19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed. If any occurrence of
	 * ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.
	 */
	public static void check_sese_PortfolioTransferConfirmationV07(PortfolioTransferConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed. If any occurrence of
	 * ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.
	 */
	public static void check_sese_PortfolioTransferInstructionV07(PortfolioTransferInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed.<br>
	 * <br>
	 * If ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.<br>
	 */
	public static void checkISATransfer12(ISATransfer12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA is present, then
	 * TransferorAccount\Designation is not allowed.<br>
	 * <br>
	 * If ProductTransfer\Portfolio\Portfolio is present, then
	 * TransferorAccount\Designation is allowed.
	 */
	public static void checkISATransfer1(ISATransfer1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present, then
	 * ClientAccount\Designation is not allowed.
	 * 
	 * If ProductTransfer\Portfolio is present, then ClientAccount\Designation
	 * is allowed.
	 */
	public static void checkPEPISATransfer7(PEPISATransfer7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA is present, then
	 * TransferorAccount\Designation is not allowed.<br>
	 * <br>
	 * If ProductTransfer\Portfolio\Portfolio is present, then
	 * TransferorAccount\Designation is allowed.
	 */
	public static void checkISATransfer2(ISATransfer2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed.<br>
	 * <br>
	 * If ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.<br>
	 */
	public static void check_sese_AccountHoldingInformationRequestV03(AccountHoldingInformationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed. If
	 * ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.
	 */
	public static void check_sese_PortfolioTransferInstructionV05(PortfolioTransferInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present, then
	 * ClientAccount\Designation is not allowed.
	 * 
	 * If ProductTransfer\Portfolio is present, then ClientAccount\Designation
	 * is allowed.
	 */
	public static void check_sese_PEPOrISAOrPortfolioInformationV01(PEPOrISAOrPortfolioInformationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA is present, then
	 * TransferorAccount\Designation is not allowed.<br>
	 * <br>
	 * If ProductTransfer\Portfolio\Portfolio is present, then
	 * TransferorAccount\Designation is allowed.
	 */
	public static void checkISATransfer6(ISATransfer6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed. <br>
	 * If ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.<br>
	 */
	public static void check_sese_AccountHoldingInformationV04(AccountHoldingInformationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\Portfolio\ISA is present, then
	 * TransferorAccount\Designation is not allowed.<br>
	 * <br>
	 * If ProductTransfer\Portfolio\Portfolio is present, then
	 * TransferorAccount\Designation is allowed.
	 */
	public static void checkPEPISATransfer11(PEPISATransfer11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed. If any occurrence of
	 * ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.
	 */
	public static void check_sese_PortfolioTransferConfirmationV08(PortfolioTransferConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present, then
	 * ClientAccount\Designation is not allowed.
	 * 
	 * If ProductTransfer\Portfolio is present, then ClientAccount\Designation
	 * is allowed.
	 */
	public static void check_sese_PEPOrISAOrPortfolioTransferConfirmationV02(PEPOrISAOrPortfolioTransferConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed. If any occurrence of
	 * ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.
	 */
	public static void check_sese_PortfolioTransferConfirmationV06(PortfolioTransferConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed. <br>
	 * If ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.<br>
	 */
	public static void check_sese_AccountHoldingInformationV06(AccountHoldingInformationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed. If any occurrence of
	 * ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.
	 */
	public static void check_sese_PortfolioTransferInstructionV08(PortfolioTransferInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed.<br>
	 * <br>
	 * If ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.<br>
	 */
	public static void check_sese_AccountHoldingInformationRequestV05(AccountHoldingInformationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}