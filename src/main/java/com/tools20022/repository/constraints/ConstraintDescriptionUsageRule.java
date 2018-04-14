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
 * Description must be used alone as the last resort.
 */
public class ConstraintDescriptionUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DescriptionUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description must be used alone as the last resort."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDescriptionUsageRule#forSecurityIdentification14
	 * ConstraintDescriptionUsageRule.forSecurityIdentification14}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecurityIdentification19> forSecurityIdentification19 = new MMConstraint<SecurityIdentification19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DescriptionUsageRule";
			definition = "Description must be used alone as the last resort.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDescriptionUsageRule.forSecurityIdentification14;
			owner_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public void executeValidator(SecurityIdentification19 obj) throws Exception {
			checkSecurityIdentification19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DescriptionUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description must be used alone as the last resort."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDescriptionUsageRule#forSecurityIdentification19
	 * ConstraintDescriptionUsageRule.forSecurityIdentification19}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecurityIdentification14> forSecurityIdentification14 = new MMConstraint<SecurityIdentification14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DescriptionUsageRule";
			definition = "Description must be used alone as the last resort.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDescriptionUsageRule.forSecurityIdentification19);
			owner_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public void executeValidator(SecurityIdentification14 obj) throws Exception {
			checkSecurityIdentification14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32
	 * SecurityIdentification32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DescriptionUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description must be used alone as the last resort."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecurityIdentification32> forSecurityIdentification32 = new MMConstraint<SecurityIdentification32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DescriptionUsageRule";
			definition = "Description must be used alone as the last resort.";
			owner_lazy = () -> SecurityIdentification32.mmObject();
		}

		@Override
		public void executeValidator(SecurityIdentification32 obj) throws Exception {
			checkSecurityIdentification32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20
	 * SecurityIdentification20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DescriptionUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description must be used alone as the last resort."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecurityIdentification20> forSecurityIdentification20 = new MMConstraint<SecurityIdentification20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DescriptionUsageRule";
			definition = "Description must be used alone as the last resort.";
			owner_lazy = () -> SecurityIdentification20.mmObject();
		}

		@Override
		public void executeValidator(SecurityIdentification20 obj) throws Exception {
			checkSecurityIdentification20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification21
	 * SecurityIdentification21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DescriptionUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description must be used alone as the last resort."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecurityIdentification21> forSecurityIdentification21 = new MMConstraint<SecurityIdentification21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DescriptionUsageRule";
			definition = "Description must be used alone as the last resort.";
			owner_lazy = () -> SecurityIdentification21.mmObject();
		}

		@Override
		public void executeValidator(SecurityIdentification21 obj) throws Exception {
			checkSecurityIdentification21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification16
	 * SecurityIdentification16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DescriptionUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description must be used alone as the last resort."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecurityIdentification16> forSecurityIdentification16 = new MMConstraint<SecurityIdentification16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DescriptionUsageRule";
			definition = "Description must be used alone as the last resort.";
			owner_lazy = () -> SecurityIdentification16.mmObject();
		}

		@Override
		public void executeValidator(SecurityIdentification16 obj) throws Exception {
			checkSecurityIdentification16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15
	 * SecurityIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DescriptionUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description must be used alone as the last resort."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecurityIdentification15> forSecurityIdentification15 = new MMConstraint<SecurityIdentification15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DescriptionUsageRule";
			definition = "Description must be used alone as the last resort.";
			owner_lazy = () -> SecurityIdentification15.mmObject();
		}

		@Override
		public void executeValidator(SecurityIdentification15 obj) throws Exception {
			checkSecurityIdentification15(obj);
		}
	};

	/**
	 * Description must be used alone as the last resort.
	 */
	public static void checkSecurityIdentification19(SecurityIdentification19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Description must be used alone as the last resort.
	 */
	public static void checkSecurityIdentification14(SecurityIdentification14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Description must be used alone as the last resort.
	 */
	public static void checkSecurityIdentification32(SecurityIdentification32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Description must be used alone as the last resort.
	 */
	public static void checkSecurityIdentification20(SecurityIdentification20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Description must be used alone as the last resort.
	 */
	public static void checkSecurityIdentification21(SecurityIdentification21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Description must be used alone as the last resort.
	 */
	public static void checkSecurityIdentification16(SecurityIdentification16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Description must be used alone as the last resort.
	 */
	public static void checkSecurityIdentification15(SecurityIdentification15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}