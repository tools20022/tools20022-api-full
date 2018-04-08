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
 * Either IndividualExecutionDetails/CashSettlementDetails or
 * BulkCashSettlementDetails may be present, but not both.
 */
public class ConstraintBulkCashSettlementDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4
	 * SubscriptionBulkExecution4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails4Rule#forSubscriptionBulkExecution3
	 * ConstraintBulkCashSettlementDetails4Rule.forSubscriptionBulkExecution3}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkExecution4> forSubscriptionBulkExecution4 = new MMConstraint<SubscriptionBulkExecution4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetailsRule";
			definition = "Either IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails4Rule.forSubscriptionBulkExecution3;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either one or more occurrences of IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails1Rule#forSubscriptionMultipleOrder4
	 * ConstraintBulkCashSettlementDetails1Rule.forSubscriptionMultipleOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrder6> forSubscriptionMultipleOrder6 = new MMConstraint<SubscriptionMultipleOrder6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetailsRule";
			definition = "Either one or more occurrences of IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails1Rule.forSubscriptionMultipleOrder4;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either one or more occurrences of IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails1Rule#forRedemptionMultipleOrder4
	 * ConstraintBulkCashSettlementDetails1Rule.forRedemptionMultipleOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrder6> forRedemptionMultipleOrder6 = new MMConstraint<RedemptionMultipleOrder6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetailsRule";
			definition = "Either one or more occurrences of IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails1Rule.forRedemptionMultipleOrder4;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either one or more occurrences of IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails6Rule#forRedemptionBulkExecution3
	 * ConstraintBulkCashSettlementDetails6Rule.forRedemptionBulkExecution3}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkExecution5> forRedemptionBulkExecution5 = new MMConstraint<RedemptionBulkExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetailsRule";
			definition = "Either one or more occurrences of IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails6Rule.forRedemptionBulkExecution3;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either one or more occurrences of IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails2Rule#forRedemptionMultipleExecution3
	 * ConstraintBulkCashSettlementDetails2Rule.forRedemptionMultipleExecution3}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleExecution5> forRedemptionMultipleExecution5 = new MMConstraint<RedemptionMultipleExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetailsRule";
			definition = "Either one or more occurrences of IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails2Rule.forRedemptionMultipleExecution3;
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
	 * name} = "BulkCashSettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either one or more occurrences of IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails2Rule#forSubscriptionMultipleExecution3
	 * ConstraintBulkCashSettlementDetails2Rule.
	 * forSubscriptionMultipleExecution3}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleExecution5> forSubscriptionMultipleExecution5 = new MMConstraint<SubscriptionMultipleExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetailsRule";
			definition = "Either one or more occurrences of IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails2Rule.forSubscriptionMultipleExecution3;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails5Rule#forRedemptionBulkOrder4
	 * ConstraintBulkCashSettlementDetails5Rule.forRedemptionBulkOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrder6> forRedemptionBulkOrder6 = new MMConstraint<RedemptionBulkOrder6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetailsRule";
			definition = "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails5Rule.forRedemptionBulkOrder4;
			owner_lazy = () -> RedemptionBulkOrder6.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrder6 obj) throws Exception {
			checkRedemptionBulkOrder6(obj);
		}
	};

	/**
	 * Either IndividualExecutionDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkSubscriptionBulkExecution4(SubscriptionBulkExecution4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either one or more occurrences of
	 * IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails
	 * may be present, but not both.<br>
	 */
	public static void checkSubscriptionMultipleOrder6(SubscriptionMultipleOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either one or more occurrences of
	 * IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails
	 * may be present, but not both.
	 */
	public static void checkRedemptionMultipleOrder6(RedemptionMultipleOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either one or more occurrences of
	 * IndividualExecutionDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkRedemptionBulkExecution5(RedemptionBulkExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either one or more occurrences of
	 * IndividualExecutionDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkRedemptionMultipleExecution5(RedemptionMultipleExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either one or more occurrences of
	 * IndividualExecutionDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkSubscriptionMultipleExecution5(SubscriptionMultipleExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either IndividualOrderDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkRedemptionBulkOrder6(RedemptionBulkOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}