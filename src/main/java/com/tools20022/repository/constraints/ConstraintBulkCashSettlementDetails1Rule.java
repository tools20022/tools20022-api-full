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
 * Either IndividualOrderDetails/CashSettlementDetails or
 * BulkCashSettlementDetails may be present, but not both.
 */
public class ConstraintBulkCashSettlementDetails1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2
	 * RedemptionMultipleOrder2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrder2> forRedemptionMultipleOrder2 = new MMConstraint<RedemptionMultipleOrder2>() {
		{
			validator = ConstraintBulkCashSettlementDetails1Rule::checkRedemptionMultipleOrder2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails1Rule";
			definition = "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			owner_lazy = () -> RedemptionMultipleOrder2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3
	 * RedemptionMultipleOrder3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrder3> forRedemptionMultipleOrder3 = new MMConstraint<RedemptionMultipleOrder3>() {
		{
			validator = ConstraintBulkCashSettlementDetails1Rule::checkRedemptionMultipleOrder3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails1Rule";
			definition = "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			owner_lazy = () -> RedemptionMultipleOrder3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4
	 * RedemptionMultipleOrder4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetailsRule#forRedemptionMultipleOrder6
	 * ConstraintBulkCashSettlementDetailsRule.forRedemptionMultipleOrder6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrder4> forRedemptionMultipleOrder4 = new MMConstraint<RedemptionMultipleOrder4>() {
		{
			validator = ConstraintBulkCashSettlementDetails1Rule::checkRedemptionMultipleOrder4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails1Rule";
			definition = "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetailsRule.forRedemptionMultipleOrder6);
			owner_lazy = () -> RedemptionMultipleOrder4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2
	 * SubscriptionMultipleOrder2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrder2> forSubscriptionMultipleOrder2 = new MMConstraint<SubscriptionMultipleOrder2>() {
		{
			validator = ConstraintBulkCashSettlementDetails1Rule::checkSubscriptionMultipleOrder2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails1Rule";
			definition = "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionMultipleOrder2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3
	 * SubscriptionMultipleOrder3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrder3> forSubscriptionMultipleOrder3 = new MMConstraint<SubscriptionMultipleOrder3>() {
		{
			validator = ConstraintBulkCashSettlementDetails1Rule::checkSubscriptionMultipleOrder3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails1Rule";
			definition = "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionMultipleOrder3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetailsRule#forSubscriptionMultipleOrder6
	 * ConstraintBulkCashSettlementDetailsRule.forSubscriptionMultipleOrder6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrder4> forSubscriptionMultipleOrder4 = new MMConstraint<SubscriptionMultipleOrder4>() {
		{
			validator = ConstraintBulkCashSettlementDetails1Rule::checkSubscriptionMultipleOrder4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails1Rule";
			definition = "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetailsRule.forSubscriptionMultipleOrder6);
			owner_lazy = () -> SubscriptionMultipleOrder4.mmObject();
		}
	};

	/**
	 * Either IndividualOrderDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkRedemptionMultipleOrder2(RedemptionMultipleOrder2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either IndividualOrderDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkRedemptionMultipleOrder3(RedemptionMultipleOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either IndividualOrderDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkRedemptionMultipleOrder4(RedemptionMultipleOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either IndividualOrderDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkSubscriptionMultipleOrder2(SubscriptionMultipleOrder2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either IndividualOrderDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkSubscriptionMultipleOrder3(SubscriptionMultipleOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either IndividualOrderDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkSubscriptionMultipleOrder4(SubscriptionMultipleOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}