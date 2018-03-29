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
import com.tools20022.repository.msg.Statement37;
import com.tools20022.repository.msg.Statement59;
import java.util.Arrays;

/**
 * FrequencyGranularity should be within the limits of the Frequency, such as
 * Frequency equals Monthly and FrequencyGranularity equals Daily.
 */
public class ConstraintFrequencyGranularityGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement37 Statement37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrequencyGranularityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FrequencyGranularity should be within the limits of the Frequency, such as Frequency equals Monthly and FrequencyGranularity equals Daily."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFrequencyGranularityGuideline#forStatement59
	 * ConstraintFrequencyGranularityGuideline.forStatement59}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement37> forStatement37 = new MMConstraint<Statement37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrequencyGranularityGuideline";
			definition = "FrequencyGranularity should be within the limits of the Frequency, such as Frequency equals Monthly and FrequencyGranularity equals Daily.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFrequencyGranularityGuideline.forStatement59);
			owner_lazy = () -> Statement37.mmObject();
		}

		@Override
		public void executeValidator(Statement37 obj) throws Exception {
			checkStatement37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement59 Statement59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrequencyGranularityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FrequencyGranularity should be within the limits of the Frequency, such as Frequency equals Monthly and FrequencyGranularity equals Daily."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFrequencyGranularityGuideline#forStatement37
	 * ConstraintFrequencyGranularityGuideline.forStatement37}</li>
	 * </ul>
	 */
	public static final MMConstraint<Statement59> forStatement59 = new MMConstraint<Statement59>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrequencyGranularityGuideline";
			definition = "FrequencyGranularity should be within the limits of the Frequency, such as Frequency equals Monthly and FrequencyGranularity equals Daily.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFrequencyGranularityGuideline.forStatement37;
			owner_lazy = () -> Statement59.mmObject();
		}

		@Override
		public void executeValidator(Statement59 obj) throws Exception {
			checkStatement59(obj);
		}
	};

	/**
	 * FrequencyGranularity should be within the limits of the Frequency, such
	 * as Frequency equals Monthly and FrequencyGranularity equals Daily.
	 */
	public static void checkStatement37(Statement37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FrequencyGranularity should be within the limits of the Frequency, such
	 * as Frequency equals Monthly and FrequencyGranularity equals Daily.
	 */
	public static void checkStatement59(Statement59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}