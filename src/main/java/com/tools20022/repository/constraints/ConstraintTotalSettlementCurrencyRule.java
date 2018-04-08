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
import com.tools20022.repository.msg.RedemptionMultipleExecution5;
import com.tools20022.repository.msg.SubscriptionMultipleExecution5;
import com.tools20022.repository.msg.SubscriptionMultipleOrder6;

/**
 * If TotalSettlementAmount is present, then Currency in
 * IndividualOrderDetails/SettlementAmount, if present, must be the same in all
 * occurrences of IndividualOrderDetails.
 */
public class ConstraintTotalSettlementCurrencyRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6
	 * SubscriptionMultipleOrder6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalSettlementCurrency Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TotalSettlementAmount is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrder6> forSubscriptionMultipleOrder6 = new MMConstraint<SubscriptionMultipleOrder6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalSettlementCurrency Rule";
			definition = "If TotalSettlementAmount is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails.";
			owner_lazy = () -> SubscriptionMultipleOrder6.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionMultipleOrder6 obj) throws Exception {
			checkSubscriptionMultipleOrder6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
	 * RedemptionMultipleExecution5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalSettlementCurrency Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TotalSettlementAmount is present, then Currency in IndividualExecutionDetails/SettlementAmount, must be the same in all occurrences of IndividualExecutionDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleExecution5> forRedemptionMultipleExecution5 = new MMConstraint<RedemptionMultipleExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalSettlementCurrency Rule";
			definition = "If TotalSettlementAmount is present, then Currency in IndividualExecutionDetails/SettlementAmount, must be the same in all occurrences of IndividualExecutionDetails.";
			owner_lazy = () -> RedemptionMultipleExecution5.mmObject();
		}

		@Override
		public void executeValidator(RedemptionMultipleExecution5 obj) throws Exception {
			checkRedemptionMultipleExecution5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5
	 * SubscriptionMultipleExecution5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalSettlementCurrency Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TotalSettlementAmount is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleExecution5> forSubscriptionMultipleExecution5 = new MMConstraint<SubscriptionMultipleExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalSettlementCurrency Rule";
			definition = "If TotalSettlementAmount is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails.";
			owner_lazy = () -> SubscriptionMultipleExecution5.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionMultipleExecution5 obj) throws Exception {
			checkSubscriptionMultipleExecution5(obj);
		}
	};

	/**
	 * If TotalSettlementAmount is present, then Currency in
	 * IndividualOrderDetails/SettlementAmount, if present, must be the same in
	 * all occurrences of IndividualOrderDetails.
	 */
	public static void checkSubscriptionMultipleOrder6(SubscriptionMultipleOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TotalSettlementAmount is present, then Currency in
	 * IndividualExecutionDetails/SettlementAmount, must be the same in all
	 * occurrences of IndividualExecutionDetails.
	 */
	public static void checkRedemptionMultipleExecution5(RedemptionMultipleExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TotalSettlementAmount is present, then Currency in
	 * IndividualOrderDetails/SettlementAmount, if present, must be the same in
	 * all occurrences of IndividualOrderDetails.
	 */
	public static void checkSubscriptionMultipleExecution5(SubscriptionMultipleExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}