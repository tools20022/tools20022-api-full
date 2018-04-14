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
import java.util.Arrays;

/**
 * If this message is linked to an account opening request and the account
 * identification is not yet known then the value of the AccountIdentification
 * element in SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
 */
public class ConstraintAccountIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03
	 * SwitchOrderConfirmationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmationV03> for_setr_SwitchOrderConfirmationV03 = new MMConstraint<SwitchOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SwitchOrderConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderConfirmationV03 obj) throws Exception {
			check_setr_SwitchOrderConfirmationV03(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationAmendmentV01> for_setr_SubscriptionBulkOrderConfirmationAmendmentV01 = new MMConstraint<SubscriptionBulkOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionBulkOrderConfirmationAmendmentV01.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderConfirmationAmendmentV01 obj) throws Exception {
			check_setr_SubscriptionBulkOrderConfirmationAmendmentV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04
	 * RedemptionOrderV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_RedemptionOrderV03
	 * ConstraintAccountIdentificationRule.for_setr_RedemptionOrderV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderV04> for_setr_RedemptionOrderV04 = new MMConstraint<RedemptionOrderV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_RedemptionOrderV03;
			owner_lazy = () -> RedemptionOrderV04.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrderV04 obj) throws Exception {
			check_setr_RedemptionOrderV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03
	 * SwitchOrderCancellationRequestV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderDetails/SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderCancellationRequestV03> for_setr_SwitchOrderCancellationRequestV03 = new MMConstraint<SwitchOrderCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderDetails/SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SwitchOrderCancellationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderCancellationRequestV03 obj) throws Exception {
			check_setr_SwitchOrderCancellationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02
	 * SubscriptionBulkOrderConfirmationV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationV02> for_setr_SubscriptionBulkOrderConfirmationV02 = new MMConstraint<SubscriptionBulkOrderConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionBulkOrderConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderConfirmationV02 obj) throws Exception {
			check_setr_SubscriptionBulkOrderConfirmationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02
	 * RedemptionMultipleOrderConfirmationV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrderConfirmationV02> for_setr_RedemptionMultipleOrderConfirmationV02 = new MMConstraint<RedemptionMultipleOrderConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionMultipleOrderConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(RedemptionMultipleOrderConfirmationV02 obj) throws Exception {
			check_setr_RedemptionMultipleOrderConfirmationV02(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_RedemptionBulkOrderConfirmationV04
	 * ConstraintAccountIdentificationRule.
	 * for_setr_RedemptionBulkOrderConfirmationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationV03> for_setr_RedemptionBulkOrderConfirmationV03 = new MMConstraint<RedemptionBulkOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_RedemptionBulkOrderConfirmationV04);
			owner_lazy = () -> RedemptionBulkOrderConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderConfirmationV03 obj) throws Exception {
			check_setr_RedemptionBulkOrderConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV04
	 * SubscriptionBulkOrderV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_SubscriptionBulkOrderV03
	 * ConstraintAccountIdentificationRule.for_setr_SubscriptionBulkOrderV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderV04> for_setr_SubscriptionBulkOrderV04 = new MMConstraint<SubscriptionBulkOrderV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_SubscriptionBulkOrderV03;
			owner_lazy = () -> SubscriptionBulkOrderV04.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderV04 obj) throws Exception {
			check_setr_SubscriptionBulkOrderV04(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_SubscriptionOrderConfirmationV03
	 * ConstraintAccountIdentificationRule.
	 * for_setr_SubscriptionOrderConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationV04> for_setr_SubscriptionOrderConfirmationV04 = new MMConstraint<SubscriptionOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_SubscriptionOrderConfirmationV03;
			owner_lazy = () -> SubscriptionOrderConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderConfirmationV04 obj) throws Exception {
			check_setr_SubscriptionOrderConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02
	 * SubscriptionMultipleOrderConfirmationV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrderConfirmationV02> for_setr_SubscriptionMultipleOrderConfirmationV02 = new MMConstraint<SubscriptionMultipleOrderConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionMultipleOrderConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionMultipleOrderConfirmationV02 obj) throws Exception {
			check_setr_SubscriptionMultipleOrderConfirmationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01
	 * SubscriptionOrderConfirmationCancellationInstructionV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationCancellationInstructionV01> for_setr_SubscriptionOrderConfirmationCancellationInstructionV01 = new MMConstraint<SubscriptionOrderConfirmationCancellationInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present.";
			owner_lazy = () -> SubscriptionOrderConfirmationCancellationInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderConfirmationCancellationInstructionV01 obj) throws Exception {
			check_setr_SubscriptionOrderConfirmationCancellationInstructionV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderV02
	 * RedemptionMultipleOrderV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrderV02> for_setr_RedemptionMultipleOrderV02 = new MMConstraint<RedemptionMultipleOrderV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionMultipleOrderV02.mmObject();
		}

		@Override
		public void executeValidator(RedemptionMultipleOrderV02 obj) throws Exception {
			check_setr_RedemptionMultipleOrderV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55
	 * InvestmentAccount55}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forInvestmentAccount57
	 * ConstraintAccountIdentificationRule.forInvestmentAccount57}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forInvestmentAccount65
	 * ConstraintAccountIdentificationRule.forInvestmentAccount65}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forInvestmentAccount41
	 * ConstraintAccountIdentificationRule.forInvestmentAccount41}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount55> forInvestmentAccount55 = new MMConstraint<InvestmentAccount55>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount57,
					com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount65);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount41;
			owner_lazy = () -> InvestmentAccount55.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount55 obj) throws Exception {
			checkInvestmentAccount55(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV02
	 * SwitchOrderConfirmationV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmationV02> for_setr_SwitchOrderConfirmationV02 = new MMConstraint<SwitchOrderConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SwitchOrderConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderConfirmationV02 obj) throws Exception {
			check_setr_SwitchOrderConfirmationV02(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationAmendmentV01> for_setr_RedemptionOrderConfirmationAmendmentV01 = new MMConstraint<RedemptionOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionOrderConfirmationAmendmentV01.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrderConfirmationAmendmentV01 obj) throws Exception {
			check_setr_RedemptionOrderConfirmationAmendmentV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02
	 * SwitchOrderCancellationInstructionV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderCancellationInstructionV02> for_setr_SwitchOrderCancellationInstructionV02 = new MMConstraint<SwitchOrderCancellationInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SwitchOrderCancellationInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderCancellationInstructionV02 obj) throws Exception {
			check_setr_SwitchOrderCancellationInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV02
	 * SwitchOrderV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderV02> for_setr_SwitchOrderV02 = new MMConstraint<SwitchOrderV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SwitchOrderV02.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderV02 obj) throws Exception {
			check_setr_SwitchOrderV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24
	 * InvestmentAccount24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forInvestmentAccount41
	 * ConstraintAccountIdentificationRule.forInvestmentAccount41}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount24> forInvestmentAccount24 = new MMConstraint<InvestmentAccount24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount41);
			owner_lazy = () -> InvestmentAccount24.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount24 obj) throws Exception {
			checkInvestmentAccount24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03
	 * SubscriptionOrderCancellationRequestV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderDetails/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderCancellationRequestV03> for_setr_SubscriptionOrderCancellationRequestV03 = new MMConstraint<SubscriptionOrderCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderDetails/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionOrderCancellationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderCancellationRequestV03 obj) throws Exception {
			check_setr_SubscriptionOrderCancellationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount68
	 * InvestmentAccount68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forInvestmentAccount57
	 * ConstraintAccountIdentificationRule.forInvestmentAccount57}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount68> forInvestmentAccount68 = new MMConstraint<InvestmentAccount68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount57;
			owner_lazy = () -> InvestmentAccount68.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount68 obj) throws Exception {
			checkInvestmentAccount68(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03
	 * RedemptionBulkOrderCancellationRequestV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderCancellationRequestV03> for_setr_RedemptionBulkOrderCancellationRequestV03 = new MMConstraint<RedemptionBulkOrderCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionBulkOrderCancellationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderCancellationRequestV03 obj) throws Exception {
			check_setr_RedemptionBulkOrderCancellationRequestV03(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_RedemptionBulkOrderConfirmationV03
	 * ConstraintAccountIdentificationRule.
	 * for_setr_RedemptionBulkOrderConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationV04> for_setr_RedemptionBulkOrderConfirmationV04 = new MMConstraint<RedemptionBulkOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_RedemptionBulkOrderConfirmationV03;
			owner_lazy = () -> RedemptionBulkOrderConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderConfirmationV04 obj) throws Exception {
			check_setr_RedemptionBulkOrderConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02
	 * RedemptionBulkOrderConfirmationV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationV02> for_setr_RedemptionBulkOrderConfirmationV02 = new MMConstraint<RedemptionBulkOrderConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionBulkOrderConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderConfirmationV02 obj) throws Exception {
			check_setr_RedemptionBulkOrderConfirmationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01
	 * RedemptionOrderConfirmationCancellationInstructionV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationCancellationInstructionV01> for_setr_RedemptionOrderConfirmationCancellationInstructionV01 = new MMConstraint<RedemptionOrderConfirmationCancellationInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present.";
			owner_lazy = () -> RedemptionOrderConfirmationCancellationInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrderConfirmationCancellationInstructionV01 obj) throws Exception {
			check_setr_RedemptionOrderConfirmationCancellationInstructionV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderCancellationInstructionV02
	 * RedemptionMultipleOrderCancellationInstructionV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrderCancellationInstructionV02> for_setr_RedemptionMultipleOrderCancellationInstructionV02 = new MMConstraint<RedemptionMultipleOrderCancellationInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionMultipleOrderCancellationInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(RedemptionMultipleOrderCancellationInstructionV02 obj) throws Exception {
			check_setr_RedemptionMultipleOrderCancellationInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03
	 * SubscriptionBulkOrderCancellationRequestV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderCancellationRequestV03> for_setr_SubscriptionBulkOrderCancellationRequestV03 = new MMConstraint<SubscriptionBulkOrderCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionBulkOrderCancellationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderCancellationRequestV03 obj) throws Exception {
			check_setr_SubscriptionBulkOrderCancellationRequestV03(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_SubscriptionBulkOrderV04
	 * ConstraintAccountIdentificationRule.for_setr_SubscriptionBulkOrderV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderV03> for_setr_SubscriptionBulkOrderV03 = new MMConstraint<SubscriptionBulkOrderV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_SubscriptionBulkOrderV04);
			owner_lazy = () -> SubscriptionBulkOrderV03.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderV03 obj) throws Exception {
			check_setr_SubscriptionBulkOrderV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01
	 * SwitchOrderConfirmationAmendmentV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmationAmendmentV01> for_setr_SwitchOrderConfirmationAmendmentV01 = new MMConstraint<SwitchOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SwitchOrderConfirmationAmendmentV01.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderConfirmationAmendmentV01 obj) throws Exception {
			check_setr_SwitchOrderConfirmationAmendmentV01(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_RedemptionOrderV04
	 * ConstraintAccountIdentificationRule.for_setr_RedemptionOrderV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderV03> for_setr_RedemptionOrderV03 = new MMConstraint<RedemptionOrderV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_RedemptionOrderV04);
			owner_lazy = () -> RedemptionOrderV03.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrderV03 obj) throws Exception {
			check_setr_RedemptionOrderV03(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_SubscriptionBulkOrderConfirmationV03
	 * ConstraintAccountIdentificationRule.
	 * for_setr_SubscriptionBulkOrderConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationV04> for_setr_SubscriptionBulkOrderConfirmationV04 = new MMConstraint<SubscriptionBulkOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_SubscriptionBulkOrderConfirmationV03;
			owner_lazy = () -> SubscriptionBulkOrderConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderConfirmationV04 obj) throws Exception {
			check_setr_SubscriptionBulkOrderConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationInstructionV02
	 * SubscriptionBulkOrderCancellationInstructionV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderCancellationInstructionV02> for_setr_SubscriptionBulkOrderCancellationInstructionV02 = new MMConstraint<SubscriptionBulkOrderCancellationInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionBulkOrderCancellationInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderCancellationInstructionV02 obj) throws Exception {
			check_setr_SubscriptionBulkOrderCancellationInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03
	 * RedemptionOrderCancellationRequestV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderCancellationRequestV03> for_setr_RedemptionOrderCancellationRequestV03 = new MMConstraint<RedemptionOrderCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionOrderCancellationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrderCancellationRequestV03 obj) throws Exception {
			check_setr_RedemptionOrderCancellationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03
	 * SwitchOrderV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderV03> for_setr_SwitchOrderV03 = new MMConstraint<SwitchOrderV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SwitchOrderV03.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderV03 obj) throws Exception {
			check_setr_SwitchOrderV03(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_RedemptionOrderConfirmationV03
	 * ConstraintAccountIdentificationRule.
	 * for_setr_RedemptionOrderConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationV04> for_setr_RedemptionOrderConfirmationV04 = new MMConstraint<RedemptionOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_RedemptionOrderConfirmationV03;
			owner_lazy = () -> RedemptionOrderConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrderConfirmationV04 obj) throws Exception {
			check_setr_RedemptionOrderConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderCancellationInstructionV02
	 * SubscriptionMultipleOrderCancellationInstructionV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrderCancellationInstructionV02> for_setr_SubscriptionMultipleOrderCancellationInstructionV02 = new MMConstraint<SubscriptionMultipleOrderCancellationInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionMultipleOrderCancellationInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionMultipleOrderCancellationInstructionV02 obj) throws Exception {
			check_setr_SubscriptionMultipleOrderCancellationInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV02
	 * SubscriptionBulkOrderV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderV02> for_setr_SubscriptionBulkOrderV02 = new MMConstraint<SubscriptionBulkOrderV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionBulkOrderV02.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderV02 obj) throws Exception {
			check_setr_SubscriptionBulkOrderV02(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_RedemptionBulkOrderV04
	 * ConstraintAccountIdentificationRule.for_setr_RedemptionBulkOrderV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderV03> for_setr_RedemptionBulkOrderV03 = new MMConstraint<RedemptionBulkOrderV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_RedemptionBulkOrderV04);
			owner_lazy = () -> RedemptionBulkOrderV03.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderV03 obj) throws Exception {
			check_setr_RedemptionBulkOrderV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount65
	 * InvestmentAccount65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forInvestmentAccount55
	 * ConstraintAccountIdentificationRule.forInvestmentAccount55}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount65> forInvestmentAccount65 = new MMConstraint<InvestmentAccount65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount55;
			owner_lazy = () -> InvestmentAccount65.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount65 obj) throws Exception {
			checkInvestmentAccount65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition
	 * EligiblePosition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountIdentification is empty, then HoldingBalance represents the total balance (for all the accounts)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<EligiblePosition> forEligiblePosition = new MMConstraint<EligiblePosition>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If AccountIdentification is empty, then HoldingBalance represents the total balance (for all the accounts).";
			owner_lazy = () -> EligiblePosition.mmObject();
		}

		@Override
		public void executeValidator(EligiblePosition obj) throws Exception {
			checkEligiblePosition(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV04
	 * SubscriptionOrderV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_SubscriptionOrderV03
	 * ConstraintAccountIdentificationRule.for_setr_SubscriptionOrderV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderV04> for_setr_SubscriptionOrderV04 = new MMConstraint<SubscriptionOrderV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_SubscriptionOrderV03;
			owner_lazy = () -> SubscriptionOrderV04.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderV04 obj) throws Exception {
			check_setr_SubscriptionOrderV04(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_SubscriptionOrderV04
	 * ConstraintAccountIdentificationRule.for_setr_SubscriptionOrderV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderV03> for_setr_SubscriptionOrderV03 = new MMConstraint<SubscriptionOrderV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_SubscriptionOrderV04);
			owner_lazy = () -> SubscriptionOrderV03.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderV03 obj) throws Exception {
			check_setr_SubscriptionOrderV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02
	 * SubscriptionMultipleOrderV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrderV02> for_setr_SubscriptionMultipleOrderV02 = new MMConstraint<SubscriptionMultipleOrderV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionMultipleOrderV02.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionMultipleOrderV02 obj) throws Exception {
			check_setr_SubscriptionMultipleOrderV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV02
	 * RedemptionBulkOrderV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderV02> for_setr_RedemptionBulkOrderV02 = new MMConstraint<RedemptionBulkOrderV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionBulkOrderV02.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderV02 obj) throws Exception {
			check_setr_RedemptionBulkOrderV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01
	 * RedemptionBulkOrderConfirmationAmendmentV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationAmendmentV01> for_setr_RedemptionBulkOrderConfirmationAmendmentV01 = new MMConstraint<RedemptionBulkOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionBulkOrderConfirmationAmendmentV01.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderConfirmationAmendmentV01 obj) throws Exception {
			check_setr_RedemptionBulkOrderConfirmationAmendmentV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41
	 * InvestmentAccount41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forInvestmentAccount55
	 * ConstraintAccountIdentificationRule.forInvestmentAccount55}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forInvestmentAccount24
	 * ConstraintAccountIdentificationRule.forInvestmentAccount24}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount41> forInvestmentAccount41 = new MMConstraint<InvestmentAccount41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount55);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount24;
			owner_lazy = () -> InvestmentAccount41.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount41 obj) throws Exception {
			checkInvestmentAccount41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV04
	 * RedemptionBulkOrderV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_RedemptionBulkOrderV03
	 * ConstraintAccountIdentificationRule.for_setr_RedemptionBulkOrderV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderV04> for_setr_RedemptionBulkOrderV04 = new MMConstraint<RedemptionBulkOrderV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_RedemptionBulkOrderV03;
			owner_lazy = () -> RedemptionBulkOrderV04.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderV04 obj) throws Exception {
			check_setr_RedemptionBulkOrderV04(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_SubscriptionBulkOrderConfirmationV04
	 * ConstraintAccountIdentificationRule.
	 * for_setr_SubscriptionBulkOrderConfirmationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationV03> for_setr_SubscriptionBulkOrderConfirmationV03 = new MMConstraint<SubscriptionBulkOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_SubscriptionBulkOrderConfirmationV04);
			owner_lazy = () -> SubscriptionBulkOrderConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderConfirmationV03 obj) throws Exception {
			check_setr_SubscriptionBulkOrderConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01
	 * SubscriptionBulkOrderConfirmationCancellationInstructionV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationCancellationInstructionV01> for_setr_SubscriptionBulkOrderConfirmationCancellationInstructionV01 = new MMConstraint<SubscriptionBulkOrderConfirmationCancellationInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present.";
			owner_lazy = () -> SubscriptionBulkOrderConfirmationCancellationInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderConfirmationCancellationInstructionV01 obj) throws Exception {
			check_setr_SubscriptionBulkOrderConfirmationCancellationInstructionV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01
	 * SwitchOrderConfirmationCancellationInstructionV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmationCancellationInstructionV01> for_setr_SwitchOrderConfirmationCancellationInstructionV01 = new MMConstraint<SwitchOrderConfirmationCancellationInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present.";
			owner_lazy = () -> SwitchOrderConfirmationCancellationInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderConfirmationCancellationInstructionV01 obj) throws Exception {
			check_setr_SwitchOrderConfirmationCancellationInstructionV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01
	 * RedemptionBulkOrderConfirmationCancellationInstructionV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationCancellationInstructionV01> for_setr_RedemptionBulkOrderConfirmationCancellationInstructionV01 = new MMConstraint<RedemptionBulkOrderConfirmationCancellationInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present.";
			owner_lazy = () -> RedemptionBulkOrderConfirmationCancellationInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderConfirmationCancellationInstructionV01 obj) throws Exception {
			check_setr_RedemptionBulkOrderConfirmationCancellationInstructionV01(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_RedemptionOrderConfirmationV04
	 * ConstraintAccountIdentificationRule.
	 * for_setr_RedemptionOrderConfirmationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationV03> for_setr_RedemptionOrderConfirmationV03 = new MMConstraint<RedemptionOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_RedemptionOrderConfirmationV04);
			owner_lazy = () -> RedemptionOrderConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrderConfirmationV03 obj) throws Exception {
			check_setr_RedemptionOrderConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02
	 * RedemptionBulkOrderCancellationInstructionV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderCancellationInstructionV02> for_setr_RedemptionBulkOrderCancellationInstructionV02 = new MMConstraint<RedemptionBulkOrderCancellationInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionBulkOrderCancellationInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderCancellationInstructionV02 obj) throws Exception {
			check_setr_RedemptionBulkOrderCancellationInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57
	 * InvestmentAccount57}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forInvestmentAccount68
	 * ConstraintAccountIdentificationRule.forInvestmentAccount68}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forInvestmentAccount55
	 * ConstraintAccountIdentificationRule.forInvestmentAccount55}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount57> forInvestmentAccount57 = new MMConstraint<InvestmentAccount57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount55;
			owner_lazy = () -> InvestmentAccount57.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount57 obj) throws Exception {
			checkInvestmentAccount57(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationAmendmentV01> for_setr_SubscriptionOrderConfirmationAmendmentV01 = new MMConstraint<SubscriptionOrderConfirmationAmendmentV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionOrderConfirmationAmendmentV01.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderConfirmationAmendmentV01 obj) throws Exception {
			check_setr_SubscriptionOrderConfirmationAmendmentV01(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_SubscriptionOrderConfirmationV04
	 * ConstraintAccountIdentificationRule.
	 * for_setr_SubscriptionOrderConfirmationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationV03> for_setr_SubscriptionOrderConfirmationV03 = new MMConstraint<SubscriptionOrderConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_SubscriptionOrderConfirmationV04);
			owner_lazy = () -> SubscriptionOrderConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderConfirmationV03 obj) throws Exception {
			check_setr_SubscriptionOrderConfirmationV03(obj);
		}
	};

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SwitchOrderConfirmationV03(SwitchOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionBulkOrderConfirmationAmendmentV01(SubscriptionBulkOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_RedemptionOrderV04(RedemptionOrderV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * CancellationByOrderDetails/SwitchOrderDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void check_setr_SwitchOrderCancellationRequestV03(SwitchOrderCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionBulkOrderConfirmationV02(SubscriptionBulkOrderConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_RedemptionMultipleOrderConfirmationV02(RedemptionMultipleOrderConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void check_setr_RedemptionBulkOrderConfirmationV03(RedemptionBulkOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void check_setr_SubscriptionBulkOrderV04(SubscriptionBulkOrderV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionOrderConfirmationV04(SubscriptionOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionMultipleOrderConfirmationV02(SubscriptionMultipleOrderConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation message was linked to an account opening request and
	 * the account identification is not yet known then the value of the
	 * AccountIdentification element in
	 * CancellationByOrderConfirmationDetails/MultipleExecutionDetails
	 * /InvestmentAccountDetails must be UNKNOWN if present.
	 */
	public static void check_setr_SubscriptionOrderConfirmationCancellationInstructionV01(SubscriptionOrderConfirmationCancellationInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_RedemptionMultipleOrderV02(RedemptionMultipleOrderV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one occurrence of one message element in the list
	 * (OwnerIdentification, AccountIdentification, AccountName) must be
	 * present. If an element in the list is repetitive, more than one
	 * occurrence of this message element may be present. More than one message
	 * element in the list may be present.
	 */
	public static void checkInvestmentAccount55(InvestmentAccount55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SwitchOrderConfirmationV02(SwitchOrderConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_RedemptionOrderConfirmationAmendmentV01(RedemptionOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/SwitchOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void check_setr_SwitchOrderCancellationInstructionV02(SwitchOrderCancellationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SwitchOrderV02(SwitchOrderV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one occurrence of one message element in the list
	 * (OwnerIdentification, AccountIdentification, AccountName) must be
	 * present. If an element in the list is repetitive, more than one
	 * occurrence of this message element may be present. More than one message
	 * element in the list may be present.
	 */
	public static void checkInvestmentAccount24(InvestmentAccount24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * CancellationByOrderDetails/MultipleOrderDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionOrderCancellationRequestV03(SubscriptionOrderCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one occurrence of one message element in the list
	 * (OwnerIdentification, AccountIdentification, AccountName) must be
	 * present. If an element in the list is repetitive, more than one
	 * occurrence of this message element may be present. More than one message
	 * element in the list may be present.
	 */
	public static void checkInvestmentAccount68(InvestmentAccount68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails
	 * /InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_RedemptionBulkOrderCancellationRequestV03(RedemptionBulkOrderCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void check_setr_RedemptionBulkOrderConfirmationV04(RedemptionBulkOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void check_setr_RedemptionBulkOrderConfirmationV02(RedemptionBulkOrderConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation message was linked to an account opening request and
	 * the account identification is not yet known then the value of the
	 * AccountIdentification element in
	 * CancellationByOrderConfirmationDetails/MultipleExecutionDetails
	 * /InvestmentAccountDetails must be UNKNOWN if present.
	 */
	public static void check_setr_RedemptionOrderConfirmationCancellationInstructionV01(RedemptionOrderConfirmationCancellationInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void check_setr_RedemptionMultipleOrderCancellationInstructionV02(RedemptionMultipleOrderCancellationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails
	 * /InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionBulkOrderCancellationRequestV03(SubscriptionBulkOrderCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void check_setr_SubscriptionBulkOrderV03(SubscriptionBulkOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation message was linked to an account opening request and
	 * the account identification is not yet known then the value of the
	 * AccountIdentification element in
	 * SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SwitchOrderConfirmationAmendmentV01(SwitchOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_RedemptionOrderV03(RedemptionOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionBulkOrderConfirmationV04(SubscriptionBulkOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails
	 * /InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionBulkOrderCancellationInstructionV02(SubscriptionBulkOrderCancellationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void check_setr_RedemptionOrderCancellationRequestV03(RedemptionOrderCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SwitchOrderV03(SwitchOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_RedemptionOrderConfirmationV04(RedemptionOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void check_setr_SubscriptionMultipleOrderCancellationInstructionV02(SubscriptionMultipleOrderCancellationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void check_setr_SubscriptionBulkOrderV02(SubscriptionBulkOrderV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void check_setr_RedemptionBulkOrderV03(RedemptionBulkOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one occurrence of one message element in the list
	 * (OwnerIdentification, AccountIdentification, AccountName) must be
	 * present. If an element in the list is repetitive, more than one
	 * occurrence of this message element may be present. More than one message
	 * element in the list may be present.
	 */
	public static void checkInvestmentAccount65(InvestmentAccount65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountIdentification is empty, then HoldingBalance represents the
	 * total balance (for all the accounts).
	 */
	public static void checkEligiblePosition(EligiblePosition obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionOrderV04(SubscriptionOrderV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionOrderV03(SubscriptionOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionMultipleOrderV02(SubscriptionMultipleOrderV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void check_setr_RedemptionBulkOrderV02(RedemptionBulkOrderV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void check_setr_RedemptionBulkOrderConfirmationAmendmentV01(RedemptionBulkOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one occurrence of one message element in the list
	 * (OwnerIdentification, AccountIdentification, AccountName) must be
	 * present. If an element in the list is repetitive, more than one
	 * occurrence of this message element may be present. More than one message
	 * element in the list may be present.
	 */
	public static void checkInvestmentAccount41(InvestmentAccount41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void check_setr_RedemptionBulkOrderV04(RedemptionBulkOrderV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionBulkOrderConfirmationV03(SubscriptionBulkOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation message was linked to an account opening request and
	 * the account identification is not yet known then the value of the
	 * AccountIdentification element in
	 * CancellationByOrderConfirmationDetails/BulkExecutionDetails
	 * /IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN if
	 * present.
	 */
	public static void check_setr_SubscriptionBulkOrderConfirmationCancellationInstructionV01(SubscriptionBulkOrderConfirmationCancellationInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation message was linked to an account opening request and
	 * the account identification is not yet known then the value of the
	 * AccountIdentification element in
	 * CancellationByOrderConfirmationDetails/SwitchExecutionDetails
	 * /InvestmentAccountDetails must be UNKNOWN if present.
	 */
	public static void check_setr_SwitchOrderConfirmationCancellationInstructionV01(SwitchOrderConfirmationCancellationInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation message was linked to an account opening request and
	 * the account identification is not yet known then the value of the
	 * AccountIdentification element in
	 * CancellationByOrderConfirmationDetails/MultipleExecutionDetails
	 * /InvestmentAccountDetails must be UNKNOWN if present.
	 */
	public static void check_setr_RedemptionBulkOrderConfirmationCancellationInstructionV01(RedemptionBulkOrderConfirmationCancellationInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_RedemptionOrderConfirmationV03(RedemptionOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails
	 * /InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_RedemptionBulkOrderCancellationInstructionV02(RedemptionBulkOrderCancellationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one occurrence of one message element in the list
	 * (OwnerIdentification, AccountIdentification, AccountName) must be
	 * present. If an element in the list is repetitive, more than one
	 * occurrence of this message element may be present. More than one message
	 * element in the list may be present.
	 */
	public static void checkInvestmentAccount57(InvestmentAccount57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionOrderConfirmationAmendmentV01(SubscriptionOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionOrderConfirmationV03(SubscriptionOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}