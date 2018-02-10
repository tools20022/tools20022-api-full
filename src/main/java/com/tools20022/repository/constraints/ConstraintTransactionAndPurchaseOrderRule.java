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
import com.tools20022.repository.msg.ReportLine1;

/**
 * The transaction identification and purchase order must match, that is, the
 * purchase order must be the one contained in the baseline/transaction,
 * identified by the transaction identification.
 */
public class ConstraintTransactionAndPurchaseOrderRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReportLine1 ReportLine1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionAndPurchaseOrderRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The transaction identification and purchase order must match, that is, the purchase order must be the one contained in the baseline/transaction, identified by the transaction identification."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReportLine1> forReportLine1 = new MMConstraint<ReportLine1>() {
		{
			validator = ConstraintTransactionAndPurchaseOrderRule::checkReportLine1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAndPurchaseOrderRule";
			definition = "The transaction identification and purchase order must match, that is, the purchase order must be the one contained in the baseline/transaction, identified by the transaction identification.";
			owner_lazy = () -> ReportLine1.mmObject();
		}
	};

	/**
	 * The transaction identification and purchase order must match, that is,
	 * the purchase order must be the one contained in the baseline/transaction,
	 * identified by the transaction identification.
	 */
	public static void checkReportLine1(ReportLine1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}