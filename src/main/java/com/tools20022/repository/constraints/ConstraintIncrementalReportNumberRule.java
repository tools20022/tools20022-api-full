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
import com.tools20022.repository.msg.Statement13;
import com.tools20022.repository.msg.Statement18;

/**
 * Two statements of the same type sent one after the other to the same Receiver
 * in relation to the same Safekeeping Account must have different incremental
 * ReportNumbers. Eg, a daily statement sent on day 1 would have report number
 * 1, on day 2, report number 2, etc.
 */
public class ConstraintIncrementalReportNumberRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement13 Statement13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncrementalReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Two statements of the same type sent one after the other to the same Receiver in relation to the same Safekeeping Account must have different incremental ReportNumbers. Eg, a daily statement sent on day 1 would have report number 1, on day 2, report number 2, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement13> forStatement13 = new MMConstraint<Statement13>() {
		{
			validator = ConstraintIncrementalReportNumberRule::checkStatement13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncrementalReportNumberRule";
			definition = "Two statements of the same type sent one after the other to the same Receiver in relation to the same Safekeeping Account must have different incremental ReportNumbers. Eg, a daily statement sent on day 1 would have report number 1, on day 2, report number 2, etc.";
			owner_lazy = () -> Statement13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement18 Statement18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncrementalReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Two statements of the same type sent one after the other to the same Receiver in relation to the same Safekeeping Account must have different incremental ReportNumbers. Eg, a daily statement sent on day 1 would have report number 1, on day 2, report number 2, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement18> forStatement18 = new MMConstraint<Statement18>() {
		{
			validator = ConstraintIncrementalReportNumberRule::checkStatement18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncrementalReportNumberRule";
			definition = "Two statements of the same type sent one after the other to the same Receiver in relation to the same Safekeeping Account must have different incremental ReportNumbers. Eg, a daily statement sent on day 1 would have report number 1, on day 2, report number 2, etc.";
			owner_lazy = () -> Statement18.mmObject();
		}
	};

	/**
	 * Two statements of the same type sent one after the other to the same
	 * Receiver in relation to the same Safekeeping Account must have different
	 * incremental ReportNumbers. Eg, a daily statement sent on day 1 would have
	 * report number 1, on day 2, report number 2, etc.
	 */
	public static void checkStatement13(Statement13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Two statements of the same type sent one after the other to the same
	 * Receiver in relation to the same Safekeeping Account must have different
	 * incremental ReportNumbers. Eg, a daily statement sent on day 1 would have
	 * report number 1, on day 2, report number 2, etc.
	 */
	public static void checkStatement18(Statement18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}