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
import com.tools20022.repository.msg.DeliveryParameters2;
import com.tools20022.repository.msg.DeliveryParameters4;

/**
 * If RegisteredAddressIndicator is "true" or "1" (Yes), then NameAndAddress is
 * not allowed. If RegisteredAddressIndicator is "false" or "0" (No), then
 * NameAndAddress must be present.
 */
public class ConstraintNameAndAddress1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveryParameters2
	 * DeliveryParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameAndAddress1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RegisteredAddressIndicator is \"true\" or \"1\" (Yes), then NameAndAddress is not allowed.\nIf RegisteredAddressIndicator is \"false\" or \"0\" (No), then NameAndAddress must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveryParameters2> forDeliveryParameters2 = new MMConstraint<DeliveryParameters2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress1Rule";
			definition = "If RegisteredAddressIndicator is \"true\" or \"1\" (Yes), then NameAndAddress is not allowed.\nIf RegisteredAddressIndicator is \"false\" or \"0\" (No), then NameAndAddress must be present.";
			owner_lazy = () -> DeliveryParameters2.mmObject();
		}

		@Override
		public void executeValidator(DeliveryParameters2 obj) throws Exception {
			checkDeliveryParameters2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveryParameters4
	 * DeliveryParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameAndAddress1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RegisteredAddressIndicator is \"true\" or \"1\" (Yes), then NameAndAddress is not allowed.\nIf RegisteredAddressIndicator is \"false\" or \"0\" (No), then NameAndAddress must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveryParameters4> forDeliveryParameters4 = new MMConstraint<DeliveryParameters4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress1Rule";
			definition = "If RegisteredAddressIndicator is \"true\" or \"1\" (Yes), then NameAndAddress is not allowed.\nIf RegisteredAddressIndicator is \"false\" or \"0\" (No), then NameAndAddress must be present.";
			owner_lazy = () -> DeliveryParameters4.mmObject();
		}

		@Override
		public void executeValidator(DeliveryParameters4 obj) throws Exception {
			checkDeliveryParameters4(obj);
		}
	};

	/**
	 * If RegisteredAddressIndicator is "true" or "1" (Yes), then NameAndAddress
	 * is not allowed. If RegisteredAddressIndicator is "false" or "0" (No),
	 * then NameAndAddress must be present.
	 */
	public static void checkDeliveryParameters2(DeliveryParameters2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RegisteredAddressIndicator is "true" or "1" (Yes), then NameAndAddress
	 * is not allowed. If RegisteredAddressIndicator is "false" or "0" (No),
	 * then NameAndAddress must be present.
	 */
	public static void checkDeliveryParameters4(DeliveryParameters4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}