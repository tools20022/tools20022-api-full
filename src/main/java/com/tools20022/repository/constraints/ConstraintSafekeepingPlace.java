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
import com.tools20022.repository.msg.CorporateActionOption8;

/**
 * The SafekeepingPlace is only to be used by global custodians that allow their
 * clients to specify where the securities are to be held, eg, in an ICSD
 * account versus an account at the local CSD.
 */
public class ConstraintSafekeepingPlace {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8
	 * CorporateActionOption8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption8> forCorporateActionOption8 = new MMConstraint<CorporateActionOption8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> CorporateActionOption8.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption8 obj) throws Exception {
			checkCorporateActionOption8(obj);
		}
	};

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkCorporateActionOption8(CorporateActionOption8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}