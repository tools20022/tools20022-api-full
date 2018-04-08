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
import com.tools20022.repository.msg.DeliveringPartiesAndAccount1;
import com.tools20022.repository.msg.DeliveringPartiesAndAccount4;
import com.tools20022.repository.msg.ReceivingPartiesAndAccount1;
import com.tools20022.repository.msg.ReceivingPartiesAndAccount4;

/**
 * PlaceOfSettlementDetails/AccountIdentification is not allowed.
 */
public class ConstraintSettlementPlaceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount1
	 * DeliveringPartiesAndAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PlaceOfSettlementDetails/AccountIdentification is not allowed."</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount1> forDeliveringPartiesAndAccount1 = new MMConstraint<DeliveringPartiesAndAccount1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPlaceRule";
			definition = "PlaceOfSettlementDetails/AccountIdentification is not allowed.";
			owner_lazy = () -> DeliveringPartiesAndAccount1.mmObject();
		}

		@Override
		public void executeValidator(DeliveringPartiesAndAccount1 obj) throws Exception {
			checkDeliveringPartiesAndAccount1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount4
	 * ReceivingPartiesAndAccount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PlaceOfSettlementDetails/AccountIdentification is not allowed."</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount4> forReceivingPartiesAndAccount4 = new MMConstraint<ReceivingPartiesAndAccount4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPlaceRule";
			definition = "PlaceOfSettlementDetails/AccountIdentification is not allowed.";
			owner_lazy = () -> ReceivingPartiesAndAccount4.mmObject();
		}

		@Override
		public void executeValidator(ReceivingPartiesAndAccount4 obj) throws Exception {
			checkReceivingPartiesAndAccount4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1
	 * ReceivingPartiesAndAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PlaceOfSettlementDetails/AccountIdentification is not allowed."</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount1> forReceivingPartiesAndAccount1 = new MMConstraint<ReceivingPartiesAndAccount1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPlaceRule";
			definition = "PlaceOfSettlementDetails/AccountIdentification is not allowed.";
			owner_lazy = () -> ReceivingPartiesAndAccount1.mmObject();
		}

		@Override
		public void executeValidator(ReceivingPartiesAndAccount1 obj) throws Exception {
			checkReceivingPartiesAndAccount1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount4
	 * DeliveringPartiesAndAccount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PlaceOfSettlementDetails/AccountIdentification is not allowed."</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount4> forDeliveringPartiesAndAccount4 = new MMConstraint<DeliveringPartiesAndAccount4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPlaceRule";
			definition = "PlaceOfSettlementDetails/AccountIdentification is not allowed.";
			owner_lazy = () -> DeliveringPartiesAndAccount4.mmObject();
		}

		@Override
		public void executeValidator(DeliveringPartiesAndAccount4 obj) throws Exception {
			checkDeliveringPartiesAndAccount4(obj);
		}
	};

	/**
	 * PlaceOfSettlementDetails/AccountIdentification is not allowed.
	 */
	public static void checkDeliveringPartiesAndAccount1(DeliveringPartiesAndAccount1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PlaceOfSettlementDetails/AccountIdentification is not allowed.
	 */
	public static void checkReceivingPartiesAndAccount4(ReceivingPartiesAndAccount4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PlaceOfSettlementDetails/AccountIdentification is not allowed.
	 */
	public static void checkReceivingPartiesAndAccount1(ReceivingPartiesAndAccount1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * PlaceOfSettlementDetails/AccountIdentification is not allowed.
	 */
	public static void checkDeliveringPartiesAndAccount4(DeliveringPartiesAndAccount4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}