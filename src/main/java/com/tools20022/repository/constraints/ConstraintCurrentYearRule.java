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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearRule";
			definition = "If CurrentYear is not present then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional.";
			owner_lazy = () -> ISAYearsOfIssue.mmObject();
		}

		@Override
		public void executeValidator(ISAYearsOfIssue obj) throws Exception {
			checkISAYearsOfIssue(obj);
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
	 * "If CurrentYearType or ExtendedCurrentYearType is not present then PreviousYears must be present. If CurrentYearType or ExtendedCurrentYearType is present then PreviousYears may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue1> forISAYearsOfIssue1 = new MMConstraint<ISAYearsOfIssue1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearRule";
			definition = "If CurrentYearType or ExtendedCurrentYearType is not present then PreviousYears must be present. If CurrentYearType or ExtendedCurrentYearType is present then PreviousYears may be present.";
			owner_lazy = () -> ISAYearsOfIssue1.mmObject();
		}

		@Override
		public void executeValidator(ISAYearsOfIssue1 obj) throws Exception {
			checkISAYearsOfIssue1(obj);
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
	 * "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue4> forISAYearsOfIssue4 = new MMConstraint<ISAYearsOfIssue4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearRule";
			definition = "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional.";
			owner_lazy = () -> ISAYearsOfIssue4.mmObject();
		}

		@Override
		public void executeValidator(ISAYearsOfIssue4 obj) throws Exception {
			checkISAYearsOfIssue4(obj);
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
	 * "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue5> forISAYearsOfIssue5 = new MMConstraint<ISAYearsOfIssue5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearRule";
			definition = "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional.";
			owner_lazy = () -> ISAYearsOfIssue5.mmObject();
		}

		@Override
		public void executeValidator(ISAYearsOfIssue5 obj) throws Exception {
			checkISAYearsOfIssue5(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrentYearRule#forISAYearsOfIssue7
	 * ConstraintCurrentYearRule.forISAYearsOfIssue7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue6> forISAYearsOfIssue6 = new MMConstraint<ISAYearsOfIssue6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearRule";
			definition = "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrentYearRule.forISAYearsOfIssue7);
			owner_lazy = () -> ISAYearsOfIssue6.mmObject();
		}

		@Override
		public void executeValidator(ISAYearsOfIssue6 obj) throws Exception {
			checkISAYearsOfIssue6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue7
	 * ISAYearsOfIssue7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrentYearRule#forISAYearsOfIssue6
	 * ConstraintCurrentYearRule.forISAYearsOfIssue6}</li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue7> forISAYearsOfIssue7 = new MMConstraint<ISAYearsOfIssue7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearRule";
			definition = "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCurrentYearRule.forISAYearsOfIssue6;
			owner_lazy = () -> ISAYearsOfIssue7.mmObject();
		}

		@Override
		public void executeValidator(ISAYearsOfIssue7 obj) throws Exception {
			checkISAYearsOfIssue7(obj);
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

	/**
	 * If CurrentYear is not present, then PreviousYears is mandatory. If
	 * CurrentYear is present then PreviousYears is optional.
	 */
	public static void checkISAYearsOfIssue7(ISAYearsOfIssue7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}