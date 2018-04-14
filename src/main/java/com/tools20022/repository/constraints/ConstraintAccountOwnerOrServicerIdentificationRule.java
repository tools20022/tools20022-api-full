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
import com.tools20022.repository.msg.GenericIdentificationSD1;
import com.tools20022.repository.msg.MarketClaimDetailsSD1;

/**
 * At least one of the elements amongst AccountOwnerIdentification and
 * AccountServicerIdentification must be present, both may be present.
 */
public class ConstraintAccountOwnerOrServicerIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketClaimDetailsSD1
	 * MarketClaimDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerOrServicerIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one of the elements amongst AccountOwnerIdentification and AccountServicerIdentification must be present, both may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<MarketClaimDetailsSD1> forMarketClaimDetailsSD1 = new MMConstraint<MarketClaimDetailsSD1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerOrServicerIdentificationRule";
			definition = "At least one of the elements amongst AccountOwnerIdentification and AccountServicerIdentification must be present, both may be present.";
			owner_lazy = () -> MarketClaimDetailsSD1.mmObject();
		}

		@Override
		public void executeValidator(MarketClaimDetailsSD1 obj) throws Exception {
			checkMarketClaimDetailsSD1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentificationSD1
	 * GenericIdentificationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerOrServicerIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one of the elements amongst AccountOwnerIdentification and AccountServicerIdentification must be present, both may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<GenericIdentificationSD1> forGenericIdentificationSD1 = new MMConstraint<GenericIdentificationSD1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerOrServicerIdentificationRule";
			definition = "At least one of the elements amongst AccountOwnerIdentification and AccountServicerIdentification must be present, both may be present.";
			owner_lazy = () -> GenericIdentificationSD1.mmObject();
		}

		@Override
		public void executeValidator(GenericIdentificationSD1 obj) throws Exception {
			checkGenericIdentificationSD1(obj);
		}
	};

	/**
	 * At least one of the elements amongst AccountOwnerIdentification and
	 * AccountServicerIdentification must be present, both may be present.
	 */
	public static void checkMarketClaimDetailsSD1(MarketClaimDetailsSD1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one of the elements amongst AccountOwnerIdentification and
	 * AccountServicerIdentification must be present, both may be present.
	 */
	public static void checkGenericIdentificationSD1(GenericIdentificationSD1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}