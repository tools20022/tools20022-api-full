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
 * If the account identification identifies a group of accounts with different
 * types or in different currencies, the currency and/or the account type can be
 * used as additional search criteria.
 */
public class ConstraintCashAccountIdentificationGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5
	 * CashAccountSearchCriteria5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the account identification identifies a group of accounts with different types or in different currencies, the currency and/or the account type can be used as additional search criteria."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashAccountIdentificationGuideline#forCashAccountSearchCriteria6
	 * ConstraintCashAccountIdentificationGuideline.
	 * forCashAccountSearchCriteria6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashAccountSearchCriteria5> forCashAccountSearchCriteria5 = new MMConstraint<CashAccountSearchCriteria5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountIdentificationGuideline";
			definition = "If the account identification identifies a group of accounts with different types or in different currencies, the currency and/or the account type can be used as additional search criteria.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashAccountIdentificationGuideline.forCashAccountSearchCriteria6);
			owner_lazy = () -> CashAccountSearchCriteria5.mmObject();
		}

		@Override
		public void executeValidator(CashAccountSearchCriteria5 obj) throws Exception {
			checkCashAccountSearchCriteria5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria2
	 * CashAccountSearchCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the account identification identifies a group of accounts with different types or in different currencies, the currency and/or the account type can be used as additional search criteria."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashAccountSearchCriteria2> forCashAccountSearchCriteria2 = new MMConstraint<CashAccountSearchCriteria2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountIdentificationGuideline";
			definition = "If the account identification identifies a group of accounts with different types or in different currencies, the currency and/or the account type can be used as additional search criteria.";
			owner_lazy = () -> CashAccountSearchCriteria2.mmObject();
		}

		@Override
		public void executeValidator(CashAccountSearchCriteria2 obj) throws Exception {
			checkCashAccountSearchCriteria2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1
	 * CollateralValueSearchCriteria1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the account identification identifies a group of accounts with different types or in different currencies, the currency and/or the account type can be used as additional search criteria."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashAccountIdentificationGuideline#forCollateralValueSearchCriteria2
	 * ConstraintCashAccountIdentificationGuideline.
	 * forCollateralValueSearchCriteria2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CollateralValueSearchCriteria1> forCollateralValueSearchCriteria1 = new MMConstraint<CollateralValueSearchCriteria1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountIdentificationGuideline";
			definition = "If the account identification identifies a group of accounts with different types or in different currencies, the currency and/or the account type can be used as additional search criteria.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashAccountIdentificationGuideline.forCollateralValueSearchCriteria2);
			owner_lazy = () -> CollateralValueSearchCriteria1.mmObject();
		}

		@Override
		public void executeValidator(CollateralValueSearchCriteria1 obj) throws Exception {
			checkCollateralValueSearchCriteria1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2
	 * CollateralValueSearchCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the account identification identifies a group of accounts with different types or in different currencies, the currency and/or the account type can be used as additional search criteria."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashAccountIdentificationGuideline#forCollateralValueSearchCriteria1
	 * ConstraintCashAccountIdentificationGuideline.
	 * forCollateralValueSearchCriteria1}</li>
	 * </ul>
	 */
	public static final MMConstraint<CollateralValueSearchCriteria2> forCollateralValueSearchCriteria2 = new MMConstraint<CollateralValueSearchCriteria2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountIdentificationGuideline";
			definition = "If the account identification identifies a group of accounts with different types or in different currencies, the currency and/or the account type can be used as additional search criteria.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashAccountIdentificationGuideline.forCollateralValueSearchCriteria1;
			owner_lazy = () -> CollateralValueSearchCriteria2.mmObject();
		}

		@Override
		public void executeValidator(CollateralValueSearchCriteria2 obj) throws Exception {
			checkCollateralValueSearchCriteria2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria4
	 * CashAccountSearchCriteria4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the account identification identifies a group of accounts with different types or in different currencies, the currency and/or the account type can be used as additional search criteria."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashAccountSearchCriteria4> forCashAccountSearchCriteria4 = new MMConstraint<CashAccountSearchCriteria4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountIdentificationGuideline";
			definition = "If the account identification identifies a group of accounts with different types or in different currencies, the currency and/or the account type can be used as additional search criteria.";
			owner_lazy = () -> CashAccountSearchCriteria4.mmObject();
		}

		@Override
		public void executeValidator(CashAccountSearchCriteria4 obj) throws Exception {
			checkCashAccountSearchCriteria4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria6
	 * CashAccountSearchCriteria6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the account identification identifies a group of accounts with different types or in different currencies, the currency and/or the account type can be used as additional search criteria."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashAccountIdentificationGuideline#forCashAccountSearchCriteria5
	 * ConstraintCashAccountIdentificationGuideline.
	 * forCashAccountSearchCriteria5}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashAccountSearchCriteria6> forCashAccountSearchCriteria6 = new MMConstraint<CashAccountSearchCriteria6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountIdentificationGuideline";
			definition = "If the account identification identifies a group of accounts with different types or in different currencies, the currency and/or the account type can be used as additional search criteria.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashAccountIdentificationGuideline.forCashAccountSearchCriteria5;
			owner_lazy = () -> CashAccountSearchCriteria6.mmObject();
		}

		@Override
		public void executeValidator(CashAccountSearchCriteria6 obj) throws Exception {
			checkCashAccountSearchCriteria6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria3
	 * CashAccountSearchCriteria3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the account identification identifies a group of accounts with different types or in different currencies, the currency and/or the account type can be used as additional search criteria."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashAccountSearchCriteria3> forCashAccountSearchCriteria3 = new MMConstraint<CashAccountSearchCriteria3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountIdentificationGuideline";
			definition = "If the account identification identifies a group of accounts with different types or in different currencies, the currency and/or the account type can be used as additional search criteria.";
			owner_lazy = () -> CashAccountSearchCriteria3.mmObject();
		}

		@Override
		public void executeValidator(CashAccountSearchCriteria3 obj) throws Exception {
			checkCashAccountSearchCriteria3(obj);
		}
	};

	/**
	 * If the account identification identifies a group of accounts with
	 * different types or in different currencies, the currency and/or the
	 * account type can be used as additional search criteria.
	 */
	public static void checkCashAccountSearchCriteria5(CashAccountSearchCriteria5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the account identification identifies a group of accounts with
	 * different types or in different currencies, the currency and/or the
	 * account type can be used as additional search criteria.
	 */
	public static void checkCashAccountSearchCriteria2(CashAccountSearchCriteria2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the account identification identifies a group of accounts with
	 * different types or in different currencies, the currency and/or the
	 * account type can be used as additional search criteria.
	 */
	public static void checkCollateralValueSearchCriteria1(CollateralValueSearchCriteria1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the account identification identifies a group of accounts with
	 * different types or in different currencies, the currency and/or the
	 * account type can be used as additional search criteria.
	 */
	public static void checkCollateralValueSearchCriteria2(CollateralValueSearchCriteria2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the account identification identifies a group of accounts with
	 * different types or in different currencies, the currency and/or the
	 * account type can be used as additional search criteria.
	 */
	public static void checkCashAccountSearchCriteria4(CashAccountSearchCriteria4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the account identification identifies a group of accounts with
	 * different types or in different currencies, the currency and/or the
	 * account type can be used as additional search criteria.
	 */
	public static void checkCashAccountSearchCriteria6(CashAccountSearchCriteria6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the account identification identifies a group of accounts with
	 * different types or in different currencies, the currency and/or the
	 * account type can be used as additional search criteria.
	 */
	public static void checkCashAccountSearchCriteria3(CashAccountSearchCriteria3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}