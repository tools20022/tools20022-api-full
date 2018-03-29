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
import com.tools20022.repository.choice.InstructedOrQuantityToReceive1Choice;
import com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice;

/**
 * InstructedQuantity must be provided unless QuantityToReceive is requested in
 * the related CorporateActionNotification message, eg, for event types Priority
 * Issue (PRIO) and Dividend Reinvestment (DRIP).
 */
public class ConstraintInstructedQuantityRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive1Choice
	 * InstructedOrQuantityToReceive1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InstructedQuantity must be provided unless QuantityToReceive is requested in the related CorporateActionNotification message, eg, for event types Priority Issue (PRIO) and Dividend Reinvestment (DRIP)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InstructedOrQuantityToReceive1Choice> forInstructedOrQuantityToReceive1Choice = new MMConstraint<InstructedOrQuantityToReceive1Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedQuantityRule";
			definition = "InstructedQuantity must be provided unless QuantityToReceive is requested in the related CorporateActionNotification message, eg, for event types Priority Issue (PRIO) and Dividend Reinvestment (DRIP).";
			owner_lazy = () -> InstructedOrQuantityToReceive1Choice.mmObject();
		}

		@Override
		public void executeValidator(InstructedOrQuantityToReceive1Choice obj) throws Exception {
			checkInstructedOrQuantityToReceive1Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice
	 * InstructedOrQuantityToReceive2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InstructedQuantity must be provided unless QuantityToReceive is requested in the related CorporateActionNotification message, eg, for event types Priority Issue (PRIO) and Dividend Reinvestment (DRIP)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InstructedOrQuantityToReceive2Choice> forInstructedOrQuantityToReceive2Choice = new MMConstraint<InstructedOrQuantityToReceive2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedQuantityRule";
			definition = "InstructedQuantity must be provided unless QuantityToReceive is requested in the related CorporateActionNotification message, eg, for event types Priority Issue (PRIO) and Dividend Reinvestment (DRIP).";
			owner_lazy = () -> InstructedOrQuantityToReceive2Choice.mmObject();
		}

		@Override
		public void executeValidator(InstructedOrQuantityToReceive2Choice obj) throws Exception {
			checkInstructedOrQuantityToReceive2Choice(obj);
		}
	};

	/**
	 * InstructedQuantity must be provided unless QuantityToReceive is requested
	 * in the related CorporateActionNotification message, eg, for event types
	 * Priority Issue (PRIO) and Dividend Reinvestment (DRIP).
	 */
	public static void checkInstructedOrQuantityToReceive1Choice(InstructedOrQuantityToReceive1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * InstructedQuantity must be provided unless QuantityToReceive is requested
	 * in the related CorporateActionNotification message, eg, for event types
	 * Priority Issue (PRIO) and Dividend Reinvestment (DRIP).
	 */
	public static void checkInstructedOrQuantityToReceive2Choice(InstructedOrQuantityToReceive2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}