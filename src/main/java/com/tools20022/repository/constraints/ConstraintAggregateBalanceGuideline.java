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
 * If AvailableQuantity and NotAvailableQuantity are both present, then the
 * AggregateQuantity should be the sum of AvailableQuantity and
 * NotAvailableQuantity.
 */
public class ConstraintAggregateBalanceGuideline {

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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace7> forAggregateBalancePerSafekeepingPlace7 = new MMConstraint<AggregateBalancePerSafekeepingPlace7>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace7.mmObject();
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace10> forAggregateBalancePerSafekeepingPlace10 = new MMConstraint<AggregateBalancePerSafekeepingPlace10>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace10.mmObject();
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace12> forAggregateBalancePerSafekeepingPlace12 = new MMConstraint<AggregateBalancePerSafekeepingPlace12>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace12.mmObject();
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace14> forAggregateBalancePerSafekeepingPlace14 = new MMConstraint<AggregateBalancePerSafekeepingPlace14>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace14.mmObject();
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace16> forAggregateBalancePerSafekeepingPlace16 = new MMConstraint<AggregateBalancePerSafekeepingPlace16>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace16.mmObject();
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace18> forAggregateBalancePerSafekeepingPlace18 = new MMConstraint<AggregateBalancePerSafekeepingPlace18>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace18.mmObject();
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalancePerSafekeepingPlace25
	 * ConstraintAggregateBalanceGuideline.
	 * forAggregateBalancePerSafekeepingPlace25}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace21> forAggregateBalancePerSafekeepingPlace21 = new MMConstraint<AggregateBalancePerSafekeepingPlace21>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalancePerSafekeepingPlace25);
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace21.mmObject();
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace22> forAggregateBalancePerSafekeepingPlace22 = new MMConstraint<AggregateBalancePerSafekeepingPlace22>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace22.mmObject();
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace8> forAggregateBalancePerSafekeepingPlace8 = new MMConstraint<AggregateBalancePerSafekeepingPlace8>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation9> forAggregateBalanceInformation9 = new MMConstraint<AggregateBalanceInformation9>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalanceInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace9> forAggregateBalancePerSafekeepingPlace9 = new MMConstraint<AggregateBalancePerSafekeepingPlace9>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation10> forAggregateBalanceInformation10 = new MMConstraint<AggregateBalanceInformation10>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalanceInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace11> forAggregateBalancePerSafekeepingPlace11 = new MMConstraint<AggregateBalancePerSafekeepingPlace11>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation12> forAggregateBalanceInformation12 = new MMConstraint<AggregateBalanceInformation12>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalanceInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace13> forAggregateBalancePerSafekeepingPlace13 = new MMConstraint<AggregateBalancePerSafekeepingPlace13>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation14> forAggregateBalanceInformation14 = new MMConstraint<AggregateBalanceInformation14>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalanceInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace15> forAggregateBalancePerSafekeepingPlace15 = new MMConstraint<AggregateBalancePerSafekeepingPlace15>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation16> forAggregateBalanceInformation16 = new MMConstraint<AggregateBalanceInformation16>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalanceInformation16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace17> forAggregateBalancePerSafekeepingPlace17 = new MMConstraint<AggregateBalancePerSafekeepingPlace17>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation18> forAggregateBalanceInformation18 = new MMConstraint<AggregateBalanceInformation18>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalanceInformation18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalancePerSafekeepingPlace24
	 * ConstraintAggregateBalanceGuideline.
	 * forAggregateBalancePerSafekeepingPlace24}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace20> forAggregateBalancePerSafekeepingPlace20 = new MMConstraint<AggregateBalancePerSafekeepingPlace20>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalancePerSafekeepingPlace24);
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalanceInformation25
	 * ConstraintAggregateBalanceGuideline.forAggregateBalanceInformation25}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation21> forAggregateBalanceInformation21 = new MMConstraint<AggregateBalanceInformation21>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalanceInformation21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalanceInformation25);
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace23> forAggregateBalancePerSafekeepingPlace23 = new MMConstraint<AggregateBalancePerSafekeepingPlace23>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation24> forAggregateBalanceInformation24 = new MMConstraint<AggregateBalanceInformation24>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalanceInformation24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableBalance and NotAvailableBalance are both present, then the AggregateBalance should be the sum of AvailableBalance and NotAvailableBalance."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace19> forAggregateBalancePerSafekeepingPlace19 = new MMConstraint<AggregateBalancePerSafekeepingPlace19>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableBalance and NotAvailableBalance are both present, then the AggregateBalance should be the sum of AvailableBalance and NotAvailableBalance.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20
	 * AggregateBalanceInformation20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableBalance and NotAvailableBalance are both present, then the AggregateBalance should be the sum of AvailableBalance and NotAvailableBalance."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation20> forAggregateBalanceInformation20 = new MMConstraint<AggregateBalanceInformation20>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalanceInformation20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableBalance and NotAvailableBalance are both present, then the AggregateBalance should be the sum of AvailableBalance and NotAvailableBalance.";
			owner_lazy = () -> AggregateBalanceInformation20.mmObject();
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity if AvailableQuantityand NotAvailableQuantity are both present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace6> forAggregateBalancePerSafekeepingPlace6 = new MMConstraint<AggregateBalancePerSafekeepingPlace6>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "The AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity if AvailableQuantityand NotAvailableQuantity are both present.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace6.mmObject();
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity if AvailableQuantityand NotAvailableQuantity are both present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace5> forAggregateBalancePerSafekeepingPlace5 = new MMConstraint<AggregateBalancePerSafekeepingPlace5>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "The AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity if AvailableQuantityand NotAvailableQuantity are both present.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace5.mmObject();
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalanceInformation30
	 * ConstraintAggregateBalanceGuideline.forAggregateBalanceInformation30}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalanceInformation21
	 * ConstraintAggregateBalanceGuideline.forAggregateBalanceInformation21}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation25> forAggregateBalanceInformation25 = new MMConstraint<AggregateBalanceInformation25>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalanceInformation25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalanceInformation30);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalanceInformation21;
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalancePerSafekeepingPlace28
	 * ConstraintAggregateBalanceGuideline.
	 * forAggregateBalancePerSafekeepingPlace28}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalancePerSafekeepingPlace20
	 * ConstraintAggregateBalanceGuideline.
	 * forAggregateBalancePerSafekeepingPlace20}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace24> forAggregateBalancePerSafekeepingPlace24 = new MMConstraint<AggregateBalancePerSafekeepingPlace24>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalancePerSafekeepingPlace28);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalancePerSafekeepingPlace20;
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalancePerSafekeepingPlace29
	 * ConstraintAggregateBalanceGuideline.
	 * forAggregateBalancePerSafekeepingPlace29}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalancePerSafekeepingPlace21
	 * ConstraintAggregateBalanceGuideline.
	 * forAggregateBalancePerSafekeepingPlace21}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace25> forAggregateBalancePerSafekeepingPlace25 = new MMConstraint<AggregateBalancePerSafekeepingPlace25>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalancePerSafekeepingPlace29);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalancePerSafekeepingPlace21;
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation28> forAggregateBalanceInformation28 = new MMConstraint<AggregateBalanceInformation28>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalanceInformation28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			owner_lazy = () -> AggregateBalanceInformation28.mmObject();
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace26> forAggregateBalancePerSafekeepingPlace26 = new MMConstraint<AggregateBalancePerSafekeepingPlace26>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace27> forAggregateBalancePerSafekeepingPlace27 = new MMConstraint<AggregateBalancePerSafekeepingPlace27>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalanceInformation25
	 * ConstraintAggregateBalanceGuideline.forAggregateBalanceInformation25}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation30> forAggregateBalanceInformation30 = new MMConstraint<AggregateBalanceInformation30>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalanceInformation30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalanceInformation25;
			owner_lazy = () -> AggregateBalanceInformation30.mmObject();
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalancePerSafekeepingPlace24
	 * ConstraintAggregateBalanceGuideline.
	 * forAggregateBalancePerSafekeepingPlace24}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace28> forAggregateBalancePerSafekeepingPlace28 = new MMConstraint<AggregateBalancePerSafekeepingPlace28>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalancePerSafekeepingPlace24;
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalancePerSafekeepingPlace25
	 * ConstraintAggregateBalanceGuideline.
	 * forAggregateBalancePerSafekeepingPlace25}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace29> forAggregateBalancePerSafekeepingPlace29 = new MMConstraint<AggregateBalancePerSafekeepingPlace29>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalancePerSafekeepingPlace25;
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace29.mmObject();
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation33> forAggregateBalanceInformation33 = new MMConstraint<AggregateBalanceInformation33>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalanceInformation33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace31> forAggregateBalancePerSafekeepingPlace31 = new MMConstraint<AggregateBalancePerSafekeepingPlace31>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
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
	 * name} = "AggregateBalanceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace30> forAggregateBalancePerSafekeepingPlace30 = new MMConstraint<AggregateBalancePerSafekeepingPlace30>() {
		{
			validator = ConstraintAggregateBalanceGuideline::checkAggregateBalancePerSafekeepingPlace30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalanceGuideline";
			definition = "If AvailableQuantity and NotAvailableQuantity are both present, then the AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace30.mmObject();
		}
	};

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace7(AggregateBalancePerSafekeepingPlace7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace10(AggregateBalancePerSafekeepingPlace10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace12(AggregateBalancePerSafekeepingPlace12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace14(AggregateBalancePerSafekeepingPlace14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace16(AggregateBalancePerSafekeepingPlace16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace18(AggregateBalancePerSafekeepingPlace18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace21(AggregateBalancePerSafekeepingPlace21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace22(AggregateBalancePerSafekeepingPlace22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace8(AggregateBalancePerSafekeepingPlace8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalanceInformation9(AggregateBalanceInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace9(AggregateBalancePerSafekeepingPlace9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalanceInformation10(AggregateBalanceInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace11(AggregateBalancePerSafekeepingPlace11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalanceInformation12(AggregateBalanceInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace13(AggregateBalancePerSafekeepingPlace13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalanceInformation14(AggregateBalanceInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace15(AggregateBalancePerSafekeepingPlace15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalanceInformation16(AggregateBalanceInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace17(AggregateBalancePerSafekeepingPlace17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalanceInformation18(AggregateBalanceInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace20(AggregateBalancePerSafekeepingPlace20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalanceInformation21(AggregateBalanceInformation21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace23(AggregateBalancePerSafekeepingPlace23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalanceInformation24(AggregateBalanceInformation24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableBalance and NotAvailableBalance are both present, then the
	 * AggregateBalance should be the sum of AvailableBalance and
	 * NotAvailableBalance.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace19(AggregateBalancePerSafekeepingPlace19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableBalance and NotAvailableBalance are both present, then the
	 * AggregateBalance should be the sum of AvailableBalance and
	 * NotAvailableBalance.
	 */
	public static void checkAggregateBalanceInformation20(AggregateBalanceInformation20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity if AvailableQuantityand NotAvailableQuantity are
	 * both present.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace6(AggregateBalancePerSafekeepingPlace6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity if AvailableQuantityand NotAvailableQuantity are
	 * both present.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace5(AggregateBalancePerSafekeepingPlace5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalanceInformation25(AggregateBalanceInformation25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace24(AggregateBalancePerSafekeepingPlace24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace25(AggregateBalancePerSafekeepingPlace25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalanceInformation28(AggregateBalanceInformation28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace26(AggregateBalancePerSafekeepingPlace26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace27(AggregateBalancePerSafekeepingPlace27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalanceInformation30(AggregateBalanceInformation30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace28(AggregateBalancePerSafekeepingPlace28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace29(AggregateBalancePerSafekeepingPlace29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalanceInformation33(AggregateBalanceInformation33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace31(AggregateBalancePerSafekeepingPlace31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AvailableQuantity and NotAvailableQuantity are both present, then the
	 * AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace30(AggregateBalancePerSafekeepingPlace30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}