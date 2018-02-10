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
import java.util.Arrays;

/**
 * If SettlementDetails elements are used, then their conditions of use must be
 * pre-agreed between account owner and account servicer.
 */
public class ConstraintSettlementDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9
	 * SettlementDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails9> forSettlementDetails9 = new MMConstraint<SettlementDetails9>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17
	 * SettlementDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails17> forSettlementDetails17 = new MMConstraint<SettlementDetails17>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30
	 * SettlementDetails30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails30> forSettlementDetails30 = new MMConstraint<SettlementDetails30>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails30.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32
	 * SettlementDetails32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails32> forSettlementDetails32 = new MMConstraint<SettlementDetails32>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60
	 * SettlementDetails60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails71
	 * ConstraintSettlementDetailsRule.forSettlementDetails71}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails60> forSettlementDetails60 = new MMConstraint<SettlementDetails60>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails60;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails71);
			owner_lazy = () -> SettlementDetails60.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64
	 * SettlementDetails64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails64> forSettlementDetails64 = new MMConstraint<SettlementDetails64>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails64;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails64.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3
	 * SettlementDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails3> forSettlementDetails3 = new MMConstraint<SettlementDetails3>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16
	 * SettlementDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails16> forSettlementDetails16 = new MMConstraint<SettlementDetails16>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31
	 * SettlementDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails31> forSettlementDetails31 = new MMConstraint<SettlementDetails31>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40
	 * SettlementDetails40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails40> forSettlementDetails40 = new MMConstraint<SettlementDetails40>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails40.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62
	 * SettlementDetails62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails72
	 * ConstraintSettlementDetailsRule.forSettlementDetails72}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails62> forSettlementDetails62 = new MMConstraint<SettlementDetails62>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails72);
			owner_lazy = () -> SettlementDetails62.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63
	 * SettlementDetails63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails63> forSettlementDetails63 = new MMConstraint<SettlementDetails63>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails63.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6
	 * SettlementDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails6> forSettlementDetails6 = new MMConstraint<SettlementDetails6>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails20> forSettlementDetails20 = new MMConstraint<SettlementDetails20>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24
	 * SettlementDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails24> forSettlementDetails24 = new MMConstraint<SettlementDetails24>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33
	 * SettlementDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails33> forSettlementDetails33 = new MMConstraint<SettlementDetails33>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45
	 * SettlementDetails45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails70
	 * ConstraintSettlementDetailsRule.forSettlementDetails70}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails45> forSettlementDetails45 = new MMConstraint<SettlementDetails45>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails70);
			owner_lazy = () -> SettlementDetails45.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54
	 * SettlementDetails54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails54> forSettlementDetails54 = new MMConstraint<SettlementDetails54>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails54;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails54.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1
	 * SettlementDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails1> forSettlementDetails1 = new MMConstraint<SettlementDetails1>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19
	 * SettlementDetails19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails19> forSettlementDetails19 = new MMConstraint<SettlementDetails19>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22
	 * SettlementDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails22> forSettlementDetails22 = new MMConstraint<SettlementDetails22>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35
	 * SettlementDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails35> forSettlementDetails35 = new MMConstraint<SettlementDetails35>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42
	 * SettlementDetails42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails67
	 * ConstraintSettlementDetailsRule.forSettlementDetails67}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails42> forSettlementDetails42 = new MMConstraint<SettlementDetails42>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails67);
			owner_lazy = () -> SettlementDetails42.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52
	 * SettlementDetails52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails52> forSettlementDetails52 = new MMConstraint<SettlementDetails52>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails52.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8
	 * SettlementDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails8> forSettlementDetails8 = new MMConstraint<SettlementDetails8>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11
	 * SettlementDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails11> forSettlementDetails11 = new MMConstraint<SettlementDetails11>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23
	 * SettlementDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails23> forSettlementDetails23 = new MMConstraint<SettlementDetails23>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37
	 * SettlementDetails37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails37> forSettlementDetails37 = new MMConstraint<SettlementDetails37>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails69
	 * ConstraintSettlementDetailsRule.forSettlementDetails69}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails44> forSettlementDetails44 = new MMConstraint<SettlementDetails44>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails69);
			owner_lazy = () -> SettlementDetails44.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53
	 * SettlementDetails53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails53> forSettlementDetails53 = new MMConstraint<SettlementDetails53>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails53;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails53.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7
	 * SettlementDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails7> forSettlementDetails7 = new MMConstraint<SettlementDetails7>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12
	 * SettlementDetails12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails12> forSettlementDetails12 = new MMConstraint<SettlementDetails12>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28
	 * SettlementDetails28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails28> forSettlementDetails28 = new MMConstraint<SettlementDetails28>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38
	 * SettlementDetails38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails38> forSettlementDetails38 = new MMConstraint<SettlementDetails38>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails38.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47
	 * SettlementDetails47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails74
	 * ConstraintSettlementDetailsRule.forSettlementDetails74}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails47> forSettlementDetails47 = new MMConstraint<SettlementDetails47>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails74);
			owner_lazy = () -> SettlementDetails47.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56
	 * SettlementDetails56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails56> forSettlementDetails56 = new MMConstraint<SettlementDetails56>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2
	 * SettlementDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails2> forSettlementDetails2 = new MMConstraint<SettlementDetails2>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13
	 * SettlementDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails13> forSettlementDetails13 = new MMConstraint<SettlementDetails13>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27
	 * SettlementDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails27> forSettlementDetails27 = new MMConstraint<SettlementDetails27>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39
	 * SettlementDetails39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails39> forSettlementDetails39 = new MMConstraint<SettlementDetails39>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48
	 * SettlementDetails48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails75
	 * ConstraintSettlementDetailsRule.forSettlementDetails75}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails48> forSettlementDetails48 = new MMConstraint<SettlementDetails48>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails48;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails75);
			owner_lazy = () -> SettlementDetails48.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57
	 * SettlementDetails57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails57> forSettlementDetails57 = new MMConstraint<SettlementDetails57>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails57.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43
	 * SettlementDetails43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails43> forSettlementDetails43 = new MMConstraint<SettlementDetails43>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails43.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4
	 * SettlementDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails100
	 * ConstraintSettlementDetailsRule.forSettlementDetails100}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails4> forSettlementDetails4 = new MMConstraint<SettlementDetails4>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails100);
			owner_lazy = () -> SettlementDetails4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10
	 * SettlementDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails10> forSettlementDetails10 = new MMConstraint<SettlementDetails10>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29
	 * SettlementDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails29> forSettlementDetails29 = new MMConstraint<SettlementDetails29>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5
	 * SettlementDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails5> forSettlementDetails5 = new MMConstraint<SettlementDetails5>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25
	 * SettlementDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails25> forSettlementDetails25 = new MMConstraint<SettlementDetails25>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26
	 * SettlementDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails26> forSettlementDetails26 = new MMConstraint<SettlementDetails26>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65
	 * SettlementDetails65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails65> forSettlementDetails65 = new MMConstraint<SettlementDetails65>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails65;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails65.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14
	 * SettlementDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails14> forSettlementDetails14 = new MMConstraint<SettlementDetails14>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41
	 * SettlementDetails41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails41> forSettlementDetails41 = new MMConstraint<SettlementDetails41>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails41.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61
	 * SettlementDetails61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails73
	 * ConstraintSettlementDetailsRule.forSettlementDetails73}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails61> forSettlementDetails61 = new MMConstraint<SettlementDetails61>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails61;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails73);
			owner_lazy = () -> SettlementDetails61.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59
	 * SettlementDetails59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails59> forSettlementDetails59 = new MMConstraint<SettlementDetails59>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails59;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails59.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15
	 * SettlementDetails15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails15> forSettlementDetails15 = new MMConstraint<SettlementDetails15>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34
	 * SettlementDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails34> forSettlementDetails34 = new MMConstraint<SettlementDetails34>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49
	 * SettlementDetails49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails99
	 * ConstraintSettlementDetailsRule.forSettlementDetails99}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails49> forSettlementDetails49 = new MMConstraint<SettlementDetails49>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails99);
			owner_lazy = () -> SettlementDetails49.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58
	 * SettlementDetails58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails58> forSettlementDetails58 = new MMConstraint<SettlementDetails58>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails58;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails58.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36
	 * SettlementDetails36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails36> forSettlementDetails36 = new MMConstraint<SettlementDetails36>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18
	 * SettlementDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails18> forSettlementDetails18 = new MMConstraint<SettlementDetails18>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66
	 * SettlementDetails66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails66> forSettlementDetails66 = new MMConstraint<SettlementDetails66>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails66;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails66.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails93
	 * ConstraintSettlementDetailsRule.forSettlementDetails93}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails42
	 * ConstraintSettlementDetailsRule.forSettlementDetails42}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails67> forSettlementDetails67 = new MMConstraint<SettlementDetails67>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails93);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails42;
			owner_lazy = () -> SettlementDetails67.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70
	 * SettlementDetails70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails90
	 * ConstraintSettlementDetailsRule.forSettlementDetails90}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails45
	 * ConstraintSettlementDetailsRule.forSettlementDetails45}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails70> forSettlementDetails70 = new MMConstraint<SettlementDetails70>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails90);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails45;
			owner_lazy = () -> SettlementDetails70.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69
	 * SettlementDetails69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails95
	 * ConstraintSettlementDetailsRule.forSettlementDetails95}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails44
	 * ConstraintSettlementDetailsRule.forSettlementDetails44}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails69> forSettlementDetails69 = new MMConstraint<SettlementDetails69>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails69;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails95);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails44;
			owner_lazy = () -> SettlementDetails69.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71
	 * SettlementDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails96
	 * ConstraintSettlementDetailsRule.forSettlementDetails96}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails60
	 * ConstraintSettlementDetailsRule.forSettlementDetails60}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails71> forSettlementDetails71 = new MMConstraint<SettlementDetails71>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails71;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails96);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails60;
			owner_lazy = () -> SettlementDetails71.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails97
	 * ConstraintSettlementDetailsRule.forSettlementDetails97}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails62
	 * ConstraintSettlementDetailsRule.forSettlementDetails62}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails72> forSettlementDetails72 = new MMConstraint<SettlementDetails72>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails72;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails97);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails62;
			owner_lazy = () -> SettlementDetails72.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75
	 * SettlementDetails75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails91
	 * ConstraintSettlementDetailsRule.forSettlementDetails91}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails48
	 * ConstraintSettlementDetailsRule.forSettlementDetails48}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails75> forSettlementDetails75 = new MMConstraint<SettlementDetails75>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails75;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails91);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails48;
			owner_lazy = () -> SettlementDetails75.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73
	 * SettlementDetails73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails98
	 * ConstraintSettlementDetailsRule.forSettlementDetails98}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails61
	 * ConstraintSettlementDetailsRule.forSettlementDetails61}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails73> forSettlementDetails73 = new MMConstraint<SettlementDetails73>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails73;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails98);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails61;
			owner_lazy = () -> SettlementDetails73.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74
	 * SettlementDetails74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails92
	 * ConstraintSettlementDetailsRule.forSettlementDetails92}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails47
	 * ConstraintSettlementDetailsRule.forSettlementDetails47}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails74> forSettlementDetails74 = new MMConstraint<SettlementDetails74>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails74;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails92);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails47;
			owner_lazy = () -> SettlementDetails74.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81
	 * SettlementDetails81}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails81> forSettlementDetails81 = new MMConstraint<SettlementDetails81>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails81;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails81.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76
	 * SettlementDetails76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails76> forSettlementDetails76 = new MMConstraint<SettlementDetails76>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails76;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails76.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80
	 * SettlementDetails80}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails80> forSettlementDetails80 = new MMConstraint<SettlementDetails80>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails80;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails80.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78
	 * SettlementDetails78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails78> forSettlementDetails78 = new MMConstraint<SettlementDetails78>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails78;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails78.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77
	 * SettlementDetails77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails77> forSettlementDetails77 = new MMConstraint<SettlementDetails77>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails77;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails77.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79
	 * SettlementDetails79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails79> forSettlementDetails79 = new MMConstraint<SettlementDetails79>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails79;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails79.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87
	 * SettlementDetails87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails87> forSettlementDetails87 = new MMConstraint<SettlementDetails87>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails87;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails87.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86
	 * SettlementDetails86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails86> forSettlementDetails86 = new MMConstraint<SettlementDetails86>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails86;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails86.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85
	 * SettlementDetails85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails85> forSettlementDetails85 = new MMConstraint<SettlementDetails85>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails85;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails85.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93
	 * SettlementDetails93}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails101
	 * ConstraintSettlementDetailsRule.forSettlementDetails101}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails119
	 * ConstraintSettlementDetailsRule.forSettlementDetails119}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails140
	 * ConstraintSettlementDetailsRule.forSettlementDetails140}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails67
	 * ConstraintSettlementDetailsRule.forSettlementDetails67}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails93> forSettlementDetails93 = new MMConstraint<SettlementDetails93>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails93;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails101,
					com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails119, com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails140);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails67;
			owner_lazy = () -> SettlementDetails93.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90
	 * SettlementDetails90}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails128
	 * ConstraintSettlementDetailsRule.forSettlementDetails128}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails70
	 * ConstraintSettlementDetailsRule.forSettlementDetails70}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails90> forSettlementDetails90 = new MMConstraint<SettlementDetails90>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails90;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails128);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails70;
			owner_lazy = () -> SettlementDetails90.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96
	 * SettlementDetails96}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails147
	 * ConstraintSettlementDetailsRule.forSettlementDetails147}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails71
	 * ConstraintSettlementDetailsRule.forSettlementDetails71}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails96> forSettlementDetails96 = new MMConstraint<SettlementDetails96>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails96;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails147);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails71;
			owner_lazy = () -> SettlementDetails96.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97
	 * SettlementDetails97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails148
	 * ConstraintSettlementDetailsRule.forSettlementDetails148}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails72
	 * ConstraintSettlementDetailsRule.forSettlementDetails72}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails97> forSettlementDetails97 = new MMConstraint<SettlementDetails97>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails97;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails148);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails72;
			owner_lazy = () -> SettlementDetails97.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99
	 * SettlementDetails99}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails125
	 * ConstraintSettlementDetailsRule.forSettlementDetails125}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails49
	 * ConstraintSettlementDetailsRule.forSettlementDetails49}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails99> forSettlementDetails99 = new MMConstraint<SettlementDetails99>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails99;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails125);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails49;
			owner_lazy = () -> SettlementDetails99.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100
	 * SettlementDetails100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails4
	 * ConstraintSettlementDetailsRule.forSettlementDetails4}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails100> forSettlementDetails100 = new MMConstraint<SettlementDetails100>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails100;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails4;
			owner_lazy = () -> SettlementDetails100.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95
	 * SettlementDetails95}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails121
	 * ConstraintSettlementDetailsRule.forSettlementDetails121}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails69
	 * ConstraintSettlementDetailsRule.forSettlementDetails69}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails95> forSettlementDetails95 = new MMConstraint<SettlementDetails95>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails95;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails121);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails69;
			owner_lazy = () -> SettlementDetails95.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91
	 * SettlementDetails91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails126
	 * ConstraintSettlementDetailsRule.forSettlementDetails126}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails75
	 * ConstraintSettlementDetailsRule.forSettlementDetails75}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails91> forSettlementDetails91 = new MMConstraint<SettlementDetails91>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails91;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails126);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails75;
			owner_lazy = () -> SettlementDetails91.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92
	 * SettlementDetails92}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails127
	 * ConstraintSettlementDetailsRule.forSettlementDetails127}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails74
	 * ConstraintSettlementDetailsRule.forSettlementDetails74}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails92> forSettlementDetails92 = new MMConstraint<SettlementDetails92>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails92;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails127);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails74;
			owner_lazy = () -> SettlementDetails92.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98
	 * SettlementDetails98}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails73
	 * ConstraintSettlementDetailsRule.forSettlementDetails73}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails98> forSettlementDetails98 = new MMConstraint<SettlementDetails98>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails98;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails73;
			owner_lazy = () -> SettlementDetails98.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101
	 * SettlementDetails101}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails120
	 * ConstraintSettlementDetailsRule.forSettlementDetails120}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails93
	 * ConstraintSettlementDetailsRule.forSettlementDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails101> forSettlementDetails101 = new MMConstraint<SettlementDetails101>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails101;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails120);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails93;
			owner_lazy = () -> SettlementDetails101.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105
	 * SettlementDetails105}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails105> forSettlementDetails105 = new MMConstraint<SettlementDetails105>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails105;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails105.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106
	 * SettlementDetails106}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails106> forSettlementDetails106 = new MMConstraint<SettlementDetails106>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails106;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails106.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104
	 * SettlementDetails104}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails104> forSettlementDetails104 = new MMConstraint<SettlementDetails104>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails104;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails104.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111
	 * SettlementDetails111}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails111> forSettlementDetails111 = new MMConstraint<SettlementDetails111>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails111;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails111.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112
	 * SettlementDetails112}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails112> forSettlementDetails112 = new MMConstraint<SettlementDetails112>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails112;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails112.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110
	 * SettlementDetails110}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails110> forSettlementDetails110 = new MMConstraint<SettlementDetails110>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails110;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails110.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108
	 * SettlementDetails108}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails108> forSettlementDetails108 = new MMConstraint<SettlementDetails108>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails108;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails108.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103
	 * SettlementDetails103}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails103> forSettlementDetails103 = new MMConstraint<SettlementDetails103>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails103;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails103.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107
	 * SettlementDetails107}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails107> forSettlementDetails107 = new MMConstraint<SettlementDetails107>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails107;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails107.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115
	 * SettlementDetails115}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails115> forSettlementDetails115 = new MMConstraint<SettlementDetails115>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails115;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails115.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117
	 * SettlementDetails117}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails117> forSettlementDetails117 = new MMConstraint<SettlementDetails117>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails117;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails117.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116
	 * SettlementDetails116}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails116> forSettlementDetails116 = new MMConstraint<SettlementDetails116>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails116;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails116.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128
	 * SettlementDetails128}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails144
	 * ConstraintSettlementDetailsRule.forSettlementDetails144}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails90
	 * ConstraintSettlementDetailsRule.forSettlementDetails90}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails128> forSettlementDetails128 = new MMConstraint<SettlementDetails128>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails128;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails144);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails90;
			owner_lazy = () -> SettlementDetails128.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120
	 * SettlementDetails120}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails145
	 * ConstraintSettlementDetailsRule.forSettlementDetails145}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails101
	 * ConstraintSettlementDetailsRule.forSettlementDetails101}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails120> forSettlementDetails120 = new MMConstraint<SettlementDetails120>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails120;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails145);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails101;
			owner_lazy = () -> SettlementDetails120.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119
	 * SettlementDetails119}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails142
	 * ConstraintSettlementDetailsRule.forSettlementDetails142}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails93
	 * ConstraintSettlementDetailsRule.forSettlementDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails119> forSettlementDetails119 = new MMConstraint<SettlementDetails119>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails119;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails142);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails93;
			owner_lazy = () -> SettlementDetails119.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125
	 * SettlementDetails125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails141
	 * ConstraintSettlementDetailsRule.forSettlementDetails141}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails99
	 * ConstraintSettlementDetailsRule.forSettlementDetails99}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails125> forSettlementDetails125 = new MMConstraint<SettlementDetails125>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails125;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails141);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails99;
			owner_lazy = () -> SettlementDetails125.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126
	 * SettlementDetails126}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails150
	 * ConstraintSettlementDetailsRule.forSettlementDetails150}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails91
	 * ConstraintSettlementDetailsRule.forSettlementDetails91}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails126> forSettlementDetails126 = new MMConstraint<SettlementDetails126>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails126;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails150);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails91;
			owner_lazy = () -> SettlementDetails126.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127
	 * SettlementDetails127}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails149
	 * ConstraintSettlementDetailsRule.forSettlementDetails149}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails92
	 * ConstraintSettlementDetailsRule.forSettlementDetails92}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails127> forSettlementDetails127 = new MMConstraint<SettlementDetails127>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails127;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails149);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails92;
			owner_lazy = () -> SettlementDetails127.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121
	 * SettlementDetails121}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails143
	 * ConstraintSettlementDetailsRule.forSettlementDetails143}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails95
	 * ConstraintSettlementDetailsRule.forSettlementDetails95}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails121> forSettlementDetails121 = new MMConstraint<SettlementDetails121>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails121;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails143);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails95;
			owner_lazy = () -> SettlementDetails121.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134
	 * SettlementDetails134}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails134> forSettlementDetails134 = new MMConstraint<SettlementDetails134>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails134;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails134.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137
	 * SettlementDetails137}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails137> forSettlementDetails137 = new MMConstraint<SettlementDetails137>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails137;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails137.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132
	 * SettlementDetails132}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails132> forSettlementDetails132 = new MMConstraint<SettlementDetails132>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails132;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails132.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130
	 * SettlementDetails130}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails130> forSettlementDetails130 = new MMConstraint<SettlementDetails130>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails130;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails130.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131
	 * SettlementDetails131}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails131> forSettlementDetails131 = new MMConstraint<SettlementDetails131>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails131;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails131.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133
	 * SettlementDetails133}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails133> forSettlementDetails133 = new MMConstraint<SettlementDetails133>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails133;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails133.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139
	 * SettlementDetails139}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails139> forSettlementDetails139 = new MMConstraint<SettlementDetails139>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails139;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails139.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140
	 * SettlementDetails140}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails93
	 * ConstraintSettlementDetailsRule.forSettlementDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails140> forSettlementDetails140 = new MMConstraint<SettlementDetails140>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails140;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails93;
			owner_lazy = () -> SettlementDetails140.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147
	 * SettlementDetails147}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails96
	 * ConstraintSettlementDetailsRule.forSettlementDetails96}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails147> forSettlementDetails147 = new MMConstraint<SettlementDetails147>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails147;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails96;
			owner_lazy = () -> SettlementDetails147.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142
	 * SettlementDetails142}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails119
	 * ConstraintSettlementDetailsRule.forSettlementDetails119}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails142> forSettlementDetails142 = new MMConstraint<SettlementDetails142>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails142;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails119;
			owner_lazy = () -> SettlementDetails142.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144
	 * SettlementDetails144}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails128
	 * ConstraintSettlementDetailsRule.forSettlementDetails128}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails144> forSettlementDetails144 = new MMConstraint<SettlementDetails144>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails144;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails128;
			owner_lazy = () -> SettlementDetails144.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148
	 * SettlementDetails148}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails97
	 * ConstraintSettlementDetailsRule.forSettlementDetails97}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails148> forSettlementDetails148 = new MMConstraint<SettlementDetails148>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails148;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails97;
			owner_lazy = () -> SettlementDetails148.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141
	 * SettlementDetails141}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails125
	 * ConstraintSettlementDetailsRule.forSettlementDetails125}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails141> forSettlementDetails141 = new MMConstraint<SettlementDetails141>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails141;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails125;
			owner_lazy = () -> SettlementDetails141.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145
	 * SettlementDetails145}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails120
	 * ConstraintSettlementDetailsRule.forSettlementDetails120}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails145> forSettlementDetails145 = new MMConstraint<SettlementDetails145>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails145;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails120;
			owner_lazy = () -> SettlementDetails145.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143
	 * SettlementDetails143}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails121
	 * ConstraintSettlementDetailsRule.forSettlementDetails121}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails143> forSettlementDetails143 = new MMConstraint<SettlementDetails143>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails143;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails121;
			owner_lazy = () -> SettlementDetails143.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149
	 * SettlementDetails149}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails127
	 * ConstraintSettlementDetailsRule.forSettlementDetails127}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails149> forSettlementDetails149 = new MMConstraint<SettlementDetails149>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails149;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails127;
			owner_lazy = () -> SettlementDetails149.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails126
	 * ConstraintSettlementDetailsRule.forSettlementDetails126}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails150> forSettlementDetails150 = new MMConstraint<SettlementDetails150>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails150;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails126;
			owner_lazy = () -> SettlementDetails150.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151
	 * SettlementDetails151}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails151> forSettlementDetails151 = new MMConstraint<SettlementDetails151>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails151;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails151.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152
	 * SettlementDetails152}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails152> forSettlementDetails152 = new MMConstraint<SettlementDetails152>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails152;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails152.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails153
	 * SettlementDetails153}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails153> forSettlementDetails153 = new MMConstraint<SettlementDetails153>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails153;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails153.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155
	 * SettlementDetails155}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails155> forSettlementDetails155 = new MMConstraint<SettlementDetails155>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails155;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails155.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156
	 * SettlementDetails156}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails156> forSettlementDetails156 = new MMConstraint<SettlementDetails156>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails156;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails156.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157
	 * SettlementDetails157}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails157> forSettlementDetails157 = new MMConstraint<SettlementDetails157>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails157;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails157.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160
	 * SettlementDetails160}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails160> forSettlementDetails160 = new MMConstraint<SettlementDetails160>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails160;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails160.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails161
	 * SettlementDetails161}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails161> forSettlementDetails161 = new MMConstraint<SettlementDetails161>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails161;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails161.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails162
	 * SettlementDetails162}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails162> forSettlementDetails162 = new MMConstraint<SettlementDetails162>() {
		{
			validator = ConstraintSettlementDetailsRule::checkSettlementDetails162;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails162.mmObject();
		}
	};

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails9(SettlementDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails17(SettlementDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails30(SettlementDetails30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails32(SettlementDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails60(SettlementDetails60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails64(SettlementDetails64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails3(SettlementDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails16(SettlementDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails31(SettlementDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails40(SettlementDetails40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails62(SettlementDetails62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails63(SettlementDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails6(SettlementDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails20(SettlementDetails20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails24(SettlementDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails33(SettlementDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails45(SettlementDetails45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails54(SettlementDetails54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails1(SettlementDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails19(SettlementDetails19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails22(SettlementDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails35(SettlementDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails42(SettlementDetails42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails52(SettlementDetails52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails8(SettlementDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails11(SettlementDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails23(SettlementDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails37(SettlementDetails37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails44(SettlementDetails44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails53(SettlementDetails53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails7(SettlementDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails12(SettlementDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails28(SettlementDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails38(SettlementDetails38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails47(SettlementDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails56(SettlementDetails56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails2(SettlementDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails13(SettlementDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails27(SettlementDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails39(SettlementDetails39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails48(SettlementDetails48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails57(SettlementDetails57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails43(SettlementDetails43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails4(SettlementDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails10(SettlementDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails29(SettlementDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails5(SettlementDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails25(SettlementDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails26(SettlementDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails65(SettlementDetails65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails14(SettlementDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails41(SettlementDetails41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails61(SettlementDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails59(SettlementDetails59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails15(SettlementDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails34(SettlementDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails49(SettlementDetails49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails58(SettlementDetails58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails36(SettlementDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails18(SettlementDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails66(SettlementDetails66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails67(SettlementDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails70(SettlementDetails70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails69(SettlementDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails71(SettlementDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails72(SettlementDetails72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails75(SettlementDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails73(SettlementDetails73 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails74(SettlementDetails74 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails81(SettlementDetails81 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails76(SettlementDetails76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails80(SettlementDetails80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails78(SettlementDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails77(SettlementDetails77 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails79(SettlementDetails79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails87(SettlementDetails87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails86(SettlementDetails86 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails85(SettlementDetails85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails93(SettlementDetails93 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails90(SettlementDetails90 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails96(SettlementDetails96 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails97(SettlementDetails97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails99(SettlementDetails99 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails100(SettlementDetails100 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails95(SettlementDetails95 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails91(SettlementDetails91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails92(SettlementDetails92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails98(SettlementDetails98 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails101(SettlementDetails101 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails105(SettlementDetails105 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails106(SettlementDetails106 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails104(SettlementDetails104 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails111(SettlementDetails111 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails112(SettlementDetails112 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails110(SettlementDetails110 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails108(SettlementDetails108 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails103(SettlementDetails103 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails107(SettlementDetails107 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails115(SettlementDetails115 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails117(SettlementDetails117 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails116(SettlementDetails116 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails128(SettlementDetails128 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails120(SettlementDetails120 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails119(SettlementDetails119 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails125(SettlementDetails125 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails126(SettlementDetails126 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails127(SettlementDetails127 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails121(SettlementDetails121 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails134(SettlementDetails134 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails137(SettlementDetails137 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails132(SettlementDetails132 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails130(SettlementDetails130 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails131(SettlementDetails131 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails133(SettlementDetails133 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails139(SettlementDetails139 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails140(SettlementDetails140 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails147(SettlementDetails147 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails142(SettlementDetails142 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails144(SettlementDetails144 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails148(SettlementDetails148 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails141(SettlementDetails141 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails145(SettlementDetails145 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails143(SettlementDetails143 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails149(SettlementDetails149 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails150(SettlementDetails150 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails151(SettlementDetails151 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails152(SettlementDetails152 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails153(SettlementDetails153 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails155(SettlementDetails155 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails156(SettlementDetails156 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails157(SettlementDetails157 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails160(SettlementDetails160 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails161(SettlementDetails161 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails162(SettlementDetails162 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}