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
 * Either CashSettlementDate is present or all occurrences of
 * IndividualExecutionDetails/CashSettlementDate are present, but not both.
 */
public class ConstraintCashSettlementDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3
	 * SubscriptionMultipleExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CashSettlementDate is present or all occurrences of IndividualExecutionDetails/CashSettlementDate are present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleExecution3> forSubscriptionMultipleExecution3 = new MMConstraint<SubscriptionMultipleExecution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDateRule";
			definition = "Either CashSettlementDate is present or all occurrences of IndividualExecutionDetails/CashSettlementDate are present, but not both.";
			owner_lazy = () -> SubscriptionMultipleExecution3.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionMultipleExecution3 obj) throws Exception {
			checkSubscriptionMultipleExecution3(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CashSettlementDate is present or all occurrences of IndividualExecutionDetails/CashSettlementDate are present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleExecution3> forRedemptionMultipleExecution3 = new MMConstraint<RedemptionMultipleExecution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDateRule";
			definition = "Either CashSettlementDate is present or all occurrences of IndividualExecutionDetails/CashSettlementDate are present, but not both.";
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3
	 * RedemptionMultipleOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrder3> forRedemptionMultipleOrder3 = new MMConstraint<RedemptionMultipleOrder3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDateRule";
			definition = "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both.";
			owner_lazy = () -> RedemptionMultipleOrder3.mmObject();
		}

		@Override
		public void executeValidator(RedemptionMultipleOrder3 obj) throws Exception {
			checkRedemptionMultipleOrder3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4
	 * SubscriptionBulkOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrder4> forSubscriptionBulkOrder4 = new MMConstraint<SubscriptionBulkOrder4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDateRule";
			definition = "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both.";
			owner_lazy = () -> SubscriptionBulkOrder4.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrder4 obj) throws Exception {
			checkSubscriptionBulkOrder4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3
	 * RedemptionBulkOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrder3> forRedemptionBulkOrder3 = new MMConstraint<RedemptionBulkOrder3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDateRule";
			definition = "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both.";
			owner_lazy = () -> RedemptionBulkOrder3.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrder3 obj) throws Exception {
			checkRedemptionBulkOrder3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CashSettlementDate is present or all occurrences of IndividualExecutionDetails/CashSettlementDate are present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkExecution3> forRedemptionBulkExecution3 = new MMConstraint<RedemptionBulkExecution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDateRule";
			definition = "Either CashSettlementDate is present or all occurrences of IndividualExecutionDetails/CashSettlementDate are present, but not both.";
			owner_lazy = () -> RedemptionBulkExecution3.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkExecution3 obj) throws Exception {
			checkRedemptionBulkExecution3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3
	 * SubscriptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CashSettlementDate is present or all occurrences of IndividualExecutionDetails/CashSettlementDate are present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkExecution3> forSubscriptionBulkExecution3 = new MMConstraint<SubscriptionBulkExecution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDateRule";
			definition = "Either CashSettlementDate is present or all occurrences of IndividualExecutionDetails/CashSettlementDate are present, but not both.";
			owner_lazy = () -> SubscriptionBulkExecution3.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkExecution3 obj) throws Exception {
			checkSubscriptionBulkExecution3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3
	 * SubscriptionBulkOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrder3> forSubscriptionBulkOrder3 = new MMConstraint<SubscriptionBulkOrder3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDateRule";
			definition = "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both.";
			owner_lazy = () -> SubscriptionBulkOrder3.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrder3 obj) throws Exception {
			checkSubscriptionBulkOrder3(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrder3> forSubscriptionMultipleOrder3 = new MMConstraint<SubscriptionMultipleOrder3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDateRule";
			definition = "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both.";
			owner_lazy = () -> SubscriptionMultipleOrder3.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionMultipleOrder3 obj) throws Exception {
			checkSubscriptionMultipleOrder3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4
	 * RedemptionBulkOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrder4> forRedemptionBulkOrder4 = new MMConstraint<RedemptionBulkOrder4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDateRule";
			definition = "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both.";
			owner_lazy = () -> RedemptionBulkOrder4.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrder4 obj) throws Exception {
			checkRedemptionBulkOrder4(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrder4> forSubscriptionMultipleOrder4 = new MMConstraint<SubscriptionMultipleOrder4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDateRule";
			definition = "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both.";
			owner_lazy = () -> SubscriptionMultipleOrder4.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionMultipleOrder4 obj) throws Exception {
			checkSubscriptionMultipleOrder4(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrder4> forRedemptionMultipleOrder4 = new MMConstraint<RedemptionMultipleOrder4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDateRule";
			definition = "Either CashSettlementDate is present or all occurrences of IndividualOrderDetails/CashSettlementDate are present, but not both.";
			owner_lazy = () -> RedemptionMultipleOrder4.mmObject();
		}

		@Override
		public void executeValidator(RedemptionMultipleOrder4 obj) throws Exception {
			checkRedemptionMultipleOrder4(obj);
		}
	};

	/**
	 * Either CashSettlementDate is present or all occurrences of
	 * IndividualExecutionDetails/CashSettlementDate are present, but not both.
	 */
	public static void checkSubscriptionMultipleExecution3(SubscriptionMultipleExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either CashSettlementDate is present or all occurrences of
	 * IndividualExecutionDetails/CashSettlementDate are present, but not both.
	 */
	public static void checkRedemptionMultipleExecution3(RedemptionMultipleExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either CashSettlementDate is present or all occurrences of
	 * IndividualOrderDetails/CashSettlementDate are present, but not both.
	 */
	public static void checkRedemptionMultipleOrder3(RedemptionMultipleOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either CashSettlementDate is present or all occurrences of
	 * IndividualOrderDetails/CashSettlementDate are present, but not both.
	 */
	public static void checkSubscriptionBulkOrder4(SubscriptionBulkOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either CashSettlementDate is present or all occurrences of
	 * IndividualOrderDetails/CashSettlementDate are present, but not both.
	 */
	public static void checkRedemptionBulkOrder3(RedemptionBulkOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either CashSettlementDate is present or all occurrences of
	 * IndividualExecutionDetails/CashSettlementDate are present, but not both.
	 */
	public static void checkRedemptionBulkExecution3(RedemptionBulkExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either CashSettlementDate is present or all occurrences of
	 * IndividualExecutionDetails/CashSettlementDate are present, but not both.
	 */
	public static void checkSubscriptionBulkExecution3(SubscriptionBulkExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either CashSettlementDate is present or all occurrences of
	 * IndividualOrderDetails/CashSettlementDate are present, but not both.
	 */
	public static void checkSubscriptionBulkOrder3(SubscriptionBulkOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either CashSettlementDate is present or all occurrences of
	 * IndividualOrderDetails/CashSettlementDate are present, but not both.
	 */
	public static void checkSubscriptionMultipleOrder3(SubscriptionMultipleOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either CashSettlementDate is present or all occurrences of
	 * IndividualOrderDetails/CashSettlementDate are present, but not both.
	 */
	public static void checkRedemptionBulkOrder4(RedemptionBulkOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either CashSettlementDate is present or all occurrences of
	 * IndividualOrderDetails/CashSettlementDate are present, but not both.
	 */
	public static void checkSubscriptionMultipleOrder4(SubscriptionMultipleOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either CashSettlementDate is present or all occurrences of
	 * IndividualOrderDetails/CashSettlementDate are present, but not both.
	 */
	public static void checkRedemptionMultipleOrder4(RedemptionMultipleOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}