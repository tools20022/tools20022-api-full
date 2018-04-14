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
import com.tools20022.repository.msg.AggregateBalanceInformation3;
import com.tools20022.repository.msg.AggregateBalanceInformation4;
import com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3;
import com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4;

/**
 * If AccruedInterestAmount is present, then AccruedInterestAmountSign must be
 * present. If AccruedInterestAmount is not present, then
 * AccruedInterestAmountSign may not be present.
 */
public class ConstraintAccruedInterestAmountSignRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3
	 * AggregateBalanceInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmountSignRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccruedInterestAmount is present, then AccruedInterestAmountSign must be present. If AccruedInterestAmount is not present, then AccruedInterestAmountSign may not be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation3> forAggregateBalanceInformation3 = new MMConstraint<AggregateBalanceInformation3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmountSignRule";
			definition = "If AccruedInterestAmount is present, then AccruedInterestAmountSign must be present. If AccruedInterestAmount is not present, then AccruedInterestAmountSign may not be present.";
			owner_lazy = () -> AggregateBalanceInformation3.mmObject();
		}

		@Override
		public void executeValidator(AggregateBalanceInformation3 obj) throws Exception {
			checkAggregateBalanceInformation3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4
	 * AggregateBalanceInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmountSignRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "if AccruedInterestAmount is present, then AccruedInterestAmountSign must be present. If AccruedInterestAmount is not present, then AccruedInterestAmountSign may not be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation4> forAggregateBalanceInformation4 = new MMConstraint<AggregateBalanceInformation4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmountSignRule";
			definition = "if AccruedInterestAmount is present, then AccruedInterestAmountSign must be present. If AccruedInterestAmount is not present, then AccruedInterestAmountSign may not be present.";
			owner_lazy = () -> AggregateBalanceInformation4.mmObject();
		}

		@Override
		public void executeValidator(AggregateBalanceInformation4 obj) throws Exception {
			checkAggregateBalanceInformation4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3
	 * AggregateBalancePerSafekeepingPlace3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmountSignRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccruedInterestAmount is present, then AccruedInterestAmountSign must be present. If AccruedInterestAmount is not present, then AccruedInterestAmountSign may not be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace3> forAggregateBalancePerSafekeepingPlace3 = new MMConstraint<AggregateBalancePerSafekeepingPlace3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmountSignRule";
			definition = "If AccruedInterestAmount is present, then AccruedInterestAmountSign must be present. If AccruedInterestAmount is not present, then AccruedInterestAmountSign may not be present.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace3.mmObject();
		}

		@Override
		public void executeValidator(AggregateBalancePerSafekeepingPlace3 obj) throws Exception {
			checkAggregateBalancePerSafekeepingPlace3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4
	 * AggregateBalancePerSafekeepingPlace4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmountSignRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccruedInterestAmount is present, then AccruedInterestAmountSign must be present. If AccruedInterestAmount is not present, then AccruedInterestAmountSign may not be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalancePerSafekeepingPlace4> forAggregateBalancePerSafekeepingPlace4 = new MMConstraint<AggregateBalancePerSafekeepingPlace4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmountSignRule";
			definition = "If AccruedInterestAmount is present, then AccruedInterestAmountSign must be present. If AccruedInterestAmount is not present, then AccruedInterestAmountSign may not be present.";
			owner_lazy = () -> AggregateBalancePerSafekeepingPlace4.mmObject();
		}

		@Override
		public void executeValidator(AggregateBalancePerSafekeepingPlace4 obj) throws Exception {
			checkAggregateBalancePerSafekeepingPlace4(obj);
		}
	};

	/**
	 * If AccruedInterestAmount is present, then AccruedInterestAmountSign must
	 * be present. If AccruedInterestAmount is not present, then
	 * AccruedInterestAmountSign may not be present.
	 */
	public static void checkAggregateBalanceInformation3(AggregateBalanceInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * if AccruedInterestAmount is present, then AccruedInterestAmountSign must
	 * be present. If AccruedInterestAmount is not present, then
	 * AccruedInterestAmountSign may not be present.
	 */
	public static void checkAggregateBalanceInformation4(AggregateBalanceInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccruedInterestAmount is present, then AccruedInterestAmountSign must
	 * be present. If AccruedInterestAmount is not present, then
	 * AccruedInterestAmountSign may not be present.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace3(AggregateBalancePerSafekeepingPlace3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccruedInterestAmount is present, then AccruedInterestAmountSign must
	 * be present. If AccruedInterestAmount is not present, then
	 * AccruedInterestAmountSign may not be present.
	 */
	public static void checkAggregateBalancePerSafekeepingPlace4(AggregateBalancePerSafekeepingPlace4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}