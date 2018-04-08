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
import com.tools20022.repository.msg.SecuredMarketTransaction1;
import com.tools20022.repository.msg.SecuredMarketTransaction2;
import com.tools20022.repository.msg.SecuredMarketTransaction3;
import com.tools20022.repository.msg.SecuredMarketTransaction4;
import java.util.Arrays;

/**
 * TripartyAgentIdentification must be present, when the transaction is
 * performed via tri-party agent.
 */
public class ConstraintTripartyAgentIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1
	 * SecuredMarketTransaction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TripartyAgentIdentification must be present, when the transaction is performed via tri-party agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTripartyAgentIdentificationRule#forSecuredMarketTransaction2
	 * ConstraintTripartyAgentIdentificationRule.forSecuredMarketTransaction2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuredMarketTransaction1> forSecuredMarketTransaction1 = new MMConstraint<SecuredMarketTransaction1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgentIdentificationRule";
			definition = "TripartyAgentIdentification must be present, when the transaction is performed via tri-party agent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTripartyAgentIdentificationRule.forSecuredMarketTransaction2);
			owner_lazy = () -> SecuredMarketTransaction1.mmObject();
		}

		@Override
		public void executeValidator(SecuredMarketTransaction1 obj) throws Exception {
			checkSecuredMarketTransaction1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3
	 * SecuredMarketTransaction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TripartyAgentIdentification must be present, when the transaction is performed via tri-party agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTripartyAgentIdentificationRule#forSecuredMarketTransaction4
	 * ConstraintTripartyAgentIdentificationRule.forSecuredMarketTransaction4}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTripartyAgentIdentificationRule#forSecuredMarketTransaction2
	 * ConstraintTripartyAgentIdentificationRule.forSecuredMarketTransaction2}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuredMarketTransaction3> forSecuredMarketTransaction3 = new MMConstraint<SecuredMarketTransaction3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgentIdentificationRule";
			definition = "TripartyAgentIdentification must be present, when the transaction is performed via tri-party agent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTripartyAgentIdentificationRule.forSecuredMarketTransaction4);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTripartyAgentIdentificationRule.forSecuredMarketTransaction2;
			owner_lazy = () -> SecuredMarketTransaction3.mmObject();
		}

		@Override
		public void executeValidator(SecuredMarketTransaction3 obj) throws Exception {
			checkSecuredMarketTransaction3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TripartyAgentIdentification must be present, when the transaction is performed via tri-party agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTripartyAgentIdentificationRule#forSecuredMarketTransaction3
	 * ConstraintTripartyAgentIdentificationRule.forSecuredMarketTransaction3}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTripartyAgentIdentificationRule#forSecuredMarketTransaction1
	 * ConstraintTripartyAgentIdentificationRule.forSecuredMarketTransaction1}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuredMarketTransaction2> forSecuredMarketTransaction2 = new MMConstraint<SecuredMarketTransaction2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgentIdentificationRule";
			definition = "TripartyAgentIdentification must be present, when the transaction is performed via tri-party agent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTripartyAgentIdentificationRule.forSecuredMarketTransaction3);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTripartyAgentIdentificationRule.forSecuredMarketTransaction1;
			owner_lazy = () -> SecuredMarketTransaction2.mmObject();
		}

		@Override
		public void executeValidator(SecuredMarketTransaction2 obj) throws Exception {
			checkSecuredMarketTransaction2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TripartyAgentIdentification must be present, when the transaction is performed via tri-party agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTripartyAgentIdentificationRule#forSecuredMarketTransaction3
	 * ConstraintTripartyAgentIdentificationRule.forSecuredMarketTransaction3}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuredMarketTransaction4> forSecuredMarketTransaction4 = new MMConstraint<SecuredMarketTransaction4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgentIdentificationRule";
			definition = "TripartyAgentIdentification must be present, when the transaction is performed via tri-party agent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTripartyAgentIdentificationRule.forSecuredMarketTransaction3;
			owner_lazy = () -> SecuredMarketTransaction4.mmObject();
		}

		@Override
		public void executeValidator(SecuredMarketTransaction4 obj) throws Exception {
			checkSecuredMarketTransaction4(obj);
		}
	};

	/**
	 * TripartyAgentIdentification must be present, when the transaction is
	 * performed via tri-party agent.
	 */
	public static void checkSecuredMarketTransaction1(SecuredMarketTransaction1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TripartyAgentIdentification must be present, when the transaction is
	 * performed via tri-party agent.
	 */
	public static void checkSecuredMarketTransaction3(SecuredMarketTransaction3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TripartyAgentIdentification must be present, when the transaction is
	 * performed via tri-party agent.
	 */
	public static void checkSecuredMarketTransaction2(SecuredMarketTransaction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TripartyAgentIdentification must be present, when the transaction is
	 * performed via tri-party agent.
	 */
	public static void checkSecuredMarketTransaction4(SecuredMarketTransaction4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}