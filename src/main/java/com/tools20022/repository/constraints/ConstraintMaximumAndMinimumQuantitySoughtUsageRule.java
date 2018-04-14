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
import com.tools20022.repository.msg.CorporateActionQuantity5;
import com.tools20022.repository.msg.CorporateActionQuantity6;
import com.tools20022.repository.msg.CorporateActionQuantity7;
import com.tools20022.repository.msg.CorporateActionQuantity8;
import java.util.Arrays;

/**
 * When MaximumQuantity is present, MinimumQuantitySought must be present too.
 * When MinimumQuantitySought is present, MaximumQuantity must be present too.<br>
 * When MinimumQuantitySought/Code is AnyAndAll, then MaximumQuantity/Code must
 * not be AnyAndAll.<br>
 * When MaximumQuantity/Code is AnyAndAll, MinimumQuantitySought/code must not
 * be used with the value AnyAndAll.
 */
public class ConstraintMaximumAndMinimumQuantitySoughtUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5
	 * CorporateActionQuantity5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAndMinimumQuantitySoughtUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When MaximumQuantity is present, MinimumQuantitySought must be present too. When MinimumQuantitySought is present, MaximumQuantity must be present too.\r\nWhen MinimumQuantitySought/Code is AnyAndAll, then MaximumQuantity/Code must not be AnyAndAll.\r\nWhen MaximumQuantity/Code is AnyAndAll, MinimumQuantitySought/code must not be used with the value AnyAndAll."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMaximumAndMinimumQuantitySoughtUsageRule#forCorporateActionQuantity7
	 * ConstraintMaximumAndMinimumQuantitySoughtUsageRule.
	 * forCorporateActionQuantity7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity5> forCorporateActionQuantity5 = new MMConstraint<CorporateActionQuantity5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAndMinimumQuantitySoughtUsageRule";
			definition = "When MaximumQuantity is present, MinimumQuantitySought must be present too. When MinimumQuantitySought is present, MaximumQuantity must be present too.\r\nWhen MinimumQuantitySought/Code is AnyAndAll, then MaximumQuantity/Code must not be AnyAndAll.\r\nWhen MaximumQuantity/Code is AnyAndAll, MinimumQuantitySought/code must not be used with the value AnyAndAll.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMaximumAndMinimumQuantitySoughtUsageRule.forCorporateActionQuantity7);
			owner_lazy = () -> CorporateActionQuantity5.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity5 obj) throws Exception {
			checkCorporateActionQuantity5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8
	 * CorporateActionQuantity8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAndMinimumQuantitySoughtUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When MaximumQuantity is present, MinimumQuantitySought must be present too. When MinimumQuantitySought is present, MaximumQuantity must be present too.\r\nWhen MinimumQuantitySought/Code is AnyAndAll, then MaximumQuantity/Code must not be AnyAndAll.\r\nWhen MaximumQuantity/Code is AnyAndAll, MinimumQuantitySought/code must not be used with the value AnyAndAll."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity8> forCorporateActionQuantity8 = new MMConstraint<CorporateActionQuantity8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAndMinimumQuantitySoughtUsageRule";
			definition = "When MaximumQuantity is present, MinimumQuantitySought must be present too. When MinimumQuantitySought is present, MaximumQuantity must be present too.\r\nWhen MinimumQuantitySought/Code is AnyAndAll, then MaximumQuantity/Code must not be AnyAndAll.\r\nWhen MaximumQuantity/Code is AnyAndAll, MinimumQuantitySought/code must not be used with the value AnyAndAll.";
			owner_lazy = () -> CorporateActionQuantity8.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity8 obj) throws Exception {
			checkCorporateActionQuantity8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAndMinimumQuantitySoughtUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When MaximumQuantity is present, MinimumQuantitySought must be present too. When MinimumQuantitySought is present, MaximumQuantity must be present too.\r\nWhen MinimumQuantitySought/Code is AnyAndAll, then MaximumQuantity/Code must not be AnyAndAll.\r\nWhen MaximumQuantity/Code is AnyAndAll, MinimumQuantitySought/code must not be used with the value AnyAndAll."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity6> forCorporateActionQuantity6 = new MMConstraint<CorporateActionQuantity6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAndMinimumQuantitySoughtUsageRule";
			definition = "When MaximumQuantity is present, MinimumQuantitySought must be present too. When MinimumQuantitySought is present, MaximumQuantity must be present too.\r\nWhen MinimumQuantitySought/Code is AnyAndAll, then MaximumQuantity/Code must not be AnyAndAll.\r\nWhen MaximumQuantity/Code is AnyAndAll, MinimumQuantitySought/code must not be used with the value AnyAndAll.";
			owner_lazy = () -> CorporateActionQuantity6.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity6 obj) throws Exception {
			checkCorporateActionQuantity6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7
	 * CorporateActionQuantity7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAndMinimumQuantitySoughtUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When MaximumQuantity is present, MinimumQuantitySought must be present too. When MinimumQuantitySought is present, MaximumQuantity must be present too.\r\nWhen MinimumQuantitySought/Code is AnyAndAll, then MaximumQuantity/Code must not be AnyAndAll.\r\nWhen MaximumQuantity/Code is AnyAndAll, MinimumQuantitySought/code must not be used with the value AnyAndAll."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMaximumAndMinimumQuantitySoughtUsageRule#forCorporateActionQuantity5
	 * ConstraintMaximumAndMinimumQuantitySoughtUsageRule.
	 * forCorporateActionQuantity5}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity7> forCorporateActionQuantity7 = new MMConstraint<CorporateActionQuantity7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAndMinimumQuantitySoughtUsageRule";
			definition = "When MaximumQuantity is present, MinimumQuantitySought must be present too. When MinimumQuantitySought is present, MaximumQuantity must be present too.\r\nWhen MinimumQuantitySought/Code is AnyAndAll, then MaximumQuantity/Code must not be AnyAndAll.\r\nWhen MaximumQuantity/Code is AnyAndAll, MinimumQuantitySought/code must not be used with the value AnyAndAll.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMaximumAndMinimumQuantitySoughtUsageRule.forCorporateActionQuantity5;
			owner_lazy = () -> CorporateActionQuantity7.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity7 obj) throws Exception {
			checkCorporateActionQuantity7(obj);
		}
	};

	/**
	 * When MaximumQuantity is present, MinimumQuantitySought must be present
	 * too. When MinimumQuantitySought is present, MaximumQuantity must be
	 * present too.<br>
	 * When MinimumQuantitySought/Code is AnyAndAll, then MaximumQuantity/Code
	 * must not be AnyAndAll.<br>
	 * When MaximumQuantity/Code is AnyAndAll, MinimumQuantitySought/code must
	 * not be used with the value AnyAndAll.
	 */
	public static void checkCorporateActionQuantity5(CorporateActionQuantity5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When MaximumQuantity is present, MinimumQuantitySought must be present
	 * too. When MinimumQuantitySought is present, MaximumQuantity must be
	 * present too.<br>
	 * When MinimumQuantitySought/Code is AnyAndAll, then MaximumQuantity/Code
	 * must not be AnyAndAll.<br>
	 * When MaximumQuantity/Code is AnyAndAll, MinimumQuantitySought/code must
	 * not be used with the value AnyAndAll.
	 */
	public static void checkCorporateActionQuantity8(CorporateActionQuantity8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When MaximumQuantity is present, MinimumQuantitySought must be present
	 * too. When MinimumQuantitySought is present, MaximumQuantity must be
	 * present too.<br>
	 * When MinimumQuantitySought/Code is AnyAndAll, then MaximumQuantity/Code
	 * must not be AnyAndAll.<br>
	 * When MaximumQuantity/Code is AnyAndAll, MinimumQuantitySought/code must
	 * not be used with the value AnyAndAll.
	 */
	public static void checkCorporateActionQuantity6(CorporateActionQuantity6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When MaximumQuantity is present, MinimumQuantitySought must be present
	 * too. When MinimumQuantitySought is present, MaximumQuantity must be
	 * present too.<br>
	 * When MinimumQuantitySought/Code is AnyAndAll, then MaximumQuantity/Code
	 * must not be AnyAndAll.<br>
	 * When MaximumQuantity/Code is AnyAndAll, MinimumQuantitySought/code must
	 * not be used with the value AnyAndAll.
	 */
	public static void checkCorporateActionQuantity7(CorporateActionQuantity7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}