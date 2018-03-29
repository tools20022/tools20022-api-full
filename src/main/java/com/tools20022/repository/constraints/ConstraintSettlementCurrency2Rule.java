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
 * If BulkCashSettlementDetails is present, then Currency in
 * IndividualOrderDetails/NetAmount and GrossAmount must be the same in all
 * occurrences of IndividualOrderDetails.
 */
public class ConstraintSettlementCurrency2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2
	 * RedemptionBulkOrder2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/NetAmount and GrossAmount must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrder2> forRedemptionBulkOrder2 = new MMConstraint<RedemptionBulkOrder2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency2Rule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/NetAmount and GrossAmount must be the same in all occurrences of IndividualOrderDetails.";
			owner_lazy = () -> RedemptionBulkOrder2.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrder2 obj) throws Exception {
			checkRedemptionBulkOrder2(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrder3> forRedemptionBulkOrder3 = new MMConstraint<RedemptionBulkOrder3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency2Rule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails.";
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4
	 * RedemptionBulkOrder4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrencyRule#forRedemptionBulkOrder6
	 * ConstraintSettlementCurrencyRule.forRedemptionBulkOrder6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrder4> forRedemptionBulkOrder4 = new MMConstraint<RedemptionBulkOrder4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency2Rule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementCurrencyRule.forRedemptionBulkOrder6);
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2
	 * SubscriptionBulkOrder2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/NetAmount and GrossAmount must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrder2> forSubscriptionBulkOrder2 = new MMConstraint<SubscriptionBulkOrder2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency2Rule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/NetAmount and GrossAmount must be the same in all occurrences of IndividualOrderDetails.";
			owner_lazy = () -> SubscriptionBulkOrder2.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrder2 obj) throws Exception {
			checkSubscriptionBulkOrder2(obj);
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
	 * name} = "SettlementCurrency2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrder3> forSubscriptionBulkOrder3 = new MMConstraint<SubscriptionBulkOrder3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency2Rule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails.";
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4
	 * SubscriptionBulkOrder4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrency2Rule#forSubscriptionBulkOrder5
	 * ConstraintSettlementCurrency2Rule.forSubscriptionBulkOrder5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrder4> forSubscriptionBulkOrder4 = new MMConstraint<SubscriptionBulkOrder4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency2Rule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementCurrency2Rule.forSubscriptionBulkOrder5);
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5
	 * SubscriptionBulkOrder5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrency2Rule#forSubscriptionBulkOrder4
	 * ConstraintSettlementCurrency2Rule.forSubscriptionBulkOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrder5> forSubscriptionBulkOrder5 = new MMConstraint<SubscriptionBulkOrder5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency2Rule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualOrderDetails/SettlementAmount, if present, must be the same in all occurrences of IndividualOrderDetails.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementCurrency2Rule.forSubscriptionBulkOrder4;
			owner_lazy = () -> SubscriptionBulkOrder5.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrder5 obj) throws Exception {
			checkSubscriptionBulkOrder5(obj);
		}
	};

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualOrderDetails/NetAmount and GrossAmount must be the same in all
	 * occurrences of IndividualOrderDetails.
	 */
	public static void checkRedemptionBulkOrder2(RedemptionBulkOrder2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualOrderDetails/SettlementAmount, if present, must be the same in
	 * all occurrences of IndividualOrderDetails.
	 */
	public static void checkRedemptionBulkOrder3(RedemptionBulkOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualOrderDetails/SettlementAmount, if present, must be the same in
	 * all occurrences of IndividualOrderDetails.
	 */
	public static void checkRedemptionBulkOrder4(RedemptionBulkOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualOrderDetails/NetAmount and GrossAmount must be the same in all
	 * occurrences of IndividualOrderDetails.
	 */
	public static void checkSubscriptionBulkOrder2(SubscriptionBulkOrder2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualOrderDetails/SettlementAmount, if present, must be the same in
	 * all occurrences of IndividualOrderDetails.
	 */
	public static void checkSubscriptionBulkOrder3(SubscriptionBulkOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualOrderDetails/SettlementAmount, if present, must be the same in
	 * all occurrences of IndividualOrderDetails.
	 */
	public static void checkSubscriptionBulkOrder4(SubscriptionBulkOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualOrderDetails/SettlementAmount, if present, must be the same in
	 * all occurrences of IndividualOrderDetails.
	 */
	public static void checkSubscriptionBulkOrder5(SubscriptionBulkOrder5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}