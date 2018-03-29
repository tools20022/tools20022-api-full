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
import com.tools20022.repository.msg.OrderConfirmationDetails1;
import com.tools20022.repository.msg.RedemptionOrderConfirmation1;
import com.tools20022.repository.msg.SubscriptionBulkOrderConfirmation1;
import com.tools20022.repository.msg.SubscriptionOrderConfirmation1;
import java.util.Arrays;

/**
 * If this message is not solicited by the receiver, then the value of the
 * OrderReference element in every occurrence of
 * BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
 */
public class ConstraintOrderReferenceRule {

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
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationAmendmentV01> forRedemptionBulkOrderConfirmationAmendmentV01 = new MMConstraint<RedemptionBulkOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
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
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationAmendmentV01> forRedemptionOrderConfirmationAmendmentV01 = new MMConstraint<RedemptionOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
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
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationAmendmentV01> forSubscriptionBulkOrderConfirmationAmendmentV01 = new MMConstraint<SubscriptionBulkOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
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
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationAmendmentV01> forSubscriptionOrderConfirmationAmendmentV01 = new MMConstraint<SubscriptionOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
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
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04
	 * SubscriptionBulkOrderConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderReferenceRule#forSubscriptionBulkOrderConfirmationV03
	 * ConstraintOrderReferenceRule.forSubscriptionBulkOrderConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationV04> forSubscriptionBulkOrderConfirmationV04 = new MMConstraint<SubscriptionBulkOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderReferenceRule.forSubscriptionBulkOrderConfirmationV03;
			owner_lazy = () -> SubscriptionBulkOrderConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderConfirmationV04 obj) throws Exception {
			checkSubscriptionBulkOrderConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04
	 * RedemptionBulkOrderConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderReferenceRule#forRedemptionBulkOrderConfirmationV03
	 * ConstraintOrderReferenceRule.forRedemptionBulkOrderConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationV04> forRedemptionBulkOrderConfirmationV04 = new MMConstraint<RedemptionBulkOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderReferenceRule.forRedemptionBulkOrderConfirmationV03;
			owner_lazy = () -> RedemptionBulkOrderConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderConfirmationV04 obj) throws Exception {
			checkRedemptionBulkOrderConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04
	 * SubscriptionOrderConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderReferenceRule#forSubscriptionOrderConfirmationV03
	 * ConstraintOrderReferenceRule.forSubscriptionOrderConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationV04> forSubscriptionOrderConfirmationV04 = new MMConstraint<SubscriptionOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderReferenceRule.forSubscriptionOrderConfirmationV03;
			owner_lazy = () -> SubscriptionOrderConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderConfirmationV04 obj) throws Exception {
			checkSubscriptionOrderConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04
	 * RedemptionOrderConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderReferenceRule#forRedemptionOrderConfirmationV03
	 * ConstraintOrderReferenceRule.forRedemptionOrderConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationV04> forRedemptionOrderConfirmationV04 = new MMConstraint<RedemptionOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderReferenceRule.forRedemptionOrderConfirmationV03;
			owner_lazy = () -> RedemptionOrderConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrderConfirmationV04 obj) throws Exception {
			checkRedemptionOrderConfirmationV04(obj);
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
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderReferenceRule#forRedemptionBulkOrderConfirmationV04
	 * ConstraintOrderReferenceRule.forRedemptionBulkOrderConfirmationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationV03> forRedemptionBulkOrderConfirmationV03 = new MMConstraint<RedemptionBulkOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderReferenceRule.forRedemptionBulkOrderConfirmationV04);
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
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03
	 * RedemptionOrderConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderReferenceRule#forRedemptionOrderConfirmationV04
	 * ConstraintOrderReferenceRule.forRedemptionOrderConfirmationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationV03> forRedemptionOrderConfirmationV03 = new MMConstraint<RedemptionOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderReferenceRule.forRedemptionOrderConfirmationV04);
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
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03
	 * SubscriptionBulkOrderConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderReferenceRule#forSubscriptionBulkOrderConfirmationV04
	 * ConstraintOrderReferenceRule.forSubscriptionBulkOrderConfirmationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationV03> forSubscriptionBulkOrderConfirmationV03 = new MMConstraint<SubscriptionBulkOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderReferenceRule.forSubscriptionBulkOrderConfirmationV04);
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
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03
	 * SubscriptionOrderConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderReferenceRule#forSubscriptionOrderConfirmationV04
	 * ConstraintOrderReferenceRule.forSubscriptionOrderConfirmationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationV03> forSubscriptionOrderConfirmationV03 = new MMConstraint<SubscriptionOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderReferenceRule.forSubscriptionOrderConfirmationV04);
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
	 * {@linkplain com.tools20022.repository.msg.OrderConfirmationDetails1
	 * OrderConfirmationDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OrderConfirmationDetails1> forOrderConfirmationDetails1 = new MMConstraint<OrderConfirmationDetails1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If the confirmation message was not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1
	 * RedemptionOrderConfirmation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmation1> forRedemptionOrderConfirmation1 = new MMConstraint<RedemptionOrderConfirmation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If the confirmation message was not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderConfirmation1
	 * SubscriptionBulkOrderConfirmation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmation1> forSubscriptionBulkOrderConfirmation1 = new MMConstraint<SubscriptionBulkOrderConfirmation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrderConfirmation1
	 * SubscriptionOrderConfirmation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmation1> forSubscriptionOrderConfirmation1 = new MMConstraint<SubscriptionOrderConfirmation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If the confirmation message was not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
			owner_lazy = () -> SubscriptionOrderConfirmation1.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderConfirmation1 obj) throws Exception {
			checkSubscriptionOrderConfirmation1(obj);
		}
	};

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkRedemptionBulkOrderConfirmationAmendmentV01(RedemptionBulkOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkRedemptionOrderConfirmationAmendmentV01(RedemptionOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkSubscriptionBulkOrderConfirmationAmendmentV01(SubscriptionBulkOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkSubscriptionOrderConfirmationAmendmentV01(SubscriptionOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkSubscriptionBulkOrderConfirmationV04(SubscriptionBulkOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkRedemptionBulkOrderConfirmationV04(RedemptionBulkOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkSubscriptionOrderConfirmationV04(SubscriptionOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkRedemptionOrderConfirmationV04(RedemptionOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkRedemptionBulkOrderConfirmationV03(RedemptionBulkOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkRedemptionOrderConfirmationV03(RedemptionOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkSubscriptionBulkOrderConfirmationV03(SubscriptionBulkOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkSubscriptionOrderConfirmationV03(SubscriptionOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation message was not solicited by the receiver, then the
	 * value of the OrderReference element in every occurrence of
	 * BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkOrderConfirmationDetails1(OrderConfirmationDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation message was not solicited by the receiver, then the
	 * value of the OrderReference element in every occurrence of
	 * MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkRedemptionOrderConfirmation1(RedemptionOrderConfirmation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkSubscriptionBulkOrderConfirmation1(SubscriptionBulkOrderConfirmation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation message was not solicited by the receiver, then the
	 * value of the OrderReference element in every occurrence of
	 * MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void checkSubscriptionOrderConfirmation1(SubscriptionOrderConfirmation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}