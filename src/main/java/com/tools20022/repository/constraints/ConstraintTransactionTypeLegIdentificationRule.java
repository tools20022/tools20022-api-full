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
import com.tools20022.repository.msg.InvestmentFundTransaction2;
import com.tools20022.repository.msg.InvestmentFundTransaction3;
import com.tools20022.repository.msg.InvestmentFundTransaction4;
import java.util.Arrays;

/**
 * If TransactionType is SWII or SWIO, then LegIdentification is optional. If
 * TransactionType is neither SWII nor SWIO, then LegIdentification is not
 * allowed.
 */
public class ConstraintTransactionTypeLegIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTypeLegIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TransactionType is SWII or SWIO, then LegIdentification is optional. If TransactionType is neither SWII nor SWIO, then LegIdentification is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionTypeLegIdentificationRule#forInvestmentFundTransaction4
	 * ConstraintTransactionTypeLegIdentificationRule.
	 * forInvestmentFundTransaction4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentFundTransaction3> forInvestmentFundTransaction3 = new MMConstraint<InvestmentFundTransaction3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeLegIdentificationRule";
			definition = "If TransactionType is SWII or SWIO, then LegIdentification is optional. If TransactionType is neither SWII nor SWIO, then LegIdentification is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransactionTypeLegIdentificationRule.forInvestmentFundTransaction4);
			owner_lazy = () -> InvestmentFundTransaction3.mmObject();
		}

		@Override
		public void executeValidator(InvestmentFundTransaction3 obj) throws Exception {
			checkInvestmentFundTransaction3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTypeLegIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TransactionType is SWII or SWIO, then LegIdentification is optional. If TransactionType is neither SWII nor SWIO, then LegIdentification is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionTypeLegIdentificationRule#forInvestmentFundTransaction3
	 * ConstraintTransactionTypeLegIdentificationRule.
	 * forInvestmentFundTransaction3}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentFundTransaction4> forInvestmentFundTransaction4 = new MMConstraint<InvestmentFundTransaction4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeLegIdentificationRule";
			definition = "If TransactionType is SWII or SWIO, then LegIdentification is optional. If TransactionType is neither SWII nor SWIO, then LegIdentification is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTransactionTypeLegIdentificationRule.forInvestmentFundTransaction3;
			owner_lazy = () -> InvestmentFundTransaction4.mmObject();
		}

		@Override
		public void executeValidator(InvestmentFundTransaction4 obj) throws Exception {
			checkInvestmentFundTransaction4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2
	 * InvestmentFundTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTypeLegIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TransactionType is SWII or SWIO, then LegIdentification is mandatory. If TransactionType is not SWII and not SWIO, then LegIdentification is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentFundTransaction2> forInvestmentFundTransaction2 = new MMConstraint<InvestmentFundTransaction2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeLegIdentificationRule";
			definition = "If TransactionType is SWII or SWIO, then LegIdentification is mandatory. If TransactionType is not SWII and not SWIO, then LegIdentification is not allowed.";
			owner_lazy = () -> InvestmentFundTransaction2.mmObject();
		}

		@Override
		public void executeValidator(InvestmentFundTransaction2 obj) throws Exception {
			checkInvestmentFundTransaction2(obj);
		}
	};

	/**
	 * If TransactionType is SWII or SWIO, then LegIdentification is optional.
	 * If TransactionType is neither SWII nor SWIO, then LegIdentification is
	 * not allowed.
	 */
	public static void checkInvestmentFundTransaction3(InvestmentFundTransaction3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TransactionType is SWII or SWIO, then LegIdentification is optional.
	 * If TransactionType is neither SWII nor SWIO, then LegIdentification is
	 * not allowed.
	 */
	public static void checkInvestmentFundTransaction4(InvestmentFundTransaction4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TransactionType is SWII or SWIO, then LegIdentification is mandatory.
	 * If TransactionType is not SWII and not SWIO, then LegIdentification is
	 * not allowed.
	 */
	public static void checkInvestmentFundTransaction2(InvestmentFundTransaction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}