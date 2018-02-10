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
 * SubBalanceAdditionnalDetails is present, then it must not contain information
 * that can be provided in a structured field.
 */
public class ConstraintHoldingAdditionalDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7
	 * AggregateBalancePerSafekeepingPlace7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace7> forAggregateBalancePerSafekeepingPlace7 = new MMConstraint<AggregateBalancePerSafekeepingPlace7>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation8> forAggregateBalanceInformation8 = new MMConstraint<AggregateBalanceInformation8>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10
	 * AggregateBalancePerSafekeepingPlace10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace10> forAggregateBalancePerSafekeepingPlace10 = new MMConstraint<AggregateBalancePerSafekeepingPlace10>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11
	 * AggregateBalanceInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation11> forAggregateBalanceInformation11 = new MMConstraint<AggregateBalanceInformation11>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12
	 * AggregateBalancePerSafekeepingPlace12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace12> forAggregateBalancePerSafekeepingPlace12 = new MMConstraint<AggregateBalancePerSafekeepingPlace12>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13
	 * AggregateBalanceInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation13> forAggregateBalanceInformation13 = new MMConstraint<AggregateBalanceInformation13>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14
	 * AggregateBalancePerSafekeepingPlace14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace14> forAggregateBalancePerSafekeepingPlace14 = new MMConstraint<AggregateBalancePerSafekeepingPlace14>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15
	 * AggregateBalanceInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation15> forAggregateBalanceInformation15 = new MMConstraint<AggregateBalanceInformation15>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16
	 * AggregateBalancePerSafekeepingPlace16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace16> forAggregateBalancePerSafekeepingPlace16 = new MMConstraint<AggregateBalancePerSafekeepingPlace16>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17
	 * AggregateBalanceInformation17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation17> forAggregateBalanceInformation17 = new MMConstraint<AggregateBalanceInformation17>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace18> forAggregateBalancePerSafekeepingPlace18 = new MMConstraint<AggregateBalancePerSafekeepingPlace18>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19
	 * AggregateBalanceInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation19> forAggregateBalanceInformation19 = new MMConstraint<AggregateBalanceInformation19>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21
	 * AggregateBalancePerSafekeepingPlace21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalancePerSafekeepingPlace25
	 * ConstraintHoldingAdditionalDetailsRule.
	 * forAggregateBalancePerSafekeepingPlace25}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace21> forAggregateBalancePerSafekeepingPlace21 = new MMConstraint<AggregateBalancePerSafekeepingPlace21>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalancePerSafekeepingPlace25);
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22
	 * AggregateBalanceInformation22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalanceInformation26
	 * ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation26}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation22> forAggregateBalanceInformation22 = new MMConstraint<AggregateBalanceInformation22>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation26);
			owner_lazy = () -> AggregateBalanceInformation22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22
	 * AggregateBalancePerSafekeepingPlace22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace22> forAggregateBalancePerSafekeepingPlace22 = new MMConstraint<AggregateBalancePerSafekeepingPlace22>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23
	 * AggregateBalanceInformation23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation23> forAggregateBalanceInformation23 = new MMConstraint<AggregateBalanceInformation23>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8
	 * AggregateBalancePerSafekeepingPlace8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace8> forAggregateBalancePerSafekeepingPlace8 = new MMConstraint<AggregateBalancePerSafekeepingPlace8>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9
	 * AggregateBalanceInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation9> forAggregateBalanceInformation9 = new MMConstraint<AggregateBalanceInformation9>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9
	 * AggregateBalancePerSafekeepingPlace9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace9> forAggregateBalancePerSafekeepingPlace9 = new MMConstraint<AggregateBalancePerSafekeepingPlace9>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10
	 * AggregateBalanceInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation10> forAggregateBalanceInformation10 = new MMConstraint<AggregateBalanceInformation10>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11
	 * AggregateBalancePerSafekeepingPlace11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace11> forAggregateBalancePerSafekeepingPlace11 = new MMConstraint<AggregateBalancePerSafekeepingPlace11>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12
	 * AggregateBalanceInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation12> forAggregateBalanceInformation12 = new MMConstraint<AggregateBalanceInformation12>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13
	 * AggregateBalancePerSafekeepingPlace13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace13> forAggregateBalancePerSafekeepingPlace13 = new MMConstraint<AggregateBalancePerSafekeepingPlace13>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14
	 * AggregateBalanceInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation14> forAggregateBalanceInformation14 = new MMConstraint<AggregateBalanceInformation14>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15
	 * AggregateBalancePerSafekeepingPlace15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace15> forAggregateBalancePerSafekeepingPlace15 = new MMConstraint<AggregateBalancePerSafekeepingPlace15>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16
	 * AggregateBalanceInformation16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation16> forAggregateBalanceInformation16 = new MMConstraint<AggregateBalanceInformation16>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17
	 * AggregateBalancePerSafekeepingPlace17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace17> forAggregateBalancePerSafekeepingPlace17 = new MMConstraint<AggregateBalancePerSafekeepingPlace17>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18
	 * AggregateBalanceInformation18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation18> forAggregateBalanceInformation18 = new MMConstraint<AggregateBalanceInformation18>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20
	 * AggregateBalancePerSafekeepingPlace20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalancePerSafekeepingPlace24
	 * ConstraintHoldingAdditionalDetailsRule.
	 * forAggregateBalancePerSafekeepingPlace24}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace20> forAggregateBalancePerSafekeepingPlace20 = new MMConstraint<AggregateBalancePerSafekeepingPlace20>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalancePerSafekeepingPlace24);
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21
	 * AggregateBalanceInformation21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalanceInformation25
	 * ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation25}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation21> forAggregateBalanceInformation21 = new MMConstraint<AggregateBalanceInformation21>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation25);
			owner_lazy = () -> AggregateBalanceInformation21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23
	 * AggregateBalancePerSafekeepingPlace23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace23> forAggregateBalancePerSafekeepingPlace23 = new MMConstraint<AggregateBalancePerSafekeepingPlace23>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24
	 * AggregateBalanceInformation24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation24> forAggregateBalanceInformation24 = new MMConstraint<AggregateBalanceInformation24>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19
	 * AggregateBalancePerSafekeepingPlace19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the sender and receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace19> forAggregateBalancePerSafekeepingPlace19 = new MMConstraint<AggregateBalancePerSafekeepingPlace19>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the sender and receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, SubBalanceAdditionnalDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace6> forAggregateBalancePerSafekeepingPlace6 = new MMConstraint<AggregateBalancePerSafekeepingPlace6>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, SubBalanceAdditionnalDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6
	 * AggregateBalanceInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, SubBalanceAdditionnalDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation6> forAggregateBalanceInformation6 = new MMConstraint<AggregateBalanceInformation6>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, SubBalanceAdditionnalDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5
	 * AggregateBalancePerSafekeepingPlace5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, HoldingAdditionnalDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace5> forAggregateBalancePerSafekeepingPlace5 = new MMConstraint<AggregateBalancePerSafekeepingPlace5>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, HoldingAdditionnalDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7
	 * AggregateBalanceInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, SubBalanceAdditionnalDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation7> forAggregateBalanceInformation7 = new MMConstraint<AggregateBalanceInformation7>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, SubBalanceAdditionnalDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26
	 * AggregateBalanceInformation26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalanceInformation31
	 * ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation31}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalanceInformation22
	 * ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation22}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation26> forAggregateBalanceInformation26 = new MMConstraint<AggregateBalanceInformation26>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation31);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation22;
			owner_lazy = () -> AggregateBalanceInformation26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25
	 * AggregateBalanceInformation25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalanceInformation30
	 * ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation30}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalanceInformation21
	 * ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation21}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation25> forAggregateBalanceInformation25 = new MMConstraint<AggregateBalanceInformation25>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation30);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation21;
			owner_lazy = () -> AggregateBalanceInformation25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalancePerSafekeepingPlace28
	 * ConstraintHoldingAdditionalDetailsRule.
	 * forAggregateBalancePerSafekeepingPlace28}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalancePerSafekeepingPlace20
	 * ConstraintHoldingAdditionalDetailsRule.
	 * forAggregateBalancePerSafekeepingPlace20}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace24> forAggregateBalancePerSafekeepingPlace24 = new MMConstraint<AggregateBalancePerSafekeepingPlace24>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalancePerSafekeepingPlace28);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalancePerSafekeepingPlace20;
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25
	 * AggregateBalancePerSafekeepingPlace25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalancePerSafekeepingPlace29
	 * ConstraintHoldingAdditionalDetailsRule.
	 * forAggregateBalancePerSafekeepingPlace29}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalancePerSafekeepingPlace21
	 * ConstraintHoldingAdditionalDetailsRule.
	 * forAggregateBalancePerSafekeepingPlace21}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace25> forAggregateBalancePerSafekeepingPlace25 = new MMConstraint<AggregateBalancePerSafekeepingPlace25>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalancePerSafekeepingPlace29);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalancePerSafekeepingPlace21;
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28
	 * AggregateBalanceInformation28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation28> forAggregateBalanceInformation28 = new MMConstraint<AggregateBalanceInformation28>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27
	 * AggregateBalanceInformation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation27> forAggregateBalanceInformation27 = new MMConstraint<AggregateBalanceInformation27>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26
	 * AggregateBalancePerSafekeepingPlace26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace26> forAggregateBalancePerSafekeepingPlace26 = new MMConstraint<AggregateBalancePerSafekeepingPlace26>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27
	 * AggregateBalancePerSafekeepingPlace27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace27> forAggregateBalancePerSafekeepingPlace27 = new MMConstraint<AggregateBalancePerSafekeepingPlace27>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30
	 * AggregateBalanceInformation30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalanceInformation25
	 * ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation25}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation30> forAggregateBalanceInformation30 = new MMConstraint<AggregateBalanceInformation30>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation25;
			owner_lazy = () -> AggregateBalanceInformation30.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31
	 * AggregateBalanceInformation31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalanceInformation26
	 * ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation26}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation31> forAggregateBalanceInformation31 = new MMConstraint<AggregateBalanceInformation31>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation26;
			owner_lazy = () -> AggregateBalanceInformation31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalancePerSafekeepingPlace24
	 * ConstraintHoldingAdditionalDetailsRule.
	 * forAggregateBalancePerSafekeepingPlace24}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace28> forAggregateBalancePerSafekeepingPlace28 = new MMConstraint<AggregateBalancePerSafekeepingPlace28>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalancePerSafekeepingPlace24;
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29
	 * AggregateBalancePerSafekeepingPlace29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalancePerSafekeepingPlace25
	 * ConstraintHoldingAdditionalDetailsRule.
	 * forAggregateBalancePerSafekeepingPlace25}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace29> forAggregateBalancePerSafekeepingPlace29 = new MMConstraint<AggregateBalancePerSafekeepingPlace29>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalancePerSafekeepingPlace25;
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32
	 * AggregateBalanceInformation32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation32> forAggregateBalanceInformation32 = new MMConstraint<AggregateBalanceInformation32>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation33> forAggregateBalanceInformation33 = new MMConstraint<AggregateBalanceInformation33>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalanceInformation33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalanceInformation33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace31> forAggregateBalancePerSafekeepingPlace31 = new MMConstraint<AggregateBalancePerSafekeepingPlace31>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if HoldingAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30
	 * AggregateBalancePerSafekeepingPlace30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace30> forAggregateBalancePerSafekeepingPlace30 = new MMConstraint<AggregateBalancePerSafekeepingPlace30>() {
		{
			validator = ConstraintHoldingAdditionalDetailsRule::checkAggregateBalancePerSafekeepingPlace30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace30.mmObject();
		}
	};

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace7(AggregateBalancePerSafekeepingPlace7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation8(AggregateBalanceInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace10(AggregateBalancePerSafekeepingPlace10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation11(AggregateBalanceInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace12(AggregateBalancePerSafekeepingPlace12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation13(AggregateBalanceInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace14(AggregateBalancePerSafekeepingPlace14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation15(AggregateBalanceInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace16(AggregateBalancePerSafekeepingPlace16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation17(AggregateBalanceInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace18(AggregateBalancePerSafekeepingPlace18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation19(AggregateBalanceInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace21(AggregateBalancePerSafekeepingPlace21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation22(AggregateBalanceInformation22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace22(AggregateBalancePerSafekeepingPlace22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation23(AggregateBalanceInformation23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * HoldingAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace8(AggregateBalancePerSafekeepingPlace8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation9(AggregateBalanceInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * HoldingAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace9(AggregateBalancePerSafekeepingPlace9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation10(AggregateBalanceInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * HoldingAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace11(AggregateBalancePerSafekeepingPlace11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation12(AggregateBalanceInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * HoldingAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace13(AggregateBalancePerSafekeepingPlace13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation14(AggregateBalanceInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * HoldingAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace15(AggregateBalancePerSafekeepingPlace15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation16(AggregateBalanceInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * HoldingAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace17(AggregateBalancePerSafekeepingPlace17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation18(AggregateBalanceInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * HoldingAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace20(AggregateBalancePerSafekeepingPlace20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation21(AggregateBalanceInformation21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * HoldingAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace23(AggregateBalancePerSafekeepingPlace23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation24(AggregateBalanceInformation24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the sender and receiver, if
	 * HoldingAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace19(AggregateBalancePerSafekeepingPlace19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver,
	 * SubBalanceAdditionnalDetails must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace6(AggregateBalancePerSafekeepingPlace6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver,
	 * SubBalanceAdditionnalDetails must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation6(AggregateBalanceInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver,
	 * HoldingAdditionnalDetails must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace5(AggregateBalancePerSafekeepingPlace5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver,
	 * SubBalanceAdditionnalDetails must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation7(AggregateBalanceInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation26(AggregateBalanceInformation26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation25(AggregateBalanceInformation25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * HoldingAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace24(AggregateBalancePerSafekeepingPlace24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace25(AggregateBalancePerSafekeepingPlace25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation28(AggregateBalanceInformation28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation27(AggregateBalanceInformation27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace26(AggregateBalancePerSafekeepingPlace26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * HoldingAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace27(AggregateBalancePerSafekeepingPlace27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation30(AggregateBalanceInformation30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation31(AggregateBalanceInformation31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * HoldingAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace28(AggregateBalancePerSafekeepingPlace28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace29(AggregateBalancePerSafekeepingPlace29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation32(AggregateBalanceInformation32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalanceInformation33(AggregateBalanceInformation33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * HoldingAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace31(AggregateBalancePerSafekeepingPlace31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace30(AggregateBalancePerSafekeepingPlace30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}