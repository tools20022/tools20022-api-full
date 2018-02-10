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
import com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02;
import com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03;
import com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04;
import java.util.Arrays;

/**
 * The cancellation of a switch order must be a full cancellation. Partial
 * cancellations are not allowed, for example, the cancellation of a given leg.
 */
public class ConstraintSwitchRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04
	 * SwitchOrderCancellationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cancellation of a switch order must be a full cancellation. Partial cancellations are not allowed, for example, the cancellation of a given leg."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSwitchRule#forSwitchOrderCancellationRequestV03
	 * ConstraintSwitchRule.forSwitchOrderCancellationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderCancellationRequestV04> forSwitchOrderCancellationRequestV04 = new MMConstraint<SwitchOrderCancellationRequestV04>() {
		{
			validator = ConstraintSwitchRule::checkSwitchOrderCancellationRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchRule";
			definition = "The cancellation of a switch order must be a full cancellation. Partial cancellations are not allowed, for example, the cancellation of a given leg.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSwitchRule.forSwitchOrderCancellationRequestV03;
			owner_lazy = () -> SwitchOrderCancellationRequestV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03
	 * SwitchOrderCancellationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cancellation of a switch order must be a full cancellation. Partial cancellations are not allowed e.g. cancellation of a given leg."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSwitchRule#forSwitchOrderCancellationRequestV04
	 * ConstraintSwitchRule.forSwitchOrderCancellationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderCancellationRequestV03> forSwitchOrderCancellationRequestV03 = new MMConstraint<SwitchOrderCancellationRequestV03>() {
		{
			validator = ConstraintSwitchRule::checkSwitchOrderCancellationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchRule";
			definition = "The cancellation of a switch order must be a full cancellation. Partial cancellations are not allowed e.g. cancellation of a given leg.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSwitchRule.forSwitchOrderCancellationRequestV04);
			owner_lazy = () -> SwitchOrderCancellationRequestV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02
	 * SwitchOrderCancellationInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cancellation of a switch order must be a full cancellation. Partial cancellations are not allowed e.g. cancellation of a given leg."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderCancellationInstructionV02> forSwitchOrderCancellationInstructionV02 = new MMConstraint<SwitchOrderCancellationInstructionV02>() {
		{
			validator = ConstraintSwitchRule::checkSwitchOrderCancellationInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchRule";
			definition = "The cancellation of a switch order must be a full cancellation. Partial cancellations are not allowed e.g. cancellation of a given leg.";
			owner_lazy = () -> SwitchOrderCancellationInstructionV02.mmObject();
		}
	};

	/**
	 * The cancellation of a switch order must be a full cancellation. Partial
	 * cancellations are not allowed, for example, the cancellation of a given
	 * leg.
	 */
	public static void checkSwitchOrderCancellationRequestV04(SwitchOrderCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The cancellation of a switch order must be a full cancellation. Partial
	 * cancellations are not allowed e.g. cancellation of a given leg.
	 */
	public static void checkSwitchOrderCancellationRequestV03(SwitchOrderCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The cancellation of a switch order must be a full cancellation. Partial
	 * cancellations are not allowed e.g. cancellation of a given leg.
	 */
	public static void checkSwitchOrderCancellationInstructionV02(SwitchOrderCancellationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}