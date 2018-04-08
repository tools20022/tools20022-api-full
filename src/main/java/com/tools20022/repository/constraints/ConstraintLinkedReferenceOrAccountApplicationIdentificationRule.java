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
import com.tools20022.repository.msg.AccountManagementMessageReference2;
import com.tools20022.repository.msg.AccountManagementMessageReference3;
import com.tools20022.repository.msg.AccountManagementMessageReference4;
import java.util.Arrays;

/**
 * Either LinkedReference or AccountApplicationIdentification must be present.
 */
public class ConstraintLinkedReferenceOrAccountApplicationIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference4
	 * AccountManagementMessageReference4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedReferenceOrAccountApplicationIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either LinkedReference or AccountApplicationIdentification must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkedReferenceOrAccountApplicationIdentificationRule#forAccountManagementMessageReference3
	 * ConstraintLinkedReferenceOrAccountApplicationIdentificationRule.
	 * forAccountManagementMessageReference3}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountManagementMessageReference4> forAccountManagementMessageReference4 = new MMConstraint<AccountManagementMessageReference4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedReferenceOrAccountApplicationIdentificationRule";
			definition = "Either LinkedReference or AccountApplicationIdentification must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLinkedReferenceOrAccountApplicationIdentificationRule.forAccountManagementMessageReference3;
			owner_lazy = () -> AccountManagementMessageReference4.mmObject();
		}

		@Override
		public void executeValidator(AccountManagementMessageReference4 obj) throws Exception {
			checkAccountManagementMessageReference4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2
	 * AccountManagementMessageReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedReferenceOrAccountApplicationIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either LinkedReference or AccountApplicationIdentification must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkedReferenceOrAccountApplicationIdentificationRule#forAccountManagementMessageReference3
	 * ConstraintLinkedReferenceOrAccountApplicationIdentificationRule.
	 * forAccountManagementMessageReference3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountManagementMessageReference2> forAccountManagementMessageReference2 = new MMConstraint<AccountManagementMessageReference2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedReferenceOrAccountApplicationIdentificationRule";
			definition = "Either LinkedReference or AccountApplicationIdentification must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLinkedReferenceOrAccountApplicationIdentificationRule.forAccountManagementMessageReference3);
			owner_lazy = () -> AccountManagementMessageReference2.mmObject();
		}

		@Override
		public void executeValidator(AccountManagementMessageReference2 obj) throws Exception {
			checkAccountManagementMessageReference2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3
	 * AccountManagementMessageReference3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedReferenceOrAccountApplicationIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either LinkedReference or AccountApplicationIdentification must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkedReferenceOrAccountApplicationIdentificationRule#forAccountManagementMessageReference4
	 * ConstraintLinkedReferenceOrAccountApplicationIdentificationRule.
	 * forAccountManagementMessageReference4}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkedReferenceOrAccountApplicationIdentificationRule#forAccountManagementMessageReference2
	 * ConstraintLinkedReferenceOrAccountApplicationIdentificationRule.
	 * forAccountManagementMessageReference2}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountManagementMessageReference3> forAccountManagementMessageReference3 = new MMConstraint<AccountManagementMessageReference3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedReferenceOrAccountApplicationIdentificationRule";
			definition = "Either LinkedReference or AccountApplicationIdentification must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLinkedReferenceOrAccountApplicationIdentificationRule.forAccountManagementMessageReference4);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLinkedReferenceOrAccountApplicationIdentificationRule.forAccountManagementMessageReference2;
			owner_lazy = () -> AccountManagementMessageReference3.mmObject();
		}

		@Override
		public void executeValidator(AccountManagementMessageReference3 obj) throws Exception {
			checkAccountManagementMessageReference3(obj);
		}
	};

	/**
	 * Either LinkedReference or AccountApplicationIdentification must be
	 * present.
	 */
	public static void checkAccountManagementMessageReference4(AccountManagementMessageReference4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either LinkedReference or AccountApplicationIdentification must be
	 * present.
	 */
	public static void checkAccountManagementMessageReference2(AccountManagementMessageReference2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either LinkedReference or AccountApplicationIdentification must be
	 * present.
	 */
	public static void checkAccountManagementMessageReference3(AccountManagementMessageReference3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}