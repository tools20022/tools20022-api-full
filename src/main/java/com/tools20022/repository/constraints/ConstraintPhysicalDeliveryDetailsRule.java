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
 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
 */
public class ConstraintPhysicalDeliveryDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6
	 * RedemptionOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder6> forRedemptionOrder6 = new MMConstraint<RedemptionOrder6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> RedemptionOrder6.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrder6 obj) throws Exception {
			checkRedemptionOrder6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder5> forSubscriptionOrder5 = new MMConstraint<SubscriptionOrder5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SubscriptionOrder5.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrder5 obj) throws Exception {
			checkSubscriptionOrder5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3
	 * RedemptionExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution3> forRedemptionExecution3 = new MMConstraint<RedemptionExecution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> RedemptionExecution3.mmObject();
		}

		@Override
		public void executeValidator(RedemptionExecution3 obj) throws Exception {
			checkRedemptionExecution3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2
	 * SwitchSubscriptionLegExecution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchSubscriptionLegExecution2> forSwitchSubscriptionLegExecution2 = new MMConstraint<SwitchSubscriptionLegExecution2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SwitchSubscriptionLegExecution2.mmObject();
		}

		@Override
		public void executeValidator(SwitchSubscriptionLegExecution2 obj) throws Exception {
			checkSwitchSubscriptionLegExecution2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3
	 * SwitchRedemptionLegExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchRedemptionLegExecution3> forSwitchRedemptionLegExecution3 = new MMConstraint<SwitchRedemptionLegExecution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SwitchRedemptionLegExecution3.mmObject();
		}

		@Override
		public void executeValidator(SwitchRedemptionLegExecution3 obj) throws Exception {
			checkSwitchRedemptionLegExecution3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4
	 * RedemptionOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder4> forRedemptionOrder4 = new MMConstraint<RedemptionOrder4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> RedemptionOrder4.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrder4 obj) throws Exception {
			checkRedemptionOrder4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3
	 * RedemptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder3> forRedemptionOrder3 = new MMConstraint<RedemptionOrder3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> RedemptionOrder3.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrder3 obj) throws Exception {
			checkRedemptionOrder3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4
	 * SubscriptionExecution4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution4> forSubscriptionExecution4 = new MMConstraint<SubscriptionExecution4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SubscriptionExecution4.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionExecution4 obj) throws Exception {
			checkSubscriptionExecution4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7
	 * SubscriptionOrder7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder7> forSubscriptionOrder7 = new MMConstraint<SubscriptionOrder7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SubscriptionOrder7.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrder7 obj) throws Exception {
			checkSubscriptionOrder7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2
	 * SwitchRedemptionLegExecution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchRedemptionLegExecution2> forSwitchRedemptionLegExecution2 = new MMConstraint<SwitchRedemptionLegExecution2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SwitchRedemptionLegExecution2.mmObject();
		}

		@Override
		public void executeValidator(SwitchRedemptionLegExecution2 obj) throws Exception {
			checkSwitchRedemptionLegExecution2(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder8> forRedemptionOrder8 = new MMConstraint<RedemptionOrder8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> RedemptionOrder8.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrder8 obj) throws Exception {
			checkRedemptionOrder8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5
	 * RedemptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder5> forRedemptionOrder5 = new MMConstraint<RedemptionOrder5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> RedemptionOrder5.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrder5 obj) throws Exception {
			checkRedemptionOrder5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5
	 * RedemptionExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution5> forRedemptionExecution5 = new MMConstraint<RedemptionExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> RedemptionExecution5.mmObject();
		}

		@Override
		public void executeValidator(RedemptionExecution5 obj) throws Exception {
			checkRedemptionExecution5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder3> forSubscriptionOrder3 = new MMConstraint<SubscriptionOrder3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SubscriptionOrder3.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrder3 obj) throws Exception {
			checkSubscriptionOrder3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4
	 * RedemptionExecution4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution4> forRedemptionExecution4 = new MMConstraint<RedemptionExecution4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> RedemptionExecution4.mmObject();
		}

		@Override
		public void executeValidator(RedemptionExecution4 obj) throws Exception {
			checkRedemptionExecution4(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder6> forSubscriptionOrder6 = new MMConstraint<SubscriptionOrder6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SubscriptionOrder6.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrder6 obj) throws Exception {
			checkSubscriptionOrder6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4
	 * SubscriptionOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder4> forSubscriptionOrder4 = new MMConstraint<SubscriptionOrder4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SubscriptionOrder4.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrder4 obj) throws Exception {
			checkSubscriptionOrder4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7
	 * RedemptionOrder7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder7> forRedemptionOrder7 = new MMConstraint<RedemptionOrder7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> RedemptionOrder7.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrder7 obj) throws Exception {
			checkRedemptionOrder7(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution6> forSubscriptionExecution6 = new MMConstraint<SubscriptionExecution6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SubscriptionExecution6.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionExecution6 obj) throws Exception {
			checkSubscriptionExecution6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3
	 * SubscriptionExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution3> forSubscriptionExecution3 = new MMConstraint<SubscriptionExecution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SubscriptionExecution3.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionExecution3 obj) throws Exception {
			checkSubscriptionExecution3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3
	 * SwitchSubscriptionLegExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchSubscriptionLegExecution3> forSwitchSubscriptionLegExecution3 = new MMConstraint<SwitchSubscriptionLegExecution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SwitchSubscriptionLegExecution3.mmObject();
		}

		@Override
		public void executeValidator(SwitchSubscriptionLegExecution3 obj) throws Exception {
			checkSwitchSubscriptionLegExecution3(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution6> forRedemptionExecution6 = new MMConstraint<RedemptionExecution6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> RedemptionExecution6.mmObject();
		}

		@Override
		public void executeValidator(RedemptionExecution6 obj) throws Exception {
			checkRedemptionExecution6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3
	 * SwitchRedemptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchRedemptionLegOrder3> forSwitchRedemptionLegOrder3 = new MMConstraint<SwitchRedemptionLegOrder3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SwitchRedemptionLegOrder3.mmObject();
		}

		@Override
		public void executeValidator(SwitchRedemptionLegOrder3 obj) throws Exception {
			checkSwitchRedemptionLegOrder3(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails1Rule#forSubscriptionOrder14
	 * ConstraintPhysicalDeliveryDetails1Rule.forSubscriptionOrder14}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder8> forSubscriptionOrder8 = new MMConstraint<SubscriptionOrder8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails1Rule.forSubscriptionOrder14);
			owner_lazy = () -> SubscriptionOrder8.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrder8 obj) throws Exception {
			checkSubscriptionOrder8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5
	 * SubscriptionExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution5> forSubscriptionExecution5 = new MMConstraint<SubscriptionExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SubscriptionExecution5.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionExecution5 obj) throws Exception {
			checkSubscriptionExecution5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2
	 * SwitchRedemptionLegOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchRedemptionLegOrder2> forSwitchRedemptionLegOrder2 = new MMConstraint<SwitchRedemptionLegOrder2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SwitchRedemptionLegOrder2.mmObject();
		}

		@Override
		public void executeValidator(SwitchRedemptionLegOrder2 obj) throws Exception {
			checkSwitchRedemptionLegOrder2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2
	 * SwitchSubscriptionLegOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchSubscriptionLegOrder2> forSwitchSubscriptionLegOrder2 = new MMConstraint<SwitchSubscriptionLegOrder2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SwitchSubscriptionLegOrder2.mmObject();
		}

		@Override
		public void executeValidator(SwitchSubscriptionLegOrder2 obj) throws Exception {
			checkSwitchSubscriptionLegOrder2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchSubscriptionLegOrder3> forSwitchSubscriptionLegOrder3 = new MMConstraint<SwitchSubscriptionLegOrder3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetailsRule";
			definition = "If PhysicalDeliveryIndicator is \"false\" or \"0\" (No), then PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is \"true\" or \"1\" (Yes), then PhysicalDeliveryDetails must be present.";
			owner_lazy = () -> SwitchSubscriptionLegOrder3.mmObject();
		}

		@Override
		public void executeValidator(SwitchSubscriptionLegOrder3 obj) throws Exception {
			checkSwitchSubscriptionLegOrder3(obj);
		}
	};

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkRedemptionOrder6(RedemptionOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSubscriptionOrder5(SubscriptionOrder5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkRedemptionExecution3(RedemptionExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSwitchSubscriptionLegExecution2(SwitchSubscriptionLegExecution2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSwitchRedemptionLegExecution3(SwitchRedemptionLegExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkRedemptionOrder4(RedemptionOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkRedemptionOrder3(RedemptionOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSubscriptionExecution4(SubscriptionExecution4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSubscriptionOrder7(SubscriptionOrder7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSwitchRedemptionLegExecution2(SwitchRedemptionLegExecution2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkRedemptionOrder8(RedemptionOrder8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkRedemptionOrder5(RedemptionOrder5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkRedemptionExecution5(RedemptionExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSubscriptionOrder3(SubscriptionOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkRedemptionExecution4(RedemptionExecution4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSubscriptionOrder6(SubscriptionOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSubscriptionOrder4(SubscriptionOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkRedemptionOrder7(RedemptionOrder7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSubscriptionExecution6(SubscriptionExecution6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSubscriptionExecution3(SubscriptionExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSwitchSubscriptionLegExecution3(SwitchSubscriptionLegExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkRedemptionExecution6(RedemptionExecution6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSwitchRedemptionLegOrder3(SwitchRedemptionLegOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSubscriptionOrder8(SubscriptionOrder8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSubscriptionExecution5(SubscriptionExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSwitchRedemptionLegOrder2(SwitchRedemptionLegOrder2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSwitchSubscriptionLegOrder2(SwitchSubscriptionLegOrder2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalDeliveryIndicator is "false" or "0" (No), then
	 * PhysicalDeliveryDetails is not allowed. If PhysicalDeliveryIndicator is
	 * "true" or "1" (Yes), then PhysicalDeliveryDetails must be present.
	 */
	public static void checkSwitchSubscriptionLegOrder3(SwitchSubscriptionLegOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}