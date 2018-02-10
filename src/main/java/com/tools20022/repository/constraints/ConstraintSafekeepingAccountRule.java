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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule#forIntraPositionMovements2
	 * ConstraintSafekeepingAccountRule.forIntraPositionMovements2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovements1> forIntraPositionMovements1 = new MMConstraint<IntraPositionMovements1>() {
		{
			validator = ConstraintSafekeepingAccountRule::checkIntraPositionMovements1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRule";
			definition = "SafekeepingAccount must be present or Movement(*)/SafekeepingAccount must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule.forIntraPositionMovements2);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule#forSecuritiesSettlementTransactions2
	 * ConstraintSafekeepingAccountRule.forSecuritiesSettlementTransactions2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactions1> forSecuritiesSettlementTransactions1 = new MMConstraint<SecuritiesSettlementTransactions1>() {
		{
			validator = ConstraintSafekeepingAccountRule::checkSecuritiesSettlementTransactions1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRule";
			definition = "SafekeepingAccount must be present or Transaction(*)/SafekeepingAccount must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule.forSecuritiesSettlementTransactions2);
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
	 * "SafekeepingAccount must be present or Modification(*)/SafekeepingAccount must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule#forIntraPositionModification3
	 * ConstraintSafekeepingAccountRule.forIntraPositionModification3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionModification1> forIntraPositionModification1 = new MMConstraint<IntraPositionModification1>() {
		{
			validator = ConstraintSafekeepingAccountRule::checkIntraPositionModification1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRule";
			definition = "SafekeepingAccount must be present or Modification(*)/SafekeepingAccount must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule.forIntraPositionModification3);
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
	 * "SafekeepingAccount must be present or Cancellation(*)/SafekeepingAccount must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule#forIntraPositionCancellation3
	 * ConstraintSafekeepingAccountRule.forIntraPositionCancellation3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionCancellation1> forIntraPositionCancellation1 = new MMConstraint<IntraPositionCancellation1>() {
		{
			validator = ConstraintSafekeepingAccountRule::checkIntraPositionCancellation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRule";
			definition = "SafekeepingAccount must be present or Cancellation(*)/SafekeepingAccount must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule.forIntraPositionCancellation3);
			owner_lazy = () -> IntraPositionCancellation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification3
	 * IntraPositionModification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SafekeepingAccount must be present or Modification(*)/SafekeepingAccount must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule#forIntraPositionModification1
	 * ConstraintSafekeepingAccountRule.forIntraPositionModification1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionModification3> forIntraPositionModification3 = new MMConstraint<IntraPositionModification3>() {
		{
			validator = ConstraintSafekeepingAccountRule::checkIntraPositionModification3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRule";
			definition = "SafekeepingAccount must be present or Modification(*)/SafekeepingAccount must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule.forIntraPositionModification1;
			owner_lazy = () -> IntraPositionModification3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovements2
	 * IntraPositionMovements2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule#forIntraPositionMovements3
	 * ConstraintSafekeepingAccountRule.forIntraPositionMovements3}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule#forIntraPositionMovements1
	 * ConstraintSafekeepingAccountRule.forIntraPositionMovements1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovements2> forIntraPositionMovements2 = new MMConstraint<IntraPositionMovements2>() {
		{
			validator = ConstraintSafekeepingAccountRule::checkIntraPositionMovements2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRule";
			definition = "SafekeepingAccount must be present or Movement(*)/SafekeepingAccount must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule.forIntraPositionMovements3);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule.forIntraPositionMovements1;
			owner_lazy = () -> IntraPositionMovements2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactions2
	 * SecuritiesSettlementTransactions2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule#forSecuritiesSettlementTransactions3
	 * ConstraintSafekeepingAccountRule.forSecuritiesSettlementTransactions3}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule#forSecuritiesSettlementTransactions1
	 * ConstraintSafekeepingAccountRule.forSecuritiesSettlementTransactions1}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactions2> forSecuritiesSettlementTransactions2 = new MMConstraint<SecuritiesSettlementTransactions2>() {
		{
			validator = ConstraintSafekeepingAccountRule::checkSecuritiesSettlementTransactions2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRule";
			definition = "SafekeepingAccount must be present or Transaction(*)/SafekeepingAccount must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule.forSecuritiesSettlementTransactions3);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule.forSecuritiesSettlementTransactions1;
			owner_lazy = () -> SecuritiesSettlementTransactions2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation3
	 * IntraPositionCancellation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SafekeepingAccount must be present or Cancellation(*)/SafekeepingAccount must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule#forIntraPositionCancellation1
	 * ConstraintSafekeepingAccountRule.forIntraPositionCancellation1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionCancellation3> forIntraPositionCancellation3 = new MMConstraint<IntraPositionCancellation3>() {
		{
			validator = ConstraintSafekeepingAccountRule::checkIntraPositionCancellation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRule";
			definition = "SafekeepingAccount must be present or Cancellation(*)/SafekeepingAccount must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule.forIntraPositionCancellation1;
			owner_lazy = () -> IntraPositionCancellation3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovements3
	 * IntraPositionMovements3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule#forIntraPositionMovements2
	 * ConstraintSafekeepingAccountRule.forIntraPositionMovements2}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovements3> forIntraPositionMovements3 = new MMConstraint<IntraPositionMovements3>() {
		{
			validator = ConstraintSafekeepingAccountRule::checkIntraPositionMovements3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRule";
			definition = "SafekeepingAccount must be present or Movement(*)/SafekeepingAccount must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule.forIntraPositionMovements2;
			owner_lazy = () -> IntraPositionMovements3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactions3
	 * SecuritiesSettlementTransactions3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule#forSecuritiesSettlementTransactions2
	 * ConstraintSafekeepingAccountRule.forSecuritiesSettlementTransactions2}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactions3> forSecuritiesSettlementTransactions3 = new MMConstraint<SecuritiesSettlementTransactions3>() {
		{
			validator = ConstraintSafekeepingAccountRule::checkSecuritiesSettlementTransactions3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRule";
			definition = "SafekeepingAccount must be present or Transaction(*)/SafekeepingAccount must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccountRule.forSecuritiesSettlementTransactions2;
			owner_lazy = () -> SecuritiesSettlementTransactions3.mmObject();
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

	/**
	 * SafekeepingAccount must be present or Modification(*)/SafekeepingAccount
	 * must be present, but not both.
	 */
	public static void checkIntraPositionModification3(IntraPositionModification3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingAccount must be present or Movement(*)/SafekeepingAccount must
	 * be present, but not both.
	 */
	public static void checkIntraPositionMovements2(IntraPositionMovements2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingAccount must be present or Transaction(*)/SafekeepingAccount
	 * must be present, but not both.
	 */
	public static void checkSecuritiesSettlementTransactions2(SecuritiesSettlementTransactions2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingAccount must be present or Cancellation(*)/SafekeepingAccount
	 * must be present, but not both.
	 */
	public static void checkIntraPositionCancellation3(IntraPositionCancellation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingAccount must be present or Movement(*)/SafekeepingAccount must
	 * be present, but not both.
	 */
	public static void checkIntraPositionMovements3(IntraPositionMovements3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingAccount must be present or Transaction(*)/SafekeepingAccount
	 * must be present, but not both.
	 */
	public static void checkSecuritiesSettlementTransactions3(SecuritiesSettlementTransactions3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}