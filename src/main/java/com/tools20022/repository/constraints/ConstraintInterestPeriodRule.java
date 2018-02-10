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
 * InterestPeriod must be used only if it is different from a normal accrued
 * interest period.
 */
public class ConstraintInterestPeriodRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3
	 * CorporateActionPeriod3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InterestPeriod must be used only if it is different from a normal accrued interest period."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPeriod3> forCorporateActionPeriod3 = new MMConstraint<CorporateActionPeriod3>() {
		{
			validator = ConstraintInterestPeriodRule::checkCorporateActionPeriod3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPeriodRule";
			definition = "InterestPeriod must be used only if it is different from a normal accrued interest period.";
			owner_lazy = () -> CorporateActionPeriod3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InterestPeriod must be used only if it is different from a normal accrued interest period."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPeriod6> forCorporateActionPeriod6 = new MMConstraint<CorporateActionPeriod6>() {
		{
			validator = ConstraintInterestPeriodRule::checkCorporateActionPeriod6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPeriodRule";
			definition = "InterestPeriod must be used only if it is different from a normal accrued interest period.";
			owner_lazy = () -> CorporateActionPeriod6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InterestPeriod must be used only if it is different from a normal accrued interest period."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPeriodRule#forCorporateActionPeriod10
	 * ConstraintInterestPeriodRule.forCorporateActionPeriod10}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPeriod8> forCorporateActionPeriod8 = new MMConstraint<CorporateActionPeriod8>() {
		{
			validator = ConstraintInterestPeriodRule::checkCorporateActionPeriod8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPeriodRule";
			definition = "InterestPeriod must be used only if it is different from a normal accrued interest period.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterestPeriodRule.forCorporateActionPeriod10);
			owner_lazy = () -> CorporateActionPeriod8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InterestPeriod must be used only if it is different from a normal accrued interest period."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPeriodRule#forCorporateActionPeriod14
	 * ConstraintInterestPeriodRule.forCorporateActionPeriod14}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPeriodRule#forCorporateActionPeriod8
	 * ConstraintInterestPeriodRule.forCorporateActionPeriod8}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPeriod10> forCorporateActionPeriod10 = new MMConstraint<CorporateActionPeriod10>() {
		{
			validator = ConstraintInterestPeriodRule::checkCorporateActionPeriod10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPeriodRule";
			definition = "InterestPeriod must be used only if it is different from a normal accrued interest period.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterestPeriodRule.forCorporateActionPeriod14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInterestPeriodRule.forCorporateActionPeriod8;
			owner_lazy = () -> CorporateActionPeriod10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InterestPeriod must be used only if it is different from a normal accrued interest period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPeriodRule#forCorporateActionPeriod10
	 * ConstraintInterestPeriodRule.forCorporateActionPeriod10}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPeriod14> forCorporateActionPeriod14 = new MMConstraint<CorporateActionPeriod14>() {
		{
			validator = ConstraintInterestPeriodRule::checkCorporateActionPeriod14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPeriodRule";
			definition = "InterestPeriod must be used only if it is different from a normal accrued interest period.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInterestPeriodRule.forCorporateActionPeriod10;
			owner_lazy = () -> CorporateActionPeriod14.mmObject();
		}
	};

	/**
	 * InterestPeriod must be used only if it is different from a normal accrued
	 * interest period.
	 */
	public static void checkCorporateActionPeriod3(CorporateActionPeriod3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * InterestPeriod must be used only if it is different from a normal accrued
	 * interest period.
	 */
	public static void checkCorporateActionPeriod6(CorporateActionPeriod6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * InterestPeriod must be used only if it is different from a normal accrued
	 * interest period.
	 */
	public static void checkCorporateActionPeriod8(CorporateActionPeriod8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * InterestPeriod must be used only if it is different from a normal accrued
	 * interest period.
	 */
	public static void checkCorporateActionPeriod10(CorporateActionPeriod10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * InterestPeriod must be used only if it is different from a normal accrued
	 * interest period.
	 */
	public static void checkCorporateActionPeriod14(CorporateActionPeriod14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}