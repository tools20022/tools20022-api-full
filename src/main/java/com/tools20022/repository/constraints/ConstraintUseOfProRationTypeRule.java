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
import com.tools20022.repository.msg.OptionFeaturesFormat8SD1;

/**
 * ProRationType should only be used when the corporate action event type code
 * is TEND or BIDS.
 */
public class ConstraintUseOfProRationTypeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OptionFeaturesFormat8SD1
	 * OptionFeaturesFormat8SD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UseOfProRationTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ProRationType should only be used when the corporate action event type code is TEND or BIDS."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OptionFeaturesFormat8SD1> forOptionFeaturesFormat8SD1 = new MMConstraint<OptionFeaturesFormat8SD1>() {
		{
			validator = ConstraintUseOfProRationTypeRule::checkOptionFeaturesFormat8SD1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UseOfProRationTypeRule";
			definition = "ProRationType should only be used when the corporate action event type code is TEND or BIDS.";
			owner_lazy = () -> OptionFeaturesFormat8SD1.mmObject();
		}
	};

	/**
	 * ProRationType should only be used when the corporate action event type
	 * code is TEND or BIDS.
	 */
	public static void checkOptionFeaturesFormat8SD1(OptionFeaturesFormat8SD1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}