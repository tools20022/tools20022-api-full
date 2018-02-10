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
 * Unless bilaterally agreed between the Sender and Receiver, if
 * AllegementStatus is present, then the statement must be a delta statement
 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
 * removed or cancelled allegement must not be reported.
 */
public class ConstraintAllegementStatusRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4
	 * SecuritiesTradeDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails4> forSecuritiesTradeDetails4 = new MMConstraint<SecuritiesTradeDetails4>() {
		{
			validator = ConstraintAllegementStatusRule::checkSecuritiesTradeDetails4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			owner_lazy = () -> SecuritiesTradeDetails4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17
	 * SecuritiesTradeDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails17> forSecuritiesTradeDetails17 = new MMConstraint<SecuritiesTradeDetails17>() {
		{
			validator = ConstraintAllegementStatusRule::checkSecuritiesTradeDetails17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			owner_lazy = () -> SecuritiesTradeDetails17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10
	 * SecuritiesTradeDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails10> forSecuritiesTradeDetails10 = new MMConstraint<SecuritiesTradeDetails10>() {
		{
			validator = ConstraintAllegementStatusRule::checkSecuritiesTradeDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			owner_lazy = () -> SecuritiesTradeDetails10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22
	 * SecuritiesTradeDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails22> forSecuritiesTradeDetails22 = new MMConstraint<SecuritiesTradeDetails22>() {
		{
			validator = ConstraintAllegementStatusRule::checkSecuritiesTradeDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			owner_lazy = () -> SecuritiesTradeDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23
	 * SecuritiesTradeDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAllegementStatusRule#forSecuritiesTradeDetails35
	 * ConstraintAllegementStatusRule.forSecuritiesTradeDetails35}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails23> forSecuritiesTradeDetails23 = new MMConstraint<SecuritiesTradeDetails23>() {
		{
			validator = ConstraintAllegementStatusRule::checkSecuritiesTradeDetails23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAllegementStatusRule.forSecuritiesTradeDetails35);
			owner_lazy = () -> SecuritiesTradeDetails23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29
	 * SecuritiesTradeDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails29> forSecuritiesTradeDetails29 = new MMConstraint<SecuritiesTradeDetails29>() {
		{
			validator = ConstraintAllegementStatusRule::checkSecuritiesTradeDetails29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			owner_lazy = () -> SecuritiesTradeDetails29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35
	 * SecuritiesTradeDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAllegementStatusRule#forSecuritiesTradeDetails49
	 * ConstraintAllegementStatusRule.forSecuritiesTradeDetails49}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAllegementStatusRule#forSecuritiesTradeDetails23
	 * ConstraintAllegementStatusRule.forSecuritiesTradeDetails23}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails35> forSecuritiesTradeDetails35 = new MMConstraint<SecuritiesTradeDetails35>() {
		{
			validator = ConstraintAllegementStatusRule::checkSecuritiesTradeDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAllegementStatusRule.forSecuritiesTradeDetails49);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAllegementStatusRule.forSecuritiesTradeDetails23;
			owner_lazy = () -> SecuritiesTradeDetails35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42
	 * SecuritiesTradeDetails42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails42> forSecuritiesTradeDetails42 = new MMConstraint<SecuritiesTradeDetails42>() {
		{
			validator = ConstraintAllegementStatusRule::checkSecuritiesTradeDetails42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			owner_lazy = () -> SecuritiesTradeDetails42.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49
	 * SecuritiesTradeDetails49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAllegementStatusRule#forSecuritiesTradeDetails68
	 * ConstraintAllegementStatusRule.forSecuritiesTradeDetails68}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAllegementStatusRule#forSecuritiesTradeDetails35
	 * ConstraintAllegementStatusRule.forSecuritiesTradeDetails35}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails49> forSecuritiesTradeDetails49 = new MMConstraint<SecuritiesTradeDetails49>() {
		{
			validator = ConstraintAllegementStatusRule::checkSecuritiesTradeDetails49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAllegementStatusRule.forSecuritiesTradeDetails68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAllegementStatusRule.forSecuritiesTradeDetails35;
			owner_lazy = () -> SecuritiesTradeDetails49.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61
	 * SecuritiesTradeDetails61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails61> forSecuritiesTradeDetails61 = new MMConstraint<SecuritiesTradeDetails61>() {
		{
			validator = ConstraintAllegementStatusRule::checkSecuritiesTradeDetails61;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			owner_lazy = () -> SecuritiesTradeDetails61.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68
	 * SecuritiesTradeDetails68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAllegementStatusRule#forSecuritiesTradeDetails71
	 * ConstraintAllegementStatusRule.forSecuritiesTradeDetails71}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAllegementStatusRule#forSecuritiesTradeDetails49
	 * ConstraintAllegementStatusRule.forSecuritiesTradeDetails49}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails68> forSecuritiesTradeDetails68 = new MMConstraint<SecuritiesTradeDetails68>() {
		{
			validator = ConstraintAllegementStatusRule::checkSecuritiesTradeDetails68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAllegementStatusRule.forSecuritiesTradeDetails71);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAllegementStatusRule.forSecuritiesTradeDetails49;
			owner_lazy = () -> SecuritiesTradeDetails68.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69
	 * SecuritiesTradeDetails69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails69> forSecuritiesTradeDetails69 = new MMConstraint<SecuritiesTradeDetails69>() {
		{
			validator = ConstraintAllegementStatusRule::checkSecuritiesTradeDetails69;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			owner_lazy = () -> SecuritiesTradeDetails69.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71
	 * SecuritiesTradeDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAllegementStatusRule#forSecuritiesTradeDetails68
	 * ConstraintAllegementStatusRule.forSecuritiesTradeDetails68}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails71> forSecuritiesTradeDetails71 = new MMConstraint<SecuritiesTradeDetails71>() {
		{
			validator = ConstraintAllegementStatusRule::checkSecuritiesTradeDetails71;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAllegementStatusRule.forSecuritiesTradeDetails68;
			owner_lazy = () -> SecuritiesTradeDetails71.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85
	 * SecuritiesTradeDetails85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails85> forSecuritiesTradeDetails85 = new MMConstraint<SecuritiesTradeDetails85>() {
		{
			validator = ConstraintAllegementStatusRule::checkSecuritiesTradeDetails85;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			owner_lazy = () -> SecuritiesTradeDetails85.mmObject();
		}
	};

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails4(SecuritiesTradeDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails17(SecuritiesTradeDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails10(SecuritiesTradeDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails22(SecuritiesTradeDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails23(SecuritiesTradeDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails29(SecuritiesTradeDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails35(SecuritiesTradeDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails42(SecuritiesTradeDetails42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails49(SecuritiesTradeDetails49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails61(SecuritiesTradeDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails68(SecuritiesTradeDetails68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails69(SecuritiesTradeDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails71(SecuritiesTradeDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails85(SecuritiesTradeDetails85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}