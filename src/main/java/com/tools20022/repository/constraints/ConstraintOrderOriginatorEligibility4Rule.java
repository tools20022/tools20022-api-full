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
import com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01;
import com.tools20022.repository.area.setr.SwitchOrderConfirmationV03;
import com.tools20022.repository.area.setr.SwitchOrderV03;
import com.tools20022.repository.msg.SwitchOrderConfirmation1;
import com.tools20022.repository.msg.SwitchOrderInstruction2;

/**
 * Either
 * SwitchExecutionDetails/InvestmentAccountDetails/OrderOriginatorEligibility or
 * (one or more instances of
 * SwitchExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility) may be
 * present, but not both.
 */
public class ConstraintOrderOriginatorEligibility4Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03
	 * SwitchOrderConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either SwitchExecutionDetails/InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of SwitchExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility) may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmationV03> for_setr_SwitchOrderConfirmationV03 = new MMConstraint<SwitchOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility4Rule";
			definition = "Either SwitchExecutionDetails/InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of SwitchExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility) may be present, but not both.";
			owner_lazy = () -> SwitchOrderConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderConfirmationV03 obj) throws Exception {
			check_setr_SwitchOrderConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderInstruction2
	 * SwitchOrderInstruction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either SwitchOrderDetails/InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of SwitchOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility) may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderInstruction2> forSwitchOrderInstruction2 = new MMConstraint<SwitchOrderInstruction2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility4Rule";
			definition = "Either SwitchOrderDetails/InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of SwitchOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility) may be present, but not both.";
			owner_lazy = () -> SwitchOrderInstruction2.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderInstruction2 obj) throws Exception {
			checkSwitchOrderInstruction2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01
	 * SwitchOrderConfirmationAmendmentV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either SwitchExecutionDetails/InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of SwitchExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility) may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmationAmendmentV01> for_setr_SwitchOrderConfirmationAmendmentV01 = new MMConstraint<SwitchOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility4Rule";
			definition = "Either SwitchExecutionDetails/InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of SwitchExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility) may be present, but not both.";
			owner_lazy = () -> SwitchOrderConfirmationAmendmentV01.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderConfirmationAmendmentV01 obj) throws Exception {
			check_setr_SwitchOrderConfirmationAmendmentV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03
	 * SwitchOrderV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either SwitchOrderDetails/InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of SwitchOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility) may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderV03> for_setr_SwitchOrderV03 = new MMConstraint<SwitchOrderV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility4Rule";
			definition = "Either SwitchOrderDetails/InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of SwitchOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility) may be present, but not both.";
			owner_lazy = () -> SwitchOrderV03.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderV03 obj) throws Exception {
			check_setr_SwitchOrderV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderConfirmation1
	 * SwitchOrderConfirmation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either SwitchExecutionDetails/InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of SwitchExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility) may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmation1> forSwitchOrderConfirmation1 = new MMConstraint<SwitchOrderConfirmation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility4Rule";
			definition = "Either SwitchExecutionDetails/InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of SwitchExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility) may be present, but not both.";
			owner_lazy = () -> SwitchOrderConfirmation1.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderConfirmation1 obj) throws Exception {
			checkSwitchOrderConfirmation1(obj);
		}
	};

	/**
	 * Either SwitchExecutionDetails/InvestmentAccountDetails/
	 * OrderOriginatorEligibility or (one or more instances of
	 * SwitchExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility)
	 * may be present, but not both.
	 */
	public static void check_setr_SwitchOrderConfirmationV03(SwitchOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either
	 * SwitchOrderDetails/InvestmentAccountDetails/OrderOriginatorEligibility or
	 * (one or more instances of
	 * SwitchOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility) may be
	 * present, but not both.
	 */
	public static void checkSwitchOrderInstruction2(SwitchOrderInstruction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either SwitchExecutionDetails/InvestmentAccountDetails/
	 * OrderOriginatorEligibility or (one or more instances of
	 * SwitchExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility)
	 * may be present, but not both.
	 */
	public static void check_setr_SwitchOrderConfirmationAmendmentV01(SwitchOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either
	 * SwitchOrderDetails/InvestmentAccountDetails/OrderOriginatorEligibility or
	 * (one or more instances of
	 * SwitchOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility) may be
	 * present, but not both.
	 */
	public static void check_setr_SwitchOrderV03(SwitchOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either SwitchExecutionDetails/InvestmentAccountDetails/
	 * OrderOriginatorEligibility or (one or more instances of
	 * SwitchExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility)
	 * may be present, but not both.
	 */
	public static void checkSwitchOrderConfirmation1(SwitchOrderConfirmation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}