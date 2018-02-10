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

/**
 * If CurrentYear is not present then PreviousYears is mandatory. If CurrentYear
 * is present then PreviousYears is optional.
 */
public class ConstraintCurrentYearRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue
	 * ISAYearsOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CurrentYear is not present then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue> forISAYearsOfIssue = new MMConstraint<ISAYearsOfIssue>() {
		{
			validator = ConstraintCurrentYearRule::checkISAYearsOfIssue;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearRule";
			definition = "If CurrentYear is not present then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional.";
			owner_lazy = () -> ISAYearsOfIssue.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1
	 * ISAYearsOfIssue1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CurrentYearType or ExtendedCurrentYearType is not present then PreviousYears must be present. If CurrentYearType  or ExtendedCurrentYearType  is present then PreviousYears may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue1> forISAYearsOfIssue1 = new MMConstraint<ISAYearsOfIssue1>() {
		{
			validator = ConstraintCurrentYearRule::checkISAYearsOfIssue1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearRule";
			definition = "If CurrentYearType or ExtendedCurrentYearType is not present then PreviousYears must be present. If CurrentYearType  or ExtendedCurrentYearType  is present then PreviousYears may be present.";
			owner_lazy = () -> ISAYearsOfIssue1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4
	 * ISAYearsOfIssue4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional. "
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue4> forISAYearsOfIssue4 = new MMConstraint<ISAYearsOfIssue4>() {
		{
			validator = ConstraintCurrentYearRule::checkISAYearsOfIssue4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearRule";
			definition = "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional. ";
			owner_lazy = () -> ISAYearsOfIssue4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5
	 * ISAYearsOfIssue5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional. "
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue5> forISAYearsOfIssue5 = new MMConstraint<ISAYearsOfIssue5>() {
		{
			validator = ConstraintCurrentYearRule::checkISAYearsOfIssue5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearRule";
			definition = "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional. ";
			owner_lazy = () -> ISAYearsOfIssue5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue6
	 * ISAYearsOfIssue6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue6> forISAYearsOfIssue6 = new MMConstraint<ISAYearsOfIssue6>() {
		{
			validator = ConstraintCurrentYearRule::checkISAYearsOfIssue6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearRule";
			definition = "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional.";
			owner_lazy = () -> ISAYearsOfIssue6.mmObject();
		}
	};

	/**
	 * If CurrentYear is not present then PreviousYears is mandatory. If
	 * CurrentYear is present then PreviousYears is optional.
	 */
	public static void checkISAYearsOfIssue(ISAYearsOfIssue obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CurrentYearType or ExtendedCurrentYearType is not present then
	 * PreviousYears must be present. If CurrentYearType or
	 * ExtendedCurrentYearType is present then PreviousYears may be present.
	 */
	public static void checkISAYearsOfIssue1(ISAYearsOfIssue1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CurrentYear is not present, then PreviousYears is mandatory. If
	 * CurrentYear is present then PreviousYears is optional.
	 */
	public static void checkISAYearsOfIssue4(ISAYearsOfIssue4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CurrentYear is not present, then PreviousYears is mandatory. If
	 * CurrentYear is present then PreviousYears is optional.
	 */
	public static void checkISAYearsOfIssue5(ISAYearsOfIssue5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CurrentYear is not present, then PreviousYears is mandatory. If
	 * CurrentYear is present then PreviousYears is optional.
	 */
	public static void checkISAYearsOfIssue6(ISAYearsOfIssue6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}