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
 * If CustodianForMinor is present, then at least one occurrence of Beneficiary
 * must be present. .
 */
public class ConstraintBeneficiaryRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CustodianForMinor is present, then at least one occurrence of Beneficiary must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties2> forAccountParties2 = new MMConstraint<AccountParties2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryRule";
			definition = "If CustodianForMinor is present, then at least one occurrence of Beneficiary must be present.\n.";
			owner_lazy = () -> AccountParties2.mmObject();
		}

		@Override
		public void executeValidator(AccountParties2 obj) throws Exception {
			checkAccountParties2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CustodianForMinor is present, then at least one occurrence of Beneficiary must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties5> forAccountParties5 = new MMConstraint<AccountParties5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryRule";
			definition = "If CustodianForMinor is present, then at least one occurrence of Beneficiary must be present.";
			owner_lazy = () -> AccountParties5.mmObject();
		}

		@Override
		public void executeValidator(AccountParties5 obj) throws Exception {
			checkAccountParties5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties6
	 * AccountParties6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CustodianForMinor is present, then at least one occurrence of Beneficiary must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBeneficiaryRule#forAccountParties9
	 * ConstraintBeneficiaryRule.forAccountParties9}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties6> forAccountParties6 = new MMConstraint<AccountParties6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryRule";
			definition = "If CustodianForMinor is present, then at least one occurrence of Beneficiary must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBeneficiaryRule.forAccountParties9);
			owner_lazy = () -> AccountParties6.mmObject();
		}

		@Override
		public void executeValidator(AccountParties6 obj) throws Exception {
			checkAccountParties6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties9
	 * AccountParties9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrincipalAccountParty/CustodianForMinor is present, then at least one occurrence of Beneficiary must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBeneficiaryRule#forAccountParties12
	 * ConstraintBeneficiaryRule.forAccountParties12}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBeneficiaryRule#forAccountParties10
	 * ConstraintBeneficiaryRule.forAccountParties10}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBeneficiaryRule#forAccountParties6
	 * ConstraintBeneficiaryRule.forAccountParties6}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties9> forAccountParties9 = new MMConstraint<AccountParties9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryRule";
			definition = "If PrincipalAccountParty/CustodianForMinor is present, then at least one occurrence of Beneficiary must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBeneficiaryRule.forAccountParties12, com.tools20022.repository.constraints.ConstraintBeneficiaryRule.forAccountParties10);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBeneficiaryRule.forAccountParties6;
			owner_lazy = () -> AccountParties9.mmObject();
		}

		@Override
		public void executeValidator(AccountParties9 obj) throws Exception {
			checkAccountParties9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties10
	 * AccountParties10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrincipalAccountParty/CustodianForMinor is present, then at least one occurrence of Beneficiary must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBeneficiaryRule#forAccountParties13
	 * ConstraintBeneficiaryRule.forAccountParties13}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBeneficiaryRule#forAccountParties9
	 * ConstraintBeneficiaryRule.forAccountParties9}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties10> forAccountParties10 = new MMConstraint<AccountParties10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryRule";
			definition = "If PrincipalAccountParty/CustodianForMinor is present, then at least one occurrence of Beneficiary must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBeneficiaryRule.forAccountParties13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBeneficiaryRule.forAccountParties9;
			owner_lazy = () -> AccountParties10.mmObject();
		}

		@Override
		public void executeValidator(AccountParties10 obj) throws Exception {
			checkAccountParties10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties12
	 * AccountParties12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrincipalAccountParty/CustodianForMinor is present, then at least one occurrence of Beneficiary must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBeneficiaryRule#forAccountParties9
	 * ConstraintBeneficiaryRule.forAccountParties9}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties12> forAccountParties12 = new MMConstraint<AccountParties12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryRule";
			definition = "If PrincipalAccountParty/CustodianForMinor is present, then at least one occurrence of Beneficiary must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBeneficiaryRule.forAccountParties9;
			owner_lazy = () -> AccountParties12.mmObject();
		}

		@Override
		public void executeValidator(AccountParties12 obj) throws Exception {
			checkAccountParties12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrincipalAccountParty/CustodianForMinor is present, then at least one occurrence of Beneficiary must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBeneficiaryRule#forAccountParties10
	 * ConstraintBeneficiaryRule.forAccountParties10}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties13> forAccountParties13 = new MMConstraint<AccountParties13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryRule";
			definition = "If PrincipalAccountParty/CustodianForMinor is present, then at least one occurrence of Beneficiary must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBeneficiaryRule.forAccountParties10;
			owner_lazy = () -> AccountParties13.mmObject();
		}

		@Override
		public void executeValidator(AccountParties13 obj) throws Exception {
			checkAccountParties13(obj);
		}
	};

	/**
	 * If CustodianForMinor is present, then at least one occurrence of
	 * Beneficiary must be present. .
	 */
	public static void checkAccountParties2(AccountParties2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CustodianForMinor is present, then at least one occurrence of
	 * Beneficiary must be present.
	 */
	public static void checkAccountParties5(AccountParties5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CustodianForMinor is present, then at least one occurrence of
	 * Beneficiary must be present.
	 */
	public static void checkAccountParties6(AccountParties6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrincipalAccountParty/CustodianForMinor is present, then at least one
	 * occurrence of Beneficiary must be present.
	 */
	public static void checkAccountParties9(AccountParties9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrincipalAccountParty/CustodianForMinor is present, then at least one
	 * occurrence of Beneficiary must be present.
	 */
	public static void checkAccountParties10(AccountParties10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrincipalAccountParty/CustodianForMinor is present, then at least one
	 * occurrence of Beneficiary must be present.
	 */
	public static void checkAccountParties12(AccountParties12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrincipalAccountParty/CustodianForMinor is present, then at least one
	 * occurrence of Beneficiary must be present.
	 */
	public static void checkAccountParties13(AccountParties13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}