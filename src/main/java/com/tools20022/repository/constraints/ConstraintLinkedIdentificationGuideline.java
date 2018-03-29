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
import com.tools20022.repository.choice.IdentificationReference11Choice;
import com.tools20022.repository.choice.IdentificationReference8Choice;

/**
 * InstructingPartyTransactionIdentification,
 * ExecutingPartyTransactionIdentification,
 * MarketInfrastructureTransactionIdentification, ClientOrderLinkIdentification,
 * PoolIdentification, BlockIdentification, AllocationIdentification,
 * IndexIdentification, CommonIdentification and ComplianceIdentification must
 * not appear more than once in the message.
 */
public class ConstraintLinkedIdentificationGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice
	 * IdentificationReference8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InstructingPartyTransactionIdentification, ExecutingPartyTransactionIdentification, MarketInfrastructureTransactionIdentification, ClientOrderLinkIdentification, PoolIdentification, BlockIdentification, AllocationIdentification, IndexIdentification, CommonIdentification and ComplianceIdentification must not appear more than once in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IdentificationReference8Choice> forIdentificationReference8Choice = new MMConstraint<IdentificationReference8Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedIdentificationGuideline";
			definition = "InstructingPartyTransactionIdentification, ExecutingPartyTransactionIdentification, MarketInfrastructureTransactionIdentification, ClientOrderLinkIdentification, PoolIdentification, BlockIdentification, AllocationIdentification, IndexIdentification, CommonIdentification and ComplianceIdentification must not appear more than once in the message.";
			owner_lazy = () -> IdentificationReference8Choice.mmObject();
		}

		@Override
		public void executeValidator(IdentificationReference8Choice obj) throws Exception {
			checkIdentificationReference8Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InstructingPartyTransactionIdentification, ExecutingPartyTransactionIdentification, MarketInfrastructureTransactionIdentification, ClientOrderLinkIdentification, PoolIdentification, BlockIdentification, AllocationIdentification, IndexIdentification, CommonIdentification, ComplianceIdentification and CancellationRequestIdentification must not appear more than once in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IdentificationReference11Choice> forIdentificationReference11Choice = new MMConstraint<IdentificationReference11Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedIdentificationGuideline";
			definition = "InstructingPartyTransactionIdentification, ExecutingPartyTransactionIdentification, MarketInfrastructureTransactionIdentification, ClientOrderLinkIdentification, PoolIdentification, BlockIdentification, AllocationIdentification, IndexIdentification, CommonIdentification, ComplianceIdentification and CancellationRequestIdentification must not appear more than once in the message.";
			owner_lazy = () -> IdentificationReference11Choice.mmObject();
		}

		@Override
		public void executeValidator(IdentificationReference11Choice obj) throws Exception {
			checkIdentificationReference11Choice(obj);
		}
	};

	/**
	 * InstructingPartyTransactionIdentification,
	 * ExecutingPartyTransactionIdentification,
	 * MarketInfrastructureTransactionIdentification,
	 * ClientOrderLinkIdentification, PoolIdentification, BlockIdentification,
	 * AllocationIdentification, IndexIdentification, CommonIdentification and
	 * ComplianceIdentification must not appear more than once in the message.
	 */
	public static void checkIdentificationReference8Choice(IdentificationReference8Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * InstructingPartyTransactionIdentification,
	 * ExecutingPartyTransactionIdentification,
	 * MarketInfrastructureTransactionIdentification,
	 * ClientOrderLinkIdentification, PoolIdentification, BlockIdentification,
	 * AllocationIdentification, IndexIdentification, CommonIdentification,
	 * ComplianceIdentification and CancellationRequestIdentification must not
	 * appear more than once in the message.
	 */
	public static void checkIdentificationReference11Choice(IdentificationReference11Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}