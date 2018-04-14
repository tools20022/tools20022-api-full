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
 * When absent, the defaut is long, that is, balance is positive.
 */
public class ConstraintShortLongDefaultRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7
	 * AggregateBalanceInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongDefaultRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When absent, the defaut is long, that is, balance is positive."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation7> forAggregateBalanceInformation7 = new MMConstraint<AggregateBalanceInformation7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongDefaultRule";
			definition = "When absent, the defaut is long, that is, balance is positive.";
			owner_lazy = () -> AggregateBalanceInformation7.mmObject();
		}

		@Override
		public void executeValidator(AggregateBalanceInformation7 obj) throws Exception {
			checkAggregateBalanceInformation7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance1
	 * OpeningBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongDefaultRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Shortlong is absent, then the default is long, that is, balance is positive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintShortLongDefaultRule#forOpeningBalance3
	 * ConstraintShortLongDefaultRule.forOpeningBalance3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OpeningBalance1> forOpeningBalance1 = new MMConstraint<OpeningBalance1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongDefaultRule";
			definition = "If Shortlong is absent, then the default is long, that is, balance is positive.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintShortLongDefaultRule.forOpeningBalance3);
			owner_lazy = () -> OpeningBalance1.mmObject();
		}

		@Override
		public void executeValidator(OpeningBalance1 obj) throws Exception {
			checkOpeningBalance1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance4
	 * OpeningBalance4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongDefaultRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Shortlong is absent, then the default is long, that is, balance is positive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OpeningBalance4> forOpeningBalance4 = new MMConstraint<OpeningBalance4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongDefaultRule";
			definition = "If Shortlong is absent, then the default is long, that is, balance is positive.";
			owner_lazy = () -> OpeningBalance4.mmObject();
		}

		@Override
		public void executeValidator(OpeningBalance4 obj) throws Exception {
			checkOpeningBalance4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6
	 * AggregateBalanceInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongDefaultRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When absent, the defaut is long, that is, balance is positive."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation6> forAggregateBalanceInformation6 = new MMConstraint<AggregateBalanceInformation6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongDefaultRule";
			definition = "When absent, the defaut is long, that is, balance is positive.";
			owner_lazy = () -> AggregateBalanceInformation6.mmObject();
		}

		@Override
		public void executeValidator(AggregateBalanceInformation6 obj) throws Exception {
			checkAggregateBalanceInformation6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance2
	 * OpeningBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongDefaultRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Shortlong is absent, then the default is long, that is, balance is positive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OpeningBalance2> forOpeningBalance2 = new MMConstraint<OpeningBalance2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongDefaultRule";
			definition = "If Shortlong is absent, then the default is long, that is, balance is positive.";
			owner_lazy = () -> OpeningBalance2.mmObject();
		}

		@Override
		public void executeValidator(OpeningBalance2 obj) throws Exception {
			checkOpeningBalance2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ClosingBalance2
	 * ClosingBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongDefaultRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Shortlong is absent, then the default is long, that is, balance is positive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ClosingBalance2> forClosingBalance2 = new MMConstraint<ClosingBalance2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongDefaultRule";
			definition = "If Shortlong is absent, then the default is long, that is, balance is positive.";
			owner_lazy = () -> ClosingBalance2.mmObject();
		}

		@Override
		public void executeValidator(ClosingBalance2 obj) throws Exception {
			checkClosingBalance2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ClosingBalance4
	 * ClosingBalance4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongDefaultRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Shortlong is absent, then the default is long, that is, balance is positive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ClosingBalance4> forClosingBalance4 = new MMConstraint<ClosingBalance4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongDefaultRule";
			definition = "If Shortlong is absent, then the default is long, that is, balance is positive.";
			owner_lazy = () -> ClosingBalance4.mmObject();
		}

		@Override
		public void executeValidator(ClosingBalance4 obj) throws Exception {
			checkClosingBalance4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ClosingBalance3
	 * ClosingBalance3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongDefaultRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Shortlong is absent, then the default is long, that is, balance is positive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintShortLongDefaultRule#forClosingBalance1
	 * ConstraintShortLongDefaultRule.forClosingBalance1}</li>
	 * </ul>
	 */
	public static final MMConstraint<ClosingBalance3> forClosingBalance3 = new MMConstraint<ClosingBalance3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongDefaultRule";
			definition = "If Shortlong is absent, then the default is long, that is, balance is positive.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintShortLongDefaultRule.forClosingBalance1;
			owner_lazy = () -> ClosingBalance3.mmObject();
		}

		@Override
		public void executeValidator(ClosingBalance3 obj) throws Exception {
			checkClosingBalance3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance3
	 * OpeningBalance3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongDefaultRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Shortlong is absent, then the default is long, that is, balance is positive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintShortLongDefaultRule#forOpeningBalance1
	 * ConstraintShortLongDefaultRule.forOpeningBalance1}</li>
	 * </ul>
	 */
	public static final MMConstraint<OpeningBalance3> forOpeningBalance3 = new MMConstraint<OpeningBalance3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongDefaultRule";
			definition = "If Shortlong is absent, then the default is long, that is, balance is positive.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintShortLongDefaultRule.forOpeningBalance1;
			owner_lazy = () -> OpeningBalance3.mmObject();
		}

		@Override
		public void executeValidator(OpeningBalance3 obj) throws Exception {
			checkOpeningBalance3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ClosingBalance1
	 * ClosingBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongDefaultRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Shortlong is absent, then the default is long, that is, balance is positive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintShortLongDefaultRule#forClosingBalance3
	 * ConstraintShortLongDefaultRule.forClosingBalance3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ClosingBalance1> forClosingBalance1 = new MMConstraint<ClosingBalance1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongDefaultRule";
			definition = "If Shortlong is absent, then the default is long, that is, balance is positive.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintShortLongDefaultRule.forClosingBalance3);
			owner_lazy = () -> ClosingBalance1.mmObject();
		}

		@Override
		public void executeValidator(ClosingBalance1 obj) throws Exception {
			checkClosingBalance1(obj);
		}
	};

	/**
	 * When absent, the defaut is long, that is, balance is positive.
	 */
	public static void checkAggregateBalanceInformation7(AggregateBalanceInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Shortlong is absent, then the default is long, that is, balance is
	 * positive.
	 */
	public static void checkOpeningBalance1(OpeningBalance1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Shortlong is absent, then the default is long, that is, balance is
	 * positive.
	 */
	public static void checkOpeningBalance4(OpeningBalance4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When absent, the defaut is long, that is, balance is positive.
	 */
	public static void checkAggregateBalanceInformation6(AggregateBalanceInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Shortlong is absent, then the default is long, that is, balance is
	 * positive.
	 */
	public static void checkOpeningBalance2(OpeningBalance2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Shortlong is absent, then the default is long, that is, balance is
	 * positive.
	 */
	public static void checkClosingBalance2(ClosingBalance2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Shortlong is absent, then the default is long, that is, balance is
	 * positive.
	 */
	public static void checkClosingBalance4(ClosingBalance4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Shortlong is absent, then the default is long, that is, balance is
	 * positive.
	 */
	public static void checkClosingBalance3(ClosingBalance3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Shortlong is absent, then the default is long, that is, balance is
	 * positive.
	 */
	public static void checkOpeningBalance3(OpeningBalance3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Shortlong is absent, then the default is long, that is, balance is
	 * positive.
	 */
	public static void checkClosingBalance1(ClosingBalance1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}