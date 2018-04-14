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
 * Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more
 * instances of
 * IndividualExecutionDetails/RelatedPartiesDetails/OrderOriginatorEligibility)
 * may be present, but not both.
 */
public class ConstraintOrderOriginatorEligibility3Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3
	 * SubscriptionMultipleExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of IndividualExecutionDetails/RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forSubscriptionMultipleExecution5
	 * ConstraintOrderOriginatorEligibility3Rule.
	 * forSubscriptionMultipleExecution5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleExecution3> forSubscriptionMultipleExecution3 = new MMConstraint<SubscriptionMultipleExecution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of IndividualExecutionDetails/RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forSubscriptionMultipleExecution5);
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
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of \nIndividualExecutionDetails/RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forRedemptionMultipleExecution5
	 * ConstraintOrderOriginatorEligibility3Rule.forRedemptionMultipleExecution5
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleExecution3> forRedemptionMultipleExecution3 = new MMConstraint<RedemptionMultipleExecution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of \nIndividualExecutionDetails/RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forRedemptionMultipleExecution5);
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15
	 * RedemptionOrder15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forRedemptionOrder7
	 * ConstraintOrderOriginatorEligibility3Rule.forRedemptionOrder7}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder15> forRedemptionOrder15 = new MMConstraint<RedemptionOrder15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forRedemptionOrder7;
			owner_lazy = () -> RedemptionOrder15.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrder15 obj) throws Exception {
			checkRedemptionOrder15(obj);
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
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both."
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
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both.";
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7 SwitchOrder7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility should be only present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibilityRule#forSwitchOrder4
	 * ConstraintOrderOriginatorEligibilityRule.forSwitchOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder7> forSwitchOrder7 = new MMConstraint<SwitchOrder7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility should be only present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibilityRule.forSwitchOrder4;
			owner_lazy = () -> SwitchOrder7.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrder7 obj) throws Exception {
			checkSwitchOrder7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12
	 * SubscriptionExecution12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forSubscriptionExecution5
	 * ConstraintOrderOriginatorEligibility3Rule.forSubscriptionExecution5}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution12> forSubscriptionExecution12 = new MMConstraint<SubscriptionExecution12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forSubscriptionExecution5;
			owner_lazy = () -> SubscriptionExecution12.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionExecution12 obj) throws Exception {
			checkSubscriptionExecution12(obj);
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
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either one or more occurrences of IndividualOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility or InvestmentAccountDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forSubscriptionMultipleOrder4
	 * ConstraintOrderOriginatorEligibility3Rule.forSubscriptionMultipleOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrder6> forSubscriptionMultipleOrder6 = new MMConstraint<SubscriptionMultipleOrder6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either one or more occurrences of IndividualOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility or InvestmentAccountDetails/OrderOriginatorEligibility may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forSubscriptionMultipleOrder4;
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7
	 * SubscriptionOrder7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forSubscriptionOrder15
	 * ConstraintOrderOriginatorEligibility3Rule.forSubscriptionOrder15}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder7> forSubscriptionOrder7 = new MMConstraint<SubscriptionOrder7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forSubscriptionOrder15);
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
	 * RedemptionMultipleOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of IndividualOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forRedemptionMultipleOrder4
	 * ConstraintOrderOriginatorEligibility3Rule.forRedemptionMultipleOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrder6> forRedemptionMultipleOrder6 = new MMConstraint<RedemptionMultipleOrder6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of IndividualOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forRedemptionMultipleOrder4;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3
	 * RedemptionMultipleOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of IndividualOrderDetails/RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both."
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
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of IndividualOrderDetails/RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both.";
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5
	 * RedemptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both."
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
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both.";
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
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forRedemptionExecution16
	 * ConstraintOrderOriginatorEligibility3Rule.forRedemptionExecution16}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution5> forRedemptionExecution5 = new MMConstraint<RedemptionExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forRedemptionExecution16);
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forRedemptionExecution5
	 * ConstraintOrderOriginatorEligibility3Rule.forRedemptionExecution5}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution16> forRedemptionExecution16 = new MMConstraint<RedemptionExecution16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forRedemptionExecution5;
			owner_lazy = () -> RedemptionExecution16.mmObject();
		}

		@Override
		public void executeValidator(RedemptionExecution16 obj) throws Exception {
			checkRedemptionExecution16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7
	 * SwitchExecution7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility should be only present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibilityRule#forSwitchExecution4
	 * ConstraintOrderOriginatorEligibilityRule.forSwitchExecution4}</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchExecution7> forSwitchExecution7 = new MMConstraint<SwitchExecution7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility should be only present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibilityRule.forSwitchExecution4;
			owner_lazy = () -> SwitchExecution7.mmObject();
		}

		@Override
		public void executeValidator(SwitchExecution7 obj) throws Exception {
			checkSwitchExecution7(obj);
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
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forRedemptionOrder15
	 * ConstraintOrderOriginatorEligibility3Rule.forRedemptionOrder15}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder7> forRedemptionOrder7 = new MMConstraint<RedemptionOrder7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forRedemptionOrder15);
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forSubscriptionOrder7
	 * ConstraintOrderOriginatorEligibility3Rule.forSubscriptionOrder7}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder15> forSubscriptionOrder15 = new MMConstraint<SubscriptionOrder15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forSubscriptionOrder7;
			owner_lazy = () -> SubscriptionOrder15.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrder15 obj) throws Exception {
			checkSubscriptionOrder15(obj);
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
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of IndividualExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forRedemptionMultipleExecution3
	 * ConstraintOrderOriginatorEligibility3Rule.forRedemptionMultipleExecution3
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleExecution5> forRedemptionMultipleExecution5 = new MMConstraint<RedemptionMultipleExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of IndividualExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forRedemptionMultipleExecution3;
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3
	 * SubscriptionMultipleOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of IndividualOrderDetails/RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both."
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
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of IndividualOrderDetails/RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both.";
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5
	 * SubscriptionMultipleExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of IndividualExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forSubscriptionMultipleExecution3
	 * ConstraintOrderOriginatorEligibility3Rule.
	 * forSubscriptionMultipleExecution3}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleExecution5> forSubscriptionMultipleExecution5 = new MMConstraint<SubscriptionMultipleExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of IndividualExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forSubscriptionMultipleExecution3;
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5
	 * SubscriptionExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forSubscriptionExecution12
	 * ConstraintOrderOriginatorEligibility3Rule.forSubscriptionExecution12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution5> forSubscriptionExecution5 = new MMConstraint<SubscriptionExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forSubscriptionExecution12);
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualOrderDetails/RelatedPartiesDetails/OrderOriginatorEligibility or (one or more instances of InvestmentAccountDetails/OrderOriginatorEligibility) may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forSubscriptionMultipleOrder6
	 * ConstraintOrderOriginatorEligibility3Rule.forSubscriptionMultipleOrder6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrder4> forSubscriptionMultipleOrder4 = new MMConstraint<SubscriptionMultipleOrder4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either IndividualOrderDetails/RelatedPartiesDetails/OrderOriginatorEligibility or (one or more instances of InvestmentAccountDetails/OrderOriginatorEligibility) may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forSubscriptionMultipleOrder6);
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
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of IndividualOrderDetails/RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forRedemptionMultipleOrder6
	 * ConstraintOrderOriginatorEligibility3Rule.forRedemptionMultipleOrder6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrder4> forRedemptionMultipleOrder4 = new MMConstraint<RedemptionMultipleOrder4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or more instances of IndividualOrderDetails/RelatedPartiesDetails/OrderOriginatorEligibility) may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forRedemptionMultipleOrder6);
			owner_lazy = () -> RedemptionMultipleOrder4.mmObject();
		}

		@Override
		public void executeValidator(RedemptionMultipleOrder4 obj) throws Exception {
			checkRedemptionMultipleOrder4(obj);
		}
	};

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or
	 * more instances of IndividualExecutionDetails/RelatedPartiesDetails/
	 * OrderOriginatorEligibility) may be present, but not both.
	 */
	public static void checkSubscriptionMultipleExecution3(SubscriptionMultipleExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or
	 * more instances of IndividualExecutionDetails/RelatedPartiesDetails/
	 * OrderOriginatorEligibility) may be present, but not both.
	 */
	public static void checkRedemptionMultipleExecution3(RedemptionMultipleExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
	 * occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be
	 * present, but not both.
	 */
	public static void checkRedemptionOrder15(RedemptionOrder15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or
	 * more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may
	 * be present, but not both.
	 */
	public static void checkSubscriptionOrder5(SubscriptionOrder5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or a single
	 * occurrence of RedemptionLegDetails/InvestmentAccountDetails/
	 * OrderOriginatorEligibility or a single occurrence of
	 * SubscriptionLegDetails
	 * /InvestmentAccountDetails/OrderOriginatorEligibility should be only
	 * present.
	 */
	public static void checkSwitchOrder7(SwitchOrder7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
	 * occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be
	 * present, but not both.
	 */
	public static void checkSubscriptionExecution12(SubscriptionExecution12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either one or more occurrences of
	 * IndividualOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility or
	 * InvestmentAccountDetails/OrderOriginatorEligibility may be present, but
	 * not both.
	 */
	public static void checkSubscriptionMultipleOrder6(SubscriptionMultipleOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or
	 * more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may
	 * be present, but not both.
	 */
	public static void checkSubscriptionOrder7(SubscriptionOrder7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
	 * occurrences of
	 * IndividualOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility may
	 * be present, but not both.
	 */
	public static void checkRedemptionMultipleOrder6(RedemptionMultipleOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or
	 * more instances of
	 * IndividualOrderDetails/RelatedPartiesDetails/OrderOriginatorEligibility)
	 * may be present, but not both.
	 */
	public static void checkRedemptionMultipleOrder3(RedemptionMultipleOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or
	 * more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may
	 * be present, but not both.
	 */
	public static void checkRedemptionOrder5(RedemptionOrder5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or
	 * more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may
	 * be present, but not both.
	 */
	public static void checkRedemptionExecution5(RedemptionExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
	 * occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be
	 * present, but not both.
	 */
	public static void checkRedemptionExecution16(RedemptionExecution16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or a single
	 * occurrence of RedemptionLegDetails/InvestmentAccountDetails/
	 * OrderOriginatorEligibility or a single occurrence of
	 * SubscriptionLegDetails
	 * /InvestmentAccountDetails/OrderOriginatorEligibility should be only
	 * present.
	 */
	public static void checkSwitchExecution7(SwitchExecution7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or
	 * more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may
	 * be present, but not both.
	 */
	public static void checkRedemptionOrder7(RedemptionOrder7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
	 * occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be
	 * present, but not both.
	 */
	public static void checkSubscriptionOrder15(SubscriptionOrder15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
	 * occurrences of IndividualExecutionDetails/RelatedPartyDetails/
	 * OrderOriginatorEligibility may be present, but not both.
	 */
	public static void checkRedemptionMultipleExecution5(RedemptionMultipleExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or
	 * more instances of
	 * IndividualOrderDetails/RelatedPartiesDetails/OrderOriginatorEligibility)
	 * may be present, but not both.
	 */
	public static void checkSubscriptionMultipleOrder3(SubscriptionMultipleOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
	 * occurrences of IndividualExecutionDetails/RelatedPartyDetails/
	 * OrderOriginatorEligibility may be present, but not both.
	 */
	public static void checkSubscriptionMultipleExecution5(SubscriptionMultipleExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or
	 * more instances of RelatedPartiesDetails/OrderOriginatorEligibility) may
	 * be present, but not both.
	 */
	public static void checkSubscriptionExecution5(SubscriptionExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either
	 * IndividualOrderDetails/RelatedPartiesDetails/OrderOriginatorEligibility
	 * or (one or more instances of
	 * InvestmentAccountDetails/OrderOriginatorEligibility) may be present, but
	 * not both.
	 */
	public static void checkSubscriptionMultipleOrder4(SubscriptionMultipleOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or (one or
	 * more instances of
	 * IndividualOrderDetails/RelatedPartiesDetails/OrderOriginatorEligibility)
	 * may be present, but not both.
	 */
	public static void checkRedemptionMultipleOrder4(RedemptionMultipleOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}