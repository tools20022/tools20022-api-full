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
import com.tools20022.repository.msg.RedemptionMultipleExecution2;
import com.tools20022.repository.msg.RedemptionMultipleExecution3;
import com.tools20022.repository.msg.SubscriptionMultipleExecution2;
import com.tools20022.repository.msg.SubscriptionMultipleExecution3;
import java.util.Arrays;

/**
 * If BulkCashSettlementDetails is present, then Currency in
 * IndividualExecutionDetails/Amount must be the same as
 * IndividualExecutionDetails/RequestedSettlementCurrency in all occurrences of
 * IndividualExecutionDetails.
 */
public class ConstraintSettlementCurrency4Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2
	 * RedemptionMultipleExecution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/Amount must be the same as IndividualExecutionDetails/RequestedSettlementCurrency in all occurrences of IndividualExecutionDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleExecution2> forRedemptionMultipleExecution2 = new MMConstraint<RedemptionMultipleExecution2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency4Rule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/Amount must be the same as IndividualExecutionDetails/RequestedSettlementCurrency in all occurrences of IndividualExecutionDetails.";
			owner_lazy = () -> RedemptionMultipleExecution2.mmObject();
		}

		@Override
		public void executeValidator(RedemptionMultipleExecution2 obj) throws Exception {
			checkRedemptionMultipleExecution2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/SettlementAmount must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrencyRule#forRedemptionMultipleExecution5
	 * ConstraintSettlementCurrencyRule.forRedemptionMultipleExecution5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleExecution3> forRedemptionMultipleExecution3 = new MMConstraint<RedemptionMultipleExecution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency4Rule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/SettlementAmount must be the same in all occurrences of IndividualOrderDetails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementCurrencyRule.forRedemptionMultipleExecution5);
			owner_lazy = () -> RedemptionMultipleExecution3.mmObject();
		}

		@Override
		public void executeValidator(RedemptionMultipleExecution3 obj) throws Exception {
			checkRedemptionMultipleExecution3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2
	 * SubscriptionMultipleExecution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/NetAmount and GrossAmount must be the same as IndividualExecutionDetails/RequestedSettlementCurrency in all occurrences of IndividualExecutionDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleExecution2> forSubscriptionMultipleExecution2 = new MMConstraint<SubscriptionMultipleExecution2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency4Rule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/NetAmount and GrossAmount must be the same as IndividualExecutionDetails/RequestedSettlementCurrency in all occurrences of IndividualExecutionDetails.";
			owner_lazy = () -> SubscriptionMultipleExecution2.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionMultipleExecution2 obj) throws Exception {
			checkSubscriptionMultipleExecution2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3
	 * SubscriptionMultipleExecution3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/SettlementAmount must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrencyRule#forSubscriptionMultipleExecution5
	 * ConstraintSettlementCurrencyRule.forSubscriptionMultipleExecution5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleExecution3> forSubscriptionMultipleExecution3 = new MMConstraint<SubscriptionMultipleExecution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency4Rule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/SettlementAmount must be the same in all occurrences of IndividualOrderDetails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementCurrencyRule.forSubscriptionMultipleExecution5);
			owner_lazy = () -> SubscriptionMultipleExecution3.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionMultipleExecution3 obj) throws Exception {
			checkSubscriptionMultipleExecution3(obj);
		}
	};

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualExecutionDetails/Amount must be the same as
	 * IndividualExecutionDetails/RequestedSettlementCurrency in all occurrences
	 * of IndividualExecutionDetails.
	 */
	public static void checkRedemptionMultipleExecution2(RedemptionMultipleExecution2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualExecutionDetails/SettlementAmount must be the same in all
	 * occurrences of IndividualOrderDetails.
	 */
	public static void checkRedemptionMultipleExecution3(RedemptionMultipleExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualExecutionDetails/NetAmount and GrossAmount must be the same as
	 * IndividualExecutionDetails/RequestedSettlementCurrency in all occurrences
	 * of IndividualExecutionDetails.
	 */
	public static void checkSubscriptionMultipleExecution2(SubscriptionMultipleExecution2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualExecutionDetails/SettlementAmount must be the same in all
	 * occurrences of IndividualOrderDetails.
	 */
	public static void checkSubscriptionMultipleExecution3(SubscriptionMultipleExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}