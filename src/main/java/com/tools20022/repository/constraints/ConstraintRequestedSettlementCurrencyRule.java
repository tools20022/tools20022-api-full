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
 * If RequestedSettlementCurrency is present, it must be the same Currency as in
 * all occurrences of IndividualOrderDetails/SettlementAmount, if present.
 */
public class ConstraintRequestedSettlementCurrencyRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3
	 * RedemptionBulkOrder3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrder3> forRedemptionBulkOrder3 = new MMConstraint<RedemptionBulkOrder3>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkRedemptionBulkOrder3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present.";
			owner_lazy = () -> RedemptionBulkOrder3.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualExecutionDetails/SettlementAmount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule#forRedemptionBulkExecution5
	 * ConstraintRequestedSettlementCurrencyRule.forRedemptionBulkExecution5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkExecution3> forRedemptionBulkExecution3 = new MMConstraint<RedemptionBulkExecution3>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkRedemptionBulkExecution3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualExecutionDetails/SettlementAmount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule.forRedemptionBulkExecution5);
			owner_lazy = () -> RedemptionBulkExecution3.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule#forRedemptionBulkOrder6
	 * ConstraintRequestedSettlementCurrencyRule.forRedemptionBulkOrder6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrder4> forRedemptionBulkOrder4 = new MMConstraint<RedemptionBulkOrder4>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkRedemptionBulkOrder4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule.forRedemptionBulkOrder6);
			owner_lazy = () -> RedemptionBulkOrder4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6
	 * RedemptionOrder6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder6> forRedemptionOrder6 = new MMConstraint<RedemptionOrder6>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkRedemptionOrder6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present.";
			owner_lazy = () -> RedemptionOrder6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution6> forRedemptionExecution6 = new MMConstraint<RedemptionExecution6>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkRedemptionExecution6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount.";
			owner_lazy = () -> RedemptionExecution6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8
	 * RedemptionOrder8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder8> forRedemptionOrder8 = new MMConstraint<RedemptionOrder8>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkRedemptionOrder8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present.";
			owner_lazy = () -> RedemptionOrder8.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrder3> forSubscriptionBulkOrder3 = new MMConstraint<SubscriptionBulkOrder3>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkSubscriptionBulkOrder3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present.";
			owner_lazy = () -> SubscriptionBulkOrder3.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualExecutionDetails/SettlementAmount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule#forSubscriptionBulkExecution4
	 * ConstraintRequestedSettlementCurrencyRule.forSubscriptionBulkExecution4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkExecution3> forSubscriptionBulkExecution3 = new MMConstraint<SubscriptionBulkExecution3>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkSubscriptionBulkExecution3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualExecutionDetails/SettlementAmount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule.forSubscriptionBulkExecution4);
			owner_lazy = () -> SubscriptionBulkExecution3.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule#forSubscriptionBulkOrder5
	 * ConstraintRequestedSettlementCurrencyRule.forSubscriptionBulkOrder5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrder4> forSubscriptionBulkOrder4 = new MMConstraint<SubscriptionBulkOrder4>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkSubscriptionBulkOrder4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule.forSubscriptionBulkOrder5);
			owner_lazy = () -> SubscriptionBulkOrder4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6
	 * SubscriptionOrder6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder6> forSubscriptionOrder6 = new MMConstraint<SubscriptionOrder6>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkSubscriptionOrder6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present.";
			owner_lazy = () -> SubscriptionOrder6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6
	 * SubscriptionExecution6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution6> forSubscriptionExecution6 = new MMConstraint<SubscriptionExecution6>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkSubscriptionExecution6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount.";
			owner_lazy = () -> SubscriptionExecution6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8
	 * SubscriptionOrder8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule#forSubscriptionOrder14
	 * ConstraintRequestedSettlementCurrencyRule.forSubscriptionOrder14}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder8> forSubscriptionOrder8 = new MMConstraint<SubscriptionOrder8>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkSubscriptionOrder8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule.forSubscriptionOrder14);
			owner_lazy = () -> SubscriptionOrder8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11
	 * RedemptionOrder11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder11> forRedemptionOrder11 = new MMConstraint<RedemptionOrder11>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkRedemptionOrder11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present.";
			owner_lazy = () -> RedemptionOrder11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12
	 * RedemptionExecution12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution12> forRedemptionExecution12 = new MMConstraint<RedemptionExecution12>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkRedemptionExecution12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount.";
			owner_lazy = () -> RedemptionExecution12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11
	 * SubscriptionOrder11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder11> forSubscriptionOrder11 = new MMConstraint<SubscriptionOrder11>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkSubscriptionOrder11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present.";
			owner_lazy = () -> SubscriptionOrder11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9
	 * SubscriptionExecution9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution9> forSubscriptionExecution9 = new MMConstraint<SubscriptionExecution9>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkSubscriptionExecution9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount.";
			owner_lazy = () -> SubscriptionExecution9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5
	 * SubscriptionBulkOrder5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule#forSubscriptionBulkOrder4
	 * ConstraintRequestedSettlementCurrencyRule.forSubscriptionBulkOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrder5> forSubscriptionBulkOrder5 = new MMConstraint<SubscriptionBulkOrder5>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkSubscriptionBulkOrder5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule.forSubscriptionBulkOrder4;
			owner_lazy = () -> SubscriptionBulkOrder5.mmObject();
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
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualExecutionDetails/SettlementAmount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule#forRedemptionBulkExecution3
	 * ConstraintRequestedSettlementCurrencyRule.forRedemptionBulkExecution3}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkExecution5> forRedemptionBulkExecution5 = new MMConstraint<RedemptionBulkExecution5>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkRedemptionBulkExecution5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualExecutionDetails/SettlementAmount.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule.forRedemptionBulkExecution3;
			owner_lazy = () -> RedemptionBulkExecution5.mmObject();
		}
	};
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
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualExecutionDetails/SettlementAmount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule#forSubscriptionBulkExecution3
	 * ConstraintRequestedSettlementCurrencyRule.forSubscriptionBulkExecution3}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkExecution4> forSubscriptionBulkExecution4 = new MMConstraint<SubscriptionBulkExecution4>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkSubscriptionBulkExecution4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualExecutionDetails/SettlementAmount.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule.forSubscriptionBulkExecution3;
			owner_lazy = () -> SubscriptionBulkExecution4.mmObject();
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
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule#forRedemptionBulkOrder4
	 * ConstraintRequestedSettlementCurrencyRule.forRedemptionBulkOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrder6> forRedemptionBulkOrder6 = new MMConstraint<RedemptionBulkOrder6>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkRedemptionBulkOrder6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule.forRedemptionBulkOrder4;
			owner_lazy = () -> RedemptionBulkOrder6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;rightOperand&gt;/SettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder14> forRedemptionOrder14 = new MMConstraint<RedemptionOrder14>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkRedemptionOrder14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present.";
			owner_lazy = () -> RedemptionOrder14.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/RequestedSettlementCurrency</leftOperand><rightOperand>/SettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/RequestedSettlementCurrency</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;rightOperand&gt;/SettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution13> forSubscriptionExecution13 = new MMConstraint<SubscriptionExecution13>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkSubscriptionExecution13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present.";
			owner_lazy = () -> SubscriptionExecution13.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/RequestedSettlementCurrency</leftOperand><rightOperand>/SettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/RequestedSettlementCurrency</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14
	 * SubscriptionOrder14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;rightOperand&gt;/SettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule#forSubscriptionOrder8
	 * ConstraintRequestedSettlementCurrencyRule.forSubscriptionOrder8}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder14> forSubscriptionOrder14 = new MMConstraint<SubscriptionOrder14>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkSubscriptionOrder14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule.forSubscriptionOrder8;
			owner_lazy = () -> SubscriptionOrder14.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/RequestedSettlementCurrency</leftOperand><rightOperand>/SettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/RequestedSettlementCurrency</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15
	 * RedemptionExecution15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;rightOperand&gt;/SettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution15> forRedemptionExecution15 = new MMConstraint<RedemptionExecution15>() {
		{
			validator = ConstraintRequestedSettlementCurrencyRule::checkRedemptionExecution15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present.";
			owner_lazy = () -> RedemptionExecution15.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/RequestedSettlementCurrency</leftOperand><rightOperand>/SettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/RequestedSettlementCurrency</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in all occurrences of IndividualOrderDetails/SettlementAmount, if
	 * present.
	 */
	public static void checkRedemptionBulkOrder3(RedemptionBulkOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in all occurrences of IndividualExecutionDetails/SettlementAmount.
	 */
	public static void checkRedemptionBulkExecution3(RedemptionBulkExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in all occurrences of IndividualOrderDetails/SettlementAmount, if
	 * present.
	 */
	public static void checkRedemptionBulkOrder4(RedemptionBulkOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount, if present.
	 */
	public static void checkRedemptionOrder6(RedemptionOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount.
	 */
	public static void checkRedemptionExecution6(RedemptionExecution6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount, if present.
	 */
	public static void checkRedemptionOrder8(RedemptionOrder8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in all occurrences of IndividualOrderDetails/SettlementAmount, if
	 * present.
	 */
	public static void checkSubscriptionBulkOrder3(SubscriptionBulkOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in all occurrences of IndividualExecutionDetails/SettlementAmount.
	 */
	public static void checkSubscriptionBulkExecution3(SubscriptionBulkExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in all occurrences of IndividualOrderDetails/SettlementAmount, if
	 * present.
	 */
	public static void checkSubscriptionBulkOrder4(SubscriptionBulkOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount, if present.
	 */
	public static void checkSubscriptionOrder6(SubscriptionOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount.
	 */
	public static void checkSubscriptionExecution6(SubscriptionExecution6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount, if present.
	 */
	public static void checkSubscriptionOrder8(SubscriptionOrder8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount, if present.
	 */
	public static void checkRedemptionOrder11(RedemptionOrder11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount.
	 */
	public static void checkRedemptionExecution12(RedemptionExecution12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount, if present.
	 */
	public static void checkSubscriptionOrder11(SubscriptionOrder11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount.
	 */
	public static void checkSubscriptionExecution9(SubscriptionExecution9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in all occurrences of IndividualOrderDetails/SettlementAmount, if
	 * present.
	 */
	public static void checkSubscriptionBulkOrder5(SubscriptionBulkOrder5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in all occurrences of IndividualExecutionDetails/SettlementAmount.
	 */
	public static void checkRedemptionBulkExecution5(RedemptionBulkExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in all occurrences of IndividualExecutionDetails/SettlementAmount.
	 */
	public static void checkSubscriptionBulkExecution4(SubscriptionBulkExecution4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in all occurrences of IndividualOrderDetails/SettlementAmount, if
	 * present.
	 */
	public static void checkRedemptionBulkOrder6(RedemptionBulkOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount, if present.
	 */
	public static void checkRedemptionOrder14(RedemptionOrder14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount, if present.
	 */
	public static void checkSubscriptionExecution13(SubscriptionExecution13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount, if present.
	 */
	public static void checkSubscriptionOrder14(SubscriptionOrder14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount, if present.
	 */
	public static void checkRedemptionExecution15(RedemptionExecution15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}