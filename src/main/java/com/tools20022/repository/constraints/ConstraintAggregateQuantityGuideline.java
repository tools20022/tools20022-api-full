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
 * The AggregateQuantity should be the sum of AvailableQuantity and
 * NonAvailableQuantity if AvailableQuantityand NonAvailableQuantity are both
 * present.
 */
public class ConstraintAggregateQuantityGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1
	 * AggregateBalancePerSafekeepingPlace1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateQuantityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AggregateQuantity should be the sum of AvailableQuantity and NonAvailableQuantity if AvailableQuantityand NonAvailableQuantity are both present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace1> forAggregateBalancePerSafekeepingPlace1 = new MMConstraint<AggregateBalancePerSafekeepingPlace1>() {
		{
			validator = ConstraintAggregateQuantityGuideline::checkAggregateBalancePerSafekeepingPlace1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateQuantityGuideline";
			definition = "The AggregateQuantity should be the sum of AvailableQuantity and NonAvailableQuantity if AvailableQuantityand NonAvailableQuantity are both present.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1
	 * AggregateBalanceInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateQuantityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AggregateQuantity should be the sum of AvailableQuantity and NonAvailableQuantity, if AvailableQuantity and NonAvailableQuantity are both present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation1> forAggregateBalanceInformation1 = new MMConstraint<AggregateBalanceInformation1>() {
		{
			validator = ConstraintAggregateQuantityGuideline::checkAggregateBalanceInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateQuantityGuideline";
			definition = "The AggregateQuantity should be the sum of AvailableQuantity and NonAvailableQuantity, if AvailableQuantity and NonAvailableQuantity are both present.";
			owner_lazy = () -> AggregateBalanceInformation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3
	 * AggregateBalancePerSafekeepingPlace3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateQuantityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity if AvailableQuantityand NotAvailableQuantity are both present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace3> forAggregateBalancePerSafekeepingPlace3 = new MMConstraint<AggregateBalancePerSafekeepingPlace3>() {
		{
			validator = ConstraintAggregateQuantityGuideline::checkAggregateBalancePerSafekeepingPlace3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateQuantityGuideline";
			definition = "The AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity if AvailableQuantityand NotAvailableQuantity are both present.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4
	 * AggregateBalanceInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateQuantityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity if AvailableQuantity and NotAvailableQuantity are both present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation4> forAggregateBalanceInformation4 = new MMConstraint<AggregateBalanceInformation4>() {
		{
			validator = ConstraintAggregateQuantityGuideline::checkAggregateBalanceInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateQuantityGuideline";
			definition = "The AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity if AvailableQuantity and NotAvailableQuantity are both present.";
			owner_lazy = () -> AggregateBalanceInformation4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5
	 * AggregateBalanceInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateQuantityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity if AvailableQuantity and NotAvailableQuantity are both present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation5> forAggregateBalanceInformation5 = new MMConstraint<AggregateBalanceInformation5>() {
		{
			validator = ConstraintAggregateQuantityGuideline::checkAggregateBalanceInformation5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateQuantityGuideline";
			definition = "The AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity if AvailableQuantity and NotAvailableQuantity are both present.";
			owner_lazy = () -> AggregateBalanceInformation5.mmObject();
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
	 * name} = "AggregateQuantityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity if AvailableQuantity and NotAvailableQuantity are both present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation7> forAggregateBalanceInformation7 = new MMConstraint<AggregateBalanceInformation7>() {
		{
			validator = ConstraintAggregateQuantityGuideline::checkAggregateBalanceInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateQuantityGuideline";
			definition = "The AggregateQuantity should be the sum of AvailableQuantity and NotAvailableQuantity if AvailableQuantity and NotAvailableQuantity are both present.";
			owner_lazy = () -> AggregateBalanceInformation7.mmObject();
		}
	};

	/**
	 * The AggregateQuantity should be the sum of AvailableQuantity and
	 * NonAvailableQuantity if AvailableQuantityand NonAvailableQuantity are
	 * both present.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace1(AggregateBalancePerSafekeepingPlace1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AggregateQuantity should be the sum of AvailableQuantity and
	 * NonAvailableQuantity, if AvailableQuantity and NonAvailableQuantity are
	 * both present.
	 */
	public static void checkAggregateBalanceInformation1(AggregateBalanceInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity if AvailableQuantityand NotAvailableQuantity are
	 * both present.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace3(AggregateBalancePerSafekeepingPlace3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity if AvailableQuantity and NotAvailableQuantity are
	 * both present.
	 */
	public static void checkAggregateBalanceInformation4(AggregateBalanceInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity if AvailableQuantity and NotAvailableQuantity are
	 * both present.
	 */
	public static void checkAggregateBalanceInformation5(AggregateBalanceInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AggregateQuantity should be the sum of AvailableQuantity and
	 * NotAvailableQuantity if AvailableQuantity and NotAvailableQuantity are
	 * both present.
	 */
	public static void checkAggregateBalanceInformation7(AggregateBalanceInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}