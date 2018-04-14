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
import com.tools20022.repository.choice.RateStatus1Choice;
import com.tools20022.repository.choice.RateStatus2Choice;
import com.tools20022.repository.choice.RateStatus3Choice;
import com.tools20022.repository.choice.RateStatus4Choice;
import java.util.Arrays;

/**
 * The code value ACTU is the default value for a rate status.
 */
public class ConstraintRateStatusGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateStatus4Choice
	 * RateStatus4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The code value ACTU is the default value for a rate status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateStatus4Choice> forRateStatus4Choice = new MMConstraint<RateStatus4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateStatusGuideline";
			definition = "The code value ACTU is the default value for a rate status.";
			owner_lazy = () -> RateStatus4Choice.mmObject();
		}

		@Override
		public void executeValidator(RateStatus4Choice obj) throws Exception {
			checkRateStatus4Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateStatus1Choice
	 * RateStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The code value ACTU is the default value for a rate status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateStatusGuideline#forRateStatus3Choice
	 * ConstraintRateStatusGuideline.forRateStatus3Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateStatus1Choice> forRateStatus1Choice = new MMConstraint<RateStatus1Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateStatusGuideline";
			definition = "The code value ACTU is the default value for a rate status.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateStatusGuideline.forRateStatus3Choice);
			owner_lazy = () -> RateStatus1Choice.mmObject();
		}

		@Override
		public void executeValidator(RateStatus1Choice obj) throws Exception {
			checkRateStatus1Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateStatus2Choice
	 * RateStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The code value ACTU is the default value for a rate status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateStatus2Choice> forRateStatus2Choice = new MMConstraint<RateStatus2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateStatusGuideline";
			definition = "The code value ACTU is the default value for a rate status.";
			owner_lazy = () -> RateStatus2Choice.mmObject();
		}

		@Override
		public void executeValidator(RateStatus2Choice obj) throws Exception {
			checkRateStatus2Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateStatus3Choice
	 * RateStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The code value ACTU is the default value for a rate status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateStatusGuideline#forRateStatus1Choice
	 * ConstraintRateStatusGuideline.forRateStatus1Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateStatus3Choice> forRateStatus3Choice = new MMConstraint<RateStatus3Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateStatusGuideline";
			definition = "The code value ACTU is the default value for a rate status.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateStatusGuideline.forRateStatus1Choice;
			owner_lazy = () -> RateStatus3Choice.mmObject();
		}

		@Override
		public void executeValidator(RateStatus3Choice obj) throws Exception {
			checkRateStatus3Choice(obj);
		}
	};

	/**
	 * The code value ACTU is the default value for a rate status.
	 */
	public static void checkRateStatus4Choice(RateStatus4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The code value ACTU is the default value for a rate status.
	 */
	public static void checkRateStatus1Choice(RateStatus1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The code value ACTU is the default value for a rate status.
	 */
	public static void checkRateStatus2Choice(RateStatus2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The code value ACTU is the default value for a rate status.
	 */
	public static void checkRateStatus3Choice(RateStatus3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}