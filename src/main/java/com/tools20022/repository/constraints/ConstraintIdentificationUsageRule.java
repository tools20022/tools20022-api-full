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
import com.tools20022.repository.msg.PartyIdentificationAndAccount79;
import com.tools20022.repository.msg.PartyIdentificationAndAccount9;

/**
 * The presence of Identification and/or CountryOfResidence is mandatory.
 */
public class ConstraintIdentificationUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79
	 * PartyIdentificationAndAccount79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The presence of Identification and/or CountryOfResidence is mandatory."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount79> forPartyIdentificationAndAccount79 = new MMConstraint<PartyIdentificationAndAccount79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationUsageRule";
			definition = "The presence of Identification and/or CountryOfResidence is mandatory.";
			owner_lazy = () -> PartyIdentificationAndAccount79.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount79 obj) throws Exception {
			checkPartyIdentificationAndAccount79(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount9
	 * PartyIdentificationAndAccount9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The presence of Identification and/or CountryOfResidence is mandatory."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount9> forPartyIdentificationAndAccount9 = new MMConstraint<PartyIdentificationAndAccount9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationUsageRule";
			definition = "The presence of Identification and/or CountryOfResidence is mandatory.";
			owner_lazy = () -> PartyIdentificationAndAccount9.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount9 obj) throws Exception {
			checkPartyIdentificationAndAccount9(obj);
		}
	};

	/**
	 * The presence of Identification and/or CountryOfResidence is mandatory.
	 */
	public static void checkPartyIdentificationAndAccount79(PartyIdentificationAndAccount79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The presence of Identification and/or CountryOfResidence is mandatory.
	 */
	public static void checkPartyIdentificationAndAccount9(PartyIdentificationAndAccount9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}