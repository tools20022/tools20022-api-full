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
 * Either IndividualExecutionDetails/CashSettlementDetails or
 * BulkCashSettlementDetails may be present, but not both.
 */
public class ConstraintBulkCashSettlementDetails6Rule {

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
	 * name} = "BulkCashSettlementDetails6Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkExecution2> forRedemptionBulkExecution2 = new MMConstraint<RedemptionBulkExecution2>() {
		{
			validator = ConstraintBulkCashSettlementDetails6Rule::checkRedemptionBulkExecution2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails6Rule";
			definition = "Either IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			owner_lazy = () -> RedemptionBulkExecution2.mmObject();
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
	 * name} = "BulkCashSettlementDetails6Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetailsRule#forRedemptionBulkExecution5
	 * ConstraintBulkCashSettlementDetailsRule.forRedemptionBulkExecution5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkExecution3> forRedemptionBulkExecution3 = new MMConstraint<RedemptionBulkExecution3>() {
		{
			validator = ConstraintBulkCashSettlementDetails6Rule::checkRedemptionBulkExecution3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails6Rule";
			definition = "Either IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetailsRule.forRedemptionBulkExecution5);
			owner_lazy = () -> RedemptionBulkExecution3.mmObject();
		}
	};

	/**
	 * Either IndividualExecutionDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkRedemptionBulkExecution2(RedemptionBulkExecution2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either IndividualExecutionDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkRedemptionBulkExecution3(RedemptionBulkExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}