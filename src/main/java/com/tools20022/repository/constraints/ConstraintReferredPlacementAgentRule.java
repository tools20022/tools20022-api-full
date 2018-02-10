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
import com.tools20022.repository.msg.ReferredAgent1;
import com.tools20022.repository.msg.ReferredAgent2;
import java.util.Arrays;

/**
 * ReferredPlacementAgent may only be present if Referred is equal to the code
 * value Referred (REFR).
 */
public class ConstraintReferredPlacementAgentRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReferredAgent1 ReferredAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredPlacementAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ReferredPlacementAgent may only be present if Referred is equal to the code value Referred (REFR)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReferredPlacementAgentRule#forReferredAgent2
	 * ConstraintReferredPlacementAgentRule.forReferredAgent2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReferredAgent1> forReferredAgent1 = new MMConstraint<ReferredAgent1>() {
		{
			validator = ConstraintReferredPlacementAgentRule::checkReferredAgent1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredPlacementAgentRule";
			definition = "ReferredPlacementAgent may only be present if Referred is equal to the code value Referred (REFR).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReferredPlacementAgentRule.forReferredAgent2);
			owner_lazy = () -> ReferredAgent1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReferredAgent2 ReferredAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredPlacementAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ReferredPlacementAgent may only be present if Referred is REFR (Referred)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReferredPlacementAgentRule#forReferredAgent1
	 * ConstraintReferredPlacementAgentRule.forReferredAgent1}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReferredAgent2> forReferredAgent2 = new MMConstraint<ReferredAgent2>() {
		{
			validator = ConstraintReferredPlacementAgentRule::checkReferredAgent2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredPlacementAgentRule";
			definition = "ReferredPlacementAgent may only be present if Referred is REFR (Referred).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReferredPlacementAgentRule.forReferredAgent1;
			owner_lazy = () -> ReferredAgent2.mmObject();
		}
	};

	/**
	 * ReferredPlacementAgent may only be present if Referred is equal to the
	 * code value Referred (REFR).
	 */
	public static void checkReferredAgent1(ReferredAgent1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ReferredPlacementAgent may only be present if Referred is REFR
	 * (Referred).
	 */
	public static void checkReferredAgent2(ReferredAgent2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}