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
 * If BulkCashSettlementDetails is present, then Currency in
 * IndividualExecutionDetails/SettlementAmount must be the same in all
 * occurrences of IndividualExecutionDetails.
 */
public class ConstraintSettlementCurrencyRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4
	 * SubscriptionBulkExecution4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/SettlementAmount must be the same in all occurrences of IndividualExecutionDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrency3Rule#forSubscriptionBulkExecution3
	 * ConstraintSettlementCurrency3Rule.forSubscriptionBulkExecution3}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkExecution4> forSubscriptionBulkExecution4 = new MMConstraint<SubscriptionBulkExecution4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrencyRule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/SettlementAmount must be the same in all occurrences of IndividualExecutionDetails.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementCurrency3Rule.forSubscriptionBulkExecution3;
			owner_lazy = () -> SubscriptionBulkExecution4.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkExecution4 obj) throws Exception {
			checkSubscriptionBulkExecution4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6
	 * SubscriptionMultipleOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrency5Rule#forSubscriptionMultipleOrder4
	 * ConstraintSettlementCurrency5Rule.forSubscriptionMultipleOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrder6> forSubscriptionMultipleOrder6 = new MMConstraint<SubscriptionMultipleOrder6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrencyRule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementCurrency5Rule.forSubscriptionMultipleOrder4;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
	 * RedemptionMultipleOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrency5Rule#forRedemptionMultipleOrder4
	 * ConstraintSettlementCurrency5Rule.forRedemptionMultipleOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrder6> forRedemptionMultipleOrder6 = new MMConstraint<RedemptionMultipleOrder6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrencyRule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementCurrency5Rule.forRedemptionMultipleOrder4;
			owner_lazy = () -> RedemptionMultipleOrder6.mmObject();
		}

		@Override
		public void executeValidator(RedemptionMultipleOrder6 obj) throws Exception {
			checkRedemptionMultipleOrder6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5
	 * RedemptionBulkExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/SettlementAmount must be the same in all occurrences of IndividualExecutionDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrency1Rule#forRedemptionBulkExecution3
	 * ConstraintSettlementCurrency1Rule.forRedemptionBulkExecution3}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkExecution5> forRedemptionBulkExecution5 = new MMConstraint<RedemptionBulkExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrencyRule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/SettlementAmount must be the same in all occurrences of IndividualExecutionDetails.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementCurrency1Rule.forRedemptionBulkExecution3;
			owner_lazy = () -> RedemptionBulkExecution5.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkExecution5 obj) throws Exception {
			checkRedemptionBulkExecution5(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/SettlementAmount must be the same in all occurrences of IndividualExecutionDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrency4Rule#forRedemptionMultipleExecution3
	 * ConstraintSettlementCurrency4Rule.forRedemptionMultipleExecution3}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleExecution5> forRedemptionMultipleExecution5 = new MMConstraint<RedemptionMultipleExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrencyRule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/SettlementAmount must be the same in all occurrences of IndividualExecutionDetails.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementCurrency4Rule.forRedemptionMultipleExecution3;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/SettlementAmount must be the same in all occurrences of IndividualExecutionDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrency4Rule#forSubscriptionMultipleExecution3
	 * ConstraintSettlementCurrency4Rule.forSubscriptionMultipleExecution3}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleExecution5> forSubscriptionMultipleExecution5 = new MMConstraint<SubscriptionMultipleExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrencyRule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/SettlementAmount must be the same in all occurrences of IndividualExecutionDetails.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementCurrency4Rule.forSubscriptionMultipleExecution3;
			owner_lazy = () -> SubscriptionMultipleExecution5.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionMultipleExecution5 obj) throws Exception {
			checkSubscriptionMultipleExecution5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6
	 * RedemptionBulkOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrency2Rule#forRedemptionBulkOrder4
	 * ConstraintSettlementCurrency2Rule.forRedemptionBulkOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrder6> forRedemptionBulkOrder6 = new MMConstraint<RedemptionBulkOrder6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrencyRule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementCurrency2Rule.forRedemptionBulkOrder4;
			owner_lazy = () -> RedemptionBulkOrder6.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrder6 obj) throws Exception {
			checkRedemptionBulkOrder6(obj);
		}
	};

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualExecutionDetails/SettlementAmount must be the same in all
	 * occurrences of IndividualExecutionDetails.
	 */
	public static void checkSubscriptionBulkExecution4(SubscriptionBulkExecution4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualOrderDetails/SettlementAmount, if present, must be the same in
	 * all occurrences of IndividualOrderDetails.
	 */
	public static void checkSubscriptionMultipleOrder6(SubscriptionMultipleOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualOrderDetails/SettlementAmount, if present, must be the same in
	 * all occurrences of IndividualOrderDetails.
	 */
	public static void checkRedemptionMultipleOrder6(RedemptionMultipleOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualExecutionDetails/SettlementAmount must be the same in all
	 * occurrences of IndividualExecutionDetails.
	 */
	public static void checkRedemptionBulkExecution5(RedemptionBulkExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualExecutionDetails/SettlementAmount must be the same in all
	 * occurrences of IndividualExecutionDetails.
	 */
	public static void checkRedemptionMultipleExecution5(RedemptionMultipleExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualExecutionDetails/SettlementAmount must be the same in all
	 * occurrences of IndividualExecutionDetails.
	 */
	public static void checkSubscriptionMultipleExecution5(SubscriptionMultipleExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualOrderDetails/SettlementAmount, if present, must be the same in
	 * all occurrences of IndividualOrderDetails.
	 */
	public static void checkRedemptionBulkOrder6(RedemptionBulkOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}