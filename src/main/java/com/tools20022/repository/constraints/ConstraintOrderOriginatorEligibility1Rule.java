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
import com.tools20022.repository.msg.*;

/**
 * OrderOriginatorEligibility may only be present if Role is either UCL1 or
 * UCL2.
 */
public class ConstraintOrderOriginatorEligibility1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary8 Intermediary8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OrderOriginatorEligibility may only be present if Role is either UCL1 or UCL2."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Intermediary8> forIntermediary8 = new MMConstraint<Intermediary8>() {
		{
			validator = ConstraintOrderOriginatorEligibility1Rule::checkIntermediary8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility1Rule";
			definition = "OrderOriginatorEligibility may only be present if Role is either UCL1 or UCL2.";
			owner_lazy = () -> Intermediary8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary9 Intermediary9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OrderOriginatorEligibility may only be present if Role is either UCL1 or UCL2."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Intermediary9> forIntermediary9 = new MMConstraint<Intermediary9>() {
		{
			validator = ConstraintOrderOriginatorEligibility1Rule::checkIntermediary9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility1Rule";
			definition = "OrderOriginatorEligibility may only be present if Role is either UCL1 or UCL2.";
			owner_lazy = () -> Intermediary9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary29 Intermediary29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OrderOriginatorEligibility may only be present if Role is either UCL1 or UCL2."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Intermediary29> forIntermediary29 = new MMConstraint<Intermediary29>() {
		{
			validator = ConstraintOrderOriginatorEligibility1Rule::checkIntermediary29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility1Rule";
			definition = "OrderOriginatorEligibility may only be present if Role is either UCL1 or UCL2.";
			owner_lazy = () -> Intermediary29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary39 Intermediary39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OrderOriginatorEligibility may only be present if Role is either UCL1 (UnderlyingClient1) or UCL2 (UnderlyingClient2)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Intermediary39> forIntermediary39 = new MMConstraint<Intermediary39>() {
		{
			validator = ConstraintOrderOriginatorEligibility1Rule::checkIntermediary39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility1Rule";
			definition = "OrderOriginatorEligibility may only be present if Role is either UCL1 (UnderlyingClient1) or UCL2 (UnderlyingClient2).";
			owner_lazy = () -> Intermediary39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary40 Intermediary40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OrderOriginatorEligibility may only be present if Role is either UCL1 (UnderlyingClient1) or UCL2 (UnderlyingClient2)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Intermediary40> forIntermediary40 = new MMConstraint<Intermediary40>() {
		{
			validator = ConstraintOrderOriginatorEligibility1Rule::checkIntermediary40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility1Rule";
			definition = "OrderOriginatorEligibility may only be present if Role is either UCL1 (UnderlyingClient1) or UCL2 (UnderlyingClient2).";
			owner_lazy = () -> Intermediary40.mmObject();
		}
	};

	/**
	 * OrderOriginatorEligibility may only be present if Role is either UCL1 or
	 * UCL2.
	 */
	public static void checkIntermediary8(Intermediary8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OrderOriginatorEligibility may only be present if Role is either UCL1 or
	 * UCL2.
	 */
	public static void checkIntermediary9(Intermediary9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OrderOriginatorEligibility may only be present if Role is either UCL1 or
	 * UCL2.
	 */
	public static void checkIntermediary29(Intermediary29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OrderOriginatorEligibility may only be present if Role is either UCL1
	 * (UnderlyingClient1) or UCL2 (UnderlyingClient2).
	 */
	public static void checkIntermediary39(Intermediary39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OrderOriginatorEligibility may only be present if Role is either UCL1
	 * (UnderlyingClient1) or UCL2 (UnderlyingClient2).
	 */
	public static void checkIntermediary40(Intermediary40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}