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
import com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01;
import com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02;
import com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02;
import com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01;
import com.tools20022.repository.msg.PEPISATransfer7;

/**
 * If ProductTransfer\ISA or ProductTransfer\PEP is present, then
 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed.
 * 
 * If ProductTransfer\ISA or ProductTransfer\PEP is present then the message
 * elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor,
 * OtherCorporateInvestor) are not allowed.
 */
public class ConstraintPEPISARule {

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
	 * name} = "PEPISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed.\n\nIf ProductTransfer\\ISA or ProductTransfer\\PEP is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestForPEPOrISAOrPortfolioInformationV01> for_sese_RequestForPEPOrISAOrPortfolioInformationV01 = new MMConstraint<RequestForPEPOrISAOrPortfolioInformationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PEPISARule";
			definition = "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed.\n\nIf ProductTransfer\\ISA or ProductTransfer\\PEP is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
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
	 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02
	 * PEPOrISAOrPortfolioTransferInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PEPISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed.\n\nIf ProductTransfer\\ISA or ProductTransfer\\PEP is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioTransferInstructionV02> for_sese_PEPOrISAOrPortfolioTransferInstructionV02 = new MMConstraint<PEPOrISAOrPortfolioTransferInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PEPISARule";
			definition = "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed.\n\nIf ProductTransfer\\ISA or ProductTransfer\\PEP is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
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
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7
	 * PEPISATransfer7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PEPISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed.\n\nIf ProductTransfer\\ISA or ProductTransfer\\PEP is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPISATransfer7> forPEPISATransfer7 = new MMConstraint<PEPISATransfer7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PEPISARule";
			definition = "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed.\n\nIf ProductTransfer\\ISA or ProductTransfer\\PEP is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
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
	 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01
	 * PEPOrISAOrPortfolioInformationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PEPISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed.\n\nIf ProductTransfer\\ISA or ProductTransfer\\PEP is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioInformationV01> for_sese_PEPOrISAOrPortfolioInformationV01 = new MMConstraint<PEPOrISAOrPortfolioInformationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PEPISARule";
			definition = "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed.\n\nIf ProductTransfer\\ISA or ProductTransfer\\PEP is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
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
	 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02
	 * PEPOrISAOrPortfolioTransferConfirmationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PEPISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed.\n\nIf ProductTransfer\\ISA or ProductTransfer\\PEP is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPOrISAOrPortfolioTransferConfirmationV02> for_sese_PEPOrISAOrPortfolioTransferConfirmationV02 = new MMConstraint<PEPOrISAOrPortfolioTransferConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PEPISARule";
			definition = "If ProductTransfer\\ISA or ProductTransfer\\PEP is present, then SecondaryIndividualInvestor and/or OtherIndividualInvestor is not allowed.\n\nIf ProductTransfer\\ISA or ProductTransfer\\PEP is present then the message elements in the list (PrimaryCorporateInvestor, SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.";
			owner_lazy = () -> PEPOrISAOrPortfolioTransferConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(PEPOrISAOrPortfolioTransferConfirmationV02 obj) throws Exception {
			check_sese_PEPOrISAOrPortfolioTransferConfirmationV02(obj);
		}
	};

	/**
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed.
	 * 
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present then the message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.
	 */
	public static void check_sese_RequestForPEPOrISAOrPortfolioInformationV01(RequestForPEPOrISAOrPortfolioInformationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed.
	 * 
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present then the message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.
	 */
	public static void check_sese_PEPOrISAOrPortfolioTransferInstructionV02(PEPOrISAOrPortfolioTransferInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed.
	 * 
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present then the message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.
	 */
	public static void checkPEPISATransfer7(PEPISATransfer7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed.
	 * 
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present then the message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.
	 */
	public static void check_sese_PEPOrISAOrPortfolioInformationV01(PEPOrISAOrPortfolioInformationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present, then
	 * SecondaryIndividualInvestor and/or OtherIndividualInvestor is not
	 * allowed.
	 * 
	 * If ProductTransfer\ISA or ProductTransfer\PEP is present then the message
	 * elements in the list (PrimaryCorporateInvestor,
	 * SecondaryCorporateInvestor, OtherCorporateInvestor) are not allowed.
	 */
	public static void check_sese_PEPOrISAOrPortfolioTransferConfirmationV02(PEPOrISAOrPortfolioTransferConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}