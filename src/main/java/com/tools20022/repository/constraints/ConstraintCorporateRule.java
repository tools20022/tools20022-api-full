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
 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may
 * be present. If PrimaryCorporateInvestor is not present, then
 * SecondaryCorporateInvestor is not allowed.
 * 
 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be
 * present. If PrimaryCorporateInvestor is not present, then
 * OtherCorporateInvestor is not allowed.
 */
public class ConstraintCorporateRule {

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
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferConfirmationV05
	 * ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV04> for_sese_PortfolioTransferConfirmationV04 = new MMConstraint<PortfolioTransferConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV05);
			owner_lazy = () -> PortfolioTransferConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferConfirmationV04 obj) throws Exception {
			check_sese_PortfolioTransferConfirmationV04(obj);
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
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestForPEPOrISAOrPortfolioInformationV01> for_sese_RequestForPEPOrISAOrPortfolioInformationV01 = new MMConstraint<RequestForPEPOrISAOrPortfolioInformationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03
	 * PortfolioTransferConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV03> for_sese_PortfolioTransferConfirmationV03 = new MMConstraint<PortfolioTransferConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			owner_lazy = () -> PortfolioTransferConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferConfirmationV03 obj) throws Exception {
			check_sese_PortfolioTransferConfirmationV03(obj);
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
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_AccountHoldingInformationV04
	 * ConstraintCorporateRule.for_sese_AccountHoldingInformationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV03> for_sese_AccountHoldingInformationV03 = new MMConstraint<AccountHoldingInformationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_AccountHoldingInformationV04);
			owner_lazy = () -> AccountHoldingInformationV03.mmObject();
		}

		@Override
		public void executeValidator(AccountHoldingInformationV03 obj) throws Exception {
			check_sese_AccountHoldingInformationV03(obj);
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
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#forISATransfer19
	 * ConstraintCorporateRule.forISATransfer19}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer24> forISATransfer24 = new MMConstraint<ISATransfer24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.forISATransfer19;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_AccountHoldingInformationRequestV05
	 * ConstraintCorporateRule.for_sese_AccountHoldingInformationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_AccountHoldingInformationRequestV03
	 * ConstraintCorporateRule.for_sese_AccountHoldingInformationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV04> for_sese_AccountHoldingInformationRequestV04 = new MMConstraint<AccountHoldingInformationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_AccountHoldingInformationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_AccountHoldingInformationRequestV03;
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
	 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02
	 * PEPOrISAOrPortfolioTransferInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioTransferInstructionV02> for_sese_PEPOrISAOrPortfolioTransferInstructionV02 = new MMConstraint<PEPOrISAOrPortfolioTransferInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#forISATransfer12
	 * ConstraintCorporateRule.forISATransfer12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer9> forISATransfer9 = new MMConstraint<ISATransfer9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.forISATransfer12);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferConfirmationV06
	 * ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferConfirmationV04
	 * ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV05> for_sese_PortfolioTransferConfirmationV05 = new MMConstraint<PortfolioTransferConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV04;
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04
	 * PortfolioTransferInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferInstructionV05
	 * ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV04> for_sese_PortfolioTransferInstructionV04 = new MMConstraint<PortfolioTransferInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV05);
			owner_lazy = () -> PortfolioTransferInstructionV04.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferInstructionV04 obj) throws Exception {
			check_sese_PortfolioTransferInstructionV04(obj);
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
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferInstructionV07
	 * ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferInstructionV05
	 * ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV06> for_sese_PortfolioTransferInstructionV06 = new MMConstraint<PortfolioTransferInstructionV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV05;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_AccountHoldingInformationV06
	 * ConstraintCorporateRule.for_sese_AccountHoldingInformationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_AccountHoldingInformationV04
	 * ConstraintCorporateRule.for_sese_AccountHoldingInformationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV05> for_sese_AccountHoldingInformationV05 = new MMConstraint<AccountHoldingInformationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_AccountHoldingInformationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_AccountHoldingInformationV04;
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19 ISATransfer19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#forISATransfer24
	 * ConstraintCorporateRule.forISATransfer24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#forISATransfer12
	 * ConstraintCorporateRule.forISATransfer12}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer19> forISATransfer19 = new MMConstraint<ISATransfer19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.forISATransfer24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.forISATransfer12;
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03
	 * PortfolioTransferInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV03> for_sese_PortfolioTransferInstructionV03 = new MMConstraint<PortfolioTransferInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			owner_lazy = () -> PortfolioTransferInstructionV03.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferInstructionV03 obj) throws Exception {
			check_sese_PortfolioTransferInstructionV03(obj);
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
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferConfirmationV08
	 * ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferConfirmationV06
	 * ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV07> for_sese_PortfolioTransferConfirmationV07 = new MMConstraint<PortfolioTransferConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV06;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferInstructionV08
	 * ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferInstructionV06
	 * ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV07> for_sese_PortfolioTransferInstructionV07 = new MMConstraint<PortfolioTransferInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV06;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#forISATransfer19
	 * ConstraintCorporateRule.forISATransfer19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#forISATransfer9
	 * ConstraintCorporateRule.forISATransfer9}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISATransfer12> forISATransfer12 = new MMConstraint<ISATransfer12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.forISATransfer19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.forISATransfer9;
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
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7
	 * PEPISATransfer7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPISATransfer7> forPEPISATransfer7 = new MMConstraint<PEPISATransfer7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
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
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03
	 * AccountHoldingInformationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_AccountHoldingInformationRequestV04
	 * ConstraintCorporateRule.for_sese_AccountHoldingInformationRequestV04}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_AccountHoldingInformationRequestV02
	 * ConstraintCorporateRule.for_sese_AccountHoldingInformationRequestV02}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV03> for_sese_AccountHoldingInformationRequestV03 = new MMConstraint<AccountHoldingInformationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_AccountHoldingInformationRequestV04);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_AccountHoldingInformationRequestV02;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferInstructionV06
	 * ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferInstructionV04
	 * ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV05> for_sese_PortfolioTransferInstructionV05 = new MMConstraint<PortfolioTransferInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV04;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioInformationV01> for_sese_PEPOrISAOrPortfolioInformationV01 = new MMConstraint<PEPOrISAOrPortfolioInformationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
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
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04
	 * AccountHoldingInformationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_AccountHoldingInformationV05
	 * ConstraintCorporateRule.for_sese_AccountHoldingInformationV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_AccountHoldingInformationV03
	 * ConstraintCorporateRule.for_sese_AccountHoldingInformationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV04> for_sese_AccountHoldingInformationV04 = new MMConstraint<AccountHoldingInformationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_AccountHoldingInformationV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_AccountHoldingInformationV03;
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
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02
	 * AccountHoldingInformationRequestV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_AccountHoldingInformationRequestV03
	 * ConstraintCorporateRule.for_sese_AccountHoldingInformationRequestV03}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV02> for_sese_AccountHoldingInformationRequestV02 = new MMConstraint<AccountHoldingInformationRequestV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_AccountHoldingInformationRequestV03);
			owner_lazy = () -> AccountHoldingInformationRequestV02.mmObject();
		}

		@Override
		public void executeValidator(AccountHoldingInformationRequestV02 obj) throws Exception {
			check_sese_AccountHoldingInformationRequestV02(obj);
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
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPISATransfer11> forPEPISATransfer11 = new MMConstraint<PEPISATransfer11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferConfirmationV07
	 * ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV08> for_sese_PortfolioTransferConfirmationV08 = new MMConstraint<PortfolioTransferConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV07;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioTransferConfirmationV02> for_sese_PEPOrISAOrPortfolioTransferConfirmationV02 = new MMConstraint<PEPOrISAOrPortfolioTransferConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferConfirmationV07
	 * ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferConfirmationV05
	 * ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV06> for_sese_PortfolioTransferConfirmationV06 = new MMConstraint<PortfolioTransferConfirmationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV05;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_AccountHoldingInformationV05
	 * ConstraintCorporateRule.for_sese_AccountHoldingInformationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV06> for_sese_AccountHoldingInformationV06 = new MMConstraint<AccountHoldingInformationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_AccountHoldingInformationV05;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferInstructionV07
	 * ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV08> for_sese_PortfolioTransferInstructionV08 = new MMConstraint<PortfolioTransferInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\r\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV07;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_AccountHoldingInformationRequestV04
	 * ConstraintCorporateRule.for_sese_AccountHoldingInformationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV05> for_sese_AccountHoldingInformationRequestV05 = new MMConstraint<AccountHoldingInformationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_AccountHoldingInformationRequestV04;
			owner_lazy = () -> AccountHoldingInformationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(AccountHoldingInformationRequestV05 obj) throws Exception {
			check_sese_AccountHoldingInformationRequestV05(obj);
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
	 * name} = "CorporateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV02> for_sese_AccountHoldingInformationV02 = new MMConstraint<AccountHoldingInformationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRule";
			definition = "If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then SecondaryCorporateInvestor is not allowed.\n\nIf PrimaryCorporateInvestor is present, then OtherCorporateInvestor may be present. If PrimaryCorporateInvestor is not present, then OtherCorporateInvestor is not allowed.";
			owner_lazy = () -> AccountHoldingInformationV02.mmObject();
		}

		@Override
		public void executeValidator(AccountHoldingInformationV02 obj) throws Exception {
			check_sese_AccountHoldingInformationV02(obj);
		}
	};

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PortfolioTransferConfirmationV04(PortfolioTransferConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_RequestForPEPOrISAOrPortfolioInformationV01(RequestForPEPOrISAOrPortfolioInformationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PortfolioTransferConfirmationV03(PortfolioTransferConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_AccountHoldingInformationV03(AccountHoldingInformationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.<br>
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void checkISATransfer24(ISATransfer24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_AccountHoldingInformationRequestV04(AccountHoldingInformationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PEPOrISAOrPortfolioTransferInstructionV02(PEPOrISAOrPortfolioTransferInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void checkISATransfer9(ISATransfer9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PortfolioTransferConfirmationV05(PortfolioTransferConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PortfolioTransferInstructionV04(PortfolioTransferInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.<br>
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PortfolioTransferInstructionV06(PortfolioTransferInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_AccountHoldingInformationV05(AccountHoldingInformationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.<br>
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void checkISATransfer19(ISATransfer19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PortfolioTransferInstructionV03(PortfolioTransferInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.<br>
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PortfolioTransferConfirmationV07(PortfolioTransferConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.<br>
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PortfolioTransferInstructionV07(PortfolioTransferInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void checkISATransfer12(ISATransfer12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void checkPEPISATransfer7(PEPISATransfer7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_AccountHoldingInformationRequestV03(AccountHoldingInformationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PortfolioTransferInstructionV05(PortfolioTransferInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PEPOrISAOrPortfolioInformationV01(PEPOrISAOrPortfolioInformationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_AccountHoldingInformationV04(AccountHoldingInformationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_AccountHoldingInformationRequestV02(AccountHoldingInformationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void checkPEPISATransfer11(PEPISATransfer11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.<br>
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PortfolioTransferConfirmationV08(PortfolioTransferConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PEPOrISAOrPortfolioTransferConfirmationV02(PEPOrISAOrPortfolioTransferConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.<br>
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PortfolioTransferConfirmationV06(PortfolioTransferConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_AccountHoldingInformationV06(AccountHoldingInformationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.<br>
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_PortfolioTransferInstructionV08(PortfolioTransferInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_AccountHoldingInformationRequestV05(AccountHoldingInformationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryCorporateInvestor is present, then SecondaryCorporateInvestor
	 * may be present. If PrimaryCorporateInvestor is not present, then
	 * SecondaryCorporateInvestor is not allowed.
	 * 
	 * If PrimaryCorporateInvestor is present, then OtherCorporateInvestor may
	 * be present. If PrimaryCorporateInvestor is not present, then
	 * OtherCorporateInvestor is not allowed.
	 */
	public static void check_sese_AccountHoldingInformationV02(AccountHoldingInformationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}