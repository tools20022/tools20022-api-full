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
 * Either InvestmentAccountDetails or (all occurrences of
 * SubscriptionLegDetails/InvestmentAccountDetails and of
 * RedemptionLegDetails/InvestmentAccountDetails) must be present, but not both.
 */
public class ConstraintInvestmentAccountDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3 SwitchOrder3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails or (all occurrences of SubscriptionLegDetails/InvestmentAccountDetails and of RedemptionLegDetails/InvestmentAccountDetails) must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder3> forSwitchOrder3 = new MMConstraint<SwitchOrder3>() {
		{
			validator = ConstraintInvestmentAccountDetailsRule::checkSwitchOrder3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetailsRule";
			definition = "Either InvestmentAccountDetails or (all occurrences of SubscriptionLegDetails/InvestmentAccountDetails and of RedemptionLegDetails/InvestmentAccountDetails) must be present, but not both.";
			owner_lazy = () -> SwitchOrder3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4
	 * SwitchExecution4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails or (all occurrences of SubscriptionLegDetails/InvestmentAccountDetails and of RedemptionLegDetails/InvestmentAccountDetails) must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountDetailsRule#forSwitchExecution7
	 * ConstraintInvestmentAccountDetailsRule.forSwitchExecution7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchExecution4> forSwitchExecution4 = new MMConstraint<SwitchExecution4>() {
		{
			validator = ConstraintInvestmentAccountDetailsRule::checkSwitchExecution4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetailsRule";
			definition = "Either InvestmentAccountDetails or (all occurrences of SubscriptionLegDetails/InvestmentAccountDetails and of RedemptionLegDetails/InvestmentAccountDetails) must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountDetailsRule.forSwitchExecution7);
			owner_lazy = () -> SwitchExecution4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4 SwitchOrder4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails or (all occurrences of SubscriptionLegDetails/InvestmentAccountDetails and of RedemptionLegDetails/InvestmentAccountDetails) must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountDetailsRule#forSwitchOrder7
	 * ConstraintInvestmentAccountDetailsRule.forSwitchOrder7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder4> forSwitchOrder4 = new MMConstraint<SwitchOrder4>() {
		{
			validator = ConstraintInvestmentAccountDetailsRule::checkSwitchOrder4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetailsRule";
			definition = "Either InvestmentAccountDetails or (all occurrences of SubscriptionLegDetails/InvestmentAccountDetails and of RedemptionLegDetails/InvestmentAccountDetails) must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountDetailsRule.forSwitchOrder7);
			owner_lazy = () -> SwitchOrder4.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails or all occurrences of SubscriptionLegDetails/InvestmentAccountDetails and RedemptionLegDetails/InvestmentAccountDetails must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountDetailsRule#forSwitchExecution4
	 * ConstraintInvestmentAccountDetailsRule.forSwitchExecution4}</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchExecution7> forSwitchExecution7 = new MMConstraint<SwitchExecution7>() {
		{
			validator = ConstraintInvestmentAccountDetailsRule::checkSwitchExecution7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetailsRule";
			definition = "Either InvestmentAccountDetails or all occurrences of SubscriptionLegDetails/InvestmentAccountDetails and RedemptionLegDetails/InvestmentAccountDetails must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestmentAccountDetailsRule.forSwitchExecution4;
			owner_lazy = () -> SwitchExecution7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7 SwitchOrder7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails or all occurrences of SubscriptionLegDetails/InvestmentAccountDetails and RedemptionLegDetails/InvestmentAccountDetails must be present, but not both.\r\nEither InvestmentAccountDetails or all occurrences of SubscriptionLegDetails/InvestmentAccountDetails and RedemptionLegDetails/InvestmentAccountDetails must be present, but not both.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountDetailsRule#forSwitchOrder4
	 * ConstraintInvestmentAccountDetailsRule.forSwitchOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder7> forSwitchOrder7 = new MMConstraint<SwitchOrder7>() {
		{
			validator = ConstraintInvestmentAccountDetailsRule::checkSwitchOrder7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetailsRule";
			definition = "Either InvestmentAccountDetails or all occurrences of SubscriptionLegDetails/InvestmentAccountDetails and RedemptionLegDetails/InvestmentAccountDetails must be present, but not both.\r\nEither InvestmentAccountDetails or all occurrences of SubscriptionLegDetails/InvestmentAccountDetails and RedemptionLegDetails/InvestmentAccountDetails must be present, but not both.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestmentAccountDetailsRule.forSwitchOrder4;
			owner_lazy = () -> SwitchOrder7.mmObject();
		}
	};

	/**
	 * Either InvestmentAccountDetails or (all occurrences of
	 * SubscriptionLegDetails/InvestmentAccountDetails and of
	 * RedemptionLegDetails/InvestmentAccountDetails) must be present, but not
	 * both.
	 */
	public static void checkSwitchOrder3(SwitchOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails or (all occurrences of
	 * SubscriptionLegDetails/InvestmentAccountDetails and of
	 * RedemptionLegDetails/InvestmentAccountDetails) must be present, but not
	 * both.
	 */
	public static void checkSwitchExecution4(SwitchExecution4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails or (all occurrences of
	 * SubscriptionLegDetails/InvestmentAccountDetails and of
	 * RedemptionLegDetails/InvestmentAccountDetails) must be present, but not
	 * both.
	 */
	public static void checkSwitchOrder4(SwitchOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails or all occurrences of
	 * SubscriptionLegDetails/InvestmentAccountDetails and
	 * RedemptionLegDetails/InvestmentAccountDetails must be present, but not
	 * both.
	 */
	public static void checkSwitchExecution7(SwitchExecution7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails or all occurrences of
	 * SubscriptionLegDetails/InvestmentAccountDetails and
	 * RedemptionLegDetails/InvestmentAccountDetails must be present, but not
	 * both.<br>
	 * Either InvestmentAccountDetails or all occurrences of
	 * SubscriptionLegDetails/InvestmentAccountDetails and
	 * RedemptionLegDetails/InvestmentAccountDetails must be present, but not
	 * both.<br>
	 */
	public static void checkSwitchOrder7(SwitchOrder7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}