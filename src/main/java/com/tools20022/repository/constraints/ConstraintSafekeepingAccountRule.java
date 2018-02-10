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
import com.tools20022.repository.msg.IntraPositionCancellation1;
import com.tools20022.repository.msg.IntraPositionModification1;
import com.tools20022.repository.msg.IntraPositionMovements1;
import com.tools20022.repository.msg.SecuritiesSettlementTransactions1;

/**
 * SafekeepingAccount must be present or Movement(*)/SafekeepingAccount must be
 * present, but not both.
 */
public class ConstraintSafekeepingAccountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovements1
	 * IntraPositionMovements1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SafekeepingAccount must be present or Movement(*)/SafekeepingAccount must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovements1> forIntraPositionMovements1 = new MMConstraint<IntraPositionMovements1>() {
		{
			validator = ConstraintSafekeepingAccountRule::checkIntraPositionMovements1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRule";
			definition = "SafekeepingAccount must be present or Movement(*)/SafekeepingAccount must be present, but not both.";
			owner_lazy = () -> IntraPositionMovements1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactions1
	 * SecuritiesSettlementTransactions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SafekeepingAccount must be present or Transaction(*)/SafekeepingAccount must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactions1> forSecuritiesSettlementTransactions1 = new MMConstraint<SecuritiesSettlementTransactions1>() {
		{
			validator = ConstraintSafekeepingAccountRule::checkSecuritiesSettlementTransactions1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRule";
			definition = "SafekeepingAccount must be present or Transaction(*)/SafekeepingAccount must be present, but not both.";
			owner_lazy = () -> SecuritiesSettlementTransactions1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification1
	 * IntraPositionModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SafekeepingAccount must be present or Modification(*)/SafekeepingAccount  must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionModification1> forIntraPositionModification1 = new MMConstraint<IntraPositionModification1>() {
		{
			validator = ConstraintSafekeepingAccountRule::checkIntraPositionModification1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRule";
			definition = "SafekeepingAccount must be present or Modification(*)/SafekeepingAccount  must be present, but not both.";
			owner_lazy = () -> IntraPositionModification1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation1
	 * IntraPositionCancellation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SafekeepingAccount must be present or Cancellation(*)/SafekeepingAccount  must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionCancellation1> forIntraPositionCancellation1 = new MMConstraint<IntraPositionCancellation1>() {
		{
			validator = ConstraintSafekeepingAccountRule::checkIntraPositionCancellation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRule";
			definition = "SafekeepingAccount must be present or Cancellation(*)/SafekeepingAccount  must be present, but not both.";
			owner_lazy = () -> IntraPositionCancellation1.mmObject();
		}
	};

	/**
	 * SafekeepingAccount must be present or Movement(*)/SafekeepingAccount must
	 * be present, but not both.
	 */
	public static void checkIntraPositionMovements1(IntraPositionMovements1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingAccount must be present or Transaction(*)/SafekeepingAccount
	 * must be present, but not both.
	 */
	public static void checkSecuritiesSettlementTransactions1(SecuritiesSettlementTransactions1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingAccount must be present or Modification(*)/SafekeepingAccount
	 * must be present, but not both.
	 */
	public static void checkIntraPositionModification1(IntraPositionModification1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingAccount must be present or Cancellation(*)/SafekeepingAccount
	 * must be present, but not both.
	 */
	public static void checkIntraPositionCancellation1(IntraPositionCancellation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}