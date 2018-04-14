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
 * Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must not
 * be greater than 100.
 */
public class ConstraintReinvestmentPercentage1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49
	 * InvestmentAccount49}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPercentage1Rule"</li>
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule#forInvestmentAccount61
	 * ConstraintReinvestmentPercentage1Rule.forInvestmentAccount61}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule#forInvestmentAccount37
	 * ConstraintReinvestmentPercentage1Rule.forInvestmentAccount37}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount49> forInvestmentAccount49 = new MMConstraint<InvestmentAccount49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentPercentage1Rule";
			definition = "Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must not be greater than 100.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule.forInvestmentAccount61);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule.forInvestmentAccount37;
			owner_lazy = () -> InvestmentAccount49.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount49 obj) throws Exception {
			checkInvestmentAccount49(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38
	 * InvestmentAccount38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPercentage1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of all occurrences of Reinvestment Details/Reinvestment Percentage must not be greater than 100."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule#forInvestmentAccount46
	 * ConstraintReinvestmentPercentage1Rule.forInvestmentAccount46}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount38> forInvestmentAccount38 = new MMConstraint<InvestmentAccount38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentPercentage1Rule";
			definition = "Sum of all occurrences of Reinvestment Details/Reinvestment Percentage must not be greater than 100.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule.forInvestmentAccount46);
			owner_lazy = () -> InvestmentAccount38.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount38 obj) throws Exception {
			checkInvestmentAccount38(obj);
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
	 * name} = "ReinvestmentPercentage1Rule"</li>
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule#forInvestmentAccount49
	 * ConstraintReinvestmentPercentage1Rule.forInvestmentAccount49}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount61> forInvestmentAccount61 = new MMConstraint<InvestmentAccount61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentPercentage1Rule";
			definition = "Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must not be greater than 100.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule.forInvestmentAccount49;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46
	 * InvestmentAccount46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPercentage1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of all occurrences of Reinvestment Details/Reinvestment Percentage must not be greater than 100."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule#forInvestmentAccount50
	 * ConstraintReinvestmentPercentage1Rule.forInvestmentAccount50}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule#forInvestmentAccount38
	 * ConstraintReinvestmentPercentage1Rule.forInvestmentAccount38}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount46> forInvestmentAccount46 = new MMConstraint<InvestmentAccount46>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentPercentage1Rule";
			definition = "Sum of all occurrences of Reinvestment Details/Reinvestment Percentage must not be greater than 100.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule.forInvestmentAccount50);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule.forInvestmentAccount38;
			owner_lazy = () -> InvestmentAccount46.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount46 obj) throws Exception {
			checkInvestmentAccount46(obj);
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
	 * name} = "ReinvestmentPercentage1Rule"</li>
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule#forInvestmentAccount50
	 * ConstraintReinvestmentPercentage1Rule.forInvestmentAccount50}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount62> forInvestmentAccount62 = new MMConstraint<InvestmentAccount62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentPercentage1Rule";
			definition = "Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must not be greater than 100.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule.forInvestmentAccount50;
			owner_lazy = () -> InvestmentAccount62.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount62 obj) throws Exception {
			checkInvestmentAccount62(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37
	 * InvestmentAccount37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPercentage1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of all occurrences of Reinvestment Details/ReinvestmentPercentage must not be greater than 100."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule#forInvestmentAccount49
	 * ConstraintReinvestmentPercentage1Rule.forInvestmentAccount49}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount37> forInvestmentAccount37 = new MMConstraint<InvestmentAccount37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentPercentage1Rule";
			definition = "Sum of all occurrences of Reinvestment Details/ReinvestmentPercentage must not be greater than 100.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule.forInvestmentAccount49);
			owner_lazy = () -> InvestmentAccount37.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount37 obj) throws Exception {
			checkInvestmentAccount37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39
	 * InvestmentAccount39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPercentage1Rule"</li>
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentageRule#forInvestmentAccount47
	 * ConstraintReinvestmentPercentageRule.forInvestmentAccount47}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount39> forInvestmentAccount39 = new MMConstraint<InvestmentAccount39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentPercentage1Rule";
			definition = "Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must not be greater than 100.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReinvestmentPercentageRule.forInvestmentAccount47);
			owner_lazy = () -> InvestmentAccount39.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount39 obj) throws Exception {
			checkInvestmentAccount39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPercentage1Rule"</li>
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule#forInvestmentAccount62
	 * ConstraintReinvestmentPercentage1Rule.forInvestmentAccount62}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule#forInvestmentAccount46
	 * ConstraintReinvestmentPercentage1Rule.forInvestmentAccount46}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount50> forInvestmentAccount50 = new MMConstraint<InvestmentAccount50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentPercentage1Rule";
			definition = "Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must not be greater than 100.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule.forInvestmentAccount62);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule.forInvestmentAccount46;
			owner_lazy = () -> InvestmentAccount50.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount50 obj) throws Exception {
			checkInvestmentAccount50(obj);
		}
	};

	/**
	 * Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must
	 * not be greater than 100.
	 */
	public static void checkInvestmentAccount49(InvestmentAccount49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Sum of all occurrences of Reinvestment Details/Reinvestment Percentage
	 * must not be greater than 100.
	 */
	public static void checkInvestmentAccount38(InvestmentAccount38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must
	 * not be greater than 100.
	 */
	public static void checkInvestmentAccount61(InvestmentAccount61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Sum of all occurrences of Reinvestment Details/Reinvestment Percentage
	 * must not be greater than 100.
	 */
	public static void checkInvestmentAccount46(InvestmentAccount46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must
	 * not be greater than 100.
	 */
	public static void checkInvestmentAccount62(InvestmentAccount62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Sum of all occurrences of Reinvestment Details/ReinvestmentPercentage
	 * must not be greater than 100.
	 */
	public static void checkInvestmentAccount37(InvestmentAccount37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must
	 * not be greater than 100.
	 */
	public static void checkInvestmentAccount39(InvestmentAccount39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Sum of all occurrences of ReinvestmentDetails/ReinvestmentPercentage must
	 * not be greater than 100.
	 */
	public static void checkInvestmentAccount50(InvestmentAccount50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}