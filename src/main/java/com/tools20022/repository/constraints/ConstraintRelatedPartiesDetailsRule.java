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
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.msg.*;

/**
 * Either RelatedPartiesDetails or
 * BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be
 * present, but not both.
 */
public class ConstraintRelatedPartiesDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01
	 * RedemptionBulkOrderConfirmationAmendmentV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationAmendmentV01> forRedemptionBulkOrderConfirmationAmendmentV01 = new MMConstraint<RedemptionBulkOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> RedemptionBulkOrderConfirmationAmendmentV01.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderConfirmationAmendmentV01 obj) throws Exception {
			checkRedemptionBulkOrderConfirmationAmendmentV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01
	 * RedemptionOrderConfirmationAmendmentV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationAmendmentV01> forRedemptionOrderConfirmationAmendmentV01 = new MMConstraint<RedemptionOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> RedemptionOrderConfirmationAmendmentV01.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrderConfirmationAmendmentV01 obj) throws Exception {
			checkRedemptionOrderConfirmationAmendmentV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01
	 * SubscriptionBulkOrderConfirmationAmendmentV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationAmendmentV01> forSubscriptionBulkOrderConfirmationAmendmentV01 = new MMConstraint<SubscriptionBulkOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionBulkOrderConfirmationAmendmentV01.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderConfirmationAmendmentV01 obj) throws Exception {
			checkSubscriptionBulkOrderConfirmationAmendmentV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01
	 * SubscriptionOrderConfirmationAmendmentV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationAmendmentV01> forSubscriptionOrderConfirmationAmendmentV01 = new MMConstraint<SubscriptionOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionOrderConfirmationAmendmentV01.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderConfirmationAmendmentV01 obj) throws Exception {
			checkSubscriptionOrderConfirmationAmendmentV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03
	 * RedemptionBulkOrderConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationV03> forRedemptionBulkOrderConfirmationV03 = new MMConstraint<RedemptionBulkOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> RedemptionBulkOrderConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderConfirmationV03 obj) throws Exception {
			checkRedemptionBulkOrderConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV03
	 * RedemptionBulkOrderV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or BulkOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderV03> forRedemptionBulkOrderV03 = new MMConstraint<RedemptionBulkOrderV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or BulkOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> RedemptionBulkOrderV03.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderV03 obj) throws Exception {
			checkRedemptionBulkOrderV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03
	 * RedemptionOrderConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationV03> forRedemptionOrderConfirmationV03 = new MMConstraint<RedemptionOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> RedemptionOrderConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrderConfirmationV03 obj) throws Exception {
			checkRedemptionOrderConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03
	 * RedemptionOrderV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or MultipleOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderV03> forRedemptionOrderV03 = new MMConstraint<RedemptionOrderV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or MultipleOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> RedemptionOrderV03.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrderV03 obj) throws Exception {
			checkRedemptionOrderV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03
	 * SubscriptionBulkOrderConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationV03> forSubscriptionBulkOrderConfirmationV03 = new MMConstraint<SubscriptionBulkOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionBulkOrderConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderConfirmationV03 obj) throws Exception {
			checkSubscriptionBulkOrderConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV03
	 * SubscriptionBulkOrderV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or BulkOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderV03> forSubscriptionBulkOrderV03 = new MMConstraint<SubscriptionBulkOrderV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or BulkOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionBulkOrderV03.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderV03 obj) throws Exception {
			checkSubscriptionBulkOrderV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03
	 * SubscriptionOrderConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationV03> forSubscriptionOrderConfirmationV03 = new MMConstraint<SubscriptionOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionOrderConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderConfirmationV03 obj) throws Exception {
			checkSubscriptionOrderConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03
	 * SubscriptionOrderV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or MultipleOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderV03> forSubscriptionOrderV03 = new MMConstraint<SubscriptionOrderV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or MultipleOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionOrderV03.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderV03 obj) throws Exception {
			checkSubscriptionOrderV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrderInstruction2
	 * RedemptionBulkOrderInstruction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or BulkOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderInstruction2> forRedemptionBulkOrderInstruction2 = new MMConstraint<RedemptionBulkOrderInstruction2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or BulkOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> RedemptionBulkOrderInstruction2.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderInstruction2 obj) throws Exception {
			checkRedemptionBulkOrderInstruction2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OrderConfirmationDetails1
	 * OrderConfirmationDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OrderConfirmationDetails1> forOrderConfirmationDetails1 = new MMConstraint<OrderConfirmationDetails1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> OrderConfirmationDetails1.mmObject();
		}

		@Override
		public void executeValidator(OrderConfirmationDetails1 obj) throws Exception {
			checkOrderConfirmationDetails1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2
	 * RedemptionMultipleOrderInstruction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or MultipleOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrderInstruction2> forRedemptionMultipleOrderInstruction2 = new MMConstraint<RedemptionMultipleOrderInstruction2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or MultipleOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> RedemptionMultipleOrderInstruction2.mmObject();
		}

		@Override
		public void executeValidator(RedemptionMultipleOrderInstruction2 obj) throws Exception {
			checkRedemptionMultipleOrderInstruction2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1
	 * RedemptionOrderConfirmation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmation1> forRedemptionOrderConfirmation1 = new MMConstraint<RedemptionOrderConfirmation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> RedemptionOrderConfirmation1.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrderConfirmation1 obj) throws Exception {
			checkRedemptionOrderConfirmation1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderInstruction2
	 * SubscriptionBulkOrderInstruction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or BulkOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderInstruction2> forSubscriptionBulkOrderInstruction2 = new MMConstraint<SubscriptionBulkOrderInstruction2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or BulkOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionBulkOrderInstruction2.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderInstruction2 obj) throws Exception {
			checkSubscriptionBulkOrderInstruction2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderConfirmation1
	 * SubscriptionBulkOrderConfirmation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmation1> forSubscriptionBulkOrderConfirmation1 = new MMConstraint<SubscriptionBulkOrderConfirmation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionBulkOrderConfirmation1.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderConfirmation1 obj) throws Exception {
			checkSubscriptionBulkOrderConfirmation1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction2
	 * SubscriptionMultipleOrderInstruction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or MultipleOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrderInstruction2> forSubscriptionMultipleOrderInstruction2 = new MMConstraint<SubscriptionMultipleOrderInstruction2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or MultipleOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionMultipleOrderInstruction2.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionMultipleOrderInstruction2 obj) throws Exception {
			checkSubscriptionMultipleOrderInstruction2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrderConfirmation1
	 * SubscriptionOrderConfirmation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartiesDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RelatedPartiesDetails or MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmation1> forSubscriptionOrderConfirmation1 = new MMConstraint<SubscriptionOrderConfirmation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartiesDetailsRule";
			definition = "Either RelatedPartiesDetails or MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionOrderConfirmation1.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderConfirmation1 obj) throws Exception {
			checkSubscriptionOrderConfirmation1(obj);
		}
	};

	/**
	 * Either RelatedPartiesDetails or
	 * BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may
	 * be present, but not both.
	 */
	public static void checkRedemptionBulkOrderConfirmationAmendmentV01(RedemptionBulkOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails
	 * may be present, but not both.
	 */
	public static void checkRedemptionOrderConfirmationAmendmentV01(RedemptionOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may
	 * be present, but not both.
	 */
	public static void checkSubscriptionBulkOrderConfirmationAmendmentV01(SubscriptionBulkOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails
	 * may be present, but not both.
	 */
	public static void checkSubscriptionOrderConfirmationAmendmentV01(SubscriptionOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may
	 * be present, but not both.
	 */
	public static void checkRedemptionBulkOrderConfirmationV03(RedemptionBulkOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * BulkOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be
	 * present, but not both.
	 */
	public static void checkRedemptionBulkOrderV03(RedemptionBulkOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails
	 * may be present, but not both.
	 */
	public static void checkRedemptionOrderConfirmationV03(RedemptionOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * MultipleOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be
	 * present, but not both.
	 */
	public static void checkRedemptionOrderV03(RedemptionOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may
	 * be present, but not both.
	 */
	public static void checkSubscriptionBulkOrderConfirmationV03(SubscriptionBulkOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * BulkOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be
	 * present, but not both.
	 */
	public static void checkSubscriptionBulkOrderV03(SubscriptionBulkOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails
	 * may be present, but not both.
	 */
	public static void checkSubscriptionOrderConfirmationV03(SubscriptionOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * MultipleOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be
	 * present, but not both.
	 */
	public static void checkSubscriptionOrderV03(SubscriptionOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * BulkOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be
	 * present, but not both.
	 */
	public static void checkRedemptionBulkOrderInstruction2(RedemptionBulkOrderInstruction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may
	 * be present, but not both.
	 */
	public static void checkOrderConfirmationDetails1(OrderConfirmationDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * MultipleOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be
	 * present, but not both.
	 */
	public static void checkRedemptionMultipleOrderInstruction2(RedemptionMultipleOrderInstruction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails
	 * may be present, but not both.
	 */
	public static void checkRedemptionOrderConfirmation1(RedemptionOrderConfirmation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * BulkOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be
	 * present, but not both.
	 */
	public static void checkSubscriptionBulkOrderInstruction2(SubscriptionBulkOrderInstruction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * BulkExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails may
	 * be present, but not both.
	 */
	public static void checkSubscriptionBulkOrderConfirmation1(SubscriptionBulkOrderConfirmation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * MultipleOrderDetails/IndividualOrderDetails/RelatedPartiesDetails may be
	 * present, but not both.
	 */
	public static void checkSubscriptionMultipleOrderInstruction2(SubscriptionMultipleOrderInstruction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either RelatedPartiesDetails or
	 * MultipleExecutionDetails/IndividualExecutionDetails/RelatedPartiesDetails
	 * may be present, but not both.
	 */
	public static void checkSubscriptionOrderConfirmation1(SubscriptionOrderConfirmation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}