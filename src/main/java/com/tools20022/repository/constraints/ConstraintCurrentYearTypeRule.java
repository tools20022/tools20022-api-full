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
import com.tools20022.repository.msg.ISAYearsOfIssue2;
import com.tools20022.repository.msg.ISAYearsOfIssue3;

/**
 * If CurrentYearType or ExtendedCurrentYearType is not present then
 * PreviousYears is mandatory. If CurrentYearType or ExtendedCurrentYearType is
 * present then PreviousYears is optional.
 */
public class ConstraintCurrentYearTypeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3
	 * ISAYearsOfIssue3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CurrentYearType or ExtendedCurrentYearType is not present then PreviousYears is mandatory. If CurrentYearType or ExtendedCurrentYearType is present then PreviousYears is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue3> forISAYearsOfIssue3 = new MMConstraint<ISAYearsOfIssue3>() {
		{
			validator = ConstraintCurrentYearTypeRule::checkISAYearsOfIssue3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearTypeRule";
			definition = "If CurrentYearType or ExtendedCurrentYearType is not present then PreviousYears is mandatory. If CurrentYearType or ExtendedCurrentYearType is present then PreviousYears is optional.";
			owner_lazy = () -> ISAYearsOfIssue3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2
	 * ISAYearsOfIssue2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CurrentYearType or ExtendedCurrentYearType is not present, then PreviousYears is mandatory. If CurrentYearType or ExtendedCurrentYearType is present then PreviousYears is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue2> forISAYearsOfIssue2 = new MMConstraint<ISAYearsOfIssue2>() {
		{
			validator = ConstraintCurrentYearTypeRule::checkISAYearsOfIssue2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearTypeRule";
			definition = "If CurrentYearType or ExtendedCurrentYearType is not present, then PreviousYears is mandatory. If CurrentYearType or ExtendedCurrentYearType is present then PreviousYears is optional.";
			owner_lazy = () -> ISAYearsOfIssue2.mmObject();
		}
	};

	/**
	 * If CurrentYearType or ExtendedCurrentYearType is not present then
	 * PreviousYears is mandatory. If CurrentYearType or ExtendedCurrentYearType
	 * is present then PreviousYears is optional.
	 */
	public static void checkISAYearsOfIssue3(ISAYearsOfIssue3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CurrentYearType or ExtendedCurrentYearType is not present, then
	 * PreviousYears is mandatory. If CurrentYearType or ExtendedCurrentYearType
	 * is present then PreviousYears is optional.
	 */
	public static void checkISAYearsOfIssue2(ISAYearsOfIssue2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}