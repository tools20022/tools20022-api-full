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
import com.tools20022.repository.msg.Debt1;
import com.tools20022.repository.msg.Debt2;
import com.tools20022.repository.msg.Debt3;
import java.util.Arrays;

/**
 * If PutableIndicator is present, then PutDate must be present.
 */
public class ConstraintPutableDateAndPutableIndicatorRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Debt1 Debt1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableDateAndPutableIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PutableIndicator is present, then PutDate must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<Debt1> forDebt1 = new MMConstraint<Debt1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableDateAndPutableIndicatorRule";
			definition = "If PutableIndicator is present, then PutDate must be present.";
			owner_lazy = () -> Debt1.mmObject();
		}

		@Override
		public void executeValidator(Debt1 obj) throws Exception {
			checkDebt1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Debt2 Debt2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableDateAndPutableIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PutableIndicator is present, then PutableDate must be present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPutableDateAndPutableIndicatorRule#forDebt3
	 * ConstraintPutableDateAndPutableIndicatorRule.forDebt3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Debt2> forDebt2 = new MMConstraint<Debt2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableDateAndPutableIndicatorRule";
			definition = "If PutableIndicator is present, then PutableDate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPutableDateAndPutableIndicatorRule.forDebt3);
			owner_lazy = () -> Debt2.mmObject();
		}

		@Override
		public void executeValidator(Debt2 obj) throws Exception {
			checkDebt2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Debt3 Debt3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableDateAndPutableIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PutableIndicator is present, then PutableDate must be present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPutableDateAndPutableIndicatorRule#forDebt2
	 * ConstraintPutableDateAndPutableIndicatorRule.forDebt2}</li>
	 * </ul>
	 */
	public static final MMConstraint<Debt3> forDebt3 = new MMConstraint<Debt3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableDateAndPutableIndicatorRule";
			definition = "If PutableIndicator is present, then PutableDate must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPutableDateAndPutableIndicatorRule.forDebt2;
			owner_lazy = () -> Debt3.mmObject();
		}

		@Override
		public void executeValidator(Debt3 obj) throws Exception {
			checkDebt3(obj);
		}
	};

	/**
	 * If PutableIndicator is present, then PutDate must be present.
	 */
	public static void checkDebt1(Debt1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PutableIndicator is present, then PutableDate must be present.
	 */
	public static void checkDebt2(Debt2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PutableIndicator is present, then PutableDate must be present.
	 */
	public static void checkDebt3(Debt3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}