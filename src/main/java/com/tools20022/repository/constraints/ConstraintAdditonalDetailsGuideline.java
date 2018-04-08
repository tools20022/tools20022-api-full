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
import com.tools20022.repository.msg.PartyTextInformation1;
import com.tools20022.repository.msg.PartyTextInformation3;
import com.tools20022.repository.msg.PartyTextInformation5;

/**
 * Unless bilaterally agreed between the Sender and Receiver,
 * DeclarationlDetails, RegistrationDetails and PartyContactDetails must not
 * contain information that can be provided in a structured field.
 */
public class ConstraintAdditonalDetailsGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation3
	 * PartyTextInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditonalDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, DeclarationlDetails, RegistrationDetails and PartyContactDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyTextInformation3> forPartyTextInformation3 = new MMConstraint<PartyTextInformation3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditonalDetailsGuideline";
			definition = "Unless bilaterally agreed between the Sender and Receiver, DeclarationlDetails, RegistrationDetails and PartyContactDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> PartyTextInformation3.mmObject();
		}

		@Override
		public void executeValidator(PartyTextInformation3 obj) throws Exception {
			checkPartyTextInformation3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation5
	 * PartyTextInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditonalDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, DeclarationlDetails and PartyContactDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyTextInformation5> forPartyTextInformation5 = new MMConstraint<PartyTextInformation5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditonalDetailsGuideline";
			definition = "Unless bilaterally agreed between the Sender and Receiver, DeclarationlDetails and PartyContactDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> PartyTextInformation5.mmObject();
		}

		@Override
		public void executeValidator(PartyTextInformation5 obj) throws Exception {
			checkPartyTextInformation5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation1
	 * PartyTextInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditonalDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, DeclarationlDetails, RegistrationDetails and PartyContactDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyTextInformation1> forPartyTextInformation1 = new MMConstraint<PartyTextInformation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditonalDetailsGuideline";
			definition = "Unless bilaterally agreed between the Sender and Receiver, DeclarationlDetails, RegistrationDetails and PartyContactDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> PartyTextInformation1.mmObject();
		}

		@Override
		public void executeValidator(PartyTextInformation1 obj) throws Exception {
			checkPartyTextInformation1(obj);
		}
	};

	/**
	 * Unless bilaterally agreed between the Sender and Receiver,
	 * DeclarationlDetails, RegistrationDetails and PartyContactDetails must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkPartyTextInformation3(PartyTextInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver,
	 * DeclarationlDetails and PartyContactDetails must not contain information
	 * that can be provided in a structured field.
	 */
	public static void checkPartyTextInformation5(PartyTextInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver,
	 * DeclarationlDetails, RegistrationDetails and PartyContactDetails must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkPartyTextInformation1(PartyTextInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}