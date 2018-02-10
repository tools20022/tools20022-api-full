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
 * element in
 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must
 * be UNKNOWN.
 */
public class ConstraintAccountIdentificationRule {

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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationAmendmentV01> forRedemptionBulkOrderConfirmationAmendmentV01 = new MMConstraint<RedemptionBulkOrderConfirmationAmendmentV01>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionBulkOrderConfirmationAmendmentV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionBulkOrderConfirmationAmendmentV01.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationAmendmentV01> forRedemptionOrderConfirmationAmendmentV01 = new MMConstraint<RedemptionOrderConfirmationAmendmentV01>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionOrderConfirmationAmendmentV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionOrderConfirmationAmendmentV01.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationAmendmentV01> forSubscriptionBulkOrderConfirmationAmendmentV01 = new MMConstraint<SubscriptionBulkOrderConfirmationAmendmentV01>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionBulkOrderConfirmationAmendmentV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionBulkOrderConfirmationAmendmentV01.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationAmendmentV01> forSubscriptionOrderConfirmationAmendmentV01 = new MMConstraint<SubscriptionOrderConfirmationAmendmentV01>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionOrderConfirmationAmendmentV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionOrderConfirmationAmendmentV01.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmationAmendmentV01> forSwitchOrderConfirmationAmendmentV01 = new MMConstraint<SwitchOrderConfirmationAmendmentV01>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSwitchOrderConfirmationAmendmentV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SwitchOrderConfirmationAmendmentV01.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forSubscriptionBulkOrderConfirmationV03
	 * ConstraintAccountIdentificationRule.
	 * forSubscriptionBulkOrderConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationV04> forSubscriptionBulkOrderConfirmationV04 = new MMConstraint<SubscriptionBulkOrderConfirmationV04>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionBulkOrderConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forSubscriptionBulkOrderConfirmationV03;
			owner_lazy = () -> SubscriptionBulkOrderConfirmationV04.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forRedemptionBulkOrderV03
	 * ConstraintAccountIdentificationRule.forRedemptionBulkOrderV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderV04> forRedemptionBulkOrderV04 = new MMConstraint<RedemptionBulkOrderV04>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionBulkOrderV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forRedemptionBulkOrderV03;
			owner_lazy = () -> RedemptionBulkOrderV04.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forRedemptionOrderV03
	 * ConstraintAccountIdentificationRule.forRedemptionOrderV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderV04> forRedemptionOrderV04 = new MMConstraint<RedemptionOrderV04>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionOrderV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forRedemptionOrderV03;
			owner_lazy = () -> RedemptionOrderV04.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forRedemptionBulkOrderConfirmationV03
	 * ConstraintAccountIdentificationRule.forRedemptionBulkOrderConfirmationV03
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationV04> forRedemptionBulkOrderConfirmationV04 = new MMConstraint<RedemptionBulkOrderConfirmationV04>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionBulkOrderConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forRedemptionBulkOrderConfirmationV03;
			owner_lazy = () -> RedemptionBulkOrderConfirmationV04.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forSubscriptionOrderConfirmationV03
	 * ConstraintAccountIdentificationRule.forSubscriptionOrderConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationV04> forSubscriptionOrderConfirmationV04 = new MMConstraint<SubscriptionOrderConfirmationV04>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionOrderConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forSubscriptionOrderConfirmationV03;
			owner_lazy = () -> SubscriptionOrderConfirmationV04.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forRedemptionOrderConfirmationV03
	 * ConstraintAccountIdentificationRule.forRedemptionOrderConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationV04> forRedemptionOrderConfirmationV04 = new MMConstraint<RedemptionOrderConfirmationV04>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionOrderConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forRedemptionOrderConfirmationV03;
			owner_lazy = () -> RedemptionOrderConfirmationV04.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forSubscriptionBulkOrderV03
	 * ConstraintAccountIdentificationRule.forSubscriptionBulkOrderV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderV04> forSubscriptionBulkOrderV04 = new MMConstraint<SubscriptionBulkOrderV04>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionBulkOrderV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forSubscriptionBulkOrderV03;
			owner_lazy = () -> SubscriptionBulkOrderV04.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forSubscriptionOrderV03
	 * ConstraintAccountIdentificationRule.forSubscriptionOrderV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderV04> forSubscriptionOrderV04 = new MMConstraint<SubscriptionOrderV04>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionOrderV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forSubscriptionOrderV03;
			owner_lazy = () -> SubscriptionOrderV04.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderCancellationRequestV03> forRedemptionBulkOrderCancellationRequestV03 = new MMConstraint<RedemptionBulkOrderCancellationRequestV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionBulkOrderCancellationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionBulkOrderCancellationRequestV03.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationCancellationInstructionV01> forRedemptionBulkOrderConfirmationCancellationInstructionV01 = new MMConstraint<RedemptionBulkOrderConfirmationCancellationInstructionV01>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionBulkOrderConfirmationCancellationInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present.";
			owner_lazy = () -> RedemptionBulkOrderConfirmationCancellationInstructionV01.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forRedemptionBulkOrderConfirmationV04
	 * ConstraintAccountIdentificationRule.forRedemptionBulkOrderConfirmationV04
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationV03> forRedemptionBulkOrderConfirmationV03 = new MMConstraint<RedemptionBulkOrderConfirmationV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionBulkOrderConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forRedemptionBulkOrderConfirmationV04);
			owner_lazy = () -> RedemptionBulkOrderConfirmationV03.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forRedemptionBulkOrderV04
	 * ConstraintAccountIdentificationRule.forRedemptionBulkOrderV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderV03> forRedemptionBulkOrderV03 = new MMConstraint<RedemptionBulkOrderV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionBulkOrderV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forRedemptionBulkOrderV04);
			owner_lazy = () -> RedemptionBulkOrderV03.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderCancellationRequestV03> forRedemptionOrderCancellationRequestV03 = new MMConstraint<RedemptionOrderCancellationRequestV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionOrderCancellationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionOrderCancellationRequestV03.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationCancellationInstructionV01> forRedemptionOrderConfirmationCancellationInstructionV01 = new MMConstraint<RedemptionOrderConfirmationCancellationInstructionV01>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionOrderConfirmationCancellationInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present.";
			owner_lazy = () -> RedemptionOrderConfirmationCancellationInstructionV01.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forRedemptionOrderConfirmationV04
	 * ConstraintAccountIdentificationRule.forRedemptionOrderConfirmationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationV03> forRedemptionOrderConfirmationV03 = new MMConstraint<RedemptionOrderConfirmationV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionOrderConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forRedemptionOrderConfirmationV04);
			owner_lazy = () -> RedemptionOrderConfirmationV03.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forRedemptionOrderV04
	 * ConstraintAccountIdentificationRule.forRedemptionOrderV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderV03> forRedemptionOrderV03 = new MMConstraint<RedemptionOrderV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionOrderV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forRedemptionOrderV04);
			owner_lazy = () -> RedemptionOrderV03.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderCancellationRequestV03> forSubscriptionBulkOrderCancellationRequestV03 = new MMConstraint<SubscriptionBulkOrderCancellationRequestV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionBulkOrderCancellationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionBulkOrderCancellationRequestV03.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationCancellationInstructionV01> forSubscriptionBulkOrderConfirmationCancellationInstructionV01 = new MMConstraint<SubscriptionBulkOrderConfirmationCancellationInstructionV01>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionBulkOrderConfirmationCancellationInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present.";
			owner_lazy = () -> SubscriptionBulkOrderConfirmationCancellationInstructionV01.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forSubscriptionBulkOrderConfirmationV04
	 * ConstraintAccountIdentificationRule.
	 * forSubscriptionBulkOrderConfirmationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationV03> forSubscriptionBulkOrderConfirmationV03 = new MMConstraint<SubscriptionBulkOrderConfirmationV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionBulkOrderConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forSubscriptionBulkOrderConfirmationV04);
			owner_lazy = () -> SubscriptionBulkOrderConfirmationV03.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forSubscriptionBulkOrderV04
	 * ConstraintAccountIdentificationRule.forSubscriptionBulkOrderV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderV03> forSubscriptionBulkOrderV03 = new MMConstraint<SubscriptionBulkOrderV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionBulkOrderV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forSubscriptionBulkOrderV04);
			owner_lazy = () -> SubscriptionBulkOrderV03.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderDetails/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderCancellationRequestV03> forSubscriptionOrderCancellationRequestV03 = new MMConstraint<SubscriptionOrderCancellationRequestV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionOrderCancellationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderDetails/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionOrderCancellationRequestV03.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationCancellationInstructionV01> forSubscriptionOrderConfirmationCancellationInstructionV01 = new MMConstraint<SubscriptionOrderConfirmationCancellationInstructionV01>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionOrderConfirmationCancellationInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present.";
			owner_lazy = () -> SubscriptionOrderConfirmationCancellationInstructionV01.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forSubscriptionOrderConfirmationV04
	 * ConstraintAccountIdentificationRule.forSubscriptionOrderConfirmationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationV03> forSubscriptionOrderConfirmationV03 = new MMConstraint<SubscriptionOrderConfirmationV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionOrderConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forSubscriptionOrderConfirmationV04);
			owner_lazy = () -> SubscriptionOrderConfirmationV03.mmObject();
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forSubscriptionOrderV04
	 * ConstraintAccountIdentificationRule.forSubscriptionOrderV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderV03> forSubscriptionOrderV03 = new MMConstraint<SubscriptionOrderV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionOrderV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forSubscriptionOrderV04);
			owner_lazy = () -> SubscriptionOrderV03.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderDetails/SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderCancellationRequestV03> forSwitchOrderCancellationRequestV03 = new MMConstraint<SwitchOrderCancellationRequestV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSwitchOrderCancellationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderDetails/SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SwitchOrderCancellationRequestV03.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmationCancellationInstructionV01> forSwitchOrderConfirmationCancellationInstructionV01 = new MMConstraint<SwitchOrderConfirmationCancellationInstructionV01>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSwitchOrderConfirmationCancellationInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If the confirmation message was linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in CancellationByOrderConfirmationDetails/SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN if present.";
			owner_lazy = () -> SwitchOrderConfirmationCancellationInstructionV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03
	 * SwitchOrderConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmationV03> forSwitchOrderConfirmationV03 = new MMConstraint<SwitchOrderConfirmationV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSwitchOrderConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SwitchOrderConfirmationV03.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderV03> forSwitchOrderV03 = new MMConstraint<SwitchOrderV03>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSwitchOrderV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SwitchOrderV03.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderCancellationInstructionV02> forRedemptionBulkOrderCancellationInstructionV02 = new MMConstraint<RedemptionBulkOrderCancellationInstructionV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionBulkOrderCancellationInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionBulkOrderCancellationInstructionV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationV02> forRedemptionBulkOrderConfirmationV02 = new MMConstraint<RedemptionBulkOrderConfirmationV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionBulkOrderConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionBulkOrderConfirmationV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderV02> forRedemptionBulkOrderV02 = new MMConstraint<RedemptionBulkOrderV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionBulkOrderV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionBulkOrderV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrderCancellationInstructionV02> forRedemptionMultipleOrderCancellationInstructionV02 = new MMConstraint<RedemptionMultipleOrderCancellationInstructionV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionMultipleOrderCancellationInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionMultipleOrderCancellationInstructionV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrderConfirmationV02> forRedemptionMultipleOrderConfirmationV02 = new MMConstraint<RedemptionMultipleOrderConfirmationV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionMultipleOrderConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionMultipleOrderConfirmationV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrderV02> forRedemptionMultipleOrderV02 = new MMConstraint<RedemptionMultipleOrderV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkRedemptionMultipleOrderV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionMultipleOrderV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderCancellationInstructionV02> forSubscriptionBulkOrderCancellationInstructionV02 = new MMConstraint<SubscriptionBulkOrderCancellationInstructionV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionBulkOrderCancellationInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionBulkOrderCancellationInstructionV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationV02> forSubscriptionBulkOrderConfirmationV02 = new MMConstraint<SubscriptionBulkOrderConfirmationV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionBulkOrderConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionBulkOrderConfirmationV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderV02> forSubscriptionBulkOrderV02 = new MMConstraint<SubscriptionBulkOrderV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionBulkOrderV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionBulkOrderV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrderCancellationInstructionV02> forSubscriptionMultipleOrderCancellationInstructionV02 = new MMConstraint<SubscriptionMultipleOrderCancellationInstructionV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionMultipleOrderCancellationInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionMultipleOrderCancellationInstructionV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrderConfirmationV02> forSubscriptionMultipleOrderConfirmationV02 = new MMConstraint<SubscriptionMultipleOrderConfirmationV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionMultipleOrderConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionMultipleOrderConfirmationV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrderV02> forSubscriptionMultipleOrderV02 = new MMConstraint<SubscriptionMultipleOrderV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSubscriptionMultipleOrderV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionMultipleOrderV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderCancellationInstructionV02> forSwitchOrderCancellationInstructionV02 = new MMConstraint<SwitchOrderCancellationInstructionV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSwitchOrderCancellationInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in OrderToBeCancelled/SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SwitchOrderCancellationInstructionV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderConfirmationV02> forSwitchOrderConfirmationV02 = new MMConstraint<SwitchOrderConfirmationV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSwitchOrderConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SwitchOrderConfirmationV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderV02> forSwitchOrderV02 = new MMConstraint<SwitchOrderV02>() {
		{
			validator = ConstraintAccountIdentificationRule::checkSwitchOrderV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SwitchOrderV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present."
	 * </li>
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
			validator = ConstraintAccountIdentificationRule::checkInvestmentAccount24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount41);
			owner_lazy = () -> InvestmentAccount24.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountIdentification is empty, then HoldingBalance represents the total balance (for all the accounts)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EligiblePosition> forEligiblePosition = new MMConstraint<EligiblePosition>() {
		{
			validator = ConstraintAccountIdentificationRule::checkEligiblePosition;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If AccountIdentification is empty, then HoldingBalance represents the total balance (for all the accounts).";
			owner_lazy = () -> EligiblePosition.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present."
	 * </li>
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
			validator = ConstraintAccountIdentificationRule::checkInvestmentAccount41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount55);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount24;
			owner_lazy = () -> InvestmentAccount41.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present."
	 * </li>
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
			validator = ConstraintAccountIdentificationRule::checkInvestmentAccount55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount57,
					com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount65);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount41;
			owner_lazy = () -> InvestmentAccount55.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present."
	 * </li>
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
			validator = ConstraintAccountIdentificationRule::checkInvestmentAccount57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount55;
			owner_lazy = () -> InvestmentAccount57.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forInvestmentAccount55
	 * ConstraintAccountIdentificationRule.forInvestmentAccount55}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount65> forInvestmentAccount65 = new MMConstraint<InvestmentAccount65>() {
		{
			validator = ConstraintAccountIdentificationRule::checkInvestmentAccount65;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount55;
			owner_lazy = () -> InvestmentAccount65.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forInvestmentAccount57
	 * ConstraintAccountIdentificationRule.forInvestmentAccount57}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount68> forInvestmentAccount68 = new MMConstraint<InvestmentAccount68>() {
		{
			validator = ConstraintAccountIdentificationRule::checkInvestmentAccount68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forInvestmentAccount57;
			owner_lazy = () -> InvestmentAccount68.mmObject();
		}
	};

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void checkRedemptionBulkOrderConfirmationAmendmentV01(RedemptionBulkOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkRedemptionOrderConfirmationAmendmentV01(RedemptionOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void checkSubscriptionBulkOrderConfirmationAmendmentV01(SubscriptionBulkOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkSubscriptionOrderConfirmationAmendmentV01(SubscriptionOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation message was linked to an account opening request and
	 * the account identification is not yet known then the value of the
	 * AccountIdentification element in
	 * SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkSwitchOrderConfirmationAmendmentV01(SwitchOrderConfirmationAmendmentV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void checkSubscriptionBulkOrderConfirmationV04(SubscriptionBulkOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void checkRedemptionBulkOrderV04(RedemptionBulkOrderV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkRedemptionOrderV04(RedemptionOrderV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void checkRedemptionBulkOrderConfirmationV04(RedemptionBulkOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkSubscriptionOrderConfirmationV04(SubscriptionOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkRedemptionOrderConfirmationV04(RedemptionOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void checkSubscriptionBulkOrderV04(SubscriptionBulkOrderV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkSubscriptionOrderV04(SubscriptionOrderV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails
	 * /InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkRedemptionBulkOrderCancellationRequestV03(RedemptionBulkOrderCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation message was linked to an account opening request and
	 * the account identification is not yet known then the value of the
	 * AccountIdentification element in
	 * CancellationByOrderConfirmationDetails/MultipleExecutionDetails
	 * /InvestmentAccountDetails must be UNKNOWN if present.
	 */
	public static void checkRedemptionBulkOrderConfirmationCancellationInstructionV01(RedemptionBulkOrderConfirmationCancellationInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void checkRedemptionBulkOrderConfirmationV03(RedemptionBulkOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void checkRedemptionBulkOrderV03(RedemptionBulkOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void checkRedemptionOrderCancellationRequestV03(RedemptionOrderCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation message was linked to an account opening request and
	 * the account identification is not yet known then the value of the
	 * AccountIdentification element in
	 * CancellationByOrderConfirmationDetails/MultipleExecutionDetails
	 * /InvestmentAccountDetails must be UNKNOWN if present.
	 */
	public static void checkRedemptionOrderConfirmationCancellationInstructionV01(RedemptionOrderConfirmationCancellationInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkRedemptionOrderConfirmationV03(RedemptionOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkRedemptionOrderV03(RedemptionOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails
	 * /InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkSubscriptionBulkOrderCancellationRequestV03(SubscriptionBulkOrderCancellationRequestV03 obj) throws Exception {
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
	public static void checkSubscriptionBulkOrderConfirmationCancellationInstructionV01(SubscriptionBulkOrderConfirmationCancellationInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void checkSubscriptionBulkOrderConfirmationV03(SubscriptionBulkOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void checkSubscriptionBulkOrderV03(SubscriptionBulkOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * CancellationByOrderDetails/MultipleOrderDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void checkSubscriptionOrderCancellationRequestV03(SubscriptionOrderCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation message was linked to an account opening request and
	 * the account identification is not yet known then the value of the
	 * AccountIdentification element in
	 * CancellationByOrderConfirmationDetails/MultipleExecutionDetails
	 * /InvestmentAccountDetails must be UNKNOWN if present.
	 */
	public static void checkSubscriptionOrderConfirmationCancellationInstructionV01(SubscriptionOrderConfirmationCancellationInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkSubscriptionOrderConfirmationV03(SubscriptionOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkSubscriptionOrderV03(SubscriptionOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * CancellationByOrderDetails/SwitchOrderDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void checkSwitchOrderCancellationRequestV03(SwitchOrderCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the confirmation message was linked to an account opening request and
	 * the account identification is not yet known then the value of the
	 * AccountIdentification element in
	 * CancellationByOrderConfirmationDetails/SwitchExecutionDetails
	 * /InvestmentAccountDetails must be UNKNOWN if present.
	 */
	public static void checkSwitchOrderConfirmationCancellationInstructionV01(SwitchOrderConfirmationCancellationInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkSwitchOrderConfirmationV03(SwitchOrderConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkSwitchOrderV03(SwitchOrderV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails
	 * /InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkRedemptionBulkOrderCancellationInstructionV02(RedemptionBulkOrderCancellationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void checkRedemptionBulkOrderConfirmationV02(RedemptionBulkOrderConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void checkRedemptionBulkOrderV02(RedemptionBulkOrderV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void checkRedemptionMultipleOrderCancellationInstructionV02(RedemptionMultipleOrderCancellationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkRedemptionMultipleOrderConfirmationV02(RedemptionMultipleOrderConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkRedemptionMultipleOrderV02(RedemptionMultipleOrderV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/BulkOrderDetails/IndividualOrderDetails
	 * /InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkSubscriptionBulkOrderCancellationInstructionV02(SubscriptionBulkOrderCancellationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void checkSubscriptionBulkOrderConfirmationV02(SubscriptionBulkOrderConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void checkSubscriptionBulkOrderV02(SubscriptionBulkOrderV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/MultipleOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void checkSubscriptionMultipleOrderCancellationInstructionV02(SubscriptionMultipleOrderCancellationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkSubscriptionMultipleOrderConfirmationV02(SubscriptionMultipleOrderConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkSubscriptionMultipleOrderV02(SubscriptionMultipleOrderV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * OrderToBeCancelled/SwitchOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void checkSwitchOrderCancellationInstructionV02(SwitchOrderCancellationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * SwitchExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkSwitchOrderConfirmationV02(SwitchOrderConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * SwitchOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void checkSwitchOrderV02(SwitchOrderV02 obj) throws Exception {
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
	 * If AccountIdentification is empty, then HoldingBalance represents the
	 * total balance (for all the accounts).
	 */
	public static void checkEligiblePosition(EligiblePosition obj) throws Exception {
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
	 * At least one occurrence of one message element in the list
	 * (OwnerIdentification, AccountIdentification, AccountName) must be
	 * present. If an element in the list is repetitive, more than one
	 * occurrence of this message element may be present. More than one message
	 * element in the list may be present.
	 */
	public static void checkInvestmentAccount68(InvestmentAccount68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}