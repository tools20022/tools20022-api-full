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
import com.tools20022.repository.msg.InvestmentAccount47;
import com.tools20022.repository.msg.InvestmentAccount51;
import com.tools20022.repository.msg.InvestmentAccount63;
import java.util.Arrays;

/**
 * Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must not
 * be greater than 100.
 */
public class ConstraintReinvestmentPercentageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPercentageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must not be greater than 100."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentageRule#forInvestmentAccount51
	 * ConstraintReinvestmentPercentageRule.forInvestmentAccount51}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount63> forInvestmentAccount63 = new MMConstraint<InvestmentAccount63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentPercentageRule";
			definition = "Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must not be greater than 100.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReinvestmentPercentageRule.forInvestmentAccount51;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51
	 * InvestmentAccount51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPercentageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must not be greater than 100."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentageRule#forInvestmentAccount63
	 * ConstraintReinvestmentPercentageRule.forInvestmentAccount63}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentageRule#forInvestmentAccount47
	 * ConstraintReinvestmentPercentageRule.forInvestmentAccount47}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount51> forInvestmentAccount51 = new MMConstraint<InvestmentAccount51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentPercentageRule";
			definition = "Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must not be greater than 100.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReinvestmentPercentageRule.forInvestmentAccount63);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReinvestmentPercentageRule.forInvestmentAccount47;
			owner_lazy = () -> InvestmentAccount51.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount51 obj) throws Exception {
			checkInvestmentAccount51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47
	 * InvestmentAccount47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPercentageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must not be greater than 100."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentageRule#forInvestmentAccount51
	 * ConstraintReinvestmentPercentageRule.forInvestmentAccount51}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule#forInvestmentAccount39
	 * ConstraintReinvestmentPercentage1Rule.forInvestmentAccount39}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount47> forInvestmentAccount47 = new MMConstraint<InvestmentAccount47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentPercentageRule";
			definition = "Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must not be greater than 100.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReinvestmentPercentageRule.forInvestmentAccount51);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule.forInvestmentAccount39;
			owner_lazy = () -> InvestmentAccount47.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount47 obj) throws Exception {
			checkInvestmentAccount47(obj);
		}
	};

	/**
	 * Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must
	 * not be greater than 100.
	 */
	public static void checkInvestmentAccount63(InvestmentAccount63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must
	 * not be greater than 100.
	 */
	public static void checkInvestmentAccount51(InvestmentAccount51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must
	 * not be greater than 100.
	 */
	public static void checkInvestmentAccount47(InvestmentAccount47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}