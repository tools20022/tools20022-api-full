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
import com.tools20022.repository.msg.TradeData11;
import com.tools20022.repository.msg.TradeData8;
import java.util.Arrays;

/**
 * The New Settlement Date element is only to be used when there has been an
 * amendment to the Settlement Date. For example, when there has been a currency
 * calendar amendment or a settlement deferral event.
 */
public class ConstraintNewSettlementDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TradeData8 TradeData8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The New Settlement Date element is only to be used when there has been an amendment to the Settlement Date. For example, when there has been a currency calendar amendment or a settlement deferral event. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNewSettlementDateRule#forTradeData11
	 * ConstraintNewSettlementDateRule.forTradeData11}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TradeData8> forTradeData8 = new MMConstraint<TradeData8>() {
		{
			validator = ConstraintNewSettlementDateRule::checkTradeData8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewSettlementDateRule";
			definition = "The New Settlement Date element is only to be used when there has been an amendment to the Settlement Date. For example, when there has been a currency calendar amendment or a settlement deferral event. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNewSettlementDateRule.forTradeData11);
			owner_lazy = () -> TradeData8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TradeData11 TradeData11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New Settlement Date is only to be used when there has been an amendment to the settlement date. For example, when there has been a currency calendar amendment or a settlement deferral event. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNewSettlementDateRule#forTradeData8
	 * ConstraintNewSettlementDateRule.forTradeData8}</li>
	 * </ul>
	 */
	public static final MMConstraint<TradeData11> forTradeData11 = new MMConstraint<TradeData11>() {
		{
			validator = ConstraintNewSettlementDateRule::checkTradeData11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewSettlementDateRule";
			definition = "New Settlement Date is only to be used when there has been an amendment to the settlement date. For example, when there has been a currency calendar amendment or a settlement deferral event. ";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNewSettlementDateRule.forTradeData8;
			owner_lazy = () -> TradeData11.mmObject();
		}
	};

	/**
	 * The New Settlement Date element is only to be used when there has been an
	 * amendment to the Settlement Date. For example, when there has been a
	 * currency calendar amendment or a settlement deferral event.
	 */
	public static void checkTradeData8(TradeData8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * New Settlement Date is only to be used when there has been an amendment
	 * to the settlement date. For example, when there has been a currency
	 * calendar amendment or a settlement deferral event.
	 */
	public static void checkTradeData11(TradeData11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}