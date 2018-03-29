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
import com.tools20022.repository.msg.FundOrderData5;

/**
 * One of the elements (InvestmentAccountDetails, FinancialInstrumentDetails,
 * UnitsNumber, NetAmount, GrossAmount, HoldingsRedemptionRate,
 * SettlementAmount, UnitCurrency, QuotedCurrency) must be present.
 */
public class ConstraintOrderDataElementRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5 FundOrderData5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDataElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of the elements (InvestmentAccountDetails, FinancialInstrumentDetails, UnitsNumber, NetAmount, GrossAmount, HoldingsRedemptionRate, SettlementAmount, UnitCurrency, QuotedCurrency) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundOrderData5> forFundOrderData5 = new MMConstraint<FundOrderData5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDataElementRule";
			definition = "One of the elements (InvestmentAccountDetails, FinancialInstrumentDetails, UnitsNumber, NetAmount, GrossAmount, HoldingsRedemptionRate, SettlementAmount, UnitCurrency, QuotedCurrency) must be present.";
			owner_lazy = () -> FundOrderData5.mmObject();
		}

		@Override
		public void executeValidator(FundOrderData5 obj) throws Exception {
			checkFundOrderData5(obj);
		}
	};

	/**
	 * One of the elements (InvestmentAccountDetails,
	 * FinancialInstrumentDetails, UnitsNumber, NetAmount, GrossAmount,
	 * HoldingsRedemptionRate, SettlementAmount, UnitCurrency, QuotedCurrency)
	 * must be present.
	 */
	public static void checkFundOrderData5(FundOrderData5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}