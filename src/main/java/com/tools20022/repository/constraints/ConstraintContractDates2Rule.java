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
import com.tools20022.repository.msg.AccountReport1;
import com.tools20022.repository.msg.AccountReport14;
import com.tools20022.repository.msg.AccountReport15;
import com.tools20022.repository.msg.AccountReport20;
import java.util.Arrays;

/**
 * ContractDates/ClosingDate should not be used as part of an account opening
 * and maintenance process.
 */
public class ConstraintContractDates2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport1 AccountReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractDates2Rule "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ContractDates/ClosingDate should not be used as part of an account opening and maintenance process."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountReport1> forAccountReport1 = new MMConstraint<AccountReport1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractDates2Rule ";
			definition = "ContractDates/ClosingDate should not be used as part of an account opening and maintenance process.";
			owner_lazy = () -> AccountReport1.mmObject();
		}

		@Override
		public void executeValidator(AccountReport1 obj) throws Exception {
			checkAccountReport1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport15
	 * AccountReport15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractDates2Rule "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ContractDates/ClosingDate should not be used as part of an account opening and maintenance process."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountReport15> forAccountReport15 = new MMConstraint<AccountReport15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractDates2Rule ";
			definition = "ContractDates/ClosingDate should not be used as part of an account opening and maintenance process.";
			owner_lazy = () -> AccountReport15.mmObject();
		}

		@Override
		public void executeValidator(AccountReport15 obj) throws Exception {
			checkAccountReport15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport14
	 * AccountReport14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractDates2Rule "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ContractDates/ClosingDate should not be used as part of an account opening and maintenance process."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintContractDates2Rule#forAccountReport20
	 * ConstraintContractDates2Rule.forAccountReport20}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountReport14> forAccountReport14 = new MMConstraint<AccountReport14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractDates2Rule ";
			definition = "ContractDates/ClosingDate should not be used as part of an account opening and maintenance process.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintContractDates2Rule.forAccountReport20);
			owner_lazy = () -> AccountReport14.mmObject();
		}

		@Override
		public void executeValidator(AccountReport14 obj) throws Exception {
			checkAccountReport14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport20
	 * AccountReport20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractDates2Rule "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ContractDates/ClosingDate should not be used as part of an account opening and maintenance process."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintContractDates2Rule#forAccountReport14
	 * ConstraintContractDates2Rule.forAccountReport14}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountReport20> forAccountReport20 = new MMConstraint<AccountReport20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractDates2Rule ";
			definition = "ContractDates/ClosingDate should not be used as part of an account opening and maintenance process.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintContractDates2Rule.forAccountReport14;
			owner_lazy = () -> AccountReport20.mmObject();
		}

		@Override
		public void executeValidator(AccountReport20 obj) throws Exception {
			checkAccountReport20(obj);
		}
	};

	/**
	 * ContractDates/ClosingDate should not be used as part of an account
	 * opening and maintenance process.
	 */
	public static void checkAccountReport1(AccountReport1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ContractDates/ClosingDate should not be used as part of an account
	 * opening and maintenance process.
	 */
	public static void checkAccountReport15(AccountReport15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ContractDates/ClosingDate should not be used as part of an account
	 * opening and maintenance process.
	 */
	public static void checkAccountReport14(AccountReport14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ContractDates/ClosingDate should not be used as part of an account
	 * opening and maintenance process.
	 */
	public static void checkAccountReport20(AccountReport20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}