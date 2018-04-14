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
 * If the reason is requested, then it must be in line with the reasons
 * available for the message type requested.
 */
public class ConstraintReasonRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice
	 * Reason17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the reason is requested, then it must be in line with the reasons available for the message type requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Reason17Choice> forReason17Choice = new MMConstraint<Reason17Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonRule";
			definition = "If the reason is requested, then it must be in line with the reasons available for the message type requested.";
			owner_lazy = () -> Reason17Choice.mmObject();
		}

		@Override
		public void executeValidator(Reason17Choice obj) throws Exception {
			checkReason17Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the reason is requested, then it must be in line with the reasons available for the message type requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReasonRule#forReason14Choice
	 * ConstraintReasonRule.forReason14Choice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReasonRule#forReason7Choice
	 * ConstraintReasonRule.forReason7Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<Reason12Choice> forReason12Choice = new MMConstraint<Reason12Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonRule";
			definition = "If the reason is requested, then it must be in line with the reasons available for the message type requested.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReasonRule.forReason14Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReasonRule.forReason7Choice;
			owner_lazy = () -> Reason12Choice.mmObject();
		}

		@Override
		public void executeValidator(Reason12Choice obj) throws Exception {
			checkReason12Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice
	 * Reason10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the reason is requested, then it must be in line with the reasons available for the message type requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Reason10Choice> forReason10Choice = new MMConstraint<Reason10Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonRule";
			definition = "If the reason is requested, then it must be in line with the reasons available for the message type requested.";
			owner_lazy = () -> Reason10Choice.mmObject();
		}

		@Override
		public void executeValidator(Reason10Choice obj) throws Exception {
			checkReason10Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice
	 * Reason11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the reason is requested, then it must be in line with the reasons available for the message type requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Reason11Choice> forReason11Choice = new MMConstraint<Reason11Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonRule";
			definition = "If the reason is requested, then it must be in line with the reasons available for the message type requested.";
			owner_lazy = () -> Reason11Choice.mmObject();
		}

		@Override
		public void executeValidator(Reason11Choice obj) throws Exception {
			checkReason11Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the reason is requested, then it must be in line with the reasons available for the message type requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReasonRule#forReason12Choice
	 * ConstraintReasonRule.forReason12Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Reason7Choice> forReason7Choice = new MMConstraint<Reason7Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonRule";
			definition = "If the reason is requested, then it must be in line with the reasons available for the message type requested.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReasonRule.forReason12Choice);
			owner_lazy = () -> Reason7Choice.mmObject();
		}

		@Override
		public void executeValidator(Reason7Choice obj) throws Exception {
			checkReason7Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice Reason2Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the reason is requested, then it must be in line with the reasons available for the message type requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Reason2Choice> forReason2Choice = new MMConstraint<Reason2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonRule";
			definition = "If the reason is requested, then it must be in line with the reasons available for the message type requested.";
			owner_lazy = () -> Reason2Choice.mmObject();
		}

		@Override
		public void executeValidator(Reason2Choice obj) throws Exception {
			checkReason2Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice
	 * Reason15Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the reason is requested, then it must be in line with the reasons available for the message type requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Reason15Choice> forReason15Choice = new MMConstraint<Reason15Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonRule";
			definition = "If the reason is requested, then it must be in line with the reasons available for the message type requested.";
			owner_lazy = () -> Reason15Choice.mmObject();
		}

		@Override
		public void executeValidator(Reason15Choice obj) throws Exception {
			checkReason15Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice Reason6Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the reason is requested, then it must be in line with the reasons available for the message type requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Reason6Choice> forReason6Choice = new MMConstraint<Reason6Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonRule";
			definition = "If the reason is requested, then it must be in line with the reasons available for the message type requested.";
			owner_lazy = () -> Reason6Choice.mmObject();
		}

		@Override
		public void executeValidator(Reason6Choice obj) throws Exception {
			checkReason6Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice Reason1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the reason is requested, then it must be in line with the reasons available for the message type requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Reason1Choice> forReason1Choice = new MMConstraint<Reason1Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonRule";
			definition = "If the reason is requested, then it must be in line with the reasons available for the message type requested.";
			owner_lazy = () -> Reason1Choice.mmObject();
		}

		@Override
		public void executeValidator(Reason1Choice obj) throws Exception {
			checkReason1Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice
	 * Reason16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the reason is requested, then it must be in line with the reasons available for the message type requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReasonRule#forReason14Choice
	 * ConstraintReasonRule.forReason14Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<Reason16Choice> forReason16Choice = new MMConstraint<Reason16Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonRule";
			definition = "If the reason is requested, then it must be in line with the reasons available for the message type requested.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReasonRule.forReason14Choice;
			owner_lazy = () -> Reason16Choice.mmObject();
		}

		@Override
		public void executeValidator(Reason16Choice obj) throws Exception {
			checkReason16Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice
	 * Reason13Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the reason is requested, then it must be in line with the reasons available for the message type requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Reason13Choice> forReason13Choice = new MMConstraint<Reason13Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonRule";
			definition = "If the reason is requested, then it must be in line with the reasons available for the message type requested.";
			owner_lazy = () -> Reason13Choice.mmObject();
		}

		@Override
		public void executeValidator(Reason13Choice obj) throws Exception {
			checkReason13Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice
	 * Reason14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the reason is requested, then it must be in line with the reasons available for the message type requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReasonRule#forReason16Choice
	 * ConstraintReasonRule.forReason16Choice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReasonRule#forReason12Choice
	 * ConstraintReasonRule.forReason12Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<Reason14Choice> forReason14Choice = new MMConstraint<Reason14Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonRule";
			definition = "If the reason is requested, then it must be in line with the reasons available for the message type requested.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReasonRule.forReason16Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReasonRule.forReason12Choice;
			owner_lazy = () -> Reason14Choice.mmObject();
		}

		@Override
		public void executeValidator(Reason14Choice obj) throws Exception {
			checkReason14Choice(obj);
		}
	};

	/**
	 * If the reason is requested, then it must be in line with the reasons
	 * available for the message type requested.
	 */
	public static void checkReason17Choice(Reason17Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the reason is requested, then it must be in line with the reasons
	 * available for the message type requested.
	 */
	public static void checkReason12Choice(Reason12Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the reason is requested, then it must be in line with the reasons
	 * available for the message type requested.
	 */
	public static void checkReason10Choice(Reason10Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the reason is requested, then it must be in line with the reasons
	 * available for the message type requested.
	 */
	public static void checkReason11Choice(Reason11Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the reason is requested, then it must be in line with the reasons
	 * available for the message type requested.
	 */
	public static void checkReason7Choice(Reason7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the reason is requested, then it must be in line with the reasons
	 * available for the message type requested.
	 */
	public static void checkReason2Choice(Reason2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the reason is requested, then it must be in line with the reasons
	 * available for the message type requested.
	 */
	public static void checkReason15Choice(Reason15Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the reason is requested, then it must be in line with the reasons
	 * available for the message type requested.
	 */
	public static void checkReason6Choice(Reason6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the reason is requested, then it must be in line with the reasons
	 * available for the message type requested.
	 */
	public static void checkReason1Choice(Reason1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the reason is requested, then it must be in line with the reasons
	 * available for the message type requested.
	 */
	public static void checkReason16Choice(Reason16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the reason is requested, then it must be in line with the reasons
	 * available for the message type requested.
	 */
	public static void checkReason13Choice(Reason13Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the reason is requested, then it must be in line with the reasons
	 * available for the message type requested.
	 */
	public static void checkReason14Choice(Reason14Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}