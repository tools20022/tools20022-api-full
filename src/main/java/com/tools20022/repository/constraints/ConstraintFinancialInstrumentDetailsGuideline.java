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
import com.tools20022.repository.msg.InvestmentAccount61;
import com.tools20022.repository.msg.InvestmentAccount62;
import com.tools20022.repository.msg.InvestmentAccount63;

/**
 * ModifiedFinancialInstrumentDetails/FinancialInstrumentDetails may be present
 * if a single investment fund is associated to the investment account. If
 * several investment funds are associated to the investment account, the
 * FundFamilyName only should be specified.
 */
public class ConstraintFinancialInstrumentDetailsGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ModifiedFinancialInstrumentDetails/FinancialInstrumentDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount51
	 * ConstraintFundDetailsGuideline.forInvestmentAccount51}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount63> forInvestmentAccount63 = new MMConstraint<InvestmentAccount63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetailsGuideline";
			definition = "ModifiedFinancialInstrumentDetails/FinancialInstrumentDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount51;
			owner_lazy = () -> InvestmentAccount63.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount63 obj) throws Exception {
			checkInvestmentAccount63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61
	 * InvestmentAccount61}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FinancialInstrumentDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount49
	 * ConstraintFundDetailsGuideline.forInvestmentAccount49}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount61> forInvestmentAccount61 = new MMConstraint<InvestmentAccount61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetailsGuideline";
			definition = "FinancialInstrumentDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount49;
			owner_lazy = () -> InvestmentAccount61.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount61 obj) throws Exception {
			checkInvestmentAccount61(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62
	 * InvestmentAccount62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FinancialInstrumentDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount50
	 * ConstraintFundDetailsGuideline.forInvestmentAccount50}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount62> forInvestmentAccount62 = new MMConstraint<InvestmentAccount62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetailsGuideline";
			definition = "FinancialInstrumentDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount50;
			owner_lazy = () -> InvestmentAccount62.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount62 obj) throws Exception {
			checkInvestmentAccount62(obj);
		}
	};

	/**
	 * ModifiedFinancialInstrumentDetails/FinancialInstrumentDetails may be
	 * present if a single investment fund is associated to the investment
	 * account. If several investment funds are associated to the investment
	 * account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount63(InvestmentAccount63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FinancialInstrumentDetails may be present if a single investment fund is
	 * associated to the investment account. If several investment funds are
	 * associated to the investment account, the FundFamilyName only should be
	 * specified.
	 */
	public static void checkInvestmentAccount61(InvestmentAccount61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FinancialInstrumentDetails may be present if a single investment fund is
	 * associated to the investment account. If several investment funds are
	 * associated to the investment account, the FundFamilyName only should be
	 * specified.
	 */
	public static void checkInvestmentAccount62(InvestmentAccount62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}