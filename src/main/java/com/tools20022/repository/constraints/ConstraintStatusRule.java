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
import com.tools20022.repository.choice.*;
import java.util.Arrays;

/**
 * If a specific Status is requested, then it must be in line with the statuses
 * available for the message type requested.
 */
public class ConstraintStatusRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status1Choice Status1Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a specific Status is requested, then it must be in line with the statuses available for the message type requested."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status1Choice> forStatus1Choice = new MMConstraint<Status1Choice>() {
		{
			validator = ConstraintStatusRule::checkStatus1Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusRule";
			definition = "If a specific Status is requested, then it must be in line with the statuses available for the message type requested.";
			owner_lazy = () -> Status1Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a specific Status is requested, then it must be in line with the statuses available for the message type requested."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusRule#forStatus19Choice
	 * ConstraintStatusRule.forStatus19Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status8Choice> forStatus8Choice = new MMConstraint<Status8Choice>() {
		{
			validator = ConstraintStatusRule::checkStatus8Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusRule";
			definition = "If a specific Status is requested, then it must be in line with the statuses available for the message type requested.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusRule.forStatus19Choice);
			owner_lazy = () -> Status8Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a specific Status is requested, then it must be in line with the statuses available for the message type requested."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status3Choice> forStatus3Choice = new MMConstraint<Status3Choice>() {
		{
			validator = ConstraintStatusRule::checkStatus3Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusRule";
			definition = "If a specific Status is requested, then it must be in line with the statuses available for the message type requested.";
			owner_lazy = () -> Status3Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a specific Status is requested, then it must be in line with the statuses available for the message type requested."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status10Choice> forStatus10Choice = new MMConstraint<Status10Choice>() {
		{
			validator = ConstraintStatusRule::checkStatus10Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusRule";
			definition = "If a specific Status is requested, then it must be in line with the statuses available for the message type requested.";
			owner_lazy = () -> Status10Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status19Choice
	 * Status19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a specific Status is requested, then it must be in line with the statuses available for the message type requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusRule#forStatus8Choice
	 * ConstraintStatusRule.forStatus8Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<Status19Choice> forStatus19Choice = new MMConstraint<Status19Choice>() {
		{
			validator = ConstraintStatusRule::checkStatus19Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusRule";
			definition = "If a specific Status is requested, then it must be in line with the statuses available for the message type requested.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatusRule.forStatus8Choice;
			owner_lazy = () -> Status19Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a specific Status is requested, then it must be in line with the statuses available for the message type requested."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status22Choice> forStatus22Choice = new MMConstraint<Status22Choice>() {
		{
			validator = ConstraintStatusRule::checkStatus22Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusRule";
			definition = "If a specific Status is requested, then it must be in line with the statuses available for the message type requested.";
			owner_lazy = () -> Status22Choice.mmObject();
		}
	};

	/**
	 * If a specific Status is requested, then it must be in line with the
	 * statuses available for the message type requested.
	 */
	public static void checkStatus1Choice(Status1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If a specific Status is requested, then it must be in line with the
	 * statuses available for the message type requested.
	 */
	public static void checkStatus8Choice(Status8Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If a specific Status is requested, then it must be in line with the
	 * statuses available for the message type requested.
	 */
	public static void checkStatus3Choice(Status3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If a specific Status is requested, then it must be in line with the
	 * statuses available for the message type requested.
	 */
	public static void checkStatus10Choice(Status10Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If a specific Status is requested, then it must be in line with the
	 * statuses available for the message type requested.
	 */
	public static void checkStatus19Choice(Status19Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If a specific Status is requested, then it must be in line with the
	 * statuses available for the message type requested.
	 */
	public static void checkStatus22Choice(Status22Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}