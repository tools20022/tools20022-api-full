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
 * Unless bilaterally agreed between the Sender and Receiver, if
 * SubBalanceAdditionnalDetails is used, them it must not contain information
 * that can be provided in a structured field.
 */
public class ConstraintSubBalanceAdditionalDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6
	 * AdditionalBalanceInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule#forAdditionalBalanceInformation14
	 * ConstraintSubBalanceAdditionalDetailsRule.
	 * forAdditionalBalanceInformation14}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation6> forAdditionalBalanceInformation6 = new MMConstraint<AdditionalBalanceInformation6>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkAdditionalBalanceInformation6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule.forAdditionalBalanceInformation14);
			owner_lazy = () -> AdditionalBalanceInformation6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6
	 * SubBalanceInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule#forSubBalanceInformation14
	 * ConstraintSubBalanceAdditionalDetailsRule.forSubBalanceInformation14}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation6> forSubBalanceInformation6 = new MMConstraint<SubBalanceInformation6>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkSubBalanceInformation6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule.forSubBalanceInformation14);
			owner_lazy = () -> SubBalanceInformation6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation7
	 * AdditionalBalanceInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation7> forAdditionalBalanceInformation7 = new MMConstraint<AdditionalBalanceInformation7>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkAdditionalBalanceInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AdditionalBalanceInformation7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation7
	 * SubBalanceInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation7> forSubBalanceInformation7 = new MMConstraint<SubBalanceInformation7>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkSubBalanceInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SubBalanceInformation7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation5
	 * AdditionalBalanceInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation5> forAdditionalBalanceInformation5 = new MMConstraint<AdditionalBalanceInformation5>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkAdditionalBalanceInformation5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AdditionalBalanceInformation5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation5
	 * SubBalanceInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation5> forSubBalanceInformation5 = new MMConstraint<SubBalanceInformation5>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkSubBalanceInformation5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SubBalanceInformation5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation8
	 * AdditionalBalanceInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation8> forAdditionalBalanceInformation8 = new MMConstraint<AdditionalBalanceInformation8>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkAdditionalBalanceInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AdditionalBalanceInformation8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation8
	 * SubBalanceInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation8> forSubBalanceInformation8 = new MMConstraint<SubBalanceInformation8>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkSubBalanceInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SubBalanceInformation8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9
	 * AdditionalBalanceInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation9> forAdditionalBalanceInformation9 = new MMConstraint<AdditionalBalanceInformation9>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkAdditionalBalanceInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AdditionalBalanceInformation9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation9
	 * SubBalanceInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation9> forSubBalanceInformation9 = new MMConstraint<SubBalanceInformation9>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkSubBalanceInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SubBalanceInformation9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation10
	 * AdditionalBalanceInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation10> forAdditionalBalanceInformation10 = new MMConstraint<AdditionalBalanceInformation10>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkAdditionalBalanceInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AdditionalBalanceInformation10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation10
	 * SubBalanceInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation10> forSubBalanceInformation10 = new MMConstraint<SubBalanceInformation10>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkSubBalanceInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SubBalanceInformation10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation11
	 * AdditionalBalanceInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule#forAdditionalBalanceInformation15
	 * ConstraintSubBalanceAdditionalDetailsRule.
	 * forAdditionalBalanceInformation15}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation11> forAdditionalBalanceInformation11 = new MMConstraint<AdditionalBalanceInformation11>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkAdditionalBalanceInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule.forAdditionalBalanceInformation15);
			owner_lazy = () -> AdditionalBalanceInformation11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation11
	 * SubBalanceInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule#forSubBalanceInformation15
	 * ConstraintSubBalanceAdditionalDetailsRule.forSubBalanceInformation15}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation11> forSubBalanceInformation11 = new MMConstraint<SubBalanceInformation11>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkSubBalanceInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule.forSubBalanceInformation15);
			owner_lazy = () -> SubBalanceInformation11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation12
	 * AdditionalBalanceInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation12> forAdditionalBalanceInformation12 = new MMConstraint<AdditionalBalanceInformation12>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkAdditionalBalanceInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AdditionalBalanceInformation12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation12
	 * SubBalanceInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation12> forSubBalanceInformation12 = new MMConstraint<SubBalanceInformation12>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkSubBalanceInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SubBalanceInformation12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation4
	 * AdditionalBalanceInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, SubBalanceAdditionnalDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation4> forAdditionalBalanceInformation4 = new MMConstraint<AdditionalBalanceInformation4>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkAdditionalBalanceInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, SubBalanceAdditionnalDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AdditionalBalanceInformation4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation4
	 * SubBalanceInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, SubBalanceAdditionnalDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation4> forSubBalanceInformation4 = new MMConstraint<SubBalanceInformation4>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkSubBalanceInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, SubBalanceAdditionnalDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SubBalanceInformation4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15
	 * SubBalanceInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule#forSubBalanceInformation11
	 * ConstraintSubBalanceAdditionalDetailsRule.forSubBalanceInformation11}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation15> forSubBalanceInformation15 = new MMConstraint<SubBalanceInformation15>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkSubBalanceInformation15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule.forSubBalanceInformation11;
			owner_lazy = () -> SubBalanceInformation15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15
	 * AdditionalBalanceInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule#forAdditionalBalanceInformation11
	 * ConstraintSubBalanceAdditionalDetailsRule.
	 * forAdditionalBalanceInformation11}</li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation15> forAdditionalBalanceInformation15 = new MMConstraint<AdditionalBalanceInformation15>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkAdditionalBalanceInformation15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule.forAdditionalBalanceInformation11;
			owner_lazy = () -> AdditionalBalanceInformation15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14
	 * AdditionalBalanceInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule#forAdditionalBalanceInformation6
	 * ConstraintSubBalanceAdditionalDetailsRule.
	 * forAdditionalBalanceInformation6}</li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation14> forAdditionalBalanceInformation14 = new MMConstraint<AdditionalBalanceInformation14>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkAdditionalBalanceInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule.forAdditionalBalanceInformation6;
			owner_lazy = () -> AdditionalBalanceInformation14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14
	 * SubBalanceInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule#forSubBalanceInformation6
	 * ConstraintSubBalanceAdditionalDetailsRule.forSubBalanceInformation6}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation14> forSubBalanceInformation14 = new MMConstraint<SubBalanceInformation14>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkSubBalanceInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule.forSubBalanceInformation6;
			owner_lazy = () -> SubBalanceInformation14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation16
	 * AdditionalBalanceInformation16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation16> forAdditionalBalanceInformation16 = new MMConstraint<AdditionalBalanceInformation16>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkAdditionalBalanceInformation16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AdditionalBalanceInformation16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation17
	 * AdditionalBalanceInformation17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation17> forAdditionalBalanceInformation17 = new MMConstraint<AdditionalBalanceInformation17>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkAdditionalBalanceInformation17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AdditionalBalanceInformation17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation17
	 * SubBalanceInformation17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation17> forSubBalanceInformation17 = new MMConstraint<SubBalanceInformation17>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkSubBalanceInformation17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SubBalanceInformation17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation16
	 * SubBalanceInformation16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation16> forSubBalanceInformation16 = new MMConstraint<SubBalanceInformation16>() {
		{
			validator = ConstraintSubBalanceAdditionalDetailsRule::checkSubBalanceInformation16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SubBalanceInformation16.mmObject();
		}
	};

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation6(AdditionalBalanceInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkSubBalanceInformation6(SubBalanceInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation7(AdditionalBalanceInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkSubBalanceInformation7(SubBalanceInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation5(AdditionalBalanceInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkSubBalanceInformation5(SubBalanceInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation8(AdditionalBalanceInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkSubBalanceInformation8(SubBalanceInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation9(AdditionalBalanceInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkSubBalanceInformation9(SubBalanceInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation10(AdditionalBalanceInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkSubBalanceInformation10(SubBalanceInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation11(AdditionalBalanceInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkSubBalanceInformation11(SubBalanceInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation12(AdditionalBalanceInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkSubBalanceInformation12(SubBalanceInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver,
	 * SubBalanceAdditionnalDetails must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation4(AdditionalBalanceInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver,
	 * SubBalanceAdditionnalDetails must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkSubBalanceInformation4(SubBalanceInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkSubBalanceInformation15(SubBalanceInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation15(AdditionalBalanceInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation14(AdditionalBalanceInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkSubBalanceInformation14(SubBalanceInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation16(AdditionalBalanceInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation17(AdditionalBalanceInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkSubBalanceInformation17(SubBalanceInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkSubBalanceInformation16(SubBalanceInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}