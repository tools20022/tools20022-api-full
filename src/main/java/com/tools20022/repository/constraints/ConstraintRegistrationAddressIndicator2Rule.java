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
 * If SecondaryOwner is present, then all occurrences of
 * SecondaryOwner/Party/Organisation/PostalAddress/RegistrationAddressIndicator
 * must be "false" or "0" (No), or, all occurrences of
 * SecondaryOwner/Party/IndividualPerson
 * /PostalAddress/RegistrationAddressIndicator must be "false" or "0" (No).
 */
public class ConstraintRegistrationAddressIndicator2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties9
	 * AccountParties9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Party/Organisation/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No), or, all occurrences of SecondaryOwner/Party/IndividualPerson/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties12
	 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties12}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties10
	 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties10}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties6
	 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties6}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties9> forAccountParties9 = new MMConstraint<AccountParties9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator2Rule";
			definition = "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Party/Organisation/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No), or, all occurrences of SecondaryOwner/Party/IndividualPerson/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties12,
					com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties10);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties6;
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties8
	 * AccountParties8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Party/Organisation/ ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator or of SecondaryOwner/Party/IndividualPerson/ ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties11
	 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties11}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties7
	 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties7}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties8> forAccountParties8 = new MMConstraint<AccountParties8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator2Rule";
			definition = "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Party/Organisation/ ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator or of SecondaryOwner/Party/IndividualPerson/ ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties11);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties7;
			owner_lazy = () -> AccountParties8.mmObject();
		}

		@Override
		public void executeValidator(AccountParties8 obj) throws Exception {
			checkAccountParties8(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Organisation/Address/RegistrationAddressIndicator or of SecondaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must be \"false\" or \"0\" (No)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties5> forAccountParties5 = new MMConstraint<AccountParties5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator2Rule";
			definition = "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Organisation/Address/RegistrationAddressIndicator or of SecondaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must be \"false\" or \"0\" (No).";
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties11
	 * AccountParties11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Party/Organisation/ ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator or of SecondaryOwner/Party/IndividualPerson/ ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties8
	 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties8}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties11> forAccountParties11 = new MMConstraint<AccountParties11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator2Rule";
			definition = "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Party/Organisation/ ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator or of SecondaryOwner/Party/IndividualPerson/ ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties8;
			owner_lazy = () -> AccountParties11.mmObject();
		}

		@Override
		public void executeValidator(AccountParties11 obj) throws Exception {
			checkAccountParties11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Organisation/ModifiedAddress/Address/RegistrationAddressIndicator or of SecondaryOwner/IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator must be \"false\" or \"0\" (No)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties8
	 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties8}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties7> forAccountParties7 = new MMConstraint<AccountParties7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator2Rule";
			definition = "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Organisation/ModifiedAddress/Address/RegistrationAddressIndicator or of SecondaryOwner/IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator must be \"false\" or \"0\" (No).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties8);
			owner_lazy = () -> AccountParties7.mmObject();
		}

		@Override
		public void executeValidator(AccountParties7 obj) throws Exception {
			checkAccountParties7(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Organisation/Address/RegistrationAddressIndicator or of SecondaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must be \"false\" or \"0\" (No)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties9
	 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties9}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties6> forAccountParties6 = new MMConstraint<AccountParties6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator2Rule";
			definition = "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Organisation/Address/RegistrationAddressIndicator or of SecondaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must be \"false\" or \"0\" (No).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties9);
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties12
	 * AccountParties12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Party/Organisation/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No), or, all occurrences of SecondaryOwner/Party/IndividualPerson/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties9
	 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties9}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties12> forAccountParties12 = new MMConstraint<AccountParties12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator2Rule";
			definition = "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Party/Organisation/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No), or, all occurrences of SecondaryOwner/Party/IndividualPerson/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties9;
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Organisation/Address/RegistrationAddressIndicator or of SecondaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must be \"false\" or \"0\" (No)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties2> forAccountParties2 = new MMConstraint<AccountParties2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator2Rule";
			definition = "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Organisation/Address/RegistrationAddressIndicator or of SecondaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must be \"false\" or \"0\" (No).";
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Organisation/ModifiedAddress/Address/RegistrationAddressIndicator or of SecondaryOwner/IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator must be \"false\" or \"0\" (No)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties4> forAccountParties4 = new MMConstraint<AccountParties4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator2Rule";
			definition = "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Organisation/ModifiedAddress/Address/RegistrationAddressIndicator or of SecondaryOwner/IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator must be \"false\" or \"0\" (No).";
			owner_lazy = () -> AccountParties4.mmObject();
		}

		@Override
		public void executeValidator(AccountParties4 obj) throws Exception {
			checkAccountParties4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Organisation/ModifiedAddress/Address/RegistrationAddressIndicator or of SecondaryOwner/IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator must be \"false\" or \"0\" (No)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties3> forAccountParties3 = new MMConstraint<AccountParties3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator2Rule";
			definition = "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Organisation/ModifiedAddress/Address/RegistrationAddressIndicator or of SecondaryOwner/IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator must be \"false\" or \"0\" (No).";
			owner_lazy = () -> AccountParties3.mmObject();
		}

		@Override
		public void executeValidator(AccountParties3 obj) throws Exception {
			checkAccountParties3(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Party/Organisation/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No), or, all occurrences of SecondaryOwner/Party/IndividualPerson/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties9
	 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties9}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties10> forAccountParties10 = new MMConstraint<AccountParties10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator2Rule";
			definition = "If SecondaryOwner is present, then all occurrences of SecondaryOwner/Party/Organisation/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No), or, all occurrences of SecondaryOwner/Party/IndividualPerson/PostalAddress/RegistrationAddressIndicator must be \"false\" or \"0\" (No).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties9;
			owner_lazy = () -> AccountParties10.mmObject();
		}

		@Override
		public void executeValidator(AccountParties10 obj) throws Exception {
			checkAccountParties10(obj);
		}
	};

	/**
	 * If SecondaryOwner is present, then all occurrences of
	 * SecondaryOwner/Party
	 * /Organisation/PostalAddress/RegistrationAddressIndicator must be "false"
	 * or "0" (No), or, all occurrences of
	 * SecondaryOwner/Party/IndividualPerson/
	 * PostalAddress/RegistrationAddressIndicator must be "false" or "0" (No).
	 */
	public static void checkAccountParties9(AccountParties9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondaryOwner is present, then all occurrences of
	 * SecondaryOwner/Party/Organisation/
	 * ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator or of
	 * SecondaryOwner/Party/IndividualPerson/
	 * ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator must be
	 * "false" or "0" (No).
	 */
	public static void checkAccountParties8(AccountParties8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondaryOwner is present, then all occurrences of
	 * SecondaryOwner/Organisation/Address/RegistrationAddressIndicator or of
	 * SecondaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must
	 * be "false" or "0" (No).
	 */
	public static void checkAccountParties5(AccountParties5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondaryOwner is present, then all occurrences of
	 * SecondaryOwner/Party/Organisation/
	 * ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator or of
	 * SecondaryOwner/Party/IndividualPerson/
	 * ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator must be
	 * "false" or "0" (No).
	 */
	public static void checkAccountParties11(AccountParties11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondaryOwner is present, then all occurrences of
	 * SecondaryOwner/Organisation
	 * /ModifiedAddress/Address/RegistrationAddressIndicator or of
	 * SecondaryOwner
	 * /IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator
	 * must be "false" or "0" (No).
	 */
	public static void checkAccountParties7(AccountParties7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondaryOwner is present, then all occurrences of
	 * SecondaryOwner/Organisation/Address/RegistrationAddressIndicator or of
	 * SecondaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must
	 * be "false" or "0" (No).
	 */
	public static void checkAccountParties6(AccountParties6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondaryOwner is present, then all occurrences of
	 * SecondaryOwner/Party
	 * /Organisation/PostalAddress/RegistrationAddressIndicator must be "false"
	 * or "0" (No), or, all occurrences of
	 * SecondaryOwner/Party/IndividualPerson/
	 * PostalAddress/RegistrationAddressIndicator must be "false" or "0" (No).
	 */
	public static void checkAccountParties12(AccountParties12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondaryOwner is present, then all occurrences of
	 * SecondaryOwner/Organisation/Address/RegistrationAddressIndicator or of
	 * SecondaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must
	 * be "false" or "0" (No).
	 */
	public static void checkAccountParties2(AccountParties2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondaryOwner is present, then all occurrences of
	 * SecondaryOwner/Organisation
	 * /ModifiedAddress/Address/RegistrationAddressIndicator or of
	 * SecondaryOwner
	 * /IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator
	 * must be "false" or "0" (No).
	 */
	public static void checkAccountParties4(AccountParties4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondaryOwner is present, then all occurrences of
	 * SecondaryOwner/Organisation
	 * /ModifiedAddress/Address/RegistrationAddressIndicator or of
	 * SecondaryOwner
	 * /IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator
	 * must be "false" or "0" (No).
	 */
	public static void checkAccountParties3(AccountParties3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SecondaryOwner is present, then all occurrences of
	 * SecondaryOwner/Party
	 * /Organisation/PostalAddress/RegistrationAddressIndicator must be "false"
	 * or "0" (No), or, all occurrences of
	 * SecondaryOwner/Party/IndividualPerson/
	 * PostalAddress/RegistrationAddressIndicator must be "false" or "0" (No).
	 */
	public static void checkAccountParties10(AccountParties10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}