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
 * Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be
 * present.
 */
public class ConstraintPriceDifferenceReasonRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12
	 * SubscriptionExecution12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDifferenceReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule#forSubscriptionExecution5
	 * ConstraintPriceDifferenceReasonRule.forSubscriptionExecution5}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution12> forSubscriptionExecution12 = new MMConstraint<SubscriptionExecution12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDifferenceReasonRule";
			definition = "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule.forSubscriptionExecution5;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5
	 * RedemptionExecution5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDifferenceReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule#forRedemptionExecution16
	 * ConstraintPriceDifferenceReasonRule.forRedemptionExecution16}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution5> forRedemptionExecution5 = new MMConstraint<RedemptionExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDifferenceReasonRule";
			definition = "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule.forRedemptionExecution16);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDifferenceReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule#forRedemptionExecution5
	 * ConstraintPriceDifferenceReasonRule.forRedemptionExecution5}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution16> forRedemptionExecution16 = new MMConstraint<RedemptionExecution16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDifferenceReasonRule";
			definition = "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule.forRedemptionExecution5;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15
	 * RedemptionExecution15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDifferenceReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule#forRedemptionExecution6
	 * ConstraintPriceDifferenceReasonRule.forRedemptionExecution6}</li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution15> forRedemptionExecution15 = new MMConstraint<RedemptionExecution15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDifferenceReasonRule";
			definition = "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule.forRedemptionExecution6;
			owner_lazy = () -> RedemptionExecution15.mmObject();
		}

		@Override
		public void executeValidator(RedemptionExecution15 obj) throws Exception {
			checkRedemptionExecution15(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDifferenceReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule#forSubscriptionExecution6
	 * ConstraintPriceDifferenceReasonRule.forSubscriptionExecution6}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution13> forSubscriptionExecution13 = new MMConstraint<SubscriptionExecution13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDifferenceReasonRule";
			definition = "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule.forSubscriptionExecution6;
			owner_lazy = () -> SubscriptionExecution13.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionExecution13 obj) throws Exception {
			checkSubscriptionExecution13(obj);
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
	 * name} = "PriceDifferenceReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule#forSubscriptionExecution13
	 * ConstraintPriceDifferenceReasonRule.forSubscriptionExecution13}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution6> forSubscriptionExecution6 = new MMConstraint<SubscriptionExecution6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDifferenceReasonRule";
			definition = "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule.forSubscriptionExecution13);
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDifferenceReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule#forRedemptionExecution15
	 * ConstraintPriceDifferenceReasonRule.forRedemptionExecution15}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution6> forRedemptionExecution6 = new MMConstraint<RedemptionExecution6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDifferenceReasonRule";
			definition = "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule.forRedemptionExecution15);
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5
	 * SubscriptionExecution5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDifferenceReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule#forSubscriptionExecution12
	 * ConstraintPriceDifferenceReasonRule.forSubscriptionExecution12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution5> forSubscriptionExecution5 = new MMConstraint<SubscriptionExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDifferenceReasonRule";
			definition = "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule.forSubscriptionExecution12);
			owner_lazy = () -> SubscriptionExecution5.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionExecution5 obj) throws Exception {
			checkSubscriptionExecution5(obj);
		}
	};

	/**
	 * Any occurrence of InformativePriceDetails/PriceDifferenceReason may not
	 * be present.
	 */
	public static void checkSubscriptionExecution12(SubscriptionExecution12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Any occurrence of InformativePriceDetails/PriceDifferenceReason may not
	 * be present.
	 */
	public static void checkRedemptionExecution5(RedemptionExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Any occurrence of InformativePriceDetails/PriceDifferenceReason may not
	 * be present.
	 */
	public static void checkRedemptionExecution16(RedemptionExecution16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Any occurrence of InformativePriceDetails/PriceDifferenceReason may not
	 * be present.
	 */
	public static void checkRedemptionExecution15(RedemptionExecution15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Any occurrence of InformativePriceDetails/PriceDifferenceReason may not
	 * be present.
	 */
	public static void checkSubscriptionExecution13(SubscriptionExecution13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Any occurrence of InformativePriceDetails/PriceDifferenceReason may not
	 * be present.
	 */
	public static void checkSubscriptionExecution6(SubscriptionExecution6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Any occurrence of InformativePriceDetails/PriceDifferenceReason may not
	 * be present.
	 */
	public static void checkRedemptionExecution6(RedemptionExecution6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Any occurrence of InformativePriceDetails/PriceDifferenceReason may not
	 * be present.
	 */
	public static void checkSubscriptionExecution5(SubscriptionExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}