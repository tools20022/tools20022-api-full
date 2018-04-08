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
import com.tools20022.repository.msg.RedemptionBulkExecution2;
import com.tools20022.repository.msg.RedemptionBulkExecution3;
import java.util.Arrays;

/**
 * If BulkCashSettlementDetails is present, then Currency in
 * IndividualExecutionDetails/SettlementAmount must be the same in all
 * occurrences of IndividualOrderDetails.
 */
public class ConstraintSettlementCurrency1Rule {

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
	 * name} = "SettlementCurrency1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/SettlementAmount must be the same in all occurrences of IndividualOrderDetails."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrencyRule#forRedemptionBulkExecution5
	 * ConstraintSettlementCurrencyRule.forRedemptionBulkExecution5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkExecution3> forRedemptionBulkExecution3 = new MMConstraint<RedemptionBulkExecution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency1Rule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/SettlementAmount must be the same in all occurrences of IndividualOrderDetails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementCurrencyRule.forRedemptionBulkExecution5);
			owner_lazy = () -> RedemptionBulkExecution3.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkExecution3 obj) throws Exception {
			checkRedemptionBulkExecution3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2
	 * RedemptionBulkExecution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/NetAmount and GrossAmount must be the same in all occurrences of IndividualExecutionDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkExecution2> forRedemptionBulkExecution2 = new MMConstraint<RedemptionBulkExecution2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency1Rule";
			definition = "If BulkCashSettlementDetails is present, then Currency in IndividualExecutionDetails/NetAmount and GrossAmount must be the same in all occurrences of IndividualExecutionDetails.";
			owner_lazy = () -> RedemptionBulkExecution2.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkExecution2 obj) throws Exception {
			checkRedemptionBulkExecution2(obj);
		}
	};

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualExecutionDetails/SettlementAmount must be the same in all
	 * occurrences of IndividualOrderDetails.
	 */
	public static void checkRedemptionBulkExecution3(RedemptionBulkExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BulkCashSettlementDetails is present, then Currency in
	 * IndividualExecutionDetails/NetAmount and GrossAmount must be the same in
	 * all occurrences of IndividualExecutionDetails.
	 */
	public static void checkRedemptionBulkExecution2(RedemptionBulkExecution2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}