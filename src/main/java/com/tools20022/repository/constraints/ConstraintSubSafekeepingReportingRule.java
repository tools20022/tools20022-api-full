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
 * Use of consolidated reports on a sub-safekeeping accounts must be bilaterally
 * agreed between sender and receiver.
 */
public class ConstraintSubSafekeepingReportingRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification10
	 * SubAccountIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification10> forSubAccountIdentification10 = new MMConstraint<SubAccountIdentification10>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification13
	 * SubAccountIdentification13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification13> forSubAccountIdentification13 = new MMConstraint<SubAccountIdentification13>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification16
	 * SubAccountIdentification16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification16> forSubAccountIdentification16 = new MMConstraint<SubAccountIdentification16>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification20
	 * SubAccountIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification20> forSubAccountIdentification20 = new MMConstraint<SubAccountIdentification20>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification23
	 * SubAccountIdentification23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification23> forSubAccountIdentification23 = new MMConstraint<SubAccountIdentification23>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification26
	 * SubAccountIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification26> forSubAccountIdentification26 = new MMConstraint<SubAccountIdentification26>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification29
	 * SubAccountIdentification29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule#forSubAccountIdentification38
	 * ConstraintSubSafekeepingReportingRule.forSubAccountIdentification38}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification29> forSubAccountIdentification29 = new MMConstraint<SubAccountIdentification29>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule.forSubAccountIdentification38);
			owner_lazy = () -> SubAccountIdentification29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification31
	 * SubAccountIdentification31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification31> forSubAccountIdentification31 = new MMConstraint<SubAccountIdentification31>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification11
	 * SubAccountIdentification11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification11> forSubAccountIdentification11 = new MMConstraint<SubAccountIdentification11>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification12
	 * SubAccountIdentification12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification12> forSubAccountIdentification12 = new MMConstraint<SubAccountIdentification12>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification17
	 * SubAccountIdentification17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification17> forSubAccountIdentification17 = new MMConstraint<SubAccountIdentification17>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification19
	 * SubAccountIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification19> forSubAccountIdentification19 = new MMConstraint<SubAccountIdentification19>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification22
	 * SubAccountIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification22> forSubAccountIdentification22 = new MMConstraint<SubAccountIdentification22>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification25
	 * SubAccountIdentification25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification25> forSubAccountIdentification25 = new MMConstraint<SubAccountIdentification25>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification28
	 * SubAccountIdentification28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule#forSubAccountIdentification37
	 * ConstraintSubSafekeepingReportingRule.forSubAccountIdentification37}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification28> forSubAccountIdentification28 = new MMConstraint<SubAccountIdentification28>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule.forSubAccountIdentification37);
			owner_lazy = () -> SubAccountIdentification28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification32
	 * SubAccountIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification32> forSubAccountIdentification32 = new MMConstraint<SubAccountIdentification32>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification27
	 * SubAccountIdentification27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping account must be bilaterally agreed between sender and receiver."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule#forSubAccountIdentification48
	 * ConstraintSubSafekeepingReportingRule.forSubAccountIdentification48}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification27> forSubAccountIdentification27 = new MMConstraint<SubAccountIdentification27>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping account must be bilaterally agreed between sender and receiver.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule.forSubAccountIdentification48);
			owner_lazy = () -> SubAccountIdentification27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubaccountIdentification7
	 * SubaccountIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubaccountIdentification7> forSubaccountIdentification7 = new MMConstraint<SubaccountIdentification7>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubaccountIdentification7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubaccountIdentification7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubaccountIdentification8
	 * SubaccountIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubaccountIdentification8> forSubaccountIdentification8 = new MMConstraint<SubaccountIdentification8>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubaccountIdentification8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubaccountIdentification8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification38
	 * SubAccountIdentification38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule#forSubAccountIdentification43
	 * ConstraintSubSafekeepingReportingRule.forSubAccountIdentification43}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule#forSubAccountIdentification29
	 * ConstraintSubSafekeepingReportingRule.forSubAccountIdentification29}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification38> forSubAccountIdentification38 = new MMConstraint<SubAccountIdentification38>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule.forSubAccountIdentification43);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule.forSubAccountIdentification29;
			owner_lazy = () -> SubAccountIdentification38.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification37
	 * SubAccountIdentification37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule#forSubAccountIdentification42
	 * ConstraintSubSafekeepingReportingRule.forSubAccountIdentification42}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule#forSubAccountIdentification28
	 * ConstraintSubSafekeepingReportingRule.forSubAccountIdentification28}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification37> forSubAccountIdentification37 = new MMConstraint<SubAccountIdentification37>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule.forSubAccountIdentification42);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule.forSubAccountIdentification28;
			owner_lazy = () -> SubAccountIdentification37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification40
	 * SubAccountIdentification40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification40> forSubAccountIdentification40 = new MMConstraint<SubAccountIdentification40>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification40.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification39
	 * SubAccountIdentification39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification39> forSubAccountIdentification39 = new MMConstraint<SubAccountIdentification39>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification42
	 * SubAccountIdentification42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule#forSubAccountIdentification37
	 * ConstraintSubSafekeepingReportingRule.forSubAccountIdentification37}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification42> forSubAccountIdentification42 = new MMConstraint<SubAccountIdentification42>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule.forSubAccountIdentification37;
			owner_lazy = () -> SubAccountIdentification42.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43
	 * SubAccountIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule#forSubAccountIdentification38
	 * ConstraintSubSafekeepingReportingRule.forSubAccountIdentification38}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification43> forSubAccountIdentification43 = new MMConstraint<SubAccountIdentification43>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule.forSubAccountIdentification38;
			owner_lazy = () -> SubAccountIdentification43.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification45
	 * SubAccountIdentification45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification45> forSubAccountIdentification45 = new MMConstraint<SubAccountIdentification45>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification45.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification46
	 * SubAccountIdentification46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification46> forSubAccountIdentification46 = new MMConstraint<SubAccountIdentification46>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification46.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification48
	 * SubAccountIdentification48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping account must be bilaterally agreed between sender and receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule#forSubAccountIdentification27
	 * ConstraintSubSafekeepingReportingRule.forSubAccountIdentification27}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification48> forSubAccountIdentification48 = new MMConstraint<SubAccountIdentification48>() {
		{
			validator = ConstraintSubSafekeepingReportingRule::checkSubAccountIdentification48;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping account must be bilaterally agreed between sender and receiver.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule.forSubAccountIdentification27;
			owner_lazy = () -> SubAccountIdentification48.mmObject();
		}
	};

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification10(SubAccountIdentification10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification13(SubAccountIdentification13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification16(SubAccountIdentification16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification20(SubAccountIdentification20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification23(SubAccountIdentification23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification26(SubAccountIdentification26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification29(SubAccountIdentification29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification31(SubAccountIdentification31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification11(SubAccountIdentification11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification12(SubAccountIdentification12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification17(SubAccountIdentification17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification19(SubAccountIdentification19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification22(SubAccountIdentification22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification25(SubAccountIdentification25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification28(SubAccountIdentification28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification32(SubAccountIdentification32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping account must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification27(SubAccountIdentification27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubaccountIdentification7(SubaccountIdentification7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubaccountIdentification8(SubaccountIdentification8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification38(SubAccountIdentification38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification37(SubAccountIdentification37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification40(SubAccountIdentification40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification39(SubAccountIdentification39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification42(SubAccountIdentification42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification43(SubAccountIdentification43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification45(SubAccountIdentification45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification46(SubAccountIdentification46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping account must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification48(SubAccountIdentification48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}